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
public class ProfileActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, qw, org.telegram.ui.Components.qs0, org.telegram.ui.Components.i30, org.telegram.ui.Components.mr0, ie0 {
    public static final RectF S6 = new RectF();
    public static final int T6 = org.telegram.messenger.g0.L(16.0f);
    public int A0;
    public boolean A1;
    public int A2;
    public int A3;
    public int A4;
    public float A5;
    public fi.m3 A6;
    public org.telegram.messenger.hc B0;
    public a0.h B1;
    public ArrayList B2;
    public int B3;
    public int B4;
    public View B5;
    public int B6;
    public int C0;
    public boolean C1;
    public TLRPC.EncryptedChat C2;
    public int C3;
    public int C4;
    public int C5;
    public Boolean C6;
    public Drawable D;
    public int D0;
    public long D1;
    public TLRPC.Chat D2;
    public int D3;
    public int D4;
    public int D5;
    public TLRPC.TL_emojiStatusCollectible D6;
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
    public boolean F6;
    public org.telegram.ui.Components.g5 G;
    public boolean G0;
    public boolean G1;
    public TL_account.TL_password G2;
    public int G3;
    public int G4;
    public gh.e G5;
    public int G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TLRPC.FileLocation H2;
    public int H3;
    public boolean H4;
    public final pu0 H5;
    public int H6;
    public org.telegram.ui.Components.wq I;
    public boolean I0;
    public int I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public org.telegram.ui.Components.if0 I5;
    public int I6;
    public org.telegram.ui.Components.wq J;
    public final boolean[] J0;
    public boolean J1;
    public org.telegram.messenger.hc J2;
    public int J3;
    public int J4;
    public float J5;
    public final ri.b J6;
    public org.telegram.ui.Components.gk0 K;
    public boolean K0;
    public boolean K1;
    public final Rect K2;
    public int K3;
    public int K4;
    public int K5;
    public final dh.c K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public org.telegram.ui.Cells.m8 L2;
    public int L3;
    public int L4;
    public float L5;
    public bi.g L6;
    public kw0 M;
    public boolean M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public final te.a M5;
    public final Paint M6;
    public vv0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public hv0 N5;
    public Drawable N6;
    public org.telegram.ui.Components.av0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public AnimatorSet O5;
    public Drawable O6;
    public boolean P;
    public org.telegram.ui.ActionBar.f5 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public AnimatorSet P5;
    public Drawable P6;
    public org.telegram.ui.Components.ps0 Q;
    public org.telegram.ui.ActionBar.f5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public float Q5;
    public org.telegram.ui.Components.wp Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.f5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public boolean R5;
    public final int[] R6;
    public org.telegram.ui.Components.lu0 S;
    public org.telegram.ui.ActionBar.f5 S0;
    public int S1;
    public int S2;
    public int S3;
    public int S4;
    public final fv0 S5;
    public l00 T;
    public org.telegram.ui.ActionBar.f5 T0;
    public float T1;
    public int T2;
    public int T3;
    public boolean T4;
    public View T5;
    public org.telegram.ui.Components.zg0 U;
    public org.telegram.ui.ActionBar.z0 U0;
    public ValueAnimator U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.zg0 V;
    public org.telegram.ui.ActionBar.z0 V0;
    public boolean V1;
    public int V2;
    public int V3;
    public ev0 V4;
    public int V5;
    public fi.m3 W;
    public org.telegram.ui.ActionBar.z0 W0;
    public org.telegram.messenger.n6 W1;
    public int W2;
    public int W3;
    public View W4;
    public CharSequence W5;
    public k0 X;
    public ImageView X0;
    public final HashMap X1;
    public int X2;
    public int X3;
    public int X4;
    public boolean X5;
    public bi.x5 Y;
    public org.telegram.ui.ActionBar.z0 Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public final dv0 Y5;
    public org.telegram.ui.Components.ef0 Z;
    public org.telegram.messenger.re Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float[] Z5;
    public qu0 f41688a;
    public org.telegram.messenger.kp f41689a0;
    public float f41690a1;
    public float f41691a2;
    public int f41692a3;
    public int f41693a4;
    public long f41694a5;
    public float f41695a6;
    public org.telegram.ui.Components.pj0 f41696b;
    public org.telegram.ui.Components.zf0 f41697b0;
    public int f41698b1;
    public float f41699b2;
    public int f41700b3;
    public int f41701b4;
    public boolean f41702b5;
    public float f41703b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public tu0 f41704c;
    public org.telegram.ui.Components.ff0 f41705c0;
    public ww0 f41706c1;
    public float f41707c2;
    public int f41708c3;
    public int f41709c4;
    public boolean f41710c5;
    public boolean f41711c6;
    public jw0 d;
    public org.telegram.ui.Cells.o f41712d0;
    public long f41713d1;
    public float d2;
    public int f41714d3;
    public int f41715d4;
    public String f41716d5;
    public ew0 f41717d6;
    public tw0 f41718e;
    public zu0 f41719e0;
    public long f41720e1;
    public float f41721e2;
    public int f41722e3;
    public int f41723e4;
    public String f41724e5;
    public float f41725e6;
    public ok f41726f;
    public AnimatorSet f41727f0;
    public long f41728f1;
    public float f41729f2;
    public int f41730f3;
    public int f41731f4;
    public String f41732f5;
    public float f41733f6;
    public org.telegram.ui.Cells.b4 f41734g0;
    public boolean f41735g1;
    public float f41736g2;
    public int f41737g3;
    public int f41738g4;
    public org.telegram.ui.Components.kg f41739g5;
    public org.telegram.messenger.fp f41740g6;
    public String h;
    public ImageView f41741h0;
    public long f41742h1;
    public float f41743h2;
    public int f41744h3;
    public int f41745h4;
    public final HashSet f41746h5;
    public final SparseIntArray f41747h6;
    public ImageView f41748i0;
    public boolean f41749i1;
    public ValueAnimator f41750i2;
    public int f41751i3;
    public int f41752i4;
    public CharacterStyle f41753i5;
    public int f41754i6;
    public ImageView f41755j0;
    public boolean f41756j1;
    public float f41757j2;
    public int j3;
    public int f41758j4;
    public final fv0 f41759j5;
    public AnimatorSet f41760j6;
    public ImageView f41761k0;
    public boolean f41762k1;
    public float f41763k2;
    public int f41764k3;
    public int f41765k4;
    public final lv0 f41766k5;
    public int f41767k6;
    public org.telegram.ui.Components.zz0 f41768l0;
    public long l1;
    public final float[] f41769l2;
    public int f41770l3;
    public int f41771l4;
    public boolean f41772l5;
    public int f41773l6;
    public org.telegram.ui.Components.kf0 m0;
    public boolean f41774m1;
    public boolean f41775m2;
    public int f41776m3;
    public int f41777m4;
    public tv0 f41778m5;
    public boolean f41779m6;
    public String f41780n;
    public av0 f41781n0;
    public boolean n1;
    public boolean f41782n2;
    public int f41783n3;
    public int f41784n4;
    public float f41785n5;
    public boolean f41786n6;
    public mw0 f41787o0;
    public boolean f41788o1;
    public boolean f41789o2;
    public int f41790o3;
    public int o4;
    public float f41791o5;
    public org.telegram.ui.Components.ch0 f41792o6;
    public org.telegram.ui.Components.w8 f41793p0;
    public boolean f41794p1;
    public final Paint f41795p2;
    public int f41796p3;
    public int f41797p4;
    public boolean f41798p5;
    public final int[] f41799p6;
    public org.telegram.ui.Components.j30 f41800q0;
    public boolean f41801q1;
    public boolean f41802q2;
    public int f41803q3;
    public int f41804q4;
    public boolean f41805q5;
    public float f41806q6;
    public bv0 f41807r;
    public int f41808r0;
    public boolean f41809r1;
    public hi.r0 f41810r2;
    public int f41811r3;
    public int f41812r4;
    public ImageReceiver f41813r5;
    public CharSequence f41814r6;
    public org.telegram.ui.Components.ch0 f41815s;
    public org.telegram.ui.Components.zz0 f41816s0;
    public boolean f41817s1;
    public hi.p f41818s2;
    public int f41819s3;
    public int f41820s4;
    public FrameLayout s5;
    public CharSequence f41821s6;
    public org.telegram.ui.Components.wf0 f41822t0;
    public int f41823t1;
    public TLRPC.ChatFull f41824t2;
    public int f41825t3;
    public int f41826t4;
    public FrameLayout[] f41827t5;
    public boolean t6;
    public cv0 f41828u0;
    public boolean f41829u1;
    public TLRPC.UserFull f41830u2;
    public int f41831u3;
    public int f41832u4;
    public SpannableStringBuilder f41833u5;
    public float f41834u6;
    public bi.g1 f41835v0;
    public boolean f41836v1;
    public org.telegram.ui.Cells.e6 f41837v2;
    public int f41838v3;
    public int f41839v4;
    public SpannableStringBuilder f41840v5;
    public float f41841v6;
    public AnimatorSet f41842w;
    public View f41843w0;
    public boolean f41844w1;
    public boolean f41845w2;
    public int f41846w3;
    public int f41847w4;
    public fi.d[] f41848w5;
    public float f41849w6;
    public Drawable f41850x;
    public final org.telegram.ui.Components.t30 f41851x0;
    public int f41852x1;
    public xw0 f41853x2;
    public int f41854x3;
    public int f41855x4;
    public org.telegram.messenger.video.n f41856x5;
    public float f41857x6;
    public Drawable f41858y;
    public final Paint f41859y0;
    public boolean f41860y1;
    public CharSequence f41861y2;
    public int f41862y3;
    public int f41863y4;
    public FrameLayout f41864y5;
    public uw0 f41865y6;
    public org.telegram.ui.ActionBar.f6 f41866z0;
    public boolean f41867z1;
    public long f41868z2;
    public int f41869z3;
    public int f41870z4;
    public fi.d f41871z5;
    public ax0 f41872z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity A4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void G3(ProfileActivity profileActivity, boolean z9) {
        Drawable t6 = profileActivity.f41719e0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.c51) {
            profileActivity.f41719e0.w(null, null, t6);
        } else if (t6 instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) t6;
            profileActivity.f41719e0.w(null, null, v5Var);
            if (z9) {
                v5Var.f(profileActivity.f41719e0);
            }
        } else {
            org.telegram.messenger.hc D = profileActivity.f41781n0.D(0);
            if (D != null && D.f22865p == 2) {
                str = "avatar";
            }
            profileActivity.f41719e0.w(D, str, t6);
        }
    }

    public static int J0(ProfileActivity profileActivity) {
        int i7;
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null && kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22531m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = S6;
            if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean I0 = org.telegram.ui.Components.xs0.I0(profileActivity.N.getClosestTab());
        if (i7 == profileActivity.E6 && I0 == profileActivity.F6) {
            return;
        }
        profileActivity.E6 = i7;
        profileActivity.F6 = I0;
        if (I0) {
            if (i7 > 0) {
                profileActivity.f41848w5[0].i(org.telegram.messenger.hd.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.f41848w5[0].i(profileActivity.f41840v5, true, true);
            }
        } else if (i7 <= 0 && org.telegram.messenger.qp.s1(profileActivity.currentAccount).W4()) {
            profileActivity.f41848w5[0].i(profileActivity.f41833u5, true, true);
        } else {
            profileActivity.f41848w5[0].i(org.telegram.messenger.hd.G(i7, "ArchiveStories", new Object[0]), true, true);
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
        bi.g1 g1Var = profileActivity.f41835v0;
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
        profileActivity.f41696b.setTranslationY(f12);
        profileActivity.f41696b.setVisibility(0);
        profileActivity.T0.setVisibility(0);
        profileActivity.f41688a.setVisibility(0);
        profileActivity.y4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f41726f.setVisibility(0);
        profileActivity.f41807r.setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.T1 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.y(z10);
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
        profileActivity.f41696b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.r0(ProfileActivity.this, ofFloat, f12, z9);
            }
        });
        ofFloat.addListener(new nv0(profileActivity, z9, 0));
        if (!z9) {
            profileActivity.U4 = true;
            profileActivity.T4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40329f);
        profileActivity.U1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        boolean z9;
        int i7;
        if (profileActivity.f41782n2) {
            if (profileActivity.f41789o2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f22531m;
                } else {
                    i7 = 0;
                }
                profileActivity.f41688a.w0(0, ((view.getTop() - profileActivity.f41688a.getMeasuredWidth()) - profileActivity.e4()) + currentActionBarHeight + i7, org.telegram.ui.Components.xq.h);
                return;
            }
            profileActivity.f41688a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
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
                profileActivity.f41688a.w0(0, (int) (profileActivity.P1 - profileActivity.e4()), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (z9) {
            float f12 = profileActivity.P1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.f41688a.w0(0, (int) profileActivity.P1, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (!z9) {
            float f13 = profileActivity.P1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.f41688a.w0(0, (int) f13, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (profileActivity.P1 > 0.0f) {
            profileActivity.f41688a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
        }
    }

    public static void V4(Activity activity, boolean z9) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        u1Var.f28568i0 = false;
        u1Var.show();
        Utilities.f21333e.c(new g60(u1Var, z9, activity));
    }

    public static SpannableStringBuilder W3(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ez ezVar = new ez(9);
        ezVar.f45447w = str;
        if (ezVar.f45441c != null) {
            ezVar.f45441c = null;
            ezVar.a();
        }
        ezVar.f45443f = w02;
        ezVar.f45444n = false;
        spannableStringBuilder.setSpan(ezVar, 0, spannableStringBuilder.length(), 0);
        ez[] ezVarArr = (ez[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ez.class);
        if (ezVarArr != null) {
            for (ez ezVar2 : ezVarArr) {
                ezVar2.getClass();
                ezVar2.f45443f = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                ezVar2.f45445r = i7;
                ezVar2.f45446s = f6Var;
                ezVar2.f45444n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(FrameLayout frameLayout, float f10) {
        int i7;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(T6 * f10);
        frameLayout.setAlpha(1.0f - f10);
        if (f10 < 1.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        frameLayout.setVisibility(i7);
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z9, boolean z10) {
        org.telegram.ui.Components.dy0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z9, z10, profileActivity.f41866z0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.cc h;
        if (profileActivity.I2 == null) {
            if (profileActivity.f41794p1 && !profileActivity.getMessagesController().D3()) {
                ArrayList l10 = profileActivity.getMessagesController().f24862q7.l(profileActivity.f41720e1);
                if (l10 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i7 = 0; tL_forumTopic == null && i7 < l10.size(); i7++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i7);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f27004id == profileActivity.f41728f1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j3 = tL_forumTopic.icon_emoji_id;
                        if (j3 != 0 && (e10 = org.telegram.ui.Components.i5.e(profileActivity.currentAccount, j3)) != null && (h = org.telegram.ui.Components.hc.a0(profileActivity).h(e10, 1, new fu0(profileActivity, 2))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.a4()) {
                profileActivity.K4(false);
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

    public static void b0(ProfileActivity profileActivity, TLRPC.User user) {
        int i7;
        if (profileActivity.Y3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.J5();
                profileActivity.d.f();
            } else {
                profileActivity.D5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (!profileActivity.f41775m2 && !org.telegram.messenger.g0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f22531m;
                } else {
                    i7 = 0;
                }
                int i10 = currentActionBarHeight + i7;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f41688a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f41688a.getMeasuredHeight(), 0);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    jw0 jw0Var = profileActivity.d;
                    if (i11 >= jw0Var.f47050e.M2) {
                        break;
                    }
                    v4.d1 a10 = jw0Var.a(null, jw0Var.d(i11));
                    View view = a10.f56952a;
                    profileActivity.d.t(a10, i11);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 += view.getMeasuredHeight();
                    i11++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i12) + i10));
                qu0 qu0Var = profileActivity.f41688a;
                qu0Var.setPadding(0, qu0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f41688a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.f41750i2.cancel();
                float[] fArr = profileActivity.f41769l2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.X4(1.0f);
                profileActivity.P1 = profileActivity.j4();
            }
        }
        profileActivity.L.m(profileActivity.f41742h1, user, 8);
    }

    public static void c0(org.telegram.ui.ProfileActivity r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.c0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void c5(int i7, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i7) {
            view.getLayoutParams().height = i7;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i7);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.k5 k5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.hc b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.f1 f1Var = new ug.f1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f41866z0);
        k5Var.getLocationOnScreen(new int[2]);
        f1Var.f56483n2 = k5Var.f27760h0;
        f1Var.f56484o2 = k5Var.f27761i0;
        f1Var.f56487r2 = k5Var.getScaleX();
        f1Var.f56485p2 = k5Var.getLeft();
        f1Var.f56486q2 = k5Var.getTop();
        f1Var.f56488s2 = k5Var;
        Drawable rightDrawable = k5Var.getRightDrawable();
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (rightDrawable == g5Var && g5Var != null) {
            Drawable drawable = g5Var.f33789f[0];
            if (drawable instanceof org.telegram.ui.Components.i5) {
                f1Var.f56487r2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.i5) drawable).f34445e;
                if (document != null) {
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(profileActivity.getParentActivity());
                    org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28013m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.hc.b(document);
                        if (d != null) {
                            d.f25378e = 512;
                            d.f25379f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.ij.L2(document, false)) {
                            d.f25378e = 512;
                            d.f25379f = 512;
                        }
                        b10 = org.telegram.messenger.hc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.hc hcVar = b10;
                    l9Var.setLayerNum(7);
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    l9Var.m(hcVar, str2, org.telegram.messenger.hc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.i5) profileActivity.F.f33789f[0]).c()) {
                        l9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, profileActivity.f41866z0), PorterDuff.Mode.SRC_IN));
                        f1Var.f56490u2 = org.telegram.messenger.ij.j1(document);
                    } else {
                        f1Var.f56490u2 = org.telegram.messenger.ij.j1(document);
                    }
                    f1Var.f56489t2 = l9Var;
                    f1Var.f56492w2 = true;
                }
            }
        }
        profileActivity.showDialog(f1Var);
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.f41699b2, 0.25f) / 0.25f;
        float f10 = 1.0f;
        if (profileActivity.f41794p1) {
            profileActivity.f41822t0.setAlpha(1.0f - min);
            profileActivity.f41822t0.setBlurIntensity(0.0f);
            int i7 = 0;
            profileActivity.f41822t0.setGooeyEnabled(false);
            org.telegram.ui.Components.wf0 wf0Var = profileActivity.f41822t0;
            if (profileActivity.f41699b2 >= 1.0f) {
                i7 = 8;
            }
            wf0Var.setVisibility(i7);
        } else {
            profileActivity.f41822t0.setHideProgress(profileActivity.f41699b2);
        }
        cv0 cv0Var = profileActivity.f41828u0;
        if (cv0Var != null && profileActivity.I1 != 2) {
            float f11 = profileActivity.f41699b2;
            if (f11 > 0.0f) {
                f10 = org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f11, 0.0f, 0.5f));
            }
            cv0Var.setAlpha(f10);
        }
        profileActivity.x5();
    }

    public static void d5(org.telegram.ui.ActionBar.f5 f5Var, boolean z9, boolean z10) {
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

    public static void e0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f26976id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && profileActivity.H2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.K(profileActivity.H2, null, true, true).renameTo(K);
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
                new File(str).renameTo(org.telegram.messenger.w7.K(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.I2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.K(profileActivity.I2, null, true, true).renameTo(K2);
            }
            profileActivity.getMessagesController().U0(a22.f27101id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.f41713d1);
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(b22, false);
            }
        }
        if (!org.telegram.messenger.g0.Q1() && !profileActivity.f41775m2 && profileActivity.f41719e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            z9 = true;
        } else {
            z9 = false;
        }
        profileActivity.f41782n2 = z9;
        profileActivity.H2 = null;
        profileActivity.I2 = null;
        av0 av0Var = profileActivity.f41781n0;
        av0Var.H0 = true;
        av0Var.K0 = profileActivity.J2;
        av0Var.f38042q1 = null;
        av0Var.f38043r1 = null;
        av0Var.setCreateThumbFromParent(false);
        profileActivity.I5(true);
        profileActivity.j5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.f25046r, Integer.valueOf(org.telegram.messenger.qp.C8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.f25003j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean f0(ProfileActivity profileActivity, boolean[] zArr, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_error tL_error) {
        boolean z10;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.qp.s1(profileActivity.currentAccount).f24749d7.edit().putLong("dialog_join_requested_time_" + profileActivity.f41742h1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.t3.T(profileActivity.D2) && !profileActivity.D2.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = org.telegram.ui.Components.b70.f32019q1;
        org.telegram.ui.Components.b70.J0(parentActivity, profileActivity, org.telegram.ui.Components.hc.a0(profileActivity), z10);
        if (!z9 || profileActivity.L4 != -1) {
            profileActivity.J5();
            jw0 jw0Var = profileActivity.d;
            if (jw0Var != null) {
                jw0Var.f();
            }
        }
        if (f2Var instanceof an) {
            ((an) f2Var).Yb(false, true);
        }
        return false;
    }

    public static void g0(ProfileActivity profileActivity) {
        org.telegram.messenger.qp.s1(profileActivity.currentAccount).l0(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    public static void h0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(profileActivity).Q(2131623989, 36, org.telegram.messenger.hd.M0(2131746855, null));
            Q.f32527j = 5000;
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
                String M0 = org.telegram.messenger.hd.M0(2131746851, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131746852, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                profileActivity.showDialog(u1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.o(null, 2131743880, org.telegram.ui.Components.hc.a0(profileActivity), 2131624011, 36);
    }

    public static void i0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            hi.q3.J0(context, profileActivity.currentAccount, profileActivity.f41830u2.starref_program, profileActivity.getUserConfig().e(), profileActivity.f41866z0, false);
        } else {
            hi.q3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.f41866z0);
        }
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.H2 = fileLocation;
            profileActivity.I2 = photoSize2.location;
            profileActivity.f41719e0.j(org.telegram.messenger.hc.e(fileLocation), "50_50", profileActivity.f41793p0, null);
            if (profileActivity.N2 != -1) {
                profileActivity.J5();
                jw0 jw0Var = profileActivity.d;
                if (jw0Var != null) {
                    jw0Var.f();
                }
                profileActivity.y4(true);
            }
            av0 av0Var = profileActivity.f41781n0;
            org.telegram.messenger.hc e10 = org.telegram.messenger.hc.e(profileActivity.I2);
            profileActivity.J2 = e10;
            av0Var.A(e10, org.telegram.messenger.hc.e(profileActivity.H2));
            profileActivity.j5(true, false);
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
            profileActivity.f41754i6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new h50(22, profileActivity, str));
        }
        profileActivity.actionBar.q().requestLayout();
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User a22;
        TLRPC.ChatParticipant chatParticipant;
        jw0 jw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f41688a.C0();
        if (i7 == profileActivity.R3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41713d1));
            TLRPC.UserFull userFull = profileActivity.f41830u2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                bi.n0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.f41713d1, new bi.b2(profileActivity, context, e10, 3));
            } else if (a23 == null || !a23.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new hi.j(profileActivity.f41713d1));
            }
        } else if (i7 == profileActivity.P3) {
            boolean z9 = !profileActivity.getMessagesController().r2(j3, profileActivity.f41728f1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.f41728f1, z9);
            org.telegram.ui.Components.hc.A(profileActivity, z9, null).j();
            profileActivity.v5();
            int i10 = profileActivity.P3;
            if (i10 < 0 || (jw0Var = profileActivity.d) == null) {
                return;
            }
            jw0Var.g(i10);
        } else if (i7 == profileActivity.Y3) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41713d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.f27101id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f41716d5);
            bundle.putString("first_name_card", profileActivity.f41724e5);
            bundle.putString("last_name_card", profileActivity.f41732f5);
            nr nrVar = new nr(bundle, profileActivity.f41866z0);
            nrVar.O = new xt0(profileActivity, a24);
            profileActivity.presentFragment(nrVar);
        } else if (i7 == profileActivity.V3) {
            TextView textView = (TextView) org.telegram.ui.Components.v4.f0(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751509, null), org.telegram.messenger.hd.M0(2131751593, null), org.telegram.messenger.hd.M0(2131751592, null), org.telegram.messenger.hd.M0(2131751599, null), new fu0(profileActivity, 1), profileActivity.f41866z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
            }
        } else if (i7 == profileActivity.W3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41866z0);
            String M0 = org.telegram.messenger.hd.M0(2131746212, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746233, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.f41694a5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.f41866z0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.hd.f22871a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.f22871a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                c2VarArr[0].setOnClickListener(new y00(c2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746231, null), new lk0(10, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new go0(3));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28089q7, null);
            }
        } else if (i7 == profileActivity.f41804q4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f41742h1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.f2(bundle2));
        } else if (i7 == profileActivity.f41797p4) {
            profileActivity.showDialog(org.telegram.ui.Components.v4.S(profileActivity.getParentActivity(), profileActivity.C2, profileActivity.f41866z0).f27292a);
        } else if (i7 == profileActivity.M3) {
            profileActivity.F4(view, f10, f11, false);
        } else if (i7 == profileActivity.K4) {
            profileActivity.getMessagesController().f5(null, profileActivity.f41713d1);
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
            profileActivity.I4();
        } else if (i7 == profileActivity.U3) {
            oy0.K0(profileActivity.a(), profileActivity);
        } else if (i7 >= profileActivity.f41826t4 && i7 < profileActivity.f41832u4) {
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant = profileActivity.f41824t2.participants.participants.get(((Integer) profileActivity.B2.get(i7 - profileActivity.f41826t4)).intValue());
            } else {
                chatParticipant = profileActivity.f41824t2.participants.participants.get(i7 - profileActivity.f41826t4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i7 == profileActivity.f41839v4) {
            profileActivity.J4();
        } else if (i7 == profileActivity.K3) {
            profileActivity.Q4(f10, f11, i7, view);
        } else if (i7 == profileActivity.f41765k4) {
            if (profileActivity.D2 != null) {
                profileActivity.showDialog(new ii.d0(profileActivity, profileActivity.D2.linked_community_id, null, null));
            } else if (profileActivity.f41713d1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41713d1))) == null) {
            } else {
                profileActivity.showDialog(new ii.d0(profileActivity, a22.linked_community_id, null, null));
            }
        } else if (i7 == profileActivity.H3) {
            if (profileActivity.f41824t2.location instanceof TLRPC.TL_channelLocation) {
                pa0 pa0Var = new pa0(5);
                pa0Var.f48745l0 = -profileActivity.f41720e1;
                pa0Var.B0 = (TLRPC.TL_channelLocation) profileActivity.f41824t2.location;
                profileActivity.presentFragment(pa0Var);
            }
        } else if (i7 == profileActivity.L4) {
            profileActivity.E4(false);
        } else if (i7 == profileActivity.f41847w4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f41720e1);
            bundle3.putInt("type", 2);
            oq oqVar = new oq(bundle3);
            oqVar.C0(profileActivity.f41824t2);
            profileActivity.presentFragment(oqVar);
        } else if (i7 == profileActivity.f41855x4) {
            profileActivity.presentFragment(new bi.w4(profileActivity.f41720e1));
        } else if (i7 == profileActivity.f41863y4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f41720e1);
            bundle4.putInt("type", 1);
            oq oqVar2 = new oq(bundle4);
            oqVar2.C0(profileActivity.f41824t2);
            profileActivity.presentFragment(oqVar2);
        } else if (i7 == profileActivity.f41870z4) {
            profileActivity.R0.performClick();
        } else if (i7 == profileActivity.A4) {
            profileActivity.presentFragment(new bi.z(0, profileActivity.f41713d1));
        } else if (i7 == profileActivity.B4) {
            profileActivity.presentFragment(new bi.z(1, profileActivity.f41713d1));
        } else if (i7 == profileActivity.C4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f41720e1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new c51(bundle5));
        } else if (i7 == profileActivity.F4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f41720e1);
            bundle6.putInt("type", 0);
            oq oqVar3 = new oq(bundle6);
            oqVar3.C0(profileActivity.f41824t2);
            profileActivity.presentFragment(oqVar3);
        } else if (i7 == profileActivity.f41722e3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i7 == profileActivity.f41737g3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.G2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i7 == profileActivity.f41744h3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i7 == profileActivity.f41751i3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i7 == profileActivity.j3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i7 == profileActivity.f41770l3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i7 == profileActivity.f41764k3) {
            profileActivity.presentFragment(new w90());
        } else if (i7 == profileActivity.f41776m3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i7 == profileActivity.f41796p3) {
            profileActivity.showDialog(org.telegram.ui.Components.v4.R(profileActivity, profileActivity.f41866z0));
        } else if (i7 == profileActivity.f41803q3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131744241, null));
        } else if (i7 == profileActivity.f41811r3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746780, null));
        } else if (i7 == profileActivity.f41831u3) {
            V4(profileActivity.getParentActivity(), false);
        } else if (i7 == profileActivity.f41838v3) {
            V4(profileActivity.getParentActivity(), true);
        } else if (i7 == profileActivity.f41846w3) {
            org.telegram.messenger.a8.a();
        } else if (i7 == profileActivity.f41854x3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41866z0);
            String M03 = org.telegram.messenger.hd.M0(2131754120, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
            u1Var2.T = M03;
            u1Var2.R = org.telegram.messenger.hd.M0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), new tt0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            profileActivity.showDialog(u1Var2);
        } else if (i7 == profileActivity.f41730f3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i7 == profileActivity.U2) {
            profileActivity.presentFragment(new la(null));
        } else if (i7 == profileActivity.V2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i7 == profileActivity.S2) {
            profileActivity.presentFragment(new g(3));
        } else if (i7 == profileActivity.N2) {
            profileActivity.I4();
        } else if (i7 == profileActivity.f41701b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i7 == profileActivity.f41709c4) {
            profileActivity.presentFragment(new bi.dd());
        } else if (i7 == profileActivity.f41715d4) {
            profileActivity.presentFragment(new gi.f());
        } else if (i7 == profileActivity.f41723e4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i7 == profileActivity.f41731f4) {
            wg.f1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
        } else if (i7 == profileActivity.botPermissionLocation) {
            hi.r0 r0Var = profileActivity.f41810r2;
            if (r0Var != null) {
                r0Var.l(!r0Var.g(), new qn0(20, profileActivity, view));
            }
        } else if (i7 == profileActivity.botPermissionBiometry) {
            hi.p pVar = profileActivity.f41818s2;
            if (pVar != null) {
                pVar.f14849f = true;
                pVar.f14848e = !pVar.f14848e;
                pVar.k();
                ((org.telegram.ui.Cells.m8) view).setChecked(profileActivity.f41818s2.f14848e);
            }
        } else if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.setChecked(!m8Var.d());
            if (profileActivity.f41784n4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f41784n4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.f41713d1);
            boolean d = m8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f41830u2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new h50(21, profileActivity, r1));
            profileActivity.f41784n4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i7 == profileActivity.N3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.T4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.N3);
            int i11 = profileActivity.f41767k6;
            if (i11 >= 0) {
                profileActivity.f41704c.h1(i11, profileActivity.f41773l6 - profileActivity.f41688a.getPaddingTop());
            }
        } else if (i7 == profileActivity.O3) {
            profileActivity.N4(false);
        } else if (i7 == profileActivity.P2) {
            if (profileActivity.f41830u2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f41830u2.personal_channel_id);
            profileActivity.presentFragment(new an(bundle7));
        } else if (i7 == profileActivity.T2) {
            ax0 ax0Var = profileActivity.f41872z6;
            if ((ax0Var == null || !ax0Var.a()) && !profileActivity.Z3(i7, view)) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (x8Var.d.getDrawable() != null) {
                    profileActivity.H4(x8Var.getImageView());
                }
            }
        } else if (i7 == profileActivity.G3) {
            profileActivity.Y3(i7, view);
        } else {
            profileActivity.Q4(f10, f11, i7, view);
        }
    }

    public static void l0(ProfileActivity profileActivity) {
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
        final TLRPC.UserFull userFull = profileActivity.f41830u2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(profileActivity.getParentActivity(), false, 1, null);
            org.telegram.ui.ActionBar.g2 g2Var2 = h.f28651x0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.f41866z0);
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
                TextView[] textViewArr = new org.telegram.ui.Components.w70[2];
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i11;
                    org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(3, parentActivity, null);
                    textViewArr[i12] = jbVar;
                    jbVar.setGravity(i10);
                    textViewArr[i12].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.r6.V(textViewArr[i12], org.telegram.ui.ActionBar.k6.f28240y6, null);
                    org.telegram.ui.ActionBar.r6.H(textViewArr[i12], org.telegram.ui.ActionBar.k6.Uc, null);
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
                    org.telegram.ui.ActionBar.r6.V(textViewArr[0], org.telegram.ui.ActionBar.k6.f28089q7, null);
                    if (z10) {
                        textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "StarRatingLevelNegativeYou", (int) j11)));
                    } else {
                        textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745173, org.telegram.messenger.m5.l(org.telegram.messenger.p10.f24459s0, profileActivity.a()))));
                    }
                    r3Var = r3Var2;
                    c10 = 0;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.hd.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.hd.H(',', "StarRatingFuturePendingPoints", (int) j14);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i14] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    r3Var = r3Var2;
                    c10 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745187, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i15 = r4;
                            r3 r3Var3 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var3.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
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
                                    RectF rectF = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var3.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    r3Var3.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview1", max);
                String H4 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview2", (int) j14);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = H3;
                final r3 r3Var3 = r3Var;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i14] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745186, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i15 = r4;
                        r3 r3Var32 = r3Var3;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var32.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.S6;
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
                                RectF rectF = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var32.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.S6;
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
            textView4.setText(org.telegram.messenger.hd.M0(2131745168, null));
            textView4.setTextSize(1, 20.0f);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView4, i15, profileActivity.f41866z0);
            linearLayout.addView(textView4, c8.ha.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f27102id == org.telegram.messenger.p10.i(profileActivity.currentAccount).e()) {
                textView5.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745169, null)));
                i7 = 1;
            } else {
                i7 = 1;
                org.telegram.messenger.k5.r(null, null, 2131745199, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.p10.f24459s0, profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i7, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView5, i15, profileActivity.f41866z0);
            linearLayout.addView(textView5, c8.ha.t(-1, -2, 17, 20, 0, 20, 12));
            is0 is0Var = new is0(parentActivity, profileActivity.f41866z0);
            is0Var.f46735a.l(org.telegram.messenger.hd.M0(2131745167, null), false);
            String M0 = org.telegram.messenger.hd.M0(2131745202, null);
            int i16 = org.telegram.ui.ActionBar.k6.Ci;
            is0Var.f46736b.setText(org.telegram.messenger.hd.V(null, null, 2131745198, W3(M0, i16, profileActivity.f41866z0)));
            is0Var.d.setVisibility(8);
            ImageView imageView = is0Var.f46737c;
            imageView.setImageResource(2131231827);
            org.telegram.ui.ActionBar.f6 f6Var = profileActivity.f41866z0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView, i15, f6Var, mode);
            linearLayout.addView(is0Var, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var2 = new is0(parentActivity, profileActivity.f41866z0);
            is0Var2.f46735a.l(org.telegram.messenger.hd.M0(2131745166, null), false);
            is0Var2.f46736b.setText(org.telegram.messenger.hd.V(null, null, 2131745197, W3(org.telegram.messenger.hd.M0(2131745202, null), i16, profileActivity.f41866z0)));
            is0Var2.d.setVisibility(8);
            ImageView imageView2 = is0Var2.f46737c;
            imageView2.setImageResource(2131231891);
            org.telegram.ui.ActionBar.r6.t(imageView2, i15, profileActivity.f41866z0, mode);
            linearLayout.addView(is0Var2, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var3 = new is0(parentActivity, profileActivity.f41866z0);
            is0Var3.f46735a.l(org.telegram.messenger.hd.M0(2131745165, null), false);
            String M02 = org.telegram.messenger.hd.M0(2131745200, null);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28013m6, profileActivity.f41866z0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28240y6, profileActivity.f41866z0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            ez ezVar = new ez(9);
            ezVar.f45447w = M02;
            if (ezVar.f45441c != null) {
                str = null;
                ezVar.f45441c = null;
                ezVar.a();
            } else {
                str = null;
            }
            ezVar.f45443f = w02;
            ezVar.f45444n = false;
            spannableStringBuilder3.setSpan(ezVar, 0, spannableStringBuilder3.length(), 0);
            is0Var3.f46736b.setText(org.telegram.messenger.hd.V(str, str, 2131745196, spannableStringBuilder3));
            is0Var3.d.setVisibility(8);
            ImageView imageView3 = is0Var3.f46737c;
            imageView3.setImageResource(2131231875);
            org.telegram.ui.ActionBar.r6.t(imageView3, i15, profileActivity.f41866z0, mode);
            linearLayout.addView(is0Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(parentActivity, profileActivity.f41866z0, true);
            dVar.setOnClickListener(new lu0(0, g2Var));
            dVar.i(bi.k7.g2(org.telegram.messenger.hd.M0(2131743889, null)), false, true);
            linearLayout.addView(dVar, c8.ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.N = linearLayout;
            h.show();
        }
    }

    public static void m0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        switch (i7) {
            case 0:
                boolean z9 = profileActivity.f41794p1;
                if (z9) {
                    if (z9) {
                        profileActivity.c4();
                        return;
                    }
                    return;
                } else if (profileActivity.f41713d1 != 0) {
                    profileActivity.L4();
                    return;
                } else if (profileActivity.f41720e1 != 0) {
                    if (org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f41720e1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f41720e1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new an(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.c4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f41720e1);
                        if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                            profileActivity.presentFragment(new an(bundle2), false);
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
                profileActivity.F4(profileActivity.Z, f10, f11, true);
                return;
            case 2:
                profileActivity.M4();
                return;
            case 3:
                profileActivity.D4();
                return;
            case 4:
                profileActivity.G4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.C4(false);
                return;
            case 6:
                profileActivity.C4(true);
                return;
            case 7:
                profileActivity.E4(true);
                return;
            case 8:
                oy0.K0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.w4(false);
                return;
            case 12:
                profileActivity.getMessagesController().f24759e7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, profileActivity.getParentActivity(), profileActivity.f41866z0);
                u1Var.r(200L);
                org.telegram.messenger.qp.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.ex(21, profileActivity, u1Var), true, profileActivity.f41866z0);
                return;
            case 13:
                profileActivity.B4(true);
                return;
            case 14:
                profileActivity.I4();
                return;
            case 15:
                TLRPC.User f12 = profileActivity.getUserConfig().f();
                if (f12 != null) {
                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(profileActivity, profileActivity.Z);
                    H.f35183w = false;
                    H.f35162i = 3;
                    H.c(2131232320, org.telegram.messenger.hd.M0(2131746499, null), new j90(profileActivity, 24), false);
                    H.c(2131232103, org.telegram.messenger.hd.M0(2131746677, null), new ef0(f12, 29), false);
                    H.c(2131232116, org.telegram.messenger.hd.M0(2131746619, null), new j90(profileActivity, 26), false);
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
                profileActivity.presentFragment(new m31(null));
                return;
            default:
                return;
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        boolean z9;
        TLRPC.Document document;
        if (profileActivity.f41689a0 == null) {
            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23732a == profileActivity.currentAccount && MediaController.B().Q0.f23733b == profileActivity.a()) {
                profileActivity.f41689a0 = MediaController.B().Q0;
            } else {
                org.telegram.messenger.kp kpVar = new org.telegram.messenger.kp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f41689a0 = kpVar;
                TLRPC.UserFull userFull = profileActivity.f41830u2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = kpVar.f23734c;
                    arrayList.clear();
                    kpVar.b();
                    arrayList.add(0, kpVar.d(document));
                }
            }
        }
        if (!profileActivity.f41689a0.f23734c.isEmpty()) {
            if (MediaController.B().Q0 == profileActivity.f41689a0 && MediaController.B().I((org.telegram.messenger.ij) profileActivity.f41689a0.f23734c.get(0))) {
                z9 = true;
            } else {
                MediaController.B().o();
                z9 = false;
            }
            MediaController.B().Q0 = profileActivity.f41689a0;
            MediaController.B().R0.clear();
            MediaController.B().R0.addAll(profileActivity.f41689a0.f23734c);
            if (!z9) {
                MediaController.B().S((org.telegram.messenger.ij) profileActivity.f41689a0.f23734c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.b8(profileActivity.getParentActivity(), profileActivity.f41866z0));
        }
    }

    public static void o0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.na0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new j90(profileActivity, 20), profileActivity.f41866z0);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.f41713d1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.f41694a5);
        tL_messages_reportReaction.f27060id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new di.u5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f41694a5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41713d1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.hc.a0(profileActivity).E(profileActivity.f41866z0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.f41713d1;
        if (j3 == 0) {
            long j10 = profileActivity.f41720e1;
            if (j10 != 0) {
                j3 = -j10;
            } else {
                j3 = profileActivity.f41742h1;
            }
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.qp.s1(profileActivity.currentAccount).W(profileActivity.f41694a5, j11);
        } else {
            org.telegram.messenger.qp.s1(profileActivity.currentAccount).h0(profileActivity.f41694a5, profileActivity.Z4, j11);
        }
        profileActivity.Z4 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(profileActivity.getParentActivity(), profileActivity.f41866z0);
        kbVar.d(2131623981, new String[0]);
        kbVar.f35252b.setText(org.telegram.messenger.hd.M0(2131746403, null));
        org.telegram.ui.Components.hc.a0(profileActivity).b(kbVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z9) {
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
        profileActivity.f41696b.setTranslationY(floatValue * f10);
        profileActivity.O.setTranslationY(f10 * profileActivity.T1);
        profileActivity.f41688a.setTranslationY((1.0f - profileActivity.T1) * f14);
        profileActivity.f41688a.setScaleX(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f41688a.setScaleY(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f41688a.setAlpha(profileActivity.T1);
        boolean z10 = true;
        profileActivity.y4(true);
        profileActivity.f41688a.setAlpha(f11);
        profileActivity.f41696b.setAlpha(1.0f - profileActivity.T1);
        profileActivity.f41696b.setScaleX((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.f41696b.setScaleY((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f11);
        profileActivity.X.setAlpha(f11);
        profileActivity.f41719e0.setAlpha(f11);
        cv0 cv0Var = profileActivity.f41828u0;
        if (cv0Var != null) {
            cv0Var.setAlpha(f11);
        }
        profileActivity.f41726f.setAlpha(f11);
        bv0 bv0Var = profileActivity.f41807r;
        if (!profileActivity.R5) {
            f13 = f11;
        }
        bv0Var.setAlpha(f13);
        profileActivity.T0.getSearchField().setAlpha(f12);
        if (z9 && profileActivity.T1 < 0.7f) {
            org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
            if (f5Var.F.getWidth() != 0 && !f5Var.f28425e.isFocused()) {
                f5Var.f28425e.requestFocus();
                org.telegram.messenger.g0.K3(f5Var.f28425e);
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
        kVar.y(z10);
        org.telegram.ui.ActionBar.f5 f5Var3 = profileActivity.S0;
        if (f5Var3 != null) {
            f5Var3.setAlpha(f11);
        }
        profileActivity.T0.setAlpha(f11);
        profileActivity.f41706c1.invalidate();
        profileActivity.fragmentView.invalidate();
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
        profileActivity.f41688a.setVisibility(i7);
        org.telegram.ui.Components.pj0 pj0Var = profileActivity.f41696b;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pj0Var.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        if (!z9) {
            i11 = 8;
        }
        searchContainer.setVisibility(i11);
        bi.g1 g1Var = profileActivity.f41835v0;
        if (g1Var != null) {
            g1Var.setActive(!z9);
        }
        profileActivity.actionBar.y(z9);
        profileActivity.X.setVisibility(i7);
        cv0 cv0Var = profileActivity.f41828u0;
        if (cv0Var != null) {
            cv0Var.setVisibility(i7);
        }
        profileActivity.f41726f.setVisibility(i7);
        profileActivity.f41807r.setVisibility(i7);
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.S0;
        if (f5Var != null) {
            f5Var.setAlpha(1.0f);
            profileActivity.S0.setVisibility(i7);
        }
        profileActivity.T0.setVisibility(i7);
        profileActivity.f41719e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        cv0 cv0Var2 = profileActivity.f41828u0;
        if (cv0Var2 != null) {
            cv0Var2.setAlpha(1.0f);
        }
        bi.g1 g1Var2 = profileActivity.f41835v0;
        if (g1Var2 != null) {
            g1Var2.setAlpha(1.0f);
        }
        profileActivity.f41726f.setAlpha(1.0f);
        bv0 bv0Var = profileActivity.f41807r;
        if (profileActivity.R5) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        bv0Var.setAlpha(f10);
        profileActivity.T0.setAlpha(1.0f);
        profileActivity.f41688a.setAlpha(1.0f);
        profileActivity.f41696b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z9) {
            profileActivity.f41696b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public final void A5() {
        if (this.simpleActionBar != null && this.G5 != null) {
            org.telegram.ui.Components.if0 if0Var = this.I5;
            if (if0Var != null) {
                float l42 = l4();
                if (if0Var.f34583l != l42) {
                    if0Var.f34583l = l42;
                    if0Var.a();
                }
            }
            int f10 = i0.a.f(l4(), this.C5, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f41866z0));
            if (this.F5 != f10) {
                this.F5 = f10;
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                y4Var.f28793l0 = true;
                y4Var.f28787f0 = f10;
                y4Var.updateColors();
            }
            int e12 = this.H5.e1();
            if (this.K5 != e12) {
                this.K5 = e12;
                org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
                fh.g gVar = y4Var2.H;
                if (gVar != null) {
                    gVar.updateColors();
                    y4Var2.I.updateColors();
                    y4Var2.J.updateColors();
                }
                y4Var2.invalidate();
                org.telegram.ui.ActionBar.i5 i5Var = y4Var2.Q;
                if (i5Var != null) {
                    i5Var.invalidate();
                }
            }
        }
    }

    @Override
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21119a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z9) {
        boolean z10;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41713d1));
        if (a22 != null) {
            if (this.f41802q2 && !org.telegram.messenger.qp.F2(a22)) {
                if (this.f41756j1 && !z9) {
                    getMessagesController().f5(new j90(this, 6), this.f41713d1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.D2;
                if (this.C2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.v4.r(this, false, chat, a22, z10, true, false, true, new xt0(this, a22));
            } else if (this.f41756j1) {
                getMessagesController().f5(null, this.f41713d1);
                if (org.telegram.ui.Components.hc.a(this)) {
                    org.telegram.ui.Components.hc.d(this, false).j();
                }
            } else if (this.f41762k1) {
                org.telegram.ui.Components.v4.g0(this, this.f41713d1, a22, null, this.C2, false, null, new na(this, 3), this.f41866z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f41866z0);
                String M0 = org.telegram.messenger.hd.M0(2131753692, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new tt0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, this.f41866z0);
                }
            }
        }
    }

    public final void B5(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.S0 != null) {
            boolean z15 = this.R5;
            boolean z16 = !z15;
            boolean z17 = this.f41789o2;
            org.telegram.ui.ActionBar.f5 f5Var = this.P0;
            boolean z18 = false;
            if (!z15 && !z17 && this.L0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5(f5Var, z10, z9);
            org.telegram.ui.ActionBar.f5 f5Var2 = this.Q0;
            if (!z15 && !z17 && this.M0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d5(f5Var2, z11, z9);
            org.telegram.ui.ActionBar.f5 f5Var3 = this.R0;
            if (!z15 && !z17 && this.N0) {
                z12 = true;
            } else {
                z12 = false;
            }
            d5(f5Var3, z12, z9);
            vv0 vv0Var = this.N;
            if (vv0Var != null && vv0Var.I != null && vv0Var.v0(vv0Var.getClosestTab())) {
                z13 = true;
            } else {
                z13 = false;
            }
            org.telegram.ui.ActionBar.f5 f5Var4 = this.S0;
            if (z9 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            d5(f5Var4, z16, z14);
            vv0 vv0Var2 = this.N;
            if (vv0Var2 != null) {
                boolean z19 = this.R5;
                if (z9 && !z13) {
                    z18 = true;
                }
                if (vv0Var2.f40402p2 != z19) {
                    vv0Var2.f40402p2 = z19;
                    vv0Var2.R(z9, z18);
                }
            }
        }
    }

    public final void C4(boolean z9) {
        boolean z10 = false;
        if (this.f41713d1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41713d1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.f41830u2;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                }
                org.telegram.ui.Components.voip.y1.m(a22, z9, z10, getParentActivity(), this.f41830u2, getAccountInstance());
            }
        } else if (this.f41720e1 != 0) {
            if (getMessagesController().g1(this.f41720e1, false, null) == null) {
                TLRPC.Chat chat = this.D2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.t60.J0(getParentActivity(), -chat.f26952id, accountInstance, new org.telegram.ui.Components.hr(chat, this, accountInstance, 6));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.y1.l(this.D2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void C5() {
        TLRPC.User a22;
        boolean z9;
        int i7;
        int i10;
        if (this.f41809r1 && this.W0 != null && this.V0 != null && (a22 = getMessagesController().a2(Long.valueOf(this.f41713d1))) != null) {
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
                i10 = 2131746619;
            } else {
                i10 = 2131746618;
            }
            z0Var2.setText(org.telegram.messenger.hd.M0(i10, null));
            org.telegram.ui.ActionBar.z0 z0Var3 = this.V0;
            if (org.telegram.messenger.t10.n(a22) == null) {
                i11 = 8;
            }
            z0Var3.setVisibility(i11);
        }
    }

    public final void D4() {
        TLRPC.UserFull userFull = this.f41830u2;
        if (userFull != null && org.telegram.messenger.t10.b(userFull)) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0(null, null, 2131743743, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.hc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        if (this.D2 != null) {
            org.telegram.ui.Components.z20.h.a();
        }
        showDialog(new zh.h1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void D5(boolean z9, boolean z10) {
        if (this.d == null) {
            if (z9) {
                G5(false);
            }
            J5();
        } else if (!z10 && this.f41688a.isInLayout()) {
            qu0 qu0Var = this.f41688a;
            if (!qu0Var.G) {
                return;
            }
            qu0Var.post(new org.telegram.ui.Components.tp0(11, this, z9));
        } else {
            xv0 xv0Var = new xv0(this);
            xv0Var.f51993b = this.M2;
            xv0Var.f(xv0Var.f51994c);
            xv0Var.f51995e.clear();
            xv0Var.f51996f.clear();
            xv0Var.f51995e.addAll(this.Q4);
            xv0Var.f51996f.addAll(this.R4);
            xv0Var.f51997g = this.f41826t4;
            xv0Var.h = this.f41832u4;
            if (z9) {
                G5(false);
            }
            T4();
            J5();
            xv0Var.f(xv0Var.d);
            try {
                v4.o.c(xv0Var, true).c(this.d);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.d.f();
            }
            int i7 = this.f41767k6;
            if (i7 >= 0) {
                this.f41704c.h1(i7, this.f41773l6 - this.f41688a.getPaddingTop());
            }
            org.telegram.messenger.g0.b4(this.f41688a);
        }
    }

    public final void E4(boolean z9) {
        boolean[] zArr = {true};
        getMessagesController().m(this.D2.f26952id, getUserConfig().f(), 0, null, this, true, new g60(this, z9, zArr, 8), new a3.g(this, zArr, z9, this.parentLayout.getLastFragment(), 7), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
    }

    public final void E5() {
        int i7;
        if (this.f41697b0 != null && this.f41807r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22531m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            boolean z9 = this.F1;
            if (z9 && this.I1 == 2 && this.X != null) {
                this.f41697b0.setAlpha(this.R1);
                this.f41697b0.f(org.telegram.messenger.g0.L(74.0f) + this.f41688a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
                return;
            }
            if (z9) {
                this.f41697b0.setAlpha(this.R1);
            }
            float f10 = i10;
            float L = this.P1 + f10 + org.telegram.messenger.g0.L(74.0f);
            float min = Math.min(e4(), L - f10);
            this.f41697b0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
        }
    }

    public final void F4(View view, float f10, float f11, boolean z9) {
        float f12;
        float f13;
        long j3;
        long j10 = this.f41742h1;
        if (j10 == 0) {
            j10 = this.f41713d1;
            if (j10 == 0) {
                j10 = -this.f41720e1;
            }
        }
        long j11 = j10;
        boolean r22 = getMessagesController().r2(j11, this.f41728f1, null);
        if (z9 && (this.f41794p1 || r22)) {
            boolean z10 = !r22;
            getNotificationsController().G(j11, this.f41728f1, z10);
            org.telegram.ui.Components.hc.A(this, z10, null).j();
            v5();
            this.Z.setNotifications(r22);
        } else if ((!z9 && org.telegram.messenger.hd.f22871a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f22871a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z11 = h5Var.f29272e.h;
            boolean z12 = !z11;
            boolean D = getNotificationsController().D(j11, null, false, false);
            String v = org.telegram.messenger.dt.v(j11, this.f41728f1, false);
            if (!z11) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24749d7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f41728f1 == 0) {
                    getMessagesStorage().E1(j11, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.s1(this.currentAccount).f24749d7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j3 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j3 = 1;
                }
                getNotificationsController().N(j11);
                if (this.f41728f1 == 0) {
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
            v5();
            getNotificationsController().c0(j11, this.f41728f1, true);
            h5Var.setChecked(z12);
            org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.f41688a.L(this.M3, false);
            F5(true);
        } else {
            org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(getParentActivity(), this.currentAccount, null, true, new a8.ua(this, j11, 7), this.f41866z0);
            ynVar.e(j11, this.f41728f1, this.f41746h5);
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

    public final void F5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.F5(boolean):void");
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f41713d1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41713d1));
                if (a22 != null) {
                    if (this.E2 != null && (userFull = this.f41830u2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().U2 + "/%s", this.f41830u2.about, org.telegram.messenger.t10.n(a22));
                    } else {
                        str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.t10.n(a22));
                    }
                } else {
                    return;
                }
            } else if (this.f41720e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41720e1));
                if (M0 != null) {
                    TLRPC.ChatFull chatFull = this.f41824t2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().U2 + "/%s", this.f41824t2.about, org.telegram.messenger.t3.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131752982, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void G5(boolean z9) {
        int i7;
        TLRPC.UserStatus userStatus;
        boolean z10;
        int i10 = 0;
        this.A2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.B2.clear();
        TLRPC.ChatFull chatFull = this.f41824t2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z10 && chatFull.participants_count > 200) {
                this.A2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.f41824t2.participants.participants.size()) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41824t2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f27101id == getUserConfig().e()) && a22.status.expires > 10000)) {
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
        if (z9 && this.d != null && this.f41826t4 > 0) {
            org.telegram.messenger.g0.b4(this.f41688a);
        }
        if (this.N != null && this.J4 != -1) {
            if ((this.B2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.N.k1(this.B2, this.f41824t2);
            }
        }
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f41734g0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.f41781n0.O(this.J2, f10);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        if (this.N != null && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22531m;
            } else {
                i7 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int[] iArr = org.telegram.ui.Components.xs0.f40349s2;
            int z9 = org.telegram.messenger.k5.z(6.666f, oi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
            int c10 = oi.a.c(i7) + currentActionBarHeight + z9;
            this.U5 = c10;
            this.N.l1(z9, c10, oi.a.c(this.I6), this.I6 + this.G6);
            this.V5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
            y5();
            P3();
        }
    }

    public final void H4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.K3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f41720e1);
            bundle.putLong("user_id", this.f41713d1);
            presentFragment(new ai.s0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.T2) {
            if (this.f41713d1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.t10.b(this.f41830u2)) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0(null, null, 2131743743, org.telegram.messenger.m5.t(this.f41713d1)), org.telegram.ui.Components.hc.a0(this), 2131624011, 36);
            } else {
                showDialog(new zh.h1(getParentActivity(), this.currentAccount, this.f41713d1, null, null));
            }
        }
    }

    public final void H5() {
        CharSequence charSequence;
        bv0 bv0Var = this.f41807r;
        if (bv0Var != null) {
            if ((!this.R5 || (charSequence = this.W5) == null) && (!this.t6 || (charSequence = this.f41821s6) == null)) {
                charSequence = this.f41814r6;
            }
            if (bv0Var.o(charSequence, !this.F1) && this.fragmentView != null) {
                y4(false);
            }
        }
    }

    @Override
    public final void I() {
        U4(false);
    }

    public final int I3(int i7, Boolean bool) {
        int i10;
        if (this.f41740g6 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, this.f41866z0);
            int f10 = i0.a.f(0.5f, this.f41740g6.m(org.telegram.ui.ActionBar.k6.I.q()), this.f41740g6.n(org.telegram.ui.ActionBar.k6.I.q()));
            if (!org.telegram.ui.ActionBar.k6.e1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.k6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.k6.r1(0.7f, f10));
                }
                return f10;
            }
            boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i10 = org.telegram.ui.ActionBar.k6.r1(0.7f, f10);
            } else {
                i10 = f10;
            }
            return org.telegram.ui.ActionBar.k6.D(q10, w02, f10, i7, i10);
        }
        return i7;
    }

    public final void I4() {
        boolean z9;
        org.telegram.ui.Components.zg0 zg0Var;
        if (this.f41713d1 != 0) {
            if (this.f41800q0 != null) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(this.currentAccount).e()));
                if (a22 == null) {
                    a22 = org.telegram.messenger.p10.i(this.currentAccount).f();
                }
                if (a22 != null) {
                    org.telegram.ui.Components.j30 j30Var = this.f41800q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var.n(z9, new j90(this, 27), new q5(this, 13), 0);
                    this.U.M(0);
                    this.U.P(43);
                    this.V.M(0);
                    this.V.P(43);
                    org.telegram.ui.Components.ef0 ef0Var = this.Z;
                    if (ef0Var != null) {
                        org.telegram.ui.Components.bf0 i7 = org.telegram.ui.Components.ef0.i(14, ef0Var.f33217a);
                        if (i7 != null && (zg0Var = i7.f32123k) != null) {
                            zg0Var.start();
                        }
                    } else {
                        this.f41815s.d();
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
            L4();
            return;
        }
        M4();
    }

    public final void I5(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.I5(boolean):void");
    }

    public final void J3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && this.f41726f != null && this.f41706c1 != null && this.S0 != null && this.P0 != null && this.Q0 != null && this.R0 != null && this.f41787o0 != null) {
            Float valueOf = Float.valueOf(this.Q5);
            fv0 fv0Var = this.S5;
            fv0Var.getClass();
            fv0Var.a(kVar, valueOf);
            if (this.Q5 <= 0.0f && this.f41757j2 > 0.0f) {
                ok okVar = this.f41726f;
                int i7 = -1;
                if (this.f41740g6 != null) {
                    f10 = -1;
                } else {
                    f10 = i0.a.f(this.f41757j2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27969ji, this.f41866z0), -1);
                }
                okVar.setTextColor(f10);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f41740g6 == null) {
                    i7 = i0.a.f(this.f41757j2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, this.f41866z0), -1);
                }
                kVar2.D(i7, false);
            }
        }
    }

    public final void J4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.D2.f26952id);
        w40 w40Var = new w40(k10);
        TLRPC.ChatFull chatFull = this.f41824t2;
        w40Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.f41824t2.participants.participants.size(); i7++) {
                hVar.k(null, this.f41824t2.participants.participants.get(i7).user_id);
            }
            w40Var.J = hVar;
        }
        w40Var.f50954y = new tt0(this, 0);
        presentFragment(w40Var);
    }

    public final void J5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.J5():void");
    }

    public final void K3() {
        int i7;
        int i10;
        if (this.Z5 != null) {
            ValueAnimator valueAnimator = this.f41750i2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41750i2.cancel();
            }
            float l10 = Utilities.l(this.P1 / this.E1);
            if (l10 > 0.0f) {
                float f10 = (l10 - 0.5f) / 0.5f;
                int i11 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f22531m;
                } else {
                    i7 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7) - org.telegram.messenger.g0.L(21.0f));
                this.f41691a2 = org.telegram.messenger.g0.T1(0.42f, this.Z5[0], l10);
                this.Y1 = org.telegram.messenger.g0.T1(this.f41725e6, this.Z5[1], l10);
                this.Z1 = org.telegram.messenger.g0.T1(translationY, this.Z5[2], l10);
                this.f41699b2 = org.telegram.messenger.g0.T1(this.Z5[11], 0.0f, l10);
                this.X.setScaleX(this.f41691a2);
                this.X.setScaleY(this.f41691a2);
                this.X.setTranslationX(this.Y1);
                this.X.setTranslationY(this.Z1);
                org.telegram.ui.Components.lu0 lu0Var = this.S;
                if (lu0Var != null) {
                    lu0Var.setAlpha(l10);
                }
                this.f41719e0.setAlpha(1.0f);
                this.X.setAlpha(1.0f);
                cv0 cv0Var = this.f41828u0;
                if (cv0Var != null) {
                    cv0Var.invalidate();
                }
                bi.g1 g1Var = this.f41835v0;
                if (g1Var != null) {
                    g1Var.f3916e = org.telegram.messenger.g0.T1(0.0f, this.Z5[4], f10);
                    this.f41835v0.f3917f = org.telegram.messenger.g0.T1(0.0f, this.Z5[5], l10);
                    bi.g1 g1Var2 = this.f41835v0;
                    g1Var2.h = true;
                    g1Var2.invalidate();
                }
                uw0 uw0Var = this.f41865y6;
                if (uw0Var != null) {
                    uw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.Z5[6], l10));
                }
                float L = (((this.f41691a2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                this.f41741h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                this.f41741h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                this.f41748i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41748i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                this.f41755j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41755j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                this.f41761k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41761k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                float T1 = org.telegram.messenger.g0.T1(1.0f, this.Z5[7], l10);
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f22531m;
                } else {
                    i10 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (org.telegram.messenger.g0.f22536p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
                float N = org.telegram.messenger.g0.N(22.7f) + floor;
                this.d2 = org.telegram.messenger.g0.T1(floor, this.Z5[8], l10);
                this.f41729f2 = org.telegram.messenger.g0.T1(N, this.Z5[9], l10);
                float T12 = org.telegram.messenger.g0.T1((this.f41725e6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.Z5[12], l10);
                float T13 = org.telegram.messenger.g0.T1((this.f41725e6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.Z5[13], l10);
                this.f41726f.setTranslationX(T12);
                this.f41726f.setTranslationY(this.d2);
                this.f41807r.setTranslationX(this.f41791o5 + T13);
                this.f41807r.setTranslationY(this.f41729f2);
                this.f41707c2 = T12;
                this.f41721e2 = T13;
                this.f41726f.setScaleX(T1);
                this.f41726f.setScaleY(T1);
                q5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.g0.f22531m;
                }
                w5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11);
                z4((int) this.Z5[10], l10, true);
                org.telegram.ui.Components.ef0 ef0Var = this.Z;
                if (ef0Var != null) {
                    ef0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.Z5[3], f10));
                }
            }
        }
    }

    public final void K4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.K4(boolean):void");
    }

    public final void K5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f41755j0 != null && (imageView = this.f41761k0) != null) {
            if (this.K1 && (chat = this.D2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f41761k0.setVisibility(0);
                this.f41755j0.setTag(1);
                this.f41755j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f41761k0.setVisibility(8);
            this.f41755j0.setTag(null);
            this.f41755j0.setVisibility(8);
        }
    }

    public final float L3() {
        return Utilities.l((this.P1 - e4()) / k4());
    }

    public final void L4() {
        TLRPC.User a22;
        if (this.f41713d1 != 0 && !c4() && (a22 = getMessagesController().a2(Long.valueOf(this.f41713d1))) != null && !(a22 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f41713d1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z9 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.g0.Q1() && z9) {
                    org.telegram.messenger.qs notificationCenter = getNotificationCenter();
                    int i7 = org.telegram.messenger.qs.f25059t;
                    notificationCenter.n(this, i7);
                    getNotificationCenter().k(i7, new Object[0]);
                }
                int i10 = getArguments().getInt("nearby_distance", -1);
                if (i10 >= 0) {
                    bundle.putInt("nearby_distance", i10);
                }
                an anVar = new an(bundle);
                org.telegram.messenger.ui mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f25844y0;
                mediaDataController.n1();
                anVar.U9 = document;
                anVar.V9 = false;
                presentFragment(anVar, z9);
                if (org.telegram.messenger.g0.Q1() && !this.I0) {
                    finishFragment();
                }
            }
        }
    }

    public final void L5(boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        boolean z10;
        if ((this.f41828u0 != null || this.f41835v0 != null) && (kVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (kVar.getOccupyStatusBar()) {
                f10 = org.telegram.messenger.g0.f22531m;
            } else {
                f10 = 0.0f;
            }
            int L = org.telegram.messenger.g0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            cv0 cv0Var = this.f41828u0;
            boolean z11 = false;
            if (cv0Var != null) {
                float A = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(right - cv0Var.f41987f0) <= 0.1f && Math.abs(menuPillLeft - cv0Var.f41988g0) <= 0.1f && Math.abs(A - cv0Var.f41989h0) <= 0.1f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cv0Var.f41987f0 = right;
                cv0Var.f41988g0 = menuPillLeft;
                if (z9) {
                    cv0Var.m0.e(true, menuPillLeft);
                }
                cv0Var.f41989h0 = A;
                if (z10) {
                    cv0Var.invalidate();
                }
            }
            bi.g1 g1Var = this.f41835v0;
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

    public final void M3() {
        int i7;
        int i10 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22531m;
        } else {
            i7 = 0;
        }
        this.Z1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7) - org.telegram.messenger.g0.L(21.0f));
        this.f41691a2 = 1.38f;
        float f10 = 0.0f;
        this.f41699b2 = 0.0f;
        d4();
        R4();
        z4(0, 1.0f, true);
        this.f41707c2 = (this.f41688a.getMeasuredWidth() / 2.0f) - (((this.f41726f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f41726f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f41688a.getMeasuredWidth() / 2.0f;
        int i11 = ((FrameLayout.LayoutParams) this.f41807r.getLayoutParams()).leftMargin;
        if (!this.f41798p5) {
            i10 = this.f41807r.getPaddingLeft();
        }
        this.f41721e2 = measuredWidth - ((this.f41807r.getExactWidth() * 0.5f) + (i11 + i10));
        if (!this.f41798p5) {
            f10 = this.f41807r.getPaddingLeft();
        }
        this.f41841v6 = f10;
        if (this.I1 != 2) {
            this.f41828u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.f41719e0.setAlpha(1.0f);
    }

    public final void M4() {
        TLRPC.ChatFull chatFull = this.f41824t2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f41824t2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new an(bundle));
            }
        }
    }

    public final void M5() {
        try {
            l00 l00Var = this.T;
            if (l00Var != null && (l00Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.T.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, this.f41866z0), 100));
            }
            float f10 = this.Q5;
            Drawable drawable = this.D;
            int[] iArr = this.R6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28041ni, this.f41866z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.f41866z0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.N6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V6, this.f41866z0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.O6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, this.f41866z0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.P6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f41866z0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.wp wpVar = this.Q6;
            if (wpVar != null) {
                wpVar.f40066y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, this.f41866z0);
                if (this.f41688a != null) {
                    for (int i13 = 0; i13 < this.f41688a.getChildCount(); i13++) {
                        View childAt = this.f41688a.getChildAt(i13);
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
    public final boolean N(ww wwVar) {
        return false;
    }

    public final void N4(boolean z9) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f41830u2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z9) {
                di.p8 p8Var = new di.p8(3, 1);
                p8Var.setResourceProvider(this.f41866z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().z1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f41830u2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                p8Var.P0 = false;
                p8Var.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.f24459s0, tL_message, false, false));
                presentFragment(p8Var);
                return;
            }
            boolean z10 = org.telegram.messenger.r2.f25191a;
            org.telegram.messenger.t0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f41830u2.business_location.address, new Object[0]))));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void N5() {
        boolean z9;
        TLRPC.UserFull userFull;
        if (this.X0 == null) {
            return;
        }
        if (this.C2 == null && (((userFull = this.f41830u2) != null && userFull.ttl_period > 0) || (this.f41824t2 != null && org.telegram.messenger.t3.y(13, this.D2) && this.f41824t2.ttl_period > 0))) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.messenger.g0.Z3(this.X0, z9, 0.8f, true, this.f41772l5);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.Cells.b4 b4Var = this.f41734g0;
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
        if (this.f41688a.getVisibility() == 0) {
            if (this.P) {
                this.N.setVisibleHeight(this.f41688a.getMeasuredHeight() - this.N.getTop());
            }
            if (this.f41688a.getChildCount() > 0 && !this.F1) {
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    d1Var = null;
                    if (i11 < this.f41688a.getChildCount()) {
                        if (RecyclerView.R(this.f41688a.getChildAt(i11)) == 0) {
                            view = this.f41688a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    qu0 qu0Var = this.f41688a;
                    View F = qu0Var.F(view);
                    if (F != null) {
                        d1Var = qu0Var.T(F);
                    }
                    d1Var = (org.telegram.ui.Components.xi0) d1Var;
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
                if (this.L5 != a10) {
                    this.L5 = a10;
                    z5();
                }
                if (this.f41800q0 == null && this.actionBar.f27676n0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i12 = this.J4;
                if (i12 != -1 && !z9) {
                    org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.f41688a.K(i12);
                    if (xi0Var != null && xi0Var.f56952a.getTop() <= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                if (this.R5 != z9) {
                    this.R5 = z9;
                    P3();
                    AnimatorSet animatorSet = this.O5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.P5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    B5(true);
                    H5();
                    L5(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!z9) {
                        f10 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar, this.S5, f10));
                    this.N.K0.setOpen(z9);
                    if (z9) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f41759j5, 0.0f));
                    }
                    if (this.f41828u0 != null || this.f41835v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new cu0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    R3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.O5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.O5.setInterpolator(org.telegram.ui.Components.xq.f40329f);
                    this.O5.addListener(new dv0(this, 1));
                    this.O5.setDuration(150L);
                    this.O5.start();
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25051r4, Boolean.TRUE);
                }
                float f11 = i10;
                if (this.P1 != f11 && !this.G1) {
                    this.P1 = f11;
                    this.f41706c1.invalidate();
                    if (this.I1 != 0) {
                        if (this.P1 > e4()) {
                            z10 = true;
                        }
                        this.L1 = z10;
                    }
                    y4(true);
                }
            }
        }
    }

    public final void O4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        boolean[] zArr = new boolean[1];
        iv0 iv0Var = new iv0(this, user.f27101id, this.f41720e1, tL_chatAdminRights, this.D2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        iv0Var.X0 = new jv0(this, i7, chatParticipant, z9, zArr);
        presentFragment(iv0Var);
    }

    public final void O5(boolean z9) {
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
        if (i11 > 0 && !this.V1 && (this.f41800q0 == null || this.N2 == -1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X5 = z10;
        R3();
        org.telegram.ui.Components.ch0 ch0Var = this.f41815s;
        if (ch0Var != null && ch0Var.getVisibility() != 8) {
            org.telegram.ui.Components.ch0 ch0Var2 = this.f41815s;
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f22531m;
            } else {
                i10 = 0;
            }
            ch0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) + this.P1) + this.S1) - org.telegram.messenger.g0.L(29.5f));
            if (i11 > 0 && !this.V1 && !this.f41809r1 && (this.f41800q0 == null || this.N2 == -1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f41720e1 != 0) {
                if (org.telegram.messenger.t3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f41824t2) != null && chatFull.linked_chat_id != 0 && (this.C3 != -1 || this.D3 != -1)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (!this.F1) {
                if (this.f41815s.getTag() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 != z12) {
                    if (z11) {
                        this.f41815s.setTag(null);
                    } else {
                        this.f41815s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f41842w;
                    if (animatorSet != null) {
                        this.f41842w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z9) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f41842w = animatorSet2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f41842w.playTogether(ObjectAnimator.ofFloat(this.f41815s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f41815s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f41815s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f41842w.playTogether(ObjectAnimator.ofFloat(this.f41815s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f41815s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f41815s, View.ALPHA, 0.0f));
                        }
                        this.f41842w.setDuration(150L);
                        this.f41842w.addListener(new dv0(this, 3));
                        this.f41842w.start();
                    } else {
                        org.telegram.ui.Components.ch0 ch0Var3 = this.f41815s;
                        if (z11) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        ch0Var3.setScaleX(f10);
                        org.telegram.ui.Components.ch0 ch0Var4 = this.f41815s;
                        if (z11) {
                            f11 = 1.0f;
                        }
                        ch0Var4.setScaleY(f11);
                        org.telegram.ui.Components.ch0 ch0Var5 = this.f41815s;
                        if (z11) {
                            f12 = 1.0f;
                        }
                        ch0Var5.setAlpha(f12);
                    }
                }
            }
        } else {
            z11 = false;
        }
        cv0 cv0Var = this.f41828u0;
        if (cv0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22531m;
            } else {
                i7 = 0;
            }
            cv0Var.f41990i0 = measuredWidth;
            cv0Var.f41992k0 = z11;
            cv0Var.f41991j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7;
            cv0Var.invalidate();
        }
        bi.g1 g1Var = this.f41835v0;
        if (g1Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = org.telegram.messenger.g0.f22531m;
            }
            g1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.P1 + this.S1);
        }
    }

    public final void P3() {
        int i7;
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            if (!this.R5 && this.Q5 <= 0.0f) {
                i7 = 0;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            vv0Var.setPagesVisibleOverscanTop(i7);
        }
    }

    public final void P4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (f2Var instanceof an) {
                    finishFragment();
                    ((an) f2Var).Z.Z0(null, str, false, false);
                }
            }
        } else {
            ww wwVar = new ww(null);
            wwVar.f51596n2 = str;
            presentFragment(wwVar);
        }
    }

    public final void P5() {
        org.telegram.ui.Components.up0 up0Var;
        org.telegram.ui.Components.tq0 tq0Var;
        org.telegram.ui.Components.w70 w70Var;
        int w02;
        int w03;
        int w04;
        int i7;
        int w05;
        int w06;
        int w07;
        this.f41747h6.clear();
        ww0 ww0Var = this.f41706c1;
        if (ww0Var != null) {
            ww0Var.a(this.f41740g6, true);
        }
        bv0 bv0Var = this.f41807r;
        if (bv0Var != null) {
            if (bv0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.k6.w0(((Integer) this.f41807r.getTag()).intValue(), this.f41866z0);
            } else {
                w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.f41866z0);
            }
            this.f41807r.setTextColor(i0.a.f(this.f41757j2, I3(w07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        uw0 uw0Var = this.f41865y6;
        float f10 = -0.1f;
        if (uw0Var != null) {
            uw0Var.a(i0.a.f(this.f41757j2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.f41698b1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.f41740g6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, this.f41866z0);
            }
            kVar.D(i0.a.f(this.Q5, w05, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28242y8, this.f41866z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.fp fpVar = this.f41740g6;
            if (fpVar != null) {
                w06 = 1090519039;
            } else if (fpVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27888f8, this.f41866z0);
            }
            kVar2.C(i0.a.f(this.Q5, w06, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28260z8, this.f41866z0)), false);
        }
        if (this.f41858y != null) {
            org.telegram.messenger.fp fpVar2 = this.f41740g6;
            if (fpVar2 != null) {
                int g10 = fpVar2.g();
                if (this.f41740g6.o(org.telegram.ui.ActionBar.k6.I.q())) {
                    i7 = this.f41740g6.k();
                } else {
                    i7 = this.f41740g6.i();
                }
                int f11 = i0.a.f(0.4f, g10, i7);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.k6.b(0.1f, f10, f11);
            } else {
                w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28041ni, this.f41866z0);
            }
            this.f41858y.setColorFilter(org.telegram.messenger.g0.S0(this.Q5, 1.0f, w04, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.f41866z0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            if (this.f41740g6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28060oi, this.f41866z0);
            }
            this.H.setColorFilter(org.telegram.messenger.g0.S0(this.Q5, 1.0f, w03, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, this.f41866z0)), PorterDuff.Mode.MULTIPLY);
        }
        ok okVar = this.f41726f;
        if (okVar != null) {
            if (this.f41740g6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27969ji, this.f41866z0);
            }
            okVar.setTextColor(i0.a.f(this.f41757j2, i0.a.f(this.Q5, w02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.f41866z0)), -1));
        }
        org.telegram.messenger.re reVar = this.Z0;
        if (reVar != null && (w70Var = (org.telegram.ui.Components.w70) reVar.f25274e) != null) {
            w70Var.invalidate();
        }
        Drawable drawable = this.f41850x;
        if (drawable != null) {
            if (this.f41740g6 == null) {
                i10 = i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27854dd, this.f41866z0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.zf0 zf0Var = this.f41697b0;
        if (zf0Var != null) {
            zf0Var.setColor(this.f41740g6);
        }
        org.telegram.messenger.g0.d0(this.f41688a, new fu0(this, 3));
        vv0 vv0Var = this.N;
        if (vv0Var != null && (tq0Var = vv0Var.K0) != null) {
            tq0Var.updateColors();
        }
        vv0 vv0Var2 = this.N;
        if (vv0Var2 != null && (up0Var = vv0Var2.f40354a0) != null) {
            up0Var.m();
        }
        Q5();
        s5();
        cv0 cv0Var = this.f41828u0;
        if (cv0Var != null) {
            cv0Var.f(true, true);
        }
        bi.g1 g1Var = this.f41835v0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override
    public final void Q() {
        org.telegram.ui.Components.ps0 ps0Var;
        vv0 vv0Var = this.N;
        if (vv0Var != null && (ps0Var = this.Q) != null) {
            vv0Var.setNewMediaCounts(ps0Var.f37048c);
        }
        if (this.d != null) {
            D5(false, false);
        }
        V();
        if (this.f41830u2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        float alpha;
        boolean z9;
        int i7 = this.I1;
        float f10 = 0.0f;
        boolean z10 = true;
        if (i7 == 1 && (!this.f41772l5 || this.F1)) {
            this.f41806q6 = 0.0f;
        } else if (i7 == 2 && (!this.f41772l5 || this.F1)) {
            bv0 bv0Var = this.f41807r;
            if (bv0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = bv0Var.getAlpha();
            }
            this.f41806q6 = alpha;
        } else if (this.f41713d1 == org.telegram.messenger.p10.i(this.currentAccount).f24478n) {
            this.f41806q6 = (1.0f - this.f41785n5) * this.f41757j2;
        } else {
            this.f41806q6 = this.f41757j2 * this.f41785n5;
        }
        if (this.f41713d1 == org.telegram.messenger.p10.i(this.currentAccount).f24478n) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && this.f41798p5) {
            this.f41791o5 = org.telegram.messenger.g0.L(28.0f) * this.f41806q6;
            bv0 bv0Var2 = this.f41807r;
            if (bv0Var2 != null) {
                bv0Var2.setTranslationX(m4(this.f41834u6, this.f41849w6));
                this.Y.invalidate();
            }
        }
        if (z9) {
            if (this.f41798p5) {
                f10 = this.f41757j2;
            }
        } else if (this.f41805q5) {
            f10 = this.f41806q6;
        }
        uw0 uw0Var = this.f41865y6;
        if (uw0Var != null) {
            uw0Var.f50515e = 1.0f - f10;
            uw0Var.invalidateSelf();
        }
        if (f10 <= 0.5f) {
            z10 = false;
        }
        this.t6 = z10;
        H5();
    }

    public final boolean Q4(float r25, float r26, int r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.Q4(float, float, int, android.view.View):boolean");
    }

    public final void Q5() {
        if (this.f41815s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28006li, this.f41866z0);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28023mi, this.f41866z0);
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988ki, this.f41866z0);
                if (this.f41740g6 != null && org.telegram.ui.ActionBar.k6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.f41740g6.c(false));
                    org.telegram.messenger.fp fpVar = this.f41740g6;
                    if (fpVar != null) {
                        int d = fpVar.d(org.telegram.ui.ActionBar.k6.I.q());
                        w03 = org.telegram.ui.ActionBar.k6.D(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, this.f41866z0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.ch0 ch0Var = this.f41792o6;
                org.telegram.ui.Components.ch0 ch0Var2 = this.f41815s;
                int[] iArr = this.f41799p6;
                if (ch0Var != ch0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f41792o6 = ch0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231198).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(mutate, org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    xpVar.f40318e = L;
                    xpVar.f40319f = L2;
                    this.f41815s.setBackground(xpVar);
                    this.f41815s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void R3() {
        boolean z9;
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            if (!this.R5 && this.X5) {
                z9 = true;
            } else {
                z9 = false;
            }
            lu0Var.setVisibility(z9);
        }
    }

    public final void R4() {
        int i7;
        ValueAnimator valueAnimator;
        if (this.f41789o2 && (valueAnimator = this.f41750i2) != null && valueAnimator.isRunning()) {
            this.d2 = this.f41695a6;
            this.f41729f2 = this.f41703b6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22531m;
        } else {
            i7 = 0;
        }
        S4(L3(), currentActionBarHeight + i7);
    }

    public final void S3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.S3(boolean):void");
    }

    public final void S4(float f10, float f11) {
        float T1;
        int i7;
        float max = Math.max(0.0f, Math.min(1.0f, (this.P1 - j4()) / ((this.f41688a.getMeasuredWidth() - f11) - k4())));
        if (this.P1 < j4() && max < 0.33f) {
            T1 = com.google.android.recaptcha.internal.a.y(f10, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22531m;
        } else {
            i7 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * T1)) * f10) + ((float) Math.floor(translationY + (org.telegram.messenger.camera.q.b(f10, 1.0f, currentActionBarHeight, i7) - (org.telegram.messenger.g0.f22536p * 21.0f))));
        this.d2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.f41729f2 = (((float) Math.floor(org.telegram.messenger.g0.f22536p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    public final void T3(Context context) {
        int i7;
        this.Z0 = new org.telegram.messenger.re(context, this.S0.getPopupLayout().getSwipeBack(), new pu0(this), false, 0, this.f41866z0);
        if (this.f41742h1 > 0 || this.f41713d1 > 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, this.f41866z0);
            org.telegram.messenger.re reVar = this.Z0;
            org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) reVar.f25274e;
            if (w70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.hd.M0(2131753847, null), w02, new org.telegram.ui.Components.xf(reVar, 10)));
                w70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f41830u2;
        if (userFull == null && this.f41824t2 == null) {
            i7 = 0;
        } else if (userFull != null) {
            i7 = userFull.ttl_period;
        } else {
            i7 = this.f41824t2.ttl_period;
        }
        org.telegram.ui.Components.zz0 a10 = org.telegram.ui.Components.zz0.a(i7);
        this.f41816s0 = a10;
        this.Y0 = this.S0.h(0, a10, org.telegram.messenger.hd.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z0.f25272b);
        this.S0.a(-1);
        o5();
    }

    public final void T4() {
        qu0 qu0Var = this.f41688a;
        if (qu0Var != null && this.f41704c != null && qu0Var.getChildCount() > 0 && !this.f41779m6) {
            View view = null;
            int i7 = Integer.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f41688a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.f41688a.getChildAt(i11));
                View childAt = this.f41688a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f41767k6 = i10;
                int top = view.getTop();
                this.f41773l6 = top;
                if (this.f41767k6 == 0 && !this.f41782n2 && top > j4()) {
                    this.f41773l6 = j4();
                }
                this.f41704c.h1(i10, view.getTop() - this.f41688a.getPaddingTop());
            }
        }
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void U3() {
        if (this.fragmentView != null && this.f41786n6 && this.f41853x2 != null && getParentActivity() != null) {
            ax0 ax0Var = this.f41872z6;
            if (ax0Var != null) {
                ax0Var.b(this.f41853x2);
                this.f41872z6.invalidate();
                return;
            }
            ax0 ax0Var2 = new ax0(this, this.f41853x2);
            this.f41872z6 = ax0Var2;
            ((FrameLayout) this.fragmentView).addView(ax0Var2, c8.ha.e(-1, -1, 55));
        }
    }

    public final void U4(boolean z9) {
        int i7 = this.J4;
        if (i7 >= 0) {
            if (z9) {
                mi.m mVar = new mi.m(getParentActivity(), 2, 0.6f);
                mVar.f57121a = this.J4;
                mVar.f20108p = -this.f41688a.getPaddingTop();
                this.f41704c.w0(mVar);
                return;
            }
            this.f41704c.h1(i7, -this.f41688a.getPaddingTop());
        }
    }

    @Override
    public final void V() {
        int i7;
        String str;
        int size;
        int i10;
        vv0 vv0Var = this.N;
        if (vv0Var != null && this.f41807r != null) {
            int closestTab = vv0Var.getClosestTab();
            int[] iArr = this.Q.f37048c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        f5(org.telegram.messenger.hd.M0(2131745410, null));
                    } else {
                        f5(org.telegram.messenger.hd.G(i12, "Media", new Object[0]));
                    }
                } else if (this.N.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.N.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        f5(org.telegram.messenger.hd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    f5(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                } else {
                    f5(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    f5(org.telegram.messenger.hd.M0(2131750827, null));
                } else {
                    f5(org.telegram.messenger.hd.G(i13, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    f5(org.telegram.messenger.hd.M0(2131743524, null));
                } else {
                    f5(org.telegram.messenger.hd.G(i14, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    f5(org.telegram.messenger.hd.M0(2131745412, null));
                } else {
                    f5(org.telegram.messenger.hd.G(i15, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    f5(org.telegram.messenger.hd.M0(2131748318, null));
                } else {
                    f5(org.telegram.messenger.hd.G(i16, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    f5(org.telegram.messenger.hd.M0(2131754879, null));
                } else {
                    f5(org.telegram.messenger.hd.G(i17, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                f5(org.telegram.messenger.hd.G(this.f41830u2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                f5(this.f41807r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.xs0.I0(closestTab)) {
                if (closestTab == 13) {
                    f5(this.N.f0(true));
                } else if (closestTab == 9) {
                    f5(org.telegram.messenger.hd.G(this.N.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(this.currentAccount).L0(a());
                    if (this.f41802q2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (L0 == null) {
                        size = 0;
                    } else {
                        size = L0.f25306b.size() + L0.f25307c;
                    }
                    f5(org.telegram.messenger.hd.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.vv G1 = getMessagesController().G1();
                    long a10 = a();
                    ArrayList arrayList = G1.f26204j;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i18);
                            if (uvVar.f25886a == a10) {
                                i7 = uvVar.f25889e;
                                break;
                            }
                            i18++;
                        } else {
                            i7 = 0;
                            break;
                        }
                    }
                    f5(org.telegram.messenger.hd.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.up0 up0Var = this.N.f40354a0;
                    if (up0Var != null) {
                        i11 = up0Var.getGiftsCount();
                    }
                    f5(org.telegram.messenger.hd.H(',', "ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i19 = iArr[8];
                    if (i19 <= 0) {
                        f5(org.telegram.messenger.hd.M0(2131745404, null));
                    } else {
                        f5(org.telegram.messenger.hd.H(',', "ProfilePollsCount", i19));
                    }
                }
            } else if (this.f41802q2) {
                f5(this.N.f0(false));
            } else if (this.N.m0(closestTab) > 0) {
                f5(org.telegram.messenger.hd.G(this.N.m0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                f5(org.telegram.messenger.hd.M0(2131746624, null));
            }
        }
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            org.telegram.messenger.g0.E2(y4Var);
        }
        mv0 mv0Var = new mv0(this, context, this.f41866z0);
        this.simpleActionBar = mv0Var;
        mv0Var.setTitlesAlpha(0.0f);
        if (!this.f41772l5 && !this.I0 && this.I1 != 0 && this.L1 && !this.M1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new pe(3, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(2131232485);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.M0(2131746499, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231240);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 2));
        if (!this.I0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new di.f2(6, this, backButton));
        }
    }

    public final void W4() {
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            if (this.f41809r1) {
                ef0Var.E = 6;
            } else if (this.f41794p1) {
                ef0Var.E = 5;
            } else if (this.f41802q2) {
                ef0Var.E = 2;
            } else if (this.f41713d1 != 0) {
                ef0Var.E = 0;
            } else if (this.f41720e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41720e1));
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

    @Override
    public final boolean X() {
        return this.f41867z1;
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
        AnimatorSet animatorSet = this.f41760j6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f41760j6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z9) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f41851x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new cu0(this, 0));
        this.f41760j6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f41760j6;
        if (z9) {
            j3 = 150;
        } else {
            j3 = 220;
        }
        animatorSet2.setDuration(j3);
        if (!z9) {
            this.f41760j6.addListener(new dv0(this, 6));
        }
        this.f41760j6.start();
    }

    public final void X4(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.X4(float):void");
    }

    public final void Y3(int i7, View view) {
        boolean z9;
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        H.W(this.f41688a.U0(view, false));
        H.f35183w = false;
        if (this.f41830u2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        H.l(2131232103, org.telegram.messenger.hd.M0(2131751767, null), new j90(this, 4), z9);
        H.c(2131232116, org.telegram.messenger.hd.M0(2131751336, null), new j90(this, 5), false);
        H.c(2131232108, org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.Components.r2(this, i7, 23), true);
        H.Z();
    }

    public final boolean Z3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f41809r1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f41830u2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.f27101id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String M02 = org.telegram.messenger.hd.M0(2131744195, null);
                if (i7 != this.J3 && i7 != this.I3 && i7 != this.V2) {
                    if (i7 == this.N3) {
                        str = kg.c1.k0(this.currentAccount, f10, userFull.business_work_hours);
                        M0 = org.telegram.messenger.hd.M0(2131746664, null);
                        M02 = org.telegram.messenger.hd.M0(2131752761, null);
                    } else if (i7 == this.O3) {
                        str = userFull.business_location.address;
                        M0 = org.telegram.messenger.hd.M0(2131746659, null);
                        M02 = org.telegram.messenger.hd.M0(2131752693, null);
                    } else if (i7 == this.K3) {
                        str = org.telegram.messenger.t10.n(f10);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = org.telegram.messenger.hd.M0(2131746677, null);
                        M02 = org.telegram.messenger.hd.M0(2131743666, null);
                    } else if (i7 == this.F3) {
                        str = f10.phone;
                        M02 = org.telegram.messenger.hd.M0(2131747294, null);
                    } else if (i7 == this.T2) {
                        str = UserInfoActivity.e0(this.f41830u2.birthday);
                        M02 = org.telegram.messenger.hd.M0(2131753716, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i7 == this.V2) {
                        M02 = org.telegram.messenger.hd.M0(2131753721, null);
                    }
                }
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
                H.W(this.f41688a.U0(view, false));
                H.f35183w = false;
                H.f35162i = 3;
                if (i7 == this.O3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(2131232420, org.telegram.messenger.hd.M0(2131746655, null), new j90(this, 7), false);
                    }
                    H.c(2131232213, org.telegram.messenger.hd.M0(2131746657, null), new j90(this, 9), false);
                }
                if (str != null) {
                    H.c(2131232103, M0, new mc0(this, str, M02, 25), false);
                }
                if (i7 == this.N3) {
                    H.c(2131232116, org.telegram.messenger.hd.M0(2131746663, null), new j90(this, 10), false);
                    H.c(2131232108, org.telegram.messenger.hd.M0(2131746662, null), new Runnable(this) {
                        public final ProfileActivity f44101b;

                        {
                            this.f44101b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f44101b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.O3) {
                    H.c(2131232116, org.telegram.messenger.hd.M0(2131746658, null), new j90(this, 11), false);
                    H.c(2131232108, org.telegram.messenger.hd.M0(2131746656, null), new Runnable(this) {
                        public final ProfileActivity f44101b;

                        {
                            this.f44101b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f44101b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.K3) {
                    H.c(2131232116, org.telegram.messenger.hd.M0(2131746619, null), new j90(this, 12), false);
                } else if (i7 != this.J3 && i7 != this.I3 && i7 != this.V2) {
                    if (i7 == this.F3) {
                        H.c(2131231894, org.telegram.messenger.hd.M0(2131746645, null), new j90(this, 14), false);
                    } else if (i7 == this.T2) {
                        H.c(2131232116, org.telegram.messenger.hd.M0(2131746722, null), new Runnable(this) {
                            public final ProfileActivity f52332b;

                            {
                                this.f52332b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f52332b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.S6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751239, null), org.telegram.messenger.hd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ex(20, profileActivity, userFull2), new j90(profileActivity, 15), false, false, profileActivity.f41866z0).f14323b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                        u1Var.R = M03;
                                        u1Var.T = org.telegram.messenger.hd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.S6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746681, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                                        u1Var2.R = M04;
                                        u1Var2.T = org.telegram.messenger.hd.M0(2131746682, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.S6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(2131232108, org.telegram.messenger.hd.M0(2131746320, null), new Runnable(this) {
                            public final ProfileActivity f52332b;

                            {
                                this.f52332b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f52332b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.S6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751239, null), org.telegram.messenger.hd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ex(20, profileActivity, userFull2), new j90(profileActivity, 15), false, false, profileActivity.f41866z0).f14323b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                        u1Var.R = M03;
                                        u1Var.T = org.telegram.messenger.hd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.S6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746681, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                                        u1Var2.R = M04;
                                        u1Var2.T = org.telegram.messenger.hd.M0(2131746682, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.S6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == this.P2) {
                        TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                        if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                            H.c(2131232103, org.telegram.messenger.hd.M0(2131746680, null), new qn0(17, this, M03), false);
                        }
                        H.c(2131232116, org.telegram.messenger.hd.M0(2131746683, null), new j90(this, 8), false);
                        H.c(2131232108, org.telegram.messenger.hd.M0(2131746320, null), new Runnable(this) {
                            public final ProfileActivity f52332b;

                            {
                                this.f52332b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f52332b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.S6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751239, null), org.telegram.messenger.hd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ex(20, profileActivity, userFull2), new j90(profileActivity, 15), false, false, profileActivity.f41866z0).f14323b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M032 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                        u1Var.R = M032;
                                        u1Var.T = org.telegram.messenger.hd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.S6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746681, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                                        u1Var2.R = M04;
                                        u1Var2.T = org.telegram.messenger.hd.M0(2131746682, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.S6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(u1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(2131232116, org.telegram.messenger.hd.M0(2131746676, null), new j90(this, 13), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Z4(float f10) {
        this.J5 = f10;
        org.telegram.ui.Components.if0 if0Var = this.I5;
        if (if0Var != null) {
            if0Var.b(f10);
        }
        A5();
    }

    public final long a() {
        long j3 = this.f41742h1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.f41713d1;
        if (j10 != 0) {
            return j10;
        }
        return -this.f41720e1;
    }

    public final boolean a4() {
        v4.d1 d1Var;
        View view;
        if ((this.I0 || (!org.telegram.messenger.g0.Q1() && !this.f41775m2)) && this.f41719e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.F0 = true;
            this.f41782n2 = true;
            int i7 = 0;
            while (true) {
                d1Var = null;
                if (i7 < this.f41688a.getChildCount()) {
                    if (RecyclerView.R(this.f41688a.getChildAt(i7)) == 0) {
                        view = this.f41688a.getChildAt(i7);
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                qu0 qu0Var = this.f41688a;
                View F = qu0Var.F(view);
                if (F != null) {
                    d1Var = qu0Var.T(F);
                }
                if (d1Var != null) {
                    Integer num = (Integer) this.X1.get(Integer.valueOf(d1Var.b()));
                    if (num != null) {
                        this.O1 = true;
                        this.f41688a.w0(0, -(((this.f41688a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.xq.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a5(TLRPC.ChatFull chatFull) {
        boolean z9;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f41824t2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.l1 == 0) {
                this.l1 = -j3;
                getMediaDataController().e0(this.l1, this.classGuid, this.f41728f1);
            }
        }
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.setChatInfo(this.f41824t2);
        }
        av0 av0Var = this.f41781n0;
        if (av0Var != null && !this.f41794p1) {
            av0Var.setChatInfo(this.f41824t2);
        }
        cv0 cv0Var = this.f41828u0;
        if (cv0Var != null && (chatFull3 = this.f41824t2) != null) {
            cv0Var.setStories(chatFull3.stories);
        }
        bi.g1 g1Var = this.f41835v0;
        if (g1Var != null) {
            g1Var.a();
        }
        zu0 zu0Var = this.f41719e0;
        if (zu0Var != null) {
            zu0Var.setHasStories(x4());
        }
        b4();
        if (this.f41720e1 != 0) {
            boolean z10 = org.telegram.messenger.r2.f25191a;
            if (!getMessagesController().h7 && (chatFull2 = this.f41824t2) != null && chatFull2.stargifts_available) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.S0.Q(38, z9);
            org.telegram.ui.Components.ef0 ef0Var = this.Z;
            if (ef0Var != null) {
                ef0Var.o(3, z9);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28013m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27868e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27887f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27950ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27923h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28080pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27969ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27854dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27888f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.D2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f41824t2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i7 = 0; i7 < this.f41824t2.participants.participants.size(); i7++) {
                    TLRPC.ChatParticipant chatParticipant = this.f41824t2.participants.participants.get(i7);
                    this.B1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void b5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y != null && (tL_emojiStatusCollectible2 = this.D6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.D6 = tL_emojiStatusCollectible;
                fi.m3 m3Var = this.A6;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.C6 = null;
                    this.A6 = new fi.m3(getParentActivity(), 3);
                    this.B6 = org.telegram.ui.ActionBar.k6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.A6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                    fi.m3 m3Var2 = this.A6;
                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    m3Var2.L0 = true;
                    m3Var2.T0 = System.currentTimeMillis();
                    m3Var2.M0 = new Path();
                    m3Var2.N0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
                    m3Var2.O0 = new Paint(1);
                    m3Var2.P0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(1.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    m3Var2.S0 = linearGradient;
                    m3Var2.P0.setShader(linearGradient);
                    m3Var2.Q0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.5f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    m3Var2.R0 = new Matrix();
                    m3Var2.O0.setShader(m3Var2.Q0);
                    m3Var2.P0.setStyle(Paint.Style.STROKE);
                    m3Var2.P0.setStrokeJoin(Paint.Join.ROUND);
                    m3Var2.P0.setStrokeCap(Paint.Cap.ROUND);
                    m3Var2.P0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                    this.Y.addView(this.A6, c8.ha.c(24.0f, -1));
                    this.A6.v(9.33f);
                    fi.m3 m3Var3 = this.A6;
                    Typeface o4 = org.telegram.messenger.g0.o();
                    m3Var3.H.x(o4);
                    m3Var3.J.setTypeface(o4);
                    this.A6.u(tL_emojiStatusCollectible.title);
                    fi.m3 m3Var4 = this.A6;
                    m3Var4.d = -1L;
                    m3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
                    fi.m3 m3Var5 = this.A6;
                    m3Var5.getClass();
                    m3Var5.D = org.telegram.messenger.g0.N(4.0f);
                    m3Var5.E = org.telegram.messenger.g0.N(2.66f);
                    this.A6.t();
                    this.A6.s(16.0f);
                    this.A6.w();
                    this.A6.setOnClickListener(new iu0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.P1 < org.telegram.messenger.g0.L(82.0f)) {
                        this.C6 = Boolean.FALSE;
                        this.A6.setAlpha(0.0f);
                    }
                    q5();
                    fi.m3 m3Var6 = this.A6;
                    Objects.requireNonNull(m3Var6);
                    org.telegram.messenger.g0.i3(new oy(m3Var6, 1), 6000L);
                }
            }
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (this.I1 != 0 && (q4Var = this.parentLayout) != null && q4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof an)) {
            finishFragment();
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.N.J0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.f41740g6 = null;
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
        if (this.f41688a == null) {
            return;
        }
        float x10 = org.telegram.ui.Cells.f1.x(((FrameLayout.LayoutParams) this.X.getLayoutParams()).width, this.f41691a2, 0.5f, this.f41688a.getMeasuredWidth() / 2.0f);
        this.Y1 = x10;
        if (this.F1) {
            this.Y1 = org.telegram.messenger.g0.T1(this.f41725e6, x10, this.R1);
        }
        this.X.setTranslationX(this.Y1);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        jw0 jw0Var;
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
        qu0 qu0Var;
        qu0 qu0Var2;
        org.telegram.ui.Components.xi0 xi0Var;
        if (i7 != org.telegram.messenger.qs.B5 && i7 != org.telegram.messenger.qs.f25037p3) {
            boolean z11 = true;
            int i11 = 0;
            r3 = false;
            boolean z12 = false;
            if (i7 == org.telegram.messenger.qs.f25046r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.qp.C8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f41713d1 != 0) {
                    if (objArr3 != null) {
                        I5(true);
                    }
                    if ((intValue & 1024) != 0 && (qu0Var2 = this.f41688a) != null && (xi0Var = (org.telegram.ui.Components.xi0) qu0Var2.L(this.F3, false)) != null) {
                        this.d.t(xi0Var, this.F3);
                    }
                } else if (this.f41720e1 != 0) {
                    int i13 = intValue & 8192;
                    if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i13 != 0) {
                            D5(true, false);
                        } else {
                            G5(true);
                        }
                        I5(true);
                    }
                    if (objArr3 != null && (qu0Var = this.f41688a) != null) {
                        int childCount = qu0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = this.f41688a.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f24986g1) {
                Long l10 = (Long) objArr[0];
                if (this.f41824t2 != null && (chat = this.D2) != null && chat.f26952id == l10.longValue()) {
                    this.f41824t2.online_count = ((Integer) objArr[1]).intValue();
                    G5(true);
                    I5(false);
                }
            } else if (i7 != org.telegram.messenger.qs.O && i7 != org.telegram.messenger.qs.f24957b1) {
                if (i7 == org.telegram.messenger.qs.f24950a0) {
                    if (this.f41749i1) {
                        org.telegram.messenger.g0.h3(new qn0(15, this, objArr));
                    }
                } else if (i7 == org.telegram.messenger.qs.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.C2;
                    if (encryptedChat2 != null && encryptedChat.f26960id == encryptedChat2.f26960id) {
                        this.C2 = encryptedChat;
                        D5(false, false);
                        org.telegram.messenger.n6 n6Var = this.W1;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.f24985g0) {
                    boolean z13 = this.f41756j1;
                    if (getMessagesController().G0.indexOfKey(this.f41713d1) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f41756j1 = z10;
                    if (z13 != z10) {
                        S3(true);
                        D5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.qs.f25082w2) {
                    Long l11 = (Long) objArr[0];
                    if (this.D2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.D2;
                        if (longValue == chat2.f26952id && org.telegram.messenger.t3.w(14, chat2)) {
                            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.currentAccount).N0(l11.longValue());
                            if (N0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f41824t2;
                                if (chatFull4 != null) {
                                    N0.participants = chatFull4.participants;
                                }
                                this.f41824t2 = N0;
                            }
                            vv0 vv0Var = this.N;
                            if (vv0Var != null) {
                                vv0Var.setChatInfo(this.f41824t2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f41824t2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f41788o1) || (inputGroupCall != null && this.f41788o1))) {
                                S3(false);
                            }
                            cv0 cv0Var = this.f41828u0;
                            if (cv0Var != null && (chatFull3 = this.f41824t2) != null) {
                                cv0Var.setStories(chatFull3.stories);
                            }
                            bi.g1 g1Var = this.f41835v0;
                            if (g1Var != null) {
                                g1Var.a();
                            }
                            zu0 zu0Var = this.f41719e0;
                            if (zu0Var != null) {
                                zu0Var.setHasStories(x4());
                            }
                            if (l11.longValue() != 0) {
                                boolean z14 = org.telegram.messenger.r2.f25191a;
                                z11 = (getMessagesController().h7 || (chatFull2 = this.f41824t2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.S0.Q(38, z11);
                                org.telegram.ui.Components.ef0 ef0Var = this.Z;
                                if (ef0Var != null) {
                                    ef0Var.o(3, z11);
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f41713d1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f41713d1))) != null && chatFull6.f26953id == a22.linked_community_id) {
                        D5(true, false);
                    }
                    TLRPC.Chat chat3 = this.D2;
                    if (chat3 != null && chatFull6.f26953id == chat3.linked_community_id) {
                        D5(true, false);
                    }
                    if (chatFull6.f26953id == this.f41720e1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f41824t2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f41824t2 = chatFull6;
                        if (this.l1 == 0) {
                            long j3 = chatFull6.migrated_from_chat_id;
                            if (j3 != 0) {
                                this.l1 = -j3;
                                getMediaDataController().d0(0, this.classGuid, this.l1, this.f41728f1, true);
                            }
                        }
                        b4();
                        av0 av0Var = this.f41781n0;
                        if (av0Var != null && !this.f41794p1) {
                            av0Var.setChatInfo(this.f41824t2);
                        }
                        D5(true, false);
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41720e1));
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
                        o5();
                        N5();
                        cv0 cv0Var2 = this.f41828u0;
                        if (cv0Var2 != null && (chatFull = this.f41824t2) != null) {
                            cv0Var2.setStories(chatFull.stories);
                        }
                        bi.g1 g1Var2 = this.f41835v0;
                        if (g1Var2 != null) {
                            g1Var2.a();
                        }
                        zu0 zu0Var2 = this.f41719e0;
                        if (zu0Var2 != null) {
                            zu0Var2.setHasStories(x4());
                        }
                        vv0 vv0Var2 = this.N;
                        if (vv0Var2 != null) {
                            vv0Var2.setChatInfo(this.f41824t2);
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.f25059t) {
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
                    if (botInfo.user_id == this.f41713d1) {
                        this.E2 = botInfo;
                        D5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.qs.E0) {
                    if (((Long) objArr[0]).longValue() == this.f41713d1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f41830u2 = userFull;
                        org.telegram.ui.Components.lu0 lu0Var = this.S;
                        if (lu0Var != null) {
                            lu0Var.set(userFull.stars_rating);
                        }
                        cv0 cv0Var3 = this.f41828u0;
                        if (cv0Var3 != null) {
                            cv0Var3.setStories(this.f41830u2.stories);
                        }
                        bi.g1 g1Var3 = this.f41835v0;
                        if (g1Var3 != null) {
                            g1Var3.a();
                        }
                        zu0 zu0Var3 = this.f41719e0;
                        if (zu0Var3 != null) {
                            zu0Var3.setHasStories(x4());
                        }
                        vv0 vv0Var3 = this.N;
                        if (vv0Var3 != null) {
                            vv0Var3.setUserInfo(this.f41830u2);
                        }
                        if (this.f41800q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f41830u2.about, this.f41861y2)) {
                                this.d.g(this.V2);
                            }
                            if (this.f41809r1) {
                                D5(false, false);
                            }
                        } else {
                            if (!this.F1 && !this.K0) {
                                S3(true);
                            } else {
                                this.H1 = true;
                            }
                            D5(false, false);
                            vv0 vv0Var4 = this.N;
                            if (vv0Var4 != null) {
                                vv0Var4.setCommonGroupsCount(this.f41830u2.common_chats_count);
                                V();
                                org.telegram.ui.Components.ps0 ps0Var = this.Q;
                                if (ps0Var == null || ps0Var.D) {
                                    resumeDelayedFragmentAnimation();
                                    y4(true);
                                }
                            }
                        }
                        o5();
                        N5();
                        if (this.f41837v2 == null && !v4()) {
                            org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(this.currentAccount);
                            this.f41837v2 = e6Var;
                            j90 j90Var = new j90(this, 17);
                            if (e6Var.f29065c) {
                                j90Var.run();
                            } else {
                                e6Var.h.add(j90Var);
                            }
                            this.f41837v2.d(this.f41830u2);
                        }
                        if (!v4()) {
                            xw0 xw0Var = this.f41853x2;
                            xw0 c10 = xw0.c(this.currentAccount, this.f41830u2, xw0Var);
                            this.f41853x2 = c10;
                            if (c10 != xw0Var) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f41845w2 = z9;
                            if (c10 != null) {
                                j90 j90Var2 = new j90(this, 18);
                                if (c10.f52003b) {
                                    j90Var2.run();
                                } else {
                                    c10.h.add(j90Var2);
                                }
                            }
                        }
                        if (this.S0 != null) {
                            if (s4()) {
                                this.S0.S(44);
                            } else {
                                this.S0.t(44);
                            }
                            TLRPC.UserFull userFull2 = this.f41830u2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z12 = true;
                            }
                            this.S0.Q(46, z12);
                            this.S0.Q(47, !z12);
                        }
                    }
                } else if (i7 != org.telegram.messenger.qs.f25008k0) {
                    if (i7 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i15);
                                if (this.C2 != null) {
                                    TLRPC.MessageAction messageAction = ijVar.f23237k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (jw0Var = this.d) != null) {
                                        jw0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i7 == org.telegram.messenger.qs.f25001i4) {
                        qu0 qu0Var3 = this.f41688a;
                        if (qu0Var3 != null) {
                            qu0Var3.g1();
                        }
                    } else if (i7 == org.telegram.messenger.qs.f25091x4) {
                        D5(false, false);
                    } else if (i7 == org.telegram.messenger.qs.f25055s1) {
                        int i16 = this.f41700b3;
                        int i17 = this.Z2;
                        int i18 = this.X2;
                        J5();
                        jw0 jw0Var2 = this.d;
                        if (jw0Var2 != null) {
                            if (i16 != this.f41700b3 || i17 != this.Z2 || i18 != this.X2) {
                                jw0Var2.f();
                            }
                        }
                    } else if (i7 == org.telegram.messenger.qs.f25045q5) {
                        if (this.f41794p1) {
                            I5(false);
                        }
                    } else if (i7 == org.telegram.messenger.qs.D1) {
                        tw0 tw0Var = this.f41718e;
                        if (tw0Var != null) {
                            tw0Var.f50167c = tw0.H(this);
                            this.f41718e.f50173w.clear();
                            this.f41718e.J();
                            tw0 tw0Var2 = this.f41718e;
                            tw0Var2.I(tw0Var2.D);
                        }
                    } else if (i7 == org.telegram.messenger.qs.f24962c0) {
                        I5(false);
                    } else if (i7 != org.telegram.messenger.qs.f25078v5 && i7 != org.telegram.messenger.qs.F5) {
                        if (i7 == org.telegram.messenger.qs.f25000i3) {
                            org.telegram.ui.ActionBar.f5 f5Var = this.S0;
                            if (f5Var != null) {
                                TL_account.RequirementToContact J2 = getMessagesController().J2(this.f41713d1);
                                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                                    z11 = false;
                                }
                                f5Var.Q(20, z11);
                            }
                            r5();
                        } else if (i7 == org.telegram.messenger.qs.f24984f5) {
                            r5();
                        } else if (i7 == org.telegram.messenger.qs.f25097y3) {
                            D5(false, false);
                        } else if (i7 == org.telegram.messenger.qs.C3) {
                            D5(false, false);
                        } else if (i7 == org.telegram.messenger.qs.D3) {
                            D5(false, false);
                        } else if (i7 == org.telegram.messenger.qs.f25095y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
                                if (q4Var2 != null && q4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.f24982f3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.J4 < 0 && longValue3 == a()) {
                                J5();
                                V();
                                jw0 jw0Var3 = this.d;
                                if (jw0Var3 != null) {
                                    jw0Var3.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.G3) {
                            if (((Long) objArr[0]).longValue() == a() && !v4()) {
                                if (this.J4 < 0) {
                                    J5();
                                    V();
                                    jw0 jw0Var4 = this.d;
                                    if (jw0Var4 != null) {
                                        jw0Var4.f();
                                    }
                                    org.telegram.messenger.g0.h3(new j90(this, 19));
                                    return;
                                }
                                vv0 vv0Var5 = this.N;
                                if (vv0Var5 != null) {
                                    vv0Var5.N1(true);
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.V3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f41713d1 > 0) {
                                TLRPC.UserFull b22 = getMessagesController().b2(this.f41713d1);
                                if (b22 != null) {
                                    this.f41830u2 = b22;
                                }
                                J5();
                                V();
                                qu0 qu0Var4 = this.f41688a;
                                if (qu0Var4 != null && qu0Var4.c0()) {
                                    this.f41688a.post(new j90(this, 21));
                                    return;
                                }
                                jw0 jw0Var5 = this.d;
                                if (jw0Var5 != null) {
                                    jw0Var5.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.qs.W3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.D2;
                            if (chat4 != null && chat4.f26952id == longValue4) {
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
                                        org.telegram.messenger.g0.b4(this.f41688a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        zu0 zu0Var4 = this.f41719e0;
                        if (zu0Var4 != null) {
                            zu0Var4.setHasStories(x4());
                            this.f41719e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.f41757j2));
                        }
                        cv0 cv0Var4 = this.f41828u0;
                        if (cv0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f41830u2;
                            if (userFull3 != null) {
                                cv0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f41824t2;
                            if (chatFull8 != null) {
                                cv0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                S3(true);
            }
        } else if (org.telegram.messenger.t3.R(org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.f41720e1)))) {
            getMessagesController().P1().k(a(), new di.e(23), false, this.f41866z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null && j30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if ((j30Var == null || dialog != j30Var.f34845c) && super.dismissDialogOnPause(dialog)) {
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
        if (this.f41713d1 != 0 && this.f41800q0 != null && !this.f41809r1) {
            return 0;
        }
        return org.telegram.messenger.g0.L(74 + ((this.H4 || this.I4) ? 25 : 25));
    }

    public final void e5(cw0 cw0Var) {
        if (this.f41753i5 == cw0Var) {
            return;
        }
        this.f41753i5 = cw0Var;
        org.telegram.messenger.g0.d0(this.f41688a, new fu0(this, 0));
    }

    @Override
    public final org.telegram.ui.Components.pj0 f() {
        return this.f41688a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof org.telegram.ui.Components.c51) {
            return ((org.telegram.ui.Components.c51) imageReceiver.t()).f32414a.a();
        }
        return org.telegram.messenger.g0.p(this.f41719e0.getImageReceiver().n());
    }

    public final void f5(CharSequence charSequence) {
        this.W5 = charSequence;
        H5();
    }

    @Override
    public final TLRPC.Chat g() {
        return this.D2;
    }

    public final org.telegram.ui.Components.g5 g4(long j3) {
        if (this.G == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(17.0f), 2, this.f41726f, false);
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
        s5();
        return this.G;
    }

    public final void g5(int i7) {
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
            K5();
            if (e12.getBoolean("view_animations", true)) {
                this.I1 = i7;
            } else if (i7 == 2) {
                this.f41774m1 = true;
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.R1;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f41866z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f41866z0 != null) {
            return null;
        }
        f6 f6Var = new f6(18, this);
        ArrayList arrayList = new ArrayList();
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            arrayList.addAll(vv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41706c1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27792a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41793p0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27850d8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41815s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27988ki));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41815s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28006li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41815s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28023mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28221x6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28069p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28048o6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28164u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28183v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28258z6));
        int i7 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 131072, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 196608, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 131072, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 196608, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41688a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28030n6));
        if (this.R5) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41726f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41726f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41858y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41726f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28060oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41726f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41858y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28041ni));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.f41866z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.f6 f6Var = this.f41866z0;
        if (f6Var != null) {
            drawable = f6Var.getDrawable(str);
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
        if (!this.A1 && (hVar = this.B1) != null && this.f41824t2 != null) {
            this.A1 = true;
            int i10 = 0;
            if (hVar.m() != 0 && z9) {
                i7 = 300;
            } else {
                i7 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().h1(this.f41720e1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z9) {
                i10 = this.B1.m();
            }
            tL_channels_getParticipants.offset = i10;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.v(this, tL_channels_getParticipants, i7)), this.classGuid);
        }
    }

    public final void h5(TLRPC.UserFull userFull, org.telegram.ui.Cells.e6 e6Var, xw0 xw0Var) {
        boolean z9;
        this.f41830u2 = userFull;
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            lu0Var.set(userFull.stars_rating);
        }
        cv0 cv0Var = this.f41828u0;
        if (cv0Var != null) {
            cv0Var.setStories(this.f41830u2.stories);
        }
        bi.g1 g1Var = this.f41835v0;
        if (g1Var != null) {
            g1Var.a();
        }
        zu0 zu0Var = this.f41719e0;
        if (zu0Var != null) {
            zu0Var.setHasStories(x4());
        }
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.setUserInfo(this.f41830u2);
        }
        if (this.f41837v2 == null) {
            this.f41837v2 = e6Var;
        }
        if (this.f41837v2 == null) {
            this.f41837v2 = new org.telegram.ui.Cells.e6(this.currentAccount);
        }
        org.telegram.ui.Cells.e6 e6Var2 = this.f41837v2;
        j90 j90Var = new j90(this, 23);
        if (e6Var2.f29065c) {
            j90Var.run();
        } else {
            e6Var2.h.add(j90Var);
        }
        this.f41837v2.d(this.f41830u2);
        if (this.f41853x2 == null) {
            this.f41853x2 = xw0Var;
        }
        xw0 xw0Var2 = this.f41853x2;
        boolean z10 = true;
        if (xw0Var2 == null) {
            xw0 c10 = xw0.c(this.currentAccount, this.f41830u2, xw0Var2);
            this.f41853x2 = c10;
            if (c10 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f41845w2 = z9;
        }
        xw0 xw0Var3 = this.f41853x2;
        if (xw0Var3 != null) {
            j90 j90Var2 = new j90(this, 18);
            if (xw0Var3.f52003b) {
                j90Var2.run();
            } else {
                xw0Var3.h.add(j90Var2);
            }
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.S0;
        if (f5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.f41713d1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z10 = false;
            }
            f5Var.Q(20, z10);
            if (s4()) {
                this.S0.S(44);
            } else {
                this.S0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.g5 i4(TLRPC.EmojiStatus emojiStatus, boolean z9) {
        if (this.F == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 2, this.f41726f, false);
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
        s5();
        return this.F;
    }

    public final void i5() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.if0 if0Var = new org.telegram.ui.Components.if0(this.glassEngine, baseSimpleGlass);
        this.I5 = if0Var;
        ww0 ww0Var = this.f41706c1;
        if (ww0Var != null) {
            int i7 = ww0Var.H;
            boolean z9 = ww0Var.f51662c;
            if (if0Var.f34580i != i7 || if0Var.f34581j != z9) {
                if0Var.f34580i = i7;
                if0Var.f34581j = z9;
                if0Var.a();
            }
        }
        this.I5.b(this.J5);
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            ef0Var.setGlassFactory(this.I5.f34576c);
        }
        org.telegram.ui.Components.zf0 zf0Var = this.f41697b0;
        if (zf0Var != null) {
            zf0Var.setGlassFactory(this.I5.f34576c);
        }
        this.simpleActionBar.setButtonsGlass(this.I5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        tv0 tv0Var = this.f41778m5;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.f6 f6Var = this.f41866z0;
        baseSimpleGlass.f21026m = tv0Var;
        baseSimpleGlass.f21027n = null;
        baseSimpleGlass.g(tv0Var, y4Var, f6Var);
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.if0 if0Var2 = this.I5;
        dh.c cVar = if0Var2.f34577e;
        ri.d dVar = if0Var2.f34578f;
        y4Var2.f28795n0 = cVar;
        y4Var2.f28796o0 = dVar;
        y4Var2.setBackground(null);
        this.G5 = c8.g0.m(this.f41866z0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.H5);
        A5();
        baseSimpleGlass.f21028o = this.L6;
        View view = new View(getParentActivity());
        this.T5 = view;
        view.setAlpha(0.0f);
        this.f41778m5.getViewTreeObserver().addOnPreDrawListener(new fk(this, 1));
        this.N.z(this.T5);
        View view2 = this.T5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.B5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        tv0 tv0Var2 = this.f41778m5;
        tv0Var2.addView(this.B5, tv0Var2.indexOfChild(this.Y), c8.ha.e(-1, 0, 48));
        this.glassEngine.b(this.f41688a);
        this.N.setPagesGlassEngine(this.glassEngine);
        this.N.setOnTopPanelShiftChanged(new j90(this, 22));
        H3();
        x5();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f41789o2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f41789o2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.v()) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28204w8, this.f41866z0);
            } else if (!this.R5 && this.A5 <= 0.5f) {
                org.telegram.messenger.fp fpVar = this.f41740g6;
                if (fpVar != null) {
                    w02 = fpVar.d(org.telegram.ui.ActionBar.k6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, this.f41866z0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, this.f41866z0);
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

    public final void j5(boolean z9, boolean z10) {
        if (this.f41734g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f41727f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41727f0 = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41727f0 = animatorSet2;
            if (z9) {
                this.f41734g0.setVisibility(0);
                this.f41727f0.playTogether(ObjectAnimator.ofFloat(this.f41734g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41734g0, View.ALPHA, 0.0f));
            }
            this.f41727f0.setDuration(180L);
            this.f41727f0.addListener(new nv0(this, z9, 1));
            this.f41727f0.start();
        } else if (z9) {
            this.f41734g0.setAlpha(1.0f);
            this.f41734g0.setVisibility(0);
        } else {
            this.f41734g0.setAlpha(0.0f);
            this.f41734g0.setVisibility(4);
        }
    }

    @Override
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21119a) {
            return baseSimpleGlass.f21022i;
        }
        return null;
    }

    public final int k4() {
        if (e4() == 0) {
            return org.telegram.messenger.g0.L(168.0f);
        }
        return org.telegram.messenger.g0.L(152.0f);
    }

    public final void k5() {
        int i7;
        int i10;
        Long l10;
        if (this.N5 != null) {
            return;
        }
        h11[] h11VarArr = new h11[1];
        Rect rect = org.telegram.messenger.g0.Q;
        ok okVar = this.f41726f;
        if (okVar != null) {
            if (okVar.getRightDrawable() == null) {
                rect.set(this.f41726f.getWidth() - 1, (this.f41726f.getHeight() / 2) - 1, this.f41726f.getWidth() + 1, (this.f41726f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f41726f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f41726f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f41726f.getX(), (int) this.f41726f.getY());
            }
        }
        if (this.f41726f.getScaleX() < 1.5f) {
            i7 = 16;
        } else {
            i7 = 32;
        }
        int i11 = i7;
        int L = (-(this.Y.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i11);
        Point point = org.telegram.messenger.g0.f22537q;
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
        gv0 gv0Var = new gv0(this, this, parentActivity, valueOf, i10, this.f41866z0, i11, h11VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41713d1));
        if (a22 != null) {
            gv0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.E;
        if (l11 != null) {
            gv0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.g5 g5Var = this.F;
            if (g5Var != null) {
                Drawable drawable = g5Var.f33789f[0];
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.i5) drawable).h());
                    gv0Var.setSelected(l10);
                }
            }
            l10 = null;
            gv0Var.setSelected(l10);
        }
        gv0Var.setSaveState(3);
        gv0Var.y(this.F, this.f41726f);
        hv0 hv0Var = new hv0(this, gv0Var);
        this.N5 = hv0Var;
        h11VarArr[0] = hv0Var;
        int[] iArr = new int[2];
        ok okVar2 = this.f41726f;
        if (okVar2 != null) {
            okVar2.getLocationOnScreen(iArr);
        }
        h11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        h11VarArr[0].b();
    }

    public final float l4() {
        return Math.max(this.A5, this.Q5);
    }

    public final void l5() {
        int i7 = 0;
        this.N.K0.setReordering(false);
        vv0 vv0Var = this.N;
        org.telegram.ui.Components.tq0 tq0Var = vv0Var.K0;
        if (vv0Var.f40424x1 != null && tq0Var != null) {
            boolean C0 = vv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = tq0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.xs0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.N.N1(true);
        this.f41864y5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new j90(this, 25)).start();
        org.telegram.ui.Components.hc.a0(this).Q(2131623989, 36, "Tab order changed.").j();
    }

    public final float m4(float f10, float f11) {
        float f12;
        float f13;
        this.f41834u6 = f10;
        this.f41849w6 = f11;
        int i7 = this.I1;
        if (i7 == 2) {
            f12 = 1.0f;
        } else if (this.R1 < 1.0f && i7 != 0) {
            f12 = 0.0f;
        } else {
            f12 = this.f41757j2;
        }
        float l10 = Utilities.l(f12);
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            f13 = lu0Var.getVisibilityFactor();
        } else {
            f13 = 0.0f;
        }
        return Math.max(0.0f, (p4() + this.f41791o5) * l10) + com.google.android.recaptcha.internal.a.z(1.0f, l10, f11 * f13, f10);
    }

    public final void m5() {
        int w02;
        int w03;
        if (!this.f41789o2) {
            bv0 bv0Var = this.f41807r;
            if (bv0Var != null) {
                Object tag = bv0Var.getTag();
                if (tag instanceof Integer) {
                    this.f41807r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), this.f41866z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.f41807r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.f41866z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f41850x;
            int i7 = -1;
            if (drawable != null) {
                if (this.f41740g6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27854dd, this.f41866z0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.gk0 gk0Var = this.K;
            if (gk0Var != null) {
                gk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27923h8, this.f41866z0));
            }
            ok okVar = this.f41726f;
            if (okVar != null) {
                okVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27969ji, this.f41866z0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.f41740g6 == null) {
                    i7 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, this.f41866z0);
                }
                kVar.D(i7, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f41740g6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27888f8, this.f41866z0);
                }
                kVar2.C(w02, false);
            }
        }
        s5();
        P5();
    }

    public final float n4(float f10) {
        float f11;
        this.f41857x6 = f10;
        int i7 = this.I1;
        float f12 = 0.0f;
        if (i7 == 2) {
            f11 = 1.0f;
        } else if (this.R1 < 1.0f && i7 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f41757j2;
        }
        float l10 = Utilities.l(f11);
        if (this.S != null) {
            f12 = this.S.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f);
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, l10, f12, f10);
    }

    public final void n5() {
        int i7;
        float f10;
        k0 k0Var;
        if (this.Z != null && this.f41807r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22531m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            org.telegram.ui.Components.ef0 ef0Var = this.Z;
            boolean z9 = this.F1;
            ef0Var.f33221e = z9;
            if (z9 && this.I1 == 2 && (k0Var = this.X) != null) {
                this.Z.f33222f = this.X.getY() + (this.X.getScaleY() * k0Var.getHeight());
                this.Z.setAlpha(this.R1);
                org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
                ef0Var2.f33227x = org.telegram.messenger.g0.L(74.0f);
                ef0Var2.setTranslationY(this.f41688a.getMeasuredWidth());
                ef0Var2.invalidate();
            } else {
                ef0Var.f33222f = -1.0f;
                float f11 = i10;
                float f12 = this.P1 + f11;
                if (!this.H4 && !this.I4) {
                    f10 = 0.0f;
                } else {
                    f10 = 25.0f;
                }
                float L = f12 - org.telegram.messenger.g0.L(f10);
                float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f11);
                org.telegram.ui.Components.ef0 ef0Var3 = this.Z;
                ef0Var3.f33227x = min;
                ef0Var3.setTranslationY(L - min);
                ef0Var3.invalidate();
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
            mutate.setColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28041ni, this.f41866z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.wq(this.D, getParentActivity().getDrawable(2131232310).mutate());
        }
        return this.J;
    }

    public final void o5() {
        int i7;
        if (this.Y0 != null && this.Z0 != null) {
            TLRPC.UserFull userFull = this.f41830u2;
            if (userFull == null && this.f41824t2 == null) {
                i7 = 0;
            } else if (userFull != null) {
                i7 = userFull.ttl_period;
            } else {
                i7 = this.f41824t2.ttl_period;
            }
            this.f41816s0.b(i7);
            this.Z0.t(i7);
        }
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null) {
            j30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.tq0 tq0Var;
        if (super.onBackPressed(z9)) {
            vv0 vv0Var = this.N;
            if (vv0Var != null && (tq0Var = vv0Var.K0) != null && tq0Var.f31534n0) {
                if (z9) {
                    l5();
                    return false;
                }
            } else if (this.J4 != -1 && vv0Var != null && vv0Var.E1) {
                if (z9) {
                    vv0Var.V(true);
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
        this.f41786n6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        Q5();
        this.f41786n6 = true;
        U3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.onConfigurationChanged(configuration);
        }
        t4();
        if (this.f41775m2 && this.f41789o2 && (m10 = this.f41704c.m(0)) != null) {
            this.f41688a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r20, java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        qu0 qu0Var = this.f41688a;
        if (qu0Var != null) {
            qu0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.Q0();
        }
        org.telegram.ui.Components.ps0 ps0Var = this.Q;
        if (ps0Var != null) {
            ps0Var.b(this);
        }
        org.telegram.ui.Components.ps0 ps0Var2 = this.Q;
        if (ps0Var2 != null) {
            ps0Var2.f37056y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25046r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25059t);
        getNotificationCenter().n(this, org.telegram.messenger.qs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25045q5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24962c0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25078v5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25000i3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24984f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25097y3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25095y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24982f3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.W3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        av0 av0Var = this.f41781n0;
        if (av0Var != null) {
            av0Var.K();
        }
        org.telegram.ui.Components.kf0 kf0Var = this.m0;
        if (kf0Var != null) {
            kf0Var.d();
        }
        this.Z5 = null;
        if (this.f41713d1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25055s1);
            getNotificationCenter().n(this, org.telegram.messenger.qs.O);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f24950a0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f24985g0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25008k0);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25091x4);
            getMessagesController().f24856q1.remove(Long.valueOf(this.f41713d1));
        } else if (this.f41720e1 != 0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25037p3);
            getNotificationCenter().n(this, org.telegram.messenger.qs.T);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f24986g1);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25082w2);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f24957b1);
        }
        zu0 zu0Var = this.f41719e0;
        if (zu0Var != null) {
            zu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null) {
            j30Var.d();
        }
        ev0 ev0Var = this.V4;
        if (ev0Var != null) {
            ev0Var.b();
        }
        xw0 xw0Var = this.f41853x2;
        if (xw0Var != null && this.f41845w2) {
            xw0Var.b(true);
            this.f41853x2 = null;
        }
        org.telegram.messenger.video.n nVar = this.f41856x5;
        if (nVar != null) {
            this.f41856x5 = null;
            org.telegram.messenger.g0.h3(nVar);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.er0 er0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null) {
            j30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.e();
        }
        vv0 vv0Var = this.N;
        if (vv0Var != null && (er0Var = vv0Var.V) != null) {
            er0Var.f44861e = false;
            if (er0Var.f44860c != null) {
                er0Var.f44858a.onPause();
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
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null) {
            j30Var.j(i7, strArr, iArr);
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
                    org.telegram.messenger.r3 g12 = getMessagesController().g1(this.f41720e1, false, null);
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
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41713d1));
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
            TLRPC.UserFull userFull = this.f41830u2;
            if (userFull != null && userFull.video_calls_available) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.voip.y1.m(a22, z10, z11, getParentActivity(), this.f41830u2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        TLRPC.User a22;
        l00 l00Var;
        super.onResume();
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.f40366d1 = true;
            org.telegram.ui.Components.dr0 dr0Var = vv0Var.J;
            if (dr0Var != null) {
                dr0Var.f();
            }
            org.telegram.ui.Components.ks0 ks0Var = vv0Var.M;
            if (ks0Var != null) {
                ks0Var.f();
            }
            org.telegram.ui.Components.ls0 ls0Var = vv0Var.L;
            if (ls0Var != null) {
                ls0Var.X(false);
            }
            for (int i7 = 0; i7 < vv0Var.m0.length; i7++) {
                vv0Var.e0(i7);
            }
            org.telegram.ui.Components.er0 er0Var = vv0Var.V;
            if (er0Var != null) {
                er0Var.f44861e = true;
                if (er0Var.f44860c != null) {
                    er0Var.f44858a.onResume();
                }
            }
        }
        t4();
        jw0 jw0Var = this.d;
        if (jw0Var != null) {
            this.T4 = true;
            jw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (l00Var = this.T) != null && l00Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null) {
            j30Var.k();
            setParentActivityTitle(org.telegram.messenger.hd.M0(2131745496, null));
        }
        I5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        ok okVar = this.f41726f;
        if (okVar != null) {
            setParentActivityTitle(okVar.getText());
        }
        if (this.f41713d1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f41713d1))) != null && a22.photo == null && this.P1 >= j4()) {
            this.f41750i2.cancel();
            float[] fArr = this.f41769l2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            X4(1.0f);
            this.f41781n0.setVisibility(8);
            this.P1 = j4();
            this.f41782n2 = false;
            this.f41704c.h1(0, j4() - this.f41688a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.a();
        }
        C5();
        y4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f41859y0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, this.f41866z0));
            m5();
            M5();
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
                        this.f41757j2 = 0.0f;
                        org.telegram.ui.Components.lu0 lu0Var = this.S;
                        if (lu0Var != null) {
                            lu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ef0 ef0Var = this.Z;
                        if (ef0Var != null) {
                            ef0Var.setParentExpanded(0.0f);
                        }
                        Z4(0.0f);
                        org.telegram.ui.Components.zf0 zf0Var = this.f41697b0;
                        if (zf0Var != null) {
                            zf0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.F1 = false;
                    O3();
                    if (this.H1) {
                        S3(true);
                    }
                }
                if (!this.f41772l5) {
                    this.f41772l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.P4);
            l00 l00Var = this.T;
            if (l00Var != null && l00Var.getVisibility() == 0) {
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
        l00 l00Var = this.T;
        if (l00Var != null && l00Var.getVisibility() == 0) {
            if (z9) {
                this.T.setAlpha(1.0f - f10);
            } else {
                this.T.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        uw0 uw0Var;
        ImageView imageView;
        org.telegram.ui.Components.ef0 ef0Var;
        super.onTransitionAnimationStart(z9, z10);
        this.f41711c6 = z9;
        if (z9 && (ef0Var = this.Z) != null) {
            ArrayList arrayList = ef0Var.f33217a;
            if (ef0Var.E == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.bf0 bf0Var = (org.telegram.ui.Components.bf0) arrayList.get(i7);
                    org.telegram.ui.Components.zg0 zg0Var = bf0Var.f32123k;
                    if (zg0Var != null) {
                        if (bf0Var.f32115a == 15) {
                            zg0Var.M(14);
                        } else {
                            zg0Var.M(0);
                        }
                        bf0Var.f32123k.start();
                    }
                }
            }
        }
        if (!z9 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.r0)) {
            ((org.telegram.ui.ActionBar.r0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z9 && z10) || (z9 && !z10)) && this.I1 != 0 && this.L1 && !this.f41789o2) {
            this.F1 = true;
            if (!z9) {
                if (this.Z5 == null) {
                    this.Z5 = new float[14];
                }
                this.E1 = this.P1;
                this.Z5[0] = this.X.getScaleX();
                this.Z5[1] = this.X.getTranslationX();
                this.Z5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
                if (ef0Var2 != null) {
                    this.Z5[3] = ef0Var2.getAlpha();
                }
                bi.g1 g1Var = this.f41835v0;
                if (g1Var != null) {
                    float[] fArr = this.Z5;
                    fArr[4] = g1Var.f3916e;
                    fArr[5] = g1Var.f3917f;
                }
                if (this.f41865y6 != null) {
                    this.Z5[6] = uw0Var.getAlpha();
                }
                this.Z5[7] = this.f41726f.getScaleX();
                this.Z5[8] = this.f41726f.getTranslationY();
                this.Z5[9] = this.f41807r.getTranslationY();
                this.Z5[10] = this.f41726f.getLayoutParams().width;
                float[] fArr2 = this.Z5;
                fArr2[11] = this.f41699b2;
                fArr2[12] = this.f41726f.getTranslationX();
                this.Z5[13] = this.f41807r.getTranslationX();
                fi.m3 m3Var = this.A6;
                if (m3Var != null) {
                    m3Var.f(true);
                }
            }
        }
        if (z9) {
            if (this.f41800q0 != null) {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.qs.f25053s, org.telegram.messenger.qs.f25059t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.X, org.telegram.messenger.qs.E0, org.telegram.messenger.qs.f25051r4}, this.P4, true);
            } else {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.qs.f25053s, org.telegram.messenger.qs.f25059t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.X, org.telegram.messenger.qs.f25051r4}, this.P4, true);
            }
            if (!z10 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.G1 = true;
        Q3();
    }

    public final float p4() {
        if (this.S != null) {
            return this.S.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
        }
        return 0.0f;
    }

    public final void p5() {
        float L;
        boolean z9;
        if (this.s5 != null) {
            vv0 vv0Var = this.N;
            if (vv0Var != null && vv0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.g0.L(232.0f) - (this.f41688a.getMeasuredHeight() - this.N.getY());
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            int i7 = 0;
            if (L <= 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            te.a aVar = this.M5;
            aVar.a(z9, true);
            float f10 = aVar.f55395e;
            this.s5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
            this.s5.setAlpha(f10);
            FrameLayout frameLayout = this.s5;
            if (f10 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32519w;
            if (ccVar != null) {
                ccVar.l();
            }
        }
    }

    public final int q4() {
        float f10;
        if (this.f41794p1) {
            return 0;
        }
        if (this.f41720e1 != 0 && org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.f41720e1)))) {
            if (x4()) {
                f10 = 24.0f;
            } else {
                f10 = 38.0f;
            }
            return org.telegram.messenger.g0.L(f10);
        }
        return org.telegram.messenger.g0.L(50.0f);
    }

    public final void q5() {
        boolean z9;
        fi.m3 m3Var = this.A6;
        if (m3Var != null) {
            float f10 = 0.0f;
            m3Var.p(0.0f, (this.f41726f.getScaleX() * this.f41726f.getRightDrawableX()) + this.f41726f.getX() + (-m3Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.g0.U1(this.f41763k2, this.f41769l2);
            fi.m3 m3Var2 = this.A6;
            m3Var2.setTranslationY(((this.f41726f.getY() + (-m3Var2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
            this.A6.j(i0.a.f(U1, this.B6, 1342177280));
            if (this.P1 >= org.telegram.messenger.g0.L(82.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            Boolean bool = this.C6;
            if (bool != null && bool.booleanValue() == z9) {
                return;
            }
            ViewPropertyAnimator animate = this.A6.animate();
            this.C6 = Boolean.valueOf(z9);
            if (z9) {
                f10 = 1.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f10), org.telegram.ui.Components.xq.f40330g, 200L);
        }
    }

    public final org.telegram.ui.Components.wq r4() {
        int i7;
        float f10;
        if (this.I == null) {
            this.f41858y = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.fp fpVar = this.f41740g6;
            if (fpVar != null) {
                if (fpVar.o(org.telegram.ui.ActionBar.k6.I.q())) {
                    i7 = this.f41740g6.k();
                } else {
                    i7 = this.f41740g6.i();
                }
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, f10, i7);
                Drawable drawable = this.f41858y;
                int S0 = org.telegram.messenger.g0.S0(this.Q5, 1.0f, b10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.f41866z0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.H.setColorFilter(org.telegram.messenger.g0.S0(this.Q5, 1.0f, -1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, this.f41866z0)), mode);
            }
            this.I = new org.telegram.ui.Components.wq(new org.telegram.ui.Components.xp(this.f41858y, this.H), getParentActivity().getDrawable(2131232793));
        }
        return this.I;
    }

    public final void r5() {
        if (getParentActivity() != null && this.U0 != null) {
            if (getUserConfig().q()) {
                this.U0.setIcon(2131231862);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231863);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f41866z0), PorterDuff.Mode.SRC_IN));
            this.P6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232169);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.U0.setIcon(new di.i2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null) {
            j30Var.f34847f = bundle.getString("path");
        }
    }

    public final boolean s4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i7 = 0;
        if (!this.f41802q2 || (userFull = this.f41830u2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void s5() {
        t5(this.f41733f6);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j30 j30Var = this.f41800q0;
        if (j30Var != null && (str = j30Var.f34847f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        int i7;
        this.f41757j2 = f10;
        this.R1 = f10;
        Q3();
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setAlpha(f10);
        }
        if (this.I1 == 2) {
            this.f41719e0.setProgressToExpand(f10);
            org.telegram.ui.Components.ef0 ef0Var = this.Z;
            if (ef0Var != null) {
                ef0Var.setParentExpanded(f10);
            }
            Z4(f10);
            org.telegram.ui.Components.zf0 zf0Var = this.f41697b0;
            if (zf0Var != null) {
                zf0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.lu0 lu0Var = this.S;
            if (lu0Var != null) {
                lu0Var.setParentExpanded(f10);
            }
            n5();
            E5();
        }
        this.f41688a.setAlpha(f10);
        this.f41688a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.I1 != 2 || (w02 = this.f41808r0) == 0) {
            if (this.f41713d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41720e1)) {
                    boolean z9 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f41866z0;
            int[][] iArr = org.telegram.ui.Components.w8.L;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, f6Var);
        }
        int i10 = this.X4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, this.f41866z0);
        }
        this.f41706c1.setBackgroundColor(i0.a.f(f10, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.zz0 zz0Var = this.f41768l0;
        int f11 = i0.a.f(f10, i10, w02);
        zz0Var.f41172k = true;
        zz0Var.f41165b.setColor(f11);
        int i11 = -1;
        if (this.f41740g6 != null) {
            w03 = -1;
        } else {
            if (this.f41713d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41720e1)) {
                    boolean z10 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = this.f41866z0;
            int[][] iArr2 = org.telegram.ui.Components.w8.L;
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27905g8, f6Var2);
        }
        this.actionBar.D(i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, this.f41866z0), w03), false);
        if (this.f41740g6 == null) {
            i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27969ji, this.f41866z0);
        }
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.f41866z0);
        ok okVar = this.f41726f;
        if (okVar != null && this.I1 != 2) {
            okVar.setTextColor(i0.a.f(f10, w05, i11));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28080pi, this.f41866z0);
        } else {
            if (this.f41713d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41720e1)) {
                    boolean z11 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.f6 f6Var3 = this.f41866z0;
            int[][] iArr3 = org.telegram.ui.Components.w8.L;
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27923h8, f6Var3);
        }
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.k6.f28072pa;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.k6.w0(i7, this.f41866z0);
        bv0 bv0Var = this.f41807r;
        if (bv0Var != null && this.I1 != 2) {
            bv0Var.setTextColor(i0.a.f(f10, w06, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.P1 = this.Q1 * f10;
        long j3 = this.f41713d1;
        if (j3 == 0) {
            j3 = this.f41720e1;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.f41866z0;
        int[][] iArr4 = org.telegram.ui.Components.w8.L;
        int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070p8[org.telegram.ui.Components.w8.e(j3)], f6Var4);
        long j10 = this.f41713d1;
        if (j10 == 0) {
            j10 = this.f41720e1;
        }
        int d = org.telegram.ui.Components.w8.d(j10);
        if (w07 != d) {
            this.f41793p0.h(i0.a.f(f10, d, w07));
            this.f41719e0.invalidate();
        }
        int i12 = this.Y4;
        if (i12 != 0) {
            setNavigationBarColor(i0.a.f(f10, i12, getNavigationBarColor()));
        }
        this.f41706c1.invalidate();
        y4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ew0 ew0Var = this.f41717d6;
        if (ew0Var != null) {
            ew0Var.invalidate();
        }
        if (a() > 0) {
            zu0 zu0Var = this.f41719e0;
            if (zu0Var != null) {
                zu0Var.setProgressToStoriesInsets(this.R1);
            }
            cv0 cv0Var = this.f41828u0;
            if (cv0Var != null) {
                cv0Var.setProgressToStoriesInsets(this.R1);
            }
            bi.g1 g1Var = this.f41835v0;
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
            this.W1 = new org.telegram.messenger.n6(q4Var.getParentActivity().getWindow(), new tt0(this, 8));
        }
    }

    @Override
    public final boolean t() {
        return this.f41711c6;
    }

    public final void t4() {
        boolean z9;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f41775m2 = z9;
    }

    public final void t5(float f10) {
        int S0;
        org.telegram.messenger.fp fpVar = this.f41740g6;
        if (fpVar != null) {
            S0 = i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.k6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.Q5, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28041ni, this.f41866z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.f41866z0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.k6.Cj;
        int f12 = i0.a.f(Math.max(this.Q5, this.A5), f11, org.telegram.ui.ActionBar.k6.w0(i7, this.f41866z0));
        org.telegram.ui.Components.g5 g5Var = this.F;
        if (g5Var != null) {
            g5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.g5 g5Var2 = this.G;
        if (g5Var2 != null) {
            g5Var2.k(Integer.valueOf(i0.a.f(this.Q5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.k6.w0(i7, this.f41866z0))));
        }
        this.f41712d0.setColor(f12);
        this.f41733f6 = f10;
    }

    public final boolean u4() {
        if (this.D2 != null) {
            return getMessagesController().o2(this.D2);
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f41830u2;
        messagesController.getClass();
        return org.telegram.messenger.qp.K2(userFull);
    }

    public final void u5() {
        this.f41712d0.setScaleX(this.f41726f.getScaleX());
        this.f41712d0.setScaleY(this.f41726f.getScaleY());
        this.f41712d0.b((this.f41726f.getScaleX() * this.f41726f.getRightDrawableX()) + this.f41726f.getX(), (this.f41726f.getHeight() - (this.f41726f.getScaleY() * (this.f41726f.getHeight() - this.f41726f.getRightDrawableY()))) + this.f41726f.getY());
    }

    @Override
    public final void v() {
        this.f41688a.y0(0);
    }

    public final boolean v4() {
        if (this.f41800q0 != null && !this.f41809r1) {
            return true;
        }
        return false;
    }

    public final void v5() {
        if (!this.f41794p1 && org.telegram.messenger.t3.c0(this.D2)) {
            org.telegram.messenger.dt notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f26688a.c(new org.telegram.messenger.a4(notificationsController, -this.f41720e1, new mu0(this), 6));
        }
    }

    public final void w4(boolean z9) {
        boolean z10;
        boolean c02 = org.telegram.messenger.t3.c0(this.D2);
        TLRPC.Chat chat = this.D2;
        if (!c02 && !z9 && (chat == null || !chat.creator)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.ui.Components.v4.r(this, false, chat, null, false, z10, z9, !c02, new tt0(this, 3));
    }

    public final void w5(float f10) {
        kw0 kw0Var;
        ValueAnimator valueAnimator;
        if (this.f41789o2 || ((kw0Var = this.M) != null && (valueAnimator = kw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.f41688a.getMeasuredWidth();
            layoutParams.height = (int) (this.P1 + f10);
            this.M.requestLayout();
        }
        ww0 ww0Var = this.f41706c1;
        if (ww0Var != null) {
            ww0Var.E.setTranslate(0.0f, this.Z1 - ww0Var.f51670y);
            ww0 ww0Var2 = this.f41706c1;
            RadialGradient radialGradient = ww0Var2.D;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(ww0Var2.E);
            }
            this.f41706c1.invalidate();
        }
        u5();
        n5();
        E5();
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final boolean x4() {
        if (getMessagesController().P1().K(a()) && !this.f41794p1) {
            return true;
        }
        return false;
    }

    public final void x5() {
        boolean z9;
        boolean z10;
        boolean z11;
        float a10;
        float f10 = 0.0f;
        if (!this.f41794p1 && !this.F1) {
            int e42 = e4();
            if (e42 > 0) {
                a10 = c8.j9.a(1.0f - (this.P1 / e42), 0.0f, 1.0f);
            } else {
                a10 = c8.j9.a((this.f41699b2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f10 = a10;
        }
        float f11 = this.A5;
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
            this.A5 = f10;
            ok okVar = this.f41726f;
            if (okVar != null) {
                okVar.setTextColor(this.D5);
            }
            bv0 bv0Var = this.f41807r;
            if (bv0Var != null) {
                bv0Var.setTextColor(this.E5);
            }
            s5();
            if (z11) {
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25051r4, Boolean.TRUE);
            }
            ww0 ww0Var = this.f41706c1;
            if (ww0Var != null) {
                ww0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        A5();
        z5();
    }

    @Override
    public final boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26505a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j3)) {
            k10.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            k10.putLong("user_id", j3);
        } else if (org.telegram.messenger.m5.z(j3)) {
            k10.putLong("chat_id", -j3);
        }
        if (!getMessagesController().E(k10, wwVar, null, null)) {
            return false;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.qs.f25059t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new an(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.ez.g(getMessagesController().a2(Long.valueOf(this.f41713d1)), j3, null, null, null, null, z10, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.gz.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z10, i7, i10);
        }
        return true;
    }

    public final void y4(boolean z9) {
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
        FrameLayout.LayoutParams layoutParams;
        float f18;
        int i12;
        int i13;
        ok okVar;
        int w02;
        float f19;
        int i14;
        boolean z10;
        TLRPC.ChatFull chatFull;
        int i15;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22531m;
        } else {
            i7 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        float L3 = L3();
        qu0 qu0Var = this.f41688a;
        if (qu0Var != null && !this.F1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qu0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f41688a.setLayoutParams(layoutParams2);
            }
        }
        O5(z9);
        if (this.X != null) {
            this.f41688a.setTopGlowOffset((int) this.P1);
            qu0 qu0Var2 = this.f41688a;
            if (this.P1 > j4() && this.P1 < (e4() + this.f41688a.getMeasuredWidth()) - currentActionBarHeight) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            qu0Var2.setOverScrollMode(i15);
        }
        if (this.X != null && !this.f41711c6 && this.F1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.X != null) {
            if (this.Z != null && this.f41720e1 != 0) {
                if (org.telegram.messenger.t3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f41824t2) != null && chatFull.linked_chat_id != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.Z.o(2, z10);
            }
            O5(z9);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f22531m;
            } else {
                i10 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, i10) - org.telegram.messenger.g0.L(21.0f));
            if (!this.F1) {
                org.telegram.ui.Components.wf0 wf0Var = this.f41822t0;
                if (wf0Var != null) {
                    f19 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.bs bsVar = wf0Var.f39963n;
                    if (bsVar != null && bsVar.f21691c) {
                        f19 = bsVar.f21692e.centerY();
                    }
                } else {
                    f19 = -org.telegram.messenger.g0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.g0.f22531m;
                } else {
                    i14 = 0;
                }
                this.Z1 = org.telegram.messenger.g0.T1(f19, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14) - org.telegram.messenger.g0.L(21.0f)), L3);
            } else {
                this.Z1 = translationY;
            }
            if (this.F1) {
                f10 = this.Q1;
            } else {
                f10 = this.P1;
            }
            float f20 = j42;
            if (f10 <= f20 && !this.f41789o2) {
                f11 = 2.0f;
                f12 = 18.0f;
            } else {
                f11 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f10 - f20) / ((this.f41688a.getMeasuredWidth() - currentActionBarHeight) - k4())));
                this.f41736g2 = max;
                f12 = 18.0f;
                this.f41691a2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.f41699b2 = 0.0f;
                cv0 cv0Var = this.f41828u0;
                if (cv0Var != null) {
                    cv0Var.invalidate();
                }
                bi.g1 g1Var = this.f41835v0;
                if (g1Var != null) {
                    g1Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.f41743h2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z11 = this.f41782n2;
                int i16 = org.telegram.messenger.qs.f25051r4;
                float[] fArr = this.f41769l2;
                if (z11 && (this.F0 || this.f41736g2 >= 0.33f)) {
                    if (!this.f41789o2) {
                        if (this.S0 != null) {
                            if (!u4()) {
                                this.S0.S(21);
                            } else {
                                this.S0.t(21);
                            }
                            if (this.f41800q0 != null) {
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
                        this.f41789o2 = true;
                        org.telegram.messenger.qs.e().k(i16, Boolean.TRUE);
                        this.M.f(true, min);
                        this.f41787o0.b(min);
                        this.f41781n0.setCreateThumbFromParent(true);
                        this.f41781n0.getAdapter().g();
                        this.f41750i2.cancel();
                        fArr[0] = org.telegram.messenger.g0.U1(this.f41763k2, fArr);
                        fArr[1] = 1.0f;
                        cv0 cv0Var2 = this.f41828u0;
                        if (cv0Var2 != null && !cv0Var2.f42003x.isEmpty()) {
                            this.f41750i2.setInterpolator(new x1.a());
                            this.f41750i2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f41750i2.setInterpolator(org.telegram.ui.Components.xq.f40332j);
                            this.f41750i2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f41750i2.addListener(new dv0(this, 4));
                        View m10 = this.f41704c.m(0);
                        if (!this.O1 && m10 != null) {
                            this.N1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i11 = org.telegram.messenger.g0.f22531m;
                            } else {
                                i11 = 0;
                            }
                            this.f41688a.x0(((m10.getTop() - this.f41688a.getMeasuredWidth()) - e4()) + currentActionBarHeight2 + i11, (int) this.f41750i2.getDuration(), (Interpolator) this.f41750i2.getInterpolator());
                            this.f41688a.O0 = false;
                        }
                        this.f41695a6 = this.f41726f.getTranslationY();
                        this.f41703b6 = this.f41807r.getTranslationY();
                        this.f41750i2.start();
                        this.f41781n0.setAlpha(0.0f);
                        this.f41781n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f41781n0.getLayoutParams();
                    int i17 = layoutParams3.height;
                    layoutParams3.width = this.f41688a.getMeasuredWidth();
                    float f21 = currentActionBarHeight + f10;
                    int i18 = (int) f21;
                    layoutParams3.height = i18;
                    if (i17 != i18) {
                        this.f41781n0.requestLayout();
                    }
                    if (!this.f41750i2.isRunning()) {
                        if (this.F1 && this.I1 == 2) {
                            f13 = (-(1.0f - this.R1)) * org.telegram.messenger.g0.L(50.0f);
                        } else {
                            f13 = 0.0f;
                        }
                        this.f41726f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f41726f.getLeft());
                        this.f41726f.setTranslationY((((f21 - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f41726f.getBottom()) + f13);
                        this.f41807r.setTranslationX(m4(org.telegram.messenger.g0.N(16.0f) - this.f41807r.getLeft(), 0.0f));
                        this.f41807r.setTranslationY(n4((((f21 - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.f41807r.getBottom()) + f13));
                        q5();
                    }
                } else {
                    if (this.f41789o2) {
                        this.f41789o2 = false;
                        org.telegram.messenger.qs.e().k(i16, Boolean.TRUE);
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.S0;
                        if (f5Var2 != null) {
                            f5Var2.t(21);
                            if (this.f41800q0 != null) {
                                this.S0.t(33);
                                this.S0.t(34);
                                this.S0.t(35);
                                this.S0.S(36);
                                this.S0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var3 = this.T0;
                        if (f5Var3 != null) {
                            f5Var3.setEnabled(!this.f41860y1);
                        }
                        this.M.f(false, min);
                        this.f41787o0.b(min);
                        this.f41750i2.cancel();
                        this.f41719e0.getImageReceiver().f21217t0 = true;
                        this.f41719e0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.g0.U1(this.f41763k2, fArr);
                        fArr[1] = 0.0f;
                        this.f41750i2.setInterpolator(org.telegram.ui.Components.xq.f40332j);
                        if (!this.f41775m2) {
                            this.f41750i2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f41750i2.setDuration(0L);
                        }
                        this.f41706c1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.f41866z0));
                        if (!this.H0 && (currentItemView = this.f41781n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.c51) {
                                this.f41719e0.f51519a0 = false;
                            } else {
                                zu0 zu0Var = this.f41719e0;
                                zu0Var.f51519a0 = true;
                                zu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f41750i2.addListener(new dv0(this, 5));
                        this.f41719e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.f41781n0.setAlpha(0.0f);
                        this.f41750i2.start();
                        this.O1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.X.setScaleX(this.f41691a2);
                    this.X.setScaleY(this.f41691a2);
                    d4();
                    ValueAnimator valueAnimator = this.f41750i2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        R4();
                        this.f41726f.setTranslationY(this.d2);
                        this.f41807r.setTranslationX(m4(this.f41721e2, this.f41841v6));
                        this.f41807r.setTranslationY(n4(this.f41729f2));
                        q5();
                    }
                }
            }
            boolean z12 = this.F1;
            if (z12 && this.I1 == 2) {
                float f22 = this.f41725e6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f22531m;
                } else {
                    i13 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f11) + i13) - (org.telegram.messenger.g0.f22536p * 21.0f));
                this.f41726f.setPivotY(okVar.getMeasuredHeight());
                this.f41726f.setScaleX(1.38f);
                this.f41726f.setScaleY(1.38f);
                this.f41691a2 = org.telegram.messenger.g0.W1(this.R1, 42, 138) / 100.0f;
                this.f41699b2 = 0.0f;
                cv0 cv0Var3 = this.f41828u0;
                if (cv0Var3 != null) {
                    cv0Var3.setExpandProgress(1.0f);
                }
                bi.g1 g1Var2 = this.f41835v0;
                if (g1Var2 != null) {
                    g1Var2.setExpandProgress(1.0f);
                }
                this.f41719e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.R1));
                this.X.setTranslationX(org.telegram.messenger.g0.T1(f22, 0.0f, this.R1));
                this.X.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.R1));
                float measuredWidth = ((this.f41691a2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.f41741h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.f41741h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.f41748i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41748i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.f41755j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41755j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.f41761k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41761k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.X.setScaleX(this.f41691a2);
                this.X.setScaleY(this.f41691a2);
                this.f41781n0.setAlpha(0.0f);
                this.f41781n0.setVisibility(0);
                zu0 zu0Var2 = this.f41719e0;
                float f23 = this.R1;
                float f24 = this.f41691a2;
                zu0Var2.H = f23;
                zu0Var2.I = f24;
                zu0Var2.G = true;
                this.M.e(false, f23);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                int i19 = -1;
                if (this.f41740g6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, this.f41866z0);
                }
                kVar.D(i0.a.f(this.R1, w02, -1), false);
                org.telegram.ui.Components.gk0 gk0Var = this.K;
                if (gk0Var != null) {
                    gk0Var.b(i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27923h8, this.f41866z0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f41850x;
                if (drawable != null) {
                    if (this.f41740g6 == null) {
                        i19 = i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27854dd, this.f41866z0), -1);
                    }
                    drawable.setColorFilter(i19, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = this.I;
                if (wqVar != null) {
                    wqVar.a(this.R1);
                    this.f41726f.invalidate();
                }
                org.telegram.ui.Components.wq wqVar2 = this.J;
                if (wqVar2 != null) {
                    wqVar2.a(this.R1);
                    this.f41726f.invalidate();
                }
                t5(this.R1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.f41688a.getMeasuredWidth() / this.f41691a2, this.R1);
                layoutParams4.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.P1 + currentActionBarHeight) / this.f41691a2, this.R1);
                this.X.requestLayout();
                q5();
            } else if (f10 <= f20) {
                if (z12) {
                    this.f41691a2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.f41699b2 = 0.0f;
                    f15 = 1.0f;
                } else {
                    org.telegram.ui.Components.wf0 wf0Var2 = this.f41822t0;
                    if (wf0Var2 != null) {
                        f14 = wf0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f14 = 24.0f;
                    }
                    this.f41691a2 = org.telegram.messenger.g0.T1(f14, 96.0f, L3) / 100.0f;
                    f15 = 1.0f;
                    this.f41699b2 = 1.0f - L3;
                }
                org.telegram.ui.Components.ef0 ef0Var = this.Z;
                if (ef0Var != null) {
                    if (this.F1) {
                        ef0Var.setAlpha(this.R1);
                    } else {
                        ef0Var.setAlpha(f15);
                    }
                }
                cv0 cv0Var4 = this.f41828u0;
                if (cv0Var4 != null) {
                    cv0Var4.invalidate();
                }
                bi.g1 g1Var3 = this.f41835v0;
                if (g1Var3 != null) {
                    g1Var3.h = this.F1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (g1Var3.f3917f != l10) {
                        g1Var3.f3917f = l10;
                        g1Var3.invalidate();
                    }
                }
                float f25 = (0.12f * L3) + 1.0f;
                ValueAnimator valueAnimator2 = this.f41750i2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f41750i2;
                    dv0 dv0Var = this.Y5;
                    valueAnimator3.removeListener(dv0Var);
                    this.f41750i2.addListener(dv0Var);
                } else {
                    this.X.setScaleX(this.f41691a2);
                    this.X.setScaleY(this.f41691a2);
                    d4();
                    this.X.setTranslationY((float) Math.ceil(this.Z1));
                    float L = (((this.f41691a2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.f41741h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                    this.f41741h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                    this.f41748i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41748i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                    this.f41755j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41755j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                    this.f41761k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41761k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.g0.N(8.0f) + (this.X.getScaleY() * this.X.getHeight());
                if (this.F1) {
                    f16 = this.R1;
                } else {
                    f16 = L3;
                }
                float f26 = (N * f16) + floor;
                this.d2 = com.google.android.recaptcha.internal.a.z(1.0f, this.R1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + f26);
                this.f41729f2 = (((float) Math.floor(org.telegram.messenger.g0.f22536p * 11.0f)) * L3) + f26 + org.telegram.messenger.g0.L(24.0f);
                if (this.F1) {
                    f17 = (this.f41725e6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                } else {
                    f17 = -org.telegram.messenger.g0.N(46.0f);
                }
                uw0 uw0Var = this.f41865y6;
                if (uw0Var != null) {
                    uw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.f41688a.getMeasuredWidth();
                this.f41726f.setScaleX(f25);
                this.f41726f.setScaleY(f25);
                z4(0, L3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f41726f.getLayoutParams();
                float f27 = measuredWidth2 / f11;
                float min2 = f27 - (((Math.min(this.f41726f.getExactWidth(), layoutParams5.width) * f25) * 0.5f) + layoutParams5.leftMargin);
                float f28 = ((FrameLayout.LayoutParams) this.f41807r.getLayoutParams()).width;
                if (!this.f41798p5 && this.f41807r.getExactWidth() <= (f28 - this.f41807r.getPaddingLeft()) - this.f41807r.getPaddingRight()) {
                    f18 = this.f41807r.getPaddingLeft();
                } else {
                    f18 = 0.0f;
                }
                float min3 = f27 - ((Math.min(this.f41807r.getExactWidth(), f28) * 0.5f) + (layoutParams.leftMargin + f18));
                this.f41707c2 = min2;
                this.f41721e2 = min3;
                this.f41841v6 = f18;
                if (this.F1) {
                    min2 = org.telegram.messenger.g0.T1(f17, min2, L3);
                    min3 = org.telegram.messenger.g0.T1(f17, min3, L3);
                }
                ValueAnimator valueAnimator4 = this.f41750i2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f41726f.setTranslationX(min2);
                    this.f41726f.setTranslationY(this.d2);
                    this.f41807r.setTranslationX(m4(min3, this.f41841v6 * L3));
                    this.f41807r.setTranslationY(n4(this.f41729f2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f41726f.getLayoutParams();
                int i20 = layoutParams6.width;
                if (org.telegram.messenger.g0.Q1()) {
                    i12 = org.telegram.messenger.g0.L(490.0f);
                } else {
                    i12 = org.telegram.messenger.g0.f22537q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i12 - org.telegram.messenger.g0.L(f12)) / this.f41726f.getScaleX()) - (this.f41726f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i20) {
                    this.f41726f.requestLayout();
                }
                q5();
            }
            ValueAnimator valueAnimator5 = this.f41750i2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                z4(0, L3, true);
            }
        }
        w5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f41719e0.setAlpha(1.0f);
        }
    }

    public final void y5() {
        vv0 vv0Var = this.N;
        if (vv0Var != null && this.V5 != 0) {
            int topPanelShift = vv0Var.getTopPanelShift();
            int i7 = 0;
            if (topPanelShift > 0 && this.N.isAttachedToWindow()) {
                if (this.N.getParent() == this.f41688a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.N.getY()));
                }
                i7 = topPanelShift;
            }
            int i10 = this.V5 + i7;
            c5(i10, this.B5);
            c5(i10, this.T5);
        }
    }

    public final void z4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.z4(int, float, boolean):void");
    }

    public final void z5() {
        boolean z9;
        float f10;
        if (this.B5 != null && this.T5 != null) {
            vv0 vv0Var = this.N;
            int i7 = 0;
            if (vv0Var != null && vv0Var.getParent() == this.f41688a && this.N.isAttachedToWindow()) {
                z9 = true;
            } else {
                z9 = false;
            }
            float max = Math.max(Math.min(this.A5, this.L5), this.Q5);
            View view = this.B5;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = max;
            }
            view.setAlpha(f10);
            this.B5.setVisibility((z9 || max <= 0.0f) ? 8 : 8);
            View view2 = this.T5;
            if (!z9) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z9) {
                this.T5.setTranslationY(-(this.N.getY() + this.f41688a.getY()));
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.ps0 ps0Var) {
        super(bundle);
        this.h = null;
        this.f41780n = null;
        this.f41843w0 = null;
        this.f41851x0 = new org.telegram.ui.Components.t30(this, 2);
        this.f41859y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f41690a1 = 1.0f;
        this.B1 = new a0.h();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.X1 = new HashMap();
        this.f41769l2 = new float[]{0.0f, 1.0f};
        this.f41795p2 = new Paint();
        this.A2 = -1;
        this.K2 = new Rect();
        this.Q4 = new ArrayList();
        this.R4 = new ArrayList();
        this.S4 = 0;
        this.T4 = true;
        this.U4 = true;
        this.X4 = 0;
        this.Y4 = 0;
        this.Z4 = 0;
        this.f41694a5 = 0L;
        this.f41746h5 = new HashSet();
        this.f41759j5 = new fv0(this, 0);
        this.f41766k5 = new lv0(this);
        this.H5 = new pu0(this);
        this.L5 = 1.0f;
        this.M5 = new te.a(0, new tt0(this, 7), org.telegram.ui.Components.xq.h, 380L, true);
        this.S5 = new fv0(this, 1);
        this.Y5 = new dv0(this, 2);
        this.Z5 = null;
        this.f41747h6 = new SparseIntArray();
        this.f41760j6 = null;
        this.f41767k6 = -1;
        this.f41799p6 = new int[3];
        this.f41806q6 = -1.0f;
        ri.b bVar = new ri.b();
        this.J6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.K6 = cVar;
        this.M6 = new Paint();
        this.R6 = new int[7];
        this.Q = ps0Var;
        cVar.f8707g = new xe.b();
    }

    @Override
    public final void T() {
    }
}
