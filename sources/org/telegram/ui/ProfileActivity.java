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
public class ProfileActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, sw, org.telegram.ui.Components.ss0, org.telegram.ui.Components.j30, org.telegram.ui.Components.or0, ke0 {
    public static final RectF V6 = new RectF();
    public static final int W6 = org.telegram.messenger.g0.L(16.0f);
    public int A0;
    public boolean A1;
    public int A2;
    public int A3;
    public int A4;
    public FrameLayout A5;
    public float A6;
    public org.telegram.messenger.hc B0;
    public a0.h B1;
    public ArrayList B2;
    public int B3;
    public int B4;
    public fi.d B5;
    public xw0 B6;
    public int C0;
    public boolean C1;
    public TLRPC.EncryptedChat C2;
    public int C3;
    public int C4;
    public float C5;
    public ex0 C6;
    public Drawable D;
    public int D0;
    public long D1;
    public TLRPC.Chat D2;
    public int D3;
    public int D4;
    public View D5;
    public fi.m3 D6;
    public Long E;
    public int E0;
    public float E1;
    public TL_bots.BotInfo E2;
    public int E3;
    public int E4;
    public int E5;
    public int E6;
    public org.telegram.ui.Components.g5 F;
    public boolean F0;
    public boolean F1;
    public TLRPC.ChannelParticipant F2;
    public int F3;
    public int F4;
    public int F5;
    public Boolean F6;
    public org.telegram.ui.Components.g5 G;
    public boolean G0;
    public boolean G1;
    public TL_account.TL_password G2;
    public int G3;
    public int G4;
    public int G5;
    public TLRPC.TL_emojiStatusCollectible G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TLRPC.FileLocation H2;
    public int H3;
    public boolean H4;
    public int H5;
    public int H6;
    public org.telegram.ui.Components.wq I;
    public boolean I0;
    public int I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public gh.e I5;
    public boolean I6;
    public org.telegram.ui.Components.wq J;
    public final boolean[] J0;
    public boolean J1;
    public org.telegram.messenger.hc J2;
    public int J3;
    public int J4;
    public final ru0 J5;
    public int J6;
    public org.telegram.ui.Components.hk0 K;
    public boolean K0;
    public boolean K1;
    public final Rect K2;
    public int K3;
    public int K4;
    public org.telegram.ui.Components.jf0 K5;
    public int K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public org.telegram.ui.Cells.m8 L2;
    public int L3;
    public int L4;
    public float L5;
    public int L6;
    public mw0 M;
    public boolean M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public int M5;
    public final ri.b M6;
    public xv0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public float N5;
    public final dh.c N6;
    public org.telegram.ui.Components.cv0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public final te.a O5;
    public bi.g O6;
    public boolean P;
    public org.telegram.ui.ActionBar.f5 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public jv0 P5;
    public final Paint P6;
    public org.telegram.ui.Components.rs0 Q;
    public org.telegram.ui.ActionBar.f5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public AnimatorSet Q5;
    public Drawable Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.f5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public AnimatorSet R5;
    public Drawable R6;
    public org.telegram.ui.Components.nu0 S;
    public org.telegram.ui.ActionBar.f5 S0;
    public int S1;
    public int S2;
    public int S3;
    public int S4;
    public float S5;
    public Drawable S6;
    public n00 T;
    public org.telegram.ui.ActionBar.f5 T0;
    public float T1;
    public int T2;
    public int T3;
    public boolean T4;
    public boolean T5;
    public org.telegram.ui.Components.wp T6;
    public org.telegram.ui.Components.ah0 U;
    public org.telegram.ui.ActionBar.z0 U0;
    public ValueAnimator U1;
    public int U2;
    public int U3;
    public boolean U4;
    public final hv0 U5;
    public final int[] U6;
    public org.telegram.ui.Components.ah0 V;
    public org.telegram.ui.ActionBar.z0 V0;
    public boolean V1;
    public int V2;
    public int V3;
    public gv0 V4;
    public View V5;
    public fi.m3 W;
    public org.telegram.ui.ActionBar.z0 W0;
    public org.telegram.messenger.n6 W1;
    public int W2;
    public int W3;
    public View W4;
    public int W5;
    public k0 X;
    public ImageView X0;
    public final HashMap X1;
    public int X2;
    public int X3;
    public float X4;
    public int X5;
    public bi.x5 Y;
    public org.telegram.ui.ActionBar.z0 Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public CharSequence Y5;
    public org.telegram.ui.Components.ff0 Z;
    public org.telegram.messenger.re Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public boolean Z5;
    public su0 f41698a;
    public org.telegram.messenger.kp f41699a0;
    public float f41700a1;
    public float f41701a2;
    public int f41702a3;
    public int f41703a4;
    public int f41704a5;
    public final fv0 f41705a6;
    public org.telegram.ui.Components.qj0 f41706b;
    public org.telegram.ui.Components.ag0 f41707b0;
    public int f41708b1;
    public float f41709b2;
    public int f41710b3;
    public int f41711b4;
    public long f41712b5;
    public float[] f41713b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public vu0 f41714c;
    public org.telegram.ui.Components.gf0 f41715c0;
    public zw0 f41716c1;
    public float f41717c2;
    public int f41718c3;
    public int f41719c4;
    public boolean f41720c5;
    public float f41721c6;
    public lw0 d;
    public org.telegram.ui.Cells.o f41722d0;
    public long f41723d1;
    public float d2;
    public int f41724d3;
    public int f41725d4;
    public boolean f41726d5;
    public float f41727d6;
    public ww0 f41728e;
    public bv0 f41729e0;
    public long f41730e1;
    public float f41731e2;
    public int f41732e3;
    public int f41733e4;
    public String f41734e5;
    public boolean f41735e6;
    public qk f41736f;
    public AnimatorSet f41737f0;
    public long f41738f1;
    public float f41739f2;
    public int f41740f3;
    public int f41741f4;
    public String f41742f5;
    public gw0 f41743f6;
    public org.telegram.ui.Cells.b4 f41744g0;
    public boolean f41745g1;
    public float f41746g2;
    public int f41747g3;
    public int f41748g4;
    public String f41749g5;
    public float f41750g6;
    public String h;
    public ImageView f41751h0;
    public long f41752h1;
    public float f41753h2;
    public int f41754h3;
    public int f41755h4;
    public yw f41756h5;
    public final RectF f41757h6;
    public ImageView f41758i0;
    public boolean f41759i1;
    public ValueAnimator f41760i2;
    public int f41761i3;
    public int f41762i4;
    public org.telegram.ui.Components.kg f41763i5;
    public float f41764i6;
    public ImageView f41765j0;
    public boolean f41766j1;
    public float f41767j2;
    public int j3;
    public int f41768j4;
    public final HashSet f41769j5;
    public org.telegram.messenger.fp f41770j6;
    public ImageView f41771k0;
    public boolean f41772k1;
    public float f41773k2;
    public int f41774k3;
    public int f41775k4;
    public CharacterStyle f41776k5;
    public final SparseIntArray f41777k6;
    public org.telegram.ui.Components.b01 f41778l0;
    public long l1;
    public final float[] f41779l2;
    public int f41780l3;
    public int f41781l4;
    public final hv0 f41782l5;
    public int f41783l6;
    public org.telegram.ui.Components.lf0 m0;
    public boolean f41784m1;
    public boolean f41785m2;
    public int f41786m3;
    public int f41787m4;
    public final nv0 f41788m5;
    public AnimatorSet f41789m6;
    public String f41790n;
    public cv0 f41791n0;
    public boolean n1;
    public boolean f41792n2;
    public int f41793n3;
    public int f41794n4;
    public boolean f41795n5;
    public int f41796n6;
    public ow0 f41797o0;
    public boolean f41798o1;
    public boolean f41799o2;
    public int f41800o3;
    public int o4;
    public vv0 f41801o5;
    public int f41802o6;
    public org.telegram.ui.Components.w8 f41803p0;
    public boolean f41804p1;
    public final Paint f41805p2;
    public int f41806p3;
    public int f41807p4;
    public float f41808p5;
    public boolean f41809p6;
    public org.telegram.ui.Components.k30 f41810q0;
    public boolean f41811q1;
    public boolean f41812q2;
    public int f41813q3;
    public int f41814q4;
    public float f41815q5;
    public boolean f41816q6;
    public dv0 f41817r;
    public int f41818r0;
    public boolean f41819r1;
    public hi.r0 f41820r2;
    public int f41821r3;
    public int f41822r4;
    public boolean f41823r5;
    public org.telegram.ui.Components.dh0 f41824r6;
    public org.telegram.ui.Components.dh0 f41825s;
    public org.telegram.ui.Components.b01 f41826s0;
    public boolean f41827s1;
    public hi.p f41828s2;
    public int f41829s3;
    public int f41830s4;
    public boolean s5;
    public final int[] f41831s6;
    public org.telegram.ui.Components.xf0 f41832t0;
    public int f41833t1;
    public TLRPC.ChatFull f41834t2;
    public int f41835t3;
    public int f41836t4;
    public ImageReceiver f41837t5;
    public float t6;
    public ev0 f41838u0;
    public boolean f41839u1;
    public TLRPC.UserFull f41840u2;
    public int f41841u3;
    public int f41842u4;
    public FrameLayout f41843u5;
    public CharSequence f41844u6;
    public bi.g1 f41845v0;
    public boolean f41846v1;
    public org.telegram.ui.Cells.e6 f41847v2;
    public int f41848v3;
    public int f41849v4;
    public FrameLayout[] f41850v5;
    public CharSequence f41851v6;
    public AnimatorSet f41852w;
    public View f41853w0;
    public boolean f41854w1;
    public boolean f41855w2;
    public int f41856w3;
    public int f41857w4;
    public SpannableStringBuilder f41858w5;
    public boolean f41859w6;
    public Drawable f41860x;
    public final org.telegram.ui.Components.u30 f41861x0;
    public int f41862x1;
    public bx0 f41863x2;
    public int f41864x3;
    public int f41865x4;
    public SpannableStringBuilder f41866x5;
    public float f41867x6;
    public Drawable f41868y;
    public final Paint f41869y0;
    public boolean f41870y1;
    public CharSequence f41871y2;
    public int f41872y3;
    public int f41873y4;
    public fi.d[] f41874y5;
    public float f41875y6;
    public org.telegram.ui.ActionBar.g6 f41876z0;
    public boolean f41877z1;
    public long f41878z2;
    public int f41879z3;
    public int f41880z4;
    public org.telegram.messenger.video.n f41881z5;
    public float f41882z6;

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

