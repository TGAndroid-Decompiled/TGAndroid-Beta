package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.function.Consumer;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;
public class ProfileActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, xx, org.telegram.ui.Components.uv0, org.telegram.ui.Components.f50, org.telegram.ui.Components.nu0, qg0 {
    public static final int R6 = AndroidUtilities.dp(16.0f);
    public int A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public SpannableStringBuilder A5;
    public final ch.f A6;
    public ImageLocation B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public SpannableStringBuilder B5;
    public final hh.d B6;
    public int C0;
    public a0.h C1;
    public ArrayList C2;
    public int C3;
    public int C4;
    public fi.d[] C5;
    public final hh.c C6;
    public int D0;
    public boolean D1;
    public TLRPC.EncryptedChat D2;
    public int D3;
    public int D4;
    public org.telegram.messenger.v8 D5;
    public final ch.b D6;
    public Long E;
    public int E0;
    public long E1;
    public TLRPC.Chat E2;
    public int E3;
    public int E4;
    public FrameLayout E5;
    public final hh.b E6;
    public org.telegram.ui.Components.r5 F;
    public boolean F0;
    public float F1;
    public TL_bots.BotInfo F2;
    public int F3;
    public int F4;
    public fi.d F5;
    public final ch.b F6;
    public org.telegram.ui.Components.r5 G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public final oe.b G5;
    public jh.k G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TL_account.TL_password H2;
    public int H3;
    public int H4;
    public hz0 H5;
    public bi.g H6;
    public org.telegram.ui.Components.cs I;
    public boolean I0;
    public boolean I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public int I4;
    public AnimatorSet I5;
    public final ArrayList I6;
    public org.telegram.ui.Components.cs J;
    public final boolean[] J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public AnimatorSet J5;
    public final RectF J6;
    public org.telegram.ui.Components.fn0 K;
    public boolean K0;
    public boolean K1;
    public ImageLocation K2;
    public int K3;
    public int K4;
    public float K5;
    public final RectF K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public boolean L5;
    public final hh.c[] L6;
    public m01 M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.v8 M2;
    public int M3;
    public int M4;
    public final lz0 M5;
    public Drawable M6;
    public xz0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public View N5;
    public Drawable N6;
    public org.telegram.ui.Components.fy0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public Drawable O6;
    public boolean P;
    public org.telegram.ui.ActionBar.w0 P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public final oz0 P5;
    public org.telegram.ui.Components.zq P6;
    public org.telegram.ui.Components.tv0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public float[] Q5;
    public final int[] Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.w0 R0;
    public float R1;
    public int R2;
    public int R3;
    public int R4;
    public float R5;
    public org.telegram.ui.Components.px0 S;
    public org.telegram.ui.ActionBar.w0 S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public float S5;
    public b20 T;
    public org.telegram.ui.ActionBar.w0 T0;
    public int T1;
    public int T2;
    public int T3;
    public boolean T4;
    public boolean T5;
    public org.telegram.ui.Components.yj0 U;
    public org.telegram.ui.ActionBar.w0 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public g01 U5;
    public org.telegram.ui.Components.yj0 V;
    public org.telegram.ui.ActionBar.g1 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public org.telegram.ui.Components.t40 W;
    public org.telegram.ui.ActionBar.g1 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public final ArrayList W4;
    public float W5;
    public k0 X;
    public org.telegram.ui.ActionBar.g1 X0;
    public FlagSecureReason X1;
    public int X2;
    public int X3;
    public final ArrayList X4;
    public MessagesController.PeerColor X5;
    public bh.p Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public final SparseIntArray Y5;
    public org.telegram.ui.Components.ci0 Z;
    public org.telegram.ui.ActionBar.g1 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public boolean Z4;
    public int Z5;
    public ry0 f35972a;
    public MessagesController.SavedMusicList f35973a0;
    public org.telegram.ui.Components.r8 f35974a1;
    public float a2;
    public int f35975a3;
    public int f35976a4;
    public boolean f35977a5;
    public AnimatorSet f35978a6;
    public org.telegram.ui.Components.nm0 f35979b;
    public org.telegram.ui.Components.vi0 f35980b0;
    public float f35981b1;
    public float f35982b2;
    public int f35983b3;
    public int f35984b4;
    public fz0 f35985b5;
    public int f35986b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ty0 f35987c;
    public org.telegram.ui.Components.di0 f35988c0;
    public int f35989c1;
    public float f35990c2;
    public int f35991c3;
    public int f35992c4;
    public View f35993c5;
    public int f35994c6;
    public l01 d;
    public org.telegram.ui.Cells.o f35995d0;
    public z01 f35996d1;
    public float f35997d2;
    public int f35998d3;
    public int f35999d4;
    public int f36000d5;
    public boolean f36001d6;
    public w01 e;
    public az0 f36002e0;
    public long f36003e1;
    public float f36004e2;
    public int f36005e3;
    public int f36006e4;
    public int f36007e5;
    public boolean f36008e6;
    public hl f36009f;
    public AnimatorSet f36010f0;
    public long f36011f1;
    public float f36012f2;
    public int f36013f3;
    public int f36014f4;
    public int f36015f5;
    public org.telegram.ui.Components.bk0 f36016f6;
    public org.telegram.ui.Cells.d4 f36017g0;
    public long f36018g1;
    public float f36019g2;
    public int f36020g3;
    public int f36021g4;
    public long f36022g5;
    public final int[] f36023g6;
    public String h;
    public ImageView f36024h0;
    public boolean f36025h1;
    public float f36026h2;
    public int f36027h3;
    public int f36028h4;
    public boolean f36029h5;
    public float f36030h6;
    public ImageView f36031i0;
    public long f36032i1;
    public float f36033i2;
    public int f36034i3;
    public int f36035i4;
    public boolean f36036i5;
    public CharSequence f36037i6;
    public ImageView f36038j0;
    public boolean f36039j1;
    public ValueAnimator f36040j2;
    public int f36041j3;
    public int f36042j4;
    public String f36043j5;
    public CharSequence f36044j6;
    public ImageView f36045k0;
    public boolean f36046k1;
    public float f36047k2;
    public int f36048k3;
    public int f36049k4;
    public String f36050k5;
    public boolean f36051k6;
    public org.telegram.ui.Components.f31 f36052l0;
    public boolean l1;
    public float f36053l2;
    public int f36054l3;
    public int l4;
    public String f36055l5;
    public float f36056l6;
    public org.telegram.ui.Components.fi0 m0;
    public long f36057m1;
    public final float[] f36058m2;
    public int f36059m3;
    public int f36060m4;
    public org.telegram.ui.Components.bh f36061m5;
    public float f36062m6;
    public String f36063n;
    public bz0 f36064n0;
    public boolean f36065n1;
    public boolean f36066n2;
    public int f36067n3;
    public int f36068n4;
    public final HashSet f36069n5;
    public float f36070n6;
    public o01 f36071o0;
    public boolean f36072o1;
    public boolean f36073o2;
    public int f36074o3;
    public int f36075o4;
    public CharacterStyle f36076o5;
    public float f36077o6;
    public org.telegram.ui.Components.j9 f36078p0;
    public boolean f36079p1;
    public boolean f36080p2;
    public int f36081p3;
    public int f36082p4;
    public final org.telegram.ui.Cells.b2 f36083p5;
    public x01 f36084p6;
    public org.telegram.ui.Components.g50 f36085q0;
    public boolean f36086q1;
    public final Paint f36087q2;
    public int f36088q3;
    public int f36089q4;
    public final mz0 q5;
    public d11 f36090q6;
    public cz0 f36091r;
    public int f36092r0;
    public boolean f36093r1;
    public boolean f36094r2;
    public int f36095r3;
    public int f36096r4;
    public boolean f36097r5;
    public fi.v3 r6;
    public org.telegram.ui.Components.bk0 f36098s;
    public org.telegram.ui.Components.f31 f36099s0;
    public boolean f36100s1;
    public hi.b1 f36101s2;
    public int f36102s3;
    public int f36103s4;
    public vz0 f36104s5;
    public int f36105s6;
    public org.telegram.ui.Components.si0 f36106t0;
    public boolean f36107t1;
    public hi.y f36108t2;
    public int f36109t3;
    public int f36110t4;
    public float f36111t5;
    public Boolean f36112t6;
    public dz0 f36113u0;
    public int f36114u1;
    public TLRPC.ChatFull f36115u2;
    public int f36116u3;
    public int f36117u4;
    public float f36118u5;
    public TLRPC.TL_emojiStatusCollectible f36119u6;
    public AnimatorSet v;
    public bi.i1 f36120v0;
    public boolean f36121v1;
    public TLRPC.UserFull f36122v2;
    public int f36123v3;
    public int f36124v4;
    public boolean f36125v5;
    public int f36126v6;
    public Drawable f36127w;
    public View f36128w0;
    public boolean f36129w1;
    public org.telegram.ui.Cells.k6 f36130w2;
    public int f36131w3;
    public int f36132w4;
    public boolean f36133w5;
    public boolean f36134w6;
    public Drawable f36135x;
    public final org.telegram.ui.Components.r50 f36136x0;
    public boolean f36137x1;
    public boolean f36138x2;
    public int f36139x3;
    public int f36140x4;
    public ImageReceiver f36141x5;
    public int f36142x6;
    public Drawable f36143y;
    public final Paint f36144y0;
    public int f36145y1;
    public a11 f36146y2;
    public int y3;
    public int f36147y4;
    public FrameLayout f36148y5;
    public int f36149y6;
    public org.telegram.ui.ActionBar.u6 f36150z0;
    public boolean f36151z1;
    public CharSequence f36152z2;
    public int f36153z3;
    public int f36154z4;
    public FrameLayout[] f36155z5;
    public int f36156z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void C0(ProfileActivity profileActivity) {
        float f7;
        RectF rectF = profileActivity.K6;
        ch.f fVar = profileActivity.A6;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f36156z6) - AndroidUtilities.dp(8.0f);
            profileActivity.J6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(2, profileActivity.I6);
            fVar.e(profileActivity.H6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void H0(ProfileActivity profileActivity, int i10) {
        boolean E0 = org.telegram.ui.Components.bw0.E0(profileActivity.N.getClosestTab());
        if (i10 == profileActivity.f36126v6 && E0 == profileActivity.f36134w6) {
            return;
        }
        profileActivity.f36126v6 = i10;
        profileActivity.f36134w6 = E0;
        if (E0) {
            if (i10 > 0) {
                profileActivity.C5[0].i(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.C5[0].i(profileActivity.B5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.C5[0].i(profileActivity.A5, true, true);
        } else {
            profileActivity.C5[0].i(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static ValueAnimator I0(ProfileActivity profileActivity, final boolean z10) {
        float f7;
        boolean z11;
        int i10;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        bi.i1 i1Var = profileActivity.f36120v0;
        if (i1Var != null) {
            i1Var.setActive(!z10);
        }
        float f10 = profileActivity.U1;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        final float f11 = profileActivity.Q1;
        profileActivity.f35979b.setTranslationY(f11);
        profileActivity.f35979b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f35972a.setVisibility(0);
        profileActivity.r4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f36009f.setVisibility(0);
        profileActivity.f36091r.setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        kVar.t(z11);
        int i11 = 8;
        if (profileActivity.U1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.T0;
        if (w0Var != null) {
            w0Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.U1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f35979b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.g0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new pz0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.f35977a5 = true;
            profileActivity.N4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27530f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static SpannableStringBuilder P3(String str, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        o00 o00Var = new o00(9);
        o00Var.v = str;
        if (o00Var.f41941c != null) {
            o00Var.f41941c = null;
            o00Var.a();
        }
        o00Var.f41942f = w02;
        o00Var.f41943n = false;
        spannableStringBuilder.setSpan(o00Var, 0, spannableStringBuilder.length(), 0);
        o00[] o00VarArr = (o00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o00.class);
        if (o00VarArr != null) {
            for (o00 o00Var2 : o00VarArr) {
                o00Var2.getClass();
                o00Var2.f41942f = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                o00Var2.f41944r = i10;
                o00Var2.f41945s = u6Var;
                o00Var2.f41943n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void P4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(activity, 3, null);
        e2Var.f22576i0 = false;
        e2Var.show();
        Utilities.globalQueue.postRunnable(new f80(e2Var, z10, activity));
    }

    public static void S4(FrameLayout frameLayout, float f7) {
        int i10;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(R6 * f7);
        frameLayout.setAlpha(1.0f - f7);
        if (f7 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    public static void V(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.qc h;
        if (profileActivity.J2 == null) {
            if (profileActivity.f36086q1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f36011f1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f22080id == profileActivity.f36018g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (f7 = org.telegram.ui.Components.t5.f(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.wc.b0(profileActivity).h(f7, 1, new dy0(profileActivity, 3))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.T3()) {
                profileActivity.E4(false);
            }
        }
    }

    public static void V0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i11].equals(str)) {
                            if (codecInfoAt.isEncoder()) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList.add(Integer.valueOf(i10));
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                sb2.append("\n");
                sb2.append(arrayList2.size());
                sb2.append("+");
                sb2.append(arrayList3.size());
                sb2.append(" ");
                sb2.append(str.substring(6));
                sb2.append(" codecs:\n");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
                    sb2.append("{d} ");
                    sb2.append(codecInfoAt2.getName());
                    sb2.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt2.isHardwareAccelerated()) {
                            sb2.append("gpu");
                        }
                        if (codecInfoAt2.isSoftwareOnly()) {
                            sb2.append("cpu");
                        }
                        if (codecInfoAt2.isVendor()) {
                            sb2.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                    sb2.append("; mi=");
                    sb2.append(capabilitiesForType.getMaxSupportedInstances());
                    sb2.append(")");
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (i13 > 0 || !arrayList2.isEmpty()) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i13)).intValue());
                    sb2.append("{e} ");
                    sb2.append(codecInfoAt3.getName());
                    sb2.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt3.isHardwareAccelerated()) {
                            sb2.append("gpu");
                        }
                        if (codecInfoAt3.isSoftwareOnly()) {
                            sb2.append("cpu");
                        }
                        if (codecInfoAt3.isVendor()) {
                            sb2.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                    sb2.append("; mi=");
                    sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                    sb2.append(")");
                }
                sb2.append("\n");
            }
        } catch (Exception unused) {
        }
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    public static void X(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.X(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void Y(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z10;
        TLRPC.VideoSize closestVideoSizeWithSize;
        if (tL_error == null) {
            TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId()));
            if (user == null) {
                user = profileActivity.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                profileActivity.getMessagesController().putUser(user, false);
            } else {
                profileActivity.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                closestVideoSizeWithSize = null;
            } else {
                closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22052id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && profileActivity.I2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.I2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.I2.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f22177id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f36003e1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f36066n2 && profileActivity.f36002e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f36073o2 = z10;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        bz0 bz0Var = profileActivity.f36064n0;
        bz0Var.H0 = true;
        bz0Var.K0 = profileActivity.K2;
        bz0Var.f31310q1 = null;
        bz0Var.f31311r1 = null;
        bz0Var.setCreateThumbFromParent(false);
        profileActivity.u5(true);
        profileActivity.a5(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void Y0(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.f35990c2, 0.25f) / 0.25f;
        float f7 = 1.0f;
        if (profileActivity.f36086q1) {
            profileActivity.f36106t0.setAlpha(1.0f - min);
            profileActivity.f36106t0.setBlurIntensity(0.0f);
            int i10 = 0;
            profileActivity.f36106t0.setGooeyEnabled(false);
            org.telegram.ui.Components.si0 si0Var = profileActivity.f36106t0;
            if (profileActivity.f35990c2 >= 1.0f) {
                i10 = 8;
            }
            si0Var.setVisibility(i10);
        } else {
            profileActivity.f36106t0.setHideProgress(profileActivity.f35990c2);
        }
        dz0 dz0Var = profileActivity.f36113u0;
        if (dz0Var != null && profileActivity.J1 != 2) {
            float f10 = profileActivity.f35990c2;
            if (f10 > 0.0f) {
                f7 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f10, 0.0f, 0.5f));
            }
            dz0Var.setAlpha(f7);
        }
    }

    public static void Z(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            hi.d4.F0(context, profileActivity.currentAccount, profileActivity.f36122v2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f36150z0, false);
        } else {
            hi.d4.G0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f36150z0);
        }
    }

    public static void a0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        TLRPC.ChatParticipant chatParticipant;
        l01 l01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f35972a.C0();
        if (i10 >= profileActivity.f36049k4 && i10 < profileActivity.l4) {
            AgentController agentController = profileActivity.getMessagesController().getAgentController();
            int i11 = i10 - profileActivity.f36049k4;
            TL_agent.settings settingsVar = agentController.settings;
            if (settingsVar == null || i11 >= settingsVar.keys.size()) {
                return;
            }
            String str = agentController.settings.keys.get(i11).provider;
            if (TextUtils.equals(str, agentController.settings.active_provider)) {
                return;
            }
            agentController.setActiveProvider(str);
        } else if (i10 == profileActivity.f36060m4) {
            profileActivity.D4();
        } else if (i10 == profileActivity.S3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1));
            TLRPC.UserFull userFull = profileActivity.f36122v2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                bi.m0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f36003e1, new bi.c2(profileActivity, context, clientUserId, 3));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new hi.k(profileActivity.f36003e1));
            }
        } else if (i10 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f36018g1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f36018g1, z10);
            org.telegram.ui.Components.wc.A(profileActivity, z10, null).j();
            profileActivity.m5();
            int i12 = profileActivity.Q3;
            if (i12 < 0 || (l01Var = profileActivity.d) == null) {
                return;
            }
            l01Var.m(i12);
        } else if (i10 == profileActivity.Z3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f22177id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f36043j5);
            bundle.putString("first_name_card", profileActivity.f36050k5);
            bundle.putString("last_name_card", profileActivity.f36055l5);
            ls lsVar = new ls(bundle, profileActivity.f36150z0);
            lsVar.O = new zx0(profileActivity, user3);
            profileActivity.presentFragment(lsVar);
        } else if (i10 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.g5.h0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new dy0(profileActivity, 2), profileActivity.f36150z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
            }
        } else if (i10 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36150z0);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.f36022g5));
            org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(profileActivity.getParentActivity(), 1, profileActivity.f36150z0);
                y1VarArr[0] = y1Var;
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                y1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(y1VarArr[0], org.telegram.ui.Components.kb1.r(-1, -2));
                y1VarArr[0].setOnClickListener(new k20(y1VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new cf0(16, profileActivity, y1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(19));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23599q7, null);
            }
        } else if (i10 == profileActivity.f36132w4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f36032i1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.r2(bundle2));
        } else if (i10 == profileActivity.f36124v4) {
            profileActivity.showDialog(org.telegram.ui.Components.g5.U(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.f36150z0).f22369a);
        } else if (i10 == profileActivity.N3) {
            profileActivity.y4(view, f7, f10, false);
        } else if (i10 == profileActivity.Q4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f36003e1);
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.f35976a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == profileActivity.U3) {
            profileActivity.B4();
        } else if (i10 == profileActivity.V3) {
            x21.O(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f36154z4 && i10 < profileActivity.A4) {
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant = profileActivity.f36115u2.participants.participants.get(((Integer) profileActivity.C2.get(i10 - profileActivity.f36154z4)).intValue());
            } else {
                chatParticipant = profileActivity.f36115u2.participants.participants.get(i10 - profileActivity.f36154z4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.B4) {
            profileActivity.C4();
        } else if (i10 == profileActivity.L3) {
            profileActivity.K4(f7, f10, i10, view);
        } else if (i10 == profileActivity.f36089q4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new ii.j0(profileActivity, profileActivity.E2.linked_community_id, null, null));
            } else if (profileActivity.f36003e1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1))) == null) {
            } else {
                profileActivity.showDialog(new ii.j0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.I3) {
            if (profileActivity.f36115u2.location instanceof TLRPC.TL_channelLocation) {
                rc0 rc0Var = new rc0(5);
                rc0Var.f42928e0 = -profileActivity.f36011f1;
                rc0Var.f42954y0 = (TLRPC.TL_channelLocation) profileActivity.f36115u2.location;
                profileActivity.presentFragment(rc0Var);
            }
        } else if (i10 == profileActivity.R4) {
            profileActivity.x4(false);
        } else if (i10 == profileActivity.C4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f36011f1);
            bundle3.putInt("type", 2);
            mr mrVar = new mr(bundle3);
            mrVar.y0(profileActivity.f36115u2);
            profileActivity.presentFragment(mrVar);
        } else if (i10 == profileActivity.D4) {
            profileActivity.presentFragment(new mh0(profileActivity.f36011f1));
        } else if (i10 == profileActivity.E4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f36011f1);
            bundle4.putInt("type", 1);
            mr mrVar2 = new mr(bundle4);
            mrVar2.y0(profileActivity.f36115u2);
            profileActivity.presentFragment(mrVar2);
        } else if (i10 == profileActivity.F4) {
            profileActivity.S0.performClick();
        } else if (i10 == profileActivity.G4) {
            profileActivity.presentFragment(new bi.y(0, profileActivity.f36003e1));
        } else if (i10 == profileActivity.H4) {
            profileActivity.presentFragment(new bi.y(1, profileActivity.f36003e1));
        } else if (i10 == profileActivity.I4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f36011f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new y91(bundle5));
        } else if (i10 == profileActivity.L4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f36011f1);
            bundle6.putInt("type", 0);
            mr mrVar3 = new mr(bundle6);
            mrVar3.y0(profileActivity.f36115u2);
            profileActivity.presentFragment(mrVar3);
        } else if (i10 == profileActivity.f36013f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f36027h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.z0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f36034i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f36041j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f36048k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f36059m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f36054l3) {
            profileActivity.presentFragment(new wb0());
        } else if (i10 == profileActivity.f36067n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f36088q3) {
            profileActivity.showDialog(org.telegram.ui.Components.g5.T(profileActivity, profileActivity.f36150z0));
        } else if (i10 == profileActivity.f36095r3) {
            qf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f36102s3) {
            qf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f36123v3) {
            P4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f36131w3) {
            P4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f36139x3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36150z0);
            alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new yx0(profileActivity, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f22369a);
        } else if (i10 == profileActivity.f36020g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new ta(null));
        } else if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new g(3));
        } else if (i10 == profileActivity.O2) {
            profileActivity.B4();
        } else if (i10 == profileActivity.f35992c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f35999d4) {
            profileActivity.presentFragment(new bi.dd());
        } else if (i10 == profileActivity.f36006e4) {
            profileActivity.presentFragment(new gi.h());
        } else if (i10 == profileActivity.f36014f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f36021g4) {
            vg.n1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            hi.b1 b1Var = profileActivity.f36101s2;
            if (b1Var != null) {
                b1Var.l(!b1Var.g(), new by0(3, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            hi.y yVar = profileActivity.f36108t2;
            if (yVar != null) {
                yVar.f13368f = true;
                yVar.e = !yVar.e;
                yVar.k();
                ((org.telegram.ui.Cells.v8) view).setChecked(profileActivity.f36108t2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.setChecked(!v8Var.d());
            if (profileActivity.f36110t4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f36110t4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f36003e1);
            boolean d = v8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f36122v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new l10(25, profileActivity, r0));
            profileActivity.f36110t4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.O3) {
            profileActivity.T4 = !profileActivity.T4;
            profileActivity.N4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.O3);
            int i13 = profileActivity.f35986b6;
            if (i13 >= 0) {
                profileActivity.f35987c.h1(i13, profileActivity.f35994c6 - profileActivity.f35972a.getPaddingTop());
            }
        } else if (i10 == profileActivity.P3) {
            profileActivity.H4(false);
        } else if (i10 == profileActivity.Q2) {
            if (profileActivity.f36122v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f36122v2.personal_channel_id);
            profileActivity.presentFragment(new wn(bundle7));
        } else if (i10 == profileActivity.U2) {
            d11 d11Var = profileActivity.f36090q6;
            if ((d11Var == null || !d11Var.a()) && !profileActivity.S3(i10, view)) {
                org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
                if (g9Var.d.getDrawable() != null) {
                    profileActivity.A4(g9Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.H3) {
            profileActivity.R3(i10, view);
        } else {
            profileActivity.K4(f7, f10, i10, view);
        }
    }

    public static void b0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.sc0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new hb0(profileActivity, 20), profileActivity.f36150z0);
    }

    public static void c0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.Z3 >= 0) {
            if (profileActivity.P4 == -1) {
                profileActivity.v5();
                profileActivity.d.l();
            } else {
                profileActivity.p5(false, false);
            }
        }
        if (profileActivity.P4 == -1) {
            if (!profileActivity.f36066n2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f35972a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f35972a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    l01 l01Var = profileActivity.d;
                    if (i12 >= l01Var.e.N2) {
                        break;
                    }
                    s4.e1 g7 = l01Var.g(null, l01Var.j(i12));
                    View view = g7.f47773a;
                    profileActivity.d.v(g7, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.c4() + i13) + i11));
                ry0 ry0Var = profileActivity.f35972a;
                ry0Var.setPadding(0, ry0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f35972a.setPadding(0, profileActivity.c4(), 0, 0);
                profileActivity.f36040j2.cancel();
                float[] fArr = profileActivity.f36058m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.R4(1.0f);
                profileActivity.Q1 = profileActivity.c4();
            }
        }
        profileActivity.L.m(profileActivity.f36032i1, user, 8);
    }

    public static void d0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z10;
        int i10;
        LinearLayout linearLayout;
        int i11;
        int w02;
        boolean z11;
        long j10;
        char c10;
        final t3 t3Var;
        float f7;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f36122v2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            runnable = k3Var.dismissRunnable;
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f36150z0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout2.addView(limitPreviewView, org.telegram.ui.Components.kb1.x(-1, -2, 17, 0, 20, 0, 10));
            int i12 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout2.addView(frameLayout, org.telegram.ui.Components.kb1.x(-1, -2, 17, 40, -12, 40, 20));
                int i13 = 2;
                TextView[] textViewArr = new org.telegram.ui.Components.aa0[2];
                int i14 = 0;
                while (i14 < i13) {
                    int i15 = i13;
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, 3, null);
                    textViewArr[i14] = xbVar;
                    xbVar.setGravity(i12);
                    textViewArr[i14].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.f7.V(textViewArr[i14], org.telegram.ui.ActionBar.y6.f23749y6, null);
                    org.telegram.ui.ActionBar.f7.H(textViewArr[i14], org.telegram.ui.ActionBar.y6.gc, null);
                    frameLayout.addView(textViewArr[i14], org.telegram.ui.Components.kb1.i(-1, -1, 119));
                    TextView textView = textViewArr[i14];
                    if (i14 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    textView.setAlpha(f7);
                    TextView textView2 = textViewArr[i14];
                    if (i14 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    textView2.setScaleX(f10);
                    TextView textView3 = textViewArr[i14];
                    if (i14 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView3.setScaleY(f11);
                    i14++;
                    i13 = i15;
                    i12 = 17;
                }
                int i16 = i13;
                t3 t3Var2 = new t3(textViewArr, 21);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                linearLayout = linearLayout2;
                long j11 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                if (tl_starsRating != null) {
                    j10 = tl_starsRating.stars - j11;
                } else {
                    j10 = 0;
                }
                long j12 = (-j11) - j10;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
                long j13 = userFull.stars_my_pending_rating.stars;
                long j14 = userFull.stars_rating.stars;
                long j15 = j13 - j14;
                if ((j14 < 0 && !z11) || (z11 && j12 > 0)) {
                    org.telegram.ui.ActionBar.f7.V(textViewArr[0], org.telegram.ui.ActionBar.y6.f23599q7, null);
                    if (z11) {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                    }
                    c10 = 0;
                    t3Var = t3Var2;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuture", max);
                    String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = formatPluralStringComma;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i16] = formatPluralStringComma2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c10 = 0;
                    t3Var = t3Var2;
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                        @Override
                        public final void run() {
                            int i17 = r4;
                            t3 t3Var3 = t3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i17) {
                                case 0:
                                    int i18 = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    t3Var3.run(Boolean.TRUE);
                                    return;
                                default:
                                    int i19 = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    t3Var3.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    textViewArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i17 = r4;
                            t3 t3Var3 = t3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i17) {
                                case 0:
                                    int i18 = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    t3Var3.run(Boolean.TRUE);
                                    return;
                                default:
                                    int i19 = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    t3Var3.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String formatPluralStringComma3 = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
                String formatPluralStringComma4 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = formatPluralStringComma3;
                i10 = 1;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i16] = formatPluralStringComma4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() {
                    @Override
                    public final void run() {
                        int i17 = r4;
                        t3 t3Var3 = t3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                int i18 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                t3Var3.run(Boolean.TRUE);
                                return;
                            default:
                                int i19 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                t3Var3.run(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                textViewArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i17 = r4;
                        t3 t3Var3 = t3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                int i18 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                t3Var3.run(Boolean.TRUE);
                                return;
                            default:
                                int i19 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                t3Var3.run(Boolean.FALSE);
                                return;
                        }
                    }
                });
                textViewArr[1].setText(spannableStringBuilder2);
            } else {
                i10 = 1;
                linearLayout = linearLayout2;
            }
            TextView textView4 = new TextView(parentActivity);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            d3.o(R.string.StarRatingTitle, textView4, i10, 20.0f);
            int i17 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(textView4, i17, profileActivity.f36150z0);
            LinearLayout linearLayout3 = linearLayout;
            linearLayout3.addView(textView4, org.telegram.ui.Components.kb1.x(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f22178id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.t.n(R.string.StarRatingSelfDescription, textView5);
                i11 = 1;
            } else {
                i11 = 1;
                org.telegram.messenger.wh.o(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i11, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView5, i17, profileActivity.f36150z0);
            linearLayout3.addView(textView5, org.telegram.ui.Components.kb1.x(-1, -2, 17, 20, 0, 20, 12));
            iw0 iw0Var = new iw0(parentActivity, profileActivity.f36150z0);
            iw0Var.f40279a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i18 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i19 = org.telegram.ui.ActionBar.y6.Oh;
            iw0Var.f40280b.setText(LocaleController.formatSpannable(i18, P3(string, i19, profileActivity.f36150z0)));
            iw0Var.d.setVisibility(8);
            int i20 = R.drawable.menu_gift;
            ImageView imageView = iw0Var.f40281c;
            imageView.setImageResource(i20);
            org.telegram.ui.ActionBar.u6 u6Var = profileActivity.f36150z0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.f7.t(imageView, i17, u6Var, mode);
            linearLayout3.addView(iw0Var, org.telegram.ui.Components.kb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            iw0 iw0Var2 = new iw0(parentActivity, profileActivity.f36150z0);
            iw0Var2.f40279a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            iw0Var2.f40280b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, P3(LocaleController.getString(R.string.StarRatingAdded), i19, profileActivity.f36150z0)));
            iw0Var2.d.setVisibility(8);
            int i21 = R.drawable.menu_stars_gift;
            ImageView imageView2 = iw0Var2.f40281c;
            imageView2.setImageResource(i21);
            org.telegram.ui.ActionBar.f7.t(imageView2, i17, profileActivity.f36150z0, mode);
            linearLayout3.addView(iw0Var2, org.telegram.ui.Components.kb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            iw0 iw0Var3 = new iw0(parentActivity, profileActivity.f36150z0);
            iw0Var3.f40279a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i22 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.y6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23521m6, profileActivity.f36150z0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, profileActivity.f36150z0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
            o00 o00Var = new o00(9);
            o00Var.v = string2;
            if (o00Var.f41941c != null) {
                o00Var.f41941c = null;
                o00Var.a();
            }
            o00Var.f41942f = w02;
            o00Var.f41943n = false;
            spannableStringBuilder3.setSpan(o00Var, 0, spannableStringBuilder3.length(), 0);
            iw0Var3.f40280b.setText(LocaleController.formatSpannable(i22, spannableStringBuilder3));
            iw0Var3.d.setVisibility(8);
            int i23 = R.drawable.menu_refund;
            ImageView imageView3 = iw0Var3.f40281c;
            imageView3.setImageResource(i23);
            org.telegram.ui.ActionBar.f7.t(imageView3, i17, profileActivity.f36150z0, mode);
            linearLayout3.addView(iw0Var3, org.telegram.ui.Components.kb1.o(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(parentActivity, profileActivity.f36150z0, true);
            dVar.setOnClickListener(new my0(0, runnable));
            dVar.i(bi.h7.H2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout3.addView(dVar, org.telegram.ui.Components.kb1.o(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            k3Var.customView = linearLayout3;
            k3Var.show();
        }
    }

    public static void e0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f36086q1;
                if (z10) {
                    if (z10) {
                        profileActivity.V3();
                        return;
                    }
                    return;
                } else if (profileActivity.f36003e1 != 0) {
                    profileActivity.F4();
                    return;
                } else if (profileActivity.f36011f1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f36011f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f36011f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new wn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.V3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f36011f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new wn(bundle2), false);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                profileActivity.y4(profileActivity.Z, f7, f10, true);
                return;
            case 2:
                profileActivity.G4();
                return;
            case 3:
                profileActivity.w4();
                return;
            case 4:
                profileActivity.z4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.v4(false);
                return;
            case 6:
                profileActivity.v4(true);
                return;
            case 7:
                profileActivity.x4(true);
                return;
            case 8:
                x21.O(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.p4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(profileActivity.getParentActivity(), 3, profileActivity.f36150z0);
                e2Var.r(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new org.telegram.ui.Components.oy(21, profileActivity, e2Var), true, profileActivity.f36150z0);
                return;
            case 13:
                profileActivity.u4(true);
                return;
            case 14:
                profileActivity.B4();
                return;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(profileActivity, profileActivity.Z);
                    H.f30171w = false;
                    H.f30150i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new hb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new oy0(currentUser, 0), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new hb0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.Z.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new f81(null));
                return;
            default:
                return;
        }
    }

    public static void f0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f35973a0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.f35973a0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f35973a0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f36122v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.f35973a0.list.isEmpty()) {
            if (MediaController.getInstance().currentSavedMusicList == profileActivity.f35973a0 && MediaController.getInstance().isPlayingMessage(profileActivity.f35973a0.list.get(0))) {
                z10 = true;
            } else {
                MediaController.getInstance().cleanup();
                z10 = false;
            }
            MediaController.getInstance().currentSavedMusicList = profileActivity.f35973a0;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(profileActivity.f35973a0.list);
            if (!z10) {
                MediaController.getInstance().playMessage(profileActivity.f35973a0.list.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.m8(profileActivity.getParentActivity(), profileActivity.f36150z0));
        }
    }

    public static void g0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        int i10;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.U1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        float f12 = 0.0f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f13 = -f7;
        profileActivity.T1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.f35979b.setTranslationY(floatValue * f7);
        profileActivity.O.setTranslationY(f7 * profileActivity.U1);
        profileActivity.f35972a.setTranslationY((1.0f - profileActivity.U1) * f13);
        profileActivity.f35972a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f35972a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f35972a.setAlpha(profileActivity.U1);
        boolean z11 = true;
        profileActivity.r4(true);
        profileActivity.f35972a.setAlpha(f10);
        profileActivity.f35979b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.f35979b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.f35979b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f10);
        profileActivity.X.setAlpha(f10);
        profileActivity.f36002e0.setAlpha(f10);
        dz0 dz0Var = profileActivity.f36113u0;
        if (dz0Var != null) {
            dz0Var.setAlpha(f10);
        }
        profileActivity.f36009f.setAlpha(f10);
        cz0 cz0Var = profileActivity.f36091r;
        if (!profileActivity.L5) {
            f12 = f10;
        }
        cz0Var.setAlpha(f12);
        profileActivity.U0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
            if (w0Var.F.getWidth() != 0 && !w0Var.e.isFocused()) {
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
            }
        }
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        int i11 = 8;
        if (profileActivity.U1 < 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        searchContainer.setVisibility(i10);
        if (profileActivity.U1 > 0.5f) {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.T0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i11);
            profileActivity.T0.setAlpha(f10);
        }
        profileActivity.U0.setVisibility(i11);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 >= 0.5f) {
            z11 = false;
        }
        kVar.t(z11);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.T0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f10);
        }
        profileActivity.U0.setAlpha(f10);
        profileActivity.f35996d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void h0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.j11.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f36150z0);
    }

    public static boolean i0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.f36032i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.E2) && !profileActivity.E2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.d90.f27374s;
        org.telegram.ui.Components.d90.w(parentActivity, profileActivity, org.telegram.ui.Components.wc.b0(profileActivity), z11);
        if (!z10 || profileActivity.R4 != -1) {
            profileActivity.v5();
            l01 l01Var = profileActivity.d;
            if (l01Var != null) {
                l01Var.l();
            }
        }
        if (r2Var instanceof wn) {
            ((wn) r2Var).Kb(false, true);
        }
        return false;
    }

    public static void j0(ProfileActivity profileActivity, org.telegram.ui.Cells.y1[] y1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f36003e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.f36022g5);
        tL_messages_reportReaction.f22136id = profileActivity.f36015f5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new di.d6(21));
        org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
        if (y1Var != null && y1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.f36022g5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1)));
        }
        profileActivity.f36015f5 = 0;
        profileActivity.p5(false, false);
        org.telegram.ui.Components.wc.b0(profileActivity).E(profileActivity.f36150z0).j();
    }

    public static void k0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f36003e1;
        if (j10 == 0) {
            long j11 = profileActivity.f36011f1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f36032i1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.f36022g5, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.f36022g5, j12, profileActivity.f36015f5);
        }
        profileActivity.f36015f5 = 0;
        profileActivity.p5(false, false);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(profileActivity.getParentActivity(), profileActivity.f36150z0);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f35028b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.wc.b0(profileActivity).b(ybVar, 1500).j();
    }

    public static void l0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.f36002e0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f36078p0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.v5();
                l01 l01Var = profileActivity.d;
                if (l01Var != null) {
                    l01Var.l();
                }
                profileActivity.r4(true);
            }
            bz0 bz0Var = profileActivity.f36064n0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.J2);
            profileActivity.K2 = forLocal;
            bz0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.I2));
            profileActivity.a5(true, false);
        } else if (profileActivity.I2 == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.Z5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l10(24, profileActivity, str));
        }
        profileActivity.actionBar.l().requestLayout();
    }

    public static void m0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(profileActivity).R(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            R.f31861j = 5000;
            R.j();
            return;
        }
        if (tL_birthday == null) {
            userFull.flags2 &= -33;
        } else {
            userFull.flags2 |= 32;
        }
        userFull.birthday = tL_birthday;
        profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (profileActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.resourceProvider);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f22369a);
                return;
            }
            return;
        }
        org.telegram.messenger.t.q(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity), R.raw.error, 36);
    }

    public static void m1(ProfileActivity profileActivity) {
        int i10;
        org.telegram.ui.ActionBar.r5 r5Var = profileActivity.simpleActionBar;
        if (r5Var != null) {
            float max = Math.max(profileActivity.K5, r5Var.getActionModeFactor());
            profileActivity.simpleActionBar.setAlpha(max);
            org.telegram.ui.ActionBar.r5 r5Var2 = profileActivity.simpleActionBar;
            int i11 = 0;
            if (max > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r5Var2.setVisibility(i10);
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                kVar.setAlpha(1.0f - max);
                org.telegram.ui.ActionBar.k kVar2 = profileActivity.actionBar;
                if (max >= 1.0f) {
                    i11 = 4;
                }
                kVar2.setVisibility(i11);
            }
        }
    }

    public static void n0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.b6 b6Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            qf.d.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        tg.m1 m1Var = new tg.m1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f36150z0);
        b6Var.getLocationOnScreen(new int[2]);
        m1Var.f48988v0 = b6Var.f22462h0;
        m1Var.f48989w0 = b6Var.f22463i0;
        m1Var.f48992z0 = b6Var.getScaleX();
        m1Var.f48990x0 = b6Var.getLeft();
        m1Var.f48991y0 = b6Var.getTop();
        m1Var.A0 = b6Var;
        Drawable rightDrawable = b6Var.getRightDrawable();
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (rightDrawable == r5Var && r5Var != null) {
            Drawable drawable = r5Var.f32123f[0];
            if (drawable instanceof org.telegram.ui.Components.t5) {
                m1Var.f48992z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.t5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if ("video/webm".equals(document.mime_type)) {
                        forDocument = ImageLocation.getForDocument(document);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str = "160_160_g";
                    } else {
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        forDocument = ImageLocation.getForDocument(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    ImageLocation imageLocation = forDocument;
                    y9Var.setLayerNum(7);
                    y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    y9Var.l(imageLocation, str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.t5) profileActivity.F.f32123f[0]).c()) {
                        y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23693v6, profileActivity.f36150z0), PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = y9Var;
                    m1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(m1Var);
    }

    public static void q1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        float f7;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f35972a.setVisibility(i10);
        org.telegram.ui.Components.nm0 nm0Var = profileActivity.f35979b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        nm0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        bi.i1 i1Var = profileActivity.f36120v0;
        if (i1Var != null) {
            i1Var.setActive(!z10);
        }
        profileActivity.actionBar.t(z10);
        profileActivity.X.setVisibility(i10);
        dz0 dz0Var = profileActivity.f36113u0;
        if (dz0Var != null) {
            dz0Var.setVisibility(i10);
        }
        profileActivity.f36009f.setVisibility(i10);
        profileActivity.f36091r.setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.T0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.f36002e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        dz0 dz0Var2 = profileActivity.f36113u0;
        if (dz0Var2 != null) {
            dz0Var2.setAlpha(1.0f);
        }
        bi.i1 i1Var2 = profileActivity.f36120v0;
        if (i1Var2 != null) {
            i1Var2.setAlpha(1.0f);
        }
        profileActivity.f36009f.setAlpha(1.0f);
        cz0 cz0Var = profileActivity.f36091r;
        if (profileActivity.L5) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        cz0Var.setAlpha(f7);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f35972a.setAlpha(1.0f);
        profileActivity.f35979b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z10) {
            profileActivity.f35979b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public static ProfileActivity t4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void z3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f36002e0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.e81) {
            profileActivity.f36002e0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.g6) {
            org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) drawable;
            profileActivity.f36002e0.u(null, null, g6Var);
            if (z10) {
                g6Var.f(profileActivity.f36002e0);
            }
        } else {
            ImageLocation D = profileActivity.f36064n0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f36002e0.u(D, str, drawable);
        }
    }

    public final void A4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f36011f1);
            bundle.putLong("user_id", this.f36003e1);
            presentFragment(new ai.z0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.U2) {
            if (this.f36003e1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f36122v2)) {
                org.telegram.ui.Components.wc.b0(this).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f36003e1)))).j();
            } else {
                showDialog(new zh.p1(getParentActivity(), this.currentAccount, this.f36003e1, null, null));
            }
        }
    }

    public final void A5(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        float f7;
        TLRPC.ChatFull chatFull;
        float f10 = 0.2f;
        int i12 = (G3() > 0.2f ? 1 : (G3() == 0.2f ? 0 : -1));
        int i13 = 0;
        if (i12 > 0 && !this.W1 && (this.f36085q0 == null || this.O2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O5 = z11;
        K3();
        org.telegram.ui.Components.bk0 bk0Var = this.f36098s;
        if (bk0Var != null && bk0Var.getVisibility() != 8) {
            org.telegram.ui.Components.bk0 bk0Var2 = this.f36098s;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            bk0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) + this.Q1) + this.T1) - AndroidUtilities.dp(29.5f));
            if (i12 > 0 && !this.W1 && !this.f36100s1 && (this.f36085q0 == null || this.O2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f36011f1 != 0) {
                if (ChatObject.isChannel(this.E2) && !this.E2.megagroup && (chatFull = this.f36115u2) != null && chatFull.linked_chat_id != 0 && (this.D3 != -1 || this.E3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.G1) {
                if (this.f36098s.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.f36098s.setTag(null);
                    } else {
                        this.f36098s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        this.v = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.v = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.v.playTogether(ObjectAnimator.ofFloat(this.f36098s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f36098s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f36098s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.v.playTogether(ObjectAnimator.ofFloat(this.f36098s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f36098s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f36098s, View.ALPHA, 0.0f));
                        }
                        this.v.setDuration(150L);
                        this.v.addListener(new oz0(this, 2));
                        this.v.start();
                    } else {
                        org.telegram.ui.Components.bk0 bk0Var3 = this.f36098s;
                        if (z12) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.2f;
                        }
                        bk0Var3.setScaleX(f7);
                        org.telegram.ui.Components.bk0 bk0Var4 = this.f36098s;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        bk0Var4.setScaleY(f10);
                        org.telegram.ui.Components.bk0 bk0Var5 = this.f36098s;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        bk0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        dz0 dz0Var = this.f36113u0;
        if (dz0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            dz0Var.f36269i0 = measuredWidth;
            dz0Var.f36271k0 = z12;
            dz0Var.f36270j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            dz0Var.invalidate();
        }
        bi.i1 i1Var = this.f36120v0;
        if (i1Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            i1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13 + this.Q1 + this.T1);
        }
    }

    public final void B4() {
        boolean z10;
        org.telegram.ui.Components.yj0 yj0Var;
        if (this.f36003e1 != 0) {
            if (this.f36085q0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.g50 g50Var = this.f36085q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g50Var.n(z10, new hb0(this, 24), new u5(this, 13), 0);
                    this.U.M(0);
                    this.U.P(43);
                    this.V.M(0);
                    this.V.P(43);
                    org.telegram.ui.Components.ci0 ci0Var = this.Z;
                    if (ci0Var != null) {
                        org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.f27165a);
                        if (j10 != null && (yj0Var = j10.f35349k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        this.f36098s.d();
                    }
                    org.telegram.ui.Cells.v8 v8Var = this.M2;
                    if (v8Var != null) {
                        v8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            F4();
            return;
        }
        G4();
    }

    public final void B5() {
        org.telegram.ui.Components.ws0 ws0Var;
        org.telegram.ui.Components.vt0 vt0Var;
        org.telegram.ui.Components.aa0 aa0Var;
        int w02;
        int w03;
        int w04;
        int color3;
        int w05;
        int w06;
        int w07;
        this.Y5.clear();
        z01 z01Var = this.f35996d1;
        if (z01Var != null) {
            z01Var.a(this.X5, true);
        }
        cz0 cz0Var = this.f36091r;
        if (cz0Var != null) {
            if (cz0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.y6.w0(((Integer) this.f36091r.getTag()).intValue(), this.f36150z0);
            } else {
                w07 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.f36150z0);
            }
            this.f36091r.setTextColor(i0.a.f(this.f36047k2, D3(w07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        x01 x01Var = this.f36084p6;
        float f7 = -0.1f;
        if (x01Var != null) {
            x01Var.a(i0.a.f(this.f36047k2, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.b(0.18f, -0.1f, this.f35989c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.X5 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, this.f36150z0);
            }
            kVar.y(i0.a.f(this.K5, w05, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23751y8, this.f36150z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.X5;
            if (peerColor != null) {
                w06 = 1090519039;
            } else if (peerColor != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23395f8, this.f36150z0);
            }
            kVar2.x(i0.a.f(this.K5, w06, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23770z8, this.f36150z0)), false);
        }
        if (this.f36135x != null) {
            MessagesController.PeerColor peerColor2 = this.X5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.X5.hasColor6(org.telegram.ui.ActionBar.y6.I.q())) {
                    color3 = this.X5.getColor5();
                } else {
                    color3 = this.X5.getColor3();
                }
                int f10 = i0.a.f(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    f7 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.y6.b(0.1f, f7, f10);
            } else {
                w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f36150z0);
            }
            this.f36135x.setColorFilter(AndroidUtilities.getOffsetColor(w04, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.f36150z0), this.K5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            if (this.X5 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ah, this.f36150z0);
            }
            this.H.setColorFilter(AndroidUtilities.getOffsetColor(w03, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0), this.K5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        hl hlVar = this.f36009f;
        if (hlVar != null) {
            if (this.X5 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23703vh, this.f36150z0);
            }
            hlVar.setTextColor(i0.a.f(this.f36047k2, i0.a.f(this.K5, w02, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.f36150z0)), -1));
        }
        org.telegram.ui.Components.r8 r8Var = this.f35974a1;
        if (r8Var != null && (aa0Var = r8Var.e) != null) {
            aa0Var.invalidate();
        }
        Drawable drawable = this.f36127w;
        if (drawable != null) {
            if (this.X5 == null) {
                i10 = i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.f36150z0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.vi0 vi0Var = this.f35980b0;
        if (vi0Var != null) {
            vi0Var.setColor(this.X5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f35972a, (Utilities.Callback<View>) new dy0(this, 4));
        xz0 xz0Var = this.N;
        if (xz0Var != null && (vt0Var = xz0Var.K0) != null) {
            vt0Var.updateColors();
        }
        xz0 xz0Var2 = this.N;
        if (xz0Var2 != null && (ws0Var = xz0Var2.f26925a0) != null) {
            ws0Var.m();
        }
        C5();
        j5();
        dz0 dz0Var = this.f36113u0;
        if (dz0Var != null) {
            dz0Var.f(true, true);
        }
        bi.i1 i1Var = this.f36120v0;
        if (i1Var != null) {
            i1Var.a();
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C3() {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        if (this.N != null && (kVar = this.actionBar) != null) {
            int i11 = 0;
            if (kVar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            this.N.h1(-AndroidUtilities.dp(6.0f), oi.a.c(i10) + (currentActionBarHeight - AndroidUtilities.dp(6.0f)), oi.a.c(this.f36156z6), this.f36156z6 + this.f36142x6);
            if (this.N5 != null) {
                int dp = AndroidUtilities.dp(44.0f) + currentActionBarHeight;
                if (this.N5.getLayoutParams().height != dp) {
                    this.N5.getLayoutParams().height = dp;
                    this.N5.requestLayout();
                }
                this.N5.setTranslationY(-currentActionBarHeight);
            }
            xz0 xz0Var = this.N;
            if (xz0Var != null) {
                if (this.L5) {
                    i11 = Integer.MAX_VALUE;
                }
                xz0Var.setPagesVisibleOverscanTop(i11);
            }
        }
    }

    public final void C4() {
        Bundle i10 = a1.g.i("addToGroup", true);
        i10.putLong("chatId", this.E2.f22028id);
        t60 t60Var = new t60(i10);
        TLRPC.ChatFull chatFull = this.f36115u2;
        t60Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < this.f36115u2.participants.participants.size(); i11++) {
                hVar.k(null, this.f36115u2.participants.participants.get(i11).user_id);
            }
            t60Var.J = hVar;
        }
        t60Var.f43525x = new yx0(this, 10);
        presentFragment(t60Var);
    }

    public final void C5() {
        if (this.f36098s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23742xh, this.f36150z0);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23760yh, this.f36150z0);
                int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23723wh, this.f36150z0);
                if (this.X5 != null && org.telegram.ui.ActionBar.y6.d1(w02)) {
                    w02 = org.telegram.ui.ActionBar.y6.b(0.05f, -0.04f, this.X5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.X5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
                        w03 = org.telegram.ui.ActionBar.y6.C(org.telegram.ui.ActionBar.y6.I.q(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23693v6, this.f36150z0), bgColor2, w03, bgColor2);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.bk0 bk0Var = this.f36016f6;
                org.telegram.ui.Components.bk0 bk0Var2 = this.f36098s;
                int[] iArr = this.f36023g6;
                if (bk0Var != bk0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f36016f6 = bk0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(mutate, org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(56.0f), w02, w03), 0, 0);
                    int dp = AndroidUtilities.dp(56.0f);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    arVar.e = dp;
                    arVar.f26642f = dp2;
                    this.f36098s.setBackground(arVar);
                    this.f36098s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final int D3(int i10, Boolean bool) {
        int i11;
        if (this.X5 != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, this.f36150z0);
            int f7 = i0.a.f(0.5f, this.X5.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), this.X5.getStoryColor2(org.telegram.ui.ActionBar.y6.I.q()));
            if (!org.telegram.ui.ActionBar.y6.d1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.y6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.y6.o1(0.7f, f7));
                }
                return f7;
            }
            boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.y6.o1(0.7f, f7);
            } else {
                i11 = f7;
            }
            return org.telegram.ui.ActionBar.y6.C(q5, w02, f7, i10, i11);
        }
        return i10;
    }

    public final void D4() {
        if (getParentActivity() == null) {
            return;
        }
        new hi.q(getParentActivity(), this.currentAccount, new dy0(this, 0), this.f36150z0).show();
    }

    public final void E3() {
        int f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && this.f36009f != null && this.f35996d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.f36071o0 != null) {
            Float valueOf = Float.valueOf(this.K5);
            lz0 lz0Var = this.M5;
            lz0Var.getClass();
            lz0Var.a(kVar, valueOf);
            if (this.K5 <= 0.0f && this.f36047k2 > 0.0f) {
                hl hlVar = this.f36009f;
                int i10 = -1;
                if (this.X5 != null) {
                    f7 = -1;
                } else {
                    f7 = i0.a.f(this.f36047k2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23703vh, this.f36150z0), -1);
                }
                hlVar.setTextColor(f7);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.X5 == null) {
                    i10 = i0.a.f(this.f36047k2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, this.f36150z0), -1);
                }
                kVar2.y(i10, false);
            }
        }
    }

    public final void E4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.E4(boolean):void");
    }

    @Override
    public final void F(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.f36017g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
        this.f36064n0.O(this.K2, f7);
    }

    public final void F3() {
        int i10;
        int i11;
        if (this.Q5 != null) {
            ValueAnimator valueAnimator = this.f36040j2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f36040j2.cancel();
            }
            float clamp01 = Utilities.clamp01(this.Q1 / this.F1);
            if (clamp01 > 0.0f) {
                float f7 = (clamp01 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10) - AndroidUtilities.dp(21.0f));
                this.f35982b2 = AndroidUtilities.lerp(0.42f, this.Q5[0], clamp01);
                this.Z1 = AndroidUtilities.lerp(this.V5, this.Q5[1], clamp01);
                this.a2 = AndroidUtilities.lerp(translationY, this.Q5[2], clamp01);
                this.f35990c2 = AndroidUtilities.lerp(this.Q5[11], 0.0f, clamp01);
                this.X.setScaleX(this.f35982b2);
                this.X.setScaleY(this.f35982b2);
                this.X.setTranslationX(this.Z1);
                this.X.setTranslationY(this.a2);
                org.telegram.ui.Components.px0 px0Var = this.S;
                if (px0Var != null) {
                    px0Var.setAlpha(clamp01);
                }
                this.f36002e0.setAlpha(1.0f);
                this.X.setAlpha(1.0f);
                dz0 dz0Var = this.f36113u0;
                if (dz0Var != null) {
                    dz0Var.invalidate();
                }
                bi.i1 i1Var = this.f36120v0;
                if (i1Var != null) {
                    i1Var.e = AndroidUtilities.lerp(0.0f, this.Q5[4], f7);
                    this.f36120v0.f4812f = AndroidUtilities.lerp(0.0f, this.Q5[5], clamp01);
                    bi.i1 i1Var2 = this.f36120v0;
                    i1Var2.h = true;
                    i1Var2.invalidate();
                }
                x01 x01Var = this.f36084p6;
                if (x01Var != null) {
                    x01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.Q5[6], clamp01));
                }
                float dp = (((this.f35982b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f36024h0.setTranslationX(this.X.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f36024h0.setTranslationY(this.X.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f36031i0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f36031i0.setTranslationY(this.X.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f36038j0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f36038j0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f36045k0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f36045k0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.Q5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f36004e2 = AndroidUtilities.lerp(floor, this.Q5[8], clamp01);
                this.f36019g2 = AndroidUtilities.lerp(dpf2, this.Q5[9], clamp01);
                float lerp2 = AndroidUtilities.lerp((this.V5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.Q5[12], clamp01);
                float lerp3 = AndroidUtilities.lerp((this.V5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.Q5[13], clamp01);
                this.f36009f.setTranslationX(lerp2);
                this.f36009f.setTranslationY(this.f36004e2);
                this.f36091r.setTranslationX(this.f36118u5 + lerp3);
                this.f36091r.setTranslationY(this.f36019g2);
                this.f35997d2 = lerp2;
                this.f36012f2 = lerp3;
                this.f36009f.setScaleX(lerp);
                this.f36009f.setScaleY(lerp);
                h5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                }
                n5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12);
                s4((int) this.Q5[10], clamp01, true);
                org.telegram.ui.Components.ci0 ci0Var = this.Z;
                if (ci0Var != null) {
                    ci0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.Q5[3], f7));
                }
            }
        }
    }

    public final void F4() {
        TLRPC.User user;
        if (this.f36003e1 != 0 && !V3() && (user = getMessagesController().getUser(Long.valueOf(this.f36003e1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f36003e1);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!AndroidUtilities.isTablet() && z10) {
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i10 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(this, i10);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
                }
                int i11 = getArguments().getInt("nearby_distance", -1);
                if (i11 >= 0) {
                    bundle.putInt("nearby_distance", i11);
                }
                wn wnVar = new wn(bundle);
                wnVar.R9 = getMediaDataController().getGreetingsSticker();
                wnVar.S9 = false;
                presentFragment(wnVar, z10);
                if (AndroidUtilities.isTablet() && !this.I0) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final void G() {
        O4(false);
    }

    public final float G3() {
        return Utilities.clamp01((this.Q1 - X3()) / d4());
    }

    public final void G4() {
        TLRPC.ChatFull chatFull = this.f36115u2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f36115u2.linked_chat_id);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new wn(bundle));
            }
        }
    }

    public final void H3() {
        int i10;
        int i11 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.f35982b2 = 1.38f;
        float f7 = 0.0f;
        this.f35990c2 = 0.0f;
        W3();
        L4();
        s4(0, 1.0f, true);
        this.f35997d2 = (this.f35972a.getMeasuredWidth() / 2.0f) - (((this.f36009f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f36009f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f35972a.getMeasuredWidth() / 2.0f;
        int i12 = ((FrameLayout.LayoutParams) this.f36091r.getLayoutParams()).leftMargin;
        if (!this.f36125v5) {
            i11 = this.f36091r.getPaddingLeft();
        }
        this.f36012f2 = measuredWidth - ((this.f36091r.getExactWidth() * 0.5f) + (i12 + i11));
        if (!this.f36125v5) {
            f7 = this.f36091r.getPaddingLeft();
        }
        this.f36062m6 = f7;
        if (this.J1 != 2) {
            this.f36113u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.f36002e0.setAlpha(1.0f);
    }

    public final void H4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f36122v2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                di.y8 y8Var = new di.y8(3, 1);
                y8Var.setResourceProvider(this.f36150z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f36122v2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                y8Var.N0 = false;
                y8Var.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(y8Var);
                return;
            }
            if (BuildVars.isHuaweiStoreApp()) {
                str = "mapapp://navigation";
            } else {
                str = "http://maps.google.com/maps";
            }
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f36122v2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void I3() {
        s4.e1 e1Var;
        View view;
        int top;
        int i10;
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i11;
        if (this.f35972a.getVisibility() == 0) {
            if (this.P) {
                this.N.setVisibleHeight(this.f35972a.getMeasuredHeight() - this.N.getTop());
            }
            if (this.f35972a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i12 = 0;
                while (true) {
                    e1Var = null;
                    if (i12 < this.f35972a.getChildCount()) {
                        if (RecyclerView.R(this.f35972a.getChildAt(i12)) == 0) {
                            view = this.f35972a.getChildAt(i12);
                            break;
                        }
                        i12++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    ry0 ry0Var = this.f35972a;
                    View F = ry0Var.F(view);
                    if (F != null) {
                        e1Var = ry0Var.T(F);
                    }
                    e1Var = (org.telegram.ui.Components.wl0) e1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (e1Var != null) {
                    i10 = e1Var.b();
                } else {
                    i10 = -1;
                }
                if (top < 0 || i10 != 0) {
                    top = 0;
                }
                if (this.f36085q0 == null && this.actionBar.f22775n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i13 = this.P4;
                if (i13 != -1 && !z10) {
                    org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f35972a.K(i13);
                    if (wl0Var != null && wl0Var.f47773a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.L5 != z10) {
                    this.L5 = z10;
                    xz0 xz0Var = this.N;
                    if (xz0Var != null) {
                        if (z10) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = 0;
                        }
                        xz0Var.setPagesVisibleOverscanTop(i11);
                    }
                    AnimatorSet animatorSet = this.I5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.J5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    if (!this.L5) {
                        if (this.L0) {
                            this.Q0.setVisibility(0);
                        }
                        if (this.M0) {
                            this.R0.setVisibility(0);
                        }
                        if (this.N0) {
                            this.S0.setVisibility(0);
                        }
                        this.T0.setVisibility(0);
                    }
                    x5(false);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null) {
                        kVar.l().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
                    Property property = View.ALPHA;
                    float f19 = 1.0f;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f7));
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.R0;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f10));
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.T0;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var3, property, f11));
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.S0;
                    if (z10) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f12));
                    org.telegram.ui.ActionBar.w0 w0Var5 = this.Q0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z10) {
                        f13 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var5, property2, f13));
                    org.telegram.ui.ActionBar.w0 w0Var6 = this.R0;
                    if (z10) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var6, property2, f14));
                    org.telegram.ui.ActionBar.w0 w0Var7 = this.T0;
                    if (z10) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var7, property2, f15));
                    org.telegram.ui.ActionBar.w0 w0Var8 = this.S0;
                    if (z10) {
                        f16 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var8, property2, f16));
                    org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar2, this.M5, f17));
                    hl hlVar = this.f36009f;
                    if (z10) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(hlVar, property, f18));
                    cz0 cz0Var = this.f36091r;
                    if (z10) {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(cz0Var, property, f19));
                    this.N.K0.setOpen(z10);
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f36083p5, 0.0f));
                    }
                    if (this.f36113u0 != null || this.f36120v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ey0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    K3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.I5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.I5.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                    this.I5.addListener(new oz0(this, 0));
                    this.I5.setDuration(150L);
                    this.I5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f20 = top;
                if (this.Q1 != f20 && !this.H1) {
                    this.Q1 = f20;
                    this.f35996d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > X3()) {
                            z11 = true;
                        }
                        this.M1 = z11;
                    }
                    r4(true);
                }
            }
        }
    }

    public final void I4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        iz0 iz0Var = new iz0(this, user.f22177id, this.f36011f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        iz0Var.X0 = new jz0(this, i10, chatParticipant, z10, zArr);
        presentFragment(iz0Var);
    }

    public final void J3() {
        float alpha;
        boolean z10;
        int i10 = this.J1;
        float f7 = 0.0f;
        boolean z11 = true;
        if (i10 == 1 && (!this.f36097r5 || this.G1)) {
            this.f36030h6 = 0.0f;
        } else if (i10 == 2 && (!this.f36097r5 || this.G1)) {
            cz0 cz0Var = this.f36091r;
            if (cz0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = cz0Var.getAlpha();
            }
            this.f36030h6 = alpha;
        } else if (this.f36003e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.f36030h6 = (1.0f - this.f36111t5) * this.f36047k2;
        } else {
            this.f36030h6 = this.f36047k2 * this.f36111t5;
        }
        if (this.f36003e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f36125v5) {
            this.f36118u5 = AndroidUtilities.dp(28.0f) * this.f36030h6;
            cz0 cz0Var2 = this.f36091r;
            if (cz0Var2 != null) {
                cz0Var2.setTranslationX(e4(this.f36056l6, this.f36070n6));
                this.Y.invalidate();
            }
        }
        if (z10) {
            if (this.f36125v5) {
                f7 = this.f36047k2;
            }
        } else if (this.f36133w5) {
            f7 = this.f36030h6;
        }
        x01 x01Var = this.f36084p6;
        if (x01Var != null) {
            x01Var.e = 1.0f - f7;
            x01Var.invalidateSelf();
        }
        if (f7 <= 0.5f) {
            z11 = false;
        }
        this.f36051k6 = z11;
        t5();
    }

    public final void J4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (r2Var instanceof wn) {
                    finishFragment();
                    ((wn) r2Var).Y.W0(null, str, false, false);
                }
            }
        } else {
            ey eyVar = new ey(null);
            eyVar.f39044n2 = str;
            presentFragment(eyVar);
        }
    }

    @Override
    public final boolean K(ey eyVar) {
        return false;
    }

    public final void K3() {
        boolean z10;
        org.telegram.ui.Components.px0 px0Var = this.S;
        if (px0Var != null) {
            if (!this.L5 && this.O5) {
                z10 = true;
            } else {
                z10 = false;
            }
            px0Var.setVisibility(z10);
        }
    }

    public final boolean K4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.K4(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.f36017g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    public final void L3(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.L3(boolean):void");
    }

    public final void L4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f36080p2 && (valueAnimator = this.f36040j2) != null && valueAnimator.isRunning()) {
            this.f36004e2 = this.R5;
            this.f36019g2 = this.S5;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        M4(G3(), currentActionBarHeight + i10);
    }

    public final void M3(Context context) {
        int i10;
        this.f35974a1 = new org.telegram.ui.Components.r8(context, this.T0.getPopupLayout().getSwipeBack(), new qy0(this), false, 0, this.f36150z0);
        if (this.f36032i1 > 0 || this.f36003e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, this.f36150z0);
            org.telegram.ui.Components.r8 r8Var = this.f35974a1;
            org.telegram.ui.Components.aa0 aa0Var = r8Var.e;
            if (aa0Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), w02, new org.telegram.ui.Components.pg(r8Var, 11)));
                aa0Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f36122v2;
        if (userFull == null && this.f36115u2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f36115u2.ttl_period;
        }
        org.telegram.ui.Components.f31 a2 = org.telegram.ui.Components.f31.a(i10);
        this.f36099s0 = a2;
        this.Z0 = this.T0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.f35974a1.f32168a);
        this.T0.a(-1);
        f5();
    }

    public final void M4(float f7, float f10) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - c4()) / ((this.f35972a.getMeasuredWidth() - f10) - d4())));
        if (this.Q1 < c4() && max < 0.33f) {
            lerp = c3.h0.x(f7, 72.0f, 24.0f, 42.0f);
        } else {
            lerp = AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f7) + ((float) Math.floor(translationY + (org.telegram.messenger.wh.a(f7, 1.0f, currentActionBarHeight, i10) - (AndroidUtilities.density * 21.0f))));
        this.f36004e2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f36019g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    @Override
    public final void N() {
        org.telegram.ui.Components.tv0 tv0Var;
        xz0 xz0Var = this.N;
        if (xz0Var != null && (tv0Var = this.Q) != null) {
            xz0Var.setNewMediaCounts(tv0Var.f33159c);
        }
        if (this.d != null) {
            p5(false, false);
        }
        S();
        if (this.f36122v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void N3() {
        if (this.fragmentView != null && this.f36008e6 && this.f36146y2 != null && getParentActivity() != null) {
            d11 d11Var = this.f36090q6;
            if (d11Var != null) {
                d11Var.b(this.f36146y2);
                this.f36090q6.invalidate();
                return;
            }
            d11 d11Var2 = new d11(this, this.f36146y2);
            this.f36090q6 = d11Var2;
            ((FrameLayout) this.fragmentView).addView(d11Var2, org.telegram.ui.Components.kb1.i(-1, -1, 55));
        }
    }

    public final void N4() {
        ry0 ry0Var = this.f35972a;
        if (ry0Var != null && this.f35987c != null && ry0Var.getChildCount() > 0 && !this.f36001d6) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f35972a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f35972a.getChildAt(i12));
                View childAt = this.f35972a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f35986b6 = i11;
                int top = view.getTop();
                this.f35994c6 = top;
                if (this.f35986b6 == 0 && !this.f36073o2 && top > c4()) {
                    this.f35994c6 = c4();
                }
                this.f35987c.h1(i11, view.getTop() - this.f35972a.getPaddingTop());
            }
        }
    }

    public final void O3(Context context) {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            AndroidUtilities.removeFromParent(r5Var);
        }
        nz0 nz0Var = new nz0(this, context, this.f36150z0);
        this.simpleActionBar = nz0Var;
        nz0Var.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new ug(2, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(LocaleController.getString(R.string.QrCode));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 29));
        this.simpleActionBar.setVisibility(8);
    }

    public final void O4(boolean z10) {
        int i10 = this.P4;
        if (i10 >= 0) {
            if (z10) {
                mi.n nVar = new mi.n(getParentActivity(), 2, 0.6f);
                nVar.f47715a = this.P4;
                nVar.f18555p = -this.f35972a.getPaddingTop();
                this.f35987c.w0(nVar);
                return;
            }
            this.f35987c.h1(i10, -this.f35972a.getPaddingTop());
        }
    }

    public final void Q3(float f7) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f35978a6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f35978a6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f36136x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new ey0(this, 0));
        this.f35978a6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f35978a6;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.f35978a6.addListener(new oz0(this, 5));
        }
        this.f35978a6.start();
    }

    public final void Q4() {
        org.telegram.ui.Components.ci0 ci0Var = this.Z;
        if (ci0Var != null) {
            if (this.f36100s1) {
                ci0Var.H = 6;
            } else if (this.f36086q1) {
                ci0Var.H = 5;
            } else if (this.f36094r2) {
                ci0Var.H = 2;
            } else if (this.f36003e1 != 0) {
                ci0Var.H = 0;
            } else if (this.f36011f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f36011f1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.Z.H = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.Z.H = 4;
                        return;
                    } else {
                        this.Z.H = 1;
                        return;
                    }
                }
                this.Z.H = 3;
            }
        }
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void R3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
        H.W(this.f35972a.V0(view, false));
        H.f30171w = false;
        if (this.f36122v2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new hb0(this, 26), z10);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new hb0(this, 27), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.h2(this, i10, 26), true);
        H.Z();
    }

    public final void R4(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.R4(float):void");
    }

    @Override
    public final void S() {
        String str;
        int size;
        int i10;
        xz0 xz0Var = this.N;
        if (xz0Var != null && this.simpleActionBar != null) {
            int closestTab = xz0Var.getClosestTab();
            int[] iArr = this.Q.f33159c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        W4(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        W4(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.N.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.N.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        W4(LocaleController.formatPluralString("Photos", i10, new Object[0]) + ", " + LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                        return;
                    }
                    W4(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                } else {
                    W4(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    W4(LocaleController.getString(R.string.Files));
                } else {
                    W4(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    W4(LocaleController.getString(R.string.Voice));
                } else {
                    W4(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    W4(LocaleController.getString(R.string.SharedLinks));
                } else {
                    W4(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    W4(LocaleController.getString(R.string.Music));
                } else {
                    W4(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    W4(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    W4(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                W4(LocaleController.formatPluralString("CommonGroups", this.f36122v2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                W4(this.f36091r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.bw0.E0(closestTab)) {
                if (closestTab == 13) {
                    W4(this.N.c0(true));
                } else if (closestTab == 9) {
                    W4(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.N.j0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    if (this.f36094r2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    W4(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    W4(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.ws0 ws0Var = this.N.f26925a0;
                    if (ws0Var != null) {
                        i11 = ws0Var.getGiftsCount();
                    }
                    W4(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        W4(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        W4(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f36094r2) {
                W4(this.N.c0(false));
            } else if (this.N.j0(closestTab) > 0) {
                W4(LocaleController.formatPluralString("ProfileStoriesCount", this.N.j0(closestTab), new Object[0]));
            } else {
                W4(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final boolean S3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f36100s1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f36122v2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f22177id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.O3) {
                        str = jg.h1.g0(this.currentAccount, currentUser, userFull.business_work_hours);
                        string = LocaleController.getString(R.string.ProfileHoursCopy);
                    } else if (i10 == this.P3) {
                        str = userFull.business_location.address;
                        string = LocaleController.getString(R.string.ProfileLocationCopy);
                    } else if (i10 == this.L3) {
                        str = UserObject.getPublicUsername(currentUser);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        string = LocaleController.getString(R.string.ProfileCopyUsername);
                    } else if (i10 == this.G3) {
                        str = currentUser.phone;
                    } else if (i10 == this.U2) {
                        str = UserInfoActivity.a0(this.f36122v2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
                H.W(this.f35972a.V0(view, false));
                H.f30171w = false;
                H.f30150i = 3;
                if (i10 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new hb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new hb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new nj0(str, 28), false);
                }
                if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new hb0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f38473b;

                        {
                            this.f38473b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r4;
                            final int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f38473b;
                            switch (i11) {
                                case 0:
                                    int i13 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                                            int i15 = r4;
                                            int i16 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    int i17 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hy0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                                default:
                                                    int i18 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hy0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    return;
                                default:
                                    int i14 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                            int i15 = r4;
                                            int i16 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    int i17 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hy0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                                default:
                                                    int i18 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hy0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new hb0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f38473b;

                        {
                            this.f38473b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r4;
                            final int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f38473b;
                            switch (i11) {
                                case 0:
                                    int i13 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                            int i15 = r4;
                                            int i16 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    int i17 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hy0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                                default:
                                                    int i18 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hy0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    return;
                                default:
                                    int i14 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                            int i15 = r4;
                                            int i16 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    int i17 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hy0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                                default:
                                                    int i18 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hy0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i16);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new hb0(this, 10), false);
                } else if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.G3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new hb0(this, 12), false);
                    } else if (i10 == this.U2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f37844b;

                            {
                                this.f37844b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f37844b;
                                switch (i11) {
                                    case 0:
                                        int i12 = ProfileActivity.R6;
                                        profileActivity.showDialog(org.telegram.ui.Components.g5.l(profileActivity.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull2.birthday, new org.telegram.ui.Components.oy(20, profileActivity, userFull2), new hb0(profileActivity, 14), false, false, profileActivity.f36150z0).f22602a);
                                        return;
                                    case 1:
                                        int i13 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String string2 = LocaleController.getString(R.string.BirthdayClearTitle);
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                        e2Var.R = string2;
                                        e2Var.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                                                int i15 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i15) {
                                                    case 0:
                                                        int i16 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().invalidateContentSettings();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hy0(profileActivity2, 3));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                    default:
                                                        int i17 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hy0(profileActivity2, 1));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity.showDialog(e2Var);
                                        return;
                                    default:
                                        int i14 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String string3 = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                                        e2Var2.R = string3;
                                        e2Var2.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                                int i15 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i15) {
                                                    case 0:
                                                        int i16 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().invalidateContentSettings();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hy0(profileActivity2, 3));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                    default:
                                                        int i17 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hy0(profileActivity2, 1));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity.showDialog(e2Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f37844b;

                            {
                                this.f37844b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f37844b;
                                switch (i11) {
                                    case 0:
                                        int i12 = ProfileActivity.R6;
                                        profileActivity.showDialog(org.telegram.ui.Components.g5.l(profileActivity.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull2.birthday, new org.telegram.ui.Components.oy(20, profileActivity, userFull2), new hb0(profileActivity, 14), false, false, profileActivity.f36150z0).f22602a);
                                        return;
                                    case 1:
                                        int i13 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String string2 = LocaleController.getString(R.string.BirthdayClearTitle);
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                        e2Var.R = string2;
                                        e2Var.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                                int i15 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i15) {
                                                    case 0:
                                                        int i16 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().invalidateContentSettings();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hy0(profileActivity2, 3));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                    default:
                                                        int i17 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hy0(profileActivity2, 1));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity.showDialog(e2Var);
                                        return;
                                    default:
                                        int i14 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String string3 = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                                        e2Var2.R = string3;
                                        e2Var2.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                                int i15 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i15) {
                                                    case 0:
                                                        int i16 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().invalidateContentSettings();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hy0(profileActivity2, 3));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                    default:
                                                        int i17 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hy0(profileActivity2, 1));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity.showDialog(e2Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.Q2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new by0(0, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new hb0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f37844b;

                            {
                                this.f37844b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f37844b;
                                switch (i11) {
                                    case 0:
                                        int i12 = ProfileActivity.R6;
                                        profileActivity.showDialog(org.telegram.ui.Components.g5.l(profileActivity.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull2.birthday, new org.telegram.ui.Components.oy(20, profileActivity, userFull2), new hb0(profileActivity, 14), false, false, profileActivity.f36150z0).f22602a);
                                        return;
                                    case 1:
                                        int i13 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String string2 = LocaleController.getString(R.string.BirthdayClearTitle);
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                        e2Var.R = string2;
                                        e2Var.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                                int i15 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i15) {
                                                    case 0:
                                                        int i16 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().invalidateContentSettings();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hy0(profileActivity2, 3));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                    default:
                                                        int i17 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hy0(profileActivity2, 1));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity.showDialog(e2Var);
                                        return;
                                    default:
                                        int i14 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String string3 = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                                        e2Var2.R = string3;
                                        e2Var2.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i142) {
                                                int i15 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i15) {
                                                    case 0:
                                                        int i16 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().invalidateContentSettings();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hy0(profileActivity2, 3));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                    default:
                                                        int i17 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hy0(profileActivity2, 1));
                                                        profileActivity2.p5(false, false);
                                                        profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity.showDialog(e2Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new hb0(this, 11), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean T3() {
        s4.e1 e1Var;
        View view;
        if ((this.I0 || (!AndroidUtilities.isTablet() && !this.f36066n2)) && this.f36002e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.F0 = true;
            this.f36073o2 = true;
            int i10 = 0;
            while (true) {
                e1Var = null;
                if (i10 < this.f35972a.getChildCount()) {
                    if (RecyclerView.R(this.f35972a.getChildAt(i10)) == 0) {
                        view = this.f35972a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                ry0 ry0Var = this.f35972a;
                View F = ry0Var.F(view);
                if (F != null) {
                    e1Var = ry0Var.T(F);
                }
                if (e1Var != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(e1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f35972a.w0(0, -(((this.f35972a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.ds.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void T4(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f36115u2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f36057m1 == 0) {
                this.f36057m1 = -j10;
                getMediaDataController().getMediaCounts(this.f36057m1, this.f36018g1, this.classGuid);
            }
        }
        xz0 xz0Var = this.N;
        if (xz0Var != null) {
            xz0Var.setChatInfo(this.f36115u2);
        }
        bz0 bz0Var = this.f36064n0;
        if (bz0Var != null && !this.f36086q1) {
            bz0Var.setChatInfo(this.f36115u2);
        }
        dz0 dz0Var = this.f36113u0;
        if (dz0Var != null && (chatFull3 = this.f36115u2) != null) {
            dz0Var.setStories(chatFull3.stories);
        }
        bi.i1 i1Var = this.f36120v0;
        if (i1Var != null) {
            i1Var.a();
        }
        az0 az0Var = this.f36002e0;
        if (az0Var != null) {
            az0Var.setHasStories(q4());
        }
        U3();
        if (this.f36011f1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f36115u2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.Q(38, z10);
            org.telegram.ui.Components.ci0 ci0Var = this.Z;
            if (ci0Var != null) {
                ci0Var.o(3, z10);
            }
        }
    }

    @Override
    public final boolean U() {
        return this.A1;
    }

    public final void U3() {
        TLRPC.Chat chat = this.E2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f36115u2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f36115u2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f36115u2.participants.participants.get(i10);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void U4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y != null && (tL_emojiStatusCollectible2 = this.f36119u6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f36119u6 = tL_emojiStatusCollectible;
                fi.v3 v3Var = this.r6;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f36112t6 = null;
                    this.r6 = new fi.v3(getParentActivity(), 3);
                    this.f36105s6 = org.telegram.ui.ActionBar.y6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.y6.o1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.r6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    fi.v3 v3Var2 = this.r6;
                    int o12 = org.telegram.ui.ActionBar.y6.o1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    v3Var2.A0 = true;
                    v3Var2.I0 = System.currentTimeMillis();
                    v3Var2.B0 = new Path();
                    v3Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    v3Var2.D0 = new Paint(1);
                    v3Var2.E0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, o12), org.telegram.ui.ActionBar.y6.o1(1.0f, o12), org.telegram.ui.ActionBar.y6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    v3Var2.H0 = linearGradient;
                    v3Var2.E0.setShader(linearGradient);
                    v3Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, o12), org.telegram.ui.ActionBar.y6.o1(0.5f, o12), org.telegram.ui.ActionBar.y6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    v3Var2.G0 = new Matrix();
                    v3Var2.D0.setShader(v3Var2.F0);
                    v3Var2.E0.setStyle(Paint.Style.STROKE);
                    v3Var2.E0.setStrokeJoin(Paint.Join.ROUND);
                    v3Var2.E0.setStrokeCap(Paint.Cap.ROUND);
                    v3Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.Y.addView(this.r6, org.telegram.ui.Components.kb1.g(24.0f, -1));
                    this.r6.t(9.33f);
                    fi.v3 v3Var3 = this.r6;
                    Typeface bold = AndroidUtilities.bold();
                    v3Var3.H.x(bold);
                    v3Var3.J.setTypeface(bold);
                    this.r6.s(tL_emojiStatusCollectible.title);
                    fi.v3 v3Var4 = this.r6;
                    v3Var4.d = -1L;
                    v3Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    fi.v3 v3Var5 = this.r6;
                    v3Var5.getClass();
                    v3Var5.f11814y = AndroidUtilities.dpf2(4.0f);
                    v3Var5.E = AndroidUtilities.dpf2(2.66f);
                    this.r6.r();
                    this.r6.q(16.0f);
                    this.r6.u();
                    this.r6.setOnClickListener(new jy0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                        this.f36112t6 = Boolean.FALSE;
                        this.r6.setAlpha(0.0f);
                    }
                    h5();
                    fi.v3 v3Var6 = this.r6;
                    Objects.requireNonNull(v3Var6);
                    AndroidUtilities.runOnUIThread(new nj0(v3Var6, 29), 6000L);
                }
            }
        }
    }

    public final boolean V3() {
        org.telegram.ui.ActionBar.j5 j5Var;
        if (this.J1 != 0 && (j5Var = this.parentLayout) != null && j5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof wn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void V4(e01 e01Var) {
        if (this.f36076o5 == e01Var) {
            return;
        }
        this.f36076o5 = e01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f35972a, (Utilities.Callback<View>) new dy0(this, 1));
    }

    public final void W3() {
        if (this.f35972a == null) {
            return;
        }
        float A = d3.A(((FrameLayout.LayoutParams) this.X.getLayoutParams()).width, this.f35982b2, 0.5f, this.f35972a.getMeasuredWidth() / 2.0f);
        this.Z1 = A;
        if (this.G1) {
            this.Z1 = AndroidUtilities.lerp(this.V5, A, this.S1);
        }
        this.X.setTranslationX(this.Z1);
    }

    public final void W4(CharSequence charSequence) {
        this.simpleActionBar.setSubtitleAnimated(charSequence);
    }

    public final int X3() {
        int i10 = 0;
        if (this.f36003e1 != 0 && this.f36085q0 != null && !this.f36100s1) {
            return 0;
        }
        return AndroidUtilities.dp(74 + ((this.N4 || this.O4) ? 25 : 25));
    }

    public final void X4(int i10) {
        boolean z10;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!AndroidUtilities.isTablet()) {
            boolean z11 = false;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K1 = z10;
            if (i10 != 0) {
                z11 = true;
            }
            this.L1 = z11;
            w5();
            if (globalMainSettings.getBoolean("view_animations", true)) {
                this.J1 = i10;
            } else if (i10 == 2) {
                this.f36065n1 = true;
            }
        }
    }

    public final int Y3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.e81) {
            return ((org.telegram.ui.Components.e81) imageReceiver.getDrawable()).f27737a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f36002e0.getImageReceiver().getBitmap());
    }

    public final void Y4(TLRPC.UserFull userFull, org.telegram.ui.Cells.k6 k6Var, a11 a11Var) {
        boolean z10;
        this.f36122v2 = userFull;
        org.telegram.ui.Components.px0 px0Var = this.S;
        if (px0Var != null) {
            px0Var.set(userFull.stars_rating);
        }
        dz0 dz0Var = this.f36113u0;
        if (dz0Var != null) {
            dz0Var.setStories(this.f36122v2.stories);
        }
        bi.i1 i1Var = this.f36120v0;
        if (i1Var != null) {
            i1Var.a();
        }
        az0 az0Var = this.f36002e0;
        if (az0Var != null) {
            az0Var.setHasStories(q4());
        }
        xz0 xz0Var = this.N;
        if (xz0Var != null) {
            xz0Var.setUserInfo(this.f36122v2);
        }
        if (this.f36130w2 == null) {
            this.f36130w2 = k6Var;
        }
        if (this.f36130w2 == null) {
            this.f36130w2 = new org.telegram.ui.Cells.k6(this.currentAccount);
        }
        org.telegram.ui.Cells.k6 k6Var2 = this.f36130w2;
        hb0 hb0Var = new hb0(this, 21);
        if (k6Var2.f24339c) {
            hb0Var.run();
        } else {
            k6Var2.h.add(hb0Var);
        }
        this.f36130w2.d(this.f36122v2);
        if (this.f36146y2 == null) {
            this.f36146y2 = a11Var;
        }
        a11 a11Var2 = this.f36146y2;
        if (a11Var2 == null) {
            a11 c10 = a11.c(this.currentAccount, this.f36122v2, a11Var2);
            this.f36146y2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36138x2 = z10;
        }
        a11 a11Var3 = this.f36146y2;
        if (a11Var3 != null) {
            hb0 hb0Var2 = new hb0(this, 17);
            if (a11Var3.f37644b) {
                hb0Var2.run();
            } else {
                a11Var3.h.add(hb0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.T0;
        if (w0Var != null) {
            w0Var.Q(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f36003e1)));
            if (k4()) {
                this.T0.S(44);
            } else {
                this.T0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.r5 Z3(long j10) {
        if (this.G == null) {
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(17.0f), 2, this.f36009f, false);
            this.G = r5Var;
            int dp = AndroidUtilities.dp(1.0f);
            r5Var.I = 0;
            r5Var.J = dp;
            if (this.G0) {
                this.G.a();
            }
        }
        if (j10 != 0) {
            this.G.j(j10, false);
        } else {
            this.G.g(null, false);
        }
        j5();
        return this.G;
    }

    public final void Z4() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        vz0 vz0Var = this.f36104s5;
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36150z0;
        baseSimpleGlass.f19422g = vz0Var;
        baseSimpleGlass.h = null;
        baseSimpleGlass.f(vz0Var, r5Var, u6Var);
        this.simpleActionBar.setBackground(null);
        baseSimpleGlass.f19423i = this.H6;
        View view = new View(getParentActivity());
        this.N5 = view;
        view.setAlpha(this.K5);
        this.N.y(this.N5);
        View view2 = this.N5;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.glassEngine.b(this.f35972a);
        this.N.setPagesGlassEngine(this.glassEngine);
        C3();
    }

    public final long a() {
        long j10 = this.f36032i1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f36003e1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f36011f1;
    }

    public final void a4(boolean z10) {
        a0.h hVar;
        int i10;
        if (!this.B1 && (hVar = this.C1) != null && this.f36115u2 != null) {
            this.B1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f36011f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new ig.u(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void a5(boolean z10, boolean z11) {
        if (this.f36017g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f36010f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f36010f0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36010f0 = animatorSet2;
            if (z10) {
                this.f36017g0.setVisibility(0);
                this.f36010f0.playTogether(ObjectAnimator.ofFloat(this.f36017g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36017g0, View.ALPHA, 0.0f));
            }
            this.f36010f0.setDuration(180L);
            this.f36010f0.addListener(new pz0(this, z10, 1));
            this.f36010f0.start();
        } else if (z10) {
            this.f36017g0.setAlpha(1.0f);
            this.f36017g0.setVisibility(0);
        } else {
            this.f36017g0.setAlpha(0.0f);
            this.f36017g0.setVisibility(4);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23685uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23431h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23703vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23395f8));
    }

    public final org.telegram.ui.Components.r5 b4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.F == null) {
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 2, this.f36009f, false);
            this.F = r5Var;
            if (this.G0) {
                r5Var.a();
            }
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(g4(), z10);
                this.F.m(false, z10);
            } else {
                this.F.j(tL_emojiStatus.document_id, z10);
                this.F.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(g4(), z10);
                this.F.m(false, z10);
            } else {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z10);
                this.F.m(true, z10);
            }
        } else {
            this.F.g(g4(), z10);
            this.F.m(false, z10);
        }
        j5();
        return this.F;
    }

    public final void b5() {
        int i10;
        int i11;
        Long l4;
        if (this.H5 != null) {
            return;
        }
        w51[] w51VarArr = new w51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        hl hlVar = this.f36009f;
        if (hlVar != null) {
            if (hlVar.getRightDrawable() == null) {
                rect.set(this.f36009f.getWidth() - 1, (this.f36009f.getHeight() / 2) - 1, this.f36009f.getWidth() + 1, (this.f36009f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f36009f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f36009f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f36009f.getX(), (int) this.f36009f.getY());
            }
        }
        if (this.f36009f.getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int i12 = i10;
        int dp = (-(this.Y.getHeight() - rect.centerY())) - AndroidUtilities.dp(i12);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = a8.ee.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.E2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        gz0 gz0Var = new gz0(this, this, parentActivity, valueOf, i11, this.f36150z0, i12, w51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36003e1));
        if (user != null) {
            gz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.E;
        if (l10 != null) {
            gz0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.r5 r5Var = this.F;
            if (r5Var != null) {
                Drawable drawable = r5Var.f32123f[0];
                if (drawable instanceof org.telegram.ui.Components.t5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.t5) drawable).i());
                    gz0Var.setSelected(l4);
                }
            }
            l4 = null;
            gz0Var.setSelected(l4);
        }
        gz0Var.setSaveState(3);
        gz0Var.y(this.F, this.f36009f);
        hz0 hz0Var = new hz0(this, gz0Var);
        this.H5 = hz0Var;
        w51VarArr[0] = hz0Var;
        int[] iArr = new int[2];
        hl hlVar2 = this.f36009f;
        if (hlVar2 != null) {
            hlVar2.getLocationOnScreen(iArr);
        }
        w51VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        w51VarArr[0].b();
    }

    public final int c4() {
        return X3() + d4();
    }

    public final void c5() {
        int i10 = 0;
        this.N.K0.setReordering(false);
        xz0 xz0Var = this.N;
        org.telegram.ui.Components.vt0 vt0Var = xz0Var.K0;
        if (xz0Var.f26992x1 != null && vt0Var != null) {
            boolean z02 = xz0Var.z0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = vt0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab l02 = org.telegram.ui.Components.bw0.l0(num.intValue(), z02);
                if (l02 != null) {
                    arrayList.add(l02);
                }
            }
        }
        this.N.J1(true);
        this.E5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new hb0(this, 25)).start();
        org.telegram.ui.Components.wc.b0(this).R(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.N.F0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.X5 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.k");
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final int d4() {
        if (X3() == 0) {
            return AndroidUtilities.dp(168.0f);
        }
        return AndroidUtilities.dp(152.0f);
    }

    public final void d5() {
        int w02;
        int w03;
        if (!this.f36080p2) {
            cz0 cz0Var = this.f36091r;
            if (cz0Var != null) {
                Object tag = cz0Var.getTag();
                if (tag instanceof Integer) {
                    this.f36091r.setTextColor(D3(org.telegram.ui.ActionBar.y6.w0(((Integer) tag).intValue(), this.f36150z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.f36091r.setTextColor(D3(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.f36150z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f36127w;
            int i10 = -1;
            if (drawable != null) {
                if (this.X5 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.f36150z0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.fn0 fn0Var = this.K;
            if (fn0Var != null) {
                fn0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23431h8, this.f36150z0));
            }
            hl hlVar = this.f36009f;
            if (hlVar != null) {
                hlVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23703vh, this.f36150z0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.X5 == null) {
                    i10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, this.f36150z0);
                }
                kVar.y(i10, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.X5 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23395f8, this.f36150z0);
                }
                kVar2.x(w02, false);
            }
        }
        j5();
        B5();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        l01 l01Var;
        boolean z10;
        org.telegram.ui.ActionBar.j5 j5Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        ry0 ry0Var;
        ry0 ry0Var2;
        org.telegram.ui.Components.wl0 wl0Var;
        if (i10 != NotificationCenter.uploadStoryEnd && i10 != NotificationCenter.chatWasBoostedByUser) {
            boolean z12 = true;
            int i12 = 0;
            r3 = false;
            boolean z13 = false;
            if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f36003e1 != 0) {
                    if (objArr3 != null) {
                        u5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (ry0Var2 = this.f35972a) != null && (wl0Var = (org.telegram.ui.Components.wl0) ry0Var2.L(this.G3, false)) != null) {
                        this.d.v(wl0Var, this.G3);
                    }
                } else if (this.f36011f1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            p5(true, false);
                        } else {
                            s5(true);
                        }
                        u5(true);
                    }
                    if (objArr3 != null && (ry0Var = this.f35972a) != null) {
                        int childCount = ry0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f35972a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.ab) {
                                ((org.telegram.ui.Cells.ab) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (this.f36115u2 != null && (chat = this.E2) != null && chat.f22028id == l4.longValue()) {
                    this.f36115u2.online_count = ((Integer) objArr[1]).intValue();
                    s5(true);
                    u5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f36039j1) {
                        AndroidUtilities.runOnUIThread(new am0(27, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.D2;
                    if (encryptedChat2 != null && encryptedChat.f22036id == encryptedChat2.f22036id) {
                        this.D2 = encryptedChat;
                        p5(false, false);
                        FlagSecureReason flagSecureReason = this.X1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z14 = this.f36046k1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f36003e1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f36046k1 = z11;
                    if (z14 != z11) {
                        L3(true);
                        p5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l10 = (Long) objArr[0];
                    if (this.E2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.E2;
                        if (longValue == chat2.f22028id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f36115u2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f36115u2 = chatFull4;
                            }
                            xz0 xz0Var = this.N;
                            if (xz0Var != null) {
                                xz0Var.setChatInfo(this.f36115u2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f36115u2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f36079p1) || (inputGroupCall != null && this.f36079p1))) {
                                L3(false);
                            }
                            dz0 dz0Var = this.f36113u0;
                            if (dz0Var != null && (chatFull3 = this.f36115u2) != null) {
                                dz0Var.setStories(chatFull3.stories);
                            }
                            bi.i1 i1Var = this.f36120v0;
                            if (i1Var != null) {
                                i1Var.a();
                            }
                            az0 az0Var = this.f36002e0;
                            if (az0Var != null) {
                                az0Var.setHasStories(q4());
                            }
                            if (l10.longValue() != 0) {
                                z12 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f36115u2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.Q(38, z12);
                                org.telegram.ui.Components.ci0 ci0Var = this.Z;
                                if (ci0Var != null) {
                                    ci0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f36003e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f36003e1))) != null && chatFull7.f22029id == user.linked_community_id) {
                        p5(true, false);
                    }
                    TLRPC.Chat chat3 = this.E2;
                    if (chat3 != null && chatFull7.f22029id == chat3.linked_community_id) {
                        p5(true, false);
                    }
                    if (chatFull7.f22029id == this.f36011f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f36115u2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f36115u2 = chatFull7;
                        if (this.f36057m1 == 0) {
                            long j10 = chatFull7.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.f36057m1 = -j10;
                                getMediaDataController().getMediaCount(this.f36057m1, this.f36018g1, 0, this.classGuid, true);
                            }
                        }
                        U3();
                        bz0 bz0Var = this.f36064n0;
                        if (bz0Var != null && !this.f36086q1) {
                            bz0Var.setChatInfo(this.f36115u2);
                        }
                        p5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f36011f1));
                        if (chat4 != null) {
                            this.E2 = chat4;
                            L3(true);
                        }
                        FlagSecureReason flagSecureReason2 = this.X1;
                        if (flagSecureReason2 != null) {
                            flagSecureReason2.invalidate();
                        }
                        if (this.E2.megagroup && (objArr2 != null || !booleanValue)) {
                            a4(true);
                        }
                        f5();
                        z5();
                        dz0 dz0Var2 = this.f36113u0;
                        if (dz0Var2 != null && (chatFull = this.f36115u2) != null) {
                            dz0Var2.setStories(chatFull.stories);
                        }
                        bi.i1 i1Var2 = this.f36120v0;
                        if (i1Var2 != null) {
                            i1Var2.a();
                        }
                        az0 az0Var2 = this.f36002e0;
                        if (az0Var2 != null) {
                            az0Var2.setHasStories(q4());
                        }
                        xz0 xz0Var2 = this.N;
                        if (xz0Var2 != null) {
                            xz0Var2.setChatInfo(this.f36115u2);
                        }
                    }
                } else if (i10 == NotificationCenter.closeChats) {
                    removeSelfFromStack(true);
                } else if (i10 == NotificationCenter.closeProfileActivity) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (j5Var = this.parentLayout) != null && j5Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.botInfoDidLoad) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f36003e1) {
                        this.F2 = botInfo;
                        p5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f36003e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f36122v2 = userFull;
                        org.telegram.ui.Components.px0 px0Var = this.S;
                        if (px0Var != null) {
                            px0Var.set(userFull.stars_rating);
                        }
                        dz0 dz0Var3 = this.f36113u0;
                        if (dz0Var3 != null) {
                            dz0Var3.setStories(this.f36122v2.stories);
                        }
                        bi.i1 i1Var3 = this.f36120v0;
                        if (i1Var3 != null) {
                            i1Var3.a();
                        }
                        az0 az0Var3 = this.f36002e0;
                        if (az0Var3 != null) {
                            az0Var3.setHasStories(q4());
                        }
                        xz0 xz0Var3 = this.N;
                        if (xz0Var3 != null) {
                            xz0Var3.setUserInfo(this.f36122v2);
                        }
                        if (this.f36085q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f36122v2.about, this.f36152z2)) {
                                this.d.m(this.W2);
                            }
                            if (this.f36100s1) {
                                p5(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.K0) {
                                L3(true);
                            } else {
                                this.I1 = true;
                            }
                            p5(false, false);
                            xz0 xz0Var4 = this.N;
                            if (xz0Var4 != null) {
                                xz0Var4.setCommonGroupsCount(this.f36122v2.common_chats_count);
                                S();
                                org.telegram.ui.Components.tv0 tv0Var = this.Q;
                                if (tv0Var == null || tv0Var.f33166y) {
                                    resumeDelayedFragmentAnimation();
                                    r4(true);
                                }
                            }
                        }
                        f5();
                        z5();
                        if (this.f36130w2 == null && !o4()) {
                            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(this.currentAccount);
                            this.f36130w2 = k6Var;
                            hb0 hb0Var = new hb0(this, 16);
                            if (k6Var.f24339c) {
                                hb0Var.run();
                            } else {
                                k6Var.h.add(hb0Var);
                            }
                            this.f36130w2.d(this.f36122v2);
                        }
                        if (!o4()) {
                            a11 a11Var = this.f36146y2;
                            a11 c10 = a11.c(this.currentAccount, this.f36122v2, a11Var);
                            this.f36146y2 = c10;
                            if (c10 != a11Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f36138x2 = z10;
                            if (c10 != null) {
                                hb0 hb0Var2 = new hb0(this, 17);
                                if (c10.f37644b) {
                                    hb0Var2.run();
                                } else {
                                    c10.h.add(hb0Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (k4()) {
                                this.T0.S(44);
                            } else {
                                this.T0.t(44);
                            }
                            TLRPC.UserFull userFull2 = this.f36122v2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.T0.Q(46, z13);
                            this.T0.Q(47, !z13);
                        }
                    }
                } else if (i10 != NotificationCenter.privacyRulesUpdated) {
                    if (i10 == NotificationCenter.didReceiveNewMessages) {
                        if (!((Boolean) objArr[2]).booleanValue()) {
                            long a2 = a();
                            if (a2 == ((Long) objArr[0]).longValue()) {
                                DialogObject.isEncryptedDialog(a2);
                                ArrayList arrayList = (ArrayList) objArr[1];
                                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                    MessageObject messageObject = (MessageObject) arrayList.get(i14);
                                    if (this.D2 != null) {
                                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (l01Var = this.d) != null) {
                                            l01Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        ry0 ry0Var3 = this.f35972a;
                        if (ry0Var3 != null) {
                            ry0Var3.g1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        p5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.f35991c3;
                        int i16 = this.f35975a3;
                        int i17 = this.Y2;
                        v5();
                        l01 l01Var2 = this.d;
                        if (l01Var2 != null) {
                            if (i15 != this.f35991c3 || i16 != this.f35975a3 || i17 != this.Y2) {
                                l01Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f36086q1) {
                            u5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        w01 w01Var = this.e;
                        if (w01Var != null) {
                            w01Var.f44472c = w01.H(this);
                            this.e.v.clear();
                            this.e.J();
                            w01 w01Var2 = this.e;
                            w01Var2.I(w01Var2.f44479y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        u5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.w0 w0Var = this.T0;
                            if (w0Var != null) {
                                w0Var.Q(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f36003e1)));
                            }
                            i5();
                        } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                            i5();
                        } else if (i10 == NotificationCenter.starBalanceUpdated) {
                            p5(false, false);
                        } else if (i10 == NotificationCenter.botStarsUpdated) {
                            p5(false, false);
                        } else if (i10 == NotificationCenter.agentSettingsUpdated) {
                            if (m4()) {
                                p5(false, false);
                            }
                        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
                            p5(false, false);
                        } else if (i10 == NotificationCenter.dialogDeleted) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
                                if (j5Var2 != null && j5Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i10 == NotificationCenter.channelRecommendationsLoaded) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.P4 < 0 && longValue3 == a()) {
                                v5();
                                S();
                                l01 l01Var3 = this.d;
                                if (l01Var3 != null) {
                                    l01Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !o4()) {
                                if (this.P4 < 0) {
                                    v5();
                                    S();
                                    l01 l01Var4 = this.d;
                                    if (l01Var4 != null) {
                                        l01Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new hb0(this, 18));
                                    return;
                                }
                                xz0 xz0Var5 = this.N;
                                if (xz0Var5 != null) {
                                    xz0Var5.J1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f36003e1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f36003e1);
                                if (userFull3 != null) {
                                    this.f36122v2 = userFull3;
                                }
                                v5();
                                S();
                                ry0 ry0Var4 = this.f35972a;
                                if (ry0Var4 != null && ry0Var4.c0()) {
                                    this.f35972a.post(new hb0(this, 19));
                                    return;
                                }
                                l01 l01Var5 = this.d;
                                if (l01Var5 != null) {
                                    l01Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.E2;
                            if (chat5 != null && chat5.f22028id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.C1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.G2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.W4;
                                    if (i12 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                                        i12++;
                                    } else {
                                        AndroidUtilities.updateVisibleRows(this.f35972a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        az0 az0Var4 = this.f36002e0;
                        if (az0Var4 != null) {
                            az0Var4.setHasStories(q4());
                            this.f36002e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(i4(), 0.0f, this.f36047k2));
                        }
                        dz0 dz0Var4 = this.f36113u0;
                        if (dz0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f36122v2;
                            if (userFull4 != null) {
                                dz0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f36115u2;
                            if (chatFull9 != null) {
                                dz0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                L3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f36011f1)))) {
            getMessagesController().getStoriesController().k(a(), new di.e(19), false, this.f36150z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null && g50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if ((g50Var == null || dialog != g50Var.f28390c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final float e4(float f7, float f10) {
        float f11;
        float f12;
        this.f36056l6 = f7;
        this.f36070n6 = f10;
        int i10 = this.J1;
        if (i10 == 2) {
            f11 = 1.0f;
        } else if (this.S1 < 1.0f && i10 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f36047k2;
        }
        float clamp01 = Utilities.clamp01(f11);
        org.telegram.ui.Components.px0 px0Var = this.S;
        if (px0Var != null) {
            f12 = px0Var.getVisibilityFactor();
        } else {
            f12 = 0.0f;
        }
        return Math.max(0.0f, (h4() + this.f36118u5) * clamp01) + c3.h0.z(1.0f, clamp01, f10 * f12, f7);
    }

    public final void e5() {
        int i10;
        float f7;
        k0 k0Var;
        if (this.Z != null && this.f36091r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.ci0 ci0Var = this.Z;
            boolean z10 = this.G1;
            ci0Var.e = z10;
            if (z10 && this.J1 == 2 && (k0Var = this.X) != null) {
                this.Z.f27172f = this.X.getY() + (this.X.getScaleY() * k0Var.getHeight());
                this.Z.setAlpha(this.S1);
                org.telegram.ui.Components.ci0 ci0Var2 = this.Z;
                ci0Var2.E = AndroidUtilities.dp(74.0f);
                ci0Var2.setTranslationY(this.f35972a.getMeasuredWidth());
                ci0Var2.invalidate();
            } else {
                ci0Var.f27172f = -1.0f;
                float f10 = i11;
                float f11 = this.Q1 + f10;
                if (!this.N4 && !this.O4) {
                    f7 = 0.0f;
                } else {
                    f7 = 25.0f;
                }
                float dp = f11 - AndroidUtilities.dp(f7);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
                org.telegram.ui.Components.ci0 ci0Var3 = this.Z;
                ci0Var3.E = min;
                ci0Var3.setTranslationY(dp - min);
                ci0Var3.invalidate();
            }
            ImageView imageView = this.O0;
            if (imageView != null && imageView.getTag() != null) {
                this.Z.getClass();
                if (this.O0.getVisibility() == 0) {
                    this.O0.setVisibility(8);
                }
                if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
                    ((org.telegram.ui.ActionBar.w0) this.O0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 f() {
        return this.f35972a;
    }

    public final float f4(float f7) {
        float f10;
        this.f36077o6 = f7;
        int i10 = this.J1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.S1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f36047k2;
        }
        float clamp01 = Utilities.clamp01(f10);
        if (this.S != null) {
            f11 = this.S.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return c3.h0.z(1.0f, clamp01, f11, f7);
    }

    public final void f5() {
        int i10;
        if (this.Z0 != null && this.f35974a1 != null) {
            TLRPC.UserFull userFull = this.f36122v2;
            if (userFull == null && this.f36115u2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f36115u2.ttl_period;
            }
            this.f36099s0.b(i10);
            this.f35974a1.b(i10);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.E2;
    }

    public final org.telegram.ui.Components.cs g4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.f36143y = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f36150z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.cs(this.f36143y, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.J;
    }

    public final void g5() {
        float dp;
        boolean z10;
        if (this.f36148y5 != null) {
            xz0 xz0Var = this.N;
            if (xz0Var != null && xz0Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f35972a.getMeasuredHeight() - this.N.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            oe.b bVar = this.G5;
            bVar.a(z10, true);
            float f7 = bVar.e;
            this.f36148y5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
            this.f36148y5.setAlpha(f7);
            FrameLayout frameLayout = this.f36148y5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
            if (qcVar != null) {
                qcVar.l();
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override
    public final su0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f36150z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f36150z0 != null) {
            return null;
        }
        j6 j6Var = new j6(19, this);
        ArrayList arrayList = new ArrayList();
        xz0 xz0Var = this.N;
        if (xz0Var != null) {
            arrayList.addAll(xz0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35996d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23300a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36002e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f36078p0}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23359d8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36098s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23723wh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36098s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23742xh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36098s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23760yh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23732x6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23582p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23561o6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23674u6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23693v6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 0, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23768z6));
        int i10 = org.telegram.ui.ActionBar.y6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 0, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 131072, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 196608, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 0, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 131072, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 196608, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35972a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23541n6));
        if (this.L5) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36009f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36009f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f36135x}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36009f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36009f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f36135x}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23777zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.f36150z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36150z0;
        if (u6Var != null) {
            drawable = u6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final boolean h(org.telegram.tgnet.TLRPC.ChatParticipant r24, boolean r25, boolean r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.h(org.telegram.tgnet.TLRPC$ChatParticipant, boolean, boolean, android.view.View):boolean");
    }

    public final float h4() {
        if (this.S != null) {
            return this.S.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
        }
        return 0.0f;
    }

    public final void h5() {
        boolean z10;
        fi.v3 v3Var = this.r6;
        if (v3Var != null) {
            float f7 = 0.0f;
            v3Var.m(0.0f, (this.f36009f.getScaleX() * this.f36009f.getRightDrawableX()) + this.f36009f.getX() + (-v3Var.getPaddingLeft()));
            float lerp = AndroidUtilities.lerp(this.f36058m2, this.f36053l2);
            fi.v3 v3Var2 = this.r6;
            v3Var2.setTranslationY(((this.f36009f.getY() + (-v3Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
            this.r6.h(i0.a.f(lerp, this.f36105s6, 1342177280));
            if (this.Q1 >= AndroidUtilities.dp(82.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean bool = this.f36112t6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.r6.animate();
            this.f36112t6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.wh.q(animate.alpha(f7), org.telegram.ui.Components.ds.f27531g, 200L);
        }
    }

    public final int i4() {
        float f7;
        if (this.f36086q1) {
            return 0;
        }
        if (this.f36011f1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f36011f1)))) {
            if (q4()) {
                f7 = 24.0f;
            } else {
                f7 = 38.0f;
            }
            return AndroidUtilities.dp(f7);
        }
        return AndroidUtilities.dp(50.0f);
    }

    public final void i5() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().isPremium()) {
                this.V0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.f36150z0), PorterDuff.Mode.SRC_IN));
            this.O6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new di.o2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f36080p2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f36080p2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.q()) {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23714w8, this.f36150z0);
            } else if (this.L5) {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0);
            } else {
                MessagesController.PeerColor peerColor = this.X5;
                if (peerColor != null) {
                    w02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, this.f36150z0);
                }
            }
            if (i0.a.h(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.isSwipeBackEnabled(android.view.MotionEvent):boolean");
    }

    public final org.telegram.ui.Components.cs j4() {
        int color3;
        float f7;
        if (this.I == null) {
            this.f36135x = org.telegram.ui.ActionBar.y6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.y6.R1.getConstantState().newDrawable().mutate();
            MessagesController.PeerColor peerColor = this.X5;
            if (peerColor != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.y6.I.q())) {
                    color3 = this.X5.getColor5();
                } else {
                    color3 = this.X5.getColor3();
                }
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.y6.b(0.1f, f7, color3);
                Drawable drawable = this.f36135x;
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.f36150z0), this.K5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                this.H.setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0), this.K5, 1.0f), mode);
            }
            this.I = new org.telegram.ui.Components.cs(new org.telegram.ui.Components.ar(this.f36135x, this.H), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.I;
    }

    public final void j5() {
        k5(this.W5);
    }

    public final boolean k4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.f36094r2 || (userFull = this.f36122v2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url == null) {
            ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.BotCommand botCommand = arrayList.get(i10);
                i10++;
                if ("privacy".equals(botCommand.command)) {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final void k5(float f7) {
        int offsetColor;
        MessagesController.PeerColor peerColor = this.X5;
        if (peerColor != null) {
            offsetColor = i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1);
        } else {
            offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f36150z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.f36150z0), this.K5, 1.0f);
        }
        int f10 = i0.a.f(f7, offsetColor, -1);
        int i10 = org.telegram.ui.ActionBar.y6.Oi;
        int f11 = i0.a.f(this.K5, f10, org.telegram.ui.ActionBar.y6.w0(i10, this.f36150z0));
        org.telegram.ui.Components.r5 r5Var = this.F;
        if (r5Var != null) {
            r5Var.k(Integer.valueOf(f11));
        }
        org.telegram.ui.Components.r5 r5Var2 = this.G;
        if (r5Var2 != null) {
            r5Var2.k(Integer.valueOf(i0.a.f(this.K5, i0.a.f(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.y6.w0(i10, this.f36150z0))));
        }
        this.f35995d0.setColor(f11);
        this.W5 = f7;
    }

    public final void l4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36066n2 = z10;
    }

    public final void l5() {
        this.f35995d0.setScaleX(this.f36009f.getScaleX());
        this.f35995d0.setScaleY(this.f36009f.getScaleY());
        this.f35995d0.b((this.f36009f.getScaleX() * this.f36009f.getRightDrawableX()) + this.f36009f.getX(), (this.f36009f.getHeight() - (this.f36009f.getScaleY() * (this.f36009f.getHeight() - this.f36009f.getRightDrawableY()))) + this.f36009f.getY());
    }

    public final boolean m4() {
        if (this.f36003e1 != 0 && getMessagesController().getAgentController().isAgentBot(this.f36003e1)) {
            return true;
        }
        return false;
    }

    public final void m5() {
        if (!this.f36086q1 && ChatObject.isForum(this.E2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f36011f1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f36069n5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f36011f1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                            arrayList.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    hashSet.clear();
                    hashSet.addAll(arrayList);
                    profileActivity.r5(true);
                }

                public Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final boolean n4() {
        if (this.E2 != null) {
            return getMessagesController().isChatNoForwards(this.E2);
        }
        return getMessagesController().isUserNoForwards(this.f36122v2);
    }

    public final void n5(float f7) {
        m01 m01Var;
        ValueAnimator valueAnimator;
        if (this.f36080p2 || ((m01Var = this.M) != null && (valueAnimator = m01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.f35972a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f7);
            this.M.requestLayout();
        }
        z01 z01Var = this.f35996d1;
        if (z01Var != null) {
            z01Var.E.setTranslate(0.0f, this.a2 - z01Var.f46136x);
            z01 z01Var2 = this.f35996d1;
            RadialGradient radialGradient = z01Var2.f46137y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(z01Var2.E);
            }
            this.f35996d1.invalidate();
        }
        l5();
        e5();
        q5();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final boolean o4() {
        if (this.f36085q0 != null && !this.f36100s1) {
            return true;
        }
        return false;
    }

    public final void o5() {
        TLRPC.User user;
        boolean z10;
        int i10;
        int i11;
        if (this.f36100s1 && this.X0 != null && this.W0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f36003e1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.X0;
            if (z10) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            g1Var.setIcon(i10);
            org.telegram.ui.ActionBar.g1 g1Var2 = this.X0;
            if (z10) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            g1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.g1 g1Var3 = this.W0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            g1Var3.setVisibility(i12);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null) {
            g50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vt0 vt0Var;
        if (super.onBackPressed(z10)) {
            xz0 xz0Var = this.N;
            if (xz0Var != null && (vt0Var = xz0Var.K0) != null && vt0Var.f26303n0) {
                if (z10) {
                    c5();
                    return false;
                }
            } else if (this.P4 != -1 && xz0Var != null && xz0Var.E1) {
                if (z10) {
                    xz0Var.S(true);
                }
            } else {
                return this.actionBar.isEnabled();
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.f36008e6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        C5();
        this.f36008e6 = true;
        N3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.vi0 vi0Var;
        org.telegram.ui.Components.ci0 ci0Var;
        super.onConfigurationChanged(configuration);
        xz0 xz0Var = this.N;
        if (xz0Var != null) {
            xz0Var.onConfigurationChanged(configuration);
        }
        l4();
        if (this.f36066n2 && (ci0Var = this.Z) != null) {
            ci0Var.i();
        }
        if (this.f36066n2 && (vi0Var = this.f35980b0) != null) {
            vi0Var.c();
        }
        if (this.f36066n2 && this.f36080p2 && (m10 = this.f35987c.m(0)) != null) {
            this.f35972a.scrollBy(0, m10.getTop() - c4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new i7(this, 6));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r20, java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        ry0 ry0Var = this.f35972a;
        if (ry0Var != null) {
            ry0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xz0 xz0Var = this.N;
        if (xz0Var != null) {
            xz0Var.M0();
        }
        org.telegram.ui.Components.tv0 tv0Var = this.Q;
        if (tv0Var != null) {
            tv0Var.b(this);
        }
        org.telegram.ui.Components.tv0 tv0Var2 = this.Q;
        if (tv0Var2 != null) {
            tv0Var2.f33165x.remove(this);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeProfileActivity);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.agentSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.profileMusicUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatRanks);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        bz0 bz0Var = this.f36064n0;
        if (bz0Var != null) {
            bz0Var.K();
        }
        org.telegram.ui.Components.fi0 fi0Var = this.m0;
        if (fi0Var != null) {
            fi0Var.e();
        }
        this.Q5 = null;
        if (this.f36003e1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f36003e1);
        } else if (this.f36011f1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        az0 az0Var = this.f36002e0;
        if (az0Var != null) {
            az0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null) {
            g50Var.d();
        }
        fz0 fz0Var = this.f35985b5;
        if (fz0Var != null) {
            fz0Var.b();
        }
        a11 a11Var = this.f36146y2;
        if (a11Var != null && this.f36138x2) {
            a11Var.b(true);
            this.f36146y2 = null;
        }
        org.telegram.messenger.v8 v8Var = this.D5;
        if (v8Var != null) {
            this.D5 = null;
            AndroidUtilities.runOnUIThread(v8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.gu0 gu0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null) {
            g50Var.i();
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        xz0 xz0Var = this.N;
        if (xz0Var != null && (gu0Var = xz0Var.V) != null) {
            gu0Var.e = false;
            if (gu0Var.f46051c != null) {
                gu0Var.f46049a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null) {
            g50Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 == 103 && this.E2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] != 0) {
                            z13 = false;
                            break;
                        }
                        i11++;
                    } else {
                        z13 = true;
                        break;
                    }
                }
                if (iArr.length > 0 && z13) {
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f36011f1, false);
                    TLRPC.Chat chat = this.E2;
                    if (groupCall == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.g2.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36003e1));
        if (user == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 < iArr.length) {
                if (iArr[i12] != 0) {
                    z10 = false;
                    break;
                }
                i12++;
            } else {
                z10 = true;
                break;
            }
        }
        if (iArr.length > 0 && z10) {
            if (i10 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.UserFull userFull = this.f36122v2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.g2.m(user, z11, z12, getParentActivity(), this.f36122v2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        b20 b20Var;
        super.onResume();
        xz0 xz0Var = this.N;
        if (xz0Var != null) {
            xz0Var.f26936d1 = true;
            org.telegram.ui.Components.fu0 fu0Var = xz0Var.J;
            if (fu0Var != null) {
                fu0Var.l();
            }
            org.telegram.ui.Components.ov0 ov0Var = xz0Var.M;
            if (ov0Var != null) {
                ov0Var.l();
            }
            org.telegram.ui.Components.pv0 pv0Var = xz0Var.L;
            if (pv0Var != null) {
                pv0Var.X(false);
            }
            for (int i10 = 0; i10 < xz0Var.m0.length; i10++) {
                xz0Var.b0(i10);
            }
            org.telegram.ui.Components.gu0 gu0Var = xz0Var.V;
            if (gu0Var != null) {
                gu0Var.e = true;
                if (gu0Var.f46051c != null) {
                    gu0Var.f46049a.onResume();
                }
            }
        }
        l4();
        l01 l01Var = this.d;
        if (l01Var != null) {
            this.Z4 = true;
            l01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (b20Var = this.T) != null && b20Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null) {
            g50Var.k();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        u5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new i7(this, 6));
        }
        hl hlVar = this.f36009f;
        if (hlVar != null) {
            setParentActivityTitle(hlVar.getText());
        }
        if (this.f36003e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f36003e1))) != null && user.photo == null && this.Q1 >= c4()) {
            this.f36040j2.cancel();
            float[] fArr = this.f36058m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            R4(1.0f);
            this.f36064n0.setVisibility(8);
            this.Q1 = c4();
            this.f36073o2 = false;
            this.f35987c.h1(0, c4() - this.f35972a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        o5();
        r4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.C6.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0));
            this.f36144y0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, this.f36150z0));
            d5();
            y5();
            E3();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i10 = this.J1;
                if (i10 != 0 && this.M1) {
                    if (i10 == 1) {
                        this.f36047k2 = 0.0f;
                        org.telegram.ui.Components.px0 px0Var = this.S;
                        if (px0Var != null) {
                            px0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ci0 ci0Var = this.Z;
                        if (ci0Var != null) {
                            ci0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.vi0 vi0Var = this.f35980b0;
                        if (vi0Var != null) {
                            vi0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    I3();
                    if (this.I1) {
                        L3(true);
                    }
                }
                if (!this.f36097r5) {
                    this.f36097r5 = true;
                    this.f35977a5 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.V4);
            b20 b20Var = this.T;
            if (b20Var != null && b20Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.H1 = false;
        J3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        b20 b20Var = this.T;
        if (b20Var != null && b20Var.getVisibility() == 0) {
            if (z10) {
                this.T.setAlpha(1.0f - f7);
            } else {
                this.T.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        x01 x01Var;
        ImageView imageView;
        org.telegram.ui.Components.ci0 ci0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.T5 = z10;
        if (z10 && (ci0Var = this.Z) != null) {
            ArrayList arrayList = ci0Var.f27165a;
            if (ci0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.zh0 zh0Var = (org.telegram.ui.Components.zh0) arrayList.get(i10);
                    org.telegram.ui.Components.yj0 yj0Var = zh0Var.f35349k;
                    if (yj0Var != null) {
                        if (zh0Var.f35342a == 15) {
                            yj0Var.M(14);
                        } else {
                            yj0Var.M(0);
                        }
                        zh0Var.f35349k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f36080p2) {
            this.G1 = true;
            if (!z10) {
                if (this.Q5 == null) {
                    this.Q5 = new float[14];
                }
                this.F1 = this.Q1;
                this.Q5[0] = this.X.getScaleX();
                this.Q5[1] = this.X.getTranslationX();
                this.Q5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.ci0 ci0Var2 = this.Z;
                if (ci0Var2 != null) {
                    this.Q5[3] = ci0Var2.getAlpha();
                }
                bi.i1 i1Var = this.f36120v0;
                if (i1Var != null) {
                    float[] fArr = this.Q5;
                    fArr[4] = i1Var.e;
                    fArr[5] = i1Var.f4812f;
                }
                if (this.f36084p6 != null) {
                    this.Q5[6] = x01Var.getAlpha();
                }
                this.Q5[7] = this.f36009f.getScaleX();
                this.Q5[8] = this.f36009f.getTranslationY();
                this.Q5[9] = this.f36091r.getTranslationY();
                this.Q5[10] = this.f36009f.getLayoutParams().width;
                float[] fArr2 = this.Q5;
                fArr2[11] = this.f35990c2;
                fArr2[12] = this.f36009f.getTranslationX();
                this.Q5[13] = this.f36091r.getTranslationX();
                fi.v3 v3Var = this.r6;
                if (v3Var != null) {
                    v3Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f36085q0 != null) {
                this.V4 = getNotificationCenter().setAnimationInProgress(this.V4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.V4 = getNotificationCenter().setAnimationInProgress(this.V4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.f36007e5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        J3();
    }

    public final void p4(boolean z10) {
        boolean z11;
        boolean isForum = ChatObject.isForum(this.E2);
        TLRPC.Chat chat = this.E2;
        if (!isForum && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.g5.r(this, false, chat, null, false, z11, z10, !isForum, new yx0(this, 2));
    }

    public final void p5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                s5(false);
            }
            v5();
        } else if (!z11 && this.f35972a.isInLayout()) {
            ry0 ry0Var = this.f35972a;
            if (!ry0Var.G) {
                return;
            }
            ry0Var.post(new org.telegram.ui.Components.d60(15, this, z10));
        } else {
            zz0 zz0Var = new zz0(this);
            zz0Var.f46423b = this.N2;
            zz0Var.f(zz0Var.f46424c);
            zz0Var.e.clear();
            zz0Var.f46425f.clear();
            zz0Var.e.addAll(this.W4);
            zz0Var.f46425f.addAll(this.X4);
            zz0Var.f46426g = this.f36154z4;
            zz0Var.h = this.A4;
            if (z10) {
                s5(false);
            }
            N4();
            v5();
            zz0Var.f(zz0Var.d);
            try {
                s4.p.c(zz0Var, true).c(this.d);
            } catch (Exception e) {
                FileLog.e(e);
                this.d.l();
            }
            int i10 = this.f35986b6;
            if (i10 >= 0) {
                this.f35987c.h1(i10, this.f35994c6 - this.f35972a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f35972a);
        }
    }

    @Override
    public final boolean q() {
        return this.T5;
    }

    public final boolean q4() {
        if (getMessagesController().getStoriesController().K(a()) && !this.f36086q1) {
            return true;
        }
        return false;
    }

    public final void q5() {
        int i10;
        if (this.f35980b0 != null && this.f36091r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.X != null) {
                this.f35980b0.setAlpha(this.S1);
                this.f35980b0.h(AndroidUtilities.dp(74.0f) + this.f35972a.getMeasuredWidth(), X3() - AndroidUtilities.dp(74.0f));
                return;
            }
            if (z10) {
                this.f35980b0.setAlpha(this.S1);
            }
            float f7 = i11;
            float dp = this.Q1 + f7 + AndroidUtilities.dp(74.0f);
            float min = Math.min(X3(), dp - f7);
            this.f35980b0.h(dp - min, min - AndroidUtilities.dp(74.0f));
        }
    }

    public final void r4(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float lerp;
        org.telegram.ui.Components.y9 currentItemView;
        float f12;
        float lerp2;
        int i12;
        float f13;
        float f14;
        float f15;
        float f16;
        FrameLayout.LayoutParams layoutParams;
        float f17;
        int i13;
        int i14;
        hl hlVar;
        int w02;
        float f18;
        int i15;
        boolean z11;
        TLRPC.ChatFull chatFull;
        int i16;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        float G3 = G3();
        ry0 ry0Var = this.f35972a;
        if (ry0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ry0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f35972a.setLayoutParams(layoutParams2);
            }
        }
        A5(z10);
        if (this.X != null) {
            this.f35972a.setTopGlowOffset((int) this.Q1);
            ry0 ry0Var2 = this.f35972a;
            if (this.Q1 > c4() && this.Q1 < (X3() + this.f35972a.getMeasuredWidth()) - currentActionBarHeight) {
                i16 = 2;
            } else {
                i16 = 0;
            }
            ry0Var2.setOverScrollMode(i16);
        }
        if (this.X != null && !this.T5 && this.G1) {
            F3();
            return;
        }
        int c42 = c4();
        if (this.X != null) {
            if (this.Z != null && this.f36011f1 != 0) {
                if (ChatObject.isChannel(this.E2) && !this.E2.megagroup && (chatFull = this.f36115u2) != null && chatFull.linked_chat_id != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.Z.o(2, z11);
            }
            A5(z10);
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.wh.a(G3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, i11) - AndroidUtilities.dp(21.0f));
            if (!this.G1) {
                org.telegram.ui.Components.si0 si0Var = this.f36106t0;
                if (si0Var != null) {
                    f18 = -AndroidUtilities.dp(29.0f);
                    NotchInfoUtils.NotchInfo notchInfo = si0Var.f32604n;
                    if (notchInfo != null && notchInfo.isLikelyCircle) {
                        f18 = notchInfo.bounds.centerY();
                    }
                } else {
                    f18 = -AndroidUtilities.dp(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                this.a2 = AndroidUtilities.lerp(f18, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15) - AndroidUtilities.dp(21.0f)), G3);
            } else {
                this.a2 = translationY;
            }
            if (this.G1) {
                f7 = this.R1;
            } else {
                f7 = this.Q1;
            }
            float f19 = c42;
            if (f7 <= f19 && !this.f36080p2) {
                f10 = 2.0f;
                f11 = 18.0f;
            } else {
                f10 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f7 - f19) / ((this.f35972a.getMeasuredWidth() - currentActionBarHeight) - d4())));
                this.f36026h2 = max;
                f11 = 18.0f;
                this.f35982b2 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.f35990c2 = 0.0f;
                dz0 dz0Var = this.f36113u0;
                if (dz0Var != null) {
                    dz0Var.invalidate();
                }
                bi.i1 i1Var = this.f36120v0;
                if (i1Var != null) {
                    i1Var.invalidate();
                }
                float min = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.f36033i2))) / AndroidUtilities.dpf2(1100.0f);
                X3();
                boolean z12 = this.f36073o2;
                float[] fArr = this.f36058m2;
                if (z12 && (this.F0 || this.f36026h2 >= 0.33f)) {
                    if (!this.f36080p2) {
                        if (this.T0 != null) {
                            if (!n4()) {
                                this.T0.S(21);
                            } else {
                                this.T0.t(21);
                            }
                            if (this.f36085q0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.t(33);
                                this.T0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var = this.U0;
                        if (w0Var != null) {
                            w0Var.setEnabled(false);
                        }
                        this.f36080p2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.M.f(min, true);
                        this.f36071o0.b(min);
                        this.f36064n0.setCreateThumbFromParent(true);
                        this.f36064n0.getAdapter().g();
                        this.f36040j2.cancel();
                        fArr[0] = AndroidUtilities.lerp(fArr, this.f36053l2);
                        fArr[1] = 1.0f;
                        dz0 dz0Var2 = this.f36113u0;
                        if (dz0Var2 != null && !dz0Var2.f36281w.isEmpty()) {
                            this.f36040j2.setInterpolator(new u1.a());
                            this.f36040j2.setDuration((((1.0f - lerp2) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f36040j2.setInterpolator(org.telegram.ui.Components.ds.f27533j);
                            this.f36040j2.setDuration(((1.0f - lerp2) * 250.0f) / min);
                        }
                        this.f36040j2.addListener(new oz0(this, 3));
                        View m10 = this.f35987c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i12 = AndroidUtilities.statusBarHeight;
                            } else {
                                i12 = 0;
                            }
                            this.f35972a.x0(((m10.getTop() - this.f35972a.getMeasuredWidth()) - X3()) + currentActionBarHeight2 + i12, (int) this.f36040j2.getDuration(), (Interpolator) this.f36040j2.getInterpolator());
                            this.f35972a.O0 = false;
                        }
                        this.R5 = this.f36009f.getTranslationY();
                        this.S5 = this.f36091r.getTranslationY();
                        this.f36040j2.start();
                        this.f36064n0.setAlpha(0.0f);
                        this.f36064n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f36064n0.getLayoutParams();
                    int i17 = layoutParams3.height;
                    layoutParams3.width = this.f35972a.getMeasuredWidth();
                    float f20 = currentActionBarHeight + f7;
                    int i18 = (int) f20;
                    layoutParams3.height = i18;
                    if (i17 != i18) {
                        this.f36064n0.requestLayout();
                    }
                    if (!this.f36040j2.isRunning()) {
                        if (this.G1 && this.J1 == 2) {
                            f12 = (-(1.0f - this.S1)) * AndroidUtilities.dp(50.0f);
                        } else {
                            f12 = 0.0f;
                        }
                        this.f36009f.setTranslationX(AndroidUtilities.dpf2(18.0f) - this.f36009f.getLeft());
                        this.f36009f.setTranslationY((((f20 - X3()) - AndroidUtilities.dpf2(30.0f)) - this.f36009f.getBottom()) + f12);
                        this.f36091r.setTranslationX(e4(AndroidUtilities.dpf2(16.0f) - this.f36091r.getLeft(), 0.0f));
                        this.f36091r.setTranslationY(f4((((f20 - X3()) - AndroidUtilities.dpf2(10.0f)) - this.f36091r.getBottom()) + f12));
                        h5();
                    }
                } else {
                    if (this.f36080p2) {
                        this.f36080p2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.T0;
                        if (w0Var2 != null) {
                            w0Var2.t(21);
                            if (this.f36085q0 != null) {
                                this.T0.t(33);
                                this.T0.t(34);
                                this.T0.t(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = this.U0;
                        if (w0Var3 != null) {
                            w0Var3.setEnabled(!this.f36151z1);
                        }
                        this.M.f(min, false);
                        this.f36071o0.b(min);
                        this.f36040j2.cancel();
                        this.f36002e0.getImageReceiver().setAllowStartAnimation(true);
                        this.f36002e0.getImageReceiver().startAnimation();
                        fArr[0] = AndroidUtilities.lerp(fArr, this.f36053l2);
                        fArr[1] = 0.0f;
                        this.f36040j2.setInterpolator(org.telegram.ui.Components.ds.f27533j);
                        if (!this.f36066n2) {
                            this.f36040j2.setDuration((lerp * 250.0f) / min);
                        } else {
                            this.f36040j2.setDuration(0L);
                        }
                        this.f35996d1.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, this.f36150z0));
                        if (!this.H0 && (currentItemView = this.f36064n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.e81) {
                                this.f36002e0.f46109a0 = false;
                            } else {
                                az0 az0Var = this.f36002e0;
                                az0Var.f46109a0 = true;
                                az0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.f36040j2.addListener(new oz0(this, 4));
                        this.f36002e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.f36064n0.setAlpha(0.0f);
                        this.f36040j2.start();
                        this.P1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.X.setScaleX(this.f35982b2);
                    this.X.setScaleY(this.f35982b2);
                    W3();
                    ValueAnimator valueAnimator = this.f36040j2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        L4();
                        this.f36009f.setTranslationY(this.f36004e2);
                        this.f36091r.setTranslationX(e4(this.f36012f2, this.f36062m6));
                        this.f36091r.setTranslationY(f4(this.f36019g2));
                        h5();
                    }
                }
            }
            boolean z13 = this.G1;
            if (z13 && this.J1 == 2) {
                float f21 = this.V5;
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f10) + i14) - (AndroidUtilities.density * 21.0f));
                this.f36009f.setPivotY(hlVar.getMeasuredHeight());
                this.f36009f.setScaleX(1.38f);
                this.f36009f.setScaleY(1.38f);
                this.f35982b2 = AndroidUtilities.lerp(42, 138, this.S1) / 100.0f;
                this.f35990c2 = 0.0f;
                dz0 dz0Var3 = this.f36113u0;
                if (dz0Var3 != null) {
                    dz0Var3.setExpandProgress(1.0f);
                }
                bi.i1 i1Var2 = this.f36120v0;
                if (i1Var2 != null) {
                    i1Var2.setExpandProgress(1.0f);
                }
                this.f36002e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(i4(), 0.0f, this.S1));
                this.X.setTranslationX(AndroidUtilities.lerp(f21, 0.0f, this.S1));
                this.X.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(translationY2), 0.0f, this.S1));
                float measuredWidth = ((this.f35982b2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                this.f36024h0.setTranslationX(this.X.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                this.f36024h0.setTranslationY(this.X.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                this.f36031i0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.f36031i0.setTranslationY(this.X.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                this.f36038j0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.f36038j0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                this.f36045k0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.f36045k0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                this.X.setScaleX(this.f35982b2);
                this.X.setScaleY(this.f35982b2);
                this.f36064n0.setAlpha(0.0f);
                this.f36064n0.setVisibility(0);
                az0 az0Var2 = this.f36002e0;
                float f22 = this.S1;
                float f23 = this.f35982b2;
                az0Var2.H = f22;
                az0Var2.I = f23;
                az0Var2.G = true;
                this.M.e(f22, false);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                int i19 = -1;
                if (this.X5 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, this.f36150z0);
                }
                kVar.y(i0.a.f(this.S1, w02, -1), false);
                org.telegram.ui.Components.fn0 fn0Var = this.K;
                if (fn0Var != null) {
                    fn0Var.b(i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23431h8, this.f36150z0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f36127w;
                if (drawable != null) {
                    if (this.X5 == null) {
                        i19 = i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.f36150z0), -1);
                    }
                    drawable.setColorFilter(i19, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.cs csVar = this.I;
                if (csVar != null) {
                    csVar.a(this.S1);
                    this.f36009f.invalidate();
                }
                org.telegram.ui.Components.cs csVar2 = this.J;
                if (csVar2 != null) {
                    csVar2.a(this.S1);
                    this.f36009f.invalidate();
                }
                k5(this.S1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams4.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.f35972a.getMeasuredWidth() / this.f35982b2, this.S1);
                layoutParams4.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + currentActionBarHeight) / this.f35982b2, this.S1);
                this.X.requestLayout();
                h5();
            } else if (f7 <= f19) {
                if (z13) {
                    this.f35982b2 = AndroidUtilities.lerp(42, 96, G3) / 100.0f;
                    this.f35990c2 = 0.0f;
                    f14 = 1.0f;
                } else {
                    org.telegram.ui.Components.si0 si0Var2 = this.f36106t0;
                    if (si0Var2 != null) {
                        f13 = si0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f13 = 24.0f;
                    }
                    this.f35982b2 = AndroidUtilities.lerp(f13, 96.0f, G3) / 100.0f;
                    f14 = 1.0f;
                    this.f35990c2 = 1.0f - G3;
                }
                org.telegram.ui.Components.ci0 ci0Var = this.Z;
                if (ci0Var != null) {
                    if (this.G1) {
                        ci0Var.setAlpha(this.S1);
                    } else {
                        ci0Var.setAlpha(f14);
                    }
                }
                dz0 dz0Var4 = this.f36113u0;
                if (dz0Var4 != null) {
                    dz0Var4.invalidate();
                }
                bi.i1 i1Var3 = this.f36120v0;
                if (i1Var3 != null) {
                    i1Var3.h = this.G1;
                    float clamp01 = Utilities.clamp01((G3 - 0.3f) / 0.7f);
                    if (i1Var3.f4812f != clamp01) {
                        i1Var3.f4812f = clamp01;
                        i1Var3.invalidate();
                    }
                }
                float f24 = (0.12f * G3) + 1.0f;
                ValueAnimator valueAnimator2 = this.f36040j2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f36040j2;
                    oz0 oz0Var = this.P5;
                    valueAnimator3.removeListener(oz0Var);
                    this.f36040j2.addListener(oz0Var);
                } else {
                    this.X.setScaleX(this.f35982b2);
                    this.X.setScaleY(this.f35982b2);
                    W3();
                    this.X.setTranslationY((float) Math.ceil(this.a2));
                    float dp = (((this.f35982b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                    this.f36024h0.setTranslationX(this.X.getX() + AndroidUtilities.dp(16.0f) + dp);
                    this.f36024h0.setTranslationY(this.X.getY() + AndroidUtilities.dp(-10.0f) + dp);
                    this.f36031i0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
                    this.f36031i0.setTranslationY(this.X.getY() + AndroidUtilities.dp(26.5f) + dp);
                    this.f36038j0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
                    this.f36038j0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp);
                    this.f36045k0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
                    this.f36045k0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp);
                }
                float floor = (float) Math.floor(translationY);
                float dpf2 = AndroidUtilities.dpf2(8.0f) + (this.X.getScaleY() * this.X.getHeight());
                if (this.G1) {
                    f15 = this.S1;
                } else {
                    f15 = G3;
                }
                float f25 = (dpf2 * f15) + floor;
                this.f36004e2 = c3.h0.z(1.0f, this.S1, 0.0f, (AndroidUtilities.dp(7.0f) * G3) + AndroidUtilities.dp(1.3f) + f25);
                this.f36019g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * G3) + f25 + AndroidUtilities.dp(24.0f);
                if (this.G1) {
                    f16 = (this.V5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f);
                } else {
                    f16 = -AndroidUtilities.dpf2(46.0f);
                }
                x01 x01Var = this.f36084p6;
                if (x01Var != null) {
                    x01Var.setAlpha((int) (255.0f * G3));
                }
                int measuredWidth2 = this.f35972a.getMeasuredWidth();
                this.f36009f.setScaleX(f24);
                this.f36009f.setScaleY(f24);
                s4(0, G3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f36009f.getLayoutParams();
                float f26 = measuredWidth2 / f10;
                float min2 = f26 - (((Math.min(this.f36009f.getExactWidth(), layoutParams5.width) * f24) * 0.5f) + layoutParams5.leftMargin);
                float f27 = ((FrameLayout.LayoutParams) this.f36091r.getLayoutParams()).width;
                if (!this.f36125v5 && this.f36091r.getExactWidth() <= (f27 - this.f36091r.getPaddingLeft()) - this.f36091r.getPaddingRight()) {
                    f17 = this.f36091r.getPaddingLeft();
                } else {
                    f17 = 0.0f;
                }
                float min3 = f26 - ((Math.min(this.f36091r.getExactWidth(), f27) * 0.5f) + (layoutParams.leftMargin + f17));
                this.f35997d2 = min2;
                this.f36012f2 = min3;
                this.f36062m6 = f17;
                float lerp3 = AndroidUtilities.lerp(f16, min2, G3);
                float lerp4 = AndroidUtilities.lerp(f16, min3, G3);
                ValueAnimator valueAnimator4 = this.f36040j2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f36009f.setTranslationX(lerp3);
                    this.f36009f.setTranslationY(this.f36004e2);
                    this.f36091r.setTranslationX(e4(lerp4, this.f36062m6 * G3));
                    this.f36091r.setTranslationY(f4(this.f36019g2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f36009f.getLayoutParams();
                int i20 = layoutParams6.width;
                if (AndroidUtilities.isTablet()) {
                    i13 = AndroidUtilities.dp(490.0f);
                } else {
                    i13 = AndroidUtilities.displaySize.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i13 - AndroidUtilities.dp(f11)) / this.f36009f.getScaleX()) - (this.f36009f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i20) {
                    this.f36009f.requestLayout();
                }
                h5();
            }
            ValueAnimator valueAnimator5 = this.f36040j2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                s4(0, G3, true);
            }
        }
        n5(currentActionBarHeight);
        if (G3 >= 1.0f) {
            this.f36002e0.setAlpha(1.0f);
        }
    }

    public final void r5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.r5(boolean):void");
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null) {
            g50Var.f28391f = bundle.getString("path");
        }
    }

    @Override
    public final void s() {
        this.f35972a.y0(0);
    }

    public final void s4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.s4(int, float, boolean):void");
    }

    public final void s5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.B2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.C2.clear();
        TLRPC.ChatFull chatFull = this.f36115u2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.B2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f36115u2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36115u2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22177id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.B2++;
            }
            this.C2.add(Integer.valueOf(i11));
            if (user != null) {
                if (user.bot) {
                    i10 = -110;
                } else if (user.self) {
                    i10 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if (userStatus2 != null) {
                        i10 = userStatus2.expires;
                    }
                }
                i11 = c3.h0.i(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = c3.h0.i(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$EL.reversed(Comparator$CC.comparingInt(new bf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.f36154z4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f35972a);
        }
        if (this.N != null && this.P4 != -1) {
            if ((this.C2.size() > 5 || this.Y4 == 2) && this.Y4 != 1) {
                this.N.g1(this.C2, this.f36115u2);
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.g50 g50Var = this.f36085q0;
        if (g50Var != null && (str = g50Var.f28391f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        int i10;
        this.f36047k2 = f7;
        this.S1 = f7;
        J3();
        if (this.J1 == 2) {
            this.f36002e0.setProgressToExpand(f7);
            org.telegram.ui.Components.ci0 ci0Var = this.Z;
            if (ci0Var != null) {
                ci0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.vi0 vi0Var = this.f35980b0;
            if (vi0Var != null) {
                vi0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.px0 px0Var = this.S;
            if (px0Var != null) {
                px0Var.setParentExpanded(f7);
            }
            e5();
            q5();
        }
        this.f35972a.setAlpha(f7);
        this.f35972a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.J1 != 2 || (w02 = this.f36092r0) == 0) {
            if (this.f36003e1 == 0 && ChatObject.isChannel(this.f36011f1, this.currentAccount)) {
                boolean z10 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.f36150z0;
            int[][] iArr = org.telegram.ui.Components.j9.L;
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, u6Var);
        }
        int i11 = this.f36000d5;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, this.f36150z0);
        }
        this.f35996d1.setBackgroundColor(i0.a.f(f7, i0.a.o(i11, 0), w02));
        org.telegram.ui.Components.f31 f31Var = this.f36052l0;
        int f10 = i0.a.f(f7, i11, w02);
        f31Var.f28006k = true;
        f31Var.f28000b.setColor(f10);
        int i12 = -1;
        if (this.X5 != null) {
            w03 = -1;
        } else {
            if (this.f36003e1 == 0 && ChatObject.isChannel(this.f36011f1, this.currentAccount)) {
                boolean z11 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.u6 u6Var2 = this.f36150z0;
            int[][] iArr2 = org.telegram.ui.Components.j9.L;
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23414g8, u6Var2);
        }
        this.actionBar.y(i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, this.f36150z0), w03), false);
        if (this.X5 == null) {
            i12 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23703vh, this.f36150z0);
        }
        int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, this.f36150z0);
        hl hlVar = this.f36009f;
        if (hlVar != null && this.J1 != 2) {
            hlVar.setTextColor(i0.a.f(f7, w05, i12));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Bh, this.f36150z0);
        } else {
            if (this.f36003e1 == 0 && ChatObject.isChannel(this.f36011f1, this.currentAccount)) {
                boolean z12 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.u6 u6Var3 = this.f36150z0;
            int[][] iArr3 = org.telegram.ui.Components.j9.L;
            w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23431h8, u6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.y6.f23585pa;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.y6.w0(i10, this.f36150z0);
        cz0 cz0Var = this.f36091r;
        if (cz0Var != null && this.J1 != 2) {
            cz0Var.setTextColor(i0.a.f(f7, w06, D3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.R1 * f7;
        long j10 = this.f36003e1;
        if (j10 == 0) {
            j10 = this.f36011f1;
        }
        org.telegram.ui.ActionBar.u6 u6Var4 = this.f36150z0;
        int[][] iArr4 = org.telegram.ui.Components.j9.L;
        int w07 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23583p8[org.telegram.ui.Components.j9.e(j10)], u6Var4);
        long j11 = this.f36003e1;
        if (j11 == 0) {
            j11 = this.f36011f1;
        }
        int d = org.telegram.ui.Components.j9.d(j11);
        if (w07 != d) {
            this.f36078p0.h(i0.a.f(f7, d, w07));
            this.f36002e0.invalidate();
        }
        int i13 = this.f36007e5;
        if (i13 != 0) {
            setNavigationBarColor(i0.a.f(f7, i13, getNavigationBarColor()));
        }
        this.f35996d1.invalidate();
        r4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        g01 g01Var = this.U5;
        if (g01Var != null) {
            g01Var.invalidate();
        }
        if (a() > 0) {
            az0 az0Var = this.f36002e0;
            if (az0Var != null) {
                az0Var.setProgressToStoriesInsets(this.S1);
            }
            dz0 dz0Var = this.f36113u0;
            if (dz0Var != null) {
                dz0Var.setProgressToStoriesInsets(this.S1);
            }
            bi.i1 i1Var = this.f36120v0;
            if (i1Var != null) {
                i1Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.j5 j5Var) {
        super.setParentLayout(j5Var);
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.X1 = null;
        }
        if (j5Var != null && j5Var.getParentActivity() != null) {
            this.X1 = new FlagSecureReason(j5Var.getParentActivity().getWindow(), new yx0(this, 7));
        }
    }

    public final void t5() {
        CharSequence charSequence;
        cz0 cz0Var = this.f36091r;
        if (cz0Var == null) {
            return;
        }
        if (!this.f36051k6 || (charSequence = this.f36044j6) == null) {
            charSequence = this.f36037i6;
        }
        boolean z10 = this.G1;
        oe.e eVar = cz0Var.P0;
        CharSequence text = cz0Var.getText();
        if (TextUtils.equals(text, charSequence)) {
            cz0Var.l(charSequence, false);
            return;
        }
        if (!z10 && cz0Var.isAttachedToWindow() && cz0Var.isLaidOut() && cz0Var.getVisibility() == 0 && cz0Var.getAlpha() > 0.0f && cz0Var.getWidth() > 0 && cz0Var.getHeight() > 0 && !TextUtils.isEmpty(text)) {
            Picture picture = new Picture();
            cz0Var.n(picture.beginRecording(cz0Var.getWidth(), cz0Var.getHeight()), 1.0f, 0.0f);
            picture.endRecording();
            eVar.c(0.0f);
            cz0Var.Q0 = picture;
            eVar.a(1.0f);
        } else {
            cz0Var.Q0 = null;
            eVar.c(1.0f);
        }
        cz0Var.invalidate();
        cz0Var.l(charSequence, false);
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void u4(boolean z10) {
        boolean z11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36003e1));
        if (user != null) {
            if (this.f36094r2 && !MessagesController.isSupportUser(user)) {
                if (this.f36046k1 && !z10) {
                    getMessagesController().unblockPeer(this.f36003e1, new hb0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.E2;
                if (this.D2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.g5.r(this, false, chat, user, z11, true, false, true, new zx0(this, user));
            } else if (this.f36046k1) {
                getMessagesController().unblockPeer(this.f36003e1);
                if (org.telegram.ui.Components.wc.a(this)) {
                    org.telegram.ui.Components.wc.d(this, false).j();
                }
            } else if (this.l1) {
                org.telegram.ui.Components.g5.i0(this, this.f36003e1, user, null, this.D2, false, null, new wa(this, 4), this.f36150z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f36150z0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new yx0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, this.f36150z0);
                }
            }
        }
    }

    public final void u5(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.u5(boolean):void");
    }

    @Override
    public final boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = a1.g.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i12.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i12.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i12, eyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new wn(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f36003e1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final void v4(boolean z10) {
        boolean z11 = false;
        if (this.f36003e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36003e1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f36122v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user, z10, z11, getParentActivity(), this.f36122v2, getAccountInstance());
            }
        } else if (this.f36011f1 != 0) {
            if (getMessagesController().getGroupCall(this.f36011f1, false) == null) {
                TLRPC.Chat chat = this.E2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.u80.t(getParentActivity(), -chat.f22028id, accountInstance, new org.telegram.ui.Components.qy(chat, this, accountInstance, 5));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.g2.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void v5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.v5():void");
    }

    public final void w4() {
        TLRPC.UserFull userFull = this.f36122v2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.wc.b0(U).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.E2 != null) {
            org.telegram.ui.Components.u40.h.a();
        }
        showDialog(new zh.p1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void w5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f36038j0 != null && (imageView = this.f36045k0) != null) {
            if (this.L1 && (chat = this.E2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f36045k0.setVisibility(0);
                this.f36038j0.setTag(1);
                this.f36038j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f36045k0.setVisibility(8);
            this.f36038j0.setTag(null);
            this.f36038j0.setVisibility(8);
        }
    }

    public final void x4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.E2.f22028id, getUserConfig().getCurrentUser(), 0, null, this, true, new f80(this, z10, zArr, 8), new ea.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void x5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        float f10;
        boolean z11;
        if ((this.f36113u0 != null || this.f36120v0 != null) && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            float width = this.actionBar.getWidth();
            if (this.actionBar.getBackButton() != null) {
                f10 = Math.max(0.0f, this.actionBar.getBackButton().getRight());
            } else {
                f10 = 0.0f;
            }
            boolean z12 = false;
            if (this.actionBar.E != null) {
                for (int i10 = 0; i10 < this.actionBar.E.getChildCount(); i10++) {
                    View childAt = this.actionBar.E.getChildAt(i10);
                    if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                        float left = this.actionBar.E.getLeft() + ((int) childAt.getX());
                        if (left < width) {
                            width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                        }
                    }
                }
            }
            dz0 dz0Var = this.f36113u0;
            if (dz0Var != null) {
                float B = c3.h0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(f10 - dz0Var.f36266f0) <= 0.1f && Math.abs(width - dz0Var.f36267g0) <= 0.1f && Math.abs(B - dz0Var.f36268h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                dz0Var.f36266f0 = f10;
                dz0Var.f36267g0 = width;
                if (z10) {
                    dz0Var.m0.d(width, true);
                }
                dz0Var.f36268h0 = B;
                if (z11) {
                    dz0Var.invalidate();
                }
            }
            bi.i1 i1Var = this.f36120v0;
            if (i1Var != null) {
                float B2 = c3.h0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
                int d42 = d4();
                z12 = (Math.abs(f10 - i1Var.f4814r) > 0.1f || Math.abs(width - i1Var.f4815s) > 0.1f || Math.abs(B2 - i1Var.v) > 0.1f) ? true : true;
                i1Var.f4814r = f10;
                i1Var.f4815s = width;
                if (z10) {
                    i1Var.f4818y.d(width, true);
                }
                i1Var.v = B2;
                i1Var.f4817x = d42 + B2;
                if (z12) {
                    i1Var.invalidate();
                }
            }
        }
    }

    @Override
    public final hh.d y() {
        return this.B6;
    }

    public final void y4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.f36032i1;
        if (j11 == 0) {
            j11 = this.f36003e1;
            if (j11 == 0) {
                j11 = -this.f36011f1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.f36018g1);
        if (z10 && (this.f36086q1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.f36018g1, z11);
            org.telegram.ui.Components.wc.A(this, z11, null).j();
            m5();
            this.Z.setNotifications(isDialogMuted);
        } else if ((!z10 && LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
            boolean z12 = n5Var.e.h;
            boolean z13 = !z12;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f36018g1);
            if (!z12) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f36018g1 == 0) {
                    getMessagesStorage().setDialogFlags(j12, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (!isGlobalNotificationsEnabled) {
                    edit2.remove("notify2_" + sharedPrefKey);
                    j10 = 0L;
                } else {
                    edit2.putInt("notify2_" + sharedPrefKey, 2);
                    j10 = 1;
                }
                getNotificationsController().removeNotificationsForDialog(j12);
                if (this.f36018g1 == 0) {
                    getMessagesStorage().setDialogFlags(j12, j10);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                    if (dialog2 != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog2.notify_settings = tL_peerNotifySettings;
                        if (isGlobalNotificationsEnabled) {
                            tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                        }
                    }
                }
                edit2.apply();
            }
            m5();
            getNotificationsController().updateServerNotificationsSettings(j12, this.f36018g1);
            n5Var.setChecked(z13);
            org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f35972a.L(this.N3, false);
            r5(true);
        } else {
            org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(getParentActivity(), this.currentAccount, null, true, new a8.lg(this, j12, 7), this.f36150z0);
            bpVar.e(j12, this.f36018g1, this.f36069n5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.Z.getHeight() - AndroidUtilities.dp(12.0f);
            }
            bpVar.d(this, view, f11, f12, z10);
        }
    }

    public final void y5() {
        org.telegram.ui.Components.ws0 ws0Var;
        hh.c[] cVarArr = this.L6;
        if (cVarArr != null) {
            for (hh.c cVar : cVarArr) {
                try {
                    if (cVar != null) {
                        cVar.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            FrameLayout frameLayout = this.f36148y5;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }
        b20 b20Var = this.T;
        if (b20Var != null && (b20Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.T.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0), 100));
        }
        float f7 = this.K5;
        Drawable drawable = this.f36143y;
        int[] iArr = this.Q6;
        if (drawable != null) {
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f36150z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.f36150z0), f7, 1.0f);
            int i10 = iArr[6];
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            if (offsetColor != i10) {
                drawable.setColorFilter(new PorterDuffColorFilter(offsetColor, mode));
            }
            iArr[6] = offsetColor;
        }
        Drawable drawable2 = this.M6;
        if (drawable2 != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.V6, this.f36150z0);
            int i11 = iArr[3];
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            if (w02 != i11) {
                drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
            }
            iArr[3] = w02;
        }
        Drawable drawable3 = this.N6;
        if (drawable3 != null) {
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, this.f36150z0);
            int i12 = iArr[4];
            PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
            if (w03 != i12) {
                drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
            }
            iArr[4] = w03;
        }
        Drawable drawable4 = this.O6;
        if (drawable4 != null) {
            int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.f36150z0);
            int i13 = iArr[5];
            PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
            if (w04 != i13) {
                drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
            }
            iArr[5] = w04;
        }
        xz0 xz0Var = this.N;
        if (xz0Var != null && (ws0Var = xz0Var.f26925a0) != null) {
            try {
                hh.c cVar2 = ws0Var.U;
                if (cVar2 != null) {
                    cVar2.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, ws0Var.f53291f));
                    ws0Var.invalidate();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        org.telegram.ui.Components.zq zqVar = this.P6;
        if (zqVar != null) {
            zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.wj, this.f36150z0));
            if (this.f35972a != null) {
                for (int i14 = 0; i14 < this.f35972a.getChildCount(); i14++) {
                    View childAt = this.f35972a.getChildAt(i14);
                    if (childAt != null) {
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public final void z4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f36003e1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36003e1));
                if (user != null) {
                    if (this.F2 != null && (userFull = this.f36122v2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f36122v2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f36011f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f36011f1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f36115u2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f36115u2.about, ChatObject.getPublicUsername(chat));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                    }
                } else {
                    return;
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.BotShare)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void z5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.z5():void");
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.tv0 tv0Var) {
        super(bundle);
        this.h = null;
        this.f36063n = null;
        this.f36128w0 = null;
        this.f36136x0 = new org.telegram.ui.Components.r50(this, 2);
        this.f36144y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f35981b1 = 1.0f;
        this.C1 = new a0.h();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.f36058m2 = new float[]{0.0f, 1.0f};
        this.f36087q2 = new Paint();
        this.B2 = -1;
        this.L2 = new Rect();
        this.W4 = new ArrayList();
        this.X4 = new ArrayList();
        this.Y4 = 0;
        this.Z4 = true;
        this.f35977a5 = true;
        this.f36000d5 = 0;
        this.f36007e5 = 0;
        this.f36015f5 = 0;
        this.f36022g5 = 0L;
        this.f36069n5 = new HashSet();
        this.f36083p5 = new org.telegram.ui.Cells.b2(this);
        this.q5 = new mz0(this);
        this.G5 = new oe.b(0, new yx0(this, 8), org.telegram.ui.Components.ds.h, 380L, true);
        this.M5 = new lz0(this);
        this.P5 = new oz0(this, 1);
        this.Q5 = null;
        this.Y5 = new SparseIntArray();
        this.f35978a6 = null;
        this.f35986b6 = -1;
        this.f36023g6 = new int[3];
        this.f36030h6 = -1.0f;
        hh.b bVar = new hh.b();
        this.E6 = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.F6 = bVar2;
        ArrayList arrayList = new ArrayList();
        this.I6 = arrayList;
        RectF rectF = new RectF();
        this.J6 = rectF;
        RectF rectF2 = new RectF();
        this.K6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.L6 = new hh.c[2];
        this.Q6 = new int[7];
        this.Q = tv0Var;
        hh.c cVar = new hh.c();
        this.C6 = cVar;
        cVar.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36150z0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.A6 = new ch.f();
            hh.d dVar = new hh.d(null);
            this.B6 = dVar;
            ch.b bVar3 = new ch.b(dVar);
            this.D6 = bVar3;
            bVar3.f6303i = LiteMode.isEnabled(262144);
        } else {
            this.A6 = null;
            this.B6 = null;
            this.D6 = new ch.b(cVar);
        }
        bVar2.e = new se.b();
    }

    @Override
    public final void D() {
    }

    @Override
    public final void Q() {
    }
}
