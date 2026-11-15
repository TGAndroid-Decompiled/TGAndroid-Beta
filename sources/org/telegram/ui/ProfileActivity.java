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
public class ProfileActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, sw, org.telegram.ui.Components.rs0, org.telegram.ui.Components.l30, org.telegram.ui.Components.nr0, ie0 {
    public static final RectF X6 = new RectF();
    public static final int Y6 = org.telegram.messenger.g0.L(16.0f);
    public org.telegram.ui.ActionBar.e6 A0;
    public boolean A1;
    public CharSequence A2;
    public int A3;
    public int A4;
    public hi.d[] A5;
    public float A6;
    public int B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public ai.k2 B5;
    public float B6;
    public org.telegram.messenger.gc C0;
    public a0.h C1;
    public int C2;
    public int C3;
    public int C4;
    public FrameLayout C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public hi.d D5;
    public tw0 D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public float E5;
    public zw0 E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public View F5;
    public hi.l3 F6;
    public org.telegram.ui.Components.e5 G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public int G5;
    public int G6;
    public org.telegram.ui.Components.e5 H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public int H5;
    public Boolean H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public TLRPC.TL_emojiStatusCollectible I6;
    public org.telegram.ui.Components.dr J;
    public boolean J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public boolean J4;
    public int J5;
    public int J6;
    public org.telegram.ui.Components.dr K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public boolean K4;
    public gh.e K5;
    public boolean K6;
    public org.telegram.ui.Components.lk0 L;
    public boolean L0;
    public boolean L1;
    public org.telegram.messenger.gc L2;
    public int L3;
    public int L4;
    public final nu0 L5;
    public int L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public int M4;
    public org.telegram.ui.Components.lf0 M5;
    public int M6;
    public jw0 N;
    public boolean N0;
    public boolean N1;
    public org.telegram.ui.Cells.l8 N2;
    public int N3;
    public int N4;
    public float N5;
    public int N6;
    public uv0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public final ui.b O6;
    public org.telegram.ui.Components.cv0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public boolean P4;
    public float P5;
    public final dh.c P6;
    public boolean Q;
    public org.telegram.ui.ActionBar.d5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public final te.a Q5;
    public di.f Q6;
    public org.telegram.ui.Components.qs0 R;
    public org.telegram.ui.ActionBar.d5 R0;
    public float R1;
    public int R2;
    public int R3;
    public int R4;
    public fv0 R5;
    public final Paint R6;
    public boolean S;
    public org.telegram.ui.ActionBar.d5 S0;
    public float S1;
    public int S2;
    public int S3;
    public final ArrayList S4;
    public AnimatorSet S5;
    public Drawable S6;
    public org.telegram.ui.Components.mu0 T;
    public org.telegram.ui.ActionBar.d5 T0;
    public float T1;
    public int T2;
    public int T3;
    public final ArrayList T4;
    public AnimatorSet T5;
    public Drawable T6;
    public rv U;
    public org.telegram.ui.ActionBar.d5 U0;
    public int U1;
    public int U2;
    public int U3;
    public int U4;
    public float U5;
    public Drawable U6;
    public org.telegram.ui.Components.ch0 V;
    public org.telegram.ui.ActionBar.z0 V0;
    public float V1;
    public int V2;
    public int V3;
    public boolean V4;
    public boolean V5;
    public org.telegram.ui.Components.eq V6;
    public org.telegram.ui.Components.ch0 W;
    public org.telegram.ui.ActionBar.z0 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public boolean W4;
    public final dv0 W5;
    public final int[] W6;
    public hi.l3 X;
    public org.telegram.ui.ActionBar.z0 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public cv0 X4;
    public View X5;
    public k0 Y;
    public ImageView Y0;
    public org.telegram.messenger.n6 Y1;
    public int Y2;
    public int Y3;
    public View Y4;
    public int Y5;
    public ai.j0 Z;
    public org.telegram.ui.ActionBar.z0 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public float Z4;
    public int Z5;
    public ou0 f43062a;
    public org.telegram.ui.Components.hf0 f43063a0;
    public org.telegram.messenger.qe f43064a1;
    public float f43065a2;
    public int f43066a3;
    public int f43067a4;
    public int f43068a5;
    public CharSequence f43069a6;
    public org.telegram.ui.Components.uj0 f43070b;
    public org.telegram.messenger.hp f43071b0;
    public float f43072b1;
    public float f43073b2;
    public int f43074b3;
    public int f43075b4;
    public int f43076b5;
    public boolean f43077b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ru0 f43078c;
    public org.telegram.ui.Components.cg0 f43079c0;
    public int f43080c1;
    public float f43081c2;
    public int f43082c3;
    public int f43083c4;
    public int f43084c5;
    public final bv0 f43085c6;
    public iw0 d;
    public org.telegram.ui.Components.if0 f43086d0;
    public vw0 f43087d1;
    public float d2;
    public int f43088d3;
    public int f43089d4;
    public long f43090d5;
    public float[] f43091d6;
    public sw0 f43092e;
    public org.telegram.ui.Cells.o f43093e0;
    public long f43094e1;
    public float f43095e2;
    public int f43096e3;
    public int f43097e4;
    public boolean f43098e5;
    public float f43099e6;
    public ok f43100f;
    public xu0 f43101f0;
    public long f43102f1;
    public float f43103f2;
    public int f43104f3;
    public int f43105f4;
    public boolean f43106f5;
    public float f43107f6;
    public AnimatorSet f43108g0;
    public long f43109g1;
    public float f43110g2;
    public int f43111g3;
    public int f43112g4;
    public String f43113g5;
    public boolean f43114g6;
    public String h;
    public org.telegram.ui.Cells.b4 f43115h0;
    public boolean f43116h1;
    public float f43117h2;
    public int f43118h3;
    public int f43119h4;
    public String f43120h5;
    public dw0 f43121h6;
    public ImageView f43122i0;
    public long f43123i1;
    public float f43124i2;
    public int f43125i3;
    public int f43126i4;
    public String f43127i5;
    public float f43128i6;
    public ImageView f43129j0;
    public boolean f43130j1;
    public float f43131j2;
    public int j3;
    public int f43132j4;
    public yw f43133j5;
    public final RectF f43134j6;
    public ImageView f43135k0;
    public boolean f43136k1;
    public ValueAnimator f43137k2;
    public int f43138k3;
    public int f43139k4;
    public org.telegram.ui.Components.qg f43140k5;
    public float f43141k6;
    public ImageView f43142l0;
    public boolean l1;
    public float f43143l2;
    public int f43144l3;
    public int f43145l4;
    public final HashSet f43146l5;
    public org.telegram.messenger.cp f43147l6;
    public org.telegram.ui.Components.c01 m0;
    public long f43148m1;
    public float f43149m2;
    public int f43150m3;
    public int f43151m4;
    public CharacterStyle f43152m5;
    public final SparseIntArray f43153m6;
    public String f43154n;
    public org.telegram.ui.Components.nf0 f43155n0;
    public boolean n1;
    public final float[] f43156n2;
    public int f43157n3;
    public int f43158n4;
    public final dv0 f43159n5;
    public int f43160n6;
    public yu0 f43161o0;
    public boolean f43162o1;
    public boolean f43163o2;
    public int f43164o3;
    public int o4;
    public final jv0 f43165o5;
    public AnimatorSet f43166o6;
    public lw0 f43167p0;
    public boolean f43168p1;
    public boolean f43169p2;
    public int f43170p3;
    public int f43171p4;
    public boolean f43172p5;
    public int f43173p6;
    public org.telegram.ui.Components.t8 f43174q0;
    public boolean f43175q1;
    public boolean f43176q2;
    public int f43177q3;
    public int f43178q4;
    public sv0 f43179q5;
    public int f43180q6;
    public zu0 f43181r;
    public org.telegram.ui.Components.m30 f43182r0;
    public boolean f43183r1;
    public final Paint f43184r2;
    public int f43185r3;
    public int f43186r4;
    public float f43187r5;
    public boolean f43188r6;
    public org.telegram.ui.Components.fh0 f43189s;
    public int f43190s0;
    public boolean f43191s1;
    public boolean f43192s2;
    public int f43193s3;
    public int f43194s4;
    public float s5;
    public boolean f43195s6;
    public org.telegram.ui.Components.c01 f43196t0;
    public boolean f43197t1;
    public ki.s0 f43198t2;
    public int f43199t3;
    public int f43200t4;
    public boolean f43201t5;
    public org.telegram.ui.Components.fh0 t6;
    public org.telegram.ui.Components.zf0 f43202u0;
    public int f43203u1;
    public ki.r f43204u2;
    public int f43205u3;
    public int f43206u4;
    public boolean f43207u5;
    public final int[] f43208u6;
    public av0 f43209v0;
    public boolean f43210v1;
    public TLRPC.ChatFull f43211v2;
    public int f43212v3;
    public int f43213v4;
    public ImageReceiver f43214v5;
    public float f43215v6;
    public AnimatorSet f43216w;
    public di.u0 f43217w0;
    public boolean f43218w1;
    public TLRPC.UserFull f43219w2;
    public int f43220w3;
    public int f43221w4;
    public FrameLayout f43222w5;
    public CharSequence f43223w6;
    public Drawable f43224x;
    public View f43225x0;
    public boolean f43226x1;
    public org.telegram.ui.Cells.d6 f43227x2;
    public int f43228x3;
    public int f43229x4;
    public FrameLayout[] f43230x5;
    public CharSequence f43231x6;
    public Drawable f43232y;
    public final org.telegram.ui.Components.w30 f43233y0;
    public int f43234y1;
    public boolean f43235y2;
    public int f43236y3;
    public int f43237y4;
    public SpannableStringBuilder f43238y5;
    public boolean f43239y6;
    public final Paint f43240z0;
    public boolean f43241z1;
    public ww0 f43242z2;
    public int f43243z3;
    public int f43244z4;
    public SpannableStringBuilder f43245z5;
    public float f43246z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity C4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void F3(ProfileActivity profileActivity, boolean z10) {
        Drawable t6 = profileActivity.f43101f0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.g51) {
            profileActivity.f43101f0.w(null, null, t6);
        } else if (t6 instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) t6;
            profileActivity.f43101f0.w(null, null, t5Var);
            if (z10) {
                t5Var.f(profileActivity.f43101f0);
            }
        } else {
            org.telegram.messenger.gc D = profileActivity.f43161o0.D(0);
            if (D != null && D.f23724p == 2) {
                str = "avatar";
            }
            profileActivity.f43101f0.w(D, str, t6);
        }
    }

    public static int J0(ProfileActivity profileActivity) {
        int i7;
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null && kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public static void M3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = X6;
            if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean J0 = org.telegram.ui.Components.ys0.J0(profileActivity.O.getClosestTab());
        if (i7 == profileActivity.J6 && J0 == profileActivity.K6) {
            return;
        }
        profileActivity.J6 = i7;
        profileActivity.K6 = J0;
        if (J0) {
            if (i7 > 0) {
                profileActivity.A5[0].i(org.telegram.messenger.hd.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.A5[0].i(profileActivity.f43245z5, true, true);
            }
        } else if (i7 <= 0 && org.telegram.messenger.np.s1(profileActivity.currentAccount).X4()) {
            profileActivity.A5[0].i(profileActivity.f43238y5, true, true);
        } else {
            profileActivity.A5[0].i(org.telegram.messenger.hd.G(i7, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public static ValueAnimator P0(ProfileActivity profileActivity, final boolean z10) {
        float f10;
        boolean z11;
        int i7;
        if (z10) {
            org.telegram.messenger.g0.a3(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.l3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.W1.cancel();
        }
        di.u0 u0Var = profileActivity.f43217w0;
        if (u0Var != null) {
            u0Var.setActive(!z10);
        }
        float f11 = profileActivity.V1;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        final float f12 = profileActivity.Q1;
        profileActivity.f43070b.setTranslationY(f12);
        profileActivity.f43070b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f43062a.setVisibility(0);
        profileActivity.A4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f43100f.setVisibility(0);
        profileActivity.f43181r.setVisibility(0);
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
        org.telegram.ui.ActionBar.d5 d5Var = profileActivity.T0;
        if (d5Var != null) {
            d5Var.setVisibility(i7);
        }
        profileActivity.U0.setVisibility(i7);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.V1 <= 0.5f) {
            i10 = 0;
        }
        searchContainer.setVisibility(i10);
        profileActivity.f43070b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.b0(ProfileActivity.this, ofFloat, f12, z10);
            }
        });
        ofFloat.addListener(new lv0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.W4 = true;
            profileActivity.V4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.er.f34420f);
        profileActivity.W1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        boolean z10;
        int i7;
        if (profileActivity.f43169p2) {
            if (profileActivity.f43176q2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f23603m;
                } else {
                    i7 = 0;
                }
                profileActivity.f43062a.w0(0, ((view.getTop() - profileActivity.f43062a.getMeasuredWidth()) - profileActivity.d4()) + currentActionBarHeight + i7, org.telegram.ui.Components.er.h);
                return;
            }
            profileActivity.f43062a.w0(0, view.getTop() - profileActivity.i4(), org.telegram.ui.Components.er.h);
            return;
        }
        if (profileActivity.d4() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f11 = profileActivity.Q1;
            if (f11 > 0.0f && ((f11 < profileActivity.i4() * 0.6f || f10 < -1000.0f) && profileActivity.Q1 > profileActivity.d4() * 0.6f)) {
                profileActivity.f43062a.w0(0, (int) (profileActivity.Q1 - profileActivity.d4()), org.telegram.ui.Components.er.h);
                return;
            }
        }
        if (z10) {
            float f12 = profileActivity.Q1;
            if (f12 > 0.0f && f12 < profileActivity.d4() * 0.6f) {
                profileActivity.f43062a.w0(0, (int) profileActivity.Q1, org.telegram.ui.Components.er.h);
                return;
            }
        }
        if (!z10) {
            float f13 = profileActivity.Q1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.f43062a.w0(0, (int) f13, org.telegram.ui.Components.er.h);
                return;
            }
        }
        if (profileActivity.Q1 > 0.0f) {
            profileActivity.f43062a.w0(0, view.getTop() - profileActivity.i4(), org.telegram.ui.Components.er.h);
        }
    }

    public static SpannableStringBuilder V3(String str, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        fz fzVar = new fz(9);
        fzVar.f47243w = str;
        if (fzVar.f47237c != null) {
            fzVar.f47237c = null;
            fzVar.a();
        }
        fzVar.f47239f = w02;
        fzVar.f47240n = false;
        spannableStringBuilder.setSpan(fzVar, 0, spannableStringBuilder.length(), 0);
        fz[] fzVarArr = (fz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fz.class);
        if (fzVarArr != null) {
            for (fz fzVar2 : fzVarArr) {
                fzVar2.getClass();
                fzVar2.f47239f = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                fzVar2.f47241r = i7;
                fzVar2.f47242s = e6Var;
                fzVar2.f47240n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void X4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        t1Var.f29637j0 = false;
        t1Var.show();
        Utilities.f22416e.c(new f60(t1Var, z10, activity));
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.gy0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.xb h;
        if (profileActivity.K2 == null) {
            if (profileActivity.f43175q1 && !profileActivity.getMessagesController().D3()) {
                ArrayList l10 = profileActivity.getMessagesController().f25383r7.l(profileActivity.f43102f1);
                if (l10 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i7 = 0; tL_forumTopic == null && i7 < l10.size(); i7++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i7);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f28103id == profileActivity.f43109g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j3 = tL_forumTopic.icon_emoji_id;
                        if (j3 != 0 && (e10 = org.telegram.ui.Components.g5.e(profileActivity.currentAccount, j3)) != null && (h = org.telegram.ui.Components.cc.a0(profileActivity).h(e10, 1, new du0(profileActivity, 2))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.Z3()) {
                profileActivity.M4(false);
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

    public static void a5(FrameLayout frameLayout, float f10) {
        int i7;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(Y6 * f10);
        frameLayout.setAlpha(1.0f - f10);
        if (f10 < 1.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        frameLayout.setVisibility(i7);
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
        profileActivity.f43070b.setTranslationY(floatValue * f10);
        profileActivity.P.setTranslationY(f10 * profileActivity.V1);
        profileActivity.f43062a.setTranslationY((1.0f - profileActivity.V1) * f14);
        profileActivity.f43062a.setScaleX(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.f43062a.setScaleY(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.f43062a.setAlpha(profileActivity.V1);
        boolean z11 = true;
        profileActivity.A4(true);
        profileActivity.f43062a.setAlpha(f11);
        profileActivity.f43070b.setAlpha(1.0f - profileActivity.V1);
        profileActivity.f43070b.setScaleX((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.f43070b.setScaleY((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f11);
        profileActivity.Y.setAlpha(f11);
        profileActivity.f43101f0.setAlpha(f11);
        av0 av0Var = profileActivity.f43209v0;
        if (av0Var != null) {
            av0Var.setAlpha(f11);
        }
        profileActivity.f43100f.setAlpha(f11);
        zu0 zu0Var = profileActivity.f43181r;
        if (!profileActivity.V5) {
            f13 = f11;
        }
        zu0Var.setAlpha(f13);
        profileActivity.U0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.V1 < 0.7f) {
            org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
            if (d5Var.G.getWidth() != 0 && !d5Var.f29502e.isFocused()) {
                d5Var.f29502e.requestFocus();
                org.telegram.messenger.g0.J3(d5Var.f29502e);
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
        org.telegram.ui.ActionBar.d5 d5Var2 = profileActivity.T0;
        if (d5Var2 != null) {
            d5Var2.setVisibility(i10);
            profileActivity.T0.setAlpha(f11);
        }
        profileActivity.U0.setVisibility(i10);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.V1 >= 0.5f) {
            z11 = false;
        }
        kVar.A(z11);
        org.telegram.ui.ActionBar.d5 d5Var3 = profileActivity.T0;
        if (d5Var3 != null) {
            d5Var3.setAlpha(f11);
        }
        profileActivity.U0.setAlpha(f11);
        profileActivity.f43087d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void c0(org.telegram.ui.ProfileActivity r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.c0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static boolean d0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.np.s1(profileActivity.currentAccount).f25270e7.edit().putLong("dialog_join_requested_time_" + profileActivity.f43123i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.t3.T(profileActivity.F2) && !profileActivity.F2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i7 = org.telegram.ui.Components.e70.f34241u1;
        org.telegram.ui.Components.e70.J0(parentActivity, profileActivity, org.telegram.ui.Components.cc.a0(profileActivity), z11);
        if (!z10 || profileActivity.N4 != -1) {
            profileActivity.M5();
            iw0 iw0Var = profileActivity.d;
            if (iw0Var != null) {
                iw0Var.f();
            }
        }
        if (e2Var instanceof an) {
            ((an) e2Var).cc(false, true);
        }
        return false;
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.d2, 0.25f) / 0.25f;
        float f10 = 1.0f;
        if (profileActivity.f43175q1) {
            profileActivity.f43202u0.setAlpha(1.0f - min);
            profileActivity.f43202u0.setBlurIntensity(0.0f);
            int i7 = 0;
            profileActivity.f43202u0.setGooeyEnabled(false);
            org.telegram.ui.Components.zf0 zf0Var = profileActivity.f43202u0;
            if (profileActivity.d2 >= 1.0f) {
                i7 = 8;
            }
            zf0Var.setVisibility(i7);
        } else {
            profileActivity.f43202u0.setHideProgress(profileActivity.d2);
        }
        av0 av0Var = profileActivity.f43209v0;
        if (av0Var != null && profileActivity.J1 != 2) {
            float f11 = profileActivity.d2;
            if (f11 > 0.0f) {
                f10 = org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f11, 0.0f, 0.5f));
            }
            av0Var.setAlpha(f10);
        }
        profileActivity.A5();
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.j5 j5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.gc b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().V2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.g1 g1Var = new ug.g1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        j5Var.getLocationOnScreen(new int[2]);
        g1Var.f58103r2 = j5Var.f28761i0;
        g1Var.f58104s2 = j5Var.f28762j0;
        g1Var.f58107v2 = j5Var.getScaleX();
        g1Var.f58105t2 = j5Var.getLeft();
        g1Var.f58106u2 = j5Var.getTop();
        g1Var.f58108w2 = j5Var;
        Drawable rightDrawable = j5Var.getRightDrawable();
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (rightDrawable == e5Var && e5Var != null) {
            Drawable drawable = e5Var.f34194f[0];
            if (drawable instanceof org.telegram.ui.Components.g5) {
                g1Var.f58107v2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.g5) drawable).f34804e;
                if (document != null) {
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(profileActivity.getParentActivity());
                    org.telegram.messenger.pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.gc.b(document);
                        if (d != null) {
                            d.f26029e = 512;
                            d.f26030f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                            d.f26029e = 512;
                            d.f26030f = 512;
                        }
                        b10 = org.telegram.messenger.gc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.gc gcVar = b10;
                    i9Var.setLayerNum(7);
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    i9Var.m(gcVar, str2, org.telegram.messenger.gc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.g5) profileActivity.G.f34194f[0]).c()) {
                        i9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        g1Var.f58110y2 = org.telegram.messenger.gj.i1(document);
                    } else {
                        g1Var.f58110y2 = org.telegram.messenger.gj.i1(document);
                    }
                    g1Var.f58109x2 = i9Var;
                    g1Var.A2 = true;
                }
            }
        }
        profileActivity.showDialog(g1Var);
    }

    public static void e5(int i7, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i7) {
            view.getLayoutParams().height = i7;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i7);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.np.s1(profileActivity.currentAccount).l0(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void f5(org.telegram.ui.ActionBar.d5 d5Var, boolean z10, boolean z11) {
        int i7;
        if (com.google.android.gms.internal.vision.e2.s(d5Var)) {
            d5Var.Z(z10, z11);
        } else if (d5Var != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            d5Var.setVisibility(i7);
        }
    }

    public static void g0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ki.n3.J0(context, profileActivity.currentAccount, profileActivity.f43219w2.starref_program, profileActivity.getUserConfig().e(), profileActivity.A0, false);
        } else {
            ki.n3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.A0);
        }
    }

    public static void h0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User a22;
        TLRPC.ChatParticipant chatParticipant;
        iw0 iw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f43062a.C0();
        if (i7 == profileActivity.T3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1));
            TLRPC.UserFull userFull = profileActivity.f43219w2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                di.e0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.f43094e1, new di.o1(profileActivity, context, e10, 3));
            } else if (a23 == null || !a23.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new ki.k(profileActivity.f43094e1));
            }
        } else if (i7 == profileActivity.R3) {
            boolean z10 = !profileActivity.getMessagesController().r2(j3, profileActivity.f43109g1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.f43109g1, z10);
            org.telegram.ui.Components.cc.A(profileActivity, z10, null).j();
            profileActivity.x5();
            int i10 = profileActivity.R3;
            if (i10 < 0 || (iw0Var = profileActivity.d) == null) {
                return;
            }
            iw0Var.g(i10);
        } else if (i7 == profileActivity.f43067a4) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.f28200id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f43113g5);
            bundle.putString("first_name_card", profileActivity.f43120h5);
            bundle.putString("last_name_card", profileActivity.f43127i5);
            pr prVar = new pr(bundle, profileActivity.A0);
            prVar.P = new ut0(profileActivity, a24);
            profileActivity.presentFragment(prVar);
        } else if (i7 == profileActivity.X3) {
            TextView textView = (TextView) org.telegram.ui.Components.t4.f0(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751508, null), org.telegram.messenger.hd.M0(2131751592, null), org.telegram.messenger.hd.M0(2131751591, null), org.telegram.messenger.hd.M0(2131751598, null), new du0(profileActivity, 1), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        } else if (i7 == profileActivity.Y3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M0 = org.telegram.messenger.hd.M0(2131746211, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746232, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.f43090d5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.A0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.hd.f24101a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.f24101a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], c8.ja.o(-1, -2));
                c2VarArr[0].setOnClickListener(new z00(c2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746230, null), new xi0(14, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(9));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        } else if (i7 == profileActivity.f43194s4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f43123i1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.e2(bundle2));
        } else if (i7 == profileActivity.f43186r4) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.S(profileActivity.getParentActivity(), profileActivity.E2, profileActivity.A0).f28392a);
        } else if (i7 == profileActivity.O3) {
            profileActivity.H4(view, f10, f11, false);
        } else if (i7 == profileActivity.M4) {
            profileActivity.getMessagesController().g5(null, profileActivity.f43094e1);
            if (org.telegram.ui.Components.cc.a(profileActivity)) {
                org.telegram.ui.Components.cc.d(profileActivity, false).j();
            }
        } else if (i7 == profileActivity.f43075b4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else if (i7 == profileActivity.V3) {
            profileActivity.K4();
        } else if (i7 == profileActivity.W3) {
            my0.K0(profileActivity.a(), profileActivity);
        } else if (i7 >= profileActivity.f43213v4 && i7 < profileActivity.f43221w4) {
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant = profileActivity.f43211v2.participants.participants.get(((Integer) profileActivity.D2.get(i7 - profileActivity.f43213v4)).intValue());
            } else {
                chatParticipant = profileActivity.f43211v2.participants.participants.get(i7 - profileActivity.f43213v4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i7 == profileActivity.f43229x4) {
            profileActivity.L4();
        } else if (i7 == profileActivity.M3) {
            profileActivity.S4(f10, f11, i7, view);
        } else if (i7 == profileActivity.f43151m4) {
            if (profileActivity.F2 != null) {
                profileActivity.showDialog(new li.d0(profileActivity, profileActivity.F2.linked_community_id, null, null));
            } else if (profileActivity.f43094e1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1))) == null) {
            } else {
                profileActivity.showDialog(new li.d0(profileActivity, a22.linked_community_id, null, null));
            }
        } else if (i7 == profileActivity.J3) {
            if (profileActivity.f43211v2.location instanceof TLRPC.TL_channelLocation) {
                pa0 pa0Var = new pa0(5);
                pa0Var.m0 = -profileActivity.f43102f1;
                pa0Var.C0 = (TLRPC.TL_channelLocation) profileActivity.f43211v2.location;
                profileActivity.presentFragment(pa0Var);
            }
        } else if (i7 == profileActivity.N4) {
            profileActivity.G4(false);
        } else if (i7 == profileActivity.f43237y4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f43102f1);
            bundle3.putInt("type", 2);
            qq qqVar = new qq(bundle3);
            qqVar.C0(profileActivity.f43211v2);
            profileActivity.presentFragment(qqVar);
        } else if (i7 == profileActivity.f43244z4) {
            profileActivity.presentFragment(new bi.t6(profileActivity.f43102f1));
        } else if (i7 == profileActivity.A4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f43102f1);
            bundle4.putInt("type", 1);
            qq qqVar2 = new qq(bundle4);
            qqVar2.C0(profileActivity.f43211v2);
            profileActivity.presentFragment(qqVar2);
        } else if (i7 == profileActivity.B4) {
            profileActivity.S0.performClick();
        } else if (i7 == profileActivity.C4) {
            profileActivity.presentFragment(new di.t(0, profileActivity.f43094e1));
        } else if (i7 == profileActivity.D4) {
            profileActivity.presentFragment(new di.t(1, profileActivity.f43094e1));
        } else if (i7 == profileActivity.E4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f43102f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new z41(bundle5));
        } else if (i7 == profileActivity.H4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f43102f1);
            bundle6.putInt("type", 0);
            qq qqVar3 = new qq(bundle6);
            qqVar3.C0(profileActivity.f43211v2);
            profileActivity.presentFragment(qqVar3);
        } else if (i7 == profileActivity.f43111g3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i7 == profileActivity.f43125i3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.I2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i7 == profileActivity.j3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i7 == profileActivity.f43138k3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i7 == profileActivity.f43144l3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i7 == profileActivity.f43157n3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i7 == profileActivity.f43150m3) {
            profileActivity.presentFragment(new x90());
        } else if (i7 == profileActivity.f43164o3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i7 == profileActivity.f43185r3) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.R(profileActivity, profileActivity.A0));
        } else if (i7 == profileActivity.f43193s3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
        } else if (i7 == profileActivity.f43199t3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
        } else if (i7 == profileActivity.f43220w3) {
            X4(profileActivity.getParentActivity(), false);
        } else if (i7 == profileActivity.f43228x3) {
            X4(profileActivity.getParentActivity(), true);
        } else if (i7 == profileActivity.f43236y3) {
            org.telegram.messenger.a8.a();
        } else if (i7 == profileActivity.f43243z3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M03 = org.telegram.messenger.hd.M0(2131754120, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
            t1Var2.U = M03;
            t1Var2.S = org.telegram.messenger.hd.M0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), new qt0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            profileActivity.showDialog(t1Var2);
        } else if (i7 == profileActivity.f43118h3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i7 == profileActivity.W2) {
            profileActivity.presentFragment(new la(null));
        } else if (i7 == profileActivity.X2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i7 == profileActivity.U2) {
            profileActivity.presentFragment(new g(3));
        } else if (i7 == profileActivity.P2) {
            profileActivity.K4();
        } else if (i7 == profileActivity.f43089d4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i7 == profileActivity.f43097e4) {
            profileActivity.presentFragment(new di.mb());
        } else if (i7 == profileActivity.f43105f4) {
            profileActivity.presentFragment(new ii.f());
        } else if (i7 == profileActivity.f43112g4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i7 == profileActivity.f43119h4) {
            wg.c1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
        } else if (i7 == profileActivity.botPermissionLocation) {
            ki.s0 s0Var = profileActivity.f43198t2;
            if (s0Var != null) {
                s0Var.l(!s0Var.g(), new mp0(17, profileActivity, view));
            }
        } else if (i7 == profileActivity.botPermissionBiometry) {
            ki.r rVar = profileActivity.f43204u2;
            if (rVar != null) {
                rVar.f18518f = true;
                rVar.f18517e = !rVar.f18517e;
                rVar.k();
                ((org.telegram.ui.Cells.l8) view).setChecked(profileActivity.f43204u2.f18517e);
            }
        } else if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.setChecked(!l8Var.d());
            if (profileActivity.f43171p4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f43171p4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.f43094e1);
            boolean d = l8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f43219w2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new b00(24, profileActivity, r1));
            profileActivity.f43171p4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i7 == profileActivity.P3) {
            profileActivity.P4 = !profileActivity.P4;
            profileActivity.V4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.P3);
            int i11 = profileActivity.f43173p6;
            if (i11 >= 0) {
                profileActivity.f43078c.h1(i11, profileActivity.f43180q6 - profileActivity.f43062a.getPaddingTop());
            }
        } else if (i7 == profileActivity.Q3) {
            profileActivity.P4(false);
        } else if (i7 == profileActivity.R2) {
            if (profileActivity.f43219w2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f43219w2.personal_channel_id);
            profileActivity.presentFragment(new an(bundle7));
        } else if (i7 == profileActivity.V2) {
            zw0 zw0Var = profileActivity.E6;
            if ((zw0Var == null || !zw0Var.a()) && !profileActivity.Y3(i7, view)) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (w8Var.d.getDrawable() != null) {
                    profileActivity.J4(w8Var.getImageView());
                }
            }
        } else if (i7 == profileActivity.I3) {
            profileActivity.X3(i7, view);
        } else {
            profileActivity.S4(f10, f11, i7, view);
        }
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28075id;
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
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.m(profileActivity.currentAccount, 1, a22));
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
            profileActivity.getMessagesController().U0(a22.f28200id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.f43094e1);
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(b22, false);
            }
        }
        if (!org.telegram.messenger.g0.Q1() && !profileActivity.f43163o2 && profileActivity.f43101f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f43169p2 = z10;
        profileActivity.J2 = null;
        profileActivity.K2 = null;
        yu0 yu0Var = profileActivity.f43161o0;
        yu0Var.I0 = true;
        yu0Var.L0 = profileActivity.L2;
        yu0Var.f40405r1 = null;
        yu0Var.f40406s1 = null;
        yu0Var.setCreateThumbFromParent(false);
        profileActivity.L5(true);
        profileActivity.l5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.f25559r, Integer.valueOf(org.telegram.messenger.np.D8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.f25516j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        int i7;
        if (profileActivity.f43067a4 >= 0) {
            if (profileActivity.L4 == -1) {
                profileActivity.M5();
                profileActivity.d.f();
            } else {
                profileActivity.G5(false, false);
            }
        }
        if (profileActivity.L4 == -1) {
            if (!profileActivity.f43163o2 && !org.telegram.messenger.g0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f23603m;
                } else {
                    i7 = 0;
                }
                int i10 = currentActionBarHeight + i7;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f43062a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f43062a.getMeasuredHeight(), 0);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    iw0 iw0Var = profileActivity.d;
                    if (i11 >= iw0Var.f48138e.O2) {
                        break;
                    }
                    v4.e1 a10 = iw0Var.a(null, iw0Var.d(i11));
                    View view = a10.f58535a;
                    profileActivity.d.t(a10, i11);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 += view.getMeasuredHeight();
                    i11++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.i4() + i12) + i10));
                ou0 ou0Var = profileActivity.f43062a;
                ou0Var.setPadding(0, ou0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f43062a.setPadding(0, profileActivity.i4(), 0, 0);
                profileActivity.f43137k2.cancel();
                float[] fArr = profileActivity.f43156n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.Z4(1.0f);
                profileActivity.Q1 = profileActivity.i4();
            }
        }
        profileActivity.M.m(profileActivity.f43123i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity) {
        boolean z10;
        org.telegram.ui.ActionBar.f2 f2Var;
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
        final TLRPC.UserFull userFull = profileActivity.f43219w2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.u2 i10 = org.telegram.messenger.i20.i(profileActivity.getParentActivity(), false, 1, null);
            org.telegram.ui.ActionBar.f2 f2Var2 = i10.f29724y0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.A0);
            if (profileActivity.a() != org.telegram.messenger.m10.i(profileActivity.currentAccount).e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            linearLayout.addView(limitPreviewView, c8.ja.t(-1, -2, 17, 0, 20, 0, 10));
            int i11 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, c8.ja.t(-1, -2, 17, 40, -12, 40, 20));
                int i12 = 2;
                org.telegram.ui.Components.z70[] z70VarArr = new org.telegram.ui.Components.z70[2];
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i12;
                    bi.w1 w1Var = new bi.w1(6, parentActivity, null);
                    z70VarArr[i13] = w1Var;
                    w1Var.setGravity(i11);
                    z70VarArr[i13].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.q6.U(z70VarArr[i13], org.telegram.ui.ActionBar.j6.f29241y6, null);
                    org.telegram.ui.ActionBar.q6.G(z70VarArr[i13], org.telegram.ui.ActionBar.j6.Xc, null);
                    frameLayout.addView(z70VarArr[i13], c8.ja.e(-1, -1, 119));
                    org.telegram.ui.Components.z70 z70Var = z70VarArr[i13];
                    if (i13 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    z70Var.setAlpha(f10);
                    org.telegram.ui.Components.z70 z70Var2 = z70VarArr[i13];
                    if (i13 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    z70Var2.setScaleX(f11);
                    org.telegram.ui.Components.z70 z70Var3 = z70VarArr[i13];
                    if (i13 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.8f;
                    }
                    z70Var3.setScaleY(f12);
                    i13++;
                    i12 = i14;
                    i11 = 17;
                }
                int i15 = i12;
                final r3 r3Var = new r3(z70VarArr, 22);
                if (profileActivity.a() == org.telegram.messenger.m10.i(profileActivity.currentAccount).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                f2Var = f2Var2;
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
                if ((j13 < 0 && !z11) || (z11 && j11 > 0)) {
                    boolean z12 = z11;
                    objArr = z70VarArr;
                    org.telegram.ui.ActionBar.q6.U(z70VarArr[0], org.telegram.ui.ActionBar.j6.f29090q7, null);
                    if (z12) {
                        objArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "StarRatingLevelNegativeYou", (int) j11)));
                    } else {
                        objArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745172, org.telegram.messenger.m5.l(org.telegram.messenger.m10.f24934t0, profileActivity.a()))));
                    }
                    c10 = 0;
                } else {
                    objArr = z70VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.hd.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.hd.H(',', "StarRatingFuturePendingPoints", (int) j14);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i15] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c10 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745186, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i16 = r4;
                            r3 r3Var2 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i16) {
                                case 0:
                                    RectF rectF = ProfileActivity.X6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.X6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    r3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    objArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i16 = r4;
                            r3 r3Var2 = r3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i16) {
                                case 0:
                                    RectF rectF = ProfileActivity.X6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    r3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.X6;
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
                String H4 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview2", (int) j14);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i15] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745185, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i16 = r4;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i16 = r4;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                f2Var = f2Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(org.telegram.messenger.hd.M0(2131745167, null));
            textView.setTextSize(1, 20.0f);
            int i16 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(textView, i16, profileActivity.A0);
            linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.f28201id == org.telegram.messenger.m10.i(profileActivity.currentAccount).e()) {
                textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745168, null)));
                i7 = 1;
            } else {
                i7 = 1;
                org.telegram.messenger.k5.q(null, null, 2131745198, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.m10.f24934t0, profileActivity.a())}, textView2);
            }
            textView2.setTextSize(i7, 14.0f);
            org.telegram.ui.ActionBar.q6.U(textView2, i16, profileActivity.A0);
            linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 12));
            fs0 fs0Var = new fs0(parentActivity, profileActivity.A0);
            fs0Var.f47186a.l(org.telegram.messenger.hd.M0(2131745166, null), false);
            String M0 = org.telegram.messenger.hd.M0(2131745201, null);
            int i17 = org.telegram.ui.ActionBar.j6.Fi;
            fs0Var.f47187b.setText(org.telegram.messenger.hd.V(null, null, 2131745197, V3(M0, i17, profileActivity.A0)));
            fs0Var.d.setVisibility(8);
            ImageView imageView = fs0Var.f47188c;
            imageView.setImageResource(2131231827);
            org.telegram.ui.ActionBar.e6 e6Var = profileActivity.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.q6.s(imageView, i16, e6Var, mode);
            linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            fs0 fs0Var2 = new fs0(parentActivity, profileActivity.A0);
            fs0Var2.f47186a.l(org.telegram.messenger.hd.M0(2131745165, null), false);
            fs0Var2.f47187b.setText(org.telegram.messenger.hd.V(null, null, 2131745196, V3(org.telegram.messenger.hd.M0(2131745201, null), i17, profileActivity.A0)));
            fs0Var2.d.setVisibility(8);
            ImageView imageView2 = fs0Var2.f47188c;
            imageView2.setImageResource(2131231891);
            org.telegram.ui.ActionBar.q6.s(imageView2, i16, profileActivity.A0, mode);
            linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            fs0 fs0Var3 = new fs0(parentActivity, profileActivity.A0);
            fs0Var3.f47186a.l(org.telegram.messenger.hd.M0(2131745164, null), false);
            String M02 = org.telegram.messenger.hd.M0(2131745199, null);
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29014m6, profileActivity.A0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, profileActivity.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            fz fzVar = new fz(9);
            fzVar.f47243w = M02;
            if (fzVar.f47237c != null) {
                str = null;
                fzVar.f47237c = null;
                fzVar.a();
            } else {
                str = null;
            }
            fzVar.f47239f = w02;
            fzVar.f47240n = false;
            spannableStringBuilder3.setSpan(fzVar, 0, spannableStringBuilder3.length(), 0);
            fs0Var3.f47187b.setText(org.telegram.messenger.hd.V(str, str, 2131745195, spannableStringBuilder3));
            fs0Var3.d.setVisibility(8);
            ImageView imageView3 = fs0Var3.f47188c;
            imageView3.setImageResource(2131231875);
            org.telegram.ui.ActionBar.q6.s(imageView3, i16, profileActivity.A0, mode);
            linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.d dVar = new hi.d(parentActivity, profileActivity.A0, true);
            dVar.setOnClickListener(new ju0(0, f2Var));
            dVar.i(di.c6.h2(org.telegram.messenger.hd.M0(2131743888, null)), false, true);
            linearLayout.addView(dVar, c8.ja.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i10.O = linearLayout;
            i10.show();
        }
    }

    public static void l0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        switch (i7) {
            case 0:
                boolean z10 = profileActivity.f43175q1;
                if (z10) {
                    if (z10) {
                        profileActivity.b4();
                        return;
                    }
                    return;
                } else if (profileActivity.f43094e1 != 0) {
                    profileActivity.N4();
                    return;
                } else if (profileActivity.f43102f1 != 0) {
                    if (org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f43102f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f43102f1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new an(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.b4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f43102f1);
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
                profileActivity.H4(profileActivity.f43063a0, f10, f11, true);
                return;
            case 2:
                profileActivity.O4();
                return;
            case 3:
                profileActivity.F4();
                return;
            case 4:
                profileActivity.I4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.E4(false);
                return;
            case 6:
                profileActivity.E4(true);
                return;
            case 7:
                profileActivity.G4(true);
                return;
            case 8:
                my0.K0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.y4(false);
                return;
            case 12:
                profileActivity.getMessagesController().f25280f7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, profileActivity.getParentActivity(), profileActivity.A0);
                t1Var.r(200L);
                org.telegram.messenger.np.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.gh(26, profileActivity, t1Var), true, profileActivity.A0);
                return;
            case 13:
                profileActivity.D4(true);
                return;
            case 14:
                profileActivity.K4();
                return;
            case 15:
                TLRPC.User f12 = profileActivity.getUserConfig().f();
                if (f12 != null) {
                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(profileActivity, profileActivity.f43063a0);
                    H.f37114w = false;
                    H.f37093i = 3;
                    H.c(2131232321, org.telegram.messenger.hd.M0(2131746500, null), new k90(profileActivity, 25), false);
                    H.c(2131232104, org.telegram.messenger.hd.M0(2131746678, null), new ef0(f12, 29), false);
                    H.c(2131232117, org.telegram.messenger.hd.M0(2131746620, null), new k90(profileActivity, 26), false);
                    H.W = true;
                    H.a0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.f43063a0.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new k31(null));
                return;
            default:
                return;
        }
    }

    public static void m0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f43071b0 == null) {
            if (MediaController.B().R0 != null && MediaController.B().R0.f24200a == profileActivity.currentAccount && MediaController.B().R0.f24201b == profileActivity.a()) {
                profileActivity.f43071b0 = MediaController.B().R0;
            } else {
                org.telegram.messenger.hp hpVar = new org.telegram.messenger.hp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f43071b0 = hpVar;
                TLRPC.UserFull userFull = profileActivity.f43219w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = hpVar.f24202c;
                    arrayList.clear();
                    hpVar.b();
                    arrayList.add(0, hpVar.d(document));
                }
            }
        }
        if (!profileActivity.f43071b0.f24202c.isEmpty()) {
            if (MediaController.B().R0 == profileActivity.f43071b0 && MediaController.B().I((org.telegram.messenger.gj) profileActivity.f43071b0.f24202c.get(0))) {
                z10 = true;
            } else {
                MediaController.B().o();
                z10 = false;
            }
            MediaController.B().R0 = profileActivity.f43071b0;
            MediaController.B().S0.clear();
            MediaController.B().S0.addAll(profileActivity.f43071b0.f24202c);
            if (!z10) {
                MediaController.B().S((org.telegram.messenger.gj) profileActivity.f43071b0.f24202c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.y7(profileActivity.getParentActivity(), profileActivity.A0));
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.oa0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new k90(profileActivity, 23), profileActivity.A0);
    }

    public static void o0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(profileActivity).Q(2131623990, 36, org.telegram.messenger.hd.M0(2131746856, null));
            Q.f41643j = 5000;
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
                String M0 = org.telegram.messenger.hd.M0(2131746852, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                profileActivity.showDialog(t1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(profileActivity), 2131624012, 36);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.f43094e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.f43090d5);
        tL_messages_reportReaction.f28159id = profileActivity.f43084c5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new fi.m5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f43090d5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1)));
        }
        profileActivity.f43084c5 = 0;
        profileActivity.G5(false, false);
        org.telegram.ui.Components.cc.a0(profileActivity).E(profileActivity.A0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.f43094e1;
        if (j3 == 0) {
            long j10 = profileActivity.f43102f1;
            if (j10 != 0) {
                j3 = -j10;
            } else {
                j3 = profileActivity.f43123i1;
            }
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.np.s1(profileActivity.currentAccount).W(profileActivity.f43090d5, j11);
        } else {
            org.telegram.messenger.np.s1(profileActivity.currentAccount).h0(profileActivity.f43090d5, profileActivity.f43084c5, j11);
        }
        profileActivity.f43084c5 = 0;
        profileActivity.G5(false, false);
        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(profileActivity.getParentActivity(), profileActivity.A0);
        fbVar.d(2131623982, new String[0]);
        fbVar.f34552b.setText(org.telegram.messenger.hd.M0(2131746404, null));
        org.telegram.ui.Components.cc.a0(profileActivity).b(fbVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.J2 = fileLocation;
            profileActivity.K2 = photoSize2.location;
            profileActivity.f43101f0.j(org.telegram.messenger.gc.e(fileLocation), "50_50", profileActivity.f43174q0, null);
            if (profileActivity.P2 != -1) {
                profileActivity.M5();
                iw0 iw0Var = profileActivity.d;
                if (iw0Var != null) {
                    iw0Var.f();
                }
                profileActivity.A4(true);
            }
            yu0 yu0Var = profileActivity.f43161o0;
            org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(profileActivity.K2);
            profileActivity.L2 = e10;
            yu0Var.A(e10, org.telegram.messenger.gc.e(profileActivity.J2));
            profileActivity.l5(true, false);
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
            profileActivity.f43160n6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new b00(23, profileActivity, str));
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
        profileActivity.f43062a.setVisibility(i7);
        org.telegram.ui.Components.uj0 uj0Var = profileActivity.f43070b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        uj0Var.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i11 = 8;
        }
        searchContainer.setVisibility(i11);
        di.u0 u0Var = profileActivity.f43217w0;
        if (u0Var != null) {
            u0Var.setActive(!z10);
        }
        profileActivity.actionBar.A(z10);
        profileActivity.Y.setVisibility(i7);
        av0 av0Var = profileActivity.f43209v0;
        if (av0Var != null) {
            av0Var.setVisibility(i7);
        }
        profileActivity.f43100f.setVisibility(i7);
        profileActivity.f43181r.setVisibility(i7);
        org.telegram.ui.ActionBar.d5 d5Var = profileActivity.T0;
        if (d5Var != null) {
            d5Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i7);
        }
        profileActivity.U0.setVisibility(i7);
        profileActivity.f43101f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        av0 av0Var2 = profileActivity.f43209v0;
        if (av0Var2 != null) {
            av0Var2.setAlpha(1.0f);
        }
        di.u0 u0Var2 = profileActivity.f43217w0;
        if (u0Var2 != null) {
            u0Var2.setAlpha(1.0f);
        }
        profileActivity.f43100f.setAlpha(1.0f);
        zu0 zu0Var = profileActivity.f43181r;
        if (profileActivity.V5) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        zu0Var.setAlpha(f10);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f43062a.setAlpha(1.0f);
        profileActivity.f43070b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f43070b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public final void A4(boolean z10) {
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float U1;
        org.telegram.ui.Components.i9 currentItemView;
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
        ok okVar;
        int w02;
        float f21;
        int i14;
        boolean z11;
        TLRPC.ChatFull chatFull;
        int i15;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        float K3 = K3();
        z5();
        ou0 ou0Var = this.f43062a;
        if (ou0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ou0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f43062a.setLayoutParams(layoutParams2);
            }
        }
        R5(z10);
        if (this.Y != null) {
            this.f43062a.setTopGlowOffset((int) this.Q1);
            ou0 ou0Var2 = this.f43062a;
            if (this.Q1 > i4() && this.Q1 < (d4() + this.f43062a.getMeasuredWidth()) - currentActionBarHeight) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            ou0Var2.setOverScrollMode(i15);
        }
        if (this.Y != null && !this.f43114g6 && this.G1) {
            J3();
            return;
        }
        int i42 = i4();
        if (this.Y != null) {
            if (this.f43063a0 != null && this.f43102f1 != 0) {
                if (org.telegram.messenger.t3.T(this.F2) && !this.F2.megagroup && (chatFull = this.f43211v2) != null && chatFull.linked_chat_id != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f43063a0.o(2, z11);
            }
            R5(z10);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f23603m;
            } else {
                i10 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.i20.b(K3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, i10) - org.telegram.messenger.g0.L(21.0f));
            if (!this.G1) {
                org.telegram.ui.Components.zf0 zf0Var = this.f43202u0;
                if (zf0Var != null) {
                    f21 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.yr yrVar = zf0Var.f42357n;
                    if (yrVar != null && yrVar.f27808c) {
                        f21 = yrVar.f27809e.centerY();
                    }
                } else {
                    f21 = -org.telegram.messenger.g0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.g0.f23603m;
                } else {
                    i14 = 0;
                }
                this.f43073b2 = org.telegram.messenger.g0.T1(f21, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14) - org.telegram.messenger.g0.L(21.0f)), K3);
            } else {
                this.f43073b2 = translationY;
            }
            if (this.G1) {
                f10 = this.S1;
            } else {
                f10 = this.Q1;
            }
            float f22 = i42;
            if (f10 <= f22 && !this.f43176q2) {
                f11 = 2.0f;
                f12 = 18.0f;
            } else {
                f11 = 2.0f;
                float C = a8.p0.C(f10 - f22, (this.f43062a.getMeasuredWidth() - currentActionBarHeight) - j4(), 1.0f, 0.0f);
                this.f43124i2 = C;
                f12 = 18.0f;
                this.f43081c2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, C * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                av0 av0Var = this.f43209v0;
                if (av0Var != null) {
                    av0Var.invalidate();
                }
                di.u0 u0Var = this.f43217w0;
                if (u0Var != null) {
                    u0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.f43131j2))) / org.telegram.messenger.g0.N(1100.0f);
                d4();
                boolean z12 = this.f43169p2;
                int i16 = org.telegram.messenger.ns.f25564r4;
                float[] fArr = this.f43156n2;
                if (z12 && (this.G0 || this.f43124i2 >= 0.33f)) {
                    if (!this.f43176q2) {
                        if (this.T0 != null) {
                            if (!v4()) {
                                this.T0.T(21);
                            } else {
                                this.T0.u(21);
                            }
                            if (this.f43182r0 != null) {
                                this.T0.T(36);
                                this.T0.T(34);
                                this.T0.T(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        org.telegram.ui.ActionBar.d5 d5Var = this.U0;
                        if (d5Var != null) {
                            d5Var.setEnabled(false);
                        }
                        this.f43176q2 = true;
                        org.telegram.messenger.ns.e().k(i16, Boolean.TRUE);
                        this.N.f(true, min);
                        this.f43167p0.b(min);
                        this.f43161o0.setCreateThumbFromParent(true);
                        this.f43161o0.getAdapter().g();
                        this.f43137k2.cancel();
                        fArr[0] = org.telegram.messenger.g0.U1(this.f43149m2, fArr);
                        fArr[1] = 1.0f;
                        av0 av0Var2 = this.f43209v0;
                        if (av0Var2 != null && !av0Var2.f43379x.isEmpty()) {
                            this.f43137k2.setInterpolator(new x1.a());
                            this.f43137k2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f43137k2.setInterpolator(org.telegram.ui.Components.er.f34423j);
                            this.f43137k2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f43137k2.addListener(new bv0(this, 4));
                        View m10 = this.f43078c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i11 = org.telegram.messenger.g0.f23603m;
                            } else {
                                i11 = 0;
                            }
                            this.f43062a.x0(((m10.getTop() - this.f43062a.getMeasuredWidth()) - d4()) + currentActionBarHeight2 + i11, (int) this.f43137k2.getDuration(), (Interpolator) this.f43137k2.getInterpolator());
                            this.f43062a.P0 = false;
                        }
                        this.f43099e6 = this.f43100f.getTranslationY();
                        this.f43107f6 = this.f43181r.getTranslationY();
                        this.f43137k2.start();
                        this.f43161o0.setAlpha(0.0f);
                        this.f43161o0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f43161o0.getLayoutParams();
                    int i17 = layoutParams3.height;
                    layoutParams3.width = this.f43062a.getMeasuredWidth();
                    float f23 = currentActionBarHeight + f10;
                    int i18 = (int) f23;
                    layoutParams3.height = i18;
                    if (i17 != i18) {
                        this.f43161o0.requestLayout();
                    }
                    if (!this.f43137k2.isRunning()) {
                        if (this.G1 && this.J1 == 2) {
                            f13 = (-(1.0f - this.T1)) * org.telegram.messenger.g0.L(50.0f);
                        } else {
                            f13 = 0.0f;
                        }
                        this.f43100f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f43100f.getLeft());
                        this.f43100f.setTranslationY((((f23 - d4()) - org.telegram.messenger.g0.N(30.0f)) - this.f43100f.getBottom()) + f13);
                        this.f43181r.setTranslationX(l4(org.telegram.messenger.g0.N(16.0f) - this.f43181r.getLeft(), 0.0f));
                        this.f43181r.setTranslationY(m4((((f23 - d4()) - org.telegram.messenger.g0.N(10.0f)) - this.f43181r.getBottom()) + f13));
                        s5();
                    }
                } else {
                    if (this.f43176q2) {
                        this.f43176q2 = false;
                        org.telegram.messenger.ns.e().k(i16, Boolean.TRUE);
                        org.telegram.ui.ActionBar.d5 d5Var2 = this.T0;
                        if (d5Var2 != null) {
                            d5Var2.u(21);
                            if (this.f43182r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.T(36);
                                this.T0.T(31);
                            }
                        }
                        org.telegram.ui.ActionBar.d5 d5Var3 = this.U0;
                        if (d5Var3 != null) {
                            d5Var3.setEnabled(!this.f43241z1);
                        }
                        this.N.f(false, min);
                        this.f43167p0.b(min);
                        this.f43137k2.cancel();
                        this.f43101f0.getImageReceiver().f22301u0 = true;
                        this.f43101f0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.g0.U1(this.f43149m2, fArr);
                        fArr[1] = 0.0f;
                        this.f43137k2.setInterpolator(org.telegram.ui.Components.er.f34423j);
                        if (!this.f43163o2) {
                            this.f43137k2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f43137k2.setDuration(0L);
                        }
                        this.f43087d1.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.A0));
                        if (!this.I0 && (currentItemView = this.f43161o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.g51) {
                                this.f43101f0.f52302b0 = false;
                            } else {
                                xu0 xu0Var = this.f43101f0;
                                xu0Var.f52302b0 = true;
                                xu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f43137k2.addListener(new bv0(this, 5));
                        this.f43101f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.f43161o0.setAlpha(0.0f);
                        this.f43137k2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.Y.setScaleX(this.f43081c2);
                    this.Y.setScaleY(this.f43081c2);
                    c4();
                    ValueAnimator valueAnimator = this.f43137k2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        T4();
                        this.f43100f.setTranslationY(this.f43103f2);
                        this.f43181r.setTranslationX(l4(this.f43110g2, this.A6));
                        this.f43181r.setTranslationY(m4(this.f43117h2));
                        s5();
                    }
                }
            }
            boolean z13 = this.G1;
            if (z13 && this.J1 == 2) {
                float f24 = this.f43128i6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f23603m;
                } else {
                    i13 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f11) + i13) - (org.telegram.messenger.g0.f23608p * 21.0f));
                this.f43100f.setPivotY(okVar.getMeasuredHeight());
                this.f43100f.setScaleX(1.38f);
                this.f43100f.setScaleY(1.38f);
                this.f43081c2 = org.telegram.messenger.g0.W1(this.T1, 42, 138) / 100.0f;
                this.d2 = 0.0f;
                av0 av0Var3 = this.f43209v0;
                if (av0Var3 != null) {
                    av0Var3.setExpandProgress(1.0f);
                }
                di.u0 u0Var2 = this.f43217w0;
                if (u0Var2 != null) {
                    u0Var2.setExpandProgress(1.0f);
                }
                this.f43101f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(r4(), 0.0f, this.T1));
                this.Y.setTranslationX(org.telegram.messenger.g0.T1(f24, 0.0f, this.T1));
                this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.f43081c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.f43122i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.f43122i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.f43129j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f43129j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.f43135k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f43135k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.f43142l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.f43142l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.f43081c2);
                this.Y.setScaleY(this.f43081c2);
                this.f43161o0.setAlpha(0.0f);
                this.f43161o0.setVisibility(0);
                xu0 xu0Var2 = this.f43101f0;
                float f25 = this.T1;
                float f26 = this.f43081c2;
                xu0Var2.I = f25;
                xu0Var2.J = f26;
                xu0Var2.H = true;
                this.N.e(false, f25);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                int i19 = -1;
                if (this.f43147l6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.A0);
                }
                kVar.H(i0.a.f(this.T1, w02, -1), false);
                org.telegram.ui.Components.lk0 lk0Var = this.L;
                if (lk0Var != null) {
                    lk0Var.b(i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28924h8, this.A0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f43224x;
                if (drawable != null) {
                    if (this.f43147l6 == null) {
                        i19 = i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28911gd, this.A0), -1);
                    }
                    drawable.setColorFilter(i19, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.dr drVar = this.J;
                if (drVar != null) {
                    drVar.a(this.T1);
                    this.f43100f.invalidate();
                }
                org.telegram.ui.Components.dr drVar2 = this.K;
                if (drVar2 != null) {
                    drVar2.a(this.T1);
                    this.f43100f.invalidate();
                }
                v5(this.T1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.f43062a.getMeasuredWidth() / this.f43081c2, this.T1);
                layoutParams4.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + currentActionBarHeight) / this.f43081c2, this.T1);
                this.Y.requestLayout();
                s5();
            } else if (f10 <= f22) {
                if (z13) {
                    this.f43081c2 = org.telegram.messenger.g0.W1(K3, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f15 = 1.0f;
                } else {
                    org.telegram.ui.Components.zf0 zf0Var2 = this.f43202u0;
                    if (zf0Var2 != null) {
                        f14 = zf0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f14 = 24.0f;
                    }
                    this.f43081c2 = org.telegram.messenger.g0.T1(f14, 96.0f, K3) / 100.0f;
                    f15 = 1.0f;
                    this.d2 = 1.0f - K3;
                }
                org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
                if (hf0Var != null) {
                    if (this.G1) {
                        hf0Var.setAlpha(this.T1);
                    } else {
                        hf0Var.setAlpha(f15);
                    }
                }
                av0 av0Var4 = this.f43209v0;
                if (av0Var4 != null) {
                    av0Var4.invalidate();
                }
                di.u0 u0Var3 = this.f43217w0;
                if (u0Var3 != null) {
                    u0Var3.h = this.G1;
                    float l10 = Utilities.l((K3 - 0.3f) / 0.7f);
                    if (u0Var3.f9504f != l10) {
                        u0Var3.f9504f = l10;
                        u0Var3.invalidate();
                    }
                }
                if (this.G1) {
                    f16 = org.telegram.messenger.g0.T1(o4(0), 1.12f, K3);
                } else {
                    f16 = (0.12f * K3) + 1.0f;
                }
                ValueAnimator valueAnimator2 = this.f43137k2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f43137k2;
                    bv0 bv0Var = this.f43085c6;
                    valueAnimator3.removeListener(bv0Var);
                    this.f43137k2.addListener(bv0Var);
                } else {
                    this.Y.setScaleX(this.f43081c2);
                    this.Y.setScaleY(this.f43081c2);
                    c4();
                    this.Y.setTranslationY((float) Math.ceil(this.f43073b2));
                    float L = (((this.f43081c2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.f43122i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                    this.f43122i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                    this.f43129j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f43129j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                    this.f43135k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f43135k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                    this.f43142l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                    this.f43142l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.g0.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight());
                if (this.G1) {
                    f17 = this.T1;
                } else {
                    f17 = K3;
                }
                float f27 = (N * f17) + floor;
                this.f43103f2 = com.google.android.gms.internal.vision.e2.z(1.0f, this.T1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * K3) + org.telegram.messenger.g0.L(1.3f) + f27);
                this.f43117h2 = (((float) Math.floor(org.telegram.messenger.g0.f23608p * 11.0f)) * K3) + f27 + org.telegram.messenger.g0.L(24.0f);
                if (this.G1) {
                    f18 = (this.f43128i6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                } else {
                    f18 = -org.telegram.messenger.g0.N(46.0f);
                }
                tw0 tw0Var = this.D6;
                if (tw0Var != null) {
                    tw0Var.setAlpha((int) (255.0f * K3));
                }
                int measuredWidth2 = this.f43062a.getMeasuredWidth();
                this.f43100f.setScaleX(f16);
                this.f43100f.setScaleY(f16);
                if (this.G1) {
                    f19 = org.telegram.messenger.g0.T1(o4(1), 1.0f, K3);
                } else {
                    f19 = 1.0f;
                }
                this.f43181r.setScaleX(f19);
                this.f43181r.setScaleY(f19);
                B4(0, K3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f43100f.getLayoutParams();
                float f28 = measuredWidth2 / f11;
                float min2 = f28 - (((Math.min(this.f43100f.getExactWidth(), layoutParams5.width) * f16) * 0.5f) + layoutParams5.leftMargin);
                float f29 = ((FrameLayout.LayoutParams) this.f43181r.getLayoutParams()).width;
                if (!this.f43201t5 && this.f43181r.getExactWidth() <= (f29 - this.f43181r.getPaddingLeft()) - this.f43181r.getPaddingRight()) {
                    f20 = this.f43181r.getPaddingLeft();
                } else {
                    f20 = 0.0f;
                }
                float min3 = f28 - ((Math.min(this.f43181r.getExactWidth(), f29) * 0.5f) + (layoutParams.leftMargin + f20));
                this.f43095e2 = min2;
                this.f43110g2 = min3;
                this.A6 = f20;
                if (this.G1) {
                    min2 = org.telegram.messenger.g0.T1(p4(f18, 0, this.f43100f), min2, K3);
                    min3 = org.telegram.messenger.g0.T1(p4(f18, 1, this.f43181r), min3, K3);
                }
                ValueAnimator valueAnimator4 = this.f43137k2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f43100f.setTranslationX(min2);
                    this.f43100f.setTranslationY(this.f43103f2);
                    this.f43181r.setTranslationX(l4(min3, this.A6 * K3));
                    this.f43181r.setTranslationY(m4(this.f43117h2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f43100f.getLayoutParams();
                int i20 = layoutParams6.width;
                if (org.telegram.messenger.g0.Q1()) {
                    i12 = org.telegram.messenger.g0.L(490.0f);
                } else {
                    i12 = org.telegram.messenger.g0.f23609q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i12 - org.telegram.messenger.g0.L(f12)) / this.f43100f.getScaleX()) - (this.f43100f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i20) {
                    this.f43100f.requestLayout();
                }
                s5();
            }
            ValueAnimator valueAnimator5 = this.f43137k2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                B4(0, K3, true);
            }
        }
        y5(currentActionBarHeight);
        if (K3 >= 1.0f) {
            this.f43101f0.setAlpha(1.0f);
        }
    }

    public final void A5() {
        boolean z10;
        boolean z11;
        boolean z12;
        float a10;
        float f10 = 0.0f;
        if (!this.f43175q1 && !this.G1) {
            int d42 = d4();
            if (d42 > 0) {
                a10 = c8.i9.a(1.0f - (this.Q1 / d42), 0.0f, 1.0f);
            } else {
                a10 = c8.i9.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f10 = a10;
        }
        float f11 = this.E5;
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
            this.E5 = f10;
            ok okVar = this.f43100f;
            if (okVar != null) {
                okVar.setTextColor(this.H5);
            }
            zu0 zu0Var = this.f43181r;
            if (zu0Var != null) {
                zu0Var.setTextColor(this.I5);
            }
            u5();
            if (z12) {
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25564r4, Boolean.TRUE);
            }
            vw0 vw0Var = this.f43087d1;
            if (vw0Var != null) {
                vw0Var.invalidate();
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
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.B4(int, float, boolean):void");
    }

    public final void B5() {
        uv0 uv0Var = this.O;
        if (uv0Var != null && this.Z5 != 0) {
            int topPanelShift = uv0Var.getTopPanelShift();
            int i7 = 0;
            if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
                if (this.O.getParent() == this.f43062a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
                }
                i7 = topPanelShift;
            }
            int i10 = this.Z5 + i7;
            e5(i10, this.F5);
            e5(i10, this.X5);
        }
    }

    public final void C5() {
        boolean z10;
        float f10;
        if (this.F5 != null && this.X5 != null) {
            uv0 uv0Var = this.O;
            int i7 = 0;
            if (uv0Var != null && uv0Var.getParent() == this.f43062a && this.O.isAttachedToWindow()) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(Math.min(this.E5, this.P5), this.U5);
            View view = this.F5;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = max;
            }
            view.setAlpha(f10);
            this.F5.setVisibility((z10 || max <= 0.0f) ? 8 : 8);
            View view2 = this.X5;
            if (!z10) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z10) {
                this.X5.setTranslationY(-(this.O.getY() + this.f43062a.getY()));
            }
        }
    }

    public final void D4(boolean z10) {
        boolean z11;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43094e1));
        if (a22 != null) {
            if (this.f43192s2 && !org.telegram.messenger.np.F2(a22)) {
                if (this.f43136k1 && !z10) {
                    getMessagesController().g5(new k90(this, 6), this.f43094e1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.F2;
                if (this.E2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.t4.r(this, false, chat, a22, z11, true, false, true, new ut0(this, a22));
            } else if (this.f43136k1) {
                getMessagesController().g5(null, this.f43094e1);
                if (org.telegram.ui.Components.cc.a(this)) {
                    org.telegram.ui.Components.cc.d(this, false).j();
                }
            } else if (this.l1) {
                org.telegram.ui.Components.t4.g0(this, this.f43094e1, a22, null, this.E2, false, null, new na(this, 3), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.A0);
                String M0 = org.telegram.messenger.hd.M0(2131753692, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new qt0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, this.A0);
                }
            }
        }
    }

    public final void D5() {
        if (this.simpleActionBar != null && this.K5 != null) {
            org.telegram.ui.Components.lf0 lf0Var = this.M5;
            if (lf0Var != null) {
                float k42 = k4();
                if (lf0Var.f36778l != k42) {
                    lf0Var.f36778l = k42;
                    lf0Var.a();
                }
            }
            int f10 = i0.a.f(k4(), this.G5, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.A0));
            if (this.J5 != f10) {
                this.J5 = f10;
                org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
                w4Var.m0 = true;
                w4Var.f29817g0 = f10;
                w4Var.updateColors();
            }
            int A2 = this.L5.A2();
            if (this.O5 != A2) {
                this.O5 = A2;
                org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
                fh.g gVar = w4Var2.I;
                if (gVar != null) {
                    gVar.updateColors();
                    w4Var2.J.updateColors();
                    w4Var2.K.updateColors();
                }
                w4Var2.invalidate();
                org.telegram.ui.ActionBar.g5 g5Var = w4Var2.R;
                if (g5Var != null) {
                    g5Var.invalidate();
                }
            }
        }
    }

    public final void E4(boolean z10) {
        boolean z11 = false;
        if (this.f43094e1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43094e1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.f43219w2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.c2.m(a22, z10, z11, getParentActivity(), this.f43219w2, getAccountInstance());
            }
        } else if (this.f43102f1 != 0) {
            if (getMessagesController().g1(this.f43102f1, false, null) == null) {
                TLRPC.Chat chat = this.F2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.v60.J0(getParentActivity(), -chat.f28051id, accountInstance, new org.telegram.ui.Components.km(chat, this, accountInstance, 7));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.c2.l(this.F2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void E5(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        uv0 uv0Var;
        if (this.T0 != null) {
            boolean z17 = false;
            if (!this.V5 && ((uv0Var = this.O) == null || !uv0Var.E0())) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z18 = this.f43176q2;
            org.telegram.ui.ActionBar.d5 d5Var = this.Q0;
            if (z11 && !z18 && this.M0) {
                z12 = true;
            } else {
                z12 = false;
            }
            f5(d5Var, z12, z10);
            org.telegram.ui.ActionBar.d5 d5Var2 = this.R0;
            if (z11 && !z18 && this.N0) {
                z13 = true;
            } else {
                z13 = false;
            }
            f5(d5Var2, z13, z10);
            org.telegram.ui.ActionBar.d5 d5Var3 = this.S0;
            if (z11 && !z18 && this.O0) {
                z14 = true;
            } else {
                z14 = false;
            }
            f5(d5Var3, z14, z10);
            uv0 uv0Var2 = this.O;
            if (uv0Var2 != null && uv0Var2.J != null && uv0Var2.v0(uv0Var2.getClosestTab()) && !this.O.E0()) {
                z15 = true;
            } else {
                z15 = false;
            }
            org.telegram.ui.ActionBar.d5 d5Var4 = this.T0;
            if (z10 && !z15) {
                z16 = true;
            } else {
                z16 = false;
            }
            f5(d5Var4, z11, z16);
            uv0 uv0Var3 = this.O;
            if (uv0Var3 != null) {
                boolean z19 = this.V5;
                if (z10 && !z15) {
                    z17 = true;
                }
                if (uv0Var3.f42127q2 != z19) {
                    uv0Var3.f42127q2 = z19;
                    uv0Var3.R(z10, z17);
                }
            }
        }
    }

    public final void F4() {
        TLRPC.UserFull userFull = this.f43219w2;
        if (userFull != null && org.telegram.messenger.q10.b(userFull)) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.cc.a0(T), 2131624012, 36);
                return;
            }
            return;
        }
        if (this.F2 != null) {
            org.telegram.ui.Components.c30.h.a();
        }
        showDialog(new bi.s2(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void F5() {
        TLRPC.User a22;
        boolean z10;
        int i7;
        int i10;
        if (this.f43191s1 && this.X0 != null && this.W0 != null && (a22 = getMessagesController().a2(Long.valueOf(this.f43094e1))) != null) {
            int i11 = 0;
            if (org.telegram.messenger.q10.n(a22) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.z0 z0Var = this.X0;
            if (z10) {
                i7 = 2131231909;
            } else {
                i7 = 2131231910;
            }
            z0Var.setIcon(i7);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.X0;
            if (z10) {
                i10 = 2131746620;
            } else {
                i10 = 2131746619;
            }
            z0Var2.setText(org.telegram.messenger.hd.M0(i10, null));
            org.telegram.ui.ActionBar.z0 z0Var3 = this.W0;
            if (org.telegram.messenger.q10.n(a22) == null) {
                i11 = 8;
            }
            z0Var3.setVisibility(i11);
        }
    }

    public final void G3() {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        if (this.O != null && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f23603m;
            } else {
                i7 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int[] iArr = org.telegram.ui.Components.ys0.f42071t2;
            int z10 = org.telegram.messenger.k5.z(6.666f, ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
            int c10 = ri.a.c(i7) + currentActionBarHeight + z10;
            this.Y5 = c10;
            this.O.n1(z10, c10, ri.a.c(this.N6), this.N6 + this.L6);
            this.Z5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
            B5();
            O3();
        }
    }

    public final void G4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.F2.f28051id, getUserConfig().f(), 0, null, this, true, new f60(this, z10, zArr, 8), new a3.g(this, zArr, z10, this.parentLayout.getLastFragment(), 7), null);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.I4, new Object[0]);
    }

    public final void G5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                J5(false);
            }
            M5();
        } else if (!z11 && this.f43062a.isInLayout()) {
            ou0 ou0Var = this.f43062a;
            if (!ou0Var.H) {
                return;
            }
            ou0Var.post(new org.telegram.ui.Components.fp0(12, this, z10));
        } else {
            wv0 wv0Var = new wv0(this);
            wv0Var.f53006b = this.O2;
            wv0Var.f(wv0Var.f53007c);
            wv0Var.f53008e.clear();
            wv0Var.f53009f.clear();
            wv0Var.f53008e.addAll(this.S4);
            wv0Var.f53009f.addAll(this.T4);
            wv0Var.f53010g = this.f43213v4;
            wv0Var.h = this.f43221w4;
            if (z10) {
                J5(false);
            }
            V4();
            M5();
            wv0Var.f(wv0Var.d);
            try {
                v4.o.c(wv0Var, true).c(this.d);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.d.f();
            }
            int i7 = this.f43173p6;
            if (i7 >= 0) {
                this.f43078c.h1(i7, this.f43180q6 - this.f43062a.getPaddingTop());
            }
            org.telegram.messenger.g0.a4(this.f43062a);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final int H3(int i7, Boolean bool) {
        int i10;
        if (this.f43147l6 != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.A0);
            int f10 = i0.a.f(0.5f, this.f43147l6.m(org.telegram.ui.ActionBar.j6.I.q()), this.f43147l6.n(org.telegram.ui.ActionBar.j6.I.q()));
            if (!org.telegram.ui.ActionBar.j6.e1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.j6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.j6.r1(0.7f, f10));
                }
                return f10;
            }
            boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i10 = org.telegram.ui.ActionBar.j6.r1(0.7f, f10);
            } else {
                i10 = f10;
            }
            return org.telegram.ui.ActionBar.j6.D(q10, w02, f10, i7, i10);
        }
        return i7;
    }

    public final void H4(View view, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        long j3;
        long j10 = this.f43123i1;
        if (j10 == 0) {
            j10 = this.f43094e1;
            if (j10 == 0) {
                j10 = -this.f43102f1;
            }
        }
        long j11 = j10;
        boolean r22 = getMessagesController().r2(j11, this.f43109g1, null);
        if (z10 && (this.f43175q1 || r22)) {
            boolean z11 = !r22;
            getNotificationsController().G(j11, this.f43109g1, z11);
            org.telegram.ui.Components.cc.A(this, z11, null).j();
            x5();
            this.f43063a0.setNotifications(r22);
        } else if ((!z10 && org.telegram.messenger.hd.f24101a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.f24101a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z12 = h5Var.f30399e.h;
            boolean z13 = !z12;
            boolean D = getNotificationsController().D(j11, null, false, false);
            String v = org.telegram.messenger.at.v(j11, this.f43109g1, false);
            if (!z12) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.currentAccount).f25270e7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f43109g1 == 0) {
                    getMessagesStorage().E1(j11, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j11);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.s1(this.currentAccount).f25270e7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j3 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j3 = 1;
                }
                getNotificationsController().N(j11);
                if (this.f43109g1 == 0) {
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
            x5();
            getNotificationsController().c0(j11, this.f43109g1, true);
            h5Var.setChecked(z13);
            org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.f43062a.L(this.O3, false);
            I5(true);
        } else {
            org.telegram.ui.Components.io ioVar = new org.telegram.ui.Components.io(getParentActivity(), this.currentAccount, null, true, new a8.va(this, j11, 7), this.A0);
            ioVar.e(j11, this.f43109g1, this.f43146l5);
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z10) {
                f13 += this.f43063a0.getHeight() - org.telegram.messenger.g0.L(12.0f);
            }
            ioVar.d(this, view, f12, f13, z10);
        }
    }

    public final void H5() {
        int i7;
        if (this.f43079c0 != null && this.f43181r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f23603m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.Y != null) {
                this.f43079c0.setAlpha(this.T1);
                this.f43079c0.f(org.telegram.messenger.g0.L(74.0f) + this.f43062a.getMeasuredWidth(), d4() - org.telegram.messenger.g0.L(74.0f));
                return;
            }
            if (z10) {
                this.f43079c0.setAlpha(this.T1);
            }
            float f10 = i10;
            float L = this.Q1 + f10 + org.telegram.messenger.g0.L(74.0f);
            float min = Math.min(d4(), L - f10);
            this.f43079c0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
        }
    }

    @Override
    public final void I(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f43115h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.f43161o0.O(this.L2, f10);
    }

    public final void I3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && this.f43100f != null && this.f43087d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.f43167p0 != null) {
            Float valueOf = Float.valueOf(this.U5);
            dv0 dv0Var = this.W5;
            dv0Var.getClass();
            dv0Var.a(kVar, valueOf);
            if (this.U5 <= 0.0f && this.f43143l2 > 0.0f) {
                ok okVar = this.f43100f;
                int i7 = -1;
                if (this.f43147l6 != null) {
                    f10 = -1;
                } else {
                    f10 = i0.a.f(this.f43143l2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29024mi, this.A0), -1);
                }
                okVar.setTextColor(f10);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f43147l6 == null) {
                    i7 = i0.a.f(this.f43143l2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.A0), -1);
                }
                kVar2.H(i7, false);
            }
        }
    }

    public final void I4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f43094e1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43094e1));
                if (a22 != null) {
                    if (this.G2 != null && (userFull = this.f43219w2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().V2 + "/%s", this.f43219w2.about, org.telegram.messenger.q10.n(a22));
                    } else {
                        str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.q10.n(a22));
                    }
                } else {
                    return;
                }
            } else if (this.f43102f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f43102f1));
                if (M0 != null) {
                    TLRPC.ChatFull chatFull = this.f43211v2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().V2 + "/%s", this.f43211v2.about, org.telegram.messenger.t3.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131752982, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void I5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.I5(boolean):void");
    }

    @Override
    public final void J() {
        W4(false);
    }

    public final void J3() {
        int i7;
        int i10;
        if (this.f43091d6 != null) {
            ValueAnimator valueAnimator = this.f43137k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f43137k2.cancel();
            }
            float l10 = Utilities.l(this.Q1 / this.F1);
            if (l10 > 0.0f) {
                float f10 = (l10 - 0.5f) / 0.5f;
                int i11 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i7 = org.telegram.messenger.g0.f23603m;
                } else {
                    i7 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7) - org.telegram.messenger.g0.L(21.0f));
                this.f43081c2 = org.telegram.messenger.g0.T1(0.42f, this.f43091d6[0], l10);
                this.f43065a2 = org.telegram.messenger.g0.T1(this.f43128i6, this.f43091d6[1], l10);
                this.f43073b2 = org.telegram.messenger.g0.T1(translationY, this.f43091d6[2], l10);
                this.d2 = org.telegram.messenger.g0.T1(this.f43091d6[11], 0.0f, l10);
                this.Y.setScaleX(this.f43081c2);
                this.Y.setScaleY(this.f43081c2);
                this.Y.setTranslationX(this.f43065a2);
                this.Y.setTranslationY(this.f43073b2);
                org.telegram.ui.Components.mu0 mu0Var = this.T;
                if (mu0Var != null) {
                    mu0Var.setAlpha(l10);
                }
                this.f43101f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                av0 av0Var = this.f43209v0;
                if (av0Var != null) {
                    av0Var.invalidate();
                }
                di.u0 u0Var = this.f43217w0;
                if (u0Var != null) {
                    u0Var.f9503e = org.telegram.messenger.g0.T1(0.0f, this.f43091d6[4], f10);
                    this.f43217w0.f9504f = org.telegram.messenger.g0.T1(0.0f, this.f43091d6[5], l10);
                    di.u0 u0Var2 = this.f43217w0;
                    u0Var2.h = true;
                    u0Var2.invalidate();
                }
                tw0 tw0Var = this.D6;
                if (tw0Var != null) {
                    tw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.f43091d6[6], l10));
                }
                float L = (((this.f43081c2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                this.f43122i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
                this.f43122i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
                this.f43129j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f43129j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
                this.f43135k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f43135k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                this.f43142l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
                this.f43142l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
                float T1 = org.telegram.messenger.g0.T1(o4(0), this.f43091d6[7], l10);
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f23603m;
                } else {
                    i10 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (org.telegram.messenger.g0.f23608p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
                float N = org.telegram.messenger.g0.N(22.7f) + floor;
                this.f43103f2 = org.telegram.messenger.g0.T1(floor, this.f43091d6[8], l10);
                this.f43117h2 = org.telegram.messenger.g0.T1(N, this.f43091d6[9], l10);
                float L2 = (this.f43128i6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
                float T12 = org.telegram.messenger.g0.T1(p4(L2, 0, this.f43100f), this.f43091d6[12], l10);
                float T13 = org.telegram.messenger.g0.T1(p4(L2 + this.s5, 1, this.f43181r) - this.s5, this.f43091d6[13], l10);
                this.f43100f.setTranslationX(T12);
                this.f43100f.setTranslationY(this.f43103f2);
                this.f43181r.setTranslationX(this.s5 + T13);
                this.f43181r.setTranslationY(this.f43117h2);
                this.f43095e2 = T12;
                this.f43110g2 = T13;
                this.f43100f.setScaleX(T1);
                this.f43100f.setScaleY(T1);
                float T14 = org.telegram.messenger.g0.T1(o4(1), 1.0f, l10);
                this.f43181r.setScaleX(T14);
                this.f43181r.setScaleY(T14);
                s5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.g0.f23603m;
                }
                y5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11);
                B4((int) this.f43091d6[10], l10, true);
                org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
                if (hf0Var != null) {
                    hf0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.f43091d6[3], f10));
                }
            }
        }
    }

    public final void J4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f43102f1);
            bundle.putLong("user_id", this.f43094e1);
            presentFragment(new ci.i0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.V2) {
            if (this.f43094e1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.q10.b(this.f43219w2)) {
                org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(this.f43094e1)), org.telegram.ui.Components.cc.a0(this), 2131624012, 36);
            } else {
                showDialog(new bi.s2(getParentActivity(), this.currentAccount, this.f43094e1, null, null));
            }
        }
    }

    public final void J5(boolean z10) {
        int i7;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i10 = 0;
        this.C2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.D2.clear();
        TLRPC.ChatFull chatFull = this.f43211v2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.C2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.f43211v2.participants.participants.size()) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43211v2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f28200id == getUserConfig().e()) && a22.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i10));
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
                i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
            }
            i7 = Integer.MIN_VALUE;
            i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$EL.reversed(Comparator$CC.comparingInt(new pe(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10 && this.d != null && this.f43213v4 > 0) {
            org.telegram.messenger.g0.a4(this.f43062a);
        }
        if (this.O != null && this.L4 != -1) {
            if ((this.D2.size() > 5 || this.U4 == 2) && this.U4 != 1) {
                this.O.m1(this.D2, this.f43211v2);
            }
        }
    }

    public final float K3() {
        return Utilities.l((this.Q1 - d4()) / j4());
    }

    public final void K4() {
        boolean z10;
        org.telegram.ui.Components.ch0 ch0Var;
        if (this.f43094e1 != 0) {
            if (this.f43182r0 != null) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(this.currentAccount).e()));
                if (a22 == null) {
                    a22 = org.telegram.messenger.m10.i(this.currentAccount).f();
                }
                if (a22 != null) {
                    org.telegram.ui.Components.m30 m30Var = this.f43182r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m30Var.n(z10, new k90(this, 27), new q5(this, 13), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
                    if (hf0Var != null) {
                        org.telegram.ui.Components.ef0 i7 = org.telegram.ui.Components.hf0.i(14, hf0Var.f35234a);
                        if (i7 != null && (ch0Var = i7.f34294k) != null) {
                            ch0Var.start();
                        }
                    } else {
                        this.f43189s.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = this.N2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            N4();
            return;
        }
        O4();
    }

    public final void K5() {
        CharSequence charSequence;
        zu0 zu0Var = this.f43181r;
        if (zu0Var != null) {
            if ((!this.V5 || (charSequence = this.f43069a6) == null) && (!this.f43239y6 || (charSequence = this.f43231x6) == null)) {
                charSequence = this.f43223w6;
            }
            if (zu0Var.o(charSequence, !this.G1) && this.fragmentView != null) {
                A4(false);
            }
        }
    }

    public final void L3() {
        int i7;
        int i10 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        this.f43073b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7) - org.telegram.messenger.g0.L(21.0f));
        this.f43081c2 = 1.38f;
        float f10 = 0.0f;
        this.d2 = 0.0f;
        c4();
        T4();
        B4(0, 1.0f, true);
        this.f43095e2 = (this.f43062a.getMeasuredWidth() / 2.0f) - (((this.f43100f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f43100f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f43062a.getMeasuredWidth() / 2.0f;
        int i11 = ((FrameLayout.LayoutParams) this.f43181r.getLayoutParams()).leftMargin;
        if (!this.f43201t5) {
            i10 = this.f43181r.getPaddingLeft();
        }
        this.f43110g2 = measuredWidth - ((this.f43181r.getExactWidth() * 0.5f) + (i11 + i10));
        if (!this.f43201t5) {
            f10 = this.f43181r.getPaddingLeft();
        }
        this.A6 = f10;
        if (this.J1 != 2) {
            this.f43209v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f43101f0.setAlpha(1.0f);
    }

    public final void L4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.F2.f28051id);
        w40 w40Var = new w40(k10);
        TLRPC.ChatFull chatFull = this.f43211v2;
        w40Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.f43211v2.participants.participants.size(); i7++) {
                hVar.k(null, this.f43211v2.participants.participants.get(i7).user_id);
            }
            w40Var.K = hVar;
        }
        w40Var.f52429y = new qt0(this, 0);
        presentFragment(w40Var);
    }

    public final void L5(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.L5(boolean):void");
    }

    public final void M4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.M4(boolean):void");
    }

    public final void M5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.M5():void");
    }

    public final void N3() {
        v4.e1 e1Var;
        View view;
        int top;
        int i7;
        int i10;
        float a10;
        boolean z10;
        if (this.f43062a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f43062a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f43062a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    e1Var = null;
                    if (i11 < this.f43062a.getChildCount()) {
                        if (RecyclerView.R(this.f43062a.getChildAt(i11)) == 0) {
                            view = this.f43062a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    ou0 ou0Var = this.f43062a;
                    View F = ou0Var.F(view);
                    if (F != null) {
                        e1Var = ou0Var.T(F);
                    }
                    e1Var = (org.telegram.ui.Components.cj0) e1Var;
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
                    a10 = c8.i9.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
                }
                if (this.P5 != a10) {
                    this.P5 = a10;
                    C5();
                }
                if (this.f43182r0 == null && this.actionBar.f29304o0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.L4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.f43062a.K(i12);
                    if (cj0Var != null && cj0Var.f58535a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.V5 != z10) {
                    this.V5 = z10;
                    O3();
                    AnimatorSet animatorSet = this.S5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.T5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    E5(true);
                    K5();
                    O5(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar, this.W5, f10));
                    this.O.L0.setOpen(z10);
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f43159n5, 0.0f));
                    }
                    if (this.f43209v0 != null || this.f43217w0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new zt0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    Q3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.S5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.S5.setInterpolator(org.telegram.ui.Components.er.f34420f);
                    this.S5.addListener(new bv0(this, 1));
                    this.S5.setDuration(150L);
                    this.S5.start();
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25564r4, Boolean.TRUE);
                }
                float f11 = i10;
                if (this.Q1 != f11 && !this.H1) {
                    this.Q1 = f11;
                    this.f43087d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > d4()) {
                            z11 = true;
                        }
                        this.M1 = z11;
                    }
                    A4(true);
                }
            }
        }
    }

    public final void N4() {
        TLRPC.User a22;
        if (this.f43094e1 != 0 && !b4() && (a22 = getMessagesController().a2(Long.valueOf(this.f43094e1))) != null && !(a22 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f43094e1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.g0.Q1() && z10) {
                    org.telegram.messenger.ns notificationCenter = getNotificationCenter();
                    int i7 = org.telegram.messenger.ns.f25572t;
                    notificationCenter.n(this, i7);
                    getNotificationCenter().k(i7, new Object[0]);
                }
                int i10 = getArguments().getInt("nearby_distance", -1);
                if (i10 >= 0) {
                    bundle.putInt("nearby_distance", i10);
                }
                an anVar = new an(bundle);
                org.telegram.messenger.si mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f26516z0;
                mediaDataController.n1();
                anVar.X9 = document;
                anVar.Y9 = false;
                presentFragment(anVar, z10);
                if (org.telegram.messenger.g0.Q1() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public final void N5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f43135k0 != null && (imageView = this.f43142l0) != null) {
            if (this.L1 && (chat = this.F2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f43142l0.setVisibility(0);
                this.f43135k0.setTag(1);
                this.f43135k0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f43142l0.setVisibility(8);
            this.f43135k0.setTag(null);
            this.f43135k0.setVisibility(8);
        }
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.f43115h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    public final void O3() {
        int i7;
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            if (!this.V5 && this.U5 <= 0.0f) {
                i7 = 0;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            uv0Var.setPagesVisibleOverscanTop(i7);
        }
    }

    public final void O4() {
        TLRPC.ChatFull chatFull = this.f43211v2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f43211v2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new an(bundle));
            }
        }
    }

    public final void O5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        boolean z11;
        if ((this.f43209v0 != null || this.f43217w0 != null) && (kVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (kVar.getOccupyStatusBar()) {
                f10 = org.telegram.messenger.g0.f23603m;
            } else {
                f10 = 0.0f;
            }
            int L = org.telegram.messenger.g0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            av0 av0Var = this.f43209v0;
            boolean z12 = false;
            if (av0Var != null) {
                float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(right - av0Var.f43363g0) <= 0.1f && Math.abs(menuPillLeft - av0Var.f43364h0) <= 0.1f && Math.abs(A - av0Var.f43365i0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                av0Var.f43363g0 = right;
                av0Var.f43364h0 = menuPillLeft;
                if (z10) {
                    av0Var.f43370n0.e(true, menuPillLeft);
                }
                av0Var.f43365i0 = A;
                if (z11) {
                    av0Var.invalidate();
                }
            }
            di.u0 u0Var = this.f43217w0;
            if (u0Var != null) {
                float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
                int j42 = j4();
                if (Math.abs(right - u0Var.f9506r) > 0.1f || Math.abs(menuPillLeft - u0Var.f9507s) > 0.1f || Math.abs(A2 - u0Var.f9508w) > 0.1f) {
                    z12 = true;
                }
                u0Var.f9506r = right;
                u0Var.f9507s = menuPillLeft;
                if (z10) {
                    u0Var.E.e(true, menuPillLeft);
                }
                u0Var.f9508w = A2;
                u0Var.f9510y = j42 + A2;
                if (z12) {
                    u0Var.invalidate();
                }
            }
        }
    }

    @Override
    public final boolean P(yw ywVar) {
        return false;
    }

    public final void P3() {
        float alpha;
        boolean z10;
        int i7 = this.J1;
        float f10 = 0.0f;
        boolean z11 = true;
        if (i7 == 1 && (!this.f43172p5 || this.G1)) {
            this.f43215v6 = 0.0f;
        } else if (i7 == 2 && (!this.f43172p5 || this.G1)) {
            zu0 zu0Var = this.f43181r;
            if (zu0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = zu0Var.getAlpha();
            }
            this.f43215v6 = alpha;
        } else if (this.f43094e1 == org.telegram.messenger.m10.i(this.currentAccount).f24953n) {
            this.f43215v6 = (1.0f - this.f43187r5) * this.f43143l2;
        } else {
            this.f43215v6 = this.f43143l2 * this.f43187r5;
        }
        if (this.f43094e1 == org.telegram.messenger.m10.i(this.currentAccount).f24953n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f43201t5) {
            this.s5 = org.telegram.messenger.g0.L(28.0f) * this.f43215v6;
            zu0 zu0Var2 = this.f43181r;
            if (zu0Var2 != null) {
                zu0Var2.setTranslationX(l4(this.f43246z6, this.B6));
                this.Z.invalidate();
            }
        }
        if (z10) {
            if (this.f43201t5) {
                f10 = this.f43143l2;
            }
        } else if (this.f43207u5) {
            f10 = this.f43215v6;
        }
        tw0 tw0Var = this.D6;
        if (tw0Var != null) {
            tw0Var.f51681e = 1.0f - f10;
            tw0Var.invalidateSelf();
        }
        if (f10 <= 0.5f) {
            z11 = false;
        }
        this.f43239y6 = z11;
        K5();
    }

    public final void P4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f43219w2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                fi.i8 i8Var = new fi.i8(3, 1);
                i8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().z1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f43219w2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                i8Var.Q0 = false;
                i8Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.m10.f24934t0, tL_message, false, false));
                presentFragment(i8Var);
                return;
            }
            boolean z11 = org.telegram.messenger.r2.f26198a;
            org.telegram.messenger.t0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f43219w2.business_location.address, new Object[0]))));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void P5() {
        try {
            rv rvVar = this.U;
            if (rvVar != null && (rvVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.A0), 100));
            }
            float f10 = this.U5;
            Drawable drawable = this.E;
            int[] iArr = this.W6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.S6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.V6, this.A0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.T6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.A0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.U6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.A0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.eq eqVar = this.V6;
            if (eqVar != null) {
                eqVar.f34419y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nk, this.A0);
                if (this.f43062a != null) {
                    for (int i13 = 0; i13 < this.f43062a.getChildCount(); i13++) {
                        View childAt = this.f43062a.getChildAt(i13);
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

    public final void Q3() {
        boolean z10;
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            if (!this.V5 && this.f43077b6) {
                z10 = true;
            } else {
                z10 = false;
            }
            mu0Var.setVisibility(z10);
        }
    }

    public final void Q4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        gv0 gv0Var = new gv0(this, user.f28200id, this.f43102f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        gv0Var.Y0 = new hv0(this, i7, chatParticipant, z10, zArr);
        presentFragment(gv0Var);
    }

    public final void Q5() {
        boolean z10;
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        if (this.E2 == null && (((userFull = this.f43219w2) != null && userFull.ttl_period > 0) || (this.f43211v2 != null && org.telegram.messenger.t3.y(13, this.F2) && this.f43211v2.ttl_period > 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.Y3(this.Y0, z10, 0.8f, true, this.f43172p5);
    }

    @Override
    public final void R() {
        org.telegram.ui.Components.qs0 qs0Var;
        uv0 uv0Var = this.O;
        if (uv0Var != null && (qs0Var = this.R) != null) {
            uv0Var.setNewMediaCounts(qs0Var.f38762c);
        }
        if (this.d != null) {
            G5(false, false);
        }
        W();
        if (this.f43219w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void R3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.R3(boolean):void");
    }

    public final void R4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (e2Var instanceof an) {
                    finishFragment();
                    ((an) e2Var).f45118a0.q1(null, str, false, false);
                }
            }
        } else {
            yw ywVar = new yw(null);
            ywVar.f53721p2 = str;
            presentFragment(ywVar);
        }
    }

    public final void R5(boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        boolean z13;
        float f10;
        TLRPC.ChatFull chatFull;
        float f11 = 0.2f;
        int i11 = (K3() > 0.2f ? 1 : (K3() == 0.2f ? 0 : -1));
        int i12 = 0;
        if (i11 > 0 && !this.X1 && (this.f43182r0 == null || this.P2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43077b6 = z11;
        Q3();
        org.telegram.ui.Components.fh0 fh0Var = this.f43189s;
        if (fh0Var != null && fh0Var.getVisibility() != 8) {
            org.telegram.ui.Components.fh0 fh0Var2 = this.f43189s;
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.g0.f23603m;
            } else {
                i10 = 0;
            }
            fh0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) + this.Q1) + this.U1) - org.telegram.messenger.g0.L(29.5f));
            if (i11 > 0 && !this.X1 && !this.f43191s1 && (this.f43182r0 == null || this.P2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f43102f1 != 0) {
                if (org.telegram.messenger.t3.T(this.F2) && !this.F2.megagroup && (chatFull = this.f43211v2) != null && chatFull.linked_chat_id != 0 && (this.E3 != -1 || this.F3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.G1) {
                if (this.f43189s.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.f43189s.setTag(null);
                    } else {
                        this.f43189s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f43216w;
                    if (animatorSet != null) {
                        this.f43216w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f43216w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f43216w.playTogether(ObjectAnimator.ofFloat(this.f43189s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f43189s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f43189s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f43216w.playTogether(ObjectAnimator.ofFloat(this.f43189s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f43189s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f43189s, View.ALPHA, 0.0f));
                        }
                        this.f43216w.setDuration(150L);
                        this.f43216w.addListener(new bv0(this, 3));
                        this.f43216w.start();
                    } else {
                        org.telegram.ui.Components.fh0 fh0Var3 = this.f43189s;
                        if (z12) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        fh0Var3.setScaleX(f10);
                        org.telegram.ui.Components.fh0 fh0Var4 = this.f43189s;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        fh0Var4.setScaleY(f11);
                        org.telegram.ui.Components.fh0 fh0Var5 = this.f43189s;
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
        av0 av0Var = this.f43209v0;
        if (av0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f23603m;
            } else {
                i7 = 0;
            }
            av0Var.f43366j0 = measuredWidth;
            av0Var.f43368l0 = z12;
            av0Var.f43367k0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7;
            av0Var.invalidate();
        }
        di.u0 u0Var = this.f43217w0;
        if (u0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = org.telegram.messenger.g0.f23603m;
            }
            u0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.Q1 + this.U1);
        }
    }

    public final void S3(Context context) {
        int i7;
        this.f43064a1 = new org.telegram.messenger.qe(context, this.T0.getPopupLayout().getSwipeBack(), new nu0(this), false, 0, this.A0);
        if (this.f43123i1 > 0 || this.f43094e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, this.A0);
            org.telegram.messenger.qe qeVar = this.f43064a1;
            org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) qeVar.f26087e;
            if (z70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.hd.M0(2131753847, null), w02, new org.telegram.ui.Components.dg(qeVar, 10)));
                z70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f43219w2;
        if (userFull == null && this.f43211v2 == null) {
            i7 = 0;
        } else if (userFull != null) {
            i7 = userFull.ttl_period;
        } else {
            i7 = this.f43211v2.ttl_period;
        }
        org.telegram.ui.Components.c01 a10 = org.telegram.ui.Components.c01.a(i7);
        this.f43196t0 = a10;
        this.Z0 = this.T0.i(0, a10, org.telegram.messenger.hd.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43064a1.f26085b);
        this.T0.a(-1);
        q5();
    }

    public final boolean S4(float r25, float r26, int r27, android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.S4(float, float, int, android.view.View):boolean");
    }

    public final void S5() {
        org.telegram.ui.Components.wp0 wp0Var;
        org.telegram.ui.Components.vq0 vq0Var;
        org.telegram.ui.Components.z70 z70Var;
        int w02;
        int w03;
        int w04;
        int i7;
        int w05;
        int w06;
        int w07;
        this.f43153m6.clear();
        vw0 vw0Var = this.f43087d1;
        if (vw0Var != null) {
            vw0Var.a(this.f43147l6, true);
        }
        zu0 zu0Var = this.f43181r;
        if (zu0Var != null) {
            if (zu0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.j6.w0(((Integer) this.f43181r.getTag()).intValue(), this.A0);
            } else {
                w07 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.A0);
            }
            this.f43181r.setTextColor(i0.a.f(this.f43143l2, H3(w07, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        tw0 tw0Var = this.D6;
        float f10 = -0.1f;
        if (tw0Var != null) {
            tw0Var.a(i0.a.f(this.f43143l2, org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.f43080c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.f43147l6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.A0);
            }
            kVar.H(i0.a.f(this.U5, w05, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29243y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.cp cpVar = this.f43147l6;
            if (cpVar != null) {
                w06 = 1090519039;
            } else if (cpVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28889f8, this.A0);
            }
            kVar2.F(i0.a.f(this.U5, w06, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29262z8, this.A0)), false);
        }
        if (this.f43232y != null) {
            org.telegram.messenger.cp cpVar2 = this.f43147l6;
            if (cpVar2 != null) {
                int g10 = cpVar2.g();
                if (this.f43147l6.o(org.telegram.ui.ActionBar.j6.I.q())) {
                    i7 = this.f43147l6.k();
                } else {
                    i7 = this.f43147l6.i();
                }
                int f11 = i0.a.f(0.4f, g10, i7);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.j6.b(0.1f, f10, f11);
            } else {
                w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.A0);
            }
            this.f43232y.setColorFilter(org.telegram.messenger.g0.S0(this.U5, 1.0f, w04, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            if (this.f43147l6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29120ri, this.A0);
            }
            this.I.setColorFilter(org.telegram.messenger.g0.S0(this.U5, 1.0f, w03, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        ok okVar = this.f43100f;
        if (okVar != null) {
            if (this.f43147l6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29024mi, this.A0);
            }
            okVar.setTextColor(i0.a.f(this.f43143l2, i0.a.f(this.U5, w02, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0)), -1));
        }
        org.telegram.messenger.qe qeVar = this.f43064a1;
        if (qeVar != null && (z70Var = (org.telegram.ui.Components.z70) qeVar.f26087e) != null) {
            z70Var.invalidate();
        }
        Drawable drawable = this.f43224x;
        if (drawable != null) {
            if (this.f43147l6 == null) {
                i10 = i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28911gd, this.A0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.f43079c0;
        if (cg0Var != null) {
            cg0Var.setColor(this.f43147l6);
        }
        org.telegram.messenger.g0.d0(this.f43062a, new du0(this, 3));
        uv0 uv0Var = this.O;
        if (uv0Var != null && (vq0Var = uv0Var.L0) != null) {
            vq0Var.updateColors();
        }
        uv0 uv0Var2 = this.O;
        if (uv0Var2 != null && (wp0Var = uv0Var2.f42080b0) != null) {
            wp0Var.m();
        }
        T5();
        u5();
        av0 av0Var = this.f43209v0;
        if (av0Var != null) {
            av0Var.f(true, true);
        }
        di.u0 u0Var = this.f43217w0;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    public final void T3() {
        if (this.fragmentView != null && this.f43195s6 && this.f43242z2 != null && getParentActivity() != null) {
            zw0 zw0Var = this.E6;
            if (zw0Var != null) {
                zw0Var.b(this.f43242z2);
                this.E6.invalidate();
                return;
            }
            zw0 zw0Var2 = new zw0(this, this.f43242z2);
            this.E6 = zw0Var2;
            ((FrameLayout) this.fragmentView).addView(zw0Var2, c8.ja.e(-1, -1, 55));
        }
    }

    public final void T4() {
        int i7;
        ValueAnimator valueAnimator;
        if (this.f43176q2 && (valueAnimator = this.f43137k2) != null && valueAnimator.isRunning()) {
            this.f43103f2 = this.f43099e6;
            this.f43117h2 = this.f43107f6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        U4(K3(), currentActionBarHeight + i7);
    }

    public final void T5() {
        if (this.f43189s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29061oi, this.A0);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29081pi, this.A0);
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29042ni, this.A0);
                if (this.f43147l6 != null && org.telegram.ui.ActionBar.j6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.j6.b(0.05f, -0.04f, this.f43147l6.c(false));
                    org.telegram.messenger.cp cpVar = this.f43147l6;
                    if (cpVar != null) {
                        int d = cpVar.d(org.telegram.ui.ActionBar.j6.I.q());
                        w03 = org.telegram.ui.ActionBar.j6.D(org.telegram.ui.ActionBar.j6.I.q(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, this.A0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.fh0 fh0Var = this.t6;
                org.telegram.ui.Components.fh0 fh0Var2 = this.f43189s;
                int[] iArr = this.f43208u6;
                if (fh0Var != fh0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.t6 = fh0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231198).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(mutate, org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
                    int L = org.telegram.messenger.g0.L(56.0f);
                    int L2 = org.telegram.messenger.g0.L(56.0f);
                    fqVar.f34672e = L;
                    fqVar.f34673f = L2;
                    this.f43189s.setBackground(fqVar);
                    this.f43189s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void U3(Context context) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            org.telegram.messenger.g0.E2(w4Var);
        }
        kv0 kv0Var = new kv0(this, context, this.A0);
        this.simpleActionBar = kv0Var;
        kv0Var.setTitlesAlpha(0.0f);
        if (!this.f43172p5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new ne(3, this));
        if (this.J0) {
            this.simpleActionBar.setBackButtonImage(2131232486);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.M0(2131746500, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231240);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 3));
        if (!this.J0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new fi.b2(6, this, backButton));
        }
    }

    public final void U4(float f10, float f11) {
        float T1;
        int i7;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - i4()) / ((this.f43062a.getMeasuredWidth() - f11) - j4())));
        if (this.Q1 < i4() && max < 0.33f) {
            T1 = com.google.android.gms.internal.vision.e2.y(f10, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * T1)) * f10) + ((float) Math.floor(translationY + (org.telegram.messenger.i20.b(f10, 1.0f, currentActionBarHeight, i7) - (org.telegram.messenger.g0.f23608p * 21.0f))));
        this.f43103f2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.f43117h2 = (((float) Math.floor(org.telegram.messenger.g0.f23608p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void V4() {
        ou0 ou0Var = this.f43062a;
        if (ou0Var != null && this.f43078c != null && ou0Var.getChildCount() > 0 && !this.f43188r6) {
            View view = null;
            int i7 = Integer.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < this.f43062a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.f43062a.getChildAt(i11));
                View childAt = this.f43062a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f43173p6 = i10;
                int top = view.getTop();
                this.f43180q6 = top;
                if (this.f43173p6 == 0 && !this.f43169p2 && top > i4()) {
                    this.f43180q6 = i4();
                }
                this.f43078c.h1(i10, view.getTop() - this.f43062a.getPaddingTop());
            }
        }
    }

    @Override
    public final void W() {
        int i7;
        String str;
        int size;
        int i10;
        uv0 uv0Var = this.O;
        if (uv0Var != null && this.f43181r != null) {
            int closestTab = uv0Var.getClosestTab();
            int[] iArr = this.R.f38762c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        h5(org.telegram.messenger.hd.M0(2131745409, null));
                    } else {
                        h5(org.telegram.messenger.hd.G(i12, "Media", new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        h5(org.telegram.messenger.hd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    h5(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                } else {
                    h5(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    h5(org.telegram.messenger.hd.M0(2131750826, null));
                } else {
                    h5(org.telegram.messenger.hd.G(i13, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    h5(org.telegram.messenger.hd.M0(2131743523, null));
                } else {
                    h5(org.telegram.messenger.hd.G(i14, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    h5(org.telegram.messenger.hd.M0(2131745411, null));
                } else {
                    h5(org.telegram.messenger.hd.G(i15, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    h5(org.telegram.messenger.hd.M0(2131748319, null));
                } else {
                    h5(org.telegram.messenger.hd.G(i16, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    h5(org.telegram.messenger.hd.M0(2131754879, null));
                } else {
                    h5(org.telegram.messenger.hd.G(i17, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                h5(org.telegram.messenger.hd.G(this.f43219w2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                h5(this.f43181r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.ys0.J0(closestTab)) {
                if (closestTab == 13) {
                    h5(this.O.f0(true));
                } else if (closestTab == 9) {
                    h5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(this.currentAccount).L0(a());
                    if (this.f43192s2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (L0 == null) {
                        size = 0;
                    } else {
                        size = L0.f25786b.size() + L0.f25787c;
                    }
                    h5(org.telegram.messenger.hd.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.tv G1 = getMessagesController().G1();
                    long a10 = a();
                    ArrayList arrayList = G1.f26740j;
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i18);
                            if (svVar.f26569a == a10) {
                                i7 = svVar.f26572e;
                                break;
                            }
                            i18++;
                        } else {
                            i7 = 0;
                            break;
                        }
                    }
                    h5(org.telegram.messenger.hd.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.wp0 wp0Var = this.O.f42080b0;
                    if (wp0Var != null) {
                        i11 = wp0Var.getGiftsCount();
                    }
                    h5(org.telegram.messenger.hd.H(',', "ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i19 = iArr[8];
                    if (i19 <= 0) {
                        h5(org.telegram.messenger.hd.M0(2131745403, null));
                    } else {
                        h5(org.telegram.messenger.hd.H(',', "ProfilePollsCount", i19));
                    }
                }
            } else if (this.f43192s2) {
                h5(this.O.f0(false));
            } else if (this.O.m0(closestTab) > 0) {
                h5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                h5(org.telegram.messenger.hd.M0(2131746625, null));
            }
        }
    }

    public final void W3(float f10) {
        boolean z10;
        ValueAnimator ofFloat;
        long j3;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f43166o6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f43166o6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f43233y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new zt0(this, 0));
        this.f43166o6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f43166o6;
        if (z10) {
            j3 = 150;
        } else {
            j3 = 220;
        }
        animatorSet2.setDuration(j3);
        if (!z10) {
            this.f43166o6.addListener(new bv0(this, 6));
        }
        this.f43166o6.start();
    }

    public final void W4(boolean z10) {
        int i7 = this.L4;
        if (i7 >= 0) {
            if (z10) {
                pi.l lVar = new pi.l(getParentActivity(), 2, 0.6f);
                lVar.f58480a = this.L4;
                lVar.f55123p = -this.f43062a.getPaddingTop();
                this.f43078c.w0(lVar);
                return;
            }
            this.f43078c.h1(i7, -this.f43062a.getPaddingTop());
        }
    }

    public final void X3(int i7, View view) {
        boolean z10;
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
        H.W(this.f43062a.U0(view, false));
        H.f37114w = false;
        if (this.f43219w2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232104, org.telegram.messenger.hd.M0(2131751767, null), new k90(this, 4), z10);
        H.c(2131232117, org.telegram.messenger.hd.M0(2131751335, null), new k90(this, 5), false);
        H.c(2131232109, org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.Components.a2(this, i7, 26), true);
        H.Z();
    }

    @Override
    public final boolean Y() {
        return this.A1;
    }

    public final boolean Y3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f43191s1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f43219w2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.f28200id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String M02 = org.telegram.messenger.hd.M0(2131744194, null);
                if (i7 != this.L3 && i7 != this.K3 && i7 != this.X2) {
                    if (i7 == this.P3) {
                        str = kg.c1.k0(this.currentAccount, f10, userFull.business_work_hours);
                        M0 = org.telegram.messenger.hd.M0(2131746665, null);
                        M02 = org.telegram.messenger.hd.M0(2131752761, null);
                    } else if (i7 == this.Q3) {
                        str = userFull.business_location.address;
                        M0 = org.telegram.messenger.hd.M0(2131746660, null);
                        M02 = org.telegram.messenger.hd.M0(2131752693, null);
                    } else if (i7 == this.M3) {
                        str = org.telegram.messenger.q10.n(f10);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = org.telegram.messenger.hd.M0(2131746678, null);
                        M02 = org.telegram.messenger.hd.M0(2131743665, null);
                    } else if (i7 == this.H3) {
                        str = f10.phone;
                        M02 = org.telegram.messenger.hd.M0(2131747295, null);
                    } else if (i7 == this.V2) {
                        str = UserInfoActivity.e0(this.f43219w2.birthday);
                        M02 = org.telegram.messenger.hd.M0(2131753716, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i7 == this.X2) {
                        M02 = org.telegram.messenger.hd.M0(2131753721, null);
                    }
                }
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
                H.W(this.f43062a.U0(view, false));
                H.f37114w = false;
                H.f37093i = 3;
                if (i7 == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(2131232421, org.telegram.messenger.hd.M0(2131746656, null), new k90(this, 7), false);
                    }
                    H.c(2131232214, org.telegram.messenger.hd.M0(2131746658, null), new k90(this, 9), false);
                }
                if (str != null) {
                    H.c(2131232104, M0, new lc0(this, str, M02, 25), false);
                }
                if (i7 == this.P3) {
                    H.c(2131232117, org.telegram.messenger.hd.M0(2131746664, null), new k90(this, 10), false);
                    H.c(2131232109, org.telegram.messenger.hd.M0(2131746663, null), new Runnable(this) {
                        public final ProfileActivity f53321b;

                        {
                            this.f53321b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f53321b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M03;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                    t1Var2.S = M04;
                                    t1Var2.U = org.telegram.messenger.hd.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.Q3) {
                    H.c(2131232117, org.telegram.messenger.hd.M0(2131746659, null), new k90(this, 11), false);
                    H.c(2131232109, org.telegram.messenger.hd.M0(2131746657, null), new Runnable(this) {
                        public final ProfileActivity f53321b;

                        {
                            this.f53321b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r4;
                            final int i11 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f53321b;
                            switch (i10) {
                                case 0:
                                    RectF rectF = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M03;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                    t1Var2.S = M04;
                                    t1Var2.U = org.telegram.messenger.hd.M0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                                            int i13 = r4;
                                            int i14 = i11;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i13) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i14);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i7 == this.M3) {
                    H.c(2131232117, org.telegram.messenger.hd.M0(2131746620, null), new k90(this, 12), false);
                } else if (i7 != this.L3 && i7 != this.K3 && i7 != this.X2) {
                    if (i7 == this.H3) {
                        H.c(2131231894, org.telegram.messenger.hd.M0(2131746646, null), new k90(this, 14), false);
                    } else if (i7 == this.V2) {
                        H.c(2131232117, org.telegram.messenger.hd.M0(2131746723, null), new Runnable(this) {
                            public final ProfileActivity f52291b;

                            {
                                this.f52291b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f52291b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.X6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.gh(25, profileActivity, userFull2), new k90(profileActivity, 15), false, false, profileActivity.A0).f25804b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                        t1Var.S = M03;
                                        t1Var.U = org.telegram.messenger.hd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                        t1Var2.S = M04;
                                        t1Var2.U = org.telegram.messenger.hd.M0(2131746683, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(2131232109, org.telegram.messenger.hd.M0(2131746321, null), new Runnable(this) {
                            public final ProfileActivity f52291b;

                            {
                                this.f52291b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f52291b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.X6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.gh(25, profileActivity, userFull2), new k90(profileActivity, 15), false, false, profileActivity.A0).f25804b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                        t1Var.S = M03;
                                        t1Var.U = org.telegram.messenger.hd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                        t1Var2.S = M04;
                                        t1Var2.U = org.telegram.messenger.hd.M0(2131746683, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == this.R2) {
                        TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                        if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                            H.c(2131232104, org.telegram.messenger.hd.M0(2131746681, null), new mp0(13, this, M03), false);
                        }
                        H.c(2131232117, org.telegram.messenger.hd.M0(2131746684, null), new k90(this, 8), false);
                        H.c(2131232109, org.telegram.messenger.hd.M0(2131746321, null), new Runnable(this) {
                            public final ProfileActivity f52291b;

                            {
                                this.f52291b = this;
                            }

                            @Override
                            public final void run() {
                                int i10 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f52291b;
                                switch (i10) {
                                    case 0:
                                        RectF rectF = ProfileActivity.X6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.gh(25, profileActivity, userFull2), new k90(profileActivity, 15), false, false, profileActivity.A0).f25804b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M032 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                        t1Var.S = M032;
                                        t1Var.U = org.telegram.messenger.hd.M0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                        t1Var2.S = M04;
                                        t1Var2.U = org.telegram.messenger.hd.M0(2131746683, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i11) {
                                                int i12 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i12) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(2131232117, org.telegram.messenger.hd.M0(2131746677, null), new k90(this, 13), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Y4() {
        org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
        if (hf0Var != null) {
            if (this.f43191s1) {
                hf0Var.F = 6;
            } else if (this.f43175q1) {
                hf0Var.F = 5;
            } else if (this.f43192s2) {
                hf0Var.F = 2;
            } else if (this.f43094e1 != 0) {
                hf0Var.F = 0;
            } else if (this.f43102f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f43102f1));
                if (org.telegram.messenger.t3.T(M0)) {
                    if (org.telegram.messenger.t3.n0(M0)) {
                        this.f43063a0.F = 3;
                        return;
                    } else if (org.telegram.messenger.t3.c0(M0)) {
                        this.f43063a0.F = 4;
                        return;
                    } else {
                        this.f43063a0.F = 1;
                        return;
                    }
                }
                this.f43063a0.F = 3;
            }
        }
    }

    public final boolean Z3() {
        v4.e1 e1Var;
        View view;
        if ((this.J0 || (!org.telegram.messenger.g0.Q1() && !this.f43163o2)) && this.f43101f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.G0 = true;
            this.f43169p2 = true;
            int i7 = 0;
            while (true) {
                e1Var = null;
                if (i7 < this.f43062a.getChildCount()) {
                    if (RecyclerView.R(this.f43062a.getChildAt(i7)) == 0) {
                        view = this.f43062a.getChildAt(i7);
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                ou0 ou0Var = this.f43062a;
                View F = ou0Var.F(view);
                if (F != null) {
                    e1Var = ou0Var.T(F);
                }
                if (e1Var != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(e1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f43062a.w0(0, -(((this.f43062a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.er.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Z4(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.Z4(float):void");
    }

    public final long a() {
        long j3 = this.f43123i1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.f43094e1;
        if (j10 != 0) {
            return j10;
        }
        return -this.f43102f1;
    }

    public final void a4() {
        TLRPC.Chat chat = this.F2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f43211v2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i7 = 0; i7 < this.f43211v2.participants.participants.size(); i7++) {
                    TLRPC.ChatParticipant chatParticipant = this.f43211v2.participants.participants.get(i7);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28888f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29007li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28924h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29138si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29024mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28911gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28889f8));
    }

    public final boolean b4() {
        org.telegram.ui.ActionBar.o4 o4Var;
        if (this.J1 != 0 && (o4Var = this.parentLayout) != null && o4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof an)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void b5(float f10) {
        this.N5 = f10;
        org.telegram.ui.Components.lf0 lf0Var = this.M5;
        if (lf0Var != null) {
            lf0Var.b(f10);
        }
        D5();
    }

    public final void c4() {
        if (this.f43062a == null) {
            return;
        }
        float x10 = org.telegram.ui.Cells.y0.x(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.f43081c2, 0.5f, this.f43062a.getMeasuredWidth() / 2.0f);
        this.f43065a2 = x10;
        if (this.G1) {
            this.f43065a2 = org.telegram.messenger.g0.T1(this.f43128i6, x10, this.T1);
        }
        this.Y.setTranslationX(this.f43065a2);
    }

    public final void c5(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f43211v2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f43148m1 == 0) {
                this.f43148m1 = -j3;
                getMediaDataController().e0(this.f43148m1, this.classGuid, this.f43109g1);
            }
        }
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.setChatInfo(this.f43211v2);
        }
        yu0 yu0Var = this.f43161o0;
        if (yu0Var != null && !this.f43175q1) {
            yu0Var.setChatInfo(this.f43211v2);
        }
        av0 av0Var = this.f43209v0;
        if (av0Var != null && (chatFull3 = this.f43211v2) != null) {
            av0Var.setStories(chatFull3.stories);
        }
        di.u0 u0Var = this.f43217w0;
        if (u0Var != null) {
            u0Var.a();
        }
        xu0 xu0Var = this.f43101f0;
        if (xu0Var != null) {
            xu0Var.setHasStories(z4());
        }
        a4();
        if (this.f43102f1 != 0) {
            boolean z11 = org.telegram.messenger.r2.f26198a;
            if (!getMessagesController().i7 && (chatFull2 = this.f43211v2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.R(38, z10);
            org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
            if (hf0Var != null) {
                hf0Var.o(3, z10);
            }
        }
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
        this.f43147l6 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.k");
    }

    @Override
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final int d4() {
        int i7 = 0;
        if (this.f43094e1 != 0 && this.f43182r0 != null && !this.f43191s1) {
            return 0;
        }
        return org.telegram.messenger.g0.L(74 + ((this.J4 || this.K4) ? 25 : 25));
    }

    public final void d5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.I6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.I6 = tL_emojiStatusCollectible;
                hi.l3 l3Var = this.F6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.H6 = null;
                    this.F6 = new hi.l3(getParentActivity(), 3);
                    this.G6 = org.telegram.ui.ActionBar.j6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.F6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                    hi.l3 l3Var2 = this.F6;
                    int r12 = org.telegram.ui.ActionBar.j6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    l3Var2.M0 = true;
                    l3Var2.U0 = System.currentTimeMillis();
                    l3Var2.N0 = new Path();
                    l3Var2.O0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
                    l3Var2.P0 = new Paint(1);
                    l3Var2.Q0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, r12), org.telegram.ui.ActionBar.j6.r1(1.0f, r12), org.telegram.ui.ActionBar.j6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    l3Var2.T0 = linearGradient;
                    l3Var2.Q0.setShader(linearGradient);
                    l3Var2.R0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, r12), org.telegram.ui.ActionBar.j6.r1(0.5f, r12), org.telegram.ui.ActionBar.j6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    l3Var2.S0 = new Matrix();
                    l3Var2.P0.setShader(l3Var2.R0);
                    l3Var2.Q0.setStyle(Paint.Style.STROKE);
                    l3Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
                    l3Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
                    l3Var2.Q0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                    this.Z.addView(this.F6, c8.ja.c(24.0f, -1));
                    this.F6.v(9.33f);
                    hi.l3 l3Var3 = this.F6;
                    Typeface o4 = org.telegram.messenger.g0.o();
                    l3Var3.I.x(o4);
                    l3Var3.K.setTypeface(o4);
                    this.F6.u(tL_emojiStatusCollectible.title);
                    hi.l3 l3Var4 = this.F6;
                    l3Var4.d = -1L;
                    l3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
                    hi.l3 l3Var5 = this.F6;
                    l3Var5.getClass();
                    l3Var5.E = org.telegram.messenger.g0.N(4.0f);
                    l3Var5.F = org.telegram.messenger.g0.N(2.66f);
                    this.F6.t();
                    this.F6.s(16.0f);
                    this.F6.w();
                    this.F6.setOnClickListener(new gu0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < org.telegram.messenger.g0.L(82.0f)) {
                        this.H6 = Boolean.FALSE;
                        this.F6.setAlpha(0.0f);
                    }
                    s5();
                    hi.l3 l3Var6 = this.F6;
                    Objects.requireNonNull(l3Var6);
                    org.telegram.messenger.g0.i3(new py(l3Var6, 1), 6000L);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        iw0 iw0Var;
        boolean z10;
        org.telegram.ui.ActionBar.o4 o4Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        ou0 ou0Var;
        ou0 ou0Var2;
        org.telegram.ui.Components.cj0 cj0Var;
        if (i7 != org.telegram.messenger.ns.B5 && i7 != org.telegram.messenger.ns.f25550p3) {
            boolean z12 = true;
            int i11 = 0;
            r3 = false;
            boolean z13 = false;
            if (i7 == org.telegram.messenger.ns.f25559r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.np.D8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f43094e1 != 0) {
                    if (objArr3 != null) {
                        L5(true);
                    }
                    if ((intValue & 1024) != 0 && (ou0Var2 = this.f43062a) != null && (cj0Var = (org.telegram.ui.Components.cj0) ou0Var2.L(this.H3, false)) != null) {
                        this.d.t(cj0Var, this.H3);
                    }
                } else if (this.f43102f1 != 0) {
                    int i13 = intValue & 8192;
                    if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i13 != 0) {
                            G5(true, false);
                        } else {
                            J5(true);
                        }
                        L5(true);
                    }
                    if (objArr3 != null && (ou0Var = this.f43062a) != null) {
                        int childCount = ou0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = this.f43062a.getChildAt(i14);
                            if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.f25499g1) {
                Long l10 = (Long) objArr[0];
                if (this.f43211v2 != null && (chat = this.F2) != null && chat.f28051id == l10.longValue()) {
                    this.f43211v2.online_count = ((Integer) objArr[1]).intValue();
                    J5(true);
                    L5(false);
                }
            } else if (i7 != org.telegram.messenger.ns.O && i7 != org.telegram.messenger.ns.f25470b1) {
                if (i7 == org.telegram.messenger.ns.f25463a0) {
                    if (this.f43130j1) {
                        org.telegram.messenger.g0.h3(new mp0(11, this, objArr));
                    }
                } else if (i7 == org.telegram.messenger.ns.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.E2;
                    if (encryptedChat2 != null && encryptedChat.f28059id == encryptedChat2.f28059id) {
                        this.E2 = encryptedChat;
                        G5(false, false);
                        org.telegram.messenger.n6 n6Var = this.Y1;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.f25498g0) {
                    boolean z14 = this.f43136k1;
                    if (getMessagesController().H0.indexOfKey(this.f43094e1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f43136k1 = z11;
                    if (z14 != z11) {
                        R3(true);
                        G5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.ns.f25595w2) {
                    Long l11 = (Long) objArr[0];
                    if (this.F2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.F2;
                        if (longValue == chat2.f28051id && org.telegram.messenger.t3.w(14, chat2)) {
                            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.currentAccount).N0(l11.longValue());
                            if (N0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f43211v2;
                                if (chatFull4 != null) {
                                    N0.participants = chatFull4.participants;
                                }
                                this.f43211v2 = N0;
                            }
                            uv0 uv0Var = this.O;
                            if (uv0Var != null) {
                                uv0Var.setChatInfo(this.f43211v2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f43211v2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f43168p1) || (inputGroupCall != null && this.f43168p1))) {
                                R3(false);
                            }
                            av0 av0Var = this.f43209v0;
                            if (av0Var != null && (chatFull3 = this.f43211v2) != null) {
                                av0Var.setStories(chatFull3.stories);
                            }
                            di.u0 u0Var = this.f43217w0;
                            if (u0Var != null) {
                                u0Var.a();
                            }
                            xu0 xu0Var = this.f43101f0;
                            if (xu0Var != null) {
                                xu0Var.setHasStories(z4());
                            }
                            if (l11.longValue() != 0) {
                                boolean z15 = org.telegram.messenger.r2.f26198a;
                                z12 = (getMessagesController().i7 || (chatFull2 = this.f43211v2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.R(38, z12);
                                org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
                                if (hf0Var != null) {
                                    hf0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f43094e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f43094e1))) != null && chatFull6.f28052id == a22.linked_community_id) {
                        G5(true, false);
                    }
                    TLRPC.Chat chat3 = this.F2;
                    if (chat3 != null && chatFull6.f28052id == chat3.linked_community_id) {
                        G5(true, false);
                    }
                    if (chatFull6.f28052id == this.f43102f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f43211v2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f43211v2 = chatFull6;
                        if (this.f43148m1 == 0) {
                            long j3 = chatFull6.migrated_from_chat_id;
                            if (j3 != 0) {
                                this.f43148m1 = -j3;
                                getMediaDataController().d0(0, this.classGuid, this.f43148m1, this.f43109g1, true);
                            }
                        }
                        a4();
                        yu0 yu0Var = this.f43161o0;
                        if (yu0Var != null && !this.f43175q1) {
                            yu0Var.setChatInfo(this.f43211v2);
                        }
                        G5(true, false);
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f43102f1));
                        if (M0 != null) {
                            this.F2 = M0;
                            R3(true);
                        }
                        org.telegram.messenger.n6 n6Var2 = this.Y1;
                        if (n6Var2 != null) {
                            n6Var2.g();
                        }
                        if (this.F2.megagroup && (objArr2 != null || !booleanValue)) {
                            g4(true);
                        }
                        q5();
                        Q5();
                        av0 av0Var2 = this.f43209v0;
                        if (av0Var2 != null && (chatFull = this.f43211v2) != null) {
                            av0Var2.setStories(chatFull.stories);
                        }
                        di.u0 u0Var2 = this.f43217w0;
                        if (u0Var2 != null) {
                            u0Var2.a();
                        }
                        xu0 xu0Var2 = this.f43101f0;
                        if (xu0Var2 != null) {
                            xu0Var2.setHasStories(z4());
                        }
                        uv0 uv0Var2 = this.O;
                        if (uv0Var2 != null) {
                            uv0Var2.setChatInfo(this.f43211v2);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.f25572t) {
                    removeSelfFromStack(true);
                } else if (i7 == org.telegram.messenger.ns.v) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (o4Var = this.parentLayout) != null && o4Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f43094e1) {
                        this.G2 = botInfo;
                        G5(false, false);
                    }
                } else if (i7 == org.telegram.messenger.ns.E0) {
                    if (((Long) objArr[0]).longValue() == this.f43094e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f43219w2 = userFull;
                        org.telegram.ui.Components.mu0 mu0Var = this.T;
                        if (mu0Var != null) {
                            mu0Var.set(userFull.stars_rating);
                        }
                        av0 av0Var3 = this.f43209v0;
                        if (av0Var3 != null) {
                            av0Var3.setStories(this.f43219w2.stories);
                        }
                        di.u0 u0Var3 = this.f43217w0;
                        if (u0Var3 != null) {
                            u0Var3.a();
                        }
                        xu0 xu0Var3 = this.f43101f0;
                        if (xu0Var3 != null) {
                            xu0Var3.setHasStories(z4());
                        }
                        uv0 uv0Var3 = this.O;
                        if (uv0Var3 != null) {
                            uv0Var3.setUserInfo(this.f43219w2);
                        }
                        if (this.f43182r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f43219w2.about, this.A2)) {
                                this.d.g(this.X2);
                            }
                            if (this.f43191s1) {
                                G5(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.L0) {
                                R3(true);
                            } else {
                                this.I1 = true;
                            }
                            G5(false, false);
                            uv0 uv0Var4 = this.O;
                            if (uv0Var4 != null) {
                                uv0Var4.setCommonGroupsCount(this.f43219w2.common_chats_count);
                                W();
                                org.telegram.ui.Components.qs0 qs0Var = this.R;
                                if (qs0Var == null || qs0Var.E) {
                                    resumeDelayedFragmentAnimation();
                                    A4(true);
                                }
                            }
                        }
                        q5();
                        Q5();
                        if (this.f43227x2 == null && !x4()) {
                            org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(this.currentAccount);
                            this.f43227x2 = d6Var;
                            k90 k90Var = new k90(this, 17);
                            if (d6Var.f30142c) {
                                k90Var.run();
                            } else {
                                d6Var.h.add(k90Var);
                            }
                            this.f43227x2.d(this.f43219w2);
                        }
                        if (!x4()) {
                            ww0 ww0Var = this.f43242z2;
                            ww0 c10 = ww0.c(this.currentAccount, this.f43219w2, ww0Var);
                            this.f43242z2 = c10;
                            if (c10 != ww0Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f43235y2 = z10;
                            if (c10 != null) {
                                k90 k90Var2 = new k90(this, 18);
                                if (c10.f53016b) {
                                    k90Var2.run();
                                } else {
                                    c10.h.add(k90Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (t4()) {
                                this.T0.T(44);
                            } else {
                                this.T0.u(44);
                            }
                            TLRPC.UserFull userFull2 = this.f43219w2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.T0.R(46, z13);
                            this.T0.R(47, !z13);
                        }
                    }
                } else if (i7 != org.telegram.messenger.ns.f25521k0) {
                    if (i7 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i15);
                                if (this.E2 != null) {
                                    TLRPC.MessageAction messageAction = gjVar.f23817k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (iw0Var = this.d) != null) {
                                        iw0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i7 == org.telegram.messenger.ns.f25514i4) {
                        ou0 ou0Var3 = this.f43062a;
                        if (ou0Var3 != null) {
                            ou0Var3.g1();
                        }
                    } else if (i7 == org.telegram.messenger.ns.f25604x4) {
                        G5(false, false);
                    } else if (i7 == org.telegram.messenger.ns.f25568s1) {
                        int i16 = this.f43088d3;
                        int i17 = this.f43074b3;
                        int i18 = this.Z2;
                        M5();
                        iw0 iw0Var2 = this.d;
                        if (iw0Var2 != null) {
                            if (i16 != this.f43088d3 || i17 != this.f43074b3 || i18 != this.Z2) {
                                iw0Var2.f();
                            }
                        }
                    } else if (i7 == org.telegram.messenger.ns.f25558q5) {
                        if (this.f43175q1) {
                            L5(false);
                        }
                    } else if (i7 == org.telegram.messenger.ns.D1) {
                        sw0 sw0Var = this.f43092e;
                        if (sw0Var != null) {
                            sw0Var.f51286c = sw0.H(this);
                            this.f43092e.f51292w.clear();
                            this.f43092e.J();
                            sw0 sw0Var2 = this.f43092e;
                            sw0Var2.I(sw0Var2.E);
                        }
                    } else if (i7 == org.telegram.messenger.ns.f25475c0) {
                        L5(false);
                    } else if (i7 != org.telegram.messenger.ns.f25591v5 && i7 != org.telegram.messenger.ns.F5) {
                        if (i7 == org.telegram.messenger.ns.f25513i3) {
                            org.telegram.ui.ActionBar.d5 d5Var = this.T0;
                            if (d5Var != null) {
                                TL_account.RequirementToContact J2 = getMessagesController().J2(this.f43094e1);
                                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                                    z12 = false;
                                }
                                d5Var.R(20, z12);
                            }
                            t5();
                        } else if (i7 == org.telegram.messenger.ns.f25497f5) {
                            t5();
                        } else if (i7 == org.telegram.messenger.ns.f25610y3) {
                            G5(false, false);
                        } else if (i7 == org.telegram.messenger.ns.C3) {
                            G5(false, false);
                        } else if (i7 == org.telegram.messenger.ns.D3) {
                            G5(false, false);
                        } else if (i7 == org.telegram.messenger.ns.f25608y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
                                if (o4Var2 != null && o4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ns.f25495f3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.L4 < 0 && longValue3 == a()) {
                                M5();
                                W();
                                iw0 iw0Var3 = this.d;
                                if (iw0Var3 != null) {
                                    iw0Var3.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ns.G3) {
                            if (((Long) objArr[0]).longValue() == a() && !x4()) {
                                if (this.L4 < 0) {
                                    M5();
                                    W();
                                    iw0 iw0Var4 = this.d;
                                    if (iw0Var4 != null) {
                                        iw0Var4.f();
                                    }
                                    org.telegram.messenger.g0.h3(new k90(this, 19));
                                    return;
                                }
                                uv0 uv0Var5 = this.O;
                                if (uv0Var5 != null) {
                                    uv0Var5.P1(true);
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ns.V3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f43094e1 > 0) {
                                TLRPC.UserFull b22 = getMessagesController().b2(this.f43094e1);
                                if (b22 != null) {
                                    this.f43219w2 = b22;
                                }
                                M5();
                                W();
                                ou0 ou0Var4 = this.f43062a;
                                if (ou0Var4 != null && ou0Var4.c0()) {
                                    this.f43062a.post(new k90(this, 20));
                                    return;
                                }
                                iw0 iw0Var5 = this.d;
                                if (iw0Var5 != null) {
                                    iw0Var5.f();
                                }
                            }
                        } else if (i7 == org.telegram.messenger.ns.W3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.F2;
                            if (chat4 != null && chat4.f28051id == longValue4) {
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
                                    ArrayList arrayList2 = this.S4;
                                    if (i11 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                                        i11++;
                                    } else {
                                        org.telegram.messenger.g0.a4(this.f43062a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        xu0 xu0Var4 = this.f43101f0;
                        if (xu0Var4 != null) {
                            xu0Var4.setHasStories(z4());
                            this.f43101f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(r4(), 0.0f, this.f43143l2));
                        }
                        av0 av0Var4 = this.f43209v0;
                        if (av0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f43219w2;
                            if (userFull3 != null) {
                                av0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f43211v2;
                            if (chatFull8 != null) {
                                av0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                R3(true);
            }
        } else if (org.telegram.messenger.t3.R(org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(this.f43102f1)))) {
            getMessagesController().P1().k(a(), new fi.e(22), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null && m30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if ((m30Var == null || dialog != m30Var.f37042c) && super.dismissDialogOnPause(dialog)) {
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

    public final int e4(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof org.telegram.ui.Components.g51) {
            return ((org.telegram.ui.Components.g51) imageReceiver.t()).f34816a.a();
        }
        return org.telegram.messenger.g0.p(this.f43101f0.getImageReceiver().n());
    }

    @Override
    public final org.telegram.ui.Components.uj0 f() {
        return this.f43062a;
    }

    public final org.telegram.ui.Components.e5 f4(long j3) {
        if (this.H == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), 2, this.f43100f, false);
            this.H = e5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            e5Var.J = 0;
            e5Var.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        if (j3 != 0) {
            this.H.j(j3, false);
        } else {
            this.H.g(null, false);
        }
        u5();
        return this.H;
    }

    @Override
    public final TLRPC.Chat g() {
        return this.F2;
    }

    public final void g4(boolean z10) {
        a0.h hVar;
        int i7;
        if (!this.B1 && (hVar = this.C1) != null && this.f43211v2 != null) {
            this.B1 = true;
            int i10 = 0;
            if (hVar.m() != 0 && z10) {
                i7 = 300;
            } else {
                i7 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().h1(this.f43102f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i10 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i10;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.u(this, tL_channels_getParticipants, i7)), this.classGuid);
        }
    }

    public final void g5(bw0 bw0Var) {
        if (this.f43152m5 == bw0Var) {
            return;
        }
        this.f43152m5 = bw0Var;
        org.telegram.messenger.g0.d0(this.f43062a, new du0(this, 0));
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override
    public final uq0 getCloseIntoObject() {
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
        g6 g6Var = new g6(18, this);
        ArrayList arrayList = new ArrayList();
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            arrayList.addAll(uv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43087d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43101f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f43174q0}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28851d8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43189s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29042ni));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43189s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29061oi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43189s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29081pi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29222x6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29070p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29049o6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29165u6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29184v6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29260z6));
        int i7 = org.telegram.ui.ActionBar.j6.Ji;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43062a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
        if (this.V5) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43100f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Fj));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43100f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f43232y}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43100f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29120ri));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43100f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f43232y}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29100qi));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.A0);
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

    public final org.telegram.ui.Components.e5 h4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.G == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 2, this.f43100f, false);
            this.G = e5Var;
            if (this.H0) {
                e5Var.a();
            }
        }
        if (this.G.d()) {
            z10 = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(n4(), z10);
                this.G.m(false, z10);
            } else {
                this.G.j(tL_emojiStatus.document_id, z10);
                this.G.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(n4(), z10);
                this.G.m(false, z10);
            } else {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z10);
                this.G.m(true, z10);
            }
        } else {
            this.G.g(n4(), z10);
            this.G.m(false, z10);
        }
        u5();
        return this.G;
    }

    public final void h5(CharSequence charSequence) {
        this.f43069a6 = charSequence;
        K5();
    }

    public final int i4() {
        return d4() + j4();
    }

    public final void i5(int i7) {
        boolean z10;
        SharedPreferences e12 = org.telegram.messenger.np.e1();
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
            N5();
            if (e12.getBoolean("view_animations", true)) {
                this.J1 = i7;
            } else if (i7 == 2) {
                this.n1 = true;
            }
        }
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f43176q2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f43176q2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.x()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29205w8, this.A0);
            } else if (!this.V5 && this.E5 <= 0.5f) {
                org.telegram.messenger.cp cpVar = this.f43147l6;
                if (cpVar != null) {
                    w02 = cpVar.d(org.telegram.ui.ActionBar.j6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.A0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.A0);
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
        if (d4() == 0) {
            return org.telegram.messenger.g0.L(168.0f);
        }
        return org.telegram.messenger.g0.L(152.0f);
    }

    public final void j5(TLRPC.UserFull userFull, org.telegram.ui.Cells.d6 d6Var, ww0 ww0Var) {
        boolean z10;
        this.f43219w2 = userFull;
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            mu0Var.set(userFull.stars_rating);
        }
        av0 av0Var = this.f43209v0;
        if (av0Var != null) {
            av0Var.setStories(this.f43219w2.stories);
        }
        di.u0 u0Var = this.f43217w0;
        if (u0Var != null) {
            u0Var.a();
        }
        xu0 xu0Var = this.f43101f0;
        if (xu0Var != null) {
            xu0Var.setHasStories(z4());
        }
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.setUserInfo(this.f43219w2);
        }
        if (this.f43227x2 == null) {
            this.f43227x2 = d6Var;
        }
        if (this.f43227x2 == null) {
            this.f43227x2 = new org.telegram.ui.Cells.d6(this.currentAccount);
        }
        org.telegram.ui.Cells.d6 d6Var2 = this.f43227x2;
        k90 k90Var = new k90(this, 22);
        if (d6Var2.f30142c) {
            k90Var.run();
        } else {
            d6Var2.h.add(k90Var);
        }
        this.f43227x2.d(this.f43219w2);
        if (this.f43242z2 == null) {
            this.f43242z2 = ww0Var;
        }
        ww0 ww0Var2 = this.f43242z2;
        boolean z11 = true;
        if (ww0Var2 == null) {
            ww0 c10 = ww0.c(this.currentAccount, this.f43219w2, ww0Var2);
            this.f43242z2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43235y2 = z10;
        }
        ww0 ww0Var3 = this.f43242z2;
        if (ww0Var3 != null) {
            k90 k90Var2 = new k90(this, 18);
            if (ww0Var3.f53016b) {
                k90Var2.run();
            } else {
                ww0Var3.h.add(k90Var2);
            }
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.T0;
        if (d5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.f43094e1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z11 = false;
            }
            d5Var.R(20, z11);
            if (t4()) {
                this.T0.T(44);
            } else {
                this.T0.u(44);
            }
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.f56046i;
        }
        return null;
    }

    public final float k4() {
        return Math.max(this.E5, this.U5);
    }

    public final void k5() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.lf0 lf0Var = new org.telegram.ui.Components.lf0(this.glassEngine, baseSimpleGlass);
        this.M5 = lf0Var;
        vw0 vw0Var = this.f43087d1;
        if (vw0Var != null) {
            int i7 = vw0Var.I;
            boolean z10 = vw0Var.f52312c;
            if (lf0Var.f36775i != i7 || lf0Var.f36776j != z10) {
                lf0Var.f36775i = i7;
                lf0Var.f36776j = z10;
                lf0Var.a();
            }
        }
        this.M5.b(this.N5);
        org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
        if (hf0Var != null) {
            hf0Var.setGlassFactory(this.M5.f36771c);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.f43079c0;
        if (cg0Var != null) {
            cg0Var.setGlassFactory(this.M5.f36771c);
        }
        this.simpleActionBar.setButtonsGlass(this.M5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        sv0 sv0Var = this.f43179q5;
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.A0;
        baseSimpleGlass.f56050m = sv0Var;
        baseSimpleGlass.f56051n = null;
        baseSimpleGlass.g(sv0Var, w4Var, e6Var);
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.lf0 lf0Var2 = this.M5;
        dh.c cVar = lf0Var2.f36772e;
        ui.d dVar = lf0Var2.f36773f;
        w4Var2.f29825o0 = cVar;
        w4Var2.f29826p0 = dVar;
        w4Var2.setBackground(null);
        this.K5 = c8.g0.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.L5);
        D5();
        baseSimpleGlass.f56052o = this.Q6;
        View view = new View(getParentActivity());
        this.X5 = view;
        view.setAlpha(0.0f);
        this.f43179q5.getViewTreeObserver().addOnPreDrawListener(new fk(this, 1));
        this.O.z(this.X5);
        View view2 = this.X5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.F5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        sv0 sv0Var2 = this.f43179q5;
        sv0Var2.addView(this.F5, sv0Var2.indexOfChild(this.Z), c8.ja.e(-1, 0, 48));
        this.glassEngine.b(this.f43062a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new k90(this, 21));
        G3();
        A5();
    }

    public final float l4(float f10, float f11) {
        float f12;
        float f13;
        this.f43246z6 = f10;
        this.B6 = f11;
        int i7 = this.J1;
        if (i7 == 2) {
            f12 = 1.0f;
        } else if (this.T1 < 1.0f && i7 != 0) {
            f12 = 0.0f;
        } else {
            f12 = this.f43143l2;
        }
        float l10 = Utilities.l(f12);
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            f13 = mu0Var.getVisibilityFactor();
        } else {
            f13 = 0.0f;
        }
        return Math.max(0.0f, (q4() + this.s5) * l10) + com.google.android.gms.internal.vision.e2.z(1.0f, l10, f11 * f13, f10);
    }

    public final void l5(boolean z10, boolean z11) {
        if (this.f43115h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f43108g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f43108g0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43108g0 = animatorSet2;
            if (z10) {
                this.f43115h0.setVisibility(0);
                this.f43108g0.playTogether(ObjectAnimator.ofFloat(this.f43115h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f43115h0, View.ALPHA, 0.0f));
            }
            this.f43108g0.setDuration(180L);
            this.f43108g0.addListener(new lv0(this, z10, 1));
            this.f43108g0.start();
        } else if (z10) {
            this.f43115h0.setAlpha(1.0f);
            this.f43115h0.setVisibility(0);
        } else {
            this.f43115h0.setAlpha(0.0f);
            this.f43115h0.setVisibility(4);
        }
    }

    public final float m4(float f10) {
        float f11;
        this.C6 = f10;
        int i7 = this.J1;
        float f12 = 0.0f;
        if (i7 == 2) {
            f11 = 1.0f;
        } else if (this.T1 < 1.0f && i7 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f43143l2;
        }
        float l10 = Utilities.l(f11);
        if (this.T != null) {
            f12 = this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f);
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, l10, f12, f10);
    }

    public final void m5() {
        int i7;
        int i10;
        Long l10;
        if (this.R5 != null) {
            return;
        }
        e11[] e11VarArr = new e11[1];
        Rect rect = org.telegram.messenger.g0.Q;
        ok okVar = this.f43100f;
        if (okVar != null) {
            if (okVar.getRightDrawable() == null) {
                rect.set(this.f43100f.getWidth() - 1, (this.f43100f.getHeight() / 2) - 1, this.f43100f.getWidth() + 1, (this.f43100f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f43100f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f43100f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f43100f.getX(), (int) this.f43100f.getY());
            }
        }
        if (this.f43100f.getScaleX() < 1.5f) {
            i7 = 16;
        } else {
            i7 = 32;
        }
        int i11 = i7;
        int L = (-(this.Z.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i11);
        Point point = org.telegram.messenger.g0.f23609q;
        int min = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = c8.i9.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.F2 == null) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        ev0 ev0Var = new ev0(this, this, parentActivity, valueOf, i10, this.A0, i11, e11VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43094e1));
        if (a22 != null) {
            ev0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.F;
        if (l11 != null) {
            ev0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.e5 e5Var = this.G;
            if (e5Var != null) {
                Drawable drawable = e5Var.f34194f[0];
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.g5) drawable).h());
                    ev0Var.setSelected(l10);
                }
            }
            l10 = null;
            ev0Var.setSelected(l10);
        }
        ev0Var.setSaveState(3);
        ev0Var.y(this.G, this.f43100f);
        fv0 fv0Var = new fv0(this, ev0Var);
        this.R5 = fv0Var;
        e11VarArr[0] = fv0Var;
        int[] iArr = new int[2];
        ok okVar2 = this.f43100f;
        if (okVar2 != null) {
            okVar2.getLocationOnScreen(iArr);
        }
        e11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        e11VarArr[0].b();
    }

    public final org.telegram.ui.Components.dr n4() {
        if (this.K == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232308).mutate();
            this.E = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.A0), PorterDuff.Mode.MULTIPLY);
            this.K = new org.telegram.ui.Components.dr(this.E, getParentActivity().getDrawable(2131232311).mutate());
        }
        return this.K;
    }

    public final void n5() {
        int i7 = 0;
        this.O.L0.setReordering(false);
        uv0 uv0Var = this.O;
        org.telegram.ui.Components.vq0 vq0Var = uv0Var.L0;
        if (uv0Var.f42150y1 != null && vq0Var != null) {
            boolean C0 = uv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = vq0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.ys0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.O.P1(true);
        this.C5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new k90(this, 24)).start();
        org.telegram.ui.Components.cc.a0(this).Q(2131623990, 36, "Tab order changed.").j();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final float o4(int i7) {
        View subtitleTextView;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.Components.qg qgVar = this.f43140k5;
        if (qgVar != null && !(qgVar instanceof an) && qgVar.r() != null) {
            org.telegram.ui.Components.sn r10 = this.f43140k5.r();
            if (i7 == 0) {
                subtitleTextView = r10.getTitleTextView();
            } else {
                subtitleTextView = r10.getSubtitleTextView();
            }
            if (i7 == 0) {
                j5Var = this.f43100f;
            } else {
                j5Var = this.f43181r;
            }
            float textSize = j5Var.getPaint().getTextSize();
            if ((subtitleTextView instanceof org.telegram.ui.ActionBar.j5) && textSize > 0.0f) {
                return ((org.telegram.ui.ActionBar.j5) subtitleTextView).getPaint().getTextSize() / textSize;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final void o5() {
        int w02;
        int w03;
        if (!this.f43176q2) {
            zu0 zu0Var = this.f43181r;
            if (zu0Var != null) {
                Object tag = zu0Var.getTag();
                if (tag instanceof Integer) {
                    this.f43181r.setTextColor(H3(org.telegram.ui.ActionBar.j6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    this.f43181r.setTextColor(H3(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f43224x;
            int i7 = -1;
            if (drawable != null) {
                if (this.f43147l6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28911gd, this.A0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.lk0 lk0Var = this.L;
            if (lk0Var != null) {
                lk0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28924h8, this.A0));
            }
            ok okVar = this.f43100f;
            if (okVar != null) {
                okVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29024mi, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.f43147l6 == null) {
                    i7 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.A0);
                }
                kVar.H(i7, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.f43147l6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28889f8, this.A0);
                }
                kVar2.F(w02, false);
            }
        }
        u5();
        S5();
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null) {
            m30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vq0 vq0Var;
        if (super.onBackPressed(z10)) {
            uv0 uv0Var = this.O;
            if (uv0Var != null && (vq0Var = uv0Var.L0) != null && vq0Var.f32719o0) {
                if (z10) {
                    n5();
                    return false;
                }
            } else if (this.L4 != -1 && uv0Var != null && uv0Var.F1) {
                if (z10) {
                    uv0Var.V(true);
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
        this.f43195s6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        T5();
        this.f43195s6 = true;
        T3();
        if (this.J0 && !this.f43172p5 && (view = this.fragmentView) != null) {
            this.f43172p5 = true;
            this.W4 = true;
            view.requestLayout();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.onConfigurationChanged(configuration);
        }
        u4();
        if (this.f43163o2 && this.f43176q2 && (m10 = this.f43078c.m(0)) != null) {
            this.f43062a.scrollBy(0, m10.getTop() - i4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        long j3;
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        float f10;
        boolean z12;
        org.telegram.ui.ActionBar.q0 q0Var2;
        TimeInterpolator decelerateInterpolator;
        org.telegram.ui.Components.qg qgVar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.q0 j10;
        long j11;
        boolean z13;
        float f11;
        View D;
        float f12;
        float f13;
        TLRPC.Chat chat;
        yw ywVar;
        uv uvVar;
        if (!this.J0) {
            M5();
            if (this.J1 != 0 && this.M1 && !this.f43176q2 && !this.N1) {
                ImageView imageView = this.f43129j0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.f43122i0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.f43142l0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.f43142l0.setScaleX(1.0f);
                    this.f43142l0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.f43135k0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.f43135k0.setScaleX(1.0f);
                    this.f43135k0.setScaleY(1.0f);
                }
                this.f43133j5 = null;
                org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
                if (o4Var != null && o4Var.getFragmentStack().size() >= 2) {
                    Object obj = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj instanceof org.telegram.ui.Components.qg) {
                        this.f43140k5 = (org.telegram.ui.Components.qg) obj;
                    }
                    if (obj instanceof je0) {
                        obj = ((je0) obj).K;
                    }
                    if ((obj instanceof yw) && (uvVar = (ywVar = (yw) obj).H3) != null) {
                        bw bwVar = uvVar.f52057a;
                        if (com.google.android.gms.internal.vision.e2.s(bwVar)) {
                            this.f43133j5 = ywVar;
                            this.f43140k5 = bwVar;
                        }
                    }
                }
                org.telegram.ui.Components.qg qgVar2 = this.f43140k5;
                if (qgVar2 != null && ((org.telegram.ui.ActionBar.e2) qgVar2).getActionBar() != null) {
                    kVar = ((org.telegram.ui.ActionBar.e2) this.f43140k5).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.qg qgVar3 = this.f43140k5;
                if ((qgVar3 instanceof an) && ((an) qgVar3).f45173e != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qgVar3 != null) {
                    ImageView imageView5 = this.f43129j0;
                    if (imageView5 != null) {
                        if ((qgVar3 instanceof an) && (chat = ((an) qgVar3).f45173e) != null && chat.linked_community_id != 0) {
                            imageView5.setTag(1);
                            this.f43129j0.setVisibility(0);
                        } else {
                            imageView5.setTag(null);
                            this.f43129j0.setVisibility(8);
                        }
                    }
                    if (this.m0 != null) {
                        org.telegram.ui.Components.qg qgVar4 = this.f43140k5;
                        if ((qgVar4 instanceof an) && org.telegram.messenger.t3.p0(((an) qgVar4).f45173e)) {
                            this.f43122i0.setTag(null);
                            this.f43122i0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.E2;
                            if (encryptedChat != null) {
                                this.m0.b(encryptedChat.ttl);
                                this.f43122i0.setTag(1);
                                this.f43122i0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.f43219w2;
                                if (userFull != null) {
                                    this.m0.b(userFull.ttl_period);
                                    if (this.K1 && this.f43219w2.ttl_period != 0) {
                                        this.f43122i0.setTag(1);
                                        this.f43122i0.setVisibility(0);
                                    } else {
                                        this.f43122i0.setTag(null);
                                        this.f43122i0.setVisibility(8);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.f43211v2;
                                    if (chatFull != null) {
                                        this.m0.b(chatFull.ttl_period);
                                        if (this.K1 && this.f43211v2.ttl_period != 0) {
                                            this.f43122i0.setTag(1);
                                            this.f43122i0.setVisibility(0);
                                        } else {
                                            this.f43122i0.setTag(null);
                                            this.f43122i0.setVisibility(8);
                                        }
                                    } else {
                                        this.f43122i0.setTag(null);
                                        this.f43122i0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    N5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.J1 == 2) {
                    j3 = 250;
                } else {
                    j3 = 180;
                }
                animatorSet.setDuration(j3);
                this.f43062a.setLayerType(2, null);
                if (z10) {
                    this.f43128i6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f43181r.getLayoutParams();
                    q0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.g0.f23608p * (-21.0f)) + org.telegram.messenger.g0.L(8.0f));
                    this.f43181r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
                        j11 = 0;
                        int ceil = (int) Math.ceil((org.telegram.messenger.g0.f23608p * 21.0f) + (org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(117.0f)));
                        float measureText = (this.f43100f.getPaint().measureText(this.f43100f.getText().toString()) * 1.12f) + this.f43100f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f43100f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(f13 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f43100f.setLayoutParams(layoutParams2);
                        this.S1 = i4();
                    } else {
                        j11 = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f43100f.getLayoutParams();
                        layoutParams3.width = (int) ((org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(32.0f)) / 1.38f);
                        this.f43100f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.fh0 fh0Var = this.f43189s;
                    if (fh0Var != null && fh0Var.getTag() == null) {
                        this.f43189s.setScaleX(0.2f);
                        this.f43189s.setScaleY(0.2f);
                        this.f43189s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43189s, View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43189s, View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43189s, View.ALPHA, 1.0f));
                    }
                    av0 av0Var = this.f43209v0;
                    if (av0Var != null && this.J1 == 2) {
                        av0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43209v0, View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.f43190s0 = e4(this.f43101f0.getImageReceiver());
                        this.f43100f.setTextColor(-1);
                        this.f43181r.setTextColor(-1275068417);
                        this.actionBar.F(1090519039, false);
                        tw0 tw0Var = this.D6;
                        if (tw0Var != null) {
                            tw0Var.a(603979775);
                        }
                        jw0 jw0Var = this.N;
                        jw0Var.F = true;
                        jw0Var.setVisibility(0);
                    }
                    if (this.J1 == 2) {
                        this.f43100f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43100f, View.ALPHA, 1.0f));
                    } else {
                        this.f43100f.setAlpha(1.0f);
                    }
                    if (this.f43209v0 != null) {
                        if (a() > j11) {
                            this.f43209v0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43209v0, View.ALPHA, 1.0f));
                        } else {
                            this.f43209v0.setAlpha(1.0f);
                            this.f43209v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43209v0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    di.u0 u0Var = this.f43217w0;
                    if (u0Var != null) {
                        u0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43217w0, View.ALPHA, 1.0f));
                    }
                    if (this.f43122i0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43122i0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43122i0, View.SCALE_X, 0.85f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43122i0, View.SCALE_Y, 0.85f, 0.0f));
                    }
                    if (this.f43129j0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43129j0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43129j0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43129j0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f43142l0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43142l0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43142l0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43142l0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f43135k0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f43135k0, View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43135k0, View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f43135k0, View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.M0 && (this.f43102f1 != j11 || z11)) {
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
                    xu0 xu0Var = this.f43101f0;
                    if (xu0Var != null) {
                        xu0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f43101f0, vv0.f52300h0, 0.0f));
                    }
                    org.telegram.ui.Components.qg qgVar5 = this.f43140k5;
                    if (qgVar5 != null) {
                        org.telegram.ui.Components.sn r10 = qgVar5.r();
                        if (r10 != null) {
                            org.telegram.ui.Components.on onVar = r10.f39353e;
                            yw ywVar2 = this.f43133j5;
                            if (ywVar2 != null && ywVar2.getFragmentView() != null) {
                                D = this.f43133j5.getFragmentView();
                            } else {
                                D = this.f43140k5.D();
                            }
                            RectF rectF = this.f43134j6;
                            if (jh.k.c(onVar, D, rectF)) {
                                f12 = rectF.left;
                            } else {
                                f12 = 0.0f;
                            }
                            this.f43128i6 = f12;
                        }
                        if ((r10 == null || !(r10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5) || ((org.telegram.ui.ActionBar.j5) r10.getSubtitleTextView()).getLeftDrawable() == null) && !r10.T[0] && !w4(r10)) {
                            z13 = false;
                        } else {
                            View subtitleTextView = r10.getSubtitleTextView();
                            this.Y4 = subtitleTextView;
                            if (!(this.f43140k5 instanceof an) && subtitleTextView != null) {
                                f11 = this.f43181r.getPaddingLeft() - this.Y4.getPaddingLeft();
                            } else {
                                f11 = 0.0f;
                            }
                            this.Z4 = f11;
                            this.Z.invalidate();
                            this.f43181r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43181r, View.ALPHA, 1.0f));
                            z13 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (this.J1 == 2) {
                            this.f43181r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.f43181r, View.ALPHA, 1.0f));
                        } else {
                            this.f43181r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    q0Var = null;
                    this.S1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.fh0 fh0Var2 = this.f43189s;
                    if (fh0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(fh0Var2, View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43189s, View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43189s, View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43100f, View.ALPHA, 0.0f));
                    }
                    av0 av0Var2 = this.f43209v0;
                    if (av0Var2 != null) {
                        if (this.f43123i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(av0Var2, View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(av0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    di.u0 u0Var2 = this.f43217w0;
                    if (u0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(u0Var2, View.ALPHA, 0.0f));
                    }
                    if (this.f43122i0.getTag() != null) {
                        this.f43122i0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43122i0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43122i0, View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43122i0, View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.f43129j0.getTag() != null) {
                        this.f43129j0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43129j0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43129j0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43129j0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f43142l0.getTag() != null) {
                        this.f43142l0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43142l0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43142l0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43142l0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f43135k0.getTag() != null) {
                        this.f43135k0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43135k0, View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43135k0, View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43135k0, View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.M0 && (this.f43102f1 != 0 || z11)) {
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
                    xu0 xu0Var2 = this.f43101f0;
                    if (xu0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(xu0Var2, vv0.f52300h0, 1.0f));
                    }
                    if (this.parentLayout.getFragmentStack().size() > 1) {
                        e2Var = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    } else {
                        e2Var = null;
                    }
                    if (e2Var instanceof an) {
                        an anVar = (an) e2Var;
                        ui uiVar = anVar.f45314p1;
                        org.telegram.messenger.g0.K(uiVar, new lc0(this, uiVar, anVar, 27));
                        View subtitleTextView2 = uiVar.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof org.telegram.ui.ActionBar.j5) && ((org.telegram.ui.ActionBar.j5) subtitleTextView2).getLeftDrawable() != null) || uiVar.T[0]) {
                            this.Y4 = uiVar.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.f43181r, View.ALPHA, 0.0f));
                            z12 = true;
                        }
                        z12 = false;
                    } else {
                        org.telegram.ui.Components.qg qgVar6 = this.f43140k5;
                        if (qgVar6 != null && qgVar6.r() != null) {
                            org.telegram.ui.Components.sn r11 = this.f43140k5.r();
                            org.telegram.messenger.g0.K(r11, new mp0(15, this, r11));
                            if (w4(r11)) {
                                View subtitleTextView3 = r11.getSubtitleTextView();
                                this.Y4 = subtitleTextView3;
                                if (!(this.f43140k5 instanceof an) && subtitleTextView3 != null) {
                                    f10 = this.f43181r.getPaddingLeft() - this.Y4.getPaddingLeft();
                                } else {
                                    f10 = 0.0f;
                                }
                                this.Z4 = f10;
                                this.Z.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.f43181r, View.ALPHA, 0.0f));
                                z12 = true;
                            }
                        }
                        z12 = false;
                    }
                    if (!z12 && this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f43181r, View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    zw0 zw0Var = this.E6;
                    if (zw0Var != null) {
                        zw0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.h).start();
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zt0(this, 2));
                animatorSet.playTogether(ofFloat);
                if (this.P0 != null && (qgVar = this.f43140k5) != null && (yVar = ((org.telegram.ui.ActionBar.e2) qgVar).getActionBar().F) != null && (j10 = yVar.j(32)) != null && j10.getVisibility() == 0) {
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
                    decelerateInterpolator = org.telegram.ui.Components.er.f34420f;
                } else {
                    decelerateInterpolator = new DecelerateInterpolator();
                }
                animatorSet.setInterpolator(decelerateInterpolator);
                org.telegram.messenger.g0.i3(new fq0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        ou0 ou0Var = this.f43062a;
        if (ou0Var != null) {
            ou0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.R0();
        }
        org.telegram.ui.Components.qs0 qs0Var = this.R;
        if (qs0Var != null) {
            qs0Var.b(this);
        }
        org.telegram.ui.Components.qs0 qs0Var2 = this.R;
        if (qs0Var2 != null) {
            qs0Var2.f38770y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25559r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25572t);
        getNotificationCenter().n(this, org.telegram.messenger.ns.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25558q5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.D1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25475c0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25591v5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.F5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25513i3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25497f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25610y3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.C3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.D3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25608y1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25495f3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.G3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.V3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.W3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        yu0 yu0Var = this.f43161o0;
        if (yu0Var != null) {
            yu0Var.K();
        }
        org.telegram.ui.Components.nf0 nf0Var = this.f43155n0;
        if (nf0Var != null) {
            nf0Var.d();
        }
        this.f43091d6 = null;
        if (this.f43094e1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25568s1);
            getNotificationCenter().n(this, org.telegram.messenger.ns.O);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25463a0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.Y);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25498g0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.D0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25521k0);
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25604x4);
            getMessagesController().f25377r1.remove(Long.valueOf(this.f43094e1));
        } else if (this.f43102f1 != 0) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.B5);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25550p3);
            getNotificationCenter().n(this, org.telegram.messenger.ns.T);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25499g1);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25595w2);
            getNotificationCenter().n(this, org.telegram.messenger.ns.f25470b1);
        }
        xu0 xu0Var = this.f43101f0;
        if (xu0Var != null) {
            xu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null) {
            m30Var.d();
        }
        cv0 cv0Var = this.X4;
        if (cv0Var != null) {
            cv0Var.b();
        }
        ww0 ww0Var = this.f43242z2;
        if (ww0Var != null && this.f43235y2) {
            ww0Var.b(true);
            this.f43242z2 = null;
        }
        ai.k2 k2Var = this.B5;
        if (k2Var != null) {
            this.B5 = null;
            org.telegram.messenger.g0.h3(k2Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.gr0 gr0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null) {
            m30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
        }
        uv0 uv0Var = this.O;
        if (uv0Var != null && (gr0Var = uv0Var.W) != null) {
            gr0Var.f46219e = false;
            if (gr0Var.f46218c != null) {
                gr0Var.f46216a.onPause();
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
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null) {
            m30Var.j(i7, strArr, iArr);
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
                    org.telegram.messenger.r3 g12 = getMessagesController().g1(this.f43102f1, false, null);
                    TLRPC.Chat chat = this.F2;
                    if (g12 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.c2.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
                return;
            }
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43094e1));
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
            if (i7 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.UserFull userFull = this.f43219w2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.c2.m(a22, z11, z12, getParentActivity(), this.f43219w2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
    }

    @Override
    public final void onResume() {
        TLRPC.User a22;
        rv rvVar;
        super.onResume();
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.f42091e1 = true;
            org.telegram.ui.Components.fr0 fr0Var = uv0Var.K;
            if (fr0Var != null) {
                fr0Var.f();
            }
            org.telegram.ui.Components.ls0 ls0Var = uv0Var.N;
            if (ls0Var != null) {
                ls0Var.f();
            }
            org.telegram.ui.Components.ms0 ms0Var = uv0Var.M;
            if (ms0Var != null) {
                ms0Var.X(false);
            }
            for (int i7 = 0; i7 < uv0Var.f42117n0.length; i7++) {
                uv0Var.e0(i7);
            }
            org.telegram.ui.Components.gr0 gr0Var = uv0Var.W;
            if (gr0Var != null) {
                gr0Var.f46219e = true;
                if (gr0Var.f46218c != null) {
                    gr0Var.f46216a.onResume();
                }
            }
        }
        u4();
        iw0 iw0Var = this.d;
        if (iw0Var != null) {
            this.V4 = true;
            iw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (rvVar = this.U) != null && rvVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null) {
            m30Var.k();
            setParentActivityTitle(org.telegram.messenger.hd.M0(2131745495, null));
        }
        L5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        ok okVar = this.f43100f;
        if (okVar != null) {
            setParentActivityTitle(okVar.getText());
        }
        if (this.f43094e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.f43094e1))) != null && a22.photo == null && this.Q1 >= i4()) {
            this.f43137k2.cancel();
            float[] fArr = this.f43156n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            Z4(1.0f);
            this.f43161o0.setVisibility(8);
            this.Q1 = i4();
            this.f43169p2 = false;
            this.f43078c.h1(0, i4() - this.f43062a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.a();
        }
        F5();
        A4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f43240z0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.A0));
            o5();
            P5();
            I3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.w4 w4Var;
        if (z10 && (w4Var = this.simpleActionBar) != null) {
            w4Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i7 = this.J1;
                if (i7 != 0 && this.M1) {
                    if (i7 == 1) {
                        this.f43143l2 = 0.0f;
                        org.telegram.ui.Components.mu0 mu0Var = this.T;
                        if (mu0Var != null) {
                            mu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
                        if (hf0Var != null) {
                            hf0Var.setParentExpanded(0.0f);
                        }
                        b5(0.0f);
                        org.telegram.ui.Components.cg0 cg0Var = this.f43079c0;
                        if (cg0Var != null) {
                            cg0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    N3();
                    if (this.I1) {
                        R3(true);
                    }
                }
                if (!this.f43172p5) {
                    this.f43172p5 = true;
                    this.W4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.R4);
            rv rvVar = this.U;
            if (rvVar != null && rvVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        P3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        rv rvVar = this.U;
        if (rvVar != null && rvVar.getVisibility() == 0) {
            if (z10) {
                this.U.setAlpha(1.0f - f10);
            } else {
                this.U.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        tw0 tw0Var;
        ImageView imageView;
        org.telegram.ui.Components.hf0 hf0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.f43114g6 = z10;
        if (z10 && (hf0Var = this.f43063a0) != null) {
            ArrayList arrayList = hf0Var.f35234a;
            if (hf0Var.F == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.ef0 ef0Var = (org.telegram.ui.Components.ef0) arrayList.get(i7);
                    org.telegram.ui.Components.ch0 ch0Var = ef0Var.f34294k;
                    if (ch0Var != null) {
                        if (ef0Var.f34286a == 15) {
                            ch0Var.M(14);
                        } else {
                            ch0Var.M(0);
                        }
                        ef0Var.f34294k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0)) {
            ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f43176q2) {
            this.G1 = true;
            if (!z10) {
                if (this.f43091d6 == null) {
                    this.f43091d6 = new float[14];
                }
                this.F1 = this.Q1;
                this.f43091d6[0] = this.Y.getScaleX();
                this.f43091d6[1] = this.Y.getTranslationX();
                this.f43091d6[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.hf0 hf0Var2 = this.f43063a0;
                if (hf0Var2 != null) {
                    this.f43091d6[3] = hf0Var2.getAlpha();
                }
                di.u0 u0Var = this.f43217w0;
                if (u0Var != null) {
                    float[] fArr = this.f43091d6;
                    fArr[4] = u0Var.f9503e;
                    fArr[5] = u0Var.f9504f;
                }
                if (this.D6 != null) {
                    this.f43091d6[6] = tw0Var.getAlpha();
                }
                this.f43091d6[7] = this.f43100f.getScaleX();
                this.f43091d6[8] = this.f43100f.getTranslationY();
                this.f43091d6[9] = this.f43181r.getTranslationY();
                this.f43091d6[10] = this.f43100f.getLayoutParams().width;
                float[] fArr2 = this.f43091d6;
                fArr2[11] = this.d2;
                fArr2[12] = this.f43100f.getTranslationX();
                this.f43091d6[13] = this.f43181r.getTranslationX();
                hi.l3 l3Var = this.F6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
            }
        }
        if (z10) {
            if (this.f43182r0 != null) {
                this.R4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ns.f25566s, org.telegram.messenger.ns.f25572t, org.telegram.messenger.ns.W, org.telegram.messenger.ns.X, org.telegram.messenger.ns.E0, org.telegram.messenger.ns.f25564r4}, this.R4, true);
            } else {
                this.R4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ns.f25566s, org.telegram.messenger.ns.f25572t, org.telegram.messenger.ns.W, org.telegram.messenger.ns.X, org.telegram.messenger.ns.f25564r4}, this.R4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.f43076b5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        P3();
    }

    public final float p4(float f10, int i7, View view) {
        View D;
        float left;
        int paddingLeft;
        org.telegram.ui.Components.qg qgVar = this.f43140k5;
        if (qgVar != null && !(qgVar instanceof an) && this.fragmentView != null && (view.getParent() instanceof View)) {
            org.telegram.ui.Components.sn r10 = this.f43140k5.r();
            org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.e2) this.f43140k5).getActionBar();
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
                yw ywVar = this.f43133j5;
                if (ywVar != null && ywVar.getFragmentView() != null) {
                    D = this.f43133j5.getFragmentView();
                } else {
                    D = this.f43140k5.D();
                }
                RectF rectF = this.f43134j6;
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

    public final void p5() {
        int i7;
        float f10;
        k0 k0Var;
        if (this.f43063a0 != null && this.f43181r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f23603m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
            boolean z10 = this.G1;
            hf0Var.f35239e = z10;
            if (z10 && this.J1 == 2 && (k0Var = this.Y) != null) {
                this.f43063a0.f35240f = this.Y.getY() + (this.Y.getScaleY() * k0Var.getHeight());
                this.f43063a0.setAlpha(this.T1);
                org.telegram.ui.Components.hf0 hf0Var2 = this.f43063a0;
                hf0Var2.f35245x = org.telegram.messenger.g0.L(74.0f);
                hf0Var2.setTranslationY(this.f43062a.getMeasuredWidth());
                hf0Var2.invalidate();
            } else {
                hf0Var.f35240f = -1.0f;
                float f11 = i10;
                float f12 = this.Q1 + f11;
                if (!this.J4 && !this.K4) {
                    f10 = 0.0f;
                } else {
                    f10 = 25.0f;
                }
                float L = f12 - org.telegram.messenger.g0.L(f10);
                float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f11);
                org.telegram.ui.Components.hf0 hf0Var3 = this.f43063a0;
                hf0Var3.f35245x = min;
                hf0Var3.setTranslationY(L - min);
                hf0Var3.invalidate();
            }
            ImageView imageView = this.P0;
            if (imageView != null && imageView.getTag() != null) {
                this.f43063a0.getClass();
                if (this.P0.getVisibility() == 0) {
                    this.P0.setVisibility(8);
                }
                if (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0) {
                    ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    public final float q4() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
        }
        return 0.0f;
    }

    public final void q5() {
        int i7;
        if (this.Z0 != null && this.f43064a1 != null) {
            TLRPC.UserFull userFull = this.f43219w2;
            if (userFull == null && this.f43211v2 == null) {
                i7 = 0;
            } else if (userFull != null) {
                i7 = userFull.ttl_period;
            } else {
                i7 = this.f43211v2.ttl_period;
            }
            this.f43196t0.b(i7);
            this.f43064a1.u(i7);
        }
    }

    public final int r4() {
        float f10;
        if (this.f43175q1) {
            return 0;
        }
        if (this.f43102f1 != 0 && org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.f43102f1)))) {
            if (z4()) {
                f10 = 24.0f;
            } else {
                f10 = 38.0f;
            }
            return org.telegram.messenger.g0.L(f10);
        }
        return org.telegram.messenger.g0.L(50.0f);
    }

    public final void r5() {
        float L;
        boolean z10;
        if (this.f43222w5 != null) {
            uv0 uv0Var = this.O;
            if (uv0Var != null && uv0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.g0.L(232.0f) - (this.f43062a.getMeasuredHeight() - this.O.getY());
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            int i7 = 0;
            if (L <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            te.a aVar = this.Q5;
            aVar.a(z10, true);
            float f10 = aVar.f57081e;
            this.f43222w5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
            this.f43222w5.setAlpha(f10);
            FrameLayout frameLayout = this.f43222w5;
            if (f10 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41635w;
            if (xbVar != null) {
                xbVar.l();
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null) {
            m30Var.f37044f = bundle.getString("path");
        }
    }

    public final org.telegram.ui.Components.dr s4() {
        int i7;
        float f10;
        if (this.J == null) {
            this.f43232y = org.telegram.ui.ActionBar.j6.Q1.getConstantState().newDrawable().mutate();
            this.I = org.telegram.ui.ActionBar.j6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.cp cpVar = this.f43147l6;
            if (cpVar != null) {
                if (cpVar.o(org.telegram.ui.ActionBar.j6.I.q())) {
                    i7 = this.f43147l6.k();
                } else {
                    i7 = this.f43147l6.i();
                }
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.j6.b(0.1f, f10, i7);
                Drawable drawable = this.f43232y;
                int S0 = org.telegram.messenger.g0.S0(this.U5, 1.0f, b10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.I.setColorFilter(org.telegram.messenger.g0.S0(this.U5, 1.0f, -1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.A0)), mode);
            }
            this.J = new org.telegram.ui.Components.dr(new org.telegram.ui.Components.fq(this.f43232y, this.I), getParentActivity().getDrawable(2131232794));
        }
        return this.J;
    }

    public final void s5() {
        boolean z10;
        hi.l3 l3Var = this.F6;
        if (l3Var != null) {
            float f10 = 0.0f;
            l3Var.p(0.0f, (this.f43100f.getScaleX() * this.f43100f.getRightDrawableX()) + this.f43100f.getX() + (-l3Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.g0.U1(this.f43149m2, this.f43156n2);
            hi.l3 l3Var2 = this.F6;
            l3Var2.setTranslationY(((this.f43100f.getY() + (-l3Var2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
            this.F6.j(i0.a.f(U1, this.G6, 1342177280));
            if (this.Q1 >= org.telegram.messenger.g0.L(82.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean bool = this.H6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.F6.animate();
            this.H6 = Boolean.valueOf(z10);
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.messenger.i20.n(animate.alpha(f10), org.telegram.ui.Components.er.f34421g, 200L);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.m30 m30Var = this.f43182r0;
        if (m30Var != null && (str = m30Var.f37044f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        int i7;
        this.f43143l2 = f10;
        this.T1 = f10;
        P3();
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setAlpha(f10);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.getBackButton().setTranslationX(org.telegram.messenger.g0.T1(p4(org.telegram.messenger.g0.L(2.0f), 2, this.actionBar.getBackButton()), org.telegram.messenger.g0.L(2.0f), f10));
        }
        if (this.J1 == 2) {
            this.f43101f0.setProgressToExpand(f10);
            org.telegram.ui.Components.hf0 hf0Var = this.f43063a0;
            if (hf0Var != null) {
                hf0Var.setParentExpanded(f10);
            }
            b5(f10);
            org.telegram.ui.Components.cg0 cg0Var = this.f43079c0;
            if (cg0Var != null) {
                cg0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.mu0 mu0Var = this.T;
            if (mu0Var != null) {
                mu0Var.setParentExpanded(f10);
            }
            p5();
            H5();
        }
        this.f43062a.setAlpha(f10);
        this.f43062a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.J1 != 2 || (w02 = this.f43190s0) == 0) {
            if (this.f43094e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f43102f1)) {
                    boolean z10 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.t8.L;
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var);
        }
        int i10 = this.f43068a5;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.A0);
        }
        this.f43087d1.setBackgroundColor(i0.a.f(f10, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.c01 c01Var = this.m0;
        int f11 = i0.a.f(f10, i10, w02);
        c01Var.f33451k = true;
        c01Var.f33444b.setColor(f11);
        int i11 = -1;
        if (this.f43147l6 != null) {
            w03 = -1;
        } else {
            if (this.f43094e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f43102f1)) {
                    boolean z11 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.t8.L;
            w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28906g8, e6Var2);
        }
        this.actionBar.H(i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, this.A0), w03), false);
        if (this.f43147l6 == null) {
            i11 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29024mi, this.A0);
        }
        int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, this.A0);
        ok okVar = this.f43100f;
        if (okVar != null && this.J1 != 2) {
            okVar.setTextColor(i0.a.f(f10, w05, i11));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29138si, this.A0);
        } else {
            if (this.f43094e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f43102f1)) {
                    boolean z12 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.t8.L;
            w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28924h8, e6Var3);
        }
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.j6.f29073pa;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.j6.w0(i7, this.A0);
        zu0 zu0Var = this.f43181r;
        if (zu0Var != null && this.J1 != 2) {
            zu0Var.setTextColor(i0.a.f(f10, w06, H3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f10;
        long j3 = this.f43094e1;
        if (j3 == 0) {
            j3 = this.f43102f1;
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.t8.L;
        int w07 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[org.telegram.ui.Components.t8.e(j3)], e6Var4);
        long j10 = this.f43094e1;
        if (j10 == 0) {
            j10 = this.f43102f1;
        }
        int d = org.telegram.ui.Components.t8.d(j10);
        if (w07 != d) {
            this.f43174q0.h(i0.a.f(f10, d, w07));
            this.f43101f0.invalidate();
        }
        int i12 = this.f43076b5;
        if (i12 != 0) {
            setNavigationBarColor(i0.a.f(f10, i12, getNavigationBarColor()));
        }
        this.f43087d1.invalidate();
        A4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        dw0 dw0Var = this.f43121h6;
        if (dw0Var != null) {
            dw0Var.invalidate();
        }
        if (a() > 0) {
            xu0 xu0Var = this.f43101f0;
            if (xu0Var != null) {
                xu0Var.setProgressToStoriesInsets(this.T1);
            }
            av0 av0Var = this.f43209v0;
            if (av0Var != null) {
                av0Var.setProgressToStoriesInsets(this.T1);
            }
            di.u0 u0Var = this.f43217w0;
            if (u0Var != null) {
                u0Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.o4 o4Var) {
        super.setParentLayout(o4Var);
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
            this.Y1 = null;
        }
        if (o4Var != null && o4Var.getParentActivity() != null) {
            this.Y1 = new org.telegram.messenger.n6(o4Var.getParentActivity().getWindow(), new qt0(this, 8));
        }
    }

    @Override
    public final boolean t() {
        return this.f43114g6;
    }

    public final boolean t4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i7 = 0;
        if (!this.f43192s2 || (userFull = this.f43219w2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void t5() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().q()) {
                this.V0.setIcon(2131231862);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231863);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.A0), PorterDuff.Mode.SRC_IN));
            this.U6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232170);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new fi.e2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
        }
    }

    public final void u4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43163o2 = z10;
    }

    public final void u5() {
        v5(this.f43141k6);
    }

    @Override
    public final void v() {
        this.f43062a.y0(0);
    }

    public final boolean v4() {
        if (this.F2 != null) {
            return getMessagesController().o2(this.F2);
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f43219w2;
        messagesController.getClass();
        return org.telegram.messenger.np.K2(userFull);
    }

    public final void v5(float f10) {
        int S0;
        org.telegram.messenger.cp cpVar = this.f43147l6;
        if (cpVar != null) {
            S0 = i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.U5, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.j6.Fj;
        int f12 = i0.a.f(Math.max(this.U5, this.E5), f11, org.telegram.ui.ActionBar.j6.w0(i7, this.A0));
        org.telegram.ui.Components.e5 e5Var = this.G;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.e5 e5Var2 = this.H;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(i0.a.f(this.U5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.j6.w0(i7, this.A0))));
        }
        this.f43093e0.setColor(f12);
        this.f43141k6 = f10;
    }

    public final boolean w4(org.telegram.ui.Components.sn snVar) {
        String str;
        if (!(this.f43140k5 instanceof an) && (snVar.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5)) {
            CharSequence text = ((org.telegram.ui.ActionBar.j5) snVar.getSubtitleTextView()).getText();
            String str2 = null;
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (this.f43181r.getText() != null) {
                str2 = this.f43181r.getText().toString();
            }
            return !TextUtils.equals(str, str2);
        }
        return false;
    }

    public final void w5() {
        this.f43093e0.setScaleX(this.f43100f.getScaleX());
        this.f43093e0.setScaleY(this.f43100f.getScaleY());
        this.f43093e0.b((this.f43100f.getScaleX() * this.f43100f.getRightDrawableX()) + this.f43100f.getX(), (this.f43100f.getHeight() - (this.f43100f.getScaleY() * (this.f43100f.getHeight() - this.f43100f.getRightDrawableY()))) + this.f43100f.getY());
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final boolean x4() {
        if (this.f43182r0 != null && !this.f43191s1) {
            return true;
        }
        return false;
    }

    public final void x5() {
        if (!this.f43175q1 && org.telegram.messenger.t3.c0(this.F2)) {
            org.telegram.messenger.at notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f27220a.c(new org.telegram.messenger.a4(notificationsController, -this.f43102f1, new ku0(this), 6));
        }
    }

    @Override
    public final boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).f26860a;
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
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.ns.f25572t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new an(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.cz.g(getMessagesController().a2(Long.valueOf(this.f43094e1)), j3, null, null, null, null, z11, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.ez.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z11, i7, i10);
        }
        return true;
    }

    public final void y4(boolean z10) {
        boolean z11;
        boolean c02 = org.telegram.messenger.t3.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        if (!c02 && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.t4.r(this, false, chat, null, false, z11, z10, !c02, new qt0(this, 3));
    }

    public final void y5(float f10) {
        jw0 jw0Var;
        ValueAnimator valueAnimator;
        if (this.f43176q2 || ((jw0Var = this.N) != null && (valueAnimator = jw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f43062a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f10);
            this.N.requestLayout();
        }
        vw0 vw0Var = this.f43087d1;
        if (vw0Var != null) {
            vw0Var.F.setTranslate(0.0f, this.f43073b2 - vw0Var.f52320y);
            vw0 vw0Var2 = this.f43087d1;
            RadialGradient radialGradient = vw0Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(vw0Var2.F);
            }
            this.f43087d1.invalidate();
        }
        w5();
        p5();
        H5();
    }

    public final boolean z4() {
        if (getMessagesController().P1().K(a()) && !this.f43175q1) {
            return true;
        }
        return false;
    }

    public final void z5() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float K3 = 1.0f - ((1.0f - K3()) * this.simpleActionBar.getActionModeFactor());
            ai.j0 j0Var = this.Z;
            if (j0Var != null && this.R1 != K3) {
                this.R1 = K3;
                j0Var.invalidate();
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.qs0 qs0Var) {
        super(bundle);
        this.h = null;
        this.f43154n = null;
        this.f43225x0 = null;
        this.f43233y0 = new org.telegram.ui.Components.w30(this, 2);
        this.f43240z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.f43072b1 = 1.0f;
        this.C1 = new a0.h();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.R1 = 1.0f;
        this.Z1 = new HashMap();
        this.f43156n2 = new float[]{0.0f, 1.0f};
        this.f43184r2 = new Paint();
        this.C2 = -1;
        this.M2 = new Rect();
        this.S4 = new ArrayList();
        this.T4 = new ArrayList();
        this.U4 = 0;
        this.V4 = true;
        this.W4 = true;
        this.f43068a5 = 0;
        this.f43076b5 = 0;
        this.f43084c5 = 0;
        this.f43090d5 = 0L;
        this.f43146l5 = new HashSet();
        this.f43159n5 = new dv0(this, 0);
        this.f43165o5 = new jv0(this);
        this.L5 = new nu0(this);
        this.P5 = 1.0f;
        this.Q5 = new te.a(0, new qt0(this, 7), org.telegram.ui.Components.er.h, 380L, true);
        this.W5 = new dv0(this, 1);
        this.f43085c6 = new bv0(this, 2);
        this.f43091d6 = null;
        this.f43134j6 = new RectF();
        this.f43153m6 = new SparseIntArray();
        this.f43166o6 = null;
        this.f43173p6 = -1;
        this.f43208u6 = new int[3];
        this.f43215v6 = -1.0f;
        ui.b bVar = new ui.b();
        this.O6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.P6 = cVar;
        this.R6 = new Paint();
        this.W6 = new int[7];
        this.R = qs0Var;
        cVar.f8094g = new xe.b();
    }

    @Override
    public final void U() {
    }
}