    public static void G3(ProfileActivity profileActivity, boolean z9) {
        Drawable t6 = profileActivity.f41729e0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.e51) {
            profileActivity.f41729e0.w(null, null, t6);
        } else if (t6 instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) t6;
            profileActivity.f41729e0.w(null, null, v5Var);
            if (z9) {
                v5Var.f(profileActivity.f41729e0);
            }
        } else {
            org.telegram.messenger.hc D = profileActivity.f41791n0.D(0);
            if (D != null && D.f22878p == 2) {
                str = "avatar";
            }
            profileActivity.f41729e0.w(D, str, t6);
        }
    }

    public static int J0(ProfileActivity profileActivity) {
        int i7;
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null && kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = V6;
            if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean J0 = org.telegram.ui.Components.zs0.J0(profileActivity.N.getClosestTab());
        if (i7 == profileActivity.H6 && J0 == profileActivity.I6) {
            return;
        }
        profileActivity.H6 = i7;
        profileActivity.I6 = J0;
        if (J0) {
            if (i7 > 0) {
                profileActivity.f41874y5[0].i(org.telegram.messenger.id.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.f41874y5[0].i(profileActivity.f41866x5, true, true);
            }
        } else if (i7 <= 0 && org.telegram.messenger.qp.s1(profileActivity.currentAccount).W4()) {
            profileActivity.f41874y5[0].i(profileActivity.f41858w5, true, true);
        } else {
            profileActivity.f41874y5[0].i(org.telegram.messenger.id.G(i7, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public static ValueAnimator P0(ProfileActivity profileActivity, final boolean z9) {
        float f10;
        boolean z10;
        int i7;
        if (z9) {
            org.telegram.messenger.g0.a3(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.l3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.U1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.U1.cancel();
        }
        bi.g1 g1Var = profileActivity.f41845v0;
        if (g1Var != null) {
            g1Var.setActive(!z9);
        }
        float f11 = profileActivity.T1;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        final float f12 = profileActivity.P1;
        profileActivity.f41706b.setTranslationY(f12);
        profileActivity.f41706b.setVisibility(0);
        profileActivity.T0.setVisibility(0);
        profileActivity.f41698a.setVisibility(0);
        profileActivity.B4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f41736f.setVisibility(0);
        profileActivity.f41817r.setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.T1 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.z(z10);
        int i10 = 8;
        if (profileActivity.T1 > 0.5f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.S0;
        if (f5Var != null) {
            f5Var.setVisibility(i7);
        }
        profileActivity.T0.setVisibility(i7);
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        if (profileActivity.T1 <= 0.5f) {
            i10 = 0;
        }
        searchContainer.setVisibility(i10);
        profileActivity.f41706b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.b0(ProfileActivity.this, ofFloat, f12, z9);
            }
        });
        ofFloat.addListener(new pv0(profileActivity, z9, 0));
        if (!z9) {
            profileActivity.U4 = true;
            profileActivity.W4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40458f);
        profileActivity.U1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        boolean z9;
        int i7;
        if (profileActivity.f41792n2) {
            if (profileActivity.f41799o2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f22557m;
                } else {
                    i7 = 0;
                }
                profileActivity.f41698a.w0(0, ((view.getTop() - profileActivity.f41698a.getMeasuredWidth()) - profileActivity.e4()) + currentActionBarHeight + i7, org.telegram.ui.Components.xq.h);
                return;
            }
            profileActivity.f41698a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
            return;
        }
        if (profileActivity.e4() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            float f11 = profileActivity.P1;
            if (f11 > 0.0f && ((f11 < profileActivity.j4() * 0.6f || f10 < -1000.0f) && profileActivity.P1 > profileActivity.e4() * 0.6f)) {
                profileActivity.f41698a.w0(0, (int) (profileActivity.P1 - profileActivity.e4()), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (z9) {
            float f12 = profileActivity.P1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.f41698a.w0(0, (int) profileActivity.P1, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (!z9) {
            float f13 = profileActivity.P1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.f41698a.w0(0, (int) f13, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (profileActivity.P1 > 0.0f) {
            profileActivity.f41698a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
        }
    }

    public static SpannableStringBuilder W3(String str, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        gz gzVar = new gz(9);
        gzVar.f46104w = str;
        if (gzVar.f46098c != null) {
            gzVar.f46098c = null;
            gzVar.a();
        }
        gzVar.f46100f = w02;
        gzVar.f46101n = false;
        spannableStringBuilder.setSpan(gzVar, 0, spannableStringBuilder.length(), 0);
        gz[] gzVarArr = (gz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gz.class);
        if (gzVarArr != null) {
            for (gz gzVar2 : gzVarArr) {
                gzVar2.getClass();
                gzVar2.f46100f = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
                gzVar2.f46102r = i7;
                gzVar2.f46103s = g6Var;
                gzVar2.f46101n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(Activity activity, boolean z9) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        u1Var.f28563i0 = false;
        u1Var.show();
        Utilities.f21336e.c(new i60(u1Var, z9, activity));
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z9, boolean z10) {
        org.telegram.ui.Components.fy0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z9, z10, profileActivity.f41876z0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.cc h;
        if (profileActivity.I2 == null) {
            if (profileActivity.f41804p1 && !profileActivity.getMessagesController().D3()) {
                ArrayList l10 = profileActivity.getMessagesController().f24877q7.l(profileActivity.f41730e1);
                if (l10 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i7 = 0; tL_forumTopic == null && i7 < l10.size(); i7++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i7);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f27008id == profileActivity.f41738f1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j3 = tL_forumTopic.icon_emoji_id;
                        if (j3 != 0 && (e10 = org.telegram.ui.Components.i5.e(profileActivity.currentAccount, j3)) != null && (h = org.telegram.ui.Components.hc.a0(profileActivity).h(e10, 1, new hu0(profileActivity, 2))) != null) {
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

    public static void b0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z9) {
        int i7;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.T1 = floatValue;
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
        profileActivity.S1 = (int) ((1.0f - floatValue) * f14);
        profileActivity.f41706b.setTranslationY(floatValue * f10);
        profileActivity.O.setTranslationY(f10 * profileActivity.T1);
        profileActivity.f41698a.setTranslationY((1.0f - profileActivity.T1) * f14);
        profileActivity.f41698a.setScaleX(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f41698a.setScaleY(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f41698a.setAlpha(profileActivity.T1);
        boolean z10 = true;
        profileActivity.B4(true);
        profileActivity.f41698a.setAlpha(f11);
        profileActivity.f41706b.setAlpha(1.0f - profileActivity.T1);
        profileActivity.f41706b.setScaleX((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.f41706b.setScaleY((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f11);
        profileActivity.X.setAlpha(f11);
        profileActivity.f41729e0.setAlpha(f11);
        ev0 ev0Var = profileActivity.f41838u0;
        if (ev0Var != null) {
            ev0Var.setAlpha(f11);
        }
        profileActivity.f41736f.setAlpha(f11);
        dv0 dv0Var = profileActivity.f41817r;
        if (!profileActivity.T5) {
            f13 = f11;
        }
        dv0Var.setAlpha(f13);
        profileActivity.T0.getSearchField().setAlpha(f12);
        if (z9 && profileActivity.T1 < 0.7f) {
            org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
            if (f5Var.F.getWidth() != 0 && !f5Var.f28430e.isFocused()) {
                f5Var.f28430e.requestFocus();
                org.telegram.messenger.g0.K3(f5Var.f28430e);
            }
        }
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        int i10 = 8;
        if (profileActivity.T1 < 0.5f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        searchContainer.setVisibility(i7);
        if (profileActivity.T1 > 0.5f) {
            i10 = 0;
        }
        org.telegram.ui.ActionBar.f5 f5Var2 = profileActivity.S0;
        if (f5Var2 != null) {
            f5Var2.setVisibility(i10);
            profileActivity.S0.setAlpha(f11);
        }
        profileActivity.T0.setVisibility(i10);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.T1 >= 0.5f) {
            z10 = false;
        }
        kVar.z(z10);
        org.telegram.ui.ActionBar.f5 f5Var3 = profileActivity.S0;
        if (f5Var3 != null) {
            f5Var3.setAlpha(f11);
        }
        profileActivity.T0.setAlpha(f11);
        profileActivity.f41716c1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void b5(FrameLayout frameLayout, float f10) {
        int i7;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(W6 * f10);
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

    public static boolean d0(ProfileActivity profileActivity, boolean[] zArr, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_error tL_error) {
        boolean z10;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.qp.s1(profileActivity.currentAccount).f24764d7.edit().putLong("dialog_join_requested_time_" + profileActivity.f41752h1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.t3.T(profileActivity.D2) && !profileActivity.D2.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = org.telegram.ui.Components.c70.f32555q1;
        org.telegram.ui.Components.c70.J0(parentActivity, profileActivity, org.telegram.ui.Components.hc.a0(profileActivity), z10);
        if (!z9 || profileActivity.L4 != -1) {
            profileActivity.M5();
            lw0 lw0Var = profileActivity.d;
            if (lw0Var != null) {
                lw0Var.f();
            }
        }
        if (f2Var instanceof cn) {
            ((cn) f2Var).bc(false, true);
        }
        return false;
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.f41709b2, 0.25f) / 0.25f;
        float f10 = 1.0f;
        if (profileActivity.f41804p1) {
            profileActivity.f41832t0.setAlpha(1.0f - min);
            profileActivity.f41832t0.setBlurIntensity(0.0f);
            int i7 = 0;
            profileActivity.f41832t0.setGooeyEnabled(false);
            org.telegram.ui.Components.xf0 xf0Var = profileActivity.f41832t0;
            if (profileActivity.f41709b2 >= 1.0f) {
                i7 = 8;
            }
            xf0Var.setVisibility(i7);
        } else {
            profileActivity.f41832t0.setHideProgress(profileActivity.f41709b2);
        }
        ev0 ev0Var = profileActivity.f41838u0;
        if (ev0Var != null && profileActivity.I1 != 2) {
            float f11 = profileActivity.f41709b2;
            if (f11 > 0.0f) {
                f10 = org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f11, 0.0f, 0.5f));
            }
            ev0Var.setAlpha(f10);
        }
        profileActivity.A5();
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.l5 l5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.hc b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.f1 f1Var = new ug.f1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f41876z0);
        l5Var.getLocationOnScreen(new int[2]);
        f1Var.f56587n2 = l5Var.f27777h0;
        f1Var.f56588o2 = l5Var.f27778i0;
        f1Var.f56591r2 = l5Var.getScaleX();
        f1Var.f56589p2 = l5Var.getLeft();
        f1Var.f56590q2 = l5Var.getTop();
        f1Var.f56592s2 = l5Var;
        Drawable rightDrawable = l5Var.getRightDrawable();
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (rightDrawable == g5Var && g5Var != null) {
            Drawable drawable = g5Var.f33866f[0];
            if (drawable instanceof org.telegram.ui.Components.i5) {
                f1Var.f56591r2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.i5) drawable).f34563e;
                if (document != null) {
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(profileActivity.getParentActivity());
                    org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.l6.f28030m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.hc.b(document);
                        if (d != null) {
                            d.f25382e = 512;
                            d.f25383f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.ij.K2(document, false)) {
                            d.f25382e = 512;
                            d.f25383f = 512;
                        }
                        b10 = org.telegram.messenger.hc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.hc hcVar = b10;
                    l9Var.setLayerNum(7);
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    l9Var.m(hcVar, str2, org.telegram.messenger.hc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.i5) profileActivity.F.f33866f[0]).c()) {
                        l9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, profileActivity.f41876z0), PorterDuff.Mode.SRC_IN));
                        f1Var.f56594u2 = org.telegram.messenger.ij.i1(document);
                    } else {
                        f1Var.f56594u2 = org.telegram.messenger.ij.i1(document);
                    }
                    f1Var.f56593t2 = l9Var;
                    f1Var.f56596w2 = true;
                }
            }
        }
        profileActivity.showDialog(f1Var);
    }

    public static void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.qp.s1(profileActivity.currentAccount).l0(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
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
            hi.q3.J0(context, profileActivity.currentAccount, profileActivity.f41840u2.starref_program, profileActivity.getUserConfig().e(), profileActivity.f41876z0, false);
        } else {
            hi.q3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.f41876z0);
        }
    }

    public static void g5(org.telegram.ui.ActionBar.f5 f5Var, boolean z9, boolean z10) {
        int i7;
        if (com.google.android.recaptcha.internal.a.u(f5Var)) {
            f5Var.Y(z9, z10);
        } else if (f5Var != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            f5Var.setVisibility(i7);
        }
    }

    public static void h0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User a22;
        TLRPC.ChatParticipant chatParticipant;
        lw0 lw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f41698a.C0();
        if (i7 == profileActivity.R3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1));
            TLRPC.UserFull userFull = profileActivity.f41840u2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                bi.n0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.f41723d1, new bi.b2(profileActivity, context, e10, 3));
            } else if (a23 == null || !a23.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new hi.j(profileActivity.f41723d1));
            }
        } else if (i7 == profileActivity.P3) {
            boolean z9 = !profileActivity.getMessagesController().r2(j3, profileActivity.f41738f1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.f41738f1, z9);
            org.telegram.ui.Components.hc.A(profileActivity, z9, null).j();
            profileActivity.y5();
            int i10 = profileActivity.P3;
            if (i10 < 0 || (lw0Var = profileActivity.d) == null) {
                return;
            }
            lw0Var.g(i10);
        } else if (i7 == profileActivity.Y3) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.f27105id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f41734e5);
            bundle.putString("first_name_card", profileActivity.f41742f5);
            bundle.putString("last_name_card", profileActivity.f41749g5);
            pr prVar = new pr(bundle, profileActivity.f41876z0);
            prVar.O = new zt0(profileActivity, a24);
            profileActivity.presentFragment(prVar);
        } else if (i7 == profileActivity.V3) {
            TextView textView = (TextView) org.telegram.ui.Components.v4.f0(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131751508, null), org.telegram.messenger.id.M0(2131751592, null), org.telegram.messenger.id.M0(2131751591, null), org.telegram.messenger.id.M0(2131751598, null), new hu0(profileActivity, 1), profileActivity.f41876z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
            }
        } else if (i7 == profileActivity.W3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41876z0);
            String M0 = org.telegram.messenger.id.M0(2131746211, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131746232, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.f41712b5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.f41876z0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.id.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.id.f23157a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.id.f23157a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                c2VarArr[0].setOnClickListener(new a10(c2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746230, null), new nk0(10, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new io0(3));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28106q7, null);
            }
        } else if (i7 == profileActivity.f41814q4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f41752h1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.f2(bundle2));
        } else if (i7 == profileActivity.f41807p4) {
            profileActivity.showDialog(org.telegram.ui.Components.v4.S(profileActivity.getParentActivity(), profileActivity.C2, profileActivity.f41876z0).f27296a);
        } else if (i7 == profileActivity.M3) {
            profileActivity.I4(view, f10, f11, false);
        } else if (i7 == profileActivity.K4) {
            profileActivity.getMessagesController().f5(null, profileActivity.f41723d1);
            if (org.telegram.ui.Components.hc.a(profileActivity)) {
                org.telegram.ui.Components.hc.d(profileActivity, false).j();
            }
        } else if (i7 == profileActivity.Z3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else if (i7 == profileActivity.T3) {
            profileActivity.L4();
        } else if (i7 == profileActivity.U3) {
            ry0.K0(profileActivity.a(), profileActivity);
        } else if (i7 >= profileActivity.f41836t4 && i7 < profileActivity.f41842u4) {
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant = profileActivity.f41834t2.participants.participants.get(((Integer) profileActivity.B2.get(i7 - profileActivity.f41836t4)).intValue());
            } else {
                chatParticipant = profileActivity.f41834t2.participants.participants.get(i7 - profileActivity.f41836t4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i7 == profileActivity.f41849v4) {
            profileActivity.M4();
        } else if (i7 == profileActivity.K3) {
            profileActivity.T4(f10, f11, i7, view);
        } else if (i7 == profileActivity.f41775k4) {
            if (profileActivity.D2 != null) {
                profileActivity.showDialog(new ii.d0(profileActivity, profileActivity.D2.linked_community_id, null, null));
            } else if (profileActivity.f41723d1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1))) == null) {
            } else {
                profileActivity.showDialog(new ii.d0(profileActivity, a22.linked_community_id, null, null));
            }
        } else if (i7 == profileActivity.H3) {
            if (profileActivity.f41834t2.location instanceof TLRPC.TL_channelLocation) {
                ra0 ra0Var = new ra0(5);
                ra0Var.f49374l0 = -profileActivity.f41730e1;
                ra0Var.B0 = (TLRPC.TL_channelLocation) profileActivity.f41834t2.location;
                profileActivity.presentFragment(ra0Var);
            }
        } else if (i7 == profileActivity.L4) {
            profileActivity.H4(false);
        } else if (i7 == profileActivity.f41857w4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f41730e1);
            bundle3.putInt("type", 2);
            qq qqVar = new qq(bundle3);
            qqVar.C0(profileActivity.f41834t2);
            profileActivity.presentFragment(qqVar);
        } else if (i7 == profileActivity.f41865x4) {
            profileActivity.presentFragment(new bi.w4(profileActivity.f41730e1));
        } else if (i7 == profileActivity.f41873y4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f41730e1);
            bundle4.putInt("type", 1);
            qq qqVar2 = new qq(bundle4);
            qqVar2.C0(profileActivity.f41834t2);
            profileActivity.presentFragment(qqVar2);
        } else if (i7 == profileActivity.f41880z4) {
            profileActivity.R0.performClick();
        } else if (i7 == profileActivity.A4) {
            profileActivity.presentFragment(new bi.z(0, profileActivity.f41723d1));
        } else if (i7 == profileActivity.B4) {
            profileActivity.presentFragment(new bi.z(1, profileActivity.f41723d1));
        } else if (i7 == profileActivity.C4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f41730e1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new d51(bundle5));
        } else if (i7 == profileActivity.F4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f41730e1);
            bundle6.putInt("type", 0);
            qq qqVar3 = new qq(bundle6);
            qqVar3.C0(profileActivity.f41834t2);
            profileActivity.presentFragment(qqVar3);
        } else if (i7 == profileActivity.f41732e3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i7 == profileActivity.f41747g3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.G2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i7 == profileActivity.f41754h3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i7 == profileActivity.f41761i3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i7 == profileActivity.j3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i7 == profileActivity.f41780l3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i7 == profileActivity.f41774k3) {
            profileActivity.presentFragment(new y90());
        } else if (i7 == profileActivity.f41786m3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i7 == profileActivity.f41806p3) {
            profileActivity.showDialog(org.telegram.ui.Components.v4.R(profileActivity, profileActivity.f41876z0));
        } else if (i7 == profileActivity.f41813q3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
        } else if (i7 == profileActivity.f41821r3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
        } else if (i7 == profileActivity.f41841u3) {
            Y4(profileActivity.getParentActivity(), false);
        } else if (i7 == profileActivity.f41848v3) {
            Y4(profileActivity.getParentActivity(), true);
        } else if (i7 == profileActivity.f41856w3) {
            org.telegram.messenger.a8.a();
        } else if (i7 == profileActivity.f41864x3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41876z0);
            String M03 = org.telegram.messenger.id.M0(2131754120, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
            u1Var2.T = M03;
            u1Var2.R = org.telegram.messenger.id.M0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), new vt0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
            profileActivity.showDialog(u1Var2);
        } else if (i7 == profileActivity.f41740f3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i7 == profileActivity.U2) {
            profileActivity.presentFragment(new la(null));
        } else if (i7 == profileActivity.V2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i7 == profileActivity.S2) {
            profileActivity.presentFragment(new g(3));
        } else if (i7 == profileActivity.N2) {
            profileActivity.L4();
        } else if (i7 == profileActivity.f41711b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i7 == profileActivity.f41719c4) {
            profileActivity.presentFragment(new bi.dd());
        } else if (i7 == profileActivity.f41725d4) {
            profileActivity.presentFragment(new gi.f());
        } else if (i7 == profileActivity.f41733e4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i7 == profileActivity.f41741f4) {
            wg.f1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
        } else if (i7 == profileActivity.botPermissionLocation) {
            hi.r0 r0Var = profileActivity.f41820r2;
            if (r0Var != null) {
                r0Var.l(!r0Var.g(), new sn0(21, profileActivity, view));
            }
        } else if (i7 == profileActivity.botPermissionBiometry) {
            hi.p pVar = profileActivity.f41828s2;
            if (pVar != null) {
                pVar.f14852f = true;
                pVar.f14851e = !pVar.f14851e;
                pVar.k();
                ((org.telegram.ui.Cells.m8) view).setChecked(profileActivity.f41828s2.f14851e);
            }
        } else if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.setChecked(!m8Var.d());
            if (profileActivity.f41794n4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f41794n4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.f41723d1);
            boolean d = m8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f41840u2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new j50(22, profileActivity, r1));
            profileActivity.f41794n4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i7 == profileActivity.N3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.W4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.N3);
            int i11 = profileActivity.f41796n6;
            if (i11 >= 0) {
                profileActivity.f41714c.h1(i11, profileActivity.f41802o6 - profileActivity.f41698a.getPaddingTop());
            }
        } else if (i7 == profileActivity.O3) {
            profileActivity.Q4(false);
        } else if (i7 == profileActivity.P2) {
            if (profileActivity.f41840u2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f41840u2.personal_channel_id);
            profileActivity.presentFragment(new cn(bundle7));
        } else if (i7 == profileActivity.T2) {
            ex0 ex0Var = profileActivity.C6;
            if ((ex0Var == null || !ex0Var.a()) && !profileActivity.Z3(i7, view)) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (x8Var.d.getDrawable() != null) {
                    profileActivity.K4(x8Var.getImageView());
                }
            }
        } else if (i7 == profileActivity.G3) {
            profileActivity.Y3(i7, view);
        } else {
            profileActivity.T4(f10, f11, i7, view);
        }
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z9;
        TLRPC.VideoSize x10;
        if (tL_error == null) {
            TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.getUserConfig().e()));
            if (a22 == null) {
                a22 = profileActivity.getUserConfig().f();
                if (a22 == null) {
                    return;
                }
                profileActivity.getMessagesController().X3(a22, false, false);
            } else {
                profileActivity.getUserConfig().w(a22);
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
            a22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f26980id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && profileActivity.H2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.H2, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.H2.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(profileActivity.H2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.m(profileActivity.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.I2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.I2, null, true, true).renameTo(J2);
            }
            profileActivity.getMessagesController().U0(a22.f27105id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.f41723d1);
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(b22, false);
            }
        }
        if (!org.telegram.messenger.g0.Q1() && !profileActivity.f41785m2 && profileActivity.f41729e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            z9 = true;
        } else {
            z9 = false;
        }
        profileActivity.f41792n2 = z9;
        profileActivity.H2 = null;
        profileActivity.I2 = null;
        cv0 cv0Var = profileActivity.f41791n0;
        cv0Var.H0 = true;
        cv0Var.K0 = profileActivity.J2;
        cv0Var.f38409q1 = null;
        cv0Var.f38410r1 = null;
        cv0Var.setCreateThumbFromParent(false);
        profileActivity.L5(true);
        profileActivity.m5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.f25063r, Integer.valueOf(org.telegram.messenger.qp.C8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.f25020j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        int i7;
        if (profileActivity.Y3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.M5();
                profileActivity.d.f();
            } else {
                profileActivity.G5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (!profileActivity.f41785m2 && !org.telegram.messenger.g0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f22557m;
                } else {
                    i7 = 0;
                }
                int i10 = currentActionBarHeight + i7;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f41698a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f41698a.getMeasuredHeight(), 0);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    lw0 lw0Var = profileActivity.d;
                    if (i11 >= lw0Var.f47690e.M2) {
                        break;
                    }
                    v4.d1 a10 = lw0Var.a(null, lw0Var.d(i11));
                    View view = a10.f57056a;
                    profileActivity.d.t(a10, i11);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 += view.getMeasuredHeight();
                    i11++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i12) + i10));
                su0 su0Var = profileActivity.f41698a;
                su0Var.setPadding(0, su0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f41698a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.f41760i2.cancel();
                float[] fArr = profileActivity.f41779l2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.a5(1.0f);
                profileActivity.P1 = profileActivity.j4();
            }
        }
        profileActivity.L.m(profileActivity.f41752h1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity) {
        boolean z9;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i7;
        int w02;
        String str;
        boolean z10;
        long j3;
        final r3 r3Var;
        char c10;
        float f10;
        float f11;
        float f12;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f41840u2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(profileActivity.getParentActivity(), false, 1, null);
            org.telegram.ui.ActionBar.g2 g2Var2 = h.f28660x0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.f41876z0);
            if (profileActivity.a() != org.telegram.messenger.p10.i(profileActivity.currentAccount).e()) {
                z9 = true;
            } else {
                z9 = false;
            }
            limitPreviewView.setHideNegativeValues(z9);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            linearLayout.addView(limitPreviewView, c8.ha.t(-1, -2, 17, 0, 20, 0, 10));
            int i10 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 17, 40, -12, 40, 20));
                int i11 = 2;
                TextView[] textViewArr = new org.telegram.ui.Components.x70[2];
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i11;
                    org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(3, parentActivity, null);
                    textViewArr[i12] = jbVar;
                    jbVar.setGravity(i10);
                    textViewArr[i12].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.s6.U(textViewArr[i12], org.telegram.ui.ActionBar.l6.f28257y6, null);
                    org.telegram.ui.ActionBar.s6.G(textViewArr[i12], org.telegram.ui.ActionBar.l6.Uc, null);
                    frameLayout.addView(textViewArr[i12], c8.ha.e(-1, -1, 119));
                    TextView textView = textViewArr[i12];
                    if (i12 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    textView.setAlpha(f10);
                    TextView textView2 = textViewArr[i12];
                    if (i12 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView2.setScaleX(f11);
                    TextView textView3 = textViewArr[i12];
                    if (i12 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.8f;
                    }
                    textView3.setScaleY(f12);
                    i12++;
                    i11 = i13;
                    i10 = 17;
                }
                int i14 = i11;
                r3 r3Var2 = new r3(textViewArr, 22);
                if (profileActivity.a() == org.telegram.messenger.p10.i(profileActivity.currentAccount).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long j10 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                g2Var = g2Var2;
                if (tl_starsRating != null) {
                    j3 = tl_starsRating.stars - j10;
                } else {
                    j3 = 0;
                }
                long j11 = (-j10) - j3;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
                long j12 = userFull.stars_my_pending_rating.stars;
                long j13 = userFull.stars_rating.stars;
                long j14 = j12 - j13;
                if ((j13 < 0 && !z10) || (z10 && j11 > 0)) {
                    org.telegram.ui.ActionBar.s6.U(textViewArr[0], org.telegram.ui.ActionBar.l6.f28106q7, null);
                    if (z10) {
                        textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.H(',', "StarRatingLevelNegativeYou", (int) j11)));
                    } else {
                        textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131745172, org.telegram.messenger.m5.l(org.telegram.messenger.p10.f24470s0, profileActivity.a()))));
                    }
                    r3Var = r3Var2;
                    c10 = 0;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.id.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.id.H(',', "StarRatingFuturePendingPoints", (int) j14);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i14] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    r3Var = r3Var2;
                    c10 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131745186, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i15 = r4;
                            r3 r3Var3 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.V6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var3.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.V6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    r3Var3.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    textViewArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i15 = r4;
                            r3 r3Var3 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.V6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var3.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.V6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    r3Var3.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = org.telegram.messenger.id.H(',', "StarRatingFuturePreview1", max);
                String H4 = org.telegram.messenger.id.H(',', "StarRatingFuturePreview2", (int) j14);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = H3;
                final r3 r3Var3 = r3Var;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i14] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131745185, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i15 = r4;
                        r3 r3Var32 = r3Var3;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.V6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var32.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.V6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var32.a(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                textViewArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i15 = r4;
                        r3 r3Var32 = r3Var3;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.V6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var32.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.V6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var32.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                textViewArr[1].setText(spannableStringBuilder2);
            } else {
                g2Var = g2Var2;
            }
            TextView textView4 = new TextView(parentActivity);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setGravity(17);
            textView4.setText(org.telegram.messenger.id.M0(2131745167, null));
            textView4.setTextSize(1, 20.0f);
            int i15 = org.telegram.ui.ActionBar.l6.G6;
            org.telegram.ui.ActionBar.s6.U(textView4, i15, profileActivity.f41876z0);
            linearLayout.addView(textView4, c8.ha.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f27106id == org.telegram.messenger.p10.i(profileActivity.currentAccount).e()) {
                textView5.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131745168, null)));
                i7 = 1;
            } else {
                i7 = 1;
                org.telegram.messenger.k5.r(null, null, 2131745198, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.p10.f24470s0, profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i7, 14.0f);
            org.telegram.ui.ActionBar.s6.U(textView5, i15, profileActivity.f41876z0);
            linearLayout.addView(textView5, c8.ha.t(-1, -2, 17, 20, 0, 20, 12));
            ks0 ks0Var = new ks0(parentActivity, profileActivity.f41876z0);
            ks0Var.f47358a.l(org.telegram.messenger.id.M0(2131745166, null), false);
            String M0 = org.telegram.messenger.id.M0(2131745201, null);
            int i16 = org.telegram.ui.ActionBar.l6.Ci;
            ks0Var.f47359b.setText(org.telegram.messenger.id.V(null, null, 2131745197, W3(M0, i16, profileActivity.f41876z0)));
            ks0Var.d.setVisibility(8);
            ImageView imageView = ks0Var.f47360c;
            imageView.setImageResource(2131231827);
            org.telegram.ui.ActionBar.g6 g6Var = profileActivity.f41876z0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.s6.s(imageView, i15, g6Var, mode);
            linearLayout.addView(ks0Var, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ks0 ks0Var2 = new ks0(parentActivity, profileActivity.f41876z0);
            ks0Var2.f47358a.l(org.telegram.messenger.id.M0(2131745165, null), false);
            ks0Var2.f47359b.setText(org.telegram.messenger.id.V(null, null, 2131745196, W3(org.telegram.messenger.id.M0(2131745201, null), i16, profileActivity.f41876z0)));
            ks0Var2.d.setVisibility(8);
            ImageView imageView2 = ks0Var2.f47360c;
            imageView2.setImageResource(2131231891);
            org.telegram.ui.ActionBar.s6.s(imageView2, i15, profileActivity.f41876z0, mode);
            linearLayout.addView(ks0Var2, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ks0 ks0Var3 = new ks0(parentActivity, profileActivity.f41876z0);
            ks0Var3.f47358a.l(org.telegram.messenger.id.M0(2131745164, null), false);
            String M02 = org.telegram.messenger.id.M0(2131745199, null);
            if (org.telegram.ui.ActionBar.l6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28030m6, profileActivity.f41876z0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, profileActivity.f41876z0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            gz gzVar = new gz(9);
            gzVar.f46104w = M02;
            if (gzVar.f46098c != null) {
                str = null;
                gzVar.f46098c = null;
                gzVar.a();
            } else {
                str = null;
            }
            gzVar.f46100f = w02;
            gzVar.f46101n = false;
            spannableStringBuilder3.setSpan(gzVar, 0, spannableStringBuilder3.length(), 0);
            ks0Var3.f47359b.setText(org.telegram.messenger.id.V(str, str, 2131745195, spannableStringBuilder3));
            ks0Var3.d.setVisibility(8);
            ImageView imageView3 = ks0Var3.f47360c;
            imageView3.setImageResource(2131231875);
            org.telegram.ui.ActionBar.s6.s(imageView3, i15, profileActivity.f41876z0, mode);
            linearLayout.addView(ks0Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(parentActivity, profileActivity.f41876z0, true);
            dVar.setOnClickListener(new nu0(0, g2Var));
            dVar.i(bi.k7.f2(org.telegram.messenger.id.M0(2131743888, null)), false, true);
            linearLayout.addView(dVar, c8.ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.N = linearLayout;
            h.show();
        }
    }

    public static void l0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        switch (i7) {
            case 0:
                boolean z9 = profileActivity.f41804p1;
                if (z9) {
                    if (z9) {
                        profileActivity.c4();
                        return;
                    }
                    return;
                } else if (profileActivity.f41723d1 != 0) {
                    profileActivity.O4();
                    return;
                } else if (profileActivity.f41730e1 != 0) {
                    if (org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f41730e1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f41730e1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new cn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.c4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f41730e1);
                        if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                            profileActivity.presentFragment(new cn(bundle2), false);
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
                profileActivity.I4(profileActivity.Z, f10, f11, true);
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
                ry0.K0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.z4(false);
                return;
            case 12:
                profileActivity.getMessagesController().f24774e7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, profileActivity.getParentActivity(), profileActivity.f41876z0);
                u1Var.r(200L);
                org.telegram.messenger.qp.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.fx(21, profileActivity, u1Var), true, profileActivity.f41876z0);
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
                    org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(profileActivity, profileActivity.Z);
                    H.f35620w = false;
                    H.f35599i = 3;
                    H.c(2131232320, org.telegram.messenger.id.M0(2131746500, null), new l90(profileActivity, 25), false);
                    H.c(2131232103, org.telegram.messenger.id.M0(2131746678, null), new gf0(f12, 29), false);
                    H.c(2131232116, org.telegram.messenger.id.M0(2131746620, null), new l90(profileActivity, 26), false);
                    H.W = true;
                    H.a0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.Z.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new n31(null));
                return;
            default:
                return;
        }
    }

    public static void m0(ProfileActivity profileActivity) {
        boolean z9;
        TLRPC.Document document;
        if (profileActivity.f41699a0 == null) {
            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23739a == profileActivity.currentAccount && MediaController.B().Q0.f23740b == profileActivity.a()) {
                profileActivity.f41699a0 = MediaController.B().Q0;
            } else {
                org.telegram.messenger.kp kpVar = new org.telegram.messenger.kp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f41699a0 = kpVar;
                TLRPC.UserFull userFull = profileActivity.f41840u2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = kpVar.f23741c;
                    arrayList.clear();
                    kpVar.b();
                    arrayList.add(0, kpVar.d(document));
                }
            }
        }
        if (!profileActivity.f41699a0.f23741c.isEmpty()) {
            if (MediaController.B().Q0 == profileActivity.f41699a0 && MediaController.B().I((org.telegram.messenger.ij) profileActivity.f41699a0.f23741c.get(0))) {
                z9 = true;
            } else {
                MediaController.B().o();
                z9 = false;
            }
            MediaController.B().Q0 = profileActivity.f41699a0;
            MediaController.B().R0.clear();
            MediaController.B().R0.addAll(profileActivity.f41699a0.f23741c);
            if (!z9) {
                MediaController.B().S((org.telegram.messenger.ij) profileActivity.f41699a0.f23741c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.b8(profileActivity.getParentActivity(), profileActivity.f41876z0));
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.oa0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new l90(profileActivity, 23), profileActivity.f41876z0);
    }

    public static void o0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(profileActivity).Q(2131623989, 36, org.telegram.messenger.id.M0(2131746856, null));
            Q.f32627j = 5000;
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
                String M0 = org.telegram.messenger.id.M0(2131746852, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746853, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                profileActivity.showDialog(u1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.hc.a0(profileActivity), 2131624011, 36);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.f41723d1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.f41712b5);
        tL_messages_reportReaction.f27064id = profileActivity.f41704a5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new di.v5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f41712b5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1)));
        }
        profileActivity.f41704a5 = 0;
        profileActivity.G5(false, false);
        org.telegram.ui.Components.hc.a0(profileActivity).E(profileActivity.f41876z0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.f41723d1;
        if (j3 == 0) {
            long j10 = profileActivity.f41730e1;
            if (j10 != 0) {
                j3 = -j10;
            } else {
                j3 = profileActivity.f41752h1;
            }
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.qp.s1(profileActivity.currentAccount).W(profileActivity.f41712b5, j11);
        } else {
            org.telegram.messenger.qp.s1(profileActivity.currentAccount).h0(profileActivity.f41712b5, profileActivity.f41704a5, j11);
        }
        profileActivity.f41704a5 = 0;
        profileActivity.G5(false, false);
        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(profileActivity.getParentActivity(), profileActivity.f41876z0);
        kbVar.d(2131623981, new String[0]);
        kbVar.f35292b.setText(org.telegram.messenger.id.M0(2131746404, null));
        org.telegram.ui.Components.hc.a0(profileActivity).b(kbVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.H2 = fileLocation;
            profileActivity.I2 = photoSize2.location;
            profileActivity.f41729e0.j(org.telegram.messenger.hc.e(fileLocation), "50_50", profileActivity.f41803p0, null);
            if (profileActivity.N2 != -1) {
                profileActivity.M5();
                lw0 lw0Var = profileActivity.d;
                if (lw0Var != null) {
                    lw0Var.f();
                }
                profileActivity.B4(true);
            }
            cv0 cv0Var = profileActivity.f41791n0;
            org.telegram.messenger.hc e10 = org.telegram.messenger.hc.e(profileActivity.I2);
            profileActivity.J2 = e10;
            cv0Var.A(e10, org.telegram.messenger.hc.e(profileActivity.H2));
            profileActivity.m5(true, false);
        } else if (profileActivity.H2 == null) {
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
            profileActivity.f41783l6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new j50(21, profileActivity, str));
        }
        profileActivity.actionBar.r().requestLayout();
    }

    public static void s1(ProfileActivity profileActivity) {
        if (profileActivity.simpleActionBar != null) {
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null && kVar.getVisibility() != 4) {
                profileActivity.actionBar.setVisibility(4);
            }
            float actionModeFactor = profileActivity.simpleActionBar.getActionModeFactor();
            bi.x5 x5Var = profileActivity.Y;
            if (x5Var != null) {
                float f10 = 1.0f - actionModeFactor;
                if (x5Var.getAlpha() != f10) {
                    profileActivity.Y.setAlpha(f10);
                }
            }
        }
    }

    public static void y1(ProfileActivity profileActivity, boolean z9) {
        int i7;
        int i10;
        float f10;
        int i11 = 0;
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        profileActivity.f41698a.setVisibility(i7);
        org.telegram.ui.Components.qj0 qj0Var = profileActivity.f41706b;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        qj0Var.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        if (!z9) {
            i11 = 8;
        }
        searchContainer.setVisibility(i11);
        bi.g1 g1Var = profileActivity.f41845v0;
        if (g1Var != null) {
            g1Var.setActive(!z9);
        }
        profileActivity.actionBar.z(z9);
        profileActivity.X.setVisibility(i7);
        ev0 ev0Var = profileActivity.f41838u0;
        if (ev0Var != null) {
            ev0Var.setVisibility(i7);
        }
        profileActivity.f41736f.setVisibility(i7);
        profileActivity.f41817r.setVisibility(i7);
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.S0;
        if (f5Var != null) {
            f5Var.setAlpha(1.0f);
            profileActivity.S0.setVisibility(i7);
        }
        profileActivity.T0.setVisibility(i7);
        profileActivity.f41729e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        ev0 ev0Var2 = profileActivity.f41838u0;
        if (ev0Var2 != null) {
            ev0Var2.setAlpha(1.0f);
        }
        bi.g1 g1Var2 = profileActivity.f41845v0;
        if (g1Var2 != null) {
            g1Var2.setAlpha(1.0f);
        }
        profileActivity.f41736f.setAlpha(1.0f);
        dv0 dv0Var = profileActivity.f41817r;
        if (profileActivity.T5) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        dv0Var.setAlpha(f10);
        profileActivity.T0.setAlpha(1.0f);
        profileActivity.f41698a.setAlpha(1.0f);
        profileActivity.f41706b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z9) {
            profileActivity.f41706b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public final boolean A4() {
        if (getMessagesController().P1().K(a()) && !this.f41804p1) {
            return true;
        }
        return false;
    }

    public final void A5() {
        boolean z9;
        boolean z10;
        boolean z11;
        float a10;
        float f10 = 0.0f;
        if (!this.f41804p1 && !this.F1) {
            int e42 = e4();
            if (e42 > 0) {
                a10 = c8.j9.a(1.0f - (this.P1 / e42), 0.0f, 1.0f);
            } else {
                a10 = c8.j9.a((this.f41709b2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f10 = a10;
        }
        float f11 = this.C5;
        if (f11 != f10) {
            if (f11 > 0.5f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (f10 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.C5 = f10;
            qk qkVar = this.f41736f;
            if (qkVar != null) {
                qkVar.setTextColor(this.F5);
            }
            dv0 dv0Var = this.f41817r;
            if (dv0Var != null) {
                dv0Var.setTextColor(this.G5);
            }
            v5();
            if (z11) {
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25068r4, Boolean.TRUE);
            }
            zw0 zw0Var = this.f41716c1;
            if (zw0Var != null) {
                zw0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        D5();
        C5();
    }

    @Override
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21122a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z9) {
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float U1;
        org.telegram.ui.Components.l9 currentItemView;
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
        qk qkVar;
        int w02;
        float f21;
        int i14;
        boolean z10;
        TLRPC.ChatFull chatFull;
        int i15;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        float L3 = L3();
        su0 su0Var = this.f41698a;
        if (su0Var != null && !this.F1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) su0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f41698a.setLayoutParams(layoutParams2);
            }
        }
        R5(z9);
        if (this.X != null) {
            this.f41698a.setTopGlowOffset((int) this.P1);
            su0 su0Var2 = this.f41698a;
            if (this.P1 > j4() && this.P1 < (e4() + this.f41698a.getMeasuredWidth()) - currentActionBarHeight) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            su0Var2.setOverScrollMode(i15);
        }
        if (this.X != null && !this.f41735e6 && this.F1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.X != null) {
            if (this.Z != null && this.f41730e1 != 0) {
                if (org.telegram.messenger.t3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f41834t2) != null && chatFull.linked_chat_id != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.Z.o(2, z10);
            }
            R5(z9);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f22557m;
            } else {
                i10 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, i10) - org.telegram.messenger.g0.L(21.0f));
            if (!this.F1) {
                org.telegram.ui.Components.xf0 xf0Var = this.f41832t0;
                if (xf0Var != null) {
                    f21 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.bs bsVar = xf0Var.f40379n;
                    if (bsVar != null && bsVar.f21727c) {
                        f21 = bsVar.f21728e.centerY();
                    }
                } else {
                    f21 = -org.telegram.messenger.g0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.g0.f22557m;
                } else {
                    i14 = 0;
                }
                this.Z1 = org.telegram.messenger.g0.T1(f21, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14) - org.telegram.messenger.g0.L(21.0f)), L3);
            } else {
                this.Z1 = translationY;
            }
            if (this.F1) {
                f10 = this.Q1;
            } else {
                f10 = this.P1;
            }
            float f22 = j42;
            if (f10 <= f22 && !this.f41799o2) {
                f11 = 2.0f;
                f12 = 18.0f;
            } else {
                f11 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f10 - f22) / ((this.f41698a.getMeasuredWidth() - currentActionBarHeight) - k4())));
                this.f41746g2 = max;
                f12 = 18.0f;
                this.f41701a2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.f41709b2 = 0.0f;
                ev0 ev0Var = this.f41838u0;
                if (ev0Var != null) {
                    ev0Var.invalidate();
                }
                bi.g1 g1Var = this.f41845v0;
                if (g1Var != null) {
                    g1Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.f41753h2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z11 = this.f41792n2;
                int i16 = org.telegram.messenger.qs.f25068r4;
                float[] fArr = this.f41779l2;
                if (z11 && (this.F0 || this.f41746g2 >= 0.33f)) {
                    if (!this.f41799o2) {
                        if (this.S0 != null) {
                            if (!w4()) {
                                this.S0.S(21);
                            } else {
                                this.S0.t(21);
                            }
                            if (this.f41810q0 != null) {
                                this.S0.S(36);
                                this.S0.S(34);
                                this.S0.S(35);
                                this.S0.t(33);
                                this.S0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var = this.T0;
                        if (f5Var != null) {
                            f5Var.setEnabled(false);
                        }
                        this.f41799o2 = true;
                        org.telegram.messenger.qs.e().k(i16, Boolean.TRUE);
                        this.M.f(true, min);
                        this.f41797o0.b(min);
                        this.f41791n0.setCreateThumbFromParent(true);
                        this.f41791n0.getAdapter().g();
                        this.f41760i2.cancel();
                        fArr[0] = org.telegram.messenger.g0.U1(this.f41773k2, fArr);
                        fArr[1] = 1.0f;
                        ev0 ev0Var2 = this.f41838u0;
                        if (ev0Var2 != null && !ev0Var2.f42013x.isEmpty()) {
                            this.f41760i2.setInterpolator(new x1.a());
                            this.f41760i2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f41760i2.setInterpolator(org.telegram.ui.Components.xq.f40461j);
                            this.f41760i2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f41760i2.addListener(new fv0(this, 4));
                        View m10 = this.f41714c.m(0);
                        if (!this.O1 && m10 != null) {
                            this.N1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i11 = org.telegram.messenger.g0.f22557m;
                            } else {
                                i11 = 0;
                            }
                            this.f41698a.x0(((m10.getTop() - this.f41698a.getMeasuredWidth()) - e4()) + currentActionBarHeight2 + i11, (int) this.f41760i2.getDuration(), (Interpolator) this.f41760i2.getInterpolator());
                            this.f41698a.O0 = false;
                        }
                        this.f41721c6 = this.f41736f.getTranslationY();
                        this.f41727d6 = this.f41817r.getTranslationY();
                        this.f41760i2.start();
                        this.f41791n0.setAlpha(0.0f);
                        this.f41791n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f41791n0.getLayoutParams();
                    int i17 = layoutParams3.height;
                    layoutParams3.width = this.f41698a.getMeasuredWidth();
                    float f23 = currentActionBarHeight + f10;
                    int i18 = (int) f23;
                    layoutParams3.height = i18;
                    if (i17 != i18) {
                        this.f41791n0.requestLayout();
                    }
                    if (!this.f41760i2.isRunning()) {
                        if (this.F1 && this.I1 == 2) {
                            f13 = (-(1.0f - this.R1)) * org.telegram.messenger.g0.L(50.0f);
                        } else {
                            f13 = 0.0f;
                        }
                        this.f41736f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f41736f.getLeft());
                        this.f41736f.setTranslationY((((f23 - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f41736f.getBottom()) + f13);
                        this.f41817r.setTranslationX(m4(org.telegram.messenger.g0.N(16.0f) - this.f41817r.getLeft(), 0.0f));
                        this.f41817r.setTranslationY(n4((((f23 - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.f41817r.getBottom()) + f13));
                        t5();
                    }
                } else {
                    if (this.f41799o2) {
                        this.f41799o2 = false;
                        org.telegram.messenger.qs.e().k(i16, Boolean.TRUE);
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.S0;
                        if (f5Var2 != null) {
                            f5Var2.t(21);
                            if (this.f41810q0 != null) {
                                this.S0.t(33);
                                this.S0.t(34);
                                this.S0.t(35);
                                this.S0.S(36);
                                this.S0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var3 = this.T0;
                        if (f5Var3 != null) {
                            f5Var3.setEnabled(!this.f41870y1);
                        }
                        this.M.f(false, min);
                        this.f41797o0.b(min);
                        this.f41760i2.cancel();
                        this.f41729e0.getImageReceiver().f21220t0 = true;
                        this.f41729e0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.g0.U1(this.f41773k2, fArr);
                        fArr[1] = 0.0f;
                        this.f41760i2.setInterpolator(org.telegram.ui.Components.xq.f40461j);
                        if (!this.f41785m2) {
                            this.f41760i2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f41760i2.setDuration(0L);
                        }
                        this.f41716c1.setBackgroundColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, this.f41876z0));
                        if (!this.H0 && (currentItemView = this.f41791n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.e51) {
                                this.f41729e0.f52200a0 = false;
                            } else {
                                bv0 bv0Var = this.f41729e0;
                                bv0Var.f52200a0 = true;
                                bv0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f41760i2.addListener(new fv0(this, 5));
                        this.f41729e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.f41791n0.setAlpha(0.0f);
                        this.f41760i2.start();
                        this.O1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.X.setScaleX(this.f41701a2);
                    this.X.setScaleY(this.f41701a2);
                    d4();
                    ValueAnimator valueAnimator = this.f41760i2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        U4();
                        this.f41736f.setTranslationY(this.d2);
                        this.f41817r.setTranslationX(m4(this.f41731e2, this.f41875y6));
                        this.f41817r.setTranslationY(n4(this.f41739f2));
                        t5();
                    }
                }
            }
            boolean z12 = this.F1;
            if (z12 && this.I1 == 2) {
                float f24 = this.f41750g6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f22557m;
                } else {
                    i13 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f11) + i13) - (org.telegram.messenger.g0.f22562p * 21.0f));
                this.f41736f.setPivotY(qkVar.getMeasuredHeight());
                this.f41736f.setScaleX(1.38f);
                this.f41736f.setScaleY(1.38f);
                this.f41701a2 = org.telegram.messenger.g0.W1(this.R1, 42, 138) / 100.0f;
                this.f41709b2 = 0.0f;
                ev0 ev0Var3 = this.f41838u0;
                if (ev0Var3 != null) {
                    ev0Var3.setExpandProgress(1.0f);
                }
                bi.g1 g1Var2 = this.f41845v0;
                if (g1Var2 != null) {
                    g1Var2.setExpandProgress(1.0f);
                }
                this.f41729e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, this.R1));
                this.X.setTranslationX(org.telegram.messenger.g0.T1(f24, 0.0f, this.R1));
                this.X.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.R1));
                float measuredWidth = ((this.f41701a2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.f41751h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.f41751h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.f41758i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41758i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.f41765j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41765j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.f41771k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41771k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.X.setScaleX(this.f41701a2);
                this.X.setScaleY(this.f41701a2);
                this.f41791n0.setAlpha(0.0f);
                this.f41791n0.setVisibility(0);
                bv0 bv0Var2 = this.f41729e0;
                float f25 = this.R1;
                float f26 = this.f41701a2;
                bv0Var2.H = f25;
                bv0Var2.I = f26;
                bv0Var2.G = true;
                this.M.e(false, f25);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                int i19 = -1;
                if (this.f41770j6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28202v8, this.f41876z0);
                }
                kVar.E(i0.a.f(this.R1, w02, -1), false);
                org.telegram.ui.Components.hk0 hk0Var = this.K;
                if (hk0Var != null) {
                    hk0Var.b(i0.a.f(this.R1, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27940h8, this.f41876z0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f41860x;
                if (drawable != null) {
                    if (this.f41770j6 == null) {
                        i19 = i0.a.f(this.R1, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27871dd, this.f41876z0), -1);
                    }
                    drawable.setColorFilter(i19, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = this.I;
                if (wqVar != null) {
                    wqVar.a(this.R1);
                    this.f41736f.invalidate();
                }
                org.telegram.ui.Components.wq wqVar2 = this.J;
                if (wqVar2 != null) {
                    wqVar2.a(this.R1);
                    this.f41736f.invalidate();
                }
                w5(this.R1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.f41698a.getMeasuredWidth() / this.f41701a2, this.R1);
                layoutParams4.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.P1 + currentActionBarHeight) / this.f41701a2, this.R1);
                this.X.requestLayout();
                t5();
            } else if (f10 <= f22) {
                if (z12) {
                    this.f41701a2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.f41709b2 = 0.0f;
                    f15 = 1.0f;
                } else {
                    org.telegram.ui.Components.xf0 xf0Var2 = this.f41832t0;
                    if (xf0Var2 != null) {
                        f14 = xf0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f14 = 24.0f;
                    }
                    this.f41701a2 = org.telegram.messenger.g0.T1(f14, 96.0f, L3) / 100.0f;
                    f15 = 1.0f;
                    this.f41709b2 = 1.0f - L3;
                }
                org.telegram.ui.Components.ff0 ff0Var = this.Z;
                if (ff0Var != null) {
                    if (this.F1) {
                        ff0Var.setAlpha(this.R1);
                    } else {
                        ff0Var.setAlpha(f15);
                    }
                }
                ev0 ev0Var4 = this.f41838u0;
                if (ev0Var4 != null) {
                    ev0Var4.invalidate();
                }
                bi.g1 g1Var3 = this.f41845v0;
                if (g1Var3 != null) {
                    g1Var3.h = this.F1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (g1Var3.f3917f != l10) {
                        g1Var3.f3917f = l10;
                        g1Var3.invalidate();
                    }
                }
                if (this.F1) {
                    f16 = org.telegram.messenger.g0.T1(p4(0), 1.12f, L3);
                } else {
                    f16 = (0.12f * L3) + 1.0f;
                }
                ValueAnimator valueAnimator2 = this.f41760i2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f41760i2;
                    fv0 fv0Var = this.f41705a6;
                    valueAnimator3.removeListener(fv0Var);
                    this.f41760i2.addListener(fv0Var);
                } else {
                    this.X.setScaleX(this.f41701a2);
                    this.X.setScaleY(this.f41701a2);
                    d4();
                    this.X.setTranslationY((float) Math.ceil(this.Z1));
                    float L = (((this.f41701a2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.f41751h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                    this.f41751h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                    this.f41758i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41758i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                    this.f41765j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41765j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                    this.f41771k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41771k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.g0.N(8.0f) + (this.X.getScaleY() * this.X.getHeight());
                if (this.F1) {
                    f17 = this.R1;
                } else {
                    f17 = L3;
                }
                float f27 = (N * f17) + floor;
                this.d2 = com.google.android.recaptcha.internal.a.z(1.0f, this.R1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + f27);
                this.f41739f2 = (((float) Math.floor(org.telegram.messenger.g0.f22562p * 11.0f)) * L3) + f27 + org.telegram.messenger.g0.L(24.0f);
                if (this.F1) {
                    f18 = (this.f41750g6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                } else {
                    f18 = -org.telegram.messenger.g0.N(46.0f);
                }
                xw0 xw0Var = this.B6;
                if (xw0Var != null) {
                    xw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.f41698a.getMeasuredWidth();
                this.f41736f.setScaleX(f16);
                this.f41736f.setScaleY(f16);
                if (this.F1) {
                    f19 = org.telegram.messenger.g0.T1(p4(1), 1.0f, L3);
                } else {
                    f19 = 1.0f;
                }
                this.f41817r.setScaleX(f19);
                this.f41817r.setScaleY(f19);
                C4(0, L3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f41736f.getLayoutParams();
                float f28 = measuredWidth2 / f11;
                float min2 = f28 - (((Math.min(this.f41736f.getExactWidth(), layoutParams5.width) * f16) * 0.5f) + layoutParams5.leftMargin);
                float f29 = ((FrameLayout.LayoutParams) this.f41817r.getLayoutParams()).width;
                if (!this.f41823r5 && this.f41817r.getExactWidth() <= (f29 - this.f41817r.getPaddingLeft()) - this.f41817r.getPaddingRight()) {
                    f20 = this.f41817r.getPaddingLeft();
                } else {
                    f20 = 0.0f;
                }
                float min3 = f28 - ((Math.min(this.f41817r.getExactWidth(), f29) * 0.5f) + (layoutParams.leftMargin + f20));
                this.f41717c2 = min2;
                this.f41731e2 = min3;
                this.f41875y6 = f20;
                if (this.F1) {
                    min2 = org.telegram.messenger.g0.T1(q4(f18, 0, this.f41736f), min2, L3);
                    min3 = org.telegram.messenger.g0.T1(q4(f18, 1, this.f41817r), min3, L3);
                }
                ValueAnimator valueAnimator4 = this.f41760i2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f41736f.setTranslationX(min2);
                    this.f41736f.setTranslationY(this.d2);
                    this.f41817r.setTranslationX(m4(min3, this.f41875y6 * L3));
                    this.f41817r.setTranslationY(n4(this.f41739f2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f41736f.getLayoutParams();
                int i20 = layoutParams6.width;
                if (org.telegram.messenger.g0.Q1()) {
                    i12 = org.telegram.messenger.g0.L(490.0f);
                } else {
                    i12 = org.telegram.messenger.g0.f22563q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i12 - org.telegram.messenger.g0.L(f12)) / this.f41736f.getScaleX()) - (this.f41736f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i20) {
                    this.f41736f.requestLayout();
                }
                t5();
            }
            ValueAnimator valueAnimator5 = this.f41760i2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                C4(0, L3, true);
            }
        }
        z5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f41729e0.setAlpha(1.0f);
        }
    }

    public final void B5() {
        xv0 xv0Var = this.N;
        if (xv0Var != null && this.X5 != 0) {
            int topPanelShift = xv0Var.getTopPanelShift();
            int i7 = 0;
            if (topPanelShift > 0 && this.N.isAttachedToWindow()) {
                if (this.N.getParent() == this.f41698a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.N.getY()));
                }
                i7 = topPanelShift;
            }
            int i10 = this.X5 + i7;
            f5(i10, this.D5);
            f5(i10, this.V5);
        }
    }

    public final void C4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(int, float, boolean):void");
    }

    public final void C5() {
        boolean z9;
        float f10;
        if (this.D5 != null && this.V5 != null) {
            xv0 xv0Var = this.N;
            int i7 = 0;
            if (xv0Var != null && xv0Var.getParent() == this.f41698a && this.N.isAttachedToWindow()) {
                z9 = true;
            } else {
                z9 = false;
            }
            float max = Math.max(Math.min(this.C5, this.N5), this.S5);
            View view = this.D5;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = max;
            }
            view.setAlpha(f10);
            this.D5.setVisibility((z9 || max <= 0.0f) ? 8 : 8);
            View view2 = this.V5;
            if (!z9) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z9) {
                this.V5.setTranslationY(-(this.N.getY() + this.f41698a.getY()));
            }
        }
    }

    public final void D5() {
        if (this.simpleActionBar != null && this.I5 != null) {
            org.telegram.ui.Components.jf0 jf0Var = this.K5;
            if (jf0Var != null) {
                float l42 = l4();
                if (jf0Var.f35005l != l42) {
                    jf0Var.f35005l = l42;
                    jf0Var.a();
                }
            }
            int f10 = i0.a.f(l4(), this.E5, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.f41876z0));
            if (this.H5 != f10) {
                this.H5 = f10;
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                y4Var.f28797l0 = true;
                y4Var.f28791f0 = f10;
                y4Var.updateColors();
            }
            int e12 = this.J5.e1();
            if (this.M5 != e12) {
                this.M5 = e12;
                org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
                fh.g gVar = y4Var2.H;
                if (gVar != null) {
                    gVar.updateColors();
                    y4Var2.I.updateColors();
                    y4Var2.J.updateColors();
                }
                y4Var2.invalidate();
                org.telegram.ui.ActionBar.j5 j5Var = y4Var2.Q;
                if (j5Var != null) {
                    j5Var.invalidate();
                }
            }
        }
    }

    public final void E4(boolean z9) {
        boolean z10;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41723d1));
        if (a22 != null) {
            if (this.f41812q2 && !org.telegram.messenger.qp.F2(a22)) {
                if (this.f41766j1 && !z9) {
                    getMessagesController().f5(new l90(this, 6), this.f41723d1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.D2;
                if (this.C2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.v4.r(this, false, chat, a22, z10, true, false, true, new zt0(this, a22));
            } else if (this.f41766j1) {
                getMessagesController().f5(null, this.f41723d1);
                if (org.telegram.ui.Components.hc.a(this)) {
                    org.telegram.ui.Components.hc.d(this, false).j();
                }
            } else if (this.f41772k1) {
                org.telegram.ui.Components.v4.g0(this, this.f41723d1, a22, null, this.C2, false, null, new na(this, 3), this.f41876z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f41876z0);
                String M0 = org.telegram.messenger.id.M0(2131753692, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753693, null), new vt0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, this.f41876z0);
                }
            }
        }
    }

    public final void E5(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        xv0 xv0Var;
        if (this.S0 != null) {
            boolean z16 = false;
            if (!this.T5 && ((xv0Var = this.N) == null || !xv0Var.E0())) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z17 = this.f41799o2;
            org.telegram.ui.ActionBar.f5 f5Var = this.P0;
            if (z10 && !z17 && this.L0) {
                z11 = true;
            } else {
                z11 = false;
            }
            g5(f5Var, z11, z9);
            org.telegram.ui.ActionBar.f5 f5Var2 = this.Q0;
            if (z10 && !z17 && this.M0) {
                z12 = true;
            } else {
                z12 = false;
            }
            g5(f5Var2, z12, z9);
            org.telegram.ui.ActionBar.f5 f5Var3 = this.R0;
            if (z10 && !z17 && this.N0) {
                z13 = true;
            } else {
                z13 = false;
            }
            g5(f5Var3, z13, z9);
            xv0 xv0Var2 = this.N;
            if (xv0Var2 != null && xv0Var2.I != null && xv0Var2.v0(xv0Var2.getClosestTab()) && !this.N.E0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            org.telegram.ui.ActionBar.f5 f5Var4 = this.S0;
            if (z9 && !z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            g5(f5Var4, z10, z15);
            xv0 xv0Var3 = this.N;
            if (xv0Var3 != null) {
                boolean z18 = this.T5;
                if (z9 && !z14) {
                    z16 = true;
                }
                if (xv0Var3.f41105p2 != z18) {
                    xv0Var3.f41105p2 = z18;
                    xv0Var3.R(z9, z16);
                }
            }
        }
    }

    public final void F4(boolean z9) {
        boolean z10 = false;
        if (this.f41723d1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41723d1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.f41840u2;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                }
                org.telegram.ui.Components.voip.y1.m(a22, z9, z10, getParentActivity(), this.f41840u2, getAccountInstance());
            }
        } else if (this.f41730e1 != 0) {
            if (getMessagesController().g1(this.f41730e1, false, null) == null) {
                TLRPC.Chat chat = this.D2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.u60.J0(getParentActivity(), -chat.f26956id, accountInstance, new org.telegram.ui.Components.hr(chat, this, accountInstance, 6));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.y1.l(this.D2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void F5() {
        TLRPC.User a22;
        boolean z9;
        int i7;
        int i10;
        if (this.f41819r1 && this.W0 != null && this.V0 != null && (a22 = getMessagesController().a2(Long.valueOf(this.f41723d1))) != null) {
            int i11 = 0;
            if (org.telegram.messenger.t10.n(a22) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.W0;
            if (z9) {
                i7 = 2131231909;
            } else {
                i7 = 2131231910;
            }
            z0Var.setIcon(i7);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.W0;
            if (z9) {
                i10 = 2131746620;
            } else {
                i10 = 2131746619;
            }
            z0Var2.setText(org.telegram.messenger.id.M0(i10, null));
            org.telegram.ui.ActionBar.z0 z0Var3 = this.V0;
            if (org.telegram.messenger.t10.n(a22) == null) {
                i11 = 8;
            }
            z0Var3.setVisibility(i11);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G4() {
        TLRPC.UserFull userFull = this.f41840u2;
        if (userFull != null && org.telegram.messenger.t10.b(userFull)) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.hc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        if (this.D2 != null) {
            org.telegram.ui.Components.a30.h.a();
        }
        showDialog(new zh.g1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void G5(boolean z9, boolean z10) {
        if (this.d == null) {
            if (z9) {
                J5(false);
            }
            M5();
        } else if (!z10 && this.f41698a.isInLayout()) {
            su0 su0Var = this.f41698a;
            if (!su0Var.G) {
                return;
            }
            su0Var.post(new org.telegram.ui.Components.up0(11, this, z9));
        } else {
            zv0 zv0Var = new zv0(this);
            zv0Var.f52679b = this.M2;
            zv0Var.f(zv0Var.f52680c);
            zv0Var.f52681e.clear();
            zv0Var.f52682f.clear();
            zv0Var.f52681e.addAll(this.Q4);
            zv0Var.f52682f.addAll(this.R4);
            zv0Var.f52683g = this.f41836t4;
            zv0Var.h = this.f41842u4;
            if (z9) {
                J5(false);
            }
            W4();
            M5();
            zv0Var.f(zv0Var.d);
            try {
                v4.o.c(zv0Var, true).c(this.d);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.d.f();
            }
            int i7 = this.f41796n6;
            if (i7 >= 0) {
                this.f41714c.h1(i7, this.f41802o6 - this.f41698a.getPaddingTop());
            }
            org.telegram.messenger.g0.b4(this.f41698a);
        }
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f41744g0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.f41791n0.O(this.J2, f10);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        if (this.N != null && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int[] iArr = org.telegram.ui.Components.zs0.f41052s2;
            int z9 = org.telegram.messenger.k5.z(6.666f, oi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
            int c10 = oi.a.c(i7) + currentActionBarHeight + z9;
            this.W5 = c10;
            this.N.n1(z9, c10, oi.a.c(this.L6), this.L6 + this.J6);
            this.X5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
            B5();
            P3();
        }
    }

    public final void H4(boolean z9) {
        boolean[] zArr = {true};
        getMessagesController().m(this.D2.f26956id, getUserConfig().f(), 0, null, this, true, new i60(this, z9, zArr, 8), new a3.g(this, zArr, z9, this.parentLayout.getLastFragment(), 7), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
    }

    public final void H5() {
        int i7;
        if (this.f41707b0 != null && this.f41817r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            boolean z9 = this.F1;
            if (z9 && this.I1 == 2 && this.X != null) {
                this.f41707b0.setAlpha(this.R1);
                this.f41707b0.f(org.telegram.messenger.g0.L(74.0f) + this.f41698a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
                return;
            }
            if (z9) {
                this.f41707b0.setAlpha(this.R1);
            }
            float f10 = i10;
            float L = this.P1 + f10 + org.telegram.messenger.g0.L(74.0f);
            float min = Math.min(e4(), L - f10);
            this.f41707b0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
        }
    }

    @Override
    public final void I() {
        X4(false);
    }

    public final int I3(int i7, Boolean bool) {
        int i10;
        if (this.f41770j6 != null) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, this.f41876z0);
            int f10 = i0.a.f(0.5f, this.f41770j6.m(org.telegram.ui.ActionBar.l6.I.q()), this.f41770j6.n(org.telegram.ui.ActionBar.l6.I.q()));
            if (!org.telegram.ui.ActionBar.l6.e1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.l6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.l6.r1(0.7f, f10));
                }
                return f10;
            }
            boolean q10 = org.telegram.ui.ActionBar.l6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i10 = org.telegram.ui.ActionBar.l6.r1(0.7f, f10);
            } else {
                i10 = f10;
            }
            return org.telegram.ui.ActionBar.l6.D(q10, w02, f10, i7, i10);
        }
        return i7;
    }

    public final void I4(View view, float f10, float f11, boolean z9) {
        float f12;
        float f13;
        long j3;
        long j10 = this.f41752h1;
        if (j10 == 0) {
            j10 = this.f41723d1;
            if (j10 == 0) {
                j10 = -this.f41730e1;
            }
        }
        long j11 = j10;
        boolean r22 = getMessagesController().r2(j11, this.f41738f1, null);
        if (z9 && (this.f41804p1 || r22)) {
            boolean z10 = !r22;
            getNotificationsController().G(j11, this.f41738f1, z10);
            org.telegram.ui.Components.hc.A(this, z10, null).j();
            y5();
            this.Z.setNotifications(r22);
        } else if ((!z9 && org.telegram.messenger.id.f23157a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.id.f23157a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z11 = h5Var.f29280e.h;
            boolean z12 = !z11;
            boolean D = getNotificationsController().D(j11, null, false, false);
            String v = org.telegram.messenger.dt.v(j11, this.f41738f1, false);
            if (!z11) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f41738f1 == 0) {
                    getMessagesStorage().E1(j11, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j3 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j3 = 1;
                }
                getNotificationsController().N(j11);
                if (this.f41738f1 == 0) {
                    getMessagesStorage().E1(j11, j3);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().Q.f(j11);
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
            getNotificationsController().c0(j11, this.f41738f1, true);
            h5Var.setChecked(z12);
            org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) this.f41698a.L(this.M3, false);
            I5(true);
        } else {
            org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(getParentActivity(), this.currentAccount, null, true, new a8.ua(this, j11, 7), this.f41876z0);
            ynVar.e(j11, this.f41738f1, this.f41769j5);
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z9) {
                f13 += this.Z.getHeight() - org.telegram.messenger.g0.L(12.0f);
            }
            ynVar.d(this, view, f12, f13, z9);
        }
    }

    public final void I5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.I5(boolean):void");
    }

    public final void J3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && this.f41736f != null && this.f41716c1 != null && this.S0 != null && this.P0 != null && this.Q0 != null && this.R0 != null && this.f41797o0 != null) {
            Float valueOf = Float.valueOf(this.S5);
            hv0 hv0Var = this.U5;
            hv0Var.getClass();
            hv0Var.a(kVar, valueOf);
            if (this.S5 <= 0.0f && this.f41767j2 > 0.0f) {
                qk qkVar = this.f41736f;
                int i7 = -1;
                if (this.f41770j6 != null) {
                    f10 = -1;
                } else {
                    f10 = i0.a.f(this.f41767j2, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27986ji, this.f41876z0), -1);
                }
                qkVar.setTextColor(f10);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f41770j6 == null) {
                    i7 = i0.a.f(this.f41767j2, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28202v8, this.f41876z0), -1);
                }
                kVar2.E(i7, false);
            }
        }
    }

    public final void J4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f41723d1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41723d1));
                if (a22 != null) {
                    if (this.E2 != null && (userFull = this.f41840u2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().U2 + "/%s", this.f41840u2.about, org.telegram.messenger.t10.n(a22));
                    } else {
                        str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.t10.n(a22));
                    }
                } else {
                    return;
                }
            } else if (this.f41730e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41730e1));
                if (M0 != null) {
                    TLRPC.ChatFull chatFull = this.f41834t2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().U2 + "/%s", this.f41834t2.about, org.telegram.messenger.t3.K(M0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.t3.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131752982, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void J5(boolean z9) {
        int i7;
        TLRPC.UserStatus userStatus;
        boolean z10;
        int i10 = 0;
        this.A2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.B2.clear();
        TLRPC.ChatFull chatFull = this.f41834t2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z10 && chatFull.participants_count > 200) {
                this.A2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.f41834t2.participants.participants.size()) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41834t2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f27105id == getUserConfig().e()) && a22.status.expires > 10000)) {
                this.A2++;
            }
            this.B2.add(Integer.valueOf(i10));
            if (a22 != null) {
                if (a22.bot) {
                    i7 = -110;
                } else if (a22.self) {
                    i7 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = a22.status;
                    if (userStatus2 != null) {
                        i7 = userStatus2.expires;
                    }
                }
                i10 = com.google.android.recaptcha.internal.a.f(i7, i10, 1, arrayList);
            }
            i7 = Integer.MIN_VALUE;
            i10 = com.google.android.recaptcha.internal.a.f(i7, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.B2, Comparator$EL.reversed(Comparator$CC.comparingInt(new re(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z9 && this.d != null && this.f41836t4 > 0) {
            org.telegram.messenger.g0.b4(this.f41698a);
        }
        if (this.N != null && this.J4 != -1) {
            if ((this.B2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.N.m1(this.B2, this.f41834t2);
            }
        }
    }

    public final void K3() {
        int i7;
        int i10;
        if (this.f41713b6 != null) {
            ValueAnimator valueAnimator = this.f41760i2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41760i2.cancel();
            }
            float l10 = Utilities.l(this.P1 / this.E1);
            if (l10 > 0.0f) {
                float f10 = (l10 - 0.5f) / 0.5f;
                int i11 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f22557m;
                } else {
                    i7 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7) - org.telegram.messenger.g0.L(21.0f));
                this.f41701a2 = org.telegram.messenger.g0.T1(0.42f, this.f41713b6[0], l10);
                this.Y1 = org.telegram.messenger.g0.T1(this.f41750g6, this.f41713b6[1], l10);
                this.Z1 = org.telegram.messenger.g0.T1(translationY, this.f41713b6[2], l10);
                this.f41709b2 = org.telegram.messenger.g0.T1(this.f41713b6[11], 0.0f, l10);
                this.X.setScaleX(this.f41701a2);
                this.X.setScaleY(this.f41701a2);
                this.X.setTranslationX(this.Y1);
                this.X.setTranslationY(this.Z1);
                org.telegram.ui.Components.nu0 nu0Var = this.S;
                if (nu0Var != null) {
                    nu0Var.setAlpha(l10);
                }
                this.f41729e0.setAlpha(1.0f);
                this.X.setAlpha(1.0f);
                ev0 ev0Var = this.f41838u0;
                if (ev0Var != null) {
                    ev0Var.invalidate();
                }
                bi.g1 g1Var = this.f41845v0;
                if (g1Var != null) {
                    g1Var.f3916e = org.telegram.messenger.g0.T1(0.0f, this.f41713b6[4], f10);
                    this.f41845v0.f3917f = org.telegram.messenger.g0.T1(0.0f, this.f41713b6[5], l10);
                    bi.g1 g1Var2 = this.f41845v0;
                    g1Var2.h = true;
                    g1Var2.invalidate();
                }
                xw0 xw0Var = this.B6;
                if (xw0Var != null) {
                    xw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.f41713b6[6], l10));
                }
                float L = (((this.f41701a2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                this.f41751h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                this.f41751h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                this.f41758i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41758i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                this.f41765j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41765j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                this.f41771k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41771k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                float T1 = org.telegram.messenger.g0.T1(p4(0), this.f41713b6[7], l10);
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f22557m;
                } else {
                    i10 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (org.telegram.messenger.g0.f22562p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
                float N = org.telegram.messenger.g0.N(22.7f) + floor;
                this.d2 = org.telegram.messenger.g0.T1(floor, this.f41713b6[8], l10);
                this.f41739f2 = org.telegram.messenger.g0.T1(N, this.f41713b6[9], l10);
                float L2 = (this.f41750g6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                float T12 = org.telegram.messenger.g0.T1(q4(L2, 0, this.f41736f), this.f41713b6[12], l10);
                float T13 = org.telegram.messenger.g0.T1(q4(L2 + this.f41815q5, 1, this.f41817r) - this.f41815q5, this.f41713b6[13], l10);
                this.f41736f.setTranslationX(T12);
                this.f41736f.setTranslationY(this.d2);
                this.f41817r.setTranslationX(this.f41815q5 + T13);
                this.f41817r.setTranslationY(this.f41739f2);
                this.f41717c2 = T12;
                this.f41731e2 = T13;
                this.f41736f.setScaleX(T1);
                this.f41736f.setScaleY(T1);
                float T14 = org.telegram.messenger.g0.T1(p4(1), 1.0f, l10);
                this.f41817r.setScaleX(T14);
                this.f41817r.setScaleY(T14);
                t5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.g0.f22557m;
                }
                z5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11);
                C4((int) this.f41713b6[10], l10, true);
                org.telegram.ui.Components.ff0 ff0Var = this.Z;
                if (ff0Var != null) {
                    ff0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.f41713b6[3], f10));
                }
            }
        }
    }

    public final void K4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.K3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f41730e1);
            bundle.putLong("user_id", this.f41723d1);
            presentFragment(new ai.s0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.T2) {
            if (this.f41723d1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.t10.b(this.f41840u2)) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(this.f41723d1)), org.telegram.ui.Components.hc.a0(this), 2131624011, 36);
            } else {
                showDialog(new zh.g1(getParentActivity(), this.currentAccount, this.f41723d1, null, null));
            }
        }
    }

    public final void K5() {
        CharSequence charSequence;
        dv0 dv0Var = this.f41817r;
        if (dv0Var != null) {
            if ((!this.T5 || (charSequence = this.Y5) == null) && (!this.f41859w6 || (charSequence = this.f41851v6) == null)) {
                charSequence = this.f41844u6;
            }
            if (dv0Var.o(charSequence, !this.F1) && this.fragmentView != null) {
                B4(false);
            }
        }
    }

    public final float L3() {
        return Utilities.l((this.P1 - e4()) / k4());
    }

    public final void L4() {
        boolean z9;
        org.telegram.ui.Components.ah0 ah0Var;
        if (this.f41723d1 != 0) {
            if (this.f41810q0 != null) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(this.currentAccount).e()));
                if (a22 == null) {
                    a22 = org.telegram.messenger.p10.i(this.currentAccount).f();
                }
                if (a22 != null) {
                    org.telegram.ui.Components.k30 k30Var = this.f41810q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    k30Var.n(z9, new l90(this, 27), new q5(this, 13), 0);
                    this.U.M(0);
                    this.U.P(43);
                    this.V.M(0);
                    this.V.P(43);
                    org.telegram.ui.Components.ff0 ff0Var = this.Z;
                    if (ff0Var != null) {
                        org.telegram.ui.Components.cf0 i7 = org.telegram.ui.Components.ff0.i(14, ff0Var.f33648a);
                        if (i7 != null && (ah0Var = i7.f32661k) != null) {
                            ah0Var.start();
                        }
                    } else {
                        this.f41825s.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = this.L2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
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

    public final void L5(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.L5(boolean):void");
    }

    public final void M3() {
        int i7;
        int i10 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        this.Z1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7) - org.telegram.messenger.g0.L(21.0f));
        this.f41701a2 = 1.38f;
        float f10 = 0.0f;
        this.f41709b2 = 0.0f;
        d4();
        U4();
        C4(0, 1.0f, true);
        this.f41717c2 = (this.f41698a.getMeasuredWidth() / 2.0f) - (((this.f41736f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f41736f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f41698a.getMeasuredWidth() / 2.0f;
        int i11 = ((FrameLayout.LayoutParams) this.f41817r.getLayoutParams()).leftMargin;
        if (!this.f41823r5) {
            i10 = this.f41817r.getPaddingLeft();
        }
        this.f41731e2 = measuredWidth - ((this.f41817r.getExactWidth() * 0.5f) + (i11 + i10));
        if (!this.f41823r5) {
            f10 = this.f41817r.getPaddingLeft();
        }
        this.f41875y6 = f10;
        if (this.I1 != 2) {
            this.f41838u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.f41729e0.setAlpha(1.0f);
    }

    public final void M4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.D2.f26956id);
        y40 y40Var = new y40(k10);
        TLRPC.ChatFull chatFull = this.f41834t2;
        y40Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.f41834t2.participants.participants.size(); i7++) {
                hVar.k(null, this.f41834t2.participants.participants.get(i7).user_id);
            }
            y40Var.J = hVar;
        }
        y40Var.f51885y = new vt0(this, 0);
        presentFragment(y40Var);
    }

    public final void M5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.M5():void");
    }

    @Override
    public final boolean N(yw ywVar) {
        return false;
    }

    public final void N4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.N4(boolean):void");
    }

    public final void N5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f41765j0 != null && (imageView = this.f41771k0) != null) {
            if (this.K1 && (chat = this.D2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f41771k0.setVisibility(0);
                this.f41765j0.setTag(1);
                this.f41765j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f41771k0.setVisibility(8);
            this.f41765j0.setTag(null);
            this.f41765j0.setVisibility(8);
        }
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.Cells.b4 b4Var = this.f41744g0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    public final void O3() {
        v4.d1 d1Var;
        View view;
        int top;
        int i7;
        int i10;
        float a10;
        boolean z9;
        if (this.f41698a.getVisibility() == 0) {
            if (this.P) {
                this.N.setVisibleHeight(this.f41698a.getMeasuredHeight() - this.N.getTop());
            }
            if (this.f41698a.getChildCount() > 0 && !this.F1) {
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    d1Var = null;
                    if (i11 < this.f41698a.getChildCount()) {
                        if (RecyclerView.R(this.f41698a.getChildAt(i11)) == 0) {
                            view = this.f41698a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    su0 su0Var = this.f41698a;
                    View F = su0Var.F(view);
                    if (F != null) {
                        d1Var = su0Var.T(F);
                    }
                    d1Var = (org.telegram.ui.Components.yi0) d1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (d1Var != null) {
                    i7 = d1Var.b();
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
                    a10 = c8.j9.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
                }
                if (this.N5 != a10) {
                    this.N5 = a10;
                    C5();
                }
                if (this.f41810q0 == null && this.actionBar.f27664n0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i12 = this.J4;
                if (i12 != -1 && !z9) {
                    org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) this.f41698a.K(i12);
                    if (yi0Var != null && yi0Var.f57056a.getTop() <= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                if (this.T5 != z9) {
                    this.T5 = z9;
                    P3();
                    AnimatorSet animatorSet = this.Q5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.R5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    E5(true);
                    K5();
                    O5(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!z9) {
                        f10 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar, this.U5, f10));
                    this.N.K0.setOpen(z9);
                    if (z9) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f41782l5, 0.0f));
                    }
                    if (this.f41838u0 != null || this.f41845v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new eu0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    R3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.Q5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.Q5.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                    this.Q5.addListener(new fv0(this, 1));
                    this.Q5.setDuration(150L);
                    this.Q5.start();
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25068r4, Boolean.TRUE);
                }
                float f11 = i10;
                if (this.P1 != f11 && !this.G1) {
                    this.P1 = f11;
                    this.f41716c1.invalidate();
                    if (this.I1 != 0) {
                        if (this.P1 > e4()) {
                            z10 = true;
                        }
                        this.L1 = z10;
                    }
                    B4(true);
                }
            }
        }
    }

    public final void O4() {
        TLRPC.User a22;
        if (this.f41723d1 != 0 && !c4() && (a22 = getMessagesController().a2(Long.valueOf(this.f41723d1))) != null && !(a22 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f41723d1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z9 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.g0.Q1() && z9) {
                    org.telegram.messenger.qs notificationCenter = getNotificationCenter();
                    int i7 = org.telegram.messenger.qs.f25076t;
                    notificationCenter.n(this, i7);
                    getNotificationCenter().k(i7, new Object[0]);
                }
                int i10 = getArguments().getInt("nearby_distance", -1);
                if (i10 >= 0) {
                    bundle.putInt("nearby_distance", i10);
                }
                cn cnVar = new cn(bundle);
                org.telegram.messenger.ui mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f25855y0;
                mediaDataController.n1();
                cnVar.W9 = document;
                cnVar.X9 = false;
                presentFragment(cnVar, z9);
                if (org.telegram.messenger.g0.Q1() && !this.I0) {
                    finishFragment();
                }
            }
        }
    }

    public final void O5(boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        boolean z10;
        if ((this.f41838u0 != null || this.f41845v0 != null) && (kVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (kVar.getOccupyStatusBar()) {
                f10 = org.telegram.messenger.g0.f22557m;
            } else {
                f10 = 0.0f;
            }
            int L = org.telegram.messenger.g0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            ev0 ev0Var = this.f41838u0;
            boolean z11 = false;
            if (ev0Var != null) {
                float A = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(right - ev0Var.f41997f0) <= 0.1f && Math.abs(menuPillLeft - ev0Var.f41998g0) <= 0.1f && Math.abs(A - ev0Var.f41999h0) <= 0.1f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ev0Var.f41997f0 = right;
                ev0Var.f41998g0 = menuPillLeft;
                if (z9) {
                    ev0Var.m0.e(true, menuPillLeft);
                }
                ev0Var.f41999h0 = A;
                if (z10) {
                    ev0Var.invalidate();
                }
            }
            bi.g1 g1Var = this.f41845v0;
            if (g1Var != null) {
                float A2 = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                int k42 = k4();
                if (Math.abs(right - g1Var.f3919r) > 0.1f || Math.abs(menuPillLeft - g1Var.f3920s) > 0.1f || Math.abs(A2 - g1Var.f3921w) > 0.1f) {
                    z11 = true;
                }
                g1Var.f3919r = right;
                g1Var.f3920s = menuPillLeft;
                if (z9) {
                    g1Var.D.e(true, menuPillLeft);
                }
                g1Var.f3921w = A2;
                g1Var.f3923y = k42 + A2;
                if (z11) {
                    g1Var.invalidate();
                }
            }
        }
    }

    public final void P3() {
        int i7;
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            if (!this.T5 && this.S5 <= 0.0f) {
                i7 = 0;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            xv0Var.setPagesVisibleOverscanTop(i7);
        }
    }

    public final void P4() {
        TLRPC.ChatFull chatFull = this.f41834t2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f41834t2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new cn(bundle));
            }
        }
    }

    public final void P5() {
        try {
            n00 n00Var = this.T;
            if (n00Var != null && (n00Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.T.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f41876z0), 100));
            }
            float f10 = this.S5;
            Drawable drawable = this.D;
            int[] iArr = this.U6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f41876z0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Cj, this.f41876z0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.Q6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.V6, this.f41876z0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.R6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28202v8, this.f41876z0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.S6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.F8, this.f41876z0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.wp wpVar = this.T6;
            if (wpVar != null) {
                wpVar.f40124y = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.kk, this.f41876z0);
                if (this.f41698a != null) {
                    for (int i13 = 0; i13 < this.f41698a.getChildCount(); i13++) {
                        View childAt = this.f41698a.getChildAt(i13);
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
    public final void Q() {
        org.telegram.ui.Components.rs0 rs0Var;
        xv0 xv0Var = this.N;
        if (xv0Var != null && (rs0Var = this.Q) != null) {
            xv0Var.setNewMediaCounts(rs0Var.f37795c);
        }
        if (this.d != null) {
            G5(false, false);
        }
        V();
        if (this.f41840u2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        float alpha;
        boolean z9;
        int i7 = this.I1;
        float f10 = 0.0f;
        boolean z10 = true;
        if (i7 == 1 && (!this.f41795n5 || this.F1)) {
            this.t6 = 0.0f;
        } else if (i7 == 2 && (!this.f41795n5 || this.F1)) {
            dv0 dv0Var = this.f41817r;
            if (dv0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = dv0Var.getAlpha();
            }
            this.t6 = alpha;
        } else if (this.f41723d1 == org.telegram.messenger.p10.i(this.currentAccount).f24489n) {
            this.t6 = (1.0f - this.f41808p5) * this.f41767j2;
        } else {
            this.t6 = this.f41767j2 * this.f41808p5;
        }
        if (this.f41723d1 == org.telegram.messenger.p10.i(this.currentAccount).f24489n) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && this.f41823r5) {
            this.f41815q5 = org.telegram.messenger.g0.L(28.0f) * this.t6;
            dv0 dv0Var2 = this.f41817r;
            if (dv0Var2 != null) {
                dv0Var2.setTranslationX(m4(this.f41867x6, this.f41882z6));
                this.Y.invalidate();
            }
        }
        if (z9) {
            if (this.f41823r5) {
                f10 = this.f41767j2;
            }
        } else if (this.s5) {
            f10 = this.t6;
        }
        xw0 xw0Var = this.B6;
        if (xw0Var != null) {
            xw0Var.f51786e = 1.0f - f10;
            xw0Var.invalidateSelf();
        }
        if (f10 <= 0.5f) {
            z10 = false;
        }
        this.f41859w6 = z10;
        K5();
    }

    public final void Q4(boolean z9) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f41840u2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z9) {
                di.q8 q8Var = new di.q8(3, 1);
                q8Var.setResourceProvider(this.f41876z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().z1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f41840u2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                q8Var.P0 = false;
                q8Var.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.f24470s0, tL_message, false, false));
                presentFragment(q8Var);
                return;
            }
            boolean z10 = org.telegram.messenger.r2.f25212a;
            org.telegram.messenger.t0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f41840u2.business_location.address, new Object[0]))));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void Q5() {
        boolean z9;
        TLRPC.UserFull userFull;
        if (this.X0 == null) {
            return;
        }
        if (this.C2 == null && (((userFull = this.f41840u2) != null && userFull.ttl_period > 0) || (this.f41834t2 != null && org.telegram.messenger.t3.y(13, this.D2) && this.f41834t2.ttl_period > 0))) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.messenger.g0.Z3(this.X0, z9, 0.8f, true, this.f41795n5);
    }

    public final void R3() {
        boolean z9;
        org.telegram.ui.Components.nu0 nu0Var = this.S;
        if (nu0Var != null) {
            if (!this.T5 && this.Z5) {
                z9 = true;
            } else {
                z9 = false;
            }
            nu0Var.setVisibility(z9);
        }
    }

    public final void R4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        boolean[] zArr = new boolean[1];
        kv0 kv0Var = new kv0(this, user.f27105id, this.f41730e1, tL_chatAdminRights, this.D2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        kv0Var.X0 = new lv0(this, i7, chatParticipant, z9, zArr);
        presentFragment(kv0Var);
    }

    public final void R5(boolean z9) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        boolean z12;
        float f10;
        TLRPC.ChatFull chatFull;
        float f11 = 0.2f;
        int i11 = (L3() > 0.2f ? 1 : (L3() == 0.2f ? 0 : -1));
        int i12 = 0;
        if (i11 > 0 && !this.V1 && (this.f41810q0 == null || this.N2 == -1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z5 = z10;
        R3();
        org.telegram.ui.Components.dh0 dh0Var = this.f41825s;
        if (dh0Var != null && dh0Var.getVisibility() != 8) {
            org.telegram.ui.Components.dh0 dh0Var2 = this.f41825s;
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f22557m;
            } else {
                i10 = 0;
            }
            dh0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) + this.P1) + this.S1) - org.telegram.messenger.g0.L(29.5f));
            if (i11 > 0 && !this.V1 && !this.f41819r1 && (this.f41810q0 == null || this.N2 == -1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f41730e1 != 0) {
                if (org.telegram.messenger.t3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f41834t2) != null && chatFull.linked_chat_id != 0 && (this.C3 != -1 || this.D3 != -1)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (!this.F1) {
                if (this.f41825s.getTag() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 != z12) {
                    if (z11) {
                        this.f41825s.setTag(null);
                    } else {
                        this.f41825s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f41852w;
                    if (animatorSet != null) {
                        this.f41852w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z9) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f41852w = animatorSet2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f41852w.playTogether(ObjectAnimator.ofFloat(this.f41825s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f41825s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f41825s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f41852w.playTogether(ObjectAnimator.ofFloat(this.f41825s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f41825s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f41825s, View.ALPHA, 0.0f));
                        }
                        this.f41852w.setDuration(150L);
                        this.f41852w.addListener(new fv0(this, 3));
                        this.f41852w.start();
                    } else {
                        org.telegram.ui.Components.dh0 dh0Var3 = this.f41825s;
                        if (z11) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        dh0Var3.setScaleX(f10);
                        org.telegram.ui.Components.dh0 dh0Var4 = this.f41825s;
                        if (z11) {
                            f11 = 1.0f;
                        }
                        dh0Var4.setScaleY(f11);
                        org.telegram.ui.Components.dh0 dh0Var5 = this.f41825s;
                        if (z11) {
                            f12 = 1.0f;
                        }
                        dh0Var5.setAlpha(f12);
                    }
                }
            }
        } else {
            z11 = false;
        }
        ev0 ev0Var = this.f41838u0;
        if (ev0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            ev0Var.f42000i0 = measuredWidth;
            ev0Var.f42002k0 = z11;
            ev0Var.f42001j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7;
            ev0Var.invalidate();
        }
        bi.g1 g1Var = this.f41845v0;
        if (g1Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = org.telegram.messenger.g0.f22557m;
            }
            g1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.P1 + this.S1);
        }
    }

    public final void S3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.S3(boolean):void");
    }

    public final void S4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (f2Var instanceof cn) {
                    finishFragment();
                    ((cn) f2Var).Z.a1(null, str, false, false);
                }
            }
        } else {
            yw ywVar = new yw(null);
            ywVar.f52281o2 = str;
            presentFragment(ywVar);
        }
    }

    public final void S5() {
        org.telegram.ui.Components.vp0 vp0Var;
        org.telegram.ui.Components.vq0 vq0Var;
        org.telegram.ui.Components.x70 x70Var;
        int w02;
        int w03;
        int w04;
        int i7;
        int w05;
        int w06;
        int w07;
        this.f41777k6.clear();
        zw0 zw0Var = this.f41716c1;
        if (zw0Var != null) {
            zw0Var.a(this.f41770j6, true);
        }
        dv0 dv0Var = this.f41817r;
        if (dv0Var != null) {
            if (dv0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.l6.w0(((Integer) this.f41817r.getTag()).intValue(), this.f41876z0);
            } else {
                w07 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, this.f41876z0);
            }
            this.f41817r.setTextColor(i0.a.f(this.f41767j2, I3(w07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        xw0 xw0Var = this.B6;
        float f10 = -0.1f;
        if (xw0Var != null) {
            xw0Var.a(i0.a.f(this.f41767j2, org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.b(0.18f, -0.1f, this.f41708b1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.f41770j6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28202v8, this.f41876z0);
            }
            kVar.E(i0.a.f(this.S5, w05, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28259y8, this.f41876z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.fp fpVar = this.f41770j6;
            if (fpVar != null) {
                w06 = 1090519039;
            } else if (fpVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27905f8, this.f41876z0);
            }
            kVar2.D(i0.a.f(this.S5, w06, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28277z8, this.f41876z0)), false);
        }
        if (this.f41868y != null) {
            org.telegram.messenger.fp fpVar2 = this.f41770j6;
            if (fpVar2 != null) {
                int g10 = fpVar2.g();
                if (this.f41770j6.o(org.telegram.ui.ActionBar.l6.I.q())) {
                    i7 = this.f41770j6.k();
                } else {
                    i7 = this.f41770j6.i();
                }
                int f11 = i0.a.f(0.4f, g10, i7);
                if (!org.telegram.ui.ActionBar.l6.I.q()) {
                    f10 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.l6.b(0.1f, f10, f11);
            } else {
                w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f41876z0);
            }
            this.f41868y.setColorFilter(org.telegram.messenger.g0.S0(this.S5, 1.0f, w04, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Cj, this.f41876z0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            if (this.f41770j6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28077oi, this.f41876z0);
            }
            this.H.setColorFilter(org.telegram.messenger.g0.S0(this.S5, 1.0f, w03, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f41876z0)), PorterDuff.Mode.MULTIPLY);
        }
        qk qkVar = this.f41736f;
        if (qkVar != null) {
            if (this.f41770j6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27986ji, this.f41876z0);
            }
            qkVar.setTextColor(i0.a.f(this.f41767j2, i0.a.f(this.S5, w02, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Cj, this.f41876z0)), -1));
        }
        org.telegram.messenger.re reVar = this.Z0;
        if (reVar != null && (x70Var = (org.telegram.ui.Components.x70) reVar.f25285e) != null) {
            x70Var.invalidate();
        }
        Drawable drawable = this.f41860x;
        if (drawable != null) {
            if (this.f41770j6 == null) {
                i10 = i0.a.f(this.R1, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27871dd, this.f41876z0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.ag0 ag0Var = this.f41707b0;
        if (ag0Var != null) {
            ag0Var.setColor(this.f41770j6);
        }
        org.telegram.messenger.g0.d0(this.f41698a, new hu0(this, 3));
        xv0 xv0Var = this.N;
        if (xv0Var != null && (vq0Var = xv0Var.K0) != null) {
            vq0Var.updateColors();
        }
        xv0 xv0Var2 = this.N;
        if (xv0Var2 != null && (vp0Var = xv0Var2.f41057a0) != null) {
            vp0Var.m();
        }
        T5();
        v5();
        ev0 ev0Var = this.f41838u0;
        if (ev0Var != null) {
            ev0Var.f(true, true);
        }
        bi.g1 g1Var = this.f41845v0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    public final void T3(Context context) {
        int i7;
        this.Z0 = new org.telegram.messenger.re(context, this.S0.getPopupLayout().getSwipeBack(), new ru0(this), false, 0, this.f41876z0);
        if (this.f41752h1 > 0 || this.f41723d1 > 0) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, this.f41876z0);
            org.telegram.messenger.re reVar = this.Z0;
            org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) reVar.f25285e;
            if (x70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.id.M0(2131753847, null), w02, new org.telegram.ui.Components.xf(reVar, 10)));
                x70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f41840u2;
        if (userFull == null && this.f41834t2 == null) {
            i7 = 0;
        } else if (userFull != null) {
            i7 = userFull.ttl_period;
        } else {
            i7 = this.f41834t2.ttl_period;
        }
        org.telegram.ui.Components.b01 a10 = org.telegram.ui.Components.b01.a(i7);
        this.f41826s0 = a10;
        this.Y0 = this.S0.h(0, a10, org.telegram.messenger.id.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z0.f25283b);
        this.S0.a(-1);
        r5();
    }

    public final boolean T4(float r25, float r26, int r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.T4(float, float, int, android.view.View):boolean");
    }

    public final void T5() {
        if (this.f41825s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28023li, this.f41876z0);
                int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28040mi, this.f41876z0);
                int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28005ki, this.f41876z0);
                if (this.f41770j6 != null && org.telegram.ui.ActionBar.l6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.l6.b(0.05f, -0.04f, this.f41770j6.c(false));
                    org.telegram.messenger.fp fpVar = this.f41770j6;
                    if (fpVar != null) {
                        int d = fpVar.d(org.telegram.ui.ActionBar.l6.I.q());
                        w03 = org.telegram.ui.ActionBar.l6.D(org.telegram.ui.ActionBar.l6.I.q(), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, this.f41876z0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.dh0 dh0Var = this.f41824r6;
                org.telegram.ui.Components.dh0 dh0Var2 = this.f41825s;
                int[] iArr = this.f41831s6;
                if (dh0Var != dh0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f41824r6 = dh0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231198).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(mutate, org.telegram.ui.ActionBar.l6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    xpVar.f40447e = L;
                    xpVar.f40448f = L2;
                    this.f41825s.setBackground(xpVar);
                    this.f41825s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void U3() {
        if (this.fragmentView != null && this.f41816q6 && this.f41863x2 != null && getParentActivity() != null) {
            ex0 ex0Var = this.C6;
            if (ex0Var != null) {
                ex0Var.b(this.f41863x2);
                this.C6.invalidate();
                return;
            }
            ex0 ex0Var2 = new ex0(this, this.f41863x2);
            this.C6 = ex0Var2;
            ((FrameLayout) this.fragmentView).addView(ex0Var2, c8.ha.e(-1, -1, 55));
        }
    }

    public final void U4() {
        int i7;
        ValueAnimator valueAnimator;
        if (this.f41799o2 && (valueAnimator = this.f41760i2) != null && valueAnimator.isRunning()) {
            this.d2 = this.f41721c6;
            this.f41739f2 = this.f41727d6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        V4(L3(), currentActionBarHeight + i7);
    }

    @Override
    public final void V() {
        int i7;
        String str;
        int size;
        int i10;
        xv0 xv0Var = this.N;
        if (xv0Var != null && this.f41817r != null) {
            int closestTab = xv0Var.getClosestTab();
            int[] iArr = this.Q.f37795c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        i5(org.telegram.messenger.id.M0(2131745409, null));
                    } else {
                        i5(org.telegram.messenger.id.G(i12, "Media", new Object[0]));
                    }
                } else if (this.N.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.N.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        i5(org.telegram.messenger.id.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.id.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    i5(org.telegram.messenger.id.G(iArr[7], "Videos", new Object[0]));
                } else {
                    i5(org.telegram.messenger.id.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    i5(org.telegram.messenger.id.M0(2131750826, null));
                } else {
                    i5(org.telegram.messenger.id.G(i13, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    i5(org.telegram.messenger.id.M0(2131743523, null));
                } else {
                    i5(org.telegram.messenger.id.G(i14, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    i5(org.telegram.messenger.id.M0(2131745411, null));
                } else {
                    i5(org.telegram.messenger.id.G(i15, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    i5(org.telegram.messenger.id.M0(2131748319, null));
                } else {
                    i5(org.telegram.messenger.id.G(i16, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    i5(org.telegram.messenger.id.M0(2131754879, null));
                } else {
                    i5(org.telegram.messenger.id.G(i17, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                i5(org.telegram.messenger.id.G(this.f41840u2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                i5(this.f41817r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.zs0.J0(closestTab)) {
                if (closestTab == 13) {
                    i5(this.N.f0(true));
                } else if (closestTab == 9) {
                    i5(org.telegram.messenger.id.G(this.N.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(this.currentAccount).L0(a());
                    if (this.f41812q2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (L0 == null) {
                        size = 0;
                    } else {
                        size = L0.f25313b.size() + L0.f25314c;
                    }
                    i5(org.telegram.messenger.id.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.vv G1 = getMessagesController().G1();
                    long a10 = a();
                    ArrayList arrayList = G1.f26218j;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i18);
                            if (uvVar.f25896a == a10) {
                                i7 = uvVar.f25899e;
                                break;
                            }
                            i18++;
                        } else {
                            i7 = 0;
                            break;
                        }
                    }
                    i5(org.telegram.messenger.id.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.vp0 vp0Var = this.N.f41057a0;
                    if (vp0Var != null) {
                        i11 = vp0Var.getGiftsCount();
                    }
                    i5(org.telegram.messenger.id.H(',', "ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i19 = iArr[8];
                    if (i19 <= 0) {
                        i5(org.telegram.messenger.id.M0(2131745403, null));
                    } else {
                        i5(org.telegram.messenger.id.H(',', "ProfilePollsCount", i19));
                    }
                }
            } else if (this.f41812q2) {
                i5(this.N.f0(false));
            } else if (this.N.m0(closestTab) > 0) {
                i5(org.telegram.messenger.id.G(this.N.m0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                i5(org.telegram.messenger.id.M0(2131746625, null));
            }
        }
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            org.telegram.messenger.g0.E2(y4Var);
        }
        ov0 ov0Var = new ov0(this, context, this.f41876z0);
        this.simpleActionBar = ov0Var;
        ov0Var.setTitlesAlpha(0.0f);
        if (!this.f41795n5 && !this.I0 && this.I1 != 0 && this.L1 && !this.M1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new pe(3, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(2131232485);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.id.M0(2131746500, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231240);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 2));
        if (!this.I0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new di.f2(6, this, backButton));
        }
    }

    public final void V4(float f10, float f11) {
        float T1;
        int i7;
        float max = Math.max(0.0f, Math.min(1.0f, (this.P1 - j4()) / ((this.f41698a.getMeasuredWidth() - f11) - k4())));
        if (this.P1 < j4() && max < 0.33f) {
            T1 = com.google.android.recaptcha.internal.a.y(f10, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * T1)) * f10) + ((float) Math.floor(translationY + (org.telegram.messenger.camera.q.b(f10, 1.0f, currentActionBarHeight, i7) - (org.telegram.messenger.g0.f22562p * 21.0f))));
        this.d2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.f41739f2 = (((float) Math.floor(org.telegram.messenger.g0.f22562p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    public final void W4() {
        su0 su0Var = this.f41698a;
        if (su0Var != null && this.f41714c != null && su0Var.getChildCount() > 0 && !this.f41809p6) {
            View view = null;
            int i7 = Integer.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f41698a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.f41698a.getChildAt(i11));
                View childAt = this.f41698a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f41796n6 = i10;
                int top = view.getTop();
                this.f41802o6 = top;
                if (this.f41796n6 == 0 && !this.f41792n2 && top > j4()) {
                    this.f41802o6 = j4();
                }
                this.f41714c.h1(i10, view.getTop() - this.f41698a.getPaddingTop());
            }
        }
    }

    @Override
    public final boolean X() {
        return this.f41877z1;
    }

    public final void X3(float f10) {
        boolean z9;
        ValueAnimator ofFloat;
        long j3;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f41789m6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f41789m6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z9) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f41861x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new eu0(this, 0));
        this.f41789m6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f41789m6;
        if (z9) {
            j3 = 150;
        } else {
            j3 = 220;
        }
        animatorSet2.setDuration(j3);
        if (!z9) {
            this.f41789m6.addListener(new fv0(this, 6));
        }
        this.f41789m6.start();
    }

    public final void X4(boolean z9) {
        int i7 = this.J4;
        if (i7 >= 0) {
            if (z9) {
                mi.m mVar = new mi.m(getParentActivity(), 2, 0.6f);
                mVar.f57225a = this.J4;
                mVar.f20111p = -this.f41698a.getPaddingTop();
                this.f41714c.w0(mVar);
                return;
            }
            this.f41714c.h1(i7, -this.f41698a.getPaddingTop());
        }
    }

    public final void Y3(int i7, View view) {
        boolean z9;
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, view);
        H.W(this.f41698a.U0(view, false));
        H.f35620w = false;
        if (this.f41840u2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        H.l(2131232103, org.telegram.messenger.id.M0(2131751767, null), new l90(this, 4), z9);
        H.c(2131232116, org.telegram.messenger.id.M0(2131751335, null), new l90(this, 5), false);
        H.c(2131232108, org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.Components.r2(this, i7, 23), true);
        H.Z();
    }

    public final boolean Z3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f41819r1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f41840u2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.f27105id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.id.M0(2131751767, null);
                String M02 = org.telegram.messenger.id.M0(2131744194, null);
                if (i7 != this.J3 && i7 != this.I3 && i7 != this.V2) {
                    if (i7 == this.N3) {
                        str = kg.c1.k0(this.currentAccount, f10, userFull.business_work_hours);
                        M0 = org.telegram.messenger.id.M0(2131746665, null);
                        M02 = org.telegram.messenger.id.M0(2131752761, null);
                    } else if (i7 == this.O3) {
                        str = userFull.business_location.address;
                        M0 = org.telegram.messenger.id.M0(2131746660, null);
                        M02 = org.telegram.messenger.id.M0(2131752693, null);
                    } else if (i7 == this.K3) {
                        str = org.telegram.messenger.t10.n(f10);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = org.telegram.messenger.id.M0(2131746678, null);
                        M02 = org.telegram.messenger.id.M0(2131743665, null);
                    } else if (i7 == this.F3) {
                        str = f10.phone;
                        M02 = org.telegram.messenger.id.M0(2131747295, null);
                    } else if (i7 == this.T2) {
                        str = UserInfoActivity.e0(this.f41840u2.birthday);
                        M02 = org.telegram.messenger.id.M0(2131753716, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i7 == this.V2) {
                        M02 = org.telegram.messenger.id.M0(2131753721, null);
                    }
                }
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, view);
                H.W(this.f41698a.U0(view, false));
                H.f35620w = false;
                H.f35599i = 3;
                if (i7 == this.O3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(2131232420, org.telegram.messenger.id.M0(2131746656, null), new l90(this, 7), false);
                    }
                    H.c(2131232213, org.telegram.messenger.id.M0(2131746658, null), new l90(this, 9), false);
                }
                if (str != null) {
                    H.c(2131232103, M0, new oc0(this, str, M02, 25), false);
                }
                if (i7 == this.N3) {
                    H.c(2131232116, org.telegram.messenger.id.M0(2131746664, null), new l90(this, 10), false);
                    H.c(2131232108, org.telegram.messenger.id.M0(2131746663, null), new Runnable(this) {
                        public final ProfileActivity f44763b;

                        {
                            this.f44763b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f44763b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.V6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.id.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.id.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.V6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.V6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.V6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.id.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.id.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.V6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.V6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.O3) {
                    H.c(2131232116, org.telegram.messenger.id.M0(2131746659, null), new l90(this, 11), false);
                    H.c(2131232108, org.telegram.messenger.id.M0(2131746657, null), new Runnable(this) {
                        public final ProfileActivity f44763b;

                        {
                            this.f44763b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f44763b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.V6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.id.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.id.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.V6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.V6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.V6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.id.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.id.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.V6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new iu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.V6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new iu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.K3) {
                    H.c(2131232116, org.telegram.messenger.id.M0(2131746620, null), new l90(this, 12), false);
                } else if (i7 != this.J3 && i7 != this.I3 && i7 != this.V2) {
                    if (i7 == this.F3) {
                        H.c(2131231894, org.telegram.messenger.id.M0(2131746646, null), new l90(this, 14), false);
                    } else if (i7 == this.T2) {
                        H.c(2131232116, org.telegram.messenger.id.M0(2131746723, null), new Runnable(this) {
                            public final ProfileActivity f43789b;

                            {
                                this.f43789b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f43789b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.V6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.fx(20, profileActivity, userFull2), new l90(profileActivity, 15), false, false, profileActivity.f41876z0).f14323b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.V6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.id.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                        u1Var.R = M03;
                                        u1Var.T = org.telegram.messenger.id.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.V6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.V6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.V6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.id.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.R = M04;
                                        u1Var2.T = org.telegram.messenger.id.M0(2131746683, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.V6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.V6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(2131232108, org.telegram.messenger.id.M0(2131746321, null), new Runnable(this) {
                            public final ProfileActivity f43789b;

                            {
                                this.f43789b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f43789b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.V6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.fx(20, profileActivity, userFull2), new l90(profileActivity, 15), false, false, profileActivity.f41876z0).f14323b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.V6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.id.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                        u1Var.R = M03;
                                        u1Var.T = org.telegram.messenger.id.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.V6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.V6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.V6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.id.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.R = M04;
                                        u1Var2.T = org.telegram.messenger.id.M0(2131746683, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.V6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.V6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == this.P2) {
                        TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                        if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                            H.c(2131232103, org.telegram.messenger.id.M0(2131746681, null), new sn0(17, this, M03), false);
                        }
                        H.c(2131232116, org.telegram.messenger.id.M0(2131746684, null), new l90(this, 8), false);
                        H.c(2131232108, org.telegram.messenger.id.M0(2131746321, null), new Runnable(this) {
                            public final ProfileActivity f43789b;

                            {
                                this.f43789b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f43789b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.V6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.fx(20, profileActivity, userFull2), new l90(profileActivity, 15), false, false, profileActivity.f41876z0).f14323b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.V6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M032 = org.telegram.messenger.id.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                        u1Var.R = M032;
                                        u1Var.T = org.telegram.messenger.id.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.V6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.V6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.V6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.id.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.R = M04;
                                        u1Var2.T = org.telegram.messenger.id.M0(2131746683, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.V6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new iu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.V6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new iu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(2131232116, org.telegram.messenger.id.M0(2131746677, null), new l90(this, 13), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Z4() {
        org.telegram.ui.Components.ff0 ff0Var = this.Z;
        if (ff0Var != null) {
            if (this.f41819r1) {
                ff0Var.E = 6;
            } else if (this.f41804p1) {
                ff0Var.E = 5;
            } else if (this.f41812q2) {
                ff0Var.E = 2;
            } else if (this.f41723d1 != 0) {
                ff0Var.E = 0;
            } else if (this.f41730e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41730e1));
                if (org.telegram.messenger.t3.T(M0)) {
                    if (org.telegram.messenger.t3.n0(M0)) {
                        this.Z.E = 3;
                        return;
                    } else if (org.telegram.messenger.t3.c0(M0)) {
                        this.Z.E = 4;
                        return;
                    } else {
                        this.Z.E = 1;
                        return;
                    }
                }
                this.Z.E = 3;
            }
        }
    }

    public final long a() {
        long j3 = this.f41752h1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.f41723d1;
        if (j10 != 0) {
            return j10;
        }
        return -this.f41730e1;
    }

    public final boolean a4() {
        v4.d1 d1Var;
        View view;
        if ((this.I0 || (!org.telegram.messenger.g0.Q1() && !this.f41785m2)) && this.f41729e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.F0 = true;
            this.f41792n2 = true;
            int i7 = 0;
            while (true) {
                d1Var = null;
                if (i7 < this.f41698a.getChildCount()) {
                    if (RecyclerView.R(this.f41698a.getChildAt(i7)) == 0) {
                        view = this.f41698a.getChildAt(i7);
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                su0 su0Var = this.f41698a;
                View F = su0Var.F(view);
                if (F != null) {
                    d1Var = su0Var.T(F);
                }
                if (d1Var != null) {
                    Integer num = (Integer) this.X1.get(Integer.valueOf(d1Var.b()));
                    if (num != null) {
                        this.O1 = true;
                        this.f41698a.w0(0, -(((this.f41698a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.xq.h);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27885e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27904f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27967ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27940h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28097pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27986ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27871dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27905f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.D2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f41834t2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i7 = 0; i7 < this.f41834t2.participants.participants.size(); i7++) {
                    TLRPC.ChatParticipant chatParticipant = this.f41834t2.participants.participants.get(i7);
                    this.B1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (this.I1 != 0 && (q4Var = this.parentLayout) != null && q4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof cn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void c5(float f10) {
        this.L5 = f10;
        org.telegram.ui.Components.jf0 jf0Var = this.K5;
        if (jf0Var != null) {
            jf0Var.b(f10);
        }
        D5();
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.N.K0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.f41770j6 = null;
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
        if (this.f41698a == null) {
            return;
        }
        float x10 = org.telegram.ui.Cells.f1.x(((FrameLayout.LayoutParams) this.X.getLayoutParams()).width, this.f41701a2, 0.5f, this.f41698a.getMeasuredWidth() / 2.0f);
        this.Y1 = x10;
        if (this.F1) {
            this.Y1 = org.telegram.messenger.g0.T1(this.f41750g6, x10, this.R1);
        }
        this.X.setTranslationX(this.Y1);
    }

    public final void d5(TLRPC.ChatFull chatFull) {
        boolean z9;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f41834t2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.l1 == 0) {
                this.l1 = -j3;
                getMediaDataController().e0(this.l1, this.classGuid, this.f41738f1);
            }
        }
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            xv0Var.setChatInfo(this.f41834t2);
        }
        cv0 cv0Var = this.f41791n0;
        if (cv0Var != null && !this.f41804p1) {
            cv0Var.setChatInfo(this.f41834t2);
        }
        ev0 ev0Var = this.f41838u0;
        if (ev0Var != null && (chatFull3 = this.f41834t2) != null) {
            ev0Var.setStories(chatFull3.stories);
        }
        bi.g1 g1Var = this.f41845v0;
        if (g1Var != null) {
            g1Var.a();
        }
        bv0 bv0Var = this.f41729e0;
        if (bv0Var != null) {
            bv0Var.setHasStories(A4());
        }
        b4();
        if (this.f41730e1 != 0) {
            boolean z10 = org.telegram.messenger.r2.f25212a;
            if (!getMessagesController().h7 && (chatFull2 = this.f41834t2) != null && chatFull2.stargifts_available) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.S0.Q(38, z9);
            org.telegram.ui.Components.ff0 ff0Var = this.Z;
            if (ff0Var != null) {
                ff0Var.o(3, z9);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        lw0 lw0Var;
        boolean z9;
        org.telegram.ui.ActionBar.q4 q4Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z10;
        TLRPC.Chat chat;
        Object[] objArr3;
        su0 su0Var;
        su0 su0Var2;
        org.telegram.ui.Components.yi0 yi0Var;
        if (i7 != org.telegram.messenger.qs.B5 && i7 != org.telegram.messenger.qs.f25054p3) {
            boolean z11 = true;
            int i11 = 0;
            r3 = false;
            boolean z12 = false;
            if (i7 == org.telegram.messenger.qs.f25063r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.qp.C8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f41723d1 != 0) {
                    if (objArr3 != null) {
                        L5(true);
                    }
                    if ((intValue & 1024) != 0 && (su0Var2 = this.f41698a) != null && (yi0Var = (org.telegram.ui.Components.yi0) su0Var2.L(this.F3, false)) != null) {
                        this.d.t(yi0Var, this.F3);
                    }
                } else if (this.f41730e1 != 0) {
                    int i13 = intValue & 8192;
                    if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i13 != 0) {
                            G5(true, false);
                        } else {
                            J5(true);
                        }
                        L5(true);
                    }
                    if (objArr3 != null && (su0Var = this.f41698a) != null) {
                        int childCount = su0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = this.f41698a.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25003g1) {
                Long l10 = (Long) objArr[0];
                if (this.f41834t2 != null && (chat = this.D2) != null && chat.f26956id == l10.longValue()) {
                    this.f41834t2.online_count = ((Integer) objArr[1]).intValue();
                    J5(true);
                    L5(false);
                }
            } else if (i7 != org.telegram.messenger.qs.O && i7 != org.telegram.messenger.qs.f24974b1) {
                if (i7 == org.telegram.messenger.qs.f24967a0) {
                    if (this.f41759i1) {
                        org.telegram.messenger.g0.h3(new sn0(15, this, objArr));
                    }
                } else if (i7 == org.telegram.messenger.qs.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.C2;
                    if (encryptedChat2 != null && encryptedChat.f26964id == encryptedChat2.f26964id) {
                        this.C2 = encryptedChat;
                        G5(false, false);
                        org.telegram.messenger.n6 n6Var = this.W1;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.f25002g0) {
                    boolean z13 = this.f41766j1;
                    if (getMessagesController().G0.indexOfKey(this.f41723d1) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f41766j1 = z10;
                    if (z13 != z10) {
                        S3(true);
                        G5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.qs.f25099w2) {
                    Long l11 = (Long) objArr[0];
                    if (this.D2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.D2;
                        if (longValue == chat2.f26956id && org.telegram.messenger.t3.w(14, chat2)) {
                            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.currentAccount).N0(l11.longValue());
                            if (N0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f41834t2;
                                if (chatFull4 != null) {
                                    N0.participants = chatFull4.participants;
                                }
                                this.f41834t2 = N0;
                            }
                            xv0 xv0Var = this.N;
                            if (xv0Var != null) {
                                xv0Var.setChatInfo(this.f41834t2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f41834t2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f41798o1) || (inputGroupCall != null && this.f41798o1))) {
                                S3(false);
                            }
                            ev0 ev0Var = this.f41838u0;
                            if (ev0Var != null && (chatFull3 = this.f41834t2) != null) {
                                ev0Var.setStories(chatFull3.stories);
                            }
                            bi.g1 g1Var = this.f41845v0;
                            if (g1Var != null) {
                                g1Var.a();
                            }
                            bv0 bv0Var = this.f41729e0;
                            if (bv0Var != null) {
                                bv0Var.setHasStories(A4());
                            }
                            if (l11.longValue() != 0) {
                                boolean z14 = org.telegram.messenger.r2.f25212a;
                                z11 = (getMessagesController().h7 || (chatFull2 = this.f41834t2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.S0.Q(38, z11);
                                org.telegram.ui.Components.ff0 ff0Var = this.Z;
                                if (ff0Var != null) {
                                    ff0Var.o(3, z11);
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f41723d1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f41723d1))) != null && chatFull6.f26957id == a22.linked_community_id) {
                        G5(true, false);
                    }
                    TLRPC.Chat chat3 = this.D2;
                    if (chat3 != null && chatFull6.f26957id == chat3.linked_community_id) {
                        G5(true, false);
                    }
                    if (chatFull6.f26957id == this.f41730e1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f41834t2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f41834t2 = chatFull6;
                        if (this.l1 == 0) {
                            long j3 = chatFull6.migrated_from_chat_id;
                            if (j3 != 0) {
                                this.l1 = -j3;
                                getMediaDataController().d0(0, this.classGuid, this.l1, this.f41738f1, true);
                            }
                        }
                        b4();
                        cv0 cv0Var = this.f41791n0;
                        if (cv0Var != null && !this.f41804p1) {
                            cv0Var.setChatInfo(this.f41834t2);
                        }
                        G5(true, false);
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41730e1));
                        if (M0 != null) {
                            this.D2 = M0;
                            S3(true);
                        }
                        org.telegram.messenger.n6 n6Var2 = this.W1;
                        if (n6Var2 != null) {
                            n6Var2.g();
                        }
                        if (this.D2.megagroup && (objArr2 != null || !booleanValue)) {
                            h4(true);
                        }
                        r5();
                        Q5();
                        ev0 ev0Var2 = this.f41838u0;
                        if (ev0Var2 != null && (chatFull = this.f41834t2) != null) {
                            ev0Var2.setStories(chatFull.stories);
                        }
                        bi.g1 g1Var2 = this.f41845v0;
                        if (g1Var2 != null) {
                            g1Var2.a();
                        }
                        bv0 bv0Var2 = this.f41729e0;
                        if (bv0Var2 != null) {
                            bv0Var2.setHasStories(A4());
                        }
                        xv0 xv0Var2 = this.N;
                        if (xv0Var2 != null) {
                            xv0Var2.setChatInfo(this.f41834t2);
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.f25076t) {
                    removeSelfFromStack(true);
                } else if (i7 == org.telegram.messenger.qs.v) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (q4Var = this.parentLayout) != null && q4Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f41723d1) {
                        this.E2 = botInfo;
                        G5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.qs.E0) {
                    if (((Long) objArr[0]).longValue() == this.f41723d1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f41840u2 = userFull;
                        org.telegram.ui.Components.nu0 nu0Var = this.S;
                        if (nu0Var != null) {
                            nu0Var.set(userFull.stars_rating);
                        }
                        ev0 ev0Var3 = this.f41838u0;
                        if (ev0Var3 != null) {
                            ev0Var3.setStories(this.f41840u2.stories);
                        }
                        bi.g1 g1Var3 = this.f41845v0;
                        if (g1Var3 != null) {
                            g1Var3.a();
                        }
                        bv0 bv0Var3 = this.f41729e0;
                        if (bv0Var3 != null) {
                            bv0Var3.setHasStories(A4());
                        }
                        xv0 xv0Var3 = this.N;
                        if (xv0Var3 != null) {
                            xv0Var3.setUserInfo(this.f41840u2);
                        }
                        if (this.f41810q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f41840u2.about, this.f41871y2)) {
                                this.d.g(this.V2);
                            }
                            if (this.f41819r1) {
                                G5(false, false);
                            }
                        } else {
                            if (!this.F1 && !this.K0) {
                                S3(true);
                            } else {
                                this.H1 = true;
                            }
                            G5(false, false);
                            xv0 xv0Var4 = this.N;
                            if (xv0Var4 != null) {
                                xv0Var4.setCommonGroupsCount(this.f41840u2.common_chats_count);
                                V();
                                org.telegram.ui.Components.rs0 rs0Var = this.Q;
                                if (rs0Var == null || rs0Var.D) {
                                    resumeDelayedFragmentAnimation();
                                    B4(true);
                                }
                            }
                        }
                        r5();
                        Q5();
                        if (this.f41847v2 == null && !y4()) {
                            org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(this.currentAccount);
                            this.f41847v2 = e6Var;
                            l90 l90Var = new l90(this, 17);
                            if (e6Var.f29073c) {
                                l90Var.run();
                            } else {
                                e6Var.h.add(l90Var);
                            }
                            this.f41847v2.d(this.f41840u2);
                        }
                        if (!y4()) {
                            bx0 bx0Var = this.f41863x2;
                            bx0 c10 = bx0.c(this.currentAccount, this.f41840u2, bx0Var);
                            this.f41863x2 = c10;
                            if (c10 != bx0Var) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f41855w2 = z9;
                            if (c10 != null) {
                                l90 l90Var2 = new l90(this, 18);
                                if (c10.f44153b) {
                                    l90Var2.run();
                                } else {
                                    c10.h.add(l90Var2);
                                }
                            }
                        }
                        if (this.S0 != null) {
                            if (u4()) {
                                this.S0.S(44);
                            } else {
                                this.S0.t(44);
                            }
                            TLRPC.UserFull userFull2 = this.f41840u2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z12 = true;
                            }
                            this.S0.Q(46, z12);
                            this.S0.Q(47, !z12);
                        }
                    }
                } else if (i7 != org.telegram.messenger.qs.f25025k0) {
                    if (i7 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i15);
                                if (this.C2 != null) {
                                    TLRPC.MessageAction messageAction = ijVar.f23262k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (lw0Var = this.d) != null) {
                                        lw0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i7 == org.telegram.messenger.qs.f25018i4) {
                        su0 su0Var3 = this.f41698a;
                        if (su0Var3 != null) {
                            su0Var3.g1();
                        }
                    } else if (i7 == org.telegram.messenger.qs.f25108x4) {
                        G5(false, false);
                    } else if (i7 == org.telegram.messenger.qs.f25072s1) {
                        int i16 = this.f41710b3;
                        int i17 = this.Z2;
                        int i18 = this.X2;
                        M5();
                        lw0 lw0Var2 = this.d;
                        if (lw0Var2 != null) {
                            if (i16 != this.f41710b3 || i17 != this.Z2 || i18 != this.X2) {
                                lw0Var2.f();
                            }
                        }
                    } else if (i7 == org.telegram.messenger.qs.f25062q5) {
                        if (this.f41804p1) {
                            L5(false);
                        }
                    } else if (i7 == org.telegram.messenger.qs.D1) {
                        ww0 ww0Var = this.f41728e;
                        if (ww0Var != null) {
                            ww0Var.f51490c = ww0.H(this);
                            this.f41728e.f51496w.clear();
                            this.f41728e.J();
                            ww0 ww0Var2 = this.f41728e;
                            ww0Var2.I(ww0Var2.D);
                        }
                    } else if (i7 == org.telegram.messenger.qs.f24979c0) {
                        L5(false);
                    } else if (i7 != org.telegram.messenger.qs.f25095v5 && i7 != org.telegram.messenger.qs.F5) {
                        if (i7 == org.telegram.messenger.qs.f25017i3) {
                            org.telegram.ui.ActionBar.f5 f5Var = this.S0;
                            if (f5Var != null) {
                                TL_account.RequirementToContact J2 = getMessagesController().J2(this.f41723d1);
                                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                                    z11 = false;
                                }
                                f5Var.Q(20, z11);
                            }
                            u5();
                        } else if (i7 == org.telegram.messenger.qs.f25001f5) {
                            u5();
                        } else if (i7 == org.telegram.messenger.qs.f25114y3) {
                            G5(false, false);
                        } else if (i7 == org.telegram.messenger.qs.C3) {
                            G5(false, false);
                        } else if (i7 == org.telegram.messenger.qs.D3) {
                            G5(false, false);
                        } else if (i7 == org.telegram.messenger.qs.f25112y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
                                if (q4Var2 != null && q4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.f24999f3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.J4 < 0 && longValue3 == a()) {
                                M5();
                                V();
                                lw0 lw0Var3 = this.d;
                                if (lw0Var3 != null) {
                                    lw0Var3.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.G3) {
                            if (((Long) objArr[0]).longValue() == a() && !y4()) {
                                if (this.J4 < 0) {
                                    M5();
                                    V();
                                    lw0 lw0Var4 = this.d;
                                    if (lw0Var4 != null) {
                                        lw0Var4.f();
                                    }
                                    org.telegram.messenger.g0.h3(new l90(this, 19));
                                    return;
                                }
                                xv0 xv0Var5 = this.N;
                                if (xv0Var5 != null) {
                                    xv0Var5.P1(true);
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.V3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f41723d1 > 0) {
                                TLRPC.UserFull b22 = getMessagesController().b2(this.f41723d1);
                                if (b22 != null) {
                                    this.f41840u2 = b22;
                                }
                                M5();
                                V();
                                su0 su0Var4 = this.f41698a;
                                if (su0Var4 != null && su0Var4.c0()) {
                                    this.f41698a.post(new l90(this, 20));
                                    return;
                                }
                                lw0 lw0Var5 = this.d;
                                if (lw0Var5 != null) {
                                    lw0Var5.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.W3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.D2;
                            if (chat4 != null && chat4.f26956id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.B1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.F2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.Q4;
                                    if (i11 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                                        i11++;
                                    } else {
                                        org.telegram.messenger.g0.b4(this.f41698a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        bv0 bv0Var4 = this.f41729e0;
                        if (bv0Var4 != null) {
                            bv0Var4.setHasStories(A4());
                            this.f41729e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, this.f41767j2));
                        }
                        ev0 ev0Var4 = this.f41838u0;
                        if (ev0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f41840u2;
                            if (userFull3 != null) {
                                ev0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f41834t2;
                            if (chatFull8 != null) {
                                ev0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                S3(true);
            }
        } else if (org.telegram.messenger.t3.R(org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.f41730e1)))) {
            getMessagesController().P1().k(a(), new di.e(22), false, this.f41876z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null && k30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if ((k30Var == null || dialog != k30Var.f35220c) && super.dismissDialogOnPause(dialog)) {
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
        if (this.f41723d1 != 0 && this.f41810q0 != null && !this.f41819r1) {
            return 0;
        }
        return org.telegram.messenger.g0.L(74 + ((this.H4 || this.I4) ? 25 : 25));
    }

    public final void e5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y != null && (tL_emojiStatusCollectible2 = this.G6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.G6 = tL_emojiStatusCollectible;
                fi.m3 m3Var = this.D6;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.F6 = null;
                    this.D6 = new fi.m3(getParentActivity(), 3);
                    this.E6 = org.telegram.ui.ActionBar.l6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.l6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.D6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                    fi.m3 m3Var2 = this.D6;
                    int r12 = org.telegram.ui.ActionBar.l6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    m3Var2.L0 = true;
                    m3Var2.T0 = System.currentTimeMillis();
                    m3Var2.M0 = new Path();
                    m3Var2.N0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
                    m3Var2.O0 = new Paint(1);
                    m3Var2.P0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.l6.r1(0.0f, r12), org.telegram.ui.ActionBar.l6.r1(1.0f, r12), org.telegram.ui.ActionBar.l6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    m3Var2.S0 = linearGradient;
                    m3Var2.P0.setShader(linearGradient);
                    m3Var2.Q0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.l6.r1(0.0f, r12), org.telegram.ui.ActionBar.l6.r1(0.5f, r12), org.telegram.ui.ActionBar.l6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    m3Var2.R0 = new Matrix();
                    m3Var2.O0.setShader(m3Var2.Q0);
                    m3Var2.P0.setStyle(Paint.Style.STROKE);
                    m3Var2.P0.setStrokeJoin(Paint.Join.ROUND);
                    m3Var2.P0.setStrokeCap(Paint.Cap.ROUND);
                    m3Var2.P0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                    this.Y.addView(this.D6, c8.ha.c(24.0f, -1));
                    this.D6.v(9.33f);
                    fi.m3 m3Var3 = this.D6;
                    Typeface o4 = org.telegram.messenger.g0.o();
                    m3Var3.H.x(o4);
                    m3Var3.J.setTypeface(o4);
                    this.D6.u(tL_emojiStatusCollectible.title);
                    fi.m3 m3Var4 = this.D6;
                    m3Var4.d = -1L;
                    m3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
                    fi.m3 m3Var5 = this.D6;
                    m3Var5.getClass();
                    m3Var5.D = org.telegram.messenger.g0.N(4.0f);
                    m3Var5.E = org.telegram.messenger.g0.N(2.66f);
                    this.D6.t();
                    this.D6.s(16.0f);
                    this.D6.w();
                    this.D6.setOnClickListener(new ku0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.P1 < org.telegram.messenger.g0.L(82.0f)) {
                        this.F6 = Boolean.FALSE;
                        this.D6.setAlpha(0.0f);
                    }
                    t5();
                    fi.m3 m3Var6 = this.D6;
                    Objects.requireNonNull(m3Var6);
                    org.telegram.messenger.g0.i3(new qy(m3Var6, 1), 6000L);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 f() {
        return this.f41698a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof org.telegram.ui.Components.e51) {
            return ((org.telegram.ui.Components.e51) imageReceiver.t()).f33296a.a();
        }
        return org.telegram.messenger.g0.p(this.f41729e0.getImageReceiver().n());
    }

    @Override
    public final TLRPC.Chat g() {
        return this.D2;
    }

    public final org.telegram.ui.Components.g5 g4(long j3) {
        if (this.G == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(17.0f), 2, this.f41736f, false);
            this.G = g5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            g5Var.I = 0;
            g5Var.J = L;
            if (this.G0) {
                this.G.a();
            }
        }
        if (j3 != 0) {
            this.G.j(j3, false);
        } else {
            this.G.g(null, false);
        }
        v5();
        return this.G;
    }

    public float getAvatarAnimationProgress() {
        return this.R1;
    }

    @Override
    public final yq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f41876z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f41876z0 != null) {
            return null;
        }
        f6 f6Var = new f6(18, this);
        ArrayList arrayList = new ArrayList();
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            arrayList.addAll(xv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41716c1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27809a7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41729e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41803p0}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27867d8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41825s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28005ki));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41825s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28023li));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41825s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28040mi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28238x6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28086p7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28065o6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28181u6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28200v6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28275z6));
        int i7 = org.telegram.ui.ActionBar.l6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        int i10 = org.telegram.ui.ActionBar.l6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 131072, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        int i11 = org.telegram.ui.ActionBar.l6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 196608, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 131072, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 196608, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41698a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28047n6));
        if (this.T5) {
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41736f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41736f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41868y}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27865d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41736f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28077oi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41736f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41868y}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28058ni));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.l6.w0(i7, this.f41876z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41876z0;
        if (g6Var != null) {
            drawable = g6Var.getDrawable(str);
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

    public final void h4(boolean z9) {
        a0.h hVar;
        int i7;
        if (!this.A1 && (hVar = this.B1) != null && this.f41834t2 != null) {
            this.A1 = true;
            int i10 = 0;
            if (hVar.m() != 0 && z9) {
                i7 = 300;
            } else {
                i7 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().h1(this.f41730e1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z9) {
                i10 = this.B1.m();
            }
            tL_channels_getParticipants.offset = i10;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.v(this, tL_channels_getParticipants, i7)), this.classGuid);
        }
    }

    public final void h5(ew0 ew0Var) {
        if (this.f41776k5 == ew0Var) {
            return;
        }
        this.f41776k5 = ew0Var;
        org.telegram.messenger.g0.d0(this.f41698a, new hu0(this, 0));
    }

    public final org.telegram.ui.Components.g5 i4(TLRPC.EmojiStatus emojiStatus, boolean z9) {
        if (this.F == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 2, this.f41736f, false);
            this.F = g5Var;
            if (this.G0) {
                g5Var.a();
            }
        }
        if (this.F.d()) {
            z9 = false;
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(o4(), z9);
                this.F.m(false, z9);
            } else {
                this.F.j(tL_emojiStatus.document_id, z9);
                this.F.m(false, z9);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(o4(), z9);
                this.F.m(false, z9);
            } else {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z9);
                this.F.m(true, z9);
            }
        } else {
            this.F.g(o4(), z9);
            this.F.m(false, z9);
        }
        v5();
        return this.F;
    }

    public final void i5(CharSequence charSequence) {
        this.Y5 = charSequence;
        K5();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f41799o2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f41799o2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.w()) {
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28221w8, this.f41876z0);
            } else if (!this.T5 && this.C5 <= 0.5f) {
                org.telegram.messenger.fp fpVar = this.f41770j6;
                if (fpVar != null) {
                    w02 = fpVar.d(org.telegram.ui.ActionBar.l6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, this.f41876z0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f41876z0);
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
        boolean z9;
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        if (!org.telegram.messenger.g0.Q1()) {
            boolean z10 = false;
            if (i7 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.J1 = z9;
            if (i7 != 0) {
                z10 = true;
            }
            this.K1 = z10;
            N5();
            if (e12.getBoolean("view_animations", true)) {
                this.I1 = i7;
            } else if (i7 == 2) {
                this.f41784m1 = true;
            }
        }
    }

    @Override
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21122a) {
            return baseSimpleGlass.f21025i;
        }
        return null;
    }

    public final int k4() {
        if (e4() == 0) {
            return org.telegram.messenger.g0.L(168.0f);
        }
        return org.telegram.messenger.g0.L(152.0f);
    }

    public final void k5(TLRPC.UserFull userFull, org.telegram.ui.Cells.e6 e6Var, bx0 bx0Var) {
        boolean z9;
        this.f41840u2 = userFull;
        org.telegram.ui.Components.nu0 nu0Var = this.S;
        if (nu0Var != null) {
            nu0Var.set(userFull.stars_rating);
        }
        ev0 ev0Var = this.f41838u0;
        if (ev0Var != null) {
            ev0Var.setStories(this.f41840u2.stories);
        }
        bi.g1 g1Var = this.f41845v0;
        if (g1Var != null) {
            g1Var.a();
        }
        bv0 bv0Var = this.f41729e0;
        if (bv0Var != null) {
            bv0Var.setHasStories(A4());
        }
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            xv0Var.setUserInfo(this.f41840u2);
        }
        if (this.f41847v2 == null) {
            this.f41847v2 = e6Var;
        }
        if (this.f41847v2 == null) {
            this.f41847v2 = new org.telegram.ui.Cells.e6(this.currentAccount);
        }
        org.telegram.ui.Cells.e6 e6Var2 = this.f41847v2;
        l90 l90Var = new l90(this, 22);
        if (e6Var2.f29073c) {
            l90Var.run();
        } else {
            e6Var2.h.add(l90Var);
        }
        this.f41847v2.d(this.f41840u2);
        if (this.f41863x2 == null) {
            this.f41863x2 = bx0Var;
        }
        bx0 bx0Var2 = this.f41863x2;
        boolean z10 = true;
        if (bx0Var2 == null) {
            bx0 c10 = bx0.c(this.currentAccount, this.f41840u2, bx0Var2);
            this.f41863x2 = c10;
            if (c10 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f41855w2 = z9;
        }
        bx0 bx0Var3 = this.f41863x2;
        if (bx0Var3 != null) {
            l90 l90Var2 = new l90(this, 18);
            if (bx0Var3.f44153b) {
                l90Var2.run();
            } else {
                bx0Var3.h.add(l90Var2);
            }
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.S0;
        if (f5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.f41723d1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z10 = false;
            }
            f5Var.Q(20, z10);
            if (u4()) {
                this.S0.S(44);
            } else {
                this.S0.t(44);
            }
        }
    }

    public final float l4() {
        return Math.max(this.C5, this.S5);
    }

    public final void l5() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.jf0 jf0Var = new org.telegram.ui.Components.jf0(this.glassEngine, baseSimpleGlass);
        this.K5 = jf0Var;
        zw0 zw0Var = this.f41716c1;
        if (zw0Var != null) {
            int i7 = zw0Var.H;
            boolean z9 = zw0Var.f52690c;
            if (jf0Var.f35002i != i7 || jf0Var.f35003j != z9) {
                jf0Var.f35002i = i7;
                jf0Var.f35003j = z9;
                jf0Var.a();
            }
        }
        this.K5.b(this.L5);
        org.telegram.ui.Components.ff0 ff0Var = this.Z;
        if (ff0Var != null) {
            ff0Var.setGlassFactory(this.K5.f34998c);
        }
        org.telegram.ui.Components.ag0 ag0Var = this.f41707b0;
        if (ag0Var != null) {
            ag0Var.setGlassFactory(this.K5.f34998c);
        }
        this.simpleActionBar.setButtonsGlass(this.K5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        vv0 vv0Var = this.f41801o5;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41876z0;
        baseSimpleGlass.f21029m = vv0Var;
        baseSimpleGlass.f21030n = null;
        baseSimpleGlass.g(vv0Var, y4Var, g6Var);
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.jf0 jf0Var2 = this.K5;
        dh.c cVar = jf0Var2.f34999e;
        ri.d dVar = jf0Var2.f35000f;
        y4Var2.f28799n0 = cVar;
        y4Var2.f28800o0 = dVar;
        y4Var2.setBackground(null);
        this.I5 = c8.g0.l(this.f41876z0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.J5);
        D5();
        baseSimpleGlass.f21031o = this.O6;
        View view = new View(getParentActivity());
        this.V5 = view;
        view.setAlpha(0.0f);
        this.f41801o5.getViewTreeObserver().addOnPreDrawListener(new hk(this, 1));
        this.N.z(this.V5);
        View view2 = this.V5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.D5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        vv0 vv0Var2 = this.f41801o5;
        vv0Var2.addView(this.D5, vv0Var2.indexOfChild(this.Y), c8.ha.e(-1, 0, 48));
        this.glassEngine.b(this.f41698a);
        this.N.setPagesGlassEngine(this.glassEngine);
        this.N.setOnTopPanelShiftChanged(new l90(this, 21));
        H3();
        A5();
    }

    public final float m4(float f10, float f11) {
        float f12;
        float f13;
        this.f41867x6 = f10;
        this.f41882z6 = f11;
        int i7 = this.I1;
        if (i7 == 2) {
            f12 = 1.0f;
        } else if (this.R1 < 1.0f && i7 != 0) {
            f12 = 0.0f;
        } else {
            f12 = this.f41767j2;
        }
        float l10 = Utilities.l(f12);
        org.telegram.ui.Components.nu0 nu0Var = this.S;
        if (nu0Var != null) {
            f13 = nu0Var.getVisibilityFactor();
        } else {
            f13 = 0.0f;
        }
        return Math.max(0.0f, (r4() + this.f41815q5) * l10) + com.google.android.recaptcha.internal.a.z(1.0f, l10, f11 * f13, f10);
    }

    public final void m5(boolean z9, boolean z10) {
        if (this.f41744g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f41737f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41737f0 = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41737f0 = animatorSet2;
            if (z9) {
                this.f41744g0.setVisibility(0);
                this.f41737f0.playTogether(ObjectAnimator.ofFloat(this.f41744g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41744g0, View.ALPHA, 0.0f));
            }
            this.f41737f0.setDuration(180L);
            this.f41737f0.addListener(new pv0(this, z9, 1));
            this.f41737f0.start();
        } else if (z9) {
            this.f41744g0.setAlpha(1.0f);
            this.f41744g0.setVisibility(0);
        } else {
            this.f41744g0.setAlpha(0.0f);
            this.f41744g0.setVisibility(4);
        }
    }

    public final float n4(float f10) {
        float f11;
        this.A6 = f10;
        int i7 = this.I1;
        float f12 = 0.0f;
        if (i7 == 2) {
            f11 = 1.0f;
        } else if (this.R1 < 1.0f && i7 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f41767j2;
        }
        float l10 = Utilities.l(f11);
        if (this.S != null) {
            f12 = this.S.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f);
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, l10, f12, f10);
    }

    public final void n5() {
        int i7;
        int i10;
        Long l10;
        if (this.P5 != null) {
            return;
        }
        j11[] j11VarArr = new j11[1];
        Rect rect = org.telegram.messenger.g0.Q;
        qk qkVar = this.f41736f;
        if (qkVar != null) {
            if (qkVar.getRightDrawable() == null) {
                rect.set(this.f41736f.getWidth() - 1, (this.f41736f.getHeight() / 2) - 1, this.f41736f.getWidth() + 1, (this.f41736f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f41736f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f41736f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f41736f.getX(), (int) this.f41736f.getY());
            }
        }
        if (this.f41736f.getScaleX() < 1.5f) {
            i7 = 16;
        } else {
            i7 = 32;
        }
        int i11 = i7;
        int L = (-(this.Y.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i11);
        Point point = org.telegram.messenger.g0.f22563q;
        int min = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = c8.j9.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.D2 == null) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        iv0 iv0Var = new iv0(this, this, parentActivity, valueOf, i10, this.f41876z0, i11, j11VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41723d1));
        if (a22 != null) {
            iv0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.E;
        if (l11 != null) {
            iv0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.g5 g5Var = this.F;
            if (g5Var != null) {
                Drawable drawable = g5Var.f33866f[0];
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.i5) drawable).h());
                    iv0Var.setSelected(l10);
                }
            }
            l10 = null;
            iv0Var.setSelected(l10);
        }
        iv0Var.setSaveState(3);
        iv0Var.y(this.F, this.f41736f);
        jv0 jv0Var = new jv0(this, iv0Var);
        this.P5 = jv0Var;
        j11VarArr[0] = jv0Var;
        int[] iArr = new int[2];
        qk qkVar2 = this.f41736f;
        if (qkVar2 != null) {
            qkVar2.getLocationOnScreen(iArr);
        }
        j11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        j11VarArr[0].b();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.I1 == 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.Components.wq o4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232307).mutate();
            this.D = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f41876z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.wq(this.D, getParentActivity().getDrawable(2131232310).mutate());
        }
        return this.J;
    }

    public final void o5() {
        int i7 = 0;
        this.N.K0.setReordering(false);
        xv0 xv0Var = this.N;
        org.telegram.ui.Components.vq0 vq0Var = xv0Var.K0;
        if (xv0Var.f41127x1 != null && vq0Var != null) {
            boolean C0 = xv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = vq0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.zs0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.N.P1(true);
        this.A5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new l90(this, 24)).start();
        org.telegram.ui.Components.hc.a0(this).Q(2131623989, 36, "Tab order changed.").j();
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null) {
            k30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.vq0 vq0Var;
        if (super.onBackPressed(z9)) {
            xv0 xv0Var = this.N;
            if (xv0Var != null && (vq0Var = xv0Var.K0) != null && vq0Var.f31544n0) {
                if (z9) {
                    o5();
                    return false;
                }
            } else if (this.J4 != -1 && xv0Var != null && xv0Var.E1) {
                if (z9) {
                    xv0Var.V(true);
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
        this.f41816q6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        T5();
        this.f41816q6 = true;
        U3();
        if (this.I0 && !this.f41795n5 && (view = this.fragmentView) != null) {
            this.f41795n5 = true;
            this.U4 = true;
            view.requestLayout();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            xv0Var.onConfigurationChanged(configuration);
        }
        v4();
        if (this.f41785m2 && this.f41799o2 && (m10 = this.f41714c.m(0)) != null) {
            this.f41698a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        long j3;
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        float f10;
        boolean z11;
        org.telegram.ui.ActionBar.r0 r0Var2;
        TimeInterpolator decelerateInterpolator;
        org.telegram.ui.Components.kg kgVar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.r0 j10;
        long j11;
        boolean z12;
        float f11;
        View D;
        float f12;
        float f13;
        TLRPC.Chat chat;
        yw ywVar;
        uv uvVar;
        if (!this.I0) {
            M5();
            if (this.I1 != 0 && this.L1 && !this.f41799o2 && !this.M1) {
                ImageView imageView = this.f41758i0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.f41751h0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.f41771k0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.f41771k0.setScaleX(1.0f);
                    this.f41771k0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.f41765j0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.f41765j0.setScaleX(1.0f);
                    this.f41765j0.setScaleY(1.0f);
                }
                this.f41756h5 = null;
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getFragmentStack().size() >= 2) {
                    Object obj = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj instanceof org.telegram.ui.Components.kg) {
                        this.f41763i5 = (org.telegram.ui.Components.kg) obj;
                    }
                    if (obj instanceof le0) {
                        obj = ((le0) obj).J;
                    }
                    if ((obj instanceof yw) && (uvVar = (ywVar = (yw) obj).G3) != null) {
                        bw bwVar = uvVar.f52705a;
                        if (com.google.android.recaptcha.internal.a.u(bwVar)) {
                            this.f41756h5 = ywVar;
                            this.f41763i5 = bwVar;
                        }
                    }
                }
                org.telegram.ui.Components.kg kgVar2 = this.f41763i5;
                if (kgVar2 != null && ((org.telegram.ui.ActionBar.f2) kgVar2).getActionBar() != null) {
                    kVar = ((org.telegram.ui.ActionBar.f2) this.f41763i5).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.kg kgVar3 = this.f41763i5;
                if ((kgVar3 instanceof cn) && ((cn) kgVar3).f44432e != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kgVar3 != null) {
                    ImageView imageView5 = this.f41758i0;
                    if (imageView5 != null) {
                        if ((kgVar3 instanceof cn) && (chat = ((cn) kgVar3).f44432e) != null && chat.linked_community_id != 0) {
                            imageView5.setTag(1);
                            this.f41758i0.setVisibility(0);
                        } else {
                            imageView5.setTag(null);
                            this.f41758i0.setVisibility(8);
                        }
                    }
                    if (this.f41778l0 != null) {
                        org.telegram.ui.Components.kg kgVar4 = this.f41763i5;
                        if ((kgVar4 instanceof cn) && org.telegram.messenger.t3.p0(((cn) kgVar4).f44432e)) {
                            this.f41751h0.setTag(null);
                            this.f41751h0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.C2;
                            if (encryptedChat != null) {
                                this.f41778l0.b(encryptedChat.ttl);
                                this.f41751h0.setTag(1);
                                this.f41751h0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.f41840u2;
                                if (userFull != null) {
                                    this.f41778l0.b(userFull.ttl_period);
                                    if (this.J1 && this.f41840u2.ttl_period != 0) {
                                        this.f41751h0.setTag(1);
                                        this.f41751h0.setVisibility(0);
                                    } else {
                                        this.f41751h0.setTag(null);
                                        this.f41751h0.setVisibility(8);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.f41834t2;
                                    if (chatFull != null) {
                                        this.f41778l0.b(chatFull.ttl_period);
                                        if (this.J1 && this.f41834t2.ttl_period != 0) {
                                            this.f41751h0.setTag(1);
                                            this.f41751h0.setVisibility(0);
                                        } else {
                                            this.f41751h0.setTag(null);
                                            this.f41751h0.setVisibility(8);
                                        }
                                    } else {
                                        this.f41751h0.setTag(null);
                                        this.f41751h0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    N5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.I1 == 2) {
                    j3 = 250;
                } else {
                    j3 = 180;
                }
                animatorSet.setDuration(j3);
                this.f41698a.setLayerType(2, null);
                if (z9) {
                    this.f41750g6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41817r.getLayoutParams();
                    r0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.g0.f22562p * (-21.0f)) + org.telegram.messenger.g0.L(8.0f));
                    this.f41817r.setLayoutParams(layoutParams);
                    if (this.I1 != 2) {
                        j11 = 0;
                        int ceil = (int) Math.ceil((org.telegram.messenger.g0.f22562p * 21.0f) + (org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(117.0f)));
                        float measureText = (this.f41736f.getPaint().measureText(this.f41736f.getText().toString()) * 1.12f) + this.f41736f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f41736f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(f13 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f41736f.setLayoutParams(layoutParams2);
                        this.Q1 = j4();
                    } else {
                        j11 = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f41736f.getLayoutParams();
                        layoutParams3.width = (int) ((org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(32.0f)) / 1.38f);
                        this.f41736f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.dh0 dh0Var = this.f41825s;
                    if (dh0Var != null && dh0Var.getTag() == null) {
                        this.f41825s.setScaleX(0.2f);
                        this.f41825s.setScaleY(0.2f);
                        this.f41825s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f41825s, View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41825s, View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41825s, View.ALPHA, 1.0f));
                    }
                    ev0 ev0Var = this.f41838u0;
                    if (ev0Var != null && this.I1 == 2) {
                        ev0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f41838u0, View.ALPHA, 1.0f));
                    }
                    if (this.I1 == 2) {
                        this.f41818r0 = f4(this.f41729e0.getImageReceiver());
                        this.f41736f.setTextColor(-1);
                        this.f41817r.setTextColor(-1275068417);
                        this.actionBar.D(1090519039, false);
                        xw0 xw0Var = this.B6;
                        if (xw0Var != null) {
                            xw0Var.a(603979775);
                        }
                        mw0 mw0Var = this.M;
                        mw0Var.E = true;
                        mw0Var.setVisibility(0);
                    }
                    if (this.I1 == 2) {
                        this.f41736f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f41736f, View.ALPHA, 1.0f));
                    } else {
                        this.f41736f.setAlpha(1.0f);
                    }
                    if (this.f41838u0 != null) {
                        if (a() > j11) {
                            this.f41838u0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f41838u0, View.ALPHA, 1.0f));
                        } else {
                            this.f41838u0.setAlpha(1.0f);
                            this.f41838u0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f41838u0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    bi.g1 g1Var = this.f41845v0;
                    if (g1Var != null) {
                        g1Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f41845v0, View.ALPHA, 1.0f));
                    }
                    if (this.f41751h0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f41751h0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41751h0, View.SCALE_X, 0.85f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41751h0, View.SCALE_Y, 0.85f, 0.0f));
                    }
                    if (this.f41758i0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f41758i0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41758i0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41758i0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f41771k0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f41771k0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41771k0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41771k0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f41765j0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f41765j0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41765j0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f41765j0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.L0 && (this.f41730e1 != j11 || z10)) {
                        this.P0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.P0, View.ALPHA, 1.0f));
                    }
                    if (this.M0) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, View.ALPHA, 1.0f));
                    }
                    if (this.X0.getTag() != null) {
                        this.X0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.X0, View.ALPHA, 1.0f));
                    }
                    bv0 bv0Var = this.f41729e0;
                    if (bv0Var != null) {
                        bv0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f41729e0, yv0.f52199g0, 0.0f));
                    }
                    org.telegram.ui.Components.kg kgVar5 = this.f41763i5;
                    if (kgVar5 != null) {
                        org.telegram.ui.Components.kn r10 = kgVar5.r();
                        if (r10 != null) {
                            org.telegram.ui.Components.gn gnVar = r10.f35406e;
                            yw ywVar2 = this.f41756h5;
                            if (ywVar2 != null && ywVar2.getFragmentView() != null) {
                                D = this.f41756h5.getFragmentView();
                            } else {
                                D = this.f41763i5.D();
                            }
                            RectF rectF = this.f41757h6;
                            if (jh.k.c(gnVar, D, rectF)) {
                                f12 = rectF.left;
                            } else {
                                f12 = 0.0f;
                            }
                            this.f41750g6 = f12;
                        }
                        if ((r10 == null || !(r10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.l5) || ((org.telegram.ui.ActionBar.l5) r10.getSubtitleTextView()).getLeftDrawable() == null) && !r10.S[0] && !x4(r10)) {
                            z12 = false;
                        } else {
                            View subtitleTextView = r10.getSubtitleTextView();
                            this.W4 = subtitleTextView;
                            if (!(this.f41763i5 instanceof cn) && subtitleTextView != null) {
                                f11 = this.f41817r.getPaddingLeft() - this.W4.getPaddingLeft();
                            } else {
                                f11 = 0.0f;
                            }
                            this.X4 = f11;
                            this.Y.invalidate();
                            this.f41817r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f41817r, View.ALPHA, 1.0f));
                            z12 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (this.I1 == 2) {
                            this.f41817r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f41817r, View.ALPHA, 1.0f));
                        } else {
                            this.f41817r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    r0Var = null;
                    this.Q1 = this.P1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.dh0 dh0Var2 = this.f41825s;
                    if (dh0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(dh0Var2, View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41825s, View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41825s, View.ALPHA, 0.0f));
                    }
                    if (this.I1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41736f, View.ALPHA, 0.0f));
                    }
                    ev0 ev0Var2 = this.f41838u0;
                    if (ev0Var2 != null) {
                        if (this.f41752h1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(ev0Var2, View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(ev0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    bi.g1 g1Var2 = this.f41845v0;
                    if (g1Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(g1Var2, View.ALPHA, 0.0f));
                    }
                    if (this.f41751h0.getTag() != null) {
                        this.f41751h0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41751h0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41751h0, View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41751h0, View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.f41758i0.getTag() != null) {
                        this.f41758i0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41758i0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41758i0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41758i0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f41771k0.getTag() != null) {
                        this.f41771k0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41771k0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41771k0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41771k0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f41765j0.getTag() != null) {
                        this.f41765j0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41765j0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41765j0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41765j0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.L0 && (this.f41730e1 != 0 || z10)) {
                        this.P0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.P0, View.ALPHA, 0.0f));
                    }
                    if (this.M0) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.X0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    bv0 bv0Var2 = this.f41729e0;
                    if (bv0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(bv0Var2, yv0.f52199g0, 1.0f));
                    }
                    if (this.parentLayout.getFragmentStack().size() > 1) {
                        f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    } else {
                        f2Var = null;
                    }
                    if (f2Var instanceof cn) {
                        cn cnVar = (cn) f2Var;
                        wi wiVar = cnVar.f44560o1;
                        org.telegram.messenger.g0.K(wiVar, new oc0(this, wiVar, cnVar, 27));
                        View subtitleTextView2 = wiVar.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof org.telegram.ui.ActionBar.l5) && ((org.telegram.ui.ActionBar.l5) subtitleTextView2).getLeftDrawable() != null) || wiVar.S[0]) {
                            this.W4 = wiVar.getSubtitleTextView();
                            this.Y.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.f41817r, View.ALPHA, 0.0f));
                            z11 = true;
                        }
                        z11 = false;
                    } else {
                        org.telegram.ui.Components.kg kgVar6 = this.f41763i5;
                        if (kgVar6 != null && kgVar6.r() != null) {
                            org.telegram.ui.Components.kn r11 = this.f41763i5.r();
                            org.telegram.messenger.g0.K(r11, new sn0(19, this, r11));
                            if (x4(r11)) {
                                View subtitleTextView3 = r11.getSubtitleTextView();
                                this.W4 = subtitleTextView3;
                                if (!(this.f41763i5 instanceof cn) && subtitleTextView3 != null) {
                                    f10 = this.f41817r.getPaddingLeft() - this.W4.getPaddingLeft();
                                } else {
                                    f10 = 0.0f;
                                }
                                this.X4 = f10;
                                this.Y.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.f41817r, View.ALPHA, 0.0f));
                                z11 = true;
                            }
                        }
                        z11 = false;
                    }
                    if (!z11 && this.I1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f41817r, View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    ex0 ex0Var = this.C6;
                    if (ex0Var != null) {
                        ex0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eu0(this, 2));
                animatorSet.playTogether(ofFloat);
                if (this.O0 != null && (kgVar = this.f41763i5) != null && (yVar = ((org.telegram.ui.ActionBar.f2) kgVar).getActionBar().E) != null && (j10 = yVar.j(32)) != null && j10.getVisibility() == 0) {
                    j10.setAlpha(0.0f);
                    if (z9) {
                        this.O0.setVisibility(0);
                    }
                    this.O0.setTag(j10);
                    r0Var2 = j10;
                } else {
                    r0Var2 = r0Var;
                }
                animatorSet.addListener(new jg.j0(this, kVar, r0Var2, runnable, 5));
                if (this.I1 == 2) {
                    decelerateInterpolator = org.telegram.ui.Components.xq.f40458f;
                } else {
                    decelerateInterpolator = new DecelerateInterpolator();
                }
                animatorSet.setInterpolator(decelerateInterpolator);
                org.telegram.messenger.g0.i3(new iq0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        su0 su0Var = this.f41698a;
        if (su0Var != null) {
            su0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            xv0Var.R0();
        }
        org.telegram.ui.Components.rs0 rs0Var = this.Q;
        if (rs0Var != null) {
            rs0Var.b(this);
        }
        org.telegram.ui.Components.rs0 rs0Var2 = this.Q;
        if (rs0Var2 != null) {
            rs0Var2.f37803y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25076t);
        getNotificationCenter().n(this, org.telegram.messenger.qs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25062q5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24979c0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25095v5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25017i3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25114y3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25112y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24999f3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.W3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        cv0 cv0Var = this.f41791n0;
        if (cv0Var != null) {
            cv0Var.K();
        }
        org.telegram.ui.Components.lf0 lf0Var = this.m0;
        if (lf0Var != null) {
            lf0Var.d();
        }
        this.f41713b6 = null;
        if (this.f41723d1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25072s1);
            getNotificationCenter().n(this, org.telegram.messenger.qs.O);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f24967a0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25002g0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25025k0);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25108x4);
            getMessagesController().f24871q1.remove(Long.valueOf(this.f41723d1));
        } else if (this.f41730e1 != 0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25054p3);
            getNotificationCenter().n(this, org.telegram.messenger.qs.T);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25003g1);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25099w2);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f24974b1);
        }
        bv0 bv0Var = this.f41729e0;
        if (bv0Var != null) {
            bv0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null) {
            k30Var.d();
        }
        gv0 gv0Var = this.V4;
        if (gv0Var != null) {
            gv0Var.b();
        }
        bx0 bx0Var = this.f41863x2;
        if (bx0Var != null && this.f41855w2) {
            bx0Var.b(true);
            this.f41863x2 = null;
        }
        org.telegram.messenger.video.n nVar = this.f41881z5;
        if (nVar != null) {
            this.f41881z5 = null;
            org.telegram.messenger.g0.h3(nVar);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.gr0 gr0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null) {
            k30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.e();
        }
        xv0 xv0Var = this.N;
        if (xv0Var != null && (gr0Var = xv0Var.V) != null) {
            gr0Var.f45474e = false;
            if (gr0Var.f45473c != null) {
                gr0Var.f45471a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null) {
            k30Var.j(i7, strArr, iArr);
        }
        if (i7 != 101 && i7 != 102) {
            if (i7 == 103 && this.D2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 < iArr.length) {
                        if (iArr[i10] != 0) {
                            z12 = false;
                            break;
                        }
                        i10++;
                    } else {
                        z12 = true;
                        break;
                    }
                }
                if (iArr.length > 0 && z12) {
                    org.telegram.messenger.r3 g12 = getMessagesController().g1(this.f41730e1, false, null);
                    TLRPC.Chat chat = this.D2;
                    if (g12 == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.y1.l(chat, null, z13, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
                return;
            }
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41723d1));
        if (a22 == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 < iArr.length) {
                if (iArr[i11] != 0) {
                    z9 = false;
                    break;
                }
                i11++;
            } else {
                z9 = true;
                break;
            }
        }
        if (iArr.length > 0 && z9) {
            if (i7 == 102) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.UserFull userFull = this.f41840u2;
            if (userFull != null && userFull.video_calls_available) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.voip.y1.m(a22, z10, z11, getParentActivity(), this.f41840u2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        TLRPC.User a22;
        n00 n00Var;
        super.onResume();
        xv0 xv0Var = this.N;
        if (xv0Var != null) {
            xv0Var.f41069d1 = true;
            org.telegram.ui.Components.fr0 fr0Var = xv0Var.J;
            if (fr0Var != null) {
                fr0Var.f();
            }
            org.telegram.ui.Components.ms0 ms0Var = xv0Var.M;
            if (ms0Var != null) {
                ms0Var.f();
            }
            org.telegram.ui.Components.ns0 ns0Var = xv0Var.L;
            if (ns0Var != null) {
                ns0Var.X(false);
            }
            for (int i7 = 0; i7 < xv0Var.m0.length; i7++) {
                xv0Var.e0(i7);
            }
            org.telegram.ui.Components.gr0 gr0Var = xv0Var.V;
            if (gr0Var != null) {
                gr0Var.f45474e = true;
                if (gr0Var.f45473c != null) {
                    gr0Var.f45471a.onResume();
                }
            }
        }
        v4();
        lw0 lw0Var = this.d;
        if (lw0Var != null) {
            this.T4 = true;
            lw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (n00Var = this.T) != null && n00Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null) {
            k30Var.k();
            setParentActivityTitle(org.telegram.messenger.id.M0(2131745495, null));
        }
        L5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        qk qkVar = this.f41736f;
        if (qkVar != null) {
            setParentActivityTitle(qkVar.getText());
        }
        if (this.f41723d1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f41723d1))) != null && a22.photo == null && this.P1 >= j4()) {
            this.f41760i2.cancel();
            float[] fArr = this.f41779l2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            a5(1.0f);
            this.f41791n0.setVisibility(8);
            this.P1 = j4();
            this.f41792n2 = false;
            this.f41714c.h1(0, j4() - this.f41698a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.a();
        }
        F5();
        B4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f41869y0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, this.f41876z0));
            p5();
            P5();
            J3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        if (z9 && (y4Var = this.simpleActionBar) != null) {
            y4Var.setAlpha(1.0f);
        }
        if (z9) {
            if (!z10) {
                int i7 = this.I1;
                if (i7 != 0 && this.L1) {
                    if (i7 == 1) {
                        this.f41767j2 = 0.0f;
                        org.telegram.ui.Components.nu0 nu0Var = this.S;
                        if (nu0Var != null) {
                            nu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ff0 ff0Var = this.Z;
                        if (ff0Var != null) {
                            ff0Var.setParentExpanded(0.0f);
                        }
                        c5(0.0f);
                        org.telegram.ui.Components.ag0 ag0Var = this.f41707b0;
                        if (ag0Var != null) {
                            ag0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.F1 = false;
                    O3();
                    if (this.H1) {
                        S3(true);
                    }
                }
                if (!this.f41795n5) {
                    this.f41795n5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.P4);
            n00 n00Var = this.T;
            if (n00Var != null && n00Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.G1 = false;
        Q3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        n00 n00Var = this.T;
        if (n00Var != null && n00Var.getVisibility() == 0) {
            if (z9) {
                this.T.setAlpha(1.0f - f10);
            } else {
                this.T.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        xw0 xw0Var;
        ImageView imageView;
        org.telegram.ui.Components.ff0 ff0Var;
        super.onTransitionAnimationStart(z9, z10);
        this.f41735e6 = z9;
        if (z9 && (ff0Var = this.Z) != null) {
            ArrayList arrayList = ff0Var.f33648a;
            if (ff0Var.E == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.cf0 cf0Var = (org.telegram.ui.Components.cf0) arrayList.get(i7);
                    org.telegram.ui.Components.ah0 ah0Var = cf0Var.f32661k;
                    if (ah0Var != null) {
                        if (cf0Var.f32653a == 15) {
                            ah0Var.M(14);
                        } else {
                            ah0Var.M(0);
                        }
                        cf0Var.f32661k.start();
                    }
                }
            }
        }
        if (!z9 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.r0)) {
            ((org.telegram.ui.ActionBar.r0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z9 && z10) || (z9 && !z10)) && this.I1 != 0 && this.L1 && !this.f41799o2) {
            this.F1 = true;
            if (!z9) {
                if (this.f41713b6 == null) {
                    this.f41713b6 = new float[14];
                }
                this.E1 = this.P1;
                this.f41713b6[0] = this.X.getScaleX();
                this.f41713b6[1] = this.X.getTranslationX();
                this.f41713b6[2] = this.X.getTranslationY();
                org.telegram.ui.Components.ff0 ff0Var2 = this.Z;
                if (ff0Var2 != null) {
                    this.f41713b6[3] = ff0Var2.getAlpha();
                }
                bi.g1 g1Var = this.f41845v0;
                if (g1Var != null) {
                    float[] fArr = this.f41713b6;
                    fArr[4] = g1Var.f3916e;
                    fArr[5] = g1Var.f3917f;
                }
                if (this.B6 != null) {
                    this.f41713b6[6] = xw0Var.getAlpha();
                }
                this.f41713b6[7] = this.f41736f.getScaleX();
                this.f41713b6[8] = this.f41736f.getTranslationY();
                this.f41713b6[9] = this.f41817r.getTranslationY();
                this.f41713b6[10] = this.f41736f.getLayoutParams().width;
                float[] fArr2 = this.f41713b6;
                fArr2[11] = this.f41709b2;
                fArr2[12] = this.f41736f.getTranslationX();
                this.f41713b6[13] = this.f41817r.getTranslationX();
                fi.m3 m3Var = this.D6;
                if (m3Var != null) {
                    m3Var.f(true);
                }
            }
        }
        if (z9) {
            if (this.f41810q0 != null) {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.qs.f25070s, org.telegram.messenger.qs.f25076t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.X, org.telegram.messenger.qs.E0, org.telegram.messenger.qs.f25068r4}, this.P4, true);
            } else {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.qs.f25070s, org.telegram.messenger.qs.f25076t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.X, org.telegram.messenger.qs.f25068r4}, this.P4, true);
            }
            if (!z10 && getParentActivity() != null) {
                this.Z4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.G1 = true;
        Q3();
    }

    public final float p4(int i7) {
        View subtitleTextView;
        org.telegram.ui.ActionBar.l5 l5Var;
        org.telegram.ui.Components.kg kgVar = this.f41763i5;
        if (kgVar != null && !(kgVar instanceof cn) && kgVar.r() != null) {
            org.telegram.ui.Components.kn r10 = this.f41763i5.r();
            if (i7 == 0) {
                subtitleTextView = r10.getTitleTextView();
            } else {
                subtitleTextView = r10.getSubtitleTextView();
            }
            if (i7 == 0) {
                l5Var = this.f41736f;
            } else {
                l5Var = this.f41817r;
            }
            float textSize = l5Var.getPaint().getTextSize();
            if ((subtitleTextView instanceof org.telegram.ui.ActionBar.l5) && textSize > 0.0f) {
                return ((org.telegram.ui.ActionBar.l5) subtitleTextView).getPaint().getTextSize() / textSize;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final void p5() {
        int w02;
        int w03;
        if (!this.f41799o2) {
            dv0 dv0Var = this.f41817r;
            if (dv0Var != null) {
                Object tag = dv0Var.getTag();
                if (tag instanceof Integer) {
                    this.f41817r.setTextColor(I3(org.telegram.ui.ActionBar.l6.w0(((Integer) tag).intValue(), this.f41876z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.f41817r.setTextColor(I3(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, this.f41876z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f41860x;
            int i7 = -1;
            if (drawable != null) {
                if (this.f41770j6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27871dd, this.f41876z0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.hk0 hk0Var = this.K;
            if (hk0Var != null) {
                hk0Var.b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27940h8, this.f41876z0));
            }
            qk qkVar = this.f41736f;
            if (qkVar != null) {
                qkVar.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27986ji, this.f41876z0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.f41770j6 == null) {
                    i7 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28202v8, this.f41876z0);
                }
                kVar.E(i7, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f41770j6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27905f8, this.f41876z0);
                }
                kVar2.D(w02, false);
            }
        }
        v5();
        S5();
    }

    public final float q4(float f10, int i7, View view) {
        View D;
        float left;
        int paddingLeft;
        org.telegram.ui.Components.kg kgVar = this.f41763i5;
        if (kgVar != null && !(kgVar instanceof cn) && this.fragmentView != null && (view.getParent() instanceof View)) {
            org.telegram.ui.Components.kn r10 = this.f41763i5.r();
            org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.f2) this.f41763i5).getActionBar();
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
                yw ywVar = this.f41756h5;
                if (ywVar != null && ywVar.getFragmentView() != null) {
                    D = this.f41756h5.getFragmentView();
                } else {
                    D = this.f41763i5.D();
                }
                RectF rectF = this.f41757h6;
                if (jh.k.c(view2, D, rectF)) {
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
        if (this.Z != null && this.f41817r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            org.telegram.ui.Components.ff0 ff0Var = this.Z;
            boolean z9 = this.F1;
            ff0Var.f33652e = z9;
            if (z9 && this.I1 == 2 && (k0Var = this.X) != null) {
                this.Z.f33653f = this.X.getY() + (this.X.getScaleY() * k0Var.getHeight());
                this.Z.setAlpha(this.R1);
                org.telegram.ui.Components.ff0 ff0Var2 = this.Z;
                ff0Var2.f33658x = org.telegram.messenger.g0.L(74.0f);
                ff0Var2.setTranslationY(this.f41698a.getMeasuredWidth());
                ff0Var2.invalidate();
            } else {
                ff0Var.f33653f = -1.0f;
                float f11 = i10;
                float f12 = this.P1 + f11;
                if (!this.H4 && !this.I4) {
                    f10 = 0.0f;
                } else {
                    f10 = 25.0f;
                }
                float L = f12 - org.telegram.messenger.g0.L(f10);
                float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f11);
                org.telegram.ui.Components.ff0 ff0Var3 = this.Z;
                ff0Var3.f33658x = min;
                ff0Var3.setTranslationY(L - min);
                ff0Var3.invalidate();
            }
            ImageView imageView = this.O0;
            if (imageView != null && imageView.getTag() != null) {
                this.Z.getClass();
                if (this.O0.getVisibility() == 0) {
                    this.O0.setVisibility(8);
                }
                if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.r0) {
                    ((org.telegram.ui.ActionBar.r0) this.O0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    public final float r4() {
        if (this.S != null) {
            return this.S.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
        }
        return 0.0f;
    }

    public final void r5() {
        int i7;
        if (this.Y0 != null && this.Z0 != null) {
            TLRPC.UserFull userFull = this.f41840u2;
            if (userFull == null && this.f41834t2 == null) {
                i7 = 0;
            } else if (userFull != null) {
                i7 = userFull.ttl_period;
            } else {
                i7 = this.f41834t2.ttl_period;
            }
            this.f41826s0.b(i7);
            this.Z0.u(i7);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null) {
            k30Var.f35222f = bundle.getString("path");
        }
    }

    public final int s4() {
        float f10;
        if (this.f41804p1) {
            return 0;
        }
        if (this.f41730e1 != 0 && org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.f41730e1)))) {
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
        boolean z9;
        if (this.f41843u5 != null) {
            xv0 xv0Var = this.N;
            if (xv0Var != null && xv0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.g0.L(232.0f) - (this.f41698a.getMeasuredHeight() - this.N.getY());
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            int i7 = 0;
            if (L <= 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            te.a aVar = this.O5;
            aVar.a(z9, true);
            float f10 = aVar.f55499e;
            this.f41843u5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
            this.f41843u5.setAlpha(f10);
            FrameLayout frameLayout = this.f41843u5;
            if (f10 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
            if (ccVar != null) {
                ccVar.l();
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.k30 k30Var = this.f41810q0;
        if (k30Var != null && (str = k30Var.f35222f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        int i7;
        this.f41767j2 = f10;
        this.R1 = f10;
        Q3();
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setAlpha(f10);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.getBackButton().setTranslationX(org.telegram.messenger.g0.T1(q4(org.telegram.messenger.g0.L(2.0f), 2, this.actionBar.getBackButton()), org.telegram.messenger.g0.L(2.0f), f10));
        }
        if (this.I1 == 2) {
            this.f41729e0.setProgressToExpand(f10);
            org.telegram.ui.Components.ff0 ff0Var = this.Z;
            if (ff0Var != null) {
                ff0Var.setParentExpanded(f10);
            }
            c5(f10);
            org.telegram.ui.Components.ag0 ag0Var = this.f41707b0;
            if (ag0Var != null) {
                ag0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.nu0 nu0Var = this.S;
            if (nu0Var != null) {
                nu0Var.setParentExpanded(f10);
            }
            q5();
            H5();
        }
        this.f41698a.setAlpha(f10);
        this.f41698a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.I1 != 2 || (w02 = this.f41818r0) == 0) {
            if (this.f41723d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41730e1)) {
                    boolean z9 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.f41876z0;
            int[][] iArr = org.telegram.ui.Components.w8.L;
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, g6Var);
        }
        int i10 = this.Y4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, this.f41876z0);
        }
        this.f41716c1.setBackgroundColor(i0.a.f(f10, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.b01 b01Var = this.f41778l0;
        int f11 = i0.a.f(f10, i10, w02);
        b01Var.f32036k = true;
        b01Var.f32029b.setColor(f11);
        int i11 = -1;
        if (this.f41770j6 != null) {
            w03 = -1;
        } else {
            if (this.f41723d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41730e1)) {
                    boolean z10 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.g6 g6Var2 = this.f41876z0;
            int[][] iArr2 = org.telegram.ui.Components.w8.L;
            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27922g8, g6Var2);
        }
        this.actionBar.E(i0.a.f(this.R1, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28202v8, this.f41876z0), w03), false);
        if (this.f41770j6 == null) {
            i11 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27986ji, this.f41876z0);
        }
        int w05 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, this.f41876z0);
        qk qkVar = this.f41736f;
        if (qkVar != null && this.I1 != 2) {
            qkVar.setTextColor(i0.a.f(f10, w05, i11));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28097pi, this.f41876z0);
        } else {
            if (this.f41723d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41730e1)) {
                    boolean z11 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.g6 g6Var3 = this.f41876z0;
            int[][] iArr3 = org.telegram.ui.Components.w8.L;
            w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27940h8, g6Var3);
        }
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.l6.f28089pa;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.l6.w0(i7, this.f41876z0);
        dv0 dv0Var = this.f41817r;
        if (dv0Var != null && this.I1 != 2) {
            dv0Var.setTextColor(i0.a.f(f10, w06, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.P1 = this.Q1 * f10;
        long j3 = this.f41723d1;
        if (j3 == 0) {
            j3 = this.f41730e1;
        }
        org.telegram.ui.ActionBar.g6 g6Var4 = this.f41876z0;
        int[][] iArr4 = org.telegram.ui.Components.w8.L;
        int w07 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.e(j3)], g6Var4);
        long j10 = this.f41723d1;
        if (j10 == 0) {
            j10 = this.f41730e1;
        }
        int d = org.telegram.ui.Components.w8.d(j10);
        if (w07 != d) {
            this.f41803p0.h(i0.a.f(f10, d, w07));
            this.f41729e0.invalidate();
        }
        int i12 = this.Z4;
        if (i12 != 0) {
            setNavigationBarColor(i0.a.f(f10, i12, getNavigationBarColor()));
        }
        this.f41716c1.invalidate();
        B4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        gw0 gw0Var = this.f41743f6;
        if (gw0Var != null) {
            gw0Var.invalidate();
        }
        if (a() > 0) {
            bv0 bv0Var = this.f41729e0;
            if (bv0Var != null) {
                bv0Var.setProgressToStoriesInsets(this.R1);
            }
            ev0 ev0Var = this.f41838u0;
            if (ev0Var != null) {
                ev0Var.setProgressToStoriesInsets(this.R1);
            }
            bi.g1 g1Var = this.f41845v0;
            if (g1Var != null) {
                g1Var.setProgressToStoriesInsets(this.R1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.q4 q4Var) {
        super.setParentLayout(q4Var);
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.e();
            this.W1 = null;
        }
        if (q4Var != null && q4Var.getParentActivity() != null) {
            this.W1 = new org.telegram.messenger.n6(q4Var.getParentActivity().getWindow(), new vt0(this, 8));
        }
    }

    @Override
    public final boolean t() {
        return this.f41735e6;
    }

    public final org.telegram.ui.Components.wq t4() {
        int i7;
        float f10;
        if (this.I == null) {
            this.f41868y = org.telegram.ui.ActionBar.l6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.l6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.fp fpVar = this.f41770j6;
            if (fpVar != null) {
                if (fpVar.o(org.telegram.ui.ActionBar.l6.I.q())) {
                    i7 = this.f41770j6.k();
                } else {
                    i7 = this.f41770j6.i();
                }
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.l6.b(0.1f, f10, i7);
                Drawable drawable = this.f41868y;
                int S0 = org.telegram.messenger.g0.S0(this.S5, 1.0f, b10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Cj, this.f41876z0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.H.setColorFilter(org.telegram.messenger.g0.S0(this.S5, 1.0f, -1, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f41876z0)), mode);
            }
            this.I = new org.telegram.ui.Components.wq(new org.telegram.ui.Components.xp(this.f41868y, this.H), getParentActivity().getDrawable(2131232793));
        }
        return this.I;
    }

    public final void t5() {
        boolean z9;
        fi.m3 m3Var = this.D6;
        if (m3Var != null) {
            float f10 = 0.0f;
            m3Var.p(0.0f, (this.f41736f.getScaleX() * this.f41736f.getRightDrawableX()) + this.f41736f.getX() + (-m3Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.g0.U1(this.f41773k2, this.f41779l2);
            fi.m3 m3Var2 = this.D6;
            m3Var2.setTranslationY(((this.f41736f.getY() + (-m3Var2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
            this.D6.j(i0.a.f(U1, this.E6, 1342177280));
            if (this.P1 >= org.telegram.messenger.g0.L(82.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            Boolean bool = this.F6;
            if (bool != null && bool.booleanValue() == z9) {
                return;
            }
            ViewPropertyAnimator animate = this.D6.animate();
            this.F6 = Boolean.valueOf(z9);
            if (z9) {
                f10 = 1.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f10), org.telegram.ui.Components.xq.f40459g, 200L);
        }
    }

    public final boolean u4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i7 = 0;
        if (!this.f41812q2 || (userFull = this.f41840u2) == null || (botInfo = userFull.bot_info) == null) {
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
        if (getParentActivity() != null && this.U0 != null) {
            if (getUserConfig().q()) {
                this.U0.setIcon(2131231862);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231863);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.F8, this.f41876z0), PorterDuff.Mode.SRC_IN));
            this.S6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232169);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.U0.setIcon(new di.i2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final void v() {
        this.f41698a.y0(0);
    }

    public final void v4() {
        boolean z9;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f41785m2 = z9;
    }

    public final void v5() {
        w5(this.f41764i6);
    }

    public final boolean w4() {
        if (this.D2 != null) {
            return getMessagesController().o2(this.D2);
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f41840u2;
        messagesController.getClass();
        return org.telegram.messenger.qp.K2(userFull);
    }

    public final void w5(float f10) {
        int S0;
        org.telegram.messenger.fp fpVar = this.f41770j6;
        if (fpVar != null) {
            S0 = i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.l6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.S5, 1.0f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f41876z0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Cj, this.f41876z0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.l6.Cj;
        int f12 = i0.a.f(Math.max(this.S5, this.C5), f11, org.telegram.ui.ActionBar.l6.w0(i7, this.f41876z0));
        org.telegram.ui.Components.g5 g5Var = this.F;
        if (g5Var != null) {
            g5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.g5 g5Var2 = this.G;
        if (g5Var2 != null) {
            g5Var2.k(Integer.valueOf(i0.a.f(this.S5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.l6.w0(i7, this.f41876z0))));
        }
        this.f41722d0.setColor(f12);
        this.f41764i6 = f10;
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final boolean x4(org.telegram.ui.Components.kn knVar) {
        String str;
        if (!(this.f41763i5 instanceof cn) && (knVar.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.l5)) {
            CharSequence text = ((org.telegram.ui.ActionBar.l5) knVar.getSubtitleTextView()).getText();
            String str2 = null;
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (this.f41817r.getText() != null) {
                str2 = this.f41817r.getText().toString();
            }
            return !TextUtils.equals(str, str2);
        }
        return false;
    }

    public final void x5() {
        this.f41722d0.setScaleX(this.f41736f.getScaleX());
        this.f41722d0.setScaleY(this.f41736f.getScaleY());
        this.f41722d0.b((this.f41736f.getScaleX() * this.f41736f.getRightDrawableX()) + this.f41736f.getX(), (this.f41736f.getHeight() - (this.f41736f.getScaleY() * (this.f41736f.getHeight() - this.f41736f.getRightDrawableY()))) + this.f41736f.getY());
    }

    @Override
    public final boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j3)) {
            k10.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            k10.putLong("user_id", j3);
        } else if (org.telegram.messenger.m5.z(j3)) {
            k10.putLong("chat_id", -j3);
        }
        if (!getMessagesController().E(k10, ywVar, null, null)) {
            return false;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new cn(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.ez.g(getMessagesController().a2(Long.valueOf(this.f41723d1)), j3, null, null, null, null, z10, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.gz.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z10, i7, i10);
        }
        return true;
    }

    public final boolean y4() {
        if (this.f41810q0 != null && !this.f41819r1) {
            return true;
        }
        return false;
    }

    public final void y5() {
        if (!this.f41804p1 && org.telegram.messenger.t3.c0(this.D2)) {
            org.telegram.messenger.dt notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f26719a.c(new org.telegram.messenger.a4(notificationsController, -this.f41730e1, new ou0(this), 6));
        }
    }

    public final void z4(boolean z9) {
        boolean z10;
        boolean c02 = org.telegram.messenger.t3.c0(this.D2);
        TLRPC.Chat chat = this.D2;
        if (!c02 && !z9 && (chat == null || !chat.creator)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.ui.Components.v4.r(this, false, chat, null, false, z10, z9, !c02, new vt0(this, 3));
    }

    public final void z5(float f10) {
        mw0 mw0Var;
        ValueAnimator valueAnimator;
        if (this.f41799o2 || ((mw0Var = this.M) != null && (valueAnimator = mw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.f41698a.getMeasuredWidth();
            layoutParams.height = (int) (this.P1 + f10);
            this.M.requestLayout();
        }
        zw0 zw0Var = this.f41716c1;
        if (zw0Var != null) {
            zw0Var.E.setTranslate(0.0f, this.Z1 - zw0Var.f52698y);
            zw0 zw0Var2 = this.f41716c1;
            RadialGradient radialGradient = zw0Var2.D;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(zw0Var2.E);
            }
            this.f41716c1.invalidate();
        }
        x5();
        q5();
        H5();
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.rs0 rs0Var) {
        super(bundle);
        this.h = null;
        this.f41790n = null;
        this.f41853w0 = null;
        this.f41861x0 = new org.telegram.ui.Components.u30(this, 2);
        this.f41869y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f41700a1 = 1.0f;
        this.B1 = new a0.h();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.X1 = new HashMap();
        this.f41779l2 = new float[]{0.0f, 1.0f};
        this.f41805p2 = new Paint();
        this.A2 = -1;
        this.K2 = new Rect();
        this.Q4 = new ArrayList();
        this.R4 = new ArrayList();
        this.S4 = 0;
        this.T4 = true;
        this.U4 = true;
        this.Y4 = 0;
        this.Z4 = 0;
        this.f41704a5 = 0;
        this.f41712b5 = 0L;
        this.f41769j5 = new HashSet();
        this.f41782l5 = new hv0(this, 0);
        this.f41788m5 = new nv0(this);
        this.J5 = new ru0(this);
        this.N5 = 1.0f;
        this.O5 = new te.a(0, new vt0(this, 7), org.telegram.ui.Components.xq.h, 380L, true);
        this.U5 = new hv0(this, 1);
        this.f41705a6 = new fv0(this, 2);
        this.f41713b6 = null;
        this.f41757h6 = new RectF();
        this.f41777k6 = new SparseIntArray();
        this.f41789m6 = null;
        this.f41796n6 = -1;
        this.f41831s6 = new int[3];
        this.t6 = -1.0f;
        ri.b bVar = new ri.b();
        this.M6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.N6 = cVar;
        this.P6 = new Paint();
        this.U6 = new int[7];
        this.Q = rs0Var;
        cVar.f8705g = new xe.b();
    }

    @Override
    public final void T() {
    }
}
