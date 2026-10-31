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
public class ProfileActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, ux, org.telegram.ui.Components.st0, org.telegram.ui.Components.a40, org.telegram.ui.Components.ms0, of0 {
    public static final RectF R6 = new RectF();
    public static final int S6 = org.telegram.messenger.i0.L(16.0f);
    public int A0;
    public boolean A1;
    public int A2;
    public int A3;
    public int A4;
    public float A5;
    public int A6;
    public org.telegram.messenger.ic B0;
    public a0.h B1;
    public ArrayList B2;
    public int B3;
    public int B4;
    public View B5;
    public Boolean B6;
    public int C0;
    public boolean C1;
    public TLRPC.EncryptedChat C2;
    public int C3;
    public int C4;
    public int C5;
    public TLRPC.TL_emojiStatusCollectible C6;
    public Drawable D;
    public int D0;
    public long D1;
    public TLRPC.Chat D2;
    public int D3;
    public int D4;
    public int D5;
    public int D6;
    public Long E;
    public int E0;
    public float E1;
    public TL_bots.BotInfo E2;
    public int E3;
    public int E4;
    public int E5;
    public boolean E6;
    public org.telegram.ui.Components.d5 F;
    public boolean F0;
    public boolean F1;
    public TLRPC.ChannelParticipant F2;
    public int F3;
    public int F4;
    public int F5;
    public int F6;
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
    public final aw0 H5;
    public int H6;
    public org.telegram.ui.Components.fr I;
    public boolean I0;
    public int I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public org.telegram.ui.Components.kg0 I5;
    public final hi.b I6;
    public org.telegram.ui.Components.fr J;
    public final boolean[] J0;
    public boolean J1;
    public org.telegram.messenger.ic J2;
    public int J3;
    public int J4;
    public float J5;
    public final tg.b J6;
    public org.telegram.ui.Components.kl0 K;
    public boolean K0;
    public boolean K1;
    public final Rect K2;
    public int K3;
    public int K4;
    public int K5;
    public ei.a K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public org.telegram.ui.Cells.p8 L2;
    public int L3;
    public int L4;
    public final fe.b L5;
    public final Paint L6;
    public yx0 M;
    public boolean M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public rw0 M5;
    public Drawable M6;
    public ix0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public AnimatorSet N5;
    public Drawable N6;
    public org.telegram.ui.Components.dw0 O;
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
    public float P5;
    public org.telegram.ui.Components.dq P6;
    public org.telegram.ui.Components.rt0 Q;
    public org.telegram.ui.ActionBar.p5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public boolean Q5;
    public final int[] Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.p5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public final pw0 R5;
    public org.telegram.ui.Components.nv0 S;
    public org.telegram.ui.ActionBar.p5 S0;
    public int S1;
    public int S2;
    public int S3;
    public int S4;
    public View S5;
    public do0 T;
    public org.telegram.ui.ActionBar.p5 T0;
    public float T1;
    public int T2;
    public int T3;
    public boolean T4;
    public int T5;
    public org.telegram.ui.Components.bi0 U;
    public org.telegram.ui.ActionBar.b1 U0;
    public ValueAnimator U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.bi0 V;
    public org.telegram.ui.ActionBar.b1 V0;
    public boolean V1;
    public int V2;
    public int V3;
    public ow0 V4;
    public CharSequence V5;
    public org.telegram.ui.Components.q30 W;
    public org.telegram.ui.ActionBar.b1 W0;
    public org.telegram.messenger.o6 W1;
    public int W2;
    public int W3;
    public View W4;
    public boolean W5;
    public l0 X;
    public ImageView X0;
    public final HashMap X1;
    public int X2;
    public int X3;
    public int X4;
    public final nw0 X5;
    public fg.i Y;
    public org.telegram.ui.ActionBar.b1 Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public float[] Y5;
    public org.telegram.ui.Components.hg0 Z;
    public m4.n0 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float Z5;
    public bw0 f33772a;
    public org.telegram.messenger.pp f33773a0;
    public float f33774a1;
    public float a2;
    public int f33775a3;
    public int f33776a4;
    public long f33777a5;
    public float f33778a6;
    public org.telegram.ui.Components.tk0 f33779b;
    public org.telegram.ui.Components.bh0 f33780b0;
    public int f33781b1;
    public float f33782b2;
    public int f33783b3;
    public int f33784b4;
    public boolean f33785b5;
    public boolean f33786b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public dw0 f33787c;
    public org.telegram.ui.Components.ig0 f33788c0;
    public ky0 f33789c1;
    public float f33790c2;
    public int f33791c3;
    public int f33792c4;
    public boolean f33793c5;
    public sx0 f33794c6;
    public xx0 d;
    public org.telegram.ui.Cells.n f33795d0;
    public long f33796d1;
    public float f33797d2;
    public int f33798d3;
    public int f33799d4;
    public String f33800d5;
    public float f33801d6;
    public hy0 e;
    public jw0 f33802e0;
    public long f33803e1;
    public float f33804e2;
    public int f33805e3;
    public int f33806e4;
    public String f33807e5;
    public float f33808e6;
    public kl f33809f;
    public AnimatorSet f33810f0;
    public long f33811f1;
    public float f33812f2;
    public int f33813f3;
    public int f33814f4;
    public String f33815f5;
    public org.telegram.messenger.kp f33816f6;
    public org.telegram.ui.Cells.d4 f33817g0;
    public boolean f33818g1;
    public float f33819g2;
    public int f33820g3;
    public int f33821g4;
    public org.telegram.ui.Components.gg f33822g5;
    public final SparseIntArray f33823g6;
    public String h;
    public ImageView f33824h0;
    public long f33825h1;
    public float f33826h2;
    public int f33827h3;
    public int f33828h4;
    public final HashSet f33829h5;
    public int f33830h6;
    public ImageView f33831i0;
    public boolean f33832i1;
    public ValueAnimator f33833i2;
    public int f33834i3;
    public int f33835i4;
    public CharacterStyle f33836i5;
    public AnimatorSet f33837i6;
    public ImageView f33838j0;
    public boolean f33839j1;
    public float f33840j2;
    public int f33841j3;
    public int f33842j4;
    public final pw0 f33843j5;
    public int f33844j6;
    public ImageView f33845k0;
    public boolean f33846k1;
    public float f33847k2;
    public int f33848k3;
    public int f33849k4;
    public final vw0 f33850k5;
    public int f33851k6;
    public org.telegram.ui.Components.f11 f33852l0;
    public long l1;
    public final float[] f33853l2;
    public int f33854l3;
    public int l4;
    public boolean f33855l5;
    public boolean f33856l6;
    public org.telegram.ui.Components.mg0 m0;
    public boolean f33857m1;
    public boolean f33858m2;
    public int f33859m3;
    public int f33860m4;
    public gx0 f33861m5;
    public boolean f33862m6;
    public String f33863n;
    public kw0 f33864n0;
    public boolean f33865n1;
    public boolean f33866n2;
    public int f33867n3;
    public int f33868n4;
    public float f33869n5;
    public org.telegram.ui.Components.ei0 f33870n6;
    public ay0 f33871o0;
    public boolean f33872o1;
    public boolean f33873o2;
    public int f33874o3;
    public int f33875o4;
    public float f33876o5;
    public final int[] f33877o6;
    public org.telegram.ui.Components.r8 f33878p0;
    public boolean f33879p1;
    public final Paint f33880p2;
    public int f33881p3;
    public int f33882p4;
    public boolean p5;
    public float f33883p6;
    public org.telegram.ui.Components.b40 f33884q0;
    public boolean f33885q1;
    public boolean f33886q2;
    public int f33887q3;
    public int f33888q4;
    public boolean f33889q5;
    public CharSequence q6;
    public lw0 f33890r;
    public int f33891r0;
    public boolean f33892r1;
    public xh.o0 f33893r2;
    public int f33894r3;
    public int f33895r4;
    public ImageReceiver f33896r5;
    public CharSequence f33897r6;
    public org.telegram.ui.Components.ei0 f33898s;
    public org.telegram.ui.Components.f11 f33899s0;
    public boolean f33900s1;
    public xh.n f33901s2;
    public int f33902s3;
    public int f33903s4;
    public FrameLayout f33904s5;
    public boolean f33905s6;
    public org.telegram.ui.Components.yg0 f33906t0;
    public int f33907t1;
    public TLRPC.ChatFull f33908t2;
    public int f33909t3;
    public int f33910t4;
    public FrameLayout[] f33911t5;
    public float f33912t6;
    public mw0 f33913u0;
    public boolean f33914u1;
    public TLRPC.UserFull f33915u2;
    public int f33916u3;
    public int f33917u4;
    public SpannableStringBuilder f33918u5;
    public float f33919u6;
    public rh.g0 f33920v0;
    public boolean f33921v1;
    public org.telegram.ui.Cells.i6 f33922v2;
    public int f33923v3;
    public int f33924v4;
    public SpannableStringBuilder f33925v5;
    public float f33926v6;
    public AnimatorSet f33927w;
    public View f33928w0;
    public boolean f33929w1;
    public boolean f33930w2;
    public int f33931w3;
    public int f33932w4;
    public vh.d[] f33933w5;
    public float f33934w6;
    public Drawable f33935x;
    public final org.telegram.ui.Components.l40 f33936x0;
    public int f33937x1;
    public ly0 f33938x2;
    public int f33939x3;
    public int f33940x4;
    public org.telegram.messenger.video.o f33941x5;
    public iy0 f33942x6;
    public Drawable f33943y;
    public final Paint f33944y0;
    public boolean f33945y1;
    public CharSequence f33946y2;
    public int y3;
    public int f33947y4;
    public FrameLayout f33948y5;
    public oy0 f33949y6;
    public org.telegram.ui.ActionBar.p6 f33950z0;
    public boolean f33951z1;
    public long f33952z2;
    public int f33953z3;
    public int f33954z4;
    public vh.d f33955z5;
    public vh.p2 f33956z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void F3(ProfileActivity profileActivity, boolean z10) {
        Drawable t10 = profileActivity.f33802e0.getImageReceiver().t();
        String str = null;
        if (t10 instanceof org.telegram.ui.Components.g61) {
            profileActivity.f33802e0.w(null, null, t10);
        } else if (t10 instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) t10;
            profileActivity.f33802e0.w(null, null, s5Var);
            if (z10) {
                s5Var.f(profileActivity.f33802e0);
            }
        } else {
            org.telegram.messenger.ic D = profileActivity.f33864n0.D(0);
            if (D != null && D.f16109p == 2) {
                str = "avatar";
            }
            profileActivity.f33802e0.w(D, str, t10);
        }
    }

    public static int I0(ProfileActivity profileActivity) {
        int i10;
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (lVar != null && lVar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
    }

    public static void M3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = R6;
            if (zg.h.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                yg.d.b(new sa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void N0(ProfileActivity profileActivity, int i10) {
        boolean F0 = org.telegram.ui.Components.zt0.F0(profileActivity.N.getClosestTab());
        if (i10 == profileActivity.D6 && F0 == profileActivity.E6) {
            return;
        }
        profileActivity.D6 = i10;
        profileActivity.E6 = F0;
        if (F0) {
            if (i10 > 0) {
                profileActivity.f33933w5[0].i(org.telegram.messenger.cd.G(i10, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                profileActivity.f33933w5[0].i(profileActivity.f33925v5, true, true);
            }
        } else if (i10 <= 0 && org.telegram.messenger.vp.r1(profileActivity.currentAccount).T4()) {
            profileActivity.f33933w5[0].i(profileActivity.f33918u5, true, true);
        } else {
            profileActivity.f33933w5[0].i(org.telegram.messenger.cd.G(i10, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public static ValueAnimator O0(ProfileActivity profileActivity, final boolean z10) {
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
        rh.g0 g0Var = profileActivity.f33920v0;
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
        profileActivity.f33779b.setTranslationY(f11);
        profileActivity.f33779b.setVisibility(0);
        profileActivity.T0.setVisibility(0);
        profileActivity.f33772a.setVisibility(0);
        profileActivity.x4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f33809f.setVisibility(0);
        profileActivity.f33890r.setVisibility(0);
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
        profileActivity.f33779b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.q0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new xw0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.S4();
            org.telegram.messenger.i0.Y2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f26495f);
        profileActivity.U1 = ofFloat;
        return ofFloat;
    }

    public static void U4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        x1Var.f21488i0 = false;
        x1Var.show();
        Utilities.e.c(new bk0(x1Var, z10, activity, 6));
    }

    public static SpannableStringBuilder V3(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        g00 g00Var = new g00(9);
        g00Var.f37381w = str;
        if (g00Var.f37376c != null) {
            g00Var.f37376c = null;
            g00Var.a();
        }
        g00Var.f37377f = w02;
        g00Var.f37378n = false;
        spannableStringBuilder.setSpan(g00Var, 0, spannableStringBuilder.length(), 0);
        g00[] g00VarArr = (g00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), g00.class);
        if (g00VarArr != null) {
            for (g00 g00Var2 : g00VarArr) {
                g00Var2.getClass();
                g00Var2.f37377f = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                g00Var2.f37379r = i10;
                g00Var2.f37380s = p6Var;
                g00Var2.f37378n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void X4(FrameLayout frameLayout, float f7) {
        int i10;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(S6 * f7);
        frameLayout.setAlpha(1.0f - f7);
        if (f7 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    public static void Y(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.iz0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f33950z0);
    }

    public static void Z(ProfileActivity profileActivity) {
        TLRPC.Document e;
        org.telegram.ui.Components.wb h;
        if (profileActivity.I2 == null) {
            if (profileActivity.f33879p1 && !profileActivity.getMessagesController().A3()) {
                ArrayList l4 = profileActivity.getMessagesController().f18891r7.l(profileActivity.f33803e1);
                if (l4 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < l4.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l4.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f19845id == profileActivity.f33811f1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (e = org.telegram.ui.Components.f5.e(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.cc.a0(profileActivity).h(e, 1, new ov0(profileActivity, 2))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.Z3()) {
                profileActivity.J4(false);
            }
        }
    }

    public static void Z0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
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

    public static void a0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.Y3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.I5();
                profileActivity.d.f();
            } else {
                profileActivity.C5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (!profileActivity.f33858m2 && !org.telegram.messenger.i0.Q1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.i0.f16020m;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f33772a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f33772a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    xx0 xx0Var = profileActivity.d;
                    if (i12 >= xx0Var.e.M2) {
                        break;
                    }
                    s4.c1 a2 = xx0Var.a(null, xx0Var.d(i12));
                    View view = a2.f47898a;
                    profileActivity.d.t(a2, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.i4() + i13) + i11));
                bw0 bw0Var = profileActivity.f33772a;
                bw0Var.setPadding(0, bw0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f33772a.setPadding(0, profileActivity.i4(), 0, 0);
                profileActivity.f33833i2.cancel();
                float[] fArr = profileActivity.f33853l2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.W4(1.0f);
                profileActivity.P1 = profileActivity.i4();
            }
        }
        profileActivity.L.m(profileActivity.f33825h1, user, 8);
    }

    public static void b0(org.telegram.ui.ProfileActivity r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.b0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void b5(int i10, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i10) {
            view.getLayoutParams().height = i10;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i10);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void c0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.u5 u5Var) {
        TLRPC.EmojiStatus emojiStatus;
        org.telegram.messenger.ic b10;
        String str;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            gf.f.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        kg.v1 v1Var = new kg.v1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f33950z0);
        u5Var.getLocationOnScreen(new int[2]);
        v1Var.f11305n2 = u5Var.f21362h0;
        v1Var.f11306o2 = u5Var.f21363i0;
        v1Var.f11309r2 = u5Var.getScaleX();
        v1Var.f11307p2 = u5Var.getLeft();
        v1Var.f11308q2 = u5Var.getTop();
        v1Var.f11310s2 = u5Var;
        Drawable rightDrawable = u5Var.getRightDrawable();
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (rightDrawable == d5Var && d5Var != null) {
            Drawable drawable = d5Var.f25301f[0];
            if (drawable instanceof org.telegram.ui.Components.f5) {
                v1Var.f11309r2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.f5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(profileActivity.getParentActivity());
                    org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, false);
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.ic.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f14875f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.jj.K2(document, false)) {
                            d.e = 512;
                            d.f14875f = 512;
                        }
                        b10 = org.telegram.messenger.ic.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.ic icVar = b10;
                    g9Var.setLayerNum(7);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                    g9Var.m(icVar, str2, org.telegram.messenger.ic.c(w9, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.f5) profileActivity.F.f25301f[0]).c()) {
                        g9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21259v6, profileActivity.f33950z0), PorterDuff.Mode.SRC_IN));
                        v1Var.f11312u2 = org.telegram.messenger.jj.j1(document);
                    } else {
                        v1Var.f11312u2 = org.telegram.messenger.jj.j1(document);
                    }
                    v1Var.f11311t2 = g9Var;
                    v1Var.f11314w2 = true;
                }
            }
        }
        profileActivity.showDialog(v1Var);
    }

    public static void c1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.f33782b2, 0.25f) / 0.25f;
        float f7 = 1.0f;
        if (profileActivity.f33879p1) {
            profileActivity.f33906t0.setAlpha(1.0f - min);
            profileActivity.f33906t0.setBlurIntensity(0.0f);
            int i10 = 0;
            profileActivity.f33906t0.setGooeyEnabled(false);
            org.telegram.ui.Components.yg0 yg0Var = profileActivity.f33906t0;
            if (profileActivity.f33782b2 >= 1.0f) {
                i10 = 8;
            }
            yg0Var.setVisibility(i10);
        } else {
            profileActivity.f33906t0.setHideProgress(profileActivity.f33782b2);
        }
        mw0 mw0Var = profileActivity.f33913u0;
        if (mw0Var != null && profileActivity.I1 != 2) {
            float f10 = profileActivity.f33782b2;
            if (f10 > 0.0f) {
                f7 = org.telegram.messenger.i0.T1(1.0f, 0.0f, org.telegram.messenger.i0.z1(f10, 0.0f, 0.5f));
            }
            mw0Var.setAlpha(f7);
        }
        profileActivity.w5();
    }

    public static void c5(org.telegram.ui.ActionBar.p5 p5Var, boolean z10, boolean z11) {
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

    public static void d0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19817id;
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
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.ic.m(profileActivity.currentAccount, 1, Z1));
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
            profileActivity.getMessagesController().T0(Z1.f19942id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Z1);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull a2 = profileActivity.getMessagesController().a2(profileActivity.f33796d1);
            if (a2 != null) {
                a2.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(a2, false);
            }
        }
        if (!org.telegram.messenger.i0.Q1() && !profileActivity.f33858m2 && profileActivity.f33802e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f33866n2 = z10;
        profileActivity.H2 = null;
        profileActivity.I2 = null;
        kw0 kw0Var = profileActivity.f33864n0;
        kw0Var.H0 = true;
        kw0Var.K0 = profileActivity.J2;
        kw0Var.f30941q1 = null;
        kw0Var.f30942r1 = null;
        kw0Var.setCreateThumbFromParent(false);
        profileActivity.H5(true);
        profileActivity.i5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.f19676r, Integer.valueOf(org.telegram.messenger.vp.D8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.f19632j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean e0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.vp.r1(profileActivity.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + profileActivity.f33825h1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (org.telegram.messenger.w3.T(profileActivity.D2) && !profileActivity.D2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.u70.f30855q1;
        org.telegram.ui.Components.u70.J0(parentActivity, profileActivity, org.telegram.ui.Components.cc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.I5();
            xx0 xx0Var = profileActivity.d;
            if (xx0Var != null) {
                xx0Var.f();
            }
        }
        if (k2Var instanceof un) {
            ((un) k2Var).Ob(false, true);
        }
        return false;
    }

    public static void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.vp.r1(profileActivity.currentAccount).l0(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    public static void g0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(profileActivity).Q(2131623989, 36, org.telegram.messenger.cd.L0(2131746871, null));
            Q.f32135j = 5000;
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
                String L0 = org.telegram.messenger.cd.L0(2131746867, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746868, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                profileActivity.showDialog(x1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity), 2131624011, 36);
    }

    public static void h0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            xh.z2.I0(context, profileActivity.currentAccount, profileActivity.f33915u2.starref_program, profileActivity.getUserConfig().e(), profileActivity.f33950z0, false);
        } else {
            xh.z2.J0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f33950z0);
        }
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.H2 = fileLocation;
            profileActivity.I2 = photoSize2.location;
            profileActivity.f33802e0.j(org.telegram.messenger.ic.e(fileLocation), "50_50", profileActivity.f33878p0, null);
            if (profileActivity.N2 != -1) {
                profileActivity.I5();
                xx0 xx0Var = profileActivity.d;
                if (xx0Var != null) {
                    xx0Var.f();
                }
                profileActivity.x4(true);
            }
            kw0 kw0Var = profileActivity.f33864n0;
            org.telegram.messenger.ic e = org.telegram.messenger.ic.e(profileActivity.I2);
            profileActivity.J2 = e;
            kw0Var.A(e, org.telegram.messenger.ic.e(profileActivity.H2));
            profileActivity.i5(true, false);
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
            profileActivity.f33830h6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ul0(6, profileActivity, str));
        }
        profileActivity.actionBar.p().requestLayout();
    }

    public static void j0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User Z1;
        TLRPC.ChatParticipant chatParticipant;
        xx0 xx0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f33772a.C0();
        if (i10 == profileActivity.R3) {
            TLRPC.User Z12 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33796d1));
            TLRPC.UserFull userFull = profileActivity.f33915u2;
            if (userFull != null && userFull.starref_program != null) {
                long e = profileActivity.getUserConfig().e();
                rh.r.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e, profileActivity.f33796d1, new au(profileActivity, context, e, 2));
            } else if (Z12 == null || !Z12.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new xh.i(profileActivity.f33796d1));
            }
        } else if (i10 == profileActivity.P3) {
            boolean z10 = !profileActivity.getMessagesController().q2(j10, profileActivity.f33811f1, null);
            profileActivity.getNotificationsController().G(j10, profileActivity.f33811f1, z10);
            org.telegram.ui.Components.cc.A(profileActivity, z10, null).j();
            profileActivity.u5();
            int i11 = profileActivity.P3;
            if (i11 < 0 || (xx0Var = profileActivity.d) == null) {
                return;
            }
            xx0Var.g(i11);
        } else if (i10 == profileActivity.Y3) {
            TLRPC.User Z13 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33796d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", Z13.f19942id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f33800d5);
            bundle.putString("first_name_card", profileActivity.f33807e5);
            bundle.putString("last_name_card", profileActivity.f33815f5);
            ns nsVar = new ns(bundle, profileActivity.f33950z0);
            nsVar.O = new gv0(profileActivity, Z13);
            profileActivity.presentFragment(nsVar);
        } else if (i10 == profileActivity.V3) {
            TextView textView = (TextView) org.telegram.ui.Components.s4.h0(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751509, null), org.telegram.messenger.cd.L0(2131751593, null), org.telegram.messenger.cd.L0(2131751592, null), org.telegram.messenger.cd.L0(2131751599, null), new ov0(profileActivity, 1), profileActivity.f33950z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        } else if (i10 == profileActivity.W3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33950z0);
            String L0 = org.telegram.messenger.cd.L0(2131746228, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746249, null);
            TLRPC.Chat L02 = profileActivity.getMessagesController().L0(Long.valueOf(-profileActivity.f33777a5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (L02 != null && org.telegram.messenger.w3.w(2, L02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.f33950z0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                c2VarArr[0].setOnClickListener(new u10(c2VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746247, null), new ep0(9, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(23));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        } else if (i10 == profileActivity.f33888q4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.f33825h1 & 4294967295L));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.k2(bundle2));
        } else if (i10 == profileActivity.f33882p4) {
            profileActivity.showDialog(org.telegram.ui.Components.s4.U(profileActivity.getParentActivity(), profileActivity.C2, profileActivity.f33950z0).f20134a);
        } else if (i10 == profileActivity.M3) {
            profileActivity.E4(view, f7, f10, false);
        } else if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().c5(null, profileActivity.f33796d1);
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
            profileActivity.H4();
        } else if (i10 == profileActivity.U3) {
            c01.K0(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f33910t4 && i10 < profileActivity.f33917u4) {
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant = profileActivity.f33908t2.participants.participants.get(((Integer) profileActivity.B2.get(i10 - profileActivity.f33910t4)).intValue());
            } else {
                chatParticipant = profileActivity.f33908t2.participants.participants.get(i10 - profileActivity.f33910t4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f33924v4) {
            profileActivity.I4();
        } else if (i10 == profileActivity.K3) {
            profileActivity.P4(f7, f10, i10, view);
        } else if (i10 == profileActivity.f33849k4) {
            if (profileActivity.D2 != null) {
                profileActivity.showDialog(new yh.a0(profileActivity, profileActivity.D2.linked_community_id, null, null));
            } else if (profileActivity.f33796d1 == 0 || (Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33796d1))) == null) {
            } else {
                profileActivity.showDialog(new yh.a0(profileActivity, Z1.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.H3) {
            if (profileActivity.f33908t2.location instanceof TLRPC.TL_channelLocation) {
                yb0 yb0Var = new yb0(5);
                yb0Var.f43797n0 = -profileActivity.f33803e1;
                yb0Var.H0 = (TLRPC.TL_channelLocation) profileActivity.f33908t2.location;
                profileActivity.presentFragment(yb0Var);
            }
        } else if (i10 == profileActivity.L4) {
            profileActivity.D4(false);
        } else if (i10 == profileActivity.f33932w4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f33803e1);
            bundle3.putInt("type", 2);
            pr prVar = new pr(bundle3);
            prVar.B0(profileActivity.f33908t2);
            profileActivity.presentFragment(prVar);
        } else if (i10 == profileActivity.f33940x4) {
            profileActivity.presentFragment(new kg.q1(profileActivity.f33803e1));
        } else if (i10 == profileActivity.f33947y4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f33803e1);
            bundle4.putInt("type", 1);
            pr prVar2 = new pr(bundle4);
            prVar2.B0(profileActivity.f33908t2);
            profileActivity.presentFragment(prVar2);
        } else if (i10 == profileActivity.f33954z4) {
            profileActivity.R0.performClick();
        } else if (i10 == profileActivity.A4) {
            profileActivity.presentFragment(new rh.i(0, profileActivity.f33796d1));
        } else if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new rh.i(1, profileActivity.f33796d1));
        } else if (i10 == profileActivity.C4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f33803e1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new u61(bundle5));
        } else if (i10 == profileActivity.F4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f33803e1);
            bundle6.putInt("type", 0);
            pr prVar3 = new pr(bundle6);
            prVar3.B0(profileActivity.f33908t2);
            profileActivity.presentFragment(prVar3);
        } else if (i10 == profileActivity.f33805e3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f33820g3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.G2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.C0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f33827h3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f33834i3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f33841j3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f33854l3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f33848k3) {
            profileActivity.presentFragment(new bb0());
        } else if (i10 == profileActivity.f33859m3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f33881p3) {
            profileActivity.showDialog(org.telegram.ui.Components.s4.T(profileActivity, profileActivity.f33950z0));
        } else if (i10 == profileActivity.f33887q3) {
            gf.f.r(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
        } else if (i10 == profileActivity.f33894r3) {
            gf.f.r(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
        } else if (i10 == profileActivity.f33916u3) {
            U4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f33923v3) {
            U4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f33931w3) {
            org.telegram.messenger.f8.a();
        } else if (i10 == profileActivity.f33939x3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33950z0);
            String L03 = org.telegram.messenger.cd.L0(2131754120, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
            x1Var2.T = L03;
            x1Var2.R = org.telegram.messenger.cd.L0(2131689472, null);
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), new bv0(profileActivity, 9));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            profileActivity.showDialog(x1Var2);
        } else if (i10 == profileActivity.f33813f3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.U2) {
            profileActivity.presentFragment(new oa(null));
        } else if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new f(3));
        } else if (i10 == profileActivity.N2) {
            profileActivity.H4();
        } else if (i10 == profileActivity.f33784b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f33792c4) {
            profileActivity.presentFragment(new rh.h8());
        } else if (i10 == profileActivity.f33799d4) {
            profileActivity.presentFragment(new wh.g());
        } else if (i10 == profileActivity.f33806e4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f33814f4) {
            mg.i2.l1(0, org.telegram.messenger.y1.a(profileActivity.currentAccount).b());
        } else if (i10 == profileActivity.botPermissionLocation) {
            xh.o0 o0Var = profileActivity.f33893r2;
            if (o0Var != null) {
                o0Var.l(!o0Var.g(), new et0(13, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            xh.n nVar = profileActivity.f33901s2;
            if (nVar != null) {
                nVar.f53914f = true;
                nVar.e = !nVar.e;
                nVar.k();
                ((org.telegram.ui.Cells.p8) view).setChecked(profileActivity.f33901s2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setChecked(!p8Var.d());
            if (profileActivity.f33868n4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f33868n4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().n1(profileActivity.f33796d1);
            boolean d = p8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f33915u2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new ul0(5, profileActivity, r1));
            profileActivity.f33868n4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.N3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.S4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.N3);
            int i12 = profileActivity.f33844j6;
            if (i12 >= 0) {
                profileActivity.f33787c.h1(i12, profileActivity.f33851k6 - profileActivity.f33772a.getPaddingTop());
            }
        } else if (i10 == profileActivity.O3) {
            profileActivity.M4(false);
        } else if (i10 == profileActivity.P2) {
            if (profileActivity.f33915u2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f33915u2.personal_channel_id);
            profileActivity.presentFragment(new un(bundle7));
        } else if (i10 == profileActivity.T2) {
            oy0 oy0Var = profileActivity.f33949y6;
            if ((oy0Var == null || !oy0Var.a()) && !profileActivity.Y3(i10, view)) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (z8Var.d.getDrawable() != null) {
                    profileActivity.G4(z8Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.G3) {
            profileActivity.X3(i10, view);
        } else {
            profileActivity.P4(f7, f10, i10, view);
        }
    }

    public static void k0(ProfileActivity profileActivity) {
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
        final TLRPC.UserFull userFull = profileActivity.f33915u2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(profileActivity.getParentActivity(), false, 1, null);
            mg.l1 l1Var2 = h.f21621x0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(2131231163, 0, 0, profileActivity.getParentActivity(), profileActivity.f33950z0);
            if (profileActivity.a() != org.telegram.messenger.d20.i(profileActivity.currentAccount).e()) {
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
                    org.telegram.ui.ActionBar.a7.V(p80VarArr[i13], org.telegram.ui.ActionBar.t6.f21311y6, null);
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
                if (profileActivity.a() == org.telegram.messenger.d20.i(profileActivity.currentAccount).e()) {
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
                    org.telegram.ui.ActionBar.a7.V(p80VarArr[0], org.telegram.ui.ActionBar.t6.f21170q7, null);
                    if (z12) {
                        objArr[0].setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        objArr[0].setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131745190, org.telegram.messenger.o5.l(org.telegram.messenger.d20.f15147s0, profileActivity.a()))));
                    }
                    c10 = 0;
                } else {
                    objArr = p80VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = org.telegram.messenger.cd.H(',', "StarRatingFuture", max);
                    String H2 = org.telegram.messenger.cd.H(',', "StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i15] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c10 = 0;
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131745204, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i16 = r4;
                            s3 s3Var2 = s3Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (i16) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    s3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.R6;
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
                                    RectF rectF = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    s3Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.R6;
                                    limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    s3Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = org.telegram.messenger.cd.H(',', "StarRatingFuturePreview1", max);
                String H4 = org.telegram.messenger.cd.H(',', "StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i15] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131745203, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i16 = r4;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.R6;
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
                                RectF rectF = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.R6;
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
            textView.setText(org.telegram.messenger.cd.L0(2131745185, null));
            textView.setTextSize(1, 20.0f);
            int i16 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(textView, i16, profileActivity.f33950z0);
            linearLayout.addView(textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.f19943id == org.telegram.messenger.d20.i(profileActivity.currentAccount).e()) {
                textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131745186, null)));
                i10 = 1;
            } else {
                i10 = 1;
                org.telegram.messenger.m5.q(null, null, 2131745216, new Object[]{org.telegram.messenger.o5.l(org.telegram.messenger.d20.f15147s0, profileActivity.a())}, textView2);
            }
            textView2.setTextSize(i10, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, i16, profileActivity.f33950z0);
            linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 20, 0, 20, 12));
            st0 st0Var = new st0(parentActivity, profileActivity.f33950z0);
            st0Var.f41644a.l(org.telegram.messenger.cd.L0(2131745184, null), false);
            String L0 = org.telegram.messenger.cd.L0(2131745219, null);
            int i17 = org.telegram.ui.ActionBar.t6.Ci;
            st0Var.f41645b.setText(org.telegram.messenger.cd.V(null, null, 2131745215, V3(L0, i17, profileActivity.f33950z0)));
            st0Var.d.setVisibility(8);
            ImageView imageView = st0Var.f41646c;
            imageView.setImageResource(2131231826);
            org.telegram.ui.ActionBar.p6 p6Var = profileActivity.f33950z0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, mode);
            linearLayout.addView(st0Var, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            st0 st0Var2 = new st0(parentActivity, profileActivity.f33950z0);
            st0Var2.f41644a.l(org.telegram.messenger.cd.L0(2131745183, null), false);
            st0Var2.f41645b.setText(org.telegram.messenger.cd.V(null, null, 2131745214, V3(org.telegram.messenger.cd.L0(2131745219, null), i17, profileActivity.f33950z0)));
            st0Var2.d.setVisibility(8);
            ImageView imageView2 = st0Var2.f41646c;
            imageView2.setImageResource(2131231890);
            org.telegram.ui.ActionBar.a7.t(imageView2, i16, profileActivity.f33950z0, mode);
            linearLayout.addView(st0Var2, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            st0 st0Var3 = new st0(parentActivity, profileActivity.f33950z0);
            st0Var3.f41644a.l(org.telegram.messenger.cd.L0(2131745182, null), false);
            String L02 = org.telegram.messenger.cd.L0(2131745217, null);
            if (org.telegram.ui.ActionBar.t6.I.q()) {
                w02 = i0.b.f(0.25f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21095m6, profileActivity.f33950z0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, profileActivity.f33950z0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L02);
            g00 g00Var = new g00(9);
            g00Var.f37381w = L02;
            if (g00Var.f37376c != null) {
                str = null;
                g00Var.f37376c = null;
                g00Var.a();
            } else {
                str = null;
            }
            g00Var.f37377f = w02;
            g00Var.f37378n = false;
            spannableStringBuilder3.setSpan(g00Var, 0, spannableStringBuilder3.length(), 0);
            st0Var3.f41645b.setText(org.telegram.messenger.cd.V(str, str, 2131745213, spannableStringBuilder3));
            st0Var3.d.setVisibility(8);
            ImageView imageView3 = st0Var3.f41646c;
            imageView3.setImageResource(2131231874);
            org.telegram.ui.ActionBar.a7.t(imageView3, i16, profileActivity.f33950z0, mode);
            linearLayout.addView(st0Var3, w7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            vh.d dVar = new vh.d(parentActivity, profileActivity.f33950z0, true);
            dVar.setOnClickListener(new vv0(0, l1Var));
            dVar.i(rh.e4.g2(org.telegram.messenger.cd.L0(2131743913, null)), false, true);
            linearLayout.addView(dVar, w7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.N = linearLayout;
            h.show();
        }
    }

    public static void l0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f33879p1;
                if (z10) {
                    if (z10) {
                        profileActivity.b4();
                        return;
                    }
                    return;
                } else if (profileActivity.f33796d1 != 0) {
                    profileActivity.K4();
                    return;
                } else if (profileActivity.f33803e1 != 0) {
                    if (org.telegram.messenger.w3.c0(profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f33803e1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f33803e1);
                        if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                            profileActivity.presentFragment(new un(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.b4()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f33803e1);
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
                profileActivity.E4(profileActivity.Z, f7, f10, true);
                return;
            case 2:
                profileActivity.L4();
                return;
            case 3:
                profileActivity.C4();
                return;
            case 4:
                profileActivity.F4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.B4(false);
                return;
            case 6:
                profileActivity.B4(true);
                return;
            case 7:
                profileActivity.D4(true);
                return;
            case 8:
                c01.K0(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.v4(false);
                return;
            case 12:
                profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, profileActivity.getParentActivity(), profileActivity.f33950z0);
                x1Var.r(200L);
                org.telegram.messenger.vp.r1(profileActivity.currentAccount).O1().k(profileActivity.a(), new org.telegram.ui.Components.vg(27, profileActivity, x1Var), true, profileActivity.f33950z0);
                return;
            case 13:
                profileActivity.A4(true);
                return;
            case 14:
                profileActivity.H4();
                return;
            case 15:
                TLRPC.User f11 = profileActivity.getUserConfig().f();
                if (f11 != null) {
                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(profileActivity, profileActivity.Z);
                    H.f32944w = false;
                    H.f32923i = 3;
                    H.c(2131232319, org.telegram.messenger.cd.L0(2131746515, null), new oa0(profileActivity, 24), false);
                    H.c(2131232102, org.telegram.messenger.cd.L0(2131746693, null), new wv0(f11, 1), false);
                    H.c(2131232115, org.telegram.messenger.cd.L0(2131746635, null), new oa0(profileActivity, 26), false);
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
                profileActivity.presentFragment(new e51(null));
                return;
            default:
                return;
        }
    }

    public static void m0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f33773a0 == null) {
            if (MediaController.B().Q0 != null && MediaController.B().Q0.f17467a == profileActivity.currentAccount && MediaController.B().Q0.f17468b == profileActivity.a()) {
                profileActivity.f33773a0 = MediaController.B().Q0;
            } else {
                org.telegram.messenger.pp ppVar = new org.telegram.messenger.pp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f33773a0 = ppVar;
                TLRPC.UserFull userFull = profileActivity.f33915u2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = ppVar.f17469c;
                    arrayList.clear();
                    ppVar.b();
                    arrayList.add(0, ppVar.d(document));
                }
            }
        }
        if (!profileActivity.f33773a0.f17469c.isEmpty()) {
            if (MediaController.B().Q0 == profileActivity.f33773a0 && MediaController.B().I((org.telegram.messenger.jj) profileActivity.f33773a0.f17469c.get(0))) {
                z10 = true;
            } else {
                MediaController.B().o();
                z10 = false;
            }
            MediaController.B().Q0 = profileActivity.f33773a0;
            MediaController.B().R0.clear();
            MediaController.B().R0.addAll(profileActivity.f33773a0.f17469c);
            if (!z10) {
                MediaController.B().S((org.telegram.messenger.jj) profileActivity.f33773a0.f17469c.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.w7(profileActivity.getParentActivity(), profileActivity.f33950z0));
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.gb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new oa0(profileActivity, 20), profileActivity.f33950z0);
    }

    public static void o0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().n1(profileActivity.f33796d1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().i1(profileActivity.f33777a5);
        tL_messages_reportReaction.f19901id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ag.c3(22));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f33777a5, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33796d1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.C5(false, false);
        org.telegram.ui.Components.cc.a0(profileActivity).E(profileActivity.f33950z0).j();
    }

    public static void p0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f33796d1;
        if (j10 == 0) {
            long j11 = profileActivity.f33803e1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f33825h1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            org.telegram.messenger.vp.r1(profileActivity.currentAccount).W(profileActivity.f33777a5, j12);
        } else {
            org.telegram.messenger.vp.r1(profileActivity.currentAccount).h0(profileActivity.f33777a5, profileActivity.Z4, j12);
        }
        profileActivity.Z4 = 0;
        profileActivity.C5(false, false);
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(profileActivity.getParentActivity(), profileActivity.f33950z0);
        ebVar.d(2131623981, new String[0]);
        ebVar.f25745b.setText(org.telegram.messenger.cd.L0(2131746419, null));
        org.telegram.ui.Components.cc.a0(profileActivity).b(ebVar, 1500).j();
    }

    public static void q0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
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
        profileActivity.f33779b.setTranslationY(floatValue * f7);
        profileActivity.O.setTranslationY(f7 * profileActivity.T1);
        profileActivity.f33772a.setTranslationY((1.0f - profileActivity.T1) * f13);
        profileActivity.f33772a.setScaleX(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f33772a.setScaleY(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.f33772a.setAlpha(profileActivity.T1);
        boolean z11 = true;
        profileActivity.x4(true);
        profileActivity.f33772a.setAlpha(f10);
        profileActivity.f33779b.setAlpha(1.0f - profileActivity.T1);
        profileActivity.f33779b.setScaleX((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.f33779b.setScaleY((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f10);
        profileActivity.X.setAlpha(f10);
        profileActivity.f33802e0.setAlpha(f10);
        mw0 mw0Var = profileActivity.f33913u0;
        if (mw0Var != null) {
            mw0Var.setAlpha(f10);
        }
        profileActivity.f33809f.setAlpha(f10);
        lw0 lw0Var = profileActivity.f33890r;
        if (!profileActivity.Q5) {
            f12 = f10;
        }
        lw0Var.setAlpha(f12);
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
        profileActivity.f33789c1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void r1(ProfileActivity profileActivity) {
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

    public static void x1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        float f7;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f33772a.setVisibility(i10);
        org.telegram.ui.Components.tk0 tk0Var = profileActivity.f33779b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        tk0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.T0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        rh.g0 g0Var = profileActivity.f33920v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        profileActivity.actionBar.y(z10);
        profileActivity.X.setVisibility(i10);
        mw0 mw0Var = profileActivity.f33913u0;
        if (mw0Var != null) {
            mw0Var.setVisibility(i10);
        }
        profileActivity.f33809f.setVisibility(i10);
        profileActivity.f33890r.setVisibility(i10);
        org.telegram.ui.ActionBar.p5 p5Var = profileActivity.S0;
        if (p5Var != null) {
            p5Var.setAlpha(1.0f);
            profileActivity.S0.setVisibility(i10);
        }
        profileActivity.T0.setVisibility(i10);
        profileActivity.f33802e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        mw0 mw0Var2 = profileActivity.f33913u0;
        if (mw0Var2 != null) {
            mw0Var2.setAlpha(1.0f);
        }
        rh.g0 g0Var2 = profileActivity.f33920v0;
        if (g0Var2 != null) {
            g0Var2.setAlpha(1.0f);
        }
        profileActivity.f33809f.setAlpha(1.0f);
        lw0 lw0Var = profileActivity.f33890r;
        if (profileActivity.Q5) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        lw0Var.setAlpha(f7);
        profileActivity.T0.setAlpha(1.0f);
        profileActivity.f33772a.setAlpha(1.0f);
        profileActivity.f33779b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z10) {
            profileActivity.f33779b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public static ProfileActivity z4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public final void A4(boolean z10) {
        boolean z11;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1));
        if (Z1 != null) {
            if (this.f33886q2 && !org.telegram.messenger.vp.E2(Z1)) {
                if (this.f33839j1 && !z10) {
                    getMessagesController().c5(new oa0(this, 6), this.f33796d1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.D2;
                if (this.C2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.s4.r(this, false, chat, Z1, z11, true, false, true, new gv0(this, Z1));
            } else if (this.f33839j1) {
                getMessagesController().c5(null, this.f33796d1);
                if (org.telegram.ui.Components.cc.a(this)) {
                    org.telegram.ui.Components.cc.d(this, false).j();
                }
            } else if (this.f33846k1) {
                org.telegram.ui.Components.s4.i0(this, this.f33796d1, Z1, null, this.C2, false, null, new ra(this, 4), this.f33950z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f33950z0);
                String L0 = org.telegram.messenger.cd.L0(2131753692, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name)));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753693, null), new bv0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, this.f33950z0);
                }
            }
        }
    }

    public final void A5(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.S0 != null) {
            boolean z16 = this.Q5;
            boolean z17 = !z16;
            boolean z18 = this.f33873o2;
            org.telegram.ui.ActionBar.p5 p5Var = this.P0;
            boolean z19 = false;
            if (!z16 && !z18 && this.L0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c5(p5Var, z11, z10);
            org.telegram.ui.ActionBar.p5 p5Var2 = this.Q0;
            if (!z16 && !z18 && this.M0) {
                z12 = true;
            } else {
                z12 = false;
            }
            c5(p5Var2, z12, z10);
            org.telegram.ui.ActionBar.p5 p5Var3 = this.R0;
            if (!z16 && !z18 && this.N0) {
                z13 = true;
            } else {
                z13 = false;
            }
            c5(p5Var3, z13, z10);
            ix0 ix0Var = this.N;
            if (ix0Var != null && ix0Var.I != null && ix0Var.t0(ix0Var.getClosestTab())) {
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
            c5(p5Var4, z17, z15);
            ix0 ix0Var2 = this.N;
            if (ix0Var2 != null) {
                boolean z20 = this.Q5;
                if (z10 && !z14) {
                    z19 = true;
                }
                if (ix0Var2.f33218p2 != z20) {
                    ix0Var2.f33218p2 = z20;
                    ix0Var2.P(z10, z19);
                }
            }
        }
    }

    @Override
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    public final void B4(boolean z10) {
        boolean z11 = false;
        if (this.f33796d1 != 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1));
            if (Z1 != null) {
                TLRPC.UserFull userFull = this.f33915u2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.m1.m(Z1, z10, z11, getParentActivity(), this.f33915u2, getAccountInstance());
            }
        } else if (this.f33803e1 != 0) {
            if (getMessagesController().f1(this.f33803e1, false, null) == null) {
                TLRPC.Chat chat = this.D2;
                org.telegram.messenger.c accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.k70.J0(getParentActivity(), -chat.f19793id, accountInstance, new androidx.car.app.utils.a(chat, this, accountInstance, 28));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.m1.l(this.D2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void B5() {
        TLRPC.User Z1;
        boolean z10;
        int i10;
        int i11;
        if (this.f33892r1 && this.W0 != null && this.V0 != null && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1))) != null) {
            int i12 = 0;
            if (org.telegram.messenger.h20.n(Z1) != null) {
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
            b1Var2.setText(org.telegram.messenger.cd.L0(i11, null));
            org.telegram.ui.ActionBar.b1 b1Var3 = this.V0;
            if (org.telegram.messenger.h20.n(Z1) == null) {
                i12 = 8;
            }
            b1Var3.setVisibility(i12);
        }
    }

    public final void C4() {
        TLRPC.UserFull userFull = this.f33915u2;
        if (userFull != null && org.telegram.messenger.h20.b(userFull)) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(a())), org.telegram.ui.Components.cc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        if (this.D2 != null) {
            org.telegram.ui.Components.r30.h.a();
        }
        showDialog(new ph.l1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void C5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                F5(false);
            }
            I5();
        } else if (!z11 && this.f33772a.isInLayout()) {
            bw0 bw0Var = this.f33772a;
            if (!bw0Var.G) {
                return;
            }
            bw0Var.post(new yv0(0, this, z10));
        } else {
            kx0 kx0Var = new kx0(this);
            kx0Var.f38967b = this.M2;
            kx0Var.f(kx0Var.f38968c);
            kx0Var.e.clear();
            kx0Var.f38969f.clear();
            kx0Var.e.addAll(this.Q4);
            kx0Var.f38969f.addAll(this.R4);
            kx0Var.f38970g = this.f33910t4;
            kx0Var.h = this.f33917u4;
            if (z10) {
                F5(false);
            }
            S4();
            I5();
            kx0Var.f(kx0Var.d);
            try {
                s4.n.c(kx0Var, true).c(this.d);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                this.d.f();
            }
            int i10 = this.f33844j6;
            if (i10 >= 0) {
                this.f33787c.h1(i10, this.f33851k6 - this.f33772a.getPaddingTop());
            }
            org.telegram.messenger.i0.a4(this.f33772a);
        }
    }

    public final void D4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.D2.f19793id, getUserConfig().f(), 0, null, this, true, new bk0(this, z10, zArr, 5), new bi.o4(this, zArr, z10, this.parentLayout.getLastFragment(), 5), null);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.I4, new Object[0]);
    }

    public final void D5() {
        int i10;
        if (this.f33780b0 != null && this.f33890r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16020m;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.F1;
            if (z10 && this.I1 == 2 && this.X != null) {
                this.f33780b0.setAlpha(this.R1);
                this.f33780b0.f(org.telegram.messenger.i0.L(74.0f) + this.f33772a.getMeasuredWidth(), d4() - org.telegram.messenger.i0.L(74.0f));
                return;
            }
            if (z10) {
                this.f33780b0.setAlpha(this.R1);
            }
            float f7 = i11;
            float L = this.P1 + f7 + org.telegram.messenger.i0.L(74.0f);
            float min = Math.min(d4(), L - f7);
            this.f33780b0.f(L - min, min - org.telegram.messenger.i0.L(74.0f));
        }
    }

    public final void E4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.f33825h1;
        if (j11 == 0) {
            j11 = this.f33796d1;
            if (j11 == 0) {
                j11 = -this.f33803e1;
            }
        }
        long j12 = j11;
        boolean q22 = getMessagesController().q2(j12, this.f33811f1, null);
        if (z10 && (this.f33879p1 || q22)) {
            boolean z11 = !q22;
            getNotificationsController().G(j12, this.f33811f1, z11);
            org.telegram.ui.Components.cc.A(this, z11, null).j();
            u5();
            this.Z.setNotifications(q22);
        } else if ((!z10 && org.telegram.messenger.cd.X && f7 <= org.telegram.messenger.i0.L(76.0f)) || (!org.telegram.messenger.cd.X && f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            boolean z12 = l5Var.e.h;
            boolean z13 = !z12;
            boolean D = getNotificationsController().D(j12, null, false, false);
            String v = org.telegram.messenger.ot.v(j12, this.f33811f1, false);
            if (!z12) {
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
                if (D) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 0);
                }
                if (this.f33811f1 == 0) {
                    getMessagesStorage().E1(j12, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j12);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
                if (!D) {
                    edit2.remove("notify2_" + v);
                    j10 = 0L;
                } else {
                    edit2.putInt("notify2_" + v, 2);
                    j10 = 1;
                }
                getNotificationsController().N(j12);
                if (this.f33811f1 == 0) {
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
            u5();
            getNotificationsController().c0(j12, this.f33811f1, true);
            l5Var.setChecked(z13);
            org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.f33772a.L(this.M3, false);
            E5(true);
        } else {
            org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(getParentActivity(), this.currentAccount, null, true, new c3.g0(this, j12, 6), this.f33950z0);
            goVar.e(j12, this.f33811f1, this.f33829h5);
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

    public final void E5(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.E5(boolean):void");
    }

    public final void F4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f33796d1 != 0) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1));
                if (Z1 != null) {
                    if (this.E2 != null && (userFull = this.f33915u2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().U2 + "/%s", this.f33915u2.about, org.telegram.messenger.h20.n(Z1));
                    } else {
                        str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.h20.n(Z1));
                    }
                } else {
                    return;
                }
            } else if (this.f33803e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f33803e1));
                if (L0 != null) {
                    TLRPC.ChatFull chatFull = this.f33908t2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().U2 + "/%s", this.f33908t2.about, org.telegram.messenger.w3.K(L0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131752982, null)), 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void F5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.A2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.B2.clear();
        TLRPC.ChatFull chatFull = this.f33908t2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.A2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f33908t2.participants.participants.size()) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33908t2.participants.participants.get(i11).user_id));
            if (Z1 != null && (userStatus = Z1.status) != null && ((userStatus.expires > currentTime || Z1.f19942id == getUserConfig().e()) && Z1.status.expires > 10000)) {
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
            Collections.sort(this.B2, Comparator$EL.reversed(Comparator$CC.comparingInt(new ef(arrayList, 1))));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (z10 && this.d != null && this.f33910t4 > 0) {
            org.telegram.messenger.i0.a4(this.f33772a);
        }
        if (this.N != null && this.J4 != -1) {
            if ((this.B2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.N.h1(this.B2, this.f33908t2);
            }
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G3() {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        if (this.N != null && (lVar = this.actionBar) != null) {
            if (lVar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16020m;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            int[] iArr = org.telegram.ui.Components.zt0.f33165s2;
            int z10 = org.telegram.messenger.m5.z(6.666f, ei.b.d(currentActionBarHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()), currentActionBarHeight);
            int c10 = ei.b.c(i10) + currentActionBarHeight + z10;
            this.T5 = c10;
            this.N.i1(z10, c10, ei.b.c(this.H6), this.H6 + this.F6);
            this.U5 = org.telegram.messenger.i0.L(44.0f) + currentActionBarHeight;
            x5();
            O3();
        }
    }

    public final void G4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.K3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f33803e1);
            bundle.putLong("user_id", this.f33796d1);
            presentFragment(new qh.i0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.T2) {
            if (this.f33796d1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (org.telegram.messenger.h20.b(this.f33915u2)) {
                org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(this.f33796d1)), org.telegram.ui.Components.cc.a0(this), 2131624011, 36);
            } else {
                showDialog(new ph.l1(getParentActivity(), this.currentAccount, this.f33796d1, null, null));
            }
        }
    }

    public final void G5() {
        CharSequence charSequence;
        lw0 lw0Var = this.f33890r;
        if (lw0Var != null) {
            if ((!this.Q5 || (charSequence = this.V5) == null) && (!this.f33905s6 || (charSequence = this.f33897r6) == null)) {
                charSequence = this.q6;
            }
            if (lw0Var.o(charSequence, !this.F1) && this.fragmentView != null) {
                x4(false);
            }
        }
    }

    @Override
    public final void H(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.f33817g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
        this.f33864n0.O(this.J2, f7);
    }

    public final int H3(int i10, Boolean bool) {
        int i11;
        if (this.f33816f6 != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.f33950z0);
            int f7 = i0.b.f(0.5f, this.f33816f6.m(org.telegram.ui.ActionBar.t6.I.q()), this.f33816f6.n(org.telegram.ui.ActionBar.t6.I.q()));
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

    public final void H4() {
        boolean z10;
        org.telegram.ui.Components.bi0 bi0Var;
        if (this.f33796d1 != 0) {
            if (this.f33884q0 != null) {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(this.currentAccount).e()));
                if (Z1 == null) {
                    Z1 = org.telegram.messenger.d20.i(this.currentAccount).f();
                }
                if (Z1 != null) {
                    org.telegram.ui.Components.b40 b40Var = this.f33884q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b40Var.n(z10, new oa0(this, 27), new q5(this, 13), 0);
                    this.U.M(0);
                    this.U.P(43);
                    this.V.M(0);
                    this.V.P(43);
                    org.telegram.ui.Components.hg0 hg0Var = this.Z;
                    if (hg0Var != null) {
                        org.telegram.ui.Components.eg0 i10 = org.telegram.ui.Components.hg0.i(14, hg0Var.f26730a);
                        if (i10 != null && (bi0Var = i10.f25785k) != null) {
                            bi0Var.start();
                        }
                    } else {
                        this.f33898s.d();
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
            K4();
            return;
        }
        L4();
    }

    public final void H5(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.H5(boolean):void");
    }

    @Override
    public final void I() {
        T4(false);
    }

    public final void I3() {
        int f7;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && this.f33809f != null && this.f33789c1 != null && this.S0 != null && this.P0 != null && this.Q0 != null && this.R0 != null && this.f33871o0 != null) {
            Float valueOf = Float.valueOf(this.P5);
            pw0 pw0Var = this.R5;
            pw0Var.getClass();
            pw0Var.a(lVar, valueOf);
            if (this.P5 <= 0.0f && this.f33840j2 > 0.0f) {
                kl klVar = this.f33809f;
                int i10 = -1;
                if (this.f33816f6 != null) {
                    f7 = -1;
                } else {
                    f7 = i0.b.f(this.f33840j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21050ji, this.f33950z0), -1);
                }
                klVar.setTextColor(f7);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                if (this.f33816f6 == null) {
                    i10 = i0.b.f(this.f33840j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, this.f33950z0), -1);
                }
                lVar2.D(i10, false);
            }
        }
    }

    public final void I4() {
        Bundle g10 = a1.g.g("addToGroup", true);
        g10.putLong("chatId", this.D2.f19793id);
        v50 v50Var = new v50(g10);
        TLRPC.ChatFull chatFull = this.f33908t2;
        v50Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.f33908t2.participants.participants.size(); i10++) {
                hVar.k(null, this.f33908t2.participants.participants.get(i10).user_id);
            }
            v50Var.J = hVar;
        }
        v50Var.f42634y = new bv0(this, 0);
        presentFragment(v50Var);
    }

    public final void I5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.I5():void");
    }

    public final void J3() {
        int i10;
        int i11;
        if (this.Y5 != null) {
            ValueAnimator valueAnimator = this.f33833i2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33833i2.cancel();
            }
            float l4 = Utilities.l(this.P1 / this.E1);
            if (l4 > 0.0f) {
                float f7 = (l4 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.i0.f16020m;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10) - org.telegram.messenger.i0.L(21.0f));
                this.a2 = org.telegram.messenger.i0.T1(0.42f, this.Y5[0], l4);
                this.Y1 = org.telegram.messenger.i0.T1(this.f33801d6, this.Y5[1], l4);
                this.Z1 = org.telegram.messenger.i0.T1(translationY, this.Y5[2], l4);
                this.f33782b2 = org.telegram.messenger.i0.T1(this.Y5[11], 0.0f, l4);
                this.X.setScaleX(this.a2);
                this.X.setScaleY(this.a2);
                this.X.setTranslationX(this.Y1);
                this.X.setTranslationY(this.Z1);
                org.telegram.ui.Components.nv0 nv0Var = this.S;
                if (nv0Var != null) {
                    nv0Var.setAlpha(l4);
                }
                this.f33802e0.setAlpha(1.0f);
                this.X.setAlpha(1.0f);
                mw0 mw0Var = this.f33913u0;
                if (mw0Var != null) {
                    mw0Var.invalidate();
                }
                rh.g0 g0Var = this.f33920v0;
                if (g0Var != null) {
                    g0Var.e = org.telegram.messenger.i0.T1(0.0f, this.Y5[4], f7);
                    this.f33920v0.f46924f = org.telegram.messenger.i0.T1(0.0f, this.Y5[5], l4);
                    rh.g0 g0Var2 = this.f33920v0;
                    g0Var2.h = true;
                    g0Var2.invalidate();
                }
                iy0 iy0Var = this.f33942x6;
                if (iy0Var != null) {
                    iy0Var.setAlpha((int) org.telegram.messenger.i0.T1(0.0f, this.Y5[6], l4));
                }
                float L = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.i0.L(42.0f)) - org.telegram.messenger.i0.L(42.0f);
                this.f33824h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + L);
                this.f33824h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + L);
                this.f33831i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                this.f33831i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + L);
                this.f33838j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                this.f33838j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                this.f33845k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                this.f33845k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                float T1 = org.telegram.messenger.i0.T1(1.0f, this.Y5[7], l4);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.i0.f16020m;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (org.telegram.messenger.i0.f16025p * 21.0f)))) + org.telegram.messenger.i0.L(1.3f);
                float N = org.telegram.messenger.i0.N(22.7f) + floor;
                this.f33797d2 = org.telegram.messenger.i0.T1(floor, this.Y5[8], l4);
                this.f33812f2 = org.telegram.messenger.i0.T1(N, this.Y5[9], l4);
                float T12 = org.telegram.messenger.i0.T1((this.f33801d6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f), this.Y5[12], l4);
                float T13 = org.telegram.messenger.i0.T1((this.f33801d6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f), this.Y5[13], l4);
                this.f33809f.setTranslationX(T12);
                this.f33809f.setTranslationY(this.f33797d2);
                this.f33890r.setTranslationX(this.f33876o5 + T13);
                this.f33890r.setTranslationY(this.f33812f2);
                this.f33790c2 = T12;
                this.f33804e2 = T13;
                this.f33809f.setScaleX(T1);
                this.f33809f.setScaleY(T1);
                p5();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = org.telegram.messenger.i0.f16020m;
                }
                v5(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12);
                y4((int) this.Y5[10], l4, true);
                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                if (hg0Var != null) {
                    hg0Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, this.Y5[3], f7));
                }
            }
        }
    }

    public final void J4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.J4(boolean):void");
    }

    public final void J5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f33838j0 != null && (imageView = this.f33845k0) != null) {
            if (this.K1 && (chat = this.D2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f33845k0.setVisibility(0);
                this.f33838j0.setTag(1);
                this.f33838j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f33845k0.setVisibility(8);
            this.f33838j0.setTag(null);
            this.f33838j0.setVisibility(8);
        }
    }

    public final float K3() {
        return Utilities.l((this.P1 - d4()) / j4());
    }

    public final void K4() {
        TLRPC.User Z1;
        if (this.f33796d1 != 0 && !b4() && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1))) != null && !(Z1 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f33796d1);
            if (getMessagesController().E(bundle, this, null, null)) {
                boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!org.telegram.messenger.i0.Q1() && z10) {
                    org.telegram.messenger.zs notificationCenter = getNotificationCenter();
                    int i10 = org.telegram.messenger.zs.f19690t;
                    notificationCenter.n(this, i10);
                    getNotificationCenter().k(i10, new Object[0]);
                }
                int i11 = getArguments().getInt("nearby_distance", -1);
                if (i11 >= 0) {
                    bundle.putInt("nearby_distance", i11);
                }
                un unVar = new un(bundle);
                org.telegram.messenger.ui mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.f18360y0;
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

    public final void K5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        boolean z11;
        if ((this.f33913u0 != null || this.f33920v0 != null) && (lVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (lVar.getOccupyStatusBar()) {
                f7 = org.telegram.messenger.i0.f16020m;
            } else {
                f7 = 0.0f;
            }
            int L = org.telegram.messenger.i0.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            mw0 mw0Var = this.f33913u0;
            boolean z12 = false;
            if (mw0Var != null) {
                float B = c3.i0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(right - mw0Var.f34066f0) <= 0.1f && Math.abs(menuPillLeft - mw0Var.f34067g0) <= 0.1f && Math.abs(B - mw0Var.f34068h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                mw0Var.f34066f0 = right;
                mw0Var.f34067g0 = menuPillLeft;
                if (z10) {
                    mw0Var.m0.e(true, menuPillLeft);
                }
                mw0Var.f34068h0 = B;
                if (z11) {
                    mw0Var.invalidate();
                }
            }
            rh.g0 g0Var = this.f33920v0;
            if (g0Var != null) {
                float B2 = c3.i0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
                int j42 = j4();
                if (Math.abs(right - g0Var.f46926r) > 0.1f || Math.abs(menuPillLeft - g0Var.f46927s) > 0.1f || Math.abs(B2 - g0Var.f46928w) > 0.1f) {
                    z12 = true;
                }
                g0Var.f46926r = right;
                g0Var.f46927s = menuPillLeft;
                if (z10) {
                    g0Var.D.e(true, menuPillLeft);
                }
                g0Var.f46928w = B2;
                g0Var.f46930y = j42 + B2;
                if (z12) {
                    g0Var.invalidate();
                }
            }
        }
    }

    public final void L3() {
        int i10;
        int i11 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        this.Z1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - org.telegram.messenger.i0.L(21.0f));
        this.a2 = 1.38f;
        float f7 = 0.0f;
        this.f33782b2 = 0.0f;
        c4();
        Q4();
        y4(0, 1.0f, true);
        this.f33790c2 = (this.f33772a.getMeasuredWidth() / 2.0f) - (((this.f33809f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f33809f.getLayoutParams()).leftMargin);
        float measuredWidth = this.f33772a.getMeasuredWidth() / 2.0f;
        int i12 = ((FrameLayout.LayoutParams) this.f33890r.getLayoutParams()).leftMargin;
        if (!this.p5) {
            i11 = this.f33890r.getPaddingLeft();
        }
        this.f33804e2 = measuredWidth - ((this.f33890r.getExactWidth() * 0.5f) + (i12 + i11));
        if (!this.p5) {
            f7 = this.f33890r.getPaddingLeft();
        }
        this.f33919u6 = f7;
        if (this.I1 != 2) {
            this.f33913u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.f33802e0.setAlpha(1.0f);
    }

    public final void L4() {
        TLRPC.ChatFull chatFull = this.f33908t2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f33908t2.linked_chat_id);
            if (getMessagesController().E(bundle, this, null, null)) {
                presentFragment(new un(bundle));
            }
        }
    }

    public final void L5() {
        try {
            do0 do0Var = this.T;
            if (do0Var != null && (do0Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.T.getForeground()).setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f33950z0), 100));
            }
            float f7 = this.P5;
            Drawable drawable = this.D;
            int[] iArr = this.Q6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33950z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33950z0));
                int i10 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i10) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.M6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V6, this.f33950z0);
                int i11 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i11) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.N6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, this.f33950z0);
                int i12 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i12) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.O6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.f33950z0);
                int i13 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i13) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.dq dqVar = this.P6;
            if (dqVar != null) {
                dqVar.f25512y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.kk, this.f33950z0);
                if (this.f33772a != null) {
                    for (int i14 = 0; i14 < this.f33772a.getChildCount(); i14++) {
                        View childAt = this.f33772a.getChildAt(i14);
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

    public final void M4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f33915u2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                yw0 yw0Var = new yw0(3, 0);
                yw0Var.setResourceProvider(this.f33950z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().y1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f33915u2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                yw0Var.W0 = false;
                yw0Var.H0(new org.telegram.messenger.jj(org.telegram.messenger.d20.f15147s0, tL_message, false, false));
                presentFragment(yw0Var);
                return;
            }
            boolean z11 = org.telegram.messenger.v2.f18448a;
            org.telegram.messenger.w0.r();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.f33915u2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void M5() {
        boolean z10;
        TLRPC.UserFull userFull;
        if (this.X0 == null) {
            return;
        }
        if (this.C2 == null && (((userFull = this.f33915u2) != null && userFull.ttl_period > 0) || (this.f33908t2 != null && org.telegram.messenger.w3.y(13, this.D2) && this.f33908t2.ttl_period > 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.i0.Y3(this.X0, z10, 0.8f, true, this.f33855l5);
    }

    @Override
    public final boolean N(ay ayVar) {
        return false;
    }

    public final void N3() {
        s4.c1 c1Var;
        View view;
        int top;
        int i10;
        boolean z10;
        float f7;
        if (this.f33772a.getVisibility() == 0) {
            if (this.P) {
                this.N.setVisibleHeight(this.f33772a.getMeasuredHeight() - this.N.getTop());
            }
            if (this.f33772a.getChildCount() > 0 && !this.F1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    c1Var = null;
                    if (i11 < this.f33772a.getChildCount()) {
                        if (RecyclerView.R(this.f33772a.getChildAt(i11)) == 0) {
                            view = this.f33772a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    bw0 bw0Var = this.f33772a;
                    View F = bw0Var.F(view);
                    if (F != null) {
                        c1Var = bw0Var.T(F);
                    }
                    c1Var = (org.telegram.ui.Components.ck0) c1Var;
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
                if (top < 0 || i10 != 0) {
                    top = 0;
                }
                if (this.f33884q0 == null && this.actionBar.f20497n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.J4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.f33772a.K(i12);
                    if (ck0Var != null && ck0Var.f47898a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.Q5 != z10) {
                    this.Q5 = z10;
                    O3();
                    AnimatorSet animatorSet = this.N5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.O5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    A5(true);
                    G5();
                    K5(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(lVar, this.R5, f7));
                    this.N.K0.setOpen(z10);
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f33843j5, 0.0f));
                    }
                    if (this.f33913u0 != null || this.f33920v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new lv0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    Q3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.N5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.N5.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    this.N5.addListener(new nw0(this, 1));
                    this.N5.setDuration(150L);
                    this.N5.start();
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19681r4, Boolean.TRUE);
                }
                float f10 = top;
                if (this.P1 != f10 && !this.G1) {
                    this.P1 = f10;
                    this.f33789c1.invalidate();
                    if (this.I1 != 0) {
                        if (this.P1 > d4()) {
                            z11 = true;
                        }
                        this.L1 = z11;
                    }
                    x4(true);
                }
            }
        }
    }

    public final void N4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        sw0 sw0Var = new sw0(this, user.f19942id, this.f33803e1, tL_chatAdminRights, this.D2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        sw0Var.X0 = new tw0(this, i10, chatParticipant, z10, zArr);
        presentFragment(sw0Var);
    }

    public final void N5(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        float f7;
        TLRPC.ChatFull chatFull;
        float f10 = 0.2f;
        int i12 = (K3() > 0.2f ? 1 : (K3() == 0.2f ? 0 : -1));
        int i13 = 0;
        if (i12 > 0 && !this.V1 && (this.f33884q0 == null || this.N2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.W5 = z11;
        Q3();
        org.telegram.ui.Components.ei0 ei0Var = this.f33898s;
        if (ei0Var != null && ei0Var.getVisibility() != 8) {
            org.telegram.ui.Components.ei0 ei0Var2 = this.f33898s;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = org.telegram.messenger.i0.f16020m;
            } else {
                i11 = 0;
            }
            ei0Var2.setTranslationY((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) + this.P1) + this.S1) - org.telegram.messenger.i0.L(29.5f));
            if (i12 > 0 && !this.V1 && !this.f33892r1 && (this.f33884q0 == null || this.N2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f33803e1 != 0) {
                if (org.telegram.messenger.w3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f33908t2) != null && chatFull.linked_chat_id != 0 && (this.C3 != -1 || this.D3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.F1) {
                if (this.f33898s.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.f33898s.setTag(null);
                    } else {
                        this.f33898s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f33927w;
                    if (animatorSet != null) {
                        this.f33927w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f33927w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f33927w.playTogether(ObjectAnimator.ofFloat(this.f33898s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f33898s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f33898s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f33927w.playTogether(ObjectAnimator.ofFloat(this.f33898s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.f33898s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.f33898s, View.ALPHA, 0.0f));
                        }
                        this.f33927w.setDuration(150L);
                        this.f33927w.addListener(new nw0(this, 3));
                        this.f33927w.start();
                    } else {
                        org.telegram.ui.Components.ei0 ei0Var3 = this.f33898s;
                        if (z12) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.2f;
                        }
                        ei0Var3.setScaleX(f7);
                        org.telegram.ui.Components.ei0 ei0Var4 = this.f33898s;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        ei0Var4.setScaleY(f10);
                        org.telegram.ui.Components.ei0 ei0Var5 = this.f33898s;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        ei0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        mw0 mw0Var = this.f33913u0;
        if (mw0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - org.telegram.messenger.i0.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16020m;
            } else {
                i10 = 0;
            }
            mw0Var.f34069i0 = measuredWidth;
            mw0Var.f34071k0 = z12;
            mw0Var.f34070j0 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10;
            mw0Var.invalidate();
        }
        rh.g0 g0Var = this.f33920v0;
        if (g0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.i0.f16020m;
            }
            g0Var.setExpandCoords(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i13 + this.P1 + this.S1);
        }
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.f33817g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    public final void O3() {
        int i10;
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            if (!this.Q5 && this.P5 <= 0.0f) {
                i10 = 0;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            ix0Var.setPagesVisibleOverscanTop(i10);
        }
    }

    public final void O4(String str, org.telegram.ui.Cells.g gVar) {
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
            ay ayVar = new ay(null);
            ayVar.f35840n2 = str;
            presentFragment(ayVar);
        }
    }

    public final void O5() {
        org.telegram.ui.Components.vq0 vq0Var;
        org.telegram.ui.Components.ur0 ur0Var;
        org.telegram.ui.Components.p80 p80Var;
        int w02;
        int w03;
        int w04;
        int i10;
        int w05;
        int w06;
        int w07;
        this.f33823g6.clear();
        ky0 ky0Var = this.f33789c1;
        if (ky0Var != null) {
            ky0Var.a(this.f33816f6, true);
        }
        lw0 lw0Var = this.f33890r;
        if (lw0Var != null) {
            if (lw0Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.t6.w0(((Integer) this.f33890r.getTag()).intValue(), this.f33950z0);
            } else {
                w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.f33950z0);
            }
            this.f33890r.setTextColor(i0.b.f(this.f33840j2, H3(w07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        iy0 iy0Var = this.f33942x6;
        float f7 = -0.1f;
        if (iy0Var != null) {
            iy0Var.a(i0.b.f(this.f33840j2, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.18f, -0.1f, this.f33781b1)), 603979775));
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = -1;
        if (lVar != null) {
            if (this.f33816f6 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, this.f33950z0);
            }
            lVar.D(i0.b.f(this.P5, w05, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21313y8, this.f33950z0)), false);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            org.telegram.messenger.kp kpVar = this.f33816f6;
            if (kpVar != null) {
                w06 = 1090519039;
            } else if (kpVar != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20967f8, this.f33950z0);
            }
            lVar2.C(i0.b.f(this.P5, w06, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21332z8, this.f33950z0)), false);
        }
        if (this.f33943y != null) {
            org.telegram.messenger.kp kpVar2 = this.f33816f6;
            if (kpVar2 != null) {
                int g10 = kpVar2.g();
                if (this.f33816f6.o(org.telegram.ui.ActionBar.t6.I.q())) {
                    i10 = this.f33816f6.k();
                } else {
                    i10 = this.f33816f6.i();
                }
                int f10 = i0.b.f(0.4f, g10, i10);
                if (!org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.t6.b(0.1f, f7, f10);
            } else {
                w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33950z0);
            }
            this.f33943y.setColorFilter(org.telegram.messenger.i0.S0(this.P5, 1.0f, w04, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33950z0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            if (this.f33816f6 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, this.f33950z0);
            }
            this.H.setColorFilter(org.telegram.messenger.i0.S0(this.P5, 1.0f, w03, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f33950z0)), PorterDuff.Mode.MULTIPLY);
        }
        kl klVar = this.f33809f;
        if (klVar != null) {
            if (this.f33816f6 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21050ji, this.f33950z0);
            }
            klVar.setTextColor(i0.b.f(this.f33840j2, i0.b.f(this.P5, w02, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33950z0)), -1));
        }
        m4.n0 n0Var = this.Z0;
        if (n0Var != null && (p80Var = (org.telegram.ui.Components.p80) n0Var.e) != null) {
            p80Var.invalidate();
        }
        Drawable drawable = this.f33935x;
        if (drawable != null) {
            if (this.f33816f6 == null) {
                i11 = i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20936dd, this.f33950z0), -1);
            }
            drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.bh0 bh0Var = this.f33780b0;
        if (bh0Var != null) {
            bh0Var.setColor(this.f33816f6);
        }
        org.telegram.messenger.i0.d0(this.f33772a, new ov0(this, 3));
        ix0 ix0Var = this.N;
        if (ix0Var != null && (ur0Var = ix0Var.K0) != null) {
            ur0Var.updateColors();
        }
        ix0 ix0Var2 = this.N;
        if (ix0Var2 != null && (vq0Var = ix0Var2.f33170a0) != null) {
            vq0Var.m();
        }
        P5();
        r5();
        mw0 mw0Var = this.f33913u0;
        if (mw0Var != null) {
            mw0Var.f(true, true);
        }
        rh.g0 g0Var = this.f33920v0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    public final void P3() {
        float alpha;
        boolean z10;
        int i10 = this.I1;
        float f7 = 0.0f;
        boolean z11 = true;
        if (i10 == 1 && (!this.f33855l5 || this.F1)) {
            this.f33883p6 = 0.0f;
        } else if (i10 == 2 && (!this.f33855l5 || this.F1)) {
            lw0 lw0Var = this.f33890r;
            if (lw0Var == null) {
                alpha = 0.0f;
            } else {
                alpha = lw0Var.getAlpha();
            }
            this.f33883p6 = alpha;
        } else if (this.f33796d1 == org.telegram.messenger.d20.i(this.currentAccount).f15165n) {
            this.f33883p6 = (1.0f - this.f33869n5) * this.f33840j2;
        } else {
            this.f33883p6 = this.f33840j2 * this.f33869n5;
        }
        if (this.f33796d1 == org.telegram.messenger.d20.i(this.currentAccount).f15165n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.p5) {
            this.f33876o5 = org.telegram.messenger.i0.L(28.0f) * this.f33883p6;
            lw0 lw0Var2 = this.f33890r;
            if (lw0Var2 != null) {
                lw0Var2.setTranslationX(l4(this.f33912t6, this.f33926v6));
                this.Y.invalidate();
            }
        }
        if (z10) {
            if (this.p5) {
                f7 = this.f33840j2;
            }
        } else if (this.f33889q5) {
            f7 = this.f33883p6;
        }
        iy0 iy0Var = this.f33942x6;
        if (iy0Var != null) {
            iy0Var.e = 1.0f - f7;
            iy0Var.invalidateSelf();
        }
        if (f7 <= 0.5f) {
            z11 = false;
        }
        this.f33905s6 = z11;
        G5();
    }

    public final boolean P4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.P4(float, float, int, android.view.View):boolean");
    }

    public final void P5() {
        if (this.f33898s != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21088li, this.f33950z0);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21107mi, this.f33950z0);
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21070ki, this.f33950z0);
                if (this.f33816f6 != null && org.telegram.ui.ActionBar.t6.e1(w02)) {
                    w02 = org.telegram.ui.ActionBar.t6.b(0.05f, -0.04f, this.f33816f6.c(false));
                    org.telegram.messenger.kp kpVar = this.f33816f6;
                    if (kpVar != null) {
                        int d = kpVar.d(org.telegram.ui.ActionBar.t6.I.q());
                        w03 = org.telegram.ui.ActionBar.t6.D(org.telegram.ui.ActionBar.t6.I.q(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21259v6, this.f33950z0), d, w03, d);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.ei0 ei0Var = this.f33870n6;
                org.telegram.ui.Components.ei0 ei0Var2 = this.f33898s;
                int[] iArr = this.f33877o6;
                if (ei0Var != ei0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f33870n6 = ei0Var2;
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
                    eqVar.f25842f = L2;
                    this.f33898s.setBackground(eqVar);
                    this.f33898s.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void Q() {
        org.telegram.ui.Components.rt0 rt0Var;
        ix0 ix0Var = this.N;
        if (ix0Var != null && (rt0Var = this.Q) != null) {
            ix0Var.setNewMediaCounts(rt0Var.f30018c);
        }
        if (this.d != null) {
            C5(false, false);
        }
        V();
        if (this.f33915u2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        boolean z10;
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            if (!this.Q5 && this.W5) {
                z10 = true;
            } else {
                z10 = false;
            }
            nv0Var.setVisibility(z10);
        }
    }

    public final void Q4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f33873o2 && (valueAnimator = this.f33833i2) != null && valueAnimator.isRunning()) {
            this.f33797d2 = this.Z5;
            this.f33812f2 = this.f33778a6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        R4(K3(), currentActionBarHeight + i10);
    }

    public final void R3(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.R3(boolean):void");
    }

    public final void R4(float f7, float f10) {
        float T1;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.P1 - i4()) / ((this.f33772a.getMeasuredWidth() - f10) - j4())));
        if (this.P1 < i4() && max < 0.33f) {
            T1 = c3.i0.x(f7, 72.0f, 24.0f, 42.0f);
        } else {
            T1 = org.telegram.messenger.i0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((org.telegram.messenger.i0.N(8.0f) + (org.telegram.messenger.i0.L(42.0f) * T1)) * f7) + ((float) Math.floor(translationY + (org.telegram.messenger.z20.b(f7, 1.0f, currentActionBarHeight, i10) - (org.telegram.messenger.i0.f16025p * 21.0f))));
        this.f33797d2 = (org.telegram.messenger.i0.L(7.0f) * f7) + org.telegram.messenger.i0.L(1.3f) + N;
        this.f33812f2 = (((float) Math.floor(org.telegram.messenger.i0.f16025p * 11.0f)) * f7) + N + org.telegram.messenger.i0.L(24.0f);
    }

    public final void S3(Context context) {
        int i10;
        this.Z0 = new m4.n0(context, this.S0.getPopupLayout().getSwipeBack(), new aw0(this), false, 0, this.f33950z0);
        if (this.f33825h1 > 0 || this.f33796d1 > 0) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, this.f33950z0);
            m4.n0 n0Var = this.Z0;
            org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) n0Var.e;
            if (p80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.N2(org.telegram.messenger.cd.L0(2131753847, null), w02, new org.telegram.ui.Components.tf(n0Var, 11)));
                p80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f33915u2;
        if (userFull == null && this.f33908t2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f33908t2.ttl_period;
        }
        org.telegram.ui.Components.f11 a2 = org.telegram.ui.Components.f11.a(i10);
        this.f33899s0 = a2;
        this.Y0 = this.S0.h(0, a2, org.telegram.messenger.cd.L0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z0.f12863a);
        this.S0.a(-1);
        n5();
    }

    public final void S4() {
        bw0 bw0Var = this.f33772a;
        if (bw0Var != null && this.f33787c != null && bw0Var.getChildCount() > 0 && !this.f33856l6) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f33772a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f33772a.getChildAt(i12));
                View childAt = this.f33772a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.f33844j6 = i11;
                int top = view.getTop();
                this.f33851k6 = top;
                if (this.f33844j6 == 0 && !this.f33866n2 && top > i4()) {
                    this.f33851k6 = i4();
                }
                this.f33787c.h1(i11, view.getTop() - this.f33772a.getPaddingTop());
            }
        }
    }

    public final void T3() {
        if (this.fragmentView != null && this.f33862m6 && this.f33938x2 != null && getParentActivity() != null) {
            oy0 oy0Var = this.f33949y6;
            if (oy0Var != null) {
                oy0Var.b(this.f33938x2);
                this.f33949y6.invalidate();
                return;
            }
            oy0 oy0Var2 = new oy0(this, this.f33938x2);
            this.f33949y6 = oy0Var2;
            ((FrameLayout) this.fragmentView).addView(oy0Var2, w7.b6.e(-1, -1, 55));
        }
    }

    public final void T4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (z10) {
                ci.p pVar = new ci.p(getParentActivity(), 2, 0.6f);
                pVar.f48045a = this.J4;
                pVar.f4253p = -this.f33772a.getPaddingTop();
                this.f33787c.w0(pVar);
                return;
            }
            this.f33787c.h1(i10, -this.f33772a.getPaddingTop());
        }
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 4));
    }

    public final void U3(Context context) {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            org.telegram.messenger.i0.E2(i5Var);
        }
        ww0 ww0Var = new ww0(this, context, this.f33950z0);
        this.simpleActionBar = ww0Var;
        ww0Var.setTitlesAlpha(0.0f);
        if (!this.f33855l5 && !this.I0 && this.I1 != 0 && this.L1 && !this.M1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new cf(3, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(2131232484);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.cd.L0(2131746515, null));
        } else {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 23));
        if (!this.I0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new org.telegram.ui.Components.b0(5, this, backButton));
        }
    }

    @Override
    public final void V() {
        int i10;
        String str;
        int size;
        int i11;
        ix0 ix0Var = this.N;
        if (ix0Var != null && this.f33890r != null) {
            int closestTab = ix0Var.getClosestTab();
            int[] iArr = this.Q.f30018c;
            int i12 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i13 = iArr[0];
                    if (i13 <= 0) {
                        e5(org.telegram.messenger.cd.L0(2131745427, null));
                    } else {
                        e5(org.telegram.messenger.cd.G(i13, "Media", new Object[0]));
                    }
                } else if (this.N.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.N.getPhotosVideosTypeFilter() != 2 && (i11 = iArr[6]) > 0) {
                        e5(org.telegram.messenger.cd.G(i11, "Photos", new Object[0]) + ", " + org.telegram.messenger.cd.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    e5(org.telegram.messenger.cd.G(iArr[7], "Videos", new Object[0]));
                } else {
                    e5(org.telegram.messenger.cd.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i14 = iArr[1];
                if (i14 <= 0) {
                    e5(org.telegram.messenger.cd.L0(2131750827, null));
                } else {
                    e5(org.telegram.messenger.cd.G(i14, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i15 = iArr[2];
                if (i15 <= 0) {
                    e5(org.telegram.messenger.cd.L0(2131743549, null));
                } else {
                    e5(org.telegram.messenger.cd.G(i15, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i16 = iArr[3];
                if (i16 <= 0) {
                    e5(org.telegram.messenger.cd.L0(2131745429, null));
                } else {
                    e5(org.telegram.messenger.cd.G(i16, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i17 = iArr[4];
                if (i17 <= 0) {
                    e5(org.telegram.messenger.cd.L0(2131748334, null));
                } else {
                    e5(org.telegram.messenger.cd.G(i17, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i18 = iArr[5];
                if (i18 <= 0) {
                    e5(org.telegram.messenger.cd.L0(2131754879, null));
                } else {
                    e5(org.telegram.messenger.cd.G(i18, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                e5(org.telegram.messenger.cd.G(this.f33915u2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                e5(this.f33890r.getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.zt0.F0(closestTab)) {
                if (closestTab == 13) {
                    e5(this.N.d0(true));
                } else if (closestTab == 9) {
                    e5(org.telegram.messenger.cd.G(this.N.k0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    org.telegram.messenger.wo K0 = org.telegram.messenger.vp.r1(this.currentAccount).K0(a());
                    if (this.f33886q2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (K0 == null) {
                        size = 0;
                    } else {
                        size = K0.f19117b.size() + K0.f19118c;
                    }
                    e5(org.telegram.messenger.cd.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    org.telegram.messenger.gw F1 = getMessagesController().F1();
                    long a2 = a();
                    ArrayList arrayList = F1.f15772j;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList.size()) {
                            org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i19);
                            if (fwVar.f15624a == a2) {
                                i10 = fwVar.e;
                                break;
                            }
                            i19++;
                        } else {
                            i10 = 0;
                            break;
                        }
                    }
                    e5(org.telegram.messenger.cd.G(Math.max(1, i10), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.vq0 vq0Var = this.N.f33170a0;
                    if (vq0Var != null) {
                        i12 = vq0Var.getGiftsCount();
                    }
                    e5(org.telegram.messenger.cd.H(',', "ProfileGiftsCount", i12));
                } else if (closestTab == 15) {
                    int i20 = iArr[8];
                    if (i20 <= 0) {
                        e5(org.telegram.messenger.cd.L0(2131745421, null));
                    } else {
                        e5(org.telegram.messenger.cd.H(',', "ProfilePollsCount", i20));
                    }
                }
            } else if (this.f33886q2) {
                e5(this.N.d0(false));
            } else if (this.N.k0(closestTab) > 0) {
                e5(org.telegram.messenger.cd.G(this.N.k0(closestTab), "ProfileStoriesCount", new Object[0]));
            } else {
                e5(org.telegram.messenger.cd.L0(2131746640, null));
            }
        }
    }

    public final void V4() {
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            if (this.f33892r1) {
                hg0Var.E = 6;
            } else if (this.f33879p1) {
                hg0Var.E = 5;
            } else if (this.f33886q2) {
                hg0Var.E = 2;
            } else if (this.f33796d1 != 0) {
                hg0Var.E = 0;
            } else if (this.f33803e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f33803e1));
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

    public final void W3(float f7) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.f33837i6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33837i6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f33936x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new lv0(this, 0));
        this.f33837i6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.f33837i6;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.f33837i6.addListener(new nw0(this, 6));
        }
        this.f33837i6.start();
    }

    public final void W4(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.W4(float):void");
    }

    @Override
    public final boolean X() {
        return this.f33951z1;
    }

    public final void X3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        H.W(this.f33772a.U0(view, false));
        H.f32944w = false;
        if (this.f33915u2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232102, org.telegram.messenger.cd.L0(2131751767, null), new oa0(this, 4), z10);
        H.c(2131232115, org.telegram.messenger.cd.L0(2131751336, null), new oa0(this, 5), false);
        H.c(2131232107, org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.Components.qq(this, i10, 18), true);
        H.Z();
    }

    public final boolean Y3(final int i10, View view) {
        TLRPC.User f7;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f33892r1 && (f7 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.f33915u2;
            if (userFull == null) {
                userFull = getMessagesController().a2(f7.f19942id);
            }
            if (userFull != null) {
                String L0 = org.telegram.messenger.cd.L0(2131751767, null);
                if (i10 != this.J3 && i10 != this.I3 && i10 != this.V2) {
                    if (i10 == this.N3) {
                        str = ag.h2.j0(this.currentAccount, f7, userFull.business_work_hours);
                        L0 = org.telegram.messenger.cd.L0(2131746680, null);
                    } else if (i10 == this.O3) {
                        str = userFull.business_location.address;
                        L0 = org.telegram.messenger.cd.L0(2131746675, null);
                    } else if (i10 == this.K3) {
                        str = org.telegram.messenger.h20.n(f7);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        L0 = org.telegram.messenger.cd.L0(2131746693, null);
                    } else if (i10 == this.F3) {
                        str = f7.phone;
                    } else if (i10 == this.T2) {
                        str = UserInfoActivity.d0(this.f33915u2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
                H.W(this.f33772a.U0(view, false));
                H.f32944w = false;
                H.f32923i = 3;
                if (i10 == this.O3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(2131232419, org.telegram.messenger.cd.L0(2131746671, null), new oa0(this, 7), false);
                    }
                    H.c(2131232212, org.telegram.messenger.cd.L0(2131746673, null), new oa0(this, 9), false);
                }
                if (str != null) {
                    H.c(2131232102, L0, new mg0(str, 29), false);
                }
                if (i10 == this.N3) {
                    H.c(2131232115, org.telegram.messenger.cd.L0(2131746679, null), new oa0(this, 10), false);
                    H.c(2131232107, org.telegram.messenger.cd.L0(2131746678, null), new Runnable(this) {
                        public final ProfileActivity f38614b;

                        {
                            this.f38614b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r4;
                            final int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f38614b;
                            switch (i11) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131752762, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131752694, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.O3) {
                    H.c(2131232115, org.telegram.messenger.cd.L0(2131746674, null), new oa0(this, 11), false);
                    H.c(2131232107, org.telegram.messenger.cd.L0(2131746672, null), new Runnable(this) {
                        public final ProfileActivity f38614b;

                        {
                            this.f38614b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r4;
                            final int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.f38614b;
                            switch (i11) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131752762, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131752763, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131752694, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131752695, null);
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
                                            int i14 = r4;
                                            int i15 = i12;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i14) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i15);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.K3) {
                    H.c(2131232115, org.telegram.messenger.cd.L0(2131746635, null), new oa0(this, 12), false);
                } else if (i10 != this.J3 && i10 != this.I3 && i10 != this.V2) {
                    if (i10 == this.F3) {
                        H.c(2131231893, org.telegram.messenger.cd.L0(2131746661, null), new oa0(this, 14), false);
                    } else if (i10 == this.T2) {
                        H.c(2131232115, org.telegram.messenger.cd.L0(2131746738, null), new Runnable(this) {
                            public final ProfileActivity f38040b;

                            {
                                this.f38040b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f38040b;
                                switch (i11) {
                                    case 0:
                                        RectF rectF = ProfileActivity.R6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(26, profileActivity, userFull2), new oa0(profileActivity, 15), false, false, profileActivity.f33950z0).f11587b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L02 = org.telegram.messenger.cd.L0(2131753717, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.R = L02;
                                        x1Var.T = org.telegram.messenger.cd.L0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L03 = org.telegram.messenger.cd.L0(2131746697, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                        x1Var2.R = L03;
                                        x1Var2.T = org.telegram.messenger.cd.L0(2131746698, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var2);
                                        return;
                                }
                            }
                        }, false);
                        H.c(2131232107, org.telegram.messenger.cd.L0(2131746336, null), new Runnable(this) {
                            public final ProfileActivity f38040b;

                            {
                                this.f38040b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f38040b;
                                switch (i11) {
                                    case 0:
                                        RectF rectF = ProfileActivity.R6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(26, profileActivity, userFull2), new oa0(profileActivity, 15), false, false, profileActivity.f33950z0).f11587b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L02 = org.telegram.messenger.cd.L0(2131753717, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.R = L02;
                                        x1Var.T = org.telegram.messenger.cd.L0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L03 = org.telegram.messenger.cd.L0(2131746697, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                        x1Var2.R = L03;
                                        x1Var2.T = org.telegram.messenger.cd.L0(2131746698, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.P2) {
                        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(userFull.personal_channel_id));
                        if (L02 != null && org.telegram.messenger.w3.K(L02, false) != null) {
                            H.c(2131232102, org.telegram.messenger.cd.L0(2131746696, null), new et0(10, this, L02), false);
                        }
                        H.c(2131232115, org.telegram.messenger.cd.L0(2131746699, null), new oa0(this, 8), false);
                        H.c(2131232107, org.telegram.messenger.cd.L0(2131746336, null), new Runnable(this) {
                            public final ProfileActivity f38040b;

                            {
                                this.f38040b = this;
                            }

                            @Override
                            public final void run() {
                                int i11 = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.f38040b;
                                switch (i11) {
                                    case 0:
                                        RectF rectF = ProfileActivity.R6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(26, profileActivity, userFull2), new oa0(profileActivity, 15), false, false, profileActivity.f33950z0).f11587b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L022 = org.telegram.messenger.cd.L0(2131753717, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.R = L022;
                                        x1Var.T = org.telegram.messenger.cd.L0(2131753718, null);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.R6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String L03 = org.telegram.messenger.cd.L0(2131746697, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                        x1Var2.R = L03;
                                        x1Var2.T = org.telegram.messenger.cd.L0(2131746698, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
                                            @Override
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i12) {
                                                int i13 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i13) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.R6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().l2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.R6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                        profileActivity2.C5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        profileActivity.showDialog(x1Var2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(2131232115, org.telegram.messenger.cd.L0(2131746692, null), new oa0(this, 13), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Y4(float f7) {
        this.J5 = f7;
        org.telegram.ui.Components.kg0 kg0Var = this.I5;
        if (kg0Var != null) {
            kg0Var.b(f7);
        }
        z5();
    }

    public final boolean Z3() {
        s4.c1 c1Var;
        View view;
        if ((this.I0 || (!org.telegram.messenger.i0.Q1() && !this.f33858m2)) && this.f33802e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1()) {
            this.F0 = true;
            this.f33866n2 = true;
            int i10 = 0;
            while (true) {
                c1Var = null;
                if (i10 < this.f33772a.getChildCount()) {
                    if (RecyclerView.R(this.f33772a.getChildAt(i10)) == 0) {
                        view = this.f33772a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                bw0 bw0Var = this.f33772a;
                View F = bw0Var.F(view);
                if (F != null) {
                    c1Var = bw0Var.T(F);
                }
                if (c1Var != null) {
                    Integer num = (Integer) this.X1.get(Integer.valueOf(c1Var.b()));
                    if (num != null) {
                        this.O1 = true;
                        this.f33772a.w0(0, -(((this.f33772a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.gr.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Z4(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f33908t2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.l1 == 0) {
                this.l1 = -j10;
                getMediaDataController().e0(this.l1, this.classGuid, this.f33811f1);
            }
        }
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.setChatInfo(this.f33908t2);
        }
        kw0 kw0Var = this.f33864n0;
        if (kw0Var != null && !this.f33879p1) {
            kw0Var.setChatInfo(this.f33908t2);
        }
        mw0 mw0Var = this.f33913u0;
        if (mw0Var != null && (chatFull3 = this.f33908t2) != null) {
            mw0Var.setStories(chatFull3.stories);
        }
        rh.g0 g0Var = this.f33920v0;
        if (g0Var != null) {
            g0Var.a();
        }
        jw0 jw0Var = this.f33802e0;
        if (jw0Var != null) {
            jw0Var.setHasStories(w4());
        }
        a4();
        if (this.f33803e1 != 0) {
            boolean z11 = org.telegram.messenger.v2.f18448a;
            if (!getMessagesController().f18813i7 && (chatFull2 = this.f33908t2) != null && chatFull2.stargifts_available) {
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

    public final long a() {
        long j10 = this.f33825h1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f33796d1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f33803e1;
    }

    public final void a4() {
        TLRPC.Chat chat = this.D2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f33908t2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f33908t2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f33908t2.participants.participants.get(i10);
                    this.B1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void a5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y != null && (tL_emojiStatusCollectible2 = this.C6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.C6 = tL_emojiStatusCollectible;
                vh.p2 p2Var = this.f33956z6;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.B6 = null;
                    this.f33956z6 = new vh.p2(getParentActivity(), 3);
                    this.A6 = org.telegram.ui.ActionBar.t6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.t6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f33956z6.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
                    vh.p2 p2Var2 = this.f33956z6;
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
                    this.Y.addView(this.f33956z6, w7.b6.c(24.0f, -1));
                    this.f33956z6.t(9.33f);
                    vh.p2 p2Var3 = this.f33956z6;
                    Typeface o10 = org.telegram.messenger.i0.o();
                    p2Var3.H.x(o10);
                    p2Var3.J.setTypeface(o10);
                    this.f33956z6.s(tL_emojiStatusCollectible.title);
                    vh.p2 p2Var4 = this.f33956z6;
                    p2Var4.d = -1L;
                    p2Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    vh.p2 p2Var5 = this.f33956z6;
                    p2Var5.getClass();
                    p2Var5.D = org.telegram.messenger.i0.N(4.0f);
                    p2Var5.E = org.telegram.messenger.i0.N(2.66f);
                    this.f33956z6.r();
                    this.f33956z6.q(16.0f);
                    this.f33956z6.u();
                    this.f33956z6.setOnClickListener(new sv0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.P1 < org.telegram.messenger.i0.L(82.0f)) {
                        this.B6 = Boolean.FALSE;
                        this.f33956z6.setAlpha(0.0f);
                    }
                    p5();
                    vh.p2 p2Var6 = this.f33956z6;
                    Objects.requireNonNull(p2Var6);
                    org.telegram.messenger.i0.h3(new wv0(p2Var6, 0), 6000L);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21030ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21004h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21050ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20936dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20967f8));
    }

    public final boolean b4() {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (this.I1 != 0 && (z4Var = this.parentLayout) != null && z4Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof un)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void c4() {
        if (this.f33772a == null) {
            return;
        }
        float x10 = org.telegram.ui.Cells.f1.x(((FrameLayout.LayoutParams) this.X.getLayoutParams()).width, this.a2, 0.5f, this.f33772a.getMeasuredWidth() / 2.0f);
        this.Y1 = x10;
        if (this.F1) {
            this.Y1 = org.telegram.messenger.i0.T1(this.f33801d6, x10, this.R1);
        }
        this.X.setTranslationX(this.Y1);
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.N.G0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.f33816f6 = null;
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

    public final int d4() {
        int i10 = 0;
        if (this.f33796d1 != 0 && this.f33884q0 != null && !this.f33892r1) {
            return 0;
        }
        return org.telegram.messenger.i0.L(74 + ((this.H4 || this.I4) ? 25 : 25));
    }

    public final void d5(qx0 qx0Var) {
        if (this.f33836i5 == qx0Var) {
            return;
        }
        this.f33836i5 = qx0Var;
        org.telegram.messenger.i0.d0(this.f33772a, new ov0(this, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        xx0 xx0Var;
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
        bw0 bw0Var;
        bw0 bw0Var2;
        org.telegram.ui.Components.ck0 ck0Var;
        if (i10 != org.telegram.messenger.zs.B5 && i10 != org.telegram.messenger.zs.f19668p3) {
            boolean z12 = true;
            int i12 = 0;
            r8 = false;
            boolean z13 = false;
            if (i10 == org.telegram.messenger.zs.f19676r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i13 = org.telegram.messenger.vp.D8;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f33796d1 != 0) {
                    if (objArr3 != null) {
                        H5(true);
                    }
                    if ((intValue & 1024) != 0 && (bw0Var2 = this.f33772a) != null && (ck0Var = (org.telegram.ui.Components.ck0) bw0Var2.L(this.F3, false)) != null) {
                        this.d.t(ck0Var, this.F3);
                    }
                } else if (this.f33803e1 != 0) {
                    int i14 = intValue & 8192;
                    if (i14 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i14 != 0) {
                            C5(true, false);
                        } else {
                            F5(true);
                        }
                        H5(true);
                    }
                    if (objArr3 != null && (bw0Var = this.f33772a) != null) {
                        int childCount = bw0Var.getChildCount();
                        for (int i15 = 0; i15 < childCount; i15++) {
                            View childAt = this.f33772a.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.pa) {
                                ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == org.telegram.messenger.zs.f19615g1) {
                Long l4 = (Long) objArr[0];
                if (this.f33908t2 != null && (chat = this.D2) != null && chat.f19793id == l4.longValue()) {
                    this.f33908t2.online_count = ((Integer) objArr[1]).intValue();
                    F5(true);
                    H5(false);
                }
            } else if (i10 != org.telegram.messenger.zs.O && i10 != org.telegram.messenger.zs.f19585b1) {
                if (i10 == org.telegram.messenger.zs.f19579a0) {
                    if (this.f33832i1) {
                        org.telegram.messenger.i0.g3(new et0(8, this, objArr));
                    }
                } else if (i10 == org.telegram.messenger.zs.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.C2;
                    if (encryptedChat2 != null && encryptedChat.f19801id == encryptedChat2.f19801id) {
                        this.C2 = encryptedChat;
                        C5(false, false);
                        org.telegram.messenger.o6 o6Var = this.W1;
                        if (o6Var != null) {
                            o6Var.g();
                        }
                    }
                } else if (i10 == org.telegram.messenger.zs.f19614g0) {
                    boolean z14 = this.f33839j1;
                    if (getMessagesController().G0.indexOfKey(this.f33796d1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f33839j1 = z11;
                    if (z14 != z11) {
                        R3(true);
                        C5(false, false);
                    }
                } else if (i10 == org.telegram.messenger.zs.f19713w2) {
                    Long l10 = (Long) objArr[0];
                    if (this.D2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.D2;
                        if (longValue == chat2.f19793id && org.telegram.messenger.w3.w(14, chat2)) {
                            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.currentAccount).M0(l10.longValue());
                            if (M0 != null) {
                                TLRPC.ChatFull chatFull4 = this.f33908t2;
                                if (chatFull4 != null) {
                                    M0.participants = chatFull4.participants;
                                }
                                this.f33908t2 = M0;
                            }
                            ix0 ix0Var = this.N;
                            if (ix0Var != null) {
                                ix0Var.setChatInfo(this.f33908t2);
                            }
                            TLRPC.ChatFull chatFull5 = this.f33908t2;
                            if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.f33872o1) || (inputGroupCall != null && this.f33872o1))) {
                                R3(false);
                            }
                            mw0 mw0Var = this.f33913u0;
                            if (mw0Var != null && (chatFull3 = this.f33908t2) != null) {
                                mw0Var.setStories(chatFull3.stories);
                            }
                            rh.g0 g0Var = this.f33920v0;
                            if (g0Var != null) {
                                g0Var.a();
                            }
                            jw0 jw0Var = this.f33802e0;
                            if (jw0Var != null) {
                                jw0Var.setHasStories(w4());
                            }
                            if (l10.longValue() != 0) {
                                boolean z15 = org.telegram.messenger.v2.f18448a;
                                z12 = (getMessagesController().f18813i7 || (chatFull2 = this.f33908t2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.S0.Q(38, z12);
                                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                                if (hg0Var != null) {
                                    hg0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i10 == org.telegram.messenger.zs.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.f33796d1 != 0 && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1))) != null && chatFull6.f19794id == Z1.linked_community_id) {
                        C5(true, false);
                    }
                    TLRPC.Chat chat3 = this.D2;
                    if (chat3 != null && chatFull6.f19794id == chat3.linked_community_id) {
                        C5(true, false);
                    }
                    if (chatFull6.f19794id == this.f33803e1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.f33908t2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f33908t2 = chatFull6;
                        if (this.l1 == 0) {
                            long j10 = chatFull6.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.l1 = -j10;
                                getMediaDataController().d0(0, this.classGuid, this.l1, this.f33811f1, true);
                            }
                        }
                        a4();
                        kw0 kw0Var = this.f33864n0;
                        if (kw0Var != null && !this.f33879p1) {
                            kw0Var.setChatInfo(this.f33908t2);
                        }
                        C5(true, false);
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f33803e1));
                        if (L0 != null) {
                            this.D2 = L0;
                            R3(true);
                        }
                        org.telegram.messenger.o6 o6Var2 = this.W1;
                        if (o6Var2 != null) {
                            o6Var2.g();
                        }
                        if (this.D2.megagroup && (objArr2 != null || !booleanValue)) {
                            g4(true);
                        }
                        n5();
                        M5();
                        mw0 mw0Var2 = this.f33913u0;
                        if (mw0Var2 != null && (chatFull = this.f33908t2) != null) {
                            mw0Var2.setStories(chatFull.stories);
                        }
                        rh.g0 g0Var2 = this.f33920v0;
                        if (g0Var2 != null) {
                            g0Var2.a();
                        }
                        jw0 jw0Var2 = this.f33802e0;
                        if (jw0Var2 != null) {
                            jw0Var2.setHasStories(w4());
                        }
                        ix0 ix0Var2 = this.N;
                        if (ix0Var2 != null) {
                            ix0Var2.setChatInfo(this.f33908t2);
                        }
                    }
                } else if (i10 == org.telegram.messenger.zs.f19690t) {
                    removeSelfFromStack(true);
                } else if (i10 == org.telegram.messenger.zs.v) {
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
                } else if (i10 == org.telegram.messenger.zs.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f33796d1) {
                        this.E2 = botInfo;
                        C5(false, false);
                    }
                } else if (i10 == org.telegram.messenger.zs.E0) {
                    if (((Long) objArr[0]).longValue() == this.f33796d1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f33915u2 = userFull;
                        org.telegram.ui.Components.nv0 nv0Var = this.S;
                        if (nv0Var != null) {
                            nv0Var.set(userFull.stars_rating);
                        }
                        mw0 mw0Var3 = this.f33913u0;
                        if (mw0Var3 != null) {
                            mw0Var3.setStories(this.f33915u2.stories);
                        }
                        rh.g0 g0Var3 = this.f33920v0;
                        if (g0Var3 != null) {
                            g0Var3.a();
                        }
                        jw0 jw0Var3 = this.f33802e0;
                        if (jw0Var3 != null) {
                            jw0Var3.setHasStories(w4());
                        }
                        ix0 ix0Var3 = this.N;
                        if (ix0Var3 != null) {
                            ix0Var3.setUserInfo(this.f33915u2);
                        }
                        if (this.f33884q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f33915u2.about, this.f33946y2)) {
                                this.d.g(this.V2);
                            }
                            if (this.f33892r1) {
                                C5(false, false);
                            }
                        } else {
                            if (!this.F1 && !this.K0) {
                                R3(true);
                            } else {
                                this.H1 = true;
                            }
                            C5(false, false);
                            ix0 ix0Var4 = this.N;
                            if (ix0Var4 != null) {
                                ix0Var4.setCommonGroupsCount(this.f33915u2.common_chats_count);
                                V();
                                org.telegram.ui.Components.rt0 rt0Var = this.Q;
                                if (rt0Var == null || rt0Var.D) {
                                    resumeDelayedFragmentAnimation();
                                    x4(true);
                                }
                            }
                        }
                        n5();
                        M5();
                        if (this.f33922v2 == null && !u4()) {
                            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(this.currentAccount);
                            this.f33922v2 = i6Var;
                            oa0 oa0Var = new oa0(this, 17);
                            if (i6Var.f22039c) {
                                oa0Var.run();
                            } else {
                                i6Var.h.add(oa0Var);
                            }
                            this.f33922v2.d(this.f33915u2);
                        }
                        if (!u4()) {
                            ly0 ly0Var = this.f33938x2;
                            ly0 c10 = ly0.c(this.currentAccount, this.f33915u2, ly0Var);
                            this.f33938x2 = c10;
                            if (c10 != ly0Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f33930w2 = z10;
                            if (c10 != null) {
                                oa0 oa0Var2 = new oa0(this, 18);
                                if (c10.f39437b) {
                                    oa0Var2.run();
                                } else {
                                    c10.h.add(oa0Var2);
                                }
                            }
                        }
                        if (this.S0 != null) {
                            if (r4()) {
                                this.S0.S(44);
                            } else {
                                this.S0.t(44);
                            }
                            TLRPC.UserFull userFull2 = this.f33915u2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.S0.Q(46, z13);
                            this.S0.Q(47, !z13);
                        }
                    }
                } else if (i10 != org.telegram.messenger.zs.f19638k0) {
                    if (i10 == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i16);
                                if (this.C2 != null) {
                                    TLRPC.MessageAction messageAction = jjVar.f16337k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (xx0Var = this.d) != null) {
                                        xx0Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i10 == org.telegram.messenger.zs.f19630i4) {
                        bw0 bw0Var3 = this.f33772a;
                        if (bw0Var3 != null) {
                            bw0Var3.g1();
                        }
                    } else if (i10 == org.telegram.messenger.zs.f19722x4) {
                        C5(false, false);
                    } else if (i10 == org.telegram.messenger.zs.f19685s1) {
                        int i17 = this.f33783b3;
                        int i18 = this.Z2;
                        int i19 = this.X2;
                        I5();
                        xx0 xx0Var2 = this.d;
                        if (xx0Var2 != null) {
                            if (i17 != this.f33783b3 || i18 != this.Z2 || i19 != this.X2) {
                                xx0Var2.f();
                            }
                        }
                    } else if (i10 == org.telegram.messenger.zs.f19675q5) {
                        if (this.f33879p1) {
                            H5(false);
                        }
                    } else if (i10 == org.telegram.messenger.zs.D1) {
                        hy0 hy0Var = this.e;
                        if (hy0Var != null) {
                            hy0Var.f38053c = hy0.H(this);
                            this.e.f38058w.clear();
                            this.e.J();
                            hy0 hy0Var2 = this.e;
                            hy0Var2.I(hy0Var2.D);
                        }
                    } else if (i10 == org.telegram.messenger.zs.f19590c0) {
                        H5(false);
                    } else if (i10 != org.telegram.messenger.zs.f19709v5 && i10 != org.telegram.messenger.zs.F5) {
                        if (i10 == org.telegram.messenger.zs.f19629i3) {
                            org.telegram.ui.ActionBar.p5 p5Var = this.S0;
                            if (p5Var != null) {
                                TL_account.RequirementToContact H2 = getMessagesController().H2(this.f33796d1);
                                if (H2 != null && !(H2 instanceof TL_account.requirementToContactEmpty)) {
                                    z12 = false;
                                }
                                p5Var.Q(20, z12);
                            }
                            q5();
                        } else if (i10 == org.telegram.messenger.zs.f19613f5) {
                            q5();
                        } else if (i10 == org.telegram.messenger.zs.y3) {
                            C5(false, false);
                        } else if (i10 == org.telegram.messenger.zs.C3) {
                            C5(false, false);
                        } else if (i10 == org.telegram.messenger.zs.D3) {
                            C5(false, false);
                        } else if (i10 == org.telegram.messenger.zs.f19726y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
                                if (z4Var2 != null && z4Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i10 == org.telegram.messenger.zs.f19611f3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.J4 < 0 && longValue3 == a()) {
                                I5();
                                V();
                                xx0 xx0Var3 = this.d;
                                if (xx0Var3 != null) {
                                    xx0Var3.f();
                                }
                            }
                        } else if (i10 == org.telegram.messenger.zs.G3) {
                            if (((Long) objArr[0]).longValue() == a() && !u4()) {
                                if (this.J4 < 0) {
                                    I5();
                                    V();
                                    xx0 xx0Var4 = this.d;
                                    if (xx0Var4 != null) {
                                        xx0Var4.f();
                                    }
                                    org.telegram.messenger.i0.g3(new oa0(this, 19));
                                    return;
                                }
                                ix0 ix0Var5 = this.N;
                                if (ix0Var5 != null) {
                                    ix0Var5.K1(true);
                                }
                            }
                        } else if (i10 == org.telegram.messenger.zs.V3) {
                            if (((Long) objArr[0]).longValue() == a() && this.f33796d1 > 0) {
                                TLRPC.UserFull a2 = getMessagesController().a2(this.f33796d1);
                                if (a2 != null) {
                                    this.f33915u2 = a2;
                                }
                                I5();
                                V();
                                bw0 bw0Var4 = this.f33772a;
                                if (bw0Var4 != null && bw0Var4.c0()) {
                                    this.f33772a.post(new oa0(this, 21));
                                    return;
                                }
                                xx0 xx0Var5 = this.d;
                                if (xx0Var5 != null) {
                                    xx0Var5.f();
                                }
                            }
                        } else if (i10 == org.telegram.messenger.zs.W3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.D2;
                            if (chat4 != null && chat4.f19793id == longValue4) {
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
                                        org.telegram.messenger.i0.a4(this.f33772a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        jw0 jw0Var4 = this.f33802e0;
                        if (jw0Var4 != null) {
                            jw0Var4.setHasStories(w4());
                            this.f33802e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(p4(), 0.0f, this.f33840j2));
                        }
                        mw0 mw0Var4 = this.f33913u0;
                        if (mw0Var4 != null) {
                            TLRPC.UserFull userFull3 = this.f33915u2;
                            if (userFull3 != null) {
                                mw0Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.f33908t2;
                            if (chatFull8 != null) {
                                mw0Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                R3(true);
            }
        } else if (org.telegram.messenger.w3.R(org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(this.f33803e1)))) {
            getMessagesController().O1().k(a(), new ag.z0(18), false, this.f33950z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null && b40Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if ((b40Var == null || dialog != b40Var.f24525c) && super.dismissDialogOnPause(dialog)) {
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
        if (imageReceiver.t() instanceof org.telegram.ui.Components.g61) {
            return ((org.telegram.ui.Components.g61) imageReceiver.t()).f26264a.a();
        }
        return org.telegram.messenger.i0.p(this.f33802e0.getImageReceiver().n());
    }

    public final void e5(CharSequence charSequence) {
        this.V5 = charSequence;
        G5();
    }

    @Override
    public final org.telegram.ui.Components.tk0 f() {
        return this.f33772a;
    }

    public final org.telegram.ui.Components.d5 f4(long j10) {
        if (this.G == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), 2, this.f33809f, false);
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
        r5();
        return this.G;
    }

    public final void f5(int i10) {
        boolean z10;
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
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
            J5();
            if (d12.getBoolean("view_animations", true)) {
                this.I1 = i10;
            } else if (i10 == 2) {
                this.f33857m1 = true;
            }
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.D2;
    }

    public final void g4(boolean z10) {
        a0.h hVar;
        int i10;
        if (!this.A1 && (hVar = this.B1) != null && this.f33908t2 != null) {
            this.A1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().g1(this.f33803e1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.B1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new mg.w(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void g5(TLRPC.UserFull userFull, org.telegram.ui.Cells.i6 i6Var, ly0 ly0Var) {
        boolean z10;
        this.f33915u2 = userFull;
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            nv0Var.set(userFull.stars_rating);
        }
        mw0 mw0Var = this.f33913u0;
        if (mw0Var != null) {
            mw0Var.setStories(this.f33915u2.stories);
        }
        rh.g0 g0Var = this.f33920v0;
        if (g0Var != null) {
            g0Var.a();
        }
        jw0 jw0Var = this.f33802e0;
        if (jw0Var != null) {
            jw0Var.setHasStories(w4());
        }
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.setUserInfo(this.f33915u2);
        }
        if (this.f33922v2 == null) {
            this.f33922v2 = i6Var;
        }
        if (this.f33922v2 == null) {
            this.f33922v2 = new org.telegram.ui.Cells.i6(this.currentAccount);
        }
        org.telegram.ui.Cells.i6 i6Var2 = this.f33922v2;
        oa0 oa0Var = new oa0(this, 23);
        if (i6Var2.f22039c) {
            oa0Var.run();
        } else {
            i6Var2.h.add(oa0Var);
        }
        this.f33922v2.d(this.f33915u2);
        if (this.f33938x2 == null) {
            this.f33938x2 = ly0Var;
        }
        ly0 ly0Var2 = this.f33938x2;
        boolean z11 = true;
        if (ly0Var2 == null) {
            ly0 c10 = ly0.c(this.currentAccount, this.f33915u2, ly0Var2);
            this.f33938x2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33930w2 = z10;
        }
        ly0 ly0Var3 = this.f33938x2;
        if (ly0Var3 != null) {
            oa0 oa0Var2 = new oa0(this, 18);
            if (ly0Var3.f39437b) {
                oa0Var2.run();
            } else {
                ly0Var3.h.add(oa0Var2);
            }
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.S0;
        if (p5Var != null) {
            TL_account.RequirementToContact H2 = getMessagesController().H2(this.f33796d1);
            if (H2 != null && !(H2 instanceof TL_account.requirementToContactEmpty)) {
                z11 = false;
            }
            p5Var.Q(20, z11);
            if (r4()) {
                this.S0.S(44);
            } else {
                this.S0.t(44);
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.R1;
    }

    @Override
    public final gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f33950z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f33950z0 != null) {
            return null;
        }
        g6 g6Var = new g6(18, this);
        ArrayList arrayList = new ArrayList();
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            arrayList.addAll(ix0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33789c1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33802e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33878p0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20931d8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33898s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21070ki));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33898s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21088li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33898s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21107mi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21295x6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21134o6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21242u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21259v6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21330z6));
        int i10 = org.telegram.ui.ActionBar.t6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33772a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
        if (this.Q5) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33809f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33809f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33943y}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33809f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33809f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33943y}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ni));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.f33950z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.p6 p6Var = this.f33950z0;
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

    public final org.telegram.ui.Components.d5 h4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.F == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 2, this.f33809f, false);
            this.F = d5Var;
            if (this.G0) {
                d5Var.a();
            }
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(n4(), z10);
                this.F.m(false, z10);
            } else {
                this.F.j(tL_emojiStatus.document_id, z10);
                this.F.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.F.g(n4(), z10);
                this.F.m(false, z10);
            } else {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z10);
                this.F.m(true, z10);
            }
        } else {
            this.F.g(n4(), z10);
            this.F.m(false, z10);
        }
        r5();
        return this.F;
    }

    public final void h5() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.kg0 kg0Var = new org.telegram.ui.Components.kg0(this.glassEngine, baseSimpleGlass);
        this.I5 = kg0Var;
        ky0 ky0Var = this.f33789c1;
        if (ky0Var != null) {
            int i10 = ky0Var.H;
            boolean z10 = ky0Var.f38990c;
            if (kg0Var.f27756i != i10 || kg0Var.f27757j != z10) {
                kg0Var.f27756i = i10;
                kg0Var.f27757j = z10;
                kg0Var.a();
            }
        }
        this.I5.b(this.J5);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            hg0Var.setGlassFactory(this.I5.f27753c);
        }
        org.telegram.ui.Components.bh0 bh0Var = this.f33780b0;
        if (bh0Var != null) {
            bh0Var.setGlassFactory(this.I5.f27753c);
        }
        this.simpleActionBar.setButtonsGlass(this.I5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        gx0 gx0Var = this.f33861m5;
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 p6Var = this.f33950z0;
        baseSimpleGlass.f6604k = gx0Var;
        baseSimpleGlass.f6605l = null;
        baseSimpleGlass.g(gx0Var, i5Var, p6Var);
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        org.telegram.ui.Components.kg0 kg0Var2 = this.I5;
        tg.b bVar = kg0Var2.e;
        hi.d dVar = kg0Var2.f27754f;
        i5Var2.f20422n0 = bVar;
        i5Var2.f20423o0 = dVar;
        i5Var2.setBackground(null);
        this.G5 = w7.b9.m(this.f33950z0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.H5);
        z5();
        baseSimpleGlass.f6606m = this.K6;
        View view = new View(getParentActivity());
        this.S5 = view;
        view.setAlpha(0.0f);
        this.f33861m5.getViewTreeObserver().addOnPreDrawListener(new bl(this, 1));
        this.N.y(this.S5);
        View view2 = this.S5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.B5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        gx0 gx0Var2 = this.f33861m5;
        gx0Var2.addView(this.B5, gx0Var2.indexOfChild(this.Y), w7.b6.e(-1, 0, 48));
        this.glassEngine.b(this.f33772a);
        this.N.setPagesGlassEngine(this.glassEngine);
        this.N.setOnTopPanelShiftChanged(new oa0(this, 22));
        G3();
        w5();
    }

    public final int i4() {
        return d4() + j4();
    }

    public final void i5(boolean z10, boolean z11) {
        if (this.f33817g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f33810f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f33810f0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33810f0 = animatorSet2;
            if (z10) {
                this.f33817g0.setVisibility(0);
                this.f33810f0.playTogether(ObjectAnimator.ofFloat(this.f33817g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f33817g0, View.ALPHA, 0.0f));
            }
            this.f33810f0.setDuration(180L);
            this.f33810f0.addListener(new xw0(this, z10, 1));
            this.f33810f0.start();
        } else if (z10) {
            this.f33817g0.setAlpha(1.0f);
            this.f33817g0.setVisibility(0);
        } else {
            this.f33817g0.setAlpha(0.0f);
            this.f33817g0.setVisibility(4);
        }
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f33873o2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f33873o2) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null && lVar.u()) {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21279w8, this.f33950z0);
            } else if (!this.Q5 && this.A5 <= 0.5f) {
                org.telegram.messenger.kp kpVar = this.f33816f6;
                if (kpVar != null) {
                    w02 = kpVar.d(org.telegram.ui.ActionBar.t6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.f33950z0);
                }
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f33950z0);
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
        if (d4() == 0) {
            return org.telegram.messenger.i0.L(168.0f);
        }
        return org.telegram.messenger.i0.L(152.0f);
    }

    public final void j5() {
        int i10;
        int i11;
        Long l4;
        if (this.M5 != null) {
            return;
        }
        z21[] z21VarArr = new z21[1];
        Rect rect = org.telegram.messenger.i0.Q;
        kl klVar = this.f33809f;
        if (klVar != null) {
            if (klVar.getRightDrawable() == null) {
                rect.set(this.f33809f.getWidth() - 1, (this.f33809f.getHeight() / 2) - 1, this.f33809f.getWidth() + 1, (this.f33809f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f33809f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f33809f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f33809f.getX(), (int) this.f33809f.getY());
            }
        }
        if (this.f33809f.getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int i12 = i10;
        int L = (-(this.Y.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(i12);
        Point point = org.telegram.messenger.i0.f16026q;
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
        qw0 qw0Var = new qw0(this, this, parentActivity, valueOf, i11, this.f33950z0, i12, z21VarArr);
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1));
        if (Z1 != null) {
            qw0Var.setExpireDateHint(org.telegram.messenger.o5.g(Z1.emoji_status));
        }
        Long l10 = this.E;
        if (l10 != null) {
            qw0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.d5 d5Var = this.F;
            if (d5Var != null) {
                Drawable drawable = d5Var.f25301f[0];
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.f5) drawable).h());
                    qw0Var.setSelected(l4);
                }
            }
            l4 = null;
            qw0Var.setSelected(l4);
        }
        qw0Var.setSaveState(3);
        qw0Var.y(this.F, this.f33809f);
        rw0 rw0Var = new rw0(this, qw0Var);
        this.M5 = rw0Var;
        z21VarArr[0] = rw0Var;
        int[] iArr = new int[2];
        kl klVar2 = this.f33809f;
        if (klVar2 != null) {
            klVar2.getLocationOnScreen(iArr);
        }
        z21VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        z21VarArr[0].b();
    }

    public final float k4() {
        return Math.max(this.A5, this.P5);
    }

    public final void k5() {
        int i10 = 0;
        this.N.K0.setReordering(false);
        ix0 ix0Var = this.N;
        org.telegram.ui.Components.ur0 ur0Var = ix0Var.K0;
        if (ix0Var.f33240x1 != null && ur0Var != null) {
            boolean A0 = ix0Var.A0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ur0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab m0 = org.telegram.ui.Components.zt0.m0(num.intValue(), A0);
                if (m0 != null) {
                    arrayList.add(m0);
                }
            }
        }
        this.N.K1(true);
        this.f33948y5.animate().translationY(org.telegram.messenger.i0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new oa0(this, 25)).start();
        org.telegram.ui.Components.cc.a0(this).Q(2131623989, 36, "Tab order changed.").j();
    }

    public final float l4(float f7, float f10) {
        float f11;
        float f12;
        this.f33912t6 = f7;
        this.f33926v6 = f10;
        int i10 = this.I1;
        if (i10 == 2) {
            f11 = 1.0f;
        } else if (this.R1 < 1.0f && i10 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f33840j2;
        }
        float l4 = Utilities.l(f11);
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            f12 = nv0Var.getVisibilityFactor();
        } else {
            f12 = 0.0f;
        }
        return Math.max(0.0f, (o4() + this.f33876o5) * l4) + c3.i0.z(1.0f, l4, f10 * f12, f7);
    }

    public final void l5() {
        int w02;
        int w03;
        if (!this.f33873o2) {
            lw0 lw0Var = this.f33890r;
            if (lw0Var != null) {
                Object tag = lw0Var.getTag();
                if (tag instanceof Integer) {
                    this.f33890r.setTextColor(H3(org.telegram.ui.ActionBar.t6.w0(((Integer) tag).intValue(), this.f33950z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.f33890r.setTextColor(H3(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.f33950z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.f33935x;
            int i10 = -1;
            if (drawable != null) {
                if (this.f33816f6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20936dd, this.f33950z0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.kl0 kl0Var = this.K;
            if (kl0Var != null) {
                kl0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21004h8, this.f33950z0));
            }
            kl klVar = this.f33809f;
            if (klVar != null) {
                klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21050ji, this.f33950z0));
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                if (this.f33816f6 == null) {
                    i10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, this.f33950z0);
                }
                lVar.D(i10, false);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                if (this.f33816f6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20967f8, this.f33950z0);
                }
                lVar2.C(w02, false);
            }
        }
        r5();
        O5();
    }

    public final float m4(float f7) {
        float f10;
        this.f33934w6 = f7;
        int i10 = this.I1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.R1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f33840j2;
        }
        float l4 = Utilities.l(f10);
        if (this.S != null) {
            f11 = this.S.getVisibilityFactor() * org.telegram.messenger.i0.L(3.0f);
        }
        return c3.i0.z(1.0f, l4, f11, f7);
    }

    public final void m5() {
        int i10;
        float f7;
        l0 l0Var;
        if (this.Z != null && this.f33890r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16020m;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            boolean z10 = this.F1;
            hg0Var.e = z10;
            if (z10 && this.I1 == 2 && (l0Var = this.X) != null) {
                this.Z.f26734f = this.X.getY() + (this.X.getScaleY() * l0Var.getHeight());
                this.Z.setAlpha(this.R1);
                org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                hg0Var2.f26739x = org.telegram.messenger.i0.L(74.0f);
                hg0Var2.setTranslationY(this.f33772a.getMeasuredWidth());
                hg0Var2.invalidate();
            } else {
                hg0Var.f26734f = -1.0f;
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
                hg0Var3.f26739x = min;
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

    public final org.telegram.ui.Components.fr n4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232306).mutate();
            this.D = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33950z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.fr(this.D, getParentActivity().getDrawable(2131232309).mutate());
        }
        return this.J;
    }

    public final void n5() {
        int i10;
        if (this.Y0 != null && this.Z0 != null) {
            TLRPC.UserFull userFull = this.f33915u2;
            if (userFull == null && this.f33908t2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f33908t2.ttl_period;
            }
            this.f33899s0.b(i10);
            this.Z0.t(i10);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.I1 == 0) {
            return true;
        }
        return false;
    }

    public final float o4() {
        if (this.S != null) {
            return this.S.getVisibilityFactor() * org.telegram.messenger.i0.L(22.0f);
        }
        return 0.0f;
    }

    public final void o5() {
        float L;
        boolean z10;
        if (this.f33904s5 != null) {
            ix0 ix0Var = this.N;
            if (ix0Var != null && ix0Var.isAttachedToWindow()) {
                L = org.telegram.messenger.i0.L(232.0f) - (this.f33772a.getMeasuredHeight() - this.N.getY());
            } else {
                L = org.telegram.messenger.i0.L(72.0f);
            }
            int i10 = 0;
            if (L <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            fe.b bVar = this.L5;
            bVar.a(z10, true);
            float f7 = bVar.e;
            this.f33904s5.setTranslationY(org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(60.0f), 0));
            this.f33904s5.setAlpha(f7);
            FrameLayout frameLayout = this.f33904s5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
            if (wbVar != null) {
                wbVar.l();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null) {
            b40Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ur0 ur0Var;
        if (super.onBackPressed(z10)) {
            ix0 ix0Var = this.N;
            if (ix0Var != null && (ur0Var = ix0Var.K0) != null && ur0Var.f24182n0) {
                if (z10) {
                    k5();
                    return false;
                }
            } else if (this.J4 != -1 && ix0Var != null && ix0Var.E1) {
                if (z10) {
                    ix0Var.T(true);
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
        this.f33862m6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        P5();
        this.f33862m6 = true;
        T3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.onConfigurationChanged(configuration);
        }
        s4();
        if (this.f33858m2 && this.f33873o2 && (m10 = this.f33787c.m(0)) != null) {
            this.f33772a.scrollBy(0, m10.getTop() - i4());
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
        bw0 bw0Var = this.f33772a;
        if (bw0Var != null) {
            bw0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.N0();
        }
        org.telegram.ui.Components.rt0 rt0Var = this.Q;
        if (rt0Var != null) {
            rt0Var.b(this);
        }
        org.telegram.ui.Components.rt0 rt0Var2 = this.Q;
        if (rt0Var2 != null) {
            rt0Var2.f30025y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19676r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19690t);
        getNotificationCenter().n(this, org.telegram.messenger.zs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19675q5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19590c0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19709v5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19629i3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19613f5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19726y1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19611f3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.W3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        kw0 kw0Var = this.f33864n0;
        if (kw0Var != null) {
            kw0Var.K();
        }
        org.telegram.ui.Components.mg0 mg0Var = this.m0;
        if (mg0Var != null) {
            mg0Var.d();
        }
        this.Y5 = null;
        if (this.f33796d1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19685s1);
            getNotificationCenter().n(this, org.telegram.messenger.zs.O);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19579a0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19614g0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19638k0);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19722x4);
            getMessagesController().f18876q1.remove(Long.valueOf(this.f33796d1));
        } else if (this.f33803e1 != 0) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19668p3);
            getNotificationCenter().n(this, org.telegram.messenger.zs.T);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19615g1);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19713w2);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19585b1);
        }
        jw0 jw0Var = this.f33802e0;
        if (jw0Var != null) {
            jw0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null) {
            b40Var.d();
        }
        ow0 ow0Var = this.V4;
        if (ow0Var != null) {
            ow0Var.b();
        }
        ly0 ly0Var = this.f33938x2;
        if (ly0Var != null && this.f33930w2) {
            ly0Var.b(true);
            this.f33938x2 = null;
        }
        org.telegram.messenger.video.o oVar = this.f33941x5;
        if (oVar != null) {
            this.f33941x5 = null;
            org.telegram.messenger.i0.g3(oVar);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.fs0 fs0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null) {
            b40Var.i();
        }
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.e();
        }
        ix0 ix0Var = this.N;
        if (ix0Var != null && (fs0Var = ix0Var.V) != null) {
            fs0Var.e = false;
            if (fs0Var.f43338c != null) {
                fs0Var.f43336a.onPause();
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
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
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
                    org.telegram.messenger.u3 f12 = getMessagesController().f1(this.f33803e1, false, null);
                    TLRPC.Chat chat = this.D2;
                    if (f12 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.m1.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1));
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
            TLRPC.UserFull userFull = this.f33915u2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.m1.m(Z1, z11, z12, getParentActivity(), this.f33915u2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User Z1;
        do0 do0Var;
        super.onResume();
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.f33181d1 = true;
            org.telegram.ui.Components.es0 es0Var = ix0Var.J;
            if (es0Var != null) {
                es0Var.f();
            }
            org.telegram.ui.Components.mt0 mt0Var = ix0Var.M;
            if (mt0Var != null) {
                mt0Var.f();
            }
            org.telegram.ui.Components.nt0 nt0Var = ix0Var.L;
            if (nt0Var != null) {
                nt0Var.X(false);
            }
            for (int i10 = 0; i10 < ix0Var.m0.length; i10++) {
                ix0Var.c0(i10);
            }
            org.telegram.ui.Components.fs0 fs0Var = ix0Var.V;
            if (fs0Var != null) {
                fs0Var.e = true;
                if (fs0Var.f43338c != null) {
                    fs0Var.f43336a.onResume();
                }
            }
        }
        s4();
        xx0 xx0Var = this.d;
        if (xx0Var != null) {
            this.T4 = true;
            xx0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (do0Var = this.T) != null && do0Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null) {
            b40Var.k();
            setParentActivityTitle(org.telegram.messenger.cd.L0(2131745512, null));
        }
        H5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        kl klVar = this.f33809f;
        if (klVar != null) {
            setParentActivityTitle(klVar.getText());
        }
        if (this.f33796d1 != 0 && (Z1 = getMessagesController().Z1(Long.valueOf(this.f33796d1))) != null && Z1.photo == null && this.P1 >= i4()) {
            this.f33833i2.cancel();
            float[] fArr = this.f33853l2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            W4(1.0f);
            this.f33864n0.setVisibility(8);
            this.P1 = i4();
            this.f33866n2 = false;
            this.f33787c.h1(0, i4() - this.f33772a.getPaddingTop());
        }
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.a();
        }
        B5();
        x4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f33944y0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, this.f33950z0));
            l5();
            L5();
            I3();
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
                        this.f33840j2 = 0.0f;
                        org.telegram.ui.Components.nv0 nv0Var = this.S;
                        if (nv0Var != null) {
                            nv0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.hg0 hg0Var = this.Z;
                        if (hg0Var != null) {
                            hg0Var.setParentExpanded(0.0f);
                        }
                        Y4(0.0f);
                        org.telegram.ui.Components.bh0 bh0Var = this.f33780b0;
                        if (bh0Var != null) {
                            bh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.F1 = false;
                    N3();
                    if (this.H1) {
                        R3(true);
                    }
                }
                if (!this.f33855l5) {
                    this.f33855l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.P4);
            do0 do0Var = this.T;
            if (do0Var != null && do0Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.G1 = false;
        P3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        do0 do0Var = this.T;
        if (do0Var != null && do0Var.getVisibility() == 0) {
            if (z10) {
                this.T.setAlpha(1.0f - f7);
            } else {
                this.T.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        iy0 iy0Var;
        ImageView imageView;
        org.telegram.ui.Components.hg0 hg0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.f33786b6 = z10;
        if (z10 && (hg0Var = this.Z) != null) {
            ArrayList arrayList = hg0Var.f26730a;
            if (hg0Var.E == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.eg0 eg0Var = (org.telegram.ui.Components.eg0) arrayList.get(i10);
                    org.telegram.ui.Components.bi0 bi0Var = eg0Var.f25785k;
                    if (bi0Var != null) {
                        if (eg0Var.f25778a == 15) {
                            bi0Var.M(14);
                        } else {
                            bi0Var.M(0);
                        }
                        eg0Var.f25785k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.t0)) {
            ((org.telegram.ui.ActionBar.t0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.I1 != 0 && this.L1 && !this.f33873o2) {
            this.F1 = true;
            if (!z10) {
                if (this.Y5 == null) {
                    this.Y5 = new float[14];
                }
                this.E1 = this.P1;
                this.Y5[0] = this.X.getScaleX();
                this.Y5[1] = this.X.getTranslationX();
                this.Y5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                if (hg0Var2 != null) {
                    this.Y5[3] = hg0Var2.getAlpha();
                }
                rh.g0 g0Var = this.f33920v0;
                if (g0Var != null) {
                    float[] fArr = this.Y5;
                    fArr[4] = g0Var.e;
                    fArr[5] = g0Var.f46924f;
                }
                if (this.f33942x6 != null) {
                    this.Y5[6] = iy0Var.getAlpha();
                }
                this.Y5[7] = this.f33809f.getScaleX();
                this.Y5[8] = this.f33809f.getTranslationY();
                this.Y5[9] = this.f33890r.getTranslationY();
                this.Y5[10] = this.f33809f.getLayoutParams().width;
                float[] fArr2 = this.Y5;
                fArr2[11] = this.f33782b2;
                fArr2[12] = this.f33809f.getTranslationX();
                this.Y5[13] = this.f33890r.getTranslationX();
                vh.p2 p2Var = this.f33956z6;
                if (p2Var != null) {
                    p2Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f33884q0 != null) {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.zs.f19683s, org.telegram.messenger.zs.f19690t, org.telegram.messenger.zs.W, org.telegram.messenger.zs.X, org.telegram.messenger.zs.E0, org.telegram.messenger.zs.f19681r4}, this.P4, true);
            } else {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.zs.f19683s, org.telegram.messenger.zs.f19690t, org.telegram.messenger.zs.W, org.telegram.messenger.zs.X, org.telegram.messenger.zs.f19681r4}, this.P4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.G1 = true;
        P3();
    }

    public final int p4() {
        float f7;
        if (this.f33879p1) {
            return 0;
        }
        if (this.f33803e1 != 0 && org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(this.f33803e1)))) {
            if (w4()) {
                f7 = 24.0f;
            } else {
                f7 = 38.0f;
            }
            return org.telegram.messenger.i0.L(f7);
        }
        return org.telegram.messenger.i0.L(50.0f);
    }

    public final void p5() {
        boolean z10;
        vh.p2 p2Var = this.f33956z6;
        if (p2Var != null) {
            float f7 = 0.0f;
            p2Var.m(0.0f, (this.f33809f.getScaleX() * this.f33809f.getRightDrawableX()) + this.f33809f.getX() + (-p2Var.getPaddingLeft()));
            float U1 = org.telegram.messenger.i0.U1(this.f33847k2, this.f33853l2);
            vh.p2 p2Var2 = this.f33956z6;
            p2Var2.setTranslationY(((this.f33809f.getY() + (-p2Var2.getPaddingBottom())) - org.telegram.messenger.i0.L(24.0f)) + org.telegram.messenger.i0.W1(U1, org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(12.0f)));
            this.f33956z6.h(i0.b.f(U1, this.A6, 1342177280));
            if (this.P1 >= org.telegram.messenger.i0.L(82.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean bool = this.B6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.f33956z6.animate();
            this.B6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.z20.m(animate.alpha(f7), org.telegram.ui.Components.gr.f26496g, 200L);
        }
    }

    public final org.telegram.ui.Components.fr q4() {
        int i10;
        float f7;
        if (this.I == null) {
            this.f33943y = org.telegram.ui.ActionBar.t6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.t6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.kp kpVar = this.f33816f6;
            if (kpVar != null) {
                if (kpVar.o(org.telegram.ui.ActionBar.t6.I.q())) {
                    i10 = this.f33816f6.k();
                } else {
                    i10 = this.f33816f6.i();
                }
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.t6.b(0.1f, f7, i10);
                Drawable drawable = this.f33943y;
                int S0 = org.telegram.messenger.i0.S0(this.P5, 1.0f, b10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33950z0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.H.setColorFilter(org.telegram.messenger.i0.S0(this.P5, 1.0f, -1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f33950z0)), mode);
            }
            this.I = new org.telegram.ui.Components.fr(new org.telegram.ui.Components.eq(this.f33943y, this.H), getParentActivity().getDrawable(2131232791));
        }
        return this.I;
    }

    public final void q5() {
        if (getParentActivity() != null && this.U0 != null) {
            if (getUserConfig().q()) {
                this.U0.setIcon(2131231861);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231862);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.f33950z0), PorterDuff.Mode.SRC_IN));
            this.O6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232168);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.U0.setIcon(new zw0(drawable, drawable2, org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f)));
        }
    }

    public final boolean r4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.f33886q2 || (userFull = this.f33915u2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void r5() {
        s5(this.f33808e6);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null) {
            b40Var.f24526f = bundle.getString("path");
        }
    }

    @Override
    public final boolean s() {
        return this.f33786b6;
    }

    public final void s4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33858m2 = z10;
    }

    public final void s5(float f7) {
        int S0;
        org.telegram.messenger.kp kpVar = this.f33816f6;
        if (kpVar != null) {
            S0 = i0.b.f(0.25f, kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.i0.S0(this.P5, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f33950z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.f33950z0));
        }
        int f10 = i0.b.f(f7, S0, -1);
        int i10 = org.telegram.ui.ActionBar.t6.Cj;
        int f11 = i0.b.f(Math.max(this.P5, this.A5), f10, org.telegram.ui.ActionBar.t6.w0(i10, this.f33950z0));
        org.telegram.ui.Components.d5 d5Var = this.F;
        if (d5Var != null) {
            d5Var.k(Integer.valueOf(f11));
        }
        org.telegram.ui.Components.d5 d5Var2 = this.G;
        if (d5Var2 != null) {
            d5Var2.k(Integer.valueOf(i0.b.f(this.P5, i0.b.f(f7, S0, -1711276033), org.telegram.ui.ActionBar.t6.w0(i10, this.f33950z0))));
        }
        this.f33795d0.setColor(f11);
        this.f33808e6 = f7;
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.f33884q0;
        if (b40Var != null && (str = b40Var.f24526f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        int i10;
        this.f33840j2 = f7;
        this.R1 = f7;
        P3();
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setAlpha(f7);
        }
        if (this.I1 == 2) {
            this.f33802e0.setProgressToExpand(f7);
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            if (hg0Var != null) {
                hg0Var.setParentExpanded(f7);
            }
            Y4(f7);
            org.telegram.ui.Components.bh0 bh0Var = this.f33780b0;
            if (bh0Var != null) {
                bh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.nv0 nv0Var = this.S;
            if (nv0Var != null) {
                nv0Var.setParentExpanded(f7);
            }
            m5();
            D5();
        }
        this.f33772a.setAlpha(f7);
        this.f33772a.setTranslationX(org.telegram.messenger.i0.L(48.0f) - (org.telegram.messenger.i0.L(48.0f) * f7));
        if (this.I1 != 2 || (w02 = this.f33891r0) == 0) {
            if (this.f33796d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.f33803e1)) {
                    boolean z10 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.f33950z0;
            int[][] iArr = org.telegram.ui.Components.r8.L;
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, p6Var);
        }
        int i11 = this.X4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.f33950z0);
        }
        this.f33789c1.setBackgroundColor(i0.b.f(f7, i0.b.o(i11, 0), w02));
        org.telegram.ui.Components.f11 f11Var = this.f33852l0;
        int f10 = i0.b.f(f7, i11, w02);
        f11Var.f25944k = true;
        f11Var.f25938b.setColor(f10);
        int i12 = -1;
        if (this.f33816f6 != null) {
            w03 = -1;
        } else {
            if (this.f33796d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.f33803e1)) {
                    boolean z11 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var2 = this.f33950z0;
            int[][] iArr2 = org.telegram.ui.Components.r8.L;
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20987g8, p6Var2);
        }
        this.actionBar.D(i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, this.f33950z0), w03), false);
        if (this.f33816f6 == null) {
            i12 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21050ji, this.f33950z0);
        }
        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.f33950z0);
        kl klVar = this.f33809f;
        if (klVar != null && this.I1 != 2) {
            klVar.setTextColor(i0.b.f(f7, w05, i12));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pi, this.f33950z0);
        } else {
            if (this.f33796d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.f33803e1)) {
                    boolean z12 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var3 = this.f33950z0;
            int[][] iArr3 = org.telegram.ui.Components.r8.L;
            w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21004h8, p6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.t6.f21155pa;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.t6.w0(i10, this.f33950z0);
        lw0 lw0Var = this.f33890r;
        if (lw0Var != null && this.I1 != 2) {
            lw0Var.setTextColor(i0.b.f(f7, w06, H3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.P1 = this.Q1 * f7;
        long j10 = this.f33796d1;
        if (j10 == 0) {
            j10 = this.f33803e1;
        }
        org.telegram.ui.ActionBar.p6 p6Var4 = this.f33950z0;
        int[][] iArr4 = org.telegram.ui.Components.r8.L;
        int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.e(j10)], p6Var4);
        long j11 = this.f33796d1;
        if (j11 == 0) {
            j11 = this.f33803e1;
        }
        int d = org.telegram.ui.Components.r8.d(j11);
        if (w07 != d) {
            this.f33878p0.h(i0.b.f(f7, d, w07));
            this.f33802e0.invalidate();
        }
        int i13 = this.Y4;
        if (i13 != 0) {
            setNavigationBarColor(i0.b.f(f7, i13, getNavigationBarColor()));
        }
        this.f33789c1.invalidate();
        x4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sx0 sx0Var = this.f33794c6;
        if (sx0Var != null) {
            sx0Var.invalidate();
        }
        if (a() > 0) {
            jw0 jw0Var = this.f33802e0;
            if (jw0Var != null) {
                jw0Var.setProgressToStoriesInsets(this.R1);
            }
            mw0 mw0Var = this.f33913u0;
            if (mw0Var != null) {
                mw0Var.setProgressToStoriesInsets(this.R1);
            }
            rh.g0 g0Var = this.f33920v0;
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
            this.W1 = new org.telegram.messenger.o6(z4Var.getParentActivity().getWindow(), new bv0(this, 8));
        }
    }

    public final boolean t4() {
        if (this.D2 != null) {
            return getMessagesController().n2(this.D2);
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f33915u2;
        messagesController.getClass();
        return org.telegram.messenger.vp.I2(userFull);
    }

    public final void t5() {
        this.f33795d0.setScaleX(this.f33809f.getScaleX());
        this.f33795d0.setScaleY(this.f33809f.getScaleY());
        this.f33795d0.b((this.f33809f.getScaleX() * this.f33809f.getRightDrawableX()) + this.f33809f.getX(), (this.f33809f.getHeight() - (this.f33809f.getScaleY() * (this.f33809f.getHeight() - this.f33809f.getRightDrawableY()))) + this.f33809f.getY());
    }

    @Override
    public final void u() {
        this.f33772a.y0(0);
    }

    public final boolean u4() {
        if (this.f33884q0 != null && !this.f33892r1) {
            return true;
        }
        return false;
    }

    public final void u5() {
        if (!this.f33879p1 && org.telegram.messenger.w3.c0(this.D2)) {
            org.telegram.messenger.ot notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().f15938a.c(new org.telegram.messenger.d4(notificationsController, -this.f33803e1, new xv0(this), 6));
        }
    }

    public final void v4(boolean z10) {
        boolean z11;
        boolean c02 = org.telegram.messenger.w3.c0(this.D2);
        TLRPC.Chat chat = this.D2;
        if (!c02 && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.s4.r(this, false, chat, null, false, z11, z10, !c02, new bv0(this, 3));
    }

    public final void v5(float f7) {
        yx0 yx0Var;
        ValueAnimator valueAnimator;
        if (this.f33873o2 || ((yx0Var = this.M) != null && (valueAnimator = yx0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.f33772a.getMeasuredWidth();
            layoutParams.height = (int) (this.P1 + f7);
            this.M.requestLayout();
        }
        ky0 ky0Var = this.f33789c1;
        if (ky0Var != null) {
            ky0Var.E.setTranslate(0.0f, this.Z1 - ky0Var.f38997y);
            ky0 ky0Var2 = this.f33789c1;
            RadialGradient radialGradient = ky0Var2.D;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(ky0Var2.E);
            }
            this.f33789c1.invalidate();
        }
        t5();
        m5();
        D5();
    }

    public final boolean w4() {
        if (getMessagesController().O1().K(a()) && !this.f33879p1) {
            return true;
        }
        return false;
    }

    public final void w5() {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7 = 0.0f;
        if (!this.f33879p1 && !this.F1) {
            f7 = w7.u.a((this.f33782b2 - 0.6f) / 0.4f, 0.0f, 1.0f);
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
            kl klVar = this.f33809f;
            if (klVar != null) {
                klVar.setTextColor(this.D5);
            }
            lw0 lw0Var = this.f33890r;
            if (lw0Var != null) {
                lw0Var.setTextColor(this.E5);
            }
            r5();
            if (z12) {
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19681r4, Boolean.TRUE);
            }
            ky0 ky0Var = this.f33789c1;
            if (ky0Var != null) {
                ky0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        z5();
        y5();
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x4(boolean z10) {
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
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
        float K3 = K3();
        bw0 bw0Var = this.f33772a;
        if (bw0Var != null && !this.F1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bw0Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.f33772a.setLayoutParams(layoutParams2);
            }
        }
        N5(z10);
        if (this.X != null) {
            this.f33772a.setTopGlowOffset((int) this.P1);
            bw0 bw0Var2 = this.f33772a;
            if (this.P1 > i4() && this.P1 < (d4() + this.f33772a.getMeasuredWidth()) - currentActionBarHeight) {
                i16 = 2;
            } else {
                i16 = 0;
            }
            bw0Var2.setOverScrollMode(i16);
        }
        if (this.X != null && !this.f33786b6 && this.F1) {
            J3();
            return;
        }
        int i42 = i4();
        if (this.X != null) {
            if (this.Z != null && this.f33803e1 != 0) {
                if (org.telegram.messenger.w3.T(this.D2) && !this.D2.megagroup && (chatFull = this.f33908t2) != null && chatFull.linked_chat_id != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.Z.o(2, z11);
            }
            N5(z10);
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = org.telegram.messenger.i0.f16020m;
            } else {
                i11 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.z20.b(K3, 1.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f, i11) - org.telegram.messenger.i0.L(21.0f));
            if (!this.F1) {
                org.telegram.ui.Components.yg0 yg0Var = this.f33906t0;
                if (yg0Var != null) {
                    f18 = -org.telegram.messenger.i0.L(29.0f);
                    org.telegram.messenger.ks ksVar = yg0Var.f32735n;
                    if (ksVar != null && ksVar.f16632c) {
                        f18 = ksVar.e.centerY();
                    }
                } else {
                    f18 = -org.telegram.messenger.i0.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i15 = org.telegram.messenger.i0.f16020m;
                } else {
                    i15 = 0;
                }
                this.Z1 = org.telegram.messenger.i0.T1(f18, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i15) - org.telegram.messenger.i0.L(21.0f)), K3);
            } else {
                this.Z1 = translationY;
            }
            if (this.F1) {
                f7 = this.Q1;
            } else {
                f7 = this.P1;
            }
            float f19 = i42;
            if (f7 <= f19 && !this.f33873o2) {
                f10 = 2.0f;
                f11 = 18.0f;
            } else {
                f10 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f7 - f19) / ((this.f33772a.getMeasuredWidth() - currentActionBarHeight) - j4())));
                this.f33819g2 = max;
                f11 = 18.0f;
                this.a2 = (org.telegram.messenger.i0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.f33782b2 = 0.0f;
                mw0 mw0Var = this.f33913u0;
                if (mw0Var != null) {
                    mw0Var.invalidate();
                }
                rh.g0 g0Var = this.f33920v0;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.i0.N(2000.0f), Math.max(org.telegram.messenger.i0.N(1100.0f), Math.abs(this.f33826h2))) / org.telegram.messenger.i0.N(1100.0f);
                d4();
                boolean z12 = this.f33866n2;
                int i17 = org.telegram.messenger.zs.f19681r4;
                float[] fArr = this.f33853l2;
                if (z12 && (this.F0 || this.f33819g2 >= 0.33f)) {
                    if (!this.f33873o2) {
                        if (this.S0 != null) {
                            if (!t4()) {
                                this.S0.S(21);
                            } else {
                                this.S0.t(21);
                            }
                            if (this.f33884q0 != null) {
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
                        this.f33873o2 = true;
                        org.telegram.messenger.zs.e().k(i17, Boolean.TRUE);
                        this.M.f(true, min);
                        this.f33871o0.b(min);
                        this.f33864n0.setCreateThumbFromParent(true);
                        this.f33864n0.getAdapter().g();
                        this.f33833i2.cancel();
                        fArr[0] = org.telegram.messenger.i0.U1(this.f33847k2, fArr);
                        fArr[1] = 1.0f;
                        mw0 mw0Var2 = this.f33913u0;
                        if (mw0Var2 != null && !mw0Var2.f34082x.isEmpty()) {
                            this.f33833i2.setInterpolator(new u1.a());
                            this.f33833i2.setDuration((((1.0f - U12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.f33833i2.setInterpolator(org.telegram.ui.Components.gr.f26498j);
                            this.f33833i2.setDuration(((1.0f - U12) * 250.0f) / min);
                        }
                        this.f33833i2.addListener(new nw0(this, 4));
                        View m10 = this.f33787c.m(0);
                        if (!this.O1 && m10 != null) {
                            this.N1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i12 = org.telegram.messenger.i0.f16020m;
                            } else {
                                i12 = 0;
                            }
                            this.f33772a.x0(((m10.getTop() - this.f33772a.getMeasuredWidth()) - d4()) + currentActionBarHeight2 + i12, (int) this.f33833i2.getDuration(), (Interpolator) this.f33833i2.getInterpolator());
                            this.f33772a.O0 = false;
                        }
                        this.Z5 = this.f33809f.getTranslationY();
                        this.f33778a6 = this.f33890r.getTranslationY();
                        this.f33833i2.start();
                        this.f33864n0.setAlpha(0.0f);
                        this.f33864n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.f33864n0.getLayoutParams();
                    int i18 = layoutParams3.height;
                    layoutParams3.width = this.f33772a.getMeasuredWidth();
                    float f20 = currentActionBarHeight + f7;
                    int i19 = (int) f20;
                    layoutParams3.height = i19;
                    if (i18 != i19) {
                        this.f33864n0.requestLayout();
                    }
                    if (!this.f33833i2.isRunning()) {
                        if (this.F1 && this.I1 == 2) {
                            f12 = (-(1.0f - this.R1)) * org.telegram.messenger.i0.L(50.0f);
                        } else {
                            f12 = 0.0f;
                        }
                        this.f33809f.setTranslationX(org.telegram.messenger.i0.N(18.0f) - this.f33809f.getLeft());
                        this.f33809f.setTranslationY((((f20 - d4()) - org.telegram.messenger.i0.N(30.0f)) - this.f33809f.getBottom()) + f12);
                        this.f33890r.setTranslationX(l4(org.telegram.messenger.i0.N(16.0f) - this.f33890r.getLeft(), 0.0f));
                        this.f33890r.setTranslationY(m4((((f20 - d4()) - org.telegram.messenger.i0.N(10.0f)) - this.f33890r.getBottom()) + f12));
                        p5();
                    }
                } else {
                    if (this.f33873o2) {
                        this.f33873o2 = false;
                        org.telegram.messenger.zs.e().k(i17, Boolean.TRUE);
                        org.telegram.ui.ActionBar.p5 p5Var2 = this.S0;
                        if (p5Var2 != null) {
                            p5Var2.t(21);
                            if (this.f33884q0 != null) {
                                this.S0.t(33);
                                this.S0.t(34);
                                this.S0.t(35);
                                this.S0.S(36);
                                this.S0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.p5 p5Var3 = this.T0;
                        if (p5Var3 != null) {
                            p5Var3.setEnabled(!this.f33945y1);
                        }
                        this.M.f(false, min);
                        this.f33871o0.b(min);
                        this.f33833i2.cancel();
                        this.f33802e0.getImageReceiver().f14408t0 = true;
                        this.f33802e0.getImageReceiver().P0(false);
                        fArr[0] = org.telegram.messenger.i0.U1(this.f33847k2, fArr);
                        fArr[1] = 0.0f;
                        this.f33833i2.setInterpolator(org.telegram.ui.Components.gr.f26498j);
                        if (!this.f33858m2) {
                            this.f33833i2.setDuration((U1 * 250.0f) / min);
                        } else {
                            this.f33833i2.setDuration(0L);
                        }
                        this.f33789c1.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.f33950z0));
                        if (!this.H0 && (currentItemView = this.f33864n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.g61) {
                                this.f33802e0.f38623a0 = false;
                            } else {
                                jw0 jw0Var = this.f33802e0;
                                jw0Var.f38623a0 = true;
                                jw0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.f33833i2.addListener(new nw0(this, 5));
                        this.f33802e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.f33864n0.setAlpha(0.0f);
                        this.f33833i2.start();
                        this.O1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    c4();
                    ValueAnimator valueAnimator = this.f33833i2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        Q4();
                        this.f33809f.setTranslationY(this.f33797d2);
                        this.f33890r.setTranslationX(l4(this.f33804e2, this.f33919u6));
                        this.f33890r.setTranslationY(m4(this.f33812f2));
                        p5();
                    }
                }
            }
            boolean z13 = this.F1;
            if (z13 && this.I1 == 2) {
                float f21 = this.f33801d6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.i0.f16020m;
                } else {
                    i14 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / f10) + i14) - (org.telegram.messenger.i0.f16025p * 21.0f));
                this.f33809f.setPivotY(klVar.getMeasuredHeight());
                this.f33809f.setScaleX(1.38f);
                this.f33809f.setScaleY(1.38f);
                this.a2 = org.telegram.messenger.i0.W1(this.R1, 42, 138) / 100.0f;
                this.f33782b2 = 0.0f;
                mw0 mw0Var3 = this.f33913u0;
                if (mw0Var3 != null) {
                    mw0Var3.setExpandProgress(1.0f);
                }
                rh.g0 g0Var2 = this.f33920v0;
                if (g0Var2 != null) {
                    g0Var2.setExpandProgress(1.0f);
                }
                this.f33802e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(p4(), 0.0f, this.R1));
                this.X.setTranslationX(org.telegram.messenger.i0.T1(f21, 0.0f, this.R1));
                this.X.setTranslationY(org.telegram.messenger.i0.T1((float) Math.ceil(translationY2), 0.0f, this.R1));
                float measuredWidth = ((this.a2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - org.telegram.messenger.i0.L(42.0f));
                this.f33824h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + measuredWidth);
                this.f33824h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + measuredWidth);
                this.f33831i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.f33831i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + measuredWidth);
                this.f33838j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.f33838j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + measuredWidth);
                this.f33845k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.f33845k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + measuredWidth);
                this.X.setScaleX(this.a2);
                this.X.setScaleY(this.a2);
                this.f33864n0.setAlpha(0.0f);
                this.f33864n0.setVisibility(0);
                jw0 jw0Var2 = this.f33802e0;
                float f22 = this.R1;
                float f23 = this.a2;
                jw0Var2.H = f22;
                jw0Var2.I = f23;
                jw0Var2.G = true;
                this.M.e(false, f22);
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                int i20 = -1;
                if (this.f33816f6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, this.f33950z0);
                }
                lVar.D(i0.b.f(this.R1, w02, -1), false);
                org.telegram.ui.Components.kl0 kl0Var = this.K;
                if (kl0Var != null) {
                    kl0Var.b(i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21004h8, this.f33950z0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f33935x;
                if (drawable != null) {
                    if (this.f33816f6 == null) {
                        i20 = i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20936dd, this.f33950z0), -1);
                    }
                    drawable.setColorFilter(i20, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.fr frVar = this.I;
                if (frVar != null) {
                    frVar.a(this.R1);
                    this.f33809f.invalidate();
                }
                org.telegram.ui.Components.fr frVar2 = this.J;
                if (frVar2 != null) {
                    frVar2.a(this.R1);
                    this.f33809f.invalidate();
                }
                s5(this.R1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams4.width = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), this.f33772a.getMeasuredWidth() / this.a2, this.R1);
                layoutParams4.height = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), (this.P1 + currentActionBarHeight) / this.a2, this.R1);
                this.X.requestLayout();
                p5();
            } else if (f7 <= f19) {
                if (z13) {
                    this.a2 = org.telegram.messenger.i0.W1(K3, 42, 96) / 100.0f;
                    this.f33782b2 = 0.0f;
                    f14 = 1.0f;
                } else {
                    org.telegram.ui.Components.yg0 yg0Var2 = this.f33906t0;
                    if (yg0Var2 != null) {
                        f13 = yg0Var2.getHiddenAvatarSizeDp();
                    } else {
                        f13 = 24.0f;
                    }
                    this.a2 = org.telegram.messenger.i0.T1(f13, 96.0f, K3) / 100.0f;
                    f14 = 1.0f;
                    this.f33782b2 = 1.0f - K3;
                }
                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                if (hg0Var != null) {
                    if (this.F1) {
                        hg0Var.setAlpha(this.R1);
                    } else {
                        hg0Var.setAlpha(f14);
                    }
                }
                mw0 mw0Var4 = this.f33913u0;
                if (mw0Var4 != null) {
                    mw0Var4.invalidate();
                }
                rh.g0 g0Var3 = this.f33920v0;
                if (g0Var3 != null) {
                    g0Var3.h = this.F1;
                    float l4 = Utilities.l((K3 - 0.3f) / 0.7f);
                    if (g0Var3.f46924f != l4) {
                        g0Var3.f46924f = l4;
                        g0Var3.invalidate();
                    }
                }
                float f24 = (0.12f * K3) + 1.0f;
                ValueAnimator valueAnimator2 = this.f33833i2;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    ValueAnimator valueAnimator3 = this.f33833i2;
                    nw0 nw0Var = this.X5;
                    valueAnimator3.removeListener(nw0Var);
                    this.f33833i2.addListener(nw0Var);
                } else {
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    c4();
                    this.X.setTranslationY((float) Math.ceil(this.Z1));
                    float L = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.i0.L(42.0f)) - org.telegram.messenger.i0.L(42.0f);
                    this.f33824h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + L);
                    this.f33824h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + L);
                    this.f33831i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                    this.f33831i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + L);
                    this.f33838j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                    this.f33838j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                    this.f33845k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
                    this.f33845k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = org.telegram.messenger.i0.N(8.0f) + (this.X.getScaleY() * this.X.getHeight());
                if (this.F1) {
                    f15 = this.R1;
                } else {
                    f15 = K3;
                }
                float f25 = (N * f15) + floor;
                this.f33797d2 = c3.i0.z(1.0f, this.R1, 0.0f, (org.telegram.messenger.i0.L(7.0f) * K3) + org.telegram.messenger.i0.L(1.3f) + f25);
                this.f33812f2 = (((float) Math.floor(org.telegram.messenger.i0.f16025p * 11.0f)) * K3) + f25 + org.telegram.messenger.i0.L(24.0f);
                if (this.F1) {
                    f16 = (this.f33801d6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f);
                } else {
                    f16 = -org.telegram.messenger.i0.N(46.0f);
                }
                iy0 iy0Var = this.f33942x6;
                if (iy0Var != null) {
                    iy0Var.setAlpha((int) (255.0f * K3));
                }
                int measuredWidth2 = this.f33772a.getMeasuredWidth();
                this.f33809f.setScaleX(f24);
                this.f33809f.setScaleY(f24);
                y4(0, K3, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f33809f.getLayoutParams();
                float f26 = measuredWidth2 / f10;
                float min2 = f26 - (((Math.min(this.f33809f.getExactWidth(), layoutParams5.width) * f24) * 0.5f) + layoutParams5.leftMargin);
                float f27 = ((FrameLayout.LayoutParams) this.f33890r.getLayoutParams()).width;
                if (!this.p5 && this.f33890r.getExactWidth() <= (f27 - this.f33890r.getPaddingLeft()) - this.f33890r.getPaddingRight()) {
                    f17 = this.f33890r.getPaddingLeft();
                } else {
                    f17 = 0.0f;
                }
                float min3 = f26 - ((Math.min(this.f33890r.getExactWidth(), f27) * 0.5f) + (layoutParams.leftMargin + f17));
                this.f33790c2 = min2;
                this.f33804e2 = min3;
                this.f33919u6 = f17;
                if (this.F1) {
                    min2 = org.telegram.messenger.i0.T1(f16, min2, K3);
                    min3 = org.telegram.messenger.i0.T1(f16, min3, K3);
                }
                ValueAnimator valueAnimator4 = this.f33833i2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f33809f.setTranslationX(min2);
                    this.f33809f.setTranslationY(this.f33797d2);
                    this.f33890r.setTranslationX(l4(min3, this.f33919u6 * K3));
                    this.f33890r.setTranslationY(m4(this.f33812f2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f33809f.getLayoutParams();
                int i21 = layoutParams6.width;
                if (org.telegram.messenger.i0.Q1()) {
                    i13 = org.telegram.messenger.i0.L(490.0f);
                } else {
                    i13 = org.telegram.messenger.i0.f16026q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i13 - org.telegram.messenger.i0.L(f11)) / this.f33809f.getScaleX()) - (this.f33809f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i21) {
                    this.f33809f.requestLayout();
                }
                p5();
            }
            ValueAnimator valueAnimator5 = this.f33833i2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                y4(0, K3, true);
            }
        }
        v5(currentActionBarHeight);
        if (K3 >= 1.0f) {
            this.f33802e0.setAlpha(1.0f);
        }
    }

    public final void x5() {
        ix0 ix0Var = this.N;
        if (ix0Var != null && this.U5 != 0) {
            int topPanelShift = ix0Var.getTopPanelShift();
            int i10 = 0;
            if (topPanelShift > 0 && this.N.isAttachedToWindow()) {
                if (this.N.getParent() == this.f33772a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.N.getY()));
                }
                i10 = topPanelShift;
            }
            int i11 = this.U5 + i10;
            b5(i11, this.B5);
            b5(i11, this.S5);
        }
    }

    @Override
    public final boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
        Bundle g10 = a1.g.g("scrollToTopOnResume", true);
        if (org.telegram.messenger.o5.C(j10)) {
            g10.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.o5.E(j10)) {
            g10.putLong("user_id", j10);
        } else if (org.telegram.messenger.o5.z(j10)) {
            g10.putLong("chat_id", -j10);
        }
        if (!getMessagesController().E(g10, ayVar, null, null)) {
            return false;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        int i12 = org.telegram.messenger.zs.f19690t;
        notificationCenter.n(this, i12);
        getNotificationCenter().k(i12, new Object[0]);
        presentFragment(new un(g10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.oz.g(getMessagesController().Z1(Long.valueOf(this.f33796d1)), j10, null, null, null, null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.qz.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j10, 0L, z11, i10, i11);
        }
        return true;
    }

    public final void y4(int r10, float r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.y4(int, float, boolean):void");
    }

    public final void y5() {
        boolean z10;
        float f7;
        if (this.B5 != null && this.S5 != null) {
            ix0 ix0Var = this.N;
            int i10 = 0;
            if (ix0Var != null && ix0Var.getParent() == this.f33772a && this.N.isAttachedToWindow()) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(this.A5, this.P5);
            View view = this.B5;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = max;
            }
            view.setAlpha(f7);
            this.B5.setVisibility((z10 || max <= 0.0f) ? 8 : 8);
            View view2 = this.S5;
            if (!z10) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z10) {
                this.S5.setTranslationY(-(this.N.getY() + this.f33772a.getY()));
            }
        }
    }

    public final void z5() {
        if (this.simpleActionBar != null && this.G5 != null) {
            org.telegram.ui.Components.kg0 kg0Var = this.I5;
            if (kg0Var != null) {
                float k42 = k4();
                if (kg0Var.f27759l != k42) {
                    kg0Var.f27759l = k42;
                    kg0Var.a();
                }
            }
            int f7 = i0.b.f(k4(), this.C5, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f33950z0));
            if (this.F5 != f7) {
                this.F5 = f7;
                org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
                i5Var.f20420l0 = true;
                i5Var.f20414f0 = f7;
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

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.rt0 rt0Var) {
        super(bundle);
        this.h = null;
        this.f33863n = null;
        this.f33928w0 = null;
        this.f33936x0 = new org.telegram.ui.Components.l40(this, 2);
        this.f33944y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f33774a1 = 1.0f;
        this.B1 = new a0.h();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.X1 = new HashMap();
        this.f33853l2 = new float[]{0.0f, 1.0f};
        this.f33880p2 = new Paint();
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
        this.f33777a5 = 0L;
        this.f33829h5 = new HashSet();
        this.f33843j5 = new pw0(this, 0);
        this.f33850k5 = new vw0(this);
        this.H5 = new aw0(this);
        this.L5 = new fe.b(0, new bv0(this, 7), org.telegram.ui.Components.gr.h, 380L, true);
        this.R5 = new pw0(this, 1);
        this.X5 = new nw0(this, 2);
        this.Y5 = null;
        this.f33823g6 = new SparseIntArray();
        this.f33837i6 = null;
        this.f33844j6 = -1;
        this.f33877o6 = new int[3];
        this.f33883p6 = -1.0f;
        hi.b bVar = new hi.b();
        this.I6 = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.J6 = bVar2;
        this.L6 = new Paint();
        this.Q6 = new int[7];
        this.Q = rt0Var;
        bVar2.e = new je.b();
    }

    @Override
    public final void T() {
    }
}
