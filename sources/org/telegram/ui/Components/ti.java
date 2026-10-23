package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hi1;
public class ti extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a3, ne.d {
    public static final int U2 = 0;
    public final LongSparseArray A0;
    public final wh A1;
    public boolean A2;
    public li B0;
    public final xh B1;
    public boolean B2;
    public li C0;
    public final s4.b0 C1;
    public File C2;
    public final dh.d D0;
    public final qi D1;
    public double[] D2;
    public final i0 E;
    public final dh.d E0;
    public boolean E1;
    public boolean E2;
    public boolean F;
    public final ig.j F0;
    public final RadialProgressView F1;
    public boolean F2;
    public boolean G;
    public final wh G0;
    public boolean G1;
    public boolean G2;
    public boolean H;
    public final zh H0;
    public final q6 H1;
    public ei.i H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final bh.f I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final gh.d J2;
    public int K;
    public final wh K0;
    public MessageObject K1;
    public final gh.d K2;
    public int L;
    public final ei L0;
    public boolean L1;
    public final gh.c L2;
    public boolean M;
    public final TextPaint M0;
    public final int M1;
    public final bh.b M2;
    public boolean N;
    public final RectF N0;
    public boolean N1;
    public final bh.b N2;
    public boolean O;
    public final Paint O0;
    public boolean O1;
    public final kh O2;
    public boolean P;
    public AnimatorSet P0;
    public boolean P1;
    public final ArrayList P2;
    public c50 Q;
    public long Q0;
    public boolean Q1;
    public final RectF Q2;
    public boolean R;
    public final ah.v R0;
    public boolean R1;
    public final RectF R2;
    public final pe0 S;
    public final ci S0;
    public boolean S1;
    public final RectF S2;
    public go T;
    public int T0;
    public boolean T1;
    public final ArrayList T2;
    public e50 U;
    public zt U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public ek X;
    public boolean X0;
    public boolean X1;
    public cj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean f30713a0;
    public final z7 f30714a1;
    public ValueAnimator a2;
    public final ne.b f30715b;
    public final bh.c f30716b0;
    public AnimatorSet f30717b1;
    public int f30718b2;
    public final ne.b f30719c;
    public boolean f30720c0;
    public AnimatorSet f30721c1;
    public ri f30722c2;
    public final ne.b d;
    public float f30723d0;
    public final org.telegram.ui.ActionBar.u0 f30724d1;
    public pn f30725d2;
    public final ne.b e;
    public final hi f30726e0;
    public final ei.u f30727e1;
    public final int[] f30728e2;
    public final ne.b f30729f;
    public final org.telegram.ui.ActionBar.o2 f30730f0;
    public final org.telegram.ui.ActionBar.u0 f30731f1;
    public int f30732f2;
    public final boolean f30733g0;
    public ei.x3 f30734g1;
    public float f30735g2;
    public final ne.b h;
    public mf f30736h0;
    public final org.telegram.ui.ActionBar.u0 f30737h1;
    public float f30738h2;
    public boolean f30739i0;
    public final di.n f30740i1;
    public boolean f30741i2;
    public final ChatAttachAlertPhotoLayout f30742j0;
    public float f30743j1;
    public float f30744j2;
    public xj f30745k0;
    public float f30746k1;
    public final boolean f30747k2;
    public fj f30748l0;
    public final wh l1;
    public boolean f30749l2;
    public fo m0;
    public final TextView f30750m1;
    public final ArrayList f30751m2;
    public final ne.l f30752n;
    public fo f30753n0;
    public final org.telegram.ui.ActionBar.u0 f30754n1;
    public final Rect f30755n2;
    public rl f30756o0;
    public final LinearLayout f30757o1;
    public float f30758o2;
    public nk f30759p0;
    public final ImageView f30760p1;
    public boolean f30761p2;
    public bn f30762q0;
    public final LinearLayout f30763q1;
    public int f30764q2;
    public org.telegram.ui.qn f30765r;
    public ij f30766r0;
    public final TextView f30767r1;
    public final hi f30768r2;
    public final q6 f30769s;
    public ig.h0 f30770s0;
    public float f30771s1;
    public o1.k f30772s2;
    public ok f30773t0;
    public boolean f30774t1;
    public AnimatorSet f30775t2;
    public ok f30776u0;
    public final ji f30777u1;
    public int f30778u2;
    public final q6 v;
    public ki.q f30779v0;
    public boolean f30780v1;
    public int f30781v2;
    public final ImageView f30782w;
    public al f30783w0;
    public Object f30784w1;
    public boolean f30785w2;
    public final i0 f30786x;
    public boolean f30787x0;
    public boolean f30788x1;
    public boolean f30789x2;
    public final ImageView f30790y;
    public float f30791y0;
    public final kh.f f30792y1;
    public boolean f30793y2;
    public final li[] f30794z0;
    public final yh f30795z1;
    public ml f30796z2;

