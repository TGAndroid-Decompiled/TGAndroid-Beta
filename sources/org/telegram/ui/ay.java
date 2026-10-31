package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
public class ay extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, fg.b, fe.e, of0 {
    public static float A4;
    public static boolean f35769x4;
    public static final boolean[] f35770y4 = new boolean[4];
    public static final org.telegram.ui.Components.qq0 f35771z4 = new org.telegram.ui.Components.qq0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ow B1;
    public boolean B2;
    public Long B3;
    public kx C0;
    public bi.f2 C1;
    public ux C2;
    public Drawable C3;
    public boolean D;
    public org.telegram.ui.Components.rt0 D0;
    public org.telegram.ui.ActionBar.t0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.d5 D3;
    public boolean E;
    public uw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.n E3;
    public boolean F;
    public org.telegram.ui.Components.xr F0;
    public mw F1;
    public CharSequence F2;
    public xw F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.sp0 G2;
    public final nw G3;
    public long H;
    public float H0;
    public mw H1;
    public xs H2;
    public final nw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public mf0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.zr J1;
    public boolean J2;
    public xa.n J3;
    public boolean K;
    public bi.t0 K0;
    public org.telegram.ui.Components.yr K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.z60 L0;
    public org.telegram.ui.Cells.l L1;
    public int L2;
    public int L3;
    public boolean M;
    public zw M0;
    public org.telegram.ui.Cells.d3 M1;
    public boolean M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ma N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public AnimatorSet O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public boolean P3;
    public boolean Q;
    public long Q0;
    public zh.j Q1;
    public int Q2;
    public ou Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.wb S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.x1 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.gc0 V0;
    public boolean V1;
    public boolean V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.v2 W0;
    public long W1;
    public int W2;
    public float W3;
    public px X;
    public org.telegram.ui.Cells.v2 X0;
    public TLObject X1;
    public ay X2;
    public boolean X3;
    public rf.a0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public q01 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public ValueAnimator Z3;
    public final int f35772a;
    public org.telegram.ui.Components.v71 f35773a0;
    public final ArrayList f35774a1;
    public boolean a2;
    public TLRPC.ChatFull f35775a3;
    public org.telegram.ui.Components.b40 f35776a4;
    public final fe.b f35777b;
    public zf.g0 f35778b0;
    public boolean f35779b1;
    public boolean f35780b2;
    public org.telegram.ui.Components.g9 f35781b3;
    public TLRPC.FileLocation f35782b4;
    public final fe.b f35783c;
    public float f35784c0;
    public boolean f35785c1;
    public boolean f35786c2;
    public org.telegram.ui.Components.r8 f35787c3;
    public TLRPC.FileLocation f35788c4;
    public final fe.b d;
    public ValueAnimator f35789d0;
    public boolean f35790d1;
    public int f35791d2;
    public long f35792d3;
    public org.telegram.ui.Components.wb f35793d4;
    public final fe.b e;
    public zx[] f35794e0;
    public org.telegram.ui.ActionBar.c2 f35795e1;
    public boolean f35796e2;
    public boolean f35797e3;
    public int f35798e4;
    public final fe.b f35799f;
    public org.telegram.ui.ActionBar.t0 f35800f0;
    public final Paint f35801f1;
    public String f35802f2;
    public boolean f35803f3;
    public int f35804f4;
    public org.telegram.ui.ActionBar.t0 f35805g0;
    public ImageView f35806g1;
    public String f35807g2;
    public AnimatorSet f35808g3;
    public int f35809g4;
    public final fe.b h;
    public dy f35810h0;
    public NumberTextView f35811h1;
    public String f35812h2;
    public boolean f35813h3;
    public int f35814h4;
    public boolean f35815i0;
    public final ArrayList f35816i1;
    public boolean f35817i2;
    public boolean f35818i3;
    public int f35819i4;
    public org.telegram.ui.ActionBar.t0 f35820j0;
    public org.telegram.ui.ActionBar.t0 f35821j1;
    public boolean f35822j2;
    public float f35823j3;
    public final tg.f f35824j4;
    public org.telegram.ui.ActionBar.t0 f35825k0;
    public org.telegram.ui.ActionBar.t0 f35826k1;
    public boolean f35827k2;
    public boolean f35828k3;
    public final hi.f f35829k4;
    public org.telegram.ui.ActionBar.t0 f35830l0;
    public org.telegram.ui.ActionBar.t0 l1;
    public boolean f35831l2;
    public int f35832l3;
    public final hi.f l4;
    public org.telegram.ui.ActionBar.t0 m0;
    public org.telegram.ui.ActionBar.t0 f35833m1;
    public boolean f35834m2;
    public boolean f35835m3;
    public final hi.c f35836m4;
    public final fe.b f35837n;
    public org.telegram.ui.Components.kh0 f35838n0;
    public org.telegram.ui.ActionBar.b1 f35839n1;
    public String f35840n2;
    public boolean f35841n3;
    public final tg.b f35842n4;
    public org.telegram.ui.ActionBar.b1 f35843o0;
    public org.telegram.ui.ActionBar.b1 f35844o1;
    public String f35845o2;
    public org.telegram.ui.Components.wb f35846o3;
    public final tg.b f35847o4;
    public vh.p2 f35848p0;
    public org.telegram.ui.ActionBar.b1 f35849p1;
    public final org.telegram.messenger.gs f35850p2;
    public final e2.f f35851p3;
    public final tg.b f35852p4;
    public vh.p2 f35853q0;
    public org.telegram.ui.ActionBar.b1 f35854q1;
    public boolean f35855q2;
    public boolean f35856q3;
    public final tg.b f35857q4;
    public final fe.b f35858r;
    public boolean f35859r0;
    public org.telegram.ui.ActionBar.b1 f35860r1;
    public boolean f35861r2;
    public boolean f35862r3;
    public yv f35863r4;
    public final fe.b f35864s;
    public boolean f35865s0;
    public org.telegram.ui.ActionBar.b1 f35866s1;
    public boolean f35867s2;
    public boolean f35868s3;
    public final ArrayList f35869s4;
    public org.telegram.ui.Components.f10 f35870t0;
    public org.telegram.ui.ActionBar.b1 f35871t1;
    public boolean f35872t2;
    public boolean f35873t3;
    public final RectF f35874t4;
    public org.telegram.ui.Components.f10 f35875u0;
    public float f35876u1;
    public boolean f35877u2;
    public float f35878u3;
    public final RectF f35879u4;
    public vh.d f35880v0;
    public float f35881v1;
    public boolean f35882v2;
    public ValueAnimator f35883v3;
    public int f35884v4;
    public final hh.i f35885w;
    public bh.i f35886w0;
    public AnimatorSet f35887w1;
    public boolean f35888w2;
    public float f35889w3;
    public int f35890w4;
    public boolean f35891x;
    public int f35892x0;
    public float f35893x1;
    public boolean f35894x2;
    public float f35895x3;
    public int f35896y;
    public final UndoView[] f35897y0;
    public zg.e f35898y1;
    public boolean f35899y2;
    public float y3;
    public qx f35900z0;
    public FrameLayout f35901z1;
    public boolean f35902z2;
    public boolean f35903z3;

    public ay(Bundle bundle) {
        super(bundle);
        int i10;
        int L;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f35772a = i10;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f35777b = new fe.b(1, this, grVar, 350L, false);
        this.f35783c = new fe.b(2, this, grVar, 350L, false);
        this.d = new fe.b(3, this, grVar, 350L, false);
        this.e = new fe.b(4, this, grVar, 350L, false);
        this.f35799f = new fe.b(5, this, grVar, 350L, false);
        this.h = new fe.b(6, this, grVar, 350L, false);
        this.f35837n = new fe.b(7, this, grVar, 350L, false);
        this.f35858r = new fe.b(8, this, grVar, 350L, false);
        this.f35864s = new fe.b(9, this, grVar, 350L, false);
        this.f35885w = new hh.i(new fv(this, 18));
        this.f35896y = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f35784c0 = 1.0f;
        this.f35897y0 = new UndoView[2];
        this.f35774a1 = new ArrayList();
        this.f35801f1 = new Paint();
        this.f35816i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f35786c2 = true;
        this.f35817i2 = true;
        this.f35850p2 = new Object();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f35851p3 = new e2.f(null);
        this.G3 = new nw(this, 0);
        this.H3 = new nw(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f35869s4 = arrayList;
        RectF rectF = new RectF();
        this.f35874t4 = rectF;
        RectF rectF2 = new RectF();
        this.f35879u4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        hi.c d = this.glassEngine.d(new iv(this, 12));
        this.f35836m4 = d;
        if (i11 >= 31) {
            tg.f fVar = new tg.f(false);
            this.f35824j4 = fVar;
            hi.f fVar2 = new hi.f(d);
            this.l4 = fVar2;
            fVar2.f7719f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(null);
            this.f35829k4 = fVar3;
            fVar3.f7719f = d;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2);
            this.f35852p4 = bVar;
            bVar.f48702i = true;
            if (org.telegram.messenger.sc.e(262144)) {
                L = org.telegram.messenger.i0.L(8.0f);
            } else {
                L = org.telegram.messenger.i0.L(48.0f);
            }
            bVar.f48698b = L;
            bVar.f48699c = L;
            tg.b bVar2 = new tg.b(fVar3);
            this.f35842n4 = bVar2;
            bVar2.f48702i = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.f48698b = L2;
            bVar2.f48699c = L2;
            this.f35847o4 = new tg.b(fVar3);
        } else {
            this.f35824j4 = null;
            this.f35829k4 = null;
            this.l4 = null;
            this.f35842n4 = new tg.b(d);
            this.f35852p4 = new tg.b(d);
            this.f35847o4 = new tg.b(d);
        }
        tg.b bVar3 = new tg.b(d);
        this.f35857q4 = bVar3;
        tg.b bVar4 = this.f35852p4;
        ei.r rVar = this.glassEngine;
        bVar4.h = rVar;
        this.f35842n4.h = rVar;
        this.f35847o4.h = rVar;
        bVar3.h = rVar;
    }

