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
import android.view.ViewParent;
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
import org.telegram.ui.zh1;
public class ti extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, ne.d {
    public static final int R2 = 0;
    public final LongSparseArray A0;
    public final wh A1;
    public double[] A2;
    public li B0;
    public final xh B1;
    public boolean B2;
    public li C0;
    public final s4.b0 C1;
    public boolean C2;
    public final dh.d D0;
    public final qi D1;
    public boolean D2;
    public final i0 E;
    public final dh.d E0;
    public boolean E1;
    public ei.i E2;
    public boolean F;
    public final ig.j F0;
    public final RadialProgressView F1;
    public final bh.f F2;
    public boolean G;
    public final wh G0;
    public boolean G1;
    public final gh.d G2;
    public boolean H;
    public final zh H0;
    public final q6 H1;
    public final gh.d H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final gh.c I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final bh.b J2;
    public int K;
    public final wh K0;
    public MessageObject K1;
    public final bh.b K2;
    public int L;
    public final ei L0;
    public boolean L1;
    public final kh L2;
    public boolean M;
    public final TextPaint M0;
    public final int M1;
    public final ArrayList M2;
    public boolean N;
    public final RectF N0;
    public boolean N1;
    public final RectF N2;
    public boolean O;
    public final Paint O0;
    public boolean O1;
    public final RectF O2;
    public boolean P;
    public AnimatorSet P0;
    public boolean P1;
    public final RectF P2;
    public c50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ah.v R0;
    public boolean R1;
    public final me0 S;
    public final ci S0;
    public boolean S1;
    public go T;
    public int T0;
    public boolean T1;
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
    public boolean f30529a0;
    public final z7 f30530a1;
    public ValueAnimator a2;
    public final ne.b f30531b;
    public final bh.c f30532b0;
    public AnimatorSet f30533b1;
    public int f30534b2;
    public final ne.b f30535c;
    public boolean f30536c0;
    public AnimatorSet f30537c1;
    public ri f30538c2;
    public final ne.b d;
    public float f30539d0;
    public final org.telegram.ui.ActionBar.u0 f30540d1;
    public pn f30541d2;
    public final ne.b e;
    public final hi f30542e0;
    public final ei.u f30543e1;
    public final int[] f30544e2;
    public final ne.b f30545f;
    public final org.telegram.ui.ActionBar.n2 f30546f0;
    public final org.telegram.ui.ActionBar.u0 f30547f1;
    public int f30548f2;
    public final boolean f30549g0;
    public ei.x3 f30550g1;
    public float f30551g2;
    public final ne.b h;
    public mf f30552h0;
    public final org.telegram.ui.ActionBar.u0 f30553h1;
    public float f30554h2;
    public boolean f30555i0;
    public final di.n f30556i1;
    public boolean f30557i2;
    public final ChatAttachAlertPhotoLayout f30558j0;
    public float f30559j1;
    public float f30560j2;
    public xj f30561k0;
    public float f30562k1;
    public final boolean f30563k2;
    public fj f30564l0;
    public final wh l1;
    public boolean f30565l2;
    public fo m0;
    public final TextView f30566m1;
    public final ArrayList f30567m2;
    public final ne.l f30568n;
    public fo f30569n0;
    public final org.telegram.ui.ActionBar.u0 f30570n1;
    public final Rect f30571n2;
    public rl f30572o0;
    public final LinearLayout f30573o1;
    public float f30574o2;
    public nk f30575p0;
    public final ImageView f30576p1;
    public boolean f30577p2;
    public bn f30578q0;
    public final LinearLayout f30579q1;
    public int f30580q2;
    public org.telegram.ui.on f30581r;
    public ij f30582r0;
    public final TextView f30583r1;
    public final hi f30584r2;
    public final q6 f30585s;
    public ig.i0 f30586s0;
    public float f30587s1;
    public o1.k f30588s2;
    public ok f30589t0;
    public boolean f30590t1;
    public AnimatorSet f30591t2;
    public ok f30592u0;
    public final ji f30593u1;
    public boolean f30594u2;
    public final q6 v;
    public ki.q f30595v0;
    public boolean f30596v1;
    public boolean f30597v2;
    public final ImageView f30598w;
    public al f30599w0;
    public Object f30600w1;
    public ml f30601w2;
    public final i0 f30602x;
    public boolean f30603x0;
    public boolean f30604x1;
    public boolean f30605x2;
    public final ImageView f30606y;
    public float f30607y0;
    public final kh.f f30608y1;
    public boolean f30609y2;
    public final li[] f30610z0;
    public final yh f30611z1;
    public File f30612z2;

