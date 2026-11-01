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
public class ProfileActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, tx, org.telegram.ui.Components.tt0, org.telegram.ui.Components.a40, org.telegram.ui.Components.ns0, nf0 {
    public static final RectF S6 = new RectF();
    public static final int T6 = org.telegram.messenger.i0.L(16.0f);
    public int A0;
    public boolean A1;
    public int A2;
    public int A3;
    public int A4;
    public float A5;
    public vh.p2 A6;
    public org.telegram.messenger.jc B0;
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
    public org.telegram.ui.Components.d5 F;
    public boolean F0;
    public boolean F1;
    public TLRPC.ChannelParticipant F2;
    public int F3;
    public int F4;
    public int F5;
    public boolean F6;
    public org.telegram.ui.Components.d5 G;
    public boolean G0;
    public boolean G1;
    public TL_account.TL_password G2;
    public int G3;
    public int G4;
    public wg.d G5;
    public int G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TLRPC.FileLocation H2;
    public int H3;
    public boolean H4;
    public final zv0 H5;
    public int H6;
    public org.telegram.ui.Components.fr I;
    public boolean I0;
    public int I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public org.telegram.ui.Components.lg0 I5;
    public int I6;
    public org.telegram.ui.Components.fr J;
    public final boolean[] J0;
    public boolean J1;
    public org.telegram.messenger.jc J2;
    public int J3;
    public int J4;
    public float J5;
    public final hi.b J6;
    public org.telegram.ui.Components.ll0 K;
    public boolean K0;
    public boolean K1;
    public final Rect K2;
    public int K3;
    public int K4;
    public int K5;
    public final tg.b K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public org.telegram.ui.Cells.p8 L2;
    public int L3;
    public int L4;
    public float L5;
    public ei.a L6;
    public xx0 M;
    public boolean M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public final fe.b M5;
    public final Paint M6;
    public hx0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public qw0 N5;
    public Drawable N6;
    public org.telegram.ui.Components.ew0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public AnimatorSet O5;
    public Drawable O6;
    public boolean P;
    public org.telegram.ui.ActionBar.p5 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public AnimatorSet P5;
    public Drawable P6;
    public org.telegram.ui.Components.st0 Q;
    public org.telegram.ui.ActionBar.p5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public float Q5;
    public org.telegram.ui.Components.dq Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.p5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public boolean R5;
    public final int[] R6;
    public org.telegram.ui.Components.ov0 S;
    public org.telegram.ui.ActionBar.p5 S0;
    public int S1;
    public int S2;
    public int S3;
    public int S4;
    public final ow0 S5;
    public bo0 T;
    public org.telegram.ui.ActionBar.p5 T0;
    public float T1;
    public int T2;
    public int T3;
    public boolean T4;
    public View T5;
    public org.telegram.ui.Components.ci0 U;
    public org.telegram.ui.ActionBar.b1 U0;
    public ValueAnimator U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.ci0 V;
    public org.telegram.ui.ActionBar.b1 V0;
    public boolean V1;
    public int V2;
    public int V3;
    public nw0 V4;
    public int V5;
    public org.telegram.ui.Components.q30 W;
    public org.telegram.ui.ActionBar.b1 W0;
    public org.telegram.messenger.o6 W1;
    public int W2;
    public int W3;
    public View W4;
    public CharSequence W5;
    public l0 X;
    public ImageView X0;
    public final HashMap X1;
    public int X2;
    public int X3;
    public int X4;
    public boolean X5;
    public fg.i Y;
    public org.telegram.ui.ActionBar.b1 Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public final mw0 Y5;
    public org.telegram.ui.Components.hg0 Z;
    public m4.n0 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float[] Z5;
    public aw0 f33779a;
    public org.telegram.messenger.qp f33780a0;
    public float f33781a1;
    public float a2;
    public int f33782a3;
    public int f33783a4;
    public long f33784a5;
    public float f33785a6;
    public org.telegram.ui.Components.uk0 f33786b;
    public org.telegram.ui.Components.ch0 f33787b0;
    public int f33788b1;
    public float f33789b2;
    public int f33790b3;
    public int f33791b4;
    public boolean f33792b5;
    public float f33793b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public cw0 f33794c;
    public org.telegram.ui.Components.ig0 f33795c0;
    public jy0 f33796c1;
    public float f33797c2;
    public int f33798c3;
    public int f33799c4;
    public boolean f33800c5;
    public boolean f33801c6;
    public wx0 d;
    public org.telegram.ui.Cells.n f33802d0;
    public long f33803d1;
    public float f33804d2;
    public int f33805d3;
    public int f33806d4;
    public String f33807d5;
    public rx0 f33808d6;
    public gy0 e;
    public iw0 f33809e0;
    public long f33810e1;
    public float f33811e2;
    public int f33812e3;
    public int f33813e4;
    public String f33814e5;
    public float f33815e6;
    public kl f33816f;
    public AnimatorSet f33817f0;
    public long f33818f1;
    public float f33819f2;
    public int f33820f3;
    public int f33821f4;
    public String f33822f5;
    public float f33823f6;
    public org.telegram.ui.Cells.d4 f33824g0;
    public boolean f33825g1;
    public float f33826g2;
    public int f33827g3;
    public int f33828g4;
    public org.telegram.ui.Components.gg f33829g5;
    public org.telegram.messenger.lp f33830g6;
    public String h;
    public ImageView f33831h0;
    public long f33832h1;
    public float f33833h2;
    public int f33834h3;
    public int f33835h4;
    public final HashSet f33836h5;
    public final SparseIntArray f33837h6;
    public ImageView f33838i0;
    public boolean f33839i1;
    public ValueAnimator f33840i2;
    public int f33841i3;
    public int f33842i4;
    public CharacterStyle f33843i5;
    public int f33844i6;
    public ImageView f33845j0;
    public boolean f33846j1;
    public float f33847j2;
    public int f33848j3;
    public int f33849j4;
    public final ow0 f33850j5;
    public AnimatorSet f33851j6;
    public ImageView f33852k0;
    public boolean f33853k1;
    public float f33854k2;
    public int f33855k3;
    public int f33856k4;
    public final uw0 f33857k5;
    public int f33858k6;
    public org.telegram.ui.Components.g11 f33859l0;
    public long l1;
    public final float[] f33860l2;
    public int f33861l3;
    public int l4;
    public boolean f33862l5;
    public int f33863l6;
    public org.telegram.ui.Components.ng0 m0;
    public boolean f33864m1;
    public boolean f33865m2;
    public int f33866m3;
    public int f33867m4;
    public fx0 f33868m5;
    public boolean f33869m6;
    public String f33870n;
    public jw0 f33871n0;
    public boolean f33872n1;
    public boolean f33873n2;
    public int f33874n3;
    public int f33875n4;
    public float f33876n5;
    public boolean f33877n6;
    public zx0 f33878o0;
    public boolean f33879o1;
    public boolean f33880o2;
    public int f33881o3;
    public int f33882o4;
    public float f33883o5;
    public org.telegram.ui.Components.fi0 f33884o6;
    public org.telegram.ui.Components.r8 f33885p0;
    public boolean f33886p1;
    public final Paint f33887p2;
    public int f33888p3;
    public int f33889p4;
    public boolean p5;
    public final int[] f33890p6;
    public org.telegram.ui.Components.b40 f33891q0;
    public boolean f33892q1;
    public boolean f33893q2;
    public int f33894q3;
    public int f33895q4;
    public boolean f33896q5;
    public float q6;
    public kw0 f33897r;
    public int f33898r0;
    public boolean f33899r1;
    public xh.o0 f33900r2;
    public int f33901r3;
    public int f33902r4;
    public ImageReceiver f33903r5;
    public CharSequence f33904r6;
    public org.telegram.ui.Components.fi0 f33905s;
    public org.telegram.ui.Components.g11 f33906s0;
    public boolean f33907s1;
    public xh.n f33908s2;
    public int f33909s3;
    public int f33910s4;
    public FrameLayout f33911s5;
    public CharSequence f33912s6;
    public org.telegram.ui.Components.zg0 f33913t0;
    public int f33914t1;
    public TLRPC.ChatFull f33915t2;
    public int f33916t3;
    public int f33917t4;
    public FrameLayout[] f33918t5;
    public boolean f33919t6;
    public lw0 f33920u0;
    public boolean f33921u1;
    public TLRPC.UserFull f33922u2;
    public int f33923u3;
    public int f33924u4;
    public SpannableStringBuilder f33925u5;
    public float f33926u6;
    public rh.g0 f33927v0;
    public boolean f33928v1;
    public org.telegram.ui.Cells.i6 f33929v2;
    public int f33930v3;
    public int f33931v4;
    public SpannableStringBuilder f33932v5;
    public float f33933v6;
    public AnimatorSet f33934w;
    public View f33935w0;
    public boolean f33936w1;
    public boolean f33937w2;
    public int f33938w3;
    public int f33939w4;
    public vh.d[] f33940w5;
    public float f33941w6;
    public Drawable f33942x;
    public final org.telegram.ui.Components.l40 f33943x0;
    public int f33944x1;
    public ky0 f33945x2;
    public int f33946x3;
    public int f33947x4;
    public org.telegram.messenger.video.o f33948x5;
    public float f33949x6;
    public Drawable f33950y;
    public final Paint f33951y0;
    public boolean f33952y1;
    public CharSequence f33953y2;
    public int y3;
    public int f33954y4;
    public FrameLayout f33955y5;
    public hy0 f33956y6;
    public org.telegram.ui.ActionBar.p6 f33957z0;
    public boolean f33958z1;
    public long f33959z2;
    public int f33960z3;
    public int f33961z4;
    public vh.d f33962z5;
    public ny0 f33963z6;

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
        Drawable t10 = profileActivity.f33809e0.getImageReceiver().t();
        String str = null;
        if (t10 instanceof org.telegram.ui.Components.h61) {
            profileActivity.f33809e0.w(null, null, t10);
        } else if (t10 instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) t10;
            profileActivity.f33809e0.w(null, null, s5Var);
            if (z10) {
                s5Var.f(profileActivity.f33809e0);
            }
        } else {
            org.telegram.messenger.jc D = profileActivity.f33871n0.D(0);
            if (D != null && D.f16444p == 2) {
                str = "avatar";
            }
            profileActivity.f33809e0.w(D, str, t10);
        }
    }

    public static int J0(ProfileActivity profileActivity) {
        int i10;
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (lVar != null && lVar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = S6;
            if (zg.h.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                yg.d.b(new sa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O0(ProfileActivity profileActivity, int i10) {
        boolean G0 = org.telegram.ui.Components.au0.G0(profileActivity.N.getClosestTab());
        if (i10 == profileActivity.E6 && G0 == profileActivity.F6) {
            return;
        }
        profileActivity.E6 = i10;
        profileActivity.F6 = G0;
        if (G0) {
            if (i10 > 0) {
                profileActivity.f33940w5[0].i(org.telegram.messenger.dd.G(i10, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.f33940w5[0].i(profileActivity.f33932v5, true, true);
            }
        } else if (i10 <= 0 && org.telegram.messenger.wp.r1(profileActivity.currentAccount).T4()) {
            profileActivity.f33940w5[0].i(profileActivity.f33925u5, true, true);
        } else {
            profileActivity.f33940w5[0].i(org.telegram.messenger.dd.G(i10, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public static ValueAnimator P0(ProfileActivity profileActivity, final boolean z10) {
        float f7;
        boolean z11;
        int i10;
        if (z10) {
            org.telegram.messenger.i0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.i0.k3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.U1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.U1.cancel();
        }
        rh.g0 g0Var = profileActivity.f33927v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        float f10 = profileActivity.T1;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        final float f11 = profileActivity.P1;
        profileActivity.f33786b.setTranslationY(f11);
        profileActivity.f33786b.setVisibility(0);
        profileActivity.T0.setVisibility(0);
        profileActivity.f33779a.setVisibility(0);
        profileActivity.y4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f33816f.setVisibility(0);
        profileActivity.f33897r.setVisibility(0);
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (profileActivity.T1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        lVar.y(z11);
        int i11 = 8;
        if (profileActivity.T1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.p5 p5Var = profileActivity.S0;
        if (p5Var != null) {
            p5Var.setVisibility(i10);
        }
        profileActivity.T0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        if (profileActivity.T1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f33786b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.r0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new ww0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.T4();
            org.telegram.messenger.i0.Y2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        profileActivity.U1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f7) {
        boolean z10;
        int i10;
        if (profileActivity.f33873n2) {
            if (profileActivity.f33880o2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.i0.f16166m;
                } else {
                    i10 = 0;
                }
                profileActivity.f33779a.w0(0, ((view.getTop() - profileActivity.f33779a.getMeasuredWidth()) - profileActivity.e4()) + currentActionBarHeight + i10, org.telegram.ui.Components.gr.h);
                return;
            }
            profileActivity.f33779a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.gr.h);
            return;
        }
        if (profileActivity.e4() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = profileActivity.P1;
            if (f10 > 0.0f && ((f10 < profileActivity.j4() * 0.6f || f7 < -1000.0f) && profileActivity.P1 > profileActivity.e4() * 0.6f)) {
                profileActivity.f33779a.w0(0, (int) (profileActivity.P1 - profileActivity.e4()), org.telegram.ui.Components.gr.h);
                return;
            }
        }
        if (z10) {
            float f11 = profileActivity.P1;
            if (f11 > 0.0f && f11 < profileActivity.e4() * 0.6f) {
                profileActivity.f33779a.w0(0, (int) profileActivity.P1, org.telegram.ui.Components.gr.h);
                return;
            }
        }
        if (!z10) {
            float f12 = profileActivity.P1;
            if (f12 > 0.0f && f7 < -1000.0f) {
                profileActivity.f33779a.w0(0, (int) f12, org.telegram.ui.Components.gr.h);
                return;
            }
        }
        if (profileActivity.P1 > 0.0f) {
            profileActivity.f33779a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.gr.h);
        }
    }

    public static void V4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        x1Var.f21489i0 = false;
        x1Var.show();
        Utilities.e.c(new zj0(x1Var, z10, activity, 6));
    }

    public static SpannableStringBuilder W3(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        f00 f00Var = new f00(9);
        f00Var.f36951w = str;
        if (f00Var.f36946c != null) {
            f00Var.f36946c = null;
            f00Var.a();
        }
        f00Var.f36947f = w02;
        f00Var.f36948n = false;
        spannableStringBuilder.setSpan(f00Var, 0, spannableStringBuilder.length(), 0);
        f00[] f00VarArr = (f00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f00.class);
        if (f00VarArr != null) {
            for (f00 f00Var2 : f00VarArr) {
                f00Var2.getClass();
                f00Var2.f36947f = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                f00Var2.f36949r = i10;
                f00Var2.f36950s = p6Var;
                f00Var2.f36948n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(FrameLayout frameLayout, float f7) {
        int i10;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(T6 * f7);
        frameLayout.setAlpha(1.0f - f7);
        if (f7 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.jz0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f33957z0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e;
        org.telegram.ui.Components.wb h;
        if (profileActivity.I2 == null) {
            if (profileActivity.f33886p1 && !profileActivity.getMessagesController().A3()) {
                ArrayList l4 = profileActivity.getMessagesController().f19234r7.l(profileActivity.f33810e1);
                if (l4 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < l4.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l4.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f19846id == profileActivity.f33818f1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (e = org.telegram.ui.Components.f5.e(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.cc.a0(profileActivity).h(e, 1, new nv0(profileActivity, 2))) != null) {
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

    public static void b0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.Y3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.J5();
                profileActivity.d.f();
            } else {
                profileActivity.D5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (!profileActivity.f33865m2 && !org.telegram.messenger.i0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.i0.f16166m;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f33779a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f33779a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    wx0 wx0Var = profileActivity.d;
                    if (i12 >= wx0Var.e.M2) {
                        break;
                    }
                    s4.c1 a2 = wx0Var.a(null, wx0Var.d(i12));
                    View view = a2.f47909a;
                    profileActivity.d.t(a2, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i13) + i11));
                aw0 aw0Var = profileActivity.f33779a;
                aw0Var.setPadding(0, aw0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f33779a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.f33840i2.cancel();
                float[] fArr = profileActivity.f33860l2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.X4(1.0f);
                profileActivity.P1 = profileActivity.j4();
            }
        }
        profileActivity.L.m(profileActivity.f33832h1, user, 8);
    }

    public static void c0(org.telegram.ui.ProfileActivity r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.c0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void c5(int i10, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i10) {
            view.getLayoutParams().height = i10;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i10);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.u5 u5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.jc b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            gf.f.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        kg.v1 v1Var = new kg.v1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f33957z0);
        u5Var.getLocationOnScreen(new int[2]);
        v1Var.f11306n2 = u5Var.f21363h0;
        v1Var.f11307o2 = u5Var.f21364i0;
        v1Var.f11310r2 = u5Var.getScaleX();
        v1Var.f11308p2 = u5Var.getLeft();
        v1Var.f11309q2 = u5Var.getTop();
        v1Var.f11311s2 = u5Var;
        Drawable rightDrawable = u5Var.getRightDrawable();
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (rightDrawable == d5Var && d5Var != null) {
            Drawable drawable = d5Var.f25372f[0];
            if (drawable instanceof org.telegram.ui.Components.f5) {
                v1Var.f11310r2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.f5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(profileActivity.getParentActivity());
                    org.telegram.messenger.d00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, false);
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.jc.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f15264f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.kj.K2(document, false)) {
                            d.e = 512;
                            d.f15264f = 512;
                        }
                        b10 = org.telegram.messenger.jc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.jc jcVar = b10;
                    g9Var.setLayerNum(7);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                    g9Var.m(jcVar, str2, org.telegram.messenger.jc.c(w9, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.f5) profileActivity.F.f25372f[0]).c()) {
                        g9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, profileActivity.f33957z0), PorterDuff.Mode.SRC_IN));
                        v1Var.f11313u2 = org.telegram.messenger.kj.j1(document);
                    } else {
                        v1Var.f11313u2 = org.telegram.messenger.kj.j1(document);
                    }
                    v1Var.f11312t2 = g9Var;
                    v1Var.f11315w2 = true;
                }
            }
        }
        profileActivity.showDialog(v1Var);
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.f33789b2, 0.25f) / 0.25f;
        float f7 = 1.0f;
        if (profileActivity.f33886p1) {
            profileActivity.f33913t0.setAlpha(1.0f - min);
            profileActivity.f33913t0.setBlurIntensity(0.0f);
            int i10 = 0;
            profileActivity.f33913t0.setGooeyEnabled(false);
            org.telegram.ui.Components.zg0 zg0Var = profileActivity.f33913t0;
            if (profileActivity.f33789b2 >= 1.0f) {
                i10 = 8;
            }
            zg0Var.setVisibility(i10);
        } else {
            profileActivity.f33913t0.setHideProgress(profileActivity.f33789b2);
        }
        lw0 lw0Var = profileActivity.f33920u0;
        if (lw0Var != null && profileActivity.I1 != 2) {
            float f10 = profileActivity.f33789b2;
            if (f10 > 0.0f) {
                f7 = org.telegram.messenger.i0.T1(1.0f, 0.0f, org.telegram.messenger.i0.z1(f10, 0.0f, 0.5f));
            }
            lw0Var.setAlpha(f7);
        }
        profileActivity.x5();
    }

    public static void d5(org.telegram.ui.ActionBar.p5 p5Var, boolean z10, boolean z11) {
        int i10;
        if (c3.i0.t(p5Var)) {
            p5Var.Y(z10, z11);
        } else if (p5Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p5Var.setVisibility(i10);
        }
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z10;
        TLRPC.VideoSize x10;
        if (tL_error == null) {
            TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.getUserConfig().e()));
            if (Z1 == null) {
                Z1 = profileActivity.getUserConfig().f();
                if (Z1 == null) {
                    return;
                }
                profileActivity.getMessagesController().U3(Z1, false, false);
            } else {
                profileActivity.getUserConfig().w(Z1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x10 = null;
            } else {
                x10 = org.telegram.messenger.b8.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            Z1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19818id;
            if (w9 != null) {
                tL_userProfilePhoto.photo_small = w9.location;
            }
            if (w10 != null) {
                tL_userProfilePhoto.photo_big = w10.location;
            }
            if (w9 != null && profileActivity.H2 != null) {
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                org.telegram.messenger.b8.K(profileActivity.H2, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.H2.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, profileActivity.H2.local_id, "@50_50");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.ic.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.jc.m(profileActivity.currentAccount, 1, Z1));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.b8.K(x10, "mp4", true, true));
            } else if (w10 != null && profileActivity.I2 != null) {
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                org.telegram.messenger.b8.K(profileActivity.I2, null, true, true).renameTo(K2);
            }
            profileActivity.getMessagesController().T0(Z1.f19943id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Z1);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull a2 = profileActivity.getMessagesController().a2(profileActivity.f33803d1);
            if (a2 != null) {
                a2.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(a2, false);
            }
        }
        if (!org.telegram.messenger.i0.Q1() && !profileActivity.f33865m2 && profileActivity.f33809e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f33873n2 = z10;
        profileActivity.H2 = null;
        profileActivity.I2 = null;
        jw0 jw0Var = profileActivity.f33871n0;
        jw0Var.H0 = true;
        jw0Var.K0 = profileActivity.J2;
        jw0Var.f31300q1 = null;
        jw0Var.f31301r1 = null;
        jw0Var.setCreateThumbFromParent(false);
        profileActivity.I5(true);
        profileActivity.j5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.at.f14772r, Integer.valueOf(org.telegram.messenger.wp.D8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.at.f14728j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean f0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.wp.r1(profileActivity.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + profileActivity.f33832h1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.w3.T(profileActivity.D2) && !profileActivity.D2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.u70.f30883q1;
        org.telegram.ui.Components.u70.J0(parentActivity, profileActivity, org.telegram.ui.Components.cc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.J5();
            wx0 wx0Var = profileActivity.d;
            if (wx0Var != null) {
                wx0Var.f();
            }
        }
        if (k2Var instanceof un) {
            ((un) k2Var).Tb(false, true);
        }
        return false;
    }

    public static void g0(ProfileActivity profileActivity) {
        org.telegram.messenger.wp.r1(profileActivity.currentAccount).l0(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    public static void h0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(profileActivity).Q(2131623989, 36, org.telegram.messenger.dd.L0(2131746871, null));
            Q.f32201j = 5000;
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
                String L0 = org.telegram.messenger.dd.L0(2131746867, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131746868, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                profileActivity.showDialog(x1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity), 2131624011, 36);
    }

    public static void i0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            xh.z2.J0(context, profileActivity.currentAccount, profileActivity.f33922u2.starref_program, profileActivity.getUserConfig().e(), profileActivity.f33957z0, false);
        } else {
            xh.z2.K0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f33957z0);
        }
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.H2 = fileLocation;
            profileActivity.I2 = photoSize2.location;
            profileActivity.f33809e0.j(org.telegram.messenger.jc.e(fileLocation), "50_50", profileActivity.f33885p0, null);
            if (profileActivity.N2 != -1) {
                profileActivity.J5();
                wx0 wx0Var = profileActivity.d;
                if (wx0Var != null) {
                    wx0Var.f();
                }
                profileActivity.y4(true);
            }
            jw0 jw0Var = profileActivity.f33871n0;
            org.telegram.messenger.jc e = org.telegram.messenger.jc.e(profileActivity.I2);
            profileActivity.J2 = e;
            jw0Var.A(e, org.telegram.messenger.jc.e(profileActivity.H2));
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
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.f33844i6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new sl0(6, profileActivity, str));
        }
        profileActivity.actionBar.p().requestLayout();
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User Z1;
        TLRPC.ChatParticipant chatParticipant;
        wx0 wx0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f33779a.C0();
        if (i10 == profileActivity.R3) {
            TLRPC.User Z12 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33803d1));
            TLRPC.UserFull userFull = profileActivity.f33922u2;
            if (userFull != null && userFull.starref_program != null) {
                long e = profileActivity.getUserConfig().e();
                rh.r.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e, profileActivity.f33803d1, new zt(profileActivity, context, e, 2));
            } else if (Z12 == null || !Z12.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new xh.i(profileActivity.f33803d1));
            }
        } else if (i10 == profileActivity.P3) {
            boolean z10 = !profileActivity.getMessagesController().q2(j10, profileActivity.f33818f1, null);
            profileActivity.getNotificationsController().G(j10, profileActivity.f33818f1, z10);
            org.telegram.ui.Components.cc.A(profileActivity, z10, null).j();
            profileActivity.v5();
            int i11 = profileActivity.P3;
            if (i11 < 0 || (wx0Var = profileActivity.d) == null) {
                return;
            }
            wx0Var.g(i11);
        } else if (i10 == profileActivity.Y3) {
            TLRPC.User Z13 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33803d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", Z13.f19943id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f33807d5);
            bundle.putString("first_name_card", profileActivity.f33814e5);
            bundle.putString("last_name_card", profileActivity.f33822f5);
            ns nsVar = new ns(bundle, profileActivity.f33957z0);
            nsVar.O = new fv0(profileActivity, Z13);
            profileActivity.presentFragment(nsVar);
        } else if (i10 == profileActivity.V3) {
            TextView textView = (TextView) org.telegram.ui.Components.s4.h0(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131751509, null), org.telegram.messenger.dd.L0(2131751593, null), org.telegram.messenger.dd.L0(2131751592, null), org.telegram.messenger.dd.L0(2131751599, null), new nv0(profileActivity, 1), profileActivity.f33957z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
            }
        } else if (i10 == profileActivity.W3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33957z0);
            String L0 = org.telegram.messenger.dd.L0(2131746228, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131746249, null);
            TLRPC.Chat L02 = profileActivity.getMessagesController().L0(Long.valueOf(-profileActivity.f33784a5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (L02 != null && org.telegram.messenger.w3.w(2, L02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.f33957z0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.dd.L0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                c2VarArr[0].setOnClickListener(new t10(c2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746247, null), new cp0(9, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Components.a21(23));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21171q7, null);
            }
        } else if (i10 == profileActivity.f33895q4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f33832h1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.k2(bundle2));
        } else if (i10 == profileActivity.f33889p4) {
            profileActivity.showDialog(org.telegram.ui.Components.s4.U(profileActivity.getParentActivity(), profileActivity.C2, profileActivity.f33957z0).f20135a);
        } else if (i10 == profileActivity.M3) {
            profileActivity.F4(view, f7, f10, false);
        } else if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().c5(null, profileActivity.f33803d1);
            if (org.telegram.ui.Components.cc.a(profileActivity)) {
                org.telegram.ui.Components.cc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.Z3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        } else if (i10 == profileActivity.T3) {
            profileActivity.I4();
        } else if (i10 == profileActivity.U3) {
            b01.K0(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f33917t4 && i10 < profileActivity.f33924u4) {
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant = profileActivity.f33915t2.participants.participants.get(((Integer) profileActivity.B2.get(i10 - profileActivity.f33917t4)).intValue());
            } else {
                chatParticipant = profileActivity.f33915t2.participants.participants.get(i10 - profileActivity.f33917t4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f33931v4) {
            profileActivity.J4();
        } else if (i10 == profileActivity.K3) {
            profileActivity.Q4(f7, f10, i10, view);
        } else if (i10 == profileActivity.f33856k4) {
            if (profileActivity.D2 != null) {
                profileActivity.showDialog(new yh.z(profileActivity, profileActivity.D2.linked_community_id, null, null));
            } else if (profileActivity.f33803d1 == 0 || (Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33803d1))) == null) {
            } else {
                profileActivity.showDialog(new yh.z(profileActivity, Z1.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.H3) {
            if (profileActivity.f33915t2.location instanceof TLRPC.TL_channelLocation) {
                xb0 xb0Var = new xb0(5);
                xb0Var.f43317n0 = -profileActivity.f33810e1;
                xb0Var.H0 = (TLRPC.TL_channelLocation) profileActivity.f33915t2.location;
                profileActivity.presentFragment(xb0Var);
            }
        } else if (i10 == profileActivity.L4) {
            profileActivity.E4(false);
        } else if (i10 == profileActivity.f33939w4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f33810e1);
            bundle3.putInt("type", 2);
            pr prVar = new pr(bundle3);
            prVar.C0(profileActivity.f33915t2);
            profileActivity.presentFragment(prVar);
        } else if (i10 == profileActivity.f33947x4) {
            profileActivity.presentFragment(new kg.q1(profileActivity.f33810e1));
        } else if (i10 == profileActivity.f33954y4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f33810e1);
            bundle4.putInt("type", 1);
            pr prVar2 = new pr(bundle4);
            prVar2.C0(profileActivity.f33915t2);
            profileActivity.presentFragment(prVar2);
        } else if (i10 == profileActivity.f33961z4) {
            profileActivity.R0.performClick();
        } else if (i10 == profileActivity.A4) {
            profileActivity.presentFragment(new rh.i(0, profileActivity.f33803d1));
        } else if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new rh.i(1, profileActivity.f33803d1));
        } else if (i10 == profileActivity.C4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f33810e1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new s61(bundle5));
        } else if (i10 == profileActivity.F4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f33810e1);
            bundle6.putInt("type", 0);
            pr prVar3 = new pr(bundle6);
            prVar3.C0(profileActivity.f33915t2);
            profileActivity.presentFragment(prVar3);
        } else if (i10 == profileActivity.f33812e3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f33827g3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.G2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f33834h3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f33841i3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f33848j3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f33861l3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f33855k3) {
            profileActivity.presentFragment(new ab0());
        } else if (i10 == profileActivity.f33866m3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f33888p3) {
            profileActivity.showDialog(org.telegram.ui.Components.s4.T(profileActivity, profileActivity.f33957z0));
        } else if (i10 == profileActivity.f33894q3) {
            gf.f.r(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
        } else if (i10 == profileActivity.f33901r3) {
            gf.f.r(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
        } else if (i10 == profileActivity.f33923u3) {
            V4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f33930v3) {
            V4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f33938w3) {
            org.telegram.messenger.f8.a();
        } else if (i10 == profileActivity.f33946x3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33957z0);
            String L03 = org.telegram.messenger.dd.L0(2131754120, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
            x1Var2.T = L03;
            x1Var2.R = org.telegram.messenger.dd.L0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), new av0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            profileActivity.showDialog(x1Var2);
        } else if (i10 == profileActivity.f33820f3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.U2) {
            profileActivity.presentFragment(new oa(null));
        } else if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new f(3));
        } else if (i10 == profileActivity.N2) {
            profileActivity.I4();
        } else if (i10 == profileActivity.f33791b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f33799c4) {
            profileActivity.presentFragment(new rh.h8());
        } else if (i10 == profileActivity.f33806d4) {
            profileActivity.presentFragment(new wh.g());
        } else if (i10 == profileActivity.f33813e4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f33821f4) {
            mg.i2.l1(0, org.telegram.messenger.y1.a(profileActivity.currentAccount).b());
        } else if (i10 == profileActivity.botPermissionLocation) {
            xh.o0 o0Var = profileActivity.f33900r2;
            if (o0Var != null) {
                o0Var.l(!o0Var.g(), new hr0(14, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            xh.n nVar = profileActivity.f33908s2;
            if (nVar != null) {
                nVar.f53935f = true;
                nVar.e = !nVar.e;
                nVar.k();
                ((org.telegram.ui.Cells.p8) view).setChecked(profileActivity.f33908s2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setChecked(!p8Var.d());
            if (profileActivity.f33875n4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f33875n4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().n1(profileActivity.f33803d1);
            boolean d = p8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f33922u2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new sl0(5, profileActivity, r1));
            profileActivity.f33875n4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.N3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.T4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.N3);
            int i12 = profileActivity.f33858k6;
            if (i12 >= 0) {
                profileActivity.f33794c.h1(i12, profileActivity.f33863l6 - profileActivity.f33779a.getPaddingTop());
            }
        } else if (i10 == profileActivity.O3) {
            profileActivity.N4(false);
        } else if (i10 == profileActivity.P2) {
            if (profileActivity.f33922u2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f33922u2.personal_channel_id);
            profileActivity.presentFragment(new un(bundle7));
        } else if (i10 == profileActivity.T2) {
            ny0 ny0Var = profileActivity.f33963z6;
            if ((ny0Var == null || !ny0Var.a()) && !profileActivity.Z3(i10, view)) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (z8Var.d.getDrawable() != null) {
                    profileActivity.H4(z8Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.G3) {
            profileActivity.Y3(i10, view);
        } else {
            profileActivity.Q4(f7, f10, i10, view);
        }
    }

    public static void l0(ProfileActivity profileActivity) {
        boolean z10;
        mg.l1 l1Var;
        int i10;
        int w02;
        String str;
        boolean z11;
        long j10;
        Object[] objArr;
        char c10;
        float f7;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f33922u2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(profileActivity.getParentActivity(), false, 1, null);
            mg.l1 l1Var2 = h.f21622x0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.f33957z0);
            if (profileActivity.a() != org.telegram.messenger.e20.i(profileActivity.currentAccount).e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-org.telegram.messenger.i0.L(14.0f));
            linearLayout.addView(limitPreviewView, w7.b6.t(-1, -2, 17, 0, 20, 0, 10));
            int i11 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, w7.b6.t(-1, -2, 17, 40, -12, 40, 20));
                int i12 = 2;
                org.telegram.ui.Components.p80[] p80VarArr = new org.telegram.ui.Components.p80[2];
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i12;
                    kg.t1 t1Var = new kg.t1(4, parentActivity, null);
                    p80VarArr[i13] = t1Var;
                    t1Var.setGravity(i11);
                    p80VarArr[i13].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.a7.V(p80VarArr[i13], org.telegram.ui.ActionBar.t6.f21312y6, null);
                    org.telegram.ui.ActionBar.a7.H(p80VarArr[i13], org.telegram.ui.ActionBar.t6.Uc, null);
                    frameLayout.addView(p80VarArr[i13], w7.b6.e(-1, -1, 119));
                    org.telegram.ui.Components.p80 p80Var = p80VarArr[i13];
                    if (i13 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    p80Var.setAlpha(f7);
                    org.telegram.ui.Components.p80 p80Var2 = p80VarArr[i13];
                    if (i13 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    p80Var2.setScaleX(f10);
                    org.telegram.ui.Components.p80 p80Var3 = p80VarArr[i13];
                    if (i13 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    p80Var3.setScaleY(f11);
                    i13++;
                    i12 = i14;
                    i11 = 17;
                }
                int i15 = i12;
                final s3 s3Var = new s3(p80VarArr, 21);
                if (profileActivity.a() == org.telegram.messenger.e20.i(profileActivity.currentAccount).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j11 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                l1Var = l1Var2;
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
                    objArr = p80VarArr;
                    org.telegram.ui.ActionBar.a7.V(p80VarArr[0], org.telegram.ui.ActionBar.t6.f21171q7, null);
                    if (z12) {
                        objArr[0].setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.H(',', "StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        objArr[0].setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131745190, org.telegram.messenger.o5.l(org.telegram.messenger.e20.f15506s0, profileActivity.a()))));
                    }
                    c10 = 0;
                } else {
                    objArr = p80VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.dd.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.dd.H(',', "StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i15] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c10 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131745204, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i16 = r4;
                            s3 s3Var2 = s3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i16) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    s3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    s3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    objArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i16 = r4;
                            s3 s3Var2 = s3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i16) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    s3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    s3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = org.telegram.messenger.dd.H(',', "StarRatingFuturePreview1", max);
                String H4 = org.telegram.messenger.dd.H(',', "StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i15] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131745203, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i16 = r4;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i16 = r4;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                l1Var = l1Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setGravity(17);
            textView.setText(org.telegram.messenger.dd.L0(2131745185, null));
            textView.setTextSize(1, 20.0f);
            int i16 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(textView, i16, profileActivity.f33957z0);
            linearLayout.addView(textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.f19944id == org.telegram.messenger.e20.i(profileActivity.currentAccount).e()) {
                textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131745186, null)));
                i10 = 1;
            } else {
                i10 = 1;
                org.telegram.messenger.m5.q(null, null, 2131745216, new Object[]{org.telegram.messenger.o5.l(org.telegram.messenger.e20.f15506s0, profileActivity.a())}, textView2);
            }
            textView2.setTextSize(i10, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, i16, profileActivity.f33957z0);
            linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 20, 0, 20, 12));
            rt0 rt0Var = new rt0(parentActivity, profileActivity.f33957z0);
            rt0Var.f41149a.l(org.telegram.messenger.dd.L0(2131745184, null), false);
            String L0 = org.telegram.messenger.dd.L0(2131745219, null);
            int i17 = org.telegram.ui.ActionBar.t6.Ci;
            rt0Var.f41150b.setText(org.telegram.messenger.dd.V(null, null, 2131745215, W3(L0, i17, profileActivity.f33957z0)));
            rt0Var.d.setVisibility(8);
            ImageView imageView = rt0Var.f41151c;
            imageView.setImageResource(2131231826);
            org.telegram.ui.ActionBar.p6 p6Var = profileActivity.f33957z0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, mode);
            linearLayout.addView(rt0Var, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            rt0 rt0Var2 = new rt0(parentActivity, profileActivity.f33957z0);
            rt0Var2.f41149a.l(org.telegram.messenger.dd.L0(2131745183, null), false);
            rt0Var2.f41150b.setText(org.telegram.messenger.dd.V(null, null, 2131745214, W3(org.telegram.messenger.dd.L0(2131745219, null), i17, profileActivity.f33957z0)));
            rt0Var2.d.setVisibility(8);
            ImageView imageView2 = rt0Var2.f41151c;
            imageView2.setImageResource(2131231890);
            org.telegram.ui.ActionBar.a7.t(imageView2, i16, profileActivity.f33957z0, mode);
            linearLayout.addView(rt0Var2, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            rt0 rt0Var3 = new rt0(parentActivity, profileActivity.f33957z0);
            rt0Var3.f41149a.l(org.telegram.messenger.dd.L0(2131745182, null), false);
            String L02 = org.telegram.messenger.dd.L0(2131745217, null);
            if (org.telegram.ui.ActionBar.t6.I.q()) {
                w02 = i0.b.f(0.25f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21096m6, profileActivity.f33957z0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, profileActivity.f33957z0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L02);
            f00 f00Var = new f00(9);
            f00Var.f36951w = L02;
            if (f00Var.f36946c != null) {
                str = null;
                f00Var.f36946c = null;
                f00Var.a();
            } else {
                str = null;
            }
            f00Var.f36947f = w02;
            f00Var.f36948n = false;
            spannableStringBuilder3.setSpan(f00Var, 0, spannableStringBuilder3.length(), 0);
            rt0Var3.f41150b.setText(org.telegram.messenger.dd.V(str, str, 2131745213, spannableStringBuilder3));
            rt0Var3.d.setVisibility(8);
            ImageView imageView3 = rt0Var3.f41151c;
            imageView3.setImageResource(2131231874);
            org.telegram.ui.ActionBar.a7.t(imageView3, i16, profileActivity.f33957z0, mode);
            linearLayout.addView(rt0Var3, w7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            vh.d dVar = new vh.d(parentActivity, profileActivity.f33957z0, true);
            dVar.setOnClickListener(new uv0(0, l1Var));
            dVar.i(rh.e4.g2(org.telegram.messenger.dd.L0(2131743913, null)), false, true);
            linearLayout.addView(dVar, w7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.N = linearLayout;
            h.show();
        }
    }

    public static void m0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f33886p1;
                if (z10) {
                    if (z10) {
                        profileActivity.c4();
                        return;
                    }
                    return;
                } else if (profileActivity.f33803d1 != 0) {
                    profileActivity.L4();
                    return;
                } else if (profileActivity.f33810e1 != 0) {
                    if (org.telegram.messenger.w3.c0(profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f33810e1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f33810e1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new un(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.c4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f33810e1);
                        if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                            profileActivity.presentFragment(new un(bundle2), false);
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
                profileActivity.F4(profileActivity.Z, f7, f10, true);
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
                b01.K0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.w4(false);
                return;
            case 12:
                profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, profileActivity.getParentActivity(), profileActivity.f33957z0);
                x1Var.r(200L);
                org.telegram.messenger.wp.r1(profileActivity.currentAccount).O1().k(profileActivity.a(), new org.telegram.ui.Components.vg(28, profileActivity, x1Var), true, profileActivity.f33957z0);
                return;
            case 13:
                profileActivity.B4(true);
                return;
            case 14:
                profileActivity.I4();
                return;
            case 15:
                TLRPC.User f11 = profileActivity.getUserConfig().f();
                if (f11 != null) {
                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(profileActivity, profileActivity.Z);
                    H.f33047w = false;
                    H.f33026i = 3;
                    H.c(2131232319, org.telegram.messenger.dd.L0(2131746515, null), new na0(profileActivity, 24), false);
                    H.c(2131232102, org.telegram.messenger.dd.L0(2131746693, null), new vv0(f11, 1), false);
                    H.c(2131232115, org.telegram.messenger.dd.L0(2131746635, null), new na0(profileActivity, 26), false);
                    H.W = true;
                    H.a0(f7 - org.telegram.messenger.i0.L(8.0f), profileActivity.Z.getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new c51(null));
                return;
            default:
                return;
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f33780a0 == null) {
            if (MediaController.B().Q0 != null && MediaController.B().Q0.f17802a == profileActivity.currentAccount && MediaController.B().Q0.f17803b == profileActivity.a()) {
                profileActivity.f33780a0 = MediaController.B().Q0;
            } else {
                org.telegram.messenger.qp qpVar = new org.telegram.messenger.qp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f33780a0 = qpVar;
                TLRPC.UserFull userFull = profileActivity.f33922u2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = qpVar.f17804c;
                    arrayList.clear();
                    qpVar.b();
                    arrayList.add(0, qpVar.d(document));
                }
            }
        }
        if (!profileActivity.f33780a0.f17804c.isEmpty()) {
            if (MediaController.B().Q0 == profileActivity.f33780a0 && MediaController.B().I((org.telegram.messenger.kj) profileActivity.f33780a0.f17804c.get(0))) {
                z10 = true;
            } else {
                MediaController.B().o();
                z10 = false;
            }
            MediaController.B().Q0 = profileActivity.f33780a0;
            MediaController.B().R0.clear();
            MediaController.B().R0.addAll(profileActivity.f33780a0.f17804c);
            if (!z10) {
                MediaController.B().S((org.telegram.messenger.kj) profileActivity.f33780a0.f17804c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.w7(profileActivity.getParentActivity(), profileActivity.f33957z0));
        }
    }

    public static void o0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.gb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new na0(profileActivity, 20), profileActivity.f33957z0);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().n1(profileActivity.f33803d1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().i1(profileActivity.f33784a5);
        tL_messages_reportReaction.f19902id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ag.c3(22));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f33784a5, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33803d1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.cc.a0(profileActivity).E(profileActivity.f33957z0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f33803d1;
        if (j10 == 0) {
            long j11 = profileActivity.f33810e1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f33832h1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            org.telegram.messenger.wp.r1(profileActivity.currentAccount).W(profileActivity.f33784a5, j12);
        } else {
            org.telegram.messenger.wp.r1(profileActivity.currentAccount).h0(profileActivity.f33784a5, profileActivity.Z4, j12);
        }
        profileActivity.Z4 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(profileActivity.getParentActivity(), profileActivity.f33957z0);
        ebVar.d(2131623981, new String[0]);
        ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131746419, null));
        org.telegram.ui.Components.cc.a0(profileActivity).b(ebVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        int i10;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.T1 = floatValue;
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
        profileActivity.S1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.f33786b.setTranslationY(floatValue * f7);
        profileActivity.O.setTranslationY(f7 * profileActivity.T1);
        profileActivity.f33779a.setTranslationY((1.0f - profileActivity.T1) * f13);
        profileActivity.f33779a.setScaleX(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f33779a.setScaleY(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f33779a.setAlpha(profileActivity.T1);
        boolean z11 = true;
        profileActivity.y4(true);
        profileActivity.f33779a.setAlpha(f10);
        profileActivity.f33786b.setAlpha(1.0f - profileActivity.T1);
        profileActivity.f33786b.setScaleX((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.f33786b.setScaleY((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f10);
        profileActivity.X.setAlpha(f10);
        profileActivity.f33809e0.setAlpha(f10);
        lw0 lw0Var = profileActivity.f33920u0;
        if (lw0Var != null) {
            lw0Var.setAlpha(f10);
        }
        profileActivity.f33816f.setAlpha(f10);
        kw0 kw0Var = profileActivity.f33897r;
        if (!profileActivity.R5) {
            f12 = f10;
        }
        kw0Var.setAlpha(f12);
        profileActivity.T0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.T1 < 0.7f) {
            org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
            if (p5Var.F.getWidth() != 0 && !p5Var.e.isFocused()) {
                p5Var.e.requestFocus();
                org.telegram.messenger.i0.J3(p5Var.e);
            }
        }
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        int i11 = 8;
        if (profileActivity.T1 < 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        searchContainer.setVisibility(i10);
        if (profileActivity.T1 > 0.5f) {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.p5 p5Var2 = profileActivity.S0;
        if (p5Var2 != null) {
            p5Var2.setVisibility(i11);
            profileActivity.S0.setAlpha(f10);
        }
        profileActivity.T0.setVisibility(i11);
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (profileActivity.T1 >= 0.5f) {
            z11 = false;
        }
        lVar.y(z11);
        org.telegram.ui.ActionBar.p5 p5Var3 = profileActivity.S0;
        if (p5Var3 != null) {
            p5Var3.setAlpha(f10);
        }
        profileActivity.T0.setAlpha(f10);
        profileActivity.f33796c1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void s1(ProfileActivity profileActivity) {
        if (profileActivity.simpleActionBar != null) {
            org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
            if (lVar != null && lVar.getVisibility() != 4) {
                profileActivity.actionBar.setVisibility(4);
            }
            float actionModeFactor = profileActivity.simpleActionBar.getActionModeFactor();
            fg.i iVar = profileActivity.Y;
            if (iVar != null) {
                float f7 = 1.0f - actionModeFactor;
                if (iVar.getAlpha() != f7) {
                    profileActivity.Y.setAlpha(f7);
                }
            }
        }
    }

    public static void y1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        float f7;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f33779a.setVisibility(i10);
        org.telegram.ui.Components.uk0 uk0Var = profileActivity.f33786b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        uk0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        rh.g0 g0Var = profileActivity.f33927v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        profileActivity.actionBar.y(z10);
        profileActivity.X.setVisibility(i10);
        lw0 lw0Var = profileActivity.f33920u0;
        if (lw0Var != null) {
            lw0Var.setVisibility(i10);
        }
        profileActivity.f33816f.setVisibility(i10);
        profileActivity.f33897r.setVisibility(i10);
        org.telegram.ui.ActionBar.p5 p5Var = profileActivity.S0;
        if (p5Var != null) {
            p5Var.setAlpha(1.0f);
            profileActivity.S0.setVisibility(i10);
        }
        profileActivity.T0.setVisibility(i10);
        profileActivity.f33809e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        lw0 lw0Var2 = profileActivity.f33920u0;
        if (lw0Var2 != null) {
            lw0Var2.setAlpha(1.0f);
        }
        rh.g0 g0Var2 = profileActivity.f33927v0;
        if (g0Var2 != null) {
            g0Var2.setAlpha(1.0f);
        }
        profileActivity.f33816f.setAlpha(1.0f);
        kw0 kw0Var = profileActivity.f33897r;
        if (profileActivity.R5) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        kw0Var.setAlpha(f7);
        profileActivity.T0.setAlpha(1.0f);
        profileActivity.f33779a.setAlpha(1.0f);
        profileActivity.f33786b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z10) {
            profileActivity.f33786b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public final void A5() {
        if (this.simpleActionBar != null && this.G5 != null) {
            org.telegram.ui.Components.lg0 lg0Var = this.I5;
            if (lg0Var != null) {
                float l4 = l4();
                if (lg0Var.f28165l != l4) {
                    lg0Var.f28165l = l4;
                    lg0Var.a();
                }
            }
            int f7 = i0.b.f(l4(), this.C5, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f33957z0));
            if (this.F5 != f7) {
                this.F5 = f7;
                org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
                i5Var.f20421l0 = true;
                i5Var.f20415f0 = f7;
                i5Var.updateColors();
            }
            int n02 = this.H5.n0();
            if (this.K5 != n02) {
                this.K5 = n02;
                org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
                vg.f fVar = i5Var2.H;
                if (fVar != null) {
                    fVar.updateColors();
                    i5Var2.I.updateColors();
                    i5Var2.J.updateColors();
                }
                i5Var2.invalidate();
                org.telegram.ui.ActionBar.s5 s5Var = i5Var2.Q;
                if (s5Var != null) {
                    s5Var.invalidate();
                }
            }
        }
    }

    public final void B4(boolean z10) {
        boolean z11;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1));
        if (Z1 != null) {
            if (this.f33893q2 && !org.telegram.messenger.wp.E2(Z1)) {
                if (this.f33846j1 && !z10) {
                    getMessagesController().c5(new na0(this, 6), this.f33803d1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.D2;
                if (this.C2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.s4.r(this, false, chat, Z1, z11, true, false, true, new fv0(this, Z1));
            } else if (this.f33846j1) {
                getMessagesController().c5(null, this.f33803d1);
                if (org.telegram.ui.Components.cc.a(this)) {
                    org.telegram.ui.Components.cc.d(this, false).j();
                }
            } else if (this.f33853k1) {
                org.telegram.ui.Components.s4.i0(this, this.f33803d1, Z1, null, this.C2, false, null, new ra(this, 4), this.f33957z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f33957z0);
                String L0 = org.telegram.messenger.dd.L0(2131753692, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131753693, null), new av0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, this.f33957z0);
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
        if (this.S0 != null) {
            boolean z16 = this.R5;
            boolean z17 = !z16;
            boolean z18 = this.f33880o2;
            org.telegram.ui.ActionBar.p5 p5Var = this.P0;
            boolean z19 = false;
            if (!z16 && !z18 && this.L0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d5(p5Var, z11, z10);
            org.telegram.ui.ActionBar.p5 p5Var2 = this.Q0;
            if (!z16 && !z18 && this.M0) {
                z12 = true;
            } else {
                z12 = false;
            }
            d5(p5Var2, z12, z10);
            org.telegram.ui.ActionBar.p5 p5Var3 = this.R0;
            if (!z16 && !z18 && this.N0) {
                z13 = true;
            } else {
                z13 = false;
            }
            d5(p5Var3, z13, z10);
            hx0 hx0Var = this.N;
            if (hx0Var != null && hx0Var.I != null && hx0Var.u0(hx0Var.getClosestTab())) {
                z14 = true;
            } else {
                z14 = false;
            }
            org.telegram.ui.ActionBar.p5 p5Var4 = this.S0;
            if (z10 && !z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            d5(p5Var4, z17, z15);
            hx0 hx0Var2 = this.N;
            if (hx0Var2 != null) {
                boolean z20 = this.R5;
                if (z10 && !z14) {
                    z19 = true;
                }
                if (hx0Var2.f24546p2 != z20) {
                    hx0Var2.f24546p2 = z20;
                    hx0Var2.Q(z10, z19);
                }
            }
        }
    }

    @Override
    public final hi.f C() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ei.r.f().f6693a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void C4(boolean z10) {
        boolean z11 = false;
        if (this.f33803d1 != 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1));
            if (Z1 != null) {
                TLRPC.UserFull userFull = this.f33922u2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.n1.m(Z1, z10, z11, getParentActivity(), this.f33922u2, getAccountInstance());
            }
        } else if (this.f33810e1 != 0) {
            if (getMessagesController().f1(this.f33810e1, false, null) == null) {
                TLRPC.Chat chat = this.D2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.k70.J0(getParentActivity(), -chat.f19794id, accountInstance, new androidx.car.app.utils.a(chat, this, accountInstance, 28));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.n1.l(this.D2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void C5() {
        TLRPC.User Z1;
        boolean z10;
        int i10;
        int i11;
        if (this.f33899r1 && this.W0 != null && this.V0 != null && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1))) != null) {
            int i12 = 0;
            if (org.telegram.messenger.i20.n(Z1) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.b1 b1Var = this.W0;
            if (z10) {
                i10 = 2131231908;
            } else {
                i10 = 2131231909;
            }
            b1Var.setIcon(i10);
            org.telegram.ui.ActionBar.b1 b1Var2 = this.W0;
            if (z10) {
                i11 = 2131746635;
            } else {
                i11 = 2131746634;
            }
            b1Var2.setText(org.telegram.messenger.dd.L0(i11, null));
            org.telegram.ui.ActionBar.b1 b1Var3 = this.V0;
            if (org.telegram.messenger.i20.n(Z1) == null) {
                i12 = 8;
            }
            b1Var3.setVisibility(i12);
        }
    }

    public final void D4() {
        TLRPC.UserFull userFull = this.f33922u2;
        if (userFull != null && org.telegram.messenger.i20.b(userFull)) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.a30.s(org.telegram.messenger.dd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(a())), org.telegram.ui.Components.cc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        if (this.D2 != null) {
            org.telegram.ui.Components.r30.h.a();
        }
        showDialog(new ph.l1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void D5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                G5(false);
            }
            J5();
        } else if (!z11 && this.f33779a.isInLayout()) {
            aw0 aw0Var = this.f33779a;
            if (!aw0Var.G) {
                return;
            }
            aw0Var.post(new xv0(0, this, z10));
        } else {
            jx0 jx0Var = new jx0(this);
            jx0Var.f38573b = this.M2;
            jx0Var.f(jx0Var.f38574c);
            jx0Var.e.clear();
            jx0Var.f38575f.clear();
            jx0Var.e.addAll(this.Q4);
            jx0Var.f38575f.addAll(this.R4);
            jx0Var.f38576g = this.f33917t4;
            jx0Var.h = this.f33924u4;
            if (z10) {
                G5(false);
            }
            T4();
            J5();
            jx0Var.f(jx0Var.d);
            try {
                s4.n.c(jx0Var, true).c(this.d);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                this.d.f();
            }
            int i10 = this.f33858k6;
            if (i10 >= 0) {
                this.f33794c.h1(i10, this.f33863l6 - this.f33779a.getPaddingTop());
            }
            org.telegram.messenger.i0.a4(this.f33779a);
        }
    }

    public final void E4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.D2.f19794id, getUserConfig().f(), 0, null, this, true, new zj0(this, z10, zArr, 5), new bi.o4(this, zArr, z10, this.parentLayout.getLastFragment(), 5), null);
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.I4, new Object[0]);
    }

    public final void E5() {
        int i10;
        if (this.f33787b0 != null && this.f33897r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16166m;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.F1;
            if (z10 && this.I1 == 2 && this.X != null) {
                this.f33787b0.setAlpha(this.R1);
                this.f33787b0.f(org.telegram.messenger.i0.L(74.0f) + this.f33779a.getMeasuredWidth(), e4() - org.telegram.messenger.i0.L(74.0f));
                return;
            }
            if (z10) {
                this.f33787b0.setAlpha(this.R1);
            }
            float f7 = i11;
            float L = this.P1 + f7 + org.telegram.messenger.i0.L(74.0f);
            float min = Math.min(e4(), L - f7);
            this.f33787b0.f(L - min, min - org.telegram.messenger.i0.L(74.0f));
        }
    }

    public final void F4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.f33832h1;
        if (j11 == 0) {
            j11 = this.f33803d1;
            if (j11 == 0) {
                j11 = -this.f33810e1;
            }
        }
        long j12 = j11;
        boolean q22 = getMessagesController().q2(j12, this.f33818f1, null);
        if (z10 && (this.f33886p1 || q22)) {
            boolean z11 = !q22;
            getNotificationsController().G(j12, this.f33818f1, z11);
            org.telegram.ui.Components.cc.A(this, z11, null).j();
            v5();
            this.Z.setNotifications(q22);
        } else if ((!z10 && org.telegram.messenger.dd.X && f7 <= org.telegram.messenger.i0.L(76.0f)) || (!org.telegram.messenger.dd.X && f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            boolean z12 = l5Var.e.h;
            boolean z13 = !z12;
            boolean D = getNotificationsController().D(j12, null, false, false);
            String v = org.telegram.messenger.pt.v(j12, this.f33818f1, false);
            if (!z12) {
                SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.currentAccount).e7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f33818f1 == 0) {
                    getMessagesStorage().E1(j12, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j12);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.wp.r1(this.currentAccount).e7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j10 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j10 = 1;
                }
                getNotificationsController().N(j12);
                if (this.f33818f1 == 0) {
                    getMessagesStorage().E1(j12, j10);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().Q.f(j12);
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
            getNotificationsController().c0(j12, this.f33818f1, true);
            l5Var.setChecked(z13);
            org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) this.f33779a.L(this.M3, false);
            F5(true);
        } else {
            org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(getParentActivity(), this.currentAccount, null, true, new c3.g0(this, j12, 6), this.f33957z0);
            goVar.e(j12, this.f33818f1, this.f33836h5);
            if (org.telegram.messenger.i0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.Z.getHeight() - org.telegram.messenger.i0.L(12.0f);
            }
            goVar.d(this, view, f11, f12, z10);
        }
    }

    public final void F5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.F5(boolean):void");
    }

    public final void G4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f33803d1 != 0) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1));
                if (Z1 != null) {
                    if (this.E2 != null && (userFull = this.f33922u2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().U2 + "/%s", this.f33922u2.about, org.telegram.messenger.i20.n(Z1));
                    } else {
                        str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.i20.n(Z1));
                    }
                } else {
                    return;
                }
            } else if (this.f33810e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f33810e1));
                if (L0 != null) {
                    TLRPC.ChatFull chatFull = this.f33915t2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().U2 + "/%s", this.f33915t2.about, org.telegram.messenger.w3.K(L0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.w3.K(L0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131752982, null)), 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void G5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.A2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.B2.clear();
        TLRPC.ChatFull chatFull = this.f33915t2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.A2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f33915t2.participants.participants.size()) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33915t2.participants.participants.get(i11).user_id));
            if (Z1 != null && (userStatus = Z1.status) != null && ((userStatus.expires > currentTime || Z1.f19943id == getUserConfig().e()) && Z1.status.expires > 10000)) {
                this.A2++;
            }
            this.B2.add(Integer.valueOf(i11));
            if (Z1 != null) {
                if (Z1.bot) {
                    i10 = -110;
                } else if (Z1.self) {
                    i10 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = Z1.status;
                    if (userStatus2 != null) {
                        i10 = userStatus2.expires;
                    }
                }
                i11 = c3.i0.j(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = c3.i0.j(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.B2, Comparator$EL.reversed(Comparator$CC.comparingInt(new df(arrayList, 1))));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (z10 && this.d != null && this.f33917t4 > 0) {
            org.telegram.messenger.i0.a4(this.f33779a);
        }
        if (this.N != null && this.J4 != -1) {
            if ((this.B2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.N.i1(this.B2, this.f33915t2);
            }
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void H3() {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        if (this.N != null && (lVar = this.actionBar) != null) {
            if (lVar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16166m;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            int[] iArr = org.telegram.ui.Components.au0.f24493s2;
            int z10 = org.telegram.messenger.m5.z(6.666f, ei.b.d(currentActionBarHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()), currentActionBarHeight);
            int c10 = ei.b.c(i10) + currentActionBarHeight + z10;
            this.U5 = c10;
            this.N.j1(z10, c10, ei.b.c(this.I6), this.I6 + this.G6);
            this.V5 = org.telegram.messenger.i0.L(44.0f) + currentActionBarHeight;
            y5();
            P3();
        }
    }

    public final void H4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.K3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f33810e1);
            bundle.putLong("user_id", this.f33803d1);
            presentFragment(new qh.i0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.T2) {
            if (this.f33803d1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.i20.b(this.f33922u2)) {
                org.telegram.messenger.a30.s(org.telegram.messenger.dd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(this.f33803d1)), org.telegram.ui.Components.cc.a0(this), 2131624011, 36);
            } else {
                showDialog(new ph.l1(getParentActivity(), this.currentAccount, this.f33803d1, null, null));
            }
        }
    }

    public final void H5() {
        CharSequence charSequence;
        kw0 kw0Var = this.f33897r;
        if (kw0Var != null) {
            if ((!this.R5 || (charSequence = this.W5) == null) && (!this.f33919t6 || (charSequence = this.f33912s6) == null)) {
                charSequence = this.f33904r6;
            }
            if (kw0Var.o(charSequence, !this.F1) && this.fragmentView != null) {
                y4(false);
            }
        }
    }

    @Override
    public final void I(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.f33824g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
        this.f33871n0.O(this.J2, f7);
    }

    public final int I3(int i10, Boolean bool) {
        int i11;
        if (this.f33830g6 != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, this.f33957z0);
            int f7 = i0.b.f(0.5f, this.f33830g6.m(org.telegram.ui.ActionBar.t6.I.q()), this.f33830g6.n(org.telegram.ui.ActionBar.t6.I.q()));
            if (!org.telegram.ui.ActionBar.t6.e1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.t6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.t6.r1(0.7f, f7));
                }
                return f7;
            }
            boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.t6.r1(0.7f, f7);
            } else {
                i11 = f7;
            }
            return org.telegram.ui.ActionBar.t6.D(q6, w02, f7, i10, i11);
        }
        return i10;
    }

    public final void I4() {
        boolean z10;
        org.telegram.ui.Components.ci0 ci0Var;
        if (this.f33803d1 != 0) {
            if (this.f33891q0 != null) {
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.e20.i(this.currentAccount).e()));
                if (Z1 == null) {
                    Z1 = org.telegram.messenger.e20.i(this.currentAccount).f();
                }
                if (Z1 != null) {
                    org.telegram.ui.Components.b40 b40Var = this.f33891q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b40Var.n(z10, new na0(this, 27), new q5(this, 13), 0);
                    this.U.M(0);
                    this.U.P(43);
                    this.V.M(0);
                    this.V.P(43);
                    org.telegram.ui.Components.hg0 hg0Var = this.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i10 = org.telegram.ui.Components.hg0.i(14, hg0Var.f26788a);
                        if (i10 != null && (ci0Var = i10.f25819k) != null) {
                            ci0Var.start();
                        }
                    } else {
                        this.f33905s.d();
                    }
                    org.telegram.ui.Cells.p8 p8Var = this.L2;
                    if (p8Var != null) {
                        p8Var.getImageView().d();
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

    @Override
    public final void J() {
        U4(false);
    }

    public final void J3() {
        int f7;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && this.f33816f != null && this.f33796c1 != null && this.S0 != null && this.P0 != null && this.Q0 != null && this.R0 != null && this.f33878o0 != null) {
            Float valueOf = Float.valueOf(this.Q5);
            ow0 ow0Var = this.S5;
            ow0Var.getClass();
            ow0Var.a(lVar, valueOf);
            if (this.Q5 <= 0.0f && this.f33847j2 > 0.0f) {
                kl klVar = this.f33816f;
                int i10 = -1;
                if (this.f33830g6 != null) {
                    f7 = -1;
                } else {
                    f7 = i0.b.f(this.f33847j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21051ji, this.f33957z0), -1);
                }
                klVar.setTextColor(f7);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                if (this.f33830g6 == null) {
                    i10 = i0.b.f(this.f33847j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f33957z0), -1);
                }
                lVar2.D(i10, false);
            }
        }
    }

    public final void J4() {
        Bundle g10 = a1.g.g("addToGroup", true);
        g10.putLong("chatId", this.D2.f19794id);
        u50 u50Var = new u50(g10);
        TLRPC.ChatFull chatFull = this.f33915t2;
        u50Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.f33915t2.participants.participants.size(); i10++) {
                hVar.k(null, this.f33915t2.participants.participants.get(i10).user_id);
            }
            u50Var.J = hVar;
        }
        u50Var.f41829y = new av0(this, 0);
        presentFragment(u50Var);
    }

    public final void J5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.J5():void");
    }

    public final void K3() {
        int i10;
        int i11;
        if (this.Z5 != null) {
            ValueAnimator valueAnimator = this.f33840i2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33840i2.cancel();
            }
            float l4 = Utilities.l(this.P1 / this.E1);
            if (l4 > 0.0f) {
                float f7 = (l4 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.i0.f16166m;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10) - org.telegram.messenger.i0.L(21.0f));
                this.a2 = org.telegram.messenger.i0.T1(0.42f, this.Z5[0], l4);
                this.Y1 = org.telegram.messenger.i0.T1(this.f33815e6, this.Z5[1], l4);
                this.Z1 = org.telegram.messenger.i0.T1(translationY, this.Z5[2], l4);
                this.f33789b2 = org.telegram.messenger.i0.T1(this.Z5[11], 0.0f, l4);
                this.X.setScaleX(this.a2);
                this.X.setScaleY(this.a2);
                this.X.setTranslationX(this.Y1);
                this.X.setTranslationY(this.Z1);
                org.telegram.ui.Components.ov0 ov0Var = this.S;
                if (ov0Var != null) {
                    ov0Var.setAlpha(l4);
                }
                this.f33809e0.setAlpha(1.0f);
                this.X.setAlpha(1.0f);
                lw0 lw0Var = this.f33920u0;
                if (lw0Var != null) {
                    lw0Var.invalidate();
                }
                rh.g0 g0Var = this.f33927v0;
                if (g0Var != null) {
                    g0Var.e = org.telegram.messenger.i0.T1(0.0f, this.Z5[4], f7);
                    this.f33927v0.f46938f = org.telegram.messenger.i0.T1(0.0f, this.Z5[5], l4);
                    rh.g0 g0Var2 = this.f33927v0;
                    g0Var2.h = true;
                    g0Var2.invalidate();
                }
                hy0 hy0Var = this.f33956y6;
                if (hy0Var != null) {
                    hy0Var.setAlpha((int) org.telegram.messenger.i0.T1(0.0f, this.Z5[6], l4));
                }
                float L = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.i0.L(42.0f)) - org.telegram.messenger.i0.L(42.0f);
                this.f33831h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + L);
                this.f33831h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + L);
                this.f33838i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                this.f33838i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + L);
                this.f33845j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                this.f33845j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                this.f33852k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                this.f33852k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                float T1 = org.telegram.messenger.i0.T1(1.0f, this.Z5[7], l4);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.i0.f16166m;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (org.telegram.messenger.i0.f16171p * 21.0f)))) + org.telegram.messenger.i0.L(1.3f);
                float N = org.telegram.messenger.i0.N(22.7f) + floor;
                this.f33804d2 = org.telegram.messenger.i0.T1(floor, this.Z5[8], l4);
                this.f33819f2 = org.telegram.messenger.i0.T1(N, this.Z5[9], l4);
                float T12 = org.telegram.messenger.i0.T1((this.f33815e6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f), this.Z5[12], l4);
                float T13 = org.telegram.messenger.i0.T1((this.f33815e6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f), this.Z5[13], l4);
                this.f33816f.setTranslationX(T12);
                this.f33816f.setTranslationY(this.f33804d2);
                this.f33897r.setTranslationX(this.f33883o5 + T13);
                this.f33897r.setTranslationY(this.f33819f2);
                this.f33797c2 = T12;
                this.f33811e2 = T13;
                this.f33816f.setScaleX(T1);
                this.f33816f.setScaleY(T1);
                q5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = org.telegram.messenger.i0.f16166m;
                }
                w5(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12);
                z4((int) this.Z5[10], l4, true);
                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                if (hg0Var != null) {
                    hg0Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, this.Z5[3], f7));
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
        if (this.f33845j0 != null && (imageView = this.f33852k0) != null) {
            if (this.K1 && (chat = this.D2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f33852k0.setVisibility(0);
                this.f33845j0.setTag(1);
                this.f33845j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f33852k0.setVisibility(8);
            this.f33845j0.setTag(null);
            this.f33845j0.setVisibility(8);
        }
    }

    public final float L3() {
        return Utilities.l((this.P1 - e4()) / k4());
    }

    public final void L4() {
        TLRPC.User Z1;
        if (this.f33803d1 != 0 && !c4() && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1))) != null && !(Z1 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f33803d1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.i0.Q1() && z10) {
                    org.telegram.messenger.at notificationCenter = getNotificationCenter();
                    int i10 = org.telegram.messenger.at.f14786t;
                    notificationCenter.n(this, i10);
                    getNotificationCenter().k(i10, new Object[0]);
                }
                int i11 = getArguments().getInt("nearby_distance", -1);
                if (i11 >= 0) {
                    bundle.putInt("nearby_distance", i11);
                }
                un unVar = new un(bundle);
                org.telegram.messenger.vi mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f18689y0;
                mediaDataController.n1();
                unVar.U9 = document;
                unVar.V9 = false;
                presentFragment(unVar, z10);
                if (org.telegram.messenger.i0.Q1() && !this.I0) {
                    finishFragment();
                }
            }
        }
    }

    public final void L5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        boolean z11;
        if ((this.f33920u0 != null || this.f33927v0 != null) && (lVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (lVar.getOccupyStatusBar()) {
                f7 = org.telegram.messenger.i0.f16166m;
            } else {
                f7 = 0.0f;
            }
            int L = org.telegram.messenger.i0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            lw0 lw0Var = this.f33920u0;
            boolean z12 = false;
            if (lw0Var != null) {
                float B = c3.i0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(right - lw0Var.f34073f0) <= 0.1f && Math.abs(menuPillLeft - lw0Var.f34074g0) <= 0.1f && Math.abs(B - lw0Var.f34075h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                lw0Var.f34073f0 = right;
                lw0Var.f34074g0 = menuPillLeft;
                if (z10) {
                    lw0Var.m0.e(true, menuPillLeft);
                }
                lw0Var.f34075h0 = B;
                if (z11) {
                    lw0Var.invalidate();
                }
            }
            rh.g0 g0Var = this.f33927v0;
            if (g0Var != null) {
                float B2 = c3.i0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
                int k42 = k4();
                if (Math.abs(right - g0Var.f46940r) > 0.1f || Math.abs(menuPillLeft - g0Var.f46941s) > 0.1f || Math.abs(B2 - g0Var.f46942w) > 0.1f) {
                    z12 = true;
                }
                g0Var.f46940r = right;
                g0Var.f46941s = menuPillLeft;
                if (z10) {
                    g0Var.D.e(true, menuPillLeft);
                }
                g0Var.f46942w = B2;
                g0Var.f46944y = k42 + B2;
                if (z12) {
                    g0Var.invalidate();
                }
            }
        }
    }

    public final void M3() {
        int i10;
        int i11 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        this.Z1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - org.telegram.messenger.i0.L(21.0f));
        this.a2 = 1.38f;
        float f7 = 0.0f;
        this.f33789b2 = 0.0f;
        d4();
        R4();
        z4(0, 1.0f, true);
        this.f33797c2 = (this.f33779a.getMeasuredWidth() / 2.0f) - (((this.f33816f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f33816f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f33779a.getMeasuredWidth() / 2.0f;
        int i12 = ((FrameLayout.LayoutParams) this.f33897r.getLayoutParams()).leftMargin;
        if (!this.p5) {
            i11 = this.f33897r.getPaddingLeft();
        }
        this.f33811e2 = measuredWidth - ((this.f33897r.getExactWidth() * 0.5f) + (i12 + i11));
        if (!this.p5) {
            f7 = this.f33897r.getPaddingLeft();
        }
        this.f33933v6 = f7;
        if (this.I1 != 2) {
            this.f33920u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.f33809e0.setAlpha(1.0f);
    }

    public final void M4() {
        TLRPC.ChatFull chatFull = this.f33915t2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f33915t2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new un(bundle));
            }
        }
    }

    public final void M5() {
        try {
            bo0 bo0Var = this.T;
            if (bo0Var != null && (bo0Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.T.getForeground()).setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f33957z0), 100));
            }
            float f7 = this.Q5;
            Drawable drawable = this.D;
            int[] iArr = this.R6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33957z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33957z0));
                int i10 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i10) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.N6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V6, this.f33957z0);
                int i11 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i11) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.O6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f33957z0);
                int i12 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i12) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.P6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.f33957z0);
                int i13 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i13) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.dq dqVar = this.Q6;
            if (dqVar != null) {
                dqVar.f25572y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.kk, this.f33957z0);
                if (this.f33779a != null) {
                    for (int i14 = 0; i14 < this.f33779a.getChildCount(); i14++) {
                        View childAt = this.f33779a.getChildAt(i14);
                        if (childAt != null) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void N4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f33922u2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                xw0 xw0Var = new xw0(3, 0);
                xw0Var.setResourceProvider(this.f33957z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().y1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f33922u2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                xw0Var.W0 = false;
                xw0Var.I0(new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message, false, false));
                presentFragment(xw0Var);
                return;
            }
            boolean z11 = org.telegram.messenger.v2.f18578a;
            org.telegram.messenger.w0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f33922u2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void N5() {
        boolean z10;
        TLRPC.UserFull userFull;
        if (this.X0 == null) {
            return;
        }
        if (this.C2 == null && (((userFull = this.f33922u2) != null && userFull.ttl_period > 0) || (this.f33915t2 != null && org.telegram.messenger.w3.y(13, this.D2) && this.f33915t2.ttl_period > 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.i0.Y3(this.X0, z10, 0.8f, true, this.f33862l5);
    }

    @Override
    public final boolean O(zx zxVar) {
        return false;
    }

    public final void O3() {
        s4.c1 c1Var;
        View view;
        int top;
        int i10;
        int i11;
        float a2;
        boolean z10;
        if (this.f33779a.getVisibility() == 0) {
            if (this.P) {
                this.N.setVisibleHeight(this.f33779a.getMeasuredHeight() - this.N.getTop());
            }
            if (this.f33779a.getChildCount() > 0 && !this.F1) {
                boolean z11 = false;
                int i12 = 0;
                while (true) {
                    c1Var = null;
                    if (i12 < this.f33779a.getChildCount()) {
                        if (RecyclerView.R(this.f33779a.getChildAt(i12)) == 0) {
                            view = this.f33779a.getChildAt(i12);
                            break;
                        }
                        i12++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    aw0 aw0Var = this.f33779a;
                    View F = aw0Var.F(view);
                    if (F != null) {
                        c1Var = aw0Var.T(F);
                    }
                    c1Var = (org.telegram.ui.Components.dk0) c1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (c1Var != null) {
                    i10 = c1Var.b();
                } else {
                    i10 = -1;
                }
                if (top >= 0 && i10 == 0) {
                    i11 = top;
                } else {
                    i11 = 0;
                }
                float f7 = 1.0f;
                if (view == null) {
                    a2 = 1.0f;
                } else {
                    a2 = w7.u.a((-top) / org.telegram.messenger.i0.L(12.0f), 0.0f, 1.0f);
                }
                if (this.L5 != a2) {
                    this.L5 = a2;
                    z5();
                }
                if (this.f33891q0 == null && this.actionBar.f20498n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i13 = this.J4;
                if (i13 != -1 && !z10) {
                    org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) this.f33779a.K(i13);
                    if (dk0Var != null && dk0Var.f47909a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.R5 != z10) {
                    this.R5 = z10;
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
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (!z10) {
                        f7 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(lVar, this.S5, f7));
                    this.N.K0.setOpen(z10);
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f33850j5, 0.0f));
                    }
                    if (this.f33920u0 != null || this.f33927v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new kv0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    R3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.O5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.O5.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                    this.O5.addListener(new mw0(this, 1));
                    this.O5.setDuration(150L);
                    this.O5.start();
                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14777r4, Boolean.TRUE);
                }
                float f10 = i11;
                if (this.P1 != f10 && !this.G1) {
                    this.P1 = f10;
                    this.f33796c1.invalidate();
                    if (this.I1 != 0) {
                        if (this.P1 > e4()) {
                            z11 = true;
                        }
                        this.L1 = z11;
                    }
                    y4(true);
                }
            }
        }
    }

    public final void O4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        rw0 rw0Var = new rw0(this, user.f19943id, this.f33810e1, tL_chatAdminRights, this.D2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        rw0Var.X0 = new sw0(this, i10, chatParticipant, z10, zArr);
        presentFragment(rw0Var);
    }

    public final void O5(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        float f7;
        TLRPC.ChatFull chatFull;
        float f10 = 0.2f;
        int i12 = (L3() > 0.2f ? 1 : (L3() == 0.2f ? 0 : -1));
        int i13 = 0;
        if (i12 > 0 && !this.V1 && (this.f33891q0 == null || this.N2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.X5 = z11;
        R3();
        org.telegram.ui.Components.fi0 fi0Var = this.f33905s;
        if (fi0Var != null && fi0Var.getVisibility() != 8) {
            org.telegram.ui.Components.fi0 fi0Var2 = this.f33905s;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = org.telegram.messenger.i0.f16166m;
            } else {
                i11 = 0;
            }
            fi0Var2.setTranslationY((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) + this.P1) + this.S1) - org.telegram.messenger.i0.L(29.5f));
            if (i12 > 0 && !this.V1 && !this.f33899r1 && (this.f33891q0 == null || this.N2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f33810e1 != 0) {
                if (org.telegram.messenger.w3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f33915t2) != null && chatFull.linked_chat_id != 0 && (this.C3 != -1 || this.D3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.F1) {
                if (this.f33905s.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.f33905s.setTag(null);
                    } else {
                        this.f33905s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f33934w;
                    if (animatorSet != null) {
                        this.f33934w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f33934w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f33934w.playTogether(ObjectAnimator.ofFloat(this.f33905s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f33905s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f33905s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f33934w.playTogether(ObjectAnimator.ofFloat(this.f33905s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f33905s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f33905s, View.ALPHA, 0.0f));
                        }
                        this.f33934w.setDuration(150L);
                        this.f33934w.addListener(new mw0(this, 3));
                        this.f33934w.start();
                    } else {
                        org.telegram.ui.Components.fi0 fi0Var3 = this.f33905s;
                        if (z12) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.2f;
                        }
                        fi0Var3.setScaleX(f7);
                        org.telegram.ui.Components.fi0 fi0Var4 = this.f33905s;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        fi0Var4.setScaleY(f10);
                        org.telegram.ui.Components.fi0 fi0Var5 = this.f33905s;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        fi0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        lw0 lw0Var = this.f33920u0;
        if (lw0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - org.telegram.messenger.i0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16166m;
            } else {
                i10 = 0;
            }
            lw0Var.f34076i0 = measuredWidth;
            lw0Var.f34078k0 = z12;
            lw0Var.f34077j0 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10;
            lw0Var.invalidate();
        }
        rh.g0 g0Var = this.f33927v0;
        if (g0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.i0.f16166m;
            }
            g0Var.setExpandCoords(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i13 + this.P1 + this.S1);
        }
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.f33824g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    public final void P3() {
        int i10;
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            if (!this.R5 && this.Q5 <= 0.0f) {
                i10 = 0;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            hx0Var.setPagesVisibleOverscanTop(i10);
        }
    }

    public final void P4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().v3(str.substring(1), this, 0, gVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (k2Var instanceof un) {
                    finishFragment();
                    ((un) k2Var).Z.Y0(null, str, false, false);
                }
            }
        } else {
            zx zxVar = new zx(null);
            zxVar.f44183n2 = str;
            presentFragment(zxVar);
        }
    }

    public final void P5() {
        org.telegram.ui.Components.wq0 wq0Var;
        org.telegram.ui.Components.vr0 vr0Var;
        org.telegram.ui.Components.p80 p80Var;
        int w02;
        int w03;
        int w04;
        int i10;
        int w05;
        int w06;
        int w07;
        this.f33837h6.clear();
        jy0 jy0Var = this.f33796c1;
        if (jy0Var != null) {
            jy0Var.a(this.f33830g6, true);
        }
        kw0 kw0Var = this.f33897r;
        if (kw0Var != null) {
            if (kw0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.t6.w0(((Integer) this.f33897r.getTag()).intValue(), this.f33957z0);
            } else {
                w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.f33957z0);
            }
            this.f33897r.setTextColor(i0.b.f(this.f33847j2, I3(w07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        hy0 hy0Var = this.f33956y6;
        float f7 = -0.1f;
        if (hy0Var != null) {
            hy0Var.a(i0.b.f(this.f33847j2, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.18f, -0.1f, this.f33788b1)), 603979775));
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = -1;
        if (lVar != null) {
            if (this.f33830g6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f33957z0);
            }
            lVar.D(i0.b.f(this.Q5, w05, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21314y8, this.f33957z0)), false);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            org.telegram.messenger.lp lpVar = this.f33830g6;
            if (lpVar != null) {
                w06 = 1090519039;
            } else if (lpVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20968f8, this.f33957z0);
            }
            lVar2.C(i0.b.f(this.Q5, w06, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z8, this.f33957z0)), false);
        }
        if (this.f33950y != null) {
            org.telegram.messenger.lp lpVar2 = this.f33830g6;
            if (lpVar2 != null) {
                int g10 = lpVar2.g();
                if (this.f33830g6.o(org.telegram.ui.ActionBar.t6.I.q())) {
                    i10 = this.f33830g6.k();
                } else {
                    i10 = this.f33830g6.i();
                }
                int f10 = i0.b.f(0.4f, g10, i10);
                if (!org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.t6.b(0.1f, f7, f10);
            } else {
                w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33957z0);
            }
            this.f33950y.setColorFilter(org.telegram.messenger.i0.S0(this.Q5, 1.0f, w04, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33957z0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            if (this.f33830g6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, this.f33957z0);
            }
            this.H.setColorFilter(org.telegram.messenger.i0.S0(this.Q5, 1.0f, w03, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f33957z0)), PorterDuff.Mode.MULTIPLY);
        }
        kl klVar = this.f33816f;
        if (klVar != null) {
            if (this.f33830g6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21051ji, this.f33957z0);
            }
            klVar.setTextColor(i0.b.f(this.f33847j2, i0.b.f(this.Q5, w02, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33957z0)), -1));
        }
        m4.n0 n0Var = this.Z0;
        if (n0Var != null && (p80Var = (org.telegram.ui.Components.p80) n0Var.e) != null) {
            p80Var.invalidate();
        }
        Drawable drawable = this.f33942x;
        if (drawable != null) {
            if (this.f33830g6 == null) {
                i11 = i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20937dd, this.f33957z0), -1);
            }
            drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.ch0 ch0Var = this.f33787b0;
        if (ch0Var != null) {
            ch0Var.setColor(this.f33830g6);
        }
        org.telegram.messenger.i0.d0(this.f33779a, new nv0(this, 3));
        hx0 hx0Var = this.N;
        if (hx0Var != null && (vr0Var = hx0Var.K0) != null) {
            vr0Var.updateColors();
        }
        hx0 hx0Var2 = this.N;
        if (hx0Var2 != null && (wq0Var = hx0Var2.f24498a0) != null) {
            wq0Var.m();
        }
        Q5();
        s5();
        lw0 lw0Var = this.f33920u0;
        if (lw0Var != null) {
            lw0Var.f(true, true);
        }
        rh.g0 g0Var = this.f33927v0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    public final void Q3() {
        float alpha;
        boolean z10;
        int i10 = this.I1;
        float f7 = 0.0f;
        boolean z11 = true;
        if (i10 == 1 && (!this.f33862l5 || this.F1)) {
            this.q6 = 0.0f;
        } else if (i10 == 2 && (!this.f33862l5 || this.F1)) {
            kw0 kw0Var = this.f33897r;
            if (kw0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = kw0Var.getAlpha();
            }
            this.q6 = alpha;
        } else if (this.f33803d1 == org.telegram.messenger.e20.i(this.currentAccount).f15524n) {
            this.q6 = (1.0f - this.f33876n5) * this.f33847j2;
        } else {
            this.q6 = this.f33847j2 * this.f33876n5;
        }
        if (this.f33803d1 == org.telegram.messenger.e20.i(this.currentAccount).f15524n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.p5) {
            this.f33883o5 = org.telegram.messenger.i0.L(28.0f) * this.q6;
            kw0 kw0Var2 = this.f33897r;
            if (kw0Var2 != null) {
                kw0Var2.setTranslationX(m4(this.f33926u6, this.f33941w6));
                this.Y.invalidate();
            }
        }
        if (z10) {
            if (this.p5) {
                f7 = this.f33847j2;
            }
        } else if (this.f33896q5) {
            f7 = this.q6;
        }
        hy0 hy0Var = this.f33956y6;
        if (hy0Var != null) {
            hy0Var.e = 1.0f - f7;
            hy0Var.invalidateSelf();
        }
        if (f7 <= 0.5f) {
            z11 = false;
        }
        this.f33919t6 = z11;
        H5();
    }

    public final boolean Q4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.Q4(float, float, int, android.view.View):boolean");
    }

    public final void Q5() {
        if (this.f33905s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21089li, this.f33957z0);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21108mi, this.f33957z0);
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21071ki, this.f33957z0);
                if (this.f33830g6 != null && org.telegram.ui.ActionBar.t6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.t6.b(0.05f, -0.04f, this.f33830g6.c(false));
                    org.telegram.messenger.lp lpVar = this.f33830g6;
                    if (lpVar != null) {
                        int d = lpVar.d(org.telegram.ui.ActionBar.t6.I.q());
                        w03 = org.telegram.ui.ActionBar.t6.D(org.telegram.ui.ActionBar.t6.I.q(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, this.f33957z0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.fi0 fi0Var = this.f33884o6;
                org.telegram.ui.Components.fi0 fi0Var2 = this.f33905s;
                int[] iArr = this.f33890p6;
                if (fi0Var != fi0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f33884o6 = fi0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231198).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(mutate, org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), w02, w03), 0, 0);
                    int L = org.telegram.messenger.i0.L(56.0f);
                    int L2 = org.telegram.messenger.i0.L(56.0f);
                    eqVar.e = L;
                    eqVar.f25904f = L2;
                    this.f33905s.setBackground(eqVar);
                    this.f33905s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void R() {
        org.telegram.ui.Components.st0 st0Var;
        hx0 hx0Var = this.N;
        if (hx0Var != null && (st0Var = this.Q) != null) {
            hx0Var.setNewMediaCounts(st0Var.f30442c);
        }
        if (this.d != null) {
            D5(false, false);
        }
        W();
        if (this.f33922u2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void R3() {
        boolean z10;
        org.telegram.ui.Components.ov0 ov0Var = this.S;
        if (ov0Var != null) {
            if (!this.R5 && this.X5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ov0Var.setVisibility(z10);
        }
    }

    public final void R4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f33880o2 && (valueAnimator = this.f33840i2) != null && valueAnimator.isRunning()) {
            this.f33804d2 = this.f33785a6;
            this.f33819f2 = this.f33793b6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        S4(L3(), currentActionBarHeight + i10);
    }

    public final void S3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.S3(boolean):void");
    }

    public final void S4(float f7, float f10) {
        float T1;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.P1 - j4()) / ((this.f33779a.getMeasuredWidth() - f10) - k4())));
        if (this.P1 < j4() && max < 0.33f) {
            T1 = c3.i0.x(f7, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.i0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.i0.N(8.0f) + (org.telegram.messenger.i0.L(42.0f) * T1)) * f7) + ((float) Math.floor(translationY + (org.telegram.messenger.a30.b(f7, 1.0f, currentActionBarHeight, i10) - (org.telegram.messenger.i0.f16171p * 21.0f))));
        this.f33804d2 = (org.telegram.messenger.i0.L(7.0f) * f7) + org.telegram.messenger.i0.L(1.3f) + N;
        this.f33819f2 = (((float) Math.floor(org.telegram.messenger.i0.f16171p * 11.0f)) * f7) + N + org.telegram.messenger.i0.L(24.0f);
    }

    public final void T3(Context context) {
        int i10;
        this.Z0 = new m4.n0(context, this.S0.getPopupLayout().getSwipeBack(), new zv0(this), false, 0, this.f33957z0);
        if (this.f33832h1 > 0 || this.f33803d1 > 0) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, this.f33957z0);
            m4.n0 n0Var = this.Z0;
            org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) n0Var.e;
            if (p80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.N2(org.telegram.messenger.dd.L0(2131753847, null), w02, new org.telegram.ui.Components.tf(n0Var, 11)));
                p80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f33922u2;
        if (userFull == null && this.f33915t2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f33915t2.ttl_period;
        }
        org.telegram.ui.Components.g11 a2 = org.telegram.ui.Components.g11.a(i10);
        this.f33906s0 = a2;
        this.Y0 = this.S0.h(0, a2, org.telegram.messenger.dd.L0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z0.f12864a);
        this.S0.a(-1);
        o5();
    }

    public final void T4() {
        aw0 aw0Var = this.f33779a;
        if (aw0Var != null && this.f33794c != null && aw0Var.getChildCount() > 0 && !this.f33869m6) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f33779a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f33779a.getChildAt(i12));
                View childAt = this.f33779a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f33858k6 = i11;
                int top = view.getTop();
                this.f33863l6 = top;
                if (this.f33858k6 == 0 && !this.f33873n2 && top > j4()) {
                    this.f33863l6 = j4();
                }
                this.f33794c.h1(i11, view.getTop() - this.f33779a.getPaddingTop());
            }
        }
    }

    public final void U3() {
        if (this.fragmentView != null && this.f33877n6 && this.f33945x2 != null && getParentActivity() != null) {
            ny0 ny0Var = this.f33963z6;
            if (ny0Var != null) {
                ny0Var.b(this.f33945x2);
                this.f33963z6.invalidate();
                return;
            }
            ny0 ny0Var2 = new ny0(this, this.f33945x2);
            this.f33963z6 = ny0Var2;
            ((FrameLayout) this.fragmentView).addView(ny0Var2, w7.b6.e(-1, -1, 55));
        }
    }

    public final void U4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (z10) {
                ci.p pVar = new ci.p(getParentActivity(), 2, 0.6f);
                pVar.f48056a = this.J4;
                pVar.f4253p = -this.f33779a.getPaddingTop();
                this.f33794c.w0(pVar);
                return;
            }
            this.f33794c.h1(i10, -this.f33779a.getPaddingTop());
        }
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 4));
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            org.telegram.messenger.i0.E2(i5Var);
        }
        vw0 vw0Var = new vw0(this, context, this.f33957z0);
        this.simpleActionBar = vw0Var;
        vw0Var.setTitlesAlpha(0.0f);
        if (!this.f33862l5 && !this.I0 && this.I1 != 0 && this.L1 && !this.M1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new bf(3, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(2131232484);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.dd.L0(2131746515, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 23));
        if (!this.I0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new org.telegram.ui.Components.b0(5, this, backButton));
        }
    }

    @Override
    public final void W() {
        int i10;
        String str;
        int size;
        int i11;
        hx0 hx0Var = this.N;
        if (hx0Var != null && this.f33897r != null) {
            int closestTab = hx0Var.getClosestTab();
            int[] iArr = this.Q.f30442c;
            int i12 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i13 = iArr[0];
                    if (i13 <= 0) {
                        f5(org.telegram.messenger.dd.L0(2131745427, null));
                    } else {
                        f5(org.telegram.messenger.dd.G(i13, "Media", new Object[0]));
                    }
                } else if (this.N.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.N.getPhotosVideosTypeFilter() != 2 && (i11 = iArr[6]) > 0) {
                        f5(org.telegram.messenger.dd.G(i11, "Photos", new Object[0]) + ", " + org.telegram.messenger.dd.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    f5(org.telegram.messenger.dd.G(iArr[7], "Videos", new Object[0]));
                } else {
                    f5(org.telegram.messenger.dd.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i14 = iArr[1];
                if (i14 <= 0) {
                    f5(org.telegram.messenger.dd.L0(2131750827, null));
                } else {
                    f5(org.telegram.messenger.dd.G(i14, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i15 = iArr[2];
                if (i15 <= 0) {
                    f5(org.telegram.messenger.dd.L0(2131743549, null));
                } else {
                    f5(org.telegram.messenger.dd.G(i15, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i16 = iArr[3];
                if (i16 <= 0) {
                    f5(org.telegram.messenger.dd.L0(2131745429, null));
                } else {
                    f5(org.telegram.messenger.dd.G(i16, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i17 = iArr[4];
                if (i17 <= 0) {
                    f5(org.telegram.messenger.dd.L0(2131748334, null));
                } else {
                    f5(org.telegram.messenger.dd.G(i17, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i18 = iArr[5];
                if (i18 <= 0) {
                    f5(org.telegram.messenger.dd.L0(2131754879, null));
                } else {
                    f5(org.telegram.messenger.dd.G(i18, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                f5(org.telegram.messenger.dd.G(this.f33922u2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                f5(this.f33897r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.au0.G0(closestTab)) {
                if (closestTab == 13) {
                    f5(this.N.e0(true));
                } else if (closestTab == 9) {
                    f5(org.telegram.messenger.dd.G(this.N.l0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.xo K0 = org.telegram.messenger.wp.r1(this.currentAccount).K0(a());
                    if (this.f33893q2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (K0 == null) {
                        size = 0;
                    } else {
                        size = K0.f19460b.size() + K0.f19461c;
                    }
                    f5(org.telegram.messenger.dd.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.hw F1 = getMessagesController().F1();
                    long a2 = a();
                    ArrayList arrayList = F1.f16121j;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList.size()) {
                            org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) arrayList.get(i19);
                            if (gwVar.f15965a == a2) {
                                i10 = gwVar.e;
                                break;
                            }
                            i19++;
                        } else {
                            i10 = 0;
                            break;
                        }
                    }
                    f5(org.telegram.messenger.dd.G(Math.max(1, i10), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.wq0 wq0Var = this.N.f24498a0;
                    if (wq0Var != null) {
                        i12 = wq0Var.getGiftsCount();
                    }
                    f5(org.telegram.messenger.dd.H(',', "ProfileGiftsCount", i12));
                } else if (closestTab == 15) {
                    int i20 = iArr[8];
                    if (i20 <= 0) {
                        f5(org.telegram.messenger.dd.L0(2131745421, null));
                    } else {
                        f5(org.telegram.messenger.dd.H(',', "ProfilePollsCount", i20));
                    }
                }
            } else if (this.f33893q2) {
                f5(this.N.e0(false));
            } else if (this.N.l0(closestTab) > 0) {
                f5(org.telegram.messenger.dd.G(this.N.l0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                f5(org.telegram.messenger.dd.L0(2131746640, null));
            }
        }
    }

    public final void W4() {
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            if (this.f33899r1) {
                hg0Var.E = 6;
            } else if (this.f33886p1) {
                hg0Var.E = 5;
            } else if (this.f33893q2) {
                hg0Var.E = 2;
            } else if (this.f33803d1 != 0) {
                hg0Var.E = 0;
            } else if (this.f33810e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f33810e1));
                if (org.telegram.messenger.w3.T(L0)) {
                    if (org.telegram.messenger.w3.n0(L0)) {
                        this.Z.E = 3;
                        return;
                    } else if (org.telegram.messenger.w3.c0(L0)) {
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

    public final void X3(float f7) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f33851j6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33851j6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f33943x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new kv0(this, 0));
        this.f33851j6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f33851j6;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.f33851j6.addListener(new mw0(this, 6));
        }
        this.f33851j6.start();
    }

    public final void X4(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.X4(float):void");
    }

    @Override
    public final boolean Y() {
        return this.f33958z1;
    }

    public final void Y3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        H.W(this.f33779a.U0(view, false));
        H.f33047w = false;
        if (this.f33922u2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232102, org.telegram.messenger.dd.L0(2131751767, null), new na0(this, 4), z10);
        H.c(2131232115, org.telegram.messenger.dd.L0(2131751336, null), new na0(this, 5), false);
        H.c(2131232107, org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.Components.qq(this, i10, 18), true);
        H.Z();
    }

    public final boolean Z3(final int i10, View view) {
        TLRPC.User f7;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f33899r1 && (f7 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f33922u2;
            if (userFull == null) {
                userFull = getMessagesController().a2(f7.f19943id);
            }
            if (userFull != null) {
                String L0 = org.telegram.messenger.dd.L0(2131751767, null);
                if (i10 != this.J3 && i10 != this.I3 && i10 != this.V2) {
                    if (i10 == this.N3) {
                        str = ag.h2.k0(this.currentAccount, f7, userFull.business_work_hours);
                        L0 = org.telegram.messenger.dd.L0(2131746680, null);
                    } else if (i10 == this.O3) {
                        str = userFull.business_location.address;
                        L0 = org.telegram.messenger.dd.L0(2131746675, null);
                    } else if (i10 == this.K3) {
                        str = org.telegram.messenger.i20.n(f7);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        L0 = org.telegram.messenger.dd.L0(2131746693, null);
                    } else if (i10 == this.F3) {
                        str = f7.phone;
                    } else if (i10 == this.T2) {
                        str = UserInfoActivity.e0(this.f33922u2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
                H.W(this.f33779a.U0(view, false));
                H.f33047w = false;
                H.f33026i = 3;
                if (i10 == this.O3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(2131232419, org.telegram.messenger.dd.L0(2131746671, null), new na0(this, 7), false);
                    }
                    H.c(2131232212, org.telegram.messenger.dd.L0(2131746673, null), new na0(this, 9), false);
                }
                if (str != null) {
                    H.c(2131232102, L0, new kg0(str, 29), false);
                }
                if (i10 == this.N3) {
                    H.c(2131232115, org.telegram.messenger.dd.L0(2131746679, null), new na0(this, 10), false);
                    H.c(2131232107, org.telegram.messenger.dd.L0(2131746678, null), new Runnable(this) {
                        public final ProfileActivity f38197b;

                        {
                            this.f38197b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r4;
                            final int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f38197b;
                            switch (i11) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.dd.L0(2131752762, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ov0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ov0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.dd.L0(2131752694, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.dd.L0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ov0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ov0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.O3) {
                    H.c(2131232115, org.telegram.messenger.dd.L0(2131746674, null), new na0(this, 11), false);
                    H.c(2131232107, org.telegram.messenger.dd.L0(2131746672, null), new Runnable(this) {
                        public final ProfileActivity f38197b;

                        {
                            this.f38197b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r4;
                            final int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f38197b;
                            switch (i11) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.dd.L0(2131752762, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ov0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ov0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.dd.L0(2131752694, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.dd.L0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ov0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ov0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.K3) {
                    H.c(2131232115, org.telegram.messenger.dd.L0(2131746635, null), new na0(this, 12), false);
                } else if (i10 != this.J3 && i10 != this.I3 && i10 != this.V2) {
                    if (i10 == this.F3) {
                        H.c(2131231893, org.telegram.messenger.dd.L0(2131746661, null), new na0(this, 14), false);
                    } else if (i10 == this.T2) {
                        H.c(2131232115, org.telegram.messenger.dd.L0(2131746738, null), new Runnable(this) {
                            public final ProfileActivity f37573b;

                            {
                                this.f37573b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f37573b;
                                switch (i11) {
                                    case 0:
                                        RectF rectF = ProfileActivity.S6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131751239, null), org.telegram.messenger.dd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(27, profileActivity, userFull2), new na0(profileActivity, 15), false, false, profileActivity.f33957z0).f11588b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L02 = org.telegram.messenger.dd.L0(2131753717, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.R = L02;
                                        x1Var.T = org.telegram.messenger.dd.L0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ov0(profileActivity2, 2));
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ov0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L03 = org.telegram.messenger.dd.L0(2131746697, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                        x1Var2.R = L03;
                                        x1Var2.T = org.telegram.messenger.dd.L0(2131746698, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ov0(profileActivity2, 2));
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ov0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(2131232107, org.telegram.messenger.dd.L0(2131746336, null), new Runnable(this) {
                            public final ProfileActivity f37573b;

                            {
                                this.f37573b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f37573b;
                                switch (i11) {
                                    case 0:
                                        RectF rectF = ProfileActivity.S6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131751239, null), org.telegram.messenger.dd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(27, profileActivity, userFull2), new na0(profileActivity, 15), false, false, profileActivity.f33957z0).f11588b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L02 = org.telegram.messenger.dd.L0(2131753717, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.R = L02;
                                        x1Var.T = org.telegram.messenger.dd.L0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ov0(profileActivity2, 2));
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ov0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L03 = org.telegram.messenger.dd.L0(2131746697, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                        x1Var2.R = L03;
                                        x1Var2.T = org.telegram.messenger.dd.L0(2131746698, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ov0(profileActivity2, 2));
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ov0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.P2) {
                        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(userFull.personal_channel_id));
                        if (L02 != null && org.telegram.messenger.w3.K(L02, false) != null) {
                            H.c(2131232102, org.telegram.messenger.dd.L0(2131746696, null), new hr0(11, this, L02), false);
                        }
                        H.c(2131232115, org.telegram.messenger.dd.L0(2131746699, null), new na0(this, 8), false);
                        H.c(2131232107, org.telegram.messenger.dd.L0(2131746336, null), new Runnable(this) {
                            public final ProfileActivity f37573b;

                            {
                                this.f37573b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f37573b;
                                switch (i11) {
                                    case 0:
                                        RectF rectF = ProfileActivity.S6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131751239, null), org.telegram.messenger.dd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(27, profileActivity, userFull2), new na0(profileActivity, 15), false, false, profileActivity.f33957z0).f11588b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L022 = org.telegram.messenger.dd.L0(2131753717, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.R = L022;
                                        x1Var.T = org.telegram.messenger.dd.L0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ov0(profileActivity2, 2));
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ov0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.S6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L03 = org.telegram.messenger.dd.L0(2131746697, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                        x1Var2.R = L03;
                                        x1Var2.T = org.telegram.messenger.dd.L0(2131746698, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.S6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ov0(profileActivity2, 2));
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ov0(profileActivity2, 0));
                                                        profileActivity2.D5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(2131232115, org.telegram.messenger.dd.L0(2131746692, null), new na0(this, 13), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Z4(float f7) {
        this.J5 = f7;
        org.telegram.ui.Components.lg0 lg0Var = this.I5;
        if (lg0Var != null) {
            lg0Var.b(f7);
        }
        A5();
    }

    public final long a() {
        long j10 = this.f33832h1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f33803d1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f33810e1;
    }

    public final boolean a4() {
        s4.c1 c1Var;
        View view;
        if ((this.I0 || (!org.telegram.messenger.i0.Q1() && !this.f33865m2)) && this.f33809e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1()) {
            this.F0 = true;
            this.f33873n2 = true;
            int i10 = 0;
            while (true) {
                c1Var = null;
                if (i10 < this.f33779a.getChildCount()) {
                    if (RecyclerView.R(this.f33779a.getChildAt(i10)) == 0) {
                        view = this.f33779a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                aw0 aw0Var = this.f33779a;
                View F = aw0Var.F(view);
                if (F != null) {
                    c1Var = aw0Var.T(F);
                }
                if (c1Var != null) {
                    Integer num = (Integer) this.X1.get(Integer.valueOf(c1Var.b()));
                    if (num != null) {
                        this.O1 = true;
                        this.f33779a.w0(0, -(((this.f33779a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.gr.h);
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
        this.f33915t2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.l1 == 0) {
                this.l1 = -j10;
                getMediaDataController().e0(this.l1, this.classGuid, this.f33818f1);
            }
        }
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            hx0Var.setChatInfo(this.f33915t2);
        }
        jw0 jw0Var = this.f33871n0;
        if (jw0Var != null && !this.f33886p1) {
            jw0Var.setChatInfo(this.f33915t2);
        }
        lw0 lw0Var = this.f33920u0;
        if (lw0Var != null && (chatFull3 = this.f33915t2) != null) {
            lw0Var.setStories(chatFull3.stories);
        }
        rh.g0 g0Var = this.f33927v0;
        if (g0Var != null) {
            g0Var.a();
        }
        iw0 iw0Var = this.f33809e0;
        if (iw0Var != null) {
            iw0Var.setHasStories(x4());
        }
        b4();
        if (this.f33810e1 != 0) {
            boolean z11 = org.telegram.messenger.v2.f18578a;
            if (!getMessagesController().f19156i7 && (chatFull2 = this.f33915t2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.S0.Q(38, z10);
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            if (hg0Var != null) {
                hg0Var.o(3, z10);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21031ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21005h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21051ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20937dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20968f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.D2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f33915t2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f33915t2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f33915t2.participants.participants.get(i10);
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
                vh.p2 p2Var = this.A6;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.C6 = null;
                    this.A6 = new vh.p2(getParentActivity(), 3);
                    this.B6 = org.telegram.ui.ActionBar.t6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.t6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.A6.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
                    vh.p2 p2Var2 = this.A6;
                    int r12 = org.telegram.ui.ActionBar.t6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    p2Var2.A0 = true;
                    p2Var2.I0 = System.currentTimeMillis();
                    p2Var2.B0 = new Path();
                    p2Var2.C0 = org.telegram.messenger.i0.N(0.66f) / 2.0f;
                    p2Var2.D0 = new Paint(1);
                    p2Var2.E0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, r12), org.telegram.ui.ActionBar.t6.r1(1.0f, r12), org.telegram.ui.ActionBar.t6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    p2Var2.H0 = linearGradient;
                    p2Var2.E0.setShader(linearGradient);
                    p2Var2.F0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, r12), org.telegram.ui.ActionBar.t6.r1(0.5f, r12), org.telegram.ui.ActionBar.t6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    p2Var2.G0 = new Matrix();
                    p2Var2.D0.setShader(p2Var2.F0);
                    p2Var2.E0.setStyle(Paint.Style.STROKE);
                    p2Var2.E0.setStrokeJoin(Paint.Join.ROUND);
                    p2Var2.E0.setStrokeCap(Paint.Cap.ROUND);
                    p2Var2.E0.setStrokeWidth(org.telegram.messenger.i0.N(0.66f));
                    this.Y.addView(this.A6, w7.b6.c(24.0f, -1));
                    this.A6.t(9.33f);
                    vh.p2 p2Var3 = this.A6;
                    Typeface o10 = org.telegram.messenger.i0.o();
                    p2Var3.H.x(o10);
                    p2Var3.J.setTypeface(o10);
                    this.A6.s(tL_emojiStatusCollectible.title);
                    vh.p2 p2Var4 = this.A6;
                    p2Var4.d = -1L;
                    p2Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    vh.p2 p2Var5 = this.A6;
                    p2Var5.getClass();
                    p2Var5.D = org.telegram.messenger.i0.N(4.0f);
                    p2Var5.E = org.telegram.messenger.i0.N(2.66f);
                    this.A6.r();
                    this.A6.q(16.0f);
                    this.A6.u();
                    this.A6.setOnClickListener(new rv0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.P1 < org.telegram.messenger.i0.L(82.0f)) {
                        this.C6 = Boolean.FALSE;
                        this.A6.setAlpha(0.0f);
                    }
                    q5();
                    vh.p2 p2Var6 = this.A6;
                    Objects.requireNonNull(p2Var6);
                    org.telegram.messenger.i0.h3(new vv0(p2Var6, 0), 6000L);
                }
            }
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (this.I1 != 0 && (z4Var = this.parentLayout) != null && z4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof un)) {
            finishFragment();
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.N.H0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.f33830g6 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.l");
    }

    @Override
    public final android.view.View createView(android.content.Context r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final void d4() {
        if (this.f33779a == null) {
            return;
        }
        float x10 = org.telegram.ui.Cells.f1.x(((FrameLayout.LayoutParams) this.X.getLayoutParams()).width, this.a2, 0.5f, this.f33779a.getMeasuredWidth() / 2.0f);
        this.Y1 = x10;
        if (this.F1) {
            this.Y1 = org.telegram.messenger.i0.T1(this.f33815e6, x10, this.R1);
        }
        this.X.setTranslationX(this.Y1);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        wx0 wx0Var;
        boolean z10;
        org.telegram.ui.ActionBar.z4 z4Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User Z1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        aw0 aw0Var;
        aw0 aw0Var2;
        org.telegram.ui.Components.dk0 dk0Var;
        if (i10 != org.telegram.messenger.at.B5 && i10 != org.telegram.messenger.at.f14764p3) {
            boolean z12 = true;
            int i12 = 0;
            r8 = false;
            boolean z13 = false;
            if (i10 == org.telegram.messenger.at.f14772r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i13 = org.telegram.messenger.wp.D8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f33803d1 != 0) {
                    if (objArr3 != null) {
                        I5(true);
                    }
                    if ((intValue & 1024) != 0 && (aw0Var2 = this.f33779a) != null && (dk0Var = (org.telegram.ui.Components.dk0) aw0Var2.L(this.F3, false)) != null) {
                        this.d.t(dk0Var, this.F3);
                    }
                } else if (this.f33810e1 != 0) {
                    int i14 = intValue & 8192;
                    if (i14 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i14 != 0) {
                            D5(true, false);
                        } else {
                            G5(true);
                        }
                        I5(true);
                    }
                    if (objArr3 != null && (aw0Var = this.f33779a) != null) {
                        int childCount = aw0Var.getChildCount();
                        for (int i15 = 0; i15 < childCount; i15++) {
                            View childAt = this.f33779a.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == org.telegram.messenger.at.f14711g1) {
                Long l4 = (Long) objArr[0];
                if (this.f33915t2 != null && (chat = this.D2) != null && chat.f19794id == l4.longValue()) {
                    this.f33915t2.online_count = ((Integer) objArr[1]).intValue();
                    G5(true);
                    I5(false);
                }
            } else if (i10 != org.telegram.messenger.at.O && i10 != org.telegram.messenger.at.f14681b1) {
                if (i10 == org.telegram.messenger.at.f14675a0) {
                    if (this.f33839i1) {
                        org.telegram.messenger.i0.g3(new hr0(9, this, objArr));
                    }
                } else if (i10 == org.telegram.messenger.at.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.C2;
                    if (encryptedChat2 != null && encryptedChat.f19802id == encryptedChat2.f19802id) {
                        this.C2 = encryptedChat;
                        D5(false, false);
                        org.telegram.messenger.o6 o6Var = this.W1;
                        if (o6Var != null) {
                            o6Var.g();
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.f14710g0) {
                    boolean z14 = this.f33846j1;
                    if (getMessagesController().G0.indexOfKey(this.f33803d1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f33846j1 = z11;
                    if (z14 != z11) {
                        S3(true);
                        D5(false, false);
                    }
                } else if (i10 == org.telegram.messenger.at.f14809w2) {
                    Long l10 = (Long) objArr[0];
                    if (this.D2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.D2;
                        if (longValue == chat2.f19794id && org.telegram.messenger.w3.w(14, chat2)) {
                            TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(this.currentAccount).M0(l10.longValue());
                            if (M0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f33915t2;
                                if (chatFull4 != null) {
                                    M0.participants = chatFull4.participants;
                                }
                                this.f33915t2 = M0;
                            }
                            hx0 hx0Var = this.N;
                            if (hx0Var != null) {
                                hx0Var.setChatInfo(this.f33915t2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f33915t2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f33879o1) || (inputGroupCall != null && this.f33879o1))) {
                                S3(false);
                            }
                            lw0 lw0Var = this.f33920u0;
                            if (lw0Var != null && (chatFull3 = this.f33915t2) != null) {
                                lw0Var.setStories(chatFull3.stories);
                            }
                            rh.g0 g0Var = this.f33927v0;
                            if (g0Var != null) {
                                g0Var.a();
                            }
                            iw0 iw0Var = this.f33809e0;
                            if (iw0Var != null) {
                                iw0Var.setHasStories(x4());
                            }
                            if (l10.longValue() != 0) {
                                boolean z15 = org.telegram.messenger.v2.f18578a;
                                z12 = (getMessagesController().f19156i7 || (chatFull2 = this.f33915t2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.S0.Q(38, z12);
                                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                                if (hg0Var != null) {
                                    hg0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f33803d1 != 0 && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1))) != null && chatFull6.f19795id == Z1.linked_community_id) {
                        D5(true, false);
                    }
                    TLRPC.Chat chat3 = this.D2;
                    if (chat3 != null && chatFull6.f19795id == chat3.linked_community_id) {
                        D5(true, false);
                    }
                    if (chatFull6.f19795id == this.f33810e1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f33915t2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f33915t2 = chatFull6;
                        if (this.l1 == 0) {
                            long j10 = chatFull6.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.l1 = -j10;
                                getMediaDataController().d0(0, this.classGuid, this.l1, this.f33818f1, true);
                            }
                        }
                        b4();
                        jw0 jw0Var = this.f33871n0;
                        if (jw0Var != null && !this.f33886p1) {
                            jw0Var.setChatInfo(this.f33915t2);
                        }
                        D5(true, false);
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f33810e1));
                        if (L0 != null) {
                            this.D2 = L0;
                            S3(true);
                        }
                        org.telegram.messenger.o6 o6Var2 = this.W1;
                        if (o6Var2 != null) {
                            o6Var2.g();
                        }
                        if (this.D2.megagroup && (objArr2 != null || !booleanValue)) {
                            h4(true);
                        }
                        o5();
                        N5();
                        lw0 lw0Var2 = this.f33920u0;
                        if (lw0Var2 != null && (chatFull = this.f33915t2) != null) {
                            lw0Var2.setStories(chatFull.stories);
                        }
                        rh.g0 g0Var2 = this.f33927v0;
                        if (g0Var2 != null) {
                            g0Var2.a();
                        }
                        iw0 iw0Var2 = this.f33809e0;
                        if (iw0Var2 != null) {
                            iw0Var2.setHasStories(x4());
                        }
                        hx0 hx0Var2 = this.N;
                        if (hx0Var2 != null) {
                            hx0Var2.setChatInfo(this.f33915t2);
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.f14786t) {
                    removeSelfFromStack(true);
                } else if (i10 == org.telegram.messenger.at.v) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (z4Var = this.parentLayout) != null && z4Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f33803d1) {
                        this.E2 = botInfo;
                        D5(false, false);
                    }
                } else if (i10 == org.telegram.messenger.at.E0) {
                    if (((Long) objArr[0]).longValue() == this.f33803d1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f33922u2 = userFull;
                        org.telegram.ui.Components.ov0 ov0Var = this.S;
                        if (ov0Var != null) {
                            ov0Var.set(userFull.stars_rating);
                        }
                        lw0 lw0Var3 = this.f33920u0;
                        if (lw0Var3 != null) {
                            lw0Var3.setStories(this.f33922u2.stories);
                        }
                        rh.g0 g0Var3 = this.f33927v0;
                        if (g0Var3 != null) {
                            g0Var3.a();
                        }
                        iw0 iw0Var3 = this.f33809e0;
                        if (iw0Var3 != null) {
                            iw0Var3.setHasStories(x4());
                        }
                        hx0 hx0Var3 = this.N;
                        if (hx0Var3 != null) {
                            hx0Var3.setUserInfo(this.f33922u2);
                        }
                        if (this.f33891q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f33922u2.about, this.f33953y2)) {
                                this.d.g(this.V2);
                            }
                            if (this.f33899r1) {
                                D5(false, false);
                            }
                        } else {
                            if (!this.F1 && !this.K0) {
                                S3(true);
                            } else {
                                this.H1 = true;
                            }
                            D5(false, false);
                            hx0 hx0Var4 = this.N;
                            if (hx0Var4 != null) {
                                hx0Var4.setCommonGroupsCount(this.f33922u2.common_chats_count);
                                W();
                                org.telegram.ui.Components.st0 st0Var = this.Q;
                                if (st0Var == null || st0Var.D) {
                                    resumeDelayedFragmentAnimation();
                                    y4(true);
                                }
                            }
                        }
                        o5();
                        N5();
                        if (this.f33929v2 == null && !v4()) {
                            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(this.currentAccount);
                            this.f33929v2 = i6Var;
                            na0 na0Var = new na0(this, 17);
                            if (i6Var.f22040c) {
                                na0Var.run();
                            } else {
                                i6Var.h.add(na0Var);
                            }
                            this.f33929v2.d(this.f33922u2);
                        }
                        if (!v4()) {
                            ky0 ky0Var = this.f33945x2;
                            ky0 c10 = ky0.c(this.currentAccount, this.f33922u2, ky0Var);
                            this.f33945x2 = c10;
                            if (c10 != ky0Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f33937w2 = z10;
                            if (c10 != null) {
                                na0 na0Var2 = new na0(this, 18);
                                if (c10.f39027b) {
                                    na0Var2.run();
                                } else {
                                    c10.h.add(na0Var2);
                                }
                            }
                        }
                        if (this.S0 != null) {
                            if (s4()) {
                                this.S0.S(44);
                            } else {
                                this.S0.t(44);
                            }
                            TLRPC.UserFull userFull2 = this.f33922u2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.S0.Q(46, z13);
                            this.S0.Q(47, !z13);
                        }
                    }
                } else if (i10 != org.telegram.messenger.at.f14734k0) {
                    if (i10 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i16);
                                if (this.C2 != null) {
                                    TLRPC.MessageAction messageAction = kjVar.f16690k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (wx0Var = this.d) != null) {
                                        wx0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i10 == org.telegram.messenger.at.f14726i4) {
                        aw0 aw0Var3 = this.f33779a;
                        if (aw0Var3 != null) {
                            aw0Var3.g1();
                        }
                    } else if (i10 == org.telegram.messenger.at.f14818x4) {
                        D5(false, false);
                    } else if (i10 == org.telegram.messenger.at.f14781s1) {
                        int i17 = this.f33790b3;
                        int i18 = this.Z2;
                        int i19 = this.X2;
                        J5();
                        wx0 wx0Var2 = this.d;
                        if (wx0Var2 != null) {
                            if (i17 != this.f33790b3 || i18 != this.Z2 || i19 != this.X2) {
                                wx0Var2.f();
                            }
                        }
                    } else if (i10 == org.telegram.messenger.at.f14771q5) {
                        if (this.f33886p1) {
                            I5(false);
                        }
                    } else if (i10 == org.telegram.messenger.at.D1) {
                        gy0 gy0Var = this.e;
                        if (gy0Var != null) {
                            gy0Var.f37586c = gy0.H(this);
                            this.e.f37591w.clear();
                            this.e.J();
                            gy0 gy0Var2 = this.e;
                            gy0Var2.I(gy0Var2.D);
                        }
                    } else if (i10 == org.telegram.messenger.at.f14686c0) {
                        I5(false);
                    } else if (i10 != org.telegram.messenger.at.f14805v5 && i10 != org.telegram.messenger.at.F5) {
                        if (i10 == org.telegram.messenger.at.f14725i3) {
                            org.telegram.ui.ActionBar.p5 p5Var = this.S0;
                            if (p5Var != null) {
                                TL_account.RequirementToContact H2 = getMessagesController().H2(this.f33803d1);
                                if (H2 != null && !(H2 instanceof TL_account.requirementToContactEmpty)) {
                                    z12 = false;
                                }
                                p5Var.Q(20, z12);
                            }
                            r5();
                        } else if (i10 == org.telegram.messenger.at.f14709f5) {
                            r5();
                        } else if (i10 == org.telegram.messenger.at.y3) {
                            D5(false, false);
                        } else if (i10 == org.telegram.messenger.at.C3) {
                            D5(false, false);
                        } else if (i10 == org.telegram.messenger.at.D3) {
                            D5(false, false);
                        } else if (i10 == org.telegram.messenger.at.f14822y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
                                if (z4Var2 != null && z4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i10 == org.telegram.messenger.at.f14707f3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.J4 < 0 && longValue3 == a()) {
                                J5();
                                W();
                                wx0 wx0Var3 = this.d;
                                if (wx0Var3 != null) {
                                    wx0Var3.f();
                                }
                            }
                        } else if (i10 == org.telegram.messenger.at.G3) {
                            if (((Long) objArr[0]).longValue() == a() && !v4()) {
                                if (this.J4 < 0) {
                                    J5();
                                    W();
                                    wx0 wx0Var4 = this.d;
                                    if (wx0Var4 != null) {
                                        wx0Var4.f();
                                    }
                                    org.telegram.messenger.i0.g3(new na0(this, 19));
                                    return;
                                }
                                hx0 hx0Var5 = this.N;
                                if (hx0Var5 != null) {
                                    hx0Var5.L1(true);
                                }
                            }
                        } else if (i10 == org.telegram.messenger.at.V3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f33803d1 > 0) {
                                TLRPC.UserFull a2 = getMessagesController().a2(this.f33803d1);
                                if (a2 != null) {
                                    this.f33922u2 = a2;
                                }
                                J5();
                                W();
                                aw0 aw0Var4 = this.f33779a;
                                if (aw0Var4 != null && aw0Var4.c0()) {
                                    this.f33779a.post(new na0(this, 21));
                                    return;
                                }
                                wx0 wx0Var5 = this.d;
                                if (wx0Var5 != null) {
                                    wx0Var5.f();
                                }
                            }
                        } else if (i10 == org.telegram.messenger.at.W3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.D2;
                            if (chat4 != null && chat4.f19794id == longValue4) {
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
                                    if (i12 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                                        i12++;
                                    } else {
                                        org.telegram.messenger.i0.a4(this.f33779a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        iw0 iw0Var4 = this.f33809e0;
                        if (iw0Var4 != null) {
                            iw0Var4.setHasStories(x4());
                            this.f33809e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(q4(), 0.0f, this.f33847j2));
                        }
                        lw0 lw0Var4 = this.f33920u0;
                        if (lw0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f33922u2;
                            if (userFull3 != null) {
                                lw0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f33915t2;
                            if (chatFull8 != null) {
                                lw0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                S3(true);
            }
        } else if (org.telegram.messenger.w3.R(org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(this.f33810e1)))) {
            getMessagesController().O1().k(a(), new ag.z0(18), false, this.f33957z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null && b40Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if ((b40Var == null || dialog != b40Var.f24620c) && super.dismissDialogOnPause(dialog)) {
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
        int i10 = 0;
        if (this.f33803d1 != 0 && this.f33891q0 != null && !this.f33899r1) {
            return 0;
        }
        return org.telegram.messenger.i0.L(74 + ((this.H4 || this.I4) ? 25 : 25));
    }

    public final void e5(px0 px0Var) {
        if (this.f33843i5 == px0Var) {
            return;
        }
        this.f33843i5 = px0Var;
        org.telegram.messenger.i0.d0(this.f33779a, new nv0(this, 0));
    }

    @Override
    public final org.telegram.ui.Components.uk0 f() {
        return this.f33779a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof org.telegram.ui.Components.h61) {
            return ((org.telegram.ui.Components.h61) imageReceiver.t()).f26688a.a();
        }
        return org.telegram.messenger.i0.p(this.f33809e0.getImageReceiver().n());
    }

    public final void f5(CharSequence charSequence) {
        this.W5 = charSequence;
        H5();
    }

    @Override
    public final TLRPC.Chat g() {
        return this.D2;
    }

    public final org.telegram.ui.Components.d5 g4(long j10) {
        if (this.G == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), 2, this.f33816f, false);
            this.G = d5Var;
            int L = org.telegram.messenger.i0.L(1.0f);
            d5Var.I = 0;
            d5Var.J = L;
            if (this.G0) {
                this.G.a();
            }
        }
        if (j10 != 0) {
            this.G.j(j10, false);
        } else {
            this.G.g(null, false);
        }
        s5();
        return this.G;
    }

    public final void g5(int i10) {
        boolean z10;
        SharedPreferences d12 = org.telegram.messenger.wp.d1();
        if (!org.telegram.messenger.i0.Q1()) {
            boolean z11 = false;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.J1 = z10;
            if (i10 != 0) {
                z11 = true;
            }
            this.K1 = z11;
            K5();
            if (d12.getBoolean("view_animations", true)) {
                this.I1 = i10;
            } else if (i10 == 2) {
                this.f33864m1 = true;
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.R1;
    }

    @Override
    public final fs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f33957z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f33957z0 != null) {
            return null;
        }
        g6 g6Var = new g6(18, this);
        ArrayList arrayList = new ArrayList();
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            arrayList.addAll(hx0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33796c1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20873a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33809e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33885p0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20932d8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33905s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21071ki));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33905s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21089li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33905s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21108mi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21296x6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21135o6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21243u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21260v6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21331z6));
        int i10 = org.telegram.ui.ActionBar.t6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33779a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        if (this.R5) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33816f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33816f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33950y}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33816f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33816f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33950y}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ni));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.f33957z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.p6 p6Var = this.f33957z0;
        if (p6Var != null) {
            drawable = p6Var.getDrawable(str);
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
        int i10;
        if (!this.A1 && (hVar = this.B1) != null && this.f33915t2 != null) {
            this.A1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().g1(this.f33810e1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.B1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new mg.w(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void h5(TLRPC.UserFull userFull, org.telegram.ui.Cells.i6 i6Var, ky0 ky0Var) {
        boolean z10;
        this.f33922u2 = userFull;
        org.telegram.ui.Components.ov0 ov0Var = this.S;
        if (ov0Var != null) {
            ov0Var.set(userFull.stars_rating);
        }
        lw0 lw0Var = this.f33920u0;
        if (lw0Var != null) {
            lw0Var.setStories(this.f33922u2.stories);
        }
        rh.g0 g0Var = this.f33927v0;
        if (g0Var != null) {
            g0Var.a();
        }
        iw0 iw0Var = this.f33809e0;
        if (iw0Var != null) {
            iw0Var.setHasStories(x4());
        }
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            hx0Var.setUserInfo(this.f33922u2);
        }
        if (this.f33929v2 == null) {
            this.f33929v2 = i6Var;
        }
        if (this.f33929v2 == null) {
            this.f33929v2 = new org.telegram.ui.Cells.i6(this.currentAccount);
        }
        org.telegram.ui.Cells.i6 i6Var2 = this.f33929v2;
        na0 na0Var = new na0(this, 23);
        if (i6Var2.f22040c) {
            na0Var.run();
        } else {
            i6Var2.h.add(na0Var);
        }
        this.f33929v2.d(this.f33922u2);
        if (this.f33945x2 == null) {
            this.f33945x2 = ky0Var;
        }
        ky0 ky0Var2 = this.f33945x2;
        boolean z11 = true;
        if (ky0Var2 == null) {
            ky0 c10 = ky0.c(this.currentAccount, this.f33922u2, ky0Var2);
            this.f33945x2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33937w2 = z10;
        }
        ky0 ky0Var3 = this.f33945x2;
        if (ky0Var3 != null) {
            na0 na0Var2 = new na0(this, 18);
            if (ky0Var3.f39027b) {
                na0Var2.run();
            } else {
                ky0Var3.h.add(na0Var2);
            }
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.S0;
        if (p5Var != null) {
            TL_account.RequirementToContact H2 = getMessagesController().H2(this.f33803d1);
            if (H2 != null && !(H2 instanceof TL_account.requirementToContactEmpty)) {
                z11 = false;
            }
            p5Var.Q(20, z11);
            if (s4()) {
                this.S0.S(44);
            } else {
                this.S0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.d5 i4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.F == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 2, this.f33816f, false);
            this.F = d5Var;
            if (this.G0) {
                d5Var.a();
            }
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(o4(), z10);
                this.F.m(false, z10);
            } else {
                this.F.j(tL_emojiStatus.document_id, z10);
                this.F.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(o4(), z10);
                this.F.m(false, z10);
            } else {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z10);
                this.F.m(true, z10);
            }
        } else {
            this.F.g(o4(), z10);
            this.F.m(false, z10);
        }
        s5();
        return this.F;
    }

    public final void i5() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(this.glassEngine, baseSimpleGlass);
        this.I5 = lg0Var;
        jy0 jy0Var = this.f33796c1;
        if (jy0Var != null) {
            int i10 = jy0Var.H;
            boolean z10 = jy0Var.f38596c;
            if (lg0Var.f28162i != i10 || lg0Var.f28163j != z10) {
                lg0Var.f28162i = i10;
                lg0Var.f28163j = z10;
                lg0Var.a();
            }
        }
        this.I5.b(this.J5);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            hg0Var.setGlassFactory(this.I5.f28159c);
        }
        org.telegram.ui.Components.ch0 ch0Var = this.f33787b0;
        if (ch0Var != null) {
            ch0Var.setGlassFactory(this.I5.f28159c);
        }
        this.simpleActionBar.setButtonsGlass(this.I5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        fx0 fx0Var = this.f33868m5;
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 p6Var = this.f33957z0;
        baseSimpleGlass.f6605l = fx0Var;
        baseSimpleGlass.f6606m = null;
        baseSimpleGlass.g(fx0Var, i5Var, p6Var);
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        org.telegram.ui.Components.lg0 lg0Var2 = this.I5;
        tg.b bVar = lg0Var2.e;
        hi.d dVar = lg0Var2.f28160f;
        i5Var2.f20423n0 = bVar;
        i5Var2.f20424o0 = dVar;
        i5Var2.setBackground(null);
        this.G5 = w7.b9.m(this.f33957z0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.H5);
        A5();
        baseSimpleGlass.f6607n = this.L6;
        View view = new View(getParentActivity());
        this.T5 = view;
        view.setAlpha(0.0f);
        this.f33868m5.getViewTreeObserver().addOnPreDrawListener(new bl(this, 1));
        this.N.y(this.T5);
        View view2 = this.T5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.B5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        fx0 fx0Var2 = this.f33868m5;
        fx0Var2.addView(this.B5, fx0Var2.indexOfChild(this.Y), w7.b6.e(-1, 0, 48));
        this.glassEngine.b(this.f33779a);
        this.N.setPagesGlassEngine(this.glassEngine);
        this.N.setOnTopPanelShiftChanged(new na0(this, 22));
        H3();
        x5();
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f33880o2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f33880o2) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null && lVar.u()) {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21280w8, this.f33957z0);
            } else if (!this.R5 && this.A5 <= 0.5f) {
                org.telegram.messenger.lp lpVar = this.f33830g6;
                if (lpVar != null) {
                    w02 = lpVar.d(org.telegram.ui.ActionBar.t6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, this.f33957z0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f33957z0);
            }
            if (i0.b.h(w02) > 0.699999988079071d) {
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
        if (this.f33824g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f33817f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f33817f0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33817f0 = animatorSet2;
            if (z10) {
                this.f33824g0.setVisibility(0);
                this.f33817f0.playTogether(ObjectAnimator.ofFloat(this.f33824g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f33824g0, View.ALPHA, 0.0f));
            }
            this.f33817f0.setDuration(180L);
            this.f33817f0.addListener(new ww0(this, z10, 1));
            this.f33817f0.start();
        } else if (z10) {
            this.f33824g0.setAlpha(1.0f);
            this.f33824g0.setVisibility(0);
        } else {
            this.f33824g0.setAlpha(0.0f);
            this.f33824g0.setVisibility(4);
        }
    }

    @Override
    public final hi.f k() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ei.r.f().f6693a) {
            return baseSimpleGlass.f6602i;
        }
        return null;
    }

    public final int k4() {
        if (e4() == 0) {
            return org.telegram.messenger.i0.L(168.0f);
        }
        return org.telegram.messenger.i0.L(152.0f);
    }

    public final void k5() {
        int i10;
        int i11;
        Long l4;
        if (this.N5 != null) {
            return;
        }
        x21[] x21VarArr = new x21[1];
        Rect rect = org.telegram.messenger.i0.Q;
        kl klVar = this.f33816f;
        if (klVar != null) {
            if (klVar.getRightDrawable() == null) {
                rect.set(this.f33816f.getWidth() - 1, (this.f33816f.getHeight() / 2) - 1, this.f33816f.getWidth() + 1, (this.f33816f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f33816f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f33816f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f33816f.getX(), (int) this.f33816f.getY());
            }
        }
        if (this.f33816f.getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int i12 = i10;
        int L = (-(this.Y.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(i12);
        Point point = org.telegram.messenger.i0.f16172q;
        int min = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.u.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.D2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        pw0 pw0Var = new pw0(this, this, parentActivity, valueOf, i11, this.f33957z0, i12, x21VarArr);
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1));
        if (Z1 != null) {
            pw0Var.setExpireDateHint(org.telegram.messenger.o5.g(Z1.emoji_status));
        }
        Long l10 = this.E;
        if (l10 != null) {
            pw0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.d5 d5Var = this.F;
            if (d5Var != null) {
                Drawable drawable = d5Var.f25372f[0];
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.f5) drawable).h());
                    pw0Var.setSelected(l4);
                }
            }
            l4 = null;
            pw0Var.setSelected(l4);
        }
        pw0Var.setSaveState(3);
        pw0Var.y(this.F, this.f33816f);
        qw0 qw0Var = new qw0(this, pw0Var);
        this.N5 = qw0Var;
        x21VarArr[0] = qw0Var;
        int[] iArr = new int[2];
        kl klVar2 = this.f33816f;
        if (klVar2 != null) {
            klVar2.getLocationOnScreen(iArr);
        }
        x21VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        x21VarArr[0].b();
    }

    public final float l4() {
        return Math.max(this.A5, this.Q5);
    }

    public final void l5() {
        int i10 = 0;
        this.N.K0.setReordering(false);
        hx0 hx0Var = this.N;
        org.telegram.ui.Components.vr0 vr0Var = hx0Var.K0;
        if (hx0Var.f24568x1 != null && vr0Var != null) {
            boolean B0 = hx0Var.B0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = vr0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab n02 = org.telegram.ui.Components.au0.n0(num.intValue(), B0);
                if (n02 != null) {
                    arrayList.add(n02);
                }
            }
        }
        this.N.L1(true);
        this.f33955y5.animate().translationY(org.telegram.messenger.i0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new na0(this, 25)).start();
        org.telegram.ui.Components.cc.a0(this).Q(2131623989, 36, "Tab order changed.").j();
    }

    public final float m4(float f7, float f10) {
        float f11;
        float f12;
        this.f33926u6 = f7;
        this.f33941w6 = f10;
        int i10 = this.I1;
        if (i10 == 2) {
            f11 = 1.0f;
        } else if (this.R1 < 1.0f && i10 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f33847j2;
        }
        float l4 = Utilities.l(f11);
        org.telegram.ui.Components.ov0 ov0Var = this.S;
        if (ov0Var != null) {
            f12 = ov0Var.getVisibilityFactor();
        } else {
            f12 = 0.0f;
        }
        return Math.max(0.0f, (p4() + this.f33883o5) * l4) + c3.i0.z(1.0f, l4, f10 * f12, f7);
    }

    public final void m5() {
        int w02;
        int w03;
        if (!this.f33880o2) {
            kw0 kw0Var = this.f33897r;
            if (kw0Var != null) {
                Object tag = kw0Var.getTag();
                if (tag instanceof Integer) {
                    this.f33897r.setTextColor(I3(org.telegram.ui.ActionBar.t6.w0(((Integer) tag).intValue(), this.f33957z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.f33897r.setTextColor(I3(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.f33957z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f33942x;
            int i10 = -1;
            if (drawable != null) {
                if (this.f33830g6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20937dd, this.f33957z0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.K;
            if (ll0Var != null) {
                ll0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21005h8, this.f33957z0));
            }
            kl klVar = this.f33816f;
            if (klVar != null) {
                klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21051ji, this.f33957z0));
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                if (this.f33830g6 == null) {
                    i10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f33957z0);
                }
                lVar.D(i10, false);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                if (this.f33830g6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20968f8, this.f33957z0);
                }
                lVar2.C(w02, false);
            }
        }
        s5();
        P5();
    }

    public final float n4(float f7) {
        float f10;
        this.f33949x6 = f7;
        int i10 = this.I1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.R1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f33847j2;
        }
        float l4 = Utilities.l(f10);
        if (this.S != null) {
            f11 = this.S.getVisibilityFactor() * org.telegram.messenger.i0.L(3.0f);
        }
        return c3.i0.z(1.0f, l4, f11, f7);
    }

    public final void n5() {
        int i10;
        float f7;
        l0 l0Var;
        if (this.Z != null && this.f33897r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16166m;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            boolean z10 = this.F1;
            hg0Var.e = z10;
            if (z10 && this.I1 == 2 && (l0Var = this.X) != null) {
                this.Z.f26792f = this.X.getY() + (this.X.getScaleY() * l0Var.getHeight());
                this.Z.setAlpha(this.R1);
                org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                hg0Var2.f26797x = org.telegram.messenger.i0.L(74.0f);
                hg0Var2.setTranslationY(this.f33779a.getMeasuredWidth());
                hg0Var2.invalidate();
            } else {
                hg0Var.f26792f = -1.0f;
                float f10 = i11;
                float f11 = this.P1 + f10;
                if (!this.H4 && !this.I4) {
                    f7 = 0.0f;
                } else {
                    f7 = 25.0f;
                }
                float L = f11 - org.telegram.messenger.i0.L(f7);
                float min = Math.min(org.telegram.messenger.i0.L(74.0f), L - f10);
                org.telegram.ui.Components.hg0 hg0Var3 = this.Z;
                hg0Var3.f26797x = min;
                hg0Var3.setTranslationY(L - min);
                hg0Var3.invalidate();
            }
            ImageView imageView = this.O0;
            if (imageView != null && imageView.getTag() != null) {
                this.Z.getClass();
                if (this.O0.getVisibility() == 0) {
                    this.O0.setVisibility(8);
                }
                if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.t0) {
                    ((org.telegram.ui.ActionBar.t0) this.O0.getTag()).setAlpha(1.0f);
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

    public final org.telegram.ui.Components.fr o4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232306).mutate();
            this.D = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33957z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.fr(this.D, getParentActivity().getDrawable(2131232309).mutate());
        }
        return this.J;
    }

    public final void o5() {
        int i10;
        if (this.Y0 != null && this.Z0 != null) {
            TLRPC.UserFull userFull = this.f33922u2;
            if (userFull == null && this.f33915t2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f33915t2.ttl_period;
            }
            this.f33906s0.b(i10);
            this.Z0.t(i10);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null) {
            b40Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vr0 vr0Var;
        if (super.onBackPressed(z10)) {
            hx0 hx0Var = this.N;
            if (hx0Var != null && (vr0Var = hx0Var.K0) != null && vr0Var.f24183n0) {
                if (z10) {
                    l5();
                    return false;
                }
            } else if (this.J4 != -1 && hx0Var != null && hx0Var.E1) {
                if (z10) {
                    hx0Var.U(true);
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
        this.f33877n6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        Q5();
        this.f33877n6 = true;
        U3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            hx0Var.onConfigurationChanged(configuration);
        }
        t4();
        if (this.f33865m2 && this.f33880o2 && (m10 = this.f33794c.m(0)) != null) {
            this.f33779a.scrollBy(0, m10.getTop() - j4());
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
        aw0 aw0Var = this.f33779a;
        if (aw0Var != null) {
            aw0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            hx0Var.O0();
        }
        org.telegram.ui.Components.st0 st0Var = this.Q;
        if (st0Var != null) {
            st0Var.b(this);
        }
        org.telegram.ui.Components.st0 st0Var2 = this.Q;
        if (st0Var2 != null) {
            st0Var2.f30449y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14786t);
        getNotificationCenter().n(this, org.telegram.messenger.at.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14771q5);
        getNotificationCenter().n(this, org.telegram.messenger.at.D1);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14686c0);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14805v5);
        getNotificationCenter().n(this, org.telegram.messenger.at.F5);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14725i3);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().n(this, org.telegram.messenger.at.y3);
        getNotificationCenter().n(this, org.telegram.messenger.at.C3);
        getNotificationCenter().n(this, org.telegram.messenger.at.D3);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14707f3);
        getNotificationCenter().n(this, org.telegram.messenger.at.G3);
        getNotificationCenter().n(this, org.telegram.messenger.at.V3);
        getNotificationCenter().n(this, org.telegram.messenger.at.W3);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        jw0 jw0Var = this.f33871n0;
        if (jw0Var != null) {
            jw0Var.K();
        }
        org.telegram.ui.Components.ng0 ng0Var = this.m0;
        if (ng0Var != null) {
            ng0Var.d();
        }
        this.Z5 = null;
        if (this.f33803d1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.at.f14781s1);
            getNotificationCenter().n(this, org.telegram.messenger.at.O);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14675a0);
            getNotificationCenter().n(this, org.telegram.messenger.at.Y);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14710g0);
            getNotificationCenter().n(this, org.telegram.messenger.at.D0);
            getNotificationCenter().n(this, org.telegram.messenger.at.E0);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14734k0);
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14818x4);
            getMessagesController().f19219q1.remove(Long.valueOf(this.f33803d1));
        } else if (this.f33810e1 != 0) {
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.B5);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14764p3);
            getNotificationCenter().n(this, org.telegram.messenger.at.T);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14711g1);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14809w2);
            getNotificationCenter().n(this, org.telegram.messenger.at.f14681b1);
        }
        iw0 iw0Var = this.f33809e0;
        if (iw0Var != null) {
            iw0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null) {
            b40Var.d();
        }
        nw0 nw0Var = this.V4;
        if (nw0Var != null) {
            nw0Var.b();
        }
        ky0 ky0Var = this.f33945x2;
        if (ky0Var != null && this.f33937w2) {
            ky0Var.b(true);
            this.f33945x2 = null;
        }
        org.telegram.messenger.video.o oVar = this.f33948x5;
        if (oVar != null) {
            this.f33948x5 = null;
            org.telegram.messenger.i0.g3(oVar);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.gs0 gs0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null) {
            b40Var.i();
        }
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.e();
        }
        hx0 hx0Var = this.N;
        if (hx0Var != null && (gs0Var = hx0Var.V) != null) {
            gs0Var.e = false;
            if (gs0Var.f43130c != null) {
                gs0Var.f43128a.onPause();
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
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null) {
            b40Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 == 103 && this.D2 != null) {
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
                    org.telegram.messenger.u3 f12 = getMessagesController().f1(this.f33810e1, false, null);
                    TLRPC.Chat chat = this.D2;
                    if (f12 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.n1.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1));
        if (Z1 == null) {
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
            TLRPC.UserFull userFull = this.f33922u2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.n1.m(Z1, z11, z12, getParentActivity(), this.f33922u2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User Z1;
        bo0 bo0Var;
        super.onResume();
        hx0 hx0Var = this.N;
        if (hx0Var != null) {
            hx0Var.f24509d1 = true;
            org.telegram.ui.Components.fs0 fs0Var = hx0Var.J;
            if (fs0Var != null) {
                fs0Var.f();
            }
            org.telegram.ui.Components.nt0 nt0Var = hx0Var.M;
            if (nt0Var != null) {
                nt0Var.f();
            }
            org.telegram.ui.Components.ot0 ot0Var = hx0Var.L;
            if (ot0Var != null) {
                ot0Var.X(false);
            }
            for (int i10 = 0; i10 < hx0Var.m0.length; i10++) {
                hx0Var.d0(i10);
            }
            org.telegram.ui.Components.gs0 gs0Var = hx0Var.V;
            if (gs0Var != null) {
                gs0Var.e = true;
                if (gs0Var.f43130c != null) {
                    gs0Var.f43128a.onResume();
                }
            }
        }
        t4();
        wx0 wx0Var = this.d;
        if (wx0Var != null) {
            this.T4 = true;
            wx0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (bo0Var = this.T) != null && bo0Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null) {
            b40Var.k();
            setParentActivityTitle(org.telegram.messenger.dd.L0(2131745512, null));
        }
        I5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        kl klVar = this.f33816f;
        if (klVar != null) {
            setParentActivityTitle(klVar.getText());
        }
        if (this.f33803d1 != 0 && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33803d1))) != null && Z1.photo == null && this.P1 >= j4()) {
            this.f33840i2.cancel();
            float[] fArr = this.f33860l2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            X4(1.0f);
            this.f33871n0.setVisibility(8);
            this.P1 = j4();
            this.f33873n2 = false;
            this.f33794c.h1(0, j4() - this.f33779a.getPaddingTop());
        }
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.a();
        }
        C5();
        y4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f33951y0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.f33957z0));
            m5();
            M5();
            J3();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.i5 i5Var;
        if (z10 && (i5Var = this.simpleActionBar) != null) {
            i5Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i10 = this.I1;
                if (i10 != 0 && this.L1) {
                    if (i10 == 1) {
                        this.f33847j2 = 0.0f;
                        org.telegram.ui.Components.ov0 ov0Var = this.S;
                        if (ov0Var != null) {
                            ov0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.hg0 hg0Var = this.Z;
                        if (hg0Var != null) {
                            hg0Var.setParentExpanded(0.0f);
                        }
                        Z4(0.0f);
                        org.telegram.ui.Components.ch0 ch0Var = this.f33787b0;
                        if (ch0Var != null) {
                            ch0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.F1 = false;
                    O3();
                    if (this.H1) {
                        S3(true);
                    }
                }
                if (!this.f33862l5) {
                    this.f33862l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.P4);
            bo0 bo0Var = this.T;
            if (bo0Var != null && bo0Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.G1 = false;
        Q3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        bo0 bo0Var = this.T;
        if (bo0Var != null && bo0Var.getVisibility() == 0) {
            if (z10) {
                this.T.setAlpha(1.0f - f7);
            } else {
                this.T.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        hy0 hy0Var;
        ImageView imageView;
        org.telegram.ui.Components.hg0 hg0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.f33801c6 = z10;
        if (z10 && (hg0Var = this.Z) != null) {
            ArrayList arrayList = hg0Var.f26788a;
            if (hg0Var.E == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.eg0 eg0Var = (org.telegram.ui.Components.eg0) arrayList.get(i10);
                    org.telegram.ui.Components.ci0 ci0Var = eg0Var.f25819k;
                    if (ci0Var != null) {
                        if (eg0Var.f25812a == 15) {
                            ci0Var.M(14);
                        } else {
                            ci0Var.M(0);
                        }
                        eg0Var.f25819k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.t0)) {
            ((org.telegram.ui.ActionBar.t0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.I1 != 0 && this.L1 && !this.f33880o2) {
            this.F1 = true;
            if (!z10) {
                if (this.Z5 == null) {
                    this.Z5 = new float[14];
                }
                this.E1 = this.P1;
                this.Z5[0] = this.X.getScaleX();
                this.Z5[1] = this.X.getTranslationX();
                this.Z5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                if (hg0Var2 != null) {
                    this.Z5[3] = hg0Var2.getAlpha();
                }
                rh.g0 g0Var = this.f33927v0;
                if (g0Var != null) {
                    float[] fArr = this.Z5;
                    fArr[4] = g0Var.e;
                    fArr[5] = g0Var.f46938f;
                }
                if (this.f33956y6 != null) {
                    this.Z5[6] = hy0Var.getAlpha();
                }
                this.Z5[7] = this.f33816f.getScaleX();
                this.Z5[8] = this.f33816f.getTranslationY();
                this.Z5[9] = this.f33897r.getTranslationY();
                this.Z5[10] = this.f33816f.getLayoutParams().width;
                float[] fArr2 = this.Z5;
                fArr2[11] = this.f33789b2;
                fArr2[12] = this.f33816f.getTranslationX();
                this.Z5[13] = this.f33897r.getTranslationX();
                vh.p2 p2Var = this.A6;
                if (p2Var != null) {
                    p2Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f33891q0 != null) {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.at.f14779s, org.telegram.messenger.at.f14786t, org.telegram.messenger.at.W, org.telegram.messenger.at.X, org.telegram.messenger.at.E0, org.telegram.messenger.at.f14777r4}, this.P4, true);
            } else {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.at.f14779s, org.telegram.messenger.at.f14786t, org.telegram.messenger.at.W, org.telegram.messenger.at.X, org.telegram.messenger.at.f14777r4}, this.P4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.G1 = true;
        Q3();
    }

    public final float p4() {
        if (this.S != null) {
            return this.S.getVisibilityFactor() * org.telegram.messenger.i0.L(22.0f);
        }
        return 0.0f;
    }

    public final void p5() {
        float L;
        boolean z10;
        if (this.f33911s5 != null) {
            hx0 hx0Var = this.N;
            if (hx0Var != null && hx0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.i0.L(232.0f) - (this.f33779a.getMeasuredHeight() - this.N.getY());
            } else {
                L = org.telegram.messenger.i0.L(72.0f);
            }
            int i10 = 0;
            if (L <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            fe.b bVar = this.M5;
            bVar.a(z10, true);
            float f7 = bVar.e;
            this.f33911s5.setTranslationY(org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(60.0f), 0));
            this.f33911s5.setAlpha(f7);
            FrameLayout frameLayout = this.f33911s5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32194w;
            if (wbVar != null) {
                wbVar.l();
            }
        }
    }

    public final int q4() {
        float f7;
        if (this.f33886p1) {
            return 0;
        }
        if (this.f33810e1 != 0 && org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(this.f33810e1)))) {
            if (x4()) {
                f7 = 24.0f;
            } else {
                f7 = 38.0f;
            }
            return org.telegram.messenger.i0.L(f7);
        }
        return org.telegram.messenger.i0.L(50.0f);
    }

    public final void q5() {
        boolean z10;
        vh.p2 p2Var = this.A6;
        if (p2Var != null) {
            float f7 = 0.0f;
            p2Var.m(0.0f, (this.f33816f.getScaleX() * this.f33816f.getRightDrawableX()) + this.f33816f.getX() + (-p2Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.i0.U1(this.f33854k2, this.f33860l2);
            vh.p2 p2Var2 = this.A6;
            p2Var2.setTranslationY(((this.f33816f.getY() + (-p2Var2.getPaddingBottom())) - org.telegram.messenger.i0.L(24.0f)) + org.telegram.messenger.i0.W1(U1, org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(12.0f)));
            this.A6.h(i0.b.f(U1, this.B6, 1342177280));
            if (this.P1 >= org.telegram.messenger.i0.L(82.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean bool = this.C6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.A6.animate();
            this.C6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.a30.m(animate.alpha(f7), org.telegram.ui.Components.gr.f26524g, 200L);
        }
    }

    public final org.telegram.ui.Components.fr r4() {
        int i10;
        float f7;
        if (this.I == null) {
            this.f33950y = org.telegram.ui.ActionBar.t6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.t6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.lp lpVar = this.f33830g6;
            if (lpVar != null) {
                if (lpVar.o(org.telegram.ui.ActionBar.t6.I.q())) {
                    i10 = this.f33830g6.k();
                } else {
                    i10 = this.f33830g6.i();
                }
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.t6.b(0.1f, f7, i10);
                Drawable drawable = this.f33950y;
                int S0 = org.telegram.messenger.i0.S0(this.Q5, 1.0f, b10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33957z0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.H.setColorFilter(org.telegram.messenger.i0.S0(this.Q5, 1.0f, -1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f33957z0)), mode);
            }
            this.I = new org.telegram.ui.Components.fr(new org.telegram.ui.Components.eq(this.f33950y, this.H), getParentActivity().getDrawable(2131232791));
        }
        return this.I;
    }

    public final void r5() {
        if (getParentActivity() != null && this.U0 != null) {
            if (getUserConfig().q()) {
                this.U0.setIcon(2131231861);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231862);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.f33957z0), PorterDuff.Mode.SRC_IN));
            this.P6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232168);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.U0.setIcon(new yw0(drawable, drawable2, org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f)));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null) {
            b40Var.f24621f = bundle.getString("path");
        }
    }

    public final boolean s4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.f33893q2 || (userFull = this.f33922u2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void s5() {
        t5(this.f33823f6);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.f33891q0;
        if (b40Var != null && (str = b40Var.f24621f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        int i10;
        this.f33847j2 = f7;
        this.R1 = f7;
        Q3();
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setAlpha(f7);
        }
        if (this.I1 == 2) {
            this.f33809e0.setProgressToExpand(f7);
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            if (hg0Var != null) {
                hg0Var.setParentExpanded(f7);
            }
            Z4(f7);
            org.telegram.ui.Components.ch0 ch0Var = this.f33787b0;
            if (ch0Var != null) {
                ch0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.ov0 ov0Var = this.S;
            if (ov0Var != null) {
                ov0Var.setParentExpanded(f7);
            }
            n5();
            E5();
        }
        this.f33779a.setAlpha(f7);
        this.f33779a.setTranslationX(org.telegram.messenger.i0.L(48.0f) - (org.telegram.messenger.i0.L(48.0f) * f7));
        if (this.I1 != 2 || (w02 = this.f33898r0) == 0) {
            if (this.f33803d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.f33810e1)) {
                    boolean z10 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.f33957z0;
            int[][] iArr = org.telegram.ui.Components.r8.L;
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, p6Var);
        }
        int i11 = this.X4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, this.f33957z0);
        }
        this.f33796c1.setBackgroundColor(i0.b.f(f7, i0.b.o(i11, 0), w02));
        org.telegram.ui.Components.g11 g11Var = this.f33859l0;
        int f10 = i0.b.f(f7, i11, w02);
        g11Var.f26290k = true;
        g11Var.f26284b.setColor(f10);
        int i12 = -1;
        if (this.f33830g6 != null) {
            w03 = -1;
        } else {
            if (this.f33803d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.f33810e1)) {
                    boolean z11 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var2 = this.f33957z0;
            int[][] iArr2 = org.telegram.ui.Components.r8.L;
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20988g8, p6Var2);
        }
        this.actionBar.D(i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f33957z0), w03), false);
        if (this.f33830g6 == null) {
            i12 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21051ji, this.f33957z0);
        }
        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.f33957z0);
        kl klVar = this.f33816f;
        if (klVar != null && this.I1 != 2) {
            klVar.setTextColor(i0.b.f(f7, w05, i12));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pi, this.f33957z0);
        } else {
            if (this.f33803d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.f33810e1)) {
                    boolean z12 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var3 = this.f33957z0;
            int[][] iArr3 = org.telegram.ui.Components.r8.L;
            w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21005h8, p6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.t6.f21156pa;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.t6.w0(i10, this.f33957z0);
        kw0 kw0Var = this.f33897r;
        if (kw0Var != null && this.I1 != 2) {
            kw0Var.setTextColor(i0.b.f(f7, w06, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.P1 = this.Q1 * f7;
        long j10 = this.f33803d1;
        if (j10 == 0) {
            j10 = this.f33810e1;
        }
        org.telegram.ui.ActionBar.p6 p6Var4 = this.f33957z0;
        int[][] iArr4 = org.telegram.ui.Components.r8.L;
        int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155p8[org.telegram.ui.Components.r8.e(j10)], p6Var4);
        long j11 = this.f33803d1;
        if (j11 == 0) {
            j11 = this.f33810e1;
        }
        int d = org.telegram.ui.Components.r8.d(j11);
        if (w07 != d) {
            this.f33885p0.h(i0.b.f(f7, d, w07));
            this.f33809e0.invalidate();
        }
        int i13 = this.Y4;
        if (i13 != 0) {
            setNavigationBarColor(i0.b.f(f7, i13, getNavigationBarColor()));
        }
        this.f33796c1.invalidate();
        y4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        rx0 rx0Var = this.f33808d6;
        if (rx0Var != null) {
            rx0Var.invalidate();
        }
        if (a() > 0) {
            iw0 iw0Var = this.f33809e0;
            if (iw0Var != null) {
                iw0Var.setProgressToStoriesInsets(this.R1);
            }
            lw0 lw0Var = this.f33920u0;
            if (lw0Var != null) {
                lw0Var.setProgressToStoriesInsets(this.R1);
            }
            rh.g0 g0Var = this.f33927v0;
            if (g0Var != null) {
                g0Var.setProgressToStoriesInsets(this.R1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.z4 z4Var) {
        super.setParentLayout(z4Var);
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.e();
            this.W1 = null;
        }
        if (z4Var != null && z4Var.getParentActivity() != null) {
            this.W1 = new org.telegram.messenger.o6(z4Var.getParentActivity().getWindow(), new av0(this, 8));
        }
    }

    @Override
    public final boolean t() {
        return this.f33801c6;
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
        this.f33865m2 = z10;
    }

    public final void t5(float f7) {
        int S0;
        org.telegram.messenger.lp lpVar = this.f33830g6;
        if (lpVar != null) {
            S0 = i0.b.f(0.25f, lpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.i0.S0(this.Q5, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33957z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33957z0));
        }
        int f10 = i0.b.f(f7, S0, -1);
        int i10 = org.telegram.ui.ActionBar.t6.Cj;
        int f11 = i0.b.f(Math.max(this.Q5, this.A5), f10, org.telegram.ui.ActionBar.t6.w0(i10, this.f33957z0));
        org.telegram.ui.Components.d5 d5Var = this.F;
        if (d5Var != null) {
            d5Var.k(Integer.valueOf(f11));
        }
        org.telegram.ui.Components.d5 d5Var2 = this.G;
        if (d5Var2 != null) {
            d5Var2.k(Integer.valueOf(i0.b.f(this.Q5, i0.b.f(f7, S0, -1711276033), org.telegram.ui.ActionBar.t6.w0(i10, this.f33957z0))));
        }
        this.f33802d0.setColor(f11);
        this.f33823f6 = f7;
    }

    public final boolean u4() {
        if (this.D2 != null) {
            return getMessagesController().n2(this.D2);
        }
        org.telegram.messenger.wp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f33922u2;
        messagesController.getClass();
        return org.telegram.messenger.wp.I2(userFull);
    }

    public final void u5() {
        this.f33802d0.setScaleX(this.f33816f.getScaleX());
        this.f33802d0.setScaleY(this.f33816f.getScaleY());
        this.f33802d0.b((this.f33816f.getScaleX() * this.f33816f.getRightDrawableX()) + this.f33816f.getX(), (this.f33816f.getHeight() - (this.f33816f.getScaleY() * (this.f33816f.getHeight() - this.f33816f.getRightDrawableY()))) + this.f33816f.getY());
    }

    public final boolean v4() {
        if (this.f33891q0 != null && !this.f33899r1) {
            return true;
        }
        return false;
    }

    public final void v5() {
        if (!this.f33886p1 && org.telegram.messenger.w3.c0(this.D2)) {
            org.telegram.messenger.pt notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f16331a.c(new org.telegram.messenger.d4(notificationsController, -this.f33810e1, new wv0(this), 6));
        }
    }

    @Override
    public final void w() {
        this.f33779a.y0(0);
    }

    public final void w4(boolean z10) {
        boolean z11;
        boolean c02 = org.telegram.messenger.w3.c0(this.D2);
        TLRPC.Chat chat = this.D2;
        if (!c02 && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.s4.r(this, false, chat, null, false, z11, z10, !c02, new av0(this, 3));
    }

    public final void w5(float f7) {
        xx0 xx0Var;
        ValueAnimator valueAnimator;
        if (this.f33880o2 || ((xx0Var = this.M) != null && (valueAnimator = xx0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.f33779a.getMeasuredWidth();
            layoutParams.height = (int) (this.P1 + f7);
            this.M.requestLayout();
        }
        jy0 jy0Var = this.f33796c1;
        if (jy0Var != null) {
            jy0Var.E.setTranslate(0.0f, this.Z1 - jy0Var.f38603y);
            jy0 jy0Var2 = this.f33796c1;
            RadialGradient radialGradient = jy0Var2.D;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(jy0Var2.E);
            }
            this.f33796c1.invalidate();
        }
        u5();
        n5();
        E5();
    }

    public final boolean x4() {
        if (getMessagesController().O1().K(a()) && !this.f33886p1) {
            return true;
        }
        return false;
    }

    public final void x5() {
        boolean z10;
        boolean z11;
        boolean z12;
        float a2;
        float f7 = 0.0f;
        if (!this.f33886p1 && !this.F1) {
            int e42 = e4();
            if (e42 > 0) {
                a2 = w7.u.a(1.0f - (this.P1 / e42), 0.0f, 1.0f);
            } else {
                a2 = w7.u.a((this.f33789b2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f7 = a2;
        }
        float f10 = this.A5;
        if (f10 != f7) {
            if (f10 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.A5 = f7;
            kl klVar = this.f33816f;
            if (klVar != null) {
                klVar.setTextColor(this.D5);
            }
            kw0 kw0Var = this.f33897r;
            if (kw0Var != null) {
                kw0Var.setTextColor(this.E5);
            }
            s5();
            if (z12) {
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14777r4, Boolean.TRUE);
            }
            jy0 jy0Var = this.f33796c1;
            if (jy0Var != null) {
                jy0Var.invalidate();
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
    public final boolean y() {
        return false;
    }

    public final void y4(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float U1;
        org.telegram.ui.Components.g9 currentItemView;
        float f12;
        float U12;
        int i12;
        float f13;
        float f14;
        float f15;
        float f16;
        FrameLayout.LayoutParams layoutParams;
        float f17;
        int i13;
        int i14;
        kl klVar;
        int w02;
        float f18;
        int i15;
        boolean z11;
        TLRPC.ChatFull chatFull;
        int i16;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
        float L3 = L3();
        aw0 aw0Var = this.f33779a;
        if (aw0Var != null && !this.F1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aw0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f33779a.setLayoutParams(layoutParams2);
            }
        }
        O5(z10);
        if (this.X != null) {
            this.f33779a.setTopGlowOffset((int) this.P1);
            aw0 aw0Var2 = this.f33779a;
            if (this.P1 > j4() && this.P1 < (e4() + this.f33779a.getMeasuredWidth()) - currentActionBarHeight) {
                i16 = 2;
            } else {
                i16 = 0;
            }
            aw0Var2.setOverScrollMode(i16);
        }
        if (this.X != null && !this.f33801c6 && this.F1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.X != null) {
            if (this.Z != null && this.f33810e1 != 0) {
                if (org.telegram.messenger.w3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f33915t2) != null && chatFull.linked_chat_id != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.Z.o(2, z11);
            }
            O5(z10);
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = org.telegram.messenger.i0.f16166m;
            } else {
                i11 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.a30.b(L3, 1.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f, i11) - org.telegram.messenger.i0.L(21.0f));
            if (!this.F1) {
                org.telegram.ui.Components.zg0 zg0Var = this.f33913t0;
                if (zg0Var != null) {
                    f18 = -org.telegram.messenger.i0.L(29.0f);
                    org.telegram.messenger.ls lsVar = zg0Var.f33156n;
                    if (lsVar != null && lsVar.f16997c) {
                        f18 = lsVar.e.centerY();
                    }
                } else {
                    f18 = -org.telegram.messenger.i0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i15 = org.telegram.messenger.i0.f16166m;
                } else {
                    i15 = 0;
                }
                this.Z1 = org.telegram.messenger.i0.T1(f18, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i15) - org.telegram.messenger.i0.L(21.0f)), L3);
            } else {
                this.Z1 = translationY;
            }
            if (this.F1) {
                f7 = this.Q1;
            } else {
                f7 = this.P1;
            }
            float f19 = j42;
            if (f7 <= f19 && !this.f33880o2) {
                f10 = 2.0f;
                f11 = 18.0f;
            } else {
                f10 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f7 - f19) / ((this.f33779a.getMeasuredWidth() - currentActionBarHeight) - k4())));
                this.f33826g2 = max;
                f11 = 18.0f;
                this.a2 = (org.telegram.messenger.i0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.f33789b2 = 0.0f;
                lw0 lw0Var = this.f33920u0;
                if (lw0Var != null) {
                    lw0Var.invalidate();
                }
                rh.g0 g0Var = this.f33927v0;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.i0.N(2000.0f), Math.max(org.telegram.messenger.i0.N(1100.0f), Math.abs(this.f33833h2))) / org.telegram.messenger.i0.N(1100.0f);
                e4();
                boolean z12 = this.f33873n2;
                int i17 = org.telegram.messenger.at.f14777r4;
                float[] fArr = this.f33860l2;
                if (z12 && (this.F0 || this.f33826g2 >= 0.33f)) {
                    if (!this.f33880o2) {
                        if (this.S0 != null) {
                            if (!u4()) {
                                this.S0.S(21);
                            } else {
                                this.S0.t(21);
                            }
                            if (this.f33891q0 != null) {
                                this.S0.S(36);
                                this.S0.S(34);
                                this.S0.S(35);
                                this.S0.t(33);
                                this.S0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.p5 p5Var = this.T0;
                        if (p5Var != null) {
                            p5Var.setEnabled(false);
                        }
                        this.f33880o2 = true;
                        org.telegram.messenger.at.e().k(i17, Boolean.TRUE);
                        this.M.f(true, min);
                        this.f33878o0.b(min);
                        this.f33871n0.setCreateThumbFromParent(true);
                        this.f33871n0.getAdapter().g();
                        this.f33840i2.cancel();
                        fArr[0] = org.telegram.messenger.i0.U1(this.f33854k2, fArr);
                        fArr[1] = 1.0f;
                        lw0 lw0Var2 = this.f33920u0;
                        if (lw0Var2 != null && !lw0Var2.f34089x.isEmpty()) {
                            this.f33840i2.setInterpolator(new u1.a());
                            this.f33840i2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f33840i2.setInterpolator(org.telegram.ui.Components.gr.f26526j);
                            this.f33840i2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f33840i2.addListener(new mw0(this, 4));
                        View m10 = this.f33794c.m(0);
                        if (!this.O1 && m10 != null) {
                            this.N1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i12 = org.telegram.messenger.i0.f16166m;
                            } else {
                                i12 = 0;
                            }
                            this.f33779a.x0(((m10.getTop() - this.f33779a.getMeasuredWidth()) - e4()) + currentActionBarHeight2 + i12, (int) this.f33840i2.getDuration(), (Interpolator) this.f33840i2.getInterpolator());
                            this.f33779a.O0 = false;
                        }
                        this.f33785a6 = this.f33816f.getTranslationY();
                        this.f33793b6 = this.f33897r.getTranslationY();
                        this.f33840i2.start();
                        this.f33871n0.setAlpha(0.0f);
                        this.f33871n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f33871n0.getLayoutParams();
                    int i18 = layoutParams3.height;
                    layoutParams3.width = this.f33779a.getMeasuredWidth();
                    float f20 = currentActionBarHeight + f7;
                    int i19 = (int) f20;
                    layoutParams3.height = i19;
                    if (i18 != i19) {
                        this.f33871n0.requestLayout();
                    }
                    if (!this.f33840i2.isRunning()) {
                        if (this.F1 && this.I1 == 2) {
                            f12 = (-(1.0f - this.R1)) * org.telegram.messenger.i0.L(50.0f);
                        } else {
                            f12 = 0.0f;
                        }
                        this.f33816f.setTranslationX(org.telegram.messenger.i0.N(18.0f) - this.f33816f.getLeft());
                        this.f33816f.setTranslationY((((f20 - e4()) - org.telegram.messenger.i0.N(30.0f)) - this.f33816f.getBottom()) + f12);
                        this.f33897r.setTranslationX(m4(org.telegram.messenger.i0.N(16.0f) - this.f33897r.getLeft(), 0.0f));
                        this.f33897r.setTranslationY(n4((((f20 - e4()) - org.telegram.messenger.i0.N(10.0f)) - this.f33897r.getBottom()) + f12));
                        q5();
                    }
                } else {
                    if (this.f33880o2) {
                        this.f33880o2 = false;
                        org.telegram.messenger.at.e().k(i17, Boolean.TRUE);
                        org.telegram.ui.ActionBar.p5 p5Var2 = this.S0;
                        if (p5Var2 != null) {
                            p5Var2.t(21);
                            if (this.f33891q0 != null) {
                                this.S0.t(33);
                                this.S0.t(34);
                                this.S0.t(35);
                                this.S0.S(36);
                                this.S0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.p5 p5Var3 = this.T0;
                        if (p5Var3 != null) {
                            p5Var3.setEnabled(!this.f33952y1);
                        }
                        this.M.f(false, min);
                        this.f33878o0.b(min);
                        this.f33840i2.cancel();
                        this.f33809e0.getImageReceiver().f14409t0 = true;
                        this.f33809e0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.i0.U1(this.f33854k2, fArr);
                        fArr[1] = 0.0f;
                        this.f33840i2.setInterpolator(org.telegram.ui.Components.gr.f26526j);
                        if (!this.f33865m2) {
                            this.f33840i2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f33840i2.setDuration(0L);
                        }
                        this.f33796c1.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.f33957z0));
                        if (!this.H0 && (currentItemView = this.f33871n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.h61) {
                                this.f33809e0.f38206a0 = false;
                            } else {
                                iw0 iw0Var = this.f33809e0;
                                iw0Var.f38206a0 = true;
                                iw0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f33840i2.addListener(new mw0(this, 5));
                        this.f33809e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.f33871n0.setAlpha(0.0f);
                        this.f33840i2.start();
                        this.O1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    d4();
                    ValueAnimator valueAnimator = this.f33840i2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        R4();
                        this.f33816f.setTranslationY(this.f33804d2);
                        this.f33897r.setTranslationX(m4(this.f33811e2, this.f33933v6));
                        this.f33897r.setTranslationY(n4(this.f33819f2));
                        q5();
                    }
                }
            }
            boolean z13 = this.F1;
            if (z13 && this.I1 == 2) {
                float f21 = this.f33815e6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.i0.f16166m;
                } else {
                    i14 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / f10) + i14) - (org.telegram.messenger.i0.f16171p * 21.0f));
                this.f33816f.setPivotY(klVar.getMeasuredHeight());
                this.f33816f.setScaleX(1.38f);
                this.f33816f.setScaleY(1.38f);
                this.a2 = org.telegram.messenger.i0.W1(this.R1, 42, 138) / 100.0f;
                this.f33789b2 = 0.0f;
                lw0 lw0Var3 = this.f33920u0;
                if (lw0Var3 != null) {
                    lw0Var3.setExpandProgress(1.0f);
                }
                rh.g0 g0Var2 = this.f33927v0;
                if (g0Var2 != null) {
                    g0Var2.setExpandProgress(1.0f);
                }
                this.f33809e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(q4(), 0.0f, this.R1));
                this.X.setTranslationX(org.telegram.messenger.i0.T1(f21, 0.0f, this.R1));
                this.X.setTranslationY(org.telegram.messenger.i0.T1((float) Math.ceil(translationY2), 0.0f, this.R1));
                float measuredWidth = ((this.a2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - org.telegram.messenger.i0.L(42.0f));
                this.f33831h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + measuredWidth);
                this.f33831h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + measuredWidth);
                this.f33838i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.f33838i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + measuredWidth);
                this.f33845j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.f33845j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + measuredWidth);
                this.f33852k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.f33852k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + measuredWidth);
                this.X.setScaleX(this.a2);
                this.X.setScaleY(this.a2);
                this.f33871n0.setAlpha(0.0f);
                this.f33871n0.setVisibility(0);
                iw0 iw0Var2 = this.f33809e0;
                float f22 = this.R1;
                float f23 = this.a2;
                iw0Var2.H = f22;
                iw0Var2.I = f23;
                iw0Var2.G = true;
                this.M.e(false, f22);
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                int i20 = -1;
                if (this.f33830g6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, this.f33957z0);
                }
                lVar.D(i0.b.f(this.R1, w02, -1), false);
                org.telegram.ui.Components.ll0 ll0Var = this.K;
                if (ll0Var != null) {
                    ll0Var.b(i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21005h8, this.f33957z0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f33942x;
                if (drawable != null) {
                    if (this.f33830g6 == null) {
                        i20 = i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20937dd, this.f33957z0), -1);
                    }
                    drawable.setColorFilter(i20, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.fr frVar = this.I;
                if (frVar != null) {
                    frVar.a(this.R1);
                    this.f33816f.invalidate();
                }
                org.telegram.ui.Components.fr frVar2 = this.J;
                if (frVar2 != null) {
                    frVar2.a(this.R1);
                    this.f33816f.invalidate();
                }
                t5(this.R1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), this.f33779a.getMeasuredWidth() / this.a2, this.R1);
                layoutParams4.height = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), (this.P1 + currentActionBarHeight) / this.a2, this.R1);
                this.X.requestLayout();
                q5();
            } else if (f7 <= f19) {
                if (z13) {
                    this.a2 = org.telegram.messenger.i0.W1(L3, 42, 96) / 100.0f;
                    this.f33789b2 = 0.0f;
                    f14 = 1.0f;
                } else {
                    org.telegram.ui.Components.zg0 zg0Var2 = this.f33913t0;
                    if (zg0Var2 != null) {
                        f13 = zg0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f13 = 24.0f;
                    }
                    this.a2 = org.telegram.messenger.i0.T1(f13, 96.0f, L3) / 100.0f;
                    f14 = 1.0f;
                    this.f33789b2 = 1.0f - L3;
                }
                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                if (hg0Var != null) {
                    if (this.F1) {
                        hg0Var.setAlpha(this.R1);
                    } else {
                        hg0Var.setAlpha(f14);
                    }
                }
                lw0 lw0Var4 = this.f33920u0;
                if (lw0Var4 != null) {
                    lw0Var4.invalidate();
                }
                rh.g0 g0Var3 = this.f33927v0;
                if (g0Var3 != null) {
                    g0Var3.h = this.F1;
                    float l4 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (g0Var3.f46938f != l4) {
                        g0Var3.f46938f = l4;
                        g0Var3.invalidate();
                    }
                }
                float f24 = (0.12f * L3) + 1.0f;
                ValueAnimator valueAnimator2 = this.f33840i2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f33840i2;
                    mw0 mw0Var = this.Y5;
                    valueAnimator3.removeListener(mw0Var);
                    this.f33840i2.addListener(mw0Var);
                } else {
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    d4();
                    this.X.setTranslationY((float) Math.ceil(this.Z1));
                    float L = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.i0.L(42.0f)) - org.telegram.messenger.i0.L(42.0f);
                    this.f33831h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + L);
                    this.f33831h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + L);
                    this.f33838i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                    this.f33838i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + L);
                    this.f33845j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                    this.f33845j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                    this.f33852k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                    this.f33852k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.i0.N(8.0f) + (this.X.getScaleY() * this.X.getHeight());
                if (this.F1) {
                    f15 = this.R1;
                } else {
                    f15 = L3;
                }
                float f25 = (N * f15) + floor;
                this.f33804d2 = c3.i0.z(1.0f, this.R1, 0.0f, (org.telegram.messenger.i0.L(7.0f) * L3) + org.telegram.messenger.i0.L(1.3f) + f25);
                this.f33819f2 = (((float) Math.floor(org.telegram.messenger.i0.f16171p * 11.0f)) * L3) + f25 + org.telegram.messenger.i0.L(24.0f);
                if (this.F1) {
                    f16 = (this.f33815e6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f);
                } else {
                    f16 = -org.telegram.messenger.i0.N(46.0f);
                }
                hy0 hy0Var = this.f33956y6;
                if (hy0Var != null) {
                    hy0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.f33779a.getMeasuredWidth();
                this.f33816f.setScaleX(f24);
                this.f33816f.setScaleY(f24);
                z4(0, L3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f33816f.getLayoutParams();
                float f26 = measuredWidth2 / f10;
                float min2 = f26 - (((Math.min(this.f33816f.getExactWidth(), layoutParams5.width) * f24) * 0.5f) + layoutParams5.leftMargin);
                float f27 = ((FrameLayout.LayoutParams) this.f33897r.getLayoutParams()).width;
                if (!this.p5 && this.f33897r.getExactWidth() <= (f27 - this.f33897r.getPaddingLeft()) - this.f33897r.getPaddingRight()) {
                    f17 = this.f33897r.getPaddingLeft();
                } else {
                    f17 = 0.0f;
                }
                float min3 = f26 - ((Math.min(this.f33897r.getExactWidth(), f27) * 0.5f) + (layoutParams.leftMargin + f17));
                this.f33797c2 = min2;
                this.f33811e2 = min3;
                this.f33933v6 = f17;
                if (this.F1) {
                    min2 = org.telegram.messenger.i0.T1(f16, min2, L3);
                    min3 = org.telegram.messenger.i0.T1(f16, min3, L3);
                }
                ValueAnimator valueAnimator4 = this.f33840i2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f33816f.setTranslationX(min2);
                    this.f33816f.setTranslationY(this.f33804d2);
                    this.f33897r.setTranslationX(m4(min3, this.f33933v6 * L3));
                    this.f33897r.setTranslationY(n4(this.f33819f2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f33816f.getLayoutParams();
                int i21 = layoutParams6.width;
                if (org.telegram.messenger.i0.Q1()) {
                    i13 = org.telegram.messenger.i0.L(490.0f);
                } else {
                    i13 = org.telegram.messenger.i0.f16172q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i13 - org.telegram.messenger.i0.L(f11)) / this.f33816f.getScaleX()) - (this.f33816f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i21) {
                    this.f33816f.requestLayout();
                }
                q5();
            }
            ValueAnimator valueAnimator5 = this.f33840i2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                z4(0, L3, true);
            }
        }
        w5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f33809e0.setAlpha(1.0f);
        }
    }

    public final void y5() {
        hx0 hx0Var = this.N;
        if (hx0Var != null && this.V5 != 0) {
            int topPanelShift = hx0Var.getTopPanelShift();
            int i10 = 0;
            if (topPanelShift > 0 && this.N.isAttachedToWindow()) {
                if (this.N.getParent() == this.f33779a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.N.getY()));
                }
                i10 = topPanelShift;
            }
            int i11 = this.V5 + i10;
            c5(i11, this.B5);
            c5(i11, this.T5);
        }
    }

    @Override
    public final boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
        Bundle g10 = a1.g.g("scrollToTopOnResume", true);
        if (org.telegram.messenger.o5.C(j10)) {
            g10.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.o5.E(j10)) {
            g10.putLong("user_id", j10);
        } else if (org.telegram.messenger.o5.z(j10)) {
            g10.putLong("chat_id", -j10);
        }
        if (!getMessagesController().E(g10, zxVar, null, null)) {
            return false;
        }
        org.telegram.messenger.at notificationCenter = getNotificationCenter();
        int i12 = org.telegram.messenger.at.f14786t;
        notificationCenter.n(this, i12);
        getNotificationCenter().k(i12, new Object[0]);
        presentFragment(new un(g10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.pz.g(getMessagesController().Z1(Long.valueOf(this.f33803d1)), j10, null, null, null, null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.rz.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j10, 0L, z11, i10, i11);
        }
        return true;
    }

    public final void z4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.z4(int, float, boolean):void");
    }

    public final void z5() {
        boolean z10;
        float f7;
        if (this.B5 != null && this.T5 != null) {
            hx0 hx0Var = this.N;
            int i10 = 0;
            if (hx0Var != null && hx0Var.getParent() == this.f33779a && this.N.isAttachedToWindow()) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(Math.min(this.A5, this.L5), this.Q5);
            View view = this.B5;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = max;
            }
            view.setAlpha(f7);
            this.B5.setVisibility((z10 || max <= 0.0f) ? 8 : 8);
            View view2 = this.T5;
            if (!z10) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z10) {
                this.T5.setTranslationY(-(this.N.getY() + this.f33779a.getY()));
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.st0 st0Var) {
        super(bundle);
        this.h = null;
        this.f33870n = null;
        this.f33935w0 = null;
        this.f33943x0 = new org.telegram.ui.Components.l40(this, 2);
        this.f33951y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f33781a1 = 1.0f;
        this.B1 = new a0.h();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.X1 = new HashMap();
        this.f33860l2 = new float[]{0.0f, 1.0f};
        this.f33887p2 = new Paint();
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
        this.f33784a5 = 0L;
        this.f33836h5 = new HashSet();
        this.f33850j5 = new ow0(this, 0);
        this.f33857k5 = new uw0(this);
        this.H5 = new zv0(this);
        this.L5 = 1.0f;
        this.M5 = new fe.b(0, new av0(this, 7), org.telegram.ui.Components.gr.h, 380L, true);
        this.S5 = new ow0(this, 1);
        this.Y5 = new mw0(this, 2);
        this.Z5 = null;
        this.f33837h6 = new SparseIntArray();
        this.f33851j6 = null;
        this.f33858k6 = -1;
        this.f33890p6 = new int[3];
        this.q6 = -1.0f;
        hi.b bVar = new hi.b();
        this.J6 = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.K6 = bVar2;
        this.M6 = new Paint();
        this.R6 = new int[7];
        this.Q = st0Var;
        bVar2.f48712g = new je.b();
    }

    @Override
    public final void U() {
    }
}
