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
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
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
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class c40 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls, VoIPService.StateListener, te.b {
    public static c40 f44542u5;
    public static boolean f44543v5;
    public static boolean f44544w5;
    public static boolean f44545x5;
    public static volatile org.telegram.messenger.q5 f44546y5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public static boolean f44547z5;
    public final ImageView A1;
    public final org.telegram.ui.Components.zg0 A2;
    public final Paint A3;
    public final View A4;
    public org.telegram.ui.Components.ii0 B1;
    public final org.telegram.ui.Components.zg0 B2;
    public final b40[] B3;
    public final View B4;
    public final i30 C1;
    public boolean C2;
    public float C3;
    public GradientDrawable C4;
    public final org.telegram.ui.Components.j6 D1;
    public final org.telegram.ui.Components.r9 D2;
    public b40 D3;
    public final int[] D4;
    public final s10 E1;
    public final org.telegram.ui.Components.r9 E2;
    public b40 E3;
    public final w10 E4;
    public final z20 F1;
    public float F2;
    public long F3;
    public boolean F4;
    public final w30 G1;
    public float G2;
    public float G3;
    public boolean G4;
    public final k30 H1;
    public float H2;
    public float H3;
    public RenderNode H4;
    public final q20 I1;
    public RadialGradient I2;
    public boolean I3;
    public float I4;
    public final TextView J1;
    public final Matrix J2;
    public boolean J3;
    public boolean J4;
    public final o20 K1;
    public final Paint K2;
    public int K3;
    public final String[] K4;
    public final org.telegram.ui.ActionBar.k5 L1;
    public final r30 L2;
    public float L3;
    public ObjectAnimator L4;
    public final j30 M1;
    public float M2;
    public int M3;
    public ObjectAnimator M4;
    public final org.telegram.ui.ActionBar.k5 N1;
    public float N2;
    public boolean N3;
    public final v20 N4;
    public final q30 O1;
    public ValueAnimator O2;
    public final int[] O3;
    public org.telegram.ui.Cells.f4 O4;
    public final org.telegram.ui.Components.ly P1;
    public TLRPC.InputPeer P2;
    public final ArrayList P3;
    public org.telegram.ui.Components.voip.r P4;
    public final ImageReceiver Q1;
    public TLRPC.Chat Q2;
    public final ArrayList Q3;
    public org.telegram.ui.Components.voip.y Q4;
    public int R1;
    public org.telegram.messenger.r3 R2;
    public final z10 R3;
    public org.telegram.ui.Components.h10 R4;
    public final ImageView S1;
    public final boolean S2;
    public final e20 S3;
    public boolean S4;
    public final nh.h T1;
    public final String T2;
    public final r20 T3;
    public boolean T4;
    public final int U1;
    public final x30 U2;
    public float U3;
    public int U4;
    public final RadialProgressView V1;
    public final r10 V2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout V3;
    public AnimatorSet V4;
    public final Drawable W1;
    public final t10 W2;
    public boolean W3;
    public e30 W4;
    public final View X1;
    public final Paint X2;
    public boolean X3;
    public int X4;
    public AnimatorSet Y1;
    public ValueAnimator Y2;
    public org.telegram.ui.Components.j30 Y3;
    public int Y4;
    public LaunchActivity Z1;
    public float Z2;
    public l30 Z3;
    public int Z4;
    public final UndoView[] f44548a2;
    public final LinearLayout f44549a3;
    public Boolean f44550a4;
    public int f44551a5;
    public final org.telegram.ui.Cells.k f44552b2;
    public final org.telegram.ui.ActionBar.r0 f44553b3;
    public int f44554b4;
    public int f44555b5;
    public boolean f44556c2;
    public final org.telegram.ui.ActionBar.r0 f44557c3;
    public boolean f44558c4;
    public int f44559c5;
    public org.telegram.ui.Components.y20 d2;
    public final org.telegram.ui.ActionBar.r0 f44560d3;
    public final v10 f44561d4;
    public int f44562d5;
    public org.telegram.ui.Components.y20 f44563e2;
    public final org.telegram.ui.ActionBar.z0 f44564e3;
    public final org.telegram.ui.Components.pj0 f44565e4;
    public int f44566e5;
    public int f44567f2;
    public final org.telegram.ui.ActionBar.z0 f44568f3;
    public final f40 f44569f4;
    public int f44570f5;
    public g.b f44571g2;
    public final org.telegram.ui.ActionBar.z0 f44572g3;
    public final org.telegram.ui.Components.i10 f44573g4;
    public int f44574g5;
    public final ArrayList f44575h2;
    public final org.telegram.ui.ActionBar.z0 f44576h3;
    public ViewTreeObserver.OnPreDrawListener f44577h4;
    public int f44578h5;
    public final b20 f44579i1;
    public y20 f44580i2;
    public final org.telegram.ui.ActionBar.z0 f44581i3;
    public final org.telegram.ui.Components.voip.n f44582i4;
    public int f44583i5;
    public final f10 f44584j1;
    public boolean f44585j2;
    public final org.telegram.ui.ActionBar.z0 j3;
    public boolean f44586j4;
    public int f44587j5;
    public final org.telegram.messenger.c f44588k1;
    public long f44589k2;
    public final org.telegram.ui.ActionBar.z0 f44590k3;
    public final ArrayList f44591k4;
    public int f44592k5;
    public final l10 l1;
    public boolean f44593l2;
    public final org.telegram.ui.ActionBar.z0 f44594l3;
    public boolean f44595l4;
    public int f44596l5;
    public final org.telegram.ui.Components.voip.n2 f44597m1;
    public final RectF f44598m2;
    public final org.telegram.ui.ActionBar.z0 f44599m3;
    public final s00 f44600m4;
    public int f44601m5;
    public final org.telegram.ui.Components.voip.n2 n1;
    public boolean f44602n2;
    public final org.telegram.ui.ActionBar.z0 f44603n3;
    public final p10 f44604n4;
    public final f30 f44605n5;
    public final org.telegram.ui.Components.voip.n2 f44606o1;
    public boolean f44607o2;
    public final org.telegram.ui.ActionBar.z0 f44608o3;
    public final org.telegram.ui.Components.vs o4;
    public Boolean f44609o5;
    public final org.telegram.ui.Components.voip.n2 f44610p1;
    public float f44611p2;
    public final org.telegram.ui.ActionBar.z0 f44612p3;
    public final s00 f44613p4;
    public Integer f44614p5;
    public final org.telegram.ui.Components.voip.n2 f44615q1;
    public t20 f44616q2;
    public final LinearLayout f44617q3;
    public boolean f44618q4;
    public final te.a f44619q5;
    public final org.telegram.ui.Components.voip.n2 f44620r1;
    public TLRPC.Peer f44621r2;
    public final TextView f44622r3;
    public final m4 f44623r4;
    public final te.a f44624r5;
    public final org.telegram.ui.Components.voip.n2 f44625s1;
    public TLObject f44626s2;
    public final a40 f44627s3;
    public final LongSparseIntArray f44628s4;
    public final te.c s5;
    public final m10 f44629t1;
    public final Paint f44630t2;
    public final rh.h f44631t3;
    public final c20 f44632t4;
    public final te.a f44633t5;
    public final ImageView f44634u1;
    public final ArrayList f44635u2;
    public s00 f44636u3;
    public final a20 f44637u4;
    public final Paint f44638v1;
    public final ArrayList f44639v2;
    public org.telegram.ui.Components.h20 f44640v3;
    public LinearLayout f44641v4;
    public final k20 f44642w1;
    public final ArrayList f44643w2;
    public int f44644w3;
    public boolean f44645w4;
    public final j20 f44646x1;
    public final ArrayList f44647x2;
    public boolean f44648x3;
    public final org.telegram.ui.Components.zg0 f44649x4;
    public final h20 f44650y1;
    public final ArrayList f44651y2;
    public boolean f44652y3;
    public int f44653y4;
    public final ImageView f44654z1;
    public int f44655z2;
    public final Paint f44656z3;
    public boolean f44657z4;

    public c40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, true, true);
        int i7;
        final c40 c40Var;
        final ?? r10;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f44638v1 = new Paint(1);
        this.f44548a2 = new UndoView[2];
        this.f44575h2 = new ArrayList();
        this.f44598m2 = new RectF();
        this.f44630t2 = new Paint(1);
        this.f44635u2 = new ArrayList();
        this.f44639v2 = new ArrayList();
        this.f44643w2 = new ArrayList();
        this.f44647x2 = new ArrayList();
        this.f44651y2 = new ArrayList();
        this.f44631t3 = new rh.h(new s00(this, 4));
        this.f44644w3 = 0;
        this.f44648x3 = false;
        this.f44656z3 = new Paint(7);
        this.A3 = new Paint(7);
        this.B3 = new b40[8];
        this.C3 = 1.0f;
        this.N3 = true;
        this.O3 = new int[4];
        this.P3 = new ArrayList();
        this.Q3 = new ArrayList();
        this.f44582i4 = new org.telegram.ui.Components.voip.n();
        this.f44591k4 = new ArrayList();
        this.f44600m4 = new s00(this, 0);
        this.f44604n4 = new p10(this);
        this.o4 = new org.telegram.ui.Components.vs(18);
        this.f44613p4 = new s00(this, 1);
        this.f44618q4 = false;
        this.f44623r4 = new m4(this, 7);
        this.f44628s4 = new LongSparseIntArray();
        this.D4 = new int[2];
        this.G4 = true;
        this.K4 = new String[2];
        this.U4 = -1;
        this.f44605n5 = new f30(this);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40366f;
        this.f44619q5 = new te.a(2, this, xqVar, 350L);
        this.f44624r5 = new te.a(3, this, xqVar, 220L, true);
        this.s5 = new te.c(4, this, xqVar, 350L);
        this.f44633t5 = new te.a(5, this, xqVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.f44588k1 = cVar;
        this.R2 = r3Var;
        this.P2 = inputPeer;
        this.Q2 = chat;
        this.T2 = str;
        this.f28616a = cVar.f21765a;
        this.S2 = z9;
        this.I0 = new di.i0();
        this.P0 = true;
        this.Q0 = true;
        this.U1 = org.telegram.messenger.qp.s1(this.f28616a).f24942x7.f24463x.U();
        this.U = true;
        f44545x5 = false;
        f44544w5 = false;
        f44547z5 = false;
        this.f28657y0 = new l20(this);
        this.f28647s = true;
        this.f28640n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f28652w = true;
        this.F0 = -1;
        this.N4 = new v20(this);
        setOnDismissListener(new w00(this, 0));
        z0();
        w30 w30Var = new w30(this, launchActivity);
        this.G1 = w30Var;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(true);
        int i10 = org.telegram.ui.ActionBar.k6.f27881eh;
        apVar.b(org.telegram.ui.ActionBar.k6.v0(i10));
        apVar.d();
        z20 z20Var = new z20(this, launchActivity, apVar);
        this.F1 = z20Var;
        z20Var.setSubtitle("");
        z20Var.getSubtitleTextView().setVisibility(0);
        z20Var.o();
        z20Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.W3(1.0f, z20Var.getAdditionalSubtitleTextView(), this.f44595l4, false);
        z20Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(i10));
        int i11 = org.telegram.ui.ActionBar.k6.Zg;
        org.telegram.ui.ActionBar.r6.m(z20Var, 6, i11, null);
        z20Var.setBackButtonImage(2131231240);
        z20Var.setOccupyStatusBar(false);
        z20Var.setAllowOverlayTitle(false);
        int i12 = org.telegram.ui.ActionBar.k6.Vg;
        org.telegram.ui.ActionBar.r6.m(z20Var, 1, i12, null);
        org.telegram.ui.ActionBar.r6.m(z20Var, 3, org.telegram.ui.ActionBar.k6.f28264z8, null);
        org.telegram.ui.ActionBar.r6.e(z20Var, i12);
        org.telegram.ui.ActionBar.r6.m(z20Var, 6, i11, null);
        z20Var.setActionBarMenuOnItemClick(new h30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f44621r2 = tL_peerUser;
            i7 = i12;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i7 = i12;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.f44621r2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.f44621r2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.f44621r2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new r00(this, 2);
        cVar.b().c(this, org.telegram.messenger.qs.f25099w2);
        cVar.b().c(this, org.telegram.messenger.qs.M0);
        cVar.b().c(this, org.telegram.messenger.qs.T);
        cVar.b().c(this, org.telegram.messenger.qs.f25085u1);
        cVar.b().c(this, org.telegram.messenger.qs.B2);
        cVar.b().c(this, org.telegram.messenger.qs.E0);
        cVar.b().c(this, org.telegram.messenger.qs.f25020j0);
        cVar.b().c(this, org.telegram.messenger.qs.f25063r);
        cVar.b().c(this, org.telegram.messenger.qs.f25120z2);
        cVar.b().c(this, org.telegram.messenger.qs.f25113y2);
        cVar.b().c(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D2);
        this.W1 = launchActivity.getResources().getDrawable(2131232728).mutate();
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624344, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.A2 = zg0Var;
        this.B2 = new org.telegram.ui.Components.zg0(2131624044, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        i30 i30Var = new i30(this, launchActivity);
        this.C1 = i30Var;
        this.f28619b = i30Var;
        i30Var.setClipToPadding(false);
        this.f28619b.setFocusable(true);
        this.f28619b.setFocusableInTouchMode(true);
        this.f28619b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28619b;
        int i13 = this.f28649t0;
        viewGroup.setPadding(i13, 0, i13, 0);
        this.f28619b.setKeepScreenOn(true);
        this.f28619b.setClipChildren(false);
        this.Q1 = new ImageReceiver(this.f28619b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.L1 = k5Var;
            k5Var.setGravity(17);
            k5Var.setTextColor(-1);
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setTextSize(18);
            k5Var.k(org.telegram.messenger.id.L0(2131743438));
            this.f28619b.addView(k5Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            j30 j30Var = new j30(this, launchActivity);
            this.M1 = j30Var;
            j30Var.setGravity(17);
            j30Var.setTextColor(-1);
            j30Var.setTypeface(org.telegram.messenger.g0.o());
            j30Var.setTextSize(60);
            this.f28619b.addView(j30Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.N1 = k5Var2;
            k5Var2.setGravity(17);
            k5Var2.setTextColor(-1);
            k5Var2.setTypeface(org.telegram.messenger.g0.o());
            k5Var2.setTextSize(18);
            this.f28619b.addView(k5Var2, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (u1()) {
            r30 r30Var = new r30(this, launchActivity);
            this.L2 = r30Var;
            this.f28619b.addView(r30Var, c8.ha.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        k30 k30Var = new k30(this, launchActivity);
        this.H1 = k30Var;
        k30Var.setClipToPadding(false);
        k30Var.setClipChildren(false);
        q30 q30Var = new q30(this);
        this.O1 = q30Var;
        q30Var.f57100o = xqVar;
        q30Var.d = 350L;
        q30Var.f57116c = 350L;
        q30Var.f57117e = 350L;
        q30Var.S();
        k30Var.setItemAnimator(q30Var);
        k30Var.setOnScrollListener(new e10(this));
        k30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.ly lyVar = new org.telegram.ui.Components.ly(f44544w5 ? 6 : 2, k30Var);
        this.P1 = lyVar;
        k30Var.setLayoutManager(lyVar);
        f10 f10Var = new f10(this);
        this.f44584j1 = f10Var;
        lyVar.z1(f10Var);
        k30Var.i(new g10(this));
        lyVar.C1();
        this.f28619b.addView(k30Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        k30Var.setAdapter(w30Var);
        k30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.r6.J(org.telegram.ui.ActionBar.k6.Sg, k30Var);
        k30Var.setOnItemClickListener(new a7(this, launchActivity, r3Var, 14));
        k30Var.setOnItemLongClickListener(new r00(this, 3));
        if (u1()) {
            a40 a40Var = new a40(this, getContext());
            this.f44627s3 = a40Var;
            this.f28619b.addView(a40Var, c8.ha.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(launchActivity);
        this.f44565e4 = pj0Var;
        this.f28619b.addView(pj0Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        f40 f40Var = new f40(r3Var, this.f28616a, this);
        this.f44569f4 = f40Var;
        pj0Var.setAdapter(f40Var);
        v4.s sVar = new v4.s(6, false);
        pj0Var.setLayoutManager(sVar);
        sVar.z1(new i10(this));
        pj0Var.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) {
            public final c40 f48999b;

            {
                this.f48999b = this;
            }

            @Override
            public final void c(int i14, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
                        org.telegram.messenger.s3 videoParticipant = h10Var.getVideoParticipant();
                        c40 c40Var2 = this.f48999b;
                        if (videoParticipant == null) {
                            c40Var2.h1(new org.telegram.messenger.s3(h10Var.getParticipant(), false));
                            return;
                        } else {
                            c40Var2.h1(h10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f48999b;
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
        kVar.f57100o = xqVar;
        kVar.d = 350L;
        kVar.f57116c = 350L;
        kVar.f57117e = 350L;
        pj0Var.setItemAnimator(new j10(this));
        pj0Var.setOnScrollListener(new k10(this));
        f40Var.H(pj0Var, false, false);
        pj0Var.setVisibility(8);
        l10 l10Var = new l10(this, launchActivity);
        this.l1 = l10Var;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f28235xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.J2 = new Matrix();
        this.I2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.K2 = paint;
        paint.setShader(this.I2);
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(9);
        this.D2 = r9Var;
        org.telegram.ui.Components.r9 r9Var2 = new org.telegram.ui.Components.r9(12);
        this.E2 = r9Var2;
        r9Var.f37573a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        r9Var.f37574b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        r9Var.b();
        r9Var2.f37573a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        r9Var2.f37574b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        r9Var2.b();
        int i14 = org.telegram.ui.ActionBar.k6.f28216wh;
        r9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i14), 38));
        r9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i14), 76));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f44610p1 = n2Var;
        n2Var.setCheckable(true);
        n2Var.setTextSize(12);
        l10Var.a(n2Var);
        n2Var.setOnClickListener(new p00(this, 6));
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f44606o1 = n2Var2;
        n2Var2.setCheckable(true);
        n2Var2.setTextSize(12);
        n2Var2.d(false, false);
        n2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        n2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743492), false, false);
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f44597m1 = n2Var3;
        n2Var3.setCheckable(true);
        n2Var3.setTextSize(12);
        n2Var3.d(false, false);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(launchActivity);
        n2Var3.addView(ch0Var, c8.ha.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.zg0 zg0Var2 = new org.telegram.ui.Components.zg0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.f44649x4 = zg0Var2;
        ch0Var.setAnimation(zg0Var2);
        n2Var3.setOnClickListener(new p00(this, 9));
        l10Var.a(n2Var3);
        org.telegram.ui.Components.voip.n2 n2Var4 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.n1 = n2Var4;
        n2Var4.setCheckable(true);
        n2Var4.setTextSize(12);
        n2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.R1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        n2Var4.addView(imageView, c8.ha.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        n2Var4.setOnClickListener(new p00(this, 10));
        l10Var.a(n2Var4);
        l10Var.a(n2Var2);
        org.telegram.ui.Components.voip.n2 n2Var5 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f44615q1 = n2Var5;
        n2Var5.setTextSize(12);
        n2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f28122rh), 0.3f, false, org.telegram.messenger.id.L0(2131743367), false, false);
        n2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final c40 f50463b;

            {
                this.f50463b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        c40 c40Var2 = this.f50463b;
                        LaunchActivity launchActivity2 = c40Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            c40Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z10 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                c40Var2.f44548a2[0].d(1, false);
                                if (c40Var2.f44616q2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z10 = true;
                                    }
                                    t20 t20Var = new t20(c40Var2, launchActivity, z10);
                                    c40Var2.f44616q2 = t20Var;
                                    t20Var.setBottomPadding(c40Var2.f28619b.getPaddingBottom());
                                    c40Var2.f28622c.addView(c40Var2.f44616q2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            c40Var2.T1(true, false);
                            c40Var2.S1(false);
                            c40Var2.R2.z();
                            c40Var2.Q0(true);
                            c40Var2.l1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f50463b;
                        c40Var3.R3.e();
                        org.telegram.messenger.r3 r3Var2 = c40Var3.R2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            c40Var3.O1();
                            c40.w1(launchActivity, new s00(c40Var3, 5), false, false);
                            return;
                        }
                        c40Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var6 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f44620r1 = n2Var6;
        n2Var6.setCheckable(true);
        n2Var6.b(true, false);
        n2Var6.setTextSize(12);
        n2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743297), false, false);
        m10 m10Var = new m10(this, launchActivity);
        this.f44629t1 = m10Var;
        m10Var.setAnimation(zg0Var);
        m10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.n2 n2Var7 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f44625s1 = n2Var7;
        n2Var7.setDrawBackground(false);
        n2Var7.setTextSize(12);
        n2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        n2Var7.addView(m10Var, c8.ha.e(50, 50, 49));
        l10Var.a(n2Var7);
        n2Var7.setOnClickListener(new o10(this));
        l10Var.a(n2Var6);
        l10Var.a(n2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f44634u1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232799);
        n2Var7.addView(imageView2, c8.ha.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.R2 != null && u1() && !this.R2.j()) {
            imageView2.setVisibility(0);
            m10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.V1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ch));
        z20Var.setAlpha(0.0f);
        z20Var.getBackButton().setScaleX(0.9f);
        z20Var.getBackButton().setScaleY(0.9f);
        z20Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        z20Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        z20Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        z20Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.k6.v0(i7));
        this.f44553b3 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setIcon(2131231244);
        r0Var.setContentDescription(org.telegram.messenger.id.L0(2131754839));
        r0Var.setSubMenuOpenSide(2);
        r0Var.setDelegate(new r00(this, 5));
        int i15 = org.telegram.ui.ActionBar.k6.Wg;
        org.telegram.ui.ActionBar.r6.S(r0Var, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i15), 6), null, org.telegram.ui.ActionBar.r6.N(i15));
        r0Var.setOnClickListener(new p00(this, 11));
        r0Var.O(org.telegram.ui.ActionBar.k6.v0(i7), false);
        r0Var.O(org.telegram.ui.ActionBar.k6.v0(i7), true);
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.k6.v0(i7));
        this.f44557c3 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(2131232429);
        r0Var2.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.r6.S(r0Var2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i15), 6), null, org.telegram.ui.ActionBar.r6.N(i15));
        r0Var2.setOnClickListener(new p00(this, 0));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.k6.v0(i7));
        this.f44560d3 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        r0Var3.setIcon(2131232352);
        r0Var3.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.r6.S(r0Var3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i15), 6), null, org.telegram.ui.ActionBar.r6.N(i15));
        r0Var3.setOnClickListener(new p00(this, 1));
        r10 r10Var = new r10(this, launchActivity, launchActivity);
        this.V2 = r10Var;
        s10 s10Var = new s10(launchActivity);
        this.E1 = s10Var;
        s10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.X2 = paint2;
        paint2.setColor(-12761513);
        t10 t10Var = new t10(this, getContext());
        this.W2 = t10Var;
        org.telegram.ui.ActionBar.r6.V(t10Var, i7, this.I0);
        t10Var.setTextSize(1, 11.0f);
        t10Var.setText(org.telegram.messenger.id.L0(2131743477));
        t10Var.setMaxLines(1);
        t10Var.setGravity(17);
        t10Var.setTypeface(org.telegram.messenger.g0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        t10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        t10Var.setTag(-1);
        if (!u1()) {
            t10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f44549a3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(r10Var, c8.ha.l(1.0f, 0, -2));
        linearLayout.addView(t10Var, c8.ha.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f28619b.addView(s10Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28619b.addView(linearLayout, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f28619b.addView(z20Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f44617q3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r0Var3, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var2, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var, c8.ha.o(48, 48));
        this.f28619b.addView(linearLayout2, c8.ha.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.X1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.f28619b.addView(view, c8.ha.c(1.0f, -1));
        for (int i16 = 0; i16 < 2; i16++) {
            this.f44548a2[i16] = new u10(this, launchActivity);
            this.f44548a2[i16].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.f44548a2[i16].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f28619b.addView(this.f44548a2[i16], c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f44552b2 = kVar2;
        kVar2.setTag(2131296437, 240);
        this.f44553b3.g(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f44553b3.setShowSubmenuByMove(false);
        int i17 = org.telegram.ui.ActionBar.k6.Sg;
        org.telegram.ui.ActionBar.r6.S(kVar2, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.v0(i17), 6, 6), null, org.telegram.ui.ActionBar.r6.N(i17));
        org.telegram.ui.ActionBar.r0 r0Var4 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d = r0Var4.d(1, 0, null, org.telegram.messenger.id.L0(2131743404), true, true, r0Var4.m0);
        this.f44594l3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.r0 r0Var5 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d2 = r0Var5.d(2, 0, null, org.telegram.messenger.id.L0(2131743357), true, true, r0Var5.m0);
        this.f44599m3 = d2;
        d2.m(false, true);
        int i18 = org.telegram.ui.ActionBar.k6.f27991kh;
        d.setCheckColor(i18);
        d.d(org.telegram.ui.ActionBar.k6.v0(i18), org.telegram.ui.ActionBar.k6.v0(i18));
        d2.setCheckColor(i18);
        d2.d(org.telegram.ui.ActionBar.k6.v0(i18), org.telegram.ui.ActionBar.k6.v0(i18));
        Paint paint3 = new Paint(1);
        int i19 = org.telegram.ui.ActionBar.k6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i19));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d10 = r0Var6.d(10, 2131232430, null, org.telegram.messenger.id.L0(2131743402), true, false, r0Var6.m0);
        this.f44572g3 = d10;
        d10.setItemHeight(56);
        org.telegram.ui.ActionBar.r0 r0Var7 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d11 = r0Var7.d(11, 2131232261, null, org.telegram.messenger.id.L0(2131743285), true, false, r0Var7.m0);
        this.f44576h3 = d11;
        d11.setItemHeight(56);
        TextView b10 = this.f44553b3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ug), -16777216));
        this.f44622r3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.r0 r0Var8 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d12 = r0Var8.d(6, 2131232116, this.U2, org.telegram.messenger.id.L0(org.telegram.messenger.t3.W(this.Q2) ? 2131743488 : 2131743387), true, false, r0Var8.m0);
        this.f44568f3 = d12;
        org.telegram.ui.ActionBar.r0 r0Var9 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d13 = r0Var9.d(7, 2131232276, this.U2, org.telegram.messenger.id.L0(2131743388), false, false, r0Var9.m0);
        this.f44581i3 = d13;
        org.telegram.ui.ActionBar.z0 e10 = this.f44553b3.e(3, 2131232203, org.telegram.messenger.id.L0(2131743340));
        this.f44564e3 = e10;
        x30 x30Var = new x30();
        this.U2 = x30Var;
        org.telegram.ui.ActionBar.z0 e11 = this.f44553b3.e(9, 2131232352, org.telegram.messenger.id.L0(2131743439));
        this.f44590k3 = e11;
        org.telegram.ui.ActionBar.r0 r0Var10 = this.f44553b3;
        org.telegram.ui.ActionBar.z0 d14 = r0Var10.d(5, 0, x30Var, org.telegram.messenger.id.L0(2131743351), true, false, r0Var10.m0);
        this.j3 = d14;
        x30Var.a(d14.getImageView());
        org.telegram.ui.ActionBar.z0 e12 = this.f44553b3.e(12, 2131231895, org.telegram.messenger.id.L0(2131743487));
        this.f44608o3 = e12;
        org.telegram.ui.ActionBar.z0 e13 = this.f44553b3.e(13, 2131230781, org.telegram.messenger.id.L0(2131743489));
        this.f44612p3 = e13;
        org.telegram.ui.ActionBar.z0 e14 = this.f44553b3.e(4, 2131232087, org.telegram.messenger.id.L0(r1() ? 2131743382 : org.telegram.messenger.t3.W(this.Q2) ? 2131743484 : 2131743383));
        this.f44603n3 = e14;
        this.f44553b3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.v0(i17));
        this.f44553b3.getPopupLayout().setFitItems(true);
        e12.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        e13.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d10.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d11.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        int i20 = org.telegram.ui.ActionBar.k6.f27972jh;
        e14.d(org.telegram.ui.ActionBar.k6.v0(i20), org.telegram.ui.ActionBar.k6.v0(i20));
        e10.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d12.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d13.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d14.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        e11.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        if (this.R2 != null) {
            o1();
        }
        if (r1()) {
            this.f44571g2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f44571g2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        V1(false);
        this.F1.getTitleTextView().setOnClickListener(new p00(this, 2));
        v10 v10Var = new v10(this, launchActivity);
        this.f44561d4 = v10Var;
        w10 w10Var = new w10(this);
        this.E4 = w10Var;
        v10Var.setClipToPadding(false);
        w10Var.S();
        w10Var.f57100o = org.telegram.ui.Components.xq.f40366f;
        w10Var.d = 350L;
        w10Var.f57116c = 350L;
        w10Var.f57117e = 350L;
        v10Var.setItemAnimator(w10Var);
        v10Var.setOnScrollListener(new x10(this));
        v10Var.setClipChildren(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        v10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.i10 i10Var = new org.telegram.ui.Components.i10(r3Var, this.f28616a, this);
        this.f44573g4 = i10Var;
        v10Var.setAdapter(i10Var);
        i10Var.F(v10Var, false);
        v10Var.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) {
            public final c40 f48999b;

            {
                this.f48999b = this;
            }

            @Override
            public final void c(int i142, View view2) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view2;
                        org.telegram.messenger.s3 videoParticipant = h10Var.getVideoParticipant();
                        c40 c40Var2 = this.f48999b;
                        if (videoParticipant == null) {
                            c40Var2.h1(new org.telegram.messenger.s3(h10Var.getParticipant(), false));
                            return;
                        } else {
                            c40Var2.h1(h10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f48999b;
                        c40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view2;
                        if (rVar.getParticipant() != null) {
                            c40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        v10Var.setOnItemLongClickListener(new r00(this, 0));
        v10Var.setVisibility(8);
        v10Var.i(new y10());
        z10 z10Var = new z10(this, launchActivity, this.H1, v10Var, this.P3, this.R2, this);
        this.R3 = z10Var;
        z10Var.setClipChildren(false);
        i10Var.E(this.P3, z10Var);
        if (this.f44565e4 != null) {
            this.f44569f4.G(this.P3, z10Var);
        }
        a20 a20Var = new a20(this, launchActivity);
        this.f44637u4 = a20Var;
        b20 b20Var = new b20(this, launchActivity, this.F1, this.H1, a20Var);
        this.f44579i1 = b20Var;
        b20Var.setImagesLayerNum(Integer.MAX_VALUE);
        b20Var.setInvalidateWithParent(true);
        a20Var.setProfileGalleryView(b20Var);
        c20 c20Var = new c20(this, launchActivity);
        this.f44632t4 = c20Var;
        c20Var.setVisibility(8);
        b20Var.setVisibility(0);
        b20Var.b(new d20(this));
        e20 e20Var = new e20(this, launchActivity);
        this.S3 = e20Var;
        this.f28619b.addView(z10Var);
        z10Var.addView(v10Var, c8.ha.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.l1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.A4 = view2;
        int[] iArr = this.D4;
        iArr[0] = this.M3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.D4);
        this.C4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.f28619b.addView(view2, c8.ha.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.B4 = view3;
        view3.setBackgroundColor(this.D4[0]);
        this.f28619b.addView(view3, c8.ha.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.T1 = hVar;
        hVar.setDelegate(new f20(this));
        hVar.setClickCellDelegate(new g20(this));
        org.telegram.messenger.r3 r3Var2 = this.R2;
        if (r3Var2 != null) {
            hVar.D0(this.f44588k1.f21765a, r3Var2.g(false));
        }
        this.f28619b.addView(hVar, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(launchActivity, false, true, true);
        this.D1 = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.xq.h);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f28619b.addView(this.l1);
        h20 h20Var = new h20(this, launchActivity, this.C1, LaunchActivity.Q(), this.I0);
        this.f44650y1 = h20Var;
        h20Var.J = true;
        h20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.U1)});
        h20Var.getEditText().setLinkTextColor(-11683585);
        h20Var.setHint(org.telegram.messenger.id.L0(2131743931));
        h20Var.getEditText().addTextChangedListener(new i20(this));
        h20Var.s();
        j20 j20Var = new j20(this, launchActivity);
        this.f44646x1 = j20Var;
        this.f28619b.addView(j20Var, c8.ha.c(-1.0f, -1));
        k20 k20Var = new k20(launchActivity);
        this.f44642w1 = k20Var;
        k20Var.addView(h20Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        k20Var.addView(j6Var, c8.ha.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        j6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f28619b.addView(k20Var, c8.ha.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.A1 = imageView3;
        int i21 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i21), this.I0);
        int i22 = org.telegram.ui.ActionBar.k6.f27891f7;
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i22, f6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new p00(this, 3));
        ImageView imageView4 = new ImageView(launchActivity);
        this.f44654z1 = imageView4;
        org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i21), this.I0);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.f28187v6, this.I0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231460);
        imageView4.setOnClickListener(new p00(this, 4));
        k20Var.addView(imageView3, c8.ha.e(48, 48, 85));
        k20Var.addView(imageView4, c8.ha.e(48, 48, 85));
        this.f28619b.addView(e20Var);
        c20Var.addView(b20Var, c8.ha.c(-1.0f, -1));
        c20Var.addView(a20Var, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28619b.addView(c20Var, c8.ha.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.G1.f();
        if (f44545x5) {
            this.f44569f4.I(this.f44565e4, false);
        }
        this.f44655z2 = this.G1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.J1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.Q2) && (chat2 = this.Q2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f28619b.addView(textView, c8.ha.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(launchActivity);
            hb0Var.setTextColor(-1);
            hb0Var.setSelectorColor(-9598483);
            hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            hb0Var.setItemCount(5);
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
            this.K1 = o20Var;
            o20Var.setLines(1);
            o20Var.setSingleLine(true);
            o20Var.setEllipsize(TextUtils.TruncateAt.END);
            o20Var.setGravity(17);
            o20Var.setTextColor(-1);
            o20Var.setTypeface(org.telegram.messenger.g0.o());
            o20Var.setTextSize(1, 14.0f);
            this.f28619b.addView(o20Var, c8.ha.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r10 = 0;
            o20Var.setOnClickListener(new org.telegram.messenger.video.f(this, hb0Var, m20Var, n20Var, chat, cVar, inputPeer2, 1));
            q20 q20Var = new q20(launchActivity, hb0Var, m20Var, n20Var);
            this.I1 = q20Var;
            q20Var.setWeightSum(1.0f);
            q20Var.setOrientation(0);
            this.f28619b.addView(q20Var, c8.ha.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i23 = calendar.get(1);
            int i24 = calendar.get(6);
            q20Var.addView(hb0Var, c8.ha.l(0.5f, 0, 270));
            hb0Var.setMinValue(0);
            hb0Var.setMaxValue(365);
            hb0Var.setWrapSelectorWheel(false);
            hb0Var.setFormatter(new t00(currentTimeMillis, calendar, i23, 0));
            a1.d dVar = new a1.d(this, hb0Var, m20Var, n20Var, 14);
            c40Var = this;
            hb0Var.setOnValueChangedListener(dVar);
            m20Var.setMinValue(0);
            m20Var.setMaxValue(23);
            q20Var.addView(m20Var, c8.ha.l(0.2f, 0, 270));
            m20Var.setFormatter(new org.telegram.ui.Components.il0(19));
            m20Var.setOnValueChangedListener(dVar);
            n20Var.setMinValue(0);
            n20Var.setMaxValue(59);
            n20Var.setValue(0);
            n20Var.setFormatter(new org.telegram.ui.Components.il0(20));
            q20Var.addView(n20Var, c8.ha.l(0.3f, 0, 270));
            n20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i25 = calendar.get(6);
            int i26 = calendar.get(12);
            int i27 = calendar.get(11);
            hb0Var.setValue(i24 != i25 ? 1 : 0);
            n20Var.setValue(i26);
            m20Var.setValue(i27);
            org.telegram.ui.Components.v4.g(o20Var, textView, 0L, 604800L, 2, hb0Var, m20Var, n20Var);
        } else {
            c40Var = this;
            r10 = 0;
        }
        r20 r20Var = new r20(c40Var, (ViewGroup) c40Var.getWindow().getDecorView(), c40Var.f28619b);
        c40Var.T3 = r20Var;
        r20Var.E = new s20(c40Var);
        b20Var.setPinchToZoomHelper(r20Var);
        c40Var.f44606o1.setOnClickListener(new View.OnClickListener(c40Var) {
            public final c40 f50463b;

            {
                this.f50463b = c40Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r10) {
                    case 0:
                        c40 c40Var2 = this.f50463b;
                        LaunchActivity launchActivity2 = c40Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            c40Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z10 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                c40Var2.f44548a2[0].d(1, false);
                                if (c40Var2.f44616q2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z10 = true;
                                    }
                                    t20 t20Var = new t20(c40Var2, launchActivity, z10);
                                    c40Var2.f44616q2 = t20Var;
                                    t20Var.setBottomPadding(c40Var2.f28619b.getPaddingBottom());
                                    c40Var2.f28622c.addView(c40Var2.f44616q2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            c40Var2.T1(true, false);
                            c40Var2.S1(false);
                            c40Var2.R2.z();
                            c40Var2.Q0(true);
                            c40Var2.l1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f50463b;
                        c40Var3.R3.e();
                        org.telegram.messenger.r3 r3Var22 = c40Var3.R2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            c40Var3.O1();
                            c40.w1(launchActivity, new s00(c40Var3, 5), false, false);
                            return;
                        }
                        c40Var3.dismiss();
                        return;
                }
            }
        });
        c40Var.R1(r10);
        c40Var.O1();
        c40Var.S1(r10);
        c40Var.T1(r10, r10);
        c40Var.G1(0.0f);
        c40Var.U1();
        c40Var.f28619b.addView(new FrameLayout(launchActivity), c8.ha.e(-1, 200, 87));
        c40Var.f44620r1.setOnClickListener(new p00(c40Var, 5));
        c40Var.V0();
        c8.ka.a(c40Var.f44606o1);
        c8.ka.a(c40Var.f44610p1);
        c8.ka.a(c40Var.f44597m1);
        c8.ka.a(c40Var.n1);
        c8.ka.a(c40Var.f44625s1);
        c8.ka.a(c40Var.f44615q1);
        c8.ka.a(c40Var.f44620r1);
        r0.i0.l(c40Var.f28619b, new r00(c40Var, 1));
    }

    public static void B1(org.telegram.messenger.r3 r3Var, boolean z9, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z9 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f25225f;
            ArrayList arrayList2 = r3Var.f25224e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null) {
                r3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                r3Var.f25226g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.ij.C1(((org.telegram.messenger.s3) arrayList.get(i7)).f25409a.peer) == org.telegram.messenger.ij.C1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = r3Var.f25222b;
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
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25092v2, new Object[0]);
    }

    public static void I0(final c40 c40Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z9;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = c40Var.f44588k1;
        ArrayList arrayList = c40Var.f44643w2;
        w30 w30Var = c40Var.G1;
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
                        int i10 = i7 - w30Var.f50850n;
                        if (i10 >= 0 && i10 < c40Var.R2.f25231m.size()) {
                            l10 = (Long) c40Var.R2.f25231m.get(i7 - w30Var.f50850n);
                        } else {
                            int i11 = i7 - w30Var.f50852s;
                            if (i11 >= 0 && i11 < c40Var.R2.f25230l.size()) {
                                l10 = (Long) c40Var.R2.f25230l.get(i7 - w30Var.f50852s);
                            } else {
                                int i12 = i7 - w30Var.f50849f;
                                if (c40Var.f44585j2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z9 = false;
                                    }
                                    l10 = null;
                                    z9 = false;
                                } else {
                                    if (i12 >= 0 && i12 < c40Var.R2.f25228j.size()) {
                                        l10 = (Long) c40Var.R2.f25228j.get(i12);
                                        z9 = false;
                                    }
                                    l10 = null;
                                    z9 = false;
                                }
                                if (!z9 && (q3Var = (org.telegram.messenger.q3) c40Var.R2.f25229k.get(l10)) != null) {
                                    org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(c40Var.f28622c, c40Var.I0, y3Var);
                                    F.l(2131232129, org.telegram.messenger.id.M0(2131749461, null), new Runnable(c40Var) {
                                        public final c40 f52399b;

                                        {
                                            this.f52399b = c40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                                    final c40 c40Var2 = this.f52399b;
                                                    ConnectionsManager.getInstance(c40Var2.f28616a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var3 = c40Var2;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(c40Var3.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = c40Var2.R2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24673b = false;
                                                        r3Var2.f25229k.put(l10, q3Var2);
                                                        c40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                                    final c40 c40Var3 = this.f52399b;
                                                    ConnectionsManager.getInstance(c40Var3.f28616a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var32 = c40Var3;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                                    org.telegram.messenger.qp.s1(c40Var3.f28616a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = c40Var3.R2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25228j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        c40Var3.R2.f25232n.remove(l11);
                                                        c40Var3.R2.f25229k.remove(l11);
                                                        c40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, q3Var.a());
                                    F.c(2131232328, org.telegram.messenger.id.M0(2131749472, null), new Runnable(c40Var) {
                                        public final c40 f52399b;

                                        {
                                            this.f52399b = c40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                                    final c40 c40Var2 = this.f52399b;
                                                    ConnectionsManager.getInstance(c40Var2.f28616a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var32 = c40Var2;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = c40Var2.R2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24673b = false;
                                                        r3Var2.f25229k.put(l10, q3Var2);
                                                        c40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                                    final c40 c40Var3 = this.f52399b;
                                                    ConnectionsManager.getInstance(c40Var3.f28616a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var32 = c40Var3;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                                    org.telegram.messenger.qp.s1(c40Var3.f28616a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = c40Var3.R2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25228j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        c40Var3.R2.f25232n.remove(l11);
                                                        c40Var3.R2.f25229k.remove(l11);
                                                        c40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    F.W(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), c40Var.f44630t2.getColor()));
                                    F.f35231s = 96;
                                    F.Z();
                                    return;
                                }
                                return;
                            }
                        }
                        z9 = true;
                        if (!z9) {
                            org.telegram.ui.Components.k60 F2 = org.telegram.ui.Components.k60.F(c40Var.f28622c, c40Var.I0, y3Var);
                            F2.l(2131232129, org.telegram.messenger.id.M0(2131749461, null), new Runnable(c40Var) {
                                public final c40 f52399b;

                                {
                                    this.f52399b = c40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                            final c40 c40Var2 = this.f52399b;
                                            ConnectionsManager.getInstance(c40Var2.f28616a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var2;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = c40Var2.R2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24673b = false;
                                                r3Var2.f25229k.put(l10, q3Var2);
                                                c40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                            final c40 c40Var3 = this.f52399b;
                                            ConnectionsManager.getInstance(c40Var3.f28616a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var3;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                            org.telegram.messenger.qp.s1(c40Var3.f28616a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = c40Var3.R2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25228j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                c40Var3.R2.f25232n.remove(l11);
                                                c40Var3.R2.f25229k.remove(l11);
                                                c40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, q3Var.a());
                            F2.c(2131232328, org.telegram.messenger.id.M0(2131749472, null), new Runnable(c40Var) {
                                public final c40 f52399b;

                                {
                                    this.f52399b = c40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                            final c40 c40Var2 = this.f52399b;
                                            ConnectionsManager.getInstance(c40Var2.f28616a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var2;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = c40Var2.R2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24673b = false;
                                                r3Var2.f25229k.put(l10, q3Var2);
                                                c40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                            final c40 c40Var3 = this.f52399b;
                                            ConnectionsManager.getInstance(c40Var3.f28616a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var3;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(c40Var32.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(c40Var4.f28616a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                            org.telegram.messenger.qp.s1(c40Var3.f28616a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = c40Var3.R2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25228j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                c40Var3.R2.f25232n.remove(l11);
                                                c40Var3.R2.f25229k.remove(l11);
                                                c40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            F2.W(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), c40Var.f44630t2.getColor()));
                            F2.f35231s = 96;
                            F2.Z();
                            return;
                        }
                        return;
                    }
                    c40Var.Z1.O0(c40Var.f28616a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", y3Var.getUser().f27105id);
                    if (y3Var.f30921a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    c40Var.Z1.t0(new ProfileActivity(bundle, null));
                    c40Var.dismiss();
                }
            } else if (i7 == w30Var.f50854x) {
                if (org.telegram.messenger.t3.T(c40Var.Q2) && (chat = c40Var.Q2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                    c40Var.m1(false);
                    return;
                }
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.f21765a).N0(c40Var.l1());
                if (N0 != null) {
                    c40Var.f44602n2 = false;
                    Context context = c40Var.getContext();
                    int i13 = cVar.f21765a;
                    TLRPC.Chat chat2 = c40Var.Q2;
                    org.telegram.messenger.r3 r3Var2 = c40Var.R2;
                    org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, i13, chat2, N0, r3Var2.d, r3Var2.f25232n);
                    c40Var.f44640v3 = h20Var;
                    h20Var.setOnDismissListener(new w00(c40Var, 2));
                    org.telegram.ui.Components.h20 h20Var2 = c40Var.f44640v3;
                    h20Var2.X1 = new h10(c40Var);
                    h20Var2.show();
                }
            } else if (i7 == w30Var.f50855y) {
                org.telegram.messenger.r3 r3Var3 = c40Var.R2;
                if (r3Var3 != null && r3Var3.f25222b != null) {
                    wg.f1 f1Var = new wg.f1(activity, c40Var.f28616a, null, 4, new di.i0());
                    org.telegram.messenger.r3 r3Var4 = c40Var.R2;
                    if (r3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(r3Var4.f25224e).map(new aa.l(12)).collect(Collectors.toSet());
                    }
                    f1Var.f57747u2.addAll(collection);
                    f1Var.o1(false, true);
                    f1Var.f57745s2 = new s00(c40Var, 3);
                    f1Var.o1(false, true);
                    f1Var.f57748v2 = new bi.p5(17, c40Var, r3Var);
                    f1Var.show();
                }
            } else if (i7 == w30Var.D) {
                c40Var.A1();
            }
        }
    }

    public static void J0(c40 c40Var, org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (!c40Var.I) {
            if (z9 && rVar.getRenderer() == null) {
                rVar.setRenderer(org.telegram.ui.Components.voip.y.c(c40Var.P3, c40Var.R3, rVar, null, null, rVar.getParticipant(), c40Var.R2, c40Var));
            } else if (!z9 && rVar.getRenderer() != null) {
                rVar.getRenderer().setPrimaryView(null);
                rVar.setRenderer(null);
            }
        }
    }

    public static void K0(c40 c40Var, int i7, int[] iArr) {
        if (c40Var.u1()) {
            int i10 = org.telegram.ui.ActionBar.k6.f28254yh;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.L3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28272zh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28044nh, false));
            iArr[2] = org.telegram.messenger.g0.S0(c40Var.L3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28235xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.L3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28026mh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28044nh, false));
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28009lh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28179uh, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.L3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28083ph, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28102qh, false));
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28063oh, false);
        } else if (s1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27807ai, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.f28254yh;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.L3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ah, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bh, false));
            iArr[2] = org.telegram.messenger.g0.S0(c40Var.L3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        }
        if (s1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28083ph, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28159th, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28197vh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28235xh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28216wh, false));
        }
    }

    public static void K1(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        if (z0Var != null) {
            z0Var.d(i7, i7);
        }
    }

    public static String L0() {
        String[] strArr = org.telegram.messenger.j6.f23507i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void M0(c40 c40Var) {
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        if (r3Var != null && r3Var.f25222b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.r3 r3Var2 = c40Var.R2;
            togglegroupcallsettings.call = r3Var2.g(r3Var2.f25221a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(c40Var.R2.f25222b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(c40Var.f44588k1.f21765a);
            org.telegram.messenger.p5 p5Var = Utilities.d;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new b10(c40Var, 1));
        }
    }

    public static void N0(c40 c40Var, boolean z9) {
        if (c40Var.R2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        togglegroupcallsettings.call = r3Var.g(r3Var.f25221a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z9);
        c40Var.f44609o5 = Boolean.valueOf(z9);
        c40Var.N1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(c40Var.f44588k1.f21765a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new b10(c40Var, 0));
    }

    public static int O0(c40 c40Var, int i7) {
        l10 l10Var = c40Var.l1;
        org.telegram.ui.Components.voip.r g12 = c40Var.g1();
        if (g12 == null) {
            return Integer.MIN_VALUE;
        }
        int measuredHeight = ((l10Var.getMeasuredHeight() / 2) + l10Var.getTop()) - (c40Var.f44615q1.getMeasuredHeight() / 2);
        int measuredHeight2 = g12.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        return jg.g.D(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void P0(c40 c40Var) {
        boolean z9;
        Integer num;
        boolean z10;
        float f10;
        float f11;
        float L;
        float L2;
        float L3;
        float f12;
        float f13;
        float f14;
        boolean z11;
        View childAt;
        z20 z20Var = c40Var.F1;
        k30 k30Var = c40Var.H1;
        int childCount = k30Var.getChildCount();
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
            z9 = true;
        } else {
            z9 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z9 && z20Var.getTag() == null) || (!z9 && z20Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            z20Var.setTag(num);
            AnimatorSet animatorSet = c40Var.Y1;
            if (animatorSet != null) {
                animatorSet.cancel();
                c40Var.Y1 = null;
            }
            if (z20Var.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            c40Var.G0(z10);
            ViewPropertyAnimator animate = z20Var.getBackButton().animate();
            float f16 = 0.9f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z9) {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40366f;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = z20Var.getTitleTextView().animate();
            if (z9) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(xqVar).start();
            ObjectAnimator objectAnimator = c40Var.L4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                c40Var.L4.cancel();
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = z20Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = z20Var.getSubtitleTextView().getTranslationY();
            if (z9) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            c40Var.L4 = ofFloat;
            ofFloat.setDuration(300L);
            c40Var.L4.setInterpolator(xqVar);
            c40Var.L4.addListener(new org.telegram.ui.Components.t9(29, c40Var, z9));
            c40Var.L4.start();
            ObjectAnimator objectAnimator2 = c40Var.M4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.k5 additionalSubtitleTextView = z20Var.getAdditionalSubtitleTextView();
            if (z9) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            c40Var.M4 = ofFloat2;
            ofFloat2.setDuration(300L);
            c40Var.M4.setInterpolator(xqVar);
            c40Var.M4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            c40Var.Y1 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = c40Var.Y1;
            Property property2 = View.ALPHA;
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z20Var, property2, f12);
            s10 s10Var = c40Var.E1;
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s10Var, property2, f13);
            View view = c40Var.X1;
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            c40Var.Y1.addListener(new x20(c40Var, 1));
            c40Var.Y1.start();
            ImageView imageView = c40Var.R3.f39320w;
            if (z9 && !f44544w5) {
                z11 = false;
            } else {
                z11 = true;
            }
            imageView.setClickable(z11);
        }
        if (c40Var.f44611p2 != L4) {
            c40Var.J1(L4);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        if (f44542u5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f44542u5 = new c40(launchActivity, cVar, org.telegram.messenger.qp.s1(cVar.f21765a).g1(chat.f26956id, false, null), chat, inputPeer, z9, str);
                } else {
                    org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                    if (r3Var != null) {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(r3Var.f25223c));
                        r3Var.b(true);
                        f44542u5 = new c40(launchActivity, cVar, r3Var, M0, null, z9, str);
                    } else {
                        return;
                    }
                }
                f44542u5.Z1 = launchActivity;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(17));
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
                return org.telegram.messenger.id.M0(2131743506, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.id.M0(2131743504, null);
            } else {
                return org.telegram.messenger.id.M0(2131743503, null);
            }
        }
        return org.telegram.messenger.id.M0(2131743502, null);
    }

    public static String j1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.id.a0(null, null, 2131743500, str);
            }
            return org.telegram.messenger.id.M0(2131743501, null);
        } else if (i7 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.id.M0(2131743499, null);
            }
            return org.telegram.messenger.id.M0(2131743498, null);
        } else {
            return org.telegram.messenger.id.M0(2131743497, null);
        }
    }

    public static boolean s1(int i7) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f25222b.rtmp_stream) && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public static void w1(Context context, Runnable runnable, boolean z9, boolean z10) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z10 && org.telegram.messenger.t3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                if (isConference) {
                    u1Var.R = org.telegram.messenger.id.M0(2131743471, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131743472, null);
                } else if (org.telegram.messenger.t3.W(chat)) {
                    u1Var.R = org.telegram.messenger.id.M0(2131743474, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131743475, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131743364, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131743365, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.f25222b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    if (z9) {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27960j5, false));
                    } else {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                        int i7 = org.telegram.ui.ActionBar.k6.f27898fh;
                        int i10 = org.telegram.ui.ActionBar.k6.f27862dh;
                        int i11 = org.telegram.ui.ActionBar.k6.f27825bh;
                        checkBoxSquare.f31279s = i7;
                        checkBoxSquare.f31280w = i10;
                        checkBoxSquare.f31281x = i11;
                        checkBoxSquare.invalidate();
                    }
                    c2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        c2VarArr[0].e(org.telegram.messenger.id.M0(2131743473, null), "", false, false, false);
                    } else if (org.telegram.messenger.t3.W(chat)) {
                        c2VarArr[0].e(org.telegram.messenger.id.M0(2131743476, null), "", false, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.id.M0(2131743366, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                    if (org.telegram.messenger.id.f23157a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.id.f23157a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var2.setPadding(L, 0, L2, 0);
                    f10.addView(c2VarArr[0], c8.ha.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new y00(c2VarArr, 0));
                }
                alertDialog$Builder.o(f10);
                u1Var.I = org.telegram.ui.ActionBar.k6.f27862dh;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743367, null), new bg.e0(r3Var, c2VarArr, selfId, runnable, 4));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                if (z9) {
                    u1Var.P0 = false;
                }
                if (z9) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        u1Var.getWindow().setType(2038);
                    } else {
                        u1Var.getWindow().setType(2003);
                    }
                    u1Var.getWindow().clearFlags(2);
                }
                if (!z9) {
                    u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27953ih, false));
                }
                u1Var.show();
                if (!z9) {
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27972jh, null);
                    }
                    u1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
                    return;
                }
                return;
            }
            B1(r3Var, false, selfId, runnable);
        }
    }

    public final void A1() {
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && r3Var.f25222b != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.R2.f25222b;
            tL_inputGroupCall.f26973id = groupCall.f26966id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f28616a).sendRequest(exportgroupcallinvite, new z9(this, u1Var, exportgroupcallinvite, 12));
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
        ?? r13;
        TextView textView;
        int i16;
        int i17;
        String str3;
        String str4;
        ?? r132;
        int i18;
        int i19;
        int i20;
        String str5;
        int i21;
        EditText editText;
        int i22;
        String str6;
        float f10;
        String M02;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int L;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i28 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            org.telegram.messenger.c cVar = this.f44588k1;
            if (i28 > 0) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(j3));
            } else {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(-j3));
            }
            TLObject tLObject = M0;
            boolean z9 = true;
            if (i7 != 0 && i7 != 2 && i7 != 3) {
                if (i7 == 6) {
                    this.Z1.O0(this.f28616a);
                    Bundle bundle = new Bundle();
                    if (i28 > 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    this.Z1.t0(new an(bundle));
                    dismiss();
                } else if (i7 == 8) {
                    this.Z1.O0(this.f28616a);
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
                    if ((f2Var instanceof an) && ((an) f2Var).a() == j3) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i28 > 0) {
                        bundle2.putLong("user_id", j3);
                    } else {
                        bundle2.putLong("chat_id", -j3);
                    }
                    this.Z1.t0(new an(bundle2));
                    dismiss();
                } else if (i7 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    P1(2, true);
                } else if (i7 == 9) {
                    org.telegram.ui.Components.j30 j30Var = this.Y3;
                    if (j30Var == null || !j30Var.g()) {
                        TLRPC.User f11 = org.telegram.messenger.p10.i(cVar.f21765a).f();
                        org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(0, true, true);
                        this.Y3 = j30Var2;
                        j30Var2.H = true;
                        j30Var2.R = true;
                        j30Var2.G = true;
                        j30Var2.J = true;
                        j30Var2.S = true;
                        j30Var2.f34879a = this.Z1.M().getLastFragment();
                        org.telegram.ui.Components.j30 j30Var3 = this.Y3;
                        l30 l30Var = new l30(this, j3);
                        this.Z3 = l30Var;
                        j30Var3.f34880b = l30Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z9 = false;
                        }
                        j30Var3.n(z9, new s00(this, 8), new fi.d1(5), 0);
                    }
                } else if (i7 == 10) {
                    String str7 = groupCallParticipant.about;
                    Context context = getContext();
                    int i29 = this.f28616a;
                    Pattern pattern = org.telegram.ui.Components.v4.f38848a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    int i30 = 2131743768;
                    if (i28 > 0) {
                        str6 = null;
                        f10 = 8.0f;
                        M02 = org.telegram.messenger.id.M0(2131743768, null);
                    } else {
                        str6 = null;
                        f10 = 8.0f;
                        M02 = org.telegram.messenger.id.M0(2131751460, null);
                    }
                    String str8 = M02;
                    final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = str8;
                    if (i28 > 0) {
                        i23 = 2131743399;
                    } else {
                        i23 = 2131751463;
                    }
                    u1Var.T = org.telegram.messenger.id.M0(i23, str6);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i28 < 0) {
                        i24 = i28;
                        long j10 = -j3;
                        if (org.telegram.messenger.qp.s1(i29).N0(j10) == null) {
                            org.telegram.messenger.qp.s1(i29).V2(ConnectionsManager.generateClassGuid(), j10, true);
                        }
                    } else {
                        i24 = i28;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i31 = org.telegram.ui.ActionBar.k6.Vg;
                    org.telegram.ui.ActionBar.r6.V(editText2, i31, null);
                    if (i24 <= 0) {
                        i30 = 2131751460;
                    }
                    editText2.setHint(org.telegram.messenger.id.M0(i30, null));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.k6.U(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i24 > 0) {
                        i25 = 70;
                    } else {
                        i25 = 255;
                    }
                    editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.m3(i25, context, numberTextView)});
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (org.telegram.messenger.id.f23157a0) {
                        i26 = 3;
                    } else {
                        i26 = 5;
                    }
                    frameLayout.addView(numberTextView, c8.ha.d(20, 20.0f, i26, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (org.telegram.messenger.id.f23157a0) {
                        i27 = org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i27 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(f10);
                    if (org.telegram.messenger.id.f23157a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(24.0f);
                    }
                    editText2.setPadding(i27, L2, L, org.telegram.messenger.g0.L(f10));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.sp(i25, numberTextView));
                    org.telegram.messenger.g0.Z3(numberTextView, false, 0.0f, true, false);
                    editText2.setText(str7);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.o(frameLayout);
                    final c4.n nVar = new c4.n(j3, i29, editText2, 3);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745949, null), nVar);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    u1Var.N = new org.telegram.ui.Components.i1(editText2, 1);
                    frameLayout.addView(editText2, c8.ha.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    org.telegram.messenger.g0.K3(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i32, KeyEvent keyEvent) {
                            if (i32 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                                if (u1Var2.isShowing()) {
                                    nVar.g(u1Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27953ih, false));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.k6.x0(null, i31, false));
                } else if (i7 == 11) {
                    Context context2 = getContext();
                    int i32 = this.f28616a;
                    Pattern pattern2 = org.telegram.ui.Components.v4.f38848a;
                    if (org.telegram.messenger.m5.E(j3)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i32).a2(Long.valueOf(j3));
                        str3 = a22.first_name;
                        str4 = a22.last_name;
                    } else {
                        str3 = org.telegram.messenger.qp.s1(i32).M0(Long.valueOf(-j3)).title;
                        str4 = null;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i28 > 0) {
                        i18 = 2131743418;
                        r132 = 0;
                    } else {
                        r132 = 0;
                        i18 = 2131743417;
                    }
                    String M03 = org.telegram.messenger.id.M0(i18, r132);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = M03;
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i33 = org.telegram.ui.ActionBar.k6.Vg;
                    org.telegram.ui.ActionBar.r6.V(editText3, i33, r132);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (org.telegram.messenger.id.f23157a0) {
                        i19 = 5;
                    } else {
                        i19 = 3;
                    }
                    editText3.setGravity(i19);
                    editText3.setInputType(49152);
                    if (i28 > 0) {
                        i20 = 5;
                    } else {
                        i20 = 6;
                    }
                    editText3.setImeOptions(i20);
                    if (i28 > 0) {
                        i21 = 2131750695;
                        str5 = null;
                    } else {
                        str5 = null;
                        i21 = 2131743416;
                    }
                    editText3.setHint(org.telegram.messenger.id.M0(i21, str5));
                    editText3.setBackground(org.telegram.ui.ActionBar.k6.U(context2));
                    editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    editText3.requestFocus();
                    if (i28 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.r6.V(editText, i33, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (org.telegram.messenger.id.f23157a0) {
                            i22 = 5;
                        } else {
                            i22 = 3;
                        }
                        editText.setGravity(i22);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(org.telegram.messenger.id.M0(2131749033, null));
                        editText.setBackground(org.telegram.ui.ActionBar.k6.U(context2));
                        editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    } else {
                        editText = null;
                    }
                    org.telegram.messenger.g0.K3(editText3);
                    f12.addView(editText3, c8.ha.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        f12.addView(editText, c8.ha.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.o(f12);
                    org.telegram.ui.ActionBar.r1 n1Var = new hi.n1(editText3, j3, i32, editText);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131745949, null), n1Var);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    u1Var2.N = new bi.u3(7, editText3, editText);
                    u1Var2.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27953ih, false));
                    u1Var2.show();
                    u1Var2.p(org.telegram.ui.ActionBar.k6.x0(null, i33, false));
                    nd ndVar = new nd(1, u1Var2, n1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(ndVar);
                    } else {
                        editText3.setOnEditorActionListener(ndVar);
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
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i34 = org.telegram.ui.ActionBar.k6.f27862dh;
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27296a;
                u1Var3.I = i34;
                TextView textView2 = new TextView(getContext());
                int i35 = org.telegram.ui.ActionBar.k6.Vg;
                org.telegram.ui.ActionBar.r6.V(textView2, i35, null);
                textView2.setTextSize(1, 16.0f);
                if (org.telegram.messenger.id.f23157a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView2.setGravity(i10 | 48);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder3.o(frameLayout2);
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                w8Var.u(org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                if (org.telegram.messenger.id.f23157a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout2.addView(l9Var, c8.ha.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                w8Var.p(tLObject);
                boolean z10 = tLObject instanceof TLRPC.User;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    l9Var.e(user, w8Var);
                    str = org.telegram.messenger.t10.j(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    l9Var.e(chat, w8Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.k5.n(textView3, i35, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (org.telegram.messenger.id.f23157a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView3.setGravity(i12 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.Q2;
                if (chat2 != null) {
                    str2 = chat2.title;
                } else {
                    str2 = "";
                }
                if (i7 == 2) {
                    if (r1()) {
                        textView3.setText(org.telegram.messenger.id.M0(2131743424, null));
                        org.telegram.messenger.k5.r(null, null, 2131743425, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(org.telegram.messenger.id.M0(2131743348, null));
                        if (org.telegram.messenger.t3.W(this.Q2)) {
                            org.telegram.messenger.k5.r(null, null, 2131743467, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.k5.r(null, null, 2131743349, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(org.telegram.messenger.id.M0(2131743405, null));
                    org.telegram.messenger.k5.r(null, null, 2131743406, new Object[]{str, str2}, textView2);
                }
                boolean z11 = org.telegram.messenger.id.f23157a0;
                if (z11) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                int i36 = i13 | 48;
                int i37 = 76;
                if (z11) {
                    i14 = 21;
                } else {
                    i14 = 76;
                }
                float f13 = i14;
                if (!z11) {
                    i37 = 21;
                }
                frameLayout2.addView(textView3, c8.ha.d(-1, -2.0f, i36, f13, 11.0f, i37, 0.0f));
                if (org.telegram.messenger.id.f23157a0) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i7 == 2) {
                    r13 = 0;
                    alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131743314, null), new pu(5, this, tLObject));
                } else {
                    r13 = 0;
                    r13 = 0;
                    if (z10) {
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131743407, null), new bi.i(this, (TLRPC.User) tLObject, j3, 6));
                    }
                }
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, r13), r13);
                u1Var3.j(org.telegram.ui.ActionBar.k6.x0(r13, org.telegram.ui.ActionBar.k6.f27953ih, false));
                u1Var3.show();
                if (i7 == 2 && (textView = (TextView) u1Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27972jh, r13);
                }
            }
        }
    }

    public final void D1(boolean r18, org.telegram.ui.Cells.f4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.D1(boolean, org.telegram.ui.Cells.f4):void");
    }

    public final void E1() {
        m4 m4Var = this.f44623r4;
        org.telegram.messenger.g0.r(m4Var);
        if (this.f44618q4 && this.L2 != null && VoIPService.getSharedInstance() != null && u1() && this.H1 != null && org.telegram.messenger.sc.e(512)) {
            org.telegram.messenger.g0.i3(m4Var, 30L);
        }
    }

    public final void F1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j3;
        this.f44650y1.setText("");
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && r3Var.f25222b != null && (g10 = r3Var.g(r3Var.f25221a)) != null) {
            org.telegram.messenger.r3 r3Var2 = this.R2;
            long j10 = r3Var2.f25222b.f26966id;
            TLRPC.Peer peer = r3Var2.J;
            if (peer != null) {
                j3 = org.telegram.messenger.m5.o(peer);
            } else {
                j3 = org.telegram.messenger.p10.i(this.f28616a).f24489n;
            }
            GroupCallMessagesController.getInstance(this.f28616a).sendCallMessage(j3, tL_textWithEntities, j10, g10);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(float f10) {
        float f11;
        int i7;
        int i10;
        this.L3 = f10;
        z10 z10Var = this.R3;
        if (z10Var == null) {
            f11 = 0.0f;
        } else {
            f11 = z10Var.f39295c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.k6.Xg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.Ug;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        this.M3 = S0;
        this.E1.setBackgroundColor(S0);
        this.f44553b3.H(-14472653);
        this.W1.setColorFilter(new PorterDuffColorFilter(this.M3, PorterDuff.Mode.MULTIPLY));
        this.G0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27935hh, false));
        g.b bVar = this.f44571g2;
        if (bVar != null) {
            bVar.f13264b = S02;
            l00 l00Var = (l00) bVar.f13269i;
            if (l00Var != null) {
                l00Var.invalidate();
            }
        }
        this.f44630t2.setColor(S02);
        this.f44638v1.setColor(S02);
        this.f44642w1.invalidate();
        k30 k30Var = this.H1;
        k30Var.setGlowColor(S02);
        int i13 = this.f44644w3;
        if (i13 == 3 || s1(i13)) {
            this.f44625s1.invalidate();
        }
        View view = this.A4;
        if (view != null) {
            int i14 = this.M3;
            int[] iArr = this.D4;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.C4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.C4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.B4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122rh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28140sh, false));
        this.f44615q1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27845ch, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27806ah, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27898fh, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0);
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
                boolean z9 = childAt instanceof org.telegram.ui.Cells.f4;
                z20 z20Var = this.F1;
                if (z9) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (z20Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.k6.f27898fh;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f27806ah;
                    }
                    f4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (z20Var.getTag() != null) {
                        i7 = org.telegram.ui.ActionBar.k6.f27898fh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.f27806ah;
                    }
                    y3Var.a(i7, S05);
                }
            }
        }
        this.f28619b.invalidate();
        k30Var.invalidate();
        this.f28622c.invalidate();
    }

    @Override
    public final boolean H() {
        return !this.R3.f39293b;
    }

    public final void H1(float f10) {
        k30 k30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        v4.d1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.G2 = min;
        this.H2 = (min - this.F2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && (k30Var = this.H1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.ij.C1(this.f44621r2))) != null) {
            z10 z10Var = this.R3;
            if (!z10Var.f39293b) {
                if (this.f44585j2) {
                    arrayList = this.f44635u2;
                } else {
                    arrayList = this.R2.f25226g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = k30Var.K(indexOf + this.G1.d)) != null) {
                    View view = K.f57044a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.O4 && !this.f44558c4) {
                            this.f28619b.invalidate();
                        }
                    }
                }
            } else {
                int i7 = 0;
                while (true) {
                    v10 v10Var = this.f44561d4;
                    if (i7 >= v10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) v10Var.getChildAt(i7);
                    if (org.telegram.messenger.ij.C1(h10Var.getParticipant().peer) == org.telegram.messenger.ij.C1(groupCallParticipant.peer)) {
                        h10Var.setAmplitude(f10 * 15.0f);
                    }
                    i7++;
                }
            }
            z10Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void I1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.X4 = i7;
        this.Y4 = i10;
        this.Z4 = i11;
        this.f44551a5 = i12;
        this.f44555b5 = i13;
        this.f44559c5 = i14;
        this.f44562d5 = i15;
        this.f44566e5 = i16;
        this.f44570f5 = i17;
        this.f44574g5 = i18;
        this.f44578h5 = i19;
        this.f44583i5 = i20;
        this.f44587j5 = i21;
        this.f44592k5 = i22;
        this.f44596l5 = i23;
        this.f44601m5 = i24;
    }

    public final void J1(float f10) {
        k30 k30Var;
        int L;
        int i7;
        float f11;
        this.f44611p2 = f10;
        this.H1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) k30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f28648s0 + L2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.f28648s0 + L2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        r30 r30Var = this.L2;
        z10 z10Var = this.R3;
        t10 t10Var = this.W2;
        r10 r10Var = this.V2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L2) - this.f28648s0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((L - this.f28648s0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i7 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (r30Var != null) {
                r30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.L3) > 1.0E-4f) {
                G1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.f1.x(min, 0.1f, 1.2f, 1.0f);
            r10Var.setScaleX(Math.max(0.9f, x10));
            r10Var.setScaleY(Math.max(0.9f, x10));
            float f12 = 1.0f - (min * 1.2f);
            r10Var.setAlpha((1.0f - z10Var.f39295c) * Math.max(0.0f, f12));
            t10Var.setScaleX(Math.max(0.9f, x10));
            t10Var.setScaleY(Math.max(0.9f, x10));
            t10Var.setAlpha((1.0f - z10Var.f39295c) * Math.max(0.0f, f12));
        } else {
            r10Var.setScaleX(1.0f);
            r10Var.setScaleY(1.0f);
            r10Var.setAlpha(1.0f - z10Var.f39295c);
            t10Var.setScaleX(1.0f);
            t10Var.setScaleY(1.0f);
            t10Var.setAlpha(1.0f - z10Var.f39295c);
            if (this.L3 > 1.0E-4f) {
                G1(0.0f);
            }
            i7 = 0;
        }
        a1();
        float f13 = i7;
        this.f44617q3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f44549a3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (r30Var != null) {
            r30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        q20 q20Var = this.I1;
        if (q20Var != null) {
            q20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f28619b.invalidate();
        W1();
    }

    @Override
    public final void K() {
        z10 z10Var = this.R3;
        if (z10Var != null) {
            if (this.f44577h4 != null) {
                this.H1.getViewTreeObserver().removeOnPreDrawListener(this.f44577h4);
                this.f44577h4 = null;
            }
            ArrayList arrayList = this.Q3;
            arrayList.clear();
            ArrayList arrayList2 = this.P3;
            arrayList.addAll(arrayList2);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).f();
                z10Var.removeView((View) arrayList.get(i7));
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).e();
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).b(true);
            }
            arrayList2.clear();
            if (z10Var.getParent() != null) {
                arrayList2.clear();
                this.f28619b.removeView(z10Var);
            }
        }
        super.K();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f44542u5 == this) {
            f44542u5 = null;
        }
        f44543v5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.p10.k(getContext());
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.f25224e;
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
        if (this.d2 == null) {
            org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(8, getContext(), null, true);
            this.d2 = y20Var;
            y20Var.setAlpha(0.0f);
            this.d2.setVisibility(4);
            this.d2.setShowingDuration(3000L);
            this.f28619b.addView(this.d2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.Q2)) {
                this.d2.setText(org.telegram.messenger.id.M0(2131743468, null));
            } else {
                this.d2.setText(org.telegram.messenger.id.M0(2131743350, null));
            }
            this.d2.b();
        }
        this.d2.setExtraTranslationY(-org.telegram.messenger.g0.f22557m);
        this.d2.c(view);
    }

    public final void N1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.messenger.r3 r3Var = this.R2;
        org.telegram.ui.Components.voip.n2 n2Var = this.f44620r1;
        org.telegram.ui.Components.voip.n2 n2Var2 = this.n1;
        org.telegram.ui.Components.voip.n2 n2Var3 = this.f44610p1;
        org.telegram.ui.Components.voip.n2 n2Var4 = this.f44597m1;
        org.telegram.ui.Components.voip.n2 n2Var5 = this.f44606o1;
        org.telegram.ui.Components.voip.n2 n2Var6 = this.f44615q1;
        org.telegram.ui.Components.voip.n2 n2Var7 = this.f44625s1;
        boolean z18 = true;
        l10 l10Var = this.l1;
        boolean z19 = false;
        if (r3Var != null && !r3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.ij.C1(this.f44621r2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean bool = this.f44609o5;
            if (bool != null) {
                z14 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.R2.f25222b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (((!z13 && this.R2.c()) || z12) && !u1()) {
                z15 = true;
            } else {
                z15 = false;
                z19 = true;
            }
            if (z12) {
                z17 = true;
                z16 = false;
            } else {
                z16 = !z13;
                z17 = false;
            }
            if (f44544w5) {
                z16 = false;
                z17 = false;
            }
            l10Var.c(n2Var7, true, z9);
            l10Var.c(n2Var6, true, z9);
            l10Var.c(n2Var5, z15, z9);
            l10Var.c(n2Var4, z17, z9);
            l10Var.c(n2Var3, z19, z9);
            l10Var.c(n2Var2, z16, z9);
            l10Var.c(n2Var, z14, z9);
            return;
        }
        if (this.M2 > 0.1f) {
            z10 = true;
        } else {
            z10 = false;
        }
        l10Var.c(n2Var7, z10, z9);
        if (this.M2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        l10Var.c(n2Var6, z11, z9);
        if (this.M2 <= 0.1f) {
            z18 = false;
        }
        l10Var.c(n2Var3, z18, z9);
        l10Var.c(n2Var5, false, z9);
        l10Var.c(n2Var4, false, z9);
        l10Var.c(n2Var2, false, z9);
        l10Var.c(n2Var, false, z9);
    }

    public final void O1() {
        int i7;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        int i11;
        TLObject M0;
        org.telegram.messenger.r3 r3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i12;
        int i13;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.r3 r3Var2 = this.R2;
        org.telegram.ui.ActionBar.r0 r0Var = this.f44553b3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f44560d3;
        if (r3Var2 == null || r3Var2.j()) {
            this.f44557c3.setVisibility(4);
            r0Var2.setVisibility(8);
            if (this.R2 == null) {
                r0Var.setVisibility(8);
                return;
            }
        }
        if (this.f44556c2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f44588k1;
        int i14 = cVar.f21765a;
        int i15 = cVar.f21765a;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i14).M0(Long.valueOf(l1()));
        if (M02 != null) {
            this.Q2 = M02;
        }
        boolean y10 = org.telegram.messenger.t3.y(3, this.Q2);
        org.telegram.ui.ActionBar.z0 z0Var = this.f44564e3;
        if (!y10 && (((org.telegram.messenger.t3.T(this.Q2) && ((chat2 = this.Q2) == null || !chat2.megagroup)) || (!org.telegram.messenger.t3.t0(this.Q2) && !org.telegram.messenger.t3.y(3, this.Q2))) && (!org.telegram.messenger.t3.T(this.Q2) || (chat = this.Q2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)))) {
            z0Var.setVisibility(8);
        } else {
            z0Var.setVisibility(0);
        }
        org.telegram.messenger.r3 r3Var3 = this.R2;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f44612p3;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f44608o3;
        if (r3Var3 != null && (groupCall2 = r3Var3.f25222b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            z0Var3.setVisibility(i12);
            if (this.R2.f25222b.messages_enabled) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            z0Var2.setVisibility(i13);
        } else {
            z0Var3.setVisibility(8);
            z0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.ij.C1(this.f44621r2));
        org.telegram.messenger.r3 r3Var4 = this.R2;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f44576h3;
        if (r3Var4 != null && !r3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            z0Var4.setVisibility(0);
        } else {
            z0Var4.setVisibility(8);
        }
        if (org.telegram.messenger.iz.I0) {
            i7 = 2131232261;
        } else {
            i7 = 2131232260;
        }
        z0Var4.setIcon(i7);
        if (org.telegram.messenger.iz.I0) {
            i10 = 2131743283;
        } else {
            i10 = 2131743284;
        }
        z0Var4.setSubtext(org.telegram.messenger.id.M0(i10, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.z0 z0Var5 = this.f44603n3;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f44568f3;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.j3;
        org.telegram.ui.ActionBar.z0 z0Var8 = this.f44590k3;
        if (S0) {
            z0Var5.setVisibility(0);
            z0Var6.setVisibility(0);
            if (u1()) {
                z0Var7.setVisibility(0);
                z0Var8.setVisibility(8);
            } else if (this.R2.j()) {
                z0Var7.setVisibility(8);
                z0Var8.setVisibility(8);
            } else {
                z0Var7.setVisibility(0);
            }
            if (r1()) {
                z0Var7.setVisibility(8);
                z0Var6.setVisibility(8);
            }
            if (this.R2.c() && !this.R2.j() && !u1()) {
                z0Var8.setVisibility(0);
            } else {
                z0Var8.setVisibility(8);
            }
            r0Var2.setVisibility(8);
            boolean z12 = this.R2.f25240w;
            x30 x30Var = this.U2;
            x30Var.f51738f = z12;
            x30Var.d = 1.0f;
            x30Var.invalidateSelf();
            if (this.R2.f25240w) {
                if (this.f44636u3 == null) {
                    s00 s00Var = new s00(this, 6);
                    this.f44636u3 = s00Var;
                    org.telegram.messenger.g0.i3(s00Var, 1000L);
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743326, null));
            } else {
                s00 s00Var2 = this.f44636u3;
                if (s00Var2 != null) {
                    org.telegram.messenger.g0.r(s00Var2);
                    this.f44636u3 = null;
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743351, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z0Var8.j(org.telegram.messenger.id.M0(2131743437, null), 2131232353, null);
            } else {
                z0Var8.j(org.telegram.messenger.id.M0(2131743439, null), 2131232352, null);
            }
            Q1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z9 && ((this.R2.c() || z10) && !this.R2.j() && !u1())) {
                if (z10) {
                    r0Var2.setVisibility(8);
                    z0Var8.setVisibility(0);
                    z0Var8.j(org.telegram.messenger.id.M0(2131743437, null), 2131232353, null);
                    z0Var8.setContentDescription(org.telegram.messenger.id.M0(2131743437, null));
                } else {
                    z0Var8.j(org.telegram.messenger.id.M0(2131743439, null), 2131232352, null);
                    z0Var8.setContentDescription(org.telegram.messenger.id.M0(2131743439, null));
                    r0Var2.setVisibility(8);
                    z0Var8.setVisibility(0);
                }
            } else {
                r0Var2.setVisibility(8);
                z0Var8.setVisibility(8);
            }
            z0Var5.setVisibility(8);
            z0Var6.setVisibility(8);
            z0Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.z0 z0Var9 = this.f44581i3;
        if (S02 && this.R2.f25222b.can_change_join_muted && !r1()) {
            z0Var9.setVisibility(0);
        } else {
            z0Var9.setVisibility(8);
        }
        if (r1() && ((r3Var = this.R2) == null || (groupCall = r3Var.f25222b) == null || !groupCall.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        r0Var.Q(4, z11);
        if (u1() && !this.R2.j()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f44572g3.setVisibility(i11);
        int visibility = z0Var6.getVisibility();
        TextView textView = this.f44622r3;
        if (visibility != 0 && z0Var9.getVisibility() != 0 && z0Var.getVisibility() != 0 && z0Var8.getVisibility() != 0 && z0Var7.getVisibility() != 0 && z0Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f44552b2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.S2) && !u1() && this.f44621r2 != null) {
            kVar.setVisibility(0);
            long C1 = org.telegram.messenger.ij.C1(this.f44621r2);
            if (org.telegram.messenger.m5.E(C1)) {
                M0 = org.telegram.messenger.qp.s1(i15).a2(Long.valueOf(C1));
            } else {
                M0 = org.telegram.messenger.qp.s1(i15).M0(Long.valueOf(-C1));
            }
            kVar.setObject(M0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.Q2;
        if (chat3 != null && !org.telegram.messenger.t3.W(chat3) && u1() && z0Var.getVisibility() == 8) {
            r0Var.setVisibility(8);
        } else {
            r0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f44549a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f44617q3.getLayoutParams()).rightMargin = 0;
        this.F1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void P1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.P1(int, boolean):void");
    }

    public final void Q0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.Q0(boolean):void");
    }

    public final void Q1() {
        if (this.R2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f44588k1.f21765a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.R2;
        int i7 = currentTime - r3Var.f25222b.record_start_date;
        boolean z9 = r3Var.f25240w;
        org.telegram.ui.ActionBar.z0 z0Var = this.j3;
        if (z9) {
            z0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            z0Var.setSubtext(null);
        }
    }

    public final int R0() {
        k30 k30Var = this.H1;
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

    public final void R1(boolean z9) {
        float interpolation;
        float f10;
        q20 q20Var = this.I1;
        if ((q20Var == null || this.R2 != null) && this.O2 == null) {
            this.N2 = 1.0f;
            this.M2 = 1.0f;
            if (q20Var == null) {
                return;
            }
        }
        int i7 = 4;
        if (!z9) {
            p10 p10Var = this.f44604n4;
            org.telegram.messenger.g0.r(p10Var);
            p10Var.run();
            org.telegram.messenger.r3 r3Var = this.R2;
            k30 k30Var = this.H1;
            if (r3Var != null && !r3Var.j()) {
                k30Var.setVisibility(0);
            } else {
                k30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.t3.W(this.Q2);
            org.telegram.ui.ActionBar.z0 z0Var = this.f44603n3;
            if (W) {
                z0Var.setText(org.telegram.messenger.id.M0(2131743491, null));
            } else {
                z0Var.setText(org.telegram.messenger.id.M0(2131743398, null));
            }
        }
        float f11 = this.M2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.xq.f40366f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.N2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40366f;
            this.N2 = xqVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * xqVar.getInterpolation(this.M2 / 0.6f);
            f10 = this.M2 / 0.6f;
        }
        N1(true);
        float f12 = 1.0f - f10;
        q20Var.setAlpha(f12);
        this.L1.setAlpha(f10);
        this.N1.setAlpha(f10);
        j30 j30Var = this.M1;
        j30Var.setAlpha(f10);
        j30Var.setScaleX(interpolation);
        j30Var.setScaleY(interpolation);
        o20 o20Var = this.K1;
        o20Var.setScaleX(f12);
        o20Var.setScaleY(f12);
        o20Var.setAlpha(f12);
        this.J1.setAlpha(f12);
        this.f44553b3.setAlpha(f10);
        if (f12 != 0.0f) {
            i7 = 0;
        }
        if (i7 != q20Var.getVisibility()) {
            q20Var.setVisibility(i7);
            o20Var.setVisibility(i7);
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.r3 r3Var = this.R2;
            if (r3Var != null && (groupCall = r3Var.f25222b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, this.Q2);
    }

    public final void S1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        org.telegram.ui.Components.voip.n2 n2Var = this.f44610p1;
        if (n2Var != null && n2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            l10 l10Var = this.l1;
            boolean z13 = false;
            if (sharedInstance != null && !u1()) {
                mh.a aVar = (mh.a) l10Var.f20045c.get(n2Var);
                if (aVar != null) {
                    aVar.d.a(true, z9);
                    n2Var.setEnabled(true);
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
                    n2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743506, null), false, z9);
                } else if (z12) {
                    n2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.id.M0(2131743242, null), false, z9);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    n2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743504, null), false, z9);
                } else {
                    n2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743242, null), false, z9);
                }
                n2Var.b(z12, z9);
                k1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i7 = 2131231089;
                } else {
                    i7 = 2131231171;
                }
                if (this.R1 != i7) {
                    this.R1 = i7;
                    org.telegram.messenger.g0.R3(this.S1, i7);
                }
                org.telegram.ui.Components.voip.n2 n2Var2 = this.n1;
                if (n2Var2.getVisibility() == 0) {
                    n2Var2.c(0, -1, 0, 1.0f, true, i1(k1()), false, z9);
                    if (k1() != 1) {
                        z13 = true;
                    }
                    n2Var2.b(z13, z9);
                    return;
                }
                return;
            }
            n2Var.c(2131232435, -1, 0, 0.3f, true, org.telegram.messenger.id.M0(2131743440, null), false, z9);
            if (!org.telegram.messenger.t3.t0(this.Q2) && (!org.telegram.messenger.t3.N(this.Q2) || !org.telegram.messenger.t3.w(3, this.Q2))) {
                z10 = false;
            } else {
                z10 = true;
            }
            mh.a aVar2 = (mh.a) l10Var.f20045c.get(n2Var);
            if (aVar2 != null) {
                aVar2.d.a(z10, z9);
                n2Var.setEnabled(z10);
            }
            n2Var.b(true, false);
        }
    }

    public final void T0() {
        if (this.I3) {
            this.I3 = false;
            org.telegram.messenger.g0.r(this.f44613p4);
        }
        if (this.J3) {
            this.J3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f44625s1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.T1(boolean, boolean):void");
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.U0():void");
    }

    public final void U1() {
        boolean z9;
        String str;
        float f10;
        float f11;
        a40 a40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        z20 z20Var = this.F1;
        if (z20Var != null && this.R2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i7 = 0;
            for (int i10 = 0; i10 < this.R2.P.m(); i10++) {
                long j3 = this.R2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.P.f(j3);
                if (!groupCallParticipant.self) {
                    z10 z10Var = this.R3;
                    z10Var.getClass();
                    if (z10Var.f39322x.get(org.telegram.messenger.ij.C1(groupCallParticipant.peer)) <= 0 && this.f44628s4.get(j3, 0) != 1) {
                        long C1 = org.telegram.messenger.ij.C1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i7 < 2) {
                            int i11 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.qp.s1(this.f28616a).a2(Long.valueOf(C1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.qp.s1(this.f28616a).M0(Long.valueOf(C1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i7 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.t10.j(user, true), new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0);
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
                String K0 = org.telegram.messenger.id.K0(i7, "MembersAreSpeakingToast");
                int indexOf = K0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                z20Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = z20Var.getSubtitleTextView();
            if (u1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.R2.f25222b.participants_count;
            w30 w30Var = this.G1;
            subtitleTextView.k(org.telegram.messenger.id.G(i12 + ((w30Var.M.u1() || w30Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (u1() && (a40Var = this.f44627s3) != null) {
                a40Var.setWatchersCount(this.R2.f25222b.participants_count);
            }
            if (z9 != this.f44595l4) {
                this.f44595l4 = z9;
                z20Var.invalidate();
                float f12 = 0.0f;
                z20Var.getSubtitleTextView().setPivotX(0.0f);
                z20Var.getSubtitleTextView().setPivotY(z20Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = z20Var.getSubtitleTextView().animate();
                if (this.f44595l4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f44595l4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f44595l4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.X3(z20Var.getAdditionalSubtitleTextView(), this.f44595l4);
            }
        }
    }

    public final void V0() {
        this.f44642w1.setTranslationY((-this.f44631t3.d()) + this.f28619b.getPaddingBottom());
        this.f44646x1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.l1.setAlpha(1.0f - this.f44619q5.f55487e);
        W0();
        X0();
    }

    public final void V1(boolean z9) {
        org.telegram.messenger.r3 r3Var = this.R2;
        r10 r10Var = this.V2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.Q2)) {
                r10Var.b(org.telegram.messenger.id.M0(2131743465, null), z9);
                return;
            } else {
                r10Var.b(org.telegram.messenger.id.M0(2131743344, null), z9);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.f25222b.title);
        z20 z20Var = this.F1;
        if (!isEmpty) {
            if (!this.R2.f25222b.title.equals(z20Var.getTitle())) {
                if (z9) {
                    this.F1.K(this.R2.f25222b.title, true, 180L, null);
                    z20Var.getTitleTextView().setOnClickListener(new p00(this, 7));
                } else {
                    z20Var.setTitle(this.R2.f25222b.title);
                }
                r10Var.b(this.R2.f25222b.title, z9);
            }
        } else {
            TLRPC.Chat chat = this.Q2;
            if (chat != null && !chat.title.equals(z20Var.getTitle())) {
                if (z9) {
                    this.F1.K(this.Q2.title, true, 180L, null);
                    z20Var.getTitleTextView().setOnClickListener(new p00(this, 8));
                } else {
                    z20Var.setTitle(this.Q2.title);
                }
                if (org.telegram.messenger.t3.W(this.Q2)) {
                    if (u1()) {
                        r10Var.b(this.Q2.title, z9);
                    } else {
                        r10Var.b(org.telegram.messenger.id.M0(2131743450, null), z9);
                    }
                } else {
                    r10Var.b(org.telegram.messenger.id.M0(2131743309, null), z9);
                }
            } else if (this.Q2 == null) {
                z20Var.setTitle(org.telegram.messenger.id.M0(2131751823, null));
                r10Var.b(org.telegram.messenger.id.M0(2131751823, null), z9);
            }
        }
        org.telegram.ui.ActionBar.k5 titleTextView = z20Var.getTitleTextView();
        if (this.R2.f25240w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new y30(titleTextView));
                TextView textView = r10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y30(textView), (Drawable) null);
                TextView nextTextView = r10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y30(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            r10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            r10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void W0() {
        int i7;
        float f10 = this.f44631t3.f54547b.f55513a;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        k20 k20Var = this.f44642w1;
        k20Var.setAlpha(f10);
        j20 j20Var = this.f44646x1;
        j20Var.setAlpha(f10);
        if (k20Var.getVisibility() != i7) {
            k20Var.setVisibility(i7);
            j20Var.setVisibility(i7);
            if (i7 == 8) {
                h20 h20Var = this.f44650y1;
                if (h20Var.isFocused()) {
                    h20Var.clearFocus();
                }
            }
        }
    }

    public final void W1() {
        float f10;
        org.telegram.ui.Components.gb gbVar;
        boolean z9;
        if (this.E != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f44611p2 - L;
            if (this.f28648s0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int L2 = (L - this.f28648s0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f28648s0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f28619b.getPaddingTop();
            FrameLayout frameLayout = this.E;
            z20 z20Var = this.F1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.E.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), z20Var.getY() + (-this.E.getTop()) + z20Var.getHeight(), f10));
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
            if (ccVar != null && (gbVar = ccVar.f32541e) != null && gbVar.getParent() != null && gbVar.getParent().getParent() == this.E) {
                if (f10 > 0.5f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gbVar.setTop(z9);
            }
        }
    }

    public final void X0() {
        int i7;
        org.telegram.ui.Components.ii0 ii0Var = this.B1;
        if (ii0Var != null) {
            float f10 = this.f44631t3.f54547b.f55513a * this.f44624r5.f55487e;
            ii0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (this.B1.getVisibility() != i7) {
                this.B1.setVisibility(i7);
                if (i7 == 8) {
                    this.B1.n();
                }
            }
            org.telegram.ui.Components.ii0 ii0Var2 = this.B1;
            if (!ii0Var2.N0 && f10 == 1.0f) {
                ii0Var2.N0 = true;
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.f44619q5.f55487e;
            l10 l10Var = this.l1;
            l10Var.setAlpha(f12);
            this.R3.setProgressToHideUi(f10);
            this.f44561d4.invalidate();
            this.f28619b.invalidate();
            l10Var.invalidate();
        }
        if (i7 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.f28619b.invalidate();
        }
        if (i7 == 4) {
            a1();
            this.f44646x1.invalidate();
            this.f44650y1.invalidate();
        }
        if (i7 == 5) {
            a1();
            this.f28619b.invalidate();
        }
    }

    public final void Y0() {
        boolean z9 = f44545x5;
        l10 l10Var = this.l1;
        if (z9) {
            l10Var.setTranslationX(0.0f);
            l10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = f44544w5;
        te.a aVar = this.f44619q5;
        if (z10) {
            l10Var.setTranslationX(aVar.f55487e * org.telegram.messenger.g0.L(94.0f));
            l10Var.setTranslationY(0.0f);
            return;
        }
        l10Var.setTranslationX(0.0f);
        l10Var.setTranslationY(aVar.f55487e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void Z0() {
        boolean z9 = f44545x5;
        v10 v10Var = this.f44561d4;
        if (z9) {
            v10Var.setTranslationX(0.0f);
            v10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = f44544w5;
        te.a aVar = this.f44619q5;
        if (z10) {
            v10Var.setTranslationX(aVar.f55487e * org.telegram.messenger.g0.L(94.0f));
            v10Var.setTranslationY(0.0f);
            return;
        }
        v10Var.setTranslationX(0.0f);
        v10Var.setTranslationY(aVar.f55487e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void a1() {
        float L;
        float f10 = this.s5.f55493f;
        rh.h hVar = this.f44631t3;
        float f11 = -((hVar.d() - this.f28619b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f44624r5.f55487e) + org.telegram.messenger.g0.L(10.0f));
        if (f44545x5) {
            L = (1.0f - this.f44633t5.f55487e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (f44544w5) {
            L = 0.0f;
        } else {
            L = ((this.f44619q5.f55487e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.R3.f39295c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f54547b.f55513a);
        float measuredHeight = ((this.f28619b.getMeasuredHeight() - this.f44611p2) + T1) - this.f28648s0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        nh.h hVar2 = this.T1;
        hVar2.setTranslationY(T1);
        hVar2.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.B1 != null) {
            this.B1.setTranslationY((-this.f44631t3.d()) + this.f28619b.getPaddingBottom() + ((-this.f44624r5.f55487e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        boolean z9;
        float f10 = this.f44624r5.f55487e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.A1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z10 = false;
        if (f10 > 0.9f) {
            z9 = true;
        } else {
            z9 = false;
        }
        imageView.setClickable(z9);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.f44654z1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z10 = true;
        }
        imageView2.setClickable(z10);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.y yVar = this.Q4;
        if (yVar != null) {
            yVar.f39625a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.y yVar2 = this.Q4;
            yVar2.h = false;
            yVar2.j(false);
            this.Q4.invalidate();
            this.R3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.O4;
        if (f4Var != null && !this.S4 && f4Var.getParent() != null) {
            this.f28619b.removeView(this.O4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.O4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.O4.setAboutVisible(false);
            this.O4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.h10 h10Var = this.R4;
        if (h10Var != null) {
            h10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.O4 = null;
        this.P4 = null;
        this.R4 = null;
        this.Q4 = null;
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
        boolean z9;
        org.telegram.messenger.s3 s3Var;
        boolean z10;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = org.telegram.messenger.qs.f25099w2;
        k30 k30Var = this.H1;
        String[] strArr = null;
        int i18 = 0;
        if (i7 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.R2;
            if (r3Var != null && r3Var.f25222b.f26966id == l10.longValue()) {
                org.telegram.messenger.r3 r3Var2 = this.R2;
                if (r3Var2.f25222b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f44589k2 > 0L ? 1 : (this.f44589k2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f44588k1;
                if (i19 == 0 && (((i16 = this.f44644w3) == 7 || i16 == 5 || i16 == 6) && !r3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.Z1, VoIPService.class);
                        intent.putExtra("chat_id", l1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.S2);
                        intent.putExtra("peerChannelId", this.P2.channel_id);
                        intent.putExtra("peerChatId", this.P2.chat_id);
                        intent.putExtra("peerUserId", this.P2.user_id);
                        intent.putExtra("hash", this.T2);
                        intent.putExtra("peerAccessHash", this.P2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f21765a);
                        intent.putExtra("scheduleDate", this.f44554b4);
                        this.Z1.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f44589k2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new s00(this, 2), 3000L);
                }
                if (!this.f44593l2 && VoIPService.getSharedInstance() != null) {
                    this.R2.b(false);
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
                if (this.O4 != null) {
                    this.f44585j2 = true;
                } else {
                    Q0(true);
                }
                U1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.f44644w3 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                T1(true, booleanValue);
                V1(true);
                if (z10 && ((i15 = this.f44644w3) == 1 || i15 == 0)) {
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
                                ArrayList arrayList = org.telegram.messenger.qp.s1(cVar.f21765a).f24944y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f26960id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(l11);
                                if (a22 != null) {
                                    if (this.R2.f25222b.participants_count < 250 || org.telegram.messenger.t10.w(a22) || a22.verified || i18 != 0) {
                                        n1().k(0L, 44, a22, this.Q2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(-longValue));
                            if (M02 != null) {
                                if (this.R2.f25222b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i18 != 0) {
                                    n1().k(0L, 44, M02, this.Q2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25113y2) {
            z10 z10Var = this.R3;
            if (z10Var.f39293b && this.R2 != null) {
                boolean c10 = z10Var.c();
                org.telegram.messenger.r3 r3Var3 = this.R2;
                if (r3Var3 != null && z10Var.f39293b && (s3Var = z10Var.f39298e) != null && r3Var3.d.f(org.telegram.messenger.ij.C1(s3Var.f25409a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f44575h2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i22);
                        if (this.R2.P.g(null, org.telegram.messenger.ij.C1(s3Var3.f25409a.peer)) != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.f25409a;
                            if (!groupCallParticipant3.muted_by_you && z10Var.d != org.telegram.messenger.ij.C1(groupCallParticipant3.peer)) {
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
            z10Var.setVisibleParticipant(true);
            U1();
        } else if (i7 == org.telegram.messenger.qs.N4) {
            H1(((Float) objArr[0]).floatValue());
        } else if (i7 == org.telegram.messenger.qs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.t3.W(this.Q2)) {
                        M0 = org.telegram.messenger.id.M0(2131743455, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131743322, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.id.M0(2131751106, null) + "\n" + str;
                } else if (org.telegram.messenger.t3.W(this.Q2)) {
                    M0 = org.telegram.messenger.id.M0(2131743481, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131743373, null);
                }
                AlertDialog$Builder K = org.telegram.ui.Components.v4.K(getContext(), org.telegram.messenger.id.M0(2131743309, null), M0);
                K.j(new w00(this, 1));
                try {
                    K.p();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26957id == l1()) {
                O1();
                T1(isShowing(), false);
            }
            long C1 = org.telegram.messenger.ij.C1(this.f44621r2);
            org.telegram.messenger.r3 r3Var4 = this.R2;
            if (r3Var4 != null && chatFull.f26957id == (-C1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(C1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                Q0(true);
                org.telegram.messenger.g0.b4(k30Var);
                if (this.f44641v4 != null) {
                    while (i18 < this.f44641v4.getChildCount()) {
                        View childAt2 = this.f44641v4.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.z0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = 2131743509;
                            } else {
                                i13 = 2131743419;
                            }
                            String M03 = org.telegram.messenger.id.M0(i13, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131232043;
                            } else {
                                i14 = 2131232185;
                            }
                            z0Var.j(M03, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25085u1) {
            if (((Long) objArr[0]).longValue() == l1()) {
                O1();
                T1(isShowing(), false);
            }
        } else if (i7 == org.telegram.messenger.qs.B2) {
            int childCount2 = k30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                v4.d1 G = k30Var.G(k30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f57044a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                        if (f4Var.getParticipant() != null) {
                            f4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i7 == org.telegram.messenger.qs.E0) {
            Long l12 = (Long) objArr[0];
            long C12 = org.telegram.messenger.ij.C1(this.f44621r2);
            if (this.R2 != null && C12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(C12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                Q0(true);
                org.telegram.messenger.g0.b4(k30Var);
                if (this.f44641v4 != null) {
                    while (i18 < this.f44641v4.getChildCount()) {
                        View childAt3 = this.f44641v4.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.z0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = 2131743510;
                            } else {
                                i11 = 2131743420;
                            }
                            String M04 = org.telegram.messenger.id.M0(i11, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131232043;
                            } else {
                                i12 = 2131232185;
                            }
                            z0Var2.j(M04, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25020j0) {
            Q0(true);
            org.telegram.messenger.g0.b4(k30Var);
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.qp.C8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                Q0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.b4(k30Var);
            }
        } else if (i7 == org.telegram.messenger.qs.f25120z2) {
            t20 t20Var = this.f44616q2;
            if (t20Var != null) {
                t20Var.b(true, true);
            }
            O1();
        } else if (i7 == org.telegram.messenger.qs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f44571g2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.Z1;
        launchActivity.Z0.remove(this.f44600m4);
        this.Z1.setRequestedOrientation(-1);
        f44543v5 = false;
        org.telegram.ui.Components.h20 h20Var = this.f44640v3;
        if (h20Var != null) {
            h20Var.dismiss();
        }
        this.f44585j2 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f44588k1;
        int i7 = cVar.f21765a;
        int i10 = cVar.f21765a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.M0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25099w2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25085u1);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.B2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.E0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25020j0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25120z2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25113y2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        if (this.Z1 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.Z1.getSystemService("audio");
            boolean z9 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z9 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z9);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView n1 = n1();
                if (z9) {
                    i7 = 42;
                } else {
                    i7 = 43;
                }
                n1.j(i7, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z9) {
        if (!this.T4 && this.W3) {
            if (z9) {
                this.T4 = true;
                D1(false, this.O4);
                return;
            }
            d1();
            this.f28619b.removeView(this.V3);
            this.V3 = null;
            this.f44632t4.setVisibility(8);
            this.f28619b.invalidate();
            this.W3 = false;
            this.P1.X = true;
            this.H1.invalidate();
            this.S3.setVisibility(8);
            if (this.f44585j2) {
                this.f44585j2 = false;
                Q0(true);
            }
            U0();
        }
    }

    public final org.telegram.ui.Components.voip.r g1() {
        int i7 = 0;
        while (true) {
            k30 k30Var = this.H1;
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
            this.Z1.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            z10 z10Var = this.R3;
            if (z10Var.f39313r != null) {
                return;
            }
            boolean z9 = f44545x5;
            k30 k30Var = this.H1;
            int i7 = 0;
            if (z9) {
                if (this.f44577h4 != null) {
                    k30Var.getViewTreeObserver().removeOnPreDrawListener(this.f44577h4);
                    this.f44577h4 = null;
                }
                ArrayList arrayList = new ArrayList();
                f40 f40Var = this.f44569f4;
                ArrayList arrayList2 = this.P3;
                ArrayList arrayList3 = this.Q3;
                if (s3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.r rVar = yVar.f39629c;
                        if (rVar != null) {
                            rVar.setRenderer(null);
                            org.telegram.ui.Components.h10 h10Var = yVar.d;
                            if (h10Var != null) {
                                h10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar2 = yVar.f39632e;
                            if (rVar2 != null) {
                                rVar2.setRenderer(null);
                            }
                            arrayList.add(yVar.f39656x);
                            yVar.b(false);
                            yVar.animate().alpha(0.0f).setListener(new u20(this, yVar, 0));
                        }
                    }
                    this.G4 = false;
                    f40Var.H(this.f44565e4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) arrayList3.get(i11);
                        if (yVar2.f39632e != null && ((s3Var2 = yVar2.f39656x) == null || !s3Var2.equals(s3Var))) {
                            arrayList.add(yVar2.f39656x);
                            yVar2.b(false);
                            org.telegram.ui.Components.h10 h10Var2 = yVar2.d;
                            if (h10Var2 != null) {
                                h10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar3 = yVar2.f39629c;
                            if (rVar3 != null) {
                                rVar3.setRenderer(null);
                            }
                            yVar2.animate().alpha(0.0f).setListener(new u20(this, yVar2, 1));
                        }
                    }
                    this.G4 = true;
                    f40Var.f45438r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(28, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = k30Var.getViewTreeObserver();
                lh lhVar = new lh(this, s3Var, !z10Var.f39293b);
                this.f44577h4 = lhVar;
                viewTreeObserver.addOnPreDrawListener(lhVar);
                return;
            }
            if (this.f44577h4 != null) {
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this.f44577h4);
                this.f44577h4 = null;
            }
            if (s3Var != null) {
                v10 v10Var = this.f44561d4;
                if (v10Var.getVisibility() != 0) {
                    v10Var.setVisibility(0);
                    org.telegram.ui.Components.i10 i10Var = this.f44573g4;
                    i10Var.G(v10Var, false);
                    this.f44585j2 = true;
                    if (!z10Var.f39293b) {
                        ArrayList arrayList4 = i10Var.f34499e;
                        v4.b0 b0Var = (v4.b0) v10Var.getLayoutManager();
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
                    kw kwVar = new kw(1, this, s3Var);
                    this.f44577h4 = kwVar;
                    viewTreeObserver2.addOnPreDrawListener(kwVar);
                    return;
                }
                z10Var.j(s3Var);
                org.telegram.messenger.g0.b4(v10Var);
            } else if (k30Var.getVisibility() != 0) {
                k30Var.setVisibility(0);
                Q0(false);
                this.f44585j2 = true;
                ViewTreeObserver viewTreeObserver3 = k30Var.getViewTreeObserver();
                w20 w20Var = new w20(this, 0);
                this.f44577h4 = w20Var;
                viewTreeObserver3.addOnPreDrawListener(w20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = k30Var.getViewTreeObserver();
                w20 w20Var2 = new w20(this, 1);
                this.f44577h4 = w20Var2;
                viewTreeObserver4.addOnPreDrawListener(w20Var2);
            }
        }
    }

    public final int k1() {
        Integer num = this.f44614p5;
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
        TLRPC.Chat chat = this.Q2;
        if (chat == null) {
            return 0L;
        }
        return chat.f26956id;
    }

    @Override
    public final boolean m0() {
        f44543v5 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.ui.Components.p10.k(getContext());
        return false;
    }

    public final void m1(boolean z9) {
        boolean z10;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f44588k1;
        int i7 = cVar.f21765a;
        int i10 = cVar.f21765a;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(l1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(l1());
            String K = org.telegram.messenger.t3.K(this.Q2, false);
            if (!TextUtils.isEmpty(K)) {
                str = org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(i10).U2, "/", K, new StringBuilder());
            } else if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.l1(this.Q2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new bi.u9(this, N0, z9, 6));
                return;
            }
            z1(null, str, true, z9);
        } else if (this.R2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.r3 r3Var = this.R2;
                exportgroupcallinvite.call = r3Var.g(r3Var.f25221a);
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                exportgroupcallinvite.can_self_unmute = z10;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.cd(this, i11, z9, 2));
            }
        }
    }

    public final UndoView n1() {
        if (!f44545x5) {
            z10 z10Var = this.R3;
            if (z10Var.f39293b) {
                return z10Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f44548a2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f28619b.removeView(undoViewArr[0]);
            this.f28619b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void o1() {
        VoIPService sharedInstance;
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f44593l2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f44593l2 = true;
            this.f44635u2.addAll(this.R2.f25226g);
            this.f44639v2.addAll(this.f44575h2);
            this.f44643w2.addAll(this.R2.f25228j);
            this.f44647x2.addAll(this.R2.f25231m);
            this.f44651y2.addAll(this.R2.f25230l);
            this.K3 = sharedInstance.getCallState();
            if (this.R2 == null) {
                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                this.R2 = r3Var;
                this.f44573g4.f34498c = r3Var;
                this.R3.setGroupCall(r3Var);
                this.f44569f4.f45434c = this.R2;
            }
            nh.h hVar = this.T1;
            if (hVar != null) {
                hVar.D0(this.f44588k1.f21765a, this.R2.g(false));
            }
            this.F1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.R2.f25224e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            j30 j30Var = this.M1;
            if (j30Var != null && j30Var.getVisibility() == 0) {
                this.f44615q1.c(2131230918, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131743367, null), false, true);
                S1(true);
                if (org.telegram.messenger.t3.W(this.Q2)) {
                    i7 = 2131743484;
                } else {
                    i7 = 2131743383;
                }
                this.f44603n3.setText(org.telegram.messenger.id.M0(i7, null));
                k30 k30Var = this.H1;
                k30Var.setVisibility(0);
                org.telegram.ui.ActionBar.r0 r0Var = this.f44557c3;
                r0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(j30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(j30Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var = this.L1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k5Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var2 = this.N1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(k5Var2, property2, 0.0f), ObjectAnimator.ofFloat(k5Var2, property3, 0.0f), ObjectAnimator.ofFloat(k5Var2, property, 0.0f), ObjectAnimator.ofFloat(r0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40367g);
                animatorSet.addListener(new x20(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        S1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            H1(0.0f);
        }
        k30 k30Var = this.H1;
        if (k30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(k30Var);
        }
        v10 v10Var = this.f44561d4;
        if (v10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(v10Var);
        }
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        t20 t20Var = this.f44616q2;
        if (t20Var != null) {
            t20Var.b(false, false);
        } else if (this.W3) {
            f1(true);
        } else if (this.R3.f39293b) {
            h1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        t20 t20Var = this.f44616q2;
        if (t20Var != null && VoIPService.getSharedInstance() != null) {
            t20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.Z1;
        launchActivity.Z0.add(this.f44600m4);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        this.K3 = i7;
        T1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public final void p1(final long j3, final boolean z9) {
        if (this.R2 != null) {
            org.telegram.messenger.c cVar = this.f44588k1;
            final TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(j3));
            if (a22 != null) {
                final org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.R2;
                invitetogroupcall.call = r3Var.g(r3Var.f25221a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.f27105id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f21765a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        c40 c40Var = c40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.qp.s1(c40Var.f44588k1.f21765a).O3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.h3(new bi.w2(c40Var, j10, u1VarArr2, a22, 20));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new bi.o(c40Var, u1VarArr2, z9, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new d10(this, u1VarArr, sendRequest, 0), 500L);
                }
            }
        }
    }

    public final boolean q1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f44611p2 - L;
        if (this.f28648s0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f28648s0) / ((L - this.f28648s0) - org.telegram.messenger.g0.L(14.0f)));
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
            RadialProgressView radialProgressView = this.V1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ch, false));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f44553b3;
            if (r0Var != null) {
                int i7 = org.telegram.ui.ActionBar.k6.Vg;
                r0Var.O(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
                r0Var.O(org.telegram.ui.ActionBar.k6.x0(null, i7, false), true);
                r0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false);
            K1(this.f44608o3, x02);
            K1(this.f44612p3, x02);
            K1(this.f44572g3, x02);
            K1(this.f44576h3, x02);
            K1(this.f44603n3, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972jh, false));
            K1(this.f44564e3, x02);
            K1(this.f44568f3, x02);
            K1(this.f44581i3, x02);
            K1(this.j3, x02);
            K1(this.f44590k3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        ti.o oVar;
        super.show();
        org.telegram.ui.Components.voip.g1 g1Var = org.telegram.ui.Components.voip.g1.f39217w;
        if (g1Var != null && (oVar = g1Var.f39218a) != null && oVar.e()) {
            org.telegram.ui.Components.voip.g1 g1Var2 = org.telegram.ui.Components.voip.g1.f39217w;
            if (g1Var2.f39218a != null) {
                org.telegram.ui.Components.voip.q0 q0Var = g1Var2.f39221e;
                g1Var2.f39221e = null;
                g1Var2.f39219b.f39140a = null;
                g1Var2.f39218a.a(new org.telegram.ui.Components.fx(7, g1Var2, q0Var));
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(13));
            }
        }
    }

    public final boolean t1() {
        if (!u1() || this.R2.f25225f.isEmpty() || (((org.telegram.messenger.s3) this.R2.f25225f.get(0)).f25411c != 0.0f && ((org.telegram.messenger.s3) this.R2.f25225f.get(0)).f25411c < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean u1() {
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && r3Var.f25222b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void v1(org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        long j3;
        if (!this.f44602n2) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
            if (f2Var instanceof an) {
                boolean pa2 = ((an) f2Var).pa();
                this.f44602n2 = true;
                this.f44607o2 = true;
                vn vnVar = new vn(v2Var, editTextBoldCursor, z9, u1Var, 7);
                if (pa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(vnVar, j3);
                return;
            }
            this.f44602n2 = true;
            this.f44607o2 = true;
            if (v2Var != null) {
                v2Var.A0(true);
            } else if (u1Var != null) {
                u1Var.l(true);
            }
            if (z9) {
                org.telegram.messenger.g0.i3(new sg(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void x1() {
        f44547z5 = true;
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(false);
        }
        i30 i30Var = this.C1;
        org.telegram.ui.Components.y61 y61Var = i30Var.f37772w;
        if (y61Var != null) {
            y61Var.c(false);
        }
        i30Var.F = true;
        this.f44650y1.r();
    }

    public final void y1() {
        f44547z5 = false;
        this.G1.f();
        v10 v10Var = this.f44561d4;
        if (v10Var.getVisibility() == 0) {
            this.f44573g4.G(v10Var, false);
        }
        if (f44545x5) {
            this.f44569f4.I(this.f44565e4, false);
        }
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        i30 i30Var = this.C1;
        org.telegram.ui.Components.y61 y61Var = i30Var.f37772w;
        if (y61Var != null) {
            y61Var.c(true);
        }
        i30Var.F = false;
        this.f44650y1.s();
    }

    public final void z1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.z1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
