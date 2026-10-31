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
public final class b50 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us, VoIPService.StateListener, fe.e {
    public static b50 f35989u5;
    public static boolean f35990v5;
    public static boolean f35991w5;
    public static boolean f35992x5;
    public static volatile org.telegram.messenger.s5 f35993y5 = new org.telegram.messenger.s5("updateTextureLightningQueue", true);
    public static boolean f35994z5;
    public final ImageView A1;
    public final org.telegram.ui.Components.bi0 A2;
    public final Paint A3;
    public final View A4;
    public org.telegram.ui.Components.mj0 B1;
    public final org.telegram.ui.Components.bi0 B2;
    public final a50[] B3;
    public final View B4;
    public final g40 C1;
    public boolean C2;
    public float C3;
    public GradientDrawable C4;
    public final org.telegram.ui.Components.f6 D1;
    public final org.telegram.ui.Components.m9 D2;
    public a50 D3;
    public final int[] D4;
    public final r20 E1;
    public final org.telegram.ui.Components.m9 E2;
    public a50 E3;
    public final v20 E4;
    public final y30 F1;
    public float F2;
    public long F3;
    public boolean F4;
    public final v40 G1;
    public float G2;
    public float G3;
    public boolean G4;
    public final i40 H1;
    public float H2;
    public float H3;
    public RenderNode H4;
    public final p30 I1;
    public RadialGradient I2;
    public boolean I3;
    public float I4;
    public final TextView J1;
    public final Matrix J2;
    public boolean J3;
    public boolean J4;
    public final n30 K1;
    public final Paint K2;
    public int K3;
    public final String[] K4;
    public final org.telegram.ui.ActionBar.u5 L1;
    public final q40 L2;
    public float L3;
    public ObjectAnimator L4;
    public final h40 M1;
    public float M2;
    public int M3;
    public ObjectAnimator M4;
    public final org.telegram.ui.ActionBar.u5 N1;
    public float N2;
    public boolean N3;
    public final u30 N4;
    public final p40 O1;
    public ValueAnimator O2;
    public final int[] O3;
    public org.telegram.ui.Cells.h4 O4;
    public final org.telegram.ui.Components.zy P1;
    public TLRPC.InputPeer P2;
    public final ArrayList P3;
    public org.telegram.ui.Components.voip.k P4;
    public final ImageReceiver Q1;
    public TLRPC.Chat Q2;
    public final ArrayList Q3;
    public org.telegram.ui.Components.voip.r Q4;
    public int R1;
    public org.telegram.messenger.u3 R2;
    public final y20 R3;
    public org.telegram.ui.Components.y10 R4;
    public final ImageView S1;
    public final boolean S2;
    public final d30 S3;
    public boolean S4;
    public final dh.k T1;
    public final String T2;
    public final q30 T3;
    public boolean T4;
    public final int U1;
    public final w40 U2;
    public float U3;
    public int U4;
    public final RadialProgressView V1;
    public final q20 V2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout V3;
    public AnimatorSet V4;
    public final Drawable W1;
    public final s20 W2;
    public boolean W3;
    public c40 W4;
    public final View X1;
    public final Paint X2;
    public boolean X3;
    public int X4;
    public AnimatorSet Y1;
    public ValueAnimator Y2;
    public org.telegram.ui.Components.b40 Y3;
    public int Y4;
    public LaunchActivity Z1;
    public float Z2;
    public j40 Z3;
    public int Z4;
    public final UndoView[] a2;
    public final LinearLayout f35995a3;
    public Boolean f35996a4;
    public int f35997a5;
    public final org.telegram.ui.Cells.j f35998b2;
    public final org.telegram.ui.ActionBar.t0 f35999b3;
    public int f36000b4;
    public int f36001b5;
    public boolean f36002c2;
    public final org.telegram.ui.ActionBar.t0 f36003c3;
    public boolean f36004c4;
    public int f36005c5;
    public org.telegram.ui.Components.q30 f36006d2;
    public final org.telegram.ui.ActionBar.t0 f36007d3;
    public final u20 f36008d4;
    public int f36009d5;
    public org.telegram.ui.Components.q30 f36010e2;
    public final org.telegram.ui.ActionBar.b1 f36011e3;
    public final org.telegram.ui.Components.tk0 f36012e4;
    public int f36013e5;
    public int f36014f2;
    public final org.telegram.ui.ActionBar.b1 f36015f3;
    public final e50 f36016f4;
    public int f36017f5;
    public g.b f36018g2;
    public final org.telegram.ui.ActionBar.b1 f36019g3;
    public final org.telegram.ui.Components.z10 f36020g4;
    public int f36021g5;
    public final ArrayList f36022h2;
    public final org.telegram.ui.ActionBar.b1 f36023h3;
    public ViewTreeObserver.OnPreDrawListener f36024h4;
    public int f36025h5;
    public final a30 f36026i1;
    public x30 f36027i2;
    public final org.telegram.ui.ActionBar.b1 f36028i3;
    public final org.telegram.ui.Components.voip.g f36029i4;
    public int f36030i5;
    public final f20 f36031j1;
    public boolean f36032j2;
    public final org.telegram.ui.ActionBar.b1 f36033j3;
    public boolean f36034j4;
    public int f36035j5;
    public final org.telegram.messenger.c f36036k1;
    public long f36037k2;
    public final org.telegram.ui.ActionBar.b1 f36038k3;
    public final ArrayList f36039k4;
    public int f36040k5;
    public final l20 l1;
    public boolean f36041l2;
    public final org.telegram.ui.ActionBar.b1 f36042l3;
    public boolean l4;
    public int f36043l5;
    public final org.telegram.ui.Components.voip.b2 f36044m1;
    public final RectF f36045m2;
    public final org.telegram.ui.ActionBar.b1 f36046m3;
    public final t10 f36047m4;
    public int f36048m5;
    public final org.telegram.ui.Components.voip.b2 f36049n1;
    public boolean f36050n2;
    public final org.telegram.ui.ActionBar.b1 f36051n3;
    public final p20 f36052n4;
    public final d40 f36053n5;
    public final org.telegram.ui.Components.voip.b2 f36054o1;
    public boolean f36055o2;
    public final org.telegram.ui.ActionBar.b1 f36056o3;
    public final org.telegram.ui.Components.voip.m0 f36057o4;
    public Boolean f36058o5;
    public final org.telegram.ui.Components.voip.b2 f36059p1;
    public float f36060p2;
    public final org.telegram.ui.ActionBar.b1 f36061p3;
    public final t10 f36062p4;
    public Integer p5;
    public final org.telegram.ui.Components.voip.b2 f36063q1;
    public s30 f36064q2;
    public final LinearLayout f36065q3;
    public boolean f36066q4;
    public final fe.b f36067q5;
    public final org.telegram.ui.Components.voip.b2 f36068r1;
    public TLRPC.Peer f36069r2;
    public final TextView f36070r3;
    public final m4 f36071r4;
    public final fe.b f36072r5;
    public final org.telegram.ui.Components.voip.b2 f36073s1;
    public TLObject f36074s2;
    public final z40 f36075s3;
    public final LongSparseIntArray f36076s4;
    public final fe.f f36077s5;
    public final m20 f36078t1;
    public final Paint f36079t2;
    public final hh.i f36080t3;
    public final b30 f36081t4;
    public final fe.b f36082t5;
    public final ImageView f36083u1;
    public final ArrayList f36084u2;
    public t10 f36085u3;
    public final z20 f36086u4;
    public final Paint f36087v1;
    public final ArrayList f36088v2;
    public org.telegram.ui.Components.z20 f36089v3;
    public LinearLayout f36090v4;
    public final j30 f36091w1;
    public final ArrayList f36092w2;
    public int f36093w3;
    public boolean f36094w4;
    public final i30 f36095x1;
    public final ArrayList f36096x2;
    public boolean f36097x3;
    public final org.telegram.ui.Components.bi0 f36098x4;
    public final g30 f36099y1;
    public final ArrayList f36100y2;
    public boolean y3;
    public int f36101y4;
    public final ImageView f36102z1;
    public int f36103z2;
    public final Paint f36104z3;
    public boolean f36105z4;