    public static void A0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "PREMIUM_CHRISTMAS");
        ayVar.f5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(ayVar).G(2131624032, 4, org.telegram.messenger.cd.L0(2131753330, null));
        G.f32135j = 5000;
        G.j();
    }

    public static void B0(org.telegram.ui.ay r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.B0(org.telegram.ui.ay, int):void");
    }

    public static void C0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        ayVar.f5();
        org.telegram.ui.Components.wb K = org.telegram.ui.Components.cc.a0(ayVar).K(2131623981, org.telegram.messenger.cd.L0(2131753714, null), org.telegram.messenger.cd.L0(2131745512, null), new fv(ayVar, 29));
        K.f32135j = 5000;
        K.j();
    }

    public static void D0(ay ayVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.bi0) ((org.telegram.ui.Components.r8) ayVar.M1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (ayVar.f35776a4 == null) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            ayVar.f35776a4 = b40Var;
            b40Var.H = true;
            b40Var.f24523a = ayVar;
            b40Var.f24524b = new ox(ayVar);
            ayVar.getMediaDataController().x();
            ayVar.getMessagesController().b3();
            ayVar.getMessagesController().e3(ayVar.getUserConfig().f(), true, ayVar.classGuid);
        }
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(ayVar.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(ayVar.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(ayVar.currentAccount).f();
        }
        if (Z1 != null) {
            org.telegram.ui.Components.bi biVar = ayVar.f35776a4.f24525c;
            if (biVar != null) {
                biVar.P0();
            }
            org.telegram.ui.Components.b40 b40Var2 = ayVar.f35776a4;
            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            b40Var2.n(z10, new fv(ayVar, 28), new ov(ayVar, 3), 0);
        }
    }

    public static void F0(ay ayVar, float f7, ValueAnimator valueAnimator) {
        ayVar.f35794e0[0].setTranslationY((1.0f - ayVar.f35878u3) * f7);
        ayVar.f35878u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < ayVar.actionBar.getChildCount(); i10++) {
            if (ayVar.actionBar.getChildAt(i10).getVisibility() == 0 && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getActionMode() && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getBackButton()) {
                ayVar.actionBar.getChildAt(i10).setAlpha(1.0f - ayVar.f35878u3);
            }
        }
        ayVar.P3();
        ayVar.H3();
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void G0(ay ayVar) {
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(ayVar.getParentActivity(), ayVar.resourceProvider);
        ebVar.d(2131624008, new String[0]);
        ebVar.f25745b.setText(org.telegram.messenger.cd.L0(2131742836, null));
        org.telegram.ui.Components.wb.g(ayVar, ebVar, 2750).j();
        try {
            ayVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void H0(ay ayVar, org.telegram.messenger.w1 w1Var) {
        ArrayList arrayList = w1Var.f19039c;
        if (arrayList.size() == 1) {
            ph.l1 l1Var = new ph.l1(ayVar.getParentActivity(), ayVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f19942id, null, null);
            l1Var.e1(true);
            ayVar.showDialog(l1Var);
            return;
        }
        mg.i2.l1(0, w1Var);
    }

    public static void I0(ay ayVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(ayVar).I(2131624032, org.telegram.messenger.cd.L0(2131746871, null), org.telegram.messenger.cd.L0(2131746870, null));
            I.f32135j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            ayVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (ayVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ayVar.getParentActivity(), ayVar.resourceProvider);
                String L0 = org.telegram.messenger.cd.L0(2131746867, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746868, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                ayVar.showDialog(x1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(ayVar), 2131624011, 36);
    }

    public static void J0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        ayVar.f5();
    }

    public static void W2(ay ayVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float i12 = Utilities.i(ayVar.f35893x1 * 2.0f, 1.0f, 0.0f);
        uw uwVar = ayVar.E0;
        float f12 = (1.0f - ayVar.f35878u3) * f7 * ayVar.H0;
        float f13 = 1.0f - i12;
        uwVar.setAlpha(f12 * f13);
        int i13 = 0;
        if (!ayVar.K && !ayVar.M) {
            if (ayVar.L) {
                ayVar.E0.setTranslationY((Math.max(ayVar.N, -ayVar.f4()) + (-org.telegram.messenger.i0.L(81.0f))) - org.telegram.messenger.i0.L(8.0f));
                ayVar.E0.setProgressToCollapse(1.0f);
                uw uwVar2 = ayVar.E0;
                uwVar2.setClipTop((int) (org.telegram.messenger.i0.f16020m - uwVar2.getY()));
            }
            f10 = 1.0f - ayVar.H0;
            ayVar.actionBar.setTranslationY(0.0f);
        } else {
            float i14 = Utilities.i((-ayVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f);
            if (ayVar.f35878u3 == 1.0f) {
                i14 = 1.0f;
            }
            float i15 = Utilities.i(i14 / 0.5f, 1.0f, 0.0f);
            ayVar.E0.setClipTop(0);
            if (!ayVar.K && ayVar.M) {
                ayVar.E0.setTranslationY((-org.telegram.messenger.i0.L(81.0f)) - org.telegram.messenger.i0.L(8.0f));
                ayVar.E0.setProgressToCollapse(1.0f);
                f11 = ayVar.H0;
            } else {
                ayVar.E0.setTranslationY(((ayVar.T / 2.0f) + (Math.max(ayVar.N, -ayVar.f4()) + ayVar.f35889w3)) - org.telegram.messenger.i0.L(8.0f));
                ayVar.E0.l(!ayVar.F3.c(), i14);
                if (!ayVar.M) {
                    f11 = ayVar.H0;
                } else {
                    f10 = 1.0f - i15;
                    ayVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            ayVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            ayVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.i0.f16020m);
            ayVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.i0.L(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            ayVar.actionBar.getTitlesContainer().setScaleY(f15);
            ayVar.actionBar.getTitlesContainer().setScaleX(f15);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.i0.L(30.0f));
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - ayVar.f35878u3) * f14;
            ayVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = ayVar.actionBar.getTitlesContainer();
            int i16 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = ayVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i16 <= 0) {
                i13 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i13);
            return;
        }
        ayVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        ayVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - ayVar.f35878u3;
        ayVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = ayVar.actionBar.getTitlesContainer();
        int i17 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i17 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = ayVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i17 <= 0) {
            i13 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i13);
    }

    public static void X2(ay ayVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (ayVar.parentLayout != null && ayVar.actionBar != null) {
            float max = Math.max(ayVar.e.e, ayVar.g4());
            float f7 = 1.0f;
            float f10 = 1.0f - ayVar.f35893x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (z4Var = ayVar.parentLayout) != null) {
                    ((ActionBarLayout) z4Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static void Y(ay ayVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, tL_pendingSuggestion.suggestion);
        ayVar.f5();
    }

    public static void Z(ay ayVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ayVar.f35878u3 = floatValue;
        ayVar.f35794e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < ayVar.actionBar.getChildCount(); i10++) {
            if (ayVar.actionBar.getChildAt(i10).getVisibility() == 0 && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getActionMode() && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getBackButton()) {
                ayVar.actionBar.getChildAt(i10).setAlpha(1.0f - ayVar.f35878u3);
            }
        }
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ayVar.P3();
        ayVar.H3();
    }

    public static void a0(ay ayVar) {
        ArrayList arrayList = ayVar.I2;
        org.telegram.ui.ActionBar.z4 z4Var = ayVar.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).x()) {
            ayVar.finishPreviewFragment();
        } else if (ayVar.R0 == 10) {
            if (ayVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(org.telegram.messenger.gs.a(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                ayVar.C2.y(ayVar, arrayList2, null, false, ayVar.J2, ayVar.K2, ayVar.L2, null);
            }
        } else if (org.telegram.messenger.vp.r1(ayVar.currentAccount).u2()) {
            b.b(ayVar.currentAccount);
        } else {
            ayVar.presentFragment(new ContactsActivity(a1.g.g("destroyAfterSelect", true)));
        }
    }

    public static void b0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "USERPIC_SETUP");
        ayVar.f5();
    }

    public static org.telegram.ui.Cells.v2 b4(zx zxVar) {
        wx wxVar = zxVar.f44239a;
        for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
            View childAt = wxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                if (v2Var.W()) {
                    return v2Var;
                }
            }
        }
        return null;
    }

    public static void c0(ay ayVar) {
        PasskeysActivity.e0(ayVar.currentAccount, ayVar.getParentActivity(), ayVar.resourceProvider, true);
    }

    public static void d0(ay ayVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.d20.i(ayVar.currentAccount).e());
        ayVar.presentFragment(new un(bundle));
    }

    public static void e0(ay ayVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull a2 = ayVar.getMessagesController().a2(ayVar.getUserConfig().e());
        if (a2 != null) {
            tL_birthday2 = a2.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (a2 != null) {
            a2.flags2 |= 32;
            a2.birthday = tL_birthday;
        }
        ayVar.getMessagesController().l2();
        ayVar.getConnectionsManager().sendRequest(updatebirthday, new aa(ayVar, a2, tL_birthday2, 8), 1024);
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        ayVar.f5();
    }

    public static void f0(ay ayVar, zx zxVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.v2;
        if (z10) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            if (v2Var.f23238n2) {
                ayVar.Y4(v2Var.getDialogId(), view);
                return;
            }
        }
        if (ayVar.T3()) {
            ayVar.z4(view, i10, 0.0f, zxVar.d);
            return;
        }
        int i12 = ayVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.p8)) {
            zxVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle g10 = a1.g.g("forImport", true);
            g10.putLongArray("result", new long[]{ayVar.getUserConfig().e()});
            g10.putInt("chatType", 4);
            String string = ayVar.arguments.getString("importTitle");
            if (string != null) {
                g10.putString("title", string);
            }
            c60 c60Var = new c60(g10);
            c60Var.Y = new iw(ayVar);
            ayVar.presentFragment(c60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.d3) && ((i11 = zxVar.f44245s) == 7 || i11 == 8)) {
            zf.k kVar = (zf.k) zxVar.d.M.get(0);
            if (kVar != null && kVar.f7680a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f55547i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.ap apVar = ayVar.getMessagesController().M[zxVar.f44245s - 7];
                if (apVar != null) {
                    int i14 = apVar.f14645a;
                    ?? haVar = new org.telegram.ui.Components.ha(ayVar, false);
                    haVar.Q1 = -1;
                    haVar.U1 = "";
                    haVar.V1 = new ArrayList();
                    haVar.X1 = "";
                    haVar.Z1 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    haVar.a2 = arrayList;
                    haVar.f27180r2 = -1;
                    haVar.f27183u2 = -5;
                    haVar.Q1 = i14;
                    haVar.S1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    haVar.Y1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = ayVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.ap) arrayList2.get(i13)).f14645a == i14) {
                                haVar.U1 = ((org.telegram.messenger.ap) arrayList2.get(i13)).f14646b;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    haVar.f1();
                    ayVar.showDialog(haVar);
                    return;
                }
                return;
            }
        } else if (z10 && !ayVar.actionBar.u() && !ayVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.v2) view).Y1;
            org.telegram.messenger.i0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        ayVar.y4(view, i10, zxVar.d);
    }

    public static void g0(ay ayVar) {
        ayVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.i0.j3(ayVar.parentLayout, "newChatsRow");
    }

    public static void h0(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(ayVar.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(ayVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(ayVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void i0(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, ayVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ayVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f18307b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.f18304a;
            b02.getMessagesStorage().f15938a.c(new org.telegram.messenger.rk(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void i1(ay ayVar, boolean z10) {
        if (ayVar.f35794e0 != null && ayVar.M3 != z10) {
            ayVar.M3 = z10;
            int i10 = 0;
            while (true) {
                zx[] zxVarArr = ayVar.f35794e0;
                if (i10 < zxVarArr.length) {
                    if (z10) {
                        zxVarArr[i10].f44239a.setScrollbarFadingEnabled(false);
                    }
                    ayVar.f35794e0[i10].f44239a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        ayVar.f35794e0[i10].f44239a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void j0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).f7.edit().putBoolean("storyhint", false).commit();
    }

    public static void k0(ay ayVar) {
        if (ayVar.f35776a4.g()) {
            org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "USERPIC_SETUP");
            ayVar.f5();
        }
    }

    public static void m0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "PREMIUM_GRACE");
        ayVar.f5();
    }

    public static void n0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "SETUP_PASSKEY");
        ayVar.f5();
    }

    public static void o0(ay ayVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (tLObject != null) {
            ayVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.e eVar = new bi.e(ayVar, j10, 14);
            Pattern pattern = org.telegram.ui.Components.s4.f30123a;
            if (ayVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = ayVar.getCurrentAccount();
                    Activity parentActivity = ayVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e7 = org.telegram.messenger.d20.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.cd.X) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var.u(org.telegram.messenger.i0.L(12.0f));
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
                    if (org.telegram.messenger.cd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.cd.X) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.cd.L0(2131749254, null));
                    boolean z10 = org.telegram.messenger.cd.X;
                    if (z10) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i17 = i13 | 48;
                    if (z10) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f7 = i14;
                    if (z10) {
                        i15 = 76;
                    } else {
                        i15 = 21;
                    }
                    frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, i17, f7, 11.0f, i15, 0.0f));
                    if (org.telegram.messenger.cd.X) {
                        i16 = 5;
                    } else {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.b6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.h20.z(user)) {
                            r8Var.f29871p = 0.8f;
                            r8Var.g(12);
                            g9Var.j(null, null, r8Var, user);
                        } else if (user.f19942id == e7) {
                            r8Var.f29871p = 0.8f;
                            r8Var.g(1);
                            g9Var.j(null, null, r8Var, user);
                        } else {
                            r8Var.f29871p = 1.0f;
                            r8Var.r(user);
                            g9Var.e(user, r8Var);
                        }
                    } else {
                        r8Var.q(chat);
                        g9Var.e(chat, r8Var);
                    }
                    textView.setText(org.telegram.messenger.i0.W2(str));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749274, null), new org.telegram.ui.Components.t(eVar, 3));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    ayVar.showDialog(alertDialog$Builder.f20134a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.s4.e0(ayVar.currentAccount, tL_error, ayVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        ayVar.getNotificationCenter().k(org.telegram.messenger.zs.f19705v1, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void o4(un unVar, org.telegram.messenger.jj jjVar) {
        CharSequence charSequence;
        if (jjVar != null && jjVar.s2()) {
            try {
                if (!TextUtils.isEmpty(jjVar.f16394z)) {
                    charSequence = jjVar.f16394z;
                } else {
                    charSequence = jjVar.v;
                }
                CharSequence x12 = org.telegram.messenger.i0.x1(charSequence, jjVar.Y1, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.l00[] l00VarArr = (org.telegram.ui.Components.l00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.l00.class);
                    if (l00VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(l00VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(l00VarArr[0]);
                        for (int i10 = 1; i10 < l00VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        unVar.Eb(jjVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public static void p0(ay ayVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.um0 um0Var = ayVar.C0.f26463q0;
        if (i10 >= um0Var.Z && i10 < um0Var.f26505a0) {
            org.telegram.ui.Components.a51 G = um0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ayVar.getParentActivity(), ayVar.resourceProvider);
            String L0 = org.telegram.messenger.cd.L0(2131754180, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.h20.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new rv(1, ayVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void q0(ay ayVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            ayVar.getMessagesController().f18894s0 = true;
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            ayVar.C4(arrayList, i10, false, false, hashSet2);
            org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
            messagesController.f18894s0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.zs.f19683s, Boolean.TRUE);
            ayVar.getMessagesController().J(ayVar.W2);
            int i11 = ayVar.W2;
            if (i11 != 0 && ayVar.c4(ayVar.currentAccount, ayVar.f35794e0[0].f44245s, i11, false).size() == 0) {
                ayVar.f35794e0[0].f44239a.setEmptyView(null);
                ayVar.f35794e0[0].f44247x.setVisibility(4);
                ayVar.finishFragment();
                return;
            }
            return;
        }
        ayVar.C4(arrayList, i10, false, false, null);
    }

    public static void s0(ay ayVar, int i10, org.telegram.ui.Components.z60 z60Var) {
        CharSequence charSequence;
        if (ayVar.currentAccount != i10) {
            z60Var.u();
            if (ayVar.getParentActivity() == null) {
                return;
            }
            ux uxVar = ayVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) ayVar.getParentActivity();
            ArrayList arrayList = ayVar.D2;
            String str = ayVar.E2;
            CharSequence charSequence2 = ayVar.F2;
            ow owVar = ayVar.B1;
            if (owVar != null) {
                charSequence = owVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i10);
            ay ayVar2 = new ay(ayVar.arguments);
            ayVar2.C2 = uxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    ayVar2.D2 = null;
                } else {
                    ayVar2.D2 = arrayList;
                    ayVar2.E2 = null;
                    ayVar2.M2 = false;
                    if (ayVar2.B1 != null) {
                        ayVar2.u3(charSequence);
                    } else {
                        ayVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                ayVar2.P4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    ayVar2.F2 = null;
                } else {
                    ayVar2.F2 = charSequence2;
                    ayVar2.E2 = null;
                    ayVar2.D2 = null;
                    if (ayVar2.B1 != null) {
                        ayVar2.u3(charSequence);
                    } else {
                        ayVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.u0(ayVar2, false, true);
        }
    }

    public static void t0(ay ayVar) {
        String str;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(ayVar.currentAccount);
        if (ayVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        r12.h4(0L, str);
        ayVar.f5();
    }

    public static void t1(ay ayVar, zx zxVar, float f7) {
        if (ayVar.T != f7) {
            ayVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                ayVar.U = false;
            }
            ayVar.E0.setOverscroll(f7);
            zxVar.f44239a.setViewsOffset(f7);
            wx wxVar = zxVar.f44239a;
            if (i10 != 0) {
                i11 = 2;
            }
            wxVar.setOverScrollMode(i11);
            ayVar.fragmentView.invalidate();
            if (f7 > org.telegram.messenger.i0.L(90.0f) && !ayVar.U) {
                uw uwVar = ayVar.E0;
                ValueAnimator valueAnimator = uwVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    uwVar.i(uwVar.f49214p0, true);
                    ayVar.U = true;
                    ayVar.getOrCreateStoryViewer().G(new fv(ayVar, 4));
                }
            }
        }
    }

    public static void t4(org.telegram.messenger.c cVar) {
        int i10 = cVar.f14863a;
        boolean[] zArr = f35770y4;
        if (!zArr[i10]) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            r12.V2();
            r12.S2(0, 0, 100, true, null);
            if (r12.f18893s.isEmpty() && !TextUtils.isEmpty(r12.T3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = r12.T3;
                r12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.tj(r12, 4));
            }
            r12.e3(org.telegram.messenger.d20.i(i10).f(), false, 0);
            org.telegram.messenger.i5.r(i10).f();
            org.telegram.messenger.ui.b0(i10).u(false);
            org.telegram.messenger.i0.h3(new rh(cVar, 19), 200L);
            Iterator it = r12.f18775e4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ui.b0(i10).c1((String) it.next(), true, true);
            }
            zArr[i10] = true;
        }
    }

    public static void u0(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, ayVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            te1.a(ayVar.getParentActivity(), new w(ayVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static boolean u1(ay ayVar, zx zxVar) {
        if (!ayVar.F3.c()) {
            int i10 = (int) (-ayVar.N);
            int e42 = ayVar.e4();
            int f42 = ayVar.f4();
            if (i10 != 0 && i10 != e42 && i10 != f42 && zxVar.f44239a.canScrollVertically(-1)) {
                if (f42 < i10 && i10 < e42) {
                    int L = org.telegram.messenger.i0.L(48.0f);
                    int i11 = i10 - f42;
                    if (i11 < L / 2) {
                        zxVar.f44240b.y(-i11);
                        return true;
                    }
                    zxVar.f44240b.y(L - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (ayVar.f35878u3 != 1.0f) {
                    f7 = Utilities.i((-ayVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f);
                }
                if (f7 < ayVar.E0.B0) {
                    zxVar.f44240b.y(-i10);
                    return true;
                }
                zxVar.f44240b.y(f42 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void v0(ay ayVar) {
        b.c(ayVar.currentAccount, ayVar.getParentActivity(), ayVar.getResourceProvider());
    }

    public static String v2(ay ayVar) {
        String s10;
        ArrayList arrayList = ayVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == ayVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.cd.L0(2131745918, null));
                } else {
                    if (arrayList.size() == 1) {
                        s10 = org.telegram.messenger.o5.l(ayVar.currentAccount, longValue);
                    } else {
                        s10 = org.telegram.messenger.o5.s(ayVar.currentAccount, longValue);
                    }
                    sb2.append(s10);
                }
            }
            return org.telegram.messenger.cd.a0(null, null, 2131745457, sb2.toString());
        }
        return org.telegram.messenger.cd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void w0(final int i10, final long j10, TLRPC.Chat chat, final ay ayVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        ayVar.m4(false);
        if (i10 == 103 && org.telegram.messenger.w3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.w3.t0(chat2)) {
                ayVar.getMessagesController().X(2, j10, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = ayVar.W2) != 0 && ayVar.c4(ayVar.currentAccount, ayVar.f35794e0[0].f44245s, i14, false).size() == 1) {
            ayVar.f35794e0[0].f44247x.setVisibility(4);
        }
        int i15 = -1;
        if (i10 == 102) {
            ayVar.L4(true, true);
            if (ayVar.R1 != null) {
                i13 = 0;
                while (i13 < ayVar.R1.size()) {
                    if (((TLRPC.Dialog) ayVar.R1.get(i13)).f19797id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            ayVar.y3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView j42 = ayVar.j4();
        if (j42 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            j42.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    ayVar.B4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(ayVar.c4(ayVar.currentAccount, ayVar.f35794e0[0].f44245s, ayVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f19797id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = ayVar.R1) != null) {
                arrayList.remove(i11);
                ayVar.f35794e0[0].f44248y.D();
                ayVar.f35794e0[0].q(true);
                return;
            }
            ayVar.L4(false, true);
        }
    }

    public static void x0(ay ayVar) {
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(ayVar.currentAccount);
        int i10 = a2.f19322a;
        Set<String> set = a2.d;
        org.telegram.messenger.w1 w1Var = a2.f19324c;
        if (w1Var != null && !set.contains(w1Var.f19037a)) {
            set.add(a2.f19324c.f19037a);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i10).f7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.zs.f(i10).k(org.telegram.messenger.zs.f19619g5, new Object[0]);
        }
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "BIRTHDAY_CONTACTS_TODAY");
        ayVar.f5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(ayVar).G(2131624032, 4, org.telegram.messenger.cd.L0(2131753330, null));
        G.f32135j = 5000;
        G.j();
    }

    public static void y0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "PREMIUM_RESTORE");
        ayVar.f5();
    }

    public static void z0(ay ayVar) {
        if (!ayVar.N3) {
            vh.p2 p2Var = ayVar.f35853q0;
            if (p2Var != null) {
                if (p2Var.V) {
                    return;
                }
                org.telegram.messenger.i0.E2(p2Var);
            }
            SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.M0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.t6.uj, 0, new fv(ayVar, 24), null);
            vh.p2 p2Var2 = new vh.p2(ayVar.getParentActivity(), 2);
            p2Var2.q(8.0f);
            p2Var2.d = 8000L;
            p2Var2.i(true);
            p2Var2.p(true);
            p2Var2.h = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(148.0f);
            p2Var2.s(R2);
            p2Var2.l(1.0f, -40.0f);
            p2Var2.h(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            ayVar.f35853q0 = p2Var2;
            p2Var2.setTranslationY((-ayVar.f35804f4) - ayVar.f35814h4);
            ((ViewGroup) ayVar.fragmentView).addView(ayVar.f35853q0, w7.b6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            ayVar.f35853q0.u();
            return;
        }
        vh.p2 p2Var3 = ayVar.f35848p0;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        j4.w o10 = org.telegram.messenger.vp.r1(ayVar.currentAccount).O1().o();
        if (o10 != null && o10.a(ayVar.currentAccount, 1)) {
            ayVar.showDialog(new kg.q0(o10.b(), ayVar.currentAccount, ayVar.getParentActivity(), ayVar, null));
            return;
        }
        vh.o8 D = vh.o8.D(ayVar.getParentActivity(), ayVar.currentAccount);
        D.f51682y = new iw(ayVar);
        D.Q(null);
    }

    public final void A3(boolean z10) {
        zh.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null && (jVar = this.Q1) != null && (chatFull = this.f35775a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f35777b.f7021f) {
                z11 = true;
            } else {
                z11 = false;
            }
            zrVar.i(jVar, z11, z10);
            this.Q1.setTitle(org.telegram.messenger.cd.G(this.f35775a3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void A4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.d20.i(i10).p()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new f6(24));
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
                Drawable a02 = org.telegram.ui.ActionBar.t6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f7 = org.telegram.messenger.d20.i(intValue).f();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(f7);
                kg.x xVar = new kg.x(this, getParentActivity(), z10);
                linearLayout.addView(xVar, w7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
                if (z10) {
                    g9Var.setScaleX(0.833f);
                    g9Var.setScaleY(0.833f);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
                g9Var.getImageReceiver().d = intValue;
                g9Var.e(f7, r8Var);
                xVar.addView(g9Var, w7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, getResourceProvider());
                textView.setText(org.telegram.messenger.h20.p(f7));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.b6.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new jg.w1(this, intValue, H, 14));
                H.r(linearLayout, w7.b6.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
        H.f32947z.set(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final hi.f B() {
        return this.l4;
    }

    public final void B3(org.telegram.ui.zx r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.B3(org.telegram.ui.zx):void");
    }

    public final void B4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().X(1, j10, z11);
            return;
        }
        if (chat != null) {
            if (org.telegram.messenger.w3.r0(chat)) {
                getMessagesController().X(0, j10, z11);
            } else {
                getMessagesController().g0(-j10, getMessagesController().Z1(Long.valueOf(getUserConfig().e())), null, z11, false);
            }
        } else {
            getMessagesController().X(0, j10, z11);
            if (z10 && z11) {
                getMessagesController().w(j10);
            }
        }
        if (org.telegram.messenger.i0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.zs.f19690t, Long.valueOf(j10));
        }
        getMessagesController().J(this.W2);
    }

    public final void C3() {
        getMessagesStorage().getClass();
    }

    public final void C4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        org.telegram.messenger.ap apVar;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i18;
        long j10;
        int i19;
        int i20;
        int i21;
        boolean z15;
        boolean z16;
        int i22;
        TLRPC.Chat L0;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.TL_userEmpty tL_userEmpty;
        boolean z17;
        org.telegram.messenger.ap apVar2;
        int i23;
        int i24;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i25;
        long j11;
        boolean z22;
        int i26;
        org.telegram.ui.ActionBar.z2 z2Var;
        boolean z23;
        boolean z24;
        int i27;
        int i28;
        int i29;
        CharSequence L02;
        int i30;
        int L;
        int L2;
        TLRPC.User Z1;
        boolean z25;
        TLRPC.User user;
        boolean z26;
        String L03;
        int i31;
        int L3;
        int L4;
        int i32;
        char c10;
        ay ayVar = this;
        int i33 = i10;
        if (ayVar.getParentActivity() != null) {
            int i34 = ayVar.f35794e0[0].f44245s;
            if ((i34 != 7 && i34 != 8) || (ayVar.actionBar.u() && !ayVar.actionBar.w(null))) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                org.telegram.messenger.ap[] apVarArr = ayVar.getMessagesController().M;
                if (ayVar.f35794e0[0].f44245s == 8) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                apVar = apVarArr[c10];
            } else {
                apVar = null;
            }
            int size = arrayList.size();
            int i35 = 3;
            if (i33 != 105 && i33 != 107) {
                if ((i33 != 100 && i33 != 108) || ayVar.O2 == 0) {
                    i16 = 100;
                    if (i33 == 111) {
                        if (z10) {
                            org.telegram.ui.Components.s4.u0(this, org.telegram.messenger.cd.L0(2131751846, null), org.telegram.messenger.cd.L0(2131751844, null), org.telegram.messenger.cd.L0(2131751845, null), true, new qv(ayVar, arrayList, i33, z11, hashSet));
                            return;
                        }
                        hashSet2 = hashSet;
                        arrayList2 = arrayList;
                        int size2 = arrayList2.size();
                        int i36 = 0;
                        while (i36 < size2) {
                            Object obj = arrayList2.get(i36);
                            i36++;
                            ayVar.getMessagesController().b5(-((Long) obj).longValue(), false);
                        }
                    } else {
                        hashSet2 = hashSet;
                        arrayList2 = arrayList;
                        if ((i33 != 102 && i33 != 103) || size <= 1 || !z10) {
                            int i37 = 48;
                            if (i33 == 106 && z10) {
                                if (size == 1) {
                                    Long l4 = (Long) arrayList2.get(0);
                                    l4.getClass();
                                    user = ayVar.getMessagesController().Z1(l4);
                                } else {
                                    user = null;
                                }
                                if (ayVar.S2 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                rv rvVar = new rv(0, ayVar, arrayList2);
                                Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                                if (ayVar.getParentActivity() != null) {
                                    if (size != 1 || user != null) {
                                        Activity parentActivity = ayVar.getParentActivity();
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                                        org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[2];
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(1);
                                        alertDialog$Builder.o(linearLayout);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        if (size == 1) {
                                            String m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                                            x1Var.R = org.telegram.messenger.cd.a0("BlockUserTitle", null, 2131753685, m10);
                                            L03 = org.telegram.messenger.cd.L0(2131753692, null);
                                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserMessage", null, 2131753688, m10));
                                        } else {
                                            x1Var.R = org.telegram.messenger.cd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.cd.G(size, "UsersCountTitle", new Object[0]));
                                            L03 = org.telegram.messenger.cd.L0(2131753684, null);
                                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUsersMessage", null, 2131753683, org.telegram.messenger.cd.G(size, "UsersCount", new Object[0])));
                                        }
                                        boolean[] zArr = {true, true};
                                        int i38 = 0;
                                        for (int i39 = 2; i38 < i39; i39 = 2) {
                                            if (i38 == 0 && !z26) {
                                                i32 = i37;
                                            } else {
                                                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(parentActivity, 1);
                                                c2VarArr[i38] = c2Var;
                                                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                                if (i38 == 0) {
                                                    c2VarArr[i38].e(org.telegram.messenger.cd.L0(2131746217, null), "", true, false, false);
                                                } else {
                                                    org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[i38];
                                                    if (size == 1) {
                                                        i31 = 2131751482;
                                                    } else {
                                                        i31 = 2131751484;
                                                    }
                                                    c2Var2.e(org.telegram.messenger.cd.L0(i31, null), "", true, false, false);
                                                }
                                                org.telegram.ui.Cells.c2 c2Var3 = c2VarArr[i38];
                                                if (org.telegram.messenger.cd.X) {
                                                    L3 = org.telegram.messenger.i0.L(16.0f);
                                                } else {
                                                    L3 = org.telegram.messenger.i0.L(8.0f);
                                                }
                                                if (org.telegram.messenger.cd.X) {
                                                    L4 = org.telegram.messenger.i0.L(8.0f);
                                                } else {
                                                    L4 = org.telegram.messenger.i0.L(16.0f);
                                                }
                                                c2Var3.setPadding(L3, 0, L4, 0);
                                                i32 = i37;
                                                linearLayout.addView(c2VarArr[i38], w7.b6.o(-1, i32));
                                                c2VarArr[i38].setOnClickListener(new bh.f(zArr, i38, 5));
                                            }
                                            i38++;
                                            i37 = i32;
                                        }
                                        alertDialog$Builder.k(L03, new ng.d(25, rvVar, zArr));
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        ayVar.showDialog(x1Var);
                                        TextView textView = (TextView) x1Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        } else {
                            HashSet hashSet3 = new HashSet();
                            boolean z27 = org.telegram.messenger.vp.r1(ayVar.currentAccount).f18756c3;
                            long j12 = org.telegram.messenger.vp.r1(ayVar.currentAccount).f18746b3;
                            if (i33 == 102 && z27 && j12 == 2147483647L) {
                                int size3 = arrayList2.size();
                                z23 = false;
                                int i40 = 0;
                                while (i40 < size3) {
                                    int i41 = i40 + 1;
                                    Long l10 = (Long) arrayList2.get(i40);
                                    if (org.telegram.messenger.o5.E(l10.longValue()) || org.telegram.messenger.o5.C(l10.longValue())) {
                                        if (org.telegram.messenger.o5.C(l10.longValue())) {
                                            TLRPC.EncryptedChat Z0 = ayVar.getMessagesController().Z0(Integer.valueOf((int) (l10.longValue() & 4294967295L)));
                                            if (Z0 != null) {
                                                Z1 = ayVar.getMessagesController().Z1(Long.valueOf(Z0.user_id));
                                            } else {
                                                Z1 = null;
                                            }
                                        } else {
                                            Z1 = ayVar.getMessagesController().Z1(l10);
                                        }
                                        if (Z1 != null) {
                                            ArrayList arrayList3 = (ArrayList) org.telegram.messenger.vp.r1(ayVar.currentAccount).R.f(Z1.f19942id);
                                            if (arrayList3 != null && arrayList3.size() == 1 && arrayList3.get(0) != null && ((org.telegram.messenger.jj) arrayList3.get(0)).f16337k != null && ((((org.telegram.messenger.jj) arrayList3.get(0)).f16337k.action instanceof TLRPC.TL_messageActionUserJoined) || (((org.telegram.messenger.jj) arrayList3.get(0)).f16337k.action instanceof TLRPC.TL_messageActionContactSignUp))) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (!Z1.bot && !org.telegram.messenger.h20.x(Z1) && Z1.f19942id != ayVar.getUserConfig().e() && !z25) {
                                                hashSet3.add(l10);
                                                z23 = true;
                                            }
                                        }
                                    }
                                    i40 = i41;
                                }
                            } else {
                                z23 = false;
                            }
                            if (i33 == 102) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            int i42 = ayVar.R2;
                            mg.i0 i0Var = new mg.i0(ayVar, arrayList2, i33, hashSet3);
                            org.telegram.ui.ActionBar.p6 p6Var = ayVar.resourceProvider;
                            Pattern pattern2 = org.telegram.ui.Components.s4.f30123a;
                            int currentAccount = ayVar.getCurrentAccount();
                            Activity parentActivity2 = ayVar.getParentActivity();
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity2, p6Var);
                            org.telegram.messenger.d20.i(currentAccount).e();
                            org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[1];
                            boolean[] zArr2 = new boolean[1];
                            TextView textView2 = new TextView(parentActivity2);
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21037j5, null);
                            textView2.setTextSize(1, 16.0f);
                            if (org.telegram.messenger.cd.X) {
                                i27 = 5;
                            } else {
                                i27 = 3;
                            }
                            textView2.setGravity(i27 | 48);
                            org.telegram.ui.Components.g3 g3Var = new org.telegram.ui.Components.g3(parentActivity2, c2VarArr2, 0);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                            x1Var2.G = 6;
                            alertDialog$Builder2.o(g3Var);
                            TextView textView3 = new TextView(parentActivity2);
                            boolean z28 = z24;
                            boolean z29 = z23;
                            org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                            textView3.setLines(1);
                            textView3.setMaxLines(1);
                            textView3.setSingleLine(true);
                            if (org.telegram.messenger.cd.X) {
                                i28 = 5;
                            } else {
                                i28 = 3;
                            }
                            textView3.setGravity(i28 | 16);
                            textView3.setEllipsize(TextUtils.TruncateAt.END);
                            if (z28) {
                                if (z29) {
                                    org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(1, parentActivity2, p6Var);
                                    c2VarArr2[0] = c2Var4;
                                    c2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                    c2VarArr2[0].e(org.telegram.messenger.cd.L0(2131751528, null), "", false, false, false);
                                    org.telegram.ui.Cells.c2 c2Var5 = c2VarArr2[0];
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
                                    i30 = 0;
                                    c2Var5.setPadding(L, 0, L2, 0);
                                    g3Var.addView(c2VarArr2[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                    c2VarArr2[0].setOnClickListener(new org.telegram.ui.Components.x0(0, zArr2));
                                } else {
                                    i30 = 0;
                                }
                                Object[] objArr = new Object[1];
                                objArr[i30] = org.telegram.messenger.cd.G(size, "ChatsSelected", new Object[i30]);
                                textView3.setText(org.telegram.messenger.cd.a0("DeleteFewChatsTitle", null, 2131751542, objArr));
                                textView2.setText(org.telegram.messenger.cd.L0(2131754102, "AreYouSureDeleteFewChats"));
                            } else if (i42 != 0) {
                                textView3.setText(org.telegram.messenger.cd.a0("ClearCacheFewChatsTitle", null, 2131752097, org.telegram.messenger.cd.G(size, "ChatsSelectedClearCache", new Object[0])));
                                textView2.setText(org.telegram.messenger.cd.L0(2131754115, "AreYouSureClearHistoryCacheFewChats"));
                            } else {
                                textView3.setText(org.telegram.messenger.cd.a0("ClearFewChatsTitle", null, 2131752092, org.telegram.messenger.cd.G(size, "ChatsSelectedClear", new Object[0])));
                                textView2.setText(org.telegram.messenger.cd.L0(2131754113, "AreYouSureClearHistoryFewChats"));
                            }
                            if (org.telegram.messenger.cd.X) {
                                i29 = 5;
                            } else {
                                i29 = 3;
                            }
                            g3Var.addView(textView3, w7.b6.d(-1, -2.0f, i29 | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                            if (org.telegram.messenger.cd.X) {
                                i35 = 5;
                            }
                            g3Var.addView(textView2, w7.b6.d(-2, -2.0f, i35 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                            if (z28) {
                                L02 = org.telegram.messenger.cd.L0(2131751599, "Delete");
                            } else if (i42 != 0) {
                                L02 = org.telegram.messenger.cd.L0(2131752088, "ClearHistoryCache");
                            } else {
                                L02 = org.telegram.messenger.cd.L0(2131752089, "ClearHistory");
                            }
                            alertDialog$Builder2.k(L02, new ng.d(23, i0Var, zArr2));
                            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                            ayVar.showDialog(x1Var2);
                            TextView textView4 = (TextView) x1Var2.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    ArrayList V0 = ayVar.getMessagesController().V0(ayVar.W2);
                    int size4 = V0.size();
                    int i43 = 0;
                    int i44 = 0;
                    i16 = 100;
                    int i45 = 0;
                    while (i45 < size4) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i45);
                        if (dialog instanceof TLRPC.TL_dialogFolder) {
                            i18 = i45;
                        } else if (ayVar.r4(dialog)) {
                            i18 = i45;
                            if (org.telegram.messenger.o5.C(dialog.f19797id)) {
                                i44++;
                            } else {
                                i43++;
                            }
                        } else {
                            i18 = i45;
                            if (!ayVar.getMessagesController().B2(dialog.f19797id, false)) {
                                break;
                            }
                        }
                        i45 = i18 + 1;
                    }
                    int i46 = 0;
                    int i47 = 0;
                    int i48 = 0;
                    for (int i49 = 0; i49 < size; i49++) {
                        Long l11 = (Long) arrayList.get(i49);
                        int i50 = i48;
                        long longValue = l11.longValue();
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(longValue);
                        if (dialog2 != null && !ayVar.r4(dialog2)) {
                            if (org.telegram.messenger.o5.C(longValue)) {
                                i47++;
                            } else {
                                i46++;
                            }
                            if (apVar != null && apVar.h.contains(l11)) {
                                i48 = i50 + 1;
                            }
                        }
                        i48 = i50;
                    }
                    int i51 = i48;
                    if (z12) {
                        i17 = 100 - apVar.h.size();
                    } else if (ayVar.W2 == 0 && apVar == null) {
                        if (ayVar.getUserConfig().q()) {
                            i17 = ayVar.getMessagesController().R4;
                        } else {
                            i17 = ayVar.getMessagesController().Q4;
                        }
                    } else if (org.telegram.messenger.d20.i(ayVar.currentAccount).q()) {
                        i17 = ayVar.getMessagesController().f18835l3;
                    } else {
                        i17 = ayVar.getMessagesController().f18827k3;
                    }
                    if (i47 + i44 <= i17 && (i46 + i43) - i51 <= i17) {
                        hashSet2 = hashSet;
                        arrayList2 = arrayList;
                    } else if (ayVar.W2 == 0 && apVar == null) {
                        showDialog(new kg.q0(0, ayVar.currentAccount, ayVar.getParentActivity(), this, null));
                        return;
                    } else {
                        org.telegram.ui.Components.s4.t0(ayVar, null, org.telegram.messenger.cd.a0("PinFolderLimitReached", null, 2131747263, org.telegram.messenger.cd.G(i17, "Chats", new Object[0])), null);
                        return;
                    }
                }
                int i52 = Integer.MAX_VALUE;
                if (apVar != null) {
                    LongSparseIntArray longSparseIntArray = apVar.f14651j;
                    if ((i33 == i16 || i33 == 108) && ayVar.O2 != 0) {
                        int size5 = longSparseIntArray.size();
                        for (int i53 = 0; i53 < size5; i53++) {
                            i52 = Math.min(i52, longSparseIntArray.valueAt(i53));
                        }
                        i52 -= ayVar.O2;
                    }
                }
                int i54 = i52;
                int i55 = 0;
                int i56 = 0;
                while (i55 < size) {
                    Long l12 = (Long) arrayList2.get(i55);
                    long longValue2 = l12.longValue();
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(longValue2);
                    if (dialog3 == null) {
                        i23 = i54;
                        apVar2 = apVar;
                    } else {
                        if (org.telegram.messenger.o5.C(longValue2)) {
                            i22 = i54;
                            encryptedChat = ayVar.getMessagesController().Z0(Integer.valueOf((int) (longValue2 & 4294967295L)));
                            if (encryptedChat != null) {
                                tL_userEmpty = ayVar.getMessagesController().Z1(Long.valueOf(encryptedChat.user_id));
                                l12 = l12;
                            } else {
                                tL_userEmpty = new TLRPC.TL_userEmpty();
                            }
                            L0 = null;
                        } else {
                            i22 = i54;
                            if (org.telegram.messenger.o5.E(longValue2)) {
                                l12 = l12;
                                tL_userEmpty = ayVar.getMessagesController().Z1(l12);
                                L0 = null;
                                encryptedChat = null;
                            } else {
                                l12 = l12;
                                L0 = ayVar.getMessagesController().L0(Long.valueOf(-longValue2));
                                encryptedChat = null;
                                tL_userEmpty = null;
                            }
                        }
                        if (L0 != null || tL_userEmpty != null) {
                            if (tL_userEmpty != null && tL_userEmpty.bot && !org.telegram.messenger.vp.E2(tL_userEmpty)) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (i33 == 100 || i33 == 108) {
                                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                if (ayVar.O2 != 0) {
                                    if (!ayVar.r4(dialog3)) {
                                        i56++;
                                        if (size == 1) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        apVar2 = apVar;
                                        i23 = i22;
                                        i24 = i10;
                                        ayVar.D4(longValue2, true, apVar2, i23, z19);
                                        if (apVar2 != null) {
                                            int i57 = i23 + 1;
                                            if (encryptedChat2 != null) {
                                                if (!apVar2.h.contains(Long.valueOf(encryptedChat2.user_id))) {
                                                    apVar2.h.add(Long.valueOf(encryptedChat2.user_id));
                                                }
                                            } else if (!apVar2.h.contains(Long.valueOf(dialog3.f19797id))) {
                                                apVar2.h.add(Long.valueOf(dialog3.f19797id));
                                            }
                                            i23 = i57;
                                        }
                                    }
                                    apVar2 = apVar;
                                    i23 = i22;
                                    i24 = i10;
                                } else {
                                    apVar2 = apVar;
                                    i23 = i22;
                                    i24 = i10;
                                    if (ayVar.r4(dialog3)) {
                                        i56++;
                                        if (size == 1) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        ayVar.D4(longValue2, false, apVar2, i23, z18);
                                        i55++;
                                        i54 = i23;
                                        i33 = i24;
                                        apVar = apVar2;
                                    }
                                }
                                i55++;
                                i54 = i23;
                                i33 = i24;
                                apVar = apVar2;
                            } else if (i33 == 101) {
                                if (ayVar.N2 != 0) {
                                    ayVar.u4(longValue2);
                                } else {
                                    ayVar.getMessagesController().i3(longValue2, null, 0L);
                                }
                            } else if (i33 == 102 || i33 == 103) {
                                ay ayVar2 = ayVar;
                                if (size == 1) {
                                    if (i33 == 102 && ayVar2.V2) {
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ayVar2.getParentActivity());
                                        String L04 = org.telegram.messenger.cd.L0(2131746612, null);
                                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20134a;
                                        x1Var3.R = L04;
                                        x1Var3.T = org.telegram.messenger.cd.L0(2131746613, null);
                                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131746614, null), new iv(ayVar2, 7));
                                        alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        ayVar2.showDialog(x1Var3);
                                        return;
                                    }
                                    if (i33 == 103) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    boolean C = org.telegram.messenger.o5.C(dialog3.f19797id);
                                    if (i33 == 102) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    TLRPC.Chat chat = L0;
                                    org.telegram.ui.Components.s4.r(this, z20, chat, tL_userEmpty, C, z21, false, false, new sv(ayVar2, i33, chat, longValue2, z17));
                                    return;
                                }
                                ayVar = ayVar2;
                                boolean z30 = z17;
                                TLRPC.Chat chat2 = L0;
                                int i58 = i33;
                                if (ayVar.getMessagesController().B2(longValue2, true)) {
                                    ayVar.getMessagesController().i2();
                                    apVar2 = apVar;
                                    i23 = i22;
                                } else if (i58 == 103 && ayVar.R2 != 0) {
                                    ayVar.getMessagesController().X(2, longValue2, false);
                                    apVar2 = apVar;
                                    i23 = i22;
                                } else {
                                    if (hashSet2 != null && hashSet2.contains(l12)) {
                                        i25 = i58;
                                        j11 = longValue2;
                                        z22 = true;
                                    } else {
                                        i25 = i58;
                                        j11 = longValue2;
                                        z22 = false;
                                    }
                                    ayVar.B4(i25, j11, chat2, z30, z22);
                                    apVar2 = apVar;
                                    i23 = i22;
                                    i24 = i10;
                                    i55++;
                                    i54 = i23;
                                    i33 = i24;
                                    apVar = apVar2;
                                }
                                i24 = i58;
                                i55++;
                                i54 = i23;
                                i33 = i24;
                                apVar = apVar2;
                            } else if (i33 == 104) {
                                if (size == 1 && ayVar.P2 == 1) {
                                    ay ayVar3 = ayVar;
                                    ayVar3.showDialog(org.telegram.ui.Components.s4.E(longValue2, 0L, ayVar3, null), new ov(ayVar3, 1));
                                    return;
                                }
                                ay ayVar4 = ayVar;
                                if (ayVar4.Q2 != 0) {
                                    if (ayVar4.getMessagesController().q2(longValue2, 0L, null)) {
                                        ayVar4.getNotificationsController().T(longValue2, 4, 0L);
                                    }
                                    ayVar = ayVar4;
                                } else if (z11) {
                                    Pattern pattern3 = org.telegram.ui.Components.s4.f30123a;
                                    if (ayVar4.getParentActivity() == null) {
                                        z2Var = null;
                                        i26 = 2;
                                    } else {
                                        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(ayVar4.getParentActivity(), false, 1, null);
                                        h.O = org.telegram.messenger.cd.L0(2131747940, null);
                                        h.P = true;
                                        i26 = 2;
                                        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(1, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(8, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(2, "Days", new Object[0])), org.telegram.messenger.cd.L0(2131748328, null)};
                                        eg.j jVar = new eg.j(5, arrayList2, ayVar4);
                                        h.L = charSequenceArr;
                                        h.K = jVar;
                                        z2Var = h;
                                    }
                                    ayVar4.showDialog(z2Var, new ov(ayVar4, i26));
                                    return;
                                } else {
                                    if (!ayVar4.getMessagesController().q2(longValue2, 0L, null)) {
                                        ayVar4.getNotificationsController().T(longValue2, 3, 0L);
                                    }
                                    ayVar = ayVar4;
                                    apVar2 = apVar;
                                    i23 = i22;
                                    i24 = i33;
                                    i55++;
                                    i54 = i23;
                                    i33 = i24;
                                    apVar = apVar2;
                                }
                            } else {
                                apVar2 = apVar;
                                i23 = i22;
                                i24 = i33;
                                i55++;
                                i54 = i23;
                                i33 = i24;
                                apVar = apVar2;
                            }
                        }
                        apVar2 = apVar;
                        i23 = i22;
                    }
                    i24 = i33;
                    i55++;
                    i54 = i23;
                    i33 = i24;
                    apVar = apVar2;
                }
                org.telegram.messenger.ap apVar3 = apVar;
                int i59 = i33;
                if (i59 == 104 && (size != 1 || ayVar.P2 != 1)) {
                    if (ayVar.Q2 == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    org.telegram.ui.Components.cc.A(ayVar, z16, null).j();
                }
                if (i59 != 100 && i59 != 108) {
                    i20 = 108;
                    i19 = i59;
                } else {
                    if (apVar3 != null) {
                        i00.y0(apVar3, apVar3.f14649g, apVar3.f14646b, apVar3.f14647c, apVar3.f14655n, apVar3.f14654m, apVar3.h, apVar3.f14650i, apVar3.f14651j, false, false, true, true, false, this, null);
                        ayVar = this;
                        j10 = 0;
                    } else {
                        j10 = 0;
                        ayVar.getMessagesController().j4(ayVar.W2, 0L, null);
                    }
                    UndoView j42 = ayVar.j4();
                    if (ayVar.f35856q3 && j42 != null) {
                        if (ayVar.O2 != 0) {
                            i21 = 78;
                        } else {
                            i21 = 79;
                        }
                        j42.m(j10, Integer.valueOf(i56), i21);
                    }
                    i19 = i10;
                    i20 = 108;
                }
                if (i19 != i20 && i19 != 100 && i19 != 102) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ayVar.m4(z15);
                return;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
            if (ayVar.T2 == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            messagesController.e(arrayList4, i11, -1, null, 0L);
            if (ayVar.T2 == 0) {
                SharedPreferences d12 = org.telegram.messenger.vp.d1();
                z13 = false;
                if (!d12.getBoolean("archivehint_l", false) && !org.telegram.messenger.tz.f18176q1) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (!z14) {
                    i12 = 1;
                    d12.edit().putBoolean("archivehint_l", true).commit();
                } else {
                    i12 = 1;
                }
                if (z14) {
                    if (arrayList4.size() > i12) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i15;
                } else {
                    if (arrayList4.size() > i12) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    i14 = i13;
                }
                UndoView j43 = ayVar.j4();
                if (j43 != null) {
                    j43.l(0L, i14, null, new xs(6, ayVar, arrayList4));
                }
            } else {
                z13 = false;
                ArrayList V02 = ayVar.getMessagesController().V0(ayVar.W2);
                if (ayVar.f35794e0 != null && V02.isEmpty() && !ayVar.K) {
                    ayVar.f35794e0[0].f44239a.setEmptyView(null);
                    ayVar.f35794e0[0].f44247x.setVisibility(4);
                    ayVar.finishFragment();
                }
            }
            ayVar.m4(z13);
        }
    }

    public final void D3() {
        if (this.f35794e0 != null) {
            int v32 = v3();
            int i10 = 0;
            while (true) {
                zx[] zxVarArr = this.f35794e0;
                if (i10 < zxVarArr.length) {
                    zx zxVar = zxVarArr[i10];
                    if (zxVar != null) {
                        wx wxVar = zxVar.f44239a;
                        wxVar.setPadding(0, wxVar.f29885f3, 0, v32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void D4(long r14, boolean r16, org.telegram.messenger.ap r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.D4(long, boolean, org.telegram.messenger.ap, int, boolean):void");
    }

    @Override
    public final void E(float f7, int i10) {
        org.telegram.ui.ActionBar.t0 t0Var;
        if (i10 == 3 && (t0Var = this.f35830l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) t0Var.getIconView().getDrawable();
            if (this.d.f7021f) {
                animatedVectorDrawable.start();
                if (org.telegram.messenger.tz.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ui.b0(this.currentAccount).D;
                    String p02 = PremiumPreviewFragment.p0(2);
                    if (tL_help_premiumPromo != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < tL_help_premiumPromo.video_sections.size()) {
                                if (tL_help_premiumPromo.video_sections.get(i11).equals(p02)) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1) {
                            org.telegram.messenger.b8.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i11), tL_help_premiumPromo, 3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            animatedVectorDrawable.reset();
        }
    }

    public final void E3() {
        zg.e eVar = this.f35898y1;
        if (eVar != null) {
            eVar.setBlurredBottomHeight(this.f35898y1.getInputBubbleHeight() + this.f35885w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f));
        }
    }

    public final void E4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        M3();
    }

    @Override
    public final List F() {
        return Arrays.asList(new fg.a(org.telegram.messenger.cd.L0(2131751649, null)), new fg.a(org.telegram.messenger.cd.L0(2131752076, null), new fv(this, 14)), new fg.a(org.telegram.messenger.cd.L0(2131751650, null), new fv(this, 15)));
    }

    public final void F3() {
        int i10;
        zx zxVar;
        boolean z10 = true;
        float d42 = d4(true);
        qx qxVar = this.f35900z0;
        if (qxVar != null) {
            if (qxVar.getAlpha() == d42) {
                z10 = false;
            }
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, d42);
            this.f35900z0.setAlpha(d42);
            this.f35900z0.setScaleX(T1);
            this.f35900z0.setScaleY(T1);
            qx qxVar2 = this.f35900z0;
            if (d42 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qxVar2.setVisibility(i10);
            if (z10 && (zxVar = this.f35794e0[0]) != null) {
                zxVar.f44239a.requestLayout();
            }
        }
        d5();
    }

    public final void F4(zx zxVar) {
        int i10;
        org.telegram.ui.Components.zz zzVar;
        if (zxVar.getVisibility() != 0) {
            return;
        }
        int i11 = zxVar.d.f55567w;
        if (zxVar.f44245s == 0 && k4() && zxVar.f44239a.getChildCount() == 0 && zxVar.f44246w == 2) {
            ((s4.a0) zxVar.f44239a.getLayoutManager()).h1(1, (int) this.N);
        }
        zxVar.d.getClass();
        zxVar.d.V();
        int b10 = zxVar.d.b();
        if (b10 == 1 && i11 == 1 && zxVar.d.d(0) == 5) {
            zxVar.q(true);
        } else {
            zxVar.q(false);
            if (b10 > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                zxVar.D.b(i11);
            }
        }
        try {
            wx wxVar = zxVar.f44239a;
            if (this.W2 == 0 && this.Y2 == 0) {
                zzVar = zxVar.f44247x;
            } else {
                zzVar = null;
            }
            wxVar.setEmptyView(zzVar);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        B3(zxVar);
    }

    public final void G3() {
        int i10;
        int i11;
        float f7 = this.f35837n.e;
        float T1 = org.telegram.messenger.i0.T1(0.2f, 1.0f, f7);
        bi.f2 f2Var = this.C1;
        int i12 = 8;
        if (f2Var != null) {
            f2Var.setScaleX(T1);
            this.C1.setScaleY(T1);
            this.C1.setAlpha(f7);
            bi.f2 f2Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            f2Var2.setVisibility(i11);
        }
        zg.e eVar = this.f35898y1;
        if (eVar != null) {
            eVar.setAlpha(f7);
            zg.e eVar2 = this.f35898y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            eVar2.setVisibility(i10);
            this.f35898y1.getFadeView().setAlpha(f7);
            View fadeView = this.f35898y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void G4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -f4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void H3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.f10.d(this.actionBar.getBackButton(), Math.max(this.f35878u3, (1.0f - this.f35777b.e) * (1.0f - g4()) * (1.0f - this.f35783c.e)));
    }

    public final void H4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.H4(int):void");
    }

    public final void I3() {
        float f7;
        if (this.f35815i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f10.d(this.f35805g0, c3.i0.E(f7, 1.0f - this.f35777b.e, 1.0f - g4(), 1.0f - this.f35783c.e));
    }

    public final void I4(boolean z10, boolean z11) {
        int i10;
        int i11;
        xw xwVar = this.F3;
        if (xwVar != null && xwVar.c()) {
            return;
        }
        if (this.f35794e0[0].f44245s == 0 && k4() && this.f35794e0[0].f44246w == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.K && !z11 && !this.E0.g()) {
            i11 = -org.telegram.messenger.i0.L(81.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.vj0 vj0Var = this.f35794e0[0].f44244r;
            vj0Var.f31273b = 1;
            vj0Var.d(i10, i11, false, false);
            G4();
            return;
        }
        this.f35794e0[0].f44241c.h1(i10, i11);
        G4();
    }

    public final void J3() {
        float f7;
        if (org.telegram.messenger.tz.f18180s.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.f10.d(this.f35800f0, c3.i0.E(f7, 1.0f - this.f35777b.e, 1.0f - g4(), 1.0f - this.f35783c.e));
    }

    public final void J4(String str, boolean z10) {
        Z4(true, false, true, false);
        px pxVar = this.X;
        if (pxVar != null) {
            pxVar.f26588r.setText(str);
            this.X.f26588r.setSelection(str.length());
        }
    }

    public final void K3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f10.d(this.f35820j0, c3.i0.E(f7, this.f35799f.e, 1.0f - g4(), 1.0f - this.f35783c.e));
        uw uwVar = this.E0;
        if (uwVar != null) {
            uwVar.invalidate();
        }
    }

    public final void K4(float f7) {
        zx[] zxVarArr;
        this.f35784c0 = f7;
        for (zx zxVar : this.f35794e0) {
            wx wxVar = zxVar.f44239a;
            for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
                View childAt = wxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= zxVar.d.f55563f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void L3() {
        org.telegram.ui.Components.f10.d(this.f35830l0, c3.i0.E(this.f35777b.e, 1.0f - g4(), 1.0f - this.f35783c.e, this.d.e));
    }

    public final void L4(boolean z10, boolean z11) {
        if (this.f35794e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(c4(this.currentAccount, this.f35794e0[0].f44245s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            zx zxVar = this.f35794e0[0];
            zxVar.d.G = z10;
            if (!z10 && z11) {
                if (zxVar.f44239a.c0()) {
                    this.f35794e0[0].f44239a.post(new fv(this, 25));
                } else {
                    this.f35794e0[0].d.f();
                }
            }
        }
    }

    public final void M3() {
        boolean z10;
        bi.t0 t0Var;
        if (!this.f35822j2 && ((t0Var = this.K0) == null || t0Var.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        mf0 mf0Var = this.I3;
        if (mf0Var != null) {
            mf0Var.f39698a.f40661w.a(z10, true);
        }
    }

    public final void M4(boolean z10) {
        zx zxVar;
        if (org.telegram.messenger.tz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
            if (z10) {
                zx[] zxVarArr = this.f35794e0;
                if (zxVarArr != null && (zxVar = zxVarArr[0]) != null) {
                    zxVar.setLayerType(2, null);
                    this.f35794e0[0].setClipChildren(false);
                    this.f35794e0[0].setClipToPadding(false);
                    this.f35794e0[0].f44239a.setClipChildren(false);
                }
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (this.f35794e0 != null) {
                int i10 = 0;
                while (true) {
                    zx[] zxVarArr2 = this.f35794e0;
                    if (i10 >= zxVarArr2.length) {
                        break;
                    }
                    zx zxVar2 = zxVarArr2[i10];
                    if (zxVar2 != null) {
                        zxVar2.setLayerType(0, null);
                        zxVar2.setClipChildren(true);
                        zxVar2.setClipToPadding(true);
                        zxVar2.f44239a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setLayerType(0, null);
            }
            uw uwVar = this.E0;
            if (uwVar != null) {
                uwVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void N3() {
        H3();
        org.telegram.ui.Components.f10.d(this.f35825k0, (1.0f - this.f35777b.e) * (1.0f - g4()) * (1.0f - this.f35783c.e));
        I3();
        L3();
        J3();
        K3();
    }

    public final void N4(float f7) {
        zx[] zxVarArr = this.f35794e0;
        int i10 = 0;
        if (zxVarArr != null) {
            int paddingTop = zxVarArr[0].f44239a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                zx[] zxVarArr2 = this.f35794e0;
                if (i11 >= zxVarArr2.length) {
                    break;
                }
                zxVarArr2[i11].f44239a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.wb wbVar = this.f35846o3;
            if (wbVar != null) {
                wbVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                org.telegram.ui.Cells.n nVar = this.E3;
                float f10 = (int) f7;
                float f11 = nVar.f22326f;
                nVar.h = f10;
                nVar.setTranslationY(f11 + f10);
                this.E3.setAlpha(w7.u.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.n nVar2 = this.E3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                nVar2.setVisibility(i10);
            }
            P3();
            this.fragmentView.invalidate();
        }
    }

    public final void O3() {
        int i10;
        if (g4() > 0.5f) {
            i10 = 2131745723;
        } else {
            i10 = 2131745830;
        }
        String L0 = org.telegram.messenger.cd.L0(i10, null);
        this.X.f26588r.setContentDescription(L0);
        this.X.f26588r.setHint(L0);
    }

    public final void O4(float f7) {
        this.f35893x1 = f7;
        m5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.tz.o() != 0) {
            org.telegram.messenger.sc.e(32768);
        }
        d5();
    }

    public final void P3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.u.a(((-this.N) - f4()) / org.telegram.messenger.i0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f35878u3, this.h.e);
        float f10 = this.f35777b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f35783c.e) * (1.0f - max) * Math.max(f10, (1.0f - g4()) * a2);
        this.X.setAlpha(max2);
        px pxVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pxVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f35799f.a(z10, true);
    }

    public final void P4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                u3(charSequence);
                return;
            } else {
                this.U3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void Q3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f35773a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f35777b.e;
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, f10);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f10);
            q01 q01Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            q01Var.setVisibility(i11);
        }
        org.telegram.ui.Components.v71 v71Var = this.f35773a0;
        fe.b bVar = this.f35864s;
        if (v71Var != null) {
            float f11 = 1.0f - bVar.e;
            v71Var.setAlpha(f11);
            org.telegram.ui.Components.v71 v71Var2 = this.f35773a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            v71Var2.setVisibility(i10);
        }
        zf.g0 g0Var = this.f35778b0;
        if (g0Var != null) {
            float f12 = bVar.e;
            g0Var.setAlpha(f12);
            zf.g0 g0Var2 = this.f35778b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            g0Var2.setVisibility(i12);
        }
    }

    public final void Q4(float f7) {
        if (org.telegram.messenger.tz.o() <= 0) {
            boolean z10 = org.telegram.messenger.v2.f18448a;
        } else if (this.W3 != f7) {
            boolean z11 = true;
            if (org.telegram.messenger.tz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
                z11 = false;
            }
            this.X3 = z11;
            this.W3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.X3) {
                float f10 = (1.0f - this.W3) * (-org.telegram.messenger.i0.L(40.0f));
                uw uwVar = this.E0;
                if (uwVar != null) {
                    uwVar.setTranslationX(f10);
                }
                px pxVar = this.X;
                if (pxVar != null) {
                    pxVar.setTranslationX(f10);
                }
                xw xwVar = this.F3;
                if (xwVar != null && xwVar.getFragmentView() != null && !this.D) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-org.telegram.messenger.i0.L(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            uw uwVar2 = this.E0;
            if (uwVar2 != null) {
                uwVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            px pxVar2 = this.X;
            if (pxVar2 != null) {
                pxVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            xw xwVar2 = this.F3;
            if (xwVar2 != null && xwVar2.getFragmentView() != null) {
                if (!this.D) {
                    this.F3.getFragmentView().setScaleX(f13);
                    this.F3.getFragmentView().setScaleY(f13);
                    this.F3.getFragmentView().setTranslationX(f12);
                }
                this.F3.getFragmentView().setPivotX(0.0f);
                this.F3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void R3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = org.telegram.messenger.i0.f16021n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(this.f35772a);
            if (this.f35773a0 != null) {
                i10 = org.telegram.messenger.i0.L(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.zr zrVar = this.J1;
            if (zrVar != null) {
                i11 = (int) zrVar.c(org.telegram.messenger.i0.L(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            kx kxVar = this.C0;
            SparseArray sparseArray = kxVar.h;
            kxVar.W0 = i14;
            kxVar.X0 = i12;
            ag.b1 b1Var = kxVar.f26448a0;
            if (z10) {
                b1Var.q1(0, i14, 0, i12);
            } else {
                b1Var.setPadding(0, i14, 0, i12);
            }
            kxVar.O0.j(kxVar.W0, kxVar.X0, z10);
            org.telegram.ui.Components.tm0 tm0Var = kxVar.f26449b0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tm0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = kxVar.W0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != kxVar.X0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = kxVar.X0;
                tm0Var.requestLayout();
            }
            org.telegram.ui.Components.gn0.Q(kxVar.f26455h0, kxVar.f26458k0, kxVar.W0, kxVar.X0, z10);
            org.telegram.ui.Components.gn0.Q(kxVar.m0, kxVar.f26462p0, kxVar.W0, kxVar.X0, z10);
            org.telegram.ui.Components.gn0.Q(kxVar.f26466t0, kxVar.f26469w0, kxVar.W0, kxVar.X0, z10);
            org.telegram.ui.Components.cg0 cg0Var = kxVar.f26464r0;
            int i17 = kxVar.W0;
            int i18 = kxVar.X0;
            cg0Var.setClipToPadding(false);
            org.telegram.ui.Components.u51 u51Var = cg0Var.f25073c;
            cg0Var.J = z10;
            cg0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                u51Var.q1(0, i17, 0, i18);
            } else {
                u51Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u51Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            cg0Var.J = false;
            org.telegram.ui.Components.gm0 gm0Var = kxVar.I0;
            if (gm0Var != null) {
                gm0Var.b(kxVar.W0, kxVar.X0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof z00) {
                    ((z00) view).j(kxVar.W0, kxVar.X0, z10);
                }
            }
            for (int i20 = 0; i20 < kxVar.getChildCount(); i20++) {
                if (kxVar.getChildAt(i20) instanceof z00) {
                    ((z00) kxVar.getChildAt(i20)).j(kxVar.W0, kxVar.X0, z10);
                }
            }
        }
    }

    public final void R4() {
        getContactsController().B();
        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6(getParentActivity(), this.currentAccount, getResourceProvider(), new xs(5, this, r1), new rh(r1, 18));
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = l6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.z2[] z2VarArr = {h};
        h.Q(org.telegram.ui.ActionBar.t6.f21001h5);
    }

    public final void S3() {
        if (this.J1 != null) {
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(T1);
            this.J1.setScaleY(T1);
            this.J1.setVisibility(0);
        }
    }

    public final boolean S4(org.telegram.ui.Cells.v2 r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.S4(org.telegram.ui.Cells.v2):boolean");
    }

    public boolean T3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void T4(boolean z10) {
        float f7;
        this.f35783c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.O3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setSelected(false);
            Drawable background = this.m0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(t0Var, property, f7));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new dx(this, z10, 1));
        this.O3.start();
    }

    public final void U3() {
        if (org.telegram.messenger.i0.Q1()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.k(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                kx kxVar = this.C0;
                if (kxVar != null) {
                    kxVar.f26451d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void U4() {
        if (!this.A0 && getMessagesController().U0 && getMessagesController().J3 && this.f35900z0 != null && getMessagesController().S0().isEmpty() && !this.isPaused && getUserConfig().P && !this.inPreviewMode) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("filterhint", false)) {
                d12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.i0.h3(new fv(this, 26), 1000L);
            }
        }
    }

    public final void V3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.f20497n0) {
            lVar.k(true);
            this.f35856q3 = false;
            h5(true, true);
        }
    }

    public final void V4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity2;
        char c10;
        float f7;
        CharSequence charSequence;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        gv gvVar;
        xs xsVar;
        int w02;
        int w03;
        int w04;
        int i12;
        int w05;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, this.f35825k0);
        int i13 = org.telegram.ui.ActionBar.t6.A8;
        H.S(getThemedColor(i13), getThemedColor(i13));
        H.f32941s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f10 = 64.0f;
        int i14 = 0;
        if (this.Y2 != 0) {
            if (org.telegram.messenger.w3.N(this.Z2)) {
                H.c(2131232105, org.telegram.messenger.cd.L0(2131751913, null), new ew(this, 1), false);
                H.k();
            }
            H.i(new ew(this, 4), org.telegram.messenger.cd.L0(2131751912, null), this.Z2.collapsed_in_dialogs);
            H.i(new ew(this, 5), org.telegram.messenger.cd.L0(2131751911, null), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
            return;
        }
        int i15 = 7;
        if (p4()) {
            H.c(2131232105, org.telegram.messenger.cd.L0(2131754143, null), new ew(this, 6), false);
            H.c(2131232181, org.telegram.messenger.cd.L0(2131749285, null), new ew(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        if (q6) {
            i10 = 2131231783;
        } else {
            i10 = 2131231842;
        }
        if (q6) {
            i11 = 2131744326;
        } else {
            i11 = 2131744325;
        }
        H.c(i10, org.telegram.messenger.cd.L0(i11, null), new ew(this, 8), false);
        H.k();
        char c11 = '\t';
        H.c(2131232482, org.telegram.messenger.cd.L0(2131748290, null), new ew(this, 9), false);
        H.c(2131232503, org.telegram.messenger.cd.L0(2131745918, null), new ew(this, 10), false);
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f19024a;
        if (((org.telegram.messenger.j0) getMessagesController().f18957y7.f17841j0.f11587b).f16204c) {
            H.c(2131231276, org.telegram.messenger.cd.L0(2131743220, null), new fv(this, 0), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).f18307b;
            if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i16 = 0;
                while (i16 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i16);
                    i16++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        gv gvVar2 = new gv(this, tL_attachMenuBot2, launchActivity, i14);
                        xs xsVar2 = new xs(i15, this, tL_attachMenuBot2);
                        f7 = f10;
                        org.telegram.ui.ActionBar.p6 p6Var2 = H.d;
                        if (H.e == null) {
                            arrayList2 = arrayList3;
                            launchActivity2 = launchActivity;
                            c10 = c11;
                        } else {
                            int i17 = org.telegram.ui.ActionBar.t6.F8;
                            int i18 = org.telegram.ui.ActionBar.t6.E8;
                            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, H.e, H.d, false, false);
                            b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), i14, org.telegram.messenger.i0.L(18.0f), i14);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.p8.b(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            Pattern pattern = org.telegram.messenger.ui.R1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i19 = 0;
                            while (true) {
                                if (i19 < size2) {
                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i19);
                                    int i20 = i19 + 1;
                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                    launchActivity2 = launchActivity;
                                    if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                        tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                        break;
                                    } else {
                                        i19 = i20;
                                        launchActivity = launchActivity2;
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                org.telegram.messenger.c00 f11 = org.telegram.messenger.v5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.t6.f20911c7, 1.0f, null);
                                if (f11 != null) {
                                    Integer num = H.f32928k0;
                                    if (num != null) {
                                        w05 = num.intValue();
                                    } else {
                                        w05 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
                                    }
                                    new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(tL_attachMenuBotIcon.icon);
                                gvVar = gvVar2;
                                xsVar = xsVar2;
                                b1Var.k(charSequence, b10, "24_24", f11, tL_attachMenuBot2);
                                b1Var = b1Var;
                                org.telegram.ui.Components.g9 g9Var = b1Var.h;
                                if (g9Var != null) {
                                    if (org.telegram.messenger.cd.X) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    g9Var.setLayoutParams(w7.b6.e(24, 24, i12 | 16));
                                }
                            } else {
                                gvVar = gvVar2;
                                xsVar = xsVar2;
                                b1Var.j(charSequence, 2131232071, null);
                            }
                            Integer num2 = H.f32926j0;
                            if (num2 == null && H.f32928k0 == null) {
                                b1Var.c(i18, i17);
                            } else {
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var2);
                                }
                                Integer num3 = H.f32928k0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
                                }
                                b1Var.d(w02, w03);
                            }
                            Integer num4 = H.f32928k0;
                            if (num4 != null) {
                                w04 = num4.intValue();
                            } else {
                                w04 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
                            }
                            b1Var.setIconColorImage(w04);
                            Integer num5 = H.f32930l0;
                            if (num5 != null) {
                                b1Var.setSelectorColor(num5.intValue());
                            } else {
                                b1Var.h(0.12f, i18);
                            }
                            c10 = '\t';
                            b1Var.setOnClickListener(new org.telegram.ui.Components.sr(9, H, gvVar));
                            b1Var.setOnLongClickListener(new org.telegram.ui.Components.b0(2, H, xsVar));
                            int i21 = H.S;
                            if (i21 > 0) {
                                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i21));
                                H.r(b1Var, w7.b6.o(H.S, -2));
                            } else {
                                H.r(b1Var, w7.b6.o(-1, -2));
                            }
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity2 = launchActivity;
                        c10 = c11;
                        f7 = f10;
                    }
                    c11 = c10;
                    f10 = f7;
                    arrayList3 = arrayList2;
                    launchActivity = launchActivity2;
                    i14 = 0;
                    i15 = 7;
                }
            }
        }
        float f12 = f10;
        if (getUserConfig().W) {
            H.c(2131232360, org.telegram.messenger.cd.L0(2131745512, null), new ew(this, 3), false);
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = this.f35843o0;
        if (b1Var2 != null) {
            org.telegram.ui.ActionBar.a7.V(b1Var2.f20165b, org.telegram.ui.ActionBar.t6.Oi, getResourceProvider());
            this.f35843o0.setOnClickListener(new wu(5, this, H));
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().y3 && !org.telegram.messenger.tz.f18202z1.isEmpty())) {
                H.k();
                H.d(this.f35843o0);
            }
        }
        H.Z();
        H.X(-org.telegram.messenger.i0.L(f12));
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        xw xwVar;
        bi.t0 t0Var;
        qx qxVar;
        boolean z11;
        boolean z12;
        if (!this.f35856q3 && (((xwVar = this.F3) == null || !xwVar.c()) && (((t0Var = this.K0) == null || t0Var.getVisibility() != 0) && ((qxVar = this.f35900z0) == null || !qxVar.f30717n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qx qxVar2 = this.f35900z0;
                if (qxVar2 != null && qxVar2.getTabsCount() >= 2 && this.f35900z0.getCurrentTabId() != this.f35900z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                qx qxVar3 = this.f35900z0;
                if (qxVar3 != null && qxVar3.getTabsCount() >= 2 && this.f35900z0.getCurrentTabId() != this.f35900z0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                org.telegram.messenger.tz.m(this.currentAccount);
                if (z10) {
                    if (!z12 || z11) {
                    }
                } else {
                    return z11;
                }
            }
            return true;
        }
        return false;
    }

    public final void W3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f35816i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f35806g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f35806g1.setImageDrawable(new org.telegram.ui.ActionBar.c2(true));
            org.telegram.ui.ActionBar.a7.t(this.f35806g1, org.telegram.ui.ActionBar.t6.f21313y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f35806g1;
            int i10 = org.telegram.ui.ActionBar.t6.f21332z8;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i10), getResourceProvider());
            this.f35806g1.setOnClickListener(new hv(this, 6));
            m10.addView(this.f35806g1, w7.b6.r(54, 54, 16));
            arrayList.add(this.f35806g1);
        }
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.f35811h1 = numberTextView;
        int i11 = 18;
        numberTextView.setTextSize(18);
        this.f35811h1.setTypeface(org.telegram.messenger.i0.o());
        this.f35811h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21313y8));
        NumberTextView numberTextView2 = this.f35811h1;
        if (!this.W) {
            i11 = 72;
        }
        m10.addView(numberTextView2, w7.b6.m(1.0f, 0, -1, i11, 0, 0));
        this.f35811h1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.f35826k1 = m10.g(100, 2131232292, org.telegram.messenger.i0.L(48.0f));
        this.l1 = m10.g(104, 2131232255, org.telegram.messenger.i0.L(48.0f));
        this.f35833m1 = m10.g(107, 2131232050, org.telegram.messenger.i0.L(48.0f));
        this.f35821j1 = m10.h(102, 2131232107, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(48.0f));
        org.telegram.ui.ActionBar.t0 h = m10.h(0, 2131231245, org.telegram.messenger.cd.L0(2131754839, null), org.telegram.messenger.i0.L(48.0f));
        m10.addView(new View(getParentActivity()), w7.b6.o(5, -1));
        this.f35854q1 = h.e(105, 2131232050, org.telegram.messenger.cd.L0(2131754172, null));
        this.f35839n1 = h.e(108, 2131232292, org.telegram.messenger.cd.L0(2131751454, null));
        this.f35844o1 = h.e(109, 2131232045, org.telegram.messenger.cd.L0(2131750813, null));
        this.f35849p1 = h.e(110, 2131232328, org.telegram.messenger.cd.L0(2131750713, null));
        this.f35866s1 = h.e(101, 2131232214, org.telegram.messenger.cd.L0(2131748696, null));
        this.f35860r1 = h.e(103, 2131232091, org.telegram.messenger.cd.L0(2131752089, null));
        this.f35871t1 = h.e(106, 2131232066, org.telegram.messenger.cd.L0(2131753692, null));
        this.l1.setOnLongClickListener(new uv(this, 1));
        arrayList.add(this.f35826k1);
        arrayList.add(this.f35833m1);
        arrayList.add(this.l1);
        arrayList.add(this.f35821j1);
        arrayList.add(h);
        e5(false);
    }

    public final void W4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().U3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131749328, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749329, null));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749542, null), new iv(this, 6));
                    showDialog(x1Var, new ov(this, 0));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void X3() {
        int i10;
        kx kxVar = this.C0;
        if ((kxVar != null && kxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f35840n2 != null) {
            i10 = 2;
        } else if (!this.f35831l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        kx kxVar2 = new kx(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new iw(this));
        this.C0 = kxVar2;
        this.glassEngine.c(kxVar2);
        ((tx) this.fragmentView).addView(this.C0, this.B0);
        kx kxVar3 = this.C0;
        kxVar3.f26451d0.U = new mx(this);
        kxVar3.f26458k0.setOnItemClickListener(new iv(this, 1));
        this.C0.f26462p0.setOnItemClickListener(new iv(this, 2));
        this.C0.f26469w0.setOnItemClickListener(new nv(this, 0));
        this.C0.f26462p0.setOnItemLongClickListener(new iv(this, 3));
        this.C0.f26448a0.setOnItemClickListener(new iv(this, 4));
        this.C0.f26448a0.setOnItemLongClickListener(new iw(this));
        this.C0.setFilteredSearchViewDelegate(new iv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f35847o4);
    }

    public final void X4(long j10, View view) {
        ArrayList c42;
        int i10;
        r3(j10, view);
        boolean u10 = this.actionBar.u();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (u10) {
            if (arrayList.isEmpty()) {
                m4(true);
                return;
            }
        } else {
            if (this.f35856q3) {
                W3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.a5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
                }
            } else {
                W3(null);
            }
            org.telegram.messenger.i0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            this.actionBar.O(null, null);
            int i11 = this.f35794e0[0].f44245s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.u() && !this.actionBar.w(null))) {
                c42 = getMessagesController().V0(this.W2);
            } else {
                c42 = c4(this.currentAccount, this.f35794e0[0].f44245s, this.W2, this.S1);
            }
            int size = c42.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) c42.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (r4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().B2(dialog.f19797id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f35794e0 != null) {
                    int i14 = 0;
                    while (true) {
                        zx[] zxVarArr = this.f35794e0;
                        if (i14 >= zxVarArr.length) {
                            break;
                        }
                        zxVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.vp.D8;
                t5(131072, true);
            }
            if (!this.f35856q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f35816i1;
                    if (i16 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i16);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.i0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i16++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f35883v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35883v3 = ValueAnimator.ofFloat(this.f35878u3, 1.0f);
            int i17 = 0;
            while (true) {
                zx[] zxVarArr2 = this.f35794e0;
                if (i17 >= zxVarArr2.length) {
                    break;
                }
                zx zxVar = zxVarArr2[i17];
                if (zxVar != null) {
                    zxVar.f44239a.I0(true);
                }
                i17++;
            }
            if (this.K) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, org.telegram.messenger.i0.L(i10 + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f35883v3.addUpdateListener(new jv(this, max, 0));
            this.f35883v3.addListener(new fx(this, max, 1));
            this.f35883v3.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            this.f35883v3.setDuration(200L);
            this.f35883v3.start();
            qx qxVar = this.f35900z0;
            if (qxVar != null) {
                qxVar.b(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.ti, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.f21279w8);
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.f35795e1;
            if (c2Var != null) {
                c2Var.c(true, 1.0f);
            }
            z10 = false;
        }
        e5(false);
        this.f35811h1.a(arrayList.size(), z10);
    }

    public final void Y3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f35897y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new gx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f35804f4 + this.f35814h4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f35892x0 + 1;
                this.f35892x0 = i11;
                ((tx) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void Y4(long j10, View view) {
        String str;
        org.telegram.ui.Components.wb K;
        int i10 = -this.L3;
        this.L3 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.APP_ERROR.a();
        if (j10 >= 0) {
            str = org.telegram.messenger.h20.p(org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().A3()) {
            K = org.telegram.ui.Components.cc.a0(this).Q(2131624214, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, str)));
        } else {
            K = org.telegram.ui.Components.cc.a0(this).K(2131624214, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, str)), org.telegram.messenger.cd.L0(2131743785, null), new fv(this, 8));
        }
        K.j();
    }

    public final void Z3(final long j10, final long j11, boolean z10, final pb1 pb1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String L0;
        String b02;
        String L02;
        TLRPC.TL_forumTopic f7;
        if (z3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f35802f2 != null && this.f35807g2 != null) || this.f35812h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.o5.C(j10)) {
                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j10))).user_id));
                            if (Z1 != null) {
                                L0 = org.telegram.messenger.cd.L0(2131745613, null);
                                b02 = org.telegram.messenger.cd.b0(this.f35802f2, org.telegram.messenger.h20.p(Z1));
                                L02 = org.telegram.messenger.cd.L0(2131745657, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.o5.E(j10)) {
                            if (j10 == getUserConfig().e()) {
                                L0 = org.telegram.messenger.cd.L0(2131745613, null);
                                b02 = org.telegram.messenger.cd.b0(this.f35807g2, org.telegram.messenger.cd.L0(2131745918, null));
                                L02 = org.telegram.messenger.cd.L0(2131745657, null);
                            } else {
                                TLRPC.User Z12 = getMessagesController().Z1(Long.valueOf(j10));
                                if (Z12 != null && this.f35802f2 != null) {
                                    L0 = org.telegram.messenger.cd.L0(2131745613, null);
                                    b02 = org.telegram.messenger.cd.b0(this.f35802f2, org.telegram.messenger.h20.p(Z12));
                                    L02 = org.telegram.messenger.cd.L0(2131745657, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(-j10));
                            if (L03 != null) {
                                String str = L03.title;
                                if (j11 != 0 && (f7 = getMessagesController().f18891r7.f(L03.f19793id, j11)) != null) {
                                    str = ((Object) str) + " " + f7.title;
                                }
                                if (this.f35812h2 != null) {
                                    L0 = org.telegram.messenger.cd.L0(2131754366, null);
                                    b02 = org.telegram.messenger.cd.b0(this.f35812h2, str);
                                    L02 = org.telegram.messenger.cd.L0(2131754486, null);
                                } else {
                                    L0 = org.telegram.messenger.cd.L0(2131745613, null);
                                    b02 = org.telegram.messenger.cd.b0(this.f35807g2, str);
                                    L02 = org.telegram.messenger.cd.L0(2131745657, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.i0.W2(b02);
                        alertDialog$Builder.k(L02, new org.telegram.ui.ActionBar.u1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                                ay.this.Z3(j10, j11, false, pb1Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        if (showDialog(x1Var) == null) {
                            x1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, pb1Var, 5), 17);
                    if (j10 < 0) {
                        b5(getMessagesController().L0(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User Z13 = getMessagesController().Z1(Long.valueOf(j10));
                    TLRPC.User Z14 = getMessagesController().Z1(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.cd.a0(null, null, 2131754074, org.telegram.messenger.h20.j(Z13, true), org.telegram.messenger.h20.j(Z14, true));
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = a02;
                    x1Var2.T = TextUtils.concat(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754075, org.telegram.messenger.h20.j(Z13, true), org.telegram.messenger.h20.j(Z14, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.cd.a0("Send", null, 2131745657, new Object[0]), new tt(i0Var, 4));
                    alertDialog$Builder2.h(org.telegram.messenger.cd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.z11(7));
                    showDialog(x1Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.gs.a(j10, j11));
                    if (this.C2.y(this, arrayList, null, false, this.J2, this.K2, this.L2, pb1Var) && this.f35817i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (org.telegram.messenger.o5.E(j10)) {
                TLRPC.User Z15 = getMessagesController().Z1(Long.valueOf(j10));
                if (!Z15.mutual_contact) {
                    UndoView j42 = j4();
                    if (j42 != null) {
                        j42.j(45, j10, null);
                        return;
                    }
                    return;
                }
                user = Z15;
                chat = null;
            } else {
                TLRPC.Chat L04 = getMessagesController().L0(Long.valueOf(-j10));
                if (org.telegram.messenger.w3.N(L04) && org.telegram.messenger.w3.w(1, L04)) {
                    chat = L04;
                    user = null;
                } else {
                    UndoView j43 = j4();
                    if (j43 != null) {
                        j43.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().i1(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new org.telegram.messenger.vm(this, x1Var3, user, chat, j10, tL_messages_checkHistoryImportPeer, 1));
            try {
                x1Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void Z4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.Z4(boolean, boolean, boolean, boolean):void");
    }

    public final void a4(long j10, boolean z10) {
        if (this.f35794e0 != null) {
            int i10 = 0;
            while (true) {
                zx[] zxVarArr = this.f35794e0;
                if (i10 < zxVarArr.length) {
                    int childCount = zxVarArr[i10].f44239a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f35794e0[i10].f44239a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.v2) {
                                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                                if (v2Var.getDialogId() == j10) {
                                    v2Var.c0(z10, true);
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a5() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !org.telegram.messenger.tz.f18194x && (!this.K || this.E0.g())) {
            z21[] z21VarArr = new z21[1];
            TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f();
            org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f25301f[0];
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                i10 = org.telegram.messenger.i0.L(4.0f) + (rect.centerX() - org.telegram.messenger.i0.L(16.0f));
                org.telegram.ui.Cells.n nVar = this.E3;
                if (nVar != null) {
                    nVar.b(rect.centerX(), rect.centerY());
                }
                i11 = L;
            } else {
                i10 = 0;
                i11 = 0;
            }
            yw ywVar = new yw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), z21VarArr);
            if (f7 != null && org.telegram.messenger.o5.g(f7.emoji_status) > 0) {
                ywVar.setExpireDateHint(org.telegram.messenger.o5.g(f7.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                ywVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f25301f[0];
                if (drawable2 instanceof org.telegram.ui.Components.f5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.f5) drawable2).h());
                } else {
                    l4 = null;
                }
                ywVar.setSelected(l4);
            }
            ywVar.setSaveState(1);
            ywVar.y(this.D3, titleTextView);
            zw zwVar = new zw(this, ywVar);
            this.M0 = zwVar;
            z21VarArr[0] = zwVar;
            zwVar.showAsDropDown(this.actionBar, org.telegram.messenger.i0.L(16.0f), i11, 48);
            z21VarArr[0].b();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20987g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20968f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20988g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21098m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20950e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20932d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20913c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21005h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21118n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21079l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21137o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21041j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21061k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21152p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21314y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21298x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21245u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21189r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21172q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21023i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20894b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20874a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
    }

    public final void b5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.b5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList c4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.c4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void c5(boolean z10) {
        zx[] zxVarArr;
        char c10;
        char c11;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            zxVarArr = this.f35794e0;
            if (i11 >= zxVarArr.length) {
                break;
            }
            zxVarArr[i11].f44239a.C0();
            i11++;
        }
        if (z10 && zxVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i12 = zxVarArr[c10].h;
        if (i12 >= 0 && i12 < getMessagesController().S0().size()) {
            org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) getMessagesController().S0().get(this.f35794e0[c10].h);
            if (apVar.e()) {
                zx zxVar = this.f35794e0[c10];
                zxVar.f44245s = this.R0;
                wx wxVar = zxVar.f44239a;
                int i13 = wx.B3;
                wxVar.D1();
            } else {
                zx[] zxVarArr2 = this.f35794e0;
                if (zxVarArr2[c10 ^ 1].f44245s == 7) {
                    zxVarArr2[c10].f44245s = 8;
                } else {
                    zxVarArr2[c10].f44245s = 7;
                }
                zxVarArr2[c10].f44239a.setScrollEnabled(true);
                org.telegram.messenger.vp messagesController = getMessagesController();
                if (this.f35794e0[c10].f44245s == 8) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                org.telegram.messenger.ap[] apVarArr = messagesController.M;
                org.telegram.messenger.ap apVar2 = apVarArr[c11];
                if (apVar2 != apVar) {
                    apVarArr[c11] = apVar;
                    int i14 = c11 ^ 1;
                    if (apVarArr[i14] == apVar) {
                        apVarArr[i14] = null;
                    }
                    if (apVarArr[c11] == null) {
                        if (apVar2 != null) {
                            apVar2.f14652k.clear();
                            apVar2.f14653l.clear();
                        }
                    } else {
                        messagesController.Q4(null);
                    }
                }
            }
            zx[] zxVarArr3 = this.f35794e0;
            if (zxVarArr3.length > 1) {
                zxVarArr3[1].E = apVar.f14657p;
            }
            zx zxVar2 = zxVarArr3[c10];
            lw lwVar = zxVar2.d;
            lwVar.h = zxVar2.f44245s;
            lwVar.f();
            zx zxVar3 = this.f35794e0[c10];
            hw hwVar = zxVar3.f44241c;
            if (zxVar3.f44245s == 0 && k4() && this.f35794e0[c10].f44246w == 2) {
                i10 = 1;
            }
            hwVar.h1(i10, (int) this.N);
            B3(this.f35794e0[c10]);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        qx qxVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (qxVar = this.f35900z0) != null && qxVar.getVisibility() == 0 && this.f35900z0.K > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.F3.c()) {
            this.F3.a();
            kx kxVar = this.C0;
            if (kxVar != null) {
                kxVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        kg.g1 g1Var = new kg.g1(this, context, this.resourceProvider, 4);
        g1Var.setAllowOverlayTitle(true);
        g1Var.G0 = true;
        if (g1Var.F0 == null) {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(g1Var.getContext(), 9);
            g1Var.F0 = a5Var;
            g1Var.addView(a5Var);
        }
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.f21225t8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.a(g1Var, org.telegram.ui.ActionBar.t6.f21332z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, org.telegram.ui.ActionBar.t6.f21261v8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(g1Var, org.telegram.ui.ActionBar.t6.f21313y8, getResourceProvider(), true);
        if (g1Var.f20519w1 == null) {
            org.telegram.ui.ActionBar.j jVar = new org.telegram.ui.ActionBar.j(g1Var, g1Var.getContext(), g1Var.J0, g1Var.O0);
            g1Var.f20519w1 = jVar;
            jVar.setClipChildren(false);
            g1Var.addView(g1Var.f20519w1);
        }
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.i0.L(4.0f));
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.i0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.i0.Q1() || this.W2 == 0 || p4())) {
            return g1Var;
        }
        g1Var.setOccupyStatusBar(false);
        return g1Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.createView(android.content.Context):android.view.View");
    }

    public final float d4(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f35777b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - g4()) * this.f35858r.e;
    }

    public final void d5() {
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
        int i10;
        q01 q01Var = this.Z;
        if (q01Var != null && q01Var.getVisibility() != 8) {
            f7 = this.Z.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        if (this.K) {
            f10 = org.telegram.messenger.i0.L(81.0f);
        } else {
            f10 = 0.0f;
        }
        if (this.K) {
            float f19 = this.N;
            float f20 = this.f35893x1;
            f11 = (f7 * f20) + c3.i0.z(1.0f, f20, f10, f19);
            f12 = this.f35895x3;
        } else {
            f11 = (f7 * this.f35893x1) + this.N;
            f12 = this.f35895x3;
        }
        float f21 = f11 + f12 + this.T;
        px pxVar = this.X;
        if (pxVar != null && pxVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float L = org.telegram.messenger.i0.L(4.0f) * f13;
        qx qxVar = this.f35900z0;
        if (qxVar != null) {
            qxVar.setTranslationY(f21 - L);
            f15 = this.f35900z0.getAlpha();
            f16 = org.telegram.messenger.i0.L(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            float f22 = f14 - L;
            int i11 = -org.telegram.messenger.i0.L(3.0f);
            if (this.f35773a0 == null) {
                i10 = org.telegram.messenger.i0.L(44.0f);
            } else {
                i10 = 0;
            }
            zrVar.setTranslationY(org.telegram.messenger.i0.T1(f22, i11 - i10, this.f35777b.e));
            f17 = this.J1.getMetadata().f7040c.f7048a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setTranslationY(f21 - L);
            float W1 = org.telegram.messenger.i0.W1(Math.min(f17, f15), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(50.0f));
            org.telegram.ui.Components.yr yrVar2 = this.K1;
            float min = Math.min(org.telegram.messenger.i0.L(40.0f), (f18 + f16) - W1);
            Matrix matrix = yrVar2.f32778b;
            if (yrVar2.e != W1 || yrVar2.f32780f != min) {
                yrVar2.e = W1;
                yrVar2.f32780f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = yrVar2.f32779c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                yrVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof xh.m2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final int e4() {
        if (this.K) {
            return org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(81.0f);
        }
        return org.telegram.messenger.i0.L(48.0f);
    }

    public final void e5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.e5(boolean):void");
    }

    public final int f4() {
        if (this.K) {
            return org.telegram.messenger.i0.L(81.0f);
        }
        return 0;
    }

    public final void f5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.f5():void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    public final float g4() {
        xw xwVar = this.F3;
        if (xwVar != null && xwVar.c()) {
            return this.F3.e;
        }
        return 0.0f;
    }

    public final void g5() {
        ag.b1 b1Var;
        wx wxVar;
        boolean z10;
        int i10;
        try {
            ow owVar = this.B1;
            if (owVar != null && owVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
            }
            NumberTextView numberTextView = this.f35811h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21313y8));
            }
            qx qxVar = this.f35900z0;
            int i11 = 0;
            if (qxVar != null && (qxVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null && lVar.u()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f35900z0.getSelectorDrawable();
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.t6.ui;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i10));
                this.f35900z0.invalidate();
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    lVar2.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), true);
                }
                if (this.actionBar.u()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                }
                m5();
            }
            if (this.f35794e0 != null) {
                while (true) {
                    zx[] zxVarArr = this.f35794e0;
                    if (i11 >= zxVarArr.length) {
                        break;
                    }
                    zx zxVar = zxVarArr[i11];
                    if (zxVar != null && (wxVar = zxVar.f44239a) != null) {
                        wxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                    }
                    i11++;
                }
            }
            kx kxVar = this.C0;
            if (kxVar != null && (b1Var = kxVar.f26448a0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            }
            bi.f2 f2Var = this.C1;
            if (f2Var != null) {
                f2Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            }
            vh.p2 p2Var = this.f35848p0;
            if (p2Var != null) {
                p2Var.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
            vh.p2 p2Var2 = this.f35853q0;
            if (p2Var2 != null) {
                p2Var2.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.u4 getBackButtonState() {
        if (!p4() && !this.F3.f38659f) {
            return org.telegram.ui.ActionBar.u4.f21349b;
        }
        return org.telegram.ui.ActionBar.u4.f21348a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new mv(this, 1));
        this.Z3.setInterpolator(org.telegram.ui.Components.gr.f26496g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.getThemeDescriptions():java.util.ArrayList");
    }

    public final float h4() {
        return -org.telegram.messenger.i0.W1(this.f35777b.e, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(48.0f));
    }

    public final void h5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        zx[] zxVarArr;
        org.telegram.messenger.ap apVar;
        boolean z13;
        Object[] objArr;
        s4.l0 l0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f35900z0 != null && !this.inPreviewMode && !this.f35856q3) {
            xw xwVar = this.F3;
            if (xwVar == null || !xwVar.c()) {
                org.telegram.ui.Components.z60 z60Var = this.L0;
                String str = null;
                if (z60Var != null) {
                    z60Var.u();
                    this.L0 = null;
                }
                ArrayList S0 = getMessagesController().S0();
                int size = S0.size();
                fe.b bVar = this.f35858r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f35900z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f35900z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f35891x = true;
                        boolean isEmpty = this.f35900z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f35856q3) {
                                bVar.a(this.f35891x, z16);
                            }
                        }
                        int currentTabId = this.f35900z0.getCurrentTabId();
                        int currentTabStableId = this.f35900z0.getCurrentTabStableId();
                        if (currentTabId != this.f35900z0.getDefaultTabId() && currentTabId >= S0.size()) {
                            this.f35900z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        qx qxVar = this.f35900z0;
                        qxVar.h.clear();
                        qxVar.f30714j0.clear();
                        qxVar.f30716l0.clear();
                        qxVar.m0.clear();
                        qxVar.f30718n0.clear();
                        qxVar.f30719o0.clear();
                        qxVar.M = 0;
                        int size2 = S0.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (((org.telegram.messenger.ap) S0.get(i10)).e()) {
                                this.f35900z0.a(i10, 0, org.telegram.messenger.cd.L0(2131750808, str), null, false, true, ((org.telegram.messenger.ap) S0.get(i10)).f14657p);
                                z15 = z18;
                            } else {
                                org.telegram.messenger.ap apVar2 = (org.telegram.messenger.ap) S0.get(i10);
                                z15 = z18;
                                this.f35900z0.a(i10, apVar2.f14656o, apVar2.f14646b, apVar2.f14647c, apVar2.f14655n, false, ((org.telegram.messenger.ap) S0.get(i10)).f14657p);
                            }
                            i10++;
                            z18 = z15;
                            str = null;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f35900z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    qx qxVar2 = this.f35900z0;
                                    if (qxVar2.h(qxVar2.f30715k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f35900z0.f30715k0.get(this.f35794e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f35794e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            zx[] zxVarArr2 = this.f35794e0;
                            if (i11 >= zxVarArr2.length) {
                                break;
                            }
                            if (zxVarArr2[i11].h >= S0.size()) {
                                this.f35794e0[i11].h = S0.size() - 1;
                            }
                            this.f35794e0[i11].f44239a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        qx qxVar3 = this.f35900z0;
                        ag.b1 b1Var = qxVar3.F;
                        if (z13) {
                            l0Var = qxVar3.f30725s0;
                        } else {
                            l0Var = null;
                        }
                        b1Var.setItemAnimator(l0Var);
                        qxVar3.I.f();
                        if (isEmpty) {
                            c5(z19);
                        }
                        qx qxVar4 = this.f35900z0;
                        int currentTabId2 = qxVar4.getCurrentTabId();
                        ArrayList arrayList = qxVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.pz) arrayList.get(i12)).f29471a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.pz) arrayList.get(i12)).f29474f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            qx qxVar5 = this.f35900z0;
                            ArrayList arrayList2 = qxVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                qxVar5.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f35900z0.getVisibility() != 8) {
                        this.f35900z0.setIsEditing(false);
                        T4(false);
                        this.f35841n3 = false;
                        if (this.f35835m3) {
                            this.f35835m3 = false;
                            this.f35794e0[0].setTranslationX(0.0f);
                            this.f35794e0[1].setTranslationX(zxVarArr[0].getMeasuredWidth());
                        }
                        if (this.f35794e0[0].h != this.f35900z0.getDefaultTabId()) {
                            this.f35794e0[0].h = this.f35900z0.getDefaultTabId();
                            lw lwVar = this.f35794e0[0].d;
                            lwVar.h = 0;
                            lwVar.f();
                            zx zxVar = this.f35794e0[0];
                            zxVar.f44245s = this.R0;
                            zxVar.d.f();
                        }
                        this.f35794e0[1].setVisibility(8);
                        zx zxVar2 = this.f35794e0[1];
                        zxVar2.h = 0;
                        lw lwVar2 = zxVar2.d;
                        lwVar2.h = 0;
                        lwVar2.f();
                        zx zxVar3 = this.f35794e0[1];
                        zxVar3.f44245s = this.R0;
                        zxVar3.d.f();
                        this.f35891x = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f35856q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            zx[] zxVarArr3 = this.f35794e0;
                            if (i13 >= zxVarArr3.length) {
                                break;
                            }
                            zx zxVar4 = zxVarArr3[i13];
                            if (zxVar4.f44245s == 0 && zxVar4.f44246w == 2 && k4() && ((L0 = this.f35794e0[i13].f44241c.L0()) == 0 || L0 == 1)) {
                                this.f35794e0[i13].f44241c.h1(1, (int) this.N);
                            }
                            this.f35794e0[i13].f44239a.setScrollingTouchSlop(0);
                            this.f35794e0[i13].f44239a.requestLayout();
                            this.f35794e0[i13].requestLayout();
                            i13++;
                        }
                        this.f35900z0.L = -1;
                        r52 = 0;
                    }
                }
                e5(r52);
                int i14 = this.f35794e0[r52].f44245s;
                if ((i14 == 7 || i14 == 8) && (apVar = getMessagesController().M[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < S0.size()) {
                            org.telegram.messenger.ap apVar3 = (org.telegram.messenger.ap) S0.get(i15);
                            if (apVar3 != null && apVar3.f14645a == apVar.f14645a) {
                                break;
                            }
                            i15++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        c5(false);
                    }
                }
            }
        }
    }

    public final th.e5 i4() {
        return getMessagesController().O1();
    }

    public final void i5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.i5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final boolean isLightStatusBar() {
        xw xwVar;
        if (!this.f35822j2 && (xwVar = this.F3) != null && xwVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final UndoView j4() {
        Y3();
        UndoView[] undoViewArr = this.f35897y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            tx txVar = (tx) this.fragmentView;
            txVar.removeView(undoViewArr[0]);
            txVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void j5() {
        float f7 = (((-this.f35804f4) - this.f35819i4) - this.f35876u1) - this.f35881v1;
        org.telegram.ui.Components.f10 f10Var = this.f35870t0;
        if (f10Var != null) {
            f10Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.f35875u0;
        if (f10Var2 != null) {
            f10Var2.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            vh.p2 p2Var = this.f35848p0;
            if (p2Var != null) {
                p2Var.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            }
        }
    }

    public final boolean k4() {
        if (!this.f35831l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0) {
            org.telegram.messenger.vp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.tz.f18176q1 && messagesController.Q.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k5(boolean z10) {
        boolean z11;
        boolean z12 = this.f35831l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f35822j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.f10 f10Var = this.f35870t0;
        if (f10Var != null) {
            f10Var.e(z11, z10);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.f35875u0;
        if (f10Var2 != null) {
            f10Var2.e(z11, z10);
        }
    }

    public final boolean l4() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void l5(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f35838n0 != null) {
            org.telegram.ui.ActionBar.t0 t0Var = this.m0;
            if (t0Var == null || t0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().G.size()) {
                        if (getFileLoader().T(((org.telegram.messenger.jj) getDownloadController().G.get(i11)).S0())) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (getDownloadController().I.size() <= 0 && !z12 && (this.f35805g0.getVisibility() != 0 || this.f35805g0.getAlpha() != 1.0f || z11)) {
                    this.f35815i0 = false;
                } else {
                    this.f35815i0 = true;
                }
                I3();
                boolean z14 = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f35791d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.b1 b1Var = this.f35843o0;
                if (z14) {
                    if (z13) {
                        i10 = 2131748623;
                    } else {
                        i10 = 2131748622;
                    }
                } else {
                    i10 = 2131748621;
                }
                b1Var.setSubtext(org.telegram.messenger.cd.L0(i10, null));
                this.f35838n0.b(z14, z13, z10);
            }
        }
    }

    public final void m4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.t();
        this.I2.clear();
        org.telegram.ui.ActionBar.c2 c2Var = this.f35795e1;
        boolean z12 = true;
        if (c2Var != null) {
            c2Var.c(true, 0.0f);
        }
        qx qxVar = this.f35900z0;
        if (qxVar != null) {
            qxVar.b(org.telegram.ui.ActionBar.t6.K8, org.telegram.ui.ActionBar.t6.I8, org.telegram.ui.ActionBar.t6.J8, org.telegram.ui.ActionBar.t6.L8, org.telegram.ui.ActionBar.t6.f20929d6);
        }
        ValueAnimator valueAnimator = this.f35883v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35883v3 = null;
        }
        if (this.f35878u3 == 0.0f) {
            return;
        }
        N4(-e4());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            zx[] zxVarArr = this.f35794e0;
            if (i11 >= zxVarArr.length) {
                break;
            }
            zx zxVar = zxVarArr[i11];
            if (zxVar != null) {
                zxVar.f44239a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.i0.L(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35878u3, 0.0f);
        this.f35883v3 = ofFloat;
        ofFloat.addUpdateListener(new jv(this, max, 1));
        this.f35883v3.addListener(new fx(this, max, 0));
        this.f35883v3.setInterpolator(org.telegram.ui.Components.gr.f26495f);
        this.f35883v3.setDuration(200L);
        this.f35883v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f35774a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) arrayList.get(i12);
                i00.y0(apVar, apVar.f14649g, apVar.f14646b, apVar.f14647c, apVar.f14655n, apVar.f14654m, apVar.h, apVar.f14650i, apVar.f14651j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().j4(this.W2, 0L, null);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        e5(true);
        if (this.f35794e0 != null) {
            int i13 = z11;
            while (true) {
                zx[] zxVarArr2 = this.f35794e0;
                if (i13 >= zxVarArr2.length) {
                    break;
                }
                zxVarArr2[i13].d.H = z11;
                i13++;
            }
        }
        int i14 = org.telegram.messenger.vp.D8;
        int i15 = z11;
        if (z10) {
            i15 = 8192;
        }
        t5(i15 | 196608, true);
    }

    public final void m5() {
        int i10;
        int i11;
        if (this.f35868s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.t6.f21261v8;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.t6.f21313y8;
            lVar.D(i0.b.f(this.f35893x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.D(i0.b.f(this.f35893x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.t6.f21225t8;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.C(i0.b.f(this.f35893x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.t6.f21332z8)), false);
        }
    }

    public final void n4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f35780b2) {
            this.T3 = z10;
            k5(true);
            if (z10) {
                vh.p2 p2Var = this.f35848p0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                vh.p2 p2Var2 = this.f35853q0;
                if (p2Var2 != null) {
                    p2Var2.e(true);
                }
            }
        }
    }

    public final void n5() {
        org.telegram.ui.Components.sp0 sp0Var;
        int i10;
        ow owVar = this.B1;
        ArrayList arrayList = this.I2;
        if (owVar != null) {
            this.f35837n.a(!arrayList.isEmpty(), true);
            o5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f35802f2 == null) {
                    i10 = 2131750577;
                } else {
                    i10 = 2131745686;
                }
                String L0 = org.telegram.messenger.cd.L0(i10, null);
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(L0);
                } else {
                    this.actionBar.K(L0, true, 350L, org.telegram.ui.Components.gr.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.j0(false, false, false);
                    this.B1.L();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!l4() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.V3 && (sp0Var = this.G2) != null) {
                        this.V3 = true;
                        String L02 = org.telegram.messenger.cd.L0(2131745447, null);
                        sp0Var.j();
                        sp0Var.F = L02;
                        org.telegram.ui.Components.qp0 qp0Var = sp0Var.f30320a[0];
                        if (L02 != null) {
                            ((org.telegram.ui.ActionBar.u5) qp0Var.h).l(L02, false);
                        }
                        org.telegram.ui.Components.uo0 uo0Var = new org.telegram.ui.Components.uo0(sp0Var, 1);
                        sp0Var.G = uo0Var;
                        org.telegram.messenger.i0.h3(uo0Var, 1000L);
                    }
                }
                this.C1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i12 = 0;
                long j10 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    long longValue = ((Long) obj).longValue();
                    long M1 = getMessagesController().M1(longValue);
                    if (M1 <= 0 && longValue > 0) {
                        M1 = org.telegram.messenger.o5.k(getMessagesController().H2(longValue));
                    }
                    j10 += M1;
                }
                this.C1.i(i11, j10, true);
                this.B1.Q1();
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.K(org.telegram.messenger.cd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.gr.h);
                }
            }
            this.P3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            n4(arrayList.isEmpty());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.sp0 sp0Var = this.G2;
        if (sp0Var != null) {
            int i10 = this.currentAccount;
            sp0Var.h(i10);
            sp0Var.d = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i10).f14863a).e();
            ArrayList arrayList = sp0Var.f30323f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.qp0 qp0Var = sp0Var.f30320a[0];
            if (sp0Var.f30321b == 1) {
                ((org.telegram.ui.ActionBar.u5) qp0Var.f29719f).l(sp0Var.c(qp0Var), false);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.F3.c() && this.F3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.F3.a();
                kx kxVar = this.C0;
                if (kxVar != null) {
                    kxVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.z60 z60Var = this.L0;
            if (z60Var != null) {
                if (z10) {
                    z60Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                qx qxVar = this.f35900z0;
                if (qxVar != null && qxVar.f30717n) {
                    if (z10) {
                        qxVar.setIsEditing(false);
                        T4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null && lVar.u()) {
                        if (z10) {
                            kx kxVar2 = this.C0;
                            if (kxVar2 != null && kxVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            m4(true);
                            return false;
                        }
                    } else if (this.f35777b.f7021f) {
                        if (z10) {
                            this.X.f26588r.getText().clear();
                            this.Y.b(false);
                            this.X.f26588r.clearFocus();
                            return false;
                        }
                    } else {
                        qx qxVar2 = this.f35900z0;
                        if (qxVar2 != null && qxVar2.getVisibility() == 0 && !this.f35813h3) {
                            qx qxVar3 = this.f35900z0;
                            if (!qxVar3.O && !this.f35835m3) {
                                ArrayList arrayList = qxVar3.h;
                                if (!arrayList.isEmpty() && qxVar3.L != ((org.telegram.ui.Components.pz) arrayList.get(0)).f29471a) {
                                    if (z10) {
                                        qx qxVar4 = this.f35900z0;
                                        ArrayList arrayList2 = qxVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            qxVar4.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ow owVar = this.B1;
                        if (owVar != null && owVar.q0()) {
                            if (z10) {
                                this.B1.i0(true);
                            }
                        } else {
                            uw uwVar = this.E0;
                            if (uwVar.O == 0 && uwVar.S.L0() != 0) {
                                uwVar.h.y0(0);
                                return false;
                            }
                            return super.onBackPressed(z10);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        bi.t0 t0Var;
        qx qxVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.k(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                kx kxVar = this.C0;
                if (kxVar != null) {
                    kxVar.f26451d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qxVar = this.f35900z0) != null && qxVar.getVisibility() == 0 && this.f35858r.f7021f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f35794e0[0].f44239a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f35897y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        M3();
        this.f35859r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        vh.p2 p2Var;
        super.onBecomeFullyVisible();
        if (p4()) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            boolean z10 = d12.getBoolean("archivehint", true);
            boolean isEmpty = c4(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.vp.d1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                d12.edit().putBoolean("archivehint", false).commit();
                R4();
            }
        }
        if (this.f35859r0 && !this.f35865s0 && (p2Var = this.f35848p0) != null && this.N3) {
            this.f35865s0 = true;
            this.f35859r0 = false;
            p2Var.u();
        }
        org.telegram.messenger.i0.h3(new fv(this, 20), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.x1 x1Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (x1Var = this.T1) != null && dialog == x1Var && getParentActivity() != null) {
            t3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        boolean z10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f35831l2 = bundle.getBoolean("onlySelect", false);
            this.f35834m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f35855q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f35802f2 = this.arguments.getString("selectAlertString");
            this.f35807g2 = this.arguments.getString("selectAlertStringGroup");
            this.f35812h2 = this.arguments.getString("addToGroupAlertString");
            this.f35861r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f35867s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f35872t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().L0(Long.valueOf(this.Y2));
                this.f35775a3 = getMessagesController().M0(this.Y2);
            }
            this.f35817i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f35877u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f35877u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f35882v2 = this.arguments.getBoolean("allowGroups", true);
            this.f35888w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f35894x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f35899y2 = this.arguments.getBoolean("allowChannels", true);
            this.f35902z2 = this.arguments.getBoolean("allowUsers", true);
            this.A2 = this.arguments.getBoolean("allowBots", true);
            this.B2 = this.arguments.getBoolean("closeFragment", true);
            this.F = this.arguments.getBoolean("allowGlobalSearch", true);
            this.W = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.G = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.H = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.R0 == 0) {
            this.U1 = org.telegram.messenger.vp.e1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.tz.u();
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.J3 = new xa.n(notificationCenter, this);
        if (this.f35840n2 == null) {
            this.f35791d2 = getConnectionsManager().getConnectionState();
            this.J3.h(org.telegram.messenger.zs.f19630i4);
            if (!this.f35831l2) {
                this.J3.h(org.telegram.messenger.zs.I4);
                this.J3.h(org.telegram.messenger.zs.A4);
                this.J3.e(org.telegram.messenger.zs.P2);
                this.J3.e(org.telegram.messenger.zs.f19598d2);
            }
            xa.n nVar = this.J3;
            nVar.e(org.telegram.messenger.zs.f19683s);
            nVar.e(org.telegram.messenger.zs.O2);
            nVar.e(org.telegram.messenger.zs.f19676r);
            nVar.e(org.telegram.messenger.zs.Y);
            nVar.e(org.telegram.messenger.zs.O);
            nVar.e(org.telegram.messenger.zs.I2);
            nVar.e(org.telegram.messenger.zs.f19620h0);
            nVar.e(org.telegram.messenger.zs.f19608f0);
            nVar.e(org.telegram.messenger.zs.J);
            nVar.e(org.telegram.messenger.zs.K);
            nVar.e(org.telegram.messenger.zs.M);
            nVar.e(org.telegram.messenger.zs.P0);
            nVar.e(org.telegram.messenger.zs.f19684s0);
            nVar.e(org.telegram.messenger.zs.f19675q5);
            nVar.e(org.telegram.messenger.zs.S0);
            nVar.e(org.telegram.messenger.zs.T1);
            nVar.e(org.telegram.messenger.zs.f19589b5);
            nVar.e(org.telegram.messenger.zs.K2);
            nVar.e(org.telegram.messenger.zs.f19596d0);
            nVar.e(org.telegram.messenger.zs.f19685s1);
            nVar.e(org.telegram.messenger.zs.Y4);
            nVar.e(org.telegram.messenger.zs.Z4);
            nVar.e(org.telegram.messenger.zs.N);
            nVar.e(org.telegram.messenger.zs.f19652m5);
            nVar.e(org.telegram.messenger.zs.f19613f5);
            this.J3.h(org.telegram.messenger.zs.f19653n0);
        }
        xa.n nVar2 = this.J3;
        nVar2.e(org.telegram.messenger.zs.f19710w);
        nVar2.e(org.telegram.messenger.zs.S4);
        nVar2.e(org.telegram.messenger.zs.f19583a5);
        nVar2.e(org.telegram.messenger.zs.T);
        nVar2.e(org.telegram.messenger.zs.L4);
        nVar2.e(org.telegram.messenger.zs.f19696t5);
        nVar2.e(org.telegram.messenger.zs.f19709v5);
        nVar2.e(org.telegram.messenger.zs.Z2);
        nVar2.e(org.telegram.messenger.zs.f19599d3);
        nVar2.e(org.telegram.messenger.zs.f19619g5);
        nVar2.e(org.telegram.messenger.zs.y3);
        nVar2.e(org.telegram.messenger.zs.A3);
        nVar2.e(org.telegram.messenger.zs.S5);
        nVar2.e(org.telegram.messenger.zs.T5);
        nVar2.e(org.telegram.messenger.zs.P3);
        nVar2.e(org.telegram.messenger.zs.Q3);
        if (this.R0 == 0) {
            this.J3.e(org.telegram.messenger.zs.f19736z5);
            this.J3.e(org.telegram.messenger.zs.P1);
        }
        t4(getAccountInstance());
        th.e5 O1 = getMessagesController().O1();
        if (!O1.A) {
            O1.W();
            if (!O1.f48919s) {
                ConnectionsManager.getInstance(O1.f48904a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new th.i4(O1, 0));
            }
        }
        getMessagesController().Z2(this.W2);
        if (this.Q3 != null && !getMessagesStorage().Q) {
            ou ouVar = this.Q3;
            if (ouVar.getParent() != null) {
                ((ViewGroup) ouVar.getParent()).removeView(ouVar);
            }
            this.Q3 = null;
        }
        if (p4()) {
            th.e5 O12 = getMessagesController().O1();
            if (O12.f48925z) {
                O12.T(true);
            }
        } else {
            getMessagesController().O1().W();
        }
        getContactsController().B();
        if (getMessagesController().f18872p6) {
            org.telegram.messenger.gw F1 = getMessagesController().F1();
            if (!F1.e) {
                F1.g(true);
            }
        }
        if (this.Y2 != 0) {
            getMessagesController().T2(0, this.Y2, true);
        }
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(this.currentAccount);
        if (!a2.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = a2.f19323b;
            if (j11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j12 = currentTimeMillis - j11;
                boolean z11 = org.telegram.messenger.v2.f18448a;
                if (j12 > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a2.f19323b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                a2.e = true;
                ConnectionsManager.getInstance(a2.f19322a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.v1(a2, 0));
            }
        }
        if (this.W) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        this.f35814h4 = i10;
        if (this.W) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        }
        this.f35819i4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.J3;
        if (nVar != null) {
            nVar.a();
            this.J3 = null;
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.z0();
        }
        org.telegram.ui.Components.sp0 sp0Var = this.G2;
        if (sp0Var != null) {
            sp0Var.j();
        }
        xs xsVar = this.H2;
        if (xsVar != null) {
            org.telegram.messenger.i0.r(xsVar);
            this.H2 = null;
        }
        UndoView undoView = this.f35897y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f35851p3.e();
        this.C2 = null;
        int i10 = org.telegram.ui.Components.t10.f30408i1;
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f35794e0 != null) {
            this.J0 = f7;
            ow owVar = this.B1;
            int i10 = 0;
            if (owVar != null && owVar.q0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    zx[] zxVarArr = this.f35794e0;
                    if (i10 >= zxVarArr.length) {
                        break;
                    }
                    zxVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f35831l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.wb wbVar = this.f35846o3;
                    if (wbVar != null) {
                        wbVar.l();
                    }
                }
                kx kxVar = this.C0;
                if (kxVar != null) {
                    kxVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                zx[] zxVarArr2 = this.f35794e0;
                if (i10 >= zxVarArr2.length) {
                    break;
                }
                zxVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f35831l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.wb wbVar2 = this.f35846o3;
                if (wbVar2 != null) {
                    wbVar2.l();
                }
            }
            kx kxVar2 = this.C0;
            if (kxVar2 != null) {
                kxVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wb wbVar = this.S;
        if (wbVar != null) {
            wbVar.b();
            this.S = null;
        }
        xw xwVar = this.F3;
        if (xwVar != null) {
            xwVar.f38661r = true;
            ex exVar = xwVar.f38656a;
            if (exVar != null) {
                exVar.onPause();
            }
        }
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f35897y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f35794e0 == null) {
            return;
        }
        while (true) {
            zx[] zxVarArr = this.f35794e0;
            if (i10 < zxVarArr.length) {
                zxVarArr[i10].d.getClass();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.messenger.h9 h9Var;
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11) {
                    String str = strArr[i11];
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (iArr[i11] == 0) {
                                org.telegram.messenger.ot.t(this.currentAccount).Y();
                                break;
                            } else {
                                ji0.I0();
                                continue;
                            }
                        case 1:
                            if (iArr[i11] == 0) {
                                org.telegram.messenger.hc.D().i(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i11] == 0) {
                                org.telegram.messenger.i0.g3(new fv(this, 19));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = org.telegram.messenger.vp.e1().edit();
                                this.U1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.A0) {
                this.A0 = false;
                U4();
            }
        } else if (i10 == 4) {
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (h9Var = FilesMigrationService.e) != null) {
                h9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        zx zxVar;
        lw lwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.zm0 zm0Var;
        bi.t0 t0Var;
        super.onResume();
        uw uwVar = this.E0;
        char c10 = 0;
        if (uwVar != null) {
            ArrayList arrayList = uwVar.f49227y;
            th.e5 e5Var = uwVar.f49218s;
            e5Var.l(e5Var.f48908g);
            e5Var.l(e5Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = e5Var.y(((th.j) arrayList.get(i10)).f49078c);
                if (y3 != null) {
                    e5Var.a0(y3);
                }
            }
        }
        xw xwVar = this.F3;
        if (xwVar != null) {
            xwVar.f38661r = false;
            ex exVar = xwVar.f38656a;
            if (exVar != null) {
                exVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f35794e0 != null) {
            int i11 = 0;
            while (true) {
                zx[] zxVarArr = this.f35794e0;
                if (i11 >= zxVarArr.length) {
                    break;
                }
                zxVarArr[i11].d.f();
                i11++;
            }
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.C0();
        }
        long j10 = 0;
        if (!this.f35831l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().B(4);
        }
        kx kxVar = this.C0;
        if (kxVar != null && (zm0Var = kxVar.f26451d0) != null) {
            zm0Var.f();
        }
        if (!this.f35872t2 && getUserConfig().Z != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f35786c2 && !this.f35831l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f35786c2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || org.telegram.messenger.v2.f18449b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.messenger.m4 m4Var = new org.telegram.messenger.m4(this, z13, z11, z12, parentActivity);
                if (this.f35872t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                org.telegram.messenger.i0.h3(m4Var, j10);
            }
        } else if (!this.f35831l2 && this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.d6.i() && !org.telegram.messenger.d6.f()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.vp.e1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(2131624113, 72, getThemedColor(i13), null);
                    alertDialog$Builder.n(i13, getResourceProvider());
                    String L0 = org.telegram.messenger.cd.L0(2131747314, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.T = L0;
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new iv(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), new org.telegram.ui.Components.z11(8));
                    showDialog(x1Var);
                }
            } else {
                return;
            }
        } else if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.vp.e1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder2.m(2131624113, 72, getThemedColor(i14), null);
                    alertDialog$Builder2.n(i14, getResourceProvider());
                    String L02 = org.telegram.messenger.cd.L0(2131747330, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.T = L02;
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747316, null), new iv(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131751772, null), new org.telegram.ui.Components.z11(9));
                    showDialog(x1Var2);
                }
            } else {
                return;
            }
        }
        U4();
        if (this.f35794e0 != null) {
            int i15 = 0;
            while (true) {
                zx[] zxVarArr2 = this.f35794e0;
                if (i15 >= zxVarArr2.length) {
                    break;
                }
                zx zxVar2 = zxVarArr2[i15];
                if (zxVar2.f44245s == 0 && zxVar2.f44246w == 2 && zxVar2.f44241c.L0() == 0 && k4()) {
                    this.f35794e0[i15].f44241c.h1(1, (int) this.N);
                }
                if (i15 == 0) {
                    this.f35794e0[i15].d.getClass();
                } else {
                    this.f35794e0[i15].d.getClass();
                }
                i15++;
            }
        }
        W4();
        setBulletinDelegate(new z8(this, 4));
        if (this.f35856q3) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
        t5(0, false);
        l5(false, true);
        s5(false);
        C3();
        M3();
        if (this.f35900z0 != null && (zxVar = this.f35794e0[0]) != null && (lwVar = zxVar.d) != null) {
            int i16 = lwVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.ap[] apVarArr = getMessagesController().M;
                if (i16 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.ap apVar = apVarArr[c10];
                if (apVar != null) {
                    this.f35900z0.h(apVar.f14656o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if (org.telegram.messenger.tz.o() <= 0) {
            boolean z11 = org.telegram.messenger.v2.f18448a;
        } else if (this.Y3 && this.Z3 == null) {
            Q4(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f35801f1.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            x3();
            g5();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.t0 t0Var;
        ay ayVar;
        xw xwVar = this.F3;
        if (xwVar != null && xwVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f35872t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f33391x0.c(false);
                }
            }
        }
        if (!z10 && (ayVar = this.X2) != null) {
            ayVar.removeSelfFromStack();
        }
        M3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        xw xwVar = this.F3;
        if (xwVar != null && xwVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            bi.t0 t0Var = this.K0;
            if (t0Var != null && t0Var.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        M3();
    }

    public final boolean p4() {
        if (this.W2 == 1) {
            return true;
        }
        return false;
    }

    public final void p5(boolean z10) {
        boolean z11;
        if (this.f35830l0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().G;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                if (jjVar.F0() != null && jjVar.F0().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().H;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj2;
            if (jjVar2.F0() != null && jjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().A3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            M4(true);
            return;
        }
        this.Z3 = null;
        this.Y3 = false;
        M4(false);
        Q4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        boolean presentFragment = super.presentFragment(k2Var);
        if (presentFragment && this.f35794e0 != null) {
            int i10 = 0;
            while (true) {
                zx[] zxVarArr = this.f35794e0;
                if (i10 >= zxVarArr.length) {
                    break;
                }
                zxVarArr[i10].d.getClass();
                i10++;
            }
        }
        vh.p2 p2Var = this.f35848p0;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.f35853q0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        org.telegram.ui.Components.wb.e();
        return presentFragment;
    }

    public final boolean q4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
        if (!org.telegram.messenger.h20.u(Z1)) {
            return false;
        }
        ArrayList l4 = org.telegram.messenger.vp.r1(this.currentAccount).f18891r7.l(-Z1.f19942id);
        if ((l4 != null && !l4.isEmpty()) || !org.telegram.messenger.vp.r1(this.currentAccount).f18891r7.e(-Z1.f19942id)) {
            return false;
        }
        return true;
    }

    public final void q5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.d5 d5Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        uw uwVar = this.E0;
        org.telegram.ui.Components.d5 d5Var2 = null;
        if (uwVar != null && (d5Var = uwVar.f49196a0) != null && uwVar.f49215q0 != null) {
            Long h = org.telegram.messenger.h20.h(user);
            if (h != null) {
                d5Var.j(h.longValue(), z10);
                d5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.vp.r1(uwVar.f49203f);
                    if (org.telegram.messenger.vp.A2(user)) {
                        if (uwVar.N0 == null) {
                            uwVar.N0 = uwVar.getContext().getResources().getDrawable(2131232306).mutate();
                            uwVar.N0 = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), uwVar.N0);
                        }
                        Drawable drawable = uwVar.N0;
                        int i10 = org.telegram.ui.ActionBar.t6.ni;
                        ay ayVar = uwVar.f49202e0;
                        if (ayVar != null) {
                            p6Var = ayVar.getResourceProvider();
                        } else {
                            p6Var = null;
                        }
                        org.telegram.ui.ActionBar.a7.y(uwVar, drawable, i10, p6Var, PorterDuff.Mode.MULTIPLY);
                        d5Var.g(uwVar.N0, z10);
                        d5Var.m(false, z10);
                    }
                }
                d5Var.g(null, z10);
                d5Var.m(false, z10);
            }
            d5Var.k(Integer.valueOf(uwVar.f(org.telegram.ui.ActionBar.t6.ni)));
            uwVar.W.invalidate();
        }
        if (this.D3 != null && this.actionBar != null) {
            Long h10 = org.telegram.messenger.h20.h(user);
            this.B3 = null;
            if (h10 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.D3.j(h10.longValue(), z10);
                this.D3.m(z11, z10);
                if (z11) {
                    this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new hv(this, 1));
                i31.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.vp.r1(this.currentAccount);
                    if (org.telegram.messenger.vp.A2(user)) {
                        if (this.K3 == null) {
                            this.K3 = getParentActivity().getResources().getDrawable(2131232306).mutate();
                            this.K3 = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.K3);
                        }
                        Drawable drawable2 = this.K3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
                        this.f35890w4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.D3.g(this.K3, z10);
                        this.D3.m(false, z10);
                        this.actionBar.setRightDrawableOnClick(new hv(this, 2));
                        i31.t(this.currentAccount);
                    }
                }
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.d5 d5Var3 = this.D3;
            int i11 = org.telegram.ui.ActionBar.t6.ni;
            d5Var3.k(Integer.valueOf(getThemedColor(i11)));
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.setColor(getThemedColor(i11));
            }
            zw zwVar = this.M0;
            if (zwVar != null && (zwVar.getContentView() instanceof i31)) {
                org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
                i31 i31Var = (i31) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.d5 d5Var4 = this.D3;
                    if (rightDrawable == d5Var4) {
                        d5Var2 = d5Var4;
                    }
                }
                i31Var.y(d5Var2, titleTextView);
            }
        }
    }

    public final boolean r3(long j10, View view) {
        if (this.f35831l2 && getMessagesController().s2(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.k6) {
                ((org.telegram.ui.Cells.k6) view).y(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.k6) {
            ((org.telegram.ui.Cells.k6) view).y(true, true);
        }
        return true;
    }

    public final boolean r4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f35794e0[0].f44245s;
        org.telegram.messenger.ap apVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            org.telegram.messenger.ap[] apVarArr = getMessagesController().M;
            if (this.f35794e0[0].f44245s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            apVar = apVarArr[c10];
        }
        if (apVar != null) {
            if (apVar.f14651j.indexOfKey(dialog.f19797id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void r5() {
        vh.p2 p2Var;
        boolean T4 = getMessagesController().T4();
        if (this.N3 != T4) {
            j5();
            if (!this.N3 && T4 && (p2Var = this.f35848p0) != null) {
                p2Var.u();
            }
            this.N3 = T4;
        }
        org.telegram.ui.Components.f10 f10Var = this.f35870t0;
        if (f10Var == null) {
            return;
        }
        if (this.R0 == 10) {
            f10Var.setImageResource(2131231195);
            this.f35870t0.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
            return;
        }
        f10Var.setImageResource(2131231107);
        this.f35870t0.setContentDescription(org.telegram.messenger.cd.L0(2131748287, null));
    }

    public final void s3(zf.e0 e0Var) {
        kx kxVar;
        if (this.f35856q3 && (kxVar = this.C0) != null) {
            ArrayList arrayList = kxVar.C0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (e0Var.b((zf.e0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(e0Var);
            px pxVar = this.X;
            ArrayList arrayList2 = pxVar.F;
            arrayList2.add(e0Var);
            pxVar.I = arrayList2.size() - 1;
            pxVar.e();
            this.X.f26588r.getText().clear();
            i5(true, null, null, false, true);
        }
    }

    public final boolean s4() {
        if (this.C2 == null && this.f35840n2 == null) {
            return true;
        }
        return false;
    }

    public final void s5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        th.e5 i42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            xw xwVar = this.F3;
            if ((xwVar == null || !xwVar.c()) && !this.f35856q3 && (lVar = this.actionBar) != null && !lVar.u() && !this.f35831l2) {
                vh.o8 o8Var = vh.o8.F2;
                int i11 = 0;
                if ((o8Var != null && o8Var.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!p4() && i4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (p4()) {
                    z12 = !i4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (i42 = i4()).f48908g) != null && arrayList.size() > 0) || i42.J())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = i4().I();
                }
                this.L = z11;
                boolean z15 = this.G0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.G0 = z13;
                if (z12 || z13) {
                    uw uwVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    uwVar.p(z10, z14);
                }
                boolean z16 = this.G0;
                int i12 = 8;
                float f11 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.G0 && !isInPreviewMode()) {
                            this.E0.setVisibility(0);
                        }
                        float f12 = this.H0;
                        if (this.G0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                        this.J = ofFloat;
                        ofFloat.addUpdateListener(new cj(1, this));
                        this.J.addListener(new org.telegram.ui.Components.voip.h2(this, 6));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                        this.J.start();
                    } else {
                        uw uwVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        uwVar2.setVisibility(i10);
                        if (this.G0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        this.H0 = f7;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.M) {
                    this.M = z12;
                    if (z12) {
                        this.E0.l(false, 1.0f);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.E0.setVisibility(0);
                        float f13 = -this.N;
                        if (!z12) {
                            f11 = e4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new jx(this, f13, z12, f11));
                        this.I.addListener(new dx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    uw uwVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    uwVar3.setVisibility(i12);
                    if (!z12) {
                        N4(0.0f);
                    } else {
                        this.y3 = -org.telegram.messenger.i0.L(81.0f);
                        N4(-e4());
                    }
                    while (true) {
                        zx[] zxVarArr = this.f35794e0;
                        if (i11 >= zxVarArr.length) {
                            break;
                        }
                        zx zxVar = zxVarArr[i11];
                        if (zxVar != null) {
                            zxVar.f44239a.requestLayout();
                        }
                        i11++;
                    }
                    View view2 = this.fragmentView;
                    if (view2 != null) {
                        view2.requestLayout();
                        this.fragmentView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        uw uwVar = this.E0;
        if (uwVar != null) {
            if (this.G0 && !z10) {
                uwVar.setVisibility(0);
            } else {
                uwVar.setVisibility(8);
            }
        }
        k5(true);
        f5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && ji0.J0(parentActivity)) {
                if (z10) {
                    showDialog(new ji0(parentActivity, !w7.c6.a(), new vv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().U && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(parentActivity, new lv(this, 1)).f20134a;
                    this.T1 = x1Var;
                    showDialog(x1Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i10 <= 28 || org.telegram.messenger.v2.f18449b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.A0) {
                    this.A0 = false;
                    U4();
                    return;
                }
                return;
            }
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void t5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.t5(int, boolean):void");
    }

    @Override
    public final void u() {
        I4(true, true);
    }

    public final void u3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.sp0 sp0Var = new org.telegram.ui.Components.sp0(getParentActivity(), getResourceProvider());
                this.G2 = sp0Var;
                sp0Var.setLayoutClickListener(new hv(this, 0));
                this.G2.setOnModeChangeListener(new iv(this, 0));
                ow owVar = this.B1;
                org.telegram.ui.Components.sp0 sp0Var2 = this.G2;
                if (sp0Var2 == null) {
                    owVar.getClass();
                } else {
                    owVar.G1 = sp0Var2;
                    owVar.addView(sp0Var2, 0, w7.b6.e(-1, 48, 51));
                    owVar.f23715g3 = false;
                    owVar.I();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (l4()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.sp0 sp0Var3 = this.G2;
                    sp0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        sp0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.sp0 sp0Var4 = this.G2;
                        sp0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            sp0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            ow owVar2 = this.B1;
            if (l4()) {
                i10 = 2131754454;
            } else {
                i10 = 2131745480;
            }
            owVar2.setOverrideHint(org.telegram.messenger.cd.L0(i10, null));
            G3();
            if (this.G2.getMode() != 0) {
                this.B1.v1(false, false);
            }
            o5();
        }
    }

    public final void u4(long j10) {
        char c10;
        long j11 = j10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().f18940x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                u4(((TLRPC.Dialog) obj).f19797id);
            }
            return;
        }
        int i11 = this.f35794e0[0].f44245s;
        org.telegram.messenger.ap apVar = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            org.telegram.messenger.ap[] apVarArr = getMessagesController().M;
            if (this.f35794e0[0].f44245s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            apVar = apVarArr[c10];
        }
        int i12 = -1;
        if (apVar != null) {
            int i13 = apVar.f14649g;
            int i14 = org.telegram.messenger.vp.D8;
            if ((i13 & 64) != 0 && !apVar.a(this.currentAccount, dialog)) {
                L4(true, true);
                y3();
                if (this.R1 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.R1.size()) {
                            break;
                        } else if (((TLRPC.Dialog) this.R1.get(i15)).f19797id == j11) {
                            i12 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i12 < 0) {
                        L4(false, false);
                    }
                }
            }
        }
        int i16 = i12;
        if (getMessagesController().s2(j11) || getMessagesController().y2(j11)) {
            org.telegram.messenger.vp messagesController = getMessagesController();
            org.telegram.messenger.hs messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.vl vlVar = new org.telegram.messenger.vl(messagesController, j11);
            org.telegram.messenger.r5 r5Var = messagesStorage.f15938a;
            org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j11, vlVar, 5);
            j11 = j11;
            r5Var.c(d4Var);
        }
        getMessagesController().l3(j11, 0L);
        org.telegram.messenger.vp messagesController2 = getMessagesController();
        int i17 = dialog.top_message;
        messagesController2.h3(j11, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i16 >= 0) {
            this.R1.remove(i16);
            this.f35794e0[0].f44248y.D();
            this.f35794e0[0].q(true);
        }
    }

    public final boolean u5(long j10) {
        TLRPC.Chat L0;
        ow owVar;
        if ((this.S0 <= 1 && ((owVar = this.B1) == null || owVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !org.telegram.messenger.o5.z(j10) || (L0 = getMessagesController().L0(Long.valueOf(-j10))) == null || org.telegram.messenger.w3.N(L0) || !L0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131745328, null), org.telegram.messenger.cd.L0(2131745320, null), null);
        return false;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            N3();
            P3();
            S3();
            F3();
            Q3();
            px pxVar = this.X;
            fe.b bVar = this.f35777b;
            pxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = w7.n7.a(bVar.e);
            org.telegram.ui.Components.g9 g9Var = this.f35781b3;
            if (g9Var != null) {
                g9Var.setScaleX(a2);
                this.f35781b3.setScaleY(a2);
                this.f35781b3.setAlpha(a2);
                org.telegram.ui.Components.g9 g9Var2 = this.f35781b3;
                if (a2 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g9Var2.setVisibility(i12);
            }
            if (this.f35880v0 != null) {
                float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, a2);
                this.f35880v0.setScaleX(T1);
                this.f35880v0.setScaleY(T1);
                this.f35880v0.setAlpha(a2);
                vh.d dVar = this.f35880v0;
                int i14 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f35886w0.setAlpha(a2);
                bh.i iVar = this.f35886w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                iVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            N3();
            P3();
        } else if (i10 == 3) {
            L3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            K3();
        } else if (i10 == 6) {
            N3();
            P3();
        } else if (i10 == 7) {
            G3();
        } else if (i10 == 8) {
            F3();
            Q3();
        } else if (i10 == 9) {
            Q3();
        }
    }

    public final int v3() {
        if (this.B1 != null) {
            return (int) (this.f35898y1.getInputBubbleHeight() + this.f35885w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(2.0f));
        } else if (this.Y2 != 0) {
            return org.telegram.messenger.i0.L(72.0f) + this.f35804f4;
        } else {
            return this.f35804f4 + this.f35814h4;
        }
    }

    public final boolean v4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.v4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final boolean w3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 < arrayList.size()) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
                if (L0 != null && !org.telegram.messenger.w3.l(L0)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean w4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user != null && !org.telegram.messenger.h20.z(user) && !org.telegram.messenger.h20.x(user)) {
            Boolean bool = tL_requestPeerTypeUser.bot;
            if (bool == null || bool.booleanValue() == user.bot) {
                Boolean bool2 = tL_requestPeerTypeUser.premium;
                if (bool2 == null || bool2.booleanValue() == user.premium) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void x3() {
        int themedColor;
        org.telegram.ui.Components.cg0 cg0Var;
        kw kwVar;
        org.telegram.ui.Components.zm0 zm0Var;
        w71 w71Var;
        kx kxVar = this.C0;
        if (kxVar != null && (zm0Var = kxVar.f26451d0) != null && (w71Var = zm0Var.f55694k0) != null) {
            int childCount = w71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = w71Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q4) {
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) childAt;
                    org.telegram.ui.Components.r8 r8Var = q4Var.f22823c;
                    int i11 = q4Var.h;
                    if (org.telegram.messenger.o5.E(q4Var.f22824f)) {
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(q4Var.f22824f));
                        q4Var.e = Z1;
                        r8Var.r(Z1);
                    } else {
                        r8Var.q(org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-q4Var.f22824f)));
                        q4Var.e = null;
                    }
                    q4Var.c(true);
                }
            }
        }
        if (this.f35794e0 != null) {
            int i12 = 0;
            while (true) {
                zx[] zxVarArr = this.f35794e0;
                if (i12 >= zxVarArr.length) {
                    break;
                }
                zx zxVar = zxVarArr[i12];
                if (zxVar != null && (kwVar = zxVar.f44243n) != null) {
                    kwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.F(getThemedColor(org.telegram.ui.ActionBar.t6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.t6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.D3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
            Drawable drawable = this.K3;
            if (drawable != null && themedColor2 != this.f35890w4) {
                this.f35890w4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.d5 d5Var = this.D3;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        if (d3Var != null) {
            org.telegram.ui.ActionBar.t6.H1(d3Var.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false), true);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        if (t0Var != null) {
            t0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21261v8));
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.updateColors();
        }
        qx qxVar = this.f35900z0;
        if (qxVar != null) {
            vg.f fVar = qxVar.f30734y0;
            if (fVar != null) {
                fVar.updateColors();
            }
            qxVar.invalidate();
        }
        zf.g0 g0Var = this.f35778b0;
        if (g0Var != null) {
            g0Var.updateColors();
        }
        kx kxVar2 = this.C0;
        if (kxVar2 != null && (cg0Var = kxVar2.f26464r0) != null) {
            cg0Var.c();
        }
        org.telegram.ui.Components.v71 v71Var = this.f35773a0;
        if (v71Var != null) {
            v71Var.updateColors();
        }
        q01 q01Var = this.Z;
        if (q01Var != null) {
            q01Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o10);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o10));
            }
        }
        org.telegram.ui.Components.f10 f10Var = this.f35870t0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
        org.telegram.ui.Components.f10 f10Var2 = this.f35875u0;
        if (f10Var2 != null) {
            f10Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.t6.f20929d6;
        this.f35836m4.a(getThemedColor(i13));
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            zrVar.updateColors();
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        }
        mw mwVar = this.H1;
        if (mwVar != null) {
            mwVar.updateColors();
        }
        mw mwVar2 = this.F1;
        if (mwVar2 != null) {
            mwVar2.updateColors();
        }
        m5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        uw uwVar = this.E0;
        if (uwVar != null) {
            uwVar.o();
        }
        if (this.C3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ul)) != this.f35884v4) {
            this.f35884v4 = themedColor;
            this.C3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        px pxVar = this.X;
        if (pxVar != null) {
            pxVar.updateColors();
        }
    }

    public final void x4(View view) {
        boolean z10;
        int i10;
        int i11;
        String str;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(getParentActivity(), false, 1, null);
        if (getMessagesStorage().L != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 2131232214;
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.tz.f18176q1) {
            i11 = 2131230998;
        } else {
            i11 = 2131231002;
        }
        int[] iArr = {i10, i11};
        if (z10) {
            str = org.telegram.messenger.cd.L0(2131748697, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.tz.f18176q1) {
            i12 = 2131747262;
        } else {
            i12 = 2131749333;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.cd.L0(i12, null)};
        l4 l4Var = new l4(this, 1);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = l4Var;
        showDialog(h);
    }

    public final void y3() {
        org.telegram.messenger.i0.h3(new ew(this, 0), 300L);
    }

    public final void y4(android.view.View r27, int r28, s4.g0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.y4(android.view.View, int, s4.g0):void");
    }

    public final boolean z3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f35812h2 == null && this.f35867s2) {
            if (org.telegram.messenger.o5.z(j10)) {
                long j11 = -j10;
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j11));
                if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                    if (!this.f35855q2) {
                        TLRPC.Chat L02 = org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(j11));
                        if ((org.telegram.messenger.w3.n(L02) || L02.megagroup) && (i10 = this.T0) != 2 && i10 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L03 = org.telegram.messenger.cd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L03;
                    int i12 = this.T0;
                    if (i12 == 3) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131744116, null);
                    } else if (i12 == 2) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131746602, null);
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752440, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                    showDialog(x1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.o5.C(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String L04 = org.telegram.messenger.cd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = L04;
                    int i13 = this.T0;
                    if (i13 == 3) {
                        x1Var2.T = org.telegram.messenger.cd.L0(2131744115, null);
                    } else if (i13 != 0) {
                        x1Var2.T = org.telegram.messenger.cd.L0(2131747191, null);
                    } else {
                        x1Var2.T = org.telegram.messenger.cd.L0(2131749114, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                    showDialog(x1Var2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean z4(View view, int i10, float f7, org.telegram.ui.Components.sk0 sk0Var) {
        org.telegram.ui.Components.zm0 zm0Var;
        long j10;
        org.telegram.ui.Components.zm0 zm0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.d3) && sk0Var.d(i10) != 21) {
            if (!this.actionBar.u() && !org.telegram.messenger.i0.Q1() && !this.f35831l2 && (view instanceof org.telegram.ui.Cells.v2)) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (!getMessagesController().s2(v2Var.getDialogId()) && !this.F3.c() && v2Var.Z(f7)) {
                    return S4(v2Var);
                }
            }
            xw xwVar = this.F3;
            if (xwVar == null || !xwVar.c()) {
                kx kxVar = this.C0;
                boolean z10 = true;
                if (kxVar != null && sk0Var == (zm0Var2 = kxVar.f26451d0)) {
                    Object I = zm0Var2.I(i10);
                    if (!this.C0.f26451d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String L0 = org.telegram.messenger.cd.L0(2131752054, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleChatAlertText", null, 2131752053, gg.e.i(this.currentAccount, chat, false));
                            } else {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.f19793id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f19942id == getUserConfig().f15165n) {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.cd.L0(2131745918, null));
                            } else {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f19942id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            F = org.telegram.messenger.o5.F(encryptedChat.f19801id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752055, null), new m4.x0(this, F, 6));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                kx kxVar2 = this.C0;
                if (kxVar2 != null && sk0Var == (zm0Var = kxVar2.f26451d0)) {
                    if (this.f35831l2) {
                        y4(view, i10, sk0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k6) && !zm0Var.N(i10)) {
                        j10 = ((org.telegram.ui.Cells.k6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        X4(j10, view);
                        return true;
                    }
                } else {
                    Object J = ((zf.m) sk0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f35831l2) {
                            if ((this.R0 == 3 || T3()) && u5(dialog.f19797id)) {
                                if (this.R0 == 1 && T3() && this.f35834m2 && getMessagesController().s2(dialog.f19797id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f19797id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    pb1 pb1Var = new pb1(bundle);
                                    pb1Var.L0 = this;
                                    presentFragment(pb1Var);
                                    return false;
                                }
                                r3(dialog.f19797id, view);
                                n5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            x4(view);
                            return false;
                        } else if (!this.actionBar.u() || !r4(dialog)) {
                            X4(dialog.f19797id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
