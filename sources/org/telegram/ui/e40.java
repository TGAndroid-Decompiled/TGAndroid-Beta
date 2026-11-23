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
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class e40 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs, VoIPService.StateListener, te.b {
    public static e40 C5;
    public static boolean D5;
    public static boolean E5;
    public static boolean F5;
    public static volatile org.telegram.messenger.r5 G5 = new org.telegram.messenger.r5("updateTextureLightningQueue", true);
    public static boolean H5;
    public final n20 A1;
    public final ArrayList A2;
    public final c40 A3;
    public final LongSparseIntArray A4;
    public final te.c A5;
    public final l20 B1;
    public final ArrayList B2;
    public final rh.h B3;
    public final d20 B4;
    public final te.a B5;
    public final j20 C1;
    public final ArrayList C2;
    public u00 C3;
    public final b20 C4;
    public final ImageView D1;
    public int D2;
    public org.telegram.ui.Components.s20 D3;
    public LinearLayout D4;
    public final ImageView E1;
    public final org.telegram.ui.Components.nh0 E2;
    public int E3;
    public boolean E4;
    public org.telegram.ui.Components.xi0 F1;
    public final org.telegram.ui.Components.nh0 F2;
    public boolean F3;
    public final org.telegram.ui.Components.nh0 F4;
    public final k30 G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public final org.telegram.ui.Components.n6 H1;
    public final org.telegram.ui.Components.v9 H2;
    public final Paint H3;
    public boolean H4;
    public final t10 I1;
    public final org.telegram.ui.Components.v9 I2;
    public final Paint I3;
    public final View I4;
    public final c30 J1;
    public float J2;
    public final d40[] J3;
    public final View J4;
    public final y30 K1;
    public float K2;
    public float K3;
    public GradientDrawable K4;
    public final m30 L1;
    public float L2;
    public d40 L3;
    public final int[] L4;
    public final s20 M1;
    public RadialGradient M2;
    public d40 M3;
    public final x10 M4;
    public final TextView N1;
    public final Matrix N2;
    public long N3;
    public boolean N4;
    public final q20 O1;
    public final Paint O2;
    public float O3;
    public boolean O4;
    public final org.telegram.ui.ActionBar.n5 P1;
    public final t30 P2;
    public float P3;
    public RenderNode P4;
    public final l30 Q1;
    public float Q2;
    public boolean Q3;
    public float Q4;
    public final org.telegram.ui.ActionBar.n5 R1;
    public float R2;
    public boolean R3;
    public boolean R4;
    public final s30 S1;
    public ValueAnimator S2;
    public int S3;
    public final String[] S4;
    public final org.telegram.ui.Components.uy T1;
    public TLRPC.InputPeer T2;
    public float T3;
    public ObjectAnimator T4;
    public final ImageReceiver U1;
    public TLRPC.Chat U2;
    public int U3;
    public ObjectAnimator U4;
    public int V1;
    public org.telegram.messenger.t3 V2;
    public boolean V3;
    public final x20 V4;
    public final ImageView W1;
    public final boolean W2;
    public final int[] W3;
    public org.telegram.ui.Cells.g4 W4;
    public final nh.h X1;
    public final String X2;
    public final ArrayList X3;
    public org.telegram.ui.Components.voip.s X4;
    public final int Y1;
    public final z30 Y2;
    public final ArrayList Y3;
    public org.telegram.ui.Components.voip.z Y4;
    public final RadialProgressView Z1;
    public final s10 Z2;
    public final a20 Z3;
    public org.telegram.ui.Components.s10 Z4;
    public final Drawable f47321a2;
    public final u10 f47322a3;
    public final f20 f47323a4;
    public boolean f47324a5;
    public final View f47325b2;
    public final Paint f47326b3;
    public final t20 f47327b4;
    public boolean f47328b5;
    public AnimatorSet f47329c2;
    public ValueAnimator f47330c3;
    public float f47331c4;
    public int f47332c5;
    public LaunchActivity d2;
    public float f47333d3;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f47334d4;
    public AnimatorSet f47335d5;
    public final UndoView[] f47336e2;
    public final LinearLayout f47337e3;
    public boolean f47338e4;
    public g30 f47339e5;
    public final org.telegram.ui.Cells.k f47340f2;
    public final org.telegram.ui.ActionBar.q0 f47341f3;
    public boolean f47342f4;
    public int f47343f5;
    public boolean f47344g2;
    public final org.telegram.ui.ActionBar.q0 f47345g3;
    public org.telegram.ui.Components.u30 f47346g4;
    public int f47347g5;
    public org.telegram.ui.Components.j30 f47348h2;
    public final org.telegram.ui.ActionBar.q0 f47349h3;
    public n30 f47350h4;
    public int f47351h5;
    public org.telegram.ui.Components.j30 f47352i2;
    public final org.telegram.ui.ActionBar.y0 f47353i3;
    public Boolean f47354i4;
    public int f47355i5;
    public int f47356j2;
    public final org.telegram.ui.ActionBar.y0 j3;
    public int f47357j4;
    public int f47358j5;
    public g.b f47359k2;
    public final org.telegram.ui.ActionBar.y0 f47360k3;
    public boolean f47361k4;
    public int f47362k5;
    public final ArrayList f47363l2;
    public final org.telegram.ui.ActionBar.y0 f47364l3;
    public final w10 f47365l4;
    public int f47366l5;
    public final c20 f47367m1;
    public a30 f47368m2;
    public final org.telegram.ui.ActionBar.y0 f47369m3;
    public final org.telegram.ui.Components.ek0 f47370m4;
    public int f47371m5;
    public final h10 n1;
    public boolean f47372n2;
    public final org.telegram.ui.Components.voip.r0 f47373n3;
    public final h40 f47374n4;
    public int f47375n5;
    public final org.telegram.messenger.c f47376o1;
    public long f47377o2;
    public final org.telegram.ui.Components.voip.t0 f47378o3;
    public final org.telegram.ui.Components.t10 o4;
    public int f47379o5;
    public final n10 f47380p1;
    public boolean f47381p2;
    public final ai.j2 f47382p3;
    public ViewTreeObserver.OnPreDrawListener f47383p4;
    public int f47384p5;
    public final org.telegram.ui.Components.voip.r2 f47385q1;
    public final RectF f47386q2;
    public final org.telegram.ui.ActionBar.y0 f47387q3;
    public final org.telegram.ui.Components.voip.n f47388q4;
    public int f47389q5;
    public final org.telegram.ui.Components.voip.r2 f47390r1;
    public boolean f47391r2;
    public final org.telegram.ui.ActionBar.y0 f47392r3;
    public boolean f47393r4;
    public int f47394r5;
    public final org.telegram.ui.Components.voip.r2 f47395s1;
    public boolean f47396s2;
    public final org.telegram.ui.ActionBar.y0 f47397s3;
    public final ArrayList f47398s4;
    public int s5;
    public final org.telegram.ui.Components.voip.r2 f47399t1;
    public float f47400t2;
    public final org.telegram.ui.ActionBar.y0 f47401t3;
    public boolean f47402t4;
    public int f47403t5;
    public final org.telegram.ui.Components.voip.r2 f47404u1;
    public v20 f47405u2;
    public final org.telegram.ui.ActionBar.y0 f47406u3;
    public final u00 f47407u4;
    public int f47408u5;
    public final org.telegram.ui.Components.voip.r2 f47409v1;
    public TLRPC.Peer f47410v2;
    public final org.telegram.ui.ActionBar.y0 f47411v3;
    public final r10 f47412v4;
    public final h30 f47413v5;
    public final org.telegram.ui.Components.voip.r2 f47414w1;
    public TLObject f47415w2;
    public final org.telegram.ui.ActionBar.y0 f47416w3;
    public final org.telegram.ui.Components.ne f47417w4;
    public Boolean f47418w5;
    public final o10 f47419x1;
    public final Paint f47420x2;
    public final org.telegram.ui.ActionBar.y0 f47421x3;
    public final u00 f47422x4;
    public Integer f47423x5;
    public final ImageView f47424y1;
    public final ArrayList f47425y2;
    public final LinearLayout f47426y3;
    public boolean f47427y4;
    public final te.a f47428y5;
    public final Paint f47429z1;
    public final ArrayList f47430z2;
    public final TextView f47431z3;
    public final m4 f47432z4;
    public final te.a f47433z5;

    public e40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.t3 t3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.i6) null, true, true);
        final e40 e40Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f47429z1 = new Paint(1);
        this.f47336e2 = new UndoView[2];
        this.f47363l2 = new ArrayList();
        this.f47386q2 = new RectF();
        this.f47420x2 = new Paint(1);
        this.f47425y2 = new ArrayList();
        this.f47430z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.C2 = new ArrayList();
        this.B3 = new rh.h(new u00(this, 4));
        this.E3 = 0;
        this.F3 = false;
        this.H3 = new Paint(7);
        this.I3 = new Paint(7);
        this.J3 = new d40[8];
        this.K3 = 1.0f;
        this.V3 = true;
        this.W3 = new int[4];
        this.X3 = new ArrayList();
        this.Y3 = new ArrayList();
        this.f47388q4 = new org.telegram.ui.Components.voip.n();
        this.f47398s4 = new ArrayList();
        this.f47407u4 = new u00(this, 0);
        this.f47412v4 = new r10(this);
        this.f47417w4 = new org.telegram.ui.Components.ne(24);
        this.f47422x4 = new u00(this, 2);
        this.f47427y4 = false;
        this.f47432z4 = new m4(this, 7);
        this.A4 = new LongSparseIntArray();
        this.L4 = new int[2];
        this.O4 = true;
        this.S4 = new String[2];
        this.f47332c5 = -1;
        this.f47413v5 = new h30(this);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
        this.f47428y5 = new te.a(2, this, krVar, 350L);
        this.f47433z5 = new te.a(3, this, krVar, 220L, true);
        this.A5 = new te.c(4, this, krVar, 350L);
        this.B5 = new te.a(5, this, krVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.f47376o1 = cVar;
        this.V2 = t3Var;
        this.T2 = inputPeer;
        this.U2 = chat;
        this.X2 = str;
        this.f30223a = cVar.f23343a;
        this.W2 = z10;
        this.J0 = new fi.h0();
        this.Q0 = true;
        this.R0 = true;
        this.Y1 = org.telegram.messenger.mp.u1(this.f30223a).A7.C.A0();
        this.V = true;
        F5 = false;
        E5 = false;
        H5 = false;
        this.f30269z0 = new m20(this);
        this.f30258s = true;
        this.f30251n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f30263w = true;
        this.G0 = -1;
        this.V4 = new x20(this);
        setOnDismissListener(new a10(this, 0));
        z0();
        y30 y30Var = new y30(this, launchActivity);
        this.K1 = y30Var;
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(true);
        int i7 = org.telegram.ui.ActionBar.n6.f29534hh;
        ppVar.b(org.telegram.ui.ActionBar.n6.v0(i7));
        ppVar.d();
        c30 c30Var = new c30(this, launchActivity, ppVar);
        this.J1 = c30Var;
        c30Var.setSubtitle("");
        c30Var.getSubtitleTextView().setVisibility(0);
        c30Var.q();
        c30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.U3(1.0f, c30Var.getAdditionalSubtitleTextView(), this.f47402t4, false);
        c30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.n6.v0(i7));
        int i10 = org.telegram.ui.ActionBar.n6.f29444ch;
        org.telegram.ui.ActionBar.u6.l(c30Var, 6, i10, null);
        c30Var.setBackButtonImage(2131231243);
        c30Var.setOccupyStatusBar(false);
        c30Var.setAllowOverlayTitle(false);
        int i11 = org.telegram.ui.ActionBar.n6.Yg;
        org.telegram.ui.ActionBar.u6.l(c30Var, 1, i11, null);
        org.telegram.ui.ActionBar.u6.l(c30Var, 3, org.telegram.ui.ActionBar.n6.f29864z8, null);
        org.telegram.ui.ActionBar.u6.d(c30Var, i11);
        org.telegram.ui.ActionBar.u6.l(c30Var, 6, i10, null);
        c30Var.setActionBarMenuOnItemClick(new j30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f47410v2 = tL_peerUser;
            tL_peerUser.user_id = cVar.e().e();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f47410v2 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f47410v2 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f47410v2 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new v00(this, 2);
        cVar.c().c(this, org.telegram.messenger.ks.f25312w2);
        cVar.c().c(this, org.telegram.messenger.ks.M0);
        cVar.c().c(this, org.telegram.messenger.ks.T);
        cVar.c().c(this, org.telegram.messenger.ks.f25298u1);
        cVar.c().c(this, org.telegram.messenger.ks.B2);
        cVar.c().c(this, org.telegram.messenger.ks.E0);
        cVar.c().c(this, org.telegram.messenger.ks.f25233j0);
        cVar.c().c(this, org.telegram.messenger.ks.f25276r);
        cVar.c().c(this, org.telegram.messenger.ks.f25333z2);
        cVar.c().c(this, org.telegram.messenger.ks.f25326y2);
        cVar.c().c(this, org.telegram.messenger.ks.U3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.D2);
        this.f47321a2 = launchActivity.getResources().getDrawable(2131232733).mutate();
        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(2131624345, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.E2 = nh0Var;
        this.F2 = new org.telegram.ui.Components.nh0(2131624045, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        k30 k30Var = new k30(this, launchActivity);
        this.G1 = k30Var;
        this.f30226b = k30Var;
        this.f30226b.setClipToPadding(false);
        this.f30226b.setFocusable(true);
        this.f30226b.setFocusableInTouchMode(true);
        this.f30226b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30226b;
        int i12 = this.f30261u0;
        viewGroup.setPadding(i12, 0, i12, 0);
        this.f30226b.setKeepScreenOn(true);
        this.f30226b.setClipChildren(false);
        this.U1 = new ImageReceiver(this.f30226b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(launchActivity);
            this.P1 = n5Var;
            n5Var.setGravity(17);
            n5Var.setTextColor(-1);
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setTextSize(18);
            n5Var.k(org.telegram.messenger.gd.M0(2131743185));
            this.f30226b.addView(n5Var, c8.na.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            l30 l30Var = new l30(this, launchActivity);
            this.Q1 = l30Var;
            l30Var.setGravity(17);
            l30Var.setTextColor(-1);
            l30Var.setTypeface(org.telegram.messenger.g0.o());
            l30Var.setTextSize(60);
            this.f30226b.addView(l30Var, c8.na.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(launchActivity);
            this.R1 = n5Var2;
            n5Var2.setGravity(17);
            n5Var2.setTextColor(-1);
            n5Var2.setTypeface(org.telegram.messenger.g0.o());
            n5Var2.setTextSize(18);
            this.f30226b.addView(n5Var2, c8.na.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (v1()) {
            t30 t30Var = new t30(this, launchActivity);
            this.P2 = t30Var;
            this.f30226b.addView(t30Var, c8.na.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        m30 m30Var = new m30(this, launchActivity);
        this.L1 = m30Var;
        m30Var.setClipToPadding(false);
        m30Var.setClipChildren(false);
        s30 s30Var = new s30(this);
        this.S1 = s30Var;
        s30Var.f59296o = krVar;
        s30Var.d = 350L;
        s30Var.f59318c = 350L;
        s30Var.f59319e = 350L;
        s30Var.S();
        m30Var.setItemAnimator(s30Var);
        m30Var.setOnScrollListener(new g10(this));
        m30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.uy uyVar = new org.telegram.ui.Components.uy(E5 ? 6 : 2, m30Var);
        this.T1 = uyVar;
        m30Var.setLayoutManager(uyVar);
        h10 h10Var = new h10(this);
        this.n1 = h10Var;
        uyVar.z1(h10Var);
        m30Var.i(new i10(this));
        uyVar.C1();
        this.f30226b.addView(m30Var, c8.na.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        m30Var.setAdapter(y30Var);
        m30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.u6.I(org.telegram.ui.ActionBar.n6.Vg, m30Var);
        m30Var.setOnItemClickListener(new a7(this, launchActivity, t3Var, 14));
        m30Var.setOnItemLongClickListener(new v00(this, 3));
        if (v1()) {
            c40 c40Var = new c40(this, getContext());
            this.A3 = c40Var;
            this.f30226b.addView(c40Var, c8.na.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(launchActivity);
        this.f47370m4 = ek0Var;
        this.f30226b.addView(ek0Var, c8.na.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        h40 h40Var = new h40(t3Var, this.f30223a, this);
        this.f47374n4 = h40Var;
        ek0Var.setAdapter(h40Var);
        v4.t tVar = new v4.t(6, false);
        ek0Var.setLayoutManager(tVar);
        tVar.z1(new k10(this));
        ek0Var.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) {
            public final e40 f52197b;

            {
                this.f52197b = this;
            }

            @Override
            public final void b(int i13, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) view;
                        org.telegram.messenger.u3 videoParticipant = s10Var.getVideoParticipant();
                        e40 e40Var2 = this.f52197b;
                        if (videoParticipant == null) {
                            e40Var2.i1(new org.telegram.messenger.u3(s10Var.getParticipant(), false));
                            return;
                        } else {
                            e40Var2.i1(s10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f52197b;
                        e40Var3.getClass();
                        org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) view;
                        if (sVar.getParticipant() != null) {
                            e40Var3.i1(sVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        v4.l lVar = new v4.l();
        lVar.S();
        lVar.f59296o = krVar;
        lVar.d = 350L;
        lVar.f59318c = 350L;
        lVar.f59319e = 350L;
        ek0Var.setItemAnimator(new l10(this));
        ek0Var.setOnScrollListener(new m10(this));
        h40Var.H(ek0Var, false, false);
        ek0Var.setVisibility(8);
        n10 n10Var = new n10(this, launchActivity);
        this.f47380p1 = n10Var;
        int v02 = org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Ah);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.N2 = new Matrix();
        this.M2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.O2 = paint;
        paint.setShader(this.M2);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(9);
        this.H2 = v9Var;
        org.telegram.ui.Components.v9 v9Var2 = new org.telegram.ui.Components.v9(12);
        this.I2 = v9Var2;
        v9Var.f40595a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        v9Var.f40596b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        v9Var.b();
        v9Var2.f40595a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        v9Var2.f40596b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        v9Var2.b();
        int i13 = org.telegram.ui.ActionBar.n6.f29873zh;
        v9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.v0(i13), 38));
        v9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.v0(i13), 76));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47399t1 = r2Var;
        r2Var.setCheckable(true);
        r2Var.setTextSize(12);
        n10Var.a(r2Var);
        r2Var.setOnClickListener(new s00(this, 7));
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47395s1 = r2Var2;
        r2Var2.setCheckable(true);
        r2Var2.setTextSize(12);
        r2Var2.d(false, false);
        r2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        r2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.gd.M0(2131743239), false, false);
        org.telegram.ui.Components.voip.r2 r2Var3 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47385q1 = r2Var3;
        r2Var3.setCheckable(true);
        r2Var3.setTextSize(12);
        r2Var3.d(false, false);
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(launchActivity);
        r2Var3.addView(qh0Var, c8.na.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.nh0 nh0Var2 = new org.telegram.ui.Components.nh0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.F4 = nh0Var2;
        qh0Var.setAnimation(nh0Var2);
        r2Var3.setOnClickListener(new s00(this, 10));
        n10Var.a(r2Var3);
        org.telegram.ui.Components.voip.r2 r2Var4 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47390r1 = r2Var4;
        r2Var4.setCheckable(true);
        r2Var4.setTextSize(12);
        r2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.W1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.V1 = 2131231173;
        imageView.setImageResource(2131231173);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        r2Var4.addView(imageView, c8.na.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        r2Var4.setOnClickListener(new s00(this, 11));
        n10Var.a(r2Var4);
        n10Var.a(r2Var2);
        org.telegram.ui.Components.voip.r2 r2Var5 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47404u1 = r2Var5;
        r2Var5.setTextSize(12);
        r2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.f29778uh), 0.3f, false, org.telegram.messenger.gd.M0(2131743114), false, false);
        r2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final e40 f54143b;

            {
                this.f54143b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e40 e40Var2 = this.f54143b;
                        LaunchActivity launchActivity2 = e40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            e40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                e40Var2.f47336e2[0].d(1, false);
                                if (e40Var2.f47405u2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    v20 v20Var = new v20(e40Var2, launchActivity, z11);
                                    e40Var2.f47405u2 = v20Var;
                                    v20Var.setBottomPadding(e40Var2.f30226b.getPaddingBottom());
                                    e40Var2.f30229c.addView(e40Var2.f47405u2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            e40Var2.V1(true, false);
                            e40Var2.U1(false);
                            e40Var2.V2.z();
                            e40Var2.R0(true);
                            e40Var2.f47380p1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f54143b;
                        e40Var3.Z3.e();
                        org.telegram.messenger.t3 t3Var2 = e40Var3.V2;
                        if (t3Var2 != null && !t3Var2.j()) {
                            e40Var3.P1();
                            e40.x1(launchActivity, new u00(e40Var3, 6), false, false);
                            return;
                        }
                        e40Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.r2 r2Var6 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47409v1 = r2Var6;
        r2Var6.setCheckable(true);
        r2Var6.b(true, false);
        r2Var6.setTextSize(12);
        r2Var6.c(2131231188, -1, 0, 1.0f, true, org.telegram.messenger.gd.M0(2131743044), false, false);
        o10 o10Var = new o10(this, launchActivity);
        this.f47419x1 = o10Var;
        o10Var.setAnimation(nh0Var);
        o10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.r2 r2Var7 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f47414w1 = r2Var7;
        r2Var7.setDrawBackground(false);
        r2Var7.setTextSize(12);
        r2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        r2Var7.addView(o10Var, c8.na.e(50, 50, 49));
        n10Var.a(r2Var7);
        r2Var7.setOnClickListener(new q10(this));
        n10Var.a(r2Var6);
        n10Var.a(r2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f47424y1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232804);
        r2Var7.addView(imageView2, c8.na.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.V2 != null && v1() && !this.V2.j()) {
            imageView2.setVisibility(0);
            o10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.Z1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Fh));
        c30Var.setAlpha(0.0f);
        c30Var.getBackButton().setScaleX(0.9f);
        c30Var.getBackButton().setScaleY(0.9f);
        c30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        c30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        c30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        c30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.n6.v0(i11));
        this.f47341f3 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setIcon(2131231247);
        q0Var.setContentDescription(org.telegram.messenger.gd.M0(2131754838));
        q0Var.setSubMenuOpenSide(2);
        q0Var.setDelegate(new v00(this, 5));
        int i14 = org.telegram.ui.ActionBar.n6.Zg;
        org.telegram.ui.ActionBar.u6.R(q0Var, org.telegram.ui.ActionBar.n6.g0(org.telegram.ui.ActionBar.n6.v0(i14), 6), null, org.telegram.ui.ActionBar.u6.M(i14));
        q0Var.setOnClickListener(new s00(this, 12));
        q0Var.P(org.telegram.ui.ActionBar.n6.v0(i11), false);
        q0Var.P(org.telegram.ui.ActionBar.n6.v0(i11), true);
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.n6.v0(i11));
        this.f47345g3 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131232434);
        q0Var2.setContentDescription(org.telegram.messenger.gd.M0(2131754807));
        org.telegram.ui.ActionBar.u6.R(q0Var2, org.telegram.ui.ActionBar.n6.g0(org.telegram.ui.ActionBar.n6.v0(i14), 6), null, org.telegram.ui.ActionBar.u6.M(i14));
        q0Var2.setOnClickListener(new s00(this, 0));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.n6.v0(i11));
        this.f47349h3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        q0Var3.setIcon(2131232357);
        q0Var3.setContentDescription(org.telegram.messenger.gd.M0(2131754807));
        org.telegram.ui.ActionBar.u6.R(q0Var3, org.telegram.ui.ActionBar.n6.g0(org.telegram.ui.ActionBar.n6.v0(i14), 6), null, org.telegram.ui.ActionBar.u6.M(i14));
        q0Var3.setOnClickListener(new s00(this, 1));
        s10 s10Var = new s10(this, launchActivity, launchActivity);
        this.Z2 = s10Var;
        t10 t10Var = new t10(launchActivity);
        this.I1 = t10Var;
        t10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f47326b3 = paint2;
        paint2.setColor(-12761513);
        u10 u10Var = new u10(this, getContext());
        this.f47322a3 = u10Var;
        org.telegram.ui.ActionBar.u6.U(u10Var, i11, this.J0);
        u10Var.setTextSize(1, 11.0f);
        u10Var.setText(org.telegram.messenger.gd.M0(2131743224));
        u10Var.setMaxLines(1);
        u10Var.setGravity(17);
        u10Var.setTypeface(org.telegram.messenger.g0.o());
        u10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        u10Var.setTag(-1);
        if (!v1()) {
            u10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f47337e3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(s10Var, c8.na.l(1.0f, 0, -2));
        linearLayout.addView(u10Var, c8.na.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f30226b.addView(t10Var, c8.na.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f30226b.addView(linearLayout, c8.na.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f30226b.addView(this.J1, c8.na.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f47426y3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(q0Var3, c8.na.o(48, 48));
        linearLayout2.addView(q0Var2, c8.na.o(48, 48));
        linearLayout2.addView(q0Var, c8.na.o(48, 48));
        this.f30226b.addView(linearLayout2, c8.na.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f47325b2 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, null);
        this.f30226b.addView(view, c8.na.c(1.0f, -1));
        for (int i15 = 0; i15 < 2; i15++) {
            this.f47336e2[i15] = new v10(this, launchActivity);
            this.f47336e2[i15].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.f47336e2[i15].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f30226b.addView(this.f47336e2[i15], c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f47340f2 = kVar;
        kVar.setTag(2131296439, 240);
        this.f47341f3.h(kVar, org.telegram.messenger.g0.L(48.0f));
        this.f47341f3.setShowSubmenuByMove(false);
        int i16 = org.telegram.ui.ActionBar.n6.Vg;
        org.telegram.ui.ActionBar.u6.R(kVar, org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.v0(i16), 6, 6), null, org.telegram.ui.ActionBar.u6.M(i16));
        org.telegram.ui.ActionBar.q0 q0Var4 = this.f47341f3;
        org.telegram.ui.ActionBar.y0 d = q0Var4.d(1, 0, null, org.telegram.messenger.gd.M0(2131743151), true, true, q0Var4.f29975n0);
        this.f47401t3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.q0 q0Var5 = this.f47341f3;
        org.telegram.ui.ActionBar.y0 d2 = q0Var5.d(2, 0, null, org.telegram.messenger.gd.M0(2131743104), true, true, q0Var5.f29975n0);
        this.f47406u3 = d2;
        d2.m(false, true);
        int i17 = org.telegram.ui.ActionBar.n6.f29643nh;
        d.setCheckColor(i17);
        d.d(org.telegram.ui.ActionBar.n6.v0(i17), org.telegram.ui.ActionBar.n6.v0(i17));
        d2.setCheckColor(i17);
        d2.d(org.telegram.ui.ActionBar.n6.v0(i17), org.telegram.ui.ActionBar.n6.v0(i17));
        Paint paint3 = new Paint(1);
        paint3.setColor(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Yg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.y0 f10 = this.f47341f3.f(null, org.telegram.messenger.gd.M0(2131743149), 10, true, 2131232435);
        this.f47360k3 = f10;
        f10.setItemHeight(56);
        org.telegram.ui.ActionBar.y0 f11 = this.f47341f3.f(null, org.telegram.messenger.gd.M0(2131743032), 11, true, 2131232266);
        this.f47364l3 = f11;
        f11.setItemHeight(56);
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(ai.j2.a());
        this.f47373n3 = r0Var;
        org.telegram.ui.ActionBar.y0 f12 = this.f47341f3.f(r0Var, org.telegram.messenger.gd.M0(2131745055), 14, false, 0);
        this.f47369m3 = f12;
        f12.setItemHeight(56);
        f12.setRightIcon(2131232365);
        f12.setSubtext(org.telegram.messenger.gd.M0(ai.j2.a() ? 2131745053 : 2131745054));
        f12.getRightIcon().setBackground(org.telegram.ui.ActionBar.n6.g0(org.telegram.ui.ActionBar.n6.v0(i16), 1));
        int i18 = (org.telegram.messenger.gd.f24314a0 ? 3 : 5) | 16;
        ImageView rightIcon = f12.getRightIcon();
        boolean z11 = org.telegram.messenger.gd.f24314a0;
        rightIcon.setLayoutParams(c8.na.d(40, 40.0f, i18, z11 ? 4.0f : 0.0f, 0.0f, z11 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(i0.a.f(0.3f, org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Xg), -16777216));
        boolean z12 = org.telegram.messenger.gd.f24314a0;
        FrameLayout.LayoutParams d10 = c8.na.d(-1, 28.0f, i18, z12 ? 52.0f : 0.0f, 0.0f, z12 ? 0.0f : 52.0f, 0.0f);
        d10.width = 1;
        view2.setLayoutParams(d10);
        f12.addView(view2);
        View[] viewArr = {f12.getTextView(), f12.getSubtextView()};
        for (int i19 = 0; i19 < 2; i19++) {
            View view3 = viewArr[i19];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.gd.f24314a0 ? org.telegram.messenger.g0.L(60.0f) : 0;
                layoutParams.rightMargin = org.telegram.messenger.gd.f24314a0 ? 0 : org.telegram.messenger.g0.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        this.f47369m3.getRightIcon().setContentDescription(org.telegram.messenger.gd.M0(2131745037));
        this.f47369m3.getRightIcon().setOnClickListener(new s00(this, 2));
        TextView b10 = this.f47341f3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Xg), -16777216));
        this.f47431z3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.y0 f13 = this.f47341f3.f(this.Y2, org.telegram.messenger.gd.M0(org.telegram.messenger.v3.W(this.U2) ? 2131743235 : 2131743134), 6, true, 2131232121);
        this.j3 = f13;
        org.telegram.ui.ActionBar.y0 f14 = this.f47341f3.f(this.Y2, org.telegram.messenger.gd.M0(2131743135), 7, false, 2131232281);
        this.f47387q3 = f14;
        org.telegram.ui.ActionBar.y0 e10 = this.f47341f3.e(3, 2131232208, org.telegram.messenger.gd.M0(2131743087));
        this.f47353i3 = e10;
        z30 z30Var = new z30();
        this.Y2 = z30Var;
        org.telegram.ui.ActionBar.y0 e11 = this.f47341f3.e(9, 2131232357, org.telegram.messenger.gd.M0(2131743186));
        this.f47397s3 = e11;
        org.telegram.ui.ActionBar.y0 f15 = this.f47341f3.f(z30Var, org.telegram.messenger.gd.M0(2131743098), 5, true, 0);
        this.f47392r3 = f15;
        z30Var.a(f15.getImageView());
        org.telegram.ui.ActionBar.y0 e12 = this.f47341f3.e(12, 2131231899, org.telegram.messenger.gd.M0(2131743234));
        this.f47416w3 = e12;
        org.telegram.ui.ActionBar.y0 e13 = this.f47341f3.e(13, 2131230781, org.telegram.messenger.gd.M0(2131743236));
        this.f47421x3 = e13;
        org.telegram.ui.ActionBar.y0 e14 = this.f47341f3.e(4, 2131232092, org.telegram.messenger.gd.M0(s1() ? 2131743129 : org.telegram.messenger.v3.W(this.U2) ? 2131743231 : 2131743130));
        this.f47411v3 = e14;
        this.f47341f3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Vg));
        this.f47341f3.getPopupLayout().setFitItems(true);
        int i20 = org.telegram.ui.ActionBar.n6.Yg;
        e12.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        e13.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        this.f47360k3.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        this.f47364l3.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        L1(this.f47369m3, org.telegram.ui.ActionBar.n6.v0(i20));
        int i21 = org.telegram.ui.ActionBar.n6.f29625mh;
        e14.d(org.telegram.ui.ActionBar.n6.v0(i21), org.telegram.ui.ActionBar.n6.v0(i21));
        e10.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        f13.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        f14.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        f15.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        e11.d(org.telegram.ui.ActionBar.n6.v0(i20), org.telegram.ui.ActionBar.n6.v0(i20));
        if (this.V2 != null) {
            p1();
        }
        if (s1()) {
            this.f47359k2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f47359k2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        X1(false);
        this.J1.getTitleTextView().setOnClickListener(new s00(this, 3));
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        w10 w10Var = new w10(this, launchActivity);
        this.f47365l4 = w10Var;
        x10 x10Var = new x10(this);
        this.M4 = x10Var;
        w10Var.setClipToPadding(false);
        x10Var.S();
        x10Var.f59296o = org.telegram.ui.Components.kr.f36858f;
        x10Var.d = 350L;
        x10Var.f59318c = 350L;
        x10Var.f59319e = 350L;
        w10Var.setItemAnimator(x10Var);
        w10Var.setOnScrollListener(new y10(this));
        w10Var.setClipChildren(false);
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        w10Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.t10 t10Var2 = new org.telegram.ui.Components.t10(t3Var, this.f30223a, this);
        this.o4 = t10Var2;
        w10Var.setAdapter(t10Var2);
        t10Var2.F(w10Var, false);
        w10Var.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) {
            public final e40 f52197b;

            {
                this.f52197b = this;
            }

            @Override
            public final void b(int i132, View view4) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.s10 s10Var2 = (org.telegram.ui.Components.s10) view4;
                        org.telegram.messenger.u3 videoParticipant = s10Var2.getVideoParticipant();
                        e40 e40Var2 = this.f52197b;
                        if (videoParticipant == null) {
                            e40Var2.i1(new org.telegram.messenger.u3(s10Var2.getParticipant(), false));
                            return;
                        } else {
                            e40Var2.i1(s10Var2.getVideoParticipant());
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f52197b;
                        e40Var3.getClass();
                        org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) view4;
                        if (sVar.getParticipant() != null) {
                            e40Var3.i1(sVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        w10Var.setOnItemLongClickListener(new v00(this, 0));
        w10Var.setVisibility(8);
        w10Var.i(new z10());
        a20 a20Var = new a20(this, launchActivity, this.L1, w10Var, this.X3, this.V2, this);
        this.Z3 = a20Var;
        a20Var.setClipChildren(false);
        t10Var2.E(this.X3, a20Var);
        if (this.f47370m4 != null) {
            this.f47374n4.G(this.X3, a20Var);
        }
        b20 b20Var = new b20(this, launchActivity);
        this.C4 = b20Var;
        c20 c20Var = new c20(this, launchActivity, this.J1, this.L1, b20Var);
        this.f47367m1 = c20Var;
        c20Var.setImagesLayerNum(Integer.MAX_VALUE);
        c20Var.setInvalidateWithParent(true);
        b20Var.setProfileGalleryView(c20Var);
        d20 d20Var = new d20(this, launchActivity);
        this.B4 = d20Var;
        d20Var.setVisibility(8);
        c20Var.setVisibility(0);
        c20Var.b(new e20(this));
        f20 f20Var = new f20(this, launchActivity);
        this.f47323a4 = f20Var;
        this.f30226b.addView(a20Var);
        a20Var.addView(w10Var, c8.na.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f47380p1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.I4 = view4;
        int[] iArr = this.L4;
        iArr[0] = this.U3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.L4);
        this.K4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.f30226b.addView(view4, c8.na.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.J4 = view5;
        view5.setBackgroundColor(this.L4[0]);
        this.f30226b.addView(view5, c8.na.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.X1 = hVar;
        hVar.setDelegate(new g20(this));
        hVar.setClickCellDelegate(new h20(this));
        org.telegram.messenger.t3 t3Var2 = this.V2;
        if (t3Var2 != null) {
            hVar.D0(this.f47376o1.f23343a, t3Var2.g(false));
        }
        this.f30226b.addView(hVar, c8.na.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.voip.t0 t0Var = new org.telegram.ui.Components.voip.t0(launchActivity);
        this.f47378o3 = t0Var;
        t0Var.setOnContentHeightChanged(new u00(this, 1));
        this.f30226b.addView(t0Var, c8.na.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f47382p3 = new ai.j2(new i20(this));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(launchActivity, false, true, true);
        this.H1 = n6Var;
        n6Var.setGravity(17);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTextColor(-1);
        n6Var.b(0.4f, 320L, org.telegram.ui.Components.kr.h);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f30226b.addView(this.f47380p1);
        j20 j20Var = new j20(this, launchActivity, this.G1, LaunchActivity.Q(), this.J0);
        this.C1 = j20Var;
        j20Var.K = true;
        j20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Y1)});
        j20Var.getEditText().setLinkTextColor(-11683585);
        j20Var.setHint(org.telegram.messenger.gd.M0(2131743681));
        j20Var.getEditText().addTextChangedListener(new k20(this));
        j20Var.s();
        l20 l20Var = new l20(this, launchActivity);
        this.B1 = l20Var;
        this.f30226b.addView(l20Var, c8.na.c(-1.0f, -1));
        n20 n20Var = new n20(launchActivity);
        this.A1 = n20Var;
        n20Var.addView(j20Var, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        n20Var.addView(n6Var, c8.na.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        n6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f30226b.addView(n20Var, c8.na.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.E1 = imageView3;
        int i22 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i22), this.J0);
        int i23 = org.telegram.ui.ActionBar.n6.f29490f7;
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView3, i23, i6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new s00(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.D1 = imageView4;
        org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i22), this.J0);
        org.telegram.ui.ActionBar.u6.s(imageView4, org.telegram.ui.ActionBar.n6.f29786v6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231463);
        imageView4.setOnClickListener(new s00(this, 5));
        n20Var.addView(imageView3, c8.na.e(48, 48, 85));
        n20Var.addView(imageView4, c8.na.e(48, 48, 85));
        this.f30226b.addView(f20Var);
        d20Var.addView(c20Var, c8.na.c(-1.0f, -1));
        d20Var.addView(b20Var, c8.na.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f30226b.addView(d20Var, c8.na.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        R0(false);
        this.K1.f();
        if (F5) {
            this.f47374n4.I(this.f47370m4, false);
        }
        this.D2 = this.K1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.N1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.v3.T(this.U2) && (chat2 = this.U2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f30226b.addView(textView, c8.na.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.qb0 qb0Var = new org.telegram.ui.Components.qb0(launchActivity);
            qb0Var.setTextColor(-1);
            qb0Var.setSelectorColor(-9598483);
            qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            qb0Var.setItemCount(5);
            o20 o20Var = new o20(launchActivity);
            o20Var.setItemCount(5);
            o20Var.setTextColor(-1);
            o20Var.setSelectorColor(-9598483);
            o20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            p20 p20Var = new p20(launchActivity);
            p20Var.setItemCount(5);
            p20Var.setTextColor(-1);
            p20Var.setSelectorColor(-9598483);
            p20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            q20 q20Var = new q20(launchActivity);
            this.O1 = q20Var;
            q20Var.setLines(1);
            q20Var.setSingleLine(true);
            q20Var.setEllipsize(TextUtils.TruncateAt.END);
            q20Var.setGravity(17);
            q20Var.setTextColor(-1);
            q20Var.setTypeface(org.telegram.messenger.g0.o());
            q20Var.setTextSize(1, 14.0f);
            this.f30226b.addView(q20Var, c8.na.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            q20Var.setOnClickListener(new org.telegram.messenger.video.f(this, qb0Var, o20Var, p20Var, chat, cVar, inputPeer2, 1));
            s20 s20Var = new s20(launchActivity, qb0Var, o20Var, p20Var);
            this.M1 = s20Var;
            s20Var.setWeightSum(1.0f);
            s20Var.setOrientation(0);
            this.f30226b.addView(s20Var, c8.na.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i24 = calendar.get(1);
            int i25 = calendar.get(6);
            s20Var.addView(qb0Var, c8.na.l(0.5f, 0, 270));
            qb0Var.setMinValue(0);
            qb0Var.setMaxValue(365);
            qb0Var.setWrapSelectorWheel(false);
            qb0Var.setFormatter(new x00(currentTimeMillis, calendar, i24, 0));
            a1.d dVar = new a1.d(this, qb0Var, o20Var, p20Var, 14);
            e40Var = this;
            qb0Var.setOnValueChangedListener(dVar);
            o20Var.setMinValue(0);
            o20Var.setMaxValue(23);
            s20Var.addView(o20Var, c8.na.l(0.2f, 0, 270));
            o20Var.setFormatter(new org.telegram.ui.Components.ub0(26));
            o20Var.setOnValueChangedListener(dVar);
            p20Var.setMinValue(0);
            p20Var.setMaxValue(59);
            p20Var.setValue(0);
            p20Var.setFormatter(new org.telegram.ui.Components.ub0(27));
            s20Var.addView(p20Var, c8.na.l(0.3f, 0, 270));
            p20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i26 = calendar.get(6);
            int i27 = calendar.get(12);
            int i28 = calendar.get(11);
            qb0Var.setValue(i25 != i26 ? 1 : 0);
            p20Var.setValue(i27);
            o20Var.setValue(i28);
            org.telegram.ui.Components.b5.g(q20Var, textView, 0L, 604800L, 2, qb0Var, o20Var, p20Var);
        } else {
            e40Var = this;
        }
        t20 t20Var = new t20(e40Var, (ViewGroup) e40Var.getWindow().getDecorView(), e40Var.f30226b);
        e40Var.f47327b4 = t20Var;
        t20Var.E = new u20(e40Var);
        c20Var.setPinchToZoomHelper(t20Var);
        e40Var.f47395s1.setOnClickListener(new View.OnClickListener(e40Var) {
            public final e40 f54143b;

            {
                this.f54143b = e40Var;
            }

            @Override
            public final void onClick(View view6) {
                switch (r3) {
                    case 0:
                        e40 e40Var2 = this.f54143b;
                        LaunchActivity launchActivity2 = e40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            e40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z112 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                e40Var2.f47336e2[0].d(1, false);
                                if (e40Var2.f47405u2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z112 = true;
                                    }
                                    v20 v20Var = new v20(e40Var2, launchActivity, z112);
                                    e40Var2.f47405u2 = v20Var;
                                    v20Var.setBottomPadding(e40Var2.f30226b.getPaddingBottom());
                                    e40Var2.f30229c.addView(e40Var2.f47405u2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            e40Var2.V1(true, false);
                            e40Var2.U1(false);
                            e40Var2.V2.z();
                            e40Var2.R0(true);
                            e40Var2.f47380p1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f54143b;
                        e40Var3.Z3.e();
                        org.telegram.messenger.t3 t3Var22 = e40Var3.V2;
                        if (t3Var22 != null && !t3Var22.j()) {
                            e40Var3.P1();
                            e40.x1(launchActivity, new u00(e40Var3, 6), false, false);
                            return;
                        }
                        e40Var3.dismiss();
                        return;
                }
            }
        });
        e40Var.T1(false);
        e40Var.P1();
        e40Var.U1(false);
        e40Var.V1(false, false);
        e40Var.H1(0.0f);
        e40Var.W1();
        e40Var.f30226b.addView(new FrameLayout(launchActivity), c8.na.e(-1, 200, 87));
        e40Var.f47409v1.setOnClickListener(new s00(e40Var, 6));
        e40Var.W0();
        c8.sa.a(e40Var.f47395s1);
        c8.sa.a(e40Var.f47399t1);
        c8.sa.a(e40Var.f47385q1);
        c8.sa.a(e40Var.f47390r1);
        c8.sa.a(e40Var.f47414w1);
        c8.sa.a(e40Var.f47404u1);
        c8.sa.a(e40Var.f47409v1);
        r0.i0.l(e40Var.f30226b, new v00(e40Var, 1));
    }

    public static void C1(org.telegram.messenger.t3 t3Var, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (t3Var != null) {
            ArrayList arrayList = t3Var.f27037f;
            ArrayList arrayList2 = t3Var.f27036e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(j3);
            if (groupCallParticipant != null) {
                t3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                t3Var.f27038g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.fj.B1(((org.telegram.messenger.u3) arrayList.get(i7)).f27215a.peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = t3Var.f27034b;
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
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25305v2, new Object[0]);
    }

    public static void J0(final e40 e40Var, Activity activity, org.telegram.messenger.t3 t3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z10;
        final org.telegram.messenger.s3 s3Var;
        org.telegram.messenger.c cVar = e40Var.f47376o1;
        ArrayList arrayList = e40Var.A2;
        y30 y30Var = e40Var.K1;
        if (view instanceof org.telegram.ui.Components.voip.s) {
            e40Var.i1(((org.telegram.ui.Components.voip.s) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            e40Var.M1((org.telegram.ui.Cells.g4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                if (z3Var.getUser() != null) {
                    if (e40Var.s1()) {
                        int i10 = i7 - y30Var.f54177n;
                        if (i10 >= 0 && i10 < e40Var.V2.f27043m.size()) {
                            l10 = (Long) e40Var.V2.f27043m.get(i7 - y30Var.f54177n);
                        } else {
                            int i11 = i7 - y30Var.f54179s;
                            if (i11 >= 0 && i11 < e40Var.V2.f27042l.size()) {
                                l10 = (Long) e40Var.V2.f27042l.get(i7 - y30Var.f54179s);
                            } else {
                                int i12 = i7 - y30Var.f54176f;
                                if (e40Var.f47372n2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                } else {
                                    if (i12 >= 0 && i12 < e40Var.V2.f27040j.size()) {
                                        l10 = (Long) e40Var.V2.f27040j.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                }
                                if (!z10 && (s3Var = (org.telegram.messenger.s3) e40Var.V2.f27041k.get(l10)) != null) {
                                    org.telegram.ui.Components.x60 G = org.telegram.ui.Components.x60.G(e40Var.f30229c, e40Var.J0, z3Var);
                                    G.l(2131232134, org.telegram.messenger.gd.N0(2131749267, null), new Runnable(e40Var) {
                                        public final e40 f46691b;

                                        {
                                            this.f46691b = e40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var2 = s3Var;
                                                    declineconferencecallinvite.msg_id = s3Var2.f26838a;
                                                    final e40 e40Var2 = this.f46691b;
                                                    ConnectionsManager.getInstance(e40Var2.f30223a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var3 = e40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(e40Var3.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.t3 t3Var2 = e40Var2.V2;
                                                    if (t3Var2 != null) {
                                                        s3Var2.f26839b = false;
                                                        t3Var2.f27041k.put(l10, s3Var2);
                                                        e40Var2.R0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var3 = s3Var;
                                                    declineconferencecallinvite2.msg_id = s3Var3.f26838a;
                                                    final e40 e40Var3 = this.f46691b;
                                                    ConnectionsManager.getInstance(e40Var3.f30223a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var32 = e40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(s3Var3.f26838a));
                                                    org.telegram.messenger.mp.u1(e40Var3.f30223a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.t3 t3Var3 = e40Var3.V2;
                                                    if (t3Var3 != null) {
                                                        ArrayList arrayList3 = t3Var3.f27040j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        e40Var3.V2.f27044n.remove(l11);
                                                        e40Var3.V2.f27041k.remove(l11);
                                                        e40Var3.R0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, s3Var.a());
                                    G.c(2131232333, org.telegram.messenger.gd.N0(2131749278, null), new Runnable(e40Var) {
                                        public final e40 f46691b;

                                        {
                                            this.f46691b = e40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var2 = s3Var;
                                                    declineconferencecallinvite.msg_id = s3Var2.f26838a;
                                                    final e40 e40Var2 = this.f46691b;
                                                    ConnectionsManager.getInstance(e40Var2.f30223a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var32 = e40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.t3 t3Var2 = e40Var2.V2;
                                                    if (t3Var2 != null) {
                                                        s3Var2.f26839b = false;
                                                        t3Var2.f27041k.put(l10, s3Var2);
                                                        e40Var2.R0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var3 = s3Var;
                                                    declineconferencecallinvite2.msg_id = s3Var3.f26838a;
                                                    final e40 e40Var3 = this.f46691b;
                                                    ConnectionsManager.getInstance(e40Var3.f30223a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var32 = e40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(s3Var3.f26838a));
                                                    org.telegram.messenger.mp.u1(e40Var3.f30223a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.t3 t3Var3 = e40Var3.V2;
                                                    if (t3Var3 != null) {
                                                        ArrayList arrayList3 = t3Var3.f27040j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        e40Var3.V2.f27044n.remove(l11);
                                                        e40Var3.V2.f27041k.remove(l11);
                                                        e40Var3.R0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    G.X(org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), e40Var.f47420x2.getColor()));
                                    G.f41892s = 96;
                                    G.a0();
                                    return;
                                }
                                return;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            org.telegram.ui.Components.x60 G2 = org.telegram.ui.Components.x60.G(e40Var.f30229c, e40Var.J0, z3Var);
                            G2.l(2131232134, org.telegram.messenger.gd.N0(2131749267, null), new Runnable(e40Var) {
                                public final e40 f46691b;

                                {
                                    this.f46691b = e40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var2 = s3Var;
                                            declineconferencecallinvite.msg_id = s3Var2.f26838a;
                                            final e40 e40Var2 = this.f46691b;
                                            ConnectionsManager.getInstance(e40Var2.f30223a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.t3 t3Var2 = e40Var2.V2;
                                            if (t3Var2 != null) {
                                                s3Var2.f26839b = false;
                                                t3Var2.f27041k.put(l10, s3Var2);
                                                e40Var2.R0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var3 = s3Var;
                                            declineconferencecallinvite2.msg_id = s3Var3.f26838a;
                                            final e40 e40Var3 = this.f46691b;
                                            ConnectionsManager.getInstance(e40Var3.f30223a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(s3Var3.f26838a));
                                            org.telegram.messenger.mp.u1(e40Var3.f30223a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.t3 t3Var3 = e40Var3.V2;
                                            if (t3Var3 != null) {
                                                ArrayList arrayList3 = t3Var3.f27040j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                e40Var3.V2.f27044n.remove(l11);
                                                e40Var3.V2.f27041k.remove(l11);
                                                e40Var3.R0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, s3Var.a());
                            G2.c(2131232333, org.telegram.messenger.gd.N0(2131749278, null), new Runnable(e40Var) {
                                public final e40 f46691b;

                                {
                                    this.f46691b = e40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var2 = s3Var;
                                            declineconferencecallinvite.msg_id = s3Var2.f26838a;
                                            final e40 e40Var2 = this.f46691b;
                                            ConnectionsManager.getInstance(e40Var2.f30223a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.t3 t3Var2 = e40Var2.V2;
                                            if (t3Var2 != null) {
                                                s3Var2.f26839b = false;
                                                t3Var2.f27041k.put(l10, s3Var2);
                                                e40Var2.R0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var3 = s3Var;
                                            declineconferencecallinvite2.msg_id = s3Var3.f26838a;
                                            final e40 e40Var3 = this.f46691b;
                                            ConnectionsManager.getInstance(e40Var3.f30223a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(e40Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(e40Var4.f30223a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(s3Var3.f26838a));
                                            org.telegram.messenger.mp.u1(e40Var3.f30223a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.t3 t3Var3 = e40Var3.V2;
                                            if (t3Var3 != null) {
                                                ArrayList arrayList3 = t3Var3.f27040j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                e40Var3.V2.f27044n.remove(l11);
                                                e40Var3.V2.f27041k.remove(l11);
                                                e40Var3.R0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            G2.X(org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), e40Var.f47420x2.getColor()));
                            G2.f41892s = 96;
                            G2.a0();
                            return;
                        }
                        return;
                    }
                    e40Var.d2.O0(e40Var.f30223a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", z3Var.getUser().f28641id);
                    if (z3Var.f32590a.getImageReceiver().M()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    e40Var.d2.t0(new ProfileActivity(bundle, null));
                    e40Var.dismiss();
                }
            } else if (i7 == y30Var.f54181x) {
                if (org.telegram.messenger.v3.T(e40Var.U2) && (chat = e40Var.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)) {
                    e40Var.n1(false);
                    return;
                }
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(cVar.f23343a).P0(e40Var.m1());
                if (P0 != null) {
                    e40Var.f47391r2 = false;
                    Context context = e40Var.getContext();
                    int i13 = cVar.f23343a;
                    TLRPC.Chat chat2 = e40Var.U2;
                    org.telegram.messenger.t3 t3Var2 = e40Var.V2;
                    org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(context, i13, chat2, P0, t3Var2.d, t3Var2.f27044n);
                    e40Var.D3 = s20Var;
                    s20Var.setOnDismissListener(new a10(e40Var, 2));
                    org.telegram.ui.Components.s20 s20Var2 = e40Var.D3;
                    s20Var2.f39468b2 = new j10(e40Var);
                    s20Var2.show();
                }
            } else if (i7 == y30Var.f54182y) {
                org.telegram.messenger.t3 t3Var3 = e40Var.V2;
                if (t3Var3 != null && t3Var3.f27034b != null) {
                    wg.d1 d1Var = new wg.d1(activity, e40Var.f30223a, new fi.h0());
                    org.telegram.messenger.t3 t3Var4 = e40Var.V2;
                    if (t3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(t3Var4.f27036e).map(new aa.l(12)).collect(Collectors.toSet());
                    }
                    d1Var.f59866t2.addAll(collection);
                    d1Var.l1(false, true);
                    d1Var.f59865s2 = new u00(e40Var, 5);
                    d1Var.l1(false, true);
                    d1Var.f59867u2 = new bi.r6(22, e40Var, t3Var);
                    d1Var.show();
                }
            } else if (i7 == y30Var.E) {
                e40Var.B1();
            }
        }
    }

    public static void K0(e40 e40Var, org.telegram.ui.Components.voip.s sVar, boolean z10) {
        if (!e40Var.J) {
            if (z10 && sVar.getRenderer() == null) {
                sVar.setRenderer(org.telegram.ui.Components.voip.z.c(e40Var.X3, e40Var.Z3, sVar, null, null, sVar.getParticipant(), e40Var.V2, e40Var));
            } else if (!z10 && sVar.getRenderer() != null) {
                sVar.getRenderer().setPrimaryView(null);
                sVar.setRenderer(null);
            }
        }
    }

    public static void L0(e40 e40Var, int i7, int[] iArr) {
        if (e40Var.v1()) {
            int i10 = org.telegram.ui.ActionBar.n6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ch, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29701qh, false));
            iArr[2] = org.telegram.messenger.g0.S0(e40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29424bh, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ah, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29682ph, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29701qh, false));
            iArr[2] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29662oh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29834xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29739sh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29758th, false));
            iArr[2] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29721rh, false);
        } else if (t1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425bi, false);
            iArr[1] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29445ci, false);
            iArr[2] = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29462di, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.n6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Dh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Eh, false));
            iArr[2] = org.telegram.messenger.g0.S0(e40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29424bh, false), org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        }
        if (t1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425bi, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29739sh, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29815wh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29853yh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ah, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29873zh, false));
        }
    }

    public static void L1(org.telegram.ui.ActionBar.y0 y0Var, int i7) {
        if (y0Var != null) {
            y0Var.d(i7, i7);
            if (y0Var.getRightIcon() != null) {
                y0Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static String M0() {
        String[] strArr = org.telegram.messenger.k6.f25092i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void N0(e40 e40Var) {
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        if (t3Var != null && t3Var.f27034b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.t3 t3Var2 = e40Var.V2;
            togglegroupcallsettings.call = t3Var2.g(t3Var2.f27033a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(e40Var.V2.f27034b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e40Var.f47376o1.f23343a);
            org.telegram.messenger.q5 q5Var = Utilities.d;
            Objects.requireNonNull(q5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.x3(q5Var), new e10(e40Var, 1));
        }
    }

    public static void O0(e40 e40Var, boolean z10) {
        if (e40Var.V2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        togglegroupcallsettings.call = t3Var.g(t3Var.f27033a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        e40Var.f47418w5 = Boolean.valueOf(z10);
        e40Var.O1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e40Var.f47376o1.f23343a);
        org.telegram.messenger.q5 q5Var = Utilities.d;
        Objects.requireNonNull(q5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.x3(q5Var), new e10(e40Var, 0));
    }

    public static int P0(e40 e40Var, int i7) {
        n10 n10Var = e40Var.f47380p1;
        org.telegram.ui.Components.voip.s h12 = e40Var.h1();
        if (h12 == null) {
            return Integer.MIN_VALUE;
        }
        int measuredHeight = ((n10Var.getMeasuredHeight() / 2) + n10Var.getTop()) - (e40Var.f47404u1.getMeasuredHeight() / 2);
        int measuredHeight2 = h12.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        return i5.c.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void Q0(e40 e40Var) {
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
        c30 c30Var = e40Var.J1;
        m30 m30Var = e40Var.L1;
        int childCount = m30Var.getChildCount();
        boolean z12 = false;
        float f15 = 2.1474836E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (RecyclerView.R(m30Var.getChildAt(i7)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = m30Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && c30Var.getTag() == null) || (!z10 && c30Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            c30Var.setTag(num);
            AnimatorSet animatorSet = e40Var.f47329c2;
            if (animatorSet != null) {
                animatorSet.cancel();
                e40Var.f47329c2 = null;
            }
            if (c30Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            e40Var.G0(z11);
            ViewPropertyAnimator animate = c30Var.getBackButton().animate();
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
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
            duration.setInterpolator(krVar).start();
            ViewPropertyAnimator animate2 = c30Var.getTitleTextView().animate();
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(krVar).start();
            ObjectAnimator objectAnimator = e40Var.T4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                e40Var.T4.cancel();
            }
            org.telegram.ui.ActionBar.n5 subtitleTextView = c30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = c30Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            e40Var.T4 = ofFloat;
            ofFloat.setDuration(300L);
            e40Var.T4.setInterpolator(krVar);
            e40Var.T4.addListener(new b30(0, e40Var, z10));
            e40Var.T4.start();
            ObjectAnimator objectAnimator2 = e40Var.U4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.n5 additionalSubtitleTextView = c30Var.getAdditionalSubtitleTextView();
            if (z10) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            e40Var.U4 = ofFloat2;
            ofFloat2.setDuration(300L);
            e40Var.U4.setInterpolator(krVar);
            e40Var.U4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            e40Var.f47329c2 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = e40Var.f47329c2;
            Property property2 = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c30Var, property2, f12);
            t10 t10Var = e40Var.I1;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t10Var, property2, f13);
            View view = e40Var.f47325b2;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            e40Var.f47329c2.addListener(new z20(e40Var, 1));
            e40Var.f47329c2.start();
            e40Var.Z3.f41030w.setClickable((!z10 || E5) ? true : true);
        }
        if (e40Var.f47400t2 != L4) {
            e40Var.K1(L4);
        }
    }

    public static void f1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (C5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    C5 = new e40(launchActivity, cVar, org.telegram.messenger.mp.u1(cVar.f23343a).i1(chat.f28492id, false, null), chat, inputPeer, z10, str);
                } else {
                    org.telegram.messenger.t3 t3Var = VoIPService.getSharedInstance().groupCall;
                    if (t3Var != null) {
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(cVar.f23343a).O0(Long.valueOf(t3Var.f27035c));
                        t3Var.b(true);
                        C5 = new e40(launchActivity, cVar, t3Var, O0, null, z10, str);
                    } else {
                        return;
                    }
                }
                C5.d2 = launchActivity;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.ne(23));
            }
        }
    }

    public static String j1(int i7) {
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
                return org.telegram.messenger.gd.N0(2131743253, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.gd.N0(2131743251, null);
            } else {
                return org.telegram.messenger.gd.N0(2131743250, null);
            }
        }
        return org.telegram.messenger.gd.N0(2131743249, null);
    }

    public static String k1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.gd.a0(null, null, 2131743247, str);
            }
            return org.telegram.messenger.gd.N0(2131743248, null);
        } else if (i7 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.gd.N0(2131743246, null);
            }
            return org.telegram.messenger.gd.N0(2131743245, null);
        } else {
            return org.telegram.messenger.gd.N0(2131743244, null);
        }
    }

    public static boolean t1(int i7) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f27034b.rtmp_stream) && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public static void x1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && org.telegram.messenger.v3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                if (isConference) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131743218, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743219, null);
                } else if (org.telegram.messenger.v3.W(chat)) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131743221, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743222, null);
                } else {
                    t1Var.S = org.telegram.messenger.gd.N0(2131743111, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743112, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                if (!sharedInstance.isConference() || (t3Var != null && (groupCall = t3Var.f27034b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, 1);
                    d2VarArr[0] = d2Var;
                    d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                    if (z10) {
                        d2VarArr[0].setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false));
                    } else {
                        d2VarArr[0].setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) d2VarArr[0].getCheckBoxView();
                        int i7 = org.telegram.ui.ActionBar.n6.f29552ih;
                        int i10 = org.telegram.ui.ActionBar.n6.f29517gh;
                        int i11 = org.telegram.ui.ActionBar.n6.f29480eh;
                        checkBoxSquare.f32954s = i7;
                        checkBoxSquare.f32955w = i10;
                        checkBoxSquare.f32956x = i11;
                        checkBoxSquare.invalidate();
                    }
                    d2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        d2VarArr[0].e(org.telegram.messenger.gd.N0(2131743220, null), "", false, false, false);
                    } else if (org.telegram.messenger.v3.W(chat)) {
                        d2VarArr[0].e(org.telegram.messenger.gd.N0(2131743223, null), "", false, false, false);
                    } else {
                        d2VarArr[0].e(org.telegram.messenger.gd.N0(2131743113, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
                    if (org.telegram.messenger.gd.f24314a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.gd.f24314a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    d2Var2.setPadding(L, 0, L2, 0);
                    g10.addView(d2VarArr[0], c8.na.o(-1, -2));
                    d2VarArr[0].setOnClickListener(new b10(d2VarArr, 0));
                }
                alertDialog$Builder.o(g10);
                t1Var.J = org.telegram.ui.ActionBar.n6.f29517gh;
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743114, null), new bg.f0(t3Var, d2VarArr, selfId, runnable, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
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
                    t1Var.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29608lh, false));
                }
                t1Var.show();
                if (!z10) {
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29625mh, null);
                    }
                    t1Var.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yg, false));
                    return;
                }
                return;
            }
            C1(t3Var, false, selfId, runnable);
        }
    }

    public final void A1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.A1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void B1() {
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && t3Var.f27034b != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.V2.f27034b;
            tL_inputGroupCall.f28509id = groupCall.f28502id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f30223a).sendRequest(exportgroupcallinvite, new z9(this, t1Var, exportgroupcallinvite, 12));
        }
    }

    public final void D1(org.telegram.tgnet.TLRPC.GroupCallParticipant r33, final long r34, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.D1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void E1(boolean r18, org.telegram.ui.Cells.g4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.E1(boolean, org.telegram.ui.Cells.g4):void");
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void F1() {
        m4 m4Var = this.f47432z4;
        org.telegram.messenger.g0.r(m4Var);
        if (this.f47427y4 && this.P2 != null && VoIPService.getSharedInstance() != null && v1() && this.L1 != null && org.telegram.messenger.pc.e(512)) {
            org.telegram.messenger.g0.h3(m4Var, 30L);
        }
    }

    public final void G1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j3;
        this.C1.setText("");
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && t3Var.f27034b != null && (g10 = t3Var.g(t3Var.f27033a)) != null) {
            org.telegram.messenger.t3 t3Var2 = this.V2;
            long j10 = t3Var2.f27034b.f28502id;
            TLRPC.Peer peer = t3Var2.J;
            if (peer != null) {
                j3 = org.telegram.messenger.n5.o(peer);
            } else {
                j3 = org.telegram.messenger.i10.i(this.f30223a).f24656n;
            }
            GroupCallMessagesController.getInstance(this.f30223a).sendCallMessage(j3, tL_textWithEntities, j10, g10);
        }
    }

    @Override
    public final boolean H() {
        return !this.Z3.f41003b;
    }

    public final void H1(float f10) {
        float f11;
        int i7;
        int i10;
        this.T3 = f10;
        a20 a20Var = this.Z3;
        if (a20Var == null) {
            f11 = 0.0f;
        } else {
            f11 = a20Var.f41005c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.n6.f29404ah;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.n6.Xg;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        this.U3 = S0;
        this.I1.setBackgroundColor(S0);
        this.f47341f3.I(-14472653);
        this.f47321a2.setColorFilter(new PorterDuffColorFilter(this.U3, PorterDuff.Mode.MULTIPLY));
        this.H0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i11, false), org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29424bh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29590kh, false));
        g.b bVar = this.f47359k2;
        if (bVar != null) {
            bVar.f12922b = S02;
            tv tvVar = (tv) bVar.f12927i;
            if (tvVar != null) {
                tvVar.invalidate();
            }
        }
        this.f47420x2.setColor(S02);
        this.f47429z1.setColor(S02);
        this.A1.invalidate();
        m30 m30Var = this.L1;
        m30Var.setGlowColor(S02);
        int i13 = this.E3;
        if (i13 == 3 || t1(i13)) {
            this.f47414w1.invalidate();
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
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29778uh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29796vh, false));
        this.f47404u1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29444ch, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29497fh, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29461dh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29552ih, false));
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0);
        int childCount = m30Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = m30Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.a4) {
                org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) childAt;
                if (s1()) {
                    a4Var.a(w02, w02);
                } else {
                    a4Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.g4;
                c30 c30Var = this.J1;
                if (z10) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                    if (c30Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.n6.f29552ih;
                    } else {
                        i10 = org.telegram.ui.ActionBar.n6.f29461dh;
                    }
                    g4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                    if (c30Var.getTag() != null) {
                        i7 = org.telegram.ui.ActionBar.n6.f29552ih;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29461dh;
                    }
                    z3Var.a(i7, S05);
                }
            }
        }
        this.f30226b.invalidate();
        m30Var.invalidate();
        this.f30229c.invalidate();
    }

    public final void I1(float f10) {
        m30 m30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        v4.f1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.K2 = min;
        this.L2 = (min - this.J2) / 265.0f;
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && (m30Var = this.L1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(org.telegram.messenger.fj.B1(this.f47410v2))) != null) {
            a20 a20Var = this.Z3;
            if (!a20Var.f41003b) {
                if (this.f47372n2) {
                    arrayList = this.f47425y2;
                } else {
                    arrayList = this.V2.f27038g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = m30Var.K(indexOf + this.K1.d)) != null) {
                    View view = K.f59245a;
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        ((org.telegram.ui.Cells.g4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.W4 && !this.f47361k4) {
                            this.f30226b.invalidate();
                        }
                    }
                }
            } else {
                int i7 = 0;
                while (true) {
                    w10 w10Var = this.f47365l4;
                    if (i7 >= w10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) w10Var.getChildAt(i7);
                    if (org.telegram.messenger.fj.B1(s10Var.getParticipant().peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                        s10Var.setAmplitude(f10 * 15.0f);
                    }
                    i7++;
                }
            }
            a20Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void J1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f47343f5 = i7;
        this.f47347g5 = i10;
        this.f47351h5 = i11;
        this.f47355i5 = i12;
        this.f47358j5 = i13;
        this.f47362k5 = i14;
        this.f47366l5 = i15;
        this.f47371m5 = i16;
        this.f47375n5 = i17;
        this.f47379o5 = i18;
        this.f47384p5 = i19;
        this.f47389q5 = i20;
        this.f47394r5 = i21;
        this.s5 = i22;
        this.f47403t5 = i23;
        this.f47408u5 = i24;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            b1();
            Z0();
            a1();
            float f12 = 1.0f - this.f47428y5.f57779e;
            n10 n10Var = this.f47380p1;
            n10Var.setAlpha(f12);
            this.Z3.setProgressToHideUi(f10);
            this.f47365l4.invalidate();
            this.f30226b.invalidate();
            n10Var.invalidate();
        }
        if (i7 == 3) {
            c1();
            b1();
            d1();
            Y0();
            this.f30226b.invalidate();
        }
        if (i7 == 4) {
            b1();
            this.B1.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 5) {
            b1();
            this.f30226b.invalidate();
        }
    }

    public final void K1(float f10) {
        m30 m30Var;
        int L;
        int i7;
        float f11;
        this.f47400t2 = f10;
        this.L1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) m30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f30260t0 + L2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.f30260t0 + L2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        t30 t30Var = this.P2;
        a20 a20Var = this.Z3;
        u10 u10Var = this.f47322a3;
        s10 s10Var = this.Z2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L2) - this.f30260t0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((L - this.f30260t0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i7 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (t30Var != null) {
                t30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.T3) > 1.0E-4f) {
                H1(Math.min(1.0f, min));
            }
            float z10 = org.telegram.ui.Cells.c0.z(min, 0.1f, 1.2f, 1.0f);
            s10Var.setScaleX(Math.max(0.9f, z10));
            s10Var.setScaleY(Math.max(0.9f, z10));
            float f12 = 1.0f - (min * 1.2f);
            s10Var.setAlpha((1.0f - a20Var.f41005c) * Math.max(0.0f, f12));
            u10Var.setScaleX(Math.max(0.9f, z10));
            u10Var.setScaleY(Math.max(0.9f, z10));
            u10Var.setAlpha((1.0f - a20Var.f41005c) * Math.max(0.0f, f12));
        } else {
            s10Var.setScaleX(1.0f);
            s10Var.setScaleY(1.0f);
            s10Var.setAlpha(1.0f - a20Var.f41005c);
            u10Var.setScaleX(1.0f);
            u10Var.setScaleY(1.0f);
            u10Var.setAlpha(1.0f - a20Var.f41005c);
            if (this.T3 > 1.0E-4f) {
                H1(0.0f);
            }
            i7 = 0;
        }
        b1();
        float f13 = i7;
        this.f47426y3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f47337e3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (t30Var != null) {
            t30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        s20 s20Var = this.M1;
        if (s20Var != null) {
            s20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f30226b.invalidate();
        Y1();
    }

    @Override
    public final void L() {
        ArrayList arrayList = this.X3;
        ArrayList arrayList2 = this.Y3;
        a20 a20Var = this.Z3;
        if (a20Var != null) {
            if (this.f47383p4 != null) {
                this.L1.getViewTreeObserver().removeOnPreDrawListener(this.f47383p4);
                this.f47383p4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i7)).f();
                a20Var.removeView((View) arrayList2.get(i7));
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i7)).e();
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i7)).b(true);
            }
            arrayList.clear();
            if (a20Var.getParent() != null) {
                arrayList.clear();
                this.f30226b.removeView(a20Var);
            }
        }
        ai.j2 j2Var = this.f47382p3;
        if (j2Var.d) {
            j2Var.d = false;
            Thread thread = j2Var.f1314e;
            if (thread != null) {
                thread.interrupt();
                j2Var.f1314e = null;
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
        org.telegram.ui.Components.a20.k(getContext());
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null) {
            ArrayList arrayList3 = t3Var.f27036e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            t3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final boolean M1(android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.M1(android.view.View):boolean");
    }

    public final void N1(View view) {
        if (this.f47348h2 == null) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(8, getContext(), null, true);
            this.f47348h2 = j30Var;
            j30Var.setAlpha(0.0f);
            this.f47348h2.setVisibility(4);
            this.f47348h2.setShowingDuration(3000L);
            this.f30226b.addView(this.f47348h2, c8.na.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.v3.W(this.U2)) {
                this.f47348h2.setText(org.telegram.messenger.gd.N0(2131743215, null));
            } else {
                this.f47348h2.setText(org.telegram.messenger.gd.N0(2131743097, null));
            }
            this.f47348h2.b();
        }
        this.f47348h2.setExtraTranslationY(-org.telegram.messenger.g0.f24220m);
        this.f47348h2.c(view);
    }

    public final void O1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.messenger.t3 t3Var = this.V2;
        org.telegram.ui.Components.voip.r2 r2Var = this.f47409v1;
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f47390r1;
        org.telegram.ui.Components.voip.r2 r2Var3 = this.f47399t1;
        org.telegram.ui.Components.voip.r2 r2Var4 = this.f47385q1;
        org.telegram.ui.Components.voip.r2 r2Var5 = this.f47395s1;
        org.telegram.ui.Components.voip.r2 r2Var6 = this.f47404u1;
        org.telegram.ui.Components.voip.r2 r2Var7 = this.f47414w1;
        boolean z19 = true;
        n10 n10Var = this.f47380p1;
        boolean z20 = false;
        if (t3Var != null && !t3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.fj.B1(this.f47410v2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !T0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f47418w5;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.V2.f27034b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.V2.c()) || z13) && !v1()) {
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
            n10Var.c(r2Var7, true, z10);
            n10Var.c(r2Var6, true, z10);
            n10Var.c(r2Var5, z16, z10);
            n10Var.c(r2Var4, z18, z10);
            n10Var.c(r2Var3, z20, z10);
            n10Var.c(r2Var2, z17, z10);
            n10Var.c(r2Var, z15, z10);
            return;
        }
        if (this.Q2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        n10Var.c(r2Var7, z11, z10);
        if (this.Q2 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        n10Var.c(r2Var6, z12, z10);
        if (this.Q2 <= 0.1f) {
            z19 = false;
        }
        n10Var.c(r2Var3, z19, z10);
        n10Var.c(r2Var5, false, z10);
        n10Var.c(r2Var4, false, z10);
        n10Var.c(r2Var2, false, z10);
        n10Var.c(r2Var, false, z10);
    }

    public final void P1() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        TLObject O0;
        org.telegram.messenger.t3 t3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i14;
        int i15;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.t3 t3Var2 = this.V2;
        org.telegram.ui.ActionBar.q0 q0Var = this.f47341f3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f47349h3;
        if (t3Var2 == null || t3Var2.j()) {
            this.f47345g3.setVisibility(4);
            q0Var2.setVisibility(8);
            if (this.V2 == null) {
                q0Var.setVisibility(8);
                return;
            }
        }
        if (this.f47344g2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f47376o1;
        int i16 = cVar.f23343a;
        int i17 = cVar.f23343a;
        TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i16).O0(Long.valueOf(m1()));
        if (O02 != null) {
            this.U2 = O02;
        }
        boolean y10 = org.telegram.messenger.v3.y(3, this.U2);
        org.telegram.ui.ActionBar.y0 y0Var = this.f47353i3;
        if (!y10 && (((org.telegram.messenger.v3.T(this.U2) && ((chat2 = this.U2) == null || !chat2.megagroup)) || (!org.telegram.messenger.v3.t0(this.U2) && !org.telegram.messenger.v3.y(3, this.U2))) && (!org.telegram.messenger.v3.T(this.U2) || (chat = this.U2) == null || chat.megagroup || !org.telegram.messenger.v3.t0(chat)))) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
        org.telegram.messenger.t3 t3Var3 = this.V2;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f47421x3;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f47416w3;
        if (t3Var3 != null && (groupCall2 = t3Var3.f27034b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i14 = 8;
            } else {
                i14 = 0;
            }
            y0Var3.setVisibility(i14);
            if (this.V2.f27034b.messages_enabled) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            y0Var2.setVisibility(i15);
        } else {
            y0Var3.setVisibility(8);
            y0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.fj.B1(this.f47410v2));
        org.telegram.messenger.t3 t3Var4 = this.V2;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f47364l3;
        if (t3Var4 != null && !t3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            y0Var4.setVisibility(0);
        } else {
            y0Var4.setVisibility(8);
        }
        if (org.telegram.messenger.bz.I0) {
            i7 = 2131232266;
        } else {
            i7 = 2131232265;
        }
        y0Var4.setIcon(i7);
        if (org.telegram.messenger.bz.I0) {
            i10 = 2131743030;
        } else {
            i10 = 2131743031;
        }
        y0Var4.setSubtext(org.telegram.messenger.gd.N0(i10, null));
        org.telegram.messenger.t3 t3Var5 = this.V2;
        if (t3Var5 != null && !t3Var5.j() && !v1() && DictationAsr.G()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        org.telegram.ui.ActionBar.y0 y0Var5 = this.f47369m3;
        y0Var5.setVisibility(i11);
        boolean a10 = ai.j2.a();
        this.f47373n3.a(a10, false);
        if (a10) {
            i12 = 2131745053;
        } else {
            i12 = 2131745054;
        }
        y0Var5.setSubtext(org.telegram.messenger.gd.N0(i12, null));
        Q1();
        boolean T0 = T0();
        org.telegram.ui.ActionBar.y0 y0Var6 = this.f47411v3;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.j3;
        org.telegram.ui.ActionBar.y0 y0Var8 = this.f47392r3;
        org.telegram.ui.ActionBar.y0 y0Var9 = this.f47397s3;
        if (T0) {
            y0Var6.setVisibility(0);
            y0Var7.setVisibility(0);
            if (v1()) {
                y0Var8.setVisibility(0);
                y0Var9.setVisibility(8);
            } else if (this.V2.j()) {
                y0Var8.setVisibility(8);
                y0Var9.setVisibility(8);
            } else {
                y0Var8.setVisibility(0);
            }
            if (s1()) {
                y0Var8.setVisibility(8);
                y0Var7.setVisibility(8);
            }
            if (this.V2.c() && !this.V2.j() && !v1()) {
                y0Var9.setVisibility(0);
            } else {
                y0Var9.setVisibility(8);
            }
            q0Var2.setVisibility(8);
            boolean z13 = this.V2.f27052w;
            z30 z30Var = this.Y2;
            z30Var.f54515f = z13;
            z30Var.d = 1.0f;
            z30Var.invalidateSelf();
            if (this.V2.f27052w) {
                if (this.C3 == null) {
                    u00 u00Var = new u00(this, 7);
                    this.C3 = u00Var;
                    org.telegram.messenger.g0.h3(u00Var, 1000L);
                }
                y0Var8.setText(org.telegram.messenger.gd.N0(2131743073, null));
            } else {
                u00 u00Var2 = this.C3;
                if (u00Var2 != null) {
                    org.telegram.messenger.g0.r(u00Var2);
                    this.C3 = null;
                }
                y0Var8.setText(org.telegram.messenger.gd.N0(2131743098, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                y0Var9.j(org.telegram.messenger.gd.N0(2131743184, null), 2131232358, null);
            } else {
                y0Var9.j(org.telegram.messenger.gd.N0(2131743186, null), 2131232357, null);
            }
            S1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !T0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.V2.c() || z11) && !this.V2.j() && !v1())) {
                if (z11) {
                    q0Var2.setVisibility(8);
                    y0Var9.setVisibility(0);
                    y0Var9.j(org.telegram.messenger.gd.N0(2131743184, null), 2131232358, null);
                    y0Var9.setContentDescription(org.telegram.messenger.gd.N0(2131743184, null));
                } else {
                    y0Var9.j(org.telegram.messenger.gd.N0(2131743186, null), 2131232357, null);
                    y0Var9.setContentDescription(org.telegram.messenger.gd.N0(2131743186, null));
                    q0Var2.setVisibility(8);
                    y0Var9.setVisibility(0);
                }
            } else {
                q0Var2.setVisibility(8);
                y0Var9.setVisibility(8);
            }
            y0Var6.setVisibility(8);
            y0Var7.setVisibility(8);
            y0Var8.setVisibility(8);
        }
        boolean T02 = T0();
        org.telegram.ui.ActionBar.y0 y0Var10 = this.f47387q3;
        if (T02 && this.V2.f27034b.can_change_join_muted && !s1()) {
            y0Var10.setVisibility(0);
        } else {
            y0Var10.setVisibility(8);
        }
        if (s1() && ((t3Var = this.V2) == null || (groupCall = t3Var.f27034b) == null || !groupCall.creator)) {
            z12 = false;
        } else {
            z12 = true;
        }
        q0Var.R(4, z12);
        if (v1() && !this.V2.j()) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        this.f47360k3.setVisibility(i13);
        int visibility = y0Var7.getVisibility();
        TextView textView = this.f47431z3;
        if (visibility != 0 && y0Var10.getVisibility() != 0 && y0Var.getVisibility() != 0 && y0Var9.getVisibility() != 0 && y0Var8.getVisibility() != 0 && y0Var6.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f47340f2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.W2) && !v1() && this.f47410v2 != null) {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.fj.B1(this.f47410v2);
            if (org.telegram.messenger.n5.E(B1)) {
                O0 = org.telegram.messenger.mp.u1(i17).c2(Long.valueOf(B1));
            } else {
                O0 = org.telegram.messenger.mp.u1(i17).O0(Long.valueOf(-B1));
            }
            kVar.setObject(O0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.U2;
        if (chat3 != null && !org.telegram.messenger.v3.W(chat3) && v1() && y0Var.getVisibility() == 8) {
            q0Var.setVisibility(8);
        } else {
            q0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f47337e3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f47426y3.getLayoutParams()).rightMargin = 0;
        this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void Q1() {
        boolean z10;
        long j3;
        String str;
        org.telegram.messenger.t3 t3Var;
        if (this.f47382p3 != null) {
            int i7 = 0;
            if (ai.j2.a() && (t3Var = this.V2) != null && !t3Var.j() && !v1() && C5 == this) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f47382p3.d) {
                final ai.j2 j2Var = this.f47382p3;
                Context context = getContext();
                int i10 = this.f47376o1.f23343a;
                TLRPC.Chat chat = this.U2;
                if (chat != null) {
                    j3 = -chat.f28492id;
                } else {
                    j3 = 0;
                }
                if (!j2Var.d) {
                    j2Var.d = true;
                    final android.support.v4.media.session.a0 W = DictationAsr.W(ai.s0.c(context, j3));
                    boolean z11 = DictationAsr.z();
                    j2Var.f1313c = z11;
                    if (z11) {
                        ExecutorService executorService = DictationLid.f43150a;
                        if (DictationAsr.z()) {
                            DictationLid.d(context);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("live captions: ");
                    sb2.append(W);
                    if (j2Var.f1313c) {
                        str = ", tinylid";
                    } else {
                        str = "";
                    }
                    p5.c.t(sb2, str, "Dictation");
                    j2Var.f1311a.getClass();
                    DictationAsr.i0((ai.q) W.f1676b, false, new ai.r() {
                        @Override
                        public final void a(boolean z12) {
                            j2 j2Var2 = j2.this;
                            android.support.v4.media.session.a0 a0Var = W;
                            if (!j2Var2.d) {
                                return;
                            }
                            j2Var2.f1311a.getClass();
                            if (!z12) {
                                j2Var2.d = false;
                                return;
                            }
                            NativeInstance.setIncomingAudioCapture(true);
                            Thread thread = new Thread(new a1.e(18, j2Var2, a0Var), "LiveCaptions");
                            j2Var2.f1314e = thread;
                            thread.start();
                        }
                    });
                }
            } else if (!z10 && this.f47382p3.d) {
                ai.j2 j2Var2 = this.f47382p3;
                if (j2Var2.d) {
                    j2Var2.d = false;
                    Thread thread = j2Var2.f1314e;
                    if (thread != null) {
                        thread.interrupt();
                        j2Var2.f1314e = null;
                    }
                    try {
                        NativeInstance.setIncomingAudioCapture(false);
                    } catch (Throwable unused) {
                    }
                }
                org.telegram.ui.Components.voip.t0 t0Var = this.f47378o3;
                t0Var.getClass();
                ArrayList arrayList = new ArrayList(t0Var.f41231a);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                    t0Var.f41231a.remove(s0Var);
                    t0Var.removeView(s0Var);
                }
            }
        }
    }

    public final void R0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.R0(boolean):void");
    }

    public final void R1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.R1(int, boolean):void");
    }

    public final int S0() {
        m30 m30Var = this.L1;
        int childCount = m30Var.getChildCount();
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = m30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i7 = Math.min(i7, childAt.getTop());
            }
        }
        return i7;
    }

    public final void S1() {
        if (this.V2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f47376o1.f23343a).getCurrentTime();
        org.telegram.messenger.t3 t3Var = this.V2;
        int i7 = currentTime - t3Var.f27034b.record_start_date;
        boolean z10 = t3Var.f27052w;
        org.telegram.ui.ActionBar.y0 y0Var = this.f47392r3;
        if (z10) {
            y0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            y0Var.setSubtext(null);
        }
    }

    public final boolean T0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.t3 t3Var = this.V2;
            if (t3Var != null && (groupCall = t3Var.f27034b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.v3.w(14, this.U2);
    }

    public final void T1(boolean z10) {
        float interpolation;
        float f10;
        s20 s20Var = this.M1;
        if ((s20Var == null || this.V2 != null) && this.S2 == null) {
            this.R2 = 1.0f;
            this.Q2 = 1.0f;
            if (s20Var == null) {
                return;
            }
        }
        int i7 = 4;
        if (!z10) {
            r10 r10Var = this.f47412v4;
            org.telegram.messenger.g0.r(r10Var);
            r10Var.run();
            org.telegram.messenger.t3 t3Var = this.V2;
            m30 m30Var = this.L1;
            if (t3Var != null && !t3Var.j()) {
                m30Var.setVisibility(0);
            } else {
                m30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.v3.W(this.U2);
            org.telegram.ui.ActionBar.y0 y0Var = this.f47411v3;
            if (W) {
                y0Var.setText(org.telegram.messenger.gd.N0(2131743238, null));
            } else {
                y0Var.setText(org.telegram.messenger.gd.N0(2131743145, null));
            }
        }
        float f11 = this.Q2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.kr.f36858f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.R2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
            this.R2 = krVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * krVar.getInterpolation(this.Q2 / 0.6f);
            f10 = this.Q2 / 0.6f;
        }
        O1(true);
        float f12 = 1.0f - f10;
        s20Var.setAlpha(f12);
        this.P1.setAlpha(f10);
        this.R1.setAlpha(f10);
        l30 l30Var = this.Q1;
        l30Var.setAlpha(f10);
        l30Var.setScaleX(interpolation);
        l30Var.setScaleY(interpolation);
        q20 q20Var = this.O1;
        q20Var.setScaleX(f12);
        q20Var.setScaleY(f12);
        q20Var.setAlpha(f12);
        this.N1.setAlpha(f12);
        this.f47341f3.setAlpha(f10);
        if (f12 != 0.0f) {
            i7 = 0;
        }
        if (i7 != s20Var.getVisibility()) {
            s20Var.setVisibility(i7);
            q20Var.setVisibility(i7);
        }
    }

    public final void U0() {
        if (this.Q3) {
            this.Q3 = false;
            org.telegram.messenger.g0.r(this.f47422x4);
        }
        if (this.R3) {
            this.R3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f47414w1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void U1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        org.telegram.ui.Components.voip.r2 r2Var = this.f47399t1;
        if (r2Var != null && r2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            n10 n10Var = this.f47380p1;
            boolean z14 = false;
            if (sharedInstance != null && !v1()) {
                mh.a aVar = (mh.a) n10Var.f21096c.get(r2Var);
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
                    r2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131743253, null), false, z10);
                } else if (z13) {
                    r2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.gd.N0(2131742989, null), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    r2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131743251, null), false, z10);
                } else {
                    r2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131742989, null), false, z10);
                }
                r2Var.b(z13, z10);
                l1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i7 = 2131231091;
                } else {
                    i7 = 2131231173;
                }
                if (this.V1 != i7) {
                    this.V1 = i7;
                    org.telegram.messenger.g0.P3(this.W1, i7);
                }
                org.telegram.ui.Components.voip.r2 r2Var2 = this.f47390r1;
                if (r2Var2.getVisibility() == 0) {
                    r2Var2.c(0, -1, 0, 1.0f, true, j1(l1()), false, z10);
                    if (l1() != 1) {
                        z14 = true;
                    }
                    r2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            r2Var.c(2131232440, -1, 0, 0.3f, true, org.telegram.messenger.gd.N0(2131743187, null), false, z10);
            if (!org.telegram.messenger.v3.t0(this.U2) && (!org.telegram.messenger.v3.N(this.U2) || !org.telegram.messenger.v3.w(3, this.U2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            mh.a aVar2 = (mh.a) n10Var.f21096c.get(r2Var);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.V0():void");
    }

    public final void V1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.V1(boolean, boolean):void");
    }

    public final void W0() {
        this.A1.setTranslationY((-this.B3.d()) + this.f30226b.getPaddingBottom());
        this.B1.invalidate();
        c1();
        b1();
        Z0();
        a1();
        d1();
        this.f47380p1.setAlpha(1.0f - this.f47428y5.f57779e);
        X0();
        Y0();
    }

    public final void W1() {
        boolean z10;
        String str;
        float f10;
        float f11;
        c40 c40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        c30 c30Var = this.J1;
        if (c30Var != null && this.V2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i7 = 0;
            for (int i10 = 0; i10 < this.V2.P.m(); i10++) {
                long j3 = this.V2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.P.f(j3);
                if (!groupCallParticipant.self) {
                    a20 a20Var = this.Z3;
                    a20Var.getClass();
                    if (a20Var.f41032x.get(org.telegram.messenger.fj.B1(groupCallParticipant.peer)) <= 0 && this.A4.get(j3, 0) != 1) {
                        long B1 = org.telegram.messenger.fj.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i7 < 2) {
                            int i11 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.mp.u1(this.f30223a).c2(Long.valueOf(B1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.mp.u1(this.f30223a).O0(Long.valueOf(B1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i7 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.n10.k(user, true), new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), 0);
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
                String K0 = org.telegram.messenger.gd.K0(i7, "MembersAreSpeakingToast");
                int indexOf = K0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                c30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.n5 subtitleTextView = c30Var.getSubtitleTextView();
            if (v1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.V2.f27034b.participants_count;
            y30 y30Var = this.K1;
            subtitleTextView.k(org.telegram.messenger.gd.G(i12 + ((y30Var.N.v1() || y30Var.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (v1() && (c40Var = this.A3) != null) {
                c40Var.setWatchersCount(this.V2.f27034b.participants_count);
            }
            if (z10 != this.f47402t4) {
                this.f47402t4 = z10;
                c30Var.invalidate();
                float f12 = 0.0f;
                c30Var.getSubtitleTextView().setPivotX(0.0f);
                c30Var.getSubtitleTextView().setPivotY(c30Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = c30Var.getSubtitleTextView().animate();
                if (this.f47402t4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f47402t4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f47402t4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.V3(c30Var.getAdditionalSubtitleTextView(), this.f47402t4);
            }
        }
    }

    public final void X0() {
        int i7;
        float f10 = this.B3.f56727b.f57805a;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        n20 n20Var = this.A1;
        n20Var.setAlpha(f10);
        l20 l20Var = this.B1;
        l20Var.setAlpha(f10);
        if (n20Var.getVisibility() != i7) {
            n20Var.setVisibility(i7);
            l20Var.setVisibility(i7);
            if (i7 == 8) {
                j20 j20Var = this.C1;
                if (j20Var.isFocused()) {
                    j20Var.clearFocus();
                }
            }
        }
    }

    public final void X1(boolean z10) {
        org.telegram.messenger.t3 t3Var = this.V2;
        s10 s10Var = this.Z2;
        if (t3Var == null) {
            if (org.telegram.messenger.v3.W(this.U2)) {
                s10Var.b(org.telegram.messenger.gd.N0(2131743212, null), z10);
                return;
            } else {
                s10Var.b(org.telegram.messenger.gd.N0(2131743091, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(t3Var.f27034b.title);
        c30 c30Var = this.J1;
        if (!isEmpty) {
            if (!this.V2.f27034b.title.equals(c30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.V2.f27034b.title, true, 180L, null);
                    c30Var.getTitleTextView().setOnClickListener(new s00(this, 8));
                } else {
                    c30Var.setTitle(this.V2.f27034b.title);
                }
                s10Var.b(this.V2.f27034b.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.U2;
            if (chat != null && !chat.title.equals(c30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.U2.title, true, 180L, null);
                    c30Var.getTitleTextView().setOnClickListener(new s00(this, 9));
                } else {
                    c30Var.setTitle(this.U2.title);
                }
                if (org.telegram.messenger.v3.W(this.U2)) {
                    if (v1()) {
                        s10Var.b(this.U2.title, z10);
                    } else {
                        s10Var.b(org.telegram.messenger.gd.N0(2131743197, null), z10);
                    }
                } else {
                    s10Var.b(org.telegram.messenger.gd.N0(2131743056, null), z10);
                }
            } else if (this.U2 == null) {
                c30Var.setTitle(org.telegram.messenger.gd.N0(2131751811, null));
                s10Var.b(org.telegram.messenger.gd.N0(2131751811, null), z10);
            }
        }
        org.telegram.ui.ActionBar.n5 titleTextView = c30Var.getTitleTextView();
        if (this.V2.f27052w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new a40(titleTextView));
                TextView textView = s10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new a40(textView), (Drawable) null);
                TextView nextTextView = s10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new a40(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            s10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            s10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void Y0() {
        int i7;
        org.telegram.ui.Components.xi0 xi0Var = this.F1;
        if (xi0Var != null) {
            float f10 = this.B3.f56727b.f57805a * this.f47433z5.f57779e;
            xi0Var.setAlpha(f10);
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
            org.telegram.ui.Components.xi0 xi0Var2 = this.F1;
            if (!xi0Var2.O0 && f10 == 1.0f) {
                xi0Var2.O0 = true;
            }
        }
    }

    public final void Y1() {
        float f10;
        org.telegram.ui.Components.kb kbVar;
        boolean z10;
        if (this.F != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f47400t2 - L;
            if (this.f30260t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int L2 = (L - this.f30260t0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f30260t0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f30226b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            c30 c30Var = this.J1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), c30Var.getY() + (-this.F.getTop()) + c30Var.getHeight(), f10));
            org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
            if (fcVar != null && (kbVar = fcVar.f35087e) != null && kbVar.getParent() != null && kbVar.getParent().getParent() == this.F) {
                if (f10 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kbVar.setTop(z10);
            }
        }
    }

    public final void Z0() {
        boolean z10 = F5;
        n10 n10Var = this.f47380p1;
        if (z10) {
            n10Var.setTranslationX(0.0f);
            n10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.f47428y5;
        if (z11) {
            n10Var.setTranslationX(aVar.f57779e * org.telegram.messenger.g0.L(94.0f));
            n10Var.setTranslationY(0.0f);
            return;
        }
        n10Var.setTranslationX(0.0f);
        n10Var.setTranslationY(aVar.f57779e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void a1() {
        boolean z10 = F5;
        w10 w10Var = this.f47365l4;
        if (z10) {
            w10Var.setTranslationX(0.0f);
            w10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.f47428y5;
        if (z11) {
            w10Var.setTranslationX(aVar.f57779e * org.telegram.messenger.g0.L(94.0f));
            w10Var.setTranslationY(0.0f);
            return;
        }
        w10Var.setTranslationX(0.0f);
        w10Var.setTranslationY(aVar.f57779e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void b1() {
        float L;
        int i7;
        float f10 = this.A5.f57785f;
        rh.h hVar = this.B3;
        float f11 = -((hVar.d() - this.f30226b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f47433z5.f57779e) + org.telegram.messenger.g0.L(10.0f));
        if (F5) {
            L = (1.0f - this.B5.f57779e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (E5) {
            L = 0.0f;
        } else {
            L = ((this.f47428y5.f57779e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.Z3.f41005c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f56727b.f57805a);
        float measuredHeight = ((this.f30226b.getMeasuredHeight() - this.f47400t2) + T1) - this.f30260t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        org.telegram.ui.Components.voip.t0 t0Var = this.f47378o3;
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

    public final void c1() {
        if (this.F1 != null) {
            this.F1.setTranslationY((-this.B3.d()) + this.f30226b.getPaddingBottom() + ((-this.f47433z5.f57779e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void d1() {
        boolean z10;
        float f10 = this.f47433z5.f57779e;
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

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i11;
        int i12;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i13;
        int i14;
        String N0;
        boolean z10;
        org.telegram.messenger.u3 u3Var;
        boolean z11;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = org.telegram.messenger.ks.f25312w2;
        m30 m30Var = this.L1;
        String[] strArr = null;
        int i18 = 0;
        if (i7 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.t3 t3Var = this.V2;
            if (t3Var != null && t3Var.f27034b.f28502id == l10.longValue()) {
                org.telegram.messenger.t3 t3Var2 = this.V2;
                if (t3Var2.f27034b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f47377o2 > 0L ? 1 : (this.f47377o2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f47376o1;
                if (i19 == 0 && (((i16 = this.E3) == 7 || i16 == 5 || i16 == 6) && !t3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.d2, VoIPService.class);
                        intent.putExtra("chat_id", m1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.W2);
                        intent.putExtra("peerChannelId", this.T2.channel_id);
                        intent.putExtra("peerChatId", this.T2.chat_id);
                        intent.putExtra("peerUserId", this.T2.user_id);
                        intent.putExtra("hash", this.X2);
                        intent.putExtra("peerAccessHash", this.T2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f23343a);
                        intent.putExtra("scheduleDate", this.f47357j4);
                        this.d2.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f47377o2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.h3(new u00(this, 3), 3000L);
                }
                if (!this.f47381p2 && VoIPService.getSharedInstance() != null) {
                    this.V2.b(false);
                    p1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                P1();
                int childCount = m30Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = m30Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.g4) {
                        ((org.telegram.ui.Cells.g4) childAt).a(true, false);
                    }
                }
                if (this.W4 != null) {
                    this.f47372n2 = true;
                } else {
                    R0(true);
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
                    o1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !v1()) {
                        if (!s1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = org.telegram.messenger.mp.u1(cVar.f23343a).f25904y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f28496id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.n5.E(longValue)) {
                                TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.f23343a).c2(l11);
                                if (c22 != null) {
                                    if (this.V2.f27034b.participants_count < 250 || org.telegram.messenger.n10.x(c22) || c22.verified || i18 != 0) {
                                        o1().k(0L, 44, c22, this.U2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(cVar.f23343a).O0(Long.valueOf(-longValue));
                            if (O0 != null) {
                                if (this.V2.f27034b.participants_count < 250 || !org.telegram.messenger.v3.r0(O0) || O0.verified || i18 != 0) {
                                    o1().k(0L, 44, O0, this.U2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25326y2) {
            a20 a20Var = this.Z3;
            if (a20Var.f41003b && this.V2 != null) {
                boolean c10 = a20Var.c();
                org.telegram.messenger.t3 t3Var3 = this.V2;
                if (t3Var3 != null && a20Var.f41003b && (u3Var = a20Var.f41008e) != null && t3Var3.d.f(org.telegram.messenger.fj.B1(u3Var.f27215a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.u3 u3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f47363l2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.u3 u3Var3 = (org.telegram.messenger.u3) arrayList2.get(i22);
                        if (this.V2.P.g(null, org.telegram.messenger.fj.B1(u3Var3.f27215a.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = u3Var3.f27215a;
                            if (!groupCallParticipant3.muted_by_you && a20Var.d != org.telegram.messenger.fj.B1(groupCallParticipant3.peer)) {
                                u3Var2 = u3Var3;
                            }
                        }
                        i22++;
                    }
                    if (u3Var2 != null) {
                        i1(u3Var2);
                    }
                }
            }
            a20Var.setVisibleParticipant(true);
            W1();
        } else if (i7 == org.telegram.messenger.ks.Q4) {
            I1(((Float) objArr[0]).floatValue());
        } else if (i7 == org.telegram.messenger.ks.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.v3.W(this.U2)) {
                        N0 = org.telegram.messenger.gd.N0(2131743202, null);
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131743069, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    N0 = org.telegram.messenger.gd.N0(2131751093, null) + "\n" + str;
                } else if (org.telegram.messenger.v3.W(this.U2)) {
                    N0 = org.telegram.messenger.gd.N0(2131743228, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131743120, null);
                }
                AlertDialog$Builder K = org.telegram.ui.Components.b5.K(getContext(), org.telegram.messenger.gd.N0(2131743056, null), N0);
                K.j(new a10(this, 1));
                try {
                    K.p();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28493id == m1()) {
                P1();
                V1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.fj.B1(this.f47410v2);
            org.telegram.messenger.t3 t3Var4 = this.V2;
            if (t3Var4 != null && chatFull.f28493id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) t3Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                R0(true);
                org.telegram.messenger.g0.Z3(m30Var);
                if (this.D4 != null) {
                    while (i18 < this.D4.getChildCount()) {
                        View childAt2 = this.D4.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.y0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = 2131743256;
                            } else {
                                i13 = 2131743166;
                            }
                            String N02 = org.telegram.messenger.gd.N0(i13, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131232048;
                            } else {
                                i14 = 2131232190;
                            }
                            y0Var.j(N02, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25298u1) {
            if (((Long) objArr[0]).longValue() == m1()) {
                P1();
                V1(isShowing(), false);
            }
        } else if (i7 == org.telegram.messenger.ks.B2) {
            int childCount2 = m30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                v4.f1 G = m30Var.G(m30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f59245a;
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                        if (g4Var.getParticipant() != null) {
                            g4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i7 == org.telegram.messenger.ks.E0) {
            Long l12 = (Long) objArr[0];
            long B12 = org.telegram.messenger.fj.B1(this.f47410v2);
            if (this.V2 != null && B12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                R0(true);
                org.telegram.messenger.g0.Z3(m30Var);
                if (this.D4 != null) {
                    while (i18 < this.D4.getChildCount()) {
                        View childAt3 = this.D4.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.y0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = 2131743257;
                            } else {
                                i11 = 2131743167;
                            }
                            String N03 = org.telegram.messenger.gd.N0(i11, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131232048;
                            } else {
                                i12 = 2131232190;
                            }
                            y0Var2.j(N03, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25233j0) {
            R0(true);
            org.telegram.messenger.g0.Z3(m30Var);
        } else if (i7 == org.telegram.messenger.ks.f25276r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.mp.I8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                R0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.Z3(m30Var);
            }
        } else if (i7 == org.telegram.messenger.ks.f25333z2) {
            v20 v20Var = this.f47405u2;
            if (v20Var != null) {
                v20Var.b(true, true);
            }
            P1();
        } else if (i7 == org.telegram.messenger.ks.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f47359k2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.d2;
        launchActivity.f43188a1.remove(this.f47407u4);
        this.d2.setRequestedOrientation(-1);
        D5 = false;
        org.telegram.ui.Components.s20 s20Var = this.D3;
        if (s20Var != null) {
            s20Var.dismiss();
        }
        this.f47372n2 = true;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f47376o1;
        int i7 = cVar.f23343a;
        int i10 = cVar.f23343a;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.M0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25312w2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25298u1);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.B2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.E0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25233j0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25276r);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25333z2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25326y2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.U3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D2);
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
                UndoView o12 = o1();
                if (z10) {
                    i7 = 42;
                } else {
                    i7 = 43;
                }
                o12.j(i7, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1() {
        org.telegram.ui.Components.voip.z zVar = this.Y4;
        if (zVar != null) {
            zVar.f41357a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.z zVar2 = this.Y4;
            zVar2.h = false;
            zVar2.j(false);
            this.Y4.invalidate();
            this.Z3.invalidate();
        }
        org.telegram.ui.Cells.g4 g4Var = this.W4;
        if (g4Var != null && !this.f47324a5 && g4Var.getParent() != null) {
            this.f30226b.removeView(this.W4);
        }
        org.telegram.ui.Cells.g4 g4Var2 = this.W4;
        if (g4Var2 != null) {
            g4Var2.setProgressToAvatarPreview(0.0f);
            this.W4.setAboutVisible(false);
            this.W4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.s10 s10Var = this.Z4;
        if (s10Var != null) {
            s10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.W4 = null;
        this.X4 = null;
        this.Z4 = null;
        this.Y4 = null;
    }

    public final void g1(boolean z10) {
        if (!this.f47328b5 && this.f47338e4) {
            if (z10) {
                this.f47328b5 = true;
                E1(false, this.W4);
                return;
            }
            e1();
            this.f30226b.removeView(this.f47334d4);
            this.f47334d4 = null;
            this.B4.setVisibility(8);
            this.f30226b.invalidate();
            this.f47338e4 = false;
            this.T1.X = true;
            this.L1.invalidate();
            this.f47323a4.setVisibility(8);
            if (this.f47372n2) {
                this.f47372n2 = false;
                R0(true);
            }
            V0();
        }
    }

    public final org.telegram.ui.Components.voip.s h1() {
        int i7 = 0;
        while (true) {
            m30 m30Var = this.L1;
            if (i7 < m30Var.getChildCount()) {
                View childAt = m30Var.getChildAt(i7);
                if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.s) && RecyclerView.R(childAt) >= 0) {
                    return (org.telegram.ui.Components.voip.s) childAt;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void i1(org.telegram.messenger.u3 u3Var) {
        org.telegram.messenger.u3 u3Var2;
        if (u3Var == null) {
            this.d2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            a20 a20Var = this.Z3;
            if (a20Var.f41023r != null) {
                return;
            }
            boolean z10 = F5;
            m30 m30Var = this.L1;
            int i7 = 0;
            if (z10) {
                if (this.f47383p4 != null) {
                    m30Var.getViewTreeObserver().removeOnPreDrawListener(this.f47383p4);
                    this.f47383p4 = null;
                }
                ArrayList arrayList = new ArrayList();
                h40 h40Var = this.f47374n4;
                ArrayList arrayList2 = this.X3;
                ArrayList arrayList3 = this.Y3;
                if (u3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.s sVar = zVar.f41361c;
                        if (sVar != null) {
                            sVar.setRenderer(null);
                            org.telegram.ui.Components.s10 s10Var = zVar.d;
                            if (s10Var != null) {
                                s10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.s sVar2 = zVar.f41364e;
                            if (sVar2 != null) {
                                sVar2.setRenderer(null);
                            }
                            arrayList.add(zVar.f41388x);
                            zVar.b(false);
                            zVar.animate().alpha(0.0f).setListener(new w20(this, zVar, 0));
                        }
                    }
                    this.O4 = false;
                    h40Var.H(this.f47370m4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) arrayList3.get(i11);
                        if (zVar2.f41364e != null && ((u3Var2 = zVar2.f41388x) == null || !u3Var2.equals(u3Var))) {
                            arrayList.add(zVar2.f41388x);
                            zVar2.b(false);
                            org.telegram.ui.Components.s10 s10Var2 = zVar2.d;
                            if (s10Var2 != null) {
                                s10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.s sVar3 = zVar2.f41361c;
                            if (sVar3 != null) {
                                sVar3.setRenderer(null);
                            }
                            zVar2.animate().alpha(0.0f).setListener(new w20(this, zVar2, 1));
                        }
                    }
                    this.O4 = true;
                    h40Var.f48425r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.voip.o(25, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = m30Var.getViewTreeObserver();
                lh lhVar = new lh(this, u3Var, !a20Var.f41003b);
                this.f47383p4 = lhVar;
                viewTreeObserver.addOnPreDrawListener(lhVar);
                return;
            }
            if (this.f47383p4 != null) {
                m30Var.getViewTreeObserver().removeOnPreDrawListener(this.f47383p4);
                this.f47383p4 = null;
            }
            if (u3Var != null) {
                w10 w10Var = this.f47365l4;
                if (w10Var.getVisibility() != 0) {
                    w10Var.setVisibility(0);
                    org.telegram.ui.Components.t10 t10Var = this.o4;
                    t10Var.G(w10Var, false);
                    this.f47372n2 = true;
                    if (!a20Var.f41003b) {
                        ArrayList arrayList4 = t10Var.f39776e;
                        v4.c0 c0Var = (v4.c0) w10Var.getLayoutManager();
                        if (c0Var != null) {
                            while (true) {
                                if (i7 >= arrayList4.size()) {
                                    break;
                                } else if (((org.telegram.messenger.u3) arrayList4.get(i7)).equals(u3Var)) {
                                    c0Var.h1(i7, org.telegram.messenger.g0.L(13.0f));
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = m30Var.getViewTreeObserver();
                    ow owVar = new ow(1, this, u3Var);
                    this.f47383p4 = owVar;
                    viewTreeObserver2.addOnPreDrawListener(owVar);
                    return;
                }
                a20Var.j(u3Var);
                org.telegram.messenger.g0.Z3(w10Var);
            } else if (m30Var.getVisibility() != 0) {
                m30Var.setVisibility(0);
                R0(false);
                this.f47372n2 = true;
                ViewTreeObserver viewTreeObserver3 = m30Var.getViewTreeObserver();
                y20 y20Var = new y20(this, 0);
                this.f47383p4 = y20Var;
                viewTreeObserver3.addOnPreDrawListener(y20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = m30Var.getViewTreeObserver();
                y20 y20Var2 = new y20(this, 1);
                this.f47383p4 = y20Var2;
                viewTreeObserver4.addOnPreDrawListener(y20Var2);
            }
        }
    }

    public final int l1() {
        Integer num = this.f47423x5;
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

    @Override
    public final boolean m0() {
        D5 = true;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        org.telegram.ui.Components.a20.k(getContext());
        return false;
    }

    public final long m1() {
        TLRPC.Chat chat = this.U2;
        if (chat == null) {
            return 0L;
        }
        return chat.f28492id;
    }

    public final void n1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f47376o1;
        int i7 = cVar.f23343a;
        int i10 = cVar.f23343a;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(m1()));
        if (O0 != null && !org.telegram.messenger.v3.t0(O0)) {
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i10).P0(m1());
            String K = org.telegram.messenger.v3.K(this.U2, false);
            if (!TextUtils.isEmpty(K)) {
                str = p5.c.m(org.telegram.messenger.mp.u1(i10).X2, "/", K, new StringBuilder());
            } else if (P0 != null && (tL_chatInviteExported = P0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.mp.n1(this.U2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new di.o8(this, P0, z10, 6));
                return;
            }
            A1(null, str, true, z10);
        } else if (this.V2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.t3 t3Var = this.V2;
                exportgroupcallinvite.call = t3Var.g(t3Var.f27033a);
                if (i11 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.zc(this, i11, z10, 2));
            }
        }
    }

    public final UndoView o1() {
        if (!F5) {
            a20 a20Var = this.Z3;
            if (a20Var.f41003b) {
                return a20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f47336e2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f30226b.removeView(undoViewArr[0]);
            this.f30226b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    @Override
    public final void onAudioSettingsChanged() {
        U1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            I1(0.0f);
        }
        m30 m30Var = this.L1;
        if (m30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.Z3(m30Var);
        }
        w10 w10Var = this.f47365l4;
        if (w10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.Z3(w10Var);
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
        v20 v20Var = this.f47405u2;
        if (v20Var != null) {
            v20Var.b(false, false);
        } else if (this.f47338e4) {
            g1(true);
        } else if (this.Z3.f41003b) {
            i1(null);
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
        v20 v20Var = this.f47405u2;
        if (v20Var != null && VoIPService.getSharedInstance() != null) {
            v20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.d2;
        launchActivity.f43188a1.add(this.f47407u4);
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

    public final void p1() {
        VoIPService sharedInstance;
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f47381p2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f47381p2 = true;
            this.f47425y2.addAll(this.V2.f27038g);
            this.f47430z2.addAll(this.f47363l2);
            this.A2.addAll(this.V2.f27040j);
            this.B2.addAll(this.V2.f27043m);
            this.C2.addAll(this.V2.f27042l);
            this.S3 = sharedInstance.getCallState();
            if (this.V2 == null) {
                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                this.V2 = t3Var;
                this.o4.f39775c = t3Var;
                this.Z3.setGroupCall(t3Var);
                this.f47374n4.f48421c = this.V2;
            }
            nh.h hVar = this.X1;
            if (hVar != null) {
                hVar.D0(this.f47376o1.f23343a, this.V2.g(false));
            }
            this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.V2.f27036e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            l30 l30Var = this.Q1;
            if (l30Var != null && l30Var.getVisibility() == 0) {
                this.f47404u1.c(2131230918, -1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29778uh, false), 0.3f, false, org.telegram.messenger.gd.N0(2131743114, null), false, true);
                U1(true);
                if (org.telegram.messenger.v3.W(this.U2)) {
                    i7 = 2131743231;
                } else {
                    i7 = 2131743130;
                }
                this.f47411v3.setText(org.telegram.messenger.gd.N0(i7, null));
                m30 m30Var = this.L1;
                m30Var.setVisibility(0);
                org.telegram.ui.ActionBar.q0 q0Var = this.f47345g3;
                q0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l30Var, property, 0.0f);
                org.telegram.ui.ActionBar.n5 n5Var = this.P1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(n5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(n5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(n5Var, property, 0.0f);
                org.telegram.ui.ActionBar.n5 n5Var2 = this.R1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(n5Var2, property2, 0.0f), ObjectAnimator.ofFloat(n5Var2, property3, 0.0f), ObjectAnimator.ofFloat(n5Var2, property, 0.0f), ObjectAnimator.ofFloat(q0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.kr.f36859g);
                animatorSet.addListener(new z20(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void q1(final long j3, final boolean z10) {
        if (this.V2 != null) {
            org.telegram.messenger.c cVar = this.f47376o1;
            final TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.f23343a).c2(Long.valueOf(j3));
            if (c22 != null) {
                final org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.t3 t3Var = this.V2;
                invitetogroupcall.call = t3Var.g(t3Var.f27033a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = c22.f28641id;
                tL_inputUser.access_hash = c22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f23343a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        e40 e40Var = e40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.mp.u1(e40Var.f47376o1.f23343a).V3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.g3(new di.j2(e40Var, j10, t1VarArr2, c22, 19));
                            return;
                        }
                        org.telegram.messenger.g0.g3(new di.m(e40Var, t1VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.e21(this, t1VarArr, sendRequest, 3), 500L);
                }
            }
        }
    }

    public final boolean r1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f47400t2 - L;
        if (this.f30260t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f30260t0) / ((L - this.f30260t0) - org.telegram.messenger.g0.L(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
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
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fh, false));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f47341f3;
            if (q0Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Yg;
                q0Var.P(org.telegram.ui.ActionBar.n6.x0(null, i7, false), false);
                q0Var.P(org.telegram.ui.ActionBar.n6.x0(null, i7, false), true);
                q0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Vg, false));
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yg, false);
            L1(this.f47416w3, x02);
            L1(this.f47421x3, x02);
            L1(this.f47360k3, x02);
            L1(this.f47364l3, x02);
            L1(this.f47369m3, x02);
            L1(this.f47411v3, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29625mh, false));
            L1(this.f47353i3, x02);
            L1(this.j3, x02);
            L1(this.f47387q3, x02);
            L1(this.f47392r3, x02);
            L1(this.f47397s3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean s1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        wi.n nVar;
        super.show();
        org.telegram.ui.Components.voip.k1 k1Var = org.telegram.ui.Components.voip.k1.f40989w;
        if (k1Var != null && (nVar = k1Var.f40990a) != null && nVar.e()) {
            org.telegram.ui.Components.voip.k1 k1Var2 = org.telegram.ui.Components.voip.k1.f40989w;
            if (k1Var2.f40990a != null) {
                org.telegram.ui.Components.voip.u0 u0Var = k1Var2.f40993e;
                k1Var2.f40993e = null;
                k1Var2.f40991b.f40913a = null;
                k1Var2.f40990a.a(new org.telegram.ui.Components.ph(12, k1Var2, u0Var));
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.ne(19));
            }
        }
        Q1();
    }

    public final boolean u1() {
        if (!v1() || this.V2.f27037f.isEmpty() || (((org.telegram.messenger.u3) this.V2.f27037f.get(0)).f27217c != 0.0f && ((org.telegram.messenger.u3) this.V2.f27037f.get(0)).f27217c < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean v1() {
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && t3Var.f27034b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void w1(org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f47391r2) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d2.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
            if (g2Var instanceof bn) {
                boolean sa2 = ((bn) g2Var).sa();
                this.f47391r2 = true;
                this.f47396s2 = true;
                xn xnVar = new xn(w2Var, editTextBoldCursor, z10, t1Var, 7);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(xnVar, j3);
                return;
            }
            this.f47391r2 = true;
            this.f47396s2 = true;
            if (w2Var != null) {
                w2Var.A0(true);
            } else if (t1Var != null) {
                t1Var.l(true);
            }
            if (z10) {
                org.telegram.messenger.g0.h3(new qg(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void y1() {
        H5 = true;
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(false);
        }
        k30 k30Var = this.G1;
        org.telegram.ui.Components.n71 n71Var = k30Var.f34146w;
        if (n71Var != null) {
            n71Var.c(false);
        }
        k30Var.G = true;
        this.C1.r();
    }

    public final void z1() {
        H5 = false;
        this.K1.f();
        w10 w10Var = this.f47365l4;
        if (w10Var.getVisibility() == 0) {
            this.o4.G(w10Var, false);
        }
        if (F5) {
            this.f47374n4.I(this.f47370m4, false);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
        }
        k30 k30Var = this.G1;
        org.telegram.ui.Components.n71 n71Var = k30Var.f34146w;
        if (n71Var != null) {
            n71Var.c(true);
        }
        k30Var.G = false;
        this.C1.s();
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