    public ti(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        di.n nVar;
        ne.l lVar;
        int i10;
        float f7;
        bs bsVar = bs.h;
        this.f30715b = new ne.b(0, this, bsVar, 380L, false);
        this.f30719c = new ne.b(1, this, bsVar, 380L, false);
        this.d = new ne.b(2, this, bsVar, 380L, false);
        this.e = new ne.b(3, this, bsVar, 380L, false);
        this.f30729f = new ne.b(4, this, bsVar, 380L, true);
        this.h = new ne.b(5, this, bsVar, 320L, false);
        ne.l lVar2 = new ne.l(new dh(this, 2), bsVar, 380L);
        this.f30752n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f30723d0 = 0.0f;
        this.f30726e0 = new hi(this, 0);
        this.f30739i0 = false;
        li[] liVarArr = new li[12];
        this.f30794z0 = liVarArr;
        this.A0 = new LongSparseArray();
        this.J0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.M0 = textPaint;
        this.N0 = new RectF();
        this.O0 = new Paint(1);
        this.X0 = true;
        this.Y0 = 1.0f;
        this.E1 = false;
        this.G1 = false;
        int i11 = UserConfig.selectedAccount;
        this.M1 = i11;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.R1 = true;
        this.S1 = true;
        this.T1 = true;
        this.V1 = -1;
        this.W1 = true;
        this.f30718b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f30728e2 = new int[2];
        new Paint(1);
        this.f30749l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f30751m2 = arrayList;
        Rect rect = new Rect();
        this.f30755n2 = rect;
        this.f30768r2 = new hi(this, 1);
        this.f30789x2 = true;
        this.f30793y2 = false;
        this.F2 = false;
        this.G2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.P2 = arrayList2;
        RectF rectF = new RectF();
        this.Q2 = rectF;
        RectF rectF2 = new RectF();
        this.R2 = rectF2;
        RectF rectF3 = new RectF();
        this.S2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.T2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        gh.c cVar = new gh.c();
        this.L2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.I2 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.K2 = dVar;
            dVar.k(new le.b(this, 8));
            gh.d dVar2 = new gh.d(null);
            this.J2 = dVar2;
            dVar2.k(new k2.w0(this, 11));
            bh.b bVar = new bh.b(dVar);
            this.M2 = bVar;
            bVar.f4367i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.N2 = bVar2;
            bVar2.f4367i = LiteMode.isEnabled(262144);
        } else {
            this.I2 = null;
            this.J2 = null;
            this.K2 = null;
            this.M2 = new bh.b(cVar);
            this.N2 = new bh.b(cVar);
        }
        bh.b bVar3 = new bh.b(cVar);
        this.O2 = new kh(this, 0);
        this.f30747k2 = z10;
        this.f30733g0 = (o2Var instanceof org.telegram.ui.sn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30730f0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ji jiVar = new ji(this, context);
        this.f30777u1 = jiVar;
        jiVar.setDelegate(new ki(this));
        this.containerView = jiVar;
        jiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        z7 z7Var = new z7(this, context, g6Var, 1);
        this.f30714a1 = z7Var;
        z7Var.S0 = true;
        z7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i13 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.m(z7Var, 1, i13, g6Var);
        int i14 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.ActionBar.r6.m(z7Var, 3, i14, g6Var);
        org.telegram.ui.ActionBar.r6.m(z7Var, 5, i13, g6Var);
        z7Var.setOccupyStatusBar(true);
        z7Var.setAlpha(0.0f);
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 11));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
        this.f30724d1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new dh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 6, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        u0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(u0Var2, g02, null, O, g6Var);
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
        this.f30731f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ei.u uVar = new ei.u();
        this.f30727e1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 6, -1);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        u0Var3.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(u0Var3, g03, null, O2, g6Var);
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        di.n nVar2 = new di.n(this, context);
        org.telegram.ui.ActionBar.r6.W(nVar2, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        nVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        w7.b6.a(nVar2);
        this.f30740i1 = nVar2;
        e2();
        if (o2Var != null) {
            u0Var = u0Var3;
            lVar = lVar2;
            nVar = nVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
            this.f30737h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i10 = -1;
            org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 6, -1);
            org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i14);
            u0Var4.setBackground(g04);
            org.telegram.ui.ActionBar.r6.k(u0Var4, g04, null, O3, g6Var);
            u0Var4.setOnClickListener(new ci.g2(5, this, z11));
        } else {
            u0Var = u0Var3;
            nVar = nVar2;
            lVar = lVar2;
            i10 = -1;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
        this.f30754n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 3, i10);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i14);
        u0Var5.setBackground(g05);
        org.telegram.ui.ActionBar.r6.k(u0Var5, g05, null, O4, g6Var);
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ti f27320b;

            {
                this.f27320b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.sn snVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f27320b;
                        zh zhVar = tiVar.H0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), g6Var);
                            e0Var.m0(zhVar.getText());
                            e0Var.f25773j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = tiVar.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ci ciVar = tiVar.S0;
                                            ciVar.setText(charSequence);
                                            ciVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            if (tiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.f25775l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25776n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f27320b;
                        ci ciVar = tiVar2.S0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), g6Var);
                            e0Var2.m0(ciVar.getText());
                            e0Var2.f25773j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = tiVar2.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ci ciVar2 = tiVar2.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            if (tiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.f25775l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25776n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f27320b;
                        tiVar3.f30754n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = tiVar3.f30730f0;
                        u12.M2(null, o2Var2, g6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i15 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i15;
                        u13.f33657n = z15;
                        if (!tiVar3.f30722c2.u()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i16 = point.x;
                        int i17 = point.y;
                        if (i16 > 1080 || i17 > 1080) {
                            float min = Math.min(i16, i17) / 1080.0f;
                            i16 = (int) (i16 * min);
                            i17 = (int) (i17 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer u14 = PhotoViewer.u1();
                        vh vhVar = new vh(tiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            snVar = (org.telegram.ui.sn) o2Var2;
                        } else {
                            snVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, vhVar, snVar);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Z0(null, null, true, tiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        wh whVar = new wh(this, context, 0);
        this.l1 = whVar;
        whVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        whVar.setAlpha(0.0f);
        whVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30757o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f30750m1 = textView;
        org.telegram.messenger.v0.q(textView, i13, g6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f30760p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(imageView, mutate, i13, g6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        whVar.addView(linearLayout, w7.z5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30763q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.r6.z(imageView2, mutate2, i13, g6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f30767r1 = textView2;
        org.telegram.messenger.v0.q(textView2, i13, g6Var, 1, 16.0f);
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        whVar.addView(linearLayout2, w7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, g6Var);
        this.f30742j0 = chatAttachAlertPhotoLayout;
        liVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30792y1 = view;
        view.setup(bVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.z5.g());
        this.containerView.addView(whVar, w7.z5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ah.v vVar = new ah.v(context, 11);
        this.R0 = vVar;
        this.containerView.addView(vVar, w7.z5.e(-1, -2, 55));
        this.containerView.addView(z7Var, w7.z5.c(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f30737h1;
        if (u0Var6 != null) {
            this.containerView.addView(u0Var6, w7.z5.e(48, 48, 53));
        }
        whVar.addView(u0Var5, w7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(nVar, w7.z5.e(-2, 48, 53));
        wh whVar2 = new wh(this, context, 1);
        this.A1 = whVar2;
        xh xhVar = new xh(context, 0);
        this.B1 = xhVar;
        xhVar.setClipChildren(true);
        xhVar.setClipToPadding(false);
        qi qiVar = new qi(this, context);
        this.D1 = qiVar;
        xhVar.setAdapter(qiVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.C1 = b0Var;
        xhVar.setLayoutManager(b0Var);
        xhVar.setVerticalScrollBarEnabled(false);
        xhVar.setHorizontalScrollBarEnabled(false);
        xhVar.setItemAnimator(null);
        xhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.r6.m(xhVar, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        xhVar.f28727y2 = true;
        xhVar.setOverScrollMode(2);
        bh.b bVar4 = this.M2;
        ih.k kVar = new ih.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f4365f = kVar;
        bVar4.f4366g = viewGroup2;
        bh.b bVar5 = this.N2;
        ih.k kVar2 = new ih.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f4365f = kVar2;
        bVar5.f4366g = viewGroup3;
        ih.k kVar3 = new ih.k(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        bVar3.f4365f = kVar3;
        bVar3.f4366g = viewGroup4;
        yh yhVar = new yh(this, context, 0);
        this.f30795z1 = yhVar;
        bh.c cVar2 = new bh.c(bVar3.c(yhVar, null, false));
        this.f30716b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(yhVar, w7.z5.g());
        dh.d c10 = this.M2.c(whVar2, fh.c.f(g6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        whVar2.setBackground(c10);
        xhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        xhVar.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f52047a;
        xhVar.setOutlineProvider(new zf.i0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        xhVar.setImportantForAccessibility(1);
        whVar2.addView(xhVar, w7.z5.g());
        this.containerView.addView(whVar2, w7.z5.e(-1, 70, 81));
        xhVar.setOnItemClickListener(new ci.x4(9, this, g6Var));
        xhVar.setOnItemLongClickListener(new dh(this, 3));
        q6 q6Var = new q6(context, true, false, true);
        this.H1 = q6Var;
        q6Var.setVisibility(8);
        q6Var.setAlpha(0.0f);
        q6Var.setGravity(17);
        q6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        q6Var.setPadding(dp, 0, dp, 0);
        q6Var.setTextSize(AndroidUtilities.dp(f7));
        q6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        this.containerView.addView(q6Var, w7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.k6.f21588z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView3, i15, g6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        wh whVar3 = new wh(this, context, 2);
        this.G0 = whVar3;
        ig.j jVar = new ig.j(this, context);
        this.F0 = jVar;
        whVar3.addView(jVar, w7.z5.e(-1, -1, 119));
        dh.d c11 = this.N2.c(jiVar, fh.c.n(g6Var), false);
        this.D0 = c11;
        c11.f8029y = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.v.f8012g = 0.4f;
        c11.k();
        dh.d c12 = this.M2.c(jVar, fh.c.n(g6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        whVar3.setWillNotDraw(false);
        whVar3.setVisibility(4);
        whVar3.setAlpha(0.0f);
        this.containerView.addView(whVar3, w7.z5.e(-1, -2, 83));
        whVar3.setOnTouchListener(new di.d(13));
        q6 q6Var2 = new q6(context, false, false, false);
        this.f30769s = q6Var2;
        q6Var2.setAllowCancel(true);
        q6Var2.setScaleProperty(0.6f);
        q6Var2.setVisibility(8);
        q6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i16 = org.telegram.ui.ActionBar.k6.f21571y6;
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i16, g6Var);
        q6Var2.setTypeface(AndroidUtilities.bold());
        q6Var2.setGravity(17);
        jVar.addView(q6Var2, w7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30782w = imageView4;
        i0 i0Var = new i0(context);
        this.f30786x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i17 = org.telegram.ui.ActionBar.k6.Wk;
        org.telegram.ui.ActionBar.r6.t(imageView4, i17, g6Var, mode);
        int i18 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i18);
        imageView4.setBackground(g06);
        org.telegram.ui.ActionBar.r6.k(imageView4, g06, null, O5, g6Var);
        jVar.addView(imageView4, w7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ti f27320b;

            {
                this.f27320b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.sn snVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f27320b;
                        zh zhVar = tiVar.H0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), g6Var);
                            e0Var.m0(zhVar.getText());
                            e0Var.f25773j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = tiVar.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ci ciVar2 = tiVar.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            if (tiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.f25775l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25776n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f27320b;
                        ci ciVar = tiVar2.S0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), g6Var);
                            e0Var2.m0(ciVar.getText());
                            e0Var2.f25773j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = tiVar2.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ci ciVar2 = tiVar2.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            if (tiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.f25775l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25776n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f27320b;
                        tiVar3.f30754n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = tiVar3.f30730f0;
                        u12.M2(null, o2Var2, g6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i152 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i152;
                        u13.f33657n = z15;
                        if (!tiVar3.f30722c2.u()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i162 = point.x;
                        int i172 = point.y;
                        if (i162 > 1080 || i172 > 1080) {
                            float min = Math.min(i162, i172) / 1080.0f;
                            i162 = (int) (i162 * min);
                            i172 = (int) (i172 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i162, i172, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer u14 = PhotoViewer.u1();
                        vh vhVar = new vh(tiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            snVar = (org.telegram.ui.sn) o2Var2;
                        } else {
                            snVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, vhVar, snVar);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Z0(null, null, true, tiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        zh zhVar = new zh(this, context, jiVar, g6Var);
        this.H0 = zhVar;
        zhVar.J = true;
        zhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        zhVar.s();
        zhVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        zhVar.getEditText().addTextChangedListener(new bi(this, 0));
        jVar.addView(zhVar, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        whVar3.setClipChildren(false);
        zhVar.setClipChildren(false);
        vVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar.setWillNotDraw(false);
        ci ciVar = new ci(this, context, jiVar, g6Var);
        this.S0 = ciVar;
        ciVar.J = true;
        ciVar.getEditText().addTextChangedListener(new di(this, o2Var));
        ciVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        ciVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        ciVar.getEditText().setTextSize(1, 17.0f);
        ciVar.getEmojiButton().setLayoutParams(w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        ciVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar.addView(ciVar, w7.z5.e(-1, -2, 119));
        vVar.setAlpha(0.0f);
        vVar.setVisibility(8);
        zhVar.addView(imageView3, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        dh.d c13 = this.M2.c(vVar, fh.c.n(g6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        vVar.setBackground(c13);
        vVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        q6 q6Var3 = new q6(context, false, false, false);
        this.v = q6Var3;
        q6Var3.setScaleProperty(0.6f);
        q6Var3.setVisibility(8);
        q6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.r6.a0(q6Var3, i16, g6Var);
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setGravity(17);
        q6Var3.setAllowCancel(true);
        vVar.addView(q6Var3, w7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Xd, g6Var, mode2);
        ciVar.addView(imageView5, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30790y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView6, i17, g6Var, mode);
        org.telegram.ui.Cells.y g07 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.n6 O6 = org.telegram.ui.ActionBar.r6.O(i18);
        imageView6.setBackground(g07);
        org.telegram.ui.ActionBar.r6.k(imageView6, g07, null, O6, g6Var);
        vVar.addView(imageView6, w7.z5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ti f27320b;

            {
                this.f27320b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.sn snVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f27320b;
                        zh zhVar2 = tiVar.H0;
                        if (zhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), g6Var);
                            e0Var.m0(zhVar2.getText());
                            e0Var.f25773j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar22 = tiVar.H0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ci ciVar2 = tiVar.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            if (tiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.f25775l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25776n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f27320b;
                        ci ciVar2 = tiVar2.S0;
                        if (ciVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), g6Var);
                            e0Var2.m0(ciVar2.getText());
                            e0Var2.f25773j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar22 = tiVar2.H0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ci ciVar22 = tiVar2.S0;
                                            ciVar22.setText(charSequence);
                                            ciVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            if (tiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.f25775l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25776n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f27320b;
                        tiVar3.f30754n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = tiVar3.f30730f0;
                        u12.M2(null, o2Var2, g6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i152 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i152;
                        u13.f33657n = z15;
                        if (!tiVar3.f30722c2.u()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i162 = point.x;
                        int i172 = point.y;
                        if (i162 > 1080 || i172 > 1080) {
                            float min = Math.min(i162, i172) / 1080.0f;
                            i162 = (int) (i162 * min);
                            i172 = (int) (i172 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i162, i172, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer u14 = PhotoViewer.u1();
                        vh vhVar = new vh(tiVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            snVar = (org.telegram.ui.sn) o2Var2;
                        } else {
                            snVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, vhVar, snVar);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Z0(null, null, true, tiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        wh whVar4 = new wh(this, context, 3);
        this.K0 = whVar4;
        whVar4.setFocusable(true);
        whVar4.setFocusableInTouchMode(true);
        whVar4.setVisibility(4);
        whVar4.setScaleX(0.2f);
        whVar4.setScaleY(0.2f);
        whVar4.setAlpha(0.0f);
        whVar4.setClipChildren(false);
        whVar4.setClipToPadding(false);
        this.containerView.addView(whVar4, w7.z5.e(110, 50, 85));
        ei eiVar = new ei(R.drawable.send_plane_24, context, g6Var, this);
        this.L0 = eiVar;
        eiVar.setImportantForAccessibility(2);
        whVar4.addView(eiVar, w7.z5.e(-1, -1, 119));
        eiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        eiVar.I = dp2;
        eiVar.J = dp3;
        eiVar.M = AndroidUtilities.dp(7.0f);
        eiVar.N = AndroidUtilities.dp(6.0f);
        eiVar.f31458h0 = true;
        eiVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26953b;

            {
                this.f26953b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26953b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26953b;
                        boolean z14 = tiVar2.f30720c0;
                        if (!z14) {
                            tiVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26953b;
                        boolean z15 = tiVar3.f30720c0;
                        if (z15) {
                            tiVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26953b.F1();
                        return;
                    case 4:
                        this.f26953b.f30724d1.M(null, null);
                        return;
                    case 5:
                        ti.v(this.f26953b);
                        return;
                    case 6:
                        li liVar = this.f26953b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26953b.f30754n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26953b;
                        if (tiVar4.B0 != tiVar4.f30762q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.h2(z13);
                        return;
                }
            }
        });
        eiVar.setOnLongClickListener(new org.telegram.ui.zf(this, context, g6Var, o2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        yh yhVar2 = new yh(this, context, 1);
        yhVar2.setAlpha(0.0f);
        yhVar2.setScaleX(0.2f);
        yhVar2.setScaleY(0.2f);
        if (z10) {
            h1();
            this.navBarColorKey = -1;
        }
        tl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        bh.b bVar6 = this.M2;
        eh.e n10 = fh.c.n(g6Var);
        mm0 mm0Var = fastScroll.f30839p0;
        dh.d c14 = bVar6.c(mm0Var.f28685d1, n10, false);
        fastScroll.f30827e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f30827e0.q(AndroidUtilities.dp(24.0f));
        dh.d c15 = bVar6.c(mm0Var.f28685d1, n10, false);
        fastScroll.f30829f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f30829f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f30829f0.q(AndroidUtilities.dp(f7));
        pe0 pe0Var = new pe0(context);
        this.S = pe0Var;
        this.containerView.addView(pe0Var, w7.z5.c(-1.0f, -1));
        eh.e eVar = new eh.e(g6Var);
        eVar.e = new dh(this, 4);
        eVar.f8667c = new dh(this, 5);
        eVar.d = new dh(this, 6);
        eVar.f8666b = new dh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        z7Var.L(this.M2, eVar, false);
        lVar.h(1L, false);
    }

    public static void L1(li liVar) {
        if (liVar != null) {
            int i10 = org.telegram.ui.ActionBar.r6.f21817b;
            Object tag = liVar.getTag(R.id.theme_generation);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
                return;
            }
            liVar.setTag(R.id.theme_generation, Integer.valueOf(i10));
            try {
                org.telegram.ui.ActionBar.q6 N = org.telegram.ui.ActionBar.r6.N(true, 0, null);
                N.b(liVar);
                N.a();
                liVar.d();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void N(ti tiVar) {
        boolean z10;
        boolean q6;
        int i10;
        z7 z7Var = tiVar.f30714a1;
        kh.f fVar = tiVar.f30792y1;
        if (fVar != null && z7Var != null) {
            li liVar = tiVar.C0;
            if (liVar == null) {
                liVar = tiVar.B0;
            }
            int i11 = 0;
            if (liVar != null && (liVar instanceof al)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.g6 g6Var = tiVar.resourcesProvider;
            if (g6Var != null) {
                q6 = g6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (!z10 && z7Var.getVisibility() == 0) {
                if (q6) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i11 = (int) (z7Var.getAlpha() * i10);
            }
            fVar.setFadeTopAlpha(i11);
        }
    }

    public static void R(ti tiVar) {
        ei.i iVar = new ei.i(tiVar, tiVar.getContext(), tiVar.Z, LaunchActivity.R(), tiVar.resourcesProvider, 1);
        tiVar.H2 = iVar;
        iVar.p(new ki.t1(tiVar, 14));
        ViewGroup viewGroup = tiVar.containerView;
        viewGroup.addView(tiVar.H2, viewGroup.indexOfChild(tiVar.G0), w7.z5.e(-1, -1, 83));
        ei.i iVar2 = tiVar.H2;
        iVar2.getAdapter().f11949c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
        boolean z10 = true;
        if (o2Var instanceof org.telegram.ui.sn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            hg.j1 adapter = iVar2.getAdapter();
            snVar.i();
            TLRPC.Chat chat = snVar.e;
            adapter.getClass();
            adapter.f11960l0 = chat;
            iVar2.getAdapter().W(snVar.f41592l8);
            hg.j1 adapter2 = iVar2.getAdapter();
            if (snVar.e == null) {
                z10 = false;
            }
            adapter2.f11952e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f11952e0 = false;
        }
        iVar2.getAdapter().f11954f0 = false;
        tiVar.c2();
    }

    public static void m(ti tiVar, ValueAnimator valueAnimator) {
        tiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.e3 e3Var = tiVar.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public static void p(ti tiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.a3 a3Var) {
        tiVar.currentSheetAnimation = null;
        tiVar.f30772s2 = null;
        animationNotificationsLocker.unlock();
        tiVar.currentSheetAnimationType = 0;
        if (a3Var != null) {
            a3Var.onOpenAnimationEnd();
        }
        if (tiVar.useHardwareLayer) {
            tiVar.container.setLayerType(0, null);
        }
        if (tiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = tiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            tiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static boolean q(org.telegram.ui.Components.ti r45, android.content.Context r46, org.telegram.ui.ActionBar.g6 r47, org.telegram.ui.ActionBar.o2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.q(org.telegram.ui.Components.ti, android.content.Context, org.telegram.ui.ActionBar.g6, org.telegram.ui.ActionBar.o2, android.view.View):boolean");
    }

    public static void r(ti tiVar) {
        o1.k kVar = tiVar.f30772s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(tiVar.containerView, o1.h.f17605n, 0.0f);
        tiVar.f30772s2 = kVar2;
        kVar2.f17622u.a(1.5f);
        tiVar.f30772s2.f17622u.b(1500.0f);
        tiVar.f30772s2.h();
    }

    public static void s(ti tiVar, lg lgVar) {
        AnimatorSet animatorSet = tiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            lgVar.run();
        }
    }

    public static void t(ti tiVar, int i10) {
        tiVar.navBarColorKey = -1;
        tiVar.navBarColor = i10;
        tiVar.containerView.invalidate();
    }

    public static void u(ti tiVar) {
        tiVar.currentSheetAnimation = null;
        tiVar.currentSheetAnimationType = 0;
        tiVar.dismissInternal();
    }

    public static void v(ti tiVar) {
        int i10;
        if (tiVar.f30742j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30742j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24224s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i11 = 0; i11 < chatAttachAlertPhotoLayout.E.getChildCount(); i11++) {
                            View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.s5) {
                                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                if (s5Var.getPhotoEntry() == photoEntry) {
                                    s5Var.getImageView().invalidate();
                                }
                            }
                        }
                    }
                }
            }
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
            SharedConfig.photoLiveDefault = z10;
            edit.putBoolean("photoLiveDefault", z10).apply();
            chatAttachAlertPhotoLayout.v0();
        }
        tiVar.g2(true);
        org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30731f1;
        ei.x3 x3Var = tiVar.f30734g1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = new ei.x3(tiVar.getContext(), 1);
        tiVar.f30734g1 = x3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        x3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        tiVar.f30734g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tiVar.f30734g1.m(1.0f, -((tiVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        tiVar.f30734g1.setTranslationY(tiVar.f30724d1.getTranslationY());
        ei.x3 x3Var3 = tiVar.f30734g1;
        x3Var3.f10097l0 = new ee(3, tiVar, x3Var2);
        tiVar.containerView.addView(x3Var3, w7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        tiVar.f30734g1.u();
    }

    public static void w(ti tiVar, boolean z10, gh ghVar) {
        Integer num;
        tiVar.B0.v(1.0f);
        tiVar.C0.v(1.0f);
        tiVar.B0.l(tiVar.f30758o2);
        tiVar.C0.l(tiVar.f30758o2);
        tiVar.containerView.invalidate();
        z7 z7Var = tiVar.f30714a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        z7Var.setTag(num);
        ghVar.run();
    }

    public static void x(ti tiVar, org.telegram.ui.ActionBar.g6 g6Var, View view) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        xh xhVar = tiVar.B1;
        li[] liVarArr = tiVar.f30794z0;
        org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f30730f0;
        if (o2Var2 == null) {
            o2Var = LaunchActivity.R();
        } else {
            o2Var = o2Var2;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (view instanceof ni) {
                Activity parentActivity = o2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (tiVar.O1 || tiVar.P1 || !tiVar.f1()) {
                        if (!tiVar.O1 && !tiVar.P1) {
                            go goVar = new go(1, tiVar.getContext(), g6Var, tiVar);
                            tiVar.T = goVar;
                            tiVar.Y1(goVar);
                        }
                        tiVar.Y1(tiVar.f30742j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (tiVar.f30783w0 == null && (o2Var2 instanceof org.telegram.ui.sn)) {
                        TLRPC.User i11 = ((org.telegram.ui.sn) o2Var2).i();
                        if (y1(i11)) {
                            al alVar = new al(tiVar, tiVar.getContext(), tiVar.M1, i11, g6Var);
                            tiVar.f30783w0 = alVar;
                            liVarArr[11] = alVar;
                        }
                    }
                    li liVar = tiVar.f30783w0;
                    if (liVar != null) {
                        tiVar.Y1(liVar);
                    }
                } else if (i10 == 3) {
                    if (tiVar.Q1 || !tiVar.f1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        tiVar.H1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (tiVar.N1 || !tiVar.f1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        tiVar.K1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (tiVar.T1 || !tiVar.f1()) {
                        if (tiVar.T1 && tiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        tiVar.J1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((tiVar.T1 || !tiVar.f1()) && AndroidUtilities.isMapsInstalled(o2Var2)) {
                        if (!tiVar.T1) {
                            go goVar2 = new go(6, tiVar.getContext(), g6Var, tiVar);
                            tiVar.T = goVar2;
                            tiVar.Y1(goVar2);
                        } else {
                            if (tiVar.f30756o0 == null) {
                                Context context = tiVar.getContext();
                                if (tiVar.H || tiVar.U1) {
                                    z10 = false;
                                }
                                rl rlVar = new rl(tiVar, context, g6Var, z10);
                                tiVar.f30756o0 = rlVar;
                                liVarArr[5] = rlVar;
                                ml mlVar = tiVar.f30796z2;
                                if (mlVar != null) {
                                    rlVar.setDelegate(mlVar);
                                } else {
                                    rlVar.setDelegate(new dh(tiVar, 9));
                                }
                            }
                            tiVar.Y1(tiVar.f30756o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (tiVar.R1 || !tiVar.f1()) {
                        if (!tiVar.R1) {
                            go goVar3 = new go(9, tiVar.getContext(), g6Var, tiVar);
                            tiVar.T = goVar3;
                            tiVar.Y1(goVar3);
                        } else {
                            tiVar.a2(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (tiVar.f30770s0 == null) {
                        ig.h0 h0Var = new ig.h0(tiVar.getContext(), tiVar.resourcesProvider, tiVar);
                        tiVar.f30770s0 = h0Var;
                        liVarArr[7] = h0Var;
                        h0Var.setupBlurredSearchField(tiVar.M2);
                    }
                    tiVar.Y1(tiVar.f30770s0);
                } else if (i10 == 12) {
                    if (tiVar.S1 || !tiVar.f1()) {
                        if (!tiVar.S1) {
                            go goVar4 = new go(9, tiVar.getContext(), g6Var, tiVar);
                            tiVar.T = goVar4;
                            tiVar.Y1(goVar4);
                        } else {
                            if (tiVar.f30753n0 == null) {
                                fo foVar = new fo(tiVar, tiVar.getContext(), true, g6Var, null);
                                tiVar.f30753n0 = foVar;
                                liVarArr[1] = foVar;
                                foVar.setDelegate(new dh(tiVar, 10));
                            }
                            tiVar.Y1(tiVar.f30753n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (tiVar.f30776u0 == null) {
                        ok okVar = new ok(tiVar, tiVar.getContext(), g6Var, true);
                        tiVar.f30776u0 = okVar;
                        liVarArr[8] = okVar;
                        okVar.setDelegate(tiVar.f30725d2);
                    }
                    tiVar.Y1(tiVar.f30776u0);
                } else if (i10 == 14) {
                    if (tiVar.f30773t0 == null) {
                        ok okVar2 = new ok(tiVar, tiVar.getContext(), g6Var, false);
                        tiVar.f30773t0 = okVar2;
                        liVarArr[9] = okVar2;
                        okVar2.setDelegate(tiVar.f30725d2);
                    }
                    tiVar.Y1(tiVar.f30773t0);
                } else if (i10 == 16) {
                    if (tiVar.f30779v0 == null) {
                        ki.q qVar = new ki.q(tiVar.M1, tiVar.getContext(), g6Var, tiVar);
                        tiVar.f30779v0 = qVar;
                        liVarArr[10] = qVar;
                    }
                    tiVar.Y1(tiVar.f30779v0);
                } else if (view.getTag() instanceof Integer) {
                    tiVar.f30722c2.b0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, tiVar.x1(), false, 0L);
                }
            } else if (view instanceof mi) {
                mi miVar = (mi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = miVar.f28663c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        hi1.a(tiVar.getContext(), new org.telegram.ui.ActionBar.m3(22, tiVar, miVar), null);
                    } else {
                        tiVar.V1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    tiVar.f30722c2.X(miVar.f28662b);
                    tiVar.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                xhVar.v0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > xhVar.getMeasuredWidth()) {
                xhVar.v0(i13 - xhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void y(ti tiVar) {
        li liVar;
        bn bnVar;
        tiVar.f30784w1 = null;
        li liVar2 = tiVar.B0;
        if (liVar2 != tiVar.f30742j0 && (liVar = tiVar.C0) != (bnVar = tiVar.f30762q0) && liVar2 != liVar && liVar2 != bnVar) {
            tiVar.containerView.removeView(liVar2);
        }
        tiVar.B0.setVisibility(8);
        tiVar.B0.t();
        tiVar.C0.I();
        tiVar.B0 = tiVar.C0;
        tiVar.C0 = null;
        int[] iArr = tiVar.f30728e2;
        iArr[0] = iArr[1];
        tiVar.O1(tiVar.f30720c0, false);
        tiVar.e2();
    }

    public static boolean y1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20490id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f20490id != 489000 && !MessagesController.isSupportUser(user)) {
            return true;
        }
        return false;
    }

    public final void A1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int v12 = v1(false);
            org.telegram.ui.ActionBar.k6.z1(v12, this.shadowDrawable);
            gh.c cVar = this.L2;
            if (cVar.f11074a.getColor() != v12) {
                cVar.a(v12);
                kh.f fVar = this.f30792y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                yh yhVar = this.f30795z1;
                if (yhVar != null) {
                    yhVar.invalidate();
                }
            }
            e2();
            this.containerView.invalidate();
        }
    }

    public final void B1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.p();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        zh zhVar = this.H0;
        if (zhVar != null) {
            zhVar.o();
        }
        ci ciVar = this.S0;
        if (ciVar != null) {
            ciVar.o();
        }
    }

    public final void C1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName;
        if (tL_attachMenuBot != null) {
            userName = tL_attachMenuBot.short_name;
        } else {
            userName = UserObject.getUserName(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.M1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.f20490id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        c2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.u2(this, tL_attachMenuBot, user, 24));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.p();
    }

    public final void D1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (liVar != null) {
                    liVar.A();
                }
                i10++;
            } else {
                this.f30741i2 = true;
                return;
            }
        }
    }

    public final void E1() {
        int i10 = 0;
        this.f30741i2 = false;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.C();
            }
            i10++;
        }
        if (isShowing()) {
            this.f30722c2.u();
        }
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    public final void F1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (o2Var instanceof org.telegram.ui.sn)) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            MessageSuggestionParams messageSuggestionParams = snVar.f41677s5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!ai.ha.U(i10, messageSuggestionParams.amount)) {
                snVar.Zb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f30769s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.L0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                W1(o2Var);
                return;
            }
            return;
        }
        if (this.K1 == null && (o2Var instanceof org.telegram.ui.sn)) {
            org.telegram.ui.sn snVar2 = (org.telegram.ui.sn) o2Var;
            if (snVar2.c()) {
                f5.M(getContext(), snVar2.a(), new dh(this, 12), this.resourcesProvider);
                return;
            }
        }
        li liVar = this.B0;
        if (liVar != this.f30742j0 && liVar != this.f30762q0) {
            if (!liVar.K(0, true, 0, x1(), this.Q0)) {
                this.G2 = true;
                dismiss();
                return;
            }
            return;
        }
        N1(0, true, 0, x1(), this.Q0);
    }

    public final void G1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (i10 == 3) {
            if (this.Q1 || !f1()) {
                if (o2Var != null) {
                    activity = o2Var.getParentActivity();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                H1(true);
            }
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(o2Var)) {
            if (this.f30756o0 == null) {
                rl rlVar = new rl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f30756o0 = rlVar;
                this.f30794z0[5] = rlVar;
                ml mlVar = this.f30796z2;
                if (mlVar != null) {
                    rlVar.setDelegate(mlVar);
                } else if (o2Var instanceof org.telegram.ui.sn) {
                    rlVar.setDelegate(new dh(this, 16));
                }
            }
            Y1(this.f30756o0);
        }
    }

    public final void H1(boolean z10) {
        if (!this.Q1 && z10) {
            go goVar = new go(3, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            Y1(goVar);
        }
        int i10 = 1;
        if (this.f30748l0 == null) {
            fj fjVar = new fj(getContext(), this.resourcesProvider, this);
            this.f30748l0 = fjVar;
            this.f30794z0[3] = fjVar;
            fjVar.setupBlurredSearchField(this.M2);
            this.f30748l0.setDelegate(new dh(this, 13));
            if (this.H) {
                this.f30748l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            TLRPC.Chat chat = ((org.telegram.ui.sn) o2Var).e;
            fj fjVar2 = this.f30748l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            fjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Y1(this.f30748l0);
        }
    }

    public final void I1() {
        if (this.f30766r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
            ?? liVar = new li(context, g6Var, this);
            liVar.f27325r = AndroidUtilities.dp(80.0f);
            liVar.f27327w = 3;
            ai.u1 u1Var = new ai.u1(liVar, context, g6Var, 12);
            liVar.f27324n = u1Var;
            za zaVar = new za(liVar, context);
            liVar.v = zaVar;
            u1Var.setAdapter(zaVar);
            u1Var.setClipToPadding(false);
            u1Var.setItemAnimator(null);
            u1Var.setLayoutAnimation(null);
            u1Var.setVerticalScrollBarEnabled(false);
            org.telegram.ui.ActionBar.r6.m(u1Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
            liVar.addView(u1Var, w7.z5.c(-1.0f, -1));
            u1Var.setOnScrollListener(new ah.d0(liVar, 22));
            di.k kVar = new di.k(liVar, liVar.f27325r, 1);
            liVar.f27326s = kVar;
            kVar.O = new ai.q1(liVar, 3);
            u1Var.setLayoutManager(kVar);
            this.f30766r0 = liVar;
            liVar.setDelegate(new gb(this, 1));
        }
        Y1(this.f30766r0);
    }

    public final void J1() {
        boolean z10;
        if (!this.T1) {
            go goVar = new go(5, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            Y1(goVar);
        }
        if (this.f30745k0 == null) {
            xj xjVar = new xj(getContext(), this.resourcesProvider, this);
            this.f30745k0 = xjVar;
            this.f30794z0[2] = xjVar;
            xjVar.setupBlurredSearchField(this.M2);
            this.f30745k0.setDelegate(new fi(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            TLRPC.Chat chat = ((org.telegram.ui.sn) o2Var).e;
            xj xjVar2 = this.f30745k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            xjVar2.setMultipleSelectionAllowed(z10);
        }
        Y1(this.f30745k0);
    }

    public final void K1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            go goVar = new go(4, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            Y1(goVar);
        }
        boolean z11 = false;
        if (this.f30759p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            nk nkVar = new nk(i10, getContext(), this.resourcesProvider, this);
            this.f30759p0 = nkVar;
            this.f30794z0[4] = nkVar;
            nkVar.setDelegate(new gi(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f30759p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
            if (o2Var instanceof org.telegram.ui.sn) {
                TLRPC.Chat chat = ((org.telegram.ui.sn) o2Var).e;
                nk nkVar2 = this.f30759p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                nkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f30759p0.setMaxSelectedFiles(this.V1);
                nk nkVar3 = this.f30759p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                nkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        nk nkVar4 = this.f30759p0;
        nkVar4.f28973d0 = this.N;
        if (z10) {
            Y1(nkVar4);
        }
    }

    public final void M1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        z7 z7Var = this.f30714a1;
        int i10 = 1;
        if (z7Var.f21068n0) {
            z7Var.g(true);
        }
        this.f30745k0 = null;
        this.f30770s0 = null;
        this.f30748l0 = null;
        this.m0 = null;
        this.f30753n0 = null;
        this.f30756o0 = null;
        this.f30759p0 = null;
        this.f30783w0 = null;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.p();
                this.containerView.removeView(liVarArr[i10]);
                liVarArr[i10] = null;
            }
            i10++;
        }
        b2(false, false);
        super.dismissInternal();
        if (this.f30787x0) {
            this.f30787x0 = false;
            this.f30791y0 = 0.0f;
            org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
            if (o2Var != null && o2Var.getFragmentView() != null) {
                View fragmentView = o2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f45242a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean N1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            TLRPC.Chat chat = snVar.e;
            if (snVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.M1).edit();
                edit.putBoolean("silent_" + snVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (g1(r1().getText())) {
            return true;
        }
        d1();
        if (this.h.f17447f) {
            this.L1 = true;
            this.f30722c2.b0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long s12 = s1();
        li liVar = this.B0;
        if (liVar != null) {
            i12 = liVar.getSelectedItemsCount();
        }
        return f5.b0(this.M1, s12, o1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ti tiVar = ti.this;
                tiVar.L1 = true;
                tiVar.f30722c2.b0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void O1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f30715b.a(z10, z11);
        qu r12 = r1();
        this.f30720c0 = z10;
        qu r13 = r1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        li liVar = this.B0;
        if (liVar != this.f30742j0 && liVar != this.f30762q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f30720c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            vVar.setVisibility(i12);
            ViewPropertyAnimator animate = vVar.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).setUpdateListener(new eh(this, 0)).withEndAction(new Runnable(this) {
                public final ti f26324b;

                {
                    this.f26324b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f26324b;
                            if (!z14 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.j2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f26324b.F0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator animate2 = jVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = jVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            translationY.alpha(f11).setDuration(320L).setInterpolator(bsVar).setUpdateListener(new eh(this, 1)).withEndAction(new Runnable(this) {
                public final ti f26324b;

                {
                    this.f26324b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f26324b;
                            if (!z14 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.j2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f26324b.F0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z14 && z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            vVar.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            vVar.setAlpha(f7);
            j2();
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            jVar.setAlpha(f11);
            if (z14 || !z12) {
                f12 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f12);
            if (z14 || !z12) {
                i11 = 8;
            }
            jVar.setVisibility(i11);
        }
        if (r12 != r13) {
            r12.k(true);
            r13.setText(a6.cloneSpans(r12.getText()));
            r13.getEditText().setAllowTextEntitiesIntersection(r12.getEditText().getAllowTextEntitiesIntersection());
            if (r12.getEditText().isFocused()) {
                r13.getEditText().requestFocus();
                r13.getEditText().setSelection(r12.getEditText().getSelectionStart(), r12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new gh(this, 0));
    }

    public final void P1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f30742j0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.K1 == messageObject && this.J1 == i10) {
            return;
        }
        this.K1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.K1.isMusic()) {
                i10 = 2;
            } else if (this.K1.isDocument()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        this.J1 = i10;
        if (this.K1 != null) {
            this.V1 = 1;
            this.W1 = false;
        } else {
            this.V1 = -1;
            this.W1 = true;
        }
        this.D1.l();
        d2(0);
    }

    public final void Q1(float f7) {
        int i10;
        float translationY = this.containerView.getTranslationY() - this.f30791y0;
        this.f30791y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        al alVar = this.f30783w0;
        if (alVar != null) {
            alVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.g3 g3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        g3Var.setAlpha(i10);
        this.navigationBarAlpha = 1.0f - f7;
        getContainer().invalidate();
    }

    public final void R1(int i10, boolean z10) {
        if (this.K1 != null) {
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
    }

    public final void S1(float f7) {
        boolean z10 = false;
        int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = o10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void T1(String str) {
        boolean z10 = true;
        this.T0 = 1;
        this.F = true;
        this.V0 = false;
        this.P1 = false;
        this.A1.setVisibility(8);
        this.f30750m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
        if (chatAttachAlertPhotoLayout != null) {
            ti tiVar = chatAttachAlertPhotoLayout.f28366b;
            if (tiVar.T0 == 0 || tiVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f24240g1 = z10;
        }
    }

    public final void U1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.U1(boolean):void");
    }

    public final void V1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.V1(long, java.lang.String, boolean, boolean):void");
    }

    public final void W1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.sn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.sn) o2Var).e)) {
            new xc(this.f30777u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new ee(4, this, o2Var)).j();
        }
    }

    public final boolean X1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        li liVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        z7 z7Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float dp2;
        this.f30719c.a(z10, true);
        wh whVar = this.G0;
        if (whVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return false;
        }
        AnimatorSet animatorSet = this.P0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        whVar.setTag(num);
        zh zhVar = this.H0;
        if (zhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        zhVar.k(true);
        this.S0.k(true);
        wh whVar2 = this.A1;
        wh whVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                whVar.setVisibility(0);
            }
            whVar3.setVisibility(0);
        } else if (this.V0) {
            whVar2.setVisibility(0);
        }
        li liVar2 = this.B0;
        if ((liVar2 == this.f30742j0 || liVar2 == this.f30762q0) && this.f30720c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        z7 z7Var2 = this.f30714a1;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        ei eiVar = this.L0;
        float f28 = 1.0f;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z13) {
                vVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(whVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f20));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                z7Var = z7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                z7Var = z7Var2;
            }
            if (z10 && z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vVar, property, f21));
            Property property2 = View.SCALE_X;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(whVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(whVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(whVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(eiVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(eiVar, property3, f26));
            if (z7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(whVar, property4, dp2));
            } else if (this.V0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = AndroidUtilities.dp(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(whVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(whVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eh(this, 5));
                arrayList.add(ofFloat);
            }
            this.P0.playTogether(arrayList);
            this.P0.setInterpolator(new DecelerateInterpolator());
            this.P0.setDuration(180L);
            this.P0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z13, 3));
            this.P0.start();
            i10 = 0;
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            whVar.setAlpha(f7);
            if (z10 && z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            jVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                jVar.setVisibility(0);
                f11 = 0.0f;
                jVar.setTranslationY(0.0f);
            } else {
                f11 = 0.0f;
                i10 = 0;
            }
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            whVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            whVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            whVar3.setAlpha(f14);
            if (z10 && z13) {
                i11 = i10;
            } else {
                i11 = 8;
            }
            vVar.setVisibility(i11);
            if (z10 && z13) {
                f15 = 1.0f;
            } else {
                f15 = f11;
            }
            vVar.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            eiVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            eiVar.setScaleY(f17);
            if (z7Var2.getTag() != null) {
                if (z10) {
                    dp = f11;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                whVar.setTranslationY(dp);
            } else if (this.V0 && ((liVar = this.B0) == null || liVar.L())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = f11;
                }
                whVar2.setTranslationY(f18);
            }
            if (!z10) {
                whVar.setVisibility(4);
                whVar3.setVisibility(4);
            }
            if (z13) {
                j2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        eiVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(s1());
        }
        eiVar.i(o1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Y1(li liVar) {
        long j10 = this.Z0;
        go goVar = this.T;
        if (liVar == goVar) {
            j10 = goVar.f26685s;
        } else if (liVar == this.f30742j0) {
            j10 = 1;
        } else if (liVar == this.f30748l0) {
            j10 = 3;
        } else if (liVar == this.f30759p0) {
            j10 = 4;
        } else if (liVar == this.f30745k0) {
            j10 = 5;
        } else if (liVar == this.f30756o0) {
            j10 = 6;
        } else if (liVar == this.m0) {
            j10 = 9;
        } else if (liVar == this.f30766r0) {
            j10 = 10;
        } else if (liVar == this.f30770s0) {
            j10 = 11;
        } else if (liVar == this.f30753n0) {
            j10 = 12;
        } else if (liVar == this.f30773t0) {
            j10 = 14;
        } else if (liVar == this.f30776u0) {
            j10 = 13;
        } else if (liVar == this.f30779v0) {
            j10 = 16;
        } else if (liVar == this.f30783w0) {
            j10 = 17;
        }
        Z1(liVar, j10, true);
    }

    public final void Z1(li liVar, long j10, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        om omVar;
        boolean z12;
        Integer num;
        om omVar2;
        int i12;
        int dp;
        int i13;
        int dp2;
        Float f7;
        int i14;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f30784w1 == null && this.P0 == null) {
            li liVar2 = this.B0;
            if (liVar2 == liVar) {
                liVar2.J();
            } else if (liVar == this.f30753n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new sg.y0(this.f30730f0, 39, false).show();
            } else {
                int i15 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30729f.a(z11, z10);
                this.f30752n.h(Long.valueOf(j10), z10);
                this.G1 = false;
                this.E1 = false;
                this.I1 = 0.0f;
                this.H1.setVisibility(8);
                RadialProgressView radialProgressView = this.F1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                wh whVar = this.A1;
                whVar.setAlpha(1.0f);
                whVar.setTranslationY(this.I1);
                int i16 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.A0;
                    if (i16 >= longSparseArray.size()) {
                        break;
                    }
                    ((gi.f4) longSparseArray.valueAt(i16)).setMeasureOffsetY(0);
                    i16++;
                }
                this.Z0 = j10;
                xh xhVar = this.B1;
                int childCount = xhVar.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = xhVar.getChildAt(i17);
                    if (childAt instanceof ni) {
                        ni niVar = (ni) childAt;
                        i14 = childCount;
                        f7 = valueOf;
                        if (niVar.f28953b == niVar.f28954c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar.f29184a.f(z13, true);
                    } else {
                        f7 = valueOf;
                        i14 = childCount;
                        if (childAt instanceof mi) {
                            ((mi) childAt).a(true);
                        }
                    }
                    i17++;
                    childCount = i14;
                    valueOf = f7;
                }
                Float f10 = valueOf;
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f30728e2[0];
                this.C0 = liVar;
                boolean e = liVar.e();
                kh.f fVar = this.f30792y1;
                if (fVar != null) {
                    if (e) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                yh yhVar = this.f30795z1;
                if (yhVar != null) {
                    if (e) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    yhVar.setVisibility(i13);
                }
                if (this.C0.i() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                z7 z7Var = this.f30714a1;
                z7Var.setVisibility(i10);
                if (z7Var.f21068n0) {
                    z7Var.g(true);
                }
                this.B0.u();
                li liVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
                if (liVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.F(this.B0);
                this.C0.setVisibility(0);
                if (liVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                if (this.C0.getParent() != this.containerView) {
                    L1(this.C0);
                    ViewGroup viewGroup = this.containerView;
                    li liVar4 = this.C0;
                    if (liVar4 != this.f30756o0) {
                        indexOfChild++;
                    }
                    i11 = 0;
                    viewGroup.addView(liVar4, indexOfChild, w7.z5.c(-1.0f, -1));
                } else {
                    i11 = 0;
                }
                gh ghVar = new gh(this, 4);
                li liVar5 = this.B0;
                boolean z14 = liVar5 instanceof bn;
                hi hiVar = this.f30726e0;
                if (!z14 && !(this.C0 instanceof bn)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.C0.setAlpha(0.0f);
                        this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                        li liVar6 = this.B0;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[i11] = AndroidUtilities.dp(78.0f) + firstOffset;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liVar6, property, fArr);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, hiVar, 0.0f, 1.0f);
                        Property property2 = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i11] = z7Var.getAlpha();
                        fArr2[1] = 0.0f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z7Var, property2, fArr2);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i11] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[2] = ofFloat3;
                        animatorSet.playTogether(animatorArr);
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(bs.f25133f);
                        animatorSet.addListener(new ai.c5(this, firstOffset, ghVar, 1));
                        this.f30784w1 = animatorSet;
                        hiVar.set(this.B0, f10);
                        animatorSet.start();
                    } else {
                        liVar5.setAlpha(0.0f);
                        ghVar.run();
                        i2(i11);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                    li liVar7 = this.C0;
                    if (liVar7 instanceof bn) {
                        liVar7.setTranslationX(max);
                        li liVar8 = this.B0;
                        if ((liVar8 instanceof ChatAttachAlertPhotoLayout) && (omVar2 = ((ChatAttachAlertPhotoLayout) liVar8).P) != null) {
                            omVar2.setVisibility(4);
                        }
                    } else {
                        this.B0.setTranslationX(-max);
                        li liVar9 = this.C0;
                        if (liVar9 == chatAttachAlertPhotoLayout && (omVar = ((ChatAttachAlertPhotoLayout) liVar9).P) != null) {
                            omVar.setVisibility(0);
                        }
                    }
                    this.C0.setAlpha(1.0f);
                    this.B0.setAlpha(1.0f);
                    if (z10) {
                        hiVar.set(this.B0, f10);
                        AndroidUtilities.runOnUIThread(new lg(this, liVar, ghVar, 1));
                    } else {
                        if (this.C0.getCurrentItemTop() <= liVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B0.v(1.0f);
                        this.C0.v(1.0f);
                        this.B0.l(this.f30758o2);
                        this.C0.l(this.f30758o2);
                        this.containerView.invalidate();
                        hiVar.set(this.B0, Float.valueOf(1.0f));
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        z7Var.setTag(num);
                        ghVar.run();
                    }
                }
                if (this.f30761p2 && !(liVar instanceof gi.f4)) {
                    i12 = 0;
                    this.f30761p2 = false;
                    z7Var.updateColors();
                    z7Var.invalidate();
                    A1();
                } else {
                    i12 = 0;
                }
                if (i15 != 0 && j10 != 6 && j10 != 17 && !(liVar instanceof gi.f4)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = i12;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                z7Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void a2(boolean z10, Boolean bool) {
        ti tiVar;
        if (this.m0 == null) {
            tiVar = this;
            fo foVar = new fo(tiVar, getContext(), false, this.resourcesProvider, bool);
            tiVar.m0 = foVar;
            tiVar.f30794z0[1] = foVar;
            foVar.setDelegate(new dh(this, 15));
        } else {
            tiVar = this;
        }
        Z1(tiVar.m0, 9L, z10);
    }

    public final void b2(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        li liVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        z7 z7Var = this.f30714a1;
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            z7Var.setTag(num);
            AnimatorSet animatorSet = this.f30717b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f30717b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f30774t1) && this.B0 == this.f30742j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            wh whVar = this.A1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30724d1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                whVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
            if (o2Var != null) {
                if (z10) {
                    if (this.f30747k2) {
                        i10 = org.telegram.ui.ActionBar.k6.f21489tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21254h5;
                    }
                    if (i0.a.h(getThemedColor(i10)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z13);
                } else {
                    AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
                }
            }
            float f14 = 0.6f;
            float f15 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f30717b1 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - z7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, property, f12);
                ofFloat.addUpdateListener(new eh(this, 4));
                arrayList.add(ofFloat);
                if (z12) {
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, property, f15));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, property2, f13));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, property3, f14));
                }
                this.f30717b1.playTogether(arrayList);
                this.f30717b1.addListener(new org.telegram.ui.ho(3, this, z10));
                this.f30717b1.setInterpolator(bs.h);
                this.f30717b1.setDuration(380L);
                this.f30717b1.start();
                return;
            }
            if (z10 && this.V0 && ((liVar = this.B0) == null || liVar.L())) {
                whVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            z7Var.setAlpha(f7);
            if (z12) {
                if (z10) {
                    f15 = 1.0f;
                }
                u0Var.setAlpha(f15);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                u0Var.setScaleX(f10);
                if (z10) {
                    f14 = 1.0f;
                }
                u0Var.setScaleY(f14);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f30737h1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f30774t1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void c2() {
        float alpha;
        int[] iArr = this.J0;
        zh zhVar = this.H0;
        zhVar.getLocationOnScreen(iArr);
        if (this.H2 != null) {
            li liVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
            if ((liVar == chatAttachAlertPhotoLayout || liVar == this.f30762q0) && this.f30720c0) {
                ah.v vVar = this.R0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.H2.getTop());
            } else {
                alpha = -zhVar.getHeight();
            }
            if (Math.abs(this.H2.getTranslationY() - alpha) > 0.5f) {
                this.H2.setTranslationY(alpha);
                this.H2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        l1();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.B0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f30772s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f30775t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1() {
        if (r1().f29989a.length() <= 0) {
            return;
        }
        this.B0.a(r1().getText());
    }

    public final void d2(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.d2(int):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
                return;
            }
            return;
        }
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        if (z10) {
            this.G2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ri riVar = this.f30722c2;
        if (riVar != null) {
            riVar.r(new gh(this, 3));
        } else {
            M1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.r(i10);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.e1():void");
    }

    public final void e2() {
        boolean h;
        float f7;
        float f10;
        float f11;
        li liVar = this.B0;
        int i10 = 0;
        if (liVar == null) {
            h = false;
        } else {
            h = liVar.h();
        }
        di.n nVar = this.f30740i1;
        nVar.setEnabled(h);
        li liVar2 = this.B0;
        float f12 = 0.5f;
        if (liVar2 != null) {
            if (liVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.C0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f30723d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        li liVar3 = this.C0;
        if (liVar3 != null) {
            if (liVar3.h()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30723d0, f12, f7);
        }
        this.f30743j1 = f7;
        if (nVar != null) {
            float f13 = f7 * this.f30746k1;
            nVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            nVar.setVisibility(i10);
        }
    }

    public final boolean f1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).N6()) {
            return true;
        }
        return false;
    }

    public final void f2(li liVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (liVar != null) {
            bh.f fVar = this.I2;
            if (fVar != null && Build.VERSION.SDK_INT >= 31) {
                fVar.f(0.0f, i10);
                e1();
            }
            int currentItemTop = liVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (liVar == this.B0 && currentItemTop <= liVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (liVar == this.B0) {
                    b2(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.sl.D(11.0f, i11, currentItemTop);
                li liVar2 = this.B0;
                if (liVar2 == liVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((liVar2 instanceof bn) || (this.C0 instanceof bn)) {
                    Object obj = this.f30784w1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f17615f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f30728e2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f30732f2 = i13;
                        return;
                    }
                    return;
                }
                this.f30732f2 = i13;
                iArr[i12] = D;
                i2(i12);
                this.containerView.invalidate();
            }
        }
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final boolean g1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ChatActivityEnterView.D(this.M1, ((org.telegram.ui.sn) o2Var).a(), o2Var, charSequence);
        }
        return false;
    }

    public final void g2(boolean z10) {
        ei.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f30727e1) != null) {
            int i10 = 0;
            if (this.f30774t1 && this.f30739i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f9888f = z12;
            if (!z10) {
                ((f6) uVar.f9889g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30731f1;
            if (z10 && this.f30774t1) {
                u0Var.setVisibility(0);
                ViewPropertyAnimator animate = u0Var.animate();
                if (z11) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z11) {
                    f12 = 1.0f;
                }
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(bs.h).withEndAction(new ph(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i10 = 8;
            }
            u0Var.setVisibility(i10);
            if (z11) {
                f11 = 1.0f;
            }
            u0Var.setAlpha(f11);
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            u0Var.setScaleX(f7);
            if (z11) {
                f12 = 1.0f;
            }
            u0Var.setScaleY(f12);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (liVar != null && (themeDescriptions = liVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.container, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21271i5));
                return arrayList;
            }
        }
    }

    public final void h1() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        xh xhVar = this.B1;
        if (xhVar == null) {
            return;
        }
        int childCount = xhVar.getChildCount();
        boolean z11 = false;
        for (int i18 = 0; i18 < childCount; i18++) {
            xhVar.getChildAt(i18);
        }
        boolean z12 = this.f30747k2;
        if (z12) {
            i10 = org.telegram.ui.ActionBar.k6.f21262hg;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21289j5;
        }
        org.telegram.ui.ActionBar.r6.W(this.f30750m1, i10, this.resourcesProvider);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.k6.f21262hg;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        }
        org.telegram.ui.ActionBar.r6.W(this.f30767r1, i11, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.W(this.f30740i1, org.telegram.ui.ActionBar.k6.Sh, this.resourcesProvider);
        if (z12) {
            i12 = org.telegram.ui.ActionBar.k6.f21262hg;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21289j5;
        }
        int themedColor = getThemedColor(i12);
        if (this.f30785w2 && themedColor == this.f30781v2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f30785w2 = true;
        this.f30781v2 = themedColor;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30724d1;
        if (z10) {
            u0Var.setIconColor(themedColor);
        }
        Drawable background = u0Var.getBackground();
        if (z12) {
            i13 = org.telegram.ui.ActionBar.k6.f21280ig;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.k6.z1(getThemedColor(i13), background);
        int i19 = org.telegram.ui.ActionBar.k6.E8;
        u0Var.G(getThemedColor(i19), false);
        u0Var.G(getThemedColor(i19), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30731f1;
        if (u0Var2 != null && z10) {
            u0Var2.setIconColor(themedColor);
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30737h1;
        if (u0Var3 != null) {
            if (z10) {
                u0Var3.setIconColor(themedColor);
            }
            Drawable background2 = u0Var3.getBackground();
            if (z12) {
                i17 = org.telegram.ui.ActionBar.k6.f21280ig;
            } else {
                i17 = org.telegram.ui.ActionBar.k6.I5;
            }
            org.telegram.ui.ActionBar.k6.z1(getThemedColor(i17), background2);
        }
        zh zhVar = this.H0;
        org.telegram.ui.ActionBar.g6 g6Var = zhVar.M;
        lu luVar = zhVar.f29989a;
        int i20 = zhVar.L;
        if (i20 == 0) {
            luVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, g6Var));
            int i21 = org.telegram.ui.ActionBar.k6.G6;
            luVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i21, g6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i21, g6Var));
        } else if (i20 != 2 && i20 != 3) {
            luVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21478t5, g6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21289j5, g6Var));
        } else {
            luVar.setHintTextColor(-1929379841);
            luVar.setTextColor(-1);
            luVar.setCursorColor(-1);
            luVar.setHandlesColor(-1);
            luVar.setHighlightColor(822083583);
            luVar.quoteColor = -1;
        }
        zhVar.f29991c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
        mu muVar = zhVar.d;
        if (muVar != null) {
            muVar.updateColors();
        }
        org.telegram.ui.ActionBar.r6.m(xhVar, 21, org.telegram.ui.ActionBar.k6.A5, this.resourcesProvider);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.k6.f21262hg;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.f21289j5;
        }
        org.telegram.ui.ActionBar.g6 g6Var2 = this.resourcesProvider;
        z7 z7Var = this.f30714a1;
        org.telegram.ui.ActionBar.r6.m(z7Var, 1, i14, g6Var2);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.k6.f21280ig;
        } else {
            i15 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.r6.m(z7Var, 3, i15, this.resourcesProvider);
        if (z12) {
            i16 = org.telegram.ui.ActionBar.k6.f21262hg;
        } else {
            i16 = org.telegram.ui.ActionBar.k6.f21289j5;
        }
        org.telegram.ui.ActionBar.r6.m(z7Var, 5, i16, this.resourcesProvider);
        int v12 = v1(false);
        org.telegram.ui.ActionBar.k6.z1(v12, this.shadowDrawable);
        gh.c cVar = this.L2;
        if (cVar.f11074a.getColor() != v12) {
            cVar.a(v12);
            kh.f fVar = this.f30792y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.f30795z1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i22 = 0;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i22 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i22];
            if (liVar != null) {
                liVar.d();
            }
            i22++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21271i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z11 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z11);
            return;
        }
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21254h5);
    }

    public final void h2(boolean z10) {
        boolean z11;
        float f7;
        li liVar = this.f30742j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f30762q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f30765r;
                if (g6Var == null) {
                    g6Var = this.resourcesProvider;
                }
                ?? liVar2 = new li(context, g6Var, this);
                liVar2.f25106y = 0.0f;
                liVar2.E = 0.0f;
                liVar2.F = 0.0f;
                liVar2.G = 0.0f;
                liVar2.H = 0.0f;
                liVar2.I = 0.0f;
                liVar2.J = null;
                liVar2.K = false;
                liVar2.M = 0.0f;
                liVar2.Q = false;
                liVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                liVar2.T = z11;
                liVar2.f25101n = g6Var;
                liVar2.f28368f = true;
                liVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y m10 = liVar2.f28366b.f30714a1.m();
                TextView textView = new TextView(context);
                liVar2.f25105x = textView;
                org.telegram.ui.ActionBar.g6 g6Var2 = liVar2.f28365a;
                jm jmVar = new jm(liVar2, context, m10, g6Var2, 1);
                z7 z7Var = liVar2.f28366b.f30714a1;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                z7Var.addView(jmVar, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, g6Var2);
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                jmVar.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.u1 u1Var = new ai.u1(liVar2, context, g6Var2, 15);
                liVar2.f25102r = u1Var;
                u1Var.setAdapter(new org.telegram.ui.z7(liVar2, 3));
                s4.b0 b0Var = new s4.b0(1, false);
                liVar2.f25103s = b0Var;
                u1Var.setLayoutManager(b0Var);
                u1Var.setClipChildren(false);
                u1Var.setClipToPadding(false);
                u1Var.setOverScrollMode(2);
                u1Var.setVerticalScrollBarEnabled(false);
                an anVar = new an(liVar2, context);
                liVar2.v = anVar;
                anVar.setClipToPadding(true);
                anVar.setClipChildren(true);
                liVar2.addView(u1Var, w7.z5.c(-1.0f, -1));
                liVar2.P = liVar2.f28366b.f30742j0;
                anVar.f24778c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.P;
                anVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                anVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                anVar.c();
                UndoView undoView = new UndoView(context, null, false, liVar2.f28366b.f30765r);
                liVar2.f25104w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                liVar2.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                liVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f30762q0 = liVar2;
                liVar2.bringToFront();
            }
            li liVar3 = this.B0;
            bn bnVar = this.f30762q0;
            if (liVar3 != bnVar) {
                liVar = bnVar;
            }
            Y1(liVar);
            return;
        }
        Y1(liVar);
    }

    public final void i1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.i1(boolean):void");
    }

    public final void i2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.i2(int):void");
    }

    public final void j1() {
        float f7 = this.f30719c.e;
        float f10 = (1.0f - this.f30715b.e) * f7;
        this.f30795z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void j2() {
        int i10 = 0;
        i2(0);
        this.f30777u1.invalidate();
        ah.v vVar = this.R0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
        if (chatAttachAlertPhotoLayout != null) {
            em emVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (emVar != null && emVar.getFastScroll() != null) {
                tl0 fastScroll = emVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f24257p1;
                if (this.f30720c0) {
                    i10 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.f30831h0 = currentActionBarHeight + i10;
                emVar.getFastScroll().invalidate();
            }
        }
        c2();
        l1();
    }

    public final void k1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f30729f.e;
        float b10 = zf.f0.b(this.h.e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        h20.d(this.I0, com.google.android.gms.internal.play_billing.k3.C(f10, f11, b10, f7));
    }

    public final void l1() {
        ei eiVar = this.L0;
        wh whVar = this.K0;
        ah.v vVar = this.R0;
        if (vVar != null && vVar.getVisibility() == 0 && vVar.getAlpha() != 0.0f) {
            float f7 = this.f30715b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            eiVar.setAlpha(abs * abs * abs * abs);
            whVar.setTranslationY(AndroidUtilities.lerp(this.f30744j2, ((vVar.getTranslationY() + vVar.getTop()) - whVar.getTop()) + AndroidUtilities.dp(8.0f), bs.f25136j.getInterpolation(f7)));
            return;
        }
        whVar.setTranslationY(this.f30744j2);
        eiVar.setAlpha(1.0f);
    }

    public final void m1(int i10) {
        this.V0 = true;
        this.A1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.T0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30754n1;
        if (u0Var != null) {
            this.f30750m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void n1(hg.o oVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f30750m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f30739i0 = false;
        this.J = oVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30754n1;
        if (u0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            u0Var.setVisibility(0);
            u0Var.setClickable(true);
            u0Var.setAlpha(1.0f);
            u0Var.setScaleX(1.0f);
            u0Var.setScaleY(1.0f);
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        li liVar;
        int i11;
        if (i10 == 0) {
            l1();
            j1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            j1();
            fo foVar = this.m0;
            if (foVar != null && ((liVar = this.C0) == foVar || this.B0 == foVar)) {
                if (liVar == foVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                i2(i11);
            }
            fo foVar2 = this.f30753n0;
            if (foVar2 != null) {
                li liVar2 = this.C0;
                if (liVar2 == foVar2 || this.B0 == foVar2) {
                    if (liVar2 != foVar2) {
                        i12 = 0;
                    }
                    i2(i12);
                }
            }
        } else if (i10 == 1) {
            j1();
        } else if (i10 == 3) {
            k1();
        } else if (i10 == 4) {
            k1();
        } else if (i10 == 5) {
            k1();
            ei eiVar = this.L0;
            if (eiVar != null) {
                eiVar.setEphemeralFactor(f7);
                eiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final int o1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if ((o2Var instanceof org.telegram.ui.sn) && (messagePreviewParams = ((org.telegram.ui.sn) o2Var).f41663r5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    @Override
    public final void onBackPressed() {
        if (this.S.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        z7 z7Var = this.f30714a1;
        if (z7Var.f21068n0) {
            z7Var.g(true);
        } else if (this.B0.j()) {
        } else {
            if (r1() != null && r1().e) {
                r1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.B0.n(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final al alVar = this.f30783w0;
        if (alVar != null && this.B0 == alVar) {
            final gh ghVar = new gh(this, 1);
            int i10 = alVar.f24751n;
            org.telegram.ui.Wallet.i9 i9Var = alVar.R;
            ti tiVar = alVar.f28366b;
            AnimatorSet animatorSet = null;
            if (!alVar.K && (wallettransaction = alVar.P0) != null && alVar.Q0 == null && alVar.R0 == null) {
                if (alVar.S0) {
                    org.telegram.ui.Wallet.o5 o5Var = new org.telegram.ui.Wallet.o5();
                    o5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
                    if (o2Var != null && o2Var.presentFragment(o5Var, false, true)) {
                        org.telegram.ui.Wallet.w9 w9Var = new org.telegram.ui.Wallet.w9(tiVar.getContainer(), tiVar.getSheetContainer(), i9Var.getDiamondView(), o5Var, alVar.P0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!alVar.K) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!alVar.K) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, tiVar);
                        alVar.R0 = w9Var;
                        animatorSet = w9Var.f35368m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m6 diamondView = i9Var.getDiamondView();
                    if (diamondView.f34865f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f30730f0;
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (snVar.getCurrentAccount() == i10 && snVar.a() == alVar.f24756r.f20490id && snVar.f41492d4 == 0 && snVar.getFragmentView() != null && snVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.e6 e6Var = new org.telegram.ui.Wallet.e6(tiVar.getContainer(), tiVar.getSheetContainer(), i9Var.getDiamondView(), snVar, alVar.P0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!alVar.K) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!alVar.K) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, tiVar);
                                alVar.Q0 = e6Var;
                                animatorSet = e6Var.f34448m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.currentSheetAnimation = animatorSet;
                this.currentSheetAnimationType = 2;
                return true;
            }
        }
        return super.onCustomCloseAnimation();
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
        fa1 fa1Var = chatAttachAlertPhotoLayout.f24249l0;
        ah.x xVar = chatAttachAlertPhotoLayout.f24245j0;
        TextView textView = chatAttachAlertPhotoLayout.f24256p0;
        em emVar = chatAttachAlertPhotoLayout.f24259r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == xVar) {
            if (z10) {
                if (emVar.getVisibility() == 0) {
                    xVar.layout(0, org.telegram.messenger.v0.B(222.0f, i13, i16), i14, org.telegram.messenger.v0.B(96.0f, i13, i16));
                    return true;
                }
                xVar.layout(0, org.telegram.messenger.v0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (emVar.getVisibility() == 0) {
                xVar.layout(org.telegram.messenger.v0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                xVar.layout(org.telegram.messenger.v0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == fa1Var) {
            if (z10) {
                if (emVar.getVisibility() == 0) {
                    fa1Var.layout(0, org.telegram.messenger.v0.B(310.0f, i13, i16), i14, org.telegram.messenger.v0.B(260.0f, i13, i16));
                    return true;
                }
                fa1Var.layout(0, org.telegram.messenger.v0.B(176.0f, i13, i16), i14, org.telegram.messenger.v0.B(126.0f, i13, i16));
                return true;
            } else if (emVar.getVisibility() == 0) {
                fa1Var.layout(org.telegram.messenger.v0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                fa1Var.layout(org.telegram.messenger.v0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (emVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (emVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != emVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.v0.B(88.0f, i15, i16);
                view.layout(0, B, view.getMeasuredWidth(), view.getMeasuredHeight() + B);
                return true;
            }
            int dp3 = (i10 + i14) - AndroidUtilities.dp(88.0f);
            view.layout(dp3, 0, view.getMeasuredWidth() + dp3, view.getMeasuredHeight());
            return true;
        }
    }

    @Override
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
        sm smVar = chatAttachAlertPhotoLayout.v;
        em emVar = chatAttachAlertPhotoLayout.f24259r;
        hg.a0 a0Var = chatAttachAlertPhotoLayout.f24261s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        om omVar = chatAttachAlertPhotoLayout.P;
        if (view == omVar) {
            if (chatAttachAlertPhotoLayout.f24229b0 && !chatAttachAlertPhotoLayout.f24233d0) {
                omVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ah.x xVar = chatAttachAlertPhotoLayout.f24245j0;
            if (view == xVar) {
                if (z10) {
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                xVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            fa1 fa1Var = chatAttachAlertPhotoLayout.f24249l0;
            if (view == fa1Var) {
                if (z10) {
                    fa1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                fa1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == emVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    emVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f46331o != 0) {
                        emVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        smVar.l();
                    }
                } else {
                    emVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f46331o != 1) {
                        emVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        smVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        int i10;
        this.f30742j0.setTranslationX(0.0f);
        this.f30763q1.setAlpha(0.0f);
        this.f30757o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30775t2 = animatorSet;
        hi hiVar = this.f30768r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, hiVar, 0.0f, 400.0f));
        this.f30775t2.setDuration(400L);
        this.f30775t2.setStartDelay(20L);
        hiVar.set(this, Float.valueOf(0.0f));
        this.f30775t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new eh(this, 2));
        o1.k kVar = this.f30772s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f17605n, 0.0f);
        this.f30772s2 = kVar2;
        if (this.K1 != null) {
            kVar2.f17622u.a(0.75f);
            this.f30772s2.f17622u.b(350.0f);
        } else {
            kVar2.f17622u.a(0.75f);
            this.f30772s2.f17622u.b(350.0f);
        }
        this.f30772s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.g3 g3Var = this.backDrawable;
        r6 r6Var = t6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(g3Var, r6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        lg lgVar = new lg(this, animationNotificationsLocker, this.delegate, 2);
        this.f30772s2.a(new gi.b4(2, this, lgVar));
        this.currentSheetAnimation.addListener(new ai.ne(23, this, lgVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        S1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(bs.f25133f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.B0.s()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.B0.E(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f30730f0 instanceof org.telegram.ui.sn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30780v1 = true;
        if (!this.P1 && !this.O1) {
            f1();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.S);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.S);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            h1();
            bh.c cVar = this.f30716b0;
            if (cVar != null) {
                cVar.updateColors();
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21289j5);
            org.telegram.ui.ActionBar.u0 u0Var = this.f30754n1;
            if (u0Var != null && themedColor != this.f30778u2) {
                this.f30778u2 = themedColor;
                u0Var.setIconColor(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final TLRPC.Chat p1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) o2Var).e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float q1() {
        wh whVar = this.G0;
        float alpha = 1.0f - whVar.getAlpha();
        return whVar.getMeasuredHeight() - (alpha * (whVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final qu r1() {
        li liVar;
        if (this.f30720c0 && ((liVar = this.B0) == this.f30742j0 || liVar == this.f30762q0)) {
            return this.S0;
        }
        return this.H0;
    }

    public final long s1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) o2Var).a();
        }
        return this.Z;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        li liVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30742j0;
        if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f24244i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            this.calcMandatoryInsets = ((org.telegram.ui.sn) o2Var).C9();
        }
        e2();
        this.f30780v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7), 0);
            this.navBarColor = o10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f30761p2) {
            this.f30761p2 = false;
            z7 z7Var = this.f30714a1;
            z7Var.updateColors();
            z7Var.invalidate();
            A1();
        }
    }

    public final int t1() {
        li liVar = this.B0;
        fo foVar = this.m0;
        if (liVar == foVar && foVar.E != null) {
            return foVar.getEmojiPadding();
        }
        fo foVar2 = this.f30753n0;
        if (liVar == foVar2 && foVar2.E != null) {
            return foVar2.getEmojiPadding();
        }
        if (this.f30720c0) {
            return this.S0.getEmojiPadding();
        }
        return this.H0.getEmojiPadding();
    }

    public final int u1(int i10) {
        li liVar = this.C0;
        int[] iArr = this.f30728e2;
        if (liVar != null && ((this.B0 instanceof bn) || (liVar instanceof bn))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f30723d0);
        }
        return iArr[i10];
    }

    public final int v1(boolean z10) {
        boolean q6;
        int i10;
        z7 z7Var;
        if (this.f30747k2) {
            return getThemedColor(org.telegram.ui.ActionBar.k6.f21489tg);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Iterator it = this.f30752n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            long longValue = ((Long) gVar.f17456a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.r.a(f7, 0.0f, 1.0f);
        if (z10 && (z7Var = this.f30714a1) != null && z7Var.getVisibility() == 0) {
            a2 *= 1.0f - z7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.k6.f21125a7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21271i5;
        }
        return i0.a.f(a2, themedColor, getThemedColor(i10));
    }

    public final void w1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.w1():void");
    }

    public final boolean x1() {
        if (this.f30720c0) {
            li liVar = this.B0;
            if (liVar == this.f30742j0 || liVar == this.f30762q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        ri riVar = this.f30722c2;
        if (riVar != null && !this.f30788x1) {
            boolean u10 = riVar.u();
            this.f30788x1 = true;
            ai.y7 y7Var = new ai.y7(this, editTextBoldCursor, z10, 19);
            if (u10) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(y7Var, j10);
        }
    }

    @Override
    public final void dismiss() {
        ci ciVar;
        zh zhVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        li liVar = this.B0;
        al alVar = this.f30783w0;
        boolean z10 = (liVar != alVar || alVar == null || alVar.K || alVar.P0 == null) ? false : true;
        this.f30787x0 = z10;
        if (!z10 && (zhVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        if (!this.f30787x0 && (ciVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(ciVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.f30730f0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.G2 && o2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.F2) {
                return;
            }
            this.F2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new dh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20678a.setOnCancelListener(new jh(this, 0));
            a1 a1Var = new a1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.N = a1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, this.resourcesProvider);
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30794z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar2 = liVarArr[i10];
            if (liVar2 != null && this.B0 != liVar2) {
                liVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7), 0), true, (AndroidUtilities.IntColorCallback) new dh(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.f30749l2 = false;
        super.dismiss();
        this.G2 = false;
    }

    @Override
    public final void H(float f7, int i10) {
    }

    public ti(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}