    public ti(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        TextPaint textPaint;
        ne.l lVar;
        int i10;
        float f7;
        di.n nVar;
        bs bsVar = bs.h;
        this.f30531b = new ne.b(0, this, bsVar, 380L, false);
        this.f30535c = new ne.b(1, this, bsVar, 380L, false);
        this.d = new ne.b(2, this, bsVar, 380L, false);
        this.e = new ne.b(3, this, bsVar, 380L, false);
        this.f30545f = new ne.b(4, this, bsVar, 380L, true);
        this.h = new ne.b(5, this, bsVar, 320L, false);
        ne.l lVar2 = new ne.l(new dh(this, 2), bsVar, 380L);
        this.f30568n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f30539d0 = 0.0f;
        this.f30542e0 = new hi(this, 0);
        this.f30555i0 = false;
        li[] liVarArr = new li[12];
        this.f30610z0 = liVarArr;
        this.A0 = new LongSparseArray();
        this.J0 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
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
        this.f30534b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f30544e2 = new int[2];
        new Paint(1);
        this.f30565l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f30567m2 = arrayList;
        Rect rect = new Rect();
        this.f30571n2 = rect;
        this.f30584r2 = new hi(this, 1);
        this.f30594u2 = true;
        this.f30597v2 = false;
        this.C2 = false;
        this.D2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.M2 = arrayList2;
        RectF rectF = new RectF();
        this.N2 = rectF;
        RectF rectF2 = new RectF();
        this.O2 = rectF2;
        RectF rectF3 = new RectF();
        this.P2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.Q2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        gh.c cVar = new gh.c();
        this.I2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.H2 = dVar;
            dVar.k(new le.b(this, 8));
            gh.d dVar2 = new gh.d(null);
            this.G2 = dVar2;
            dVar2.k(new k2.w0(this, 11));
            bh.b bVar = new bh.b(dVar);
            this.J2 = bVar;
            bVar.f4360i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.K2 = bVar2;
            bVar2.f4360i = LiteMode.isEnabled(262144);
        } else {
            this.F2 = null;
            this.G2 = null;
            this.H2 = null;
            this.J2 = new bh.b(cVar);
            this.K2 = new bh.b(cVar);
        }
        bh.b bVar3 = new bh.b(cVar);
        this.L2 = new kh(this, 0);
        this.f30563k2 = z10;
        this.f30549g0 = (n2Var instanceof org.telegram.ui.qn) && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30546f0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ji jiVar = new ji(this, context);
        this.f30593u1 = jiVar;
        jiVar.setDelegate(new ki(this));
        this.containerView = jiVar;
        jiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        z7 z7Var = new z7(this, context, d6Var, 1);
        this.f30530a1 = z7Var;
        z7Var.S0 = true;
        z7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i13 = org.telegram.ui.ActionBar.h6.f21096j5;
        z7Var.C(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        z7Var.B(getThemedColor(i14), false);
        z7Var.setTitleColor(getThemedColor(i13));
        z7Var.setOccupyStatusBar(true);
        z7Var.setAlpha(0.0f);
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 11));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, d6Var);
        this.f30540d1 = u0Var2;
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
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, d6Var);
        this.f30547f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ei.u uVar = new ei.u();
        this.f30543e1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        u0Var3.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 6, -1));
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        di.n nVar2 = new di.n(this, context);
        nVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        nVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        w7.b6.a(nVar2);
        this.f30556i1 = nVar2;
        a2();
        if (n2Var != null) {
            textPaint = textPaint2;
            lVar = lVar2;
            nVar = nVar2;
            u0Var = u0Var3;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, d6Var);
            this.f30553h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i10 = -1;
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 6, -1));
            u0Var4.setOnClickListener(new ci.h2(5, this, z11));
        } else {
            u0Var = u0Var3;
            textPaint = textPaint2;
            lVar = lVar2;
            i10 = -1;
            f7 = 14.0f;
            nVar = nVar2;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, d6Var);
        this.f30570n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 3, i10));
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ti f27275b;

            {
                this.f27275b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.qn qnVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f27275b;
                        zh zhVar = tiVar.H0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), d6Var);
                            e0Var.n0(zhVar.getText());
                            e0Var.f25661j0 = new Utilities.Callback() {
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
                            e0Var.f25663l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25664n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f27275b;
                        ci ciVar = tiVar2.S0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), d6Var);
                            e0Var2.n0(ciVar.getText());
                            e0Var2.f25661j0 = new Utilities.Callback() {
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
                            e0Var2.f25663l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25664n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f27275b;
                        tiVar3.f30570n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar3.f30546f0;
                        u12.M2(null, n2Var2, d6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i15 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i15;
                        u13.f33356n = z15;
                        if (!tiVar3.f30538c2.v()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
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
                        if (n2Var2 instanceof org.telegram.ui.qn) {
                            qnVar = (org.telegram.ui.qn) n2Var2;
                        } else {
                            qnVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, vhVar, qnVar);
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
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        wh whVar = new wh(this, context, 0);
        this.l1 = whVar;
        whVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        whVar.setAlpha(0.0f);
        whVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30573o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f30566m1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f30576p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        whVar.addView(linearLayout, w7.z5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30579q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f30583r1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        whVar.addView(linearLayout2, w7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.f30558j0 = chatAttachAlertPhotoLayout;
        liVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30608y1 = view;
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
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f30553h1;
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
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        xhVar.f27599x2 = true;
        xhVar.setOverScrollMode(2);
        bh.b bVar4 = this.J2;
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f4358f = jVar;
        bVar4.f4359g = viewGroup2;
        bh.b bVar5 = this.K2;
        ih.j jVar2 = new ih.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f4358f = jVar2;
        bVar5.f4359g = viewGroup3;
        ih.j jVar3 = new ih.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        bVar3.f4358f = jVar3;
        bVar3.f4359g = viewGroup4;
        yh yhVar = new yh(this, context, 0);
        this.f30611z1 = yhVar;
        bh.c cVar2 = new bh.c(bVar3.c(yhVar, null, false));
        this.f30532b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(yhVar, w7.z5.g());
        dh.d c10 = this.J2.c(whVar2, fh.c.f(d6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        whVar2.setBackground(c10);
        xhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        xhVar.setClipToOutline(true);
        ci.o1 o1Var = zf.j0.f51581a;
        xhVar.setOutlineProvider(new zf.i0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        xhVar.setImportantForAccessibility(1);
        whVar2.addView(xhVar, w7.z5.g());
        this.containerView.addView(whVar2, w7.z5.e(-1, 70, 81));
        xhVar.setOnItemClickListener(new ci.y4(9, this, d6Var));
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
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
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
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f21395z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        wh whVar3 = new wh(this, context, 2);
        this.G0 = whVar3;
        ig.j jVar4 = new ig.j(this, context);
        this.F0 = jVar4;
        whVar3.addView(jVar4, w7.z5.e(-1, -1, 119));
        dh.d c11 = this.K2.c(jiVar, fh.c.n(d6Var), false);
        this.D0 = c11;
        c11.f8017m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f8014j.f8000g = 0.4f;
        c11.k();
        dh.d c12 = this.J2.c(jVar4, fh.c.n(d6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar4.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        whVar3.setWillNotDraw(false);
        whVar3.setVisibility(4);
        whVar3.setAlpha(0.0f);
        this.containerView.addView(whVar3, w7.z5.e(-1, -2, 83));
        whVar3.setOnTouchListener(new di.d(13));
        q6 q6Var2 = new q6(context, false, false, false);
        this.f30585s = q6Var2;
        q6Var2.setAllowCancel(true);
        q6Var2.setScaleProperty(0.6f);
        q6Var2.setVisibility(8);
        q6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i15 = org.telegram.ui.ActionBar.h6.f21378y6;
        q6Var2.setTextColor(getThemedColor(i15));
        q6Var2.setTypeface(AndroidUtilities.bold());
        q6Var2.setGravity(17);
        jVar4.addView(q6Var2, w7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30598w = imageView4;
        i0 i0Var = new i0(context);
        this.f30602x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.h6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        int i17 = org.telegram.ui.ActionBar.h6.f21079i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        jVar4.addView(imageView4, w7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ti f27275b;

            {
                this.f27275b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.qn qnVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f27275b;
                        zh zhVar = tiVar.H0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), d6Var);
                            e0Var.n0(zhVar.getText());
                            e0Var.f25661j0 = new Utilities.Callback() {
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
                            e0Var.f25663l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25664n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f27275b;
                        ci ciVar = tiVar2.S0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), d6Var);
                            e0Var2.n0(ciVar.getText());
                            e0Var2.f25661j0 = new Utilities.Callback() {
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
                            e0Var2.f25663l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25664n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f27275b;
                        tiVar3.f30570n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar3.f30546f0;
                        u12.M2(null, n2Var2, d6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i152 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i152;
                        u13.f33356n = z15;
                        if (!tiVar3.f30538c2.v()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
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
                        if (n2Var2 instanceof org.telegram.ui.qn) {
                            qnVar = (org.telegram.ui.qn) n2Var2;
                        } else {
                            qnVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, vhVar, qnVar);
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
        zh zhVar = new zh(this, context, jiVar, d6Var);
        this.H0 = zhVar;
        zhVar.J = true;
        zhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        zhVar.s();
        zhVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        zhVar.getEditText().addTextChangedListener(new bi(this, 0));
        jVar4.addView(zhVar, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar4.setClipChildren(false);
        whVar3.setClipChildren(false);
        zhVar.setClipChildren(false);
        vVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar.setWillNotDraw(false);
        ci ciVar = new ci(this, context, jiVar, d6Var);
        this.S0 = ciVar;
        ciVar.J = true;
        ciVar.getEditText().addTextChangedListener(new di(this, n2Var));
        ciVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        ciVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        ciVar.getEditText().setTextSize(1, 17.0f);
        ciVar.getEmojiButton().setLayoutParams(w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        ciVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar.addView(ciVar, w7.z5.e(-1, -2, 119));
        vVar.setAlpha(0.0f);
        vVar.setVisibility(8);
        zhVar.addView(imageView3, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        dh.d c13 = this.J2.c(vVar, fh.c.n(d6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        vVar.setBackground(c13);
        vVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        q6 q6Var3 = new q6(context, false, false, false);
        this.v = q6Var3;
        q6Var3.setScaleProperty(0.6f);
        q6Var3.setVisibility(8);
        q6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var3.setTextColor(getThemedColor(i15));
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setGravity(17);
        q6Var3.setAllowCancel(true);
        vVar.addView(q6Var3, w7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Xd), mode2));
        ciVar.addView(imageView5, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30606y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        vVar.addView(imageView6, w7.z5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ti f27275b;

            {
                this.f27275b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.qn qnVar;
                switch (r3) {
                    case 0:
                        final ti tiVar = this.f27275b;
                        zh zhVar2 = tiVar.H0;
                        if (zhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), d6Var);
                            e0Var.n0(zhVar2.getText());
                            e0Var.f25661j0 = new Utilities.Callback() {
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
                            e0Var.f25663l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25664n0 = mhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ti tiVar2 = this.f27275b;
                        ci ciVar2 = tiVar2.S0;
                        if (ciVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), d6Var);
                            e0Var2.n0(ciVar2.getText());
                            e0Var2.f25661j0 = new Utilities.Callback() {
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
                            e0Var2.f25663l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25664n0 = mhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ti tiVar3 = this.f27275b;
                        tiVar3.f30570n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar3.f30546f0;
                        u12.M2(null, n2Var2, d6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i152 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i152;
                        u13.f33356n = z15;
                        if (!tiVar3.f30538c2.v()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
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
                        if (n2Var2 instanceof org.telegram.ui.qn) {
                            qnVar = (org.telegram.ui.qn) n2Var2;
                        } else {
                            qnVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, vhVar, qnVar);
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
        ei eiVar = new ei(R.drawable.send_plane_24, context, d6Var, this);
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
        eiVar.f31242h0 = true;
        eiVar.setOnClickListener(new View.OnClickListener(this) {
            public final ti f26892b;

            {
                this.f26892b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ti tiVar = this.f26892b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ti tiVar2 = this.f26892b;
                        boolean z14 = tiVar2.f30536c0;
                        if (!z14) {
                            tiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ti tiVar3 = this.f26892b;
                        boolean z15 = tiVar3.f30536c0;
                        if (z15) {
                            tiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26892b.C1();
                        return;
                    case 4:
                        this.f26892b.f30540d1.M(null, null);
                        return;
                    case 5:
                        ti.w(this.f26892b);
                        return;
                    case 6:
                        li liVar = this.f26892b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26892b.f30570n1.M(null, null);
                        return;
                    default:
                        ti tiVar4 = this.f26892b;
                        if (tiVar4.B0 != tiVar4.f30578q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tiVar4.d2(z13);
                        return;
                }
            }
        });
        eiVar.setOnLongClickListener(new org.telegram.ui.zf(this, context, d6Var, n2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        yh yhVar2 = new yh(this, context, 1);
        yhVar2.setAlpha(0.0f);
        yhVar2.setScaleX(0.2f);
        yhVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        ql0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        bh.b bVar6 = this.J2;
        eh.e n10 = fh.c.n(d6Var);
        jm0 jm0Var = fastScroll.f29650o0;
        dh.d c14 = bVar6.c(jm0Var.f27559d1, n10, false);
        fastScroll.f29639e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f29639e0.q(AndroidUtilities.dp(24.0f));
        dh.d c15 = bVar6.c(jm0Var.f27559d1, n10, false);
        fastScroll.f29641f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f29641f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f29641f0.q(AndroidUtilities.dp(f7));
        me0 me0Var = new me0(context);
        this.S = me0Var;
        this.containerView.addView(me0Var, w7.z5.c(-1.0f, -1));
        eh.e eVar = new eh.e(d6Var);
        eVar.e = new dh(this, 4);
        eVar.f8659c = new dh(this, 5);
        eVar.d = new dh(this, 6);
        eVar.f8658b = new dh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8661n = dpf2;
        eVar.f8662r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8660f = dpf23;
        eVar.h = dpf24;
        z7Var.M(this.J2, eVar, false);
        lVar.h(1L, false);
    }

    public static void O(ti tiVar) {
        boolean z10;
        boolean q6;
        int i10;
        z7 z7Var = tiVar.f30530a1;
        kh.f fVar = tiVar.f30608y1;
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
            org.telegram.ui.ActionBar.d6 d6Var = tiVar.resourcesProvider;
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
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

    public static void S(ti tiVar) {
        ei.i iVar = new ei.i(tiVar, tiVar.getContext(), tiVar.Z, LaunchActivity.R(), tiVar.resourcesProvider, 1);
        tiVar.E2 = iVar;
        iVar.p(new ki.t1(tiVar, 14));
        ViewGroup viewGroup = tiVar.containerView;
        viewGroup.addView(tiVar.E2, viewGroup.indexOfChild(tiVar.G0), w7.z5.e(-1, -1, 83));
        ei.i iVar2 = tiVar.E2;
        iVar2.getAdapter().f11921c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30546f0;
        boolean z10 = true;
        if (n2Var instanceof org.telegram.ui.qn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var;
            hg.j1 adapter = iVar2.getAdapter();
            qnVar.i();
            TLRPC.Chat chat = qnVar.e;
            adapter.getClass();
            adapter.f11932l0 = chat;
            iVar2.getAdapter().W(qnVar.Z7);
            hg.j1 adapter2 = iVar2.getAdapter();
            if (qnVar.e == null) {
                z10 = false;
            }
            adapter2.f11924e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f11924e0 = false;
        }
        iVar2.getAdapter().f11926f0 = false;
        tiVar.Y1();
    }

    public static void n(ti tiVar, ValueAnimator valueAnimator) {
        tiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = tiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static void p(ti tiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        tiVar.currentSheetAnimation = null;
        tiVar.f30588s2 = null;
        animationNotificationsLocker.unlock();
        tiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
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

    public static boolean q(org.telegram.ui.Components.ti r45, android.content.Context r46, org.telegram.ui.ActionBar.d6 r47, org.telegram.ui.ActionBar.n2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.q(org.telegram.ui.Components.ti, android.content.Context, org.telegram.ui.ActionBar.d6, org.telegram.ui.ActionBar.n2, android.view.View):boolean");
    }

    public static void s(ti tiVar) {
        o1.k kVar = tiVar.f30588s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(tiVar.containerView, o1.h.f17542n, 0.0f);
        tiVar.f30588s2 = kVar2;
        kVar2.f17559u.a(1.5f);
        tiVar.f30588s2.f17559u.b(1500.0f);
        tiVar.f30588s2.h();
    }

    public static void t(ti tiVar, lg lgVar) {
        AnimatorSet animatorSet = tiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            lgVar.run();
        }
    }

    public static void u(ti tiVar, int i10) {
        tiVar.navBarColorKey = -1;
        tiVar.navBarColor = i10;
        tiVar.containerView.invalidate();
    }

    public static void v(ti tiVar) {
        tiVar.currentSheetAnimation = null;
        tiVar.currentSheetAnimationType = 0;
        tiVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20423id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f20423id != 489000 && !MessagesController.isSupportUser(user)) {
            return true;
        }
        return false;
    }

    public static void w(ti tiVar) {
        int i10;
        if (tiVar.f30558j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30558j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24079s1;
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
        tiVar.c2(true);
        org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30547f1;
        ei.x3 x3Var = tiVar.f30550g1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = new ei.x3(tiVar.getContext(), 1);
        tiVar.f30550g1 = x3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        x3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        tiVar.f30550g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tiVar.f30550g1.m(1.0f, -((tiVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        tiVar.f30550g1.setTranslationY(tiVar.f30540d1.getTranslationY());
        ei.x3 x3Var3 = tiVar.f30550g1;
        x3Var3.f10080l0 = new ee(3, tiVar, x3Var2);
        tiVar.containerView.addView(x3Var3, w7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        tiVar.f30550g1.u();
    }

    public static void x(ti tiVar, boolean z10, gh ghVar) {
        Integer num;
        tiVar.B0.v(1.0f);
        tiVar.C0.v(1.0f);
        tiVar.B0.l(tiVar.f30574o2);
        tiVar.C0.l(tiVar.f30574o2);
        tiVar.containerView.invalidate();
        z7 z7Var = tiVar.f30530a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        z7Var.setTag(num);
        ghVar.run();
    }

    public static void y(ti tiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int i10;
        xh xhVar = tiVar.B1;
        li[] liVarArr = tiVar.f30610z0;
        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30546f0;
        if (n2Var2 == null) {
            n2Var = LaunchActivity.R();
        } else {
            n2Var = n2Var2;
        }
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (view instanceof ni) {
                Activity parentActivity = n2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (tiVar.O1 || tiVar.P1 || !tiVar.c1()) {
                        if (!tiVar.O1 && !tiVar.P1) {
                            go goVar = new go(1, tiVar.getContext(), d6Var, tiVar);
                            tiVar.T = goVar;
                            tiVar.U1(goVar);
                        }
                        tiVar.U1(tiVar.f30558j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (tiVar.f30599w0 == null && (n2Var2 instanceof org.telegram.ui.qn)) {
                        TLRPC.User i11 = ((org.telegram.ui.qn) n2Var2).i();
                        if (v1(i11)) {
                            al alVar = new al(tiVar, tiVar.getContext(), tiVar.M1, i11, d6Var);
                            tiVar.f30599w0 = alVar;
                            liVarArr[11] = alVar;
                        }
                    }
                    li liVar = tiVar.f30599w0;
                    if (liVar != null) {
                        tiVar.U1(liVar);
                    }
                } else if (i10 == 3) {
                    if (tiVar.Q1 || !tiVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        tiVar.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (tiVar.N1 || !tiVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
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
                } else if (i10 == 5) {
                    if (tiVar.T1 || !tiVar.c1()) {
                        if (tiVar.T1 && tiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        tiVar.G1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((tiVar.T1 || !tiVar.c1()) && AndroidUtilities.isMapsInstalled(n2Var2)) {
                        if (!tiVar.T1) {
                            go goVar2 = new go(6, tiVar.getContext(), d6Var, tiVar);
                            tiVar.T = goVar2;
                            tiVar.U1(goVar2);
                        } else {
                            if (tiVar.f30572o0 == null) {
                                Context context = tiVar.getContext();
                                if (tiVar.H || tiVar.U1) {
                                    z10 = false;
                                }
                                rl rlVar = new rl(tiVar, context, d6Var, z10);
                                tiVar.f30572o0 = rlVar;
                                liVarArr[5] = rlVar;
                                ml mlVar = tiVar.f30601w2;
                                if (mlVar != null) {
                                    rlVar.setDelegate(mlVar);
                                } else {
                                    rlVar.setDelegate(new dh(tiVar, 9));
                                }
                            }
                            tiVar.U1(tiVar.f30572o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (tiVar.R1 || !tiVar.c1()) {
                        if (!tiVar.R1) {
                            go goVar3 = new go(9, tiVar.getContext(), d6Var, tiVar);
                            tiVar.T = goVar3;
                            tiVar.U1(goVar3);
                        } else {
                            tiVar.W1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (tiVar.f30586s0 == null) {
                        ig.i0 i0Var = new ig.i0(tiVar.getContext(), tiVar.resourcesProvider, tiVar);
                        tiVar.f30586s0 = i0Var;
                        liVarArr[7] = i0Var;
                        i0Var.setupBlurredSearchField(tiVar.J2);
                    }
                    tiVar.U1(tiVar.f30586s0);
                } else if (i10 == 12) {
                    if (tiVar.S1 || !tiVar.c1()) {
                        if (!tiVar.S1) {
                            go goVar4 = new go(9, tiVar.getContext(), d6Var, tiVar);
                            tiVar.T = goVar4;
                            tiVar.U1(goVar4);
                        } else {
                            if (tiVar.f30569n0 == null) {
                                fo foVar = new fo(tiVar, tiVar.getContext(), true, d6Var, null);
                                tiVar.f30569n0 = foVar;
                                liVarArr[1] = foVar;
                                foVar.setDelegate(new dh(tiVar, 10));
                            }
                            tiVar.U1(tiVar.f30569n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (tiVar.f30592u0 == null) {
                        ok okVar = new ok(tiVar, tiVar.getContext(), d6Var, true);
                        tiVar.f30592u0 = okVar;
                        liVarArr[8] = okVar;
                        okVar.setDelegate(tiVar.f30541d2);
                    }
                    tiVar.U1(tiVar.f30592u0);
                } else if (i10 == 14) {
                    if (tiVar.f30589t0 == null) {
                        ok okVar2 = new ok(tiVar, tiVar.getContext(), d6Var, false);
                        tiVar.f30589t0 = okVar2;
                        liVarArr[9] = okVar2;
                        okVar2.setDelegate(tiVar.f30541d2);
                    }
                    tiVar.U1(tiVar.f30589t0);
                } else if (i10 == 16) {
                    if (tiVar.f30595v0 == null) {
                        ki.q qVar = new ki.q(tiVar.M1, tiVar.getContext(), d6Var, tiVar);
                        tiVar.f30595v0 = qVar;
                        liVarArr[10] = qVar;
                    }
                    tiVar.U1(tiVar.f30595v0);
                } else if (view.getTag() instanceof Integer) {
                    tiVar.f30538c2.b0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, tiVar.u1(), false, 0L);
                }
            } else if (view instanceof mi) {
                mi miVar = (mi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = miVar.f28525c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        zh1.a(tiVar.getContext(), new org.telegram.ui.ActionBar.j3(22, tiVar, miVar), null);
                    } else {
                        tiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    tiVar.f30538c2.X(miVar.f28524b);
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

    public static void z(ti tiVar) {
        li liVar;
        bn bnVar;
        tiVar.f30600w1 = null;
        li liVar2 = tiVar.B0;
        if (liVar2 != tiVar.f30558j0 && (liVar = tiVar.C0) != (bnVar = tiVar.f30578q0) && liVar2 != liVar && liVar2 != bnVar) {
            tiVar.containerView.removeView(liVar2);
        }
        tiVar.B0.setVisibility(8);
        tiVar.B0.t();
        tiVar.C0.I();
        tiVar.B0 = tiVar.C0;
        tiVar.C0 = null;
        int[] iArr = tiVar.f30544e2;
        iArr[0] = iArr[1];
        tiVar.K1(tiVar.f30536c0, false);
        tiVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30610z0;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (liVar != null) {
                    liVar.A();
                }
                i10++;
            } else {
                this.f30557i2 = true;
                return;
            }
        }
    }

    public final void B1() {
        int i10 = 0;
        this.f30557i2 = false;
        while (true) {
            li[] liVarArr = this.f30610z0;
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
            this.f30538c2.v();
        }
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (n2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var;
            MessageSuggestionParams messageSuggestionParams = qnVar.f40693g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!ai.ga.U(i10, messageSuggestionParams.amount)) {
                qnVar.Yb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f30585s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.L0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                S1(n2Var);
                return;
            }
            return;
        }
        if (this.K1 == null && (n2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) n2Var;
            if (qnVar2.c()) {
                f5.L(getContext(), qnVar2.a(), new dh(this, 12), this.resourcesProvider);
                return;
            }
        }
        li liVar = this.B0;
        if (liVar != this.f30558j0 && liVar != this.f30578q0) {
            if (!liVar.K(0, true, 0, u1(), this.Q0)) {
                this.D2 = true;
                dismiss();
                return;
            }
            return;
        }
        J1(0, true, 0, u1(), this.Q0);
    }

    public final void D1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (i10 == 3) {
            if (this.Q1 || !c1()) {
                if (n2Var != null) {
                    activity = n2Var.getParentActivity();
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
                E1(true);
            }
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
            if (this.f30572o0 == null) {
                rl rlVar = new rl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f30572o0 = rlVar;
                this.f30610z0[5] = rlVar;
                ml mlVar = this.f30601w2;
                if (mlVar != null) {
                    rlVar.setDelegate(mlVar);
                } else if (n2Var instanceof org.telegram.ui.qn) {
                    rlVar.setDelegate(new dh(this, 16));
                }
            }
            U1(this.f30572o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            go goVar = new go(3, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            U1(goVar);
        }
        int i10 = 1;
        if (this.f30564l0 == null) {
            fj fjVar = new fj(getContext(), this.resourcesProvider, this);
            this.f30564l0 = fjVar;
            this.f30610z0[3] = fjVar;
            fjVar.setupBlurredSearchField(this.J2);
            this.f30564l0.setDelegate(new dh(this, 13));
            if (this.H) {
                this.f30564l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            TLRPC.Chat chat = ((org.telegram.ui.qn) n2Var).e;
            fj fjVar2 = this.f30564l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            fjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.f30564l0);
        }
    }

    public final void F1() {
        if (this.f30582r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ?? liVar = new li(context, d6Var, this);
            liVar.f27280r = AndroidUtilities.dp(80.0f);
            liVar.f27282w = 3;
            ai.u1 u1Var = new ai.u1(liVar, context, d6Var, 12);
            liVar.f27279n = u1Var;
            za zaVar = new za(liVar, context);
            liVar.v = zaVar;
            u1Var.setAdapter(zaVar);
            u1Var.setClipToPadding(false);
            u1Var.setItemAnimator(null);
            u1Var.setLayoutAnimation(null);
            u1Var.setVerticalScrollBarEnabled(false);
            u1Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, liVar.f28172a));
            liVar.addView(u1Var, w7.z5.c(-1.0f, -1));
            u1Var.setOnScrollListener(new ah.d0(liVar, 22));
            di.k kVar = new di.k(liVar, liVar.f27280r, 1);
            liVar.f27281s = kVar;
            kVar.O = new ai.q1(liVar, 3);
            u1Var.setLayoutManager(kVar);
            this.f30582r0 = liVar;
            liVar.setDelegate(new gb(this, 1));
        }
        U1(this.f30582r0);
    }

    public final void G1() {
        boolean z10;
        if (!this.T1) {
            go goVar = new go(5, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            U1(goVar);
        }
        if (this.f30561k0 == null) {
            xj xjVar = new xj(getContext(), this.resourcesProvider, this);
            this.f30561k0 = xjVar;
            this.f30610z0[2] = xjVar;
            xjVar.setupBlurredSearchField(this.J2);
            this.f30561k0.setDelegate(new fi(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            TLRPC.Chat chat = ((org.telegram.ui.qn) n2Var).e;
            xj xjVar2 = this.f30561k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            xjVar2.setMultipleSelectionAllowed(z10);
        }
        U1(this.f30561k0);
    }

    public final void H1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            go goVar = new go(4, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            U1(goVar);
        }
        boolean z11 = false;
        if (this.f30575p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            nk nkVar = new nk(i10, getContext(), this.resourcesProvider, this);
            this.f30575p0 = nkVar;
            this.f30610z0[4] = nkVar;
            nkVar.setDelegate(new gi(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f30575p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
            if (n2Var instanceof org.telegram.ui.qn) {
                TLRPC.Chat chat = ((org.telegram.ui.qn) n2Var).e;
                nk nkVar2 = this.f30575p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                nkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f30575p0.setMaxSelectedFiles(this.V1);
                nk nkVar3 = this.f30575p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                nkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        nk nkVar4 = this.f30575p0;
        nkVar4.f28819d0 = this.N;
        if (z10) {
            U1(nkVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        z7 z7Var = this.f30530a1;
        int i10 = 1;
        if (z7Var.f21497n0) {
            z7Var.h(true);
        }
        this.f30561k0 = null;
        this.f30586s0 = null;
        this.f30564l0 = null;
        this.m0 = null;
        this.f30569n0 = null;
        this.f30572o0 = null;
        this.f30575p0 = null;
        this.f30599w0 = null;
        while (true) {
            li[] liVarArr = this.f30610z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.o();
                this.containerView.removeView(liVarArr[i10]);
                liVarArr[i10] = null;
            }
            i10++;
        }
        X1(false, false);
        super.dismissInternal();
        if (this.f30603x0) {
            this.f30603x0 = false;
            this.f30607y0 = 0.0f;
            org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
            if (n2Var != null && n2Var.getFragmentView() != null) {
                View fragmentView = n2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f44826a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var;
            TLRPC.Chat chat = qnVar.e;
            if (qnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.M1).edit();
                edit.putBoolean("silent_" + qnVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (d1(o1().getText())) {
            return true;
        }
        a1();
        if (this.h.f17384f) {
            this.L1 = true;
            this.f30538c2.b0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long p12 = p1();
        li liVar = this.B0;
        if (liVar != null) {
            i12 = liVar.getSelectedItemsCount();
        }
        return f5.a0(this.M1, p12, l1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ti tiVar = ti.this;
                tiVar.L1 = true;
                tiVar.f30538c2.b0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void K1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f30531b.a(z10, z11);
        qu o12 = o1();
        this.f30536c0 = z10;
        qu o13 = o1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        li liVar = this.B0;
        if (liVar != this.f30558j0 && liVar != this.f30578q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f30536c0 && z13) {
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
                public final ti f26221b;

                {
                    this.f26221b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f26221b;
                            if (!z14 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f26221b.F0.setVisibility(8);
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
                public final ti f26221b;

                {
                    this.f26221b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ti tiVar = this.f26221b;
                            if (!z14 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f26221b.F0.setVisibility(8);
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
            f2();
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
        if (o12 != o13) {
            o12.k(true);
            o13.setText(a6.cloneSpans(o12.getText()));
            o13.getEditText().setAllowTextEntitiesIntersection(o12.getEditText().getAllowTextEntitiesIntersection());
            if (o12.getEditText().isFocused()) {
                o13.getEditText().requestFocus();
                o13.getEditText().setSelection(o12.getEditText().getSelectionStart(), o12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new gh(this, 0));
    }

    public final void L1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f30558j0) != null) {
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
        Z1(0);
    }

    public final void M1(float f7) {
        int i10;
        float translationY = this.containerView.getTranslationY() - this.f30607y0;
        this.f30607y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        al alVar = this.f30599w0;
        if (alVar != null) {
            alVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.e3 e3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        e3Var.setAlpha(i10);
        this.navigationBarAlpha = 1.0f - f7;
        getContainer().invalidate();
    }

    public final void N1(int i10, boolean z10) {
        if (this.K1 != null) {
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
    }

    public final void O1(float f7) {
        boolean z10 = false;
        int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = o10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void P1(String str) {
        boolean z10 = true;
        this.T0 = 1;
        this.F = true;
        this.V0 = false;
        this.P1 = false;
        this.A1.setVisibility(8);
        this.f30566m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
        if (chatAttachAlertPhotoLayout != null) {
            ti tiVar = chatAttachAlertPhotoLayout.f28173b;
            if (tiVar.T0 == 0 || tiVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f24095g1 = z10;
        }
    }

    public final void Q1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.Q1(boolean):void");
    }

    public final void R1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.R1(long, java.lang.String, boolean, boolean):void");
    }

    public final void S1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.qn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.qn) n2Var).e)) {
            new xc(this.f30593u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new ee(4, this, n2Var)).j();
        }
    }

    public final boolean T1(boolean z10, boolean z11) {
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
        this.f30535c.a(z10, true);
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
        if ((liVar2 == this.f30558j0 || liVar2 == this.f30578q0) && this.f30536c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        z7 z7Var2 = this.f30530a1;
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
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        eiVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1());
        }
        eiVar.i(l1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(li liVar) {
        long j10 = this.Z0;
        go goVar = this.T;
        if (liVar == goVar) {
            j10 = goVar.f26612s;
        } else if (liVar == this.f30558j0) {
            j10 = 1;
        } else if (liVar == this.f30564l0) {
            j10 = 3;
        } else if (liVar == this.f30575p0) {
            j10 = 4;
        } else if (liVar == this.f30561k0) {
            j10 = 5;
        } else if (liVar == this.f30572o0) {
            j10 = 6;
        } else if (liVar == this.m0) {
            j10 = 9;
        } else if (liVar == this.f30582r0) {
            j10 = 10;
        } else if (liVar == this.f30586s0) {
            j10 = 11;
        } else if (liVar == this.f30569n0) {
            j10 = 12;
        } else if (liVar == this.f30589t0) {
            j10 = 14;
        } else if (liVar == this.f30592u0) {
            j10 = 13;
        } else if (liVar == this.f30595v0) {
            j10 = 16;
        } else if (liVar == this.f30599w0) {
            j10 = 17;
        }
        V1(liVar, j10, true);
    }

    public final void V1(li liVar, long j10, boolean z10) {
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
        if (this.f30600w1 == null && this.P0 == null) {
            li liVar2 = this.B0;
            if (liVar2 == liVar) {
                liVar2.J();
            } else if (liVar == this.f30569n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new sg.y0(this.f30546f0, 39, false).show();
            } else {
                int i15 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30545f.a(z11, z10);
                this.f30568n.h(Long.valueOf(j10), z10);
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
                        if (niVar.f28799b == niVar.f28800c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar.f29051a.e(z13, true);
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
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f30544e2[0];
                this.C0 = liVar;
                boolean e = liVar.e();
                kh.f fVar = this.f30608y1;
                if (fVar != null) {
                    if (e) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                yh yhVar = this.f30611z1;
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
                z7 z7Var = this.f30530a1;
                z7Var.setVisibility(i10);
                if (z7Var.f21497n0) {
                    z7Var.h(true);
                }
                this.B0.u();
                li liVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
                if (liVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.F(this.B0);
                this.C0.setVisibility(0);
                if (liVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                ViewParent parent = this.C0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    li liVar4 = this.C0;
                    if (liVar4 != this.f30572o0) {
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
                hi hiVar = this.f30542e0;
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
                        animatorSet.setInterpolator(bs.f25021f);
                        animatorSet.addListener(new ai.c5(this, firstOffset, ghVar, 1));
                        this.f30600w1 = animatorSet;
                        hiVar.set(this.B0, f10);
                        animatorSet.start();
                    } else {
                        liVar5.setAlpha(0.0f);
                        ghVar.run();
                        e2(i11);
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
                        this.B0.l(this.f30574o2);
                        this.C0.l(this.f30574o2);
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
                if (this.f30577p2 && !(liVar instanceof gi.f4)) {
                    i12 = 0;
                    this.f30577p2 = false;
                    z7Var.d();
                    z7Var.invalidate();
                    x1();
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

    public final void W1(boolean z10, Boolean bool) {
        ti tiVar;
        if (this.m0 == null) {
            tiVar = this;
            fo foVar = new fo(tiVar, getContext(), false, this.resourcesProvider, bool);
            tiVar.m0 = foVar;
            tiVar.f30610z0[1] = foVar;
            foVar.setDelegate(new dh(this, 15));
        } else {
            tiVar = this;
        }
        V1(tiVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
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
        z7 z7Var = this.f30530a1;
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            z7Var.setTag(num);
            AnimatorSet animatorSet = this.f30533b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f30533b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f30590t1) && this.B0 == this.f30558j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            wh whVar = this.A1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30540d1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                whVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
            if (n2Var != null) {
                if (z10) {
                    if (this.f30563k2) {
                        i10 = org.telegram.ui.ActionBar.h6.f21296tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21061h5;
                    }
                    if (i0.a.h(getThemedColor(i10)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z13);
                } else {
                    AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
                }
            }
            float f14 = 0.6f;
            float f15 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f30533b1 = animatorSet2;
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
                this.f30533b1.playTogether(arrayList);
                this.f30533b1.addListener(new org.telegram.ui.fo(3, this, z10));
                this.f30533b1.setInterpolator(bs.h);
                this.f30533b1.setDuration(380L);
                this.f30533b1.start();
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f30553h1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f30590t1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void Y1() {
        float alpha;
        int[] iArr = this.J0;
        zh zhVar = this.H0;
        zhVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            li liVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
            if ((liVar == chatAttachAlertPhotoLayout || liVar == this.f30578q0) && this.f30536c0) {
                ah.v vVar = this.R0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.E2.getTop());
            } else {
                alpha = -zhVar.getHeight();
            }
            if (Math.abs(this.E2.getTranslationY() - alpha) > 0.5f) {
                this.E2.setTranslationY(alpha);
                this.E2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        i1();
    }

    public final void Z1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.Z1(int):void");
    }

    public final void a1() {
        if (o1().f29710a.length() <= 0) {
            return;
        }
        this.B0.a(o1().getText());
    }

    public final void a2() {
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
        di.n nVar = this.f30556i1;
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
                f11 = this.f30539d0;
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
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30539d0, f12, f7);
        }
        this.f30559j1 = f7;
        if (nVar != null) {
            float f13 = f7 * this.f30562k1;
            nVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            nVar.setVisibility(i10);
        }
    }

    public final void b1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.b1():void");
    }

    public final void b2(li liVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (liVar != null) {
            bh.f fVar = this.F2;
            if (fVar != null && Build.VERSION.SDK_INT >= 31) {
                fVar.f(0.0f, i10);
                b1();
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
                    X1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.mk.D(11.0f, i11, currentItemTop);
                li liVar2 = this.B0;
                if (liVar2 == liVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((liVar2 instanceof bn) || (this.C0 instanceof bn)) {
                    Object obj = this.f30600w1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f17552f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f30544e2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f30548f2 = i13;
                        return;
                    }
                    return;
                }
                this.f30548f2 = i13;
                iArr[i12] = D;
                e2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final boolean c1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if ((n2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) n2Var).N6()) {
            return true;
        }
        return false;
    }

    public final void c2(boolean z10) {
        ei.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f30543e1) != null) {
            int i10 = 0;
            if (this.f30590t1 && this.f30555i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f9872f = z12;
            if (!z10) {
                ((f6) uVar.f9873g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30547f1;
            if (z10 && this.f30590t1) {
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
            o1.k kVar = this.f30588s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f30591t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final boolean d1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            return ChatActivityEnterView.E(this.M1, ((org.telegram.ui.qn) n2Var).a(), n2Var, charSequence);
        }
        return false;
    }

    public final void d2(boolean z10) {
        boolean z11;
        float f7;
        li liVar = this.f30558j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f30578q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f30581r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                ?? liVar2 = new li(context, d6Var, this);
                liVar2.f24995y = 0.0f;
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
                liVar2.f24990n = d6Var;
                liVar2.f28175f = true;
                liVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y n10 = liVar2.f28173b.f30530a1.n();
                TextView textView = new TextView(context);
                liVar2.f24994x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = liVar2.f28172a;
                jm jmVar = new jm(liVar2, context, n10, d6Var2, 1);
                z7 z7Var = liVar2.f28173b.f30530a1;
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
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                jmVar.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.u1 u1Var = new ai.u1(liVar2, context, d6Var2, 15);
                liVar2.f24991r = u1Var;
                u1Var.setAdapter(new org.telegram.ui.z7(liVar2, 3));
                s4.b0 b0Var = new s4.b0(1, false);
                liVar2.f24992s = b0Var;
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
                liVar2.P = liVar2.f28173b.f30558j0;
                anVar.f24672c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.P;
                anVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                anVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                anVar.c();
                UndoView undoView = new UndoView(context, null, false, liVar2.f28173b.f30581r);
                liVar2.f24993w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                liVar2.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                liVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f30578q0 = liVar2;
                liVar2.bringToFront();
            }
            li liVar3 = this.B0;
            bn bnVar = this.f30578q0;
            if (liVar3 != bnVar) {
                liVar = bnVar;
            }
            U1(liVar);
            return;
        }
        U1(liVar);
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
            this.D2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        ri riVar = this.f30538c2;
        if (riVar != null) {
            riVar.u(new gh(this, 3));
        } else {
            I1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.q(i10);
    }

    public final void e1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        xh xhVar = this.B1;
        if (xhVar == null) {
            return;
        }
        int childCount = xhVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            xhVar.getChildAt(i20);
        }
        boolean z11 = this.f30563k2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.h6.f21069hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21096j5;
        }
        this.f30566m1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.h6.f21069hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        }
        this.f30583r1.setTextColor(getThemedColor(i11));
        this.f30556i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.h6.f21069hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f21096j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.u0 u0Var = this.f30540d1;
        u0Var.setIconColor(themedColor);
        Drawable background = u0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.h6.f21087ig;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.I5;
        }
        org.telegram.ui.ActionBar.h6.x1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.h6.E8;
        u0Var.G(getThemedColor(i21), false);
        u0Var.G(getThemedColor(i21), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30547f1;
        if (u0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.h6.f21069hg;
            } else {
                i19 = org.telegram.ui.ActionBar.h6.f21096j5;
            }
            u0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30553h1;
        if (u0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.h6.f21069hg;
            } else {
                i17 = org.telegram.ui.ActionBar.h6.f21096j5;
            }
            u0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = u0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.h6.f21087ig;
            } else {
                i18 = org.telegram.ui.ActionBar.h6.I5;
            }
            org.telegram.ui.ActionBar.h6.x1(getThemedColor(i18), background2);
        }
        zh zhVar = this.H0;
        org.telegram.ui.ActionBar.d6 d6Var = zhVar.M;
        lu luVar = zhVar.f29710a;
        int i22 = zhVar.L;
        if (i22 == 0) {
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            int i23 = org.telegram.ui.ActionBar.h6.G6;
            luVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i23, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i23, d6Var));
        } else if (i22 != 2 && i22 != 3) {
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21285t5, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, d6Var));
        } else {
            luVar.setHintTextColor(-1929379841);
            luVar.setTextColor(-1);
            luVar.setCursorColor(-1);
            luVar.setHandlesColor(-1);
            luVar.setHighlightColor(822083583);
            luVar.quoteColor = -1;
        }
        zhVar.f29712c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        mu muVar = zhVar.d;
        if (muVar != null) {
            muVar.S();
        }
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.h6.f21069hg;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.f21096j5;
        }
        int themedColor2 = getThemedColor(i14);
        z7 z7Var = this.f30530a1;
        z7Var.C(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.h6.f21087ig;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.I5;
        }
        z7Var.B(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.h6.f21069hg;
        } else {
            i16 = org.telegram.ui.ActionBar.h6.f21096j5;
        }
        z7Var.setTitleColor(getThemedColor(i16));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
        gh.c cVar = this.I2;
        if (cVar.f11055a.getColor() != s12) {
            cVar.a(s12);
            kh.f fVar = this.f30608y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.f30611z1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            li[] liVarArr = this.f30610z0;
            if (i24 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i24];
            if (liVar != null) {
                liVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21078i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5));
    }

    public final void e2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.e2(int):void");
    }

    public final void f1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.f1(boolean):void");
    }

    public final void f2() {
        int i10 = 0;
        e2(0);
        this.f30593u1.invalidate();
        ah.v vVar = this.R0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
        if (chatAttachAlertPhotoLayout != null) {
            em emVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (emVar != null && emVar.getFastScroll() != null) {
                ql0 fastScroll = emVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f24112p1;
                if (this.f30536c0) {
                    i10 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.f29643h0 = currentActionBarHeight + i10;
                emVar.getFastScroll().invalidate();
            }
        }
        Y1();
        i1();
    }

    public final void g1() {
        float f7 = this.f30535c.e;
        float f10 = (1.0f - this.f30531b.e) * f7;
        this.f30611z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30610z0;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (liVar != null && (themeDescriptions = liVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21078i5));
                return arrayList;
            }
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    public final void h1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f30545f.e;
        float b10 = zf.f0.b(this.h.e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        h20.d(this.I0, com.google.android.gms.internal.play_billing.k3.C(f10, f11, b10, f7));
    }

    public final void i1() {
        ei eiVar = this.L0;
        wh whVar = this.K0;
        ah.v vVar = this.R0;
        if (vVar != null && vVar.getVisibility() == 0 && vVar.getAlpha() != 0.0f) {
            float f7 = this.f30531b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            eiVar.setAlpha(abs * abs * abs * abs);
            whVar.setTranslationY(AndroidUtilities.lerp(this.f30560j2, ((vVar.getTranslationY() + vVar.getTop()) - whVar.getTop()) + AndroidUtilities.dp(8.0f), bs.f25024j.getInterpolation(f7)));
            return;
        }
        whVar.setTranslationY(this.f30560j2);
        eiVar.setAlpha(1.0f);
    }

    public final void j1(int i10) {
        this.V0 = true;
        this.A1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.T0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30570n1;
        if (u0Var != null) {
            this.f30566m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void k1(hg.o oVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f30566m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f30555i0 = false;
        this.J = oVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30570n1;
        if (u0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            u0Var.setVisibility(0);
            u0Var.setClickable(true);
            u0Var.setAlpha(1.0f);
            u0Var.setScaleX(1.0f);
            u0Var.setScaleY(1.0f);
        }
    }

    public final int l1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if ((n2Var instanceof org.telegram.ui.qn) && (messagePreviewParams = ((org.telegram.ui.qn) n2Var).f40682f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) n2Var).e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float n1() {
        wh whVar = this.G0;
        float alpha = 1.0f - whVar.getAlpha();
        return whVar.getMeasuredHeight() - (alpha * (whVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final qu o1() {
        li liVar;
        if (this.f30536c0 && ((liVar = this.B0) == this.f30558j0 || liVar == this.f30578q0)) {
            return this.S0;
        }
        return this.H0;
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
        z7 z7Var = this.f30530a1;
        if (z7Var.f21497n0) {
            z7Var.h(true);
        } else if (this.B0.j()) {
        } else {
            if (o1() != null && o1().e) {
                o1().k(true);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final al alVar = this.f30599w0;
        if (alVar != null && this.B0 == alVar) {
            final gh ghVar = new gh(this, 1);
            int i10 = alVar.f24648n;
            org.telegram.ui.Wallet.h9 h9Var = alVar.O;
            ti tiVar = alVar.f28173b;
            AnimatorSet animatorSet = null;
            if (!alVar.H && (wallettransaction = alVar.M0) != null && alVar.N0 == null && alVar.O0 == null) {
                if (alVar.P0) {
                    org.telegram.ui.Wallet.o5 o5Var = new org.telegram.ui.Wallet.o5();
                    o5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30546f0;
                    if (n2Var != null && n2Var.presentFragment(o5Var, false, true)) {
                        org.telegram.ui.Wallet.v9 v9Var = new org.telegram.ui.Wallet.v9(tiVar.getContainer(), tiVar.getSheetContainer(), h9Var.getDiamondView(), o5Var, alVar.M0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!alVar.H) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!alVar.H) {
                                            ghVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, tiVar);
                        alVar.O0 = v9Var;
                        animatorSet = v9Var.f35039m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m6 diamondView = h9Var.getDiamondView();
                    if (diamondView.f34524f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30546f0;
                        if (n2Var2 instanceof org.telegram.ui.qn) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var2;
                            if (qnVar.getCurrentAccount() == i10 && qnVar.a() == alVar.f24653r.f20423id && qnVar.R3 == 0 && qnVar.getFragmentView() != null && qnVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.e6 e6Var = new org.telegram.ui.Wallet.e6(tiVar.getContainer(), tiVar.getSheetContainer(), h9Var.getDiamondView(), qnVar, alVar.M0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!alVar.H) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!alVar.H) {
                                                    ghVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, tiVar);
                                alVar.N0 = e6Var;
                                animatorSet = e6Var.f34163m;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
        y91 y91Var = chatAttachAlertPhotoLayout.f24104l0;
        ah.x xVar = chatAttachAlertPhotoLayout.f24100j0;
        TextView textView = chatAttachAlertPhotoLayout.f24111p0;
        em emVar = chatAttachAlertPhotoLayout.f24114r;
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
                    xVar.layout(0, org.telegram.messenger.g0.B(222.0f, i13, i16), i14, org.telegram.messenger.g0.B(96.0f, i13, i16));
                    return true;
                }
                xVar.layout(0, org.telegram.messenger.g0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (emVar.getVisibility() == 0) {
                xVar.layout(org.telegram.messenger.g0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                xVar.layout(org.telegram.messenger.g0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == y91Var) {
            if (z10) {
                if (emVar.getVisibility() == 0) {
                    y91Var.layout(0, org.telegram.messenger.g0.B(310.0f, i13, i16), i14, org.telegram.messenger.g0.B(260.0f, i13, i16));
                    return true;
                }
                y91Var.layout(0, org.telegram.messenger.g0.B(176.0f, i13, i16), i14, org.telegram.messenger.g0.B(126.0f, i13, i16));
                return true;
            } else if (emVar.getVisibility() == 0) {
                y91Var.layout(org.telegram.messenger.g0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                y91Var.layout(org.telegram.messenger.g0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
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
                int B = org.telegram.messenger.g0.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
        sm smVar = chatAttachAlertPhotoLayout.v;
        em emVar = chatAttachAlertPhotoLayout.f24114r;
        hg.a0 a0Var = chatAttachAlertPhotoLayout.f24116s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        om omVar = chatAttachAlertPhotoLayout.P;
        if (view == omVar) {
            if (chatAttachAlertPhotoLayout.f24084b0 && !chatAttachAlertPhotoLayout.f24088d0) {
                omVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ah.x xVar = chatAttachAlertPhotoLayout.f24100j0;
            if (view == xVar) {
                if (z10) {
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                xVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            y91 y91Var = chatAttachAlertPhotoLayout.f24104l0;
            if (view == y91Var) {
                if (z10) {
                    y91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                y91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == emVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    emVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f45905o != 0) {
                        emVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        smVar.l();
                    }
                } else {
                    emVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f45905o != 1) {
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
        this.f30558j0.setTranslationX(0.0f);
        this.f30579q1.setAlpha(0.0f);
        this.f30573o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30591t2 = animatorSet;
        hi hiVar = this.f30584r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, hiVar, 0.0f, 400.0f));
        this.f30591t2.setDuration(400L);
        this.f30591t2.setStartDelay(20L);
        hiVar.set(this, Float.valueOf(0.0f));
        this.f30591t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new eh(this, 2));
        o1.k kVar = this.f30588s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f17542n, 0.0f);
        this.f30588s2 = kVar2;
        if (this.K1 != null) {
            kVar2.f17559u.a(0.75f);
            this.f30588s2.f17559u.b(350.0f);
        } else {
            kVar2.f17559u.a(0.75f);
            this.f30588s2.f17559u.b(350.0f);
        }
        this.f30588s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.e3 e3Var = this.backDrawable;
        r6 r6Var = t6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(e3Var, r6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        lg lgVar = new lg(this, animationNotificationsLocker, this.delegate, 2);
        this.f30588s2.a(new gi.b4(2, this, lgVar));
        this.currentSheetAnimation.addListener(new ai.me(23, this, lgVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(bs.f25021f);
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
        if (this.f30546f0 instanceof org.telegram.ui.qn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30596v1 = true;
        if (!this.P1 && !this.O1) {
            c1();
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

    public final long p1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) n2Var).a();
        }
        return this.Z;
    }

    public final int q1() {
        li liVar = this.B0;
        fo foVar = this.m0;
        if (liVar == foVar && foVar.E != null) {
            return foVar.getEmojiPadding();
        }
        fo foVar2 = this.f30569n0;
        if (liVar == foVar2 && foVar2.E != null) {
            return foVar2.getEmojiPadding();
        }
        if (this.f30536c0) {
            return this.S0.getEmojiPadding();
        }
        return this.H0.getEmojiPadding();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        li liVar;
        int i11;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            g1();
            fo foVar = this.m0;
            if (foVar != null && ((liVar = this.C0) == foVar || this.B0 == foVar)) {
                if (liVar == foVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                e2(i11);
            }
            fo foVar2 = this.f30569n0;
            if (foVar2 != null) {
                li liVar2 = this.C0;
                if (liVar2 == foVar2 || this.B0 == foVar2) {
                    if (liVar2 != foVar2) {
                        i12 = 0;
                    }
                    e2(i12);
                }
            }
        } else if (i10 == 1) {
            g1();
        } else if (i10 == 3) {
            h1();
        } else if (i10 == 4) {
            h1();
        } else if (i10 == 5) {
            h1();
            ei eiVar = this.L0;
            if (eiVar != null) {
                eiVar.setEphemeralFactor(f7);
                eiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final int r1(int i10) {
        li liVar = this.C0;
        int[] iArr = this.f30544e2;
        if (liVar != null && ((this.B0 instanceof bn) || (liVar instanceof bn))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f30539d0);
        }
        return iArr[i10];
    }

    public final int s1(boolean z10) {
        boolean q6;
        int i10;
        z7 z7Var;
        if (this.f30563k2) {
            return getThemedColor(org.telegram.ui.ActionBar.h6.f21296tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        Iterator it = this.f30568n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            long longValue = ((Long) gVar.f17393a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.r.a(f7, 0.0f, 1.0f);
        if (z10 && (z7Var = this.f30530a1) != null && z7Var.getVisibility() == 0) {
            a2 *= 1.0f - z7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.h6.f20932a7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21078i5;
        }
        return i0.a.f(a2, themedColor, getThemedColor(i10));
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        li liVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30558j0;
        if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f24099i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            this.calcMandatoryInsets = ((org.telegram.ui.qn) n2Var).C9();
        }
        a2();
        this.f30596v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7), 0);
            this.navBarColor = o10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f30577p2) {
            this.f30577p2 = false;
            z7 z7Var = this.f30530a1;
            z7Var.d();
            z7Var.invalidate();
            x1();
        }
    }

    public final void t1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.t1():void");
    }

    public final boolean u1() {
        if (this.f30536c0) {
            li liVar = this.B0;
            if (liVar == this.f30558j0 || liVar == this.f30578q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        ri riVar = this.f30538c2;
        if (riVar != null && !this.f30604x1) {
            boolean v = riVar.v();
            this.f30604x1 = true;
            ai.y7 y7Var = new ai.y7(this, editTextBoldCursor, z10, 20);
            if (v) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(y7Var, j10);
        }
    }

    public final void x1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int s12 = s1(false);
            org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
            gh.c cVar = this.I2;
            if (cVar.f11055a.getColor() != s12) {
                cVar.a(s12);
                kh.f fVar = this.f30608y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                yh yhVar = this.f30611z1;
                if (yhVar != null) {
                    yhVar.invalidate();
                }
            }
            a2();
            this.containerView.invalidate();
        }
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30610z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.o();
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

    public final void z1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
            if (tL_attachMenuBot2.bot_id == user.f20423id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
        b2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.u2(this, tL_attachMenuBot, user, 24));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismiss() {
        ci ciVar;
        zh zhVar;
        if (this.B0.p() || isDismissed()) {
            return;
        }
        li liVar = this.B0;
        al alVar = this.f30599w0;
        boolean z10 = (liVar != alVar || alVar == null || alVar.H || alVar.M0 == null) ? false : true;
        this.f30603x0 = z10;
        if (!z10 && (zhVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        if (!this.f30603x0 && (ciVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(ciVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.f30546f0;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        if (!this.D2 && n2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.C2) {
                return;
            }
            this.C2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new dh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20605a.setOnCancelListener(new jh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            b2Var.N = b1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21228q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f30610z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar2 = liVarArr[i10];
            if (liVar2 != null && this.B0 != liVar2) {
                liVar2.p();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.o(getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7), 0), true, (AndroidUtilities.IntColorCallback) new dh(this, 11));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.f30565l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override
    public final void H(float f7, int i10) {
    }

    public ti(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}