    public b50(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.u3 u3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.p6) null, true, true);
        int i10;
        final b50 b50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f36087v1 = new Paint(1);
        this.a2 = new UndoView[2];
        this.f36022h2 = new ArrayList();
        this.f36045m2 = new RectF();
        this.f36079t2 = new Paint(1);
        this.f36084u2 = new ArrayList();
        this.f36088v2 = new ArrayList();
        this.f36092w2 = new ArrayList();
        this.f36096x2 = new ArrayList();
        this.f36100y2 = new ArrayList();
        this.f36080t3 = new hh.i(new t10(this, 8));
        this.f36093w3 = 0;
        this.f36097x3 = false;
        this.f36104z3 = new Paint(7);
        this.A3 = new Paint(7);
        this.B3 = new a50[8];
        this.C3 = 1.0f;
        this.N3 = true;
        this.O3 = new int[4];
        this.P3 = new ArrayList();
        this.Q3 = new ArrayList();
        this.f36029i4 = new org.telegram.ui.Components.voip.g();
        this.f36039k4 = new ArrayList();
        this.f36047m4 = new t10(this, 0);
        this.f36052n4 = new p20(this);
        this.f36057o4 = new org.telegram.ui.Components.voip.m0(4);
        this.f36062p4 = new t10(this, 1);
        this.f36066q4 = false;
        this.f36071r4 = new m4(this, 7);
        this.f36076s4 = new LongSparseIntArray();
        this.D4 = new int[2];
        this.G4 = true;
        this.K4 = new String[2];
        this.U4 = -1;
        this.f36053n5 = new d40(this);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
        this.f36067q5 = new fe.b(2, this, grVar, 350L);
        this.f36072r5 = new fe.b(3, this, grVar, 220L, true);
        this.f36077s5 = new fe.f(4, this, grVar, 350L);
        this.f36082t5 = new fe.b(5, this, grVar, 350L);
        org.telegram.messenger.i0.S(getWindow());
        D0();
        this.f36036k1 = cVar;
        this.R2 = u3Var;
        this.P2 = inputPeer;
        this.Q2 = chat;
        this.T2 = str;
        this.f21583a = cVar.f14863a;
        this.S2 = z10;
        this.I0 = new org.telegram.ui.Components.ro0();
        this.P0 = true;
        this.Q0 = true;
        this.U1 = org.telegram.messenger.vp.r1(this.f21583a).f18957y7.f17857x.b0();
        this.U = true;
        f35992x5 = false;
        f35991w5 = false;
        f35994z5 = false;
        this.f21623y0 = new k30(this);
        this.f21613s = true;
        this.f21606n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f21618w = true;
        this.F0 = -1;
        this.N4 = new u30(this);
        setOnDismissListener(new w10(this, 0));
        z0();
        v40 v40Var = new v40(this, launchActivity);
        this.G1 = v40Var;
        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(true);
        int i11 = org.telegram.ui.ActionBar.t6.f20957eh;
        ipVar.b(org.telegram.ui.ActionBar.t6.v0(i11));
        ipVar.d();
        y30 y30Var = new y30(this, launchActivity, ipVar);
        this.F1 = y30Var;
        y30Var.setSubtitle("");
        y30Var.getSubtitleTextView().setVisibility(0);
        y30Var.n();
        y30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.i0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.i0.V3(1.0f, y30Var.getAdditionalSubtitleTextView(), this.l4, false);
        y30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.t6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.t6.Zg;
        org.telegram.ui.ActionBar.a7.m(y30Var, 6, i12, null);
        y30Var.setBackButtonImage(2131231241);
        y30Var.setOccupyStatusBar(false);
        y30Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.t6.Vg;
        org.telegram.ui.ActionBar.a7.m(y30Var, 1, i13, null);
        org.telegram.ui.ActionBar.a7.m(y30Var, 3, org.telegram.ui.ActionBar.t6.f21332z8, null);
        org.telegram.ui.ActionBar.a7.e(y30Var, i13);
        org.telegram.ui.ActionBar.a7.m(y30Var, 6, i12, null);
        y30Var.setActionBarMenuOnItemClick(new f40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f36069r2 = tL_peerUser;
            i10 = i13;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i10 = i13;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.f36069r2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.f36069r2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.f36069r2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new q10(this, 3);
        cVar.b().c(this, org.telegram.messenger.zs.f19713w2);
        cVar.b().c(this, org.telegram.messenger.zs.M0);
        cVar.b().c(this, org.telegram.messenger.zs.T);
        cVar.b().c(this, org.telegram.messenger.zs.f19699u1);
        cVar.b().c(this, org.telegram.messenger.zs.B2);
        cVar.b().c(this, org.telegram.messenger.zs.E0);
        cVar.b().c(this, org.telegram.messenger.zs.f19632j0);
        cVar.b().c(this, org.telegram.messenger.zs.f19676r);
        cVar.b().c(this, org.telegram.messenger.zs.f19733z2);
        cVar.b().c(this, org.telegram.messenger.zs.f19727y2);
        cVar.b().c(this, org.telegram.messenger.zs.R3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.N4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.D2);
        this.W1 = launchActivity.getResources().getDrawable(2131232725).mutate();
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624342, org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(46.0f), true, null);
        this.A2 = bi0Var;
        this.B2 = new org.telegram.ui.Components.bi0(2131624043, org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(46.0f), true, null);
        g40 g40Var = new g40(this, launchActivity);
        this.C1 = g40Var;
        this.f21586b = g40Var;
        g40Var.setClipToPadding(false);
        this.f21586b.setFocusable(true);
        this.f21586b.setFocusableInTouchMode(true);
        this.f21586b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f21586b;
        int i14 = this.f21615t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        this.f21586b.setKeepScreenOn(true);
        this.f21586b.setClipChildren(false);
        this.Q1 = new ImageReceiver(this.f21586b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(launchActivity);
            this.L1 = u5Var;
            u5Var.setGravity(17);
            u5Var.setTextColor(-1);
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setTextSize(18);
            u5Var.k(org.telegram.messenger.cd.K0(2131743461));
            this.f21586b.addView(u5Var, w7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            h40 h40Var = new h40(this, launchActivity);
            this.M1 = h40Var;
            h40Var.setGravity(17);
            h40Var.setTextColor(-1);
            h40Var.setTypeface(org.telegram.messenger.i0.o());
            h40Var.setTextSize(60);
            this.f21586b.addView(h40Var, w7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(launchActivity);
            this.N1 = u5Var2;
            u5Var2.setGravity(17);
            u5Var2.setTextColor(-1);
            u5Var2.setTypeface(org.telegram.messenger.i0.o());
            u5Var2.setTextSize(18);
            this.f21586b.addView(u5Var2, w7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (t1()) {
            q40 q40Var = new q40(this, launchActivity);
            this.L2 = q40Var;
            this.f21586b.addView(q40Var, w7.b6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        i40 i40Var = new i40(this, launchActivity);
        this.H1 = i40Var;
        i40Var.setClipToPadding(false);
        i40Var.setClipChildren(false);
        p40 p40Var = new p40(this);
        this.O1 = p40Var;
        p40Var.f47945o = grVar;
        p40Var.d = 350L;
        p40Var.f47967c = 350L;
        p40Var.e = 350L;
        p40Var.S();
        i40Var.setItemAnimator(p40Var);
        i40Var.setOnScrollListener(new e20(this));
        i40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.zy zyVar = new org.telegram.ui.Components.zy(f35991w5 ? 6 : 2, i40Var);
        this.P1 = zyVar;
        i40Var.setLayoutManager(zyVar);
        f20 f20Var = new f20(this);
        this.f36031j1 = f20Var;
        zyVar.z1(f20Var);
        i40Var.i(new g20(this));
        zyVar.C1();
        this.f21586b.addView(i40Var, w7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        i40Var.setAdapter(v40Var);
        i40Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.a7.J(org.telegram.ui.ActionBar.t6.Sg, i40Var);
        i40Var.setOnItemClickListener(new a7(this, launchActivity, u3Var, 14));
        i40Var.setOnItemLongClickListener(new q10(this, 4));
        if (t1()) {
            z40 z40Var = new z40(this, getContext());
            this.f36075s3 = z40Var;
            this.f21586b.addView(z40Var, w7.b6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(launchActivity);
        this.f36012e4 = tk0Var;
        this.f21586b.addView(tk0Var, w7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        e50 e50Var = new e50(u3Var, this.f21583a, this);
        this.f36016f4 = e50Var;
        tk0Var.setAdapter(e50Var);
        s4.r rVar = new s4.r(6, false);
        tk0Var.setLayoutManager(rVar);
        rVar.z1(new i20(this));
        tk0Var.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) {
            public final b50 f41337b;

            {
                this.f41337b = this;
            }

            @Override
            public final void f(int i15, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
                        org.telegram.messenger.v3 videoParticipant = y10Var.getVideoParticipant();
                        b50 b50Var2 = this.f41337b;
                        if (videoParticipant == null) {
                            b50Var2.g1(new org.telegram.messenger.v3(y10Var.getParticipant(), false));
                            return;
                        } else {
                            b50Var2.g1(y10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        b50 b50Var3 = this.f41337b;
                        b50Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
                        if (kVar.getParticipant() != null) {
                            b50Var3.g1(kVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f47945o = grVar;
        jVar.d = 350L;
        jVar.f47967c = 350L;
        jVar.e = 350L;
        tk0Var.setItemAnimator(new j20(this));
        tk0Var.setOnScrollListener(new k20(this));
        e50Var.H(tk0Var, false, false);
        tk0Var.setVisibility(8);
        l20 l20Var = new l20(this, launchActivity);
        this.l1 = l20Var;
        int v02 = org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.f21304xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.J2 = new Matrix();
        this.I2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.K2 = paint;
        paint.setShader(this.I2);
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(9);
        this.D2 = m9Var;
        org.telegram.ui.Components.m9 m9Var2 = new org.telegram.ui.Components.m9(12);
        this.E2 = m9Var2;
        m9Var.f28380a = org.telegram.messenger.i0.L(62.0f) * 0.45454547f;
        m9Var.f28381b = org.telegram.messenger.i0.L(72.0f) * 0.45454547f;
        m9Var.b();
        m9Var2.f28380a = org.telegram.messenger.i0.L(65.0f) * 0.45454547f;
        m9Var2.f28381b = org.telegram.messenger.i0.L(75.0f) * 0.45454547f;
        m9Var2.b();
        int i15 = org.telegram.ui.ActionBar.t6.f21287wh;
        m9Var.d.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.v0(i15), 38));
        m9Var2.d.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.v0(i15), 76));
        org.telegram.ui.Components.voip.b2 b2Var = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36059p1 = b2Var;
        b2Var.setCheckable(true);
        b2Var.setTextSize(12);
        l20Var.a(b2Var);
        b2Var.setOnClickListener(new r10(this, 7));
        org.telegram.ui.Components.voip.b2 b2Var2 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36054o1 = b2Var2;
        b2Var2.setCheckable(true);
        b2Var2.setTextSize(12);
        b2Var2.d(false, false);
        b2Var2.setCrossOffset(-org.telegram.messenger.i0.N(3.5f));
        b2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.cd.K0(2131743515), false, false);
        org.telegram.ui.Components.voip.b2 b2Var3 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36044m1 = b2Var3;
        b2Var3.setCheckable(true);
        b2Var3.setTextSize(12);
        b2Var3.d(false, false);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(launchActivity);
        b2Var3.addView(ei0Var, w7.b6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.bi0 bi0Var2 = new org.telegram.ui.Components.bi0(2131623962, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        this.f36098x4 = bi0Var2;
        ei0Var.setAnimation(bi0Var2);
        b2Var3.setOnClickListener(new r10(this, 10));
        l20Var.a(b2Var3);
        org.telegram.ui.Components.voip.b2 b2Var4 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36049n1 = b2Var4;
        b2Var4.setCheckable(true);
        b2Var4.setTextSize(12);
        b2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.R1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        b2Var4.addView(imageView, w7.b6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        b2Var4.setOnClickListener(new r10(this, 11));
        l20Var.a(b2Var4);
        l20Var.a(b2Var2);
        org.telegram.ui.Components.voip.b2 b2Var5 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36063q1 = b2Var5;
        b2Var5.setTextSize(12);
        b2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.f21196rh), 0.3f, false, org.telegram.messenger.cd.K0(2131743390), false, false);
        b2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final b50 f42569b;

            {
                this.f42569b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        b50 b50Var2 = this.f42569b;
                        LaunchActivity launchActivity2 = b50Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            b50Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                b50Var2.a2[0].d(1, false);
                                if (b50Var2.f36064q2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    s30 s30Var = new s30(b50Var2, launchActivity, z11);
                                    b50Var2.f36064q2 = s30Var;
                                    s30Var.setBottomPadding(b50Var2.f21586b.getPaddingBottom());
                                    b50Var2.f21589c.addView(b50Var2.f36064q2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            b50Var2.Q1(true, false);
                            b50Var2.P1(false);
                            b50Var2.R2.z();
                            b50Var2.Q0(true);
                            b50Var2.l1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        b50 b50Var3 = this.f42569b;
                        b50Var3.R3.e();
                        org.telegram.messenger.u3 u3Var2 = b50Var3.R2;
                        if (u3Var2 != null && !u3Var2.j()) {
                            b50Var3.L1();
                            b50.v1(launchActivity, new t10(b50Var3, 5), false, false);
                            return;
                        }
                        b50Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.b2 b2Var6 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36068r1 = b2Var6;
        b2Var6.setCheckable(true);
        b2Var6.b(true, false);
        b2Var6.setTextSize(12);
        b2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.cd.K0(2131743320), false, false);
        m20 m20Var = new m20(this, launchActivity);
        this.f36078t1 = m20Var;
        m20Var.setAnimation(bi0Var);
        m20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.b2 b2Var7 = new org.telegram.ui.Components.voip.b2(launchActivity, 50.0f);
        this.f36073s1 = b2Var7;
        b2Var7.setDrawBackground(false);
        b2Var7.setTextSize(12);
        b2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        b2Var7.addView(m20Var, w7.b6.e(50, 50, 49));
        l20Var.a(b2Var7);
        b2Var7.setOnClickListener(new o20(this));
        l20Var.a(b2Var6);
        l20Var.a(b2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f36083u1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232797);
        b2Var7.addView(imageView2, w7.b6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.R2 != null && t1() && !this.R2.j()) {
            imageView2.setVisibility(0);
            m20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.V1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.Ch));
        y30Var.setAlpha(0.0f);
        y30Var.getBackButton().setScaleX(0.9f);
        y30Var.getBackButton().setScaleY(0.9f);
        y30Var.getBackButton().setTranslationX(-org.telegram.messenger.i0.L(14.0f));
        y30Var.getTitleTextView().setTranslationY(org.telegram.messenger.i0.L(23.0f));
        y30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(20.0f));
        y30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.v0(i10));
        this.f35999b3 = t0Var;
        t0Var.setLongClickEnabled(false);
        t0Var.setIcon(2131231245);
        t0Var.setContentDescription(org.telegram.messenger.cd.K0(2131754839));
        t0Var.setSubMenuOpenSide(2);
        t0Var.setDelegate(new q10(this, 0));
        int i16 = org.telegram.ui.ActionBar.t6.Wg;
        org.telegram.ui.ActionBar.a7.S(t0Var, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.v0(i16), 6), null, org.telegram.ui.ActionBar.a7.N(i16));
        t0Var.setOnClickListener(new r10(this, 0));
        t0Var.O(org.telegram.ui.ActionBar.t6.v0(i10), false);
        t0Var.O(org.telegram.ui.ActionBar.t6.v0(i10), true);
        org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.v0(i10));
        this.f36003c3 = t0Var2;
        t0Var2.setLongClickEnabled(false);
        t0Var2.setIcon(2131232428);
        t0Var2.setContentDescription(org.telegram.messenger.cd.K0(2131754808));
        org.telegram.ui.ActionBar.a7.S(t0Var2, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.v0(i16), 6), null, org.telegram.ui.ActionBar.a7.N(i16));
        t0Var2.setOnClickListener(new r10(this, 1));
        org.telegram.ui.ActionBar.t0 t0Var3 = new org.telegram.ui.ActionBar.t0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.v0(i10));
        this.f36007d3 = t0Var3;
        t0Var3.setLongClickEnabled(false);
        t0Var3.setIcon(2131232351);
        t0Var3.setContentDescription(org.telegram.messenger.cd.K0(2131754808));
        org.telegram.ui.ActionBar.a7.S(t0Var3, org.telegram.ui.ActionBar.t6.g0(org.telegram.ui.ActionBar.t6.v0(i16), 6), null, org.telegram.ui.ActionBar.a7.N(i16));
        t0Var3.setOnClickListener(new r10(this, 2));
        q20 q20Var = new q20(this, launchActivity, launchActivity);
        this.V2 = q20Var;
        r20 r20Var = new r20(launchActivity);
        this.E1 = r20Var;
        r20Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.X2 = paint2;
        paint2.setColor(-12761513);
        s20 s20Var = new s20(this, getContext());
        this.W2 = s20Var;
        org.telegram.ui.ActionBar.a7.V(s20Var, i10, this.I0);
        s20Var.setTextSize(1, 11.0f);
        s20Var.setText(org.telegram.messenger.cd.K0(2131743500));
        s20Var.setMaxLines(1);
        s20Var.setGravity(17);
        s20Var.setTypeface(org.telegram.messenger.i0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        s20Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f));
        s20Var.setTag(-1);
        if (!t1()) {
            s20Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f35995a3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(q20Var, w7.b6.l(1.0f, 0, -2));
        linearLayout.addView(s20Var, w7.b6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f21586b.addView(r20Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f21586b.addView(linearLayout, w7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f21586b.addView(y30Var, w7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f36065q3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(t0Var3, w7.b6.o(48, 48));
        linearLayout2.addView(t0Var2, w7.b6.o(48, 48));
        linearLayout2.addView(t0Var, w7.b6.o(48, 48));
        this.f21586b.addView(linearLayout2, w7.b6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.X1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, null);
        this.f21586b.addView(view, w7.b6.c(1.0f, -1));
        for (int i17 = 0; i17 < 2; i17++) {
            this.a2[i17] = new t20(this, launchActivity);
            this.a2[i17].setAdditionalTranslationY(org.telegram.messenger.i0.L(10.0f));
            this.a2[i17].setTranslationZ(org.telegram.messenger.i0.L(5.0f));
            this.f21586b.addView(this.a2[i17], w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.j jVar2 = new org.telegram.ui.Cells.j(launchActivity, true);
        this.f35998b2 = jVar2;
        jVar2.setTag(2131296437, 240);
        this.f35999b3.g(jVar2, org.telegram.messenger.i0.L(48.0f));
        this.f35999b3.setShowSubmenuByMove(false);
        int i18 = org.telegram.ui.ActionBar.t6.Sg;
        org.telegram.ui.ActionBar.a7.S(jVar2, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.v0(i18), 6, 6), null, org.telegram.ui.ActionBar.a7.N(i18));
        org.telegram.ui.ActionBar.t0 t0Var4 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d = t0Var4.d(1, 0, null, org.telegram.messenger.cd.K0(2131743427), true, true, t0Var4.m0);
        this.f36042l3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.t0 t0Var5 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d10 = t0Var5.d(2, 0, null, org.telegram.messenger.cd.K0(2131743380), true, true, t0Var5.m0);
        this.f36046m3 = d10;
        d10.m(false, true);
        int i19 = org.telegram.ui.ActionBar.t6.f21069kh;
        d.setCheckColor(i19);
        d.d(org.telegram.ui.ActionBar.t6.v0(i19), org.telegram.ui.ActionBar.t6.v0(i19));
        d10.setCheckColor(i19);
        d10.d(org.telegram.ui.ActionBar.t6.v0(i19), org.telegram.ui.ActionBar.t6.v0(i19));
        Paint paint3 = new Paint(1);
        int i20 = org.telegram.ui.ActionBar.t6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.t6.v0(i20));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.t0 t0Var6 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d11 = t0Var6.d(10, 2131232429, null, org.telegram.messenger.cd.K0(2131743425), true, false, t0Var6.m0);
        this.f36019g3 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.t0 t0Var7 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d12 = t0Var7.d(11, 2131232260, null, org.telegram.messenger.cd.K0(2131743308), true, false, t0Var7.m0);
        this.f36023h3 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f35999b3.b(i0.b.f(0.3f, org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.Ug), -16777216));
        this.f36070r3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.t0 t0Var8 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d13 = t0Var8.d(6, 2131232115, this.U2, org.telegram.messenger.cd.K0(org.telegram.messenger.w3.W(this.Q2) ? 2131743511 : 2131743410), true, false, t0Var8.m0);
        this.f36015f3 = d13;
        org.telegram.ui.ActionBar.t0 t0Var9 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d14 = t0Var9.d(7, 2131232275, this.U2, org.telegram.messenger.cd.K0(2131743411), false, false, t0Var9.m0);
        this.f36028i3 = d14;
        org.telegram.ui.ActionBar.b1 e = this.f35999b3.e(3, 2131232202, org.telegram.messenger.cd.K0(2131743363));
        this.f36011e3 = e;
        w40 w40Var = new w40();
        this.U2 = w40Var;
        org.telegram.ui.ActionBar.b1 e7 = this.f35999b3.e(9, 2131232351, org.telegram.messenger.cd.K0(2131743462));
        this.f36038k3 = e7;
        org.telegram.ui.ActionBar.t0 t0Var10 = this.f35999b3;
        org.telegram.ui.ActionBar.b1 d15 = t0Var10.d(5, 0, w40Var, org.telegram.messenger.cd.K0(2131743374), true, false, t0Var10.m0);
        this.f36033j3 = d15;
        w40Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.b1 e10 = this.f35999b3.e(12, 2131231894, org.telegram.messenger.cd.K0(2131743510));
        this.f36056o3 = e10;
        org.telegram.ui.ActionBar.b1 e11 = this.f35999b3.e(13, 2131230781, org.telegram.messenger.cd.K0(2131743512));
        this.f36061p3 = e11;
        org.telegram.ui.ActionBar.b1 e12 = this.f35999b3.e(4, 2131232086, org.telegram.messenger.cd.K0(q1() ? 2131743405 : org.telegram.messenger.w3.W(this.Q2) ? 2131743507 : 2131743406));
        this.f36051n3 = e12;
        this.f35999b3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.t6.v0(i18));
        this.f35999b3.getPopupLayout().setFitItems(true);
        e10.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        e11.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        d11.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        d12.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        int i21 = org.telegram.ui.ActionBar.t6.f21049jh;
        e12.d(org.telegram.ui.ActionBar.t6.v0(i21), org.telegram.ui.ActionBar.t6.v0(i21));
        e.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        d13.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        d14.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        d15.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        e7.d(org.telegram.ui.ActionBar.t6.v0(i20), org.telegram.ui.ActionBar.t6.v0(i20));
        if (this.R2 != null) {
            n1();
        }
        if (q1()) {
            this.f36018g2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f36018g2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        S1(false);
        this.F1.getTitleTextView().setOnClickListener(new r10(this, 3));
        u20 u20Var = new u20(this, launchActivity);
        this.f36008d4 = u20Var;
        v20 v20Var = new v20(this);
        this.E4 = v20Var;
        u20Var.setClipToPadding(false);
        v20Var.S();
        v20Var.f47945o = org.telegram.ui.Components.gr.f26495f;
        v20Var.d = 350L;
        v20Var.f47967c = 350L;
        v20Var.e = 350L;
        u20Var.setItemAnimator(v20Var);
        u20Var.setOnScrollListener(new w20(this));
        u20Var.setClipChildren(false);
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        u20Var.setLayoutManager(a0Var);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(u3Var, this.f21583a, this);
        this.f36020g4 = z10Var;
        u20Var.setAdapter(z10Var);
        z10Var.F(u20Var, false);
        u20Var.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) {
            public final b50 f41337b;

            {
                this.f41337b = this;
            }

            @Override
            public final void f(int i152, View view2) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view2;
                        org.telegram.messenger.v3 videoParticipant = y10Var.getVideoParticipant();
                        b50 b50Var2 = this.f41337b;
                        if (videoParticipant == null) {
                            b50Var2.g1(new org.telegram.messenger.v3(y10Var.getParticipant(), false));
                            return;
                        } else {
                            b50Var2.g1(y10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        b50 b50Var3 = this.f41337b;
                        b50Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view2;
                        if (kVar.getParticipant() != null) {
                            b50Var3.g1(kVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        u20Var.setOnItemLongClickListener(new q10(this, 1));
        u20Var.setVisibility(8);
        u20Var.i(new x20());
        y20 y20Var = new y20(this, launchActivity, this.H1, u20Var, this.P3, this.R2, this);
        this.R3 = y20Var;
        y20Var.setClipChildren(false);
        z10Var.E(this.P3, y20Var);
        if (this.f36012e4 != null) {
            this.f36016f4.G(this.P3, y20Var);
        }
        z20 z20Var = new z20(this, launchActivity);
        this.f36086u4 = z20Var;
        a30 a30Var = new a30(this, launchActivity, this.F1, this.H1, z20Var);
        this.f36026i1 = a30Var;
        a30Var.setImagesLayerNum(Integer.MAX_VALUE);
        a30Var.setInvalidateWithParent(true);
        z20Var.setProfileGalleryView(a30Var);
        b30 b30Var = new b30(this, launchActivity);
        this.f36081t4 = b30Var;
        b30Var.setVisibility(8);
        a30Var.setVisibility(0);
        a30Var.b(new c30(this));
        d30 d30Var = new d30(this, launchActivity);
        this.S3 = d30Var;
        this.f21586b.addView(y20Var);
        y20Var.addView(u20Var, w7.b6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.l1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.A4 = view2;
        int[] iArr = this.D4;
        iArr[0] = this.M3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.D4);
        this.C4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.f21586b.addView(view2, w7.b6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.B4 = view3;
        view3.setBackgroundColor(this.D4[0]);
        this.f21586b.addView(view3, w7.b6.e(-1, 0, 83));
        dh.k kVar = new dh.k(launchActivity);
        this.T1 = kVar;
        kVar.setDelegate(new e30(this));
        kVar.setClickCellDelegate(new f30(this));
        org.telegram.messenger.u3 u3Var2 = this.R2;
        if (u3Var2 != null) {
            kVar.D0(this.f36036k1.f14863a, u3Var2.g(false));
        }
        this.f21586b.addView(kVar, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(launchActivity, false, true, true);
        this.D1 = f6Var;
        f6Var.setGravity(17);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTextColor(-1);
        f6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        this.f21586b.addView(this.l1);
        g30 g30Var = new g30(this, launchActivity, this.C1, LaunchActivity.Q(), this.I0);
        this.f36099y1 = g30Var;
        g30Var.J = true;
        g30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.U1)});
        g30Var.getEditText().setLinkTextColor(-11683585);
        g30Var.setHint(org.telegram.messenger.cd.K0(2131743953));
        g30Var.getEditText().addTextChangedListener(new h30(this));
        g30Var.s();
        i30 i30Var = new i30(this, launchActivity);
        this.f36095x1 = i30Var;
        this.f21586b.addView(i30Var, w7.b6.c(-1.0f, -1));
        j30 j30Var = new j30(launchActivity);
        this.f36091w1 = j30Var;
        j30Var.addView(g30Var, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        j30Var.addView(f6Var, w7.b6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        f6Var.setTranslationY(-org.telegram.messenger.i0.L(20.0f));
        this.f21586b.addView(j30Var, w7.b6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.A1 = imageView3;
        int i22 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i22), this.I0);
        int i23 = org.telegram.ui.ActionBar.t6.f7;
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView3, i23, p6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new r10(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.f36102z1 = imageView4;
        org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i22), this.I0);
        org.telegram.ui.ActionBar.a7.t(imageView4, org.telegram.ui.ActionBar.t6.f21259v6, this.I0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231461);
        imageView4.setOnClickListener(new r10(this, 5));
        j30Var.addView(imageView3, w7.b6.e(48, 48, 85));
        j30Var.addView(imageView4, w7.b6.e(48, 48, 85));
        this.f21586b.addView(d30Var);
        b30Var.addView(a30Var, w7.b6.c(-1.0f, -1));
        b30Var.addView(z20Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f21586b.addView(b30Var, w7.b6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.G1.f();
        if (f35992x5) {
            this.f36016f4.I(this.f36012e4, false);
        }
        this.f36103z2 = this.G1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.J1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.w3.T(this.Q2) && (chat2 = this.Q2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f21586b.addView(textView, w7.b6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(launchActivity);
            ac0Var.setTextColor(-1);
            ac0Var.setSelectorColor(-9598483);
            ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
            ac0Var.setItemCount(5);
            l30 l30Var = new l30(launchActivity);
            l30Var.setItemCount(5);
            l30Var.setTextColor(-1);
            l30Var.setSelectorColor(-9598483);
            l30Var.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
            m30 m30Var = new m30(launchActivity);
            m30Var.setItemCount(5);
            m30Var.setTextColor(-1);
            m30Var.setSelectorColor(-9598483);
            m30Var.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
            n30 n30Var = new n30(launchActivity);
            this.K1 = n30Var;
            n30Var.setLines(1);
            n30Var.setSingleLine(true);
            n30Var.setEllipsize(TextUtils.TruncateAt.END);
            n30Var.setGravity(17);
            n30Var.setTextColor(-1);
            n30Var.setTypeface(org.telegram.messenger.i0.o());
            n30Var.setTextSize(1, 14.0f);
            this.f21586b.addView(n30Var, w7.b6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            n30Var.setOnClickListener(new org.telegram.messenger.video.f(this, ac0Var, l30Var, m30Var, chat, cVar, inputPeer2, 1));
            p30 p30Var = new p30(launchActivity, ac0Var, l30Var, m30Var);
            this.I1 = p30Var;
            p30Var.setWeightSum(1.0f);
            p30Var.setOrientation(0);
            this.f21586b.addView(p30Var, w7.b6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i24 = calendar.get(1);
            int i25 = calendar.get(6);
            p30Var.addView(ac0Var, w7.b6.l(0.5f, 0, 270));
            ac0Var.setMinValue(0);
            ac0Var.setMaxValue(365);
            ac0Var.setWrapSelectorWheel(false);
            ac0Var.setFormatter(new mg.d(currentTimeMillis, calendar, i24, 1));
            a1.d dVar = new a1.d(this, ac0Var, l30Var, m30Var, 10);
            b50Var = this;
            ac0Var.setOnValueChangedListener(dVar);
            l30Var.setMinValue(0);
            l30Var.setMaxValue(23);
            p30Var.addView(l30Var, w7.b6.l(0.2f, 0, 270));
            l30Var.setFormatter(new org.telegram.ui.Components.z11(10));
            l30Var.setOnValueChangedListener(dVar);
            m30Var.setMinValue(0);
            m30Var.setMaxValue(59);
            m30Var.setValue(0);
            m30Var.setFormatter(new org.telegram.ui.Components.z11(11));
            p30Var.addView(m30Var, w7.b6.l(0.3f, 0, 270));
            m30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i26 = calendar.get(6);
            int i27 = calendar.get(12);
            int i28 = calendar.get(11);
            ac0Var.setValue(i25 != i26 ? 1 : 0);
            m30Var.setValue(i27);
            l30Var.setValue(i28);
            org.telegram.ui.Components.s4.g(n30Var, textView, 0L, 604800L, 2, ac0Var, l30Var, m30Var);
        } else {
            b50Var = this;
        }
        q30 q30Var = new q30(b50Var, (ViewGroup) b50Var.getWindow().getDecorView(), b50Var.f21586b);
        b50Var.T3 = q30Var;
        q30Var.E = new r30(b50Var);
        a30Var.setPinchToZoomHelper(q30Var);
        b50Var.f36054o1.setOnClickListener(new View.OnClickListener(b50Var) {
            public final b50 f42569b;

            {
                this.f42569b = b50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        b50 b50Var2 = this.f42569b;
                        LaunchActivity launchActivity2 = b50Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            b50Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                b50Var2.a2[0].d(1, false);
                                if (b50Var2.f36064q2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    s30 s30Var = new s30(b50Var2, launchActivity, z11);
                                    b50Var2.f36064q2 = s30Var;
                                    s30Var.setBottomPadding(b50Var2.f21586b.getPaddingBottom());
                                    b50Var2.f21589c.addView(b50Var2.f36064q2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            b50Var2.Q1(true, false);
                            b50Var2.P1(false);
                            b50Var2.R2.z();
                            b50Var2.Q0(true);
                            b50Var2.l1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        b50 b50Var3 = this.f42569b;
                        b50Var3.R3.e();
                        org.telegram.messenger.u3 u3Var22 = b50Var3.R2;
                        if (u3Var22 != null && !u3Var22.j()) {
                            b50Var3.L1();
                            b50.v1(launchActivity, new t10(b50Var3, 5), false, false);
                            return;
                        }
                        b50Var3.dismiss();
                        return;
                }
            }
        });
        b50Var.O1(false);
        b50Var.L1();
        b50Var.P1(false);
        b50Var.Q1(false, false);
        b50Var.D1(0.0f);
        b50Var.R1();
        b50Var.f21586b.addView(new FrameLayout(launchActivity), w7.b6.e(-1, 200, 87));
        b50Var.f36068r1.setOnClickListener(new r10(b50Var, 6));
        b50Var.V0();
        w7.e6.a(b50Var.f36054o1);
        w7.e6.a(b50Var.f36059p1);
        w7.e6.a(b50Var.f36044m1);
        w7.e6.a(b50Var.f36049n1);
        w7.e6.a(b50Var.f36073s1);
        w7.e6.a(b50Var.f36063q1);
        w7.e6.a(b50Var.f36068r1);
        r0.h0.l(b50Var.f21586b, new q10(b50Var, 2));
    }

    public static void H1(org.telegram.ui.ActionBar.b1 b1Var, int i10) {
        if (b1Var != null) {
            b1Var.d(i10, i10);
        }
    }

    public static void I0(final b50 b50Var, Activity activity, org.telegram.messenger.u3 u3Var, View view, int i10) {
        TLRPC.Chat chat;
        final Long l4;
        boolean z10;
        final org.telegram.messenger.t3 t3Var;
        org.telegram.messenger.c cVar = b50Var.f36036k1;
        ArrayList arrayList = b50Var.f36092w2;
        v40 v40Var = b50Var.G1;
        if (view instanceof org.telegram.ui.Components.voip.k) {
            b50Var.g1(((org.telegram.ui.Components.voip.k) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.h4) {
            b50Var.I1((org.telegram.ui.Cells.h4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.a4) {
                org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
                if (a4Var.getUser() != null) {
                    if (b50Var.q1()) {
                        int i11 = i10 - v40Var.f42599n;
                        if (i11 >= 0 && i11 < b50Var.R2.f18236m.size()) {
                            l4 = (Long) b50Var.R2.f18236m.get(i10 - v40Var.f42599n);
                        } else {
                            int i12 = i10 - v40Var.f42601s;
                            if (i12 >= 0 && i12 < b50Var.R2.f18235l.size()) {
                                l4 = (Long) b50Var.R2.f18235l.get(i10 - v40Var.f42601s);
                            } else {
                                int i13 = i10 - v40Var.f42598f;
                                if (b50Var.f36032j2) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                        z10 = false;
                                    }
                                    l4 = null;
                                    z10 = false;
                                } else {
                                    if (i13 >= 0 && i13 < b50Var.R2.f18233j.size()) {
                                        l4 = (Long) b50Var.R2.f18233j.get(i13);
                                        z10 = false;
                                    }
                                    l4 = null;
                                    z10 = false;
                                }
                                if (!z10 && (t3Var = (org.telegram.messenger.t3) b50Var.R2.f18234k.get(l4)) != null) {
                                    org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(b50Var.f21589c, b50Var.I0, a4Var);
                                    F.l(2131232128, org.telegram.messenger.cd.L0(2131749469, null), new Runnable(b50Var) {
                                        public final b50 f43681b;

                                        {
                                            this.f43681b = b50Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.t3 t3Var2 = t3Var;
                                                    declineconferencecallinvite.msg_id = t3Var2.f18003a;
                                                    final b50 b50Var2 = this.f43681b;
                                                    ConnectionsManager.getInstance(b50Var2.f21583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var3 = b50Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.vp.r1(b50Var3.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var4 = b50Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.u3 u3Var2 = b50Var2.R2;
                                                    if (u3Var2 != null) {
                                                        t3Var2.f18004b = false;
                                                        u3Var2.f18234k.put(l4, t3Var2);
                                                        b50Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.t3 t3Var3 = t3Var;
                                                    declineconferencecallinvite2.msg_id = t3Var3.f18003a;
                                                    final b50 b50Var3 = this.f43681b;
                                                    ConnectionsManager.getInstance(b50Var3.f21583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var32 = b50Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var4 = b50Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(t3Var3.f18003a));
                                                    org.telegram.messenger.vp.r1(b50Var3.f21583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.u3 u3Var3 = b50Var3.R2;
                                                    if (u3Var3 != null) {
                                                        ArrayList arrayList3 = u3Var3.f18233j;
                                                        Long l10 = l4;
                                                        arrayList3.remove(l10);
                                                        b50Var3.R2.f18237n.remove(l10);
                                                        b50Var3.R2.f18234k.remove(l10);
                                                        b50Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, t3Var.a());
                                    F.c(2131232327, org.telegram.messenger.cd.L0(2131749480, null), new Runnable(b50Var) {
                                        public final b50 f43681b;

                                        {
                                            this.f43681b = b50Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.t3 t3Var2 = t3Var;
                                                    declineconferencecallinvite.msg_id = t3Var2.f18003a;
                                                    final b50 b50Var2 = this.f43681b;
                                                    ConnectionsManager.getInstance(b50Var2.f21583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var32 = b50Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var4 = b50Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.u3 u3Var2 = b50Var2.R2;
                                                    if (u3Var2 != null) {
                                                        t3Var2.f18004b = false;
                                                        u3Var2.f18234k.put(l4, t3Var2);
                                                        b50Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.t3 t3Var3 = t3Var;
                                                    declineconferencecallinvite2.msg_id = t3Var3.f18003a;
                                                    final b50 b50Var3 = this.f43681b;
                                                    ConnectionsManager.getInstance(b50Var3.f21583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var32 = b50Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    b50 b50Var4 = b50Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        b50Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(t3Var3.f18003a));
                                                    org.telegram.messenger.vp.r1(b50Var3.f21583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.u3 u3Var3 = b50Var3.R2;
                                                    if (u3Var3 != null) {
                                                        ArrayList arrayList3 = u3Var3.f18233j;
                                                        Long l10 = l4;
                                                        arrayList3.remove(l10);
                                                        b50Var3.R2.f18237n.remove(l10);
                                                        b50Var3.R2.f18234k.remove(l10);
                                                        b50Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    F.W(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), b50Var.f36079t2.getColor()));
                                    F.f32941s = 96;
                                    F.Z();
                                    return;
                                }
                                return;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            org.telegram.ui.Components.z60 F2 = org.telegram.ui.Components.z60.F(b50Var.f21589c, b50Var.I0, a4Var);
                            F2.l(2131232128, org.telegram.messenger.cd.L0(2131749469, null), new Runnable(b50Var) {
                                public final b50 f43681b;

                                {
                                    this.f43681b = b50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.t3 t3Var2 = t3Var;
                                            declineconferencecallinvite.msg_id = t3Var2.f18003a;
                                            final b50 b50Var2 = this.f43681b;
                                            ConnectionsManager.getInstance(b50Var2.f21583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var32 = b50Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var4 = b50Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.u3 u3Var2 = b50Var2.R2;
                                            if (u3Var2 != null) {
                                                t3Var2.f18004b = false;
                                                u3Var2.f18234k.put(l4, t3Var2);
                                                b50Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.t3 t3Var3 = t3Var;
                                            declineconferencecallinvite2.msg_id = t3Var3.f18003a;
                                            final b50 b50Var3 = this.f43681b;
                                            ConnectionsManager.getInstance(b50Var3.f21583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var32 = b50Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var4 = b50Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(t3Var3.f18003a));
                                            org.telegram.messenger.vp.r1(b50Var3.f21583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.u3 u3Var3 = b50Var3.R2;
                                            if (u3Var3 != null) {
                                                ArrayList arrayList3 = u3Var3.f18233j;
                                                Long l10 = l4;
                                                arrayList3.remove(l10);
                                                b50Var3.R2.f18237n.remove(l10);
                                                b50Var3.R2.f18234k.remove(l10);
                                                b50Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, t3Var.a());
                            F2.c(2131232327, org.telegram.messenger.cd.L0(2131749480, null), new Runnable(b50Var) {
                                public final b50 f43681b;

                                {
                                    this.f43681b = b50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.t3 t3Var2 = t3Var;
                                            declineconferencecallinvite.msg_id = t3Var2.f18003a;
                                            final b50 b50Var2 = this.f43681b;
                                            ConnectionsManager.getInstance(b50Var2.f21583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var32 = b50Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var4 = b50Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.u3 u3Var2 = b50Var2.R2;
                                            if (u3Var2 != null) {
                                                t3Var2.f18004b = false;
                                                u3Var2.f18234k.put(l4, t3Var2);
                                                b50Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.t3 t3Var3 = t3Var;
                                            declineconferencecallinvite2.msg_id = t3Var3.f18003a;
                                            final b50 b50Var3 = this.f43681b;
                                            ConnectionsManager.getInstance(b50Var3.f21583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var32 = b50Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.vp.r1(b50Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            b50 b50Var4 = b50Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.vp.r1(b50Var4.f21583a).L3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                b50Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(t3Var3.f18003a));
                                            org.telegram.messenger.vp.r1(b50Var3.f21583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.u3 u3Var3 = b50Var3.R2;
                                            if (u3Var3 != null) {
                                                ArrayList arrayList3 = u3Var3.f18233j;
                                                Long l10 = l4;
                                                arrayList3.remove(l10);
                                                b50Var3.R2.f18237n.remove(l10);
                                                b50Var3.R2.f18234k.remove(l10);
                                                b50Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            F2.W(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), b50Var.f36079t2.getColor()));
                            F2.f32941s = 96;
                            F2.Z();
                            return;
                        }
                        return;
                    }
                    b50Var.Z1.O0(b50Var.f21583a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", a4Var.getUser().f19942id);
                    if (a4Var.f21667a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    b50Var.Z1.t0(new ProfileActivity(bundle, null));
                    b50Var.dismiss();
                }
            } else if (i10 == v40Var.f42603x) {
                if (org.telegram.messenger.w3.T(b50Var.Q2) && (chat = b50Var.Q2) != null && !chat.megagroup && org.telegram.messenger.w3.t0(chat)) {
                    b50Var.l1(false);
                    return;
                }
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(cVar.f14863a).M0(b50Var.k1());
                if (M0 != null) {
                    b50Var.f36050n2 = false;
                    Context context = b50Var.getContext();
                    int i14 = cVar.f14863a;
                    TLRPC.Chat chat2 = b50Var.Q2;
                    org.telegram.messenger.u3 u3Var2 = b50Var.R2;
                    org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(context, i14, chat2, M0, u3Var2.d, u3Var2.f18237n);
                    b50Var.f36089v3 = z20Var;
                    z20Var.setOnDismissListener(new w10(b50Var, 2));
                    org.telegram.ui.Components.z20 z20Var2 = b50Var.f36089v3;
                    z20Var2.X1 = new h20(b50Var);
                    z20Var2.show();
                }
            } else if (i10 == v40Var.f42604y) {
                org.telegram.messenger.u3 u3Var3 = b50Var.R2;
                if (u3Var3 != null && u3Var3.f18228b != null) {
                    mg.i2 i2Var = new mg.i2(activity, b50Var.f21583a, null, 4, new org.telegram.ui.Components.ro0());
                    org.telegram.messenger.u3 u3Var4 = b50Var.R2;
                    if (u3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(u3Var4.e).map(new k2.f(10)).collect(Collectors.toSet());
                    }
                    i2Var.f13157u2.addAll(collection);
                    i2Var.o1(false, true);
                    i2Var.f13155s2 = new t10(b50Var, 3);
                    i2Var.o1(false, true);
                    i2Var.f13158v2 = new ih.s(11, b50Var, u3Var);
                    i2Var.show();
                }
            } else if (i10 == v40Var.D) {
                b50Var.x1();
            }
        }
    }

    public static void J0(b50 b50Var, org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (!b50Var.I) {
            if (z10 && kVar.getRenderer() == null) {
                kVar.setRenderer(org.telegram.ui.Components.voip.r.c(b50Var.P3, b50Var.R3, kVar, null, null, kVar.getParticipant(), b50Var.R2, b50Var));
            } else if (!z10 && kVar.getRenderer() != null) {
                kVar.getRenderer().setPrimaryView(null);
                kVar.setRenderer(null);
            }
        }
    }

    public static void K0(b50 b50Var, int i10, int[] iArr) {
        if (b50Var.t1()) {
            int i11 = org.telegram.ui.ActionBar.t6.f21322yh;
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21339zh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21126nh, false));
            iArr[2] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21304xh, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21106mh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21126nh, false));
            iArr[2] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21087lh, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21252uh, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21162ph, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21178qh, false));
            iArr[2] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21145oh, false);
        } else if (r1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20883ai, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.f21322yh;
            iArr[0] = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
            iArr[1] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ah, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bh, false));
            iArr[2] = org.telegram.messenger.i0.S0(b50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        }
        if (r1(i10)) {
            iArr[3] = i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.b.f(0.75f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21162ph, false), i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21234th, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21269vh, false)));
        } else {
            iArr[3] = i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21304xh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21287wh, false));
        }
    }

    public static String L0() {
        String[] strArr = org.telegram.messenger.l6.f16699i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void M0(b50 b50Var) {
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        if (u3Var != null && u3Var.f18228b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.u3 u3Var2 = b50Var.R2;
            togglegroupcallsettings.call = u3Var2.g(u3Var2.f18227a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(b50Var.R2.f18228b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(b50Var.f36036k1.f14863a);
            org.telegram.messenger.r5 r5Var = Utilities.d;
            Objects.requireNonNull(r5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.y3(r5Var), new c20(b50Var, 1));
        }
    }

    public static void N0(b50 b50Var, boolean z10) {
        if (b50Var.R2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        togglegroupcallsettings.call = u3Var.g(u3Var.f18227a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        b50Var.f36058o5 = Boolean.valueOf(z10);
        b50Var.K1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(b50Var.f36036k1.f14863a);
        org.telegram.messenger.r5 r5Var = Utilities.d;
        Objects.requireNonNull(r5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.y3(r5Var), new c20(b50Var, 0));
    }

    public static org.telegram.ui.Components.voip.k O0(b50 b50Var) {
        i40 i40Var = b50Var.H1;
        for (int i10 = 0; i10 < i40Var.getChildCount(); i10++) {
            View childAt = i40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.k) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.k) childAt;
            }
        }
        return null;
    }

    public static void P0(b50 b50Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f7;
        float f10;
        float L;
        float L2;
        float L3;
        float f11;
        float f12;
        float f13;
        boolean z12;
        View childAt;
        y30 y30Var = b50Var.F1;
        i40 i40Var = b50Var.H1;
        int childCount = i40Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(i40Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = i40Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float L4 = f14 + org.telegram.messenger.i0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && y30Var.getTag() == null) || (!z10 && y30Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            y30Var.setTag(num);
            AnimatorSet animatorSet = b50Var.Y1;
            if (animatorSet != null) {
                animatorSet.cancel();
                b50Var.Y1 = null;
            }
            if (y30Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            b50Var.G0(z11);
            ViewPropertyAnimator animate = y30Var.getBackButton().animate();
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
                f10 = -org.telegram.messenger.i0.L(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f10).setDuration(300L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = y30Var.getTitleTextView().animate();
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(grVar).start();
            ObjectAnimator objectAnimator = b50Var.L4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                b50Var.L4.cancel();
            }
            org.telegram.ui.ActionBar.u5 subtitleTextView = y30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = y30Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.i0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            b50Var.L4 = ofFloat;
            ofFloat.setDuration(300L);
            b50Var.L4.setInterpolator(grVar);
            b50Var.L4.addListener(new org.telegram.ui.Components.ha0(15, b50Var, z10));
            b50Var.L4.start();
            ObjectAnimator objectAnimator2 = b50Var.M4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.u5 additionalSubtitleTextView = y30Var.getAdditionalSubtitleTextView();
            if (z10) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            b50Var.M4 = ofFloat2;
            ofFloat2.setDuration(300L);
            b50Var.M4.setInterpolator(grVar);
            b50Var.M4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            b50Var.Y1 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = b50Var.Y1;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y30Var, property2, f11);
            r20 r20Var = b50Var.E1;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r20Var, property2, f12);
            View view = b50Var.X1;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            b50Var.Y1.addListener(new w30(b50Var, 1));
            b50Var.Y1.start();
            ImageView imageView = b50Var.R3.f31738w;
            if (z10 && !f35991w5) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (b50Var.f36060p2 != L4) {
            b50Var.G1(L4);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (f35989u5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f35989u5 = new b50(launchActivity, cVar, org.telegram.messenger.vp.r1(cVar.f14863a).f1(chat.f19793id, false, null), chat, inputPeer, z10, str);
                } else {
                    org.telegram.messenger.u3 u3Var = VoIPService.getSharedInstance().groupCall;
                    if (u3Var != null) {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(u3Var.f18229c));
                        u3Var.b(true);
                        f35989u5 = new b50(launchActivity, cVar, u3Var, L0, null, z10, str);
                    } else {
                        return;
                    }
                }
                f35989u5.Z1 = launchActivity;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(3));
            }
        }
    }

    public static String h1(int i10) {
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
                return org.telegram.messenger.cd.L0(2131743529, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.cd.L0(2131743527, null);
            } else {
                return org.telegram.messenger.cd.L0(2131743526, null);
            }
        }
        return org.telegram.messenger.cd.L0(2131743525, null);
    }

    public static String i1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.cd.a0(null, null, 2131743523, str);
            }
            return org.telegram.messenger.cd.L0(2131743524, null);
        } else if (i10 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.cd.L0(2131743522, null);
            }
            return org.telegram.messenger.cd.L0(2131743521, null);
        } else {
            return org.telegram.messenger.cd.L0(2131743520, null);
        }
    }

    public static boolean r1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f18228b.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void v1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && org.telegram.messenger.w3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                if (isConference) {
                    x1Var.R = org.telegram.messenger.cd.L0(2131743494, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131743495, null);
                } else if (org.telegram.messenger.w3.W(chat)) {
                    x1Var.R = org.telegram.messenger.cd.L0(2131743497, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131743498, null);
                } else {
                    x1Var.R = org.telegram.messenger.cd.L0(2131743387, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131743388, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                if (!sharedInstance.isConference() || (u3Var != null && (groupCall = u3Var.f18228b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                    if (z10) {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false));
                    } else {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.t6.f20976fh;
                        int i11 = org.telegram.ui.ActionBar.t6.f20940dh;
                        int i12 = org.telegram.ui.ActionBar.t6.f20901bh;
                        checkBoxSquare.f23934s = i10;
                        checkBoxSquare.f23935w = i11;
                        checkBoxSquare.f23936x = i12;
                        checkBoxSquare.invalidate();
                    }
                    c2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        c2VarArr[0].e(org.telegram.messenger.cd.L0(2131743496, null), "", false, false, false);
                    } else if (org.telegram.messenger.w3.W(chat)) {
                        c2VarArr[0].e(org.telegram.messenger.cd.L0(2131743499, null), "", false, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.cd.L0(2131743389, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                    if (org.telegram.messenger.cd.X) {
                        L = org.telegram.messenger.i0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(8.0f);
                    }
                    if (org.telegram.messenger.cd.X) {
                        L2 = org.telegram.messenger.i0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.i0.L(16.0f);
                    }
                    c2Var2.setPadding(L, 0, L2, 0);
                    f7.addView(c2VarArr[0], w7.b6.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new u10(c2VarArr, 0));
                }
                alertDialog$Builder.o(f7);
                x1Var.I = org.telegram.ui.ActionBar.t6.f20940dh;
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743390, null), new vg(u3Var, c2VarArr, selfId, runnable, 1));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                if (z10) {
                    x1Var.R0 = false;
                }
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        x1Var.getWindow().setType(2038);
                    } else {
                        x1Var.getWindow().setType(2003);
                    }
                    x1Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21029ih, false));
                }
                x1Var.show();
                if (!z10) {
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21049jh, null);
                    }
                    x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false));
                    return;
                }
                return;
            }
            y1(u3Var, false, selfId, runnable);
        }
    }

    public static void y1(org.telegram.messenger.u3 u3Var, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (u3Var != null) {
            ArrayList arrayList = u3Var.f18230f;
            ArrayList arrayList2 = u3Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(j10);
            if (groupCallParticipant != null) {
                u3Var.d.e(j10);
                arrayList2.remove(groupCallParticipant);
                u3Var.f18231g.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (org.telegram.messenger.jj.C1(((org.telegram.messenger.v3) arrayList.get(i10)).f18477a.peer) == org.telegram.messenger.jj.C1(groupCallParticipant.peer)) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                TLRPC.GroupCall groupCall = u3Var.f18228b;
                groupCall.participants_count--;
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19706v2, new Object[0]);
    }

    public final void A1(boolean r18, org.telegram.ui.Cells.h4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.A1(boolean, org.telegram.ui.Cells.h4):void");
    }

    public final void B1() {
        m4 m4Var = this.f36071r4;
        org.telegram.messenger.i0.r(m4Var);
        if (this.f36066q4 && this.L2 != null && VoIPService.getSharedInstance() != null && t1() && this.H1 != null && org.telegram.messenger.sc.e(512)) {
            org.telegram.messenger.i0.h3(m4Var, 30L);
        }
    }

    public final void C1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j10;
        this.f36099y1.setText("");
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var != null && u3Var.f18228b != null && (g10 = u3Var.g(u3Var.f18227a)) != null) {
            org.telegram.messenger.u3 u3Var2 = this.R2;
            long j11 = u3Var2.f18228b.f19803id;
            TLRPC.Peer peer = u3Var2.J;
            if (peer != null) {
                j10 = org.telegram.messenger.o5.o(peer);
            } else {
                j10 = org.telegram.messenger.d20.i(this.f21583a).f15165n;
            }
            GroupCallMessagesController.getInstance(this.f21583a).sendCallMessage(j10, tL_textWithEntities, j11, g10);
        }
    }

    public final void D1(float f7) {
        float f10;
        int i10;
        int i11;
        this.L3 = f7;
        y20 y20Var = this.R3;
        if (y20Var == null) {
            f10 = 0.0f;
        } else {
            f10 = y20Var.f31714c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.t6.Xg;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.t6.Ug;
        int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, x02, org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        this.M3 = S0;
        this.E1.setBackgroundColor(S0);
        this.f35999b3.H(-14472653);
        this.W1.setColorFilter(new PorterDuffColorFilter(this.M3, PorterDuff.Mode.MULTIPLY));
        this.G0 = org.telegram.messenger.i0.S0(max, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        int S02 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21011hh, false));
        g.b bVar = this.f36018g2;
        if (bVar != null) {
            bVar.f7138b = S02;
            bi.t0 t0Var = (bi.t0) bVar.f7142i;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
        this.f36079t2.setColor(S02);
        this.f36087v1.setColor(S02);
        this.f36091w1.invalidate();
        i40 i40Var = this.H1;
        i40Var.setGlowColor(S02);
        int i14 = this.f36093w3;
        if (i14 == 3 || r1(i14)) {
            this.f36073s1.invalidate();
        }
        View view = this.A4;
        if (view != null) {
            int i15 = this.M3;
            int[] iArr = this.D4;
            iArr[0] = i15;
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
        int S03 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21196rh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21215sh, false));
        this.f36063q1.a(S03, S03);
        int S04 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20921ch, false));
        int S05 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20882ah, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20976fh, false));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0);
        int childCount = i40Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = i40Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                if (q1()) {
                    b4Var.a(w02, w02);
                } else {
                    b4Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.h4;
                y30 y30Var = this.F1;
                if (z10) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                    if (y30Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.t6.f20976fh;
                    } else {
                        i11 = org.telegram.ui.ActionBar.t6.f20882ah;
                    }
                    h4Var.f(i11, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.a4) {
                    org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) childAt;
                    if (y30Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.t6.f20976fh;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f20882ah;
                    }
                    a4Var.a(i10, S05);
                }
            }
        }
        this.f21586b.invalidate();
        i40Var.invalidate();
        this.f21589c.invalidate();
    }

    public final void E1(float f7) {
        i40 i40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        s4.c1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.G2 = min;
        this.H2 = (min - this.F2) / 265.0f;
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var != null && (i40Var = this.H1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(org.telegram.messenger.jj.C1(this.f36069r2))) != null) {
            y20 y20Var = this.R3;
            if (!y20Var.f31712b) {
                if (this.f36032j2) {
                    arrayList = this.f36084u2;
                } else {
                    arrayList = this.R2.f18231g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = i40Var.K(indexOf + this.G1.d)) != null) {
                    View view = K.f47898a;
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        ((org.telegram.ui.Cells.h4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.O4 && !this.f36004c4) {
                            this.f21586b.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    u20 u20Var = this.f36008d4;
                    if (i10 >= u20Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) u20Var.getChildAt(i10);
                    if (org.telegram.messenger.jj.C1(y10Var.getParticipant().peer) == org.telegram.messenger.jj.C1(groupCallParticipant.peer)) {
                        y10Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            y20Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void F1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.X4 = i10;
        this.Y4 = i11;
        this.Z4 = i12;
        this.f35997a5 = i13;
        this.f36001b5 = i14;
        this.f36005c5 = i15;
        this.f36009d5 = i16;
        this.f36013e5 = i17;
        this.f36017f5 = i18;
        this.f36021g5 = i19;
        this.f36025h5 = i20;
        this.f36030i5 = i21;
        this.f36035j5 = i22;
        this.f36040k5 = i23;
        this.f36043l5 = i24;
        this.f36048m5 = i25;
    }

    public final void G1(float f7) {
        i40 i40Var;
        int L;
        int i10;
        float f10;
        this.f36060p2 = f7;
        this.H1.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) i40Var.getLayoutParams()).topMargin));
        float L2 = f7 - org.telegram.messenger.i0.L(74.0f);
        int i11 = ((this.f21614s0 + L2) > (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) ? 1 : ((this.f21614s0 + L2) == (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) ? 0 : -1));
        q40 q40Var = this.L2;
        y20 y20Var = this.R3;
        s20 s20Var = this.W2;
        q20 q20Var = this.V2;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - L2) - this.f21614s0) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((L - this.f21614s0) - org.telegram.messenger.i0.L(14.0f))));
            if (org.telegram.messenger.i0.Q1()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (org.telegram.messenger.i0.L(f10) * min);
            if (q40Var != null) {
                q40Var.setShadowOffset((int) (org.telegram.messenger.i0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.L3) > 1.0E-4f) {
                D1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.f1.x(min, 0.1f, 1.2f, 1.0f);
            q20Var.setScaleX(Math.max(0.9f, x10));
            q20Var.setScaleY(Math.max(0.9f, x10));
            float f11 = 1.0f - (min * 1.2f);
            q20Var.setAlpha((1.0f - y20Var.f31714c) * Math.max(0.0f, f11));
            s20Var.setScaleX(Math.max(0.9f, x10));
            s20Var.setScaleY(Math.max(0.9f, x10));
            s20Var.setAlpha((1.0f - y20Var.f31714c) * Math.max(0.0f, f11));
        } else {
            q20Var.setScaleX(1.0f);
            q20Var.setScaleY(1.0f);
            q20Var.setAlpha(1.0f - y20Var.f31714c);
            s20Var.setScaleX(1.0f);
            s20Var.setScaleY(1.0f);
            s20Var.setAlpha(1.0f - y20Var.f31714c);
            if (this.L3 > 1.0E-4f) {
                D1(0.0f);
            }
            i10 = 0;
        }
        a1();
        float f12 = i10;
        this.f36065q3.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), (f7 - org.telegram.messenger.i0.L(53.0f)) - f12));
        this.f35995a3.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), (f7 - org.telegram.messenger.i0.L(44.0f)) - f12));
        if (q40Var != null) {
            q40Var.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), f7 - org.telegram.messenger.i0.L(37.0f)));
        }
        p30 p30Var = this.I1;
        if (p30Var != null) {
            p30Var.setTranslationY(Math.max(org.telegram.messenger.i0.L(4.0f), (f7 - org.telegram.messenger.i0.L(44.0f)) - f12));
        }
        this.f21586b.invalidate();
        T1();
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return !this.R3.f31712b;
    }

    public final boolean I1(android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.I1(android.view.View):boolean");
    }

    public final void J1(View view) {
        if (this.f36006d2 == null) {
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(8, getContext(), null, true);
            this.f36006d2 = q30Var;
            q30Var.setAlpha(0.0f);
            this.f36006d2.setVisibility(4);
            this.f36006d2.setShowingDuration(3000L);
            this.f21586b.addView(this.f36006d2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.w3.W(this.Q2)) {
                this.f36006d2.setText(org.telegram.messenger.cd.L0(2131743491, null));
            } else {
                this.f36006d2.setText(org.telegram.messenger.cd.L0(2131743373, null));
            }
            this.f36006d2.d();
        }
        this.f36006d2.setExtraTranslationY(-org.telegram.messenger.i0.f16020m);
        this.f36006d2.f(view, true);
    }

    public final void K1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.messenger.u3 u3Var = this.R2;
        org.telegram.ui.Components.voip.b2 b2Var = this.f36068r1;
        org.telegram.ui.Components.voip.b2 b2Var2 = this.f36049n1;
        org.telegram.ui.Components.voip.b2 b2Var3 = this.f36059p1;
        org.telegram.ui.Components.voip.b2 b2Var4 = this.f36044m1;
        org.telegram.ui.Components.voip.b2 b2Var5 = this.f36054o1;
        org.telegram.ui.Components.voip.b2 b2Var6 = this.f36063q1;
        org.telegram.ui.Components.voip.b2 b2Var7 = this.f36073s1;
        boolean z19 = true;
        l20 l20Var = this.l1;
        boolean z20 = false;
        if (u3Var != null && !u3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.f36069r2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f36058o5;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.R2.f18228b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.R2.c()) || z13) && !t1()) {
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
            if (f35991w5) {
                z17 = false;
                z18 = false;
            }
            l20Var.c(b2Var7, true, z10);
            l20Var.c(b2Var6, true, z10);
            l20Var.c(b2Var5, z16, z10);
            l20Var.c(b2Var4, z18, z10);
            l20Var.c(b2Var3, z20, z10);
            l20Var.c(b2Var2, z17, z10);
            l20Var.c(b2Var, z15, z10);
            return;
        }
        if (this.M2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        l20Var.c(b2Var7, z11, z10);
        if (this.M2 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        l20Var.c(b2Var6, z12, z10);
        if (this.M2 <= 0.1f) {
            z19 = false;
        }
        l20Var.c(b2Var3, z19, z10);
        l20Var.c(b2Var5, false, z10);
        l20Var.c(b2Var4, false, z10);
        l20Var.c(b2Var2, false, z10);
        l20Var.c(b2Var, false, z10);
    }

    @Override
    public final void L() {
        y20 y20Var = this.R3;
        if (y20Var != null) {
            if (this.f36024h4 != null) {
                this.H1.getViewTreeObserver().removeOnPreDrawListener(this.f36024h4);
                this.f36024h4 = null;
            }
            ArrayList arrayList = this.Q3;
            arrayList.clear();
            ArrayList arrayList2 = this.P3;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).f();
                y20Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (y20Var.getParent() != null) {
                arrayList2.clear();
                this.f21586b.removeView(y20Var);
            }
        }
        super.L();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f35989u5 == this) {
            f35989u5 = null;
        }
        f35990v5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.g20.j(getContext());
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var != null) {
            ArrayList arrayList3 = u3Var.e;
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i11)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i11)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i11)).videoIndex = 0;
            }
            u3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final void L1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        TLObject L0;
        org.telegram.messenger.u3 u3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.u3 u3Var2 = this.R2;
        org.telegram.ui.ActionBar.t0 t0Var = this.f35999b3;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f36007d3;
        if (u3Var2 == null || u3Var2.j()) {
            this.f36003c3.setVisibility(4);
            t0Var2.setVisibility(8);
            if (this.R2 == null) {
                t0Var.setVisibility(8);
                return;
            }
        }
        if (this.f36002c2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f36036k1;
        int i15 = cVar.f14863a;
        int i16 = cVar.f14863a;
        TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i15).L0(Long.valueOf(k1()));
        if (L02 != null) {
            this.Q2 = L02;
        }
        boolean y3 = org.telegram.messenger.w3.y(3, this.Q2);
        org.telegram.ui.ActionBar.b1 b1Var = this.f36011e3;
        if (!y3 && (((org.telegram.messenger.w3.T(this.Q2) && ((chat2 = this.Q2) == null || !chat2.megagroup)) || (!org.telegram.messenger.w3.t0(this.Q2) && !org.telegram.messenger.w3.y(3, this.Q2))) && (!org.telegram.messenger.w3.T(this.Q2) || (chat = this.Q2) == null || chat.megagroup || !org.telegram.messenger.w3.t0(chat)))) {
            b1Var.setVisibility(8);
        } else {
            b1Var.setVisibility(0);
        }
        org.telegram.messenger.u3 u3Var3 = this.R2;
        org.telegram.ui.ActionBar.b1 b1Var2 = this.f36061p3;
        org.telegram.ui.ActionBar.b1 b1Var3 = this.f36056o3;
        if (u3Var3 != null && (groupCall2 = u3Var3.f18228b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            b1Var3.setVisibility(i13);
            if (this.R2.f18228b.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            b1Var2.setVisibility(i14);
        } else {
            b1Var3.setVisibility(8);
            b1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.jj.C1(this.f36069r2));
        org.telegram.messenger.u3 u3Var4 = this.R2;
        org.telegram.ui.ActionBar.b1 b1Var4 = this.f36023h3;
        if (u3Var4 != null && !u3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            b1Var4.setVisibility(0);
        } else {
            b1Var4.setVisibility(8);
        }
        if (org.telegram.messenger.tz.I0) {
            i10 = 2131232260;
        } else {
            i10 = 2131232259;
        }
        b1Var4.setIcon(i10);
        if (org.telegram.messenger.tz.I0) {
            i11 = 2131743306;
        } else {
            i11 = 2131743307;
        }
        b1Var4.setSubtext(org.telegram.messenger.cd.L0(i11, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.b1 b1Var5 = this.f36051n3;
        org.telegram.ui.ActionBar.b1 b1Var6 = this.f36015f3;
        org.telegram.ui.ActionBar.b1 b1Var7 = this.f36033j3;
        org.telegram.ui.ActionBar.b1 b1Var8 = this.f36038k3;
        if (S0) {
            b1Var5.setVisibility(0);
            b1Var6.setVisibility(0);
            if (t1()) {
                b1Var7.setVisibility(0);
                b1Var8.setVisibility(8);
            } else if (this.R2.j()) {
                b1Var7.setVisibility(8);
                b1Var8.setVisibility(8);
            } else {
                b1Var7.setVisibility(0);
            }
            if (q1()) {
                b1Var7.setVisibility(8);
                b1Var6.setVisibility(8);
            }
            if (this.R2.c() && !this.R2.j() && !t1()) {
                b1Var8.setVisibility(0);
            } else {
                b1Var8.setVisibility(8);
            }
            t0Var2.setVisibility(8);
            boolean z13 = this.R2.f18245w;
            w40 w40Var = this.U2;
            w40Var.f42875f = z13;
            w40Var.d = 1.0f;
            w40Var.invalidateSelf();
            if (this.R2.f18245w) {
                if (this.f36085u3 == null) {
                    t10 t10Var = new t10(this, 6);
                    this.f36085u3 = t10Var;
                    org.telegram.messenger.i0.h3(t10Var, 1000L);
                }
                b1Var7.setText(org.telegram.messenger.cd.L0(2131743349, null));
            } else {
                t10 t10Var2 = this.f36085u3;
                if (t10Var2 != null) {
                    org.telegram.messenger.i0.r(t10Var2);
                    this.f36085u3 = null;
                }
                b1Var7.setText(org.telegram.messenger.cd.L0(2131743374, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                b1Var8.j(org.telegram.messenger.cd.L0(2131743460, null), 2131232352, null);
            } else {
                b1Var8.j(org.telegram.messenger.cd.L0(2131743462, null), 2131232351, null);
            }
            N1();
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
            if (!z10 && ((this.R2.c() || z11) && !this.R2.j() && !t1())) {
                if (z11) {
                    t0Var2.setVisibility(8);
                    b1Var8.setVisibility(0);
                    b1Var8.j(org.telegram.messenger.cd.L0(2131743460, null), 2131232352, null);
                    b1Var8.setContentDescription(org.telegram.messenger.cd.L0(2131743460, null));
                } else {
                    b1Var8.j(org.telegram.messenger.cd.L0(2131743462, null), 2131232351, null);
                    b1Var8.setContentDescription(org.telegram.messenger.cd.L0(2131743462, null));
                    t0Var2.setVisibility(8);
                    b1Var8.setVisibility(0);
                }
            } else {
                t0Var2.setVisibility(8);
                b1Var8.setVisibility(8);
            }
            b1Var5.setVisibility(8);
            b1Var6.setVisibility(8);
            b1Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.b1 b1Var9 = this.f36028i3;
        if (S02 && this.R2.f18228b.can_change_join_muted && !q1()) {
            b1Var9.setVisibility(0);
        } else {
            b1Var9.setVisibility(8);
        }
        if (q1() && ((u3Var = this.R2) == null || (groupCall = u3Var.f18228b) == null || !groupCall.creator)) {
            z12 = false;
        } else {
            z12 = true;
        }
        t0Var.Q(4, z12);
        if (t1() && !this.R2.j()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f36019g3.setVisibility(i12);
        int visibility = b1Var6.getVisibility();
        TextView textView = this.f36070r3;
        if (visibility != 0 && b1Var9.getVisibility() != 0 && b1Var.getVisibility() != 0 && b1Var8.getVisibility() != 0 && b1Var7.getVisibility() != 0 && b1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.j jVar = this.f35998b2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.S2) && !t1() && this.f36069r2 != null) {
            jVar.setVisibility(0);
            long C1 = org.telegram.messenger.jj.C1(this.f36069r2);
            if (org.telegram.messenger.o5.E(C1)) {
                L0 = org.telegram.messenger.vp.r1(i16).Z1(Long.valueOf(C1));
            } else {
                L0 = org.telegram.messenger.vp.r1(i16).L0(Long.valueOf(-C1));
            }
            jVar.setObject(L0);
        } else {
            jVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.Q2;
        if (chat3 != null && !org.telegram.messenger.w3.W(chat3) && t1() && b1Var.getVisibility() == 8) {
            t0Var.setVisibility(8);
        } else {
            t0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f35995a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.i0.L(f7)) {
            layoutParams.rightMargin = org.telegram.messenger.i0.L(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f36065q3.getLayoutParams()).rightMargin = 0;
        this.F1.setTitleRightMargin(org.telegram.messenger.i0.L(48.0f) * 2);
    }

    public final void M1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.M1(int, boolean):void");
    }

    public final void N1() {
        if (this.R2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f36036k1.f14863a).getCurrentTime();
        org.telegram.messenger.u3 u3Var = this.R2;
        int i10 = currentTime - u3Var.f18228b.record_start_date;
        boolean z10 = u3Var.f18245w;
        org.telegram.ui.ActionBar.b1 b1Var = this.f36033j3;
        if (z10) {
            b1Var.setSubtext(org.telegram.messenger.i0.g0(i10, false, false));
        } else {
            b1Var.setSubtext(null);
        }
    }

    public final void O1(boolean z10) {
        float interpolation;
        float f7;
        p30 p30Var = this.I1;
        if ((p30Var == null || this.R2 != null) && this.O2 == null) {
            this.N2 = 1.0f;
            this.M2 = 1.0f;
            if (p30Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            p20 p20Var = this.f36052n4;
            org.telegram.messenger.i0.r(p20Var);
            p20Var.run();
            org.telegram.messenger.u3 u3Var = this.R2;
            i40 i40Var = this.H1;
            if (u3Var != null && !u3Var.j()) {
                i40Var.setVisibility(0);
            } else {
                i40Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.w3.W(this.Q2);
            org.telegram.ui.ActionBar.b1 b1Var = this.f36051n3;
            if (W) {
                b1Var.setText(org.telegram.messenger.cd.L0(2131743514, null));
            } else {
                b1Var.setText(org.telegram.messenger.cd.L0(2131743421, null));
            }
        }
        float f10 = this.M2;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.gr.f26495f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.N2 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
            this.N2 = grVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * grVar.getInterpolation(this.M2 / 0.6f);
            f7 = this.M2 / 0.6f;
        }
        K1(true);
        float f11 = 1.0f - f7;
        p30Var.setAlpha(f11);
        this.L1.setAlpha(f7);
        this.N1.setAlpha(f7);
        h40 h40Var = this.M1;
        h40Var.setAlpha(f7);
        h40Var.setScaleX(interpolation);
        h40Var.setScaleY(interpolation);
        n30 n30Var = this.K1;
        n30Var.setScaleX(f11);
        n30Var.setScaleY(f11);
        n30Var.setAlpha(f11);
        this.J1.setAlpha(f11);
        this.f35999b3.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != p30Var.getVisibility()) {
            p30Var.setVisibility(i10);
            n30Var.setVisibility(i10);
        }
    }

    public final void P1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.b2 b2Var = this.f36059p1;
        if (b2Var != null && b2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            l20 l20Var = this.l1;
            boolean z14 = false;
            if (sharedInstance != null && !t1()) {
                ch.a aVar = (ch.a) l20Var.f4184c.get(b2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    b2Var.setEnabled(true);
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
                    b2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743529, null), false, z10);
                } else if (z13) {
                    b2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    b2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743527, null), false, z10);
                } else {
                    b2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z10);
                }
                b2Var.b(z13, z10);
                j1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = 2131231089;
                } else {
                    i10 = 2131231171;
                }
                if (this.R1 != i10) {
                    this.R1 = i10;
                    org.telegram.messenger.i0.Q3(this.S1, i10);
                }
                org.telegram.ui.Components.voip.b2 b2Var2 = this.f36049n1;
                if (b2Var2.getVisibility() == 0) {
                    b2Var2.c(0, -1, 0, 1.0f, true, h1(j1()), false, z10);
                    if (j1() != 1) {
                        z14 = true;
                    }
                    b2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            b2Var.c(2131232434, -1, 0, 0.3f, true, org.telegram.messenger.cd.L0(2131743463, null), false, z10);
            if (!org.telegram.messenger.w3.t0(this.Q2) && (!org.telegram.messenger.w3.N(this.Q2) || !org.telegram.messenger.w3.w(3, this.Q2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            ch.a aVar2 = (ch.a) l20Var.f4184c.get(b2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                b2Var.setEnabled(z11);
            }
            b2Var.b(true, false);
        }
    }

    public final void Q0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.Q0(boolean):void");
    }

    public final void Q1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.Q1(boolean, boolean):void");
    }

    public final int R0() {
        i40 i40Var = this.H1;
        int childCount = i40Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = i40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void R1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        z40 z40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        y30 y30Var = this.F1;
        if (y30Var != null && this.R2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.R2.P.m(); i11++) {
                long j10 = this.R2.P.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.P.f(j10);
                if (!groupCallParticipant.self) {
                    y20 y20Var = this.R3;
                    y20Var.getClass();
                    if (y20Var.f31740x.get(org.telegram.messenger.jj.C1(groupCallParticipant.peer)) <= 0 && this.f36076s4.get(j10, 0) != 1) {
                        long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i10 < 2) {
                            int i12 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                            if (i12 > 0) {
                                user = org.telegram.messenger.vp.r1(this.f21583a).Z1(Long.valueOf(C1));
                            } else {
                                user = null;
                            }
                            if (i12 <= 0) {
                                chat = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(C1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i10 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.h20.j(user, true), new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0);
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
                String J0 = org.telegram.messenger.cd.J0(i10, "MembersAreSpeakingToast");
                int indexOf = J0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                y30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.u5 subtitleTextView = y30Var.getSubtitleTextView();
            if (t1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.R2.f18228b.participants_count;
            v40 v40Var = this.G1;
            subtitleTextView.k(org.telegram.messenger.cd.G(i13 + ((v40Var.M.t1() || v40Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (t1() && (z40Var = this.f36075s3) != null) {
                z40Var.setWatchersCount(this.R2.f18228b.participants_count);
            }
            if (z10 != this.l4) {
                this.l4 = z10;
                y30Var.invalidate();
                float f11 = 0.0f;
                y30Var.getSubtitleTextView().setPivotX(0.0f);
                y30Var.getSubtitleTextView().setPivotY(y30Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = y30Var.getSubtitleTextView().animate();
                if (this.l4) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.l4) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.l4) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                org.telegram.messenger.i0.W3(y30Var.getAdditionalSubtitleTextView(), this.l4);
            }
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.u3 u3Var = this.R2;
            if (u3Var != null && (groupCall = u3Var.f18228b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.w3.w(14, this.Q2);
    }

    public final void S1(boolean z10) {
        org.telegram.messenger.u3 u3Var = this.R2;
        q20 q20Var = this.V2;
        if (u3Var == null) {
            if (org.telegram.messenger.w3.W(this.Q2)) {
                q20Var.b(org.telegram.messenger.cd.L0(2131743488, null), z10);
                return;
            } else {
                q20Var.b(org.telegram.messenger.cd.L0(2131743367, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(u3Var.f18228b.title);
        y30 y30Var = this.F1;
        if (!isEmpty) {
            if (!this.R2.f18228b.title.equals(y30Var.getTitle())) {
                if (z10) {
                    this.F1.K(this.R2.f18228b.title, true, 180L, null);
                    y30Var.getTitleTextView().setOnClickListener(new r10(this, 8));
                } else {
                    y30Var.setTitle(this.R2.f18228b.title);
                }
                q20Var.b(this.R2.f18228b.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Q2;
            if (chat != null && !chat.title.equals(y30Var.getTitle())) {
                if (z10) {
                    this.F1.K(this.Q2.title, true, 180L, null);
                    y30Var.getTitleTextView().setOnClickListener(new r10(this, 9));
                } else {
                    y30Var.setTitle(this.Q2.title);
                }
                if (org.telegram.messenger.w3.W(this.Q2)) {
                    if (t1()) {
                        q20Var.b(this.Q2.title, z10);
                    } else {
                        q20Var.b(org.telegram.messenger.cd.L0(2131743473, null), z10);
                    }
                } else {
                    q20Var.b(org.telegram.messenger.cd.L0(2131743332, null), z10);
                }
            } else if (this.Q2 == null) {
                y30Var.setTitle(org.telegram.messenger.cd.L0(2131751823, null));
                q20Var.b(org.telegram.messenger.cd.L0(2131751823, null), z10);
            }
        }
        org.telegram.ui.ActionBar.u5 titleTextView = y30Var.getTitleTextView();
        if (this.R2.f18245w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new x40(titleTextView));
                TextView textView = q20Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new x40(textView), (Drawable) null);
                TextView nextTextView = q20Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new x40(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            q20Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            q20Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void T0() {
        if (this.I3) {
            this.I3 = false;
            org.telegram.messenger.i0.r(this.f36062p4);
        }
        if (this.J3) {
            this.J3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f36073s1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1() {
        float f7;
        org.telegram.ui.Components.bb bbVar;
        boolean z10;
        if (this.E != null) {
            int L = org.telegram.messenger.i0.L(74.0f);
            float f10 = this.f36060p2 - L;
            if (this.f21614s0 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                int L2 = (L - this.f21614s0) - org.telegram.messenger.i0.L(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.f21614s0) / L2);
                f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.f21586b.getPaddingTop();
            FrameLayout frameLayout = this.E;
            y30 y30Var = this.F1;
            frameLayout.setTranslationY(org.telegram.messenger.i0.T1(((-frameLayout.getTop()) - this.E.getHeight()) + paddingTop + org.telegram.messenger.i0.L(10.0f), y30Var.getY() + (-this.E.getTop()) + y30Var.getHeight(), f7));
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
            if (wbVar != null && (bbVar = wbVar.e) != null && bbVar.getParent() != null && bbVar.getParent().getParent() == this.E) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bbVar.setTop(z10);
            }
        }
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.U0():void");
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    public final void V0() {
        this.f36091w1.setTranslationY((-this.f36080t3.d()) + this.f21586b.getPaddingBottom());
        this.f36095x1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.l1.setAlpha(1.0f - this.f36067q5.e);
        W0();
        X0();
    }

    public final void W0() {
        int i10;
        float f7 = this.f36080t3.f7696b.f7048a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        j30 j30Var = this.f36091w1;
        j30Var.setAlpha(f7);
        i30 i30Var = this.f36095x1;
        i30Var.setAlpha(f7);
        if (j30Var.getVisibility() != i10) {
            j30Var.setVisibility(i10);
            i30Var.setVisibility(i10);
            if (i10 == 8) {
                g30 g30Var = this.f36099y1;
                if (g30Var.isFocused()) {
                    g30Var.clearFocus();
                }
            }
        }
    }

    public final void X0() {
        int i10;
        org.telegram.ui.Components.mj0 mj0Var = this.B1;
        if (mj0Var != null) {
            float f7 = this.f36080t3.f7696b.f7048a * this.f36072r5.e;
            mj0Var.setAlpha(f7);
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.B1.getVisibility() != i10) {
                this.B1.setVisibility(i10);
                if (i10 == 8) {
                    this.B1.n();
                }
            }
            org.telegram.ui.Components.mj0 mj0Var2 = this.B1;
            if (!mj0Var2.N0 && f7 == 1.0f) {
                mj0Var2.N0 = true;
            }
        }
    }

    public final void Y0() {
        boolean z10 = f35992x5;
        l20 l20Var = this.l1;
        if (z10) {
            l20Var.setTranslationX(0.0f);
            l20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = f35991w5;
        fe.b bVar = this.f36067q5;
        if (z11) {
            l20Var.setTranslationX(bVar.e * org.telegram.messenger.i0.L(94.0f));
            l20Var.setTranslationY(0.0f);
            return;
        }
        l20Var.setTranslationX(0.0f);
        l20Var.setTranslationY(bVar.e * org.telegram.messenger.i0.L(94.0f));
    }

    public final void Z0() {
        boolean z10 = f35992x5;
        u20 u20Var = this.f36008d4;
        if (z10) {
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = f35991w5;
        fe.b bVar = this.f36067q5;
        if (z11) {
            u20Var.setTranslationX(bVar.e * org.telegram.messenger.i0.L(94.0f));
            u20Var.setTranslationY(0.0f);
            return;
        }
        u20Var.setTranslationX(0.0f);
        u20Var.setTranslationY(bVar.e * org.telegram.messenger.i0.L(94.0f));
    }

    public final void a1() {
        float L;
        float f7 = this.f36077s5.f7031f;
        hh.i iVar = this.f36080t3;
        float f10 = -((iVar.d() - this.f21586b.getPaddingBottom()) + f7 + (org.telegram.messenger.i0.L(68.0f) * this.f36072r5.e) + org.telegram.messenger.i0.L(10.0f));
        if (f35992x5) {
            L = (1.0f - this.f36082t5.e) * org.telegram.messenger.i0.L(-91.0f);
        } else if (f35991w5) {
            L = 0.0f;
        } else {
            L = ((this.f36067q5.e * org.telegram.messenger.i0.L(94.0f)) - (org.telegram.messenger.i0.L(104.0f) * this.R3.f31714c)) - org.telegram.messenger.i0.L(91.0f);
        }
        float T1 = org.telegram.messenger.i0.T1(L, f10, iVar.f7696b.f7048a);
        float measuredHeight = ((this.f21586b.getMeasuredHeight() - this.f36060p2) + T1) - this.f21614s0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.i0.L(250.0f));
        dh.k kVar = this.T1;
        kVar.setTranslationY(T1);
        kVar.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.B1 != null) {
            this.B1.setTranslationY((-this.f36080t3.d()) + this.f21586b.getPaddingBottom() + ((-this.f36072r5.e) * org.telegram.messenger.i0.L(64.0f)));
        }
    }

    public final void c1() {
        boolean z10;
        float f7 = this.f36072r5.e;
        float T1 = org.telegram.messenger.i0.T1(0.25f, 1.0f, f7);
        ImageView imageView = this.A1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        boolean z11 = false;
        if (f7 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f10 = 1.0f - f7;
        float T12 = org.telegram.messenger.i0.T1(0.25f, 1.0f, f10);
        ImageView imageView2 = this.f36102z1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.i0.T1(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        if (f10 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.r rVar = this.Q4;
        if (rVar != null) {
            rVar.f31600a.setRoundCorners(org.telegram.messenger.i0.L(8.0f));
            org.telegram.ui.Components.voip.r rVar2 = this.Q4;
            rVar2.h = false;
            rVar2.j(false);
            this.Q4.invalidate();
            this.R3.invalidate();
        }
        org.telegram.ui.Cells.h4 h4Var = this.O4;
        if (h4Var != null && !this.S4 && h4Var.getParent() != null) {
            this.f21586b.removeView(this.O4);
        }
        org.telegram.ui.Cells.h4 h4Var2 = this.O4;
        if (h4Var2 != null) {
            h4Var2.setProgressToAvatarPreview(0.0f);
            this.O4.setAboutVisible(false);
            this.O4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.y10 y10Var = this.R4;
        if (y10Var != null) {
            y10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.O4 = null;
        this.P4 = null;
        this.R4 = null;
        this.Q4 = null;
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
        String L0;
        boolean z10;
        org.telegram.messenger.v3 v3Var;
        boolean z11;
        VoIPService sharedInstance;
        int i16;
        int i17;
        int i18 = org.telegram.messenger.zs.f19713w2;
        i40 i40Var = this.H1;
        String[] strArr = null;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            org.telegram.messenger.u3 u3Var = this.R2;
            if (u3Var != null && u3Var.f18228b.f19803id == l4.longValue()) {
                org.telegram.messenger.u3 u3Var2 = this.R2;
                if (u3Var2.f18228b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f36037k2 > 0L ? 1 : (this.f36037k2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f36036k1;
                if (i20 == 0 && (((i17 = this.f36093w3) == 7 || i17 == 5 || i17 == 6) && !u3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.Z1, VoIPService.class);
                        intent.putExtra("chat_id", k1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.S2);
                        intent.putExtra("peerChannelId", this.P2.channel_id);
                        intent.putExtra("peerChatId", this.P2.chat_id);
                        intent.putExtra("peerUserId", this.P2.user_id);
                        intent.putExtra("hash", this.T2);
                        intent.putExtra("peerAccessHash", this.P2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f14863a);
                        intent.putExtra("scheduleDate", this.f36000b4);
                        this.Z1.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.f8.g(th2, true);
                    }
                    this.f36037k2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.i0.h3(new t10(this, 2), 3000L);
                }
                if (!this.f36041l2 && VoIPService.getSharedInstance() != null) {
                    this.R2.b(false);
                    n1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                L1();
                int childCount = i40Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = i40Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.h4) {
                        ((org.telegram.ui.Cells.h4) childAt).a(true, false);
                    }
                }
                if (this.O4 != null) {
                    this.f36032j2 = true;
                } else {
                    Q0(true);
                }
                R1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.f36093w3 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Q1(true, booleanValue);
                S1(true);
                if (z11 && ((i16 = this.f36093w3) == 1 || i16 == 0)) {
                    m1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l10 = (Long) objArr[3];
                    long longValue = l10.longValue();
                    if (longValue != 0 && !t1()) {
                        if (!q1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = org.telegram.messenger.vp.r1(cVar.f14863a).f18950y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i22);
                                        i22++;
                                        if (((TLRPC.Dialog) obj).f19797id == longValue) {
                                            i19 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.o5.E(longValue)) {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(l10);
                                if (Z1 != null) {
                                    if (this.R2.f18228b.participants_count < 250 || org.telegram.messenger.h20.w(Z1) || Z1.verified || i19 != 0) {
                                        m1().k(0L, 44, Z1, this.Q2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(-longValue));
                            if (L02 != null) {
                                if (this.R2.f18228b.participants_count < 250 || !org.telegram.messenger.w3.r0(L02) || L02.verified || i19 != 0) {
                                    m1().k(0L, 44, L02, this.Q2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19727y2) {
            y20 y20Var = this.R3;
            if (y20Var.f31712b && this.R2 != null) {
                boolean c10 = y20Var.c();
                org.telegram.messenger.u3 u3Var3 = this.R2;
                if (u3Var3 != null && y20Var.f31712b && (v3Var = y20Var.e) != null && u3Var3.d.f(org.telegram.messenger.jj.C1(v3Var.f18477a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.v3 v3Var2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f36022h2;
                        if (i23 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.v3 v3Var3 = (org.telegram.messenger.v3) arrayList2.get(i23);
                        if (this.R2.P.g(null, org.telegram.messenger.jj.C1(v3Var3.f18477a.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = v3Var3.f18477a;
                            if (!groupCallParticipant3.muted_by_you && y20Var.d != org.telegram.messenger.jj.C1(groupCallParticipant3.peer)) {
                                v3Var2 = v3Var3;
                            }
                        }
                        i23++;
                    }
                    if (v3Var2 != null) {
                        g1(v3Var2);
                    }
                }
            }
            y20Var.setVisibleParticipant(true);
            R1();
        } else if (i10 == org.telegram.messenger.zs.N4) {
            E1(((Float) objArr[0]).floatValue());
        } else if (i10 == org.telegram.messenger.zs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.w3.W(this.Q2)) {
                        L0 = org.telegram.messenger.cd.L0(2131743478, null);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131743345, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    L0 = org.telegram.messenger.cd.L0(2131751106, null) + "\n" + str;
                } else if (org.telegram.messenger.w3.W(this.Q2)) {
                    L0 = org.telegram.messenger.cd.L0(2131743504, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131743396, null);
                }
                AlertDialog$Builder M = org.telegram.ui.Components.s4.M(getContext(), org.telegram.messenger.cd.L0(2131743332, null), L0);
                M.j(new w10(this, 1));
                try {
                    M.p();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19794id == k1()) {
                L1();
                Q1(isShowing(), false);
            }
            long C1 = org.telegram.messenger.jj.C1(this.f36069r2);
            org.telegram.messenger.u3 u3Var4 = this.R2;
            if (u3Var4 != null && chatFull.f19794id == (-C1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) u3Var4.d.f(C1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                Q0(true);
                org.telegram.messenger.i0.a4(i40Var);
                if (this.f36090v4 != null) {
                    while (i19 < this.f36090v4.getChildCount()) {
                        View childAt2 = this.f36090v4.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.b1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131743532;
                            } else {
                                i14 = 2131743442;
                            }
                            String L03 = org.telegram.messenger.cd.L0(i14, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i15 = 2131232042;
                            } else {
                                i15 = 2131232184;
                            }
                            b1Var.j(L03, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19699u1) {
            if (((Long) objArr[0]).longValue() == k1()) {
                L1();
                Q1(isShowing(), false);
            }
        } else if (i10 == org.telegram.messenger.zs.B2) {
            int childCount2 = i40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.c1 G = i40Var.G(i40Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f47898a;
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        if (h4Var.getParticipant() != null) {
                            h4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == org.telegram.messenger.zs.E0) {
            Long l11 = (Long) objArr[0];
            long C12 = org.telegram.messenger.jj.C1(this.f36069r2);
            if (this.R2 != null && C12 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(C12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                Q0(true);
                org.telegram.messenger.i0.a4(i40Var);
                if (this.f36090v4 != null) {
                    while (i19 < this.f36090v4.getChildCount()) {
                        View childAt3 = this.f36090v4.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.b1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131743533;
                            } else {
                                i12 = 2131743443;
                            }
                            String L04 = org.telegram.messenger.cd.L0(i12, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i13 = 2131232042;
                            } else {
                                i13 = 2131232184;
                            }
                            b1Var2.j(L04, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19632j0) {
            Q0(true);
            org.telegram.messenger.i0.a4(i40Var);
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i24 = org.telegram.messenger.vp.D8;
            int i25 = intValue & 16;
            if (i25 != 0) {
                Q0(true);
            }
            if (i25 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.i0.a4(i40Var);
            }
        } else if (i10 == org.telegram.messenger.zs.f19733z2) {
            s30 s30Var = this.f36064q2;
            if (s30Var != null) {
                s30Var.b(true, true);
            }
            L1();
        } else if (i10 == org.telegram.messenger.zs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f36018g2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.Z1;
        launchActivity.f33350b1.remove(this.f36047m4);
        this.Z1.setRequestedOrientation(-1);
        f35990v5 = false;
        org.telegram.ui.Components.z20 z20Var = this.f36089v3;
        if (z20Var != null) {
            z20Var.dismiss();
        }
        this.f36032j2 = true;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f36036k1;
        int i10 = cVar.f14863a;
        int i11 = cVar.f14863a;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.M0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19713w2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19699u1);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.B2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.E0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19632j0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19733z2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19727y2);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.R3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.N4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        if (this.Z1 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.Z1.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView m12 = m1();
                if (z10) {
                    i10 = 42;
                } else {
                    i10 = 43;
                }
                m12.j(i10, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z10) {
        if (!this.T4 && this.W3) {
            if (z10) {
                this.T4 = true;
                A1(false, this.O4);
                return;
            }
            d1();
            this.f21586b.removeView(this.V3);
            this.V3 = null;
            this.f36081t4.setVisibility(8);
            this.f21586b.invalidate();
            this.W3 = false;
            this.P1.X = true;
            this.H1.invalidate();
            this.S3.setVisibility(8);
            if (this.f36032j2) {
                this.f36032j2 = false;
                Q0(true);
            }
            U0();
        }
    }

    public final void g1(org.telegram.messenger.v3 v3Var) {
        org.telegram.messenger.v3 v3Var2;
        if (v3Var == null) {
            this.Z1.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            y20 y20Var = this.R3;
            if (y20Var.f31731r != null) {
                return;
            }
            boolean z10 = f35992x5;
            i40 i40Var = this.H1;
            int i10 = 0;
            if (z10) {
                if (this.f36024h4 != null) {
                    i40Var.getViewTreeObserver().removeOnPreDrawListener(this.f36024h4);
                    this.f36024h4 = null;
                }
                ArrayList arrayList = new ArrayList();
                e50 e50Var = this.f36016f4;
                ArrayList arrayList2 = this.P3;
                ArrayList arrayList3 = this.Q3;
                if (v3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.k kVar = rVar.f31604c;
                        if (kVar != null) {
                            kVar.setRenderer(null);
                            org.telegram.ui.Components.y10 y10Var = rVar.d;
                            if (y10Var != null) {
                                y10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.k kVar2 = rVar.e;
                            if (kVar2 != null) {
                                kVar2.setRenderer(null);
                            }
                            arrayList.add(rVar.f31630x);
                            rVar.b(false);
                            rVar.animate().alpha(0.0f).setListener(new t30(this, rVar, 0));
                        }
                    }
                    this.G4 = false;
                    e50Var.H(this.f36012e4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) arrayList3.get(i12);
                        if (rVar2.e != null && ((v3Var2 = rVar2.f31630x) == null || !v3Var2.equals(v3Var))) {
                            arrayList.add(rVar2.f31630x);
                            rVar2.b(false);
                            org.telegram.ui.Components.y10 y10Var2 = rVar2.d;
                            if (y10Var2 != null) {
                                y10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.k kVar3 = rVar2.f31604c;
                            if (kVar3 != null) {
                                kVar3.setRenderer(null);
                            }
                            rVar2.animate().alpha(0.0f).setListener(new t30(this, rVar2, 1));
                        }
                    }
                    this.G4 = true;
                    e50Var.f36930r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.i0.g3(new xs(21, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = i40Var.getViewTreeObserver();
                gi giVar = new gi(this, v3Var, !y20Var.f31712b);
                this.f36024h4 = giVar;
                viewTreeObserver.addOnPreDrawListener(giVar);
                return;
            }
            if (this.f36024h4 != null) {
                i40Var.getViewTreeObserver().removeOnPreDrawListener(this.f36024h4);
                this.f36024h4 = null;
            }
            if (v3Var != null) {
                u20 u20Var = this.f36008d4;
                if (u20Var.getVisibility() != 0) {
                    u20Var.setVisibility(0);
                    org.telegram.ui.Components.z10 z10Var = this.f36020g4;
                    z10Var.G(u20Var, false);
                    this.f36032j2 = true;
                    if (!y20Var.f31712b) {
                        ArrayList arrayList4 = z10Var.e;
                        s4.a0 a0Var = (s4.a0) u20Var.getLayoutManager();
                        if (a0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((org.telegram.messenger.v3) arrayList4.get(i10)).equals(v3Var)) {
                                    a0Var.h1(i10, org.telegram.messenger.i0.L(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = i40Var.getViewTreeObserver();
                    mh.f fVar = new mh.f(2, this, v3Var);
                    this.f36024h4 = fVar;
                    viewTreeObserver2.addOnPreDrawListener(fVar);
                    return;
                }
                y20Var.j(v3Var);
                org.telegram.messenger.i0.a4(u20Var);
            } else if (i40Var.getVisibility() != 0) {
                i40Var.setVisibility(0);
                Q0(false);
                this.f36032j2 = true;
                ViewTreeObserver viewTreeObserver3 = i40Var.getViewTreeObserver();
                v30 v30Var = new v30(this, 0);
                this.f36024h4 = v30Var;
                viewTreeObserver3.addOnPreDrawListener(v30Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = i40Var.getViewTreeObserver();
                v30 v30Var2 = new v30(this, 1);
                this.f36024h4 = v30Var2;
                viewTreeObserver4.addOnPreDrawListener(v30Var2);
            }
        }
    }

    public final int j1() {
        Integer num = this.p5;
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

    public final long k1() {
        TLRPC.Chat chat = this.Q2;
        if (chat == null) {
            return 0L;
        }
        return chat.f19793id;
    }

    public final void l1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f36036k1;
        int i10 = cVar.f14863a;
        int i11 = cVar.f14863a;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(k1()));
        if (L0 != null && !org.telegram.messenger.w3.t0(L0)) {
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i11).M0(k1());
            String K = org.telegram.messenger.w3.K(this.Q2, false);
            if (!TextUtils.isEmpty(K)) {
                str = a1.g.o(org.telegram.messenger.vp.r1(i11).U2, "/", K, new StringBuilder());
            } else if (M0 != null && (tL_chatInviteExported = M0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.vp.k1(this.Q2);
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_exportChatInvite, new wd(this, M0, z10, 3));
                return;
            }
            w1(null, str, true, z10);
        } else if (this.R2 != null) {
            for (int i12 = 0; i12 < 2; i12++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.u3 u3Var = this.R2;
                exportgroupcallinvite.call = u3Var.g(u3Var.f18227a);
                if (i12 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new org.telegram.messenger.yc(this, i12, z10, 2));
            }
        }
    }

    @Override
    public final boolean m0() {
        f35990v5 = true;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.F2, new Object[0]);
        org.telegram.ui.Components.g20.j(getContext());
        return false;
    }

    public final UndoView m1() {
        if (!f35992x5) {
            y20 y20Var = this.R3;
            if (y20Var.f31712b) {
                return y20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.a2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f21586b.removeView(undoViewArr[0]);
            this.f21586b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void n1() {
        VoIPService sharedInstance;
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f36041l2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f36041l2 = true;
            this.f36084u2.addAll(this.R2.f18231g);
            this.f36088v2.addAll(this.f36022h2);
            this.f36092w2.addAll(this.R2.f18233j);
            this.f36096x2.addAll(this.R2.f18236m);
            this.f36100y2.addAll(this.R2.f18235l);
            this.K3 = sharedInstance.getCallState();
            if (this.R2 == null) {
                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                this.R2 = u3Var;
                this.f36020g4.f32868c = u3Var;
                this.R3.setGroupCall(u3Var);
                this.f36016f4.f36927c = this.R2;
            }
            dh.k kVar = this.T1;
            if (kVar != null) {
                kVar.D0(this.f36036k1.f14863a, this.R2.g(false));
            }
            this.F1.setTitleRightMargin(org.telegram.messenger.i0.L(48.0f) * 2);
            ArrayList arrayList = this.R2.e;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i11)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            h40 h40Var = this.M1;
            if (h40Var != null && h40Var.getVisibility() == 0) {
                this.f36063q1.c(2131230918, -1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21196rh, false), 0.3f, false, org.telegram.messenger.cd.L0(2131743390, null), false, true);
                P1(true);
                if (org.telegram.messenger.w3.W(this.Q2)) {
                    i10 = 2131743507;
                } else {
                    i10 = 2131743406;
                }
                this.f36051n3.setText(org.telegram.messenger.cd.L0(i10, null));
                i40 i40Var = this.H1;
                i40Var.setVisibility(0);
                org.telegram.ui.ActionBar.t0 t0Var = this.f36003c3;
                t0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i40Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i40Var, View.TRANSLATION_Y, org.telegram.messenger.i0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h40Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h40Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h40Var, property, 0.0f);
                org.telegram.ui.ActionBar.u5 u5Var = this.L1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(u5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(u5Var, property, 0.0f);
                org.telegram.ui.ActionBar.u5 u5Var2 = this.N1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(u5Var2, property2, 0.0f), ObjectAnimator.ofFloat(u5Var2, property3, 0.0f), ObjectAnimator.ofFloat(u5Var2, property, 0.0f), ObjectAnimator.ofFloat(t0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(t0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(t0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26496g);
                animatorSet.addListener(new w30(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void o1(final long j10, final boolean z10) {
        if (this.R2 != null) {
            org.telegram.messenger.c cVar = this.f36036k1;
            final TLRPC.User Z1 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                final org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.u3 u3Var = this.R2;
                invitetogroupcall.call = u3Var.g(u3Var.f18227a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = Z1.f19942id;
                tL_inputUser.access_hash = Z1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f14863a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        b50 b50Var = b50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.vp.r1(b50Var.f36036k1.f14863a).L3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.i0.g3(new ag.a3(b50Var, j11, x1VarArr2, Z1, 8));
                            return;
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.hf(b50Var, x1VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.Components.ji0(this, x1VarArr, sendRequest, 17), 500L);
                }
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        P1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            E1(0.0f);
        }
        i40 i40Var = this.H1;
        if (i40Var.getVisibility() == 0) {
            org.telegram.messenger.i0.a4(i40Var);
        }
        u20 u20Var = this.f36008d4;
        if (u20Var.getVisibility() == 0) {
            org.telegram.messenger.i0.a4(u20Var);
        }
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        s30 s30Var = this.f36064q2;
        if (s30Var != null) {
            s30Var.b(false, false);
        } else if (this.W3) {
            f1(true);
        } else if (this.R3.f31712b) {
            g1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
        }
        s30 s30Var = this.f36064q2;
        if (s30Var != null && VoIPService.getSharedInstance() != null) {
            s30Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.Z1;
        launchActivity.f33350b1.add(this.f36047m4);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.K3 = i10;
        Q1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public final boolean p1() {
        float f7;
        int L = org.telegram.messenger.i0.L(74.0f);
        float f10 = this.f36060p2 - L;
        if (this.f21614s0 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.f21614s0) / ((L - this.f21614s0) - org.telegram.messenger.i0.L(14.0f)));
        } else {
            f7 = 0.0f;
        }
        if (f7 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean q1() {
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
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ch, false));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.f35999b3;
            if (t0Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Vg;
                t0Var.O(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.x0(null, i10, false), true);
                t0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false);
            H1(this.f36056o3, x02);
            H1(this.f36061p3, x02);
            H1(this.f36019g3, x02);
            H1(this.f36023h3, x02);
            H1(this.f36051n3, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21049jh, false));
            H1(this.f36011e3, x02);
            H1(this.f36015f3, x02);
            H1(this.f36028i3, x02);
            H1(this.f36033j3, x02);
            H1(this.f36038k3, x02);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final boolean s1() {
        if (!t1() || this.R2.f18230f.isEmpty() || (((org.telegram.messenger.v3) this.R2.f18230f.get(0)).f18479c != 0.0f && ((org.telegram.messenger.v3) this.R2.f18230f.get(0)).f18479c < 1.0f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.s0.f31645d0.V) {
            org.telegram.ui.Components.voip.s0.b();
        }
    }

    public final boolean t1() {
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var != null && u3Var.f18228b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void u1(org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.x1 x1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f36050n2) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
            if (k2Var instanceof un) {
                boolean fa2 = ((un) k2Var).fa();
                this.f36050n2 = true;
                this.f36055o2 = true;
                kp kpVar = new kp(z2Var, editTextBoldCursor, z10, x1Var, 5);
                if (fa2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                org.telegram.messenger.i0.h3(kpVar, j10);
                return;
            }
            this.f36050n2 = true;
            this.f36055o2 = true;
            if (z2Var != null) {
                z2Var.A0(true);
            } else if (x1Var != null) {
                x1Var.l(true);
            }
            if (z10) {
                org.telegram.messenger.i0.h3(new bh(editTextBoldCursor, 2), 100L);
            }
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 2) {
            a1();
            Y0();
            Z0();
            float f11 = 1.0f - this.f36067q5.e;
            l20 l20Var = this.l1;
            l20Var.setAlpha(f11);
            this.R3.setProgressToHideUi(f7);
            this.f36008d4.invalidate();
            this.f21586b.invalidate();
            l20Var.invalidate();
        }
        if (i10 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.f21586b.invalidate();
        }
        if (i10 == 4) {
            a1();
            this.f36095x1.invalidate();
            this.f36099y1.invalidate();
        }
        if (i10 == 5) {
            a1();
            this.f21586b.invalidate();
        }
    }

    public final void w1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b50.w1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void x1() {
        org.telegram.messenger.u3 u3Var = this.R2;
        if (u3Var != null && u3Var.f18228b != null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
            x1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.R2.f18228b;
            tL_inputGroupCall.f19810id = groupCall.f19803id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f21583a).sendRequest(exportgroupcallinvite, new aa(this, x1Var, exportgroupcallinvite, 12));
        }
    }

    public final void z1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        TLObject L0;
        int i11;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        ?? r14;
        TextView textView;
        int i17;
        int i18;
        String str3;
        String str4;
        ?? r142;
        int i19;
        int i20;
        int i21;
        String str5;
        int i22;
        EditText editText;
        int i23;
        String str6;
        float f7;
        String L02;
        int i24;
        ?? r20;
        FrameLayout frameLayout;
        String L03;
        int i25;
        int i26;
        int i27;
        int L;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i28 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            org.telegram.messenger.c cVar = this.f36036k1;
            if (i28 > 0) {
                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(Long.valueOf(j10));
            } else {
                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(-j10));
            }
            TLObject tLObject = L0;
            boolean z10 = true;
            if (i10 != 0 && i10 != 2 && i10 != 3) {
                if (i10 == 6) {
                    this.Z1.O0(this.f21583a);
                    Bundle bundle = new Bundle();
                    if (i28 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.Z1.t0(new un(bundle));
                    dismiss();
                } else if (i10 == 8) {
                    this.Z1.O0(this.f21583a);
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
                    if ((k2Var instanceof un) && ((un) k2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i28 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.Z1.t0(new un(bundle2));
                    dismiss();
                } else if (i10 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    M1(2, true);
                } else if (i10 == 9) {
                    org.telegram.ui.Components.b40 b40Var = this.Y3;
                    if (b40Var == null || !b40Var.g()) {
                        TLRPC.User f10 = org.telegram.messenger.d20.i(cVar.f14863a).f();
                        org.telegram.ui.Components.b40 b40Var2 = new org.telegram.ui.Components.b40(0, true, true);
                        this.Y3 = b40Var2;
                        b40Var2.H = true;
                        b40Var2.R = true;
                        b40Var2.G = true;
                        b40Var2.J = true;
                        b40Var2.S = true;
                        b40Var2.f24523a = this.Z1.M().getLastFragment();
                        org.telegram.ui.Components.b40 b40Var3 = this.Y3;
                        j40 j40Var = new j40(this, j10);
                        this.Z3 = j40Var;
                        b40Var3.f24524b = j40Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f10.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z10 = false;
                        }
                        b40Var3.n(z10, new t10(this, 9), new jg.z(5), 0);
                    }
                } else if (i10 == 10) {
                    String str7 = groupCallParticipant.about;
                    Context context = getContext();
                    int i29 = this.f21583a;
                    Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    if (i28 > 0) {
                        str6 = null;
                        f7 = 8.0f;
                        L02 = org.telegram.messenger.cd.L0(2131743791, null);
                    } else {
                        str6 = null;
                        f7 = 8.0f;
                        L02 = org.telegram.messenger.cd.L0(2131751460, null);
                    }
                    String str8 = L02;
                    final org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = str8;
                    if (i28 > 0) {
                        i24 = 2131743422;
                    } else {
                        i24 = 2131751463;
                    }
                    x1Var.T = org.telegram.messenger.cd.L0(i24, str6);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setClipChildren(false);
                    if (i28 < 0) {
                        frameLayout = frameLayout2;
                        long j11 = -j10;
                        r20 = false;
                        if (org.telegram.messenger.vp.r1(i29).M0(j11) == null) {
                            org.telegram.messenger.vp.r1(i29).T2(ConnectionsManager.generateClassGuid(), j11, true);
                            r20 = false;
                        }
                    } else {
                        r20 = 0;
                        frameLayout = frameLayout2;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i30 = org.telegram.ui.ActionBar.t6.Vg;
                    org.telegram.ui.ActionBar.a7.V(editText2, i30, null);
                    if (i28 > 0) {
                        L03 = org.telegram.messenger.cd.L0(2131743791, null);
                    } else {
                        L03 = org.telegram.messenger.cd.L0(2131751460, null);
                    }
                    editText2.setHint(L03);
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.t6.U(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i28 > 0) {
                        i25 = 70;
                    } else {
                        i25 = 255;
                    }
                    org.telegram.ui.Components.k3 k3Var = new org.telegram.ui.Components.k3(i25, context, numberTextView);
                    InputFilter[] inputFilterArr = new InputFilter[1];
                    inputFilterArr[r20] = k3Var;
                    editText2.setFilters(inputFilterArr);
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, r20));
                    numberTextView.setImportantForAccessibility(2);
                    if (org.telegram.messenger.cd.X) {
                        i26 = 3;
                    } else {
                        i26 = 5;
                    }
                    FrameLayout frameLayout3 = frameLayout;
                    frameLayout3.addView(numberTextView, w7.b6.d(20, 20.0f, i26, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (org.telegram.messenger.cd.X) {
                        i27 = org.telegram.messenger.i0.L(24.0f);
                    } else {
                        i27 = 0;
                    }
                    int L2 = org.telegram.messenger.i0.L(f7);
                    if (org.telegram.messenger.cd.X) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.i0.L(24.0f);
                    }
                    editText2.setPadding(i27, L2, L, org.telegram.messenger.i0.L(f7));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.zp(i25, numberTextView));
                    org.telegram.messenger.i0.Y3(numberTextView, false, 0.0f, true, false);
                    editText2.setText(str7);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.o(frameLayout3);
                    final j2.d dVar = new j2.d(j10, i29, editText2, 4);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745963, null), dVar);
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    x1Var.N = new org.telegram.ui.Components.i1(editText2, 1);
                    frameLayout3.addView(editText2, w7.b6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    org.telegram.messenger.i0.J3(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i31, KeyEvent keyEvent) {
                            if (i31 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
                                if (x1Var2.isShowing()) {
                                    dVar.h(x1Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21029ih, false));
                    x1Var.show();
                    x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, i30, false));
                } else if (i10 == 11) {
                    Context context2 = getContext();
                    int i31 = this.f21583a;
                    Pattern pattern2 = org.telegram.ui.Components.s4.f30123a;
                    if (org.telegram.messenger.o5.E(j10)) {
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i31).Z1(Long.valueOf(j10));
                        str3 = Z1.first_name;
                        str4 = Z1.last_name;
                    } else {
                        str3 = org.telegram.messenger.vp.r1(i31).L0(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    ?? alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i28 > 0) {
                        i19 = 2131743441;
                        r142 = 0;
                    } else {
                        r142 = 0;
                        i19 = 2131743440;
                    }
                    String L04 = org.telegram.messenger.cd.L0(i19, r142);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = L04;
                    LinearLayout f11 = org.telegram.messenger.m5.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i32 = org.telegram.ui.ActionBar.t6.Vg;
                    org.telegram.ui.ActionBar.a7.V(editText3, i32, r142);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (org.telegram.messenger.cd.X) {
                        i20 = 5;
                    } else {
                        i20 = 3;
                    }
                    editText3.setGravity(i20);
                    editText3.setInputType(49152);
                    if (i28 > 0) {
                        i21 = 5;
                    } else {
                        i21 = 6;
                    }
                    editText3.setImeOptions(i21);
                    if (i28 > 0) {
                        i22 = 2131750695;
                        str5 = null;
                    } else {
                        str5 = null;
                        i22 = 2131743439;
                    }
                    editText3.setHint(org.telegram.messenger.cd.L0(i22, str5));
                    editText3.setBackground(org.telegram.ui.ActionBar.t6.U(context2));
                    editText3.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                    editText3.requestFocus();
                    if (i28 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.a7.V(editText, i32, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (org.telegram.messenger.cd.X) {
                            i23 = 5;
                        } else {
                            i23 = 3;
                        }
                        editText.setGravity(i23);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(org.telegram.messenger.cd.L0(2131749042, null));
                        editText.setBackground(org.telegram.ui.ActionBar.t6.U(context2));
                        editText.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                    } else {
                        editText = null;
                    }
                    org.telegram.messenger.i0.J3(editText3);
                    f11.addView(editText3, w7.b6.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        f11.addView(editText, w7.b6.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.o(f11);
                    di.a aVar = new di.a(editText3, j10, i31, editText);
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131745963, null), aVar);
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    x1Var2.N = new mg.g(3, editText3, editText);
                    x1Var2.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21029ih, false));
                    x1Var2.show();
                    x1Var2.p(org.telegram.ui.ActionBar.t6.x0(null, i32, false));
                    xd xdVar = new xd(1, x1Var2, aVar);
                    if (editText != null) {
                        editText.setOnEditorActionListener(xdVar);
                    } else {
                        editText3.setOnEditorActionListener(xdVar);
                    }
                } else if (i10 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    m1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        i17 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        i17 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    sharedInstance.setParticipantVolume(groupCallParticipant, org.telegram.messenger.w3.H(groupCallParticipant));
                    UndoView m12 = m1();
                    if (i10 == i17) {
                        i18 = 31;
                    } else {
                        i18 = 36;
                    }
                    m12.k(0L, i18, tLObject, null, null, null);
                }
            } else if (i10 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    m1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                ?? alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i33 = org.telegram.ui.ActionBar.t6.f20940dh;
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20134a;
                x1Var3.I = i33;
                TextView textView2 = new TextView(getContext());
                int i34 = org.telegram.ui.ActionBar.t6.Vg;
                org.telegram.ui.ActionBar.a7.V(textView2, i34, null);
                textView2.setTextSize(1, 16.0f);
                if (org.telegram.messenger.cd.X) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                ?? frameLayout4 = new FrameLayout(getContext());
                alertDialog$Builder3.o(frameLayout4);
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.u(org.telegram.messenger.i0.L(12.0f));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
                if (org.telegram.messenger.cd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout4.addView(g9Var, w7.b6.d(40, 40.0f, i12 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                r8Var.p(tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    g9Var.e(user, r8Var);
                    str = org.telegram.messenger.h20.j(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    g9Var.e(chat, r8Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.m5.m(textView3, i34, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (org.telegram.messenger.cd.X) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView3.setGravity(i13 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.Q2;
                if (chat2 != null) {
                    str2 = chat2.title;
                } else {
                    str2 = "";
                }
                if (i10 == 2) {
                    if (q1()) {
                        textView3.setText(org.telegram.messenger.cd.L0(2131743447, null));
                        org.telegram.messenger.m5.q(null, null, 2131743448, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(org.telegram.messenger.cd.L0(2131743371, null));
                        if (org.telegram.messenger.w3.W(this.Q2)) {
                            org.telegram.messenger.m5.q(null, null, 2131743490, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.m5.q(null, null, 2131743372, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(org.telegram.messenger.cd.L0(2131743428, null));
                    org.telegram.messenger.m5.q(null, null, 2131743429, new Object[]{str, str2}, textView2);
                }
                boolean z12 = org.telegram.messenger.cd.X;
                if (z12) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                int i35 = i14 | 48;
                int i36 = 76;
                if (z12) {
                    i15 = 21;
                } else {
                    i15 = 76;
                }
                float f12 = i15;
                if (!z12) {
                    i36 = 21;
                }
                frameLayout4.addView(textView3, w7.b6.d(-1, -2.0f, i35, f12, 11.0f, i36, 0.0f));
                if (org.telegram.messenger.cd.X) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout4.addView(textView2, w7.b6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i10 == 2) {
                    r14 = 0;
                    alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131743337, null), new rv(6, this, tLObject));
                } else {
                    r14 = 0;
                    r14 = 0;
                    if (z11) {
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131743430, null), new org.telegram.messenger.voip.d0(this, (TLRPC.User) tLObject, j10, 3));
                    }
                }
                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, r14), r14);
                x1Var3.j(org.telegram.ui.ActionBar.t6.x0(r14, org.telegram.ui.ActionBar.t6.f21029ih, false));
                x1Var3.show();
                if (i10 == 2 && (textView = (TextView) x1Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21049jh, r14);
                }
            }
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
