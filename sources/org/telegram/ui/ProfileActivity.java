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
public class ProfileActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, nw, org.telegram.ui.Components.ps0, org.telegram.ui.Components.e30, org.telegram.ui.Components.lr0, de0 {
    public static final RectF T6 = new RectF();
    public static final int U6 = org.telegram.messenger.g0.L(16.0f);
    public org.telegram.ui.ActionBar.e6 A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public gi.d A5;
    public sw0 A6;
    public int B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public float B5;
    public gi.l3 B6;
    public org.telegram.messenger.ac C0;
    public a0.h C1;
    public ArrayList C2;
    public int C3;
    public int C4;
    public View C5;
    public int C6;
    public int D0;
    public boolean D1;
    public TLRPC.EncryptedChat D2;
    public int D3;
    public int D4;
    public int D5;
    public Boolean D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.Chat E2;
    public int E3;
    public int E4;
    public int E5;
    public TLRPC.TL_emojiStatusCollectible E6;
    public Long F;
    public int F0;
    public float F1;
    public TL_bots.BotInfo F2;
    public int F3;
    public int F4;
    public int F5;
    public int F6;
    public org.telegram.ui.Components.e5 G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public int G5;
    public boolean G6;
    public org.telegram.ui.Components.e5 H;
    public boolean H0;
    public boolean H1;
    public TL_account.TL_password H2;
    public int H3;
    public int H4;
    public hh.e H5;
    public int H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public final gu0 I5;
    public int I6;
    public org.telegram.ui.Components.wq J;
    public boolean J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public boolean J4;
    public org.telegram.ui.Components.kf0 J5;
    public int J6;
    public org.telegram.ui.Components.wq K;
    public final boolean[] K0;
    public boolean K1;
    public org.telegram.messenger.ac K2;
    public int K3;
    public int K4;
    public float K5;
    public final si.b K6;
    public org.telegram.ui.Components.kk0 L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public int L5;
    public final eh.c L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.l8 M2;
    public int M3;
    public int M4;
    public float M5;
    public ci.g M6;
    public cw0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public int N4;
    public final qe.a N5;
    public final Paint N6;
    public mv0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public yu0 O5;
    public Drawable O6;
    public org.telegram.ui.Components.zu0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public boolean P4;
    public AnimatorSet P5;
    public Drawable P6;
    public boolean Q;
    public org.telegram.ui.ActionBar.f5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public AnimatorSet Q5;
    public Drawable Q6;
    public org.telegram.ui.Components.os0 R;
    public org.telegram.ui.ActionBar.f5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public float R5;
    public org.telegram.ui.Components.wp R6;
    public boolean S;
    public org.telegram.ui.ActionBar.f5 S0;
    public float S1;
    public int S2;
    public int S3;
    public final ArrayList S4;
    public boolean S5;
    public final int[] S6;
    public org.telegram.ui.Components.ku0 T;
    public org.telegram.ui.ActionBar.f5 T0;
    public int T1;
    public int T2;
    public int T3;
    public int T4;
    public final wu0 T5;
    public org.telegram.ui.Components.voip.r0 U;
    public org.telegram.ui.ActionBar.f5 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public View U5;
    public org.telegram.ui.Components.ch0 V;
    public org.telegram.ui.ActionBar.y0 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public boolean V4;
    public int V5;
    public org.telegram.ui.Components.ch0 W;
    public org.telegram.ui.ActionBar.y0 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public vu0 W4;
    public int W5;
    public gi.l3 X;
    public org.telegram.ui.ActionBar.y0 X0;
    public org.telegram.messenger.n6 X1;
    public int X2;
    public int X3;
    public View X4;
    public CharSequence X5;
    public l0 Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public boolean Y5;
    public ai.c0 Z;
    public org.telegram.ui.ActionBar.y0 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public final uu0 Z5;
    public hu0 f41719a;
    public org.telegram.ui.Components.gf0 f41720a0;
    public o4.m0 f41721a1;
    public float f41722a2;
    public int f41723a3;
    public int f41724a4;
    public int f41725a5;
    public float[] f41726a6;
    public org.telegram.ui.Components.tj0 f41727b;
    public org.telegram.messenger.bp f41728b0;
    public float f41729b1;
    public float f41730b2;
    public int f41731b3;
    public int f41732b4;
    public long f41733b5;
    public float f41734b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ju0 f41735c;
    public org.telegram.ui.Components.cg0 f41736c0;
    public int f41737c1;
    public float c2;
    public int f41738c3;
    public int f41739c4;
    public boolean f41740c5;
    public float f41741c6;
    public bw0 d;
    public org.telegram.ui.Components.hf0 f41742d0;
    public ow0 f41743d1;
    public float f41744d2;
    public int f41745d3;
    public int f41746d4;
    public boolean f41747d5;
    public boolean f41748d6;
    public lw0 f41749e;
    public org.telegram.ui.Cells.o f41750e0;
    public long f41751e1;
    public float f41752e2;
    public int f41753e3;
    public int f41754e4;
    public String f41755e5;
    public wv0 f41756e6;
    public kk f41757f;
    public qu0 f41758f0;
    public long f41759f1;
    public float f41760f2;
    public int f41761f3;
    public int f41762f4;
    public String f41763f5;
    public float f41764f6;
    public AnimatorSet f41765g0;
    public long f41766g1;
    public float f41767g2;
    public int f41768g3;
    public int f41769g4;
    public String f41770g5;
    public float f41771g6;
    public String h;
    public org.telegram.ui.Cells.b4 f41772h0;
    public boolean f41773h1;
    public float f41774h2;
    public int f41775h3;
    public int f41776h4;
    public org.telegram.ui.Components.ig f41777h5;
    public org.telegram.messenger.wo f41778h6;
    public ImageView f41779i0;
    public long f41780i1;
    public float f41781i2;
    public int i3;
    public int f41782i4;
    public final HashSet f41783i5;
    public final SparseIntArray f41784i6;
    public ImageView f41785j0;
    public boolean f41786j1;
    public ValueAnimator f41787j2;
    public int f41788j3;
    public int f41789j4;
    public CharacterStyle f41790j5;
    public int f41791j6;
    public ImageView f41792k0;
    public boolean k1;
    public float f41793k2;
    public int f41794k3;
    public int f41795k4;
    public final wu0 f41796k5;
    public AnimatorSet f41797k6;
    public ImageView f41798l0;
    public boolean f41799l1;
    public float f41800l2;
    public int f41801l3;
    public int f41802l4;
    public final cv0 f41803l5;
    public int f41804l6;
    public org.telegram.ui.Components.zz0 m0;
    public long m1;
    public final float[] f41805m2;
    public int f41806m3;
    public int f41807m4;
    public boolean f41808m5;
    public int f41809m6;
    public String f41810n;
    public org.telegram.ui.Components.nf0 f41811n0;
    public boolean f41812n1;
    public boolean f41813n2;
    public int f41814n3;
    public int n4;
    public kv0 f41815n5;
    public boolean f41816n6;
    public ru0 f41817o0;
    public boolean f41818o1;
    public boolean f41819o2;
    public int f41820o3;
    public int f41821o4;
    public float f41822o5;
    public boolean f41823o6;
    public ew0 f41824p0;
    public boolean f41825p1;
    public boolean f41826p2;
    public int f41827p3;
    public int f41828p4;
    public float f41829p5;
    public org.telegram.ui.Components.fh0 f41830p6;
    public org.telegram.ui.Components.u8 f41831q0;
    public boolean f41832q1;
    public final Paint f41833q2;
    public int f41834q3;
    public int f41835q4;
    public boolean f41836q5;
    public final int[] f41837q6;
    public su0 f41838r;
    public org.telegram.ui.Components.f30 f41839r0;
    public boolean f41840r1;
    public boolean f41841r2;
    public int f41842r3;
    public int f41843r4;
    public boolean r5;
    public float f41844r6;
    public org.telegram.ui.Components.fh0 f41845s;
    public int f41846s0;
    public boolean f41847s1;
    public ii.s0 f41848s2;
    public int f41849s3;
    public int f41850s4;
    public ImageReceiver f41851s5;
    public CharSequence s6;
    public org.telegram.ui.Components.zz0 f41852t0;
    public boolean f41853t1;
    public ii.r f41854t2;
    public int f41855t3;
    public int f41856t4;
    public FrameLayout f41857t5;
    public CharSequence f41858t6;
    public org.telegram.ui.Components.zf0 f41859u0;
    public int f41860u1;
    public TLRPC.ChatFull f41861u2;
    public int f41862u3;
    public int f41863u4;
    public FrameLayout[] f41864u5;
    public boolean f41865u6;
    public tu0 f41866v0;
    public boolean f41867v1;
    public TLRPC.UserFull f41868v2;
    public int f41869v3;
    public int f41870v4;
    public SpannableStringBuilder f41871v5;
    public float f41872v6;
    public AnimatorSet f41873w;
    public ci.z0 f41874w0;
    public boolean f41875w1;
    public org.telegram.ui.Cells.d6 f41876w2;
    public int f41877w3;
    public int f41878w4;
    public SpannableStringBuilder f41879w5;
    public float f41880w6;
    public Drawable f41881x;
    public View f41882x0;
    public boolean f41883x1;
    public boolean f41884x2;
    public int f41885x3;
    public int f41886x4;
    public gi.d[] f41887x5;
    public float f41888x6;
    public Drawable f41889y;
    public final org.telegram.ui.Components.p30 f41890y0;
    public int f41891y1;
    public pw0 f41892y2;
    public int f41893y3;
    public int f41894y4;
    public org.telegram.messenger.video.o f41895y5;
    public float f41896y6;
    public final Paint f41897z0;
    public boolean f41898z1;
    public CharSequence f41899z2;
    public int f41900z3;
    public int f41901z4;
    public FrameLayout f41902z5;
    public mw0 f41903z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity A4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void G3(ProfileActivity profileActivity, boolean z10) {
        Drawable t10 = profileActivity.f41758f0.getImageReceiver().t();
        String str = null;
        if (t10 instanceof org.telegram.ui.Components.x41) {
            profileActivity.f41758f0.w(null, null, t10);
        } else if (t10 instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) t10;
            profileActivity.f41758f0.w(null, null, t5Var);
            if (z10) {
                t5Var.f(profileActivity.f41758f0);
            }
        } else {
            org.telegram.messenger.ac D = profileActivity.f41817o0.D(0);
            if (D != null && D.f21497p == 2) {
                str = "avatar";
            }
            profileActivity.f41758f0.w(D, str, t10);
        }
    }

    public static int J0(ProfileActivity profileActivity) {
        int i3;
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null && kVar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = T6;
            if (kh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                jh.d.b(new na(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O0(ProfileActivity profileActivity, int i3) {
        boolean I0 = org.telegram.ui.Components.ws0.I0(profileActivity.O.getClosestTab());
        if (i3 == profileActivity.F6 && I0 == profileActivity.G6) {
            return;
        }
        profileActivity.F6 = i3;
        profileActivity.G6 = I0;
        if (I0) {
            if (i3 > 0) {
                profileActivity.f41887x5[0].i(org.telegram.messenger.bd.G(i3, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.f41887x5[0].i(profileActivity.f41879w5, true, true);
            }
        } else if (i3 <= 0 && org.telegram.messenger.hp.s1(profileActivity.currentAccount).W4()) {
            profileActivity.f41887x5[0].i(profileActivity.f41871v5, true, true);
        } else {
            profileActivity.f41887x5[0].i(org.telegram.messenger.bd.G(i3, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public static ValueAnimator P0(ProfileActivity profileActivity, final boolean z10) {
        float f10;
        boolean z11;
        int i3;
        if (z10) {
            org.telegram.messenger.g0.a3(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.l3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        ci.z0 z0Var = profileActivity.f41874w0;
        if (z0Var != null) {
            z0Var.setActive(!z10);
        }
        float f11 = profileActivity.U1;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        final float f12 = profileActivity.Q1;
        profileActivity.f41727b.setTranslationY(f12);
        profileActivity.f41727b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f41719a.setVisibility(0);
        profileActivity.y4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f41757f.setVisibility(0);
        profileActivity.f41838r.setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        kVar.y(z11);
        int i10 = 8;
        if (profileActivity.U1 > 0.5f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
        if (f5Var != null) {
            f5Var.setVisibility(i3);
        }
        profileActivity.U0.setVisibility(i3);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.U1 <= 0.5f) {
            i10 = 0;
        }
        searchContainer.setVisibility(i10);
        profileActivity.f41727b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.r0(ProfileActivity.this, ofFloat, f12, z10);
            }
        });
        ofFloat.addListener(new ev0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.V4 = true;
            profileActivity.T4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        boolean z10;
        int i3;
        if (profileActivity.f41819o2) {
            if (profileActivity.f41826p2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i3 = org.telegram.messenger.g0.f22602m;
                } else {
                    i3 = 0;
                }
                profileActivity.f41719a.w0(0, ((view.getTop() - profileActivity.f41719a.getMeasuredWidth()) - profileActivity.e4()) + currentActionBarHeight + i3, org.telegram.ui.Components.xq.h);
                return;
            }
            profileActivity.f41719a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
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
                profileActivity.f41719a.w0(0, (int) (profileActivity.Q1 - profileActivity.e4()), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (z10) {
            float f12 = profileActivity.Q1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.f41719a.w0(0, (int) profileActivity.Q1, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (!z10) {
            float f13 = profileActivity.Q1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.f41719a.w0(0, (int) f13, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (profileActivity.Q1 > 0.0f) {
            profileActivity.f41719a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
        }
    }

    public static void V4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, activity, null);
        s1Var.f28546j0 = false;
        s1Var.show();
        Utilities.f21387e.c(new a60(s1Var, z10, activity));
    }

    public static SpannableStringBuilder W3(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        cz czVar = new cz(9);
        czVar.f44496w = str;
        if (czVar.f44490c != null) {
            czVar.f44490c = null;
            czVar.a();
        }
        czVar.f44492f = w02;
        czVar.f44493n = false;
        spannableStringBuilder.setSpan(czVar, 0, spannableStringBuilder.length(), 0);
        cz[] czVarArr = (cz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cz.class);
        if (czVarArr != null) {
            for (cz czVar2 : czVarArr) {
                czVar2.getClass();
                czVar2.f44492f = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                czVar2.f44494r = i3;
                czVar2.f44495s = e6Var;
                czVar2.f44493n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(FrameLayout frameLayout, float f10) {
        int i3;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(U6 * f10);
        frameLayout.setAlpha(1.0f - f10);
        if (f10 < 1.0f) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        frameLayout.setVisibility(i3);
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.dy0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.ac h;
        if (profileActivity.J2 == null) {
            if (profileActivity.f41832q1 && !profileActivity.getMessagesController().D3()) {
                ArrayList l10 = profileActivity.getMessagesController().f23102q7.l(profileActivity.f41759f1);
                if (l10 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i3 = 0; tL_forumTopic == null && i3 < l10.size(); i3++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i3);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f27053id == profileActivity.f41766g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (e10 = org.telegram.ui.Components.g5.e(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.fc.a0(profileActivity).h(e10, 1, new vt0(profileActivity, 2))) != null) {
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
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
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
                            arrayList.add(Integer.valueOf(i3));
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
        int i3;
        if (profileActivity.Z3 >= 0) {
            if (profileActivity.K4 == -1) {
                profileActivity.J5();
                profileActivity.d.f();
            } else {
                profileActivity.D5(false, false);
            }
        }
        if (profileActivity.K4 == -1) {
            if (!profileActivity.f41813n2 && !org.telegram.messenger.g0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i3 = org.telegram.messenger.g0.f22602m;
                } else {
                    i3 = 0;
                }
                int i10 = currentActionBarHeight + i3;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f41719a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f41719a.getMeasuredHeight(), 0);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    bw0 bw0Var = profileActivity.d;
                    if (i11 >= bw0Var.f44157e.N2) {
                        break;
                    }
                    u4.d1 a10 = bw0Var.a(null, bw0Var.d(i11));
                    View view = a10.f55540a;
                    profileActivity.d.t(a10, i11);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 += view.getMeasuredHeight();
                    i11++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i12) + i10));
                hu0 hu0Var = profileActivity.f41719a;
                hu0Var.setPadding(0, hu0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f41719a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.f41787j2.cancel();
                float[] fArr = profileActivity.f41805m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.X4(1.0f);
                profileActivity.Q1 = profileActivity.j4();
            }
        }
        profileActivity.M.m(profileActivity.f41780i1, user, 8);
    }

    public static void c0(org.telegram.ui.ProfileActivity r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.c0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void c5(int i3, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i3) {
            view.getLayoutParams().height = i3;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i3);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.k5 k5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.ac b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            sf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().V2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        vg.h1 h1Var = new vg.h1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        k5Var.getLocationOnScreen(new int[2]);
        h1Var.f56637o2 = k5Var.f27793i0;
        h1Var.f56638p2 = k5Var.f27794j0;
        h1Var.f56641s2 = k5Var.getScaleX();
        h1Var.f56639q2 = k5Var.getLeft();
        h1Var.f56640r2 = k5Var.getTop();
        h1Var.f56642t2 = k5Var;
        Drawable rightDrawable = k5Var.getRightDrawable();
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (rightDrawable == e5Var && e5Var != null) {
            Drawable drawable = e5Var.f33286f[0];
            if (drawable instanceof org.telegram.ui.Components.g5) {
                h1Var.f56641s2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.g5) drawable).f33966e;
                if (document != null) {
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(profileActivity.getParentActivity());
                    org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.ac.b(document);
                        if (d != null) {
                            d.f23763e = 512;
                            d.f23764f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                            d.f23763e = 512;
                            d.f23764f = 512;
                        }
                        b10 = org.telegram.messenger.ac.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.ac acVar = b10;
                    k9Var.setLayerNum(7);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    k9Var.m(acVar, str2, org.telegram.messenger.ac.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.g5) profileActivity.G.f33286f[0]).c()) {
                        k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        h1Var.f56644v2 = org.telegram.messenger.zi.j1(document);
                    } else {
                        h1Var.f56644v2 = org.telegram.messenger.zi.j1(document);
                    }
                    h1Var.f56643u2 = k9Var;
                    h1Var.f56646x2 = true;
                }
            }
        }
        profileActivity.showDialog(h1Var);
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.c2, 0.25f) / 0.25f;
        float f10 = 1.0f;
        if (profileActivity.f41832q1) {
            profileActivity.f41859u0.setAlpha(1.0f - min);
            profileActivity.f41859u0.setBlurIntensity(0.0f);
            int i3 = 0;
            profileActivity.f41859u0.setGooeyEnabled(false);
            org.telegram.ui.Components.zf0 zf0Var = profileActivity.f41859u0;
            if (profileActivity.c2 >= 1.0f) {
                i3 = 8;
            }
            zf0Var.setVisibility(i3);
        } else {
            profileActivity.f41859u0.setHideProgress(profileActivity.c2);
        }
        tu0 tu0Var = profileActivity.f41866v0;
        if (tu0Var != null && profileActivity.J1 != 2) {
            float f11 = profileActivity.c2;
            if (f11 > 0.0f) {
                f10 = org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f11, 0.0f, 0.5f));
            }
            tu0Var.setAlpha(f10);
        }
        profileActivity.x5();
    }

    public static void d5(org.telegram.ui.ActionBar.f5 f5Var, boolean z10, boolean z11) {
        int i3;
        if (com.google.android.recaptcha.internal.a.u(f5Var)) {
            f5Var.Y(z10, z11);
        } else if (f5Var != null) {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            f5Var.setVisibility(i3);
        }
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z10;
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f27025id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && profileActivity.I2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.K(profileActivity.I2, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.I2.volume_id);
                sb2.append("_");
                String o10 = a1.g.o(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.m(profileActivity.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.K(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.J2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.K(profileActivity.J2, null, true, true).renameTo(K2);
            }
            profileActivity.getMessagesController().U0(a22.f27150id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.f41751e1);
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(b22, false);
            }
        }
        if (!org.telegram.messenger.g0.Q1() && !profileActivity.f41813n2 && profileActivity.f41758f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f41819o2 = z10;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        ru0 ru0Var = profileActivity.f41817o0;
        ru0Var.I0 = true;
        ru0Var.L0 = profileActivity.K2;
        ru0Var.f39107r1 = null;
        ru0Var.f39108s1 = null;
        ru0Var.setCreateThumbFromParent(false);
        profileActivity.I5(true);
        profileActivity.j5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.f23292r, Integer.valueOf(org.telegram.messenger.hp.C8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.f23248j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean f0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.hp.s1(profileActivity.currentAccount).f22989d7.edit().putLong("dialog_join_requested_time_" + profileActivity.f41780i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.t3.T(profileActivity.E2) && !profileActivity.E2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i3 = org.telegram.ui.Components.x60.f40246r1;
        org.telegram.ui.Components.x60.J0(parentActivity, profileActivity, org.telegram.ui.Components.fc.a0(profileActivity), z11);
        if (!z10 || profileActivity.M4 != -1) {
            profileActivity.J5();
            bw0 bw0Var = profileActivity.d;
            if (bw0Var != null) {
                bw0Var.f();
            }
        }
        if (d2Var instanceof wm) {
            ((wm) d2Var).Yb(false, true);
        }
        return false;
    }

    public static void g0(ProfileActivity profileActivity) {
        org.telegram.messenger.hp.s1(profileActivity.currentAccount).l0(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void h0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(profileActivity).Q(2131623989, 36, org.telegram.messenger.bd.M0(2131746864, null));
            Q.f31792j = 5000;
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
                String M0 = org.telegram.messenger.bd.M0(2131746860, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131746861, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                profileActivity.showDialog(s1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity), 2131624011, 36);
    }

    public static void i0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ii.q3.J0(context, profileActivity.currentAccount, profileActivity.f41868v2.starref_program, profileActivity.getUserConfig().e(), profileActivity.A0, false);
        } else {
            ii.q3.K0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.A0);
        }
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.f41758f0.j(org.telegram.messenger.ac.e(fileLocation), "50_50", profileActivity.f41831q0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.J5();
                bw0 bw0Var = profileActivity.d;
                if (bw0Var != null) {
                    bw0Var.f();
                }
                profileActivity.y4(true);
            }
            ru0 ru0Var = profileActivity.f41817o0;
            org.telegram.messenger.ac e10 = org.telegram.messenger.ac.e(profileActivity.J2);
            profileActivity.K2 = e10;
            ru0Var.A(e10, org.telegram.messenger.ac.e(profileActivity.I2));
            profileActivity.j5(true, false);
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
                int i3 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i3 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.f41791j6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new xy(25, profileActivity, str));
        }
        profileActivity.actionBar.q().requestLayout();
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, View view, int i3, float f10, float f11) {
        TLRPC.User a22;
        TLRPC.ChatParticipant chatParticipant;
        bw0 bw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f41719a.C0();
        if (i3 == profileActivity.S3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1));
            TLRPC.UserFull userFull = profileActivity.f41868v2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                ci.i0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.f41751e1, new ci.u1(profileActivity, context, e10, 3));
            } else if (a23 == null || !a23.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new ii.k(profileActivity.f41751e1));
            }
        } else if (i3 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().r2(j10, profileActivity.f41766g1, null);
            profileActivity.getNotificationsController().G(j10, profileActivity.f41766g1, z10);
            org.telegram.ui.Components.fc.A(profileActivity, z10, null).j();
            profileActivity.v5();
            int i10 = profileActivity.Q3;
            if (i10 < 0 || (bw0Var = profileActivity.d) == null) {
                return;
            }
            bw0Var.g(i10);
        } else if (i3 == profileActivity.Z3) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.f27150id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f41755e5);
            bundle.putString("first_name_card", profileActivity.f41763f5);
            bundle.putString("last_name_card", profileActivity.f41770g5);
            lr lrVar = new lr(bundle, profileActivity.A0);
            lrVar.P = new nt0(profileActivity, a24);
            profileActivity.presentFragment(lrVar);
        } else if (i3 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.t4.h0(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751509, null), org.telegram.messenger.bd.M0(2131751593, null), org.telegram.messenger.bd.M0(2131751592, null), org.telegram.messenger.bd.M0(2131751599, null), new vt0(profileActivity, 1), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        } else if (i3 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M0 = org.telegram.messenger.bd.M0(2131746221, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746242, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.f41733b5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.A0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.bd.f21784a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.f21784a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], b8.mf.o(-1, -2));
                c2VarArr[0].setOnClickListener(new q00(c2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746240, null), new rb0(18, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(8));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        } else if (i3 == profileActivity.f41843r4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f41780i1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.d2(bundle2));
        } else if (i3 == profileActivity.f41835q4) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.U(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.A0).f27343a);
        } else if (i3 == profileActivity.N3) {
            profileActivity.F4(view, f10, f11, false);
        } else if (i3 == profileActivity.L4) {
            profileActivity.getMessagesController().f5(null, profileActivity.f41751e1);
            if (org.telegram.ui.Components.fc.a(profileActivity)) {
                org.telegram.ui.Components.fc.d(profileActivity, false).j();
            }
        } else if (i3 == profileActivity.f41724a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else if (i3 == profileActivity.U3) {
            profileActivity.I4();
        } else if (i3 == profileActivity.V3) {
            ey0.K0(profileActivity.a(), profileActivity);
        } else if (i3 >= profileActivity.f41863u4 && i3 < profileActivity.f41870v4) {
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant = profileActivity.f41861u2.participants.participants.get(((Integer) profileActivity.C2.get(i3 - profileActivity.f41863u4)).intValue());
            } else {
                chatParticipant = profileActivity.f41861u2.participants.participants.get(i3 - profileActivity.f41863u4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i3 == profileActivity.f41878w4) {
            profileActivity.J4();
        } else if (i3 == profileActivity.L3) {
            profileActivity.Q4(f10, f11, i3, view);
        } else if (i3 == profileActivity.f41802l4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new ji.b0(profileActivity, profileActivity.E2.linked_community_id, null, null));
            } else if (profileActivity.f41751e1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1))) == null) {
            } else {
                profileActivity.showDialog(new ji.b0(profileActivity, a22.linked_community_id, null, null));
            }
        } else if (i3 == profileActivity.I3) {
            if (profileActivity.f41861u2.location instanceof TLRPC.TL_channelLocation) {
                la0 la0Var = new la0(5);
                la0Var.m0 = -profileActivity.f41759f1;
                la0Var.C0 = (TLRPC.TL_channelLocation) profileActivity.f41861u2.location;
                profileActivity.presentFragment(la0Var);
            }
        } else if (i3 == profileActivity.M4) {
            profileActivity.E4(false);
        } else if (i3 == profileActivity.f41886x4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f41759f1);
            bundle3.putInt("type", 2);
            nq nqVar = new nq(bundle3);
            nqVar.C0(profileActivity.f41861u2);
            profileActivity.presentFragment(nqVar);
        } else if (i3 == profileActivity.f41894y4) {
            profileActivity.presentFragment(new ai.c7(profileActivity.f41759f1));
        } else if (i3 == profileActivity.f41901z4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f41759f1);
            bundle4.putInt("type", 1);
            nq nqVar2 = new nq(bundle4);
            nqVar2.C0(profileActivity.f41861u2);
            profileActivity.presentFragment(nqVar2);
        } else if (i3 == profileActivity.A4) {
            profileActivity.S0.performClick();
        } else if (i3 == profileActivity.B4) {
            profileActivity.presentFragment(new ci.v(0, profileActivity.f41751e1));
        } else if (i3 == profileActivity.C4) {
            profileActivity.presentFragment(new ci.v(1, profileActivity.f41751e1));
        } else if (i3 == profileActivity.D4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f41759f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new r41(bundle5));
        } else if (i3 == profileActivity.G4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f41759f1);
            bundle6.putInt("type", 0);
            nq nqVar3 = new nq(bundle6);
            nqVar3.C0(profileActivity.f41861u2);
            profileActivity.presentFragment(nqVar3);
        } else if (i3 == profileActivity.f41761f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i3 == profileActivity.f41775h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i3 == profileActivity.i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i3 == profileActivity.f41788j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i3 == profileActivity.f41794k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i3 == profileActivity.f41806m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i3 == profileActivity.f41801l3) {
            profileActivity.presentFragment(new t90());
        } else if (i3 == profileActivity.f41814n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i3 == profileActivity.f41834q3) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.T(profileActivity, profileActivity.A0));
        } else if (i3 == profileActivity.f41842r3) {
            sf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
        } else if (i3 == profileActivity.f41849s3) {
            sf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
        } else if (i3 == profileActivity.f41869v3) {
            V4(profileActivity.getParentActivity(), false);
        } else if (i3 == profileActivity.f41877w3) {
            V4(profileActivity.getParentActivity(), true);
        } else if (i3 == profileActivity.f41885x3) {
            org.telegram.messenger.a8.a();
        } else if (i3 == profileActivity.f41893y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M03 = org.telegram.messenger.bd.M0(2131754120, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
            s1Var2.U = M03;
            s1Var2.S = org.telegram.messenger.bd.M0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), new jt0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            profileActivity.showDialog(s1Var2);
        } else if (i3 == profileActivity.f41768g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i3 == profileActivity.V2) {
            profileActivity.presentFragment(new ka(null));
        } else if (i3 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i3 == profileActivity.T2) {
            profileActivity.presentFragment(new g(3));
        } else if (i3 == profileActivity.O2) {
            profileActivity.I4();
        } else if (i3 == profileActivity.f41739c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i3 == profileActivity.f41746d4) {
            profileActivity.presentFragment(new ci.wb());
        } else if (i3 == profileActivity.f41754e4) {
            profileActivity.presentFragment(new hi.g());
        } else if (i3 == profileActivity.f41762f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i3 == profileActivity.f41769g4) {
            xg.e1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
        } else if (i3 == profileActivity.botPermissionLocation) {
            ii.s0 s0Var = profileActivity.f41848s2;
            if (s0Var != null) {
                s0Var.l(!s0Var.g(), new hk0(25, profileActivity, view));
            }
        } else if (i3 == profileActivity.botPermissionBiometry) {
            ii.r rVar = profileActivity.f41854t2;
            if (rVar != null) {
                rVar.f15186f = true;
                rVar.f15185e = !rVar.f15185e;
                rVar.k();
                ((org.telegram.ui.Cells.l8) view).setChecked(profileActivity.f41854t2.f15185e);
            }
        } else if (i3 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.setChecked(!l8Var.d());
            if (profileActivity.f41821o4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f41821o4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.f41751e1);
            boolean d = l8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f41868v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new xy(24, profileActivity, r0));
            profileActivity.f41821o4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i3 == profileActivity.O3) {
            profileActivity.O4 = !profileActivity.O4;
            profileActivity.T4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.O3);
            int i11 = profileActivity.f41804l6;
            if (i11 >= 0) {
                profileActivity.f41735c.h1(i11, profileActivity.f41809m6 - profileActivity.f41719a.getPaddingTop());
            }
        } else if (i3 == profileActivity.P3) {
            profileActivity.N4(false);
        } else if (i3 == profileActivity.Q2) {
            if (profileActivity.f41868v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f41868v2.personal_channel_id);
            profileActivity.presentFragment(new wm(bundle7));
        } else if (i3 == profileActivity.U2) {
            sw0 sw0Var = profileActivity.A6;
            if ((sw0Var == null || !sw0Var.a()) && !profileActivity.Z3(i3, view)) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (w8Var.d.getDrawable() != null) {
                    profileActivity.H4(w8Var.getImageView());
                }
            }
        } else if (i3 == profileActivity.H3) {
            profileActivity.Y3(i3, view);
        } else {
            profileActivity.Q4(f10, f11, i3, view);
        }
    }

    public static void l0(ProfileActivity profileActivity) {
        boolean z10;
        org.telegram.ui.ActionBar.e2 e2Var;
        int i3;
        int w02;
        String str;
        boolean z11;
        long j10;
        Object[] objArr;
        char c2;
        float f10;
        float f11;
        float f12;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f41868v2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(profileActivity.getParentActivity(), false, 1, null);
            org.telegram.ui.ActionBar.e2 e2Var2 = h.f28625y0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.A0);
            if (profileActivity.a() != org.telegram.messenger.h10.i(profileActivity.currentAccount).e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            linearLayout.addView(limitPreviewView, b8.mf.t(-1, -2, 17, 0, 20, 0, 10));
            int i10 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, b8.mf.t(-1, -2, 17, 40, -12, 40, 20));
                int i11 = 2;
                org.telegram.ui.Components.s70[] s70VarArr = new org.telegram.ui.Components.s70[2];
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i11;
                    ai.e2 e2Var3 = new ai.e2(6, parentActivity, null);
                    s70VarArr[i12] = e2Var3;
                    e2Var3.setGravity(i10);
                    s70VarArr[i12].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.r6.V(s70VarArr[i12], org.telegram.ui.ActionBar.k6.f28273y6, null);
                    org.telegram.ui.ActionBar.r6.H(s70VarArr[i12], org.telegram.ui.ActionBar.k6.Uc, null);
                    frameLayout.addView(s70VarArr[i12], b8.mf.e(-1, -1, 119));
                    org.telegram.ui.Components.s70 s70Var = s70VarArr[i12];
                    if (i12 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    s70Var.setAlpha(f10);
                    org.telegram.ui.Components.s70 s70Var2 = s70VarArr[i12];
                    if (i12 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    s70Var2.setScaleX(f11);
                    org.telegram.ui.Components.s70 s70Var3 = s70VarArr[i12];
                    if (i12 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.8f;
                    }
                    s70Var3.setScaleY(f12);
                    i12++;
                    i11 = i13;
                    i10 = 17;
                }
                int i14 = i11;
                final s3 s3Var = new s3(s70VarArr, 21);
                if (profileActivity.a() == org.telegram.messenger.h10.i(profileActivity.currentAccount).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j11 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                e2Var = e2Var2;
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
                    boolean z12 = z11;
                    objArr = s70VarArr;
                    org.telegram.ui.ActionBar.r6.V(s70VarArr[0], org.telegram.ui.ActionBar.k6.f28122q7, null);
                    if (z12) {
                        objArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        objArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131745182, org.telegram.messenger.m5.l(org.telegram.messenger.h10.f22829t0, profileActivity.a()))));
                    }
                    c2 = 0;
                } else {
                    objArr = s70VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.bd.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.bd.H(',', "StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i14] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c2 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131745196, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i15 = r4;
                            s3 s3Var2 = s3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.T6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    s3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.T6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    s3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    objArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i15 = r4;
                            s3 s3Var2 = s3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i15) {
                                case 0:
                                    RectF rectF = ProfileActivity.T6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    s3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.T6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    s3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = org.telegram.messenger.bd.H(',', "StarRatingFuturePreview1", max);
                String H4 = org.telegram.messenger.bd.H(',', "StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c2] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i14] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131745195, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i15 = r4;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i15 = r4;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i15) {
                            case 0:
                                RectF rectF = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                e2Var = e2Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(org.telegram.messenger.bd.M0(2131745177, null));
            textView.setTextSize(1, 20.0f);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView, i15, profileActivity.A0);
            linearLayout.addView(textView, b8.mf.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.f27151id == org.telegram.messenger.h10.i(profileActivity.currentAccount).e()) {
                textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131745178, null)));
                i3 = 1;
            } else {
                i3 = 1;
                org.telegram.messenger.k5.r(null, null, 2131745208, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.h10.f22829t0, profileActivity.a())}, textView2);
            }
            textView2.setTextSize(i3, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, i15, profileActivity.A0);
            linearLayout.addView(textView2, b8.mf.t(-1, -2, 17, 20, 0, 20, 12));
            yr0 yr0Var = new yr0(parentActivity, profileActivity.A0);
            yr0Var.f52386a.l(org.telegram.messenger.bd.M0(2131745176, null), false);
            String M0 = org.telegram.messenger.bd.M0(2131745211, null);
            int i16 = org.telegram.ui.ActionBar.k6.Ci;
            yr0Var.f52387b.setText(org.telegram.messenger.bd.V(null, null, 2131745207, W3(M0, i16, profileActivity.A0)));
            yr0Var.d.setVisibility(8);
            ImageView imageView = yr0Var.f52388c;
            imageView.setImageResource(2131231827);
            org.telegram.ui.ActionBar.e6 e6Var = profileActivity.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, mode);
            linearLayout.addView(yr0Var, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var2 = new yr0(parentActivity, profileActivity.A0);
            yr0Var2.f52386a.l(org.telegram.messenger.bd.M0(2131745175, null), false);
            yr0Var2.f52387b.setText(org.telegram.messenger.bd.V(null, null, 2131745206, W3(org.telegram.messenger.bd.M0(2131745211, null), i16, profileActivity.A0)));
            yr0Var2.d.setVisibility(8);
            ImageView imageView2 = yr0Var2.f52388c;
            imageView2.setImageResource(2131231891);
            org.telegram.ui.ActionBar.r6.t(imageView2, i15, profileActivity.A0, mode);
            linearLayout.addView(yr0Var2, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var3 = new yr0(parentActivity, profileActivity.A0);
            yr0Var3.f52386a.l(org.telegram.messenger.bd.M0(2131745174, null), false);
            String M02 = org.telegram.messenger.bd.M0(2131745209, null);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28043m6, profileActivity.A0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, profileActivity.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            cz czVar = new cz(9);
            czVar.f44496w = M02;
            if (czVar.f44490c != null) {
                str = null;
                czVar.f44490c = null;
                czVar.a();
            } else {
                str = null;
            }
            czVar.f44492f = w02;
            czVar.f44493n = false;
            spannableStringBuilder3.setSpan(czVar, 0, spannableStringBuilder3.length(), 0);
            yr0Var3.f52387b.setText(org.telegram.messenger.bd.V(str, str, 2131745205, spannableStringBuilder3));
            yr0Var3.d.setVisibility(8);
            ImageView imageView3 = yr0Var3.f52388c;
            imageView3.setImageResource(2131231875);
            org.telegram.ui.ActionBar.r6.t(imageView3, i15, profileActivity.A0, mode);
            linearLayout.addView(yr0Var3, b8.mf.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            gi.d dVar = new gi.d(parentActivity, profileActivity.A0, true);
            dVar.setOnClickListener(new cu0(0, e2Var));
            dVar.i(ci.l6.g2(org.telegram.messenger.bd.M0(2131743898, null)), false, true);
            linearLayout.addView(dVar, b8.mf.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.O = linearLayout;
            h.show();
        }
    }

    public static void m0(ProfileActivity profileActivity, int i3, float f10, float f11) {
        switch (i3) {
            case 0:
                boolean z10 = profileActivity.f41832q1;
                if (z10) {
                    if (z10) {
                        profileActivity.c4();
                        return;
                    }
                    return;
                } else if (profileActivity.f41751e1 != 0) {
                    profileActivity.L4();
                    return;
                } else if (profileActivity.f41759f1 != 0) {
                    if (org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f41759f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f41759f1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new wm(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.c4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f41759f1);
                        if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                            profileActivity.presentFragment(new wm(bundle2), false);
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
                profileActivity.F4(profileActivity.f41720a0, f10, f11, true);
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
                ey0.K0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.w4(false);
                return;
            case 12:
                profileActivity.getMessagesController().f22999e7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, profileActivity.getParentActivity(), profileActivity.A0);
                s1Var.r(200L);
                org.telegram.messenger.hp.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.ei(24, profileActivity, s1Var), true, profileActivity.A0);
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
                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(profileActivity, profileActivity.f41720a0);
                    H.f33750w = false;
                    H.f33729i = 3;
                    H.c(2131232320, org.telegram.messenger.bd.M0(2131746508, null), new g90(profileActivity, 24), false);
                    H.c(2131232103, org.telegram.messenger.bd.M0(2131746686, null), new sg0(f12, 28), false);
                    H.c(2131232116, org.telegram.messenger.bd.M0(2131746628, null), new g90(profileActivity, 26), false);
                    H.W = true;
                    H.a0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.f41720a0.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new c31(null));
                return;
            default:
                return;
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f41728b0 == null) {
            if (MediaController.B().R0 != null && MediaController.B().R0.f21864a == profileActivity.currentAccount && MediaController.B().R0.f21865b == profileActivity.a()) {
                profileActivity.f41728b0 = MediaController.B().R0;
            } else {
                org.telegram.messenger.bp bpVar = new org.telegram.messenger.bp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f41728b0 = bpVar;
                TLRPC.UserFull userFull = profileActivity.f41868v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = bpVar.f21866c;
                    arrayList.clear();
                    bpVar.b();
                    arrayList.add(0, bpVar.d(document));
                }
            }
        }
        if (!profileActivity.f41728b0.f21866c.isEmpty()) {
            if (MediaController.B().R0 == profileActivity.f41728b0 && MediaController.B().I((org.telegram.messenger.zi) profileActivity.f41728b0.f21866c.get(0))) {
                z10 = true;
            } else {
                MediaController.B().o();
                z10 = false;
            }
            MediaController.B().R0 = profileActivity.f41728b0;
            MediaController.B().S0.clear();
            MediaController.B().S0.addAll(profileActivity.f41728b0.f21866c);
            if (!z10) {
                MediaController.B().S((org.telegram.messenger.zi) profileActivity.f41728b0.f21866c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.z7(profileActivity.getParentActivity(), profileActivity.A0));
        }
    }

    public static void o0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ia0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new g90(profileActivity, 20), profileActivity.A0);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.f41751e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.f41733b5);
        tL_messages_reportReaction.f27109id = profileActivity.f41725a5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ei.u5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f41733b5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1)));
        }
        profileActivity.f41725a5 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.fc.a0(profileActivity).E(profileActivity.A0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f41751e1;
        if (j10 == 0) {
            long j11 = profileActivity.f41759f1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f41780i1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            org.telegram.messenger.hp.s1(profileActivity.currentAccount).W(profileActivity.f41733b5, j12);
        } else {
            org.telegram.messenger.hp.s1(profileActivity.currentAccount).h0(profileActivity.f41733b5, profileActivity.f41725a5, j12);
        }
        profileActivity.f41725a5 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(profileActivity.getParentActivity(), profileActivity.A0);
        ibVar.d(2131623981, new String[0]);
        ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131746412, null));
        org.telegram.ui.Components.fc.a0(profileActivity).b(ibVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z10) {
        int i3;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.U1 = floatValue;
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
        profileActivity.T1 = (int) ((1.0f - floatValue) * f14);
        profileActivity.f41727b.setTranslationY(floatValue * f10);
        profileActivity.P.setTranslationY(f10 * profileActivity.U1);
        profileActivity.f41719a.setTranslationY((1.0f - profileActivity.U1) * f14);
        profileActivity.f41719a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f41719a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f41719a.setAlpha(profileActivity.U1);
        boolean z11 = true;
        profileActivity.y4(true);
        profileActivity.f41719a.setAlpha(f11);
        profileActivity.f41727b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.f41727b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.f41727b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f11);
        profileActivity.Y.setAlpha(f11);
        profileActivity.f41758f0.setAlpha(f11);
        tu0 tu0Var = profileActivity.f41866v0;
        if (tu0Var != null) {
            tu0Var.setAlpha(f11);
        }
        profileActivity.f41757f.setAlpha(f11);
        su0 su0Var = profileActivity.f41838r;
        if (!profileActivity.S5) {
            f13 = f11;
        }
        su0Var.setAlpha(f13);
        profileActivity.U0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
            if (f5Var.G.getWidth() != 0 && !f5Var.f28445e.isFocused()) {
                f5Var.f28445e.requestFocus();
                org.telegram.messenger.g0.K3(f5Var.f28445e);
            }
        }
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        int i10 = 8;
        if (profileActivity.U1 < 0.5f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        searchContainer.setVisibility(i3);
        if (profileActivity.U1 > 0.5f) {
            i10 = 0;
        }
        org.telegram.ui.ActionBar.f5 f5Var2 = profileActivity.T0;
        if (f5Var2 != null) {
            f5Var2.setVisibility(i10);
            profileActivity.T0.setAlpha(f11);
        }
        profileActivity.U0.setVisibility(i10);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 >= 0.5f) {
            z11 = false;
        }
        kVar.y(z11);
        org.telegram.ui.ActionBar.f5 f5Var3 = profileActivity.T0;
        if (f5Var3 != null) {
            f5Var3.setAlpha(f11);
        }
        profileActivity.U0.setAlpha(f11);
        profileActivity.f41743d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void s1(ProfileActivity profileActivity) {
        if (profileActivity.simpleActionBar != null) {
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null && kVar.getVisibility() != 4) {
                profileActivity.actionBar.setVisibility(4);
            }
            float actionModeFactor = profileActivity.simpleActionBar.getActionModeFactor();
            ai.c0 c0Var = profileActivity.Z;
            if (c0Var != null) {
                float f10 = 1.0f - actionModeFactor;
                if (c0Var.getAlpha() != f10) {
                    profileActivity.Z.setAlpha(f10);
                }
            }
        }
    }

    public static void y1(ProfileActivity profileActivity, boolean z10) {
        int i3;
        int i10;
        float f10;
        int i11 = 0;
        if (z10) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        profileActivity.f41719a.setVisibility(i3);
        org.telegram.ui.Components.tj0 tj0Var = profileActivity.f41727b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        tj0Var.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i11 = 8;
        }
        searchContainer.setVisibility(i11);
        ci.z0 z0Var = profileActivity.f41874w0;
        if (z0Var != null) {
            z0Var.setActive(!z10);
        }
        profileActivity.actionBar.y(z10);
        profileActivity.Y.setVisibility(i3);
        tu0 tu0Var = profileActivity.f41866v0;
        if (tu0Var != null) {
            tu0Var.setVisibility(i3);
        }
        profileActivity.f41757f.setVisibility(i3);
        profileActivity.f41838r.setVisibility(i3);
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
        if (f5Var != null) {
            f5Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i3);
        }
        profileActivity.U0.setVisibility(i3);
        profileActivity.f41758f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        tu0 tu0Var2 = profileActivity.f41866v0;
        if (tu0Var2 != null) {
            tu0Var2.setAlpha(1.0f);
        }
        ci.z0 z0Var2 = profileActivity.f41874w0;
        if (z0Var2 != null) {
            z0Var2.setAlpha(1.0f);
        }
        profileActivity.f41757f.setAlpha(1.0f);
        su0 su0Var = profileActivity.f41838r;
        if (profileActivity.S5) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        su0Var.setAlpha(f10);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f41719a.setAlpha(1.0f);
        profileActivity.f41727b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f41727b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public final void A5() {
        if (this.simpleActionBar != null && this.H5 != null) {
            org.telegram.ui.Components.kf0 kf0Var = this.J5;
            if (kf0Var != null) {
                float l42 = l4();
                if (kf0Var.f35394l != l42) {
                    kf0Var.f35394l = l42;
                    kf0Var.a();
                }
            }
            int f10 = i0.a.f(l4(), this.D5, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.A0));
            if (this.G5 != f10) {
                this.G5 = f10;
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                y4Var.m0 = true;
                y4Var.f28861g0 = f10;
                y4Var.updateColors();
            }
            int w02 = this.I5.w0();
            if (this.L5 != w02) {
                this.L5 = w02;
                org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
                gh.g gVar = y4Var2.I;
                if (gVar != null) {
                    gVar.updateColors();
                    y4Var2.J.updateColors();
                    y4Var2.K.updateColors();
                }
                y4Var2.invalidate();
                org.telegram.ui.ActionBar.i5 i5Var = y4Var2.R;
                if (i5Var != null) {
                    i5Var.invalidate();
                }
            }
        }
    }

    @Override
    public final si.f B() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z10) {
        boolean z11;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41751e1));
        if (a22 != null) {
            if (this.f41841r2 && !org.telegram.messenger.hp.F2(a22)) {
                if (this.k1 && !z10) {
                    getMessagesController().f5(new g90(this, 6), this.f41751e1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.E2;
                if (this.D2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.t4.r(this, false, chat, a22, z11, true, false, true, new nt0(this, a22));
            } else if (this.k1) {
                getMessagesController().f5(null, this.f41751e1);
                if (org.telegram.ui.Components.fc.a(this)) {
                    org.telegram.ui.Components.fc.d(this, false).j();
                }
            } else if (this.f41799l1) {
                org.telegram.ui.Components.t4.i0(this, this.f41751e1, a22, null, this.D2, false, null, new ma(this, 3), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.A0);
                String M0 = org.telegram.messenger.bd.M0(2131753692, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753693, null), new jt0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, this.A0);
                }
            }
        }
    }

    public final void B5(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.T0 != null) {
            boolean z16 = this.S5;
            boolean z17 = !z16;
            boolean z18 = this.f41826p2;
            org.telegram.ui.ActionBar.f5 f5Var = this.Q0;
            boolean z19 = false;
            if (!z16 && !z18 && this.M0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d5(f5Var, z11, z10);
            org.telegram.ui.ActionBar.f5 f5Var2 = this.R0;
            if (!z16 && !z18 && this.N0) {
                z12 = true;
            } else {
                z12 = false;
            }
            d5(f5Var2, z12, z10);
            org.telegram.ui.ActionBar.f5 f5Var3 = this.S0;
            if (!z16 && !z18 && this.O0) {
                z13 = true;
            } else {
                z13 = false;
            }
            d5(f5Var3, z13, z10);
            mv0 mv0Var = this.O;
            if (mv0Var != null && mv0Var.J != null && mv0Var.v0(mv0Var.getClosestTab())) {
                z14 = true;
            } else {
                z14 = false;
            }
            org.telegram.ui.ActionBar.f5 f5Var4 = this.T0;
            if (z10 && !z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            d5(f5Var4, z17, z15);
            mv0 mv0Var2 = this.O;
            if (mv0Var2 != null) {
                boolean z20 = this.S5;
                if (z10 && !z14) {
                    z19 = true;
                }
                if (mv0Var2.f40119q2 != z20) {
                    mv0Var2.f40119q2 = z20;
                    mv0Var2.R(z10, z19);
                }
            }
        }
    }

    public final void C4(boolean z10) {
        boolean z11 = false;
        if (this.f41751e1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41751e1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.f41868v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.n1.m(a22, z10, z11, getParentActivity(), this.f41868v2, getAccountInstance());
            }
        } else if (this.f41759f1 != 0) {
            if (getMessagesController().g1(this.f41759f1, false, null) == null) {
                TLRPC.Chat chat = this.E2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.o60.J0(getParentActivity(), -chat.f27001id, accountInstance, new org.telegram.ui.Components.hr(chat, this, accountInstance, 6));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.n1.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void C5() {
        TLRPC.User a22;
        boolean z10;
        int i3;
        int i10;
        if (this.f41847s1 && this.X0 != null && this.W0 != null && (a22 = getMessagesController().a2(Long.valueOf(this.f41751e1))) != null) {
            int i11 = 0;
            if (org.telegram.messenger.l10.n(a22) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.y0 y0Var = this.X0;
            if (z10) {
                i3 = 2131231909;
            } else {
                i3 = 2131231910;
            }
            y0Var.setIcon(i3);
            org.telegram.ui.ActionBar.y0 y0Var2 = this.X0;
            if (z10) {
                i10 = 2131746628;
            } else {
                i10 = 2131746627;
            }
            y0Var2.setText(org.telegram.messenger.bd.M0(i10, null));
            org.telegram.ui.ActionBar.y0 y0Var3 = this.W0;
            if (org.telegram.messenger.l10.n(a22) == null) {
                i11 = 8;
            }
            y0Var3.setVisibility(i11);
        }
    }

    public final void D4() {
        TLRPC.UserFull userFull = this.f41868v2;
        if (userFull != null && org.telegram.messenger.l10.b(userFull)) {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.fc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        if (this.E2 != null) {
            org.telegram.ui.Components.v20.h.a();
        }
        showDialog(new ai.b3(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void D5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                G5(false);
            }
            J5();
        } else if (!z11 && this.f41719a.isInLayout()) {
            hu0 hu0Var = this.f41719a;
            if (!hu0Var.H) {
                return;
            }
            hu0Var.post(new org.telegram.ui.Components.up0(11, this, z10));
        } else {
            ov0 ov0Var = new ov0(this);
            ov0Var.f48357b = this.N2;
            ov0Var.f(ov0Var.f48358c);
            ov0Var.f48359e.clear();
            ov0Var.f48360f.clear();
            ov0Var.f48359e.addAll(this.R4);
            ov0Var.f48360f.addAll(this.S4);
            ov0Var.f48361g = this.f41863u4;
            ov0Var.h = this.f41870v4;
            if (z10) {
                G5(false);
            }
            T4();
            J5();
            ov0Var.f(ov0Var.d);
            try {
                u4.o.c(ov0Var, true).c(this.d);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.d.f();
            }
            int i3 = this.f41804l6;
            if (i3 >= 0) {
                this.f41735c.h1(i3, this.f41809m6 - this.f41719a.getPaddingTop());
            }
            org.telegram.messenger.g0.b4(this.f41719a);
        }
    }

    public final void E4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.E2.f27001id, getUserConfig().f(), 0, null, this, true, new a60(this, z10, zArr, 8), new ga.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6), null);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.I4, new Object[0]);
    }

    public final void E5() {
        int i3;
        if (this.f41736c0 != null && this.f41838r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            int i10 = currentActionBarHeight + i3;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.Y != null) {
                this.f41736c0.setAlpha(this.S1);
                this.f41736c0.f(org.telegram.messenger.g0.L(74.0f) + this.f41719a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
                return;
            }
            if (z10) {
                this.f41736c0.setAlpha(this.S1);
            }
            float f10 = i10;
            float L = this.Q1 + f10 + org.telegram.messenger.g0.L(74.0f);
            float min = Math.min(e4(), L - f10);
            this.f41736c0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
        }
    }

    public final void F4(View view, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        long j10;
        long j11 = this.f41780i1;
        if (j11 == 0) {
            j11 = this.f41751e1;
            if (j11 == 0) {
                j11 = -this.f41759f1;
            }
        }
        long j12 = j11;
        boolean r22 = getMessagesController().r2(j12, this.f41766g1, null);
        if (z10 && (this.f41832q1 || r22)) {
            boolean z11 = !r22;
            getNotificationsController().G(j12, this.f41766g1, z11);
            org.telegram.ui.Components.fc.A(this, z11, null).j();
            v5();
            this.f41720a0.setNotifications(r22);
        } else if ((!z10 && org.telegram.messenger.bd.f21784a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.bd.f21784a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z12 = h5Var.f29340e.h;
            boolean z13 = !z12;
            boolean D = getNotificationsController().D(j12, null, false, false);
            String v = org.telegram.messenger.us.v(j12, this.f41766g1, false);
            if (!z12) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).f22989d7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f41766g1 == 0) {
                    getMessagesStorage().E1(j12, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j12);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.s1(this.currentAccount).f22989d7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j10 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j10 = 1;
                }
                getNotificationsController().N(j12);
                if (this.f41766g1 == 0) {
                    getMessagesStorage().E1(j12, j10);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().R.f(j12);
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
            getNotificationsController().c0(j12, this.f41766g1, true);
            h5Var.setChecked(z13);
            org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.f41719a.L(this.N3, false);
            F5(true);
        } else {
            org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(getParentActivity(), this.currentAccount, null, true, new b8.ig(this, j12, 6), this.A0);
            xnVar.e(j12, this.f41766g1, this.f41783i5);
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z10) {
                f13 += this.f41720a0.getHeight() - org.telegram.messenger.g0.L(12.0f);
            }
            xnVar.d(this, view, f12, f13, z10);
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
            if (this.f41751e1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41751e1));
                if (a22 != null) {
                    if (this.F2 != null && (userFull = this.f41868v2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().V2 + "/%s", this.f41868v2.about, org.telegram.messenger.l10.n(a22));
                    } else {
                        str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.l10.n(a22));
                    }
                } else {
                    return;
                }
            } else if (this.f41759f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41759f1));
                if (M0 != null) {
                    TLRPC.ChatFull chatFull = this.f41861u2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().V2 + "/%s", this.f41861u2.about, org.telegram.messenger.t3.K(M0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.t3.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131752982, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void G5(boolean z10) {
        int i3;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i10 = 0;
        this.B2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.C2.clear();
        TLRPC.ChatFull chatFull = this.f41861u2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.B2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.f41861u2.participants.participants.size()) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41861u2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f27150id == getUserConfig().e()) && a22.status.expires > 10000)) {
                this.B2++;
            }
            this.C2.add(Integer.valueOf(i10));
            if (a22 != null) {
                if (a22.bot) {
                    i3 = -110;
                } else if (a22.self) {
                    i3 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = a22.status;
                    if (userStatus2 != null) {
                        i3 = userStatus2.expires;
                    }
                }
                i10 = com.google.android.recaptcha.internal.a.f(i3, i10, 1, arrayList);
            }
            i3 = Integer.MIN_VALUE;
            i10 = com.google.android.recaptcha.internal.a.f(i3, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$EL.reversed(Comparator$CC.comparingInt(new oe(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10 && this.d != null && this.f41863u4 > 0) {
            org.telegram.messenger.g0.b4(this.f41719a);
        }
        if (this.O != null && this.K4 != -1) {
            if ((this.C2.size() > 5 || this.T4 == 2) && this.T4 != 1) {
                this.O.k1(this.C2, this.f41861u2);
            }
        }
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f41772h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.f41817o0.O(this.K2, f10);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        if (this.O != null && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
            int[] iArr = org.telegram.ui.Components.ws0.f40063t2;
            int z10 = org.telegram.messenger.k5.z(6.666f, pi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
            int c2 = pi.a.c(i3) + currentActionBarHeight + z10;
            this.V5 = c2;
            this.O.l1(z10, c2, pi.a.c(this.J6), this.J6 + this.H6);
            this.W5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
            y5();
            P3();
        }
    }

    public final void H4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f41759f1);
            bundle.putLong("user_id", this.f41751e1);
            presentFragment(new bi.j0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.U2) {
            if (this.f41751e1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.l10.b(this.f41868v2)) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(this.f41751e1)), org.telegram.ui.Components.fc.a0(this), 2131624011, 36);
            } else {
                showDialog(new ai.b3(getParentActivity(), this.currentAccount, this.f41751e1, null, null));
            }
        }
    }

    public final void H5() {
        CharSequence charSequence;
        su0 su0Var = this.f41838r;
        if (su0Var != null) {
            if ((!this.S5 || (charSequence = this.X5) == null) && (!this.f41865u6 || (charSequence = this.f41858t6) == null)) {
                charSequence = this.s6;
            }
            if (su0Var.o(charSequence, !this.G1) && this.fragmentView != null) {
                y4(false);
            }
        }
    }

    @Override
    public final void I() {
        U4(false);
    }

    public final int I3(int i3, Boolean bool) {
        int i10;
        if (this.f41778h6 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.A0);
            int f10 = i0.a.f(0.5f, this.f41778h6.m(org.telegram.ui.ActionBar.k6.I.q()), this.f41778h6.n(org.telegram.ui.ActionBar.k6.I.q()));
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
            return org.telegram.ui.ActionBar.k6.D(q10, w02, f10, i3, i10);
        }
        return i3;
    }

    public final void I4() {
        boolean z10;
        org.telegram.ui.Components.ch0 ch0Var;
        if (this.f41751e1 != 0) {
            if (this.f41839r0 != null) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(this.currentAccount).e()));
                if (a22 == null) {
                    a22 = org.telegram.messenger.h10.i(this.currentAccount).f();
                }
                if (a22 != null) {
                    org.telegram.ui.Components.f30 f30Var = this.f41839r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f30Var.n(z10, new g90(this, 27), new s5(this, 13), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
                    if (gf0Var != null) {
                        org.telegram.ui.Components.df0 i3 = org.telegram.ui.Components.gf0.i(14, gf0Var.f34074a);
                        if (i3 != null && (ch0Var = i3.f33072k) != null) {
                            ch0Var.start();
                        }
                    } else {
                        this.f41845s.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = this.M2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
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
        if (kVar != null && this.f41757f != null && this.f41743d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.f41824p0 != null) {
            Float valueOf = Float.valueOf(this.R5);
            wu0 wu0Var = this.T5;
            wu0Var.getClass();
            wu0Var.a(kVar, valueOf);
            if (this.R5 <= 0.0f && this.f41793k2 > 0.0f) {
                kk kkVar = this.f41757f;
                int i3 = -1;
                if (this.f41778h6 != null) {
                    f10 = -1;
                } else {
                    f10 = i0.a.f(this.f41793k2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000ji, this.A0), -1);
                }
                kkVar.setTextColor(f10);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f41778h6 == null) {
                    i3 = i0.a.f(this.f41793k2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.A0), -1);
                }
                kVar2.D(i3, false);
            }
        }
    }

    public final void J4() {
        Bundle k10 = a1.g.k("addToGroup", true);
        k10.putLong("chatId", this.E2.f27001id);
        r40 r40Var = new r40(k10);
        TLRPC.ChatFull chatFull = this.f41861u2;
        r40Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i3 = 0; i3 < this.f41861u2.participants.participants.size(); i3++) {
                hVar.k(null, this.f41861u2.participants.participants.get(i3).user_id);
            }
            r40Var.K = hVar;
        }
        r40Var.f49062y = new jt0(this, 0);
        presentFragment(r40Var);
    }

    public final void J5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.J5():void");
    }

    public final void K3() {
        int i3;
        int i10;
        if (this.f41726a6 != null) {
            ValueAnimator valueAnimator = this.f41787j2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41787j2.cancel();
            }
            float l10 = Utilities.l(this.Q1 / this.F1);
            if (l10 > 0.0f) {
                float f10 = (l10 - 0.5f) / 0.5f;
                int i11 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i3 = org.telegram.messenger.g0.f22602m;
                } else {
                    i3 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i3) - org.telegram.messenger.g0.L(21.0f));
                this.f41730b2 = org.telegram.messenger.g0.T1(0.42f, this.f41726a6[0], l10);
                this.Z1 = org.telegram.messenger.g0.T1(this.f41764f6, this.f41726a6[1], l10);
                this.f41722a2 = org.telegram.messenger.g0.T1(translationY, this.f41726a6[2], l10);
                this.c2 = org.telegram.messenger.g0.T1(this.f41726a6[11], 0.0f, l10);
                this.Y.setScaleX(this.f41730b2);
                this.Y.setScaleY(this.f41730b2);
                this.Y.setTranslationX(this.Z1);
                this.Y.setTranslationY(this.f41722a2);
                org.telegram.ui.Components.ku0 ku0Var = this.T;
                if (ku0Var != null) {
                    ku0Var.setAlpha(l10);
                }
                this.f41758f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                tu0 tu0Var = this.f41866v0;
                if (tu0Var != null) {
                    tu0Var.invalidate();
                }
                ci.z0 z0Var = this.f41874w0;
                if (z0Var != null) {
                    z0Var.f6430e = org.telegram.messenger.g0.T1(0.0f, this.f41726a6[4], f10);
                    this.f41874w0.f6431f = org.telegram.messenger.g0.T1(0.0f, this.f41726a6[5], l10);
                    ci.z0 z0Var2 = this.f41874w0;
                    z0Var2.h = true;
                    z0Var2.invalidate();
                }
                mw0 mw0Var = this.f41903z6;
                if (mw0Var != null) {
                    mw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.f41726a6[6], l10));
                }
                float L = (((this.f41730b2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                this.f41779i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                this.f41779i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                this.f41785j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41785j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                this.f41792k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41792k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                this.f41798l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f41798l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                float T1 = org.telegram.messenger.g0.T1(1.0f, this.f41726a6[7], l10);
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f22602m;
                } else {
                    i10 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (org.telegram.messenger.g0.f22607p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
                float N = org.telegram.messenger.g0.N(22.7f) + floor;
                this.f41752e2 = org.telegram.messenger.g0.T1(floor, this.f41726a6[8], l10);
                this.f41767g2 = org.telegram.messenger.g0.T1(N, this.f41726a6[9], l10);
                float T12 = org.telegram.messenger.g0.T1((this.f41764f6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.f41726a6[12], l10);
                float T13 = org.telegram.messenger.g0.T1((this.f41764f6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.f41726a6[13], l10);
                this.f41757f.setTranslationX(T12);
                this.f41757f.setTranslationY(this.f41752e2);
                this.f41838r.setTranslationX(this.f41829p5 + T13);
                this.f41838r.setTranslationY(this.f41767g2);
                this.f41744d2 = T12;
                this.f41760f2 = T13;
                this.f41757f.setScaleX(T1);
                this.f41757f.setScaleY(T1);
                q5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.g0.f22602m;
                }
                w5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11);
                z4((int) this.f41726a6[10], l10, true);
                org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
                if (gf0Var != null) {
                    gf0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.f41726a6[3], f10));
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
        if (this.f41792k0 != null && (imageView = this.f41798l0) != null) {
            if (this.L1 && (chat = this.E2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f41798l0.setVisibility(0);
                this.f41792k0.setTag(1);
                this.f41792k0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f41798l0.setVisibility(8);
            this.f41792k0.setTag(null);
            this.f41792k0.setVisibility(8);
        }
    }

    public final float L3() {
        return Utilities.l((this.Q1 - e4()) / k4());
    }

    public final void L4() {
        TLRPC.User a22;
        if (this.f41751e1 != 0 && !c4() && (a22 = getMessagesController().a2(Long.valueOf(this.f41751e1))) != null && !(a22 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f41751e1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.g0.Q1() && z10) {
                    org.telegram.messenger.hs notificationCenter = getNotificationCenter();
                    int i3 = org.telegram.messenger.hs.f23305t;
                    notificationCenter.n(this, i3);
                    getNotificationCenter().k(i3, new Object[0]);
                }
                int i10 = getArguments().getInt("nearby_distance", -1);
                if (i10 >= 0) {
                    bundle.putInt("nearby_distance", i10);
                }
                wm wmVar = new wm(bundle);
                org.telegram.messenger.li mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f24066z0;
                mediaDataController.n1();
                wmVar.V9 = document;
                wmVar.W9 = false;
                presentFragment(wmVar, z10);
                if (org.telegram.messenger.g0.Q1() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public final void L5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        boolean z11;
        if ((this.f41866v0 != null || this.f41874w0 != null) && (kVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (kVar.getOccupyStatusBar()) {
                f10 = org.telegram.messenger.g0.f22602m;
            } else {
                f10 = 0.0f;
            }
            int L = org.telegram.messenger.g0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            tu0 tu0Var = this.f41866v0;
            boolean z12 = false;
            if (tu0Var != null) {
                float z13 = com.google.android.recaptcha.internal.a.z(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(right - tu0Var.f42020g0) <= 0.1f && Math.abs(menuPillLeft - tu0Var.f42021h0) <= 0.1f && Math.abs(z13 - tu0Var.f42022i0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tu0Var.f42020g0 = right;
                tu0Var.f42021h0 = menuPillLeft;
                if (z10) {
                    tu0Var.f42027n0.e(true, menuPillLeft);
                }
                tu0Var.f42022i0 = z13;
                if (z11) {
                    tu0Var.invalidate();
                }
            }
            ci.z0 z0Var = this.f41874w0;
            if (z0Var != null) {
                float z14 = com.google.android.recaptcha.internal.a.z(this.actionBar.getHeight(), f10, 2.0f, f10);
                int k42 = k4();
                if (Math.abs(right - z0Var.f6433r) > 0.1f || Math.abs(menuPillLeft - z0Var.f6434s) > 0.1f || Math.abs(z14 - z0Var.f6435w) > 0.1f) {
                    z12 = true;
                }
                z0Var.f6433r = right;
                z0Var.f6434s = menuPillLeft;
                if (z10) {
                    z0Var.E.e(true, menuPillLeft);
                }
                z0Var.f6435w = z14;
                z0Var.f6437y = k42 + z14;
                if (z12) {
                    z0Var.invalidate();
                }
            }
        }
    }

    public final void M3() {
        int i3;
        int i10 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        this.f41722a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3) - org.telegram.messenger.g0.L(21.0f));
        this.f41730b2 = 1.38f;
        float f10 = 0.0f;
        this.c2 = 0.0f;
        d4();
        R4();
        z4(0, 1.0f, true);
        this.f41744d2 = (this.f41719a.getMeasuredWidth() / 2.0f) - (((this.f41757f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f41757f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f41719a.getMeasuredWidth() / 2.0f;
        int i11 = ((FrameLayout.LayoutParams) this.f41838r.getLayoutParams()).leftMargin;
        if (!this.f41836q5) {
            i10 = this.f41838r.getPaddingLeft();
        }
        this.f41760f2 = measuredWidth - ((this.f41838r.getExactWidth() * 0.5f) + (i11 + i10));
        if (!this.f41836q5) {
            f10 = this.f41838r.getPaddingLeft();
        }
        this.f41880w6 = f10;
        if (this.J1 != 2) {
            this.f41866v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f41758f0.setAlpha(1.0f);
    }

    public final void M4() {
        TLRPC.ChatFull chatFull = this.f41861u2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f41861u2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new wm(bundle));
            }
        }
    }

    public final void M5() {
        try {
            org.telegram.ui.Components.voip.r0 r0Var = this.U;
            if (r0Var != null && (r0Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.A0), 100));
            }
            float f10 = this.R5;
            Drawable drawable = this.E;
            int[] iArr = this.S6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0));
                int i3 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i3) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.O6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V6, this.A0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.P6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.A0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.Q6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.wp wpVar = this.R6;
            if (wpVar != null) {
                wpVar.f40049y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, this.A0);
                if (this.f41719a != null) {
                    for (int i13 = 0; i13 < this.f41719a.getChildCount(); i13++) {
                        View childAt = this.f41719a.getChildAt(i13);
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
    public final boolean N(uw uwVar) {
        return false;
    }

    public final void N4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f41868v2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                ei.p8 p8Var = new ei.p8(3, 1);
                p8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().z1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f41868v2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                p8Var.Q0 = false;
                p8Var.G0(new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message, false, false));
                presentFragment(p8Var);
                return;
            }
            boolean z11 = org.telegram.messenger.r2.f25040a;
            org.telegram.messenger.t0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f41868v2.business_location.address, new Object[0]))));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void N5() {
        boolean z10;
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        if (this.D2 == null && (((userFull = this.f41868v2) != null && userFull.ttl_period > 0) || (this.f41861u2 != null && org.telegram.messenger.t3.y(13, this.E2) && this.f41861u2.ttl_period > 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.Z3(this.Y0, z10, 0.8f, true, this.f41808m5);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.f41772h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    public final void O3() {
        u4.d1 d1Var;
        View view;
        int top;
        int i3;
        int i10;
        float a10;
        boolean z10;
        if (this.f41719a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f41719a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f41719a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    d1Var = null;
                    if (i11 < this.f41719a.getChildCount()) {
                        if (RecyclerView.R(this.f41719a.getChildAt(i11)) == 0) {
                            view = this.f41719a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    hu0 hu0Var = this.f41719a;
                    View F = hu0Var.F(view);
                    if (F != null) {
                        d1Var = hu0Var.T(F);
                    }
                    d1Var = (org.telegram.ui.Components.bj0) d1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (d1Var != null) {
                    i3 = d1Var.b();
                } else {
                    i3 = -1;
                }
                if (top >= 0 && i3 == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                float f10 = 1.0f;
                if (view == null) {
                    a10 = 1.0f;
                } else {
                    a10 = b8.be.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
                }
                if (this.M5 != a10) {
                    this.M5 = a10;
                    z5();
                }
                if (this.f41839r0 == null && this.actionBar.f27728o0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.K4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.f41719a.K(i12);
                    if (bj0Var != null && bj0Var.f55540a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.S5 != z10) {
                    this.S5 = z10;
                    P3();
                    AnimatorSet animatorSet = this.P5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.Q5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    B5(true);
                    H5();
                    L5(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar, this.T5, f10));
                    this.O.L0.setOpen(z10);
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f41796k5, 0.0f));
                    }
                    if (this.f41866v0 != null || this.f41874w0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new st0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    R3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.P5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.P5.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    this.P5.addListener(new uu0(this, 1));
                    this.P5.setDuration(150L);
                    this.P5.start();
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, Boolean.TRUE);
                }
                float f11 = i10;
                if (this.Q1 != f11 && !this.H1) {
                    this.Q1 = f11;
                    this.f41743d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > e4()) {
                            z11 = true;
                        }
                        this.M1 = z11;
                    }
                    y4(true);
                }
            }
        }
    }

    public final void O4(int i3, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        zu0 zu0Var = new zu0(this, user.f27150id, this.f41759f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i3, zArr, user);
        zu0Var.Y0 = new av0(this, i3, chatParticipant, z10, zArr);
        presentFragment(zu0Var);
    }

    public final void O5(boolean z10) {
        boolean z11;
        boolean z12;
        int i3;
        int i10;
        boolean z13;
        float f10;
        TLRPC.ChatFull chatFull;
        float f11 = 0.2f;
        int i11 = (L3() > 0.2f ? 1 : (L3() == 0.2f ? 0 : -1));
        int i12 = 0;
        if (i11 > 0 && !this.W1 && (this.f41839r0 == null || this.O2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Y5 = z11;
        R3();
        org.telegram.ui.Components.fh0 fh0Var = this.f41845s;
        if (fh0Var != null && fh0Var.getVisibility() != 8) {
            org.telegram.ui.Components.fh0 fh0Var2 = this.f41845s;
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f22602m;
            } else {
                i10 = 0;
            }
            fh0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) + this.Q1) + this.T1) - org.telegram.messenger.g0.L(29.5f));
            if (i11 > 0 && !this.W1 && !this.f41847s1 && (this.f41839r0 == null || this.O2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f41759f1 != 0) {
                if (org.telegram.messenger.t3.T(this.E2) && !this.E2.megagroup && (chatFull = this.f41861u2) != null && chatFull.linked_chat_id != 0 && (this.D3 != -1 || this.E3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.G1) {
                if (this.f41845s.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.f41845s.setTag(null);
                    } else {
                        this.f41845s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f41873w;
                    if (animatorSet != null) {
                        this.f41873w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f41873w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f41873w.playTogether(ObjectAnimator.ofFloat(this.f41845s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f41845s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f41845s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f41873w.playTogether(ObjectAnimator.ofFloat(this.f41845s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f41845s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f41845s, View.ALPHA, 0.0f));
                        }
                        this.f41873w.setDuration(150L);
                        this.f41873w.addListener(new uu0(this, 3));
                        this.f41873w.start();
                    } else {
                        org.telegram.ui.Components.fh0 fh0Var3 = this.f41845s;
                        if (z12) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        fh0Var3.setScaleX(f10);
                        org.telegram.ui.Components.fh0 fh0Var4 = this.f41845s;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        fh0Var4.setScaleY(f11);
                        org.telegram.ui.Components.fh0 fh0Var5 = this.f41845s;
                        if (z12) {
                            f12 = 1.0f;
                        }
                        fh0Var5.setAlpha(f12);
                    }
                }
            }
        } else {
            z12 = false;
        }
        tu0 tu0Var = this.f41866v0;
        if (tu0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            tu0Var.f42023j0 = measuredWidth;
            tu0Var.f42025l0 = z12;
            tu0Var.f42024k0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i3;
            tu0Var.invalidate();
        }
        ci.z0 z0Var = this.f41874w0;
        if (z0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = org.telegram.messenger.g0.f22602m;
            }
            z0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.Q1 + this.T1);
        }
    }

    public final void P3() {
        int i3;
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            if (!this.S5 && this.R5 <= 0.0f) {
                i3 = 0;
            } else {
                i3 = Integer.MAX_VALUE;
            }
            mv0Var.setPagesVisibleOverscanTop(i3);
        }
    }

    public final void P4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (d2Var instanceof wm) {
                    finishFragment();
                    ((wm) d2Var).f51237a0.Z0(null, str, false, false);
                }
            }
        } else {
            uw uwVar = new uw(null);
            uwVar.f50273o2 = str;
            presentFragment(uwVar);
        }
    }

    public final void P5() {
        org.telegram.ui.Components.vp0 vp0Var;
        org.telegram.ui.Components.tq0 tq0Var;
        org.telegram.ui.Components.s70 s70Var;
        int w02;
        int w03;
        int w04;
        int i3;
        int w05;
        int w06;
        int w07;
        this.f41784i6.clear();
        ow0 ow0Var = this.f41743d1;
        if (ow0Var != null) {
            ow0Var.a(this.f41778h6, true);
        }
        su0 su0Var = this.f41838r;
        if (su0Var != null) {
            if (su0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.k6.w0(((Integer) this.f41838r.getTag()).intValue(), this.A0);
            } else {
                w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0);
            }
            this.f41838r.setTextColor(i0.a.f(this.f41793k2, I3(w07, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        mw0 mw0Var = this.f41903z6;
        float f10 = -0.1f;
        if (mw0Var != null) {
            mw0Var.a(i0.a.f(this.f41793k2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.f41737c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.f41778h6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.A0);
            }
            kVar.D(i0.a.f(this.R5, w05, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28275y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.wo woVar = this.f41778h6;
            if (woVar != null) {
                w06 = 1090519039;
            } else if (woVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27919f8, this.A0);
            }
            kVar2.C(i0.a.f(this.R5, w06, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28292z8, this.A0)), false);
        }
        if (this.f41889y != null) {
            org.telegram.messenger.wo woVar2 = this.f41778h6;
            if (woVar2 != null) {
                int g7 = woVar2.g();
                if (this.f41778h6.o(org.telegram.ui.ActionBar.k6.I.q())) {
                    i3 = this.f41778h6.k();
                } else {
                    i3 = this.f41778h6.i();
                }
                int f11 = i0.a.f(0.4f, g7, i3);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.k6.b(0.1f, f10, f11);
            } else {
                w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.A0);
            }
            this.f41889y.setColorFilter(org.telegram.messenger.g0.S0(this.R5, 1.0f, w04, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            if (this.f41778h6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28093oi, this.A0);
            }
            this.I.setColorFilter(org.telegram.messenger.g0.S0(this.R5, 1.0f, w03, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        kk kkVar = this.f41757f;
        if (kkVar != null) {
            if (this.f41778h6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000ji, this.A0);
            }
            kkVar.setTextColor(i0.a.f(this.f41793k2, i0.a.f(this.R5, w02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0)), -1));
        }
        o4.m0 m0Var = this.f41721a1;
        if (m0Var != null && (s70Var = (org.telegram.ui.Components.s70) m0Var.f20756e) != null) {
            s70Var.invalidate();
        }
        Drawable drawable = this.f41881x;
        if (drawable != null) {
            if (this.f41778h6 == null) {
                i10 = i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27885dd, this.A0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.f41736c0;
        if (cg0Var != null) {
            cg0Var.setColor(this.f41778h6);
        }
        org.telegram.messenger.g0.d0(this.f41719a, new vt0(this, 3));
        mv0 mv0Var = this.O;
        if (mv0Var != null && (tq0Var = mv0Var.L0) != null) {
            tq0Var.updateColors();
        }
        mv0 mv0Var2 = this.O;
        if (mv0Var2 != null && (vp0Var = mv0Var2.f40072b0) != null) {
            vp0Var.m();
        }
        Q5();
        s5();
        tu0 tu0Var = this.f41866v0;
        if (tu0Var != null) {
            tu0Var.f(true, true);
        }
        ci.z0 z0Var = this.f41874w0;
        if (z0Var != null) {
            z0Var.a();
        }
    }

    @Override
    public final void Q() {
        org.telegram.ui.Components.os0 os0Var;
        mv0 mv0Var = this.O;
        if (mv0Var != null && (os0Var = this.R) != null) {
            mv0Var.setNewMediaCounts(os0Var.f36936c);
        }
        if (this.d != null) {
            D5(false, false);
        }
        V();
        if (this.f41868v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        float alpha;
        boolean z10;
        int i3 = this.J1;
        float f10 = 0.0f;
        boolean z11 = true;
        if (i3 == 1 && (!this.f41808m5 || this.G1)) {
            this.f41844r6 = 0.0f;
        } else if (i3 == 2 && (!this.f41808m5 || this.G1)) {
            su0 su0Var = this.f41838r;
            if (su0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = su0Var.getAlpha();
            }
            this.f41844r6 = alpha;
        } else if (this.f41751e1 == org.telegram.messenger.h10.i(this.currentAccount).f22848n) {
            this.f41844r6 = (1.0f - this.f41822o5) * this.f41793k2;
        } else {
            this.f41844r6 = this.f41793k2 * this.f41822o5;
        }
        if (this.f41751e1 == org.telegram.messenger.h10.i(this.currentAccount).f22848n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f41836q5) {
            this.f41829p5 = org.telegram.messenger.g0.L(28.0f) * this.f41844r6;
            su0 su0Var2 = this.f41838r;
            if (su0Var2 != null) {
                su0Var2.setTranslationX(m4(this.f41872v6, this.f41888x6));
                this.Z.invalidate();
            }
        }
        if (z10) {
            if (this.f41836q5) {
                f10 = this.f41793k2;
            }
        } else if (this.r5) {
            f10 = this.f41844r6;
        }
        mw0 mw0Var = this.f41903z6;
        if (mw0Var != null) {
            mw0Var.f47805e = 1.0f - f10;
            mw0Var.invalidateSelf();
        }
        if (f10 <= 0.5f) {
            z11 = false;
        }
        this.f41865u6 = z11;
        H5();
    }

    public final boolean Q4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.Q4(float, float, int, android.view.View):boolean");
    }

    public final void Q5() {
        if (this.f41845s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28037li, this.A0);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28055mi, this.A0);
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28018ki, this.A0);
                if (this.f41778h6 != null && org.telegram.ui.ActionBar.k6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.f41778h6.c(false));
                    org.telegram.messenger.wo woVar = this.f41778h6;
                    if (woVar != null) {
                        int d = woVar.d(org.telegram.ui.ActionBar.k6.I.q());
                        w03 = org.telegram.ui.ActionBar.k6.D(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, this.A0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.fh0 fh0Var = this.f41830p6;
                org.telegram.ui.Components.fh0 fh0Var2 = this.f41845s;
                int[] iArr = this.f41837q6;
                if (fh0Var != fh0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f41830p6 = fh0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231198).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(mutate, org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    xpVar.f40441e = L;
                    xpVar.f40442f = L2;
                    this.f41845s.setBackground(xpVar);
                    this.f41845s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void R3() {
        boolean z10;
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            if (!this.S5 && this.Y5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ku0Var.setVisibility(z10);
        }
    }

    public final void R4() {
        int i3;
        ValueAnimator valueAnimator;
        if (this.f41826p2 && (valueAnimator = this.f41787j2) != null && valueAnimator.isRunning()) {
            this.f41752e2 = this.f41734b6;
            this.f41767g2 = this.f41741c6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        S4(L3(), currentActionBarHeight + i3);
    }

    public final void S3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.S3(boolean):void");
    }

    public final void S4(float f10, float f11) {
        float T1;
        int i3;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - j4()) / ((this.f41719a.getMeasuredWidth() - f11) - k4())));
        if (this.Q1 < j4() && max < 0.33f) {
            T1 = com.google.android.recaptcha.internal.a.x(f10, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * T1)) * f10) + ((float) Math.floor(translationY + (org.telegram.messenger.camera.q.b(f10, 1.0f, currentActionBarHeight, i3) - (org.telegram.messenger.g0.f22607p * 21.0f))));
        this.f41752e2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.f41767g2 = (((float) Math.floor(org.telegram.messenger.g0.f22607p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    public final void T3(Context context) {
        int i3;
        this.f41721a1 = new o4.m0(context, this.T0.getPopupLayout().getSwipeBack(), new gu0(this), false, 0, this.A0);
        if (this.f41780i1 > 0 || this.f41751e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, this.A0);
            o4.m0 m0Var = this.f41721a1;
            org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) m0Var.f20756e;
            if (s70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.bd.M0(2131753847, null), w02, new org.telegram.ui.Components.vf(m0Var, 10)));
                s70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f41868v2;
        if (userFull == null && this.f41861u2 == null) {
            i3 = 0;
        } else if (userFull != null) {
            i3 = userFull.ttl_period;
        } else {
            i3 = this.f41861u2.ttl_period;
        }
        org.telegram.ui.Components.zz0 a10 = org.telegram.ui.Components.zz0.a(i3);
        this.f41852t0 = a10;
        this.Z0 = this.T0.h(0, a10, org.telegram.messenger.bd.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f41721a1.f20753a);
        this.T0.a(-1);
        o5();
    }

    public final void T4() {
        hu0 hu0Var = this.f41719a;
        if (hu0Var != null && this.f41735c != null && hu0Var.getChildCount() > 0 && !this.f41816n6) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f41719a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.f41719a.getChildAt(i11));
                View childAt = this.f41719a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i3) {
                    i3 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f41804l6 = i10;
                int top = view.getTop();
                this.f41809m6 = top;
                if (this.f41804l6 == 0 && !this.f41819o2 && top > j4()) {
                    this.f41809m6 = j4();
                }
                this.f41735c.h1(i10, view.getTop() - this.f41719a.getPaddingTop());
            }
        }
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void U3() {
        if (this.fragmentView != null && this.f41823o6 && this.f41892y2 != null && getParentActivity() != null) {
            sw0 sw0Var = this.A6;
            if (sw0Var != null) {
                sw0Var.b(this.f41892y2);
                this.A6.invalidate();
                return;
            }
            sw0 sw0Var2 = new sw0(this, this.f41892y2);
            this.A6 = sw0Var2;
            ((FrameLayout) this.fragmentView).addView(sw0Var2, b8.mf.e(-1, -1, 55));
        }
    }

    public final void U4(boolean z10) {
        int i3 = this.K4;
        if (i3 >= 0) {
            if (z10) {
                ni.m mVar = new ni.m(getParentActivity(), 2, 0.6f);
                mVar.f55704a = this.K4;
                mVar.f20461p = -this.f41719a.getPaddingTop();
                this.f41735c.w0(mVar);
                return;
            }
            this.f41735c.h1(i3, -this.f41719a.getPaddingTop());
        }
    }

    @Override
    public final void V() {
        int i3;
        String str;
        int size;
        int i10;
        mv0 mv0Var = this.O;
        if (mv0Var != null && this.f41838r != null) {
            int closestTab = mv0Var.getClosestTab();
            int[] iArr = this.R.f36936c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        f5(org.telegram.messenger.bd.M0(2131745419, null));
                    } else {
                        f5(org.telegram.messenger.bd.G(i12, "Media", new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        f5(org.telegram.messenger.bd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.bd.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    f5(org.telegram.messenger.bd.G(iArr[7], "Videos", new Object[0]));
                } else {
                    f5(org.telegram.messenger.bd.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    f5(org.telegram.messenger.bd.M0(2131750827, null));
                } else {
                    f5(org.telegram.messenger.bd.G(i13, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    f5(org.telegram.messenger.bd.M0(2131743533, null));
                } else {
                    f5(org.telegram.messenger.bd.G(i14, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    f5(org.telegram.messenger.bd.M0(2131745421, null));
                } else {
                    f5(org.telegram.messenger.bd.G(i15, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    f5(org.telegram.messenger.bd.M0(2131748327, null));
                } else {
                    f5(org.telegram.messenger.bd.G(i16, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    f5(org.telegram.messenger.bd.M0(2131754879, null));
                } else {
                    f5(org.telegram.messenger.bd.G(i17, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                f5(org.telegram.messenger.bd.G(this.f41868v2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                f5(this.f41838r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.ws0.I0(closestTab)) {
                if (closestTab == 13) {
                    f5(this.O.f0(true));
                } else if (closestTab == 9) {
                    f5(org.telegram.messenger.bd.G(this.O.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(this.currentAccount).L0(a());
                    if (this.f41841r2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (L0 == null) {
                        size = 0;
                    } else {
                        size = L0.f23564b.size() + L0.f23565c;
                    }
                    f5(org.telegram.messenger.bd.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.nv G1 = getMessagesController().G1();
                    long a10 = a();
                    ArrayList arrayList = G1.f24441j;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i18);
                            if (mvVar.f24264a == a10) {
                                i3 = mvVar.f24267e;
                                break;
                            }
                            i18++;
                        } else {
                            i3 = 0;
                            break;
                        }
                    }
                    f5(org.telegram.messenger.bd.G(Math.max(1, i3), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.vp0 vp0Var = this.O.f40072b0;
                    if (vp0Var != null) {
                        i11 = vp0Var.getGiftsCount();
                    }
                    f5(org.telegram.messenger.bd.H(',', "ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i19 = iArr[8];
                    if (i19 <= 0) {
                        f5(org.telegram.messenger.bd.M0(2131745413, null));
                    } else {
                        f5(org.telegram.messenger.bd.H(',', "ProfilePollsCount", i19));
                    }
                }
            } else if (this.f41841r2) {
                f5(this.O.f0(false));
            } else if (this.O.m0(closestTab) > 0) {
                f5(org.telegram.messenger.bd.G(this.O.m0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                f5(org.telegram.messenger.bd.M0(2131746633, null));
            }
        }
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            org.telegram.messenger.g0.E2(y4Var);
        }
        dv0 dv0Var = new dv0(this, context, this.A0);
        this.simpleActionBar = dv0Var;
        dv0Var.setTitlesAlpha(0.0f);
        if (!this.f41808m5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new me(3, this));
        if (this.J0) {
            this.simpleActionBar.setBackButtonImage(2131232485);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.bd.M0(2131746508, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231240);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 3));
        if (!this.J0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new ei.j2(6, this, backButton));
        }
    }

    public final void W4() {
        org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
        if (gf0Var != null) {
            if (this.f41847s1) {
                gf0Var.F = 6;
            } else if (this.f41832q1) {
                gf0Var.F = 5;
            } else if (this.f41841r2) {
                gf0Var.F = 2;
            } else if (this.f41751e1 != 0) {
                gf0Var.F = 0;
            } else if (this.f41759f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41759f1));
                if (org.telegram.messenger.t3.T(M0)) {
                    if (org.telegram.messenger.t3.n0(M0)) {
                        this.f41720a0.F = 3;
                        return;
                    } else if (org.telegram.messenger.t3.c0(M0)) {
                        this.f41720a0.F = 4;
                        return;
                    } else {
                        this.f41720a0.F = 1;
                        return;
                    }
                }
                this.f41720a0.F = 3;
            }
        }
    }

    @Override
    public final boolean X() {
        return this.A1;
    }

    public final void X3(float f10) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f41797k6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f41797k6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f41890y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new st0(this, 0));
        this.f41797k6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f41797k6;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.f41797k6.addListener(new uu0(this, 6));
        }
        this.f41797k6.start();
    }

    public final void X4(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.X4(float):void");
    }

    public final void Y3(int i3, View view) {
        boolean z10;
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
        H.W(this.f41719a.U0(view, false));
        H.f33750w = false;
        if (this.f41868v2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232103, org.telegram.messenger.bd.M0(2131751767, null), new g90(this, 4), z10);
        H.c(2131232116, org.telegram.messenger.bd.M0(2131751336, null), new g90(this, 5), false);
        H.c(2131232108, org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.Components.o2(this, i3, 23), true);
        H.Z();
    }

    public final boolean Z3(final int i3, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f41847s1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f41868v2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.f27150id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.bd.M0(2131751767, null);
                String M02 = org.telegram.messenger.bd.M0(2131744204, null);
                if (i3 != this.K3 && i3 != this.J3 && i3 != this.W2) {
                    if (i3 == this.O3) {
                        str = lg.d1.k0(this.currentAccount, f10, userFull.business_work_hours);
                        M0 = org.telegram.messenger.bd.M0(2131746673, null);
                        M02 = org.telegram.messenger.bd.M0(2131752761, null);
                    } else if (i3 == this.P3) {
                        str = userFull.business_location.address;
                        M0 = org.telegram.messenger.bd.M0(2131746668, null);
                        M02 = org.telegram.messenger.bd.M0(2131752693, null);
                    } else if (i3 == this.L3) {
                        str = org.telegram.messenger.l10.n(f10);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = org.telegram.messenger.bd.M0(2131746686, null);
                        M02 = org.telegram.messenger.bd.M0(2131743675, null);
                    } else if (i3 == this.G3) {
                        str = f10.phone;
                        M02 = org.telegram.messenger.bd.M0(2131747303, null);
                    } else if (i3 == this.U2) {
                        str = UserInfoActivity.e0(this.f41868v2.birthday);
                        M02 = org.telegram.messenger.bd.M0(2131753716, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i3 == this.W2) {
                        M02 = org.telegram.messenger.bd.M0(2131753721, null);
                    }
                }
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
                H.W(this.f41719a.U0(view, false));
                H.f33750w = false;
                H.f33729i = 3;
                if (i3 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(2131232420, org.telegram.messenger.bd.M0(2131746664, null), new g90(this, 7), false);
                    }
                    H.c(2131232213, org.telegram.messenger.bd.M0(2131746666, null), new g90(this, 9), false);
                }
                if (str != null) {
                    H.c(2131232103, M0, new hc0(this, str, M02, 26), false);
                }
                if (i3 == this.O3) {
                    H.c(2131232116, org.telegram.messenger.bd.M0(2131746672, null), new g90(this, 10), false);
                    H.c(2131232108, org.telegram.messenger.bd.M0(2131746671, null), new Runnable(this) {
                        public final ProfileActivity f48953b;

                        {
                            this.f48953b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i3;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f48953b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M03;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i3 == this.P3) {
                    H.c(2131232116, org.telegram.messenger.bd.M0(2131746667, null), new g90(this, 11), false);
                    H.c(2131232108, org.telegram.messenger.bd.M0(2131746665, null), new Runnable(this) {
                        public final ProfileActivity f48953b;

                        {
                            this.f48953b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i3;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f48953b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M03;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i3 == this.L3) {
                    H.c(2131232116, org.telegram.messenger.bd.M0(2131746628, null), new g90(this, 12), false);
                } else if (i3 != this.K3 && i3 != this.J3 && i3 != this.W2) {
                    if (i3 == this.G3) {
                        H.c(2131231894, org.telegram.messenger.bd.M0(2131746654, null), new g90(this, 14), false);
                    } else if (i3 == this.U2) {
                        H.c(2131232116, org.telegram.messenger.bd.M0(2131746731, null), new Runnable(this) {
                            public final ProfileActivity f48350b;

                            {
                                this.f48350b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f48350b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.T6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ei(23, profileActivity, userFull2), new g90(profileActivity, 15), false, false, profileActivity.A0).f14429b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.T6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.bd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.S = M03;
                                        s1Var.U = org.telegram.messenger.bd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.T6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.T6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        profileActivity.showDialog(s1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.T6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.bd.M0(2131746690, null);
                                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                        s1Var2.S = M04;
                                        s1Var2.U = org.telegram.messenger.bd.M0(2131746691, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.T6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.T6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        profileActivity.showDialog(s1Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(2131232108, org.telegram.messenger.bd.M0(2131746329, null), new Runnable(this) {
                            public final ProfileActivity f48350b;

                            {
                                this.f48350b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f48350b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.T6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ei(23, profileActivity, userFull2), new g90(profileActivity, 15), false, false, profileActivity.A0).f14429b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.T6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.bd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.S = M03;
                                        s1Var.U = org.telegram.messenger.bd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.T6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.T6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        profileActivity.showDialog(s1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.T6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.bd.M0(2131746690, null);
                                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                        s1Var2.S = M04;
                                        s1Var2.U = org.telegram.messenger.bd.M0(2131746691, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.T6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.T6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        profileActivity.showDialog(s1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i3 == this.Q2) {
                        TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                        if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                            H.c(2131232103, org.telegram.messenger.bd.M0(2131746689, null), new hk0(22, this, M03), false);
                        }
                        H.c(2131232116, org.telegram.messenger.bd.M0(2131746692, null), new g90(this, 8), false);
                        H.c(2131232108, org.telegram.messenger.bd.M0(2131746329, null), new Runnable(this) {
                            public final ProfileActivity f48350b;

                            {
                                this.f48350b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f48350b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.T6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ei(23, profileActivity, userFull2), new g90(profileActivity, 15), false, false, profileActivity.A0).f14429b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.T6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M032 = org.telegram.messenger.bd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.S = M032;
                                        s1Var.U = org.telegram.messenger.bd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.T6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.T6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        profileActivity.showDialog(s1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.T6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.bd.M0(2131746690, null);
                                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                        s1Var2.S = M04;
                                        s1Var2.U = org.telegram.messenger.bd.M0(2131746691, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.T6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.T6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                        profileActivity.showDialog(s1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(2131232116, org.telegram.messenger.bd.M0(2131746685, null), new g90(this, 13), false);
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
        this.K5 = f10;
        org.telegram.ui.Components.kf0 kf0Var = this.J5;
        if (kf0Var != null) {
            kf0Var.b(f10);
        }
        A5();
    }

    public final long a() {
        long j10 = this.f41780i1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f41751e1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f41759f1;
    }

    public final boolean a4() {
        u4.d1 d1Var;
        View view;
        if ((this.J0 || (!org.telegram.messenger.g0.Q1() && !this.f41813n2)) && this.f41758f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.G0 = true;
            this.f41819o2 = true;
            int i3 = 0;
            while (true) {
                d1Var = null;
                if (i3 < this.f41719a.getChildCount()) {
                    if (RecyclerView.R(this.f41719a.getChildAt(i3)) == 0) {
                        view = this.f41719a.getChildAt(i3);
                        break;
                    }
                    i3++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                hu0 hu0Var = this.f41719a;
                View F = hu0Var.F(view);
                if (F != null) {
                    d1Var = hu0Var.T(F);
                }
                if (d1Var != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(d1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f41719a.w0(0, -(((this.f41719a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.xq.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a5(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f41861u2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.m1 == 0) {
                this.m1 = -j10;
                getMediaDataController().e0(this.m1, this.classGuid, this.f41766g1);
            }
        }
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.setChatInfo(this.f41861u2);
        }
        ru0 ru0Var = this.f41817o0;
        if (ru0Var != null && !this.f41832q1) {
            ru0Var.setChatInfo(this.f41861u2);
        }
        tu0 tu0Var = this.f41866v0;
        if (tu0Var != null && (chatFull3 = this.f41861u2) != null) {
            tu0Var.setStories(chatFull3.stories);
        }
        ci.z0 z0Var = this.f41874w0;
        if (z0Var != null) {
            z0Var.a();
        }
        qu0 qu0Var = this.f41758f0;
        if (qu0Var != null) {
            qu0Var.setHasStories(x4());
        }
        b4();
        if (this.f41759f1 != 0) {
            boolean z11 = org.telegram.messenger.r2.f25040a;
            if (!getMessagesController().h7 && (chatFull2 = this.f41861u2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.Q(38, z10);
            org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
            if (gf0Var != null) {
                gf0Var.o(3, z10);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27981ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27956h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28113pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28000ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27885dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27919f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.E2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f41861u2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i3 = 0; i3 < this.f41861u2.participants.participants.size(); i3++) {
                    TLRPC.ChatParticipant chatParticipant = this.f41861u2.participants.participants.get(i3);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void b5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.E6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.E6 = tL_emojiStatusCollectible;
                gi.l3 l3Var = this.B6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.D6 = null;
                    this.B6 = new gi.l3(getParentActivity(), 3);
                    this.C6 = org.telegram.ui.ActionBar.k6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.B6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                    gi.l3 l3Var2 = this.B6;
                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    l3Var2.M0 = true;
                    l3Var2.U0 = System.currentTimeMillis();
                    l3Var2.N0 = new Path();
                    l3Var2.O0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
                    l3Var2.P0 = new Paint(1);
                    l3Var2.Q0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(1.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    l3Var2.T0 = linearGradient;
                    l3Var2.Q0.setShader(linearGradient);
                    l3Var2.R0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.5f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    l3Var2.S0 = new Matrix();
                    l3Var2.P0.setShader(l3Var2.R0);
                    l3Var2.Q0.setStyle(Paint.Style.STROKE);
                    l3Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
                    l3Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
                    l3Var2.Q0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                    this.Z.addView(this.B6, b8.mf.c(24.0f, -1));
                    this.B6.v(9.33f);
                    gi.l3 l3Var3 = this.B6;
                    Typeface o10 = org.telegram.messenger.g0.o();
                    l3Var3.I.x(o10);
                    l3Var3.K.setTypeface(o10);
                    this.B6.u(tL_emojiStatusCollectible.title);
                    gi.l3 l3Var4 = this.B6;
                    l3Var4.d = -1L;
                    l3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
                    gi.l3 l3Var5 = this.B6;
                    l3Var5.getClass();
                    l3Var5.E = org.telegram.messenger.g0.N(4.0f);
                    l3Var5.F = org.telegram.messenger.g0.N(2.66f);
                    this.B6.t();
                    this.B6.s(16.0f);
                    this.B6.w();
                    this.B6.setOnClickListener(new zt0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < org.telegram.messenger.g0.L(82.0f)) {
                        this.D6 = Boolean.FALSE;
                        this.B6.setAlpha(0.0f);
                    }
                    q5();
                    gi.l3 l3Var6 = this.B6;
                    Objects.requireNonNull(l3Var6);
                    org.telegram.messenger.g0.i3(new ky(l3Var6, 1), 6000L);
                }
            }
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (this.J1 != 0 && (q4Var = this.parentLayout) != null && q4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof wm)) {
            finishFragment();
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.O.J0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.f41778h6 = null;
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
        if (this.f41719a == null) {
            return;
        }
        float A = org.telegram.ui.Cells.f1.A(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.f41730b2, 0.5f, this.f41719a.getMeasuredWidth() / 2.0f);
        this.Z1 = A;
        if (this.G1) {
            this.Z1 = org.telegram.messenger.g0.T1(this.f41764f6, A, this.S1);
        }
        this.Y.setTranslationX(this.Z1);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        bw0 bw0Var;
        boolean z10;
        org.telegram.ui.ActionBar.q4 q4Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        hu0 hu0Var;
        hu0 hu0Var2;
        org.telegram.ui.Components.bj0 bj0Var;
        if (i3 != org.telegram.messenger.hs.B5 && i3 != org.telegram.messenger.hs.f23283p3) {
            boolean z12 = true;
            int i11 = 0;
            r8 = false;
            boolean z13 = false;
            if (i3 == org.telegram.messenger.hs.f23292r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.hp.C8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f41751e1 != 0) {
                    if (objArr3 != null) {
                        I5(true);
                    }
                    if ((intValue & 1024) != 0 && (hu0Var2 = this.f41719a) != null && (bj0Var = (org.telegram.ui.Components.bj0) hu0Var2.L(this.G3, false)) != null) {
                        this.d.t(bj0Var, this.G3);
                    }
                } else if (this.f41759f1 != 0) {
                    int i13 = intValue & 8192;
                    if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i13 != 0) {
                            D5(true, false);
                        } else {
                            G5(true);
                        }
                        I5(true);
                    }
                    if (objArr3 != null && (hu0Var = this.f41719a) != null) {
                        int childCount = hu0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = this.f41719a.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.f23232g1) {
                Long l10 = (Long) objArr[0];
                if (this.f41861u2 != null && (chat = this.E2) != null && chat.f27001id == l10.longValue()) {
                    this.f41861u2.online_count = ((Integer) objArr[1]).intValue();
                    G5(true);
                    I5(false);
                }
            } else if (i3 != org.telegram.messenger.hs.O && i3 != org.telegram.messenger.hs.f23203b1) {
                if (i3 == org.telegram.messenger.hs.f23196a0) {
                    if (this.f41786j1) {
                        org.telegram.messenger.g0.h3(new hk0(20, this, objArr));
                    }
                } else if (i3 == org.telegram.messenger.hs.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.D2;
                    if (encryptedChat2 != null && encryptedChat.f27009id == encryptedChat2.f27009id) {
                        this.D2 = encryptedChat;
                        D5(false, false);
                        org.telegram.messenger.n6 n6Var = this.X1;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.f23231g0) {
                    boolean z14 = this.k1;
                    if (getMessagesController().H0.indexOfKey(this.f41751e1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.k1 = z11;
                    if (z14 != z11) {
                        S3(true);
                        D5(false, false);
                    }
                } else if (i3 == org.telegram.messenger.hs.f23328w2) {
                    Long l11 = (Long) objArr[0];
                    if (this.E2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.E2;
                        if (longValue == chat2.f27001id && org.telegram.messenger.t3.w(14, chat2)) {
                            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.currentAccount).N0(l11.longValue());
                            if (N0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f41861u2;
                                if (chatFull4 != null) {
                                    N0.participants = chatFull4.participants;
                                }
                                this.f41861u2 = N0;
                            }
                            mv0 mv0Var = this.O;
                            if (mv0Var != null) {
                                mv0Var.setChatInfo(this.f41861u2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f41861u2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f41825p1) || (inputGroupCall != null && this.f41825p1))) {
                                S3(false);
                            }
                            tu0 tu0Var = this.f41866v0;
                            if (tu0Var != null && (chatFull3 = this.f41861u2) != null) {
                                tu0Var.setStories(chatFull3.stories);
                            }
                            ci.z0 z0Var = this.f41874w0;
                            if (z0Var != null) {
                                z0Var.a();
                            }
                            qu0 qu0Var = this.f41758f0;
                            if (qu0Var != null) {
                                qu0Var.setHasStories(x4());
                            }
                            if (l11.longValue() != 0) {
                                boolean z15 = org.telegram.messenger.r2.f25040a;
                                z12 = (getMessagesController().h7 || (chatFull2 = this.f41861u2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.Q(38, z12);
                                org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
                                if (gf0Var != null) {
                                    gf0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f41751e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f41751e1))) != null && chatFull6.f27002id == a22.linked_community_id) {
                        D5(true, false);
                    }
                    TLRPC.Chat chat3 = this.E2;
                    if (chat3 != null && chatFull6.f27002id == chat3.linked_community_id) {
                        D5(true, false);
                    }
                    if (chatFull6.f27002id == this.f41759f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f41861u2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f41861u2 = chatFull6;
                        if (this.m1 == 0) {
                            long j10 = chatFull6.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.m1 = -j10;
                                getMediaDataController().d0(0, this.classGuid, this.m1, this.f41766g1, true);
                            }
                        }
                        b4();
                        ru0 ru0Var = this.f41817o0;
                        if (ru0Var != null && !this.f41832q1) {
                            ru0Var.setChatInfo(this.f41861u2);
                        }
                        D5(true, false);
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f41759f1));
                        if (M0 != null) {
                            this.E2 = M0;
                            S3(true);
                        }
                        org.telegram.messenger.n6 n6Var2 = this.X1;
                        if (n6Var2 != null) {
                            n6Var2.g();
                        }
                        if (this.E2.megagroup && (objArr2 != null || !booleanValue)) {
                            h4(true);
                        }
                        o5();
                        N5();
                        tu0 tu0Var2 = this.f41866v0;
                        if (tu0Var2 != null && (chatFull = this.f41861u2) != null) {
                            tu0Var2.setStories(chatFull.stories);
                        }
                        ci.z0 z0Var2 = this.f41874w0;
                        if (z0Var2 != null) {
                            z0Var2.a();
                        }
                        qu0 qu0Var2 = this.f41758f0;
                        if (qu0Var2 != null) {
                            qu0Var2.setHasStories(x4());
                        }
                        mv0 mv0Var2 = this.O;
                        if (mv0Var2 != null) {
                            mv0Var2.setChatInfo(this.f41861u2);
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.f23305t) {
                    removeSelfFromStack(true);
                } else if (i3 == org.telegram.messenger.hs.v) {
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
                } else if (i3 == org.telegram.messenger.hs.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f41751e1) {
                        this.F2 = botInfo;
                        D5(false, false);
                    }
                } else if (i3 == org.telegram.messenger.hs.E0) {
                    if (((Long) objArr[0]).longValue() == this.f41751e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f41868v2 = userFull;
                        org.telegram.ui.Components.ku0 ku0Var = this.T;
                        if (ku0Var != null) {
                            ku0Var.set(userFull.stars_rating);
                        }
                        tu0 tu0Var3 = this.f41866v0;
                        if (tu0Var3 != null) {
                            tu0Var3.setStories(this.f41868v2.stories);
                        }
                        ci.z0 z0Var3 = this.f41874w0;
                        if (z0Var3 != null) {
                            z0Var3.a();
                        }
                        qu0 qu0Var3 = this.f41758f0;
                        if (qu0Var3 != null) {
                            qu0Var3.setHasStories(x4());
                        }
                        mv0 mv0Var3 = this.O;
                        if (mv0Var3 != null) {
                            mv0Var3.setUserInfo(this.f41868v2);
                        }
                        if (this.f41839r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f41868v2.about, this.f41899z2)) {
                                this.d.g(this.W2);
                            }
                            if (this.f41847s1) {
                                D5(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.L0) {
                                S3(true);
                            } else {
                                this.I1 = true;
                            }
                            D5(false, false);
                            mv0 mv0Var4 = this.O;
                            if (mv0Var4 != null) {
                                mv0Var4.setCommonGroupsCount(this.f41868v2.common_chats_count);
                                V();
                                org.telegram.ui.Components.os0 os0Var = this.R;
                                if (os0Var == null || os0Var.E) {
                                    resumeDelayedFragmentAnimation();
                                    y4(true);
                                }
                            }
                        }
                        o5();
                        N5();
                        if (this.f41876w2 == null && !v4()) {
                            org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(this.currentAccount);
                            this.f41876w2 = d6Var;
                            g90 g90Var = new g90(this, 17);
                            if (d6Var.f29084c) {
                                g90Var.run();
                            } else {
                                d6Var.h.add(g90Var);
                            }
                            this.f41876w2.d(this.f41868v2);
                        }
                        if (!v4()) {
                            pw0 pw0Var = this.f41892y2;
                            pw0 c2 = pw0.c(this.currentAccount, this.f41868v2, pw0Var);
                            this.f41892y2 = c2;
                            if (c2 != pw0Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f41884x2 = z10;
                            if (c2 != null) {
                                g90 g90Var2 = new g90(this, 18);
                                if (c2.f48693b) {
                                    g90Var2.run();
                                } else {
                                    c2.h.add(g90Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (s4()) {
                                this.T0.S(44);
                            } else {
                                this.T0.t(44);
                            }
                            TLRPC.UserFull userFull2 = this.f41868v2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.T0.Q(46, z13);
                            this.T0.Q(47, !z13);
                        }
                    }
                } else if (i3 != org.telegram.messenger.hs.f23254k0) {
                    if (i3 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i15);
                                if (this.D2 != null) {
                                    TLRPC.MessageAction messageAction = ziVar.f26868k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (bw0Var = this.d) != null) {
                                        bw0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i3 == org.telegram.messenger.hs.f23246i4) {
                        hu0 hu0Var3 = this.f41719a;
                        if (hu0Var3 != null) {
                            hu0Var3.g1();
                        }
                    } else if (i3 == org.telegram.messenger.hs.f23337x4) {
                        D5(false, false);
                    } else if (i3 == org.telegram.messenger.hs.f23300s1) {
                        int i16 = this.f41738c3;
                        int i17 = this.f41723a3;
                        int i18 = this.Y2;
                        J5();
                        bw0 bw0Var2 = this.d;
                        if (bw0Var2 != null) {
                            if (i16 != this.f41738c3 || i17 != this.f41723a3 || i18 != this.Y2) {
                                bw0Var2.f();
                            }
                        }
                    } else if (i3 == org.telegram.messenger.hs.f23291q5) {
                        if (this.f41832q1) {
                            I5(false);
                        }
                    } else if (i3 == org.telegram.messenger.hs.D1) {
                        lw0 lw0Var = this.f41749e;
                        if (lw0Var != null) {
                            lw0Var.f47450c = lw0.H(this);
                            this.f41749e.f47456w.clear();
                            this.f41749e.J();
                            lw0 lw0Var2 = this.f41749e;
                            lw0Var2.I(lw0Var2.E);
                        }
                    } else if (i3 == org.telegram.messenger.hs.f23208c0) {
                        I5(false);
                    } else if (i3 != org.telegram.messenger.hs.f23324v5 && i3 != org.telegram.messenger.hs.F5) {
                        if (i3 == org.telegram.messenger.hs.i3) {
                            org.telegram.ui.ActionBar.f5 f5Var = this.T0;
                            if (f5Var != null) {
                                TL_account.RequirementToContact J2 = getMessagesController().J2(this.f41751e1);
                                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                                    z12 = false;
                                }
                                f5Var.Q(20, z12);
                            }
                            r5();
                        } else if (i3 == org.telegram.messenger.hs.f23230f5) {
                            r5();
                        } else if (i3 == org.telegram.messenger.hs.f23343y3) {
                            D5(false, false);
                        } else if (i3 == org.telegram.messenger.hs.C3) {
                            D5(false, false);
                        } else if (i3 == org.telegram.messenger.hs.D3) {
                            D5(false, false);
                        } else if (i3 == org.telegram.messenger.hs.f23341y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
                                if (q4Var2 != null && q4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i3 == org.telegram.messenger.hs.f23228f3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.K4 < 0 && longValue3 == a()) {
                                J5();
                                V();
                                bw0 bw0Var3 = this.d;
                                if (bw0Var3 != null) {
                                    bw0Var3.f();
                                }
                            }
                        } else if (i3 == org.telegram.messenger.hs.G3) {
                            if (((Long) objArr[0]).longValue() == a() && !v4()) {
                                if (this.K4 < 0) {
                                    J5();
                                    V();
                                    bw0 bw0Var4 = this.d;
                                    if (bw0Var4 != null) {
                                        bw0Var4.f();
                                    }
                                    org.telegram.messenger.g0.h3(new g90(this, 19));
                                    return;
                                }
                                mv0 mv0Var5 = this.O;
                                if (mv0Var5 != null) {
                                    mv0Var5.N1(true);
                                }
                            }
                        } else if (i3 == org.telegram.messenger.hs.V3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f41751e1 > 0) {
                                TLRPC.UserFull b22 = getMessagesController().b2(this.f41751e1);
                                if (b22 != null) {
                                    this.f41868v2 = b22;
                                }
                                J5();
                                V();
                                hu0 hu0Var4 = this.f41719a;
                                if (hu0Var4 != null && hu0Var4.c0()) {
                                    this.f41719a.post(new g90(this, 21));
                                    return;
                                }
                                bw0 bw0Var5 = this.d;
                                if (bw0Var5 != null) {
                                    bw0Var5.f();
                                }
                            }
                        } else if (i3 == org.telegram.messenger.hs.W3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.E2;
                            if (chat4 != null && chat4.f27001id == longValue4) {
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
                                    ArrayList arrayList2 = this.R4;
                                    if (i11 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                                        i11++;
                                    } else {
                                        org.telegram.messenger.g0.b4(this.f41719a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        qu0 qu0Var4 = this.f41758f0;
                        if (qu0Var4 != null) {
                            qu0Var4.setHasStories(x4());
                            this.f41758f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.f41793k2));
                        }
                        tu0 tu0Var4 = this.f41866v0;
                        if (tu0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f41868v2;
                            if (userFull3 != null) {
                                tu0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f41861u2;
                            if (chatFull8 != null) {
                                tu0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                S3(true);
            }
        } else if (org.telegram.messenger.t3.R(org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(this.f41759f1)))) {
            getMessagesController().P1().k(a(), new ei.e(19), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null && f30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if ((f30Var == null || dialog != f30Var.f33683c) && super.dismissDialogOnPause(dialog)) {
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
        int i3 = 0;
        if (this.f41751e1 != 0 && this.f41839r0 != null && !this.f41847s1) {
            return 0;
        }
        return org.telegram.messenger.g0.L(74 + ((this.I4 || this.J4) ? 25 : 25));
    }

    public final void e5(uv0 uv0Var) {
        if (this.f41790j5 == uv0Var) {
            return;
        }
        this.f41790j5 = uv0Var;
        org.telegram.messenger.g0.d0(this.f41719a, new vt0(this, 0));
    }

    @Override
    public final org.telegram.ui.Components.tj0 f() {
        return this.f41719a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof org.telegram.ui.Components.x41) {
            return ((org.telegram.ui.Components.x41) imageReceiver.t()).f40225a.a();
        }
        return org.telegram.messenger.g0.p(this.f41758f0.getImageReceiver().n());
    }

    public final void f5(CharSequence charSequence) {
        this.X5 = charSequence;
        H5();
    }

    @Override
    public final TLRPC.Chat g() {
        return this.E2;
    }

    public final org.telegram.ui.Components.e5 g4(long j10) {
        if (this.H == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), 2, this.f41757f, false);
            this.H = e5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            e5Var.J = 0;
            e5Var.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        if (j10 != 0) {
            this.H.j(j10, false);
        } else {
            this.H.g(null, false);
        }
        s5();
        return this.H;
    }

    public final void g5(int i3) {
        boolean z10;
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        if (!org.telegram.messenger.g0.Q1()) {
            boolean z11 = false;
            if (i3 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K1 = z10;
            if (i3 != 0) {
                z11 = true;
            }
            this.L1 = z11;
            K5();
            if (e12.getBoolean("view_animations", true)) {
                this.J1 = i3;
            } else if (i3 == 2) {
                this.f41812n1 = true;
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.A0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        h6 h6Var = new h6(18, this);
        ArrayList arrayList = new ArrayList();
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            arrayList.addAll(mv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41743d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41758f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41831q0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27880d8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41845s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28018ki));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41845s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28037li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41845s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28055mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28254x6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28081o6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28196u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28214v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28290z6));
        int i3 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41719a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        if (this.S5) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41757f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41757f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41889y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41757f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28093oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41757f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f41889y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28073ni));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.A0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.e6 e6Var = this.A0;
        if (e6Var != null) {
            drawable = e6Var.getDrawable(str);
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
        int i3;
        if (!this.B1 && (hVar = this.C1) != null && this.f41861u2 != null) {
            this.B1 = true;
            int i10 = 0;
            if (hVar.m() != 0 && z10) {
                i3 = 300;
            } else {
                i3 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().h1(this.f41759f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i10 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i10;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new kg.t(this, tL_channels_getParticipants, i3)), this.classGuid);
        }
    }

    public final void h5(TLRPC.UserFull userFull, org.telegram.ui.Cells.d6 d6Var, pw0 pw0Var) {
        boolean z10;
        this.f41868v2 = userFull;
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            ku0Var.set(userFull.stars_rating);
        }
        tu0 tu0Var = this.f41866v0;
        if (tu0Var != null) {
            tu0Var.setStories(this.f41868v2.stories);
        }
        ci.z0 z0Var = this.f41874w0;
        if (z0Var != null) {
            z0Var.a();
        }
        qu0 qu0Var = this.f41758f0;
        if (qu0Var != null) {
            qu0Var.setHasStories(x4());
        }
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.setUserInfo(this.f41868v2);
        }
        if (this.f41876w2 == null) {
            this.f41876w2 = d6Var;
        }
        if (this.f41876w2 == null) {
            this.f41876w2 = new org.telegram.ui.Cells.d6(this.currentAccount);
        }
        org.telegram.ui.Cells.d6 d6Var2 = this.f41876w2;
        g90 g90Var = new g90(this, 23);
        if (d6Var2.f29084c) {
            g90Var.run();
        } else {
            d6Var2.h.add(g90Var);
        }
        this.f41876w2.d(this.f41868v2);
        if (this.f41892y2 == null) {
            this.f41892y2 = pw0Var;
        }
        pw0 pw0Var2 = this.f41892y2;
        boolean z11 = true;
        if (pw0Var2 == null) {
            pw0 c2 = pw0.c(this.currentAccount, this.f41868v2, pw0Var2);
            this.f41892y2 = c2;
            if (c2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41884x2 = z10;
        }
        pw0 pw0Var3 = this.f41892y2;
        if (pw0Var3 != null) {
            g90 g90Var2 = new g90(this, 18);
            if (pw0Var3.f48693b) {
                g90Var2.run();
            } else {
                pw0Var3.h.add(g90Var2);
            }
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.T0;
        if (f5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.f41751e1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z11 = false;
            }
            f5Var.Q(20, z11);
            if (s4()) {
                this.T0.S(44);
            } else {
                this.T0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.e5 i4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.G == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 2, this.f41757f, false);
            this.G = e5Var;
            if (this.H0) {
                e5Var.a();
            }
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
        s5();
        return this.G;
    }

    public final void i5() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.kf0 kf0Var = new org.telegram.ui.Components.kf0(this.glassEngine, baseSimpleGlass);
        this.J5 = kf0Var;
        ow0 ow0Var = this.f41743d1;
        if (ow0Var != null) {
            int i3 = ow0Var.I;
            boolean z10 = ow0Var.f48366c;
            if (kf0Var.f35391i != i3 || kf0Var.f35392j != z10) {
                kf0Var.f35391i = i3;
                kf0Var.f35392j = z10;
                kf0Var.a();
            }
        }
        this.J5.b(this.K5);
        org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
        if (gf0Var != null) {
            gf0Var.setGlassFactory(this.J5.f35387c);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.f41736c0;
        if (cg0Var != null) {
            cg0Var.setGlassFactory(this.J5.f35387c);
        }
        this.simpleActionBar.setButtonsGlass(this.J5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        kv0 kv0Var = this.f41815n5;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.A0;
        baseSimpleGlass.f53532l = kv0Var;
        baseSimpleGlass.f53533m = null;
        baseSimpleGlass.g(kv0Var, y4Var, e6Var);
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.kf0 kf0Var2 = this.J5;
        eh.c cVar = kf0Var2.f35388e;
        si.d dVar = kf0Var2.f35389f;
        y4Var2.f28869o0 = cVar;
        y4Var2.f28870p0 = dVar;
        y4Var2.setBackground(null);
        this.H5 = b8.cd.m(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.I5);
        A5();
        baseSimpleGlass.f53534n = this.M6;
        View view = new View(getParentActivity());
        this.U5 = view;
        view.setAlpha(0.0f);
        this.f41815n5.getViewTreeObserver().addOnPreDrawListener(new bk(this, 1));
        this.O.z(this.U5);
        View view2 = this.U5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.C5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        kv0 kv0Var2 = this.f41815n5;
        kv0Var2.addView(this.C5, kv0Var2.indexOfChild(this.Z), b8.mf.e(-1, 0, 48));
        this.glassEngine.b(this.f41719a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new g90(this, 22));
        H3();
        x5();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f41826p2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f41826p2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.v()) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28236w8, this.A0);
            } else if (!this.S5 && this.B5 <= 0.5f) {
                org.telegram.messenger.wo woVar = this.f41778h6;
                if (woVar != null) {
                    w02 = woVar.d(org.telegram.ui.ActionBar.k6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.A0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.A0);
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

    public final void j5(boolean z10, boolean z11) {
        if (this.f41772h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f41765g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41765g0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41765g0 = animatorSet2;
            if (z10) {
                this.f41772h0.setVisibility(0);
                this.f41765g0.playTogether(ObjectAnimator.ofFloat(this.f41772h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41772h0, View.ALPHA, 0.0f));
            }
            this.f41765g0.setDuration(180L);
            this.f41765g0.addListener(new ev0(this, z10, 1));
            this.f41765g0.start();
        } else if (z10) {
            this.f41772h0.setAlpha(1.0f);
            this.f41772h0.setVisibility(0);
        } else {
            this.f41772h0.setAlpha(0.0f);
            this.f41772h0.setVisibility(4);
        }
    }

    @Override
    public final si.f k() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.f53529i;
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
        int i3;
        int i10;
        Long l10;
        if (this.O5 != null) {
            return;
        }
        x01[] x01VarArr = new x01[1];
        Rect rect = org.telegram.messenger.g0.Q;
        kk kkVar = this.f41757f;
        if (kkVar != null) {
            if (kkVar.getRightDrawable() == null) {
                rect.set(this.f41757f.getWidth() - 1, (this.f41757f.getHeight() / 2) - 1, this.f41757f.getWidth() + 1, (this.f41757f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f41757f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f41757f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f41757f.getX(), (int) this.f41757f.getY());
            }
        }
        if (this.f41757f.getScaleX() < 1.5f) {
            i3 = 16;
        } else {
            i3 = 32;
        }
        int i11 = i3;
        int L = (-(this.Z.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i11);
        Point point = org.telegram.messenger.g0.f22608q;
        int min = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = b8.be.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.E2 == null) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        xu0 xu0Var = new xu0(this, this, parentActivity, valueOf, i10, this.A0, i11, x01VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41751e1));
        if (a22 != null) {
            xu0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.F;
        if (l11 != null) {
            xu0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.e5 e5Var = this.G;
            if (e5Var != null) {
                Drawable drawable = e5Var.f33286f[0];
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.g5) drawable).h());
                    xu0Var.setSelected(l10);
                }
            }
            l10 = null;
            xu0Var.setSelected(l10);
        }
        xu0Var.setSaveState(3);
        xu0Var.y(this.G, this.f41757f);
        yu0 yu0Var = new yu0(this, xu0Var);
        this.O5 = yu0Var;
        x01VarArr[0] = yu0Var;
        int[] iArr = new int[2];
        kk kkVar2 = this.f41757f;
        if (kkVar2 != null) {
            kkVar2.getLocationOnScreen(iArr);
        }
        x01VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        x01VarArr[0].b();
    }

    public final float l4() {
        return Math.max(this.B5, this.R5);
    }

    public final void l5() {
        int i3 = 0;
        this.O.L0.setReordering(false);
        mv0 mv0Var = this.O;
        org.telegram.ui.Components.tq0 tq0Var = mv0Var.L0;
        if (mv0Var.f40142y1 != null && tq0Var != null) {
            boolean C0 = mv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = tq0Var.getTabIds();
            int size = tabIds.size();
            while (i3 < size) {
                Integer num = tabIds.get(i3);
                i3++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.ws0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.O.N1(true);
        this.f41902z5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new g90(this, 25)).start();
        org.telegram.ui.Components.fc.a0(this).Q(2131623989, 36, "Tab order changed.").j();
    }

    public final float m4(float f10, float f11) {
        float f12;
        float f13;
        this.f41872v6 = f10;
        this.f41888x6 = f11;
        int i3 = this.J1;
        if (i3 == 2) {
            f12 = 1.0f;
        } else if (this.S1 < 1.0f && i3 != 0) {
            f12 = 0.0f;
        } else {
            f12 = this.f41793k2;
        }
        float l10 = Utilities.l(f12);
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            f13 = ku0Var.getVisibilityFactor();
        } else {
            f13 = 0.0f;
        }
        return Math.max(0.0f, (p4() + this.f41829p5) * l10) + com.google.android.recaptcha.internal.a.y(1.0f, l10, f11 * f13, f10);
    }

    public final void m5() {
        int w02;
        int w03;
        if (!this.f41826p2) {
            su0 su0Var = this.f41838r;
            if (su0Var != null) {
                Object tag = su0Var.getTag();
                if (tag instanceof Integer) {
                    this.f41838r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    this.f41838r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f41881x;
            int i3 = -1;
            if (drawable != null) {
                if (this.f41778h6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27885dd, this.A0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.kk0 kk0Var = this.L;
            if (kk0Var != null) {
                kk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956h8, this.A0));
            }
            kk kkVar = this.f41757f;
            if (kkVar != null) {
                kkVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000ji, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.f41778h6 == null) {
                    i3 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.A0);
                }
                kVar.D(i3, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f41778h6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27919f8, this.A0);
                }
                kVar2.C(w02, false);
            }
        }
        s5();
        P5();
    }

    public final float n4(float f10) {
        float f11;
        this.f41896y6 = f10;
        int i3 = this.J1;
        float f12 = 0.0f;
        if (i3 == 2) {
            f11 = 1.0f;
        } else if (this.S1 < 1.0f && i3 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f41793k2;
        }
        float l10 = Utilities.l(f11);
        if (this.T != null) {
            f12 = this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f);
        }
        return com.google.android.recaptcha.internal.a.y(1.0f, l10, f12, f10);
    }

    public final void n5() {
        int i3;
        float f10;
        l0 l0Var;
        if (this.f41720a0 != null && this.f41838r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            int i10 = currentActionBarHeight + i3;
            org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
            boolean z10 = this.G1;
            gf0Var.f34079e = z10;
            if (z10 && this.J1 == 2 && (l0Var = this.Y) != null) {
                this.f41720a0.f34080f = this.Y.getY() + (this.Y.getScaleY() * l0Var.getHeight());
                this.f41720a0.setAlpha(this.S1);
                org.telegram.ui.Components.gf0 gf0Var2 = this.f41720a0;
                gf0Var2.f34085x = org.telegram.messenger.g0.L(74.0f);
                gf0Var2.setTranslationY(this.f41719a.getMeasuredWidth());
                gf0Var2.invalidate();
            } else {
                gf0Var.f34080f = -1.0f;
                float f11 = i10;
                float f12 = this.Q1 + f11;
                if (!this.I4 && !this.J4) {
                    f10 = 0.0f;
                } else {
                    f10 = 25.0f;
                }
                float L = f12 - org.telegram.messenger.g0.L(f10);
                float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f11);
                org.telegram.ui.Components.gf0 gf0Var3 = this.f41720a0;
                gf0Var3.f34085x = min;
                gf0Var3.setTranslationY(L - min);
                gf0Var3.invalidate();
            }
            ImageView imageView = this.P0;
            if (imageView != null && imageView.getTag() != null) {
                this.f41720a0.getClass();
                if (this.P0.getVisibility() == 0) {
                    this.P0.setVisibility(8);
                }
                if (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0) {
                    ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.Components.wq o4() {
        if (this.K == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232307).mutate();
            this.E = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.A0), PorterDuff.Mode.MULTIPLY);
            this.K = new org.telegram.ui.Components.wq(this.E, getParentActivity().getDrawable(2131232310).mutate());
        }
        return this.K;
    }

    public final void o5() {
        int i3;
        if (this.Z0 != null && this.f41721a1 != null) {
            TLRPC.UserFull userFull = this.f41868v2;
            if (userFull == null && this.f41861u2 == null) {
                i3 = 0;
            } else if (userFull != null) {
                i3 = userFull.ttl_period;
            } else {
                i3 = this.f41861u2.ttl_period;
            }
            this.f41852t0.b(i3);
            this.f41721a1.t(i3);
        }
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null) {
            f30Var.h(i3, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tq0 tq0Var;
        if (super.onBackPressed(z10)) {
            mv0 mv0Var = this.O;
            if (mv0Var != null && (tq0Var = mv0Var.L0) != null && tq0Var.f31612o0) {
                if (z10) {
                    l5();
                    return false;
                }
            } else if (this.K4 != -1 && mv0Var != null && mv0Var.F1) {
                if (z10) {
                    mv0Var.V(true);
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
        this.f41823o6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        Q5();
        this.f41823o6 = true;
        U3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.onConfigurationChanged(configuration);
        }
        t4();
        if (this.f41813n2 && this.f41826p2 && (m10 = this.f41735c.m(0)) != null) {
            this.f41719a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new f7(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r20, java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        hu0 hu0Var = this.f41719a;
        if (hu0Var != null) {
            hu0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.Q0();
        }
        org.telegram.ui.Components.os0 os0Var = this.R;
        if (os0Var != null) {
            os0Var.b(this);
        }
        org.telegram.ui.Components.os0 os0Var2 = this.R;
        if (os0Var2 != null) {
            os0Var2.f36944y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23305t);
        getNotificationCenter().n(this, org.telegram.messenger.hs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23291q5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23208c0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23324v5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.i3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23343y3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23228f3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.W3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        ru0 ru0Var = this.f41817o0;
        if (ru0Var != null) {
            ru0Var.K();
        }
        org.telegram.ui.Components.nf0 nf0Var = this.f41811n0;
        if (nf0Var != null) {
            nf0Var.d();
        }
        this.f41726a6 = null;
        if (this.f41751e1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23300s1);
            getNotificationCenter().n(this, org.telegram.messenger.hs.O);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23196a0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23231g0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23254k0);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23337x4);
            getMessagesController().f23106r1.remove(Long.valueOf(this.f41751e1));
        } else if (this.f41759f1 != 0) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23283p3);
            getNotificationCenter().n(this, org.telegram.messenger.hs.T);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23232g1);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23328w2);
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23203b1);
        }
        qu0 qu0Var = this.f41758f0;
        if (qu0Var != null) {
            qu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null) {
            f30Var.d();
        }
        vu0 vu0Var = this.W4;
        if (vu0Var != null) {
            vu0Var.b();
        }
        pw0 pw0Var = this.f41892y2;
        if (pw0Var != null && this.f41884x2) {
            pw0Var.b(true);
            this.f41892y2 = null;
        }
        org.telegram.messenger.video.o oVar = this.f41895y5;
        if (oVar != null) {
            this.f41895y5 = null;
            org.telegram.messenger.g0.h3(oVar);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.er0 er0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null) {
            f30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.X1;
        if (n6Var != null) {
            n6Var.e();
        }
        mv0 mv0Var = this.O;
        if (mv0Var != null && (er0Var = mv0Var.W) != null) {
            er0Var.f52366e = false;
            if (er0Var.f52365c != null) {
                er0Var.f52363a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null) {
            f30Var.j(i3, strArr, iArr);
        }
        if (i3 != 101 && i3 != 102) {
            if (i3 == 103 && this.E2 != null) {
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
                    org.telegram.messenger.r3 g12 = getMessagesController().g1(this.f41759f1, false, null);
                    TLRPC.Chat chat = this.E2;
                    if (g12 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.n1.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
                return;
            }
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41751e1));
        if (a22 == null) {
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
            if (i3 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.UserFull userFull = this.f41868v2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.n1.m(a22, z11, z12, getParentActivity(), this.f41868v2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
    }

    @Override
    public final void onResume() {
        TLRPC.User a22;
        org.telegram.ui.Components.voip.r0 r0Var;
        super.onResume();
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.f40083e1 = true;
            org.telegram.ui.Components.dr0 dr0Var = mv0Var.K;
            if (dr0Var != null) {
                dr0Var.f();
            }
            org.telegram.ui.Components.js0 js0Var = mv0Var.N;
            if (js0Var != null) {
                js0Var.f();
            }
            org.telegram.ui.Components.ks0 ks0Var = mv0Var.M;
            if (ks0Var != null) {
                ks0Var.X(false);
            }
            for (int i3 = 0; i3 < mv0Var.f40108n0.length; i3++) {
                mv0Var.e0(i3);
            }
            org.telegram.ui.Components.er0 er0Var = mv0Var.W;
            if (er0Var != null) {
                er0Var.f52366e = true;
                if (er0Var.f52365c != null) {
                    er0Var.f52363a.onResume();
                }
            }
        }
        t4();
        bw0 bw0Var = this.d;
        if (bw0Var != null) {
            this.U4 = true;
            bw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (r0Var = this.U) != null && r0Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null) {
            f30Var.k();
            setParentActivityTitle(org.telegram.messenger.bd.M0(2131745505, null));
        }
        I5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new f7(this, 5));
        }
        kk kkVar = this.f41757f;
        if (kkVar != null) {
            setParentActivityTitle(kkVar.getText());
        }
        if (this.f41751e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f41751e1))) != null && a22.photo == null && this.Q1 >= j4()) {
            this.f41787j2.cancel();
            float[] fArr = this.f41805m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            X4(1.0f);
            this.f41817o0.setVisibility(8);
            this.Q1 = j4();
            this.f41819o2 = false;
            this.f41735c.h1(0, j4() - this.f41719a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.X1;
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
            this.f41897z0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, this.A0));
            m5();
            M5();
            J3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.y4 y4Var;
        if (z10 && (y4Var = this.simpleActionBar) != null) {
            y4Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i3 = this.J1;
                if (i3 != 0 && this.M1) {
                    if (i3 == 1) {
                        this.f41793k2 = 0.0f;
                        org.telegram.ui.Components.ku0 ku0Var = this.T;
                        if (ku0Var != null) {
                            ku0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
                        if (gf0Var != null) {
                            gf0Var.setParentExpanded(0.0f);
                        }
                        Z4(0.0f);
                        org.telegram.ui.Components.cg0 cg0Var = this.f41736c0;
                        if (cg0Var != null) {
                            cg0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    O3();
                    if (this.I1) {
                        S3(true);
                    }
                }
                if (!this.f41808m5) {
                    this.f41808m5 = true;
                    this.V4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.Q4);
            org.telegram.ui.Components.voip.r0 r0Var = this.U;
            if (r0Var != null && r0Var.getVisibility() == 0) {
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
        org.telegram.ui.Components.voip.r0 r0Var = this.U;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            if (z10) {
                this.U.setAlpha(1.0f - f10);
            } else {
                this.U.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        mw0 mw0Var;
        ImageView imageView;
        org.telegram.ui.Components.gf0 gf0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.f41748d6 = z10;
        if (z10 && (gf0Var = this.f41720a0) != null) {
            ArrayList arrayList = gf0Var.f34074a;
            if (gf0Var.F == 6) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    org.telegram.ui.Components.df0 df0Var = (org.telegram.ui.Components.df0) arrayList.get(i3);
                    org.telegram.ui.Components.ch0 ch0Var = df0Var.f33072k;
                    if (ch0Var != null) {
                        if (df0Var.f33064a == 15) {
                            ch0Var.M(14);
                        } else {
                            ch0Var.M(0);
                        }
                        df0Var.f33072k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0)) {
            ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f41826p2) {
            this.G1 = true;
            if (!z10) {
                if (this.f41726a6 == null) {
                    this.f41726a6 = new float[14];
                }
                this.F1 = this.Q1;
                this.f41726a6[0] = this.Y.getScaleX();
                this.f41726a6[1] = this.Y.getTranslationX();
                this.f41726a6[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.gf0 gf0Var2 = this.f41720a0;
                if (gf0Var2 != null) {
                    this.f41726a6[3] = gf0Var2.getAlpha();
                }
                ci.z0 z0Var = this.f41874w0;
                if (z0Var != null) {
                    float[] fArr = this.f41726a6;
                    fArr[4] = z0Var.f6430e;
                    fArr[5] = z0Var.f6431f;
                }
                if (this.f41903z6 != null) {
                    this.f41726a6[6] = mw0Var.getAlpha();
                }
                this.f41726a6[7] = this.f41757f.getScaleX();
                this.f41726a6[8] = this.f41757f.getTranslationY();
                this.f41726a6[9] = this.f41838r.getTranslationY();
                this.f41726a6[10] = this.f41757f.getLayoutParams().width;
                float[] fArr2 = this.f41726a6;
                fArr2[11] = this.c2;
                fArr2[12] = this.f41757f.getTranslationX();
                this.f41726a6[13] = this.f41838r.getTranslationX();
                gi.l3 l3Var = this.B6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
            }
        }
        if (z10) {
            if (this.f41839r0 != null) {
                this.Q4 = getNotificationCenter().q(new int[]{org.telegram.messenger.hs.f23298s, org.telegram.messenger.hs.f23305t, org.telegram.messenger.hs.W, org.telegram.messenger.hs.X, org.telegram.messenger.hs.E0, org.telegram.messenger.hs.f23297r4}, this.Q4, true);
            } else {
                this.Q4 = getNotificationCenter().q(new int[]{org.telegram.messenger.hs.f23298s, org.telegram.messenger.hs.f23305t, org.telegram.messenger.hs.W, org.telegram.messenger.hs.X, org.telegram.messenger.hs.f23297r4}, this.Q4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.Z4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        Q3();
    }

    public final float p4() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
        }
        return 0.0f;
    }

    public final void p5() {
        float L;
        boolean z10;
        if (this.f41857t5 != null) {
            mv0 mv0Var = this.O;
            if (mv0Var != null && mv0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.g0.L(232.0f) - (this.f41719a.getMeasuredHeight() - this.O.getY());
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            int i3 = 0;
            if (L <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            qe.a aVar = this.N5;
            aVar.a(z10, true);
            float f10 = aVar.f53840e;
            this.f41857t5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
            this.f41857t5.setAlpha(f10);
            FrameLayout frameLayout = this.f41857t5;
            if (f10 <= 0.0f) {
                i3 = 4;
            }
            frameLayout.setVisibility(i3);
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
            if (acVar != null) {
                acVar.l();
            }
        }
    }

    public final int q4() {
        float f10;
        if (this.f41832q1) {
            return 0;
        }
        if (this.f41759f1 != 0 && org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.f41759f1)))) {
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
        boolean z10;
        gi.l3 l3Var = this.B6;
        if (l3Var != null) {
            float f10 = 0.0f;
            l3Var.p(0.0f, (this.f41757f.getScaleX() * this.f41757f.getRightDrawableX()) + this.f41757f.getX() + (-l3Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.g0.U1(this.f41800l2, this.f41805m2);
            gi.l3 l3Var2 = this.B6;
            l3Var2.setTranslationY(((this.f41757f.getY() + (-l3Var2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
            this.B6.j(i0.a.f(U1, this.C6, 1342177280));
            if (this.Q1 >= org.telegram.messenger.g0.L(82.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean bool = this.D6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.B6.animate();
            this.D6 = Boolean.valueOf(z10);
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f10), org.telegram.ui.Components.xq.f40453g, 200L);
        }
    }

    public final org.telegram.ui.Components.wq r4() {
        int i3;
        float f10;
        if (this.J == null) {
            this.f41889y = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            this.I = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.wo woVar = this.f41778h6;
            if (woVar != null) {
                if (woVar.o(org.telegram.ui.ActionBar.k6.I.q())) {
                    i3 = this.f41778h6.k();
                } else {
                    i3 = this.f41778h6.i();
                }
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, f10, i3);
                Drawable drawable = this.f41889y;
                int S0 = org.telegram.messenger.g0.S0(this.R5, 1.0f, b10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.I.setColorFilter(org.telegram.messenger.g0.S0(this.R5, 1.0f, -1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.A0)), mode);
            }
            this.J = new org.telegram.ui.Components.wq(new org.telegram.ui.Components.xp(this.f41889y, this.I), getParentActivity().getDrawable(2131232791));
        }
        return this.J;
    }

    public final void r5() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().q()) {
                this.V0.setIcon(2131231862);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231863);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0), PorterDuff.Mode.SRC_IN));
            this.Q6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232169);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new ei.m2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null) {
            f30Var.f33685f = bundle.getString("path");
        }
    }

    public final boolean s4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i3 = 0;
        if (!this.f41841r2 || (userFull = this.f41868v2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url == null) {
            ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
            int size = arrayList.size();
            while (i3 < size) {
                TLRPC.BotCommand botCommand = arrayList.get(i3);
                i3++;
                if ("privacy".equals(botCommand.command)) {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final void s5() {
        t5(this.f41771g6);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.f30 f30Var = this.f41839r0;
        if (f30Var != null && (str = f30Var.f33685f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        int i3;
        this.f41793k2 = f10;
        this.S1 = f10;
        Q3();
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setAlpha(f10);
        }
        if (this.J1 == 2) {
            this.f41758f0.setProgressToExpand(f10);
            org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
            if (gf0Var != null) {
                gf0Var.setParentExpanded(f10);
            }
            Z4(f10);
            org.telegram.ui.Components.cg0 cg0Var = this.f41736c0;
            if (cg0Var != null) {
                cg0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.ku0 ku0Var = this.T;
            if (ku0Var != null) {
                ku0Var.setParentExpanded(f10);
            }
            n5();
            E5();
        }
        this.f41719a.setAlpha(f10);
        this.f41719a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.J1 != 2 || (w02 = this.f41846s0) == 0) {
            if (this.f41751e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41759f1)) {
                    boolean z10 = this.E2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.u8.L;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var);
        }
        int i10 = this.Y4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.A0);
        }
        this.f41743d1.setBackgroundColor(i0.a.f(f10, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.zz0 zz0Var = this.m0;
        int f11 = i0.a.f(f10, i10, w02);
        zz0Var.f41203k = true;
        zz0Var.f41196b.setColor(f11);
        int i11 = -1;
        if (this.f41778h6 != null) {
            w03 = -1;
        } else {
            if (this.f41751e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41759f1)) {
                    boolean z11 = this.E2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.u8.L;
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27938g8, e6Var2);
        }
        this.actionBar.D(i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.A0), w03), false);
        if (this.f41778h6 == null) {
            i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000ji, this.A0);
        }
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.A0);
        kk kkVar = this.f41757f;
        if (kkVar != null && this.J1 != 2) {
            kkVar.setTextColor(i0.a.f(f10, w05, i11));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28113pi, this.A0);
        } else {
            if (this.f41751e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f41759f1)) {
                    boolean z12 = this.E2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.u8.L;
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956h8, e6Var3);
        }
        if (zArr[0]) {
            i3 = org.telegram.ui.ActionBar.k6.f28105pa;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.k6.w0(i3, this.A0);
        su0 su0Var = this.f41838r;
        if (su0Var != null && this.J1 != 2) {
            su0Var.setTextColor(i0.a.f(f10, w06, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.R1 * f10;
        long j10 = this.f41751e1;
        if (j10 == 0) {
            j10 = this.f41759f1;
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.u8.L;
        int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.e(j10)], e6Var4);
        long j11 = this.f41751e1;
        if (j11 == 0) {
            j11 = this.f41759f1;
        }
        int d = org.telegram.ui.Components.u8.d(j11);
        if (w07 != d) {
            this.f41831q0.h(i0.a.f(f10, d, w07));
            this.f41758f0.invalidate();
        }
        int i12 = this.Z4;
        if (i12 != 0) {
            setNavigationBarColor(i0.a.f(f10, i12, getNavigationBarColor()));
        }
        this.f41743d1.invalidate();
        y4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        wv0 wv0Var = this.f41756e6;
        if (wv0Var != null) {
            wv0Var.invalidate();
        }
        if (a() > 0) {
            qu0 qu0Var = this.f41758f0;
            if (qu0Var != null) {
                qu0Var.setProgressToStoriesInsets(this.S1);
            }
            tu0 tu0Var = this.f41866v0;
            if (tu0Var != null) {
                tu0Var.setProgressToStoriesInsets(this.S1);
            }
            ci.z0 z0Var = this.f41874w0;
            if (z0Var != null) {
                z0Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.q4 q4Var) {
        super.setParentLayout(q4Var);
        org.telegram.messenger.n6 n6Var = this.X1;
        if (n6Var != null) {
            n6Var.e();
            this.X1 = null;
        }
        if (q4Var != null && q4Var.getParentActivity() != null) {
            this.X1 = new org.telegram.messenger.n6(q4Var.getParentActivity().getWindow(), new jt0(this, 8));
        }
    }

    @Override
    public final boolean t() {
        return this.f41748d6;
    }

    public final void t4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41813n2 = z10;
    }

    public final void t5(float f10) {
        int S0;
        org.telegram.messenger.wo woVar = this.f41778h6;
        if (woVar != null) {
            S0 = i0.a.f(0.25f, woVar.m(org.telegram.ui.ActionBar.k6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.R5, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i3 = org.telegram.ui.ActionBar.k6.Cj;
        int f12 = i0.a.f(Math.max(this.R5, this.B5), f11, org.telegram.ui.ActionBar.k6.w0(i3, this.A0));
        org.telegram.ui.Components.e5 e5Var = this.G;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.e5 e5Var2 = this.H;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(i0.a.f(this.R5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.k6.w0(i3, this.A0))));
        }
        this.f41750e0.setColor(f12);
        this.f41771g6 = f10;
    }

    public final boolean u4() {
        if (this.E2 != null) {
            return getMessagesController().o2(this.E2);
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f41868v2;
        messagesController.getClass();
        return org.telegram.messenger.hp.K2(userFull);
    }

    public final void u5() {
        this.f41750e0.setScaleX(this.f41757f.getScaleX());
        this.f41750e0.setScaleY(this.f41757f.getScaleY());
        this.f41750e0.b((this.f41757f.getScaleX() * this.f41757f.getRightDrawableX()) + this.f41757f.getX(), (this.f41757f.getHeight() - (this.f41757f.getScaleY() * (this.f41757f.getHeight() - this.f41757f.getRightDrawableY()))) + this.f41757f.getY());
    }

    @Override
    public final void v() {
        this.f41719a.y0(0);
    }

    public final boolean v4() {
        if (this.f41839r0 != null && !this.f41847s1) {
            return true;
        }
        return false;
    }

    public final void v5() {
        if (!this.f41832q1 && org.telegram.messenger.t3.c0(this.E2)) {
            org.telegram.messenger.us notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f24934a.c(new org.telegram.messenger.a4(notificationsController, -this.f41759f1, new du0(this), 6));
        }
    }

    public final void w4(boolean z10) {
        boolean z11;
        boolean c02 = org.telegram.messenger.t3.c0(this.E2);
        TLRPC.Chat chat = this.E2;
        if (!c02 && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.t4.r(this, false, chat, null, false, z11, z10, !c02, new jt0(this, 3));
    }

    public final void w5(float f10) {
        cw0 cw0Var;
        ValueAnimator valueAnimator;
        if (this.f41826p2 || ((cw0Var = this.N) != null && (valueAnimator = cw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f41719a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f10);
            this.N.requestLayout();
        }
        ow0 ow0Var = this.f41743d1;
        if (ow0Var != null) {
            ow0Var.F.setTranslate(0.0f, this.f41722a2 - ow0Var.f48374y);
            ow0 ow0Var2 = this.f41743d1;
            RadialGradient radialGradient = ow0Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(ow0Var2.F);
            }
            this.f41743d1.invalidate();
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
        if (getMessagesController().P1().K(a()) && !this.f41832q1) {
            return true;
        }
        return false;
    }

    public final void x5() {
        boolean z10;
        boolean z11;
        boolean z12;
        float a10;
        float f10 = 0.0f;
        if (!this.f41832q1 && !this.G1) {
            int e42 = e4();
            if (e42 > 0) {
                a10 = b8.be.a(1.0f - (this.Q1 / e42), 0.0f, 1.0f);
            } else {
                a10 = b8.be.a((this.c2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f10 = a10;
        }
        float f11 = this.B5;
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
            this.B5 = f10;
            kk kkVar = this.f41757f;
            if (kkVar != null) {
                kkVar.setTextColor(this.E5);
            }
            su0 su0Var = this.f41838r;
            if (su0Var != null) {
                su0Var.setTextColor(this.F5);
            }
            s5();
            if (z12) {
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, Boolean.TRUE);
            }
            ow0 ow0Var = this.f41743d1;
            if (ow0Var != null) {
                ow0Var.invalidate();
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
    public final boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
        Bundle k10 = a1.g.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j10)) {
            k10.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.m5.E(j10)) {
            k10.putLong("user_id", j10);
        } else if (org.telegram.messenger.m5.z(j10)) {
            k10.putLong("chat_id", -j10);
        }
        if (!getMessagesController().E(k10, uwVar, null, null)) {
            return false;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.hs.f23305t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new wm(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.wy.g(getMessagesController().a2(Long.valueOf(this.f41751e1)), j10, null, null, null, null, z11, i3, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.yy.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j10, 0L, z11, i3, i10);
        }
        return true;
    }

    public final void y4(boolean z10) {
        int i3;
        int i10;
        float f10;
        float f11;
        float f12;
        float U1;
        org.telegram.ui.Components.k9 currentItemView;
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
        kk kkVar;
        int w02;
        float f19;
        int i14;
        boolean z11;
        TLRPC.ChatFull chatFull;
        int i15;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
        float L3 = L3();
        hu0 hu0Var = this.f41719a;
        if (hu0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) hu0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f41719a.setLayoutParams(layoutParams2);
            }
        }
        O5(z10);
        if (this.Y != null) {
            this.f41719a.setTopGlowOffset((int) this.Q1);
            hu0 hu0Var2 = this.f41719a;
            if (this.Q1 > j4() && this.Q1 < (e4() + this.f41719a.getMeasuredWidth()) - currentActionBarHeight) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            hu0Var2.setOverScrollMode(i15);
        }
        if (this.Y != null && !this.f41748d6 && this.G1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.Y != null) {
            if (this.f41720a0 != null && this.f41759f1 != 0) {
                if (org.telegram.messenger.t3.T(this.E2) && !this.E2.megagroup && (chatFull = this.f41861u2) != null && chatFull.linked_chat_id != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f41720a0.o(2, z11);
            }
            O5(z10);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f22602m;
            } else {
                i10 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, i10) - org.telegram.messenger.g0.L(21.0f));
            if (!this.G1) {
                org.telegram.ui.Components.zf0 zf0Var = this.f41859u0;
                if (zf0Var != null) {
                    f19 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.tr trVar = zf0Var.f41039n;
                    if (trVar != null && trVar.f25585c) {
                        f19 = trVar.f25586e.centerY();
                    }
                } else {
                    f19 = -org.telegram.messenger.g0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.g0.f22602m;
                } else {
                    i14 = 0;
                }
                this.f41722a2 = org.telegram.messenger.g0.T1(f19, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14) - org.telegram.messenger.g0.L(21.0f)), L3);
            } else {
                this.f41722a2 = translationY;
            }
            if (this.G1) {
                f10 = this.R1;
            } else {
                f10 = this.Q1;
            }
            float f20 = j42;
            if (f10 <= f20 && !this.f41826p2) {
                f11 = 2.0f;
                f12 = 18.0f;
            } else {
                f11 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f10 - f20) / ((this.f41719a.getMeasuredWidth() - currentActionBarHeight) - k4())));
                this.f41774h2 = max;
                f12 = 18.0f;
                this.f41730b2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.c2 = 0.0f;
                tu0 tu0Var = this.f41866v0;
                if (tu0Var != null) {
                    tu0Var.invalidate();
                }
                ci.z0 z0Var = this.f41874w0;
                if (z0Var != null) {
                    z0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.f41781i2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z12 = this.f41819o2;
                int i16 = org.telegram.messenger.hs.f23297r4;
                float[] fArr = this.f41805m2;
                if (z12 && (this.G0 || this.f41774h2 >= 0.33f)) {
                    if (!this.f41826p2) {
                        if (this.T0 != null) {
                            if (!u4()) {
                                this.T0.S(21);
                            } else {
                                this.T0.t(21);
                            }
                            if (this.f41839r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.t(33);
                                this.T0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var = this.U0;
                        if (f5Var != null) {
                            f5Var.setEnabled(false);
                        }
                        this.f41826p2 = true;
                        org.telegram.messenger.hs.e().k(i16, Boolean.TRUE);
                        this.N.f(true, min);
                        this.f41824p0.b(min);
                        this.f41817o0.setCreateThumbFromParent(true);
                        this.f41817o0.getAdapter().g();
                        this.f41787j2.cancel();
                        fArr[0] = org.telegram.messenger.g0.U1(this.f41800l2, fArr);
                        fArr[1] = 1.0f;
                        tu0 tu0Var2 = this.f41866v0;
                        if (tu0Var2 != null && !tu0Var2.f42036x.isEmpty()) {
                            this.f41787j2.setInterpolator(new w1.a());
                            this.f41787j2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f41787j2.setInterpolator(org.telegram.ui.Components.xq.f40455j);
                            this.f41787j2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f41787j2.addListener(new uu0(this, 4));
                        View m10 = this.f41735c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i11 = org.telegram.messenger.g0.f22602m;
                            } else {
                                i11 = 0;
                            }
                            this.f41719a.x0(((m10.getTop() - this.f41719a.getMeasuredWidth()) - e4()) + currentActionBarHeight2 + i11, (int) this.f41787j2.getDuration(), (Interpolator) this.f41787j2.getInterpolator());
                            this.f41719a.P0 = false;
                        }
                        this.f41734b6 = this.f41757f.getTranslationY();
                        this.f41741c6 = this.f41838r.getTranslationY();
                        this.f41787j2.start();
                        this.f41817o0.setAlpha(0.0f);
                        this.f41817o0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f41817o0.getLayoutParams();
                    int i17 = layoutParams3.height;
                    layoutParams3.width = this.f41719a.getMeasuredWidth();
                    float f21 = currentActionBarHeight + f10;
                    int i18 = (int) f21;
                    layoutParams3.height = i18;
                    if (i17 != i18) {
                        this.f41817o0.requestLayout();
                    }
                    if (!this.f41787j2.isRunning()) {
                        if (this.G1 && this.J1 == 2) {
                            f13 = (-(1.0f - this.S1)) * org.telegram.messenger.g0.L(50.0f);
                        } else {
                            f13 = 0.0f;
                        }
                        this.f41757f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f41757f.getLeft());
                        this.f41757f.setTranslationY((((f21 - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f41757f.getBottom()) + f13);
                        this.f41838r.setTranslationX(m4(org.telegram.messenger.g0.N(16.0f) - this.f41838r.getLeft(), 0.0f));
                        this.f41838r.setTranslationY(n4((((f21 - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.f41838r.getBottom()) + f13));
                        q5();
                    }
                } else {
                    if (this.f41826p2) {
                        this.f41826p2 = false;
                        org.telegram.messenger.hs.e().k(i16, Boolean.TRUE);
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.T0;
                        if (f5Var2 != null) {
                            f5Var2.t(21);
                            if (this.f41839r0 != null) {
                                this.T0.t(33);
                                this.T0.t(34);
                                this.T0.t(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var3 = this.U0;
                        if (f5Var3 != null) {
                            f5Var3.setEnabled(!this.f41898z1);
                        }
                        this.N.f(false, min);
                        this.f41824p0.b(min);
                        this.f41787j2.cancel();
                        this.f41758f0.getImageReceiver().f21272u0 = true;
                        this.f41758f0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.g0.U1(this.f41800l2, fArr);
                        fArr[1] = 0.0f;
                        this.f41787j2.setInterpolator(org.telegram.ui.Components.xq.f40455j);
                        if (!this.f41813n2) {
                            this.f41787j2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f41787j2.setDuration(0L);
                        }
                        this.f41743d1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.A0));
                        if (!this.I0 && (currentItemView = this.f41817o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.x41) {
                                this.f41758f0.f48132b0 = false;
                            } else {
                                qu0 qu0Var = this.f41758f0;
                                qu0Var.f48132b0 = true;
                                qu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f41787j2.addListener(new uu0(this, 5));
                        this.f41758f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.f41817o0.setAlpha(0.0f);
                        this.f41787j2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.Y.setScaleX(this.f41730b2);
                    this.Y.setScaleY(this.f41730b2);
                    d4();
                    ValueAnimator valueAnimator = this.f41787j2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        R4();
                        this.f41757f.setTranslationY(this.f41752e2);
                        this.f41838r.setTranslationX(m4(this.f41760f2, this.f41880w6));
                        this.f41838r.setTranslationY(n4(this.f41767g2));
                        q5();
                    }
                }
            }
            boolean z13 = this.G1;
            if (z13 && this.J1 == 2) {
                float f22 = this.f41764f6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f22602m;
                } else {
                    i13 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f11) + i13) - (org.telegram.messenger.g0.f22607p * 21.0f));
                this.f41757f.setPivotY(kkVar.getMeasuredHeight());
                this.f41757f.setScaleX(1.38f);
                this.f41757f.setScaleY(1.38f);
                this.f41730b2 = org.telegram.messenger.g0.W1(this.S1, 42, 138) / 100.0f;
                this.c2 = 0.0f;
                tu0 tu0Var3 = this.f41866v0;
                if (tu0Var3 != null) {
                    tu0Var3.setExpandProgress(1.0f);
                }
                ci.z0 z0Var2 = this.f41874w0;
                if (z0Var2 != null) {
                    z0Var2.setExpandProgress(1.0f);
                }
                this.f41758f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.S1));
                this.Y.setTranslationX(org.telegram.messenger.g0.T1(f22, 0.0f, this.S1));
                this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.S1));
                float measuredWidth = ((this.f41730b2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.f41779i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.f41779i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.f41785j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41785j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.f41792k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41792k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.f41798l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f41798l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.f41730b2);
                this.Y.setScaleY(this.f41730b2);
                this.f41817o0.setAlpha(0.0f);
                this.f41817o0.setVisibility(0);
                qu0 qu0Var2 = this.f41758f0;
                float f23 = this.S1;
                float f24 = this.f41730b2;
                qu0Var2.I = f23;
                qu0Var2.J = f24;
                qu0Var2.H = true;
                this.N.e(false, f23);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                int i19 = -1;
                if (this.f41778h6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, this.A0);
                }
                kVar.D(i0.a.f(this.S1, w02, -1), false);
                org.telegram.ui.Components.kk0 kk0Var = this.L;
                if (kk0Var != null) {
                    kk0Var.b(i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956h8, this.A0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f41881x;
                if (drawable != null) {
                    if (this.f41778h6 == null) {
                        i19 = i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27885dd, this.A0), -1);
                    }
                    drawable.setColorFilter(i19, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = this.J;
                if (wqVar != null) {
                    wqVar.a(this.S1);
                    this.f41757f.invalidate();
                }
                org.telegram.ui.Components.wq wqVar2 = this.K;
                if (wqVar2 != null) {
                    wqVar2.a(this.S1);
                    this.f41757f.invalidate();
                }
                t5(this.S1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.f41719a.getMeasuredWidth() / this.f41730b2, this.S1);
                layoutParams4.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + currentActionBarHeight) / this.f41730b2, this.S1);
                this.Y.requestLayout();
                q5();
            } else if (f10 <= f20) {
                if (z13) {
                    this.f41730b2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.c2 = 0.0f;
                    f15 = 1.0f;
                } else {
                    org.telegram.ui.Components.zf0 zf0Var2 = this.f41859u0;
                    if (zf0Var2 != null) {
                        f14 = zf0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f14 = 24.0f;
                    }
                    this.f41730b2 = org.telegram.messenger.g0.T1(f14, 96.0f, L3) / 100.0f;
                    f15 = 1.0f;
                    this.c2 = 1.0f - L3;
                }
                org.telegram.ui.Components.gf0 gf0Var = this.f41720a0;
                if (gf0Var != null) {
                    if (this.G1) {
                        gf0Var.setAlpha(this.S1);
                    } else {
                        gf0Var.setAlpha(f15);
                    }
                }
                tu0 tu0Var4 = this.f41866v0;
                if (tu0Var4 != null) {
                    tu0Var4.invalidate();
                }
                ci.z0 z0Var3 = this.f41874w0;
                if (z0Var3 != null) {
                    z0Var3.h = this.G1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (z0Var3.f6431f != l10) {
                        z0Var3.f6431f = l10;
                        z0Var3.invalidate();
                    }
                }
                float f25 = (0.12f * L3) + 1.0f;
                ValueAnimator valueAnimator2 = this.f41787j2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f41787j2;
                    uu0 uu0Var = this.Z5;
                    valueAnimator3.removeListener(uu0Var);
                    this.f41787j2.addListener(uu0Var);
                } else {
                    this.Y.setScaleX(this.f41730b2);
                    this.Y.setScaleY(this.f41730b2);
                    d4();
                    this.Y.setTranslationY((float) Math.ceil(this.f41722a2));
                    float L = (((this.f41730b2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.f41779i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                    this.f41779i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                    this.f41785j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41785j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                    this.f41792k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41792k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                    this.f41798l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f41798l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.g0.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight());
                if (this.G1) {
                    f16 = this.S1;
                } else {
                    f16 = L3;
                }
                float f26 = (N * f16) + floor;
                this.f41752e2 = com.google.android.recaptcha.internal.a.y(1.0f, this.S1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + f26);
                this.f41767g2 = (((float) Math.floor(org.telegram.messenger.g0.f22607p * 11.0f)) * L3) + f26 + org.telegram.messenger.g0.L(24.0f);
                if (this.G1) {
                    f17 = (this.f41764f6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                } else {
                    f17 = -org.telegram.messenger.g0.N(46.0f);
                }
                mw0 mw0Var = this.f41903z6;
                if (mw0Var != null) {
                    mw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.f41719a.getMeasuredWidth();
                this.f41757f.setScaleX(f25);
                this.f41757f.setScaleY(f25);
                z4(0, L3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f41757f.getLayoutParams();
                float f27 = measuredWidth2 / f11;
                float min2 = f27 - (((Math.min(this.f41757f.getExactWidth(), layoutParams5.width) * f25) * 0.5f) + layoutParams5.leftMargin);
                float f28 = ((FrameLayout.LayoutParams) this.f41838r.getLayoutParams()).width;
                if (!this.f41836q5 && this.f41838r.getExactWidth() <= (f28 - this.f41838r.getPaddingLeft()) - this.f41838r.getPaddingRight()) {
                    f18 = this.f41838r.getPaddingLeft();
                } else {
                    f18 = 0.0f;
                }
                float min3 = f27 - ((Math.min(this.f41838r.getExactWidth(), f28) * 0.5f) + (layoutParams.leftMargin + f18));
                this.f41744d2 = min2;
                this.f41760f2 = min3;
                this.f41880w6 = f18;
                if (this.G1) {
                    min2 = org.telegram.messenger.g0.T1(f17, min2, L3);
                    min3 = org.telegram.messenger.g0.T1(f17, min3, L3);
                }
                ValueAnimator valueAnimator4 = this.f41787j2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f41757f.setTranslationX(min2);
                    this.f41757f.setTranslationY(this.f41752e2);
                    this.f41838r.setTranslationX(m4(min3, this.f41880w6 * L3));
                    this.f41838r.setTranslationY(n4(this.f41767g2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f41757f.getLayoutParams();
                int i20 = layoutParams6.width;
                if (org.telegram.messenger.g0.Q1()) {
                    i12 = org.telegram.messenger.g0.L(490.0f);
                } else {
                    i12 = org.telegram.messenger.g0.f22608q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i12 - org.telegram.messenger.g0.L(f12)) / this.f41757f.getScaleX()) - (this.f41757f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i20) {
                    this.f41757f.requestLayout();
                }
                q5();
            }
            ValueAnimator valueAnimator5 = this.f41787j2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                z4(0, L3, true);
            }
        }
        w5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f41758f0.setAlpha(1.0f);
        }
    }

    public final void y5() {
        mv0 mv0Var = this.O;
        if (mv0Var != null && this.W5 != 0) {
            int topPanelShift = mv0Var.getTopPanelShift();
            int i3 = 0;
            if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
                if (this.O.getParent() == this.f41719a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
                }
                i3 = topPanelShift;
            }
            int i10 = this.W5 + i3;
            c5(i10, this.C5);
            c5(i10, this.U5);
        }
    }

    public final void z4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.z4(int, float, boolean):void");
    }

    public final void z5() {
        boolean z10;
        float f10;
        if (this.C5 != null && this.U5 != null) {
            mv0 mv0Var = this.O;
            int i3 = 0;
            if (mv0Var != null && mv0Var.getParent() == this.f41719a && this.O.isAttachedToWindow()) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(Math.min(this.B5, this.M5), this.R5);
            View view = this.C5;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = max;
            }
            view.setAlpha(f10);
            this.C5.setVisibility((z10 || max <= 0.0f) ? 8 : 8);
            View view2 = this.U5;
            if (!z10) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z10) {
                this.U5.setTranslationY(-(this.O.getY() + this.f41719a.getY()));
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.os0 os0Var) {
        super(bundle);
        this.h = null;
        this.f41810n = null;
        this.f41882x0 = null;
        this.f41890y0 = new org.telegram.ui.Components.p30(this, 2);
        this.f41897z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.f41729b1 = 1.0f;
        this.C1 = new a0.h();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.f41805m2 = new float[]{0.0f, 1.0f};
        this.f41833q2 = new Paint();
        this.B2 = -1;
        this.L2 = new Rect();
        this.R4 = new ArrayList();
        this.S4 = new ArrayList();
        this.T4 = 0;
        this.U4 = true;
        this.V4 = true;
        this.Y4 = 0;
        this.Z4 = 0;
        this.f41725a5 = 0;
        this.f41733b5 = 0L;
        this.f41783i5 = new HashSet();
        this.f41796k5 = new wu0(this, 0);
        this.f41803l5 = new cv0(this);
        this.I5 = new gu0(this);
        this.M5 = 1.0f;
        this.N5 = new qe.a(0, new jt0(this, 7), org.telegram.ui.Components.xq.h, 380L, true);
        this.T5 = new wu0(this, 1);
        this.Z5 = new uu0(this, 2);
        this.f41726a6 = null;
        this.f41784i6 = new SparseIntArray();
        this.f41797k6 = null;
        this.f41804l6 = -1;
        this.f41837q6 = new int[3];
        this.f41844r6 = -1.0f;
        si.b bVar = new si.b();
        this.K6 = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.L6 = cVar;
        this.N6 = new Paint();
        this.S6 = new int[7];
        this.R = os0Var;
        cVar.f9985g = new ue.b();
    }

    @Override
    public final void T() {
    }
}
