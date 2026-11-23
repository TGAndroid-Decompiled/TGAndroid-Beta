package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;
public class ProfileActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, ww, org.telegram.ui.Components.ct0, org.telegram.ui.Components.w30, org.telegram.ui.Components.xr0, ke0 {
    public static final RectF Z6 = new RectF();
    public static final int f43517a7 = org.telegram.messenger.g0.L(16.0f);
    public org.telegram.ui.ActionBar.h6 A0;
    public boolean A1;
    public CharSequence A2;
    public int A3;
    public int A4;
    public SpannableStringBuilder A5;
    public boolean A6;
    public int B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public SpannableStringBuilder B5;
    public float B6;
    public org.telegram.messenger.gc C0;
    public a0.h C1;
    public int C2;
    public int C3;
    public int C4;
    public hi.d[] C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public ai.e2 D5;
    public float D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public FrameLayout E5;
    public float E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public hi.d F5;
    public xw0 F6;
    public org.telegram.ui.Components.n5 G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public dx0 G6;
    public org.telegram.ui.Components.n5 H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public View H5;
    public hi.l3 H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public int I6;
    public org.telegram.ui.Components.mr J;
    public boolean J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public int J5;
    public Boolean J6;
    public org.telegram.ui.Components.mr K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public int K5;
    public TLRPC.TL_emojiStatusCollectible K6;
    public org.telegram.ui.Components.vk0 L;
    public boolean L0;
    public boolean L1;
    public org.telegram.messenger.gc L2;
    public int L3;
    public boolean L4;
    public int L5;
    public int L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public boolean M4;
    public gh.e M5;
    public boolean M6;
    public mw0 N;
    public boolean N0;
    public boolean N1;
    public org.telegram.ui.Cells.n8 N2;
    public int N3;
    public int N4;
    public final qu0 N5;
    public int N6;
    public wv0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public org.telegram.ui.Components.xf0 O5;
    public int O6;
    public org.telegram.ui.Components.nv0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public int P6;
    public boolean Q;
    public org.telegram.ui.ActionBar.g5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public final ui.b Q6;
    public org.telegram.ui.Components.bt0 R;
    public org.telegram.ui.ActionBar.g5 R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public float R5;
    public final dh.c R6;
    public boolean S;
    public org.telegram.ui.ActionBar.g5 S0;
    public float S1;
    public int S2;
    public int S3;
    public boolean S4;
    public final te.a S5;
    public di.f S6;
    public org.telegram.ui.Components.xu0 T;
    public org.telegram.ui.ActionBar.g5 T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public iv0 T5;
    public final Paint T6;
    public uv U;
    public org.telegram.ui.ActionBar.g5 U0;
    public int U1;
    public int U2;
    public int U3;
    public final ArrayList U4;
    public AnimatorSet U5;
    public Drawable U6;
    public org.telegram.ui.Components.oh0 V;
    public org.telegram.ui.ActionBar.y0 V0;
    public float V1;
    public int V2;
    public int V3;
    public final ArrayList V4;
    public AnimatorSet V5;
    public Drawable V6;
    public org.telegram.ui.Components.oh0 W;
    public org.telegram.ui.ActionBar.y0 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public int W4;
    public float W5;
    public Drawable W6;
    public hi.l3 X;
    public org.telegram.ui.ActionBar.y0 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public boolean X5;
    public org.telegram.ui.Components.nq X6;
    public k0 Y;
    public ImageView Y0;
    public org.telegram.messenger.n6 Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public final gv0 Y5;
    public final int[] Y6;
    public ai.g0 Z;
    public org.telegram.ui.ActionBar.y0 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public fv0 Z4;
    public View Z5;
    public ru0 f43518a;
    public org.telegram.ui.Components.tf0 f43519a0;
    public org.telegram.messenger.qe f43520a1;
    public float f43521a2;
    public int f43522a3;
    public int f43523a4;
    public View f43524a5;
    public int f43525a6;
    public org.telegram.ui.Components.ek0 f43526b;
    public org.telegram.messenger.hp f43527b0;
    public float f43528b1;
    public float f43529b2;
    public int f43530b3;
    public int f43531b4;
    public float f43532b5;
    public int f43533b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public uu0 f43534c;
    public org.telegram.ui.Components.og0 f43535c0;
    public int f43536c1;
    public float f43537c2;
    public int f43538c3;
    public int f43539c4;
    public int f43540c5;
    public CharSequence f43541c6;
    public lw0 d;
    public org.telegram.ui.Components.uf0 f43542d0;
    public zw0 f43543d1;
    public float d2;
    public int f43544d3;
    public int f43545d4;
    public int f43546d5;
    public boolean f43547d6;
    public ww0 f43548e;
    public org.telegram.ui.Cells.o f43549e0;
    public long f43550e1;
    public float f43551e2;
    public int f43552e3;
    public int f43553e4;
    public int f43554e5;
    public final ev0 f43555e6;
    public pk f43556f;
    public av0 f43557f0;
    public long f43558f1;
    public float f43559f2;
    public int f43560f3;
    public int f43561f4;
    public long f43562f5;
    public float[] f43563f6;
    public AnimatorSet f43564g0;
    public long f43565g1;
    public float f43566g2;
    public int f43567g3;
    public int f43568g4;
    public boolean f43569g5;
    public float f43570g6;
    public String h;
    public org.telegram.ui.Cells.c4 f43571h0;
    public boolean f43572h1;
    public float f43573h2;
    public int f43574h3;
    public int f43575h4;
    public boolean f43576h5;
    public float f43577h6;
    public ImageView f43578i0;
    public long f43579i1;
    public float f43580i2;
    public int f43581i3;
    public int f43582i4;
    public String f43583i5;
    public boolean f43584i6;
    public ImageView f43585j0;
    public boolean f43586j1;
    public float f43587j2;
    public int j3;
    public int f43588j4;
    public String f43589j5;
    public gw0 f43590j6;
    public ImageView f43591k0;
    public boolean f43592k1;
    public ValueAnimator f43593k2;
    public int f43594k3;
    public int f43595k4;
    public String f43596k5;
    public float f43597k6;
    public ImageView f43598l0;
    public boolean l1;
    public float f43599l2;
    public int f43600l3;
    public int f43601l4;
    public cx f43602l5;
    public final RectF f43603l6;
    public org.telegram.ui.Components.l01 m0;
    public long f43604m1;
    public float f43605m2;
    public int f43606m3;
    public int f43607m4;
    public org.telegram.ui.Components.bh f43608m5;
    public float f43609m6;
    public String f43610n;
    public org.telegram.ui.Components.zf0 f43611n0;
    public boolean n1;
    public final float[] f43612n2;
    public int f43613n3;
    public int f43614n4;
    public final HashSet f43615n5;
    public org.telegram.messenger.cp f43616n6;
    public bv0 f43617o0;
    public boolean f43618o1;
    public boolean f43619o2;
    public int f43620o3;
    public int o4;
    public CharacterStyle f43621o5;
    public final SparseIntArray f43622o6;
    public ow0 f43623p0;
    public boolean f43624p1;
    public boolean f43625p2;
    public int f43626p3;
    public int f43627p4;
    public final gv0 f43628p5;
    public int f43629p6;
    public org.telegram.ui.Components.b9 f43630q0;
    public boolean f43631q1;
    public boolean f43632q2;
    public int f43633q3;
    public int f43634q4;
    public final mv0 f43635q5;
    public AnimatorSet f43636q6;
    public cv0 f43637r;
    public org.telegram.ui.Components.x30 f43638r0;
    public boolean f43639r1;
    public final Paint f43640r2;
    public int f43641r3;
    public int f43642r4;
    public boolean f43643r5;
    public int f43644r6;
    public org.telegram.ui.Components.rh0 f43645s;
    public int f43646s0;
    public boolean f43647s1;
    public boolean f43648s2;
    public int f43649s3;
    public int f43650s4;
    public uv0 s5;
    public int f43651s6;
    public org.telegram.ui.Components.l01 f43652t0;
    public boolean f43653t1;
    public ki.r0 f43654t2;
    public int f43655t3;
    public int f43656t4;
    public float f43657t5;
    public boolean t6;
    public org.telegram.ui.Components.lg0 f43658u0;
    public int f43659u1;
    public ki.p f43660u2;
    public int f43661u3;
    public int f43662u4;
    public float f43663u5;
    public boolean f43664u6;
    public dv0 f43665v0;
    public boolean f43666v1;
    public TLRPC.ChatFull f43667v2;
    public int f43668v3;
    public int f43669v4;
    public boolean f43670v5;
    public org.telegram.ui.Components.rh0 f43671v6;
    public AnimatorSet f43672w;
    public di.t0 f43673w0;
    public boolean f43674w1;
    public TLRPC.UserFull f43675w2;
    public int f43676w3;
    public int f43677w4;
    public boolean f43678w5;
    public final int[] f43679w6;
    public Drawable f43680x;
    public View f43681x0;
    public boolean f43682x1;
    public org.telegram.ui.Cells.f6 f43683x2;
    public int f43684x3;
    public int f43685x4;
    public ImageReceiver f43686x5;
    public float f43687x6;
    public Drawable f43688y;
    public final org.telegram.ui.Components.h40 f43689y0;
    public int f43690y1;
    public boolean f43691y2;
    public int f43692y3;
    public int f43693y4;
    public FrameLayout f43694y5;
    public CharSequence f43695y6;
    public final Paint f43696z0;
    public boolean f43697z1;
    public ax0 f43698z2;
    public int f43699z3;
    public int f43700z4;
    public FrameLayout[] f43701z5;
    public CharSequence f43702z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity D4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void G3(ProfileActivity profileActivity, boolean z10) {
        Drawable t6 = profileActivity.f43557f0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.t51) {
            profileActivity.f43557f0.w(null, null, t6);
        } else if (t6 instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) t6;
            profileActivity.f43557f0.w(null, null, c6Var);
            if (z10) {
                c6Var.f(profileActivity.f43557f0);
            }
        } else {
            org.telegram.messenger.gc D = profileActivity.f43617o0.D(0);
            if (D != null && D.f24089p == 2) {
                str = "avatar";
            }
            profileActivity.f43557f0.w(D, str, t6);
        }
    }

    public static int J0(ProfileActivity profileActivity) {
        int i7;
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null && kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = Z6;
            if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean J0 = org.telegram.ui.Components.jt0.J0(profileActivity.O.getClosestTab());
        if (i7 == profileActivity.L6 && J0 == profileActivity.M6) {
            return;
        }
        profileActivity.L6 = i7;
        profileActivity.M6 = J0;
        if (J0) {
            if (i7 > 0) {
                profileActivity.C5[0].i(org.telegram.messenger.hd.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.C5[0].i(profileActivity.B5, true, true);
            }
        } else if (i7 <= 0 && org.telegram.messenger.np.u1(profileActivity.currentAccount).i5()) {
            profileActivity.C5[0].i(profileActivity.A5, true, true);
        } else {
            profileActivity.C5[0].i(org.telegram.messenger.hd.G(i7, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public static ValueAnimator P0(ProfileActivity profileActivity, final boolean z10) {
        float f10;
        boolean z11;
        int i7;
        if (z10) {
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.k3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.W1.cancel();
        }
        di.t0 t0Var = profileActivity.f43673w0;
        if (t0Var != null) {
            t0Var.setActive(!z10);
        }
        float f11 = profileActivity.V1;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        final float f12 = profileActivity.Q1;
        profileActivity.f43526b.setTranslationY(f12);
        profileActivity.f43526b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f43518a.setVisibility(0);
        profileActivity.B4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f43556f.setVisibility(0);
        profileActivity.f43637r.setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.V1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        kVar.A(z11);
        int i10 = 8;
        if (profileActivity.V1 > 0.5f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
        if (g5Var != null) {
            g5Var.setVisibility(i7);
        }
        profileActivity.U0.setVisibility(i7);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.V1 <= 0.5f) {
            i10 = 0;
        }
        searchContainer.setVisibility(i10);
        profileActivity.f43526b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.b0(ProfileActivity.this, ofFloat, f12, z10);
            }
        });
        ofFloat.addListener(new ov0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.Y4 = true;
            profileActivity.W4();
            org.telegram.messenger.g0.Y2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.f37917f);
        profileActivity.W1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        boolean z10;
        int i7;
        if (profileActivity.f43625p2) {
            if (profileActivity.f43632q2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f24004m;
                } else {
                    i7 = 0;
                }
                profileActivity.f43518a.w0(0, ((view.getTop() - profileActivity.f43518a.getMeasuredWidth()) - profileActivity.e4()) + currentActionBarHeight + i7, org.telegram.ui.Components.nr.h);
                return;
            }
            profileActivity.f43518a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.nr.h);
            return;
        }
        if (profileActivity.e4() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f11 = profileActivity.Q1;
            if (f11 > 0.0f && ((f11 < profileActivity.j4() * 0.6f || f10 < -1000.0f) && profileActivity.Q1 > profileActivity.e4() * 0.6f)) {
                profileActivity.f43518a.w0(0, (int) (profileActivity.Q1 - profileActivity.e4()), org.telegram.ui.Components.nr.h);
                return;
            }
        }
        if (z10) {
            float f12 = profileActivity.Q1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.f43518a.w0(0, (int) profileActivity.Q1, org.telegram.ui.Components.nr.h);
                return;
            }
        }
        if (!z10) {
            float f13 = profileActivity.Q1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.f43518a.w0(0, (int) f13, org.telegram.ui.Components.nr.h);
                return;
            }
        }
        if (profileActivity.Q1 > 0.0f) {
            profileActivity.f43518a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.nr.h);
        }
    }

    public static SpannableStringBuilder W3(String str, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        iz izVar = new iz(9);
        izVar.f48854w = str;
        if (izVar.f48848c != null) {
            izVar.f48848c = null;
            izVar.a();
        }
        izVar.f48850f = w02;
        izVar.f48851n = false;
        spannableStringBuilder.setSpan(izVar, 0, spannableStringBuilder.length(), 0);
        iz[] izVarArr = (iz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), iz.class);
        if (izVarArr != null) {
            for (iz izVar2 : izVarArr) {
                izVar2.getClass();
                izVar2.f48850f = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                izVar2.f48852r = i7;
                izVar2.f48853s = h6Var;
                izVar2.f48851n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        t1Var.f29999j0 = false;
        t1Var.show();
        Utilities.f22774e.c(new b80(t1Var, z10, activity, 8));
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.py0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.gc h;
        if (profileActivity.K2 == null) {
            if (profileActivity.f43631q1 && !profileActivity.getMessagesController().K3()) {
                ArrayList l10 = profileActivity.getMessagesController().f25932t7.l(profileActivity.f43558f1);
                if (l10 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i7 = 0; tL_forumTopic == null && i7 < l10.size(); i7++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i7);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f28450id == profileActivity.f43565g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j3 = tL_forumTopic.icon_emoji_id;
                        if (j3 != 0 && (e10 = org.telegram.ui.Components.p5.e(profileActivity.currentAccount, j3)) != null && (h = org.telegram.ui.Components.lc.b0(profileActivity).h(e10, 1, new hu0(profileActivity, 2))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.a4()) {
                profileActivity.N4(false);
            }
        }
    }

    public static void a1(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i7 = 0; i7 < codecCount; i7++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i10].equals(str)) {
                            if (codecInfoAt.isEncoder()) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList.add(Integer.valueOf(i7));
                        } else {
                            i10++;
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
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i11)).intValue());
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
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    if (i12 > 0 || !arrayList2.isEmpty()) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i12)).intValue());
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

    public static void b0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z10) {
        int i7;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.V1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        float f13 = 0.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f14 = -f10;
        profileActivity.U1 = (int) ((1.0f - floatValue) * f14);
        profileActivity.f43526b.setTranslationY(floatValue * f10);
        profileActivity.P.setTranslationY(f10 * profileActivity.V1);
        profileActivity.f43518a.setTranslationY((1.0f - profileActivity.V1) * f14);
        profileActivity.f43518a.setScaleX(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.f43518a.setScaleY(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.f43518a.setAlpha(profileActivity.V1);
        boolean z11 = true;
        profileActivity.B4(true);
        profileActivity.f43518a.setAlpha(f11);
        profileActivity.f43526b.setAlpha(1.0f - profileActivity.V1);
        profileActivity.f43526b.setScaleX((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.f43526b.setScaleY((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f11);
        profileActivity.Y.setAlpha(f11);
        profileActivity.f43557f0.setAlpha(f11);
        dv0 dv0Var = profileActivity.f43665v0;
        if (dv0Var != null) {
            dv0Var.setAlpha(f11);
        }
        profileActivity.f43556f.setAlpha(f11);
        cv0 cv0Var = profileActivity.f43637r;
        if (!profileActivity.X5) {
            f13 = f11;
        }
        cv0Var.setAlpha(f13);
        profileActivity.U0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.V1 < 0.7f) {
            org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
            if (g5Var.G.getWidth() != 0 && !g5Var.f29873e.isFocused()) {
                g5Var.f29873e.requestFocus();
                org.telegram.messenger.g0.I3(g5Var.f29873e);
            }
        }
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        int i10 = 8;
        if (profileActivity.V1 < 0.5f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        searchContainer.setVisibility(i7);
        if (profileActivity.V1 > 0.5f) {
            i10 = 0;
        }
        org.telegram.ui.ActionBar.g5 g5Var2 = profileActivity.T0;
        if (g5Var2 != null) {
            g5Var2.setVisibility(i10);
            profileActivity.T0.setAlpha(f11);
        }
        profileActivity.U0.setVisibility(i10);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.V1 >= 0.5f) {
            z11 = false;
        }
        kVar.A(z11);
        org.telegram.ui.ActionBar.g5 g5Var3 = profileActivity.T0;
        if (g5Var3 != null) {
            g5Var3.setAlpha(f11);
        }
        profileActivity.U0.setAlpha(f11);
        profileActivity.f43543d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void b5(FrameLayout frameLayout, float f10) {
        int i7;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(f43517a7 * f10);
        frameLayout.setAlpha(1.0f - f10);
        if (f10 < 1.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        frameLayout.setVisibility(i7);
    }

    public static void c0(org.telegram.ui.ProfileActivity r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.c0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static boolean d0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.np.u1(profileActivity.currentAccount).f25821g7.edit().putLong("dialog_join_requested_time_" + profileActivity.f43579i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.v3.T(profileActivity.F2) && !profileActivity.F2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i7 = org.telegram.ui.Components.r70.f39059u1;
        org.telegram.ui.Components.r70.K0(parentActivity, profileActivity, org.telegram.ui.Components.lc.b0(profileActivity), z11);
        if (!z10 || profileActivity.P4 != -1) {
            profileActivity.N5();
            lw0 lw0Var = profileActivity.d;
            if (lw0Var != null) {
                lw0Var.f();
            }
        }
        if (g2Var instanceof bn) {
            ((bn) g2Var).cc(false, true);
        }
        return false;
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.d2, 0.25f) / 0.25f;
        float f10 = 1.0f;
        if (profileActivity.f43631q1) {
            profileActivity.f43658u0.setAlpha(1.0f - min);
            profileActivity.f43658u0.setBlurIntensity(0.0f);
            int i7 = 0;
            profileActivity.f43658u0.setGooeyEnabled(false);
            org.telegram.ui.Components.lg0 lg0Var = profileActivity.f43658u0;
            if (profileActivity.d2 >= 1.0f) {
                i7 = 8;
            }
            lg0Var.setVisibility(i7);
        } else {
            profileActivity.f43658u0.setHideProgress(profileActivity.d2);
        }
        dv0 dv0Var = profileActivity.f43665v0;
        if (dv0Var != null && profileActivity.J1 != 2) {
            float f11 = profileActivity.d2;
            if (f11 > 0.0f) {
                f10 = org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f11, 0.0f, 0.5f));
            }
            dv0Var.setAlpha(f10);
        }
        profileActivity.B5();
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.m5 m5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.gc b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().X2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.h1 h1Var = new ug.h1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        m5Var.getLocationOnScreen(new int[2]);
        h1Var.f58697r2 = m5Var.f29259i0;
        h1Var.f58698s2 = m5Var.f29260j0;
        h1Var.f58701v2 = m5Var.getScaleX();
        h1Var.f58699t2 = m5Var.getLeft();
        h1Var.f58700u2 = m5Var.getTop();
        h1Var.f58702w2 = m5Var;
        Drawable rightDrawable = m5Var.getRightDrawable();
        org.telegram.ui.Components.n5 n5Var = profileActivity.G;
        if (rightDrawable == n5Var && n5Var != null) {
            Drawable drawable = n5Var.f37733f[0];
            if (drawable instanceof org.telegram.ui.Components.p5) {
                h1Var.f58701v2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.p5) drawable).f38452e;
                if (document != null) {
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(profileActivity.getParentActivity());
                    org.telegram.messenger.mz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f29512m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.gc.b(document);
                        if (d != null) {
                            d.f25656e = 512;
                            d.f25657f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                            d.f25656e = 512;
                            d.f25657f = 512;
                        }
                        b10 = org.telegram.messenger.gc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.gc gcVar = b10;
                    q9Var.setLayerNum(7);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    q9Var.m(gcVar, str2, org.telegram.messenger.gc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.p5) profileActivity.G.f37733f[0]).c()) {
                        q9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        h1Var.f58704y2 = org.telegram.messenger.gj.i1(document);
                    } else {
                        h1Var.f58704y2 = org.telegram.messenger.gj.i1(document);
                    }
                    h1Var.f58703x2 = q9Var;
                    h1Var.A2 = true;
                }
            }
        }
        profileActivity.showDialog(h1Var);
    }

    public static void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.np.u1(profileActivity.currentAccount).l0(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void f5(int i7, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i7) {
            view.getLayoutParams().height = i7;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i7);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void g0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ki.h3.J0(context, profileActivity.currentAccount, profileActivity.f43675w2.starref_program, profileActivity.getUserConfig().e(), profileActivity.A0, false);
        } else {
            ki.h3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.A0);
        }
    }

    public static void g5(org.telegram.ui.ActionBar.g5 g5Var, boolean z10, boolean z11) {
        int i7;
        if (com.google.android.gms.internal.vision.e2.s(g5Var)) {
            g5Var.Z(z10, z11);
        } else if (g5Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            g5Var.setVisibility(i7);
        }
    }

    public static void h0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User c22;
        TLRPC.ChatParticipant chatParticipant;
        lw0 lw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f43518a.C0();
        if (i7 == profileActivity.T3) {
            TLRPC.User c23 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1));
            TLRPC.UserFull userFull = profileActivity.f43675w2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                di.e0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.f43550e1, new bi.d4(profileActivity, context, e10, 5));
            } else if (c23 == null || !c23.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new ki.j(profileActivity.f43550e1));
            }
        } else if (i7 == profileActivity.R3) {
            boolean z10 = !profileActivity.getMessagesController().u2(j3, profileActivity.f43565g1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.f43565g1, z10);
            org.telegram.ui.Components.lc.A(profileActivity, z10, null).j();
            profileActivity.y5();
            int i10 = profileActivity.R3;
            if (i10 < 0 || (lw0Var = profileActivity.d) == null) {
                return;
            }
            lw0Var.g(i10);
        } else if (i7 == profileActivity.f43523a4) {
            TLRPC.User c24 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", c24.f28547id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f43583i5);
            bundle.putString("first_name_card", profileActivity.f43589j5);
            bundle.putString("last_name_card", profileActivity.f43596k5);
            qr qrVar = new qr(bundle, profileActivity.A0);
            qrVar.P = new yt0(profileActivity, c24);
            profileActivity.presentFragment(qrVar);
        } else if (i7 == profileActivity.X3) {
            TextView textView = (TextView) org.telegram.ui.Components.c5.f0(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751496, null), org.telegram.messenger.hd.N0(2131751580, null), org.telegram.messenger.hd.N0(2131751579, null), org.telegram.messenger.hd.N0(2131751586, null), new hu0(profileActivity, 1), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
            }
        } else if (i7 == profileActivity.Y3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String N0 = org.telegram.messenger.hd.N0(2131746015, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131746036, null);
            TLRPC.Chat O0 = profileActivity.getMessagesController().O0(Long.valueOf(-profileActivity.f43562f5));
            org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
            if (O0 != null && org.telegram.messenger.v3.w(2, O0)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, profileActivity.getParentActivity(), profileActivity.A0);
                d2VarArr[0] = d2Var;
                d2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131753724, null), "", true, false, false);
                d2VarArr[0].setPadding(org.telegram.messenger.hd.f24408a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.f24408a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(d2VarArr[0], c8.na.o(-1, -2));
                d2VarArr[0].setOnClickListener(new c10(d2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746034, null), new aj0(13, profileActivity, d2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new l60(10));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29588q7, null);
            }
        } else if (i7 == profileActivity.f43662u4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f43579i1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.g2(bundle2));
        } else if (i7 == profileActivity.f43656t4) {
            profileActivity.showDialog(org.telegram.ui.Components.c5.S(profileActivity.getParentActivity(), profileActivity.E2, profileActivity.A0).f28743a);
        } else if (i7 == profileActivity.O3) {
            profileActivity.I4(view, f10, f11, false);
        } else if (i7 == profileActivity.O4) {
            profileActivity.getMessagesController().r5(null, profileActivity.f43550e1);
            if (org.telegram.ui.Components.lc.a(profileActivity)) {
                org.telegram.ui.Components.lc.d(profileActivity, false).j();
            }
        } else if (i7 == profileActivity.f43531b4) {
            ki.h0.a(profileActivity, profileActivity.currentAccount, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1)));
        } else if (i7 == profileActivity.f43545d4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else if (i7 == profileActivity.V3) {
            profileActivity.L4();
        } else if (i7 == profileActivity.W3) {
            qy0.L0(profileActivity.a(), profileActivity);
        } else if (i7 >= profileActivity.f43685x4 && i7 < profileActivity.f43693y4) {
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant = profileActivity.f43667v2.participants.participants.get(((Integer) profileActivity.D2.get(i7 - profileActivity.f43685x4)).intValue());
            } else {
                chatParticipant = profileActivity.f43667v2.participants.participants.get(i7 - profileActivity.f43685x4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i7 == profileActivity.f43700z4) {
            profileActivity.M4();
        } else if (i7 == profileActivity.M3) {
            profileActivity.T4(f10, f11, i7, view);
        } else if (i7 == profileActivity.o4) {
            if (profileActivity.F2 != null) {
                profileActivity.showDialog(new li.d0(profileActivity, profileActivity.F2.linked_community_id, null, null));
            } else if (profileActivity.f43550e1 == 0 || (c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1))) == null) {
            } else {
                profileActivity.showDialog(new li.d0(profileActivity, c22.linked_community_id, null, null));
            }
        } else if (i7 == profileActivity.J3) {
            if (profileActivity.f43667v2.location instanceof TLRPC.TL_channelLocation) {
                qa0 qa0Var = new qa0(5);
                qa0Var.m0 = -profileActivity.f43558f1;
                qa0Var.H0 = (TLRPC.TL_channelLocation) profileActivity.f43667v2.location;
                profileActivity.presentFragment(qa0Var);
            }
        } else if (i7 == profileActivity.P4) {
            profileActivity.H4(false);
        } else if (i7 == profileActivity.A4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f43558f1);
            bundle3.putInt("type", 2);
            rq rqVar = new rq(bundle3);
            rqVar.C0(profileActivity.f43667v2);
            profileActivity.presentFragment(rqVar);
        } else if (i7 == profileActivity.B4) {
            profileActivity.presentFragment(new bi.e9(profileActivity.f43558f1));
        } else if (i7 == profileActivity.C4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f43558f1);
            bundle4.putInt("type", 1);
            rq rqVar2 = new rq(bundle4);
            rqVar2.C0(profileActivity.f43667v2);
            profileActivity.presentFragment(rqVar2);
        } else if (i7 == profileActivity.D4) {
            profileActivity.S0.performClick();
        } else if (i7 == profileActivity.E4) {
            profileActivity.presentFragment(new di.t(0, profileActivity.f43550e1));
        } else if (i7 == profileActivity.F4) {
            profileActivity.presentFragment(new di.t(1, profileActivity.f43550e1));
        } else if (i7 == profileActivity.G4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f43558f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new c51(bundle5));
        } else if (i7 == profileActivity.J4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f43558f1);
            bundle6.putInt("type", 0);
            rq rqVar3 = new rq(bundle6);
            rqVar3.C0(profileActivity.f43667v2);
            profileActivity.presentFragment(rqVar3);
        } else if (i7 == profileActivity.f43567g3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i7 == profileActivity.f43581i3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.I2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i7 == profileActivity.j3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i7 == profileActivity.f43594k3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i7 == profileActivity.f43600l3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i7 == profileActivity.f43613n3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i7 == profileActivity.f43606m3) {
            profileActivity.presentFragment(new z90());
        } else if (i7 == profileActivity.f43620o3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i7 == profileActivity.f43641r3) {
            profileActivity.showDialog(org.telegram.ui.Components.c5.R(profileActivity, profileActivity.A0));
        } else if (i7 == profileActivity.f43649s3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131743999, null));
        } else if (i7 == profileActivity.f43655t3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
        } else if (i7 == profileActivity.f43676w3) {
            Y4(profileActivity.getParentActivity(), false);
        } else if (i7 == profileActivity.f43684x3) {
            Y4(profileActivity.getParentActivity(), true);
        } else if (i7 == profileActivity.f43692y3) {
            org.telegram.messenger.a8.a();
        } else if (i7 == profileActivity.f43699z3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String N02 = org.telegram.messenger.hd.N0(2131754117, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
            t1Var2.U = N02;
            t1Var2.S = org.telegram.messenger.hd.N0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), new ut0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            profileActivity.showDialog(t1Var2);
        } else if (i7 == profileActivity.f43574h3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i7 == profileActivity.W2) {
            profileActivity.presentFragment(new la(null));
        } else if (i7 == profileActivity.X2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i7 == profileActivity.U2) {
            profileActivity.presentFragment(new g(3));
        } else if (i7 == profileActivity.P2) {
            profileActivity.L4();
        } else if (i7 == profileActivity.f43561f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i7 == profileActivity.f43568g4) {
            profileActivity.presentFragment(new di.pb());
        } else if (i7 == profileActivity.f43575h4) {
            profileActivity.presentFragment(new ii.t());
        } else if (i7 == profileActivity.f43582i4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i7 == profileActivity.f43588j4) {
            bi.f2.l1(false, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
        } else if (i7 == profileActivity.botPermissionLocation) {
            ki.r0 r0Var = profileActivity.f43654t2;
            if (r0Var != null) {
                r0Var.l(!r0Var.g(), new ur0(12, profileActivity, view));
            }
        } else if (i7 == profileActivity.botPermissionBiometry) {
            ki.p pVar = profileActivity.f43660u2;
            if (pVar != null) {
                pVar.f18816f = true;
                pVar.f18815e = !pVar.f18815e;
                pVar.k();
                ((org.telegram.ui.Cells.n8) view).setChecked(profileActivity.f43660u2.f18815e);
            }
        } else if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.setChecked(!n8Var.d());
            if (profileActivity.f43642r4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f43642r4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().q1(profileActivity.f43550e1);
            boolean d = n8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f43675w2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new e00(24, profileActivity, r0));
            profileActivity.f43642r4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i7 == profileActivity.P3) {
            profileActivity.R4 = !profileActivity.R4;
            profileActivity.W4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.P3);
            int i11 = profileActivity.f43644r6;
            if (i11 >= 0) {
                profileActivity.f43534c.h1(i11, profileActivity.f43651s6 - profileActivity.f43518a.getPaddingTop());
            }
        } else if (i7 == profileActivity.Q3) {
            profileActivity.Q4(false);
        } else if (i7 == profileActivity.R2) {
            if (profileActivity.f43675w2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f43675w2.personal_channel_id);
            profileActivity.presentFragment(new bn(bundle7));
        } else if (i7 == profileActivity.V2) {
            dx0 dx0Var = profileActivity.G6;
            if ((dx0Var == null || !dx0Var.a()) && !profileActivity.Z3(i7, view)) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (y8Var.d.getDrawable() != null) {
                    profileActivity.K4(y8Var.getImageView());
                }
            }
        } else if (i7 == profileActivity.I3) {
            profileActivity.Y3(i7, view);
        } else {
            profileActivity.T4(f10, f11, i7, view);
        }
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z10;
        TLRPC.VideoSize x10;
        if (tL_error == null) {
            TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.getUserConfig().e()));
            if (c22 == null) {
                c22 = profileActivity.getUserConfig().f();
                if (c22 == null) {
                    return;
                }
                profileActivity.getMessagesController().e4(c22, false, false);
            } else {
                profileActivity.getUserConfig().w(c22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x10 = null;
            } else {
                x10 = org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            c22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28422id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && profileActivity.J2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.J2, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.J2.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(profileActivity.J2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.m(profileActivity.currentAccount, 1, c22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.K2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.K2, null, true, true).renameTo(J2);
            }
            profileActivity.getMessagesController().W0(c22.f28547id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.f43550e1);
            if (d2 != null) {
                d2.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(d2, false);
            }
        }
        if (!org.telegram.messenger.g0.Q1() && !profileActivity.f43619o2 && profileActivity.f43557f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f43625p2 = z10;
        profileActivity.J2 = null;
        profileActivity.K2 = null;
        bv0 bv0Var = profileActivity.f43617o0;
        bv0Var.I0 = true;
        bv0Var.L0 = profileActivity.L2;
        bv0Var.f35846r1 = null;
        bv0Var.f35847s1 = null;
        bv0Var.setCreateThumbFromParent(false);
        profileActivity.M5(true);
        profileActivity.m5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ls.f25335r, Integer.valueOf(org.telegram.messenger.np.I8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ls.f25292j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        int i7;
        if (profileActivity.f43523a4 >= 0) {
            if (profileActivity.N4 == -1) {
                profileActivity.N5();
                profileActivity.d.f();
            } else {
                profileActivity.H5(false, false);
            }
        }
        if (profileActivity.N4 == -1) {
            if (!profileActivity.f43619o2 && !org.telegram.messenger.g0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f24004m;
                } else {
                    i7 = 0;
                }
                int i10 = currentActionBarHeight + i7;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f43518a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f43518a.getMeasuredHeight(), 0);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    lw0 lw0Var = profileActivity.d;
                    if (i11 >= lw0Var.f49684e.O2) {
                        break;
                    }
                    v4.e1 a10 = lw0Var.a(null, lw0Var.d(i11));
                    View view = a10.f59111a;
                    profileActivity.d.t(a10, i11);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 += view.getMeasuredHeight();
                    i11++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i12) + i10));
                ru0 ru0Var = profileActivity.f43518a;
                ru0Var.setPadding(0, ru0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f43518a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.f43593k2.cancel();
                float[] fArr = profileActivity.f43612n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.a5(1.0f);
                profileActivity.Q1 = profileActivity.j4();
            }
        }
        profileActivity.M.m(profileActivity.f43579i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity) {
        boolean z10;
        org.telegram.ui.ActionBar.h2 h2Var;
        int i7;
        int w02;
        String str;
        boolean z11;
        long j3;
        Object[] objArr;
        char c10;
        float f10;
        float f11;
        float f12;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f43675w2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.o10.j(profileActivity.getParentActivity(), false, 1, null);
            org.telegram.ui.ActionBar.h2 h2Var2 = j10.f30184y0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.A0);
            if (profileActivity.a() != org.telegram.messenger.k10.i(profileActivity.currentAccount).e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            linearLayout.addView(limitPreviewView, c8.na.t(-1, -2, 17, 0, 20, 0, 10));
            int i10 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, c8.na.t(-1, -2, 17, 40, -12, 40, 20));
                int i11 = 2;
                org.telegram.ui.Components.m80[] m80VarArr = new org.telegram.ui.Components.m80[2];
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i11;
                    bi.w2 w2Var = new bi.w2(6, parentActivity, null);
                    m80VarArr[i12] = w2Var;
                    w2Var.setGravity(i10);
                    m80VarArr[i12].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.t6.U(m80VarArr[i12], org.telegram.ui.ActionBar.m6.f29739y6, null);
                    org.telegram.ui.ActionBar.t6.G(m80VarArr[i12], org.telegram.ui.ActionBar.m6.Xc, null);
                    frameLayout.addView(m80VarArr[i12], c8.na.e(-1, -1, 119));
                    org.telegram.ui.Components.m80 m80Var = m80VarArr[i12];
                    if (i12 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    m80Var.setAlpha(f10);
                    org.telegram.ui.Components.m80 m80Var2 = m80VarArr[i12];
                    if (i12 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    m80Var2.setScaleX(f11);
                    org.telegram.ui.Components.m80 m80Var3 = m80VarArr[i12];
                    if (i12 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.8f;
                    }
                    m80Var3.setScaleY(f12);
                    i12++;
                    i11 = i13;
                    i10 = 17;
                }
                int i14 = i11;
                final r3 r3Var = new r3(m80VarArr, 23);
                if (profileActivity.a() == org.telegram.messenger.k10.i(profileActivity.currentAccount).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j11 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                h2Var = h2Var2;
                if (tl_starsRating != null) {
                    j3 = tl_starsRating.stars - j11;
                } else {
                    j3 = 0;
                }
                long j12 = (-j11) - j3;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
                long j13 = userFull.stars_my_pending_rating.stars;
                long j14 = userFull.stars_rating.stars;
                long j15 = j13 - j14;
                if ((j14 < 0 && !z11) || (z11 && j12 > 0)) {
                    boolean z12 = z11;
                    objArr = m80VarArr;
                    org.telegram.ui.ActionBar.t6.U(m80VarArr[0], org.telegram.ui.ActionBar.m6.f29588q7, null);
                    if (z12) {
                        objArr[0].setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        objArr[0].setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744931, org.telegram.messenger.n5.l(org.telegram.messenger.k10.f24932t0, profileActivity.a()))));
                    }
                    c10 = 0;
                } else {
                    objArr = m80VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.hd.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.hd.H(',', "StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i14] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c10 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131744945, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i15 = r4;
                            r3 r3Var2 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    r3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    objArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i15 = r4;
                            r3 r3Var2 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    r3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview1", max);
                String H4 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i14] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131744944, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i15 = r4;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i15 = r4;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                h2Var = h2Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(org.telegram.messenger.hd.N0(2131744926, null));
            textView.setTextSize(1, 20.0f);
            int i15 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(textView, i15, profileActivity.A0);
            linearLayout.addView(textView, c8.na.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.f28548id == org.telegram.messenger.k10.i(profileActivity.currentAccount).e()) {
                textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131744927, null)));
                i7 = 1;
            } else {
                i7 = 1;
                org.telegram.messenger.f3.q(null, null, 2131744957, new Object[]{org.telegram.messenger.n5.l(org.telegram.messenger.k10.f24932t0, profileActivity.a())}, textView2);
            }
            textView2.setTextSize(i7, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, i15, profileActivity.A0);
            linearLayout.addView(textView2, c8.na.t(-1, -2, 17, 20, 0, 20, 12));
            ks0 ks0Var = new ks0(parentActivity, profileActivity.A0);
            ks0Var.f49348a.l(org.telegram.messenger.hd.N0(2131744925, null), false);
            String N0 = org.telegram.messenger.hd.N0(2131744960, null);
            int i16 = org.telegram.ui.ActionBar.m6.Fi;
            ks0Var.f49349b.setText(org.telegram.messenger.hd.V(null, null, 2131744956, W3(N0, i16, profileActivity.A0)));
            ks0Var.d.setVisibility(8);
            ImageView imageView = ks0Var.f49350c;
            imageView.setImageResource(2131231828);
            org.telegram.ui.ActionBar.h6 h6Var = profileActivity.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.t6.s(imageView, i15, h6Var, mode);
            linearLayout.addView(ks0Var, c8.na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ks0 ks0Var2 = new ks0(parentActivity, profileActivity.A0);
            ks0Var2.f49348a.l(org.telegram.messenger.hd.N0(2131744924, null), false);
            ks0Var2.f49349b.setText(org.telegram.messenger.hd.V(null, null, 2131744955, W3(org.telegram.messenger.hd.N0(2131744960, null), i16, profileActivity.A0)));
            ks0Var2.d.setVisibility(8);
            ImageView imageView2 = ks0Var2.f49350c;
            imageView2.setImageResource(2131231892);
            org.telegram.ui.ActionBar.t6.s(imageView2, i15, profileActivity.A0, mode);
            linearLayout.addView(ks0Var2, c8.na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ks0 ks0Var3 = new ks0(parentActivity, profileActivity.A0);
            ks0Var3.f49348a.l(org.telegram.messenger.hd.N0(2131744923, null), false);
            String N02 = org.telegram.messenger.hd.N0(2131744958, null);
            if (org.telegram.ui.ActionBar.m6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29512m6, profileActivity.A0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29739y6, profileActivity.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(N02);
            iz izVar = new iz(9);
            izVar.f48854w = N02;
            if (izVar.f48848c != null) {
                str = null;
                izVar.f48848c = null;
                izVar.a();
            } else {
                str = null;
            }
            izVar.f48850f = w02;
            izVar.f48851n = false;
            spannableStringBuilder3.setSpan(izVar, 0, spannableStringBuilder3.length(), 0);
            ks0Var3.f49349b.setText(org.telegram.messenger.hd.V(str, str, 2131744954, spannableStringBuilder3));
            ks0Var3.d.setVisibility(8);
            ImageView imageView3 = ks0Var3.f49350c;
            imageView3.setImageResource(2131231876);
            org.telegram.ui.ActionBar.t6.s(imageView3, i15, profileActivity.A0, mode);
            linearLayout.addView(ks0Var3, c8.na.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.d dVar = new hi.d(parentActivity, profileActivity.A0, true);
            dVar.setOnClickListener(new nu0(0, h2Var));
            dVar.i(di.f6.t2(org.telegram.messenger.hd.N0(2131743645, null)), false, true);
            linearLayout.addView(dVar, c8.na.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j10.O = linearLayout;
            j10.show();
        }
    }

    public static void l0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        switch (i7) {
            case 0:
                boolean z10 = profileActivity.f43631q1;
                if (z10) {
                    if (z10) {
                        profileActivity.c4();
                        return;
                    }
                    return;
                } else if (profileActivity.f43550e1 != 0) {
                    profileActivity.O4();
                    return;
                } else if (profileActivity.f43558f1 != 0) {
                    if (org.telegram.messenger.v3.c0(profileActivity.getMessagesController().O0(Long.valueOf(profileActivity.f43558f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f43558f1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new bn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.c4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f43558f1);
                        if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                            profileActivity.presentFragment(new bn(bundle2), false);
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
                profileActivity.I4(profileActivity.f43519a0, f10, f11, true);
                return;
            case 2:
                profileActivity.P4();
                return;
            case 3:
                profileActivity.G4();
                return;
            case 4:
                profileActivity.J4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.F4(false);
                return;
            case 6:
                profileActivity.F4(true);
                return;
            case 7:
                profileActivity.H4(true);
                return;
            case 8:
                qy0.L0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.z4(false);
                return;
            case 12:
                profileActivity.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, profileActivity.getParentActivity(), profileActivity.A0);
                t1Var.r(200L);
                org.telegram.messenger.np.u1(profileActivity.currentAccount).R1().k(profileActivity.a(), new org.telegram.ui.Components.rh(25, profileActivity, t1Var), true, profileActivity.A0);
                return;
            case 13:
                profileActivity.E4(true);
                return;
            case 14:
                profileActivity.L4();
                return;
            case 15:
                TLRPC.User f12 = profileActivity.getUserConfig().f();
                if (f12 != null) {
                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(profileActivity, profileActivity.f43519a0);
                    I.f33368w = false;
                    I.f33344i = 3;
                    I.c(2131232322, org.telegram.messenger.hd.N0(2131746304, null), new n90(profileActivity, 25), false);
                    I.c(2131232105, org.telegram.messenger.hd.N0(2131746482, null), new hf0(f12, 29), false);
                    I.c(2131232118, org.telegram.messenger.hd.N0(2131746424, null), new n90(profileActivity, 26), false);
                    I.Z = true;
                    I.b0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.f43519a0.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    I.a0();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new o31(null));
                return;
            default:
                return;
        }
    }

    public static void m0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f43527b0 == null) {
            if (MediaController.B().R0 != null && MediaController.B().R0.f24484a == profileActivity.currentAccount && MediaController.B().R0.f24485b == profileActivity.a()) {
                profileActivity.f43527b0 = MediaController.B().R0;
            } else {
                org.telegram.messenger.hp hpVar = new org.telegram.messenger.hp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f43527b0 = hpVar;
                TLRPC.UserFull userFull = profileActivity.f43675w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = hpVar.f24486c;
                    arrayList.clear();
                    hpVar.b();
                    arrayList.add(0, hpVar.d(document));
                }
            }
        }
        if (!profileActivity.f43527b0.f24486c.isEmpty()) {
            if (MediaController.B().R0 == profileActivity.f43527b0 && MediaController.B().I((org.telegram.messenger.gj) profileActivity.f43527b0.f24486c.get(0))) {
                z10 = true;
            } else {
                MediaController.B().o();
                z10 = false;
            }
            MediaController.B().R0 = profileActivity.f43527b0;
            MediaController.B().S0.clear();
            MediaController.B().S0.addAll(profileActivity.f43527b0.f24486c);
            if (!z10) {
                MediaController.B().S((org.telegram.messenger.gj) profileActivity.f43527b0.f24486c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.f8(profileActivity.getParentActivity(), profileActivity.A0));
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.za0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new n90(profileActivity, 23), profileActivity.A0);
    }

    public static void o0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(profileActivity).Q(2131623990, 36, org.telegram.messenger.hd.N0(2131746662, null));
            Q.f35489j = 5000;
            Q.j();
            return;
        }
        if (tL_birthday == null) {
            userFull.flags2 &= -33;
        } else {
            userFull.flags2 |= 32;
        }
        userFull.birthday = tL_birthday;
        profileActivity.getMessagesStorage().j2(userFull, false);
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (profileActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.resourceProvider);
                String N0 = org.telegram.messenger.hd.N0(2131746658, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131746659, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                profileActivity.showDialog(t1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.f3.n(null, 2131743636, org.telegram.ui.Components.lc.b0(profileActivity), 2131624012, 36);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.d2[] d2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().q1(profileActivity.f43550e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().l1(profileActivity.f43562f5);
        tL_messages_reportReaction.f28506id = profileActivity.f43554e5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new fi.k5(27));
        org.telegram.ui.Cells.d2 d2Var = d2VarArr[0];
        if (d2Var != null && d2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f43562f5, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1)));
        }
        profileActivity.f43554e5 = 0;
        profileActivity.H5(false, false);
        org.telegram.ui.Components.lc.b0(profileActivity).E(profileActivity.A0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.f43550e1;
        if (j3 == 0) {
            long j10 = profileActivity.f43558f1;
            if (j10 != 0) {
                j3 = -j10;
            } else {
                j3 = profileActivity.f43579i1;
            }
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.np.u1(profileActivity.currentAccount).W(profileActivity.f43562f5, j11);
        } else {
            org.telegram.messenger.np.u1(profileActivity.currentAccount).h0(profileActivity.f43562f5, profileActivity.f43554e5, j11);
        }
        profileActivity.f43554e5 = 0;
        profileActivity.H5(false, false);
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(profileActivity.getParentActivity(), profileActivity.A0);
        obVar.d(2131623982, new String[0]);
        obVar.f38124b.setText(org.telegram.messenger.hd.N0(2131746208, null));
        org.telegram.ui.Components.lc.b0(profileActivity).b(obVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.J2 = fileLocation;
            profileActivity.K2 = photoSize2.location;
            profileActivity.f43557f0.j(org.telegram.messenger.gc.e(fileLocation), "50_50", profileActivity.f43630q0, null);
            if (profileActivity.P2 != -1) {
                profileActivity.N5();
                lw0 lw0Var = profileActivity.d;
                if (lw0Var != null) {
                    lw0Var.f();
                }
                profileActivity.B4(true);
            }
            bv0 bv0Var = profileActivity.f43617o0;
            org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(profileActivity.K2);
            profileActivity.L2 = e10;
            bv0Var.A(e10, org.telegram.messenger.gc.e(profileActivity.J2));
            profileActivity.m5(true, false);
        } else if (profileActivity.J2 == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i7 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i7 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.f43629p6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new e00(23, profileActivity, str));
        }
        profileActivity.actionBar.s().requestLayout();
    }

    public static void y1(ProfileActivity profileActivity, boolean z10) {
        int i7;
        int i10;
        float f10;
        int i11 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        profileActivity.f43518a.setVisibility(i7);
        org.telegram.ui.Components.ek0 ek0Var = profileActivity.f43526b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ek0Var.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i11 = 8;
        }
        searchContainer.setVisibility(i11);
        di.t0 t0Var = profileActivity.f43673w0;
        if (t0Var != null) {
            t0Var.setActive(!z10);
        }
        profileActivity.actionBar.A(z10);
        profileActivity.Y.setVisibility(i7);
        dv0 dv0Var = profileActivity.f43665v0;
        if (dv0Var != null) {
            dv0Var.setVisibility(i7);
        }
        profileActivity.f43556f.setVisibility(i7);
        profileActivity.f43637r.setVisibility(i7);
        org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
        if (g5Var != null) {
            g5Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i7);
        }
        profileActivity.U0.setVisibility(i7);
        profileActivity.f43557f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        dv0 dv0Var2 = profileActivity.f43665v0;
        if (dv0Var2 != null) {
            dv0Var2.setAlpha(1.0f);
        }
        di.t0 t0Var2 = profileActivity.f43673w0;
        if (t0Var2 != null) {
            t0Var2.setAlpha(1.0f);
        }
        profileActivity.f43556f.setAlpha(1.0f);
        cv0 cv0Var = profileActivity.f43637r;
        if (profileActivity.X5) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cv0Var.setAlpha(f10);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f43518a.setAlpha(1.0f);
        profileActivity.f43526b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f43526b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public final boolean A4() {
        if (getMessagesController().R1().K(a()) && !this.f43631q1) {
            return true;
        }
        return false;
    }

    public final void A5() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float L3 = 1.0f - ((1.0f - L3()) * this.simpleActionBar.getActionModeFactor());
            ai.g0 g0Var = this.Z;
            if (g0Var != null && this.R1 != L3) {
                this.R1 = L3;
                g0Var.invalidate();
            }
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56727a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z10) {
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float U1;
        org.telegram.ui.Components.q9 currentItemView;
        float f13;
        float U12;
        int i11;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        FrameLayout.LayoutParams layoutParams;
        float f20;
        int i12;
        int i13;
        pk pkVar;
        int w02;
        float f21;
        int i14;
        boolean z11;
        TLRPC.ChatFull chatFull;
        int i15;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        float L3 = L3();
        A5();
        ru0 ru0Var = this.f43518a;
        if (ru0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ru0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f43518a.setLayoutParams(layoutParams2);
            }
        }
        S5(z10);
        if (this.Y != null) {
            this.f43518a.setTopGlowOffset((int) this.Q1);
            ru0 ru0Var2 = this.f43518a;
            if (this.Q1 > j4() && this.Q1 < (e4() + this.f43518a.getMeasuredWidth()) - currentActionBarHeight) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            ru0Var2.setOverScrollMode(i15);
        }
        if (this.Y != null && !this.f43584i6 && this.G1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.Y != null) {
            if (this.f43519a0 != null && this.f43558f1 != 0) {
                if (org.telegram.messenger.v3.T(this.F2) && !this.F2.megagroup && (chatFull = this.f43667v2) != null && chatFull.linked_chat_id != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f43519a0.o(2, z11);
            }
            S5(z10);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f24004m;
            } else {
                i10 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.o10.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, i10) - org.telegram.messenger.g0.L(21.0f));
            if (!this.G1) {
                org.telegram.ui.Components.lg0 lg0Var = this.f43658u0;
                if (lg0Var != null) {
                    f21 = -org.telegram.messenger.g0.L(29.0f);
                    bi.d2 d2Var = lg0Var.f37144n;
                    if (d2Var != null && d2Var.f3457c) {
                        f21 = ((RectF) d2Var.f3458e).centerY();
                    }
                } else {
                    f21 = -org.telegram.messenger.g0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.g0.f24004m;
                } else {
                    i14 = 0;
                }
                this.f43529b2 = org.telegram.messenger.g0.T1(f21, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14) - org.telegram.messenger.g0.L(21.0f)), L3);
            } else {
                this.f43529b2 = translationY;
            }
            if (this.G1) {
                f10 = this.S1;
            } else {
                f10 = this.Q1;
            }
            float f22 = j42;
            if (f10 <= f22 && !this.f43632q2) {
                f11 = 2.0f;
                f12 = 18.0f;
            } else {
                f11 = 2.0f;
                float C = a8.p0.C(f10 - f22, (this.f43518a.getMeasuredWidth() - currentActionBarHeight) - k4(), 1.0f, 0.0f);
                this.f43580i2 = C;
                f12 = 18.0f;
                this.f43537c2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, C * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                dv0 dv0Var = this.f43665v0;
                if (dv0Var != null) {
                    dv0Var.invalidate();
                }
                di.t0 t0Var = this.f43673w0;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.f43587j2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z12 = this.f43625p2;
                int i16 = org.telegram.messenger.ls.f25360u4;
                float[] fArr = this.f43612n2;
                if (z12 && (this.G0 || this.f43580i2 >= 0.33f)) {
                    if (!this.f43632q2) {
                        if (this.T0 != null) {
                            if (!w4()) {
                                this.T0.T(21);
                            } else {
                                this.T0.u(21);
                            }
                            if (this.f43638r0 != null) {
                                this.T0.T(36);
                                this.T0.T(34);
                                this.T0.T(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        org.telegram.ui.ActionBar.g5 g5Var = this.U0;
                        if (g5Var != null) {
                            g5Var.setEnabled(false);
                        }
                        this.f43632q2 = true;
                        org.telegram.messenger.ls.e().k(i16, Boolean.TRUE);
                        this.N.f(true, min);
                        this.f43623p0.b(min);
                        this.f43617o0.setCreateThumbFromParent(true);
                        this.f43617o0.getAdapter().g();
                        this.f43593k2.cancel();
                        fArr[0] = org.telegram.messenger.g0.U1(this.f43605m2, fArr);
                        fArr[1] = 1.0f;
                        dv0 dv0Var2 = this.f43665v0;
                        if (dv0Var2 != null && !dv0Var2.f43835x.isEmpty()) {
                            this.f43593k2.setInterpolator(new x1.a());
                            this.f43593k2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f43593k2.setInterpolator(org.telegram.ui.Components.nr.f37920j);
                            this.f43593k2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f43593k2.addListener(new ev0(this, 4));
                        View m10 = this.f43534c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i11 = org.telegram.messenger.g0.f24004m;
                            } else {
                                i11 = 0;
                            }
                            this.f43518a.x0(((m10.getTop() - this.f43518a.getMeasuredWidth()) - e4()) + currentActionBarHeight2 + i11, (int) this.f43593k2.getDuration(), (Interpolator) this.f43593k2.getInterpolator());
                            this.f43518a.P0 = false;
                        }
                        this.f43570g6 = this.f43556f.getTranslationY();
                        this.f43577h6 = this.f43637r.getTranslationY();
                        this.f43593k2.start();
                        this.f43617o0.setAlpha(0.0f);
                        this.f43617o0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f43617o0.getLayoutParams();
                    int i17 = layoutParams3.height;
                    layoutParams3.width = this.f43518a.getMeasuredWidth();
                    float f23 = currentActionBarHeight + f10;
                    int i18 = (int) f23;
                    layoutParams3.height = i18;
                    if (i17 != i18) {
                        this.f43617o0.requestLayout();
                    }
                    if (!this.f43593k2.isRunning()) {
                        if (this.G1 && this.J1 == 2) {
                            f13 = (-(1.0f - this.T1)) * org.telegram.messenger.g0.L(50.0f);
                        } else {
                            f13 = 0.0f;
                        }
                        this.f43556f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f43556f.getLeft());
                        this.f43556f.setTranslationY((((f23 - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f43556f.getBottom()) + f13);
                        this.f43637r.setTranslationX(m4(org.telegram.messenger.g0.N(16.0f) - this.f43637r.getLeft(), 0.0f));
                        this.f43637r.setTranslationY(n4((((f23 - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.f43637r.getBottom()) + f13));
                        t5();
                    }
                } else {
                    if (this.f43632q2) {
                        this.f43632q2 = false;
                        org.telegram.messenger.ls.e().k(i16, Boolean.TRUE);
                        org.telegram.ui.ActionBar.g5 g5Var2 = this.T0;
                        if (g5Var2 != null) {
                            g5Var2.u(21);
                            if (this.f43638r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.T(36);
                                this.T0.T(31);
                            }
                        }
                        org.telegram.ui.ActionBar.g5 g5Var3 = this.U0;
                        if (g5Var3 != null) {
                            g5Var3.setEnabled(!this.f43697z1);
                        }
                        this.N.f(false, min);
                        this.f43623p0.b(min);
                        this.f43593k2.cancel();
                        this.f43557f0.getImageReceiver().f22659u0 = true;
                        this.f43557f0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.g0.U1(this.f43605m2, fArr);
                        fArr[1] = 0.0f;
                        this.f43593k2.setInterpolator(org.telegram.ui.Components.nr.f37920j);
                        if (!this.f43619o2) {
                            this.f43593k2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f43593k2.setDuration(0L);
                        }
                        this.f43543d1.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29290a7, this.A0));
                        if (!this.I0 && (currentItemView = this.f43617o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.t51) {
                                this.f43557f0.f53943b0 = false;
                            } else {
                                av0 av0Var = this.f43557f0;
                                av0Var.f53943b0 = true;
                                av0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f43593k2.addListener(new ev0(this, 5));
                        this.f43557f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.f43617o0.setAlpha(0.0f);
                        this.f43593k2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.Y.setScaleX(this.f43537c2);
                    this.Y.setScaleY(this.f43537c2);
                    d4();
                    ValueAnimator valueAnimator = this.f43593k2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        U4();
                        this.f43556f.setTranslationY(this.f43559f2);
                        this.f43637r.setTranslationX(m4(this.f43566g2, this.C6));
                        this.f43637r.setTranslationY(n4(this.f43573h2));
                        t5();
                    }
                }
            }
            boolean z13 = this.G1;
            if (z13 && this.J1 == 2) {
                float f24 = this.f43597k6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f24004m;
                } else {
                    i13 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f11) + i13) - (org.telegram.messenger.g0.f24009p * 21.0f));
                this.f43556f.setPivotY(pkVar.getMeasuredHeight());
                this.f43556f.setScaleX(1.38f);
                this.f43556f.setScaleY(1.38f);
                this.f43537c2 = org.telegram.messenger.g0.W1(this.T1, 42, 138) / 100.0f;
                this.d2 = 0.0f;
                dv0 dv0Var3 = this.f43665v0;
                if (dv0Var3 != null) {
                    dv0Var3.setExpandProgress(1.0f);
                }
                di.t0 t0Var2 = this.f43673w0;
                if (t0Var2 != null) {
                    t0Var2.setExpandProgress(1.0f);
                }
                this.f43557f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, this.T1));
                this.Y.setTranslationX(org.telegram.messenger.g0.T1(f24, 0.0f, this.T1));
                this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.f43537c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.f43578i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.f43578i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.f43585j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f43585j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.f43591k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f43591k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.f43598l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f43598l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.f43537c2);
                this.Y.setScaleY(this.f43537c2);
                this.f43617o0.setAlpha(0.0f);
                this.f43617o0.setVisibility(0);
                av0 av0Var2 = this.f43557f0;
                float f25 = this.T1;
                float f26 = this.f43537c2;
                av0Var2.I = f25;
                av0Var2.J = f26;
                av0Var2.H = true;
                this.N.e(false, f25);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                int i19 = -1;
                if (this.f43616n6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, this.A0);
                }
                kVar.G(i0.a.f(this.T1, w02, -1), false);
                org.telegram.ui.Components.vk0 vk0Var = this.L;
                if (vk0Var != null) {
                    vk0Var.b(i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29422h8, this.A0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f43680x;
                if (drawable != null) {
                    if (this.f43616n6 == null) {
                        i19 = i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29409gd, this.A0), -1);
                    }
                    drawable.setColorFilter(i19, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.mr mrVar = this.J;
                if (mrVar != null) {
                    mrVar.a(this.T1);
                    this.f43556f.invalidate();
                }
                org.telegram.ui.Components.mr mrVar2 = this.K;
                if (mrVar2 != null) {
                    mrVar2.a(this.T1);
                    this.f43556f.invalidate();
                }
                w5(this.T1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.f43518a.getMeasuredWidth() / this.f43537c2, this.T1);
                layoutParams4.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + currentActionBarHeight) / this.f43537c2, this.T1);
                this.Y.requestLayout();
                t5();
            } else if (f10 <= f22) {
                if (z13) {
                    this.f43537c2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f15 = 1.0f;
                } else {
                    org.telegram.ui.Components.lg0 lg0Var2 = this.f43658u0;
                    if (lg0Var2 != null) {
                        f14 = lg0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f14 = 24.0f;
                    }
                    this.f43537c2 = org.telegram.messenger.g0.T1(f14, 96.0f, L3) / 100.0f;
                    f15 = 1.0f;
                    this.d2 = 1.0f - L3;
                }
                org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
                if (tf0Var != null) {
                    if (this.G1) {
                        tf0Var.setAlpha(this.T1);
                    } else {
                        tf0Var.setAlpha(f15);
                    }
                }
                dv0 dv0Var4 = this.f43665v0;
                if (dv0Var4 != null) {
                    dv0Var4.invalidate();
                }
                di.t0 t0Var3 = this.f43673w0;
                if (t0Var3 != null) {
                    t0Var3.h = this.G1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (t0Var3.f9767f != l10) {
                        t0Var3.f9767f = l10;
                        t0Var3.invalidate();
                    }
                }
                if (this.G1) {
                    f16 = org.telegram.messenger.g0.T1(p4(0), 1.12f, L3);
                } else {
                    f16 = (0.12f * L3) + 1.0f;
                }
                ValueAnimator valueAnimator2 = this.f43593k2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f43593k2;
                    ev0 ev0Var = this.f43555e6;
                    valueAnimator3.removeListener(ev0Var);
                    this.f43593k2.addListener(ev0Var);
                } else {
                    this.Y.setScaleX(this.f43537c2);
                    this.Y.setScaleY(this.f43537c2);
                    d4();
                    this.Y.setTranslationY((float) Math.ceil(this.f43529b2));
                    float L = (((this.f43537c2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.f43578i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                    this.f43578i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                    this.f43585j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f43585j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                    this.f43591k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f43591k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                    this.f43598l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f43598l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.g0.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight());
                if (this.G1) {
                    f17 = this.T1;
                } else {
                    f17 = L3;
                }
                float f27 = (N * f17) + floor;
                this.f43559f2 = com.google.android.gms.internal.vision.e2.z(1.0f, this.T1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + f27);
                this.f43573h2 = (((float) Math.floor(org.telegram.messenger.g0.f24009p * 11.0f)) * L3) + f27 + org.telegram.messenger.g0.L(24.0f);
                if (this.G1) {
                    f18 = (this.f43597k6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                } else {
                    f18 = -org.telegram.messenger.g0.N(46.0f);
                }
                xw0 xw0Var = this.F6;
                if (xw0Var != null) {
                    xw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.f43518a.getMeasuredWidth();
                this.f43556f.setScaleX(f16);
                this.f43556f.setScaleY(f16);
                if (this.G1) {
                    f19 = org.telegram.messenger.g0.T1(p4(1), 1.0f, L3);
                } else {
                    f19 = 1.0f;
                }
                this.f43637r.setScaleX(f19);
                this.f43637r.setScaleY(f19);
                C4(0, L3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f43556f.getLayoutParams();
                float f28 = measuredWidth2 / f11;
                float min2 = f28 - (((Math.min(this.f43556f.getExactWidth(), layoutParams5.width) * f16) * 0.5f) + layoutParams5.leftMargin);
                float f29 = ((FrameLayout.LayoutParams) this.f43637r.getLayoutParams()).width;
                if (!this.f43670v5 && this.f43637r.getExactWidth() <= (f29 - this.f43637r.getPaddingLeft()) - this.f43637r.getPaddingRight()) {
                    f20 = this.f43637r.getPaddingLeft();
                } else {
                    f20 = 0.0f;
                }
                float min3 = f28 - ((Math.min(this.f43637r.getExactWidth(), f29) * 0.5f) + (layoutParams.leftMargin + f20));
                this.f43551e2 = min2;
                this.f43566g2 = min3;
                this.C6 = f20;
                if (this.G1) {
                    min2 = org.telegram.messenger.g0.T1(q4(f18, 0, this.f43556f), min2, L3);
                    min3 = org.telegram.messenger.g0.T1(q4(f18, 1, this.f43637r), min3, L3);
                }
                ValueAnimator valueAnimator4 = this.f43593k2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f43556f.setTranslationX(min2);
                    this.f43556f.setTranslationY(this.f43559f2);
                    this.f43637r.setTranslationX(m4(min3, this.C6 * L3));
                    this.f43637r.setTranslationY(n4(this.f43573h2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f43556f.getLayoutParams();
                int i20 = layoutParams6.width;
                if (org.telegram.messenger.g0.Q1()) {
                    i12 = org.telegram.messenger.g0.L(490.0f);
                } else {
                    i12 = org.telegram.messenger.g0.f24010q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i12 - org.telegram.messenger.g0.L(f12)) / this.f43556f.getScaleX()) - (this.f43556f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i20) {
                    this.f43556f.requestLayout();
                }
                t5();
            }
            ValueAnimator valueAnimator5 = this.f43593k2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                C4(0, L3, true);
            }
        }
        z5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f43557f0.setAlpha(1.0f);
        }
    }

    public final void B5() {
        boolean z10;
        boolean z11;
        boolean z12;
        float a10;
        float f10 = 0.0f;
        if (!this.f43631q1 && !this.G1) {
            int e42 = e4();
            if (e42 > 0) {
                a10 = c8.m9.a(1.0f - (this.Q1 / e42), 0.0f, 1.0f);
            } else {
                a10 = c8.m9.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f10 = a10;
        }
        float f11 = this.G5;
        if (f11 != f10) {
            if (f11 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f10 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.G5 = f10;
            pk pkVar = this.f43556f;
            if (pkVar != null) {
                pkVar.setTextColor(this.J5);
            }
            cv0 cv0Var = this.f43637r;
            if (cv0Var != null) {
                cv0Var.setTextColor(this.K5);
            }
            v5();
            if (z12) {
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25360u4, Boolean.TRUE);
            }
            zw0 zw0Var = this.f43543d1;
            if (zw0Var != null) {
                zw0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        E5();
        D5();
    }

    public final void C4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(int, float, boolean):void");
    }

    public final void C5() {
        wv0 wv0Var = this.O;
        if (wv0Var != null && this.f43533b6 != 0) {
            int topPanelShift = wv0Var.getTopPanelShift();
            int i7 = 0;
            if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
                if (this.O.getParent() == this.f43518a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
                }
                i7 = topPanelShift;
            }
            int i10 = this.f43533b6 + i7;
            f5(i10, this.H5);
            f5(i10, this.Z5);
        }
    }

    public final void D5() {
        boolean z10;
        float f10;
        if (this.H5 != null && this.Z5 != null) {
            wv0 wv0Var = this.O;
            int i7 = 0;
            if (wv0Var != null && wv0Var.getParent() == this.f43518a && this.O.isAttachedToWindow()) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(Math.min(this.G5, this.R5), this.W5);
            View view = this.H5;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = max;
            }
            view.setAlpha(f10);
            this.H5.setVisibility((z10 || max <= 0.0f) ? 8 : 8);
            View view2 = this.Z5;
            if (!z10) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z10) {
                this.Z5.setTranslationY(-(this.O.getY() + this.f43518a.getY()));
            }
        }
    }

    public final void E4(boolean z10) {
        boolean z11;
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f43550e1));
        if (c22 != null) {
            if (this.f43648s2 && !org.telegram.messenger.np.L2(c22)) {
                if (this.f43592k1 && !z10) {
                    getMessagesController().r5(new n90(this, 6), this.f43550e1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.F2;
                if (this.E2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.c5.r(this, false, chat, c22, z11, true, false, true, new yt0(this, c22));
            } else if (this.f43592k1) {
                getMessagesController().r5(null, this.f43550e1);
                if (org.telegram.ui.Components.lc.a(this)) {
                    org.telegram.ui.Components.lc.d(this, false).j();
                }
            } else if (this.l1) {
                org.telegram.ui.Components.c5.g0(this, this.f43550e1, c22, null, this.E2, false, null, new na(this, 3), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.A0);
                String N0 = org.telegram.messenger.hd.N0(2131753689, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754116, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753690, null), new ut0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, this.A0);
                }
            }
        }
    }

    public final void E5() {
        if (this.simpleActionBar != null && this.M5 != null) {
            org.telegram.ui.Components.xf0 xf0Var = this.O5;
            if (xf0Var != null) {
                float l42 = l4();
                if (xf0Var.f42035l != l42) {
                    xf0Var.f42035l = l42;
                    xf0Var.a();
                }
            }
            int f10 = i0.a.f(l4(), this.I5, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.A0));
            if (this.L5 != f10) {
                this.L5 = f10;
                org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
                z4Var.m0 = true;
                z4Var.f30299g0 = f10;
                z4Var.updateColors();
            }
            int A2 = this.N5.A2();
            if (this.Q5 != A2) {
                this.Q5 = A2;
                org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
                fh.g gVar = z4Var2.I;
                if (gVar != null) {
                    gVar.updateColors();
                    z4Var2.J.updateColors();
                    z4Var2.K.updateColors();
                }
                z4Var2.invalidate();
                org.telegram.ui.ActionBar.j5 j5Var = z4Var2.R;
                if (j5Var != null) {
                    j5Var.invalidate();
                }
            }
        }
    }

    public final void F4(boolean z10) {
        boolean z11 = false;
        if (this.f43550e1 != 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f43550e1));
            if (c22 != null) {
                TLRPC.UserFull userFull = this.f43675w2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.b2.m(c22, z10, z11, getParentActivity(), this.f43675w2, getAccountInstance());
            }
        } else if (this.f43558f1 != 0) {
            if (getMessagesController().i1(this.f43558f1, false, null) == null) {
                TLRPC.Chat chat = this.F2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.i70.K0(getParentActivity(), -chat.f28398id, accountInstance, new org.telegram.ui.Components.tm(chat, this, accountInstance, 7));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.b2.l(this.F2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void F5(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        wv0 wv0Var;
        if (this.T0 != null) {
            boolean z17 = false;
            if (!this.X5 && ((wv0Var = this.O) == null || !wv0Var.E0())) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z18 = this.f43632q2;
            org.telegram.ui.ActionBar.g5 g5Var = this.Q0;
            if (z11 && !z18 && this.M0) {
                z12 = true;
            } else {
                z12 = false;
            }
            g5(g5Var, z12, z10);
            org.telegram.ui.ActionBar.g5 g5Var2 = this.R0;
            if (z11 && !z18 && this.N0) {
                z13 = true;
            } else {
                z13 = false;
            }
            g5(g5Var2, z13, z10);
            org.telegram.ui.ActionBar.g5 g5Var3 = this.S0;
            if (z11 && !z18 && this.O0) {
                z14 = true;
            } else {
                z14 = false;
            }
            g5(g5Var3, z14, z10);
            wv0 wv0Var2 = this.O;
            if (wv0Var2 != null && wv0Var2.J != null && wv0Var2.v0(wv0Var2.getClosestTab()) && !this.O.E0()) {
                z15 = true;
            } else {
                z15 = false;
            }
            org.telegram.ui.ActionBar.g5 g5Var4 = this.T0;
            if (z10 && !z15) {
                z16 = true;
            } else {
                z16 = false;
            }
            g5(g5Var4, z11, z16);
            wv0 wv0Var3 = this.O;
            if (wv0Var3 != null) {
                boolean z19 = this.X5;
                if (z10 && !z15) {
                    z17 = true;
                }
                if (wv0Var3.f36615q2 != z19) {
                    wv0Var3.f36615q2 = z19;
                    wv0Var3.R(z10, z17);
                }
            }
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G4() {
        TLRPC.UserFull userFull = this.f43675w2;
        if (userFull != null && org.telegram.messenger.p10.c(userFull)) {
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.o10.u(org.telegram.messenger.hd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(a())), org.telegram.ui.Components.lc.b0(T), 2131624012, 36);
                return;
            }
            return;
        }
        if (this.F2 != null) {
            org.telegram.ui.Components.n30.h.a();
        }
        showDialog(new bi.p3(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void G5() {
        TLRPC.User c22;
        boolean z10;
        int i7;
        int i10;
        if (this.f43647s1 && this.X0 != null && this.W0 != null && (c22 = getMessagesController().c2(Long.valueOf(this.f43550e1))) != null) {
            int i11 = 0;
            if (org.telegram.messenger.p10.o(c22) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.y0 y0Var = this.X0;
            if (z10) {
                i7 = 2131231910;
            } else {
                i7 = 2131231911;
            }
            y0Var.setIcon(i7);
            org.telegram.ui.ActionBar.y0 y0Var2 = this.X0;
            if (z10) {
                i10 = 2131746424;
            } else {
                i10 = 2131746423;
            }
            y0Var2.setText(org.telegram.messenger.hd.N0(i10, null));
            org.telegram.ui.ActionBar.y0 y0Var3 = this.W0;
            if (org.telegram.messenger.p10.o(c22) == null) {
                i11 = 8;
            }
            y0Var3.setVisibility(i11);
        }
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        if (this.O != null && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f24004m;
            } else {
                i7 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int[] iArr = org.telegram.ui.Components.jt0.f36559t2;
            int z10 = org.telegram.messenger.f3.z(6.666f, ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
            int c10 = ri.a.c(i7) + currentActionBarHeight + z10;
            this.f43525a6 = c10;
            this.O.n1(z10, c10, ri.a.c(this.P6), this.P6 + this.N6);
            this.f43533b6 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
            C5();
            P3();
        }
    }

    public final void H4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.F2.f28398id, getUserConfig().f(), 0, null, this, true, new b80(this, z10, zArr, 7), new a3.g(this, zArr, z10, this.parentLayout.getLastFragment(), 8), null);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.L4, new Object[0]);
    }

    public final void H5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                K5(false);
            }
            N5();
        } else if (!z11 && this.f43518a.isInLayout()) {
            ru0 ru0Var = this.f43518a;
            if (!ru0Var.H) {
                return;
            }
            ru0Var.post(new org.telegram.ui.Components.rp0(12, this, z10));
        } else {
            yv0 yv0Var = new yv0(this);
            yv0Var.f54264b = this.O2;
            yv0Var.f(yv0Var.f54265c);
            yv0Var.f54266e.clear();
            yv0Var.f54267f.clear();
            yv0Var.f54266e.addAll(this.U4);
            yv0Var.f54267f.addAll(this.V4);
            yv0Var.f54268g = this.f43685x4;
            yv0Var.h = this.f43693y4;
            if (z10) {
                K5(false);
            }
            W4();
            N5();
            yv0Var.f(yv0Var.d);
            try {
                v4.o.c(yv0Var, true).c(this.d);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.d.f();
            }
            int i7 = this.f43644r6;
            if (i7 >= 0) {
                this.f43534c.h1(i7, this.f43651s6 - this.f43518a.getPaddingTop());
            }
            org.telegram.messenger.g0.Z3(this.f43518a);
        }
    }

    @Override
    public final void I(float f10) {
        org.telegram.ui.Cells.c4 c4Var = this.f43571h0;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(f10);
        this.f43617o0.O(this.L2, f10);
    }

    public final int I3(int i7, Boolean bool) {
        int i10;
        if (this.f43616n6 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, this.A0);
            int f10 = i0.a.f(0.5f, this.f43616n6.m(org.telegram.ui.ActionBar.m6.I.q()), this.f43616n6.n(org.telegram.ui.ActionBar.m6.I.q()));
            if (!org.telegram.ui.ActionBar.m6.e1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.m6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.m6.r1(0.7f, f10));
                }
                return f10;
            }
            boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i10 = org.telegram.ui.ActionBar.m6.r1(0.7f, f10);
            } else {
                i10 = f10;
            }
            return org.telegram.ui.ActionBar.m6.D(q10, w02, f10, i7, i10);
        }
        return i7;
    }

    public final void I4(View view, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        long j3;
        long j10 = this.f43579i1;
        if (j10 == 0) {
            j10 = this.f43550e1;
            if (j10 == 0) {
                j10 = -this.f43558f1;
            }
        }
        long j11 = j10;
        boolean u22 = getMessagesController().u2(j11, this.f43565g1, null);
        if (z10 && (this.f43631q1 || u22)) {
            boolean z11 = !u22;
            getNotificationsController().G(j11, this.f43565g1, z11);
            org.telegram.ui.Components.lc.A(this, z11, null).j();
            y5();
            this.f43519a0.setNotifications(u22);
        } else if ((!z10 && org.telegram.messenger.hd.f24408a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24408a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z12 = j5Var.f30877e.h;
            boolean z13 = !z12;
            boolean D = getNotificationsController().D(j11, null, false, false);
            String v = org.telegram.messenger.ys.v(j11, this.f43565g1, false);
            if (!z12) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.currentAccount).f25821g7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f43565g1 == 0) {
                    getMessagesStorage().E1(j11, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j11);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.u1(this.currentAccount).f25821g7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j3 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j3 = 1;
                }
                getNotificationsController().N(j11);
                if (this.f43565g1 == 0) {
                    getMessagesStorage().E1(j11, j3);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().R.f(j11);
                    if (dialog2 != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog2.notify_settings = tL_peerNotifySettings;
                        if (D) {
                            tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                        }
                    }
                }
                edit2.apply();
            }
            y5();
            getNotificationsController().c0(j11, this.f43565g1, true);
            j5Var.setChecked(z13);
            org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.f43518a.L(this.O3, false);
            J5(true);
        } else {
            org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(getParentActivity(), this.currentAccount, null, true, new a8.va(this, j11, 7), this.A0);
            roVar.e(j11, this.f43565g1, this.f43615n5);
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z10) {
                f13 += this.f43519a0.getHeight() - org.telegram.messenger.g0.L(12.0f);
            }
            roVar.d(this, view, f12, f13, z10);
        }
    }

    public final void I5() {
        int i7;
        if (this.f43535c0 != null && this.f43637r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f24004m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.Y != null) {
                this.f43535c0.setAlpha(this.T1);
                this.f43535c0.f(org.telegram.messenger.g0.L(74.0f) + this.f43518a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
                return;
            }
            if (z10) {
                this.f43535c0.setAlpha(this.T1);
            }
            float f10 = i10;
            float L = this.Q1 + f10 + org.telegram.messenger.g0.L(74.0f);
            float min = Math.min(e4(), L - f10);
            this.f43535c0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
        }
    }

    @Override
    public final void J() {
        X4(false);
    }

    public final void J3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && this.f43556f != null && this.f43543d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.f43623p0 != null) {
            Float valueOf = Float.valueOf(this.W5);
            gv0 gv0Var = this.Y5;
            gv0Var.getClass();
            gv0Var.a(kVar, valueOf);
            if (this.W5 <= 0.0f && this.f43599l2 > 0.0f) {
                pk pkVar = this.f43556f;
                int i7 = -1;
                if (this.f43616n6 != null) {
                    f10 = -1;
                } else {
                    f10 = i0.a.f(this.f43599l2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29522mi, this.A0), -1);
                }
                pkVar.setTextColor(f10);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f43616n6 == null) {
                    i7 = i0.a.f(this.f43599l2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, this.A0), -1);
                }
                kVar2.G(i7, false);
            }
        }
    }

    public final void J4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f43550e1 != 0) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f43550e1));
                if (c22 != null) {
                    if (this.G2 != null && (userFull = this.f43675w2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().X2 + "/%s", this.f43675w2.about, org.telegram.messenger.p10.o(c22));
                    } else {
                        str = String.format("https://" + getMessagesController().X2 + "/%s", org.telegram.messenger.p10.o(c22));
                    }
                } else {
                    return;
                }
            } else if (this.f43558f1 != 0) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f43558f1));
                if (O0 != null) {
                    TLRPC.ChatFull chatFull = this.f43667v2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().X2 + "/%s", this.f43667v2.about, org.telegram.messenger.v3.K(O0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().X2 + "/%s", org.telegram.messenger.v3.K(O0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131752970, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void J5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.J5(boolean):void");
    }

    public final void K3() {
        int i7;
        int i10;
        if (this.f43563f6 != null) {
            ValueAnimator valueAnimator = this.f43593k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f43593k2.cancel();
            }
            float l10 = Utilities.l(this.Q1 / this.F1);
            if (l10 > 0.0f) {
                float f10 = (l10 - 0.5f) / 0.5f;
                int i11 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f24004m;
                } else {
                    i7 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7) - org.telegram.messenger.g0.L(21.0f));
                this.f43537c2 = org.telegram.messenger.g0.T1(0.42f, this.f43563f6[0], l10);
                this.f43521a2 = org.telegram.messenger.g0.T1(this.f43597k6, this.f43563f6[1], l10);
                this.f43529b2 = org.telegram.messenger.g0.T1(translationY, this.f43563f6[2], l10);
                this.d2 = org.telegram.messenger.g0.T1(this.f43563f6[11], 0.0f, l10);
                this.Y.setScaleX(this.f43537c2);
                this.Y.setScaleY(this.f43537c2);
                this.Y.setTranslationX(this.f43521a2);
                this.Y.setTranslationY(this.f43529b2);
                org.telegram.ui.Components.xu0 xu0Var = this.T;
                if (xu0Var != null) {
                    xu0Var.setAlpha(l10);
                }
                this.f43557f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                dv0 dv0Var = this.f43665v0;
                if (dv0Var != null) {
                    dv0Var.invalidate();
                }
                di.t0 t0Var = this.f43673w0;
                if (t0Var != null) {
                    t0Var.f9766e = org.telegram.messenger.g0.T1(0.0f, this.f43563f6[4], f10);
                    this.f43673w0.f9767f = org.telegram.messenger.g0.T1(0.0f, this.f43563f6[5], l10);
                    di.t0 t0Var2 = this.f43673w0;
                    t0Var2.h = true;
                    t0Var2.invalidate();
                }
                xw0 xw0Var = this.F6;
                if (xw0Var != null) {
                    xw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.f43563f6[6], l10));
                }
                float L = (((this.f43537c2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                this.f43578i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                this.f43578i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                this.f43585j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f43585j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                this.f43591k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f43591k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                this.f43598l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f43598l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                float T1 = org.telegram.messenger.g0.T1(p4(0), this.f43563f6[7], l10);
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f24004m;
                } else {
                    i10 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (org.telegram.messenger.g0.f24009p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
                float N = org.telegram.messenger.g0.N(22.7f) + floor;
                this.f43559f2 = org.telegram.messenger.g0.T1(floor, this.f43563f6[8], l10);
                this.f43573h2 = org.telegram.messenger.g0.T1(N, this.f43563f6[9], l10);
                float L2 = (this.f43597k6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                float T12 = org.telegram.messenger.g0.T1(q4(L2, 0, this.f43556f), this.f43563f6[12], l10);
                float T13 = org.telegram.messenger.g0.T1(q4(L2 + this.f43663u5, 1, this.f43637r) - this.f43663u5, this.f43563f6[13], l10);
                this.f43556f.setTranslationX(T12);
                this.f43556f.setTranslationY(this.f43559f2);
                this.f43637r.setTranslationX(this.f43663u5 + T13);
                this.f43637r.setTranslationY(this.f43573h2);
                this.f43551e2 = T12;
                this.f43566g2 = T13;
                this.f43556f.setScaleX(T1);
                this.f43556f.setScaleY(T1);
                float T14 = org.telegram.messenger.g0.T1(p4(1), 1.0f, l10);
                this.f43637r.setScaleX(T14);
                this.f43637r.setScaleY(T14);
                t5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.g0.f24004m;
                }
                z5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11);
                C4((int) this.f43563f6[10], l10, true);
                org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
                if (tf0Var != null) {
                    tf0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.f43563f6[3], f10));
                }
            }
        }
    }

    public final void K4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f43558f1);
            bundle.putLong("user_id", this.f43550e1);
            presentFragment(new ci.j0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.V2) {
            if (this.f43550e1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.p10.c(this.f43675w2)) {
                org.telegram.messenger.o10.u(org.telegram.messenger.hd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(this.f43550e1)), org.telegram.ui.Components.lc.b0(this), 2131624012, 36);
            } else {
                showDialog(new bi.p3(getParentActivity(), this.currentAccount, this.f43550e1, null, null));
            }
        }
    }

    public final void K5(boolean z10) {
        int i7;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i10 = 0;
        this.C2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.D2.clear();
        TLRPC.ChatFull chatFull = this.f43667v2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.C2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.f43667v2.participants.participants.size()) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f43667v2.participants.participants.get(i10).user_id));
            if (c22 != null && (userStatus = c22.status) != null && ((userStatus.expires > currentTime || c22.f28547id == getUserConfig().e()) && c22.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i10));
            if (c22 != null) {
                if (c22.bot) {
                    i7 = -110;
                } else if (c22.self) {
                    i7 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = c22.status;
                    if (userStatus2 != null) {
                        i7 = userStatus2.expires;
                    }
                }
                i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
            }
            i7 = Integer.MIN_VALUE;
            i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$EL.reversed(Comparator$CC.comparingInt(new se(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10 && this.d != null && this.f43685x4 > 0) {
            org.telegram.messenger.g0.Z3(this.f43518a);
        }
        if (this.O != null && this.N4 != -1) {
            if ((this.D2.size() > 5 || this.W4 == 2) && this.W4 != 1) {
                this.O.m1(this.D2, this.f43667v2);
            }
        }
    }

    public final float L3() {
        return Utilities.l((this.Q1 - e4()) / k4());
    }

    public final void L4() {
        boolean z10;
        org.telegram.ui.Components.oh0 oh0Var;
        if (this.f43550e1 != 0) {
            if (this.f43638r0 != null) {
                TLRPC.User c22 = org.telegram.messenger.np.u1(this.currentAccount).c2(Long.valueOf(org.telegram.messenger.k10.i(this.currentAccount).e()));
                if (c22 == null) {
                    c22 = org.telegram.messenger.k10.i(this.currentAccount).f();
                }
                if (c22 != null) {
                    org.telegram.ui.Components.x30 x30Var = this.f43638r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x30Var.n(z10, new n90(this, 27), new q5(this, 13), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
                    if (tf0Var != null) {
                        org.telegram.ui.Components.qf0 i7 = org.telegram.ui.Components.tf0.i(14, tf0Var.f39837a);
                        if (i7 != null && (oh0Var = i7.f38857k) != null) {
                            oh0Var.start();
                        }
                    } else {
                        this.f43645s.d();
                    }
                    org.telegram.ui.Cells.n8 n8Var = this.N2;
                    if (n8Var != null) {
                        n8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            O4();
            return;
        }
        P4();
    }

    public final void L5() {
        CharSequence charSequence;
        cv0 cv0Var = this.f43637r;
        if (cv0Var != null) {
            if ((!this.X5 || (charSequence = this.f43541c6) == null) && (!this.A6 || (charSequence = this.f43702z6) == null)) {
                charSequence = this.f43695y6;
            }
            if (cv0Var.o(charSequence, !this.G1) && this.fragmentView != null) {
                B4(false);
            }
        }
    }

    public final void M3() {
        int i7;
        int i10 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        this.f43529b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7) - org.telegram.messenger.g0.L(21.0f));
        this.f43537c2 = 1.38f;
        float f10 = 0.0f;
        this.d2 = 0.0f;
        d4();
        U4();
        C4(0, 1.0f, true);
        this.f43551e2 = (this.f43518a.getMeasuredWidth() / 2.0f) - (((this.f43556f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f43556f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f43518a.getMeasuredWidth() / 2.0f;
        int i11 = ((FrameLayout.LayoutParams) this.f43637r.getLayoutParams()).leftMargin;
        if (!this.f43670v5) {
            i10 = this.f43637r.getPaddingLeft();
        }
        this.f43566g2 = measuredWidth - ((this.f43637r.getExactWidth() * 0.5f) + (i11 + i10));
        if (!this.f43670v5) {
            f10 = this.f43637r.getPaddingLeft();
        }
        this.C6 = f10;
        if (this.J1 != 2) {
            this.f43665v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f43557f0.setAlpha(1.0f);
    }

    public final void M4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.F2.f28398id);
        z40 z40Var = new z40(k10);
        TLRPC.ChatFull chatFull = this.f43667v2;
        z40Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.f43667v2.participants.participants.size(); i7++) {
                hVar.k(null, this.f43667v2.participants.participants.get(i7).user_id);
            }
            z40Var.K = hVar;
        }
        z40Var.f54398y = new ut0(this, 0);
        presentFragment(z40Var);
    }

    public final void M5(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.M5(boolean):void");
    }

    public final void N4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.N4(boolean):void");
    }

    public final void N5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.N5():void");
    }

    public final void O3() {
        v4.e1 e1Var;
        View view;
        int top;
        int i7;
        int i10;
        float a10;
        boolean z10;
        if (this.f43518a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f43518a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f43518a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    e1Var = null;
                    if (i11 < this.f43518a.getChildCount()) {
                        if (RecyclerView.R(this.f43518a.getChildAt(i11)) == 0) {
                            view = this.f43518a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    ru0 ru0Var = this.f43518a;
                    View F = ru0Var.F(view);
                    if (F != null) {
                        e1Var = ru0Var.T(F);
                    }
                    e1Var = (org.telegram.ui.Components.mj0) e1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (e1Var != null) {
                    i7 = e1Var.b();
                } else {
                    i7 = -1;
                }
                if (top >= 0 && i7 == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                float f10 = 1.0f;
                if (view == null) {
                    a10 = 1.0f;
                } else {
                    a10 = c8.m9.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
                }
                if (this.R5 != a10) {
                    this.R5 = a10;
                    D5();
                }
                if (this.f43638r0 == null && this.actionBar.f29116o0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.N4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.f43518a.K(i12);
                    if (mj0Var != null && mj0Var.f59111a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.X5 != z10) {
                    this.X5 = z10;
                    P3();
                    AnimatorSet animatorSet = this.U5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.V5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    F5(true);
                    L5();
                    P5(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar, this.Y5, f10));
                    this.O.L0.setOpen(z10);
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f43628p5, 0.0f));
                    }
                    if (this.f43665v0 != null || this.f43673w0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new du0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    R3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.U5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.U5.setInterpolator(org.telegram.ui.Components.nr.f37917f);
                    this.U5.addListener(new ev0(this, 1));
                    this.U5.setDuration(150L);
                    this.U5.start();
                    org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25360u4, Boolean.TRUE);
                }
                float f11 = i10;
                if (this.Q1 != f11 && !this.H1) {
                    this.Q1 = f11;
                    this.f43543d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > e4()) {
                            z11 = true;
                        }
                        this.M1 = z11;
                    }
                    B4(true);
                }
            }
        }
    }

    public final void O4() {
        TLRPC.User c22;
        if (this.f43550e1 != 0 && !c4() && (c22 = getMessagesController().c2(Long.valueOf(this.f43550e1))) != null && !(c22 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f43550e1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.g0.Q1() && z10) {
                    org.telegram.messenger.ls notificationCenter = getNotificationCenter();
                    int i7 = org.telegram.messenger.ls.f25348t;
                    notificationCenter.n(this, i7);
                    getNotificationCenter().k(i7, new Object[0]);
                }
                int i10 = getArguments().getInt("nearby_distance", -1);
                if (i10 >= 0) {
                    bundle.putInt("nearby_distance", i10);
                }
                bn bnVar = new bn(bundle);
                org.telegram.messenger.si mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f26832z0;
                mediaDataController.q1();
                bnVar.Y9 = document;
                bnVar.Z9 = false;
                presentFragment(bnVar, z10);
                if (org.telegram.messenger.g0.Q1() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public final void O5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f43591k0 != null && (imageView = this.f43598l0) != null) {
            if (this.L1 && (chat = this.F2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f43598l0.setVisibility(0);
                this.f43591k0.setTag(1);
                this.f43591k0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f43598l0.setVisibility(8);
            this.f43591k0.setTag(null);
            this.f43591k0.setVisibility(8);
        }
    }

    @Override
    public final boolean P(cx cxVar) {
        return false;
    }

    public final void P3() {
        int i7;
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            if (!this.X5 && this.W5 <= 0.0f) {
                i7 = 0;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            wv0Var.setPagesVisibleOverscanTop(i7);
        }
    }

    public final void P4() {
        TLRPC.ChatFull chatFull = this.f43667v2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f43667v2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new bn(bundle));
            }
        }
    }

    public final void P5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        boolean z11;
        if ((this.f43665v0 != null || this.f43673w0 != null) && (kVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (kVar.getOccupyStatusBar()) {
                f10 = org.telegram.messenger.g0.f24004m;
            } else {
                f10 = 0.0f;
            }
            int L = org.telegram.messenger.g0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            dv0 dv0Var = this.f43665v0;
            boolean z12 = false;
            if (dv0Var != null) {
                float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(right - dv0Var.f43819g0) <= 0.1f && Math.abs(menuPillLeft - dv0Var.f43820h0) <= 0.1f && Math.abs(A - dv0Var.f43821i0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                dv0Var.f43819g0 = right;
                dv0Var.f43820h0 = menuPillLeft;
                if (z10) {
                    dv0Var.f43826n0.e(true, menuPillLeft);
                }
                dv0Var.f43821i0 = A;
                if (z11) {
                    dv0Var.invalidate();
                }
            }
            di.t0 t0Var = this.f43673w0;
            if (t0Var != null) {
                float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                int k42 = k4();
                if (Math.abs(right - t0Var.f9769r) > 0.1f || Math.abs(menuPillLeft - t0Var.f9770s) > 0.1f || Math.abs(A2 - t0Var.f9771w) > 0.1f) {
                    z12 = true;
                }
                t0Var.f9769r = right;
                t0Var.f9770s = menuPillLeft;
                if (z10) {
                    t0Var.E.e(true, menuPillLeft);
                }
                t0Var.f9771w = A2;
                t0Var.f9773y = k42 + A2;
                if (z12) {
                    t0Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        org.telegram.ui.Cells.c4 c4Var = this.f43571h0;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(0.0f);
    }

    public final void Q3() {
        float alpha;
        boolean z10;
        int i7 = this.J1;
        float f10 = 0.0f;
        boolean z11 = true;
        if (i7 == 1 && (!this.f43643r5 || this.G1)) {
            this.f43687x6 = 0.0f;
        } else if (i7 == 2 && (!this.f43643r5 || this.G1)) {
            cv0 cv0Var = this.f43637r;
            if (cv0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = cv0Var.getAlpha();
            }
            this.f43687x6 = alpha;
        } else if (this.f43550e1 == org.telegram.messenger.k10.i(this.currentAccount).f24951n) {
            this.f43687x6 = (1.0f - this.f43657t5) * this.f43599l2;
        } else {
            this.f43687x6 = this.f43599l2 * this.f43657t5;
        }
        if (this.f43550e1 == org.telegram.messenger.k10.i(this.currentAccount).f24951n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f43670v5) {
            this.f43663u5 = org.telegram.messenger.g0.L(28.0f) * this.f43687x6;
            cv0 cv0Var2 = this.f43637r;
            if (cv0Var2 != null) {
                cv0Var2.setTranslationX(m4(this.B6, this.D6));
                this.Z.invalidate();
            }
        }
        if (z10) {
            if (this.f43670v5) {
                f10 = this.f43599l2;
            }
        } else if (this.f43678w5) {
            f10 = this.f43687x6;
        }
        xw0 xw0Var = this.F6;
        if (xw0Var != null) {
            xw0Var.f53953e = 1.0f - f10;
            xw0Var.invalidateSelf();
        }
        if (f10 <= 0.5f) {
            z11 = false;
        }
        this.A6 = z11;
        L5();
    }

    public final void Q4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f43675w2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                fi.f8 f8Var = new fi.f8(3, 1);
                f8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().B1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f43675w2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                f8Var.V0 = false;
                f8Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.k10.f24932t0, tL_message, false, false));
                presentFragment(f8Var);
                return;
            }
            boolean z11 = org.telegram.messenger.s2.f26694a;
            org.telegram.messenger.t0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f43675w2.business_location.address, new Object[0]))));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void Q5() {
        try {
            uv uvVar = this.U;
            if (uvVar != null && (uvVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.A0), 100));
            }
            float f10 = this.W5;
            Drawable drawable = this.E;
            int[] iArr = this.Y6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29598qi, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.U6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.V6, this.A0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.V6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, this.A0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.W6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.A0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.nq nqVar = this.X6;
            if (nqVar != null) {
                nqVar.f37911y = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.nk, this.A0);
                if (this.f43518a != null) {
                    for (int i13 = 0; i13 < this.f43518a.getChildCount(); i13++) {
                        View childAt = this.f43518a.getChildAt(i13);
                        if (childAt != null) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void R() {
        org.telegram.ui.Components.bt0 bt0Var;
        wv0 wv0Var = this.O;
        if (wv0Var != null && (bt0Var = this.R) != null) {
            wv0Var.setNewMediaCounts(bt0Var.f33879c);
        }
        if (this.d != null) {
            H5(false, false);
        }
        W();
        if (this.f43675w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void R3() {
        boolean z10;
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            if (!this.X5 && this.f43547d6) {
                z10 = true;
            } else {
                z10 = false;
            }
            xu0Var.setVisibility(z10);
        }
    }

    public final void R4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        jv0 jv0Var = new jv0(this, user.f28547id, this.f43558f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        jv0Var.Y0 = new kv0(this, i7, chatParticipant, z10, zArr);
        presentFragment(jv0Var);
    }

    public final void R5() {
        boolean z10;
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        if (this.E2 == null && (((userFull = this.f43675w2) != null && userFull.ttl_period > 0) || (this.f43667v2 != null && org.telegram.messenger.v3.y(13, this.F2) && this.f43667v2.ttl_period > 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.X3(this.Y0, z10, 0.8f, true, this.f43643r5);
    }

    public final void S3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.S3(boolean):void");
    }

    public final void S4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().F3(str.substring(1), this, 0, gVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (g2Var instanceof bn) {
                    finishFragment();
                    ((bn) g2Var).f45903a0.C1(null, str, false, false);
                }
            }
        } else {
            cx cxVar = new cx(null);
            cxVar.f46731p2 = str;
            presentFragment(cxVar);
        }
    }

    public final void S5(boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        boolean z13;
        float f10;
        TLRPC.ChatFull chatFull;
        float f11 = 0.2f;
        int i11 = (L3() > 0.2f ? 1 : (L3() == 0.2f ? 0 : -1));
        int i12 = 0;
        if (i11 > 0 && !this.X1 && (this.f43638r0 == null || this.P2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43547d6 = z11;
        R3();
        org.telegram.ui.Components.rh0 rh0Var = this.f43645s;
        if (rh0Var != null && rh0Var.getVisibility() != 8) {
            org.telegram.ui.Components.rh0 rh0Var2 = this.f43645s;
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f24004m;
            } else {
                i10 = 0;
            }
            rh0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) + this.Q1) + this.U1) - org.telegram.messenger.g0.L(29.5f));
            if (i11 > 0 && !this.X1 && !this.f43647s1 && (this.f43638r0 == null || this.P2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f43558f1 != 0) {
                if (org.telegram.messenger.v3.T(this.F2) && !this.F2.megagroup && (chatFull = this.f43667v2) != null && chatFull.linked_chat_id != 0 && (this.E3 != -1 || this.F3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.G1) {
                if (this.f43645s.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.f43645s.setTag(null);
                    } else {
                        this.f43645s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f43672w;
                    if (animatorSet != null) {
                        this.f43672w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f43672w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f43672w.playTogether(ObjectAnimator.ofFloat(this.f43645s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f43645s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f43645s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f43672w.playTogether(ObjectAnimator.ofFloat(this.f43645s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f43645s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f43645s, View.ALPHA, 0.0f));
                        }
                        this.f43672w.setDuration(150L);
                        this.f43672w.addListener(new ev0(this, 3));
                        this.f43672w.start();
                    } else {
                        org.telegram.ui.Components.rh0 rh0Var3 = this.f43645s;
                        if (z12) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        rh0Var3.setScaleX(f10);
                        org.telegram.ui.Components.rh0 rh0Var4 = this.f43645s;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        rh0Var4.setScaleY(f11);
                        org.telegram.ui.Components.rh0 rh0Var5 = this.f43645s;
                        if (z12) {
                            f12 = 1.0f;
                        }
                        rh0Var5.setAlpha(f12);
                    }
                }
            }
        } else {
            z12 = false;
        }
        dv0 dv0Var = this.f43665v0;
        if (dv0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f24004m;
            } else {
                i7 = 0;
            }
            dv0Var.f43822j0 = measuredWidth;
            dv0Var.f43824l0 = z12;
            dv0Var.f43823k0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7;
            dv0Var.invalidate();
        }
        di.t0 t0Var = this.f43673w0;
        if (t0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = org.telegram.messenger.g0.f24004m;
            }
            t0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.Q1 + this.U1);
        }
    }

    public final void T3(Context context) {
        int i7;
        this.f43520a1 = new org.telegram.messenger.qe(context, this.T0.getPopupLayout().getSwipeBack(), new qu0(this), false, 0, this.A0);
        if (this.f43579i1 > 0 || this.f43550e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29529n6, this.A0);
            org.telegram.messenger.qe qeVar = this.f43520a1;
            org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) qeVar.f26407e;
            if (m80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131753845, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.hd.N0(2131753844, null), w02, new org.telegram.ui.Components.ng(qeVar, 10)));
                m80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f43675w2;
        if (userFull == null && this.f43667v2 == null) {
            i7 = 0;
        } else if (userFull != null) {
            i7 = userFull.ttl_period;
        } else {
            i7 = this.f43667v2.ttl_period;
        }
        org.telegram.ui.Components.l01 a10 = org.telegram.ui.Components.l01.a(i7);
        this.f43652t0 = a10;
        this.Z0 = this.T0.i(0, a10, org.telegram.messenger.hd.N0(2131753843, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43520a1.f26405b);
        this.T0.a(-1);
        r5();
    }

    public final boolean T4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.T4(float, float, int, android.view.View):boolean");
    }

    public final void T5() {
        org.telegram.ui.Components.gq0 gq0Var;
        org.telegram.ui.Components.fr0 fr0Var;
        org.telegram.ui.Components.m80 m80Var;
        int w02;
        int w03;
        int w04;
        int i7;
        int w05;
        int w06;
        int w07;
        this.f43622o6.clear();
        zw0 zw0Var = this.f43543d1;
        if (zw0Var != null) {
            zw0Var.a(this.f43616n6, true);
        }
        cv0 cv0Var = this.f43637r;
        if (cv0Var != null) {
            if (cv0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.m6.w0(((Integer) this.f43637r.getTag()).intValue(), this.A0);
            } else {
                w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.A0);
            }
            this.f43637r.setTextColor(i0.a.f(this.f43599l2, I3(w07, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        xw0 xw0Var = this.F6;
        float f10 = -0.1f;
        if (xw0Var != null) {
            xw0Var.a(i0.a.f(this.f43599l2, org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.b(0.18f, -0.1f, this.f43536c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.f43616n6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, this.A0);
            }
            kVar.G(i0.a.f(this.W5, w05, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29741y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.cp cpVar = this.f43616n6;
            if (cpVar != null) {
                w06 = 1090519039;
            } else if (cpVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29387f8, this.A0);
            }
            kVar2.F(i0.a.f(this.W5, w06, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29760z8, this.A0)), false);
        }
        if (this.f43688y != null) {
            org.telegram.messenger.cp cpVar2 = this.f43616n6;
            if (cpVar2 != null) {
                int g10 = cpVar2.g();
                if (this.f43616n6.o(org.telegram.ui.ActionBar.m6.I.q())) {
                    i7 = this.f43616n6.k();
                } else {
                    i7 = this.f43616n6.i();
                }
                int f11 = i0.a.f(0.4f, g10, i7);
                if (!org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.m6.b(0.1f, f10, f11);
            } else {
                w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29598qi, this.A0);
            }
            this.f43688y.setColorFilter(org.telegram.messenger.g0.S0(this.W5, 1.0f, w04, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            if (this.f43616n6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29618ri, this.A0);
            }
            this.I.setColorFilter(org.telegram.messenger.g0.S0(this.W5, 1.0f, w03, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        pk pkVar = this.f43556f;
        if (pkVar != null) {
            if (this.f43616n6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29522mi, this.A0);
            }
            pkVar.setTextColor(i0.a.f(this.f43599l2, i0.a.f(this.W5, w02, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0)), -1));
        }
        org.telegram.messenger.qe qeVar = this.f43520a1;
        if (qeVar != null && (m80Var = (org.telegram.ui.Components.m80) qeVar.f26407e) != null) {
            m80Var.invalidate();
        }
        Drawable drawable = this.f43680x;
        if (drawable != null) {
            if (this.f43616n6 == null) {
                i10 = i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29409gd, this.A0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.og0 og0Var = this.f43535c0;
        if (og0Var != null) {
            og0Var.setColor(this.f43616n6);
        }
        org.telegram.messenger.g0.d0(this.f43518a, new hu0(this, 3));
        wv0 wv0Var = this.O;
        if (wv0Var != null && (fr0Var = wv0Var.L0) != null) {
            fr0Var.updateColors();
        }
        wv0 wv0Var2 = this.O;
        if (wv0Var2 != null && (gq0Var = wv0Var2.f36568b0) != null) {
            gq0Var.m();
        }
        U5();
        v5();
        dv0 dv0Var = this.f43665v0;
        if (dv0Var != null) {
            dv0Var.f(true, true);
        }
        di.t0 t0Var = this.f43673w0;
        if (t0Var != null) {
            t0Var.a();
        }
    }

    public final void U3() {
        if (this.fragmentView != null && this.f43664u6 && this.f43698z2 != null && getParentActivity() != null) {
            dx0 dx0Var = this.G6;
            if (dx0Var != null) {
                dx0Var.b(this.f43698z2);
                this.G6.invalidate();
                return;
            }
            dx0 dx0Var2 = new dx0(this, this.f43698z2);
            this.G6 = dx0Var2;
            ((FrameLayout) this.fragmentView).addView(dx0Var2, c8.na.e(-1, -1, 55));
        }
    }

    public final void U4() {
        int i7;
        ValueAnimator valueAnimator;
        if (this.f43632q2 && (valueAnimator = this.f43593k2) != null && valueAnimator.isRunning()) {
            this.f43559f2 = this.f43570g6;
            this.f43573h2 = this.f43577h6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        V4(L3(), currentActionBarHeight + i7);
    }

    public final void U5() {
        if (this.f43645s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29559oi, this.A0);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29579pi, this.A0);
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29540ni, this.A0);
                if (this.f43616n6 != null && org.telegram.ui.ActionBar.m6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.m6.b(0.05f, -0.04f, this.f43616n6.c(false));
                    org.telegram.messenger.cp cpVar = this.f43616n6;
                    if (cpVar != null) {
                        int d = cpVar.d(org.telegram.ui.ActionBar.m6.I.q());
                        w03 = org.telegram.ui.ActionBar.m6.D(org.telegram.ui.ActionBar.m6.I.q(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, this.A0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.rh0 rh0Var = this.f43671v6;
                org.telegram.ui.Components.rh0 rh0Var2 = this.f43645s;
                int[] iArr = this.f43679w6;
                if (rh0Var != rh0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f43671v6 = rh0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231198).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(mutate, org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    oqVar.f38303e = L;
                    oqVar.f38304f = L2;
                    this.f43645s.setBackground(oqVar);
                    this.f43645s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            org.telegram.messenger.g0.E2(z4Var);
        }
        nv0 nv0Var = new nv0(this, context, this.A0);
        this.simpleActionBar = nv0Var;
        nv0Var.setTitlesAlpha(0.0f);
        if (!this.f43643r5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new qe(3, this));
        if (this.J0) {
            this.simpleActionBar.setBackButtonImage(2131232487);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.N0(2131746304, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231240);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new is0(this, 5));
        if (!this.J0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new fi.z1(6, this, backButton));
        }
    }

    public final void V4(float f10, float f11) {
        float T1;
        int i7;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - j4()) / ((this.f43518a.getMeasuredWidth() - f11) - k4())));
        if (this.Q1 < j4() && max < 0.33f) {
            T1 = com.google.android.gms.internal.vision.e2.y(f10, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * T1)) * f10) + ((float) Math.floor(translationY + (org.telegram.messenger.o10.b(f10, 1.0f, currentActionBarHeight, i7) - (org.telegram.messenger.g0.f24009p * 21.0f))));
        this.f43559f2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.f43573h2 = (((float) Math.floor(org.telegram.messenger.g0.f24009p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final void W() {
        int i7;
        String str;
        int size;
        int i10;
        wv0 wv0Var = this.O;
        if (wv0Var != null && this.f43637r != null) {
            int closestTab = wv0Var.getClosestTab();
            int[] iArr = this.R.f33879c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        i5(org.telegram.messenger.hd.N0(2131745213, null));
                    } else {
                        i5(org.telegram.messenger.hd.G(i12, "Media", new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        i5(org.telegram.messenger.hd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    i5(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                } else {
                    i5(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    i5(org.telegram.messenger.hd.N0(2131750814, null));
                } else {
                    i5(org.telegram.messenger.hd.G(i13, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    i5(org.telegram.messenger.hd.N0(2131743280, null));
                } else {
                    i5(org.telegram.messenger.hd.G(i14, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    i5(org.telegram.messenger.hd.N0(2131745215, null));
                } else {
                    i5(org.telegram.messenger.hd.G(i15, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    i5(org.telegram.messenger.hd.N0(2131748126, null));
                } else {
                    i5(org.telegram.messenger.hd.G(i16, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    i5(org.telegram.messenger.hd.N0(2131754879, null));
                } else {
                    i5(org.telegram.messenger.hd.G(i17, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                i5(org.telegram.messenger.hd.G(this.f43675w2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                i5(this.f43637r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.jt0.J0(closestTab)) {
                if (closestTab == 13) {
                    i5(this.O.f0(true));
                } else if (closestTab == 9) {
                    i5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.oo N0 = org.telegram.messenger.np.u1(this.currentAccount).N0(a());
                    if (this.f43648s2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (N0 == null) {
                        size = 0;
                    } else {
                        size = N0.f26116b.size() + N0.f26117c;
                    }
                    i5(org.telegram.messenger.hd.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.qv I1 = getMessagesController().I1();
                    long a10 = a();
                    ArrayList arrayList = I1.f26473j;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList.get(i18);
                            if (pvVar.f26314a == a10) {
                                i7 = pvVar.f26317e;
                                break;
                            }
                            i18++;
                        } else {
                            i7 = 0;
                            break;
                        }
                    }
                    i5(org.telegram.messenger.hd.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.gq0 gq0Var = this.O.f36568b0;
                    if (gq0Var != null) {
                        i11 = gq0Var.getGiftsCount();
                    }
                    i5(org.telegram.messenger.hd.H(',', "ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i19 = iArr[8];
                    if (i19 <= 0) {
                        i5(org.telegram.messenger.hd.N0(2131745207, null));
                    } else {
                        i5(org.telegram.messenger.hd.H(',', "ProfilePollsCount", i19));
                    }
                }
            } else if (this.f43648s2) {
                i5(this.O.f0(false));
            } else if (this.O.m0(closestTab) > 0) {
                i5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                i5(org.telegram.messenger.hd.N0(2131746429, null));
            }
        }
    }

    public final void W4() {
        ru0 ru0Var = this.f43518a;
        if (ru0Var != null && this.f43534c != null && ru0Var.getChildCount() > 0 && !this.t6) {
            View view = null;
            int i7 = Integer.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f43518a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.f43518a.getChildAt(i11));
                View childAt = this.f43518a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f43644r6 = i10;
                int top = view.getTop();
                this.f43651s6 = top;
                if (this.f43644r6 == 0 && !this.f43625p2 && top > j4()) {
                    this.f43651s6 = j4();
                }
                this.f43534c.h1(i10, view.getTop() - this.f43518a.getPaddingTop());
            }
        }
    }

    public final void X3(float f10) {
        boolean z10;
        ValueAnimator ofFloat;
        long j3;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f43636q6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f43636q6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f43689y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new du0(this, 0));
        this.f43636q6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f43636q6;
        if (z10) {
            j3 = 150;
        } else {
            j3 = 220;
        }
        animatorSet2.setDuration(j3);
        if (!z10) {
            this.f43636q6.addListener(new ev0(this, 6));
        }
        this.f43636q6.start();
    }

    public final void X4(boolean z10) {
        int i7 = this.N4;
        if (i7 >= 0) {
            if (z10) {
                pi.l lVar = new pi.l(getParentActivity(), 2, 0.6f);
                lVar.f59055a = this.N4;
                lVar.f55709p = -this.f43518a.getPaddingTop();
                this.f43534c.w0(lVar);
                return;
            }
            this.f43534c.h1(i7, -this.f43518a.getPaddingTop());
        }
    }

    @Override
    public final boolean Y() {
        return this.A1;
    }

    public final void Y3(int i7, View view) {
        boolean z10;
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
        I.X(this.f43518a.U0(view, false));
        I.f33368w = false;
        if (this.f43675w2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        I.l(2131232105, org.telegram.messenger.hd.N0(2131751755, null), new n90(this, 4), z10);
        I.c(2131232118, org.telegram.messenger.hd.N0(2131751323, null), new n90(this, 5), false);
        I.c(2131232110, org.telegram.messenger.hd.N0(2131746125, null), new zn0(this, i7, 1), true);
        I.a0();
    }

    public final boolean Z3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f43647s1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f43675w2;
            if (userFull == null) {
                userFull = getMessagesController().d2(f10.f28547id);
            }
            if (userFull != null) {
                String N0 = org.telegram.messenger.hd.N0(2131751755, null);
                String N02 = org.telegram.messenger.hd.N0(2131743953, null);
                if (i7 != this.L3 && i7 != this.K3 && i7 != this.X2) {
                    if (i7 == this.P3) {
                        str = kg.f1.k0(this.currentAccount, f10, userFull.business_work_hours);
                        N0 = org.telegram.messenger.hd.N0(2131746469, null);
                        N02 = org.telegram.messenger.hd.N0(2131752749, null);
                    } else if (i7 == this.Q3) {
                        str = userFull.business_location.address;
                        N0 = org.telegram.messenger.hd.N0(2131746464, null);
                        N02 = org.telegram.messenger.hd.N0(2131752681, null);
                    } else if (i7 == this.M3) {
                        str = org.telegram.messenger.p10.o(f10);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        N0 = org.telegram.messenger.hd.N0(2131746482, null);
                        N02 = org.telegram.messenger.hd.N0(2131743422, null);
                    } else if (i7 == this.H3) {
                        str = f10.phone;
                        N02 = org.telegram.messenger.hd.N0(2131747101, null);
                    } else if (i7 == this.V2) {
                        str = UserInfoActivity.e0(this.f43675w2.birthday);
                        N02 = org.telegram.messenger.hd.N0(2131753713, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i7 == this.X2) {
                        N02 = org.telegram.messenger.hd.N0(2131753718, null);
                    }
                }
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
                I.X(this.f43518a.U0(view, false));
                I.f33368w = false;
                I.f33344i = 3;
                if (i7 == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.c(2131232422, org.telegram.messenger.hd.N0(2131746460, null), new n90(this, 7), false);
                    }
                    I.c(2131232215, org.telegram.messenger.hd.N0(2131746462, null), new n90(this, 9), false);
                }
                if (str != null) {
                    I.c(2131232105, N0, new mc0(this, str, N02, 25), false);
                }
                if (i7 == this.P3) {
                    I.c(2131232118, org.telegram.messenger.hd.N0(2131746468, null), new n90(this, 10), false);
                    I.c(2131232110, org.telegram.messenger.hd.N0(2131746467, null), new Runnable(this) {
                        public final ProfileActivity f46304b;

                        {
                            this.f46304b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f46304b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131752750, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131752751, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131752682, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131752683, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.Q3) {
                    I.c(2131232118, org.telegram.messenger.hd.N0(2131746463, null), new n90(this, 11), false);
                    I.c(2131232110, org.telegram.messenger.hd.N0(2131746461, null), new Runnable(this) {
                        public final ProfileActivity f46304b;

                        {
                            this.f46304b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f46304b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131752750, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131752751, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131752682, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131752683, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.M3) {
                    I.c(2131232118, org.telegram.messenger.hd.N0(2131746424, null), new n90(this, 12), false);
                } else if (i7 != this.L3 && i7 != this.K3 && i7 != this.X2) {
                    if (i7 == this.H3) {
                        I.c(2131231895, org.telegram.messenger.hd.N0(2131746450, null), new n90(this, 14), false);
                    } else if (i7 == this.V2) {
                        I.c(2131232118, org.telegram.messenger.hd.N0(2131746529, null), new Runnable(this) {
                            public final ProfileActivity f54597b;

                            {
                                this.f54597b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f54597b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.Z6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), userFull2.birthday, new org.telegram.ui.Components.rh(24, profileActivity, userFull2), new n90(profileActivity, 15), false, false, profileActivity.A0).f15680b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String N03 = org.telegram.messenger.hd.N0(2131753714, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                        t1Var.S = N03;
                                        t1Var.U = org.telegram.messenger.hd.N0(2131753715, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().o2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        profileActivity.showDialog(t1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String N04 = org.telegram.messenger.hd.N0(2131746486, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                                        t1Var2.S = N04;
                                        t1Var2.U = org.telegram.messenger.hd.N0(2131746487, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().o2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        return;
                                }
                            }
                        }, false);
                        I.c(2131232110, org.telegram.messenger.hd.N0(2131746125, null), new Runnable(this) {
                            public final ProfileActivity f54597b;

                            {
                                this.f54597b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f54597b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.Z6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), userFull2.birthday, new org.telegram.ui.Components.rh(24, profileActivity, userFull2), new n90(profileActivity, 15), false, false, profileActivity.A0).f15680b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String N03 = org.telegram.messenger.hd.N0(2131753714, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                        t1Var.S = N03;
                                        t1Var.U = org.telegram.messenger.hd.N0(2131753715, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().o2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        profileActivity.showDialog(t1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String N04 = org.telegram.messenger.hd.N0(2131746486, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                                        t1Var2.S = N04;
                                        t1Var2.U = org.telegram.messenger.hd.N0(2131746487, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().o2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == this.R2) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(userFull.personal_channel_id));
                        if (O0 != null && org.telegram.messenger.v3.K(O0, false) != null) {
                            I.c(2131232105, org.telegram.messenger.hd.N0(2131746485, null), new ur0(8, this, O0), false);
                        }
                        I.c(2131232118, org.telegram.messenger.hd.N0(2131746488, null), new n90(this, 8), false);
                        I.c(2131232110, org.telegram.messenger.hd.N0(2131746125, null), new Runnable(this) {
                            public final ProfileActivity f54597b;

                            {
                                this.f54597b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f54597b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.Z6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), userFull2.birthday, new org.telegram.ui.Components.rh(24, profileActivity, userFull2), new n90(profileActivity, 15), false, false, profileActivity.A0).f15680b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String N03 = org.telegram.messenger.hd.N0(2131753714, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                        t1Var.S = N03;
                                        t1Var.U = org.telegram.messenger.hd.N0(2131753715, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().o2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        profileActivity.showDialog(t1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String N04 = org.telegram.messenger.hd.N0(2131746486, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                                        t1Var2.S = N04;
                                        t1Var2.U = org.telegram.messenger.hd.N0(2131746487, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().o2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.H5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    I.c(2131232118, org.telegram.messenger.hd.N0(2131746481, null), new n90(this, 13), false);
                }
                if (I.y() > 0) {
                    I.a0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Z4() {
        org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
        if (tf0Var != null) {
            if (this.f43647s1) {
                tf0Var.F = 6;
            } else if (this.f43631q1) {
                tf0Var.F = 5;
            } else if (this.f43648s2) {
                tf0Var.F = 2;
            } else if (this.f43550e1 != 0) {
                tf0Var.F = 0;
            } else if (this.f43558f1 != 0) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f43558f1));
                if (org.telegram.messenger.v3.T(O0)) {
                    if (org.telegram.messenger.v3.n0(O0)) {
                        this.f43519a0.F = 3;
                        return;
                    } else if (org.telegram.messenger.v3.c0(O0)) {
                        this.f43519a0.F = 4;
                        return;
                    } else {
                        this.f43519a0.F = 1;
                        return;
                    }
                }
                this.f43519a0.F = 3;
            }
        }
    }

    public final long a() {
        long j3 = this.f43579i1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.f43550e1;
        if (j10 != 0) {
            return j10;
        }
        return -this.f43558f1;
    }

    public final boolean a4() {
        v4.e1 e1Var;
        View view;
        if ((this.J0 || (!org.telegram.messenger.g0.Q1() && !this.f43619o2)) && this.f43557f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.G0 = true;
            this.f43625p2 = true;
            int i7 = 0;
            while (true) {
                e1Var = null;
                if (i7 < this.f43518a.getChildCount()) {
                    if (RecyclerView.R(this.f43518a.getChildAt(i7)) == 0) {
                        view = this.f43518a.getChildAt(i7);
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                ru0 ru0Var = this.f43518a;
                View F = ru0Var.F(view);
                if (F != null) {
                    e1Var = ru0Var.T(F);
                }
                if (e1Var != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(e1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f43518a.w0(0, -(((this.f43518a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.nr.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a5(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.a5(float):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29512m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29758z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29367e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29386f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29505li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29422h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29636si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29522mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29409gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29387f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.F2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f43667v2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i7 = 0; i7 < this.f43667v2.participants.participants.size(); i7++) {
                    TLRPC.ChatParticipant chatParticipant = this.f43667v2.participants.participants.get(i7);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.r4 r4Var;
        if (this.J1 != 0 && (r4Var = this.parentLayout) != null && r4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof bn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void c5(float f10) {
        this.P5 = f10;
        org.telegram.ui.Components.xf0 xf0Var = this.O5;
        if (xf0Var != null) {
            xf0Var.b(f10);
        }
        E5();
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.O.K0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.f43616n6 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.k");
    }

    @Override
    public final android.view.View createView(android.content.Context r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final void d4() {
        if (this.f43518a == null) {
            return;
        }
        float z10 = org.telegram.ui.Cells.c0.z(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.f43537c2, 0.5f, this.f43518a.getMeasuredWidth() / 2.0f);
        this.f43521a2 = z10;
        if (this.G1) {
            this.f43521a2 = org.telegram.messenger.g0.T1(this.f43597k6, z10, this.T1);
        }
        this.Y.setTranslationX(this.f43521a2);
    }

    public final void d5(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f43667v2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f43604m1 == 0) {
                this.f43604m1 = -j3;
                getMediaDataController().g0(this.f43604m1, this.classGuid, this.f43565g1);
            }
        }
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            wv0Var.setChatInfo(this.f43667v2);
        }
        bv0 bv0Var = this.f43617o0;
        if (bv0Var != null && !this.f43631q1) {
            bv0Var.setChatInfo(this.f43667v2);
        }
        dv0 dv0Var = this.f43665v0;
        if (dv0Var != null && (chatFull3 = this.f43667v2) != null) {
            dv0Var.setStories(chatFull3.stories);
        }
        di.t0 t0Var = this.f43673w0;
        if (t0Var != null) {
            t0Var.a();
        }
        av0 av0Var = this.f43557f0;
        if (av0Var != null) {
            av0Var.setHasStories(A4());
        }
        b4();
        if (this.f43558f1 != 0) {
            boolean z11 = org.telegram.messenger.s2.f26694a;
            if (!getMessagesController().f25854k7 && (chatFull2 = this.f43667v2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.R(38, z10);
            org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
            if (tf0Var != null) {
                tf0Var.o(3, z10);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        lw0 lw0Var;
        boolean z10;
        org.telegram.ui.ActionBar.r4 r4Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User c22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        ru0 ru0Var;
        ru0 ru0Var2;
        org.telegram.ui.Components.mj0 mj0Var;
        if (i7 != org.telegram.messenger.ls.E5 && i7 != org.telegram.messenger.ls.f25339r3) {
            boolean z12 = true;
            int i11 = 0;
            r3 = false;
            boolean z13 = false;
            if (i7 == org.telegram.messenger.ls.f25335r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.np.I8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f43550e1 != 0) {
                    if (objArr3 != null) {
                        M5(true);
                    }
                    if ((intValue & 1024) != 0 && (ru0Var2 = this.f43518a) != null && (mj0Var = (org.telegram.ui.Components.mj0) ru0Var2.L(this.H3, false)) != null) {
                        this.d.t(mj0Var, this.H3);
                    }
                } else if (this.f43558f1 != 0) {
                    int i13 = intValue & 8192;
                    if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i13 != 0) {
                            H5(true, false);
                        } else {
                            K5(true);
                        }
                        M5(true);
                    }
                    if (objArr3 != null && (ru0Var = this.f43518a) != null) {
                        int childCount = ru0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = this.f43518a.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.ra) {
                                ((org.telegram.ui.Cells.ra) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ls.f25275g1) {
                Long l10 = (Long) objArr[0];
                if (this.f43667v2 != null && (chat = this.F2) != null && chat.f28398id == l10.longValue()) {
                    this.f43667v2.online_count = ((Integer) objArr[1]).intValue();
                    K5(true);
                    M5(false);
                }
            } else if (i7 != org.telegram.messenger.ls.O && i7 != org.telegram.messenger.ls.f25246b1) {
                if (i7 == org.telegram.messenger.ls.f25238a0) {
                    if (this.f43586j1) {
                        org.telegram.messenger.g0.g3(new ur0(6, this, objArr));
                    }
                } else if (i7 == org.telegram.messenger.ls.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.E2;
                    if (encryptedChat2 != null && encryptedChat.f28406id == encryptedChat2.f28406id) {
                        this.E2 = encryptedChat;
                        H5(false, false);
                        org.telegram.messenger.n6 n6Var = this.Y1;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.f25274g0) {
                    boolean z14 = this.f43592k1;
                    if (getMessagesController().H0.indexOfKey(this.f43550e1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f43592k1 = z11;
                    if (z14 != z11) {
                        S3(true);
                        H5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.ls.f25371w2) {
                    Long l11 = (Long) objArr[0];
                    if (this.F2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.F2;
                        if (longValue == chat2.f28398id && org.telegram.messenger.v3.w(14, chat2)) {
                            TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(this.currentAccount).P0(l11.longValue());
                            if (P0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f43667v2;
                                if (chatFull4 != null) {
                                    P0.participants = chatFull4.participants;
                                }
                                this.f43667v2 = P0;
                            }
                            wv0 wv0Var = this.O;
                            if (wv0Var != null) {
                                wv0Var.setChatInfo(this.f43667v2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f43667v2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f43624p1) || (inputGroupCall != null && this.f43624p1))) {
                                S3(false);
                            }
                            dv0 dv0Var = this.f43665v0;
                            if (dv0Var != null && (chatFull3 = this.f43667v2) != null) {
                                dv0Var.setStories(chatFull3.stories);
                            }
                            di.t0 t0Var = this.f43673w0;
                            if (t0Var != null) {
                                t0Var.a();
                            }
                            av0 av0Var = this.f43557f0;
                            if (av0Var != null) {
                                av0Var.setHasStories(A4());
                            }
                            if (l11.longValue() != 0) {
                                boolean z15 = org.telegram.messenger.s2.f26694a;
                                z12 = (getMessagesController().f25854k7 || (chatFull2 = this.f43667v2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.R(38, z12);
                                org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
                                if (tf0Var != null) {
                                    tf0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f43550e1 != 0 && (c22 = getMessagesController().c2(Long.valueOf(this.f43550e1))) != null && chatFull6.f28399id == c22.linked_community_id) {
                        H5(true, false);
                    }
                    TLRPC.Chat chat3 = this.F2;
                    if (chat3 != null && chatFull6.f28399id == chat3.linked_community_id) {
                        H5(true, false);
                    }
                    if (chatFull6.f28399id == this.f43558f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f43667v2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f43667v2 = chatFull6;
                        if (this.f43604m1 == 0) {
                            long j3 = chatFull6.migrated_from_chat_id;
                            if (j3 != 0) {
                                this.f43604m1 = -j3;
                                getMediaDataController().f0(0, this.classGuid, this.f43604m1, this.f43565g1, true);
                            }
                        }
                        b4();
                        bv0 bv0Var = this.f43617o0;
                        if (bv0Var != null && !this.f43631q1) {
                            bv0Var.setChatInfo(this.f43667v2);
                        }
                        H5(true, false);
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f43558f1));
                        if (O0 != null) {
                            this.F2 = O0;
                            S3(true);
                        }
                        org.telegram.messenger.n6 n6Var2 = this.Y1;
                        if (n6Var2 != null) {
                            n6Var2.g();
                        }
                        if (this.F2.megagroup && (objArr2 != null || !booleanValue)) {
                            h4(true);
                        }
                        r5();
                        R5();
                        dv0 dv0Var2 = this.f43665v0;
                        if (dv0Var2 != null && (chatFull = this.f43667v2) != null) {
                            dv0Var2.setStories(chatFull.stories);
                        }
                        di.t0 t0Var2 = this.f43673w0;
                        if (t0Var2 != null) {
                            t0Var2.a();
                        }
                        av0 av0Var2 = this.f43557f0;
                        if (av0Var2 != null) {
                            av0Var2.setHasStories(A4());
                        }
                        wv0 wv0Var2 = this.O;
                        if (wv0Var2 != null) {
                            wv0Var2.setChatInfo(this.f43667v2);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.f25348t) {
                    removeSelfFromStack(true);
                } else if (i7 == org.telegram.messenger.ls.v) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (r4Var = this.parentLayout) != null && r4Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f43550e1) {
                        this.G2 = botInfo;
                        H5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.ls.E0) {
                    if (((Long) objArr[0]).longValue() == this.f43550e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f43675w2 = userFull;
                        org.telegram.ui.Components.xu0 xu0Var = this.T;
                        if (xu0Var != null) {
                            xu0Var.set(userFull.stars_rating);
                        }
                        dv0 dv0Var3 = this.f43665v0;
                        if (dv0Var3 != null) {
                            dv0Var3.setStories(this.f43675w2.stories);
                        }
                        di.t0 t0Var3 = this.f43673w0;
                        if (t0Var3 != null) {
                            t0Var3.a();
                        }
                        av0 av0Var3 = this.f43557f0;
                        if (av0Var3 != null) {
                            av0Var3.setHasStories(A4());
                        }
                        wv0 wv0Var3 = this.O;
                        if (wv0Var3 != null) {
                            wv0Var3.setUserInfo(this.f43675w2);
                        }
                        if (this.f43638r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f43675w2.about, this.A2)) {
                                this.d.g(this.X2);
                            }
                            if (this.f43647s1) {
                                H5(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.L0) {
                                S3(true);
                            } else {
                                this.I1 = true;
                            }
                            H5(false, false);
                            wv0 wv0Var4 = this.O;
                            if (wv0Var4 != null) {
                                wv0Var4.setCommonGroupsCount(this.f43675w2.common_chats_count);
                                W();
                                org.telegram.ui.Components.bt0 bt0Var = this.R;
                                if (bt0Var == null || bt0Var.E) {
                                    resumeDelayedFragmentAnimation();
                                    B4(true);
                                }
                            }
                        }
                        r5();
                        R5();
                        if (this.f43683x2 == null && !y4()) {
                            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                            this.f43683x2 = f6Var;
                            n90 n90Var = new n90(this, 17);
                            if (f6Var.f30612c) {
                                n90Var.run();
                            } else {
                                f6Var.h.add(n90Var);
                            }
                            this.f43683x2.d(this.f43675w2);
                        }
                        if (!y4()) {
                            ax0 ax0Var = this.f43698z2;
                            ax0 c10 = ax0.c(this.currentAccount, this.f43675w2, ax0Var);
                            this.f43698z2 = c10;
                            if (c10 != ax0Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f43691y2 = z10;
                            if (c10 != null) {
                                n90 n90Var2 = new n90(this, 18);
                                if (c10.f45668b) {
                                    n90Var2.run();
                                } else {
                                    c10.h.add(n90Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (u4()) {
                                this.T0.T(44);
                            } else {
                                this.T0.u(44);
                            }
                            TLRPC.UserFull userFull2 = this.f43675w2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.T0.R(46, z13);
                            this.T0.R(47, !z13);
                        }
                    }
                } else if (i7 != org.telegram.messenger.ls.f25297k0) {
                    if (i7 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i15);
                                if (this.E2 != null) {
                                    TLRPC.MessageAction messageAction = gjVar.f24177k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (lw0Var = this.d) != null) {
                                        lw0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i7 == org.telegram.messenger.ls.f25306l4) {
                        ru0 ru0Var3 = this.f43518a;
                        if (ru0Var3 != null) {
                            ru0Var3.g1();
                        }
                    } else if (i7 == org.telegram.messenger.ls.A4) {
                        H5(false, false);
                    } else if (i7 == org.telegram.messenger.ls.f25344s1) {
                        int i16 = this.f43544d3;
                        int i17 = this.f43530b3;
                        int i18 = this.Z2;
                        N5();
                        lw0 lw0Var2 = this.d;
                        if (lw0Var2 != null) {
                            if (i16 != this.f43544d3 || i17 != this.f43530b3 || i18 != this.Z2) {
                                lw0Var2.f();
                            }
                        }
                    } else if (i7 == org.telegram.messenger.ls.f25354t5) {
                        if (this.f43631q1) {
                            M5(false);
                        }
                    } else if (i7 == org.telegram.messenger.ls.D1) {
                        ww0 ww0Var = this.f43548e;
                        if (ww0Var != null) {
                            ww0Var.f53460c = ww0.H(this);
                            this.f43548e.f53466w.clear();
                            this.f43548e.J();
                            ww0 ww0Var2 = this.f43548e;
                            ww0Var2.I(ww0Var2.E);
                        }
                    } else if (i7 == org.telegram.messenger.ls.f25251c0) {
                        M5(false);
                    } else if (i7 != org.telegram.messenger.ls.f25388y5 && i7 != org.telegram.messenger.ls.I5) {
                        if (i7 == org.telegram.messenger.ls.f25300k3) {
                            org.telegram.ui.ActionBar.g5 g5Var = this.T0;
                            if (g5Var != null) {
                                TL_account.RequirementToContact P2 = getMessagesController().P2(this.f43550e1);
                                if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                                    z12 = false;
                                }
                                g5Var.R(20, z12);
                            }
                            u5();
                        } else if (i7 == org.telegram.messenger.ls.f25291i5) {
                            u5();
                        } else if (i7 == org.telegram.messenger.ls.A3) {
                            H5(false, false);
                        } else if (i7 == org.telegram.messenger.ls.E3) {
                            H5(false, false);
                        } else if (i7 == org.telegram.messenger.ls.F3) {
                            H5(false, false);
                        } else if (i7 == org.telegram.messenger.ls.f25384y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
                                if (r4Var2 != null && r4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ls.f25283h3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.N4 < 0 && longValue3 == a()) {
                                N5();
                                W();
                                lw0 lw0Var3 = this.d;
                                if (lw0Var3 != null) {
                                    lw0Var3.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ls.I3) {
                            if (((Long) objArr[0]).longValue() == a() && !y4()) {
                                if (this.N4 < 0) {
                                    N5();
                                    W();
                                    lw0 lw0Var4 = this.d;
                                    if (lw0Var4 != null) {
                                        lw0Var4.f();
                                    }
                                    org.telegram.messenger.g0.g3(new n90(this, 19));
                                    return;
                                }
                                wv0 wv0Var5 = this.O;
                                if (wv0Var5 != null) {
                                    wv0Var5.P1(true);
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ls.Y3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f43550e1 > 0) {
                                TLRPC.UserFull d2 = getMessagesController().d2(this.f43550e1);
                                if (d2 != null) {
                                    this.f43675w2 = d2;
                                }
                                N5();
                                W();
                                ru0 ru0Var4 = this.f43518a;
                                if (ru0Var4 != null && ru0Var4.c0()) {
                                    this.f43518a.post(new n90(this, 20));
                                    return;
                                }
                                lw0 lw0Var5 = this.d;
                                if (lw0Var5 != null) {
                                    lw0Var5.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ls.Z3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.F2;
                            if (chat4 != null && chat4.f28398id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.C1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.H2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.U4;
                                    if (i11 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                                        i11++;
                                    } else {
                                        org.telegram.messenger.g0.Z3(this.f43518a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        av0 av0Var4 = this.f43557f0;
                        if (av0Var4 != null) {
                            av0Var4.setHasStories(A4());
                            this.f43557f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, this.f43599l2));
                        }
                        dv0 dv0Var4 = this.f43665v0;
                        if (dv0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f43675w2;
                            if (userFull3 != null) {
                                dv0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f43667v2;
                            if (chatFull8 != null) {
                                dv0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                S3(true);
            }
        } else if (org.telegram.messenger.v3.R(org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(this.f43558f1)))) {
            getMessagesController().R1().k(a(), new fi.e(23), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null && x30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if ((x30Var == null || dialog != x30Var.f41917c) && super.dismissDialogOnPause(dialog)) {
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

    public final int e4() {
        int i7 = 0;
        if (this.f43550e1 != 0 && this.f43638r0 != null && !this.f43647s1) {
            return 0;
        }
        return org.telegram.messenger.g0.L(74 + ((this.L4 || this.M4) ? 25 : 25));
    }

    public final void e5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.K6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.K6 = tL_emojiStatusCollectible;
                hi.l3 l3Var = this.H6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.J6 = null;
                    this.H6 = new hi.l3(getParentActivity(), 3);
                    this.I6 = org.telegram.ui.ActionBar.m6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.H6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                    hi.l3 l3Var2 = this.H6;
                    int r12 = org.telegram.ui.ActionBar.m6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    l3Var2.M0 = true;
                    l3Var2.U0 = System.currentTimeMillis();
                    l3Var2.N0 = new Path();
                    l3Var2.O0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
                    l3Var2.P0 = new Paint(1);
                    l3Var2.Q0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, r12), org.telegram.ui.ActionBar.m6.r1(1.0f, r12), org.telegram.ui.ActionBar.m6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    l3Var2.T0 = linearGradient;
                    l3Var2.Q0.setShader(linearGradient);
                    l3Var2.R0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, r12), org.telegram.ui.ActionBar.m6.r1(0.5f, r12), org.telegram.ui.ActionBar.m6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    l3Var2.S0 = new Matrix();
                    l3Var2.P0.setShader(l3Var2.R0);
                    l3Var2.Q0.setStyle(Paint.Style.STROKE);
                    l3Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
                    l3Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
                    l3Var2.Q0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                    this.Z.addView(this.H6, c8.na.c(24.0f, -1));
                    this.H6.w(9.33f);
                    hi.l3 l3Var3 = this.H6;
                    Typeface o4 = org.telegram.messenger.g0.o();
                    l3Var3.I.x(o4);
                    l3Var3.K.setTypeface(o4);
                    this.H6.v(tL_emojiStatusCollectible.title);
                    hi.l3 l3Var4 = this.H6;
                    l3Var4.d = -1L;
                    l3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
                    hi.l3 l3Var5 = this.H6;
                    l3Var5.getClass();
                    l3Var5.E = org.telegram.messenger.g0.N(4.0f);
                    l3Var5.F = org.telegram.messenger.g0.N(2.66f);
                    this.H6.t();
                    this.H6.s(16.0f);
                    this.H6.x();
                    this.H6.setOnClickListener(new ku0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < org.telegram.messenger.g0.L(82.0f)) {
                        this.J6 = Boolean.FALSE;
                        this.H6.setAlpha(0.0f);
                    }
                    t5();
                    hi.l3 l3Var6 = this.H6;
                    Objects.requireNonNull(l3Var6);
                    org.telegram.messenger.g0.h3(new sy(l3Var6, 1), 6000L);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 f() {
        return this.f43518a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof org.telegram.ui.Components.t51) {
            return ((org.telegram.ui.Components.t51) imageReceiver.t()).f39729a.a();
        }
        return org.telegram.messenger.g0.p(this.f43557f0.getImageReceiver().n());
    }

    @Override
    public final TLRPC.Chat g() {
        return this.F2;
    }

    public final org.telegram.ui.Components.n5 g4(long j3) {
        if (this.H == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(17.0f), 2, this.f43556f, false);
            this.H = n5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            n5Var.J = 0;
            n5Var.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        if (j3 != 0) {
            this.H.j(j3, false);
        } else {
            this.H.g(null, false);
        }
        v5();
        return this.H;
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override
    public final xq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.A0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        f6 f6Var = new f6(18, this);
        ArrayList arrayList = new ArrayList();
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            arrayList.addAll(wv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43543d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29290a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43557f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f43630q0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29349d8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43645s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29540ni));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43645s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29559oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43645s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29579pi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29720x6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29568p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29547o6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29663u6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29682v6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29758z6));
        int i7 = org.telegram.ui.ActionBar.m6.Ji;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43518a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29529n6));
        if (this.X5) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43556f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Fj));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43556f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f43688y}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29347d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43556f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29618ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43556f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f43688y}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29598qi));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.A0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.h6 h6Var = this.A0;
        if (h6Var != null) {
            drawable = h6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final boolean h(org.telegram.tgnet.TLRPC.ChatParticipant r25, boolean r26, boolean r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.h(org.telegram.tgnet.TLRPC$ChatParticipant, boolean, boolean, android.view.View):boolean");
    }

    public final void h4(boolean z10) {
        a0.h hVar;
        int i7;
        if (!this.B1 && (hVar = this.C1) != null && this.f43667v2 != null) {
            this.B1 = true;
            int i10 = 0;
            if (hVar.m() != 0 && z10) {
                i7 = 300;
            } else {
                i7 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().j1(this.f43558f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i10 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i10;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.u(this, tL_channels_getParticipants, i7)), this.classGuid);
        }
    }

    public final void h5(ew0 ew0Var) {
        if (this.f43621o5 == ew0Var) {
            return;
        }
        this.f43621o5 = ew0Var;
        org.telegram.messenger.g0.d0(this.f43518a, new hu0(this, 0));
    }

    public final org.telegram.ui.Components.n5 i4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.G == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 2, this.f43556f, false);
            this.G = n5Var;
            if (this.H0) {
                n5Var.a();
            }
        }
        if (this.G.d()) {
            z10 = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(o4(), z10);
                this.G.m(false, z10);
            } else {
                this.G.j(tL_emojiStatus.document_id, z10);
                this.G.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(o4(), z10);
                this.G.m(false, z10);
            } else {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z10);
                this.G.m(true, z10);
            }
        } else {
            this.G.g(o4(), z10);
            this.G.m(false, z10);
        }
        v5();
        return this.G;
    }

    public final void i5(CharSequence charSequence) {
        this.f43541c6 = charSequence;
        L5();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f43632q2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f43632q2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.x()) {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29703w8, this.A0);
            } else if (!this.X5 && this.G5 <= 0.5f) {
                org.telegram.messenger.cp cpVar = this.f43616n6;
                if (cpVar != null) {
                    w02 = cpVar.d(org.telegram.ui.ActionBar.m6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, this.A0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.A0);
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

    public final int j4() {
        return e4() + k4();
    }

    public final void j5(int i7) {
        boolean z10;
        SharedPreferences g12 = org.telegram.messenger.np.g1();
        if (!org.telegram.messenger.g0.Q1()) {
            boolean z11 = false;
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K1 = z10;
            if (i7 != 0) {
                z11 = true;
            }
            this.L1 = z11;
            O5();
            if (g12.getBoolean("view_animations", true)) {
                this.J1 = i7;
            } else if (i7 == 2) {
                this.n1 = true;
            }
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56727a) {
            return baseSimpleGlass.f56630i;
        }
        return null;
    }

    public final int k4() {
        if (e4() == 0) {
            return org.telegram.messenger.g0.L(168.0f);
        }
        return org.telegram.messenger.g0.L(152.0f);
    }

    public final void k5(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, ax0 ax0Var) {
        boolean z10;
        this.f43675w2 = userFull;
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            xu0Var.set(userFull.stars_rating);
        }
        dv0 dv0Var = this.f43665v0;
        if (dv0Var != null) {
            dv0Var.setStories(this.f43675w2.stories);
        }
        di.t0 t0Var = this.f43673w0;
        if (t0Var != null) {
            t0Var.a();
        }
        av0 av0Var = this.f43557f0;
        if (av0Var != null) {
            av0Var.setHasStories(A4());
        }
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            wv0Var.setUserInfo(this.f43675w2);
        }
        if (this.f43683x2 == null) {
            this.f43683x2 = f6Var;
        }
        if (this.f43683x2 == null) {
            this.f43683x2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.f43683x2;
        n90 n90Var = new n90(this, 22);
        if (f6Var2.f30612c) {
            n90Var.run();
        } else {
            f6Var2.h.add(n90Var);
        }
        this.f43683x2.d(this.f43675w2);
        if (this.f43698z2 == null) {
            this.f43698z2 = ax0Var;
        }
        ax0 ax0Var2 = this.f43698z2;
        boolean z11 = true;
        if (ax0Var2 == null) {
            ax0 c10 = ax0.c(this.currentAccount, this.f43675w2, ax0Var2);
            this.f43698z2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43691y2 = z10;
        }
        ax0 ax0Var3 = this.f43698z2;
        if (ax0Var3 != null) {
            n90 n90Var2 = new n90(this, 18);
            if (ax0Var3.f45668b) {
                n90Var2.run();
            } else {
                ax0Var3.h.add(n90Var2);
            }
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.T0;
        if (g5Var != null) {
            TL_account.RequirementToContact P2 = getMessagesController().P2(this.f43550e1);
            if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                z11 = false;
            }
            g5Var.R(20, z11);
            if (u4()) {
                this.T0.T(44);
            } else {
                this.T0.u(44);
            }
        }
    }

    public final float l4() {
        return Math.max(this.G5, this.W5);
    }

    public final void l5() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.xf0 xf0Var = new org.telegram.ui.Components.xf0(this.glassEngine, baseSimpleGlass);
        this.O5 = xf0Var;
        zw0 zw0Var = this.f43543d1;
        if (zw0Var != null) {
            int i7 = zw0Var.I;
            boolean z10 = zw0Var.f54611c;
            if (xf0Var.f42032i != i7 || xf0Var.f42033j != z10) {
                xf0Var.f42032i = i7;
                xf0Var.f42033j = z10;
                xf0Var.a();
            }
        }
        this.O5.b(this.P5);
        org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
        if (tf0Var != null) {
            tf0Var.setGlassFactory(this.O5.f42028c);
        }
        org.telegram.ui.Components.og0 og0Var = this.f43535c0;
        if (og0Var != null) {
            og0Var.setGlassFactory(this.O5.f42028c);
        }
        this.simpleActionBar.setButtonsGlass(this.O5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        uv0 uv0Var = this.s5;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = this.A0;
        baseSimpleGlass.f56634m = uv0Var;
        baseSimpleGlass.f56635n = null;
        baseSimpleGlass.g(uv0Var, z4Var, h6Var);
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.xf0 xf0Var2 = this.O5;
        dh.c cVar = xf0Var2.f42029e;
        ui.d dVar = xf0Var2.f42030f;
        z4Var2.f30307o0 = cVar;
        z4Var2.f30308p0 = dVar;
        z4Var2.setBackground(null);
        this.M5 = c8.j0.m(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.N5);
        E5();
        baseSimpleGlass.f56636o = this.S6;
        View view = new View(getParentActivity());
        this.Z5 = view;
        view.setAlpha(0.0f);
        this.s5.getViewTreeObserver().addOnPreDrawListener(new gk(this, 1));
        this.O.z(this.Z5);
        View view2 = this.Z5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.H5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        uv0 uv0Var2 = this.s5;
        uv0Var2.addView(this.H5, uv0Var2.indexOfChild(this.Z), c8.na.e(-1, 0, 48));
        this.glassEngine.b(this.f43518a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new n90(this, 21));
        H3();
        B5();
    }

    public final float m4(float f10, float f11) {
        float f12;
        float f13;
        this.B6 = f10;
        this.D6 = f11;
        int i7 = this.J1;
        if (i7 == 2) {
            f12 = 1.0f;
        } else if (this.T1 < 1.0f && i7 != 0) {
            f12 = 0.0f;
        } else {
            f12 = this.f43599l2;
        }
        float l10 = Utilities.l(f12);
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            f13 = xu0Var.getVisibilityFactor();
        } else {
            f13 = 0.0f;
        }
        return Math.max(0.0f, (r4() + this.f43663u5) * l10) + com.google.android.gms.internal.vision.e2.z(1.0f, l10, f11 * f13, f10);
    }

    public final void m5(boolean z10, boolean z11) {
        if (this.f43571h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f43564g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f43564g0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43564g0 = animatorSet2;
            if (z10) {
                this.f43571h0.setVisibility(0);
                this.f43564g0.playTogether(ObjectAnimator.ofFloat(this.f43571h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f43571h0, View.ALPHA, 0.0f));
            }
            this.f43564g0.setDuration(180L);
            this.f43564g0.addListener(new ov0(this, z10, 1));
            this.f43564g0.start();
        } else if (z10) {
            this.f43571h0.setAlpha(1.0f);
            this.f43571h0.setVisibility(0);
        } else {
            this.f43571h0.setAlpha(0.0f);
            this.f43571h0.setVisibility(4);
        }
    }

    public final float n4(float f10) {
        float f11;
        this.E6 = f10;
        int i7 = this.J1;
        float f12 = 0.0f;
        if (i7 == 2) {
            f11 = 1.0f;
        } else if (this.T1 < 1.0f && i7 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f43599l2;
        }
        float l10 = Utilities.l(f11);
        if (this.T != null) {
            f12 = this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f);
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, l10, f12, f10);
    }

    public final void n5() {
        int i7;
        int i10;
        Long l10;
        if (this.T5 != null) {
            return;
        }
        i11[] i11VarArr = new i11[1];
        Rect rect = org.telegram.messenger.g0.Q;
        pk pkVar = this.f43556f;
        if (pkVar != null) {
            if (pkVar.getRightDrawable() == null) {
                rect.set(this.f43556f.getWidth() - 1, (this.f43556f.getHeight() / 2) - 1, this.f43556f.getWidth() + 1, (this.f43556f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f43556f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f43556f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f43556f.getX(), (int) this.f43556f.getY());
            }
        }
        if (this.f43556f.getScaleX() < 1.5f) {
            i7 = 16;
        } else {
            i7 = 32;
        }
        int i11 = i7;
        int L = (-(this.Z.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i11);
        Point point = org.telegram.messenger.g0.f24010q;
        int min = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = c8.m9.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.F2 == null) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        hv0 hv0Var = new hv0(this, this, parentActivity, valueOf, i10, this.A0, i11, i11VarArr);
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f43550e1));
        if (c22 != null) {
            hv0Var.setExpireDateHint(org.telegram.messenger.n5.g(c22.emoji_status));
        }
        Long l11 = this.F;
        if (l11 != null) {
            hv0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.n5 n5Var = this.G;
            if (n5Var != null) {
                Drawable drawable = n5Var.f37733f[0];
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.p5) drawable).h());
                    hv0Var.setSelected(l10);
                }
            }
            l10 = null;
            hv0Var.setSelected(l10);
        }
        hv0Var.setSaveState(3);
        hv0Var.y(this.G, this.f43556f);
        iv0 iv0Var = new iv0(this, hv0Var);
        this.T5 = iv0Var;
        i11VarArr[0] = iv0Var;
        int[] iArr = new int[2];
        pk pkVar2 = this.f43556f;
        if (pkVar2 != null) {
            pkVar2.getLocationOnScreen(iArr);
        }
        i11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        i11VarArr[0].b();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.Components.mr o4() {
        if (this.K == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232309).mutate();
            this.E = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29598qi, this.A0), PorterDuff.Mode.MULTIPLY);
            this.K = new org.telegram.ui.Components.mr(this.E, getParentActivity().getDrawable(2131232312).mutate());
        }
        return this.K;
    }

    public final void o5() {
        int i7 = 0;
        this.O.L0.setReordering(false);
        wv0 wv0Var = this.O;
        org.telegram.ui.Components.fr0 fr0Var = wv0Var.L0;
        if (wv0Var.f36638y1 != null && fr0Var != null) {
            boolean C0 = wv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = fr0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.jt0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.O.P1(true);
        this.E5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).withEndAction(new n90(this, 24)).start();
        org.telegram.ui.Components.lc.b0(this).Q(2131623990, 36, "Tab order changed.").j();
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null) {
            x30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.fr0 fr0Var;
        if (super.onBackPressed(z10)) {
            wv0 wv0Var = this.O;
            if (wv0Var != null && (fr0Var = wv0Var.L0) != null && fr0Var.f33118o0) {
                if (z10) {
                    o5();
                    return false;
                }
            } else if (this.N4 != -1 && wv0Var != null && wv0Var.F1) {
                if (z10) {
                    wv0Var.V(true);
                }
            } else {
                return this.actionBar.isEnabled();
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.f43664u6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        U5();
        this.f43664u6 = true;
        U3();
        if (this.J0 && !this.f43643r5 && (view = this.fragmentView) != null) {
            this.f43643r5 = true;
            this.Y4 = true;
            view.requestLayout();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            wv0Var.onConfigurationChanged(configuration);
        }
        v4();
        if (this.f43619o2 && this.f43632q2 && (m10 = this.f43534c.m(0)) != null) {
            this.f43518a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new d7(this, 5));
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        long j3;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        float f10;
        boolean z12;
        org.telegram.ui.ActionBar.q0 q0Var2;
        TimeInterpolator decelerateInterpolator;
        org.telegram.ui.Components.bh bhVar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.q0 j10;
        long j11;
        boolean z13;
        float f11;
        View E;
        float f12;
        float f13;
        TLRPC.Chat chat;
        cx cxVar;
        xv xvVar;
        if (!this.J0) {
            N5();
            if (this.J1 != 0 && this.M1 && !this.f43632q2 && !this.N1) {
                ImageView imageView = this.f43585j0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.f43578i0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.f43598l0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.f43598l0.setScaleX(1.0f);
                    this.f43598l0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.f43591k0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.f43591k0.setScaleX(1.0f);
                    this.f43591k0.setScaleY(1.0f);
                }
                this.f43602l5 = null;
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getFragmentStack().size() >= 2) {
                    Object obj = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj instanceof org.telegram.ui.Components.bh) {
                        this.f43608m5 = (org.telegram.ui.Components.bh) obj;
                    }
                    if (obj instanceof le0) {
                        obj = ((le0) obj).K;
                    }
                    if ((obj instanceof cx) && (xvVar = (cxVar = (cx) obj).H3) != null) {
                        ew ewVar = xvVar.f54299a;
                        if (com.google.android.gms.internal.vision.e2.s(ewVar)) {
                            this.f43602l5 = cxVar;
                            this.f43608m5 = ewVar;
                        }
                    }
                }
                org.telegram.ui.Components.bh bhVar2 = this.f43608m5;
                if (bhVar2 != null && ((org.telegram.ui.ActionBar.g2) bhVar2).getActionBar() != null) {
                    kVar = ((org.telegram.ui.ActionBar.g2) this.f43608m5).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.bh bhVar3 = this.f43608m5;
                if ((bhVar3 instanceof bn) && ((bn) bhVar3).f45958e != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bhVar3 != null) {
                    ImageView imageView5 = this.f43585j0;
                    if (imageView5 != null) {
                        if ((bhVar3 instanceof bn) && (chat = ((bn) bhVar3).f45958e) != null && chat.linked_community_id != 0) {
                            imageView5.setTag(1);
                            this.f43585j0.setVisibility(0);
                        } else {
                            imageView5.setTag(null);
                            this.f43585j0.setVisibility(8);
                        }
                    }
                    if (this.m0 != null) {
                        org.telegram.ui.Components.bh bhVar4 = this.f43608m5;
                        if ((bhVar4 instanceof bn) && org.telegram.messenger.v3.p0(((bn) bhVar4).f45958e)) {
                            this.f43578i0.setTag(null);
                            this.f43578i0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.E2;
                            if (encryptedChat != null) {
                                this.m0.b(encryptedChat.ttl);
                                this.f43578i0.setTag(1);
                                this.f43578i0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.f43675w2;
                                if (userFull != null) {
                                    this.m0.b(userFull.ttl_period);
                                    if (this.K1 && this.f43675w2.ttl_period != 0) {
                                        this.f43578i0.setTag(1);
                                        this.f43578i0.setVisibility(0);
                                    } else {
                                        this.f43578i0.setTag(null);
                                        this.f43578i0.setVisibility(8);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.f43667v2;
                                    if (chatFull != null) {
                                        this.m0.b(chatFull.ttl_period);
                                        if (this.K1 && this.f43667v2.ttl_period != 0) {
                                            this.f43578i0.setTag(1);
                                            this.f43578i0.setVisibility(0);
                                        } else {
                                            this.f43578i0.setTag(null);
                                            this.f43578i0.setVisibility(8);
                                        }
                                    } else {
                                        this.f43578i0.setTag(null);
                                        this.f43578i0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    O5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.J1 == 2) {
                    j3 = 250;
                } else {
                    j3 = 180;
                }
                animatorSet.setDuration(j3);
                this.f43518a.setLayerType(2, null);
                if (z10) {
                    this.f43597k6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f43637r.getLayoutParams();
                    q0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.g0.f24009p * (-21.0f)) + org.telegram.messenger.g0.L(8.0f));
                    this.f43637r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
                        j11 = 0;
                        int ceil = (int) Math.ceil((org.telegram.messenger.g0.f24009p * 21.0f) + (org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(117.0f)));
                        float measureText = (this.f43556f.getPaint().measureText(this.f43556f.getText().toString()) * 1.12f) + this.f43556f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f43556f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(f13 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f43556f.setLayoutParams(layoutParams2);
                        this.S1 = j4();
                    } else {
                        j11 = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f43556f.getLayoutParams();
                        layoutParams3.width = (int) ((org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(32.0f)) / 1.38f);
                        this.f43556f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.rh0 rh0Var = this.f43645s;
                    if (rh0Var != null && rh0Var.getTag() == null) {
                        this.f43645s.setScaleX(0.2f);
                        this.f43645s.setScaleY(0.2f);
                        this.f43645s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43645s, View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43645s, View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43645s, View.ALPHA, 1.0f));
                    }
                    dv0 dv0Var = this.f43665v0;
                    if (dv0Var != null && this.J1 == 2) {
                        dv0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43665v0, View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.f43646s0 = f4(this.f43557f0.getImageReceiver());
                        this.f43556f.setTextColor(-1);
                        this.f43637r.setTextColor(-1275068417);
                        this.actionBar.F(1090519039, false);
                        xw0 xw0Var = this.F6;
                        if (xw0Var != null) {
                            xw0Var.a(603979775);
                        }
                        mw0 mw0Var = this.N;
                        mw0Var.F = true;
                        mw0Var.setVisibility(0);
                    }
                    if (this.J1 == 2) {
                        this.f43556f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43556f, View.ALPHA, 1.0f));
                    } else {
                        this.f43556f.setAlpha(1.0f);
                    }
                    if (this.f43665v0 != null) {
                        if (a() > j11) {
                            this.f43665v0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43665v0, View.ALPHA, 1.0f));
                        } else {
                            this.f43665v0.setAlpha(1.0f);
                            this.f43665v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43665v0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    di.t0 t0Var = this.f43673w0;
                    if (t0Var != null) {
                        t0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43673w0, View.ALPHA, 1.0f));
                    }
                    if (this.f43578i0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43578i0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43578i0, View.SCALE_X, 0.85f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43578i0, View.SCALE_Y, 0.85f, 0.0f));
                    }
                    if (this.f43585j0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43585j0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43585j0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43585j0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f43598l0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43598l0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43598l0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43598l0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f43591k0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43591k0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43591k0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43591k0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.M0 && (this.f43558f1 != j11 || z11)) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, View.ALPHA, 1.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, View.ALPHA, 1.0f));
                    }
                    av0 av0Var = this.f43557f0;
                    if (av0Var != null) {
                        av0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43557f0, xv0.f53941h0, 0.0f));
                    }
                    org.telegram.ui.Components.bh bhVar5 = this.f43608m5;
                    if (bhVar5 != null) {
                        org.telegram.ui.Components.co r10 = bhVar5.r();
                        if (r10 != null) {
                            org.telegram.ui.Components.yn ynVar = r10.f34202e;
                            cx cxVar2 = this.f43602l5;
                            if (cxVar2 != null && cxVar2.getFragmentView() != null) {
                                E = this.f43602l5.getFragmentView();
                            } else {
                                E = this.f43608m5.E();
                            }
                            RectF rectF = this.f43603l6;
                            if (jh.k.c(ynVar, E, rectF)) {
                                f12 = rectF.left;
                            } else {
                                f12 = 0.0f;
                            }
                            this.f43597k6 = f12;
                        }
                        if ((r10 == null || !(r10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.m5) || ((org.telegram.ui.ActionBar.m5) r10.getSubtitleTextView()).getLeftDrawable() == null) && !r10.T[0] && !x4(r10)) {
                            z13 = false;
                        } else {
                            View subtitleTextView = r10.getSubtitleTextView();
                            this.f43524a5 = subtitleTextView;
                            if (!(this.f43608m5 instanceof bn) && subtitleTextView != null) {
                                f11 = this.f43637r.getPaddingLeft() - this.f43524a5.getPaddingLeft();
                            } else {
                                f11 = 0.0f;
                            }
                            this.f43532b5 = f11;
                            this.Z.invalidate();
                            this.f43637r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43637r, View.ALPHA, 1.0f));
                            z13 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (this.J1 == 2) {
                            this.f43637r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43637r, View.ALPHA, 1.0f));
                        } else {
                            this.f43637r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    q0Var = null;
                    this.S1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.rh0 rh0Var2 = this.f43645s;
                    if (rh0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rh0Var2, View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43645s, View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43645s, View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43556f, View.ALPHA, 0.0f));
                    }
                    dv0 dv0Var2 = this.f43665v0;
                    if (dv0Var2 != null) {
                        if (this.f43579i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(dv0Var2, View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(dv0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    di.t0 t0Var2 = this.f43673w0;
                    if (t0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(t0Var2, View.ALPHA, 0.0f));
                    }
                    if (this.f43578i0.getTag() != null) {
                        this.f43578i0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43578i0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43578i0, View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43578i0, View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.f43585j0.getTag() != null) {
                        this.f43585j0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43585j0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43585j0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43585j0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f43598l0.getTag() != null) {
                        this.f43598l0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43598l0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43598l0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43598l0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f43591k0.getTag() != null) {
                        this.f43591k0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43591k0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43591k0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43591k0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.M0 && (this.f43558f1 != 0 || z11)) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    av0 av0Var2 = this.f43557f0;
                    if (av0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(av0Var2, xv0.f53941h0, 1.0f));
                    }
                    if (this.parentLayout.getFragmentStack().size() > 1) {
                        g2Var = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    } else {
                        g2Var = null;
                    }
                    if (g2Var instanceof bn) {
                        bn bnVar = (bn) g2Var;
                        vi viVar = bnVar.f46100p1;
                        org.telegram.messenger.g0.K(viVar, new mc0(this, viVar, bnVar, 27));
                        View subtitleTextView2 = viVar.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof org.telegram.ui.ActionBar.m5) && ((org.telegram.ui.ActionBar.m5) subtitleTextView2).getLeftDrawable() != null) || viVar.T[0]) {
                            this.f43524a5 = viVar.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.f43637r, View.ALPHA, 0.0f));
                            z12 = true;
                        }
                        z12 = false;
                    } else {
                        org.telegram.ui.Components.bh bhVar6 = this.f43608m5;
                        if (bhVar6 != null && bhVar6.r() != null) {
                            org.telegram.ui.Components.co r11 = this.f43608m5.r();
                            org.telegram.messenger.g0.K(r11, new ur0(10, this, r11));
                            if (x4(r11)) {
                                View subtitleTextView3 = r11.getSubtitleTextView();
                                this.f43524a5 = subtitleTextView3;
                                if (!(this.f43608m5 instanceof bn) && subtitleTextView3 != null) {
                                    f10 = this.f43637r.getPaddingLeft() - this.f43524a5.getPaddingLeft();
                                } else {
                                    f10 = 0.0f;
                                }
                                this.f43532b5 = f10;
                                this.Z.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.f43637r, View.ALPHA, 0.0f));
                                z12 = true;
                            }
                        }
                        z12 = false;
                    }
                    if (!z12 && this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43637r, View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    dx0 dx0Var = this.G6;
                    if (dx0Var != null) {
                        dx0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new du0(this, 2));
                animatorSet.playTogether(ofFloat);
                if (this.P0 != null && (bhVar = this.f43608m5) != null && (yVar = ((org.telegram.ui.ActionBar.g2) bhVar).getActionBar().F) != null && (j10 = yVar.j(32)) != null && j10.getVisibility() == 0) {
                    j10.setAlpha(0.0f);
                    if (z10) {
                        this.P0.setVisibility(0);
                    }
                    this.P0.setTag(j10);
                    q0Var2 = j10;
                } else {
                    q0Var2 = q0Var;
                }
                animatorSet.addListener(new jg.j0(this, kVar, q0Var2, runnable, 4));
                if (this.J1 == 2) {
                    decelerateInterpolator = org.telegram.ui.Components.nr.f37917f;
                } else {
                    decelerateInterpolator = new DecelerateInterpolator();
                }
                animatorSet.setInterpolator(decelerateInterpolator);
                org.telegram.messenger.g0.h3(new iq0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        ru0 ru0Var = this.f43518a;
        if (ru0Var != null) {
            ru0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            wv0Var.R0();
        }
        org.telegram.ui.Components.bt0 bt0Var = this.R;
        if (bt0Var != null) {
            bt0Var.b(this);
        }
        org.telegram.ui.Components.bt0 bt0Var2 = this.R;
        if (bt0Var2 != null) {
            bt0Var2.f33887y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25335r);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25348t);
        getNotificationCenter().n(this, org.telegram.messenger.ls.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25354t5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.D1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25251c0);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25388y5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.I5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25300k3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25291i5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.A3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.E3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.F3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25384y1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25283h3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.I3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.Y3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.Z3);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
        bv0 bv0Var = this.f43617o0;
        if (bv0Var != null) {
            bv0Var.K();
        }
        org.telegram.ui.Components.zf0 zf0Var = this.f43611n0;
        if (zf0Var != null) {
            zf0Var.d();
        }
        this.f43563f6 = null;
        if (this.f43550e1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25344s1);
            getNotificationCenter().n(this, org.telegram.messenger.ls.O);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25238a0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.Y);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25274g0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.D0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.E0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25297k0);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.A4);
            getMessagesController().f25909r1.remove(Long.valueOf(this.f43550e1));
        } else if (this.f43558f1 != 0) {
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.E5);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25339r3);
            getNotificationCenter().n(this, org.telegram.messenger.ls.T);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25275g1);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25371w2);
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25246b1);
        }
        av0 av0Var = this.f43557f0;
        if (av0Var != null) {
            av0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null) {
            x30Var.d();
        }
        fv0 fv0Var = this.Z4;
        if (fv0Var != null) {
            fv0Var.b();
        }
        ax0 ax0Var = this.f43698z2;
        if (ax0Var != null && this.f43691y2) {
            ax0Var.b(true);
            this.f43698z2 = null;
        }
        ai.e2 e2Var = this.D5;
        if (e2Var != null) {
            this.D5 = null;
            org.telegram.messenger.g0.g3(e2Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.qr0 qr0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null) {
            x30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
        }
        wv0 wv0Var = this.O;
        if (wv0Var != null && (qr0Var = wv0Var.W) != null) {
            qr0Var.f46976e = false;
            if (qr0Var.f46975c != null) {
                qr0Var.f46973a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null) {
            x30Var.j(i7, strArr, iArr);
        }
        if (i7 != 101 && i7 != 102) {
            if (i7 == 103 && this.F2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 < iArr.length) {
                        if (iArr[i10] != 0) {
                            z13 = false;
                            break;
                        }
                        i10++;
                    } else {
                        z13 = true;
                        break;
                    }
                }
                if (iArr.length > 0 && z13) {
                    org.telegram.messenger.t3 i12 = getMessagesController().i1(this.f43558f1, false, null);
                    TLRPC.Chat chat = this.F2;
                    if (i12 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.b2.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
                return;
            }
            return;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f43550e1));
        if (c22 == null) {
            return;
        }
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
            if (i7 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.UserFull userFull = this.f43675w2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.b2.m(c22, z11, z12, getParentActivity(), this.f43675w2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        TLRPC.User c22;
        uv uvVar;
        super.onResume();
        wv0 wv0Var = this.O;
        if (wv0Var != null) {
            wv0Var.f36579e1 = true;
            org.telegram.ui.Components.pr0 pr0Var = wv0Var.K;
            if (pr0Var != null) {
                pr0Var.f();
            }
            org.telegram.ui.Components.ws0 ws0Var = wv0Var.N;
            if (ws0Var != null) {
                ws0Var.f();
            }
            org.telegram.ui.Components.xs0 xs0Var = wv0Var.M;
            if (xs0Var != null) {
                xs0Var.X(false);
            }
            for (int i7 = 0; i7 < wv0Var.f36605n0.length; i7++) {
                wv0Var.e0(i7);
            }
            org.telegram.ui.Components.qr0 qr0Var = wv0Var.W;
            if (qr0Var != null) {
                qr0Var.f46976e = true;
                if (qr0Var.f46975c != null) {
                    qr0Var.f46973a.onResume();
                }
            }
        }
        v4();
        lw0 lw0Var = this.d;
        if (lw0Var != null) {
            this.X4 = true;
            lw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (uvVar = this.U) != null && uvVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null) {
            x30Var.k();
            setParentActivityTitle(org.telegram.messenger.hd.N0(2131745299, null));
        }
        M5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new d7(this, 5));
        }
        pk pkVar = this.f43556f;
        if (pkVar != null) {
            setParentActivityTitle(pkVar.getText());
        }
        if (this.f43550e1 != 0 && (c22 = getMessagesController().c2(Long.valueOf(this.f43550e1))) != null && c22.photo == null && this.Q1 >= j4()) {
            this.f43593k2.cancel();
            float[] fArr = this.f43612n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            a5(1.0f);
            this.f43617o0.setVisibility(8);
            this.Q1 = j4();
            this.f43625p2 = false;
            this.f43534c.h1(0, j4() - this.f43518a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.a();
        }
        G5();
        B4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f43696z0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, this.A0));
            p5();
            Q5();
            J3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (z10 && (z4Var = this.simpleActionBar) != null) {
            z4Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i7 = this.J1;
                if (i7 != 0 && this.M1) {
                    if (i7 == 1) {
                        this.f43599l2 = 0.0f;
                        org.telegram.ui.Components.xu0 xu0Var = this.T;
                        if (xu0Var != null) {
                            xu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
                        if (tf0Var != null) {
                            tf0Var.setParentExpanded(0.0f);
                        }
                        c5(0.0f);
                        org.telegram.ui.Components.og0 og0Var = this.f43535c0;
                        if (og0Var != null) {
                            og0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    O3();
                    if (this.I1) {
                        S3(true);
                    }
                }
                if (!this.f43643r5) {
                    this.f43643r5 = true;
                    this.Y4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.T4);
            uv uvVar = this.U;
            if (uvVar != null && uvVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        Q3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        uv uvVar = this.U;
        if (uvVar != null && uvVar.getVisibility() == 0) {
            if (z10) {
                this.U.setAlpha(1.0f - f10);
            } else {
                this.U.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xw0 xw0Var;
        ImageView imageView;
        org.telegram.ui.Components.tf0 tf0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.f43584i6 = z10;
        if (z10 && (tf0Var = this.f43519a0) != null) {
            ArrayList arrayList = tf0Var.f39837a;
            if (tf0Var.F == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.qf0 qf0Var = (org.telegram.ui.Components.qf0) arrayList.get(i7);
                    org.telegram.ui.Components.oh0 oh0Var = qf0Var.f38857k;
                    if (oh0Var != null) {
                        if (qf0Var.f38849a == 15) {
                            oh0Var.M(14);
                        } else {
                            oh0Var.M(0);
                        }
                        qf0Var.f38857k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0)) {
            ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f43632q2) {
            this.G1 = true;
            if (!z10) {
                if (this.f43563f6 == null) {
                    this.f43563f6 = new float[14];
                }
                this.F1 = this.Q1;
                this.f43563f6[0] = this.Y.getScaleX();
                this.f43563f6[1] = this.Y.getTranslationX();
                this.f43563f6[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.tf0 tf0Var2 = this.f43519a0;
                if (tf0Var2 != null) {
                    this.f43563f6[3] = tf0Var2.getAlpha();
                }
                di.t0 t0Var = this.f43673w0;
                if (t0Var != null) {
                    float[] fArr = this.f43563f6;
                    fArr[4] = t0Var.f9766e;
                    fArr[5] = t0Var.f9767f;
                }
                if (this.F6 != null) {
                    this.f43563f6[6] = xw0Var.getAlpha();
                }
                this.f43563f6[7] = this.f43556f.getScaleX();
                this.f43563f6[8] = this.f43556f.getTranslationY();
                this.f43563f6[9] = this.f43637r.getTranslationY();
                this.f43563f6[10] = this.f43556f.getLayoutParams().width;
                float[] fArr2 = this.f43563f6;
                fArr2[11] = this.d2;
                fArr2[12] = this.f43556f.getTranslationX();
                this.f43563f6[13] = this.f43637r.getTranslationX();
                hi.l3 l3Var = this.H6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
            }
        }
        if (z10) {
            if (this.f43638r0 != null) {
                this.T4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ls.f25342s, org.telegram.messenger.ls.f25348t, org.telegram.messenger.ls.W, org.telegram.messenger.ls.X, org.telegram.messenger.ls.E0, org.telegram.messenger.ls.f25360u4}, this.T4, true);
            } else {
                this.T4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ls.f25342s, org.telegram.messenger.ls.f25348t, org.telegram.messenger.ls.W, org.telegram.messenger.ls.X, org.telegram.messenger.ls.f25360u4}, this.T4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.f43546d5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        Q3();
    }

    public final float p4(int i7) {
        View subtitleTextView;
        org.telegram.ui.ActionBar.m5 m5Var;
        org.telegram.ui.Components.bh bhVar = this.f43608m5;
        if (bhVar != null && !(bhVar instanceof bn) && bhVar.r() != null) {
            org.telegram.ui.Components.co r10 = this.f43608m5.r();
            if (i7 == 0) {
                subtitleTextView = r10.getTitleTextView();
            } else {
                subtitleTextView = r10.getSubtitleTextView();
            }
            if (i7 == 0) {
                m5Var = this.f43556f;
            } else {
                m5Var = this.f43637r;
            }
            float textSize = m5Var.getPaint().getTextSize();
            if ((subtitleTextView instanceof org.telegram.ui.ActionBar.m5) && textSize > 0.0f) {
                return ((org.telegram.ui.ActionBar.m5) subtitleTextView).getPaint().getTextSize() / textSize;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final void p5() {
        int w02;
        int w03;
        if (!this.f43632q2) {
            cv0 cv0Var = this.f43637r;
            if (cv0Var != null) {
                Object tag = cv0Var.getTag();
                if (tag instanceof Integer) {
                    this.f43637r.setTextColor(I3(org.telegram.ui.ActionBar.m6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    this.f43637r.setTextColor(I3(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f43680x;
            int i7 = -1;
            if (drawable != null) {
                if (this.f43616n6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29409gd, this.A0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.vk0 vk0Var = this.L;
            if (vk0Var != null) {
                vk0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29422h8, this.A0));
            }
            pk pkVar = this.f43556f;
            if (pkVar != null) {
                pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29522mi, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.f43616n6 == null) {
                    i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, this.A0);
                }
                kVar.G(i7, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f43616n6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29387f8, this.A0);
                }
                kVar2.F(w02, false);
            }
        }
        v5();
        T5();
    }

    public final float q4(float f10, int i7, View view) {
        View E;
        float left;
        int paddingLeft;
        org.telegram.ui.Components.bh bhVar = this.f43608m5;
        if (bhVar != null && !(bhVar instanceof bn) && this.fragmentView != null && (view.getParent() instanceof View)) {
            org.telegram.ui.Components.co r10 = this.f43608m5.r();
            org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.g2) this.f43608m5).getActionBar();
            View view2 = null;
            if (i7 == 0) {
                if (r10 != null) {
                    view2 = r10.getTitleTextView();
                }
            } else if (i7 == 1) {
                if (r10 != null) {
                    view2 = r10.getSubtitleTextView();
                }
            } else if (actionBar != null) {
                view2 = actionBar.getBackButton();
            }
            if (view2 != null) {
                cx cxVar = this.f43602l5;
                if (cxVar != null && cxVar.getFragmentView() != null) {
                    E = this.f43602l5.getFragmentView();
                } else {
                    E = this.f43608m5.E();
                }
                RectF rectF = this.f43603l6;
                if (jh.k.c(view2, E, rectF)) {
                    float f11 = rectF.left;
                    if (jh.k.c((View) view.getParent(), this.fragmentView, rectF)) {
                        if (i7 == 2) {
                            left = rectF.left;
                            paddingLeft = view.getLeft();
                        } else {
                            f11 += view2.getPaddingLeft();
                            left = rectF.left + view.getLeft();
                            paddingLeft = view.getPaddingLeft();
                        }
                        return f11 - (left + paddingLeft);
                    }
                }
            }
        }
        return f10;
    }

    public final void q5() {
        int i7;
        float f10;
        k0 k0Var;
        if (this.f43519a0 != null && this.f43637r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f24004m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
            boolean z10 = this.G1;
            tf0Var.f39842e = z10;
            if (z10 && this.J1 == 2 && (k0Var = this.Y) != null) {
                this.f43519a0.f39843f = this.Y.getY() + (this.Y.getScaleY() * k0Var.getHeight());
                this.f43519a0.setAlpha(this.T1);
                org.telegram.ui.Components.tf0 tf0Var2 = this.f43519a0;
                tf0Var2.f39848x = org.telegram.messenger.g0.L(74.0f);
                tf0Var2.setTranslationY(this.f43518a.getMeasuredWidth());
                tf0Var2.invalidate();
            } else {
                tf0Var.f39843f = -1.0f;
                float f11 = i10;
                float f12 = this.Q1 + f11;
                if (!this.L4 && !this.M4) {
                    f10 = 0.0f;
                } else {
                    f10 = 25.0f;
                }
                float L = f12 - org.telegram.messenger.g0.L(f10);
                float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f11);
                org.telegram.ui.Components.tf0 tf0Var3 = this.f43519a0;
                tf0Var3.f39848x = min;
                tf0Var3.setTranslationY(L - min);
                tf0Var3.invalidate();
            }
            ImageView imageView = this.P0;
            if (imageView != null && imageView.getTag() != null) {
                this.f43519a0.getClass();
                if (this.P0.getVisibility() == 0) {
                    this.P0.setVisibility(8);
                }
                if (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0) {
                    ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    public final float r4() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
        }
        return 0.0f;
    }

    public final void r5() {
        int i7;
        if (this.Z0 != null && this.f43520a1 != null) {
            TLRPC.UserFull userFull = this.f43675w2;
            if (userFull == null && this.f43667v2 == null) {
                i7 = 0;
            } else if (userFull != null) {
                i7 = userFull.ttl_period;
            } else {
                i7 = this.f43667v2.ttl_period;
            }
            this.f43652t0.b(i7);
            this.f43520a1.u(i7);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null) {
            x30Var.f41919f = bundle.getString("path");
        }
    }

    public final int s4() {
        float f10;
        if (this.f43631q1) {
            return 0;
        }
        if (this.f43558f1 != 0 && org.telegram.messenger.v3.c0(getMessagesController().O0(Long.valueOf(this.f43558f1)))) {
            if (A4()) {
                f10 = 24.0f;
            } else {
                f10 = 38.0f;
            }
            return org.telegram.messenger.g0.L(f10);
        }
        return org.telegram.messenger.g0.L(50.0f);
    }

    public final void s5() {
        float L;
        boolean z10;
        if (this.f43694y5 != null) {
            wv0 wv0Var = this.O;
            if (wv0Var != null && wv0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.g0.L(232.0f) - (this.f43518a.getMeasuredHeight() - this.O.getY());
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            int i7 = 0;
            if (L <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            te.a aVar = this.S5;
            aVar.a(z10, true);
            float f10 = aVar.f57665e;
            this.f43694y5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
            this.f43694y5.setAlpha(f10);
            FrameLayout frameLayout = this.f43694y5;
            if (f10 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35481w;
            if (gcVar != null) {
                gcVar.l();
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x30 x30Var = this.f43638r0;
        if (x30Var != null && (str = x30Var.f41919f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        int i7;
        this.f43599l2 = f10;
        this.T1 = f10;
        Q3();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setAlpha(f10);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.getBackButton().setTranslationX(org.telegram.messenger.g0.T1(q4(org.telegram.messenger.g0.L(2.0f), 2, this.actionBar.getBackButton()), org.telegram.messenger.g0.L(2.0f), f10));
        }
        if (this.J1 == 2) {
            this.f43557f0.setProgressToExpand(f10);
            org.telegram.ui.Components.tf0 tf0Var = this.f43519a0;
            if (tf0Var != null) {
                tf0Var.setParentExpanded(f10);
            }
            c5(f10);
            org.telegram.ui.Components.og0 og0Var = this.f43535c0;
            if (og0Var != null) {
                og0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.xu0 xu0Var = this.T;
            if (xu0Var != null) {
                xu0Var.setParentExpanded(f10);
            }
            q5();
            I5();
        }
        this.f43518a.setAlpha(f10);
        this.f43518a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.J1 != 2 || (w02 = this.f43646s0) == 0) {
            if (this.f43550e1 == 0) {
                if (org.telegram.messenger.v3.S(this.currentAccount, this.f43558f1)) {
                    boolean z10 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.h6 h6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.b9.L;
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29290a7, h6Var);
        }
        int i10 = this.f43540c5;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, this.A0);
        }
        this.f43543d1.setBackgroundColor(i0.a.f(f10, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.l01 l01Var = this.m0;
        int f11 = i0.a.f(f10, i10, w02);
        l01Var.f37019k = true;
        l01Var.f37012b.setColor(f11);
        int i11 = -1;
        if (this.f43616n6 != null) {
            w03 = -1;
        } else {
            if (this.f43550e1 == 0) {
                if (org.telegram.messenger.v3.S(this.currentAccount, this.f43558f1)) {
                    boolean z11 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.h6 h6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.b9.L;
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29404g8, h6Var2);
        }
        this.actionBar.G(i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, this.A0), w03), false);
        if (this.f43616n6 == null) {
            i11 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29522mi, this.A0);
        }
        int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.A0);
        pk pkVar = this.f43556f;
        if (pkVar != null && this.J1 != 2) {
            pkVar.setTextColor(i0.a.f(f10, w05, i11));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29636si, this.A0);
        } else {
            if (this.f43550e1 == 0) {
                if (org.telegram.messenger.v3.S(this.currentAccount, this.f43558f1)) {
                    boolean z12 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.h6 h6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.b9.L;
            w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29422h8, h6Var3);
        }
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.m6.f29571pa;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.m6.w0(i7, this.A0);
        cv0 cv0Var = this.f43637r;
        if (cv0Var != null && this.J1 != 2) {
            cv0Var.setTextColor(i0.a.f(f10, w06, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f10;
        long j3 = this.f43550e1;
        if (j3 == 0) {
            j3 = this.f43558f1;
        }
        org.telegram.ui.ActionBar.h6 h6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.b9.L;
        int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[org.telegram.ui.Components.b9.e(j3)], h6Var4);
        long j10 = this.f43550e1;
        if (j10 == 0) {
            j10 = this.f43558f1;
        }
        int d = org.telegram.ui.Components.b9.d(j10);
        if (w07 != d) {
            this.f43630q0.h(i0.a.f(f10, d, w07));
            this.f43557f0.invalidate();
        }
        int i12 = this.f43546d5;
        if (i12 != 0) {
            setNavigationBarColor(i0.a.f(f10, i12, getNavigationBarColor()));
        }
        this.f43543d1.invalidate();
        B4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        gw0 gw0Var = this.f43590j6;
        if (gw0Var != null) {
            gw0Var.invalidate();
        }
        if (a() > 0) {
            av0 av0Var = this.f43557f0;
            if (av0Var != null) {
                av0Var.setProgressToStoriesInsets(this.T1);
            }
            dv0 dv0Var = this.f43665v0;
            if (dv0Var != null) {
                dv0Var.setProgressToStoriesInsets(this.T1);
            }
            di.t0 t0Var = this.f43673w0;
            if (t0Var != null) {
                t0Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.r4 r4Var) {
        super.setParentLayout(r4Var);
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
            this.Y1 = null;
        }
        if (r4Var != null && r4Var.getParentActivity() != null) {
            this.Y1 = new org.telegram.messenger.n6(r4Var.getParentActivity().getWindow(), new ut0(this, 8));
        }
    }

    @Override
    public final boolean t() {
        return this.f43584i6;
    }

    public final org.telegram.ui.Components.mr t4() {
        int i7;
        float f10;
        if (this.J == null) {
            this.f43688y = org.telegram.ui.ActionBar.m6.Q1.getConstantState().newDrawable().mutate();
            this.I = org.telegram.ui.ActionBar.m6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.cp cpVar = this.f43616n6;
            if (cpVar != null) {
                if (cpVar.o(org.telegram.ui.ActionBar.m6.I.q())) {
                    i7 = this.f43616n6.k();
                } else {
                    i7 = this.f43616n6.i();
                }
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.m6.b(0.1f, f10, i7);
                Drawable drawable = this.f43688y;
                int S0 = org.telegram.messenger.g0.S0(this.W5, 1.0f, b10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.I.setColorFilter(org.telegram.messenger.g0.S0(this.W5, 1.0f, -1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.A0)), mode);
            }
            this.J = new org.telegram.ui.Components.mr(new org.telegram.ui.Components.oq(this.f43688y, this.I), getParentActivity().getDrawable(2131232795));
        }
        return this.J;
    }

    public final void t5() {
        boolean z10;
        hi.l3 l3Var = this.H6;
        if (l3Var != null) {
            float f10 = 0.0f;
            l3Var.p(0.0f, (this.f43556f.getScaleX() * this.f43556f.getRightDrawableX()) + this.f43556f.getX() + (-l3Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.g0.U1(this.f43605m2, this.f43612n2);
            hi.l3 l3Var2 = this.H6;
            l3Var2.setTranslationY(((this.f43556f.getY() + (-l3Var2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
            this.H6.j(i0.a.f(U1, this.I6, 1342177280));
            if (this.Q1 >= org.telegram.messenger.g0.L(82.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean bool = this.J6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.H6.animate();
            this.J6 = Boolean.valueOf(z10);
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.messenger.o10.o(animate.alpha(f10), org.telegram.ui.Components.nr.f37918g, 200L);
        }
    }

    public final boolean u4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i7 = 0;
        if (!this.f43648s2 || (userFull = this.f43675w2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url == null) {
            ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
            int size = arrayList.size();
            while (i7 < size) {
                TLRPC.BotCommand botCommand = arrayList.get(i7);
                i7++;
                if ("privacy".equals(botCommand.command)) {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final void u5() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().q()) {
                this.V0.setIcon(2131231863);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231864);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.A0), PorterDuff.Mode.SRC_IN));
            this.W6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232171);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new fi.c2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final void v() {
        this.f43518a.y0(0);
    }

    public final void v4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43619o2 = z10;
    }

    public final void v5() {
        w5(this.f43609m6);
    }

    public final boolean w4() {
        if (this.F2 != null) {
            return getMessagesController().r2(this.F2);
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f43675w2;
        messagesController.getClass();
        return org.telegram.messenger.np.Q2(userFull);
    }

    public final void w5(float f10) {
        int S0;
        org.telegram.messenger.cp cpVar = this.f43616n6;
        if (cpVar != null) {
            S0 = i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.W5, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29598qi, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.m6.Fj;
        int f12 = i0.a.f(Math.max(this.W5, this.G5), f11, org.telegram.ui.ActionBar.m6.w0(i7, this.A0));
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.n5 n5Var2 = this.H;
        if (n5Var2 != null) {
            n5Var2.k(Integer.valueOf(i0.a.f(this.W5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.m6.w0(i7, this.A0))));
        }
        this.f43549e0.setColor(f12);
        this.f43609m6 = f10;
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final boolean x4(org.telegram.ui.Components.co coVar) {
        String str;
        if (!(this.f43608m5 instanceof bn) && (coVar.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.m5)) {
            CharSequence text = ((org.telegram.ui.ActionBar.m5) coVar.getSubtitleTextView()).getText();
            String str2 = null;
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (this.f43637r.getText() != null) {
                str2 = this.f43637r.getText().toString();
            }
            return !TextUtils.equals(str, str2);
        }
        return false;
    }

    public final void x5() {
        this.f43549e0.setScaleX(this.f43556f.getScaleX());
        this.f43549e0.setScaleY(this.f43556f.getScaleY());
        this.f43549e0.b((this.f43556f.getScaleX() * this.f43556f.getRightDrawableX()) + this.f43556f.getX(), (this.f43556f.getHeight() - (this.f43556f.getScaleY() * (this.f43556f.getHeight() - this.f43556f.getRightDrawableY()))) + this.f43556f.getY());
    }

    @Override
    public final boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.n5.C(j3)) {
            k10.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.n5.E(j3)) {
            k10.putLong("user_id", j3);
        } else if (org.telegram.messenger.n5.z(j3)) {
            k10.putLong("chat_id", -j3);
        }
        if (!getMessagesController().E(k10, cxVar, null, null)) {
            return false;
        }
        org.telegram.messenger.ls notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.ls.f25348t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new bn(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.yy.g(getMessagesController().c2(Long.valueOf(this.f43550e1)), j3, null, null, null, null, z11, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.az.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z11, i7, i10);
        }
        return true;
    }

    public final boolean y4() {
        if (this.f43638r0 != null && !this.f43647s1) {
            return true;
        }
        return false;
    }

    public final void y5() {
        if (!this.f43631q1 && org.telegram.messenger.v3.c0(this.F2)) {
            org.telegram.messenger.ys notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f27214a.c(new org.telegram.messenger.d4(notificationsController, -this.f43558f1, new ou0(this), 6));
        }
    }

    public final void z4(boolean z10) {
        boolean z11;
        boolean c02 = org.telegram.messenger.v3.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        if (!c02 && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.c5.r(this, false, chat, null, false, z11, z10, !c02, new ut0(this, 3));
    }

    public final void z5(float f10) {
        mw0 mw0Var;
        ValueAnimator valueAnimator;
        if (this.f43632q2 || ((mw0Var = this.N) != null && (valueAnimator = mw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f43518a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f10);
            this.N.requestLayout();
        }
        zw0 zw0Var = this.f43543d1;
        if (zw0Var != null) {
            zw0Var.F.setTranslate(0.0f, this.f43529b2 - zw0Var.f54619y);
            zw0 zw0Var2 = this.f43543d1;
            RadialGradient radialGradient = zw0Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(zw0Var2.F);
            }
            this.f43543d1.invalidate();
        }
        x5();
        q5();
        I5();
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.bt0 bt0Var) {
        super(bundle);
        this.h = null;
        this.f43610n = null;
        this.f43681x0 = null;
        this.f43689y0 = new org.telegram.ui.Components.h40(this, 2);
        this.f43696z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.f43528b1 = 1.0f;
        this.C1 = new a0.h();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.R1 = 1.0f;
        this.Z1 = new HashMap();
        this.f43612n2 = new float[]{0.0f, 1.0f};
        this.f43640r2 = new Paint();
        this.C2 = -1;
        this.M2 = new Rect();
        this.U4 = new ArrayList();
        this.V4 = new ArrayList();
        this.W4 = 0;
        this.X4 = true;
        this.Y4 = true;
        this.f43540c5 = 0;
        this.f43546d5 = 0;
        this.f43554e5 = 0;
        this.f43562f5 = 0L;
        this.f43615n5 = new HashSet();
        this.f43628p5 = new gv0(this, 0);
        this.f43635q5 = new mv0(this);
        this.N5 = new qu0(this);
        this.R5 = 1.0f;
        this.S5 = new te.a(0, new ut0(this, 7), org.telegram.ui.Components.nr.h, 380L, true);
        this.Y5 = new gv0(this, 1);
        this.f43555e6 = new ev0(this, 2);
        this.f43563f6 = null;
        this.f43603l6 = new RectF();
        this.f43622o6 = new SparseIntArray();
        this.f43636q6 = null;
        this.f43644r6 = -1;
        this.f43679w6 = new int[3];
        this.f43687x6 = -1.0f;
        ui.b bVar = new ui.b();
        this.Q6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.R6 = cVar;
        this.T6 = new Paint();
        this.Y6 = new int[7];
        this.R = bt0Var;
        cVar.f8371g = new xe.b();
    }

    @Override
    public final void U() {
    }
}
