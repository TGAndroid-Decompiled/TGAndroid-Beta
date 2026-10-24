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
import org.telegram.ui.gi1;
public class ri extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a3, ne.d {
    public static final int U2 = 0;
    public final LongSparseArray A0;
    public final uh A1;
    public boolean A2;
    public ji B0;
    public final vh B1;
    public boolean B2;
    public ji C0;
    public final s4.b0 C1;
    public File C2;
    public final dh.d D0;
    public final oi D1;
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
    public final uh G0;
    public boolean G1;
    public boolean G2;
    public boolean H;
    public final xh H0;
    public final o6 H1;
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
    public final uh K0;
    public MessageObject K1;
    public final gh.d K2;
    public int L;
    public final ci L0;
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
    public final ih O2;
    public boolean P;
    public AnimatorSet P0;
    public boolean P1;
    public final ArrayList P2;
    public a50 Q;
    public long Q0;
    public boolean Q1;
    public final RectF Q2;
    public boolean R;
    public final ah.v R0;
    public boolean R1;
    public final RectF R2;
    public final ne0 S;
    public final ai S0;
    public boolean S1;
    public final RectF S2;
    public eo T;
    public int T0;
    public boolean T1;
    public final ArrayList T2;
    public c50 U;
    public xt U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public ck X;
    public boolean X0;
    public boolean X1;
    public aj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean f30129a0;
    public final x7 f30130a1;
    public ValueAnimator a2;
    public final ne.b f30131b;
    public final bh.c f30132b0;
    public AnimatorSet f30133b1;
    public int f30134b2;
    public final ne.b f30135c;
    public boolean f30136c0;
    public AnimatorSet f30137c1;
    public pi f30138c2;
    public final ne.b d;
    public float f30139d0;
    public final org.telegram.ui.ActionBar.u0 f30140d1;
    public nn f30141d2;
    public final ne.b e;
    public final fi f30142e0;
    public final ei.u f30143e1;
    public final int[] f30144e2;
    public final ne.b f30145f;
    public final org.telegram.ui.ActionBar.o2 f30146f0;
    public final org.telegram.ui.ActionBar.u0 f30147f1;
    public int f30148f2;
    public final boolean f30149g0;
    public ei.x3 f30150g1;
    public float f30151g2;
    public final ne.b h;
    public kf f30152h0;
    public final org.telegram.ui.ActionBar.u0 f30153h1;
    public float f30154h2;
    public boolean f30155i0;
    public final di.n f30156i1;
    public boolean f30157i2;
    public final ChatAttachAlertPhotoLayout f30158j0;
    public float f30159j1;
    public float f30160j2;
    public vj f30161k0;
    public float f30162k1;
    public final boolean f30163k2;
    public dj f30164l0;
    public final uh l1;
    public boolean f30165l2;
    public co m0;
    public final TextView f30166m1;
    public final ArrayList f30167m2;
    public final ne.l f30168n;
    public co f30169n0;
    public final org.telegram.ui.ActionBar.u0 f30170n1;
    public final Rect f30171n2;
    public pl f30172o0;
    public final LinearLayout f30173o1;
    public float f30174o2;
    public lk f30175p0;
    public final ImageView f30176p1;
    public boolean f30177p2;
    public zm f30178q0;
    public final LinearLayout f30179q1;
    public int f30180q2;
    public org.telegram.ui.qn f30181r;
    public gj f30182r0;
    public final TextView f30183r1;
    public final fi f30184r2;
    public final o6 f30185s;
    public ig.h0 f30186s0;
    public float f30187s1;
    public o1.k f30188s2;
    public mk f30189t0;
    public boolean f30190t1;
    public AnimatorSet f30191t2;
    public mk f30192u0;
    public final hi f30193u1;
    public int f30194u2;
    public final o6 v;
    public ki.q f30195v0;
    public boolean f30196v1;
    public int f30197v2;
    public final ImageView f30198w;
    public yk f30199w0;
    public Object f30200w1;
    public boolean f30201w2;
    public final i0 f30202x;
    public boolean f30203x0;
    public boolean f30204x1;
    public boolean f30205x2;
    public final ImageView f30206y;
    public float f30207y0;
    public final kh.f f30208y1;
    public boolean f30209y2;
    public final ji[] f30210z0;
    public final wh f30211z1;
    public kl f30212z2;

    public ri(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        di.n nVar;
        ne.l lVar;
        int i10;
        float f7;
        zr zrVar = zr.h;
        this.f30131b = new ne.b(0, this, zrVar, 380L, false);
        this.f30135c = new ne.b(1, this, zrVar, 380L, false);
        this.d = new ne.b(2, this, zrVar, 380L, false);
        this.e = new ne.b(3, this, zrVar, 380L, false);
        this.f30145f = new ne.b(4, this, zrVar, 380L, true);
        this.h = new ne.b(5, this, zrVar, 320L, false);
        ne.l lVar2 = new ne.l(new bh(this, 2), zrVar, 380L);
        this.f30168n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f30139d0 = 0.0f;
        this.f30142e0 = new fi(this, 0);
        this.f30155i0 = false;
        ji[] jiVarArr = new ji[12];
        this.f30210z0 = jiVarArr;
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
        this.f30134b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f30144e2 = new int[2];
        new Paint(1);
        this.f30165l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f30167m2 = arrayList;
        Rect rect = new Rect();
        this.f30171n2 = rect;
        this.f30184r2 = new fi(this, 1);
        this.f30205x2 = true;
        this.f30209y2 = false;
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
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
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
        this.O2 = new ih(this, 0);
        this.f30163k2 = z10;
        this.f30149g0 = (o2Var instanceof org.telegram.ui.sn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30146f0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        hi hiVar = new hi(this, context);
        this.f30193u1 = hiVar;
        hiVar.setDelegate(new ii(this));
        this.containerView = hiVar;
        hiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        x7 x7Var = new x7(this, context, g6Var, 1);
        this.f30130a1 = x7Var;
        x7Var.S0 = true;
        x7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        x7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i13 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.m(x7Var, 1, i13, g6Var);
        int i14 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.ActionBar.r6.m(x7Var, 3, i14, g6Var);
        org.telegram.ui.ActionBar.r6.m(x7Var, 5, i13, g6Var);
        x7Var.setOccupyStatusBar(true);
        x7Var.setAlpha(0.0f);
        x7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 11));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
        this.f30140d1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new bh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 6, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        u0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(u0Var2, g02, null, O, g6Var);
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
        this.f30147f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ei.u uVar = new ei.u();
        this.f30143e1 = uVar;
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
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
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
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        w7.b6.a(nVar2);
        this.f30156i1 = nVar2;
        e2();
        if (o2Var != null) {
            u0Var = u0Var3;
            lVar = lVar2;
            nVar = nVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, g6Var);
            this.f30153h1 = u0Var4;
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
        this.f30170n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 3, i10);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i14);
        u0Var5.setBackground(g05);
        org.telegram.ui.ActionBar.r6.k(u0Var5, g05, null, O4, g6Var);
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ri f26691b;

            {
                this.f26691b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.sn snVar;
                switch (r3) {
                    case 0:
                        final ri riVar = this.f26691b;
                        xh xhVar = riVar.H0;
                        if (xhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(riVar.getContext(), g6Var);
                            e0Var.m0(xhVar.getText());
                            e0Var.f25885j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = riVar.H0;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar = riVar.S0;
                                            aiVar.setText(charSequence);
                                            aiVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = riVar.Z;
                            if (riVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            kh khVar = new kh(riVar, 0);
                            e0Var.f25887l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25888n0 = khVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ri riVar2 = this.f26691b;
                        ai aiVar = riVar2.S0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(riVar2.getContext(), g6Var);
                            e0Var2.m0(aiVar.getText());
                            e0Var2.f25885j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = riVar2.H0;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = riVar2.S0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = riVar2.Z;
                            if (riVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            kh khVar2 = new kh(riVar2, 1);
                            e0Var2.f25887l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25888n0 = khVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ri riVar3 = this.f26691b;
                        riVar3.f30170n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = riVar3.f30146f0;
                        u12.M2(null, o2Var2, g6Var);
                        PhotoViewer.u1().N2(riVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i15 = riVar3.V1;
                        boolean z15 = riVar3.W1;
                        u13.h = i15;
                        u13.f33659n = z15;
                        if (!riVar3.f30138c2.u()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(riVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(riVar3.M1, "webp");
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
                        th thVar = new th(riVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            snVar = (org.telegram.ui.sn) o2Var2;
                        } else {
                            snVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, thVar, snVar);
                        if (riVar3.G) {
                            PhotoViewer.u1().Z0(null, null, true, riVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        uh uhVar = new uh(this, context, 0);
        this.l1 = uhVar;
        uhVar.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        uhVar.setAlpha(0.0f);
        uhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30173o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f30166m1 = textView;
        org.telegram.messenger.v0.q(textView, i13, g6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f30176p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(imageView, mutate, i13, g6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        uhVar.addView(linearLayout, w7.z5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30179q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.r6.z(imageView2, mutate2, i13, g6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f30183r1 = textView2;
        org.telegram.messenger.v0.q(textView2, i13, g6Var, 1, 16.0f);
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        uhVar.addView(linearLayout2, w7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, g6Var);
        this.f30158j0 = chatAttachAlertPhotoLayout;
        jiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30208y1 = view;
        view.setup(bVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.z5.g());
        this.containerView.addView(uhVar, w7.z5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ah.v vVar = new ah.v(context, 11);
        this.R0 = vVar;
        this.containerView.addView(vVar, w7.z5.e(-1, -2, 55));
        this.containerView.addView(x7Var, w7.z5.c(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f30153h1;
        if (u0Var6 != null) {
            this.containerView.addView(u0Var6, w7.z5.e(48, 48, 53));
        }
        uhVar.addView(u0Var5, w7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(nVar, w7.z5.e(-2, 48, 53));
        uh uhVar2 = new uh(this, context, 1);
        this.A1 = uhVar2;
        vh vhVar = new vh(context, 0);
        this.B1 = vhVar;
        vhVar.setClipChildren(true);
        vhVar.setClipToPadding(false);
        oi oiVar = new oi(this, context);
        this.D1 = oiVar;
        vhVar.setAdapter(oiVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.C1 = b0Var;
        vhVar.setLayoutManager(b0Var);
        vhVar.setVerticalScrollBarEnabled(false);
        vhVar.setHorizontalScrollBarEnabled(false);
        vhVar.setItemAnimator(null);
        vhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.r6.m(vhVar, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        vhVar.f28418y2 = true;
        vhVar.setOverScrollMode(2);
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
        wh whVar = new wh(this, context, 0);
        this.f30211z1 = whVar;
        bh.c cVar2 = new bh.c(bVar3.c(whVar, null, false));
        this.f30132b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(whVar, w7.z5.g());
        dh.d c10 = this.M2.c(uhVar2, fh.c.f(g6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        uhVar2.setBackground(c10);
        vhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        vhVar.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f52046a;
        vhVar.setOutlineProvider(new zf.i0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        vhVar.setImportantForAccessibility(1);
        uhVar2.addView(vhVar, w7.z5.g());
        this.containerView.addView(uhVar2, w7.z5.e(-1, 70, 81));
        vhVar.setOnItemClickListener(new ci.x4(9, this, g6Var));
        vhVar.setOnItemLongClickListener(new bh(this, 3));
        o6 o6Var = new o6(context, true, false, true);
        this.H1 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        o6Var.setPadding(dp, 0, dp, 0);
        o6Var.setTextSize(AndroidUtilities.dp(f7));
        o6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        this.containerView.addView(o6Var, w7.z5.e(-1, 48, 83));
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
        int i15 = org.telegram.ui.ActionBar.k6.f21589z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView3, i15, g6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        uh uhVar3 = new uh(this, context, 2);
        this.G0 = uhVar3;
        ig.j jVar = new ig.j(this, context);
        this.F0 = jVar;
        uhVar3.addView(jVar, w7.z5.e(-1, -1, 119));
        dh.d c11 = this.N2.c(hiVar, fh.c.n(g6Var), false);
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
        uhVar3.setWillNotDraw(false);
        uhVar3.setVisibility(4);
        uhVar3.setAlpha(0.0f);
        this.containerView.addView(uhVar3, w7.z5.e(-1, -2, 83));
        uhVar3.setOnTouchListener(new di.d(13));
        o6 o6Var2 = new o6(context, false, false, false);
        this.f30185s = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i16 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.a0(o6Var2, i16, g6Var);
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        jVar.addView(o6Var2, w7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30198w = imageView4;
        i0 i0Var = new i0(context);
        this.f30202x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i17 = org.telegram.ui.ActionBar.k6.Wk;
        org.telegram.ui.ActionBar.r6.t(imageView4, i17, g6Var, mode);
        int i18 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i18), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i18);
        imageView4.setBackground(g06);
        org.telegram.ui.ActionBar.r6.k(imageView4, g06, null, O5, g6Var);
        jVar.addView(imageView4, w7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26691b;

            {
                this.f26691b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.sn snVar;
                switch (r3) {
                    case 0:
                        final ri riVar = this.f26691b;
                        xh xhVar = riVar.H0;
                        if (xhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(riVar.getContext(), g6Var);
                            e0Var.m0(xhVar.getText());
                            e0Var.f25885j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = riVar.H0;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = riVar.S0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = riVar.Z;
                            if (riVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            kh khVar = new kh(riVar, 0);
                            e0Var.f25887l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25888n0 = khVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ri riVar2 = this.f26691b;
                        ai aiVar = riVar2.S0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(riVar2.getContext(), g6Var);
                            e0Var2.m0(aiVar.getText());
                            e0Var2.f25885j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar2 = riVar2.H0;
                                            xhVar2.setText(charSequence);
                                            xhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = riVar2.S0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = riVar2.Z;
                            if (riVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            kh khVar2 = new kh(riVar2, 1);
                            e0Var2.f25887l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25888n0 = khVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ri riVar3 = this.f26691b;
                        riVar3.f30170n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = riVar3.f30146f0;
                        u12.M2(null, o2Var2, g6Var);
                        PhotoViewer.u1().N2(riVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i152 = riVar3.V1;
                        boolean z15 = riVar3.W1;
                        u13.h = i152;
                        u13.f33659n = z15;
                        if (!riVar3.f30138c2.u()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(riVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(riVar3.M1, "webp");
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
                        th thVar = new th(riVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            snVar = (org.telegram.ui.sn) o2Var2;
                        } else {
                            snVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, thVar, snVar);
                        if (riVar3.G) {
                            PhotoViewer.u1().Z0(null, null, true, riVar3.J);
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
        xh xhVar = new xh(this, context, hiVar, g6Var);
        this.H0 = xhVar;
        xhVar.J = true;
        xhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        xhVar.s();
        xhVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        xhVar.getEditText().addTextChangedListener(new zh(this, 0));
        jVar.addView(xhVar, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        uhVar3.setClipChildren(false);
        xhVar.setClipChildren(false);
        vVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar.setWillNotDraw(false);
        ai aiVar = new ai(this, context, hiVar, g6Var);
        this.S0 = aiVar;
        aiVar.J = true;
        aiVar.getEditText().addTextChangedListener(new bi(this, o2Var));
        aiVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        aiVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        aiVar.getEditText().setTextSize(1, 17.0f);
        aiVar.getEmojiButton().setLayoutParams(w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        aiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar.addView(aiVar, w7.z5.e(-1, -2, 119));
        vVar.setAlpha(0.0f);
        vVar.setVisibility(8);
        xhVar.addView(imageView3, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        dh.d c13 = this.M2.c(vVar, fh.c.n(g6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        vVar.setBackground(c13);
        vVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.v = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.r6.a0(o6Var3, i16, g6Var);
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        vVar.addView(o6Var3, w7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Xd, g6Var, mode2);
        aiVar.addView(imageView5, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30206y = imageView6;
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
            public final ri f26691b;

            {
                this.f26691b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.sn snVar;
                switch (r3) {
                    case 0:
                        final ri riVar = this.f26691b;
                        xh xhVar2 = riVar.H0;
                        if (xhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(riVar.getContext(), g6Var);
                            e0Var.m0(xhVar2.getText());
                            e0Var.f25885j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar22 = riVar.H0;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar2 = riVar.S0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = riVar.Z;
                            if (riVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            kh khVar = new kh(riVar, 0);
                            e0Var.f25887l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.f25888n0 = khVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ri riVar2 = this.f26691b;
                        ai aiVar2 = riVar2.S0;
                        if (aiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(riVar2.getContext(), g6Var);
                            e0Var2.m0(aiVar2.getText());
                            e0Var2.f25885j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            xh xhVar22 = riVar2.H0;
                                            xhVar22.setText(charSequence);
                                            xhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ai aiVar22 = riVar2.S0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = riVar2.Z;
                            if (riVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            kh khVar2 = new kh(riVar2, 1);
                            e0Var2.f25887l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.f25888n0 = khVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ri riVar3 = this.f26691b;
                        riVar3.f30170n1.M(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = riVar3.f30146f0;
                        u12.M2(null, o2Var2, g6Var);
                        PhotoViewer.u1().N2(riVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i152 = riVar3.V1;
                        boolean z15 = riVar3.W1;
                        u13.h = i152;
                        u13.f33659n = z15;
                        if (!riVar3.f30138c2.u()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(riVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(riVar3.M1, "webp");
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
                        th thVar = new th(riVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            snVar = (org.telegram.ui.sn) o2Var2;
                        } else {
                            snVar = null;
                        }
                        u14.i2(arrayList3, 0, 11, false, thVar, snVar);
                        if (riVar3.G) {
                            PhotoViewer.u1().Z0(null, null, true, riVar3.J);
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
        uh uhVar4 = new uh(this, context, 3);
        this.K0 = uhVar4;
        uhVar4.setFocusable(true);
        uhVar4.setFocusableInTouchMode(true);
        uhVar4.setVisibility(4);
        uhVar4.setScaleX(0.2f);
        uhVar4.setScaleY(0.2f);
        uhVar4.setAlpha(0.0f);
        uhVar4.setClipChildren(false);
        uhVar4.setClipToPadding(false);
        this.containerView.addView(uhVar4, w7.z5.e(110, 50, 85));
        ci ciVar = new ci(R.drawable.send_plane_24, context, g6Var, this);
        this.L0 = ciVar;
        ciVar.setImportantForAccessibility(2);
        uhVar4.addView(ciVar, w7.z5.e(-1, -1, 119));
        ciVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        ciVar.I = dp2;
        ciVar.J = dp3;
        ciVar.M = AndroidUtilities.dp(7.0f);
        ciVar.N = AndroidUtilities.dp(6.0f);
        ciVar.f30822h0 = true;
        ciVar.setOnClickListener(new View.OnClickListener(this) {
            public final ri f26323b;

            {
                this.f26323b = this;
            }

            @Override
            public final void onClick(View view2) {
                gi.f4 f4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ri riVar = this.f26323b;
                        long j10 = riVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) riVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ri riVar2 = this.f26323b;
                        boolean z14 = riVar2.f30136c0;
                        if (!z14) {
                            riVar2.O1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ri riVar3 = this.f26323b;
                        boolean z15 = riVar3.f30136c0;
                        if (z15) {
                            riVar3.O1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26323b.F1();
                        return;
                    case 4:
                        this.f26323b.f30140d1.M(null, null);
                        return;
                    case 5:
                        ri.v(this.f26323b);
                        return;
                    case 6:
                        ji jiVar = this.f26323b.B0;
                        if (jiVar != null) {
                            jiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26323b.f30170n1.M(null, null);
                        return;
                    default:
                        ri riVar4 = this.f26323b;
                        if (riVar4.B0 != riVar4.f30178q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        riVar4.h2(z13);
                        return;
                }
            }
        });
        ciVar.setOnLongClickListener(new org.telegram.ui.zf(this, context, g6Var, o2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        wh whVar2 = new wh(this, context, 1);
        whVar2.setAlpha(0.0f);
        whVar2.setScaleX(0.2f);
        whVar2.setScaleY(0.2f);
        if (z10) {
            h1();
            this.navBarColorKey = -1;
        }
        sl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        bh.b bVar6 = this.M2;
        eh.e n10 = fh.c.n(g6Var);
        lm0 lm0Var = fastScroll.f30560p0;
        dh.d c14 = bVar6.c(lm0Var.f28376d1, n10, false);
        fastScroll.f30548e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f30548e0.q(AndroidUtilities.dp(24.0f));
        dh.d c15 = bVar6.c(lm0Var.f28376d1, n10, false);
        fastScroll.f30550f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f30550f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f30550f0.q(AndroidUtilities.dp(f7));
        ne0 ne0Var = new ne0(context);
        this.S = ne0Var;
        this.containerView.addView(ne0Var, w7.z5.c(-1.0f, -1));
        eh.e eVar = new eh.e(g6Var);
        eVar.e = new bh(this, 4);
        eVar.f8667c = new bh(this, 5);
        eVar.d = new bh(this, 6);
        eVar.f8666b = new bh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        x7Var.L(this.M2, eVar, false);
        lVar.h(1L, false);
    }

    public static void L1(ji jiVar) {
        if (jiVar != null) {
            int i10 = org.telegram.ui.ActionBar.r6.f21818b;
            Object tag = jiVar.getTag(R.id.theme_generation);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
                return;
            }
            jiVar.setTag(R.id.theme_generation, Integer.valueOf(i10));
            try {
                org.telegram.ui.ActionBar.q6 N = org.telegram.ui.ActionBar.r6.N(true, 0, null);
                N.b(jiVar);
                N.a();
                jiVar.d();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void N(ri riVar) {
        boolean z10;
        boolean q6;
        int i10;
        x7 x7Var = riVar.f30130a1;
        kh.f fVar = riVar.f30208y1;
        if (fVar != null && x7Var != null) {
            ji jiVar = riVar.C0;
            if (jiVar == null) {
                jiVar = riVar.B0;
            }
            int i11 = 0;
            if (jiVar != null && (jiVar instanceof yk)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.g6 g6Var = riVar.resourcesProvider;
            if (g6Var != null) {
                q6 = g6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (!z10 && x7Var.getVisibility() == 0) {
                if (q6) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i11 = (int) (x7Var.getAlpha() * i10);
            }
            fVar.setFadeTopAlpha(i11);
        }
    }

    public static void R(ri riVar) {
        ei.i iVar = new ei.i(riVar, riVar.getContext(), riVar.Z, LaunchActivity.R(), riVar.resourcesProvider, 1);
        riVar.H2 = iVar;
        iVar.p(new ki.t1(riVar, 14));
        ViewGroup viewGroup = riVar.containerView;
        viewGroup.addView(riVar.H2, viewGroup.indexOfChild(riVar.G0), w7.z5.e(-1, -1, 83));
        ei.i iVar2 = riVar.H2;
        iVar2.getAdapter().f11949c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        boolean z10 = true;
        if (o2Var instanceof org.telegram.ui.sn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            hg.j1 adapter = iVar2.getAdapter();
            snVar.i();
            TLRPC.Chat chat = snVar.e;
            adapter.getClass();
            adapter.f11960l0 = chat;
            iVar2.getAdapter().W(snVar.f41589l8);
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
        riVar.c2();
    }

    public static void m(ri riVar, ValueAnimator valueAnimator) {
        riVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.e3 e3Var = riVar.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public static void p(ri riVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.a3 a3Var) {
        riVar.currentSheetAnimation = null;
        riVar.f30188s2 = null;
        animationNotificationsLocker.unlock();
        riVar.currentSheetAnimationType = 0;
        if (a3Var != null) {
            a3Var.onOpenAnimationEnd();
        }
        if (riVar.useHardwareLayer) {
            riVar.container.setLayerType(0, null);
        }
        if (riVar.isFullscreen) {
            WindowManager.LayoutParams attributes = riVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            riVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static boolean q(org.telegram.ui.Components.ri r45, android.content.Context r46, org.telegram.ui.ActionBar.g6 r47, org.telegram.ui.ActionBar.o2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.q(org.telegram.ui.Components.ri, android.content.Context, org.telegram.ui.ActionBar.g6, org.telegram.ui.ActionBar.o2, android.view.View):boolean");
    }

    public static void r(ri riVar) {
        o1.k kVar = riVar.f30188s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(riVar.containerView, o1.h.f17605n, 0.0f);
        riVar.f30188s2 = kVar2;
        kVar2.f17622u.a(1.5f);
        riVar.f30188s2.f17622u.b(1500.0f);
        riVar.f30188s2.h();
    }

    public static void s(ri riVar, jg jgVar) {
        AnimatorSet animatorSet = riVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            jgVar.run();
        }
    }

    public static void t(ri riVar, int i10) {
        riVar.navBarColorKey = -1;
        riVar.navBarColor = i10;
        riVar.containerView.invalidate();
    }

    public static void u(ri riVar) {
        riVar.currentSheetAnimation = null;
        riVar.currentSheetAnimationType = 0;
        riVar.dismissInternal();
    }

    public static void v(ri riVar) {
        int i10;
        if (riVar.f30158j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = riVar.f30158j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
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
        riVar.g2(true);
        org.telegram.ui.ActionBar.u0 u0Var = riVar.f30147f1;
        ei.x3 x3Var = riVar.f30150g1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = new ei.x3(riVar.getContext(), 1);
        riVar.f30150g1 = x3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        x3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        riVar.f30150g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        riVar.f30150g1.m(1.0f, -((riVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        riVar.f30150g1.setTranslationY(riVar.f30140d1.getTranslationY());
        ei.x3 x3Var3 = riVar.f30150g1;
        x3Var3.f10097l0 = new ce(3, riVar, x3Var2);
        riVar.containerView.addView(x3Var3, w7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        riVar.f30150g1.u();
    }

    public static void w(ri riVar, boolean z10, eh ehVar) {
        Integer num;
        riVar.B0.v(1.0f);
        riVar.C0.v(1.0f);
        riVar.B0.l(riVar.f30174o2);
        riVar.C0.l(riVar.f30174o2);
        riVar.containerView.invalidate();
        x7 x7Var = riVar.f30130a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        x7Var.setTag(num);
        ehVar.run();
    }

    public static void x(ri riVar, org.telegram.ui.ActionBar.g6 g6Var, View view) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        vh vhVar = riVar.B1;
        ji[] jiVarArr = riVar.f30210z0;
        org.telegram.ui.ActionBar.o2 o2Var2 = riVar.f30146f0;
        if (o2Var2 == null) {
            o2Var = LaunchActivity.R();
        } else {
            o2Var = o2Var2;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (view instanceof li) {
                Activity parentActivity = o2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (riVar.O1 || riVar.P1 || !riVar.f1()) {
                        if (!riVar.O1 && !riVar.P1) {
                            eo eoVar = new eo(1, riVar.getContext(), g6Var, riVar);
                            riVar.T = eoVar;
                            riVar.Y1(eoVar);
                        }
                        riVar.Y1(riVar.f30158j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (riVar.f30199w0 == null && (o2Var2 instanceof org.telegram.ui.sn)) {
                        TLRPC.User i11 = ((org.telegram.ui.sn) o2Var2).i();
                        if (y1(i11)) {
                            yk ykVar = new yk(riVar, riVar.getContext(), riVar.M1, i11, g6Var);
                            riVar.f30199w0 = ykVar;
                            jiVarArr[11] = ykVar;
                        }
                    }
                    ji jiVar = riVar.f30199w0;
                    if (jiVar != null) {
                        riVar.Y1(jiVar);
                    }
                } else if (i10 == 3) {
                    if (riVar.Q1 || !riVar.f1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(riVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        riVar.H1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (riVar.N1 || !riVar.f1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(riVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        riVar.K1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (riVar.T1 || !riVar.f1()) {
                        if (riVar.T1 && riVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(riVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        riVar.J1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((riVar.T1 || !riVar.f1()) && AndroidUtilities.isMapsInstalled(o2Var2)) {
                        if (!riVar.T1) {
                            eo eoVar2 = new eo(6, riVar.getContext(), g6Var, riVar);
                            riVar.T = eoVar2;
                            riVar.Y1(eoVar2);
                        } else {
                            if (riVar.f30172o0 == null) {
                                Context context = riVar.getContext();
                                if (riVar.H || riVar.U1) {
                                    z10 = false;
                                }
                                pl plVar = new pl(riVar, context, g6Var, z10);
                                riVar.f30172o0 = plVar;
                                jiVarArr[5] = plVar;
                                kl klVar = riVar.f30212z2;
                                if (klVar != null) {
                                    plVar.setDelegate(klVar);
                                } else {
                                    plVar.setDelegate(new bh(riVar, 9));
                                }
                            }
                            riVar.Y1(riVar.f30172o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (riVar.R1 || !riVar.f1()) {
                        if (!riVar.R1) {
                            eo eoVar3 = new eo(9, riVar.getContext(), g6Var, riVar);
                            riVar.T = eoVar3;
                            riVar.Y1(eoVar3);
                        } else {
                            riVar.a2(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (riVar.f30186s0 == null) {
                        ig.h0 h0Var = new ig.h0(riVar.getContext(), riVar.resourcesProvider, riVar);
                        riVar.f30186s0 = h0Var;
                        jiVarArr[7] = h0Var;
                        h0Var.setupBlurredSearchField(riVar.M2);
                    }
                    riVar.Y1(riVar.f30186s0);
                } else if (i10 == 12) {
                    if (riVar.S1 || !riVar.f1()) {
                        if (!riVar.S1) {
                            eo eoVar4 = new eo(9, riVar.getContext(), g6Var, riVar);
                            riVar.T = eoVar4;
                            riVar.Y1(eoVar4);
                        } else {
                            if (riVar.f30169n0 == null) {
                                co coVar = new co(riVar, riVar.getContext(), true, g6Var, null);
                                riVar.f30169n0 = coVar;
                                jiVarArr[1] = coVar;
                                coVar.setDelegate(new bh(riVar, 10));
                            }
                            riVar.Y1(riVar.f30169n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (riVar.f30192u0 == null) {
                        mk mkVar = new mk(riVar, riVar.getContext(), g6Var, true);
                        riVar.f30192u0 = mkVar;
                        jiVarArr[8] = mkVar;
                        mkVar.setDelegate(riVar.f30141d2);
                    }
                    riVar.Y1(riVar.f30192u0);
                } else if (i10 == 14) {
                    if (riVar.f30189t0 == null) {
                        mk mkVar2 = new mk(riVar, riVar.getContext(), g6Var, false);
                        riVar.f30189t0 = mkVar2;
                        jiVarArr[9] = mkVar2;
                        mkVar2.setDelegate(riVar.f30141d2);
                    }
                    riVar.Y1(riVar.f30189t0);
                } else if (i10 == 16) {
                    if (riVar.f30195v0 == null) {
                        ki.q qVar = new ki.q(riVar.M1, riVar.getContext(), g6Var, riVar);
                        riVar.f30195v0 = qVar;
                        jiVarArr[10] = qVar;
                    }
                    riVar.Y1(riVar.f30195v0);
                } else if (view.getTag() instanceof Integer) {
                    riVar.f30138c2.b0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, riVar.x1(), false, 0L);
                }
            } else if (view instanceof ki) {
                ki kiVar = (ki) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = kiVar.f28021c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        gi1.a(riVar.getContext(), new org.telegram.ui.ActionBar.m3(22, riVar, kiVar), null);
                    } else {
                        riVar.V1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    riVar.f30138c2.X(kiVar.f28020b);
                    riVar.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                vhVar.v0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > vhVar.getMeasuredWidth()) {
                vhVar.v0(i13 - vhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void y(ri riVar) {
        ji jiVar;
        zm zmVar;
        riVar.f30200w1 = null;
        ji jiVar2 = riVar.B0;
        if (jiVar2 != riVar.f30158j0 && (jiVar = riVar.C0) != (zmVar = riVar.f30178q0) && jiVar2 != jiVar && jiVar2 != zmVar) {
            riVar.containerView.removeView(jiVar2);
        }
        riVar.B0.setVisibility(8);
        riVar.B0.t();
        riVar.C0.I();
        riVar.B0 = riVar.C0;
        riVar.C0 = null;
        int[] iArr = riVar.f30144e2;
        iArr[0] = iArr[1];
        riVar.O1(riVar.f30136c0, false);
        riVar.e2();
    }

    public static boolean y1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20491id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f20491id != 489000 && !MessagesController.isSupportUser(user)) {
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
                kh.f fVar = this.f30208y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                wh whVar = this.f30211z1;
                if (whVar != null) {
                    whVar.invalidate();
                }
            }
            e2();
            this.containerView.invalidate();
        }
    }

    public final void B1() {
        int i10 = 0;
        while (true) {
            ji[] jiVarArr = this.f30210z0;
            if (i10 >= jiVarArr.length) {
                break;
            }
            ji jiVar = jiVarArr[i10];
            if (jiVar != null) {
                jiVar.p();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        xh xhVar = this.H0;
        if (xhVar != null) {
            xhVar.o();
        }
        ai aiVar = this.S0;
        if (aiVar != null) {
            aiVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f20491id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
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
            ji[] jiVarArr = this.f30210z0;
            if (i10 < jiVarArr.length) {
                ji jiVar = jiVarArr[i10];
                if (jiVar != null) {
                    jiVar.A();
                }
                i10++;
            } else {
                this.f30157i2 = true;
                return;
            }
        }
    }

    public final void E1() {
        int i10 = 0;
        this.f30157i2 = false;
        while (true) {
            ji[] jiVarArr = this.f30210z0;
            if (i10 >= jiVarArr.length) {
                break;
            }
            ji jiVar = jiVarArr[i10];
            if (jiVar != null) {
                jiVar.C();
            }
            i10++;
        }
        if (isShowing()) {
            this.f30138c2.u();
        }
        oi oiVar = this.D1;
        if (oiVar != null) {
            oiVar.l();
        }
    }

    public final void F1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (o2Var instanceof org.telegram.ui.sn)) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            MessageSuggestionParams messageSuggestionParams = snVar.f41674s5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!ai.ha.U(i10, messageSuggestionParams.amount)) {
                snVar.Zb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f30185s);
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
                d5.L(getContext(), snVar2.a(), new bh(this, 12), this.resourcesProvider);
                return;
            }
        }
        ji jiVar = this.B0;
        if (jiVar != this.f30158j0 && jiVar != this.f30178q0) {
            if (!jiVar.K(0, true, 0, x1(), this.Q0)) {
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
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
            if (this.f30172o0 == null) {
                pl plVar = new pl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f30172o0 = plVar;
                this.f30210z0[5] = plVar;
                kl klVar = this.f30212z2;
                if (klVar != null) {
                    plVar.setDelegate(klVar);
                } else if (o2Var instanceof org.telegram.ui.sn) {
                    plVar.setDelegate(new bh(this, 16));
                }
            }
            Y1(this.f30172o0);
        }
    }

    public final void H1(boolean z10) {
        if (!this.Q1 && z10) {
            eo eoVar = new eo(3, getContext(), this.resourcesProvider, this);
            this.T = eoVar;
            Y1(eoVar);
        }
        int i10 = 1;
        if (this.f30164l0 == null) {
            dj djVar = new dj(getContext(), this.resourcesProvider, this);
            this.f30164l0 = djVar;
            this.f30210z0[3] = djVar;
            djVar.setupBlurredSearchField(this.M2);
            this.f30164l0.setDelegate(new bh(this, 13));
            if (this.H) {
                this.f30164l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            TLRPC.Chat chat = ((org.telegram.ui.sn) o2Var).e;
            dj djVar2 = this.f30164l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            djVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Y1(this.f30164l0);
        }
    }

    public final void I1() {
        if (this.f30182r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
            ?? jiVar = new ji(context, g6Var, this);
            jiVar.f26699r = AndroidUtilities.dp(80.0f);
            jiVar.f26701w = 3;
            ai.u1 u1Var = new ai.u1(jiVar, context, g6Var, 12);
            jiVar.f26698n = u1Var;
            xa xaVar = new xa(jiVar, context);
            jiVar.v = xaVar;
            u1Var.setAdapter(xaVar);
            u1Var.setClipToPadding(false);
            u1Var.setItemAnimator(null);
            u1Var.setLayoutAnimation(null);
            u1Var.setVerticalScrollBarEnabled(false);
            org.telegram.ui.ActionBar.r6.m(u1Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
            jiVar.addView(u1Var, w7.z5.c(-1.0f, -1));
            u1Var.setOnScrollListener(new ah.d0(jiVar, 22));
            di.k kVar = new di.k(jiVar, jiVar.f26699r, 1);
            jiVar.f26700s = kVar;
            kVar.O = new ai.q1(jiVar, 3);
            u1Var.setLayoutManager(kVar);
            this.f30182r0 = jiVar;
            jiVar.setDelegate(new eb(this, 1));
        }
        Y1(this.f30182r0);
    }

    public final void J1() {
        boolean z10;
        if (!this.T1) {
            eo eoVar = new eo(5, getContext(), this.resourcesProvider, this);
            this.T = eoVar;
            Y1(eoVar);
        }
        if (this.f30161k0 == null) {
            vj vjVar = new vj(getContext(), this.resourcesProvider, this);
            this.f30161k0 = vjVar;
            this.f30210z0[2] = vjVar;
            vjVar.setupBlurredSearchField(this.M2);
            this.f30161k0.setDelegate(new di(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            TLRPC.Chat chat = ((org.telegram.ui.sn) o2Var).e;
            vj vjVar2 = this.f30161k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            vjVar2.setMultipleSelectionAllowed(z10);
        }
        Y1(this.f30161k0);
    }

    public final void K1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            eo eoVar = new eo(4, getContext(), this.resourcesProvider, this);
            this.T = eoVar;
            Y1(eoVar);
        }
        boolean z11 = false;
        if (this.f30175p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            lk lkVar = new lk(i10, getContext(), this.resourcesProvider, this);
            this.f30175p0 = lkVar;
            this.f30210z0[4] = lkVar;
            lkVar.setDelegate(new ei(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f30175p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
            if (o2Var instanceof org.telegram.ui.sn) {
                TLRPC.Chat chat = ((org.telegram.ui.sn) o2Var).e;
                lk lkVar2 = this.f30175p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                lkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f30175p0.setMaxSelectedFiles(this.V1);
                lk lkVar3 = this.f30175p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                lkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        lk lkVar4 = this.f30175p0;
        lkVar4.f28354d0 = this.N;
        if (z10) {
            Y1(lkVar4);
        }
    }

    public final void M1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        x7 x7Var = this.f30130a1;
        int i10 = 1;
        if (x7Var.f21069n0) {
            x7Var.g(true);
        }
        this.f30161k0 = null;
        this.f30186s0 = null;
        this.f30164l0 = null;
        this.m0 = null;
        this.f30169n0 = null;
        this.f30172o0 = null;
        this.f30175p0 = null;
        this.f30199w0 = null;
        while (true) {
            ji[] jiVarArr = this.f30210z0;
            if (i10 >= jiVarArr.length) {
                break;
            }
            ji jiVar = jiVarArr[i10];
            if (jiVar != null) {
                jiVar.p();
                this.containerView.removeView(jiVarArr[i10]);
                jiVarArr[i10] = null;
            }
            i10++;
        }
        b2(false, false);
        super.dismissInternal();
        if (this.f30203x0) {
            this.f30203x0 = false;
            this.f30207y0 = 0.0f;
            org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
            if (o2Var != null && o2Var.getFragmentView() != null) {
                View fragmentView = o2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f45241a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean N1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
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
            this.f30138c2.b0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long s12 = s1();
        ji jiVar = this.B0;
        if (jiVar != null) {
            i12 = jiVar.getSelectedItemsCount();
        }
        return d5.a0(this.M1, s12, o1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ri riVar = ri.this;
                riVar.L1 = true;
                riVar.f30138c2.b0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
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
        this.f30131b.a(z10, z11);
        ou r12 = r1();
        this.f30136c0 = z10;
        ou r13 = r1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ji jiVar = this.B0;
        if (jiVar != this.f30158j0 && jiVar != this.f30178q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f30136c0 && z13) {
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
            zr zrVar = zr.h;
            duration.setInterpolator(zrVar).setUpdateListener(new ch(this, 0)).withEndAction(new Runnable(this) {
                public final ri f25732b;

                {
                    this.f25732b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ri riVar = this.f25732b;
                            if (!z14 || !z12) {
                                riVar.R0.setVisibility(8);
                            }
                            riVar.j2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f25732b.F0.setVisibility(8);
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
            translationY.alpha(f11).setDuration(320L).setInterpolator(zrVar).setUpdateListener(new ch(this, 1)).withEndAction(new Runnable(this) {
                public final ri f25732b;

                {
                    this.f25732b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ri riVar = this.f25732b;
                            if (!z14 || !z12) {
                                riVar.R0.setVisibility(8);
                            }
                            riVar.j2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f25732b.F0.setVisibility(8);
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
            r13.setText(y5.cloneSpans(r12.getText()));
            r13.getEditText().setAllowTextEntitiesIntersection(r12.getEditText().getAllowTextEntitiesIntersection());
            if (r12.getEditText().isFocused()) {
                r13.getEditText().requestFocus();
                r13.getEditText().setSelection(r12.getEditText().getSelectionStart(), r12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new eh(this, 0));
    }

    public final void P1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f30158j0) != null) {
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
        float translationY = this.containerView.getTranslationY() - this.f30207y0;
        this.f30207y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        yk ykVar = this.f30199w0;
        if (ykVar != null) {
            ykVar.setSendTransitionProgress(f7);
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
        int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
        this.f30166m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
        if (chatAttachAlertPhotoLayout != null) {
            ri riVar = chatAttachAlertPhotoLayout.f27704b;
            if (riVar.T0 == 0 || riVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f24241g1 = z10;
        }
    }

    public final void U1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.U1(boolean):void");
    }

    public final void V1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.V1(long, java.lang.String, boolean, boolean):void");
    }

    public final void W1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.sn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.sn) o2Var).e)) {
            new vc(this.f30193u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new ce(4, this, o2Var)).j();
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
        ji jiVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        x7 x7Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float dp2;
        this.f30135c.a(z10, true);
        uh uhVar = this.G0;
        if (uhVar.getTag() != null) {
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
        uhVar.setTag(num);
        xh xhVar = this.H0;
        if (xhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(xhVar.getEditText());
        }
        xhVar.k(true);
        this.S0.k(true);
        uh uhVar2 = this.A1;
        uh uhVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                uhVar.setVisibility(0);
            }
            uhVar3.setVisibility(0);
        } else if (this.V0) {
            uhVar2.setVisibility(0);
        }
        ji jiVar2 = this.B0;
        if ((jiVar2 == this.f30158j0 || jiVar2 == this.f30178q0) && this.f30136c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        x7 x7Var2 = this.f30130a1;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        ci ciVar = this.L0;
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
            arrayList.add(ObjectAnimator.ofFloat(uhVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f20));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                x7Var = x7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                x7Var = x7Var2;
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
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(uhVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar, property3, f26));
            if (x7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(uhVar, property4, dp2));
            } else if (this.V0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = AndroidUtilities.dp(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(uhVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(uhVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ch(this, 5));
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
            uhVar.setAlpha(f7);
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
            uhVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            uhVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            uhVar3.setAlpha(f14);
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
            ciVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            ciVar.setScaleY(f17);
            if (x7Var2.getTag() != null) {
                if (z10) {
                    dp = f11;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                uhVar.setTranslationY(dp);
            } else if (this.V0 && ((jiVar = this.B0) == null || jiVar.L())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = f11;
                }
                uhVar2.setTranslationY(f18);
            }
            if (!z10) {
                uhVar.setVisibility(4);
                uhVar3.setVisibility(4);
            }
            if (z13) {
                j2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        ciVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(s1());
        }
        ciVar.i(o1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), ciVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            xhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Y1(ji jiVar) {
        long j10 = this.Z0;
        eo eoVar = this.T;
        if (jiVar == eoVar) {
            j10 = eoVar.f26086s;
        } else if (jiVar == this.f30158j0) {
            j10 = 1;
        } else if (jiVar == this.f30164l0) {
            j10 = 3;
        } else if (jiVar == this.f30175p0) {
            j10 = 4;
        } else if (jiVar == this.f30161k0) {
            j10 = 5;
        } else if (jiVar == this.f30172o0) {
            j10 = 6;
        } else if (jiVar == this.m0) {
            j10 = 9;
        } else if (jiVar == this.f30182r0) {
            j10 = 10;
        } else if (jiVar == this.f30186s0) {
            j10 = 11;
        } else if (jiVar == this.f30169n0) {
            j10 = 12;
        } else if (jiVar == this.f30189t0) {
            j10 = 14;
        } else if (jiVar == this.f30192u0) {
            j10 = 13;
        } else if (jiVar == this.f30195v0) {
            j10 = 16;
        } else if (jiVar == this.f30199w0) {
            j10 = 17;
        }
        Z1(jiVar, j10, true);
    }

    public final void Z1(ji jiVar, long j10, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        mm mmVar;
        boolean z12;
        Integer num;
        mm mmVar2;
        int i12;
        int dp;
        int i13;
        int dp2;
        Float f7;
        int i14;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f30200w1 == null && this.P0 == null) {
            ji jiVar2 = this.B0;
            if (jiVar2 == jiVar) {
                jiVar2.J();
            } else if (jiVar == this.f30169n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new sg.y0(this.f30146f0, 39, false).show();
            } else {
                int i15 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30145f.a(z11, z10);
                this.f30168n.h(Long.valueOf(j10), z10);
                this.G1 = false;
                this.E1 = false;
                this.I1 = 0.0f;
                this.H1.setVisibility(8);
                RadialProgressView radialProgressView = this.F1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                uh uhVar = this.A1;
                uhVar.setAlpha(1.0f);
                uhVar.setTranslationY(this.I1);
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
                vh vhVar = this.B1;
                int childCount = vhVar.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = vhVar.getChildAt(i17);
                    if (childAt instanceof li) {
                        li liVar = (li) childAt;
                        i14 = childCount;
                        f7 = valueOf;
                        if (liVar.f28343b == liVar.f28344c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        liVar.f28603a.f(z13, true);
                    } else {
                        f7 = valueOf;
                        i14 = childCount;
                        if (childAt instanceof ki) {
                            ((ki) childAt).a(true);
                        }
                    }
                    i17++;
                    childCount = i14;
                    valueOf = f7;
                }
                Float f10 = valueOf;
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f30144e2[0];
                this.C0 = jiVar;
                boolean e = jiVar.e();
                kh.f fVar = this.f30208y1;
                if (fVar != null) {
                    if (e) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                wh whVar = this.f30211z1;
                if (whVar != null) {
                    if (e) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    whVar.setVisibility(i13);
                }
                if (this.C0.i() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                x7 x7Var = this.f30130a1;
                x7Var.setVisibility(i10);
                if (x7Var.f21069n0) {
                    x7Var.g(true);
                }
                this.B0.u();
                ji jiVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
                if (jiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.F(this.B0);
                this.C0.setVisibility(0);
                if (jiVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                if (this.C0.getParent() != this.containerView) {
                    L1(this.C0);
                    ViewGroup viewGroup = this.containerView;
                    ji jiVar4 = this.C0;
                    if (jiVar4 != this.f30172o0) {
                        indexOfChild++;
                    }
                    i11 = 0;
                    viewGroup.addView(jiVar4, indexOfChild, w7.z5.c(-1.0f, -1));
                } else {
                    i11 = 0;
                }
                eh ehVar = new eh(this, 4);
                ji jiVar5 = this.B0;
                boolean z14 = jiVar5 instanceof zm;
                fi fiVar = this.f30142e0;
                if (!z14 && !(this.C0 instanceof zm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.C0.setAlpha(0.0f);
                        this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                        ji jiVar6 = this.B0;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[i11] = AndroidUtilities.dp(78.0f) + firstOffset;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jiVar6, property, fArr);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, fiVar, 0.0f, 1.0f);
                        Property property2 = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i11] = x7Var.getAlpha();
                        fArr2[1] = 0.0f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x7Var, property2, fArr2);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i11] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[2] = ofFloat3;
                        animatorSet.playTogether(animatorArr);
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(zr.f33337f);
                        animatorSet.addListener(new ai.c5(this, firstOffset, ehVar, 1));
                        this.f30200w1 = animatorSet;
                        fiVar.set(this.B0, f10);
                        animatorSet.start();
                    } else {
                        jiVar5.setAlpha(0.0f);
                        ehVar.run();
                        i2(i11);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                    ji jiVar7 = this.C0;
                    if (jiVar7 instanceof zm) {
                        jiVar7.setTranslationX(max);
                        ji jiVar8 = this.B0;
                        if ((jiVar8 instanceof ChatAttachAlertPhotoLayout) && (mmVar2 = ((ChatAttachAlertPhotoLayout) jiVar8).P) != null) {
                            mmVar2.setVisibility(4);
                        }
                    } else {
                        this.B0.setTranslationX(-max);
                        ji jiVar9 = this.C0;
                        if (jiVar9 == chatAttachAlertPhotoLayout && (mmVar = ((ChatAttachAlertPhotoLayout) jiVar9).P) != null) {
                            mmVar.setVisibility(0);
                        }
                    }
                    this.C0.setAlpha(1.0f);
                    this.B0.setAlpha(1.0f);
                    if (z10) {
                        fiVar.set(this.B0, f10);
                        AndroidUtilities.runOnUIThread(new jg(this, jiVar, ehVar, 1));
                    } else {
                        if (this.C0.getCurrentItemTop() <= jiVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B0.v(1.0f);
                        this.C0.v(1.0f);
                        this.B0.l(this.f30174o2);
                        this.C0.l(this.f30174o2);
                        this.containerView.invalidate();
                        fiVar.set(this.B0, Float.valueOf(1.0f));
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        x7Var.setTag(num);
                        ehVar.run();
                    }
                }
                if (this.f30177p2 && !(jiVar instanceof gi.f4)) {
                    i12 = 0;
                    this.f30177p2 = false;
                    x7Var.updateColors();
                    x7Var.invalidate();
                    A1();
                } else {
                    i12 = 0;
                }
                if (i15 != 0 && j10 != 6 && j10 != 17 && !(jiVar instanceof gi.f4)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = i12;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                x7Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void a2(boolean z10, Boolean bool) {
        ri riVar;
        if (this.m0 == null) {
            riVar = this;
            co coVar = new co(riVar, getContext(), false, this.resourcesProvider, bool);
            riVar.m0 = coVar;
            riVar.f30210z0[1] = coVar;
            coVar.setDelegate(new bh(this, 15));
        } else {
            riVar = this;
        }
        Z1(riVar.m0, 9L, z10);
    }

    public final void b2(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        ji jiVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        x7 x7Var = this.f30130a1;
        if ((z10 && x7Var.getTag() == null) || (!z10 && x7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            x7Var.setTag(num);
            AnimatorSet animatorSet = this.f30133b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f30133b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f30190t1) && this.B0 == this.f30158j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            uh uhVar = this.A1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30140d1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                uhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
            if (o2Var != null) {
                if (z10) {
                    if (this.f30163k2) {
                        i10 = org.telegram.ui.ActionBar.k6.f21490tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21255h5;
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
                this.f30133b1 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - x7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var, property, f12);
                ofFloat.addUpdateListener(new ch(this, 4));
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
                this.f30133b1.playTogether(arrayList);
                this.f30133b1.addListener(new org.telegram.ui.ho(3, this, z10));
                this.f30133b1.setInterpolator(zr.h);
                this.f30133b1.setDuration(380L);
                this.f30133b1.start();
                return;
            }
            if (z10 && this.V0 && ((jiVar = this.B0) == null || jiVar.L())) {
                uhVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            x7Var.setAlpha(f7);
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f30153h1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f30190t1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void c2() {
        float alpha;
        int[] iArr = this.J0;
        xh xhVar = this.H0;
        xhVar.getLocationOnScreen(iArr);
        if (this.H2 != null) {
            ji jiVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
            if ((jiVar == chatAttachAlertPhotoLayout || jiVar == this.f30178q0) && this.f30136c0) {
                ah.v vVar = this.R0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.H2.getTop());
            } else {
                alpha = -xhVar.getHeight();
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
            o1.k kVar = this.f30188s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f30191t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1() {
        if (r1().f29381a.length() <= 0) {
            return;
        }
        this.B0.a(r1().getText());
    }

    public final void d2(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.d2(int):void");
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
        oi oiVar = this.D1;
        if (oiVar != null) {
            oiVar.l();
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
        pi piVar = this.f30138c2;
        if (piVar != null) {
            piVar.r(new eh(this, 3));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.e1():void");
    }

    public final void e2() {
        boolean h;
        float f7;
        float f10;
        float f11;
        ji jiVar = this.B0;
        int i10 = 0;
        if (jiVar == null) {
            h = false;
        } else {
            h = jiVar.h();
        }
        di.n nVar = this.f30156i1;
        nVar.setEnabled(h);
        ji jiVar2 = this.B0;
        float f12 = 0.5f;
        if (jiVar2 != null) {
            if (jiVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.C0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f30139d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        ji jiVar3 = this.C0;
        if (jiVar3 != null) {
            if (jiVar3.h()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f30139d0, f12, f7);
        }
        this.f30159j1 = f7;
        if (nVar != null) {
            float f13 = f7 * this.f30162k1;
            nVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            nVar.setVisibility(i10);
        }
    }

    public final boolean f1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).N6()) {
            return true;
        }
        return false;
    }

    public final void f2(ji jiVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (jiVar != null) {
            bh.f fVar = this.I2;
            if (fVar != null && Build.VERSION.SDK_INT >= 31) {
                fVar.f(0.0f, i10);
                e1();
            }
            int currentItemTop = jiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (jiVar == this.B0 && currentItemTop <= jiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (jiVar == this.B0) {
                    b2(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.tl.D(11.0f, i11, currentItemTop);
                ji jiVar2 = this.B0;
                if (jiVar2 == jiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((jiVar2 instanceof zm) || (this.C0 instanceof zm)) {
                    Object obj = this.f30200w1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f17615f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f30144e2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f30148f2 = i13;
                        return;
                    }
                    return;
                }
                this.f30148f2 = i13;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f30143e1) != null) {
            int i10 = 0;
            if (this.f30190t1 && this.f30155i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f9888f = z12;
            if (!z10) {
                ((d6) uVar.f9889g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30147f1;
            if (z10 && this.f30190t1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(zr.h).withEndAction(new nh(this, z11, 0)).start();
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
            ji[] jiVarArr = this.f30210z0;
            if (i10 < jiVarArr.length) {
                ji jiVar = jiVarArr[i10];
                if (jiVar != null && (themeDescriptions = jiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.container, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21272i5));
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
        vh vhVar = this.B1;
        if (vhVar == null) {
            return;
        }
        int childCount = vhVar.getChildCount();
        boolean z11 = false;
        for (int i18 = 0; i18 < childCount; i18++) {
            vhVar.getChildAt(i18);
        }
        boolean z12 = this.f30163k2;
        if (z12) {
            i10 = org.telegram.ui.ActionBar.k6.f21263hg;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21290j5;
        }
        org.telegram.ui.ActionBar.r6.W(this.f30166m1, i10, this.resourcesProvider);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.k6.f21263hg;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21290j5;
        }
        org.telegram.ui.ActionBar.r6.W(this.f30183r1, i11, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.W(this.f30156i1, org.telegram.ui.ActionBar.k6.Sh, this.resourcesProvider);
        if (z12) {
            i12 = org.telegram.ui.ActionBar.k6.f21263hg;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21290j5;
        }
        int themedColor = getThemedColor(i12);
        if (this.f30201w2 && themedColor == this.f30197v2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f30201w2 = true;
        this.f30197v2 = themedColor;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30140d1;
        if (z10) {
            u0Var.setIconColor(themedColor);
        }
        Drawable background = u0Var.getBackground();
        if (z12) {
            i13 = org.telegram.ui.ActionBar.k6.f21281ig;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.k6.z1(getThemedColor(i13), background);
        int i19 = org.telegram.ui.ActionBar.k6.E8;
        u0Var.G(getThemedColor(i19), false);
        u0Var.G(getThemedColor(i19), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30147f1;
        if (u0Var2 != null && z10) {
            u0Var2.setIconColor(themedColor);
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30153h1;
        if (u0Var3 != null) {
            if (z10) {
                u0Var3.setIconColor(themedColor);
            }
            Drawable background2 = u0Var3.getBackground();
            if (z12) {
                i17 = org.telegram.ui.ActionBar.k6.f21281ig;
            } else {
                i17 = org.telegram.ui.ActionBar.k6.I5;
            }
            org.telegram.ui.ActionBar.k6.z1(getThemedColor(i17), background2);
        }
        xh xhVar = this.H0;
        org.telegram.ui.ActionBar.g6 g6Var = xhVar.M;
        ju juVar = xhVar.f29381a;
        int i20 = xhVar.L;
        if (i20 == 0) {
            juVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, g6Var));
            int i21 = org.telegram.ui.ActionBar.k6.G6;
            juVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i21, g6Var));
            juVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i21, g6Var));
        } else if (i20 != 2 && i20 != 3) {
            juVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21479t5, g6Var));
            juVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21290j5, g6Var));
        } else {
            juVar.setHintTextColor(-1929379841);
            juVar.setTextColor(-1);
            juVar.setCursorColor(-1);
            juVar.setHandlesColor(-1);
            juVar.setHighlightColor(822083583);
            juVar.quoteColor = -1;
        }
        xhVar.f29383c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
        ku kuVar = xhVar.d;
        if (kuVar != null) {
            kuVar.updateColors();
        }
        org.telegram.ui.ActionBar.r6.m(vhVar, 21, org.telegram.ui.ActionBar.k6.A5, this.resourcesProvider);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.k6.f21263hg;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.f21290j5;
        }
        org.telegram.ui.ActionBar.g6 g6Var2 = this.resourcesProvider;
        x7 x7Var = this.f30130a1;
        org.telegram.ui.ActionBar.r6.m(x7Var, 1, i14, g6Var2);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.k6.f21281ig;
        } else {
            i15 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.r6.m(x7Var, 3, i15, this.resourcesProvider);
        if (z12) {
            i16 = org.telegram.ui.ActionBar.k6.f21263hg;
        } else {
            i16 = org.telegram.ui.ActionBar.k6.f21290j5;
        }
        org.telegram.ui.ActionBar.r6.m(x7Var, 5, i16, this.resourcesProvider);
        int v12 = v1(false);
        org.telegram.ui.ActionBar.k6.z1(v12, this.shadowDrawable);
        gh.c cVar = this.L2;
        if (cVar.f11074a.getColor() != v12) {
            cVar.a(v12);
            kh.f fVar = this.f30208y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            wh whVar = this.f30211z1;
            if (whVar != null) {
                whVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i22 = 0;
        while (true) {
            ji[] jiVarArr = this.f30210z0;
            if (i22 >= jiVarArr.length) {
                break;
            }
            ji jiVar = jiVarArr[i22];
            if (jiVar != null) {
                jiVar.d();
            }
            i22++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21272i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z11 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z11);
            return;
        }
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
    }

    public final void h2(boolean z10) {
        boolean z11;
        float f7;
        ji jiVar = this.f30158j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f30178q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.f30181r;
                if (g6Var == null) {
                    g6Var = this.resourcesProvider;
                }
                ?? jiVar2 = new ji(context, g6Var, this);
                jiVar2.f33296y = 0.0f;
                jiVar2.E = 0.0f;
                jiVar2.F = 0.0f;
                jiVar2.G = 0.0f;
                jiVar2.H = 0.0f;
                jiVar2.I = 0.0f;
                jiVar2.J = null;
                jiVar2.K = false;
                jiVar2.M = 0.0f;
                jiVar2.Q = false;
                jiVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jiVar2.T = z11;
                jiVar2.f33291n = g6Var;
                jiVar2.f27706f = true;
                jiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y m10 = jiVar2.f27704b.f30130a1.m();
                TextView textView = new TextView(context);
                jiVar2.f33295x = textView;
                org.telegram.ui.ActionBar.g6 g6Var2 = jiVar2.f27703a;
                hm hmVar = new hm(jiVar2, context, m10, g6Var2, 1);
                x7 x7Var = jiVar2.f27704b.f30130a1;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                x7Var.addView(hmVar, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var2);
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                hmVar.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.u1 u1Var = new ai.u1(jiVar2, context, g6Var2, 15);
                jiVar2.f33292r = u1Var;
                u1Var.setAdapter(new org.telegram.ui.z7(jiVar2, 3));
                s4.b0 b0Var = new s4.b0(1, false);
                jiVar2.f33293s = b0Var;
                u1Var.setLayoutManager(b0Var);
                u1Var.setClipChildren(false);
                u1Var.setClipToPadding(false);
                u1Var.setOverScrollMode(2);
                u1Var.setVerticalScrollBarEnabled(false);
                ym ymVar = new ym(jiVar2, context);
                jiVar2.v = ymVar;
                ymVar.setClipToPadding(true);
                ymVar.setClipChildren(true);
                jiVar2.addView(u1Var, w7.z5.c(-1.0f, -1));
                jiVar2.P = jiVar2.f27704b.f30158j0;
                ymVar.f32980c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jiVar2.P;
                ymVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                ymVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                ymVar.c();
                UndoView undoView = new UndoView(context, null, false, jiVar2.f27704b.f30181r);
                jiVar2.f33294w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                jiVar2.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                jiVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f30178q0 = jiVar2;
                jiVar2.bringToFront();
            }
            ji jiVar3 = this.B0;
            zm zmVar = this.f30178q0;
            if (jiVar3 != zmVar) {
                jiVar = zmVar;
            }
            Y1(jiVar);
            return;
        }
        Y1(jiVar);
    }

    public final void i1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.i1(boolean):void");
    }

    public final void i2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.i2(int):void");
    }

    public final void j1() {
        float f7 = this.f30135c.e;
        float f10 = (1.0f - this.f30131b.e) * f7;
        this.f30211z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void j2() {
        int i10 = 0;
        i2(0);
        this.f30193u1.invalidate();
        ah.v vVar = this.R0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
        if (chatAttachAlertPhotoLayout != null) {
            cm cmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (cmVar != null && cmVar.getFastScroll() != null) {
                sl0 fastScroll = cmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f24258p1;
                if (this.f30136c0) {
                    i10 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.f30552h0 = currentActionBarHeight + i10;
                cmVar.getFastScroll().invalidate();
            }
        }
        c2();
        l1();
    }

    public final void k1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f30145f.e;
        float b10 = zf.f0.b(this.h.e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        f20.d(this.I0, com.google.android.gms.internal.play_billing.k3.C(f10, f11, b10, f7));
    }

    public final void l1() {
        ci ciVar = this.L0;
        uh uhVar = this.K0;
        ah.v vVar = this.R0;
        if (vVar != null && vVar.getVisibility() == 0 && vVar.getAlpha() != 0.0f) {
            float f7 = this.f30131b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            ciVar.setAlpha(abs * abs * abs * abs);
            uhVar.setTranslationY(AndroidUtilities.lerp(this.f30160j2, ((vVar.getTranslationY() + vVar.getTop()) - uhVar.getTop()) + AndroidUtilities.dp(8.0f), zr.f33340j.getInterpolation(f7)));
            return;
        }
        uhVar.setTranslationY(this.f30160j2);
        ciVar.setAlpha(1.0f);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f30170n1;
        if (u0Var != null) {
            this.f30166m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void n1(hg.o oVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f30166m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f30155i0 = false;
        this.J = oVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30170n1;
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
        ji jiVar;
        int i11;
        if (i10 == 0) {
            l1();
            j1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            j1();
            co coVar = this.m0;
            if (coVar != null && ((jiVar = this.C0) == coVar || this.B0 == coVar)) {
                if (jiVar == coVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                i2(i11);
            }
            co coVar2 = this.f30169n0;
            if (coVar2 != null) {
                ji jiVar2 = this.C0;
                if (jiVar2 == coVar2 || this.B0 == coVar2) {
                    if (jiVar2 != coVar2) {
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
            ci ciVar = this.L0;
            if (ciVar != null) {
                ciVar.setEphemeralFactor(f7);
                ciVar.setSameWidthFactor(f7);
            }
        }
    }

    public final int o1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if ((o2Var instanceof org.telegram.ui.sn) && (messagePreviewParams = ((org.telegram.ui.sn) o2Var).f41660r5) != null) {
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
        x7 x7Var = this.f30130a1;
        if (x7Var.f21069n0) {
            x7Var.g(true);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final yk ykVar = this.f30199w0;
        if (ykVar != null && this.B0 == ykVar) {
            final eh ehVar = new eh(this, 1);
            int i10 = ykVar.f32954n;
            org.telegram.ui.Wallet.i9 i9Var = ykVar.R;
            ri riVar = ykVar.f27704b;
            AnimatorSet animatorSet = null;
            if (!ykVar.K && (wallettransaction = ykVar.P0) != null && ykVar.Q0 == null && ykVar.R0 == null) {
                if (ykVar.S0) {
                    org.telegram.ui.Wallet.o5 o5Var = new org.telegram.ui.Wallet.o5();
                    o5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
                    if (o2Var != null && o2Var.presentFragment(o5Var, false, true)) {
                        org.telegram.ui.Wallet.w9 w9Var = new org.telegram.ui.Wallet.w9(riVar.getContainer(), riVar.getSheetContainer(), i9Var.getDiamondView(), o5Var, ykVar.P0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!ykVar.K) {
                                            ehVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!ykVar.K) {
                                            ehVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, riVar);
                        ykVar.R0 = w9Var;
                        animatorSet = w9Var.f35370m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.m6 diamondView = i9Var.getDiamondView();
                    if (diamondView.f34867f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.o2 o2Var2 = riVar.f30146f0;
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (snVar.getCurrentAccount() == i10 && snVar.a() == ykVar.f32959r.f20491id && snVar.f41489d4 == 0 && snVar.getFragmentView() != null && snVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.e6 e6Var = new org.telegram.ui.Wallet.e6(riVar.getContainer(), riVar.getSheetContainer(), i9Var.getDiamondView(), snVar, ykVar.P0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!ykVar.K) {
                                                    ehVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!ykVar.K) {
                                                    ehVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, riVar);
                                ykVar.Q0 = e6Var;
                                animatorSet = e6Var.f34450m;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
        fa1 fa1Var = chatAttachAlertPhotoLayout.f24250l0;
        ah.x xVar = chatAttachAlertPhotoLayout.f24246j0;
        TextView textView = chatAttachAlertPhotoLayout.f24257p0;
        cm cmVar = chatAttachAlertPhotoLayout.f24260r;
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
                if (cmVar.getVisibility() == 0) {
                    xVar.layout(0, org.telegram.messenger.v0.B(222.0f, i13, i16), i14, org.telegram.messenger.v0.B(96.0f, i13, i16));
                    return true;
                }
                xVar.layout(0, org.telegram.messenger.v0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (cmVar.getVisibility() == 0) {
                xVar.layout(org.telegram.messenger.v0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                xVar.layout(org.telegram.messenger.v0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == fa1Var) {
            if (z10) {
                if (cmVar.getVisibility() == 0) {
                    fa1Var.layout(0, org.telegram.messenger.v0.B(310.0f, i13, i16), i14, org.telegram.messenger.v0.B(260.0f, i13, i16));
                    return true;
                }
                fa1Var.layout(0, org.telegram.messenger.v0.B(176.0f, i13, i16), i14, org.telegram.messenger.v0.B(126.0f, i13, i16));
                return true;
            } else if (cmVar.getVisibility() == 0) {
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
                if (cmVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (cmVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != cmVar) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
        qm qmVar = chatAttachAlertPhotoLayout.v;
        cm cmVar = chatAttachAlertPhotoLayout.f24260r;
        hg.a0 a0Var = chatAttachAlertPhotoLayout.f24262s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        mm mmVar = chatAttachAlertPhotoLayout.P;
        if (view == mmVar) {
            if (chatAttachAlertPhotoLayout.f24230b0 && !chatAttachAlertPhotoLayout.f24234d0) {
                mmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ah.x xVar = chatAttachAlertPhotoLayout.f24246j0;
            if (view == xVar) {
                if (z10) {
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                xVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            fa1 fa1Var = chatAttachAlertPhotoLayout.f24250l0;
            if (view == fa1Var) {
                if (z10) {
                    fa1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                fa1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == cmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    cmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f46330o != 0) {
                        cmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        qmVar.l();
                    }
                } else {
                    cmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f46330o != 1) {
                        cmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        qmVar.l();
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
        this.f30158j0.setTranslationX(0.0f);
        this.f30179q1.setAlpha(0.0f);
        this.f30173o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30191t2 = animatorSet;
        fi fiVar = this.f30184r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, fiVar, 0.0f, 400.0f));
        this.f30191t2.setDuration(400L);
        this.f30191t2.setStartDelay(20L);
        fiVar.set(this, Float.valueOf(0.0f));
        this.f30191t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ch(this, 2));
        o1.k kVar = this.f30188s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f17605n, 0.0f);
        this.f30188s2 = kVar2;
        if (this.K1 != null) {
            kVar2.f17622u.a(0.75f);
            this.f30188s2.f17622u.b(350.0f);
        } else {
            kVar2.f17622u.a(0.75f);
            this.f30188s2.f17622u.b(350.0f);
        }
        this.f30188s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.g3 g3Var = this.backDrawable;
        p6 p6Var = r6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(g3Var, p6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        jg jgVar = new jg(this, animationNotificationsLocker, this.delegate, 2);
        this.f30188s2.a(new gi.b4(2, this, jgVar));
        this.currentSheetAnimation.addListener(new ai.ne(23, this, jgVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        S1(0.0f);
        ofFloat2.addUpdateListener(new ch(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(zr.f33337f);
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
        if (this.f30146f0 instanceof org.telegram.ui.sn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30196v1 = true;
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
            bh.c cVar = this.f30132b0;
            if (cVar != null) {
                cVar.updateColors();
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21290j5);
            org.telegram.ui.ActionBar.u0 u0Var = this.f30170n1;
            if (u0Var != null && themedColor != this.f30194u2) {
                this.f30194u2 = themedColor;
                u0Var.setIconColor(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final TLRPC.Chat p1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) o2Var).e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float q1() {
        uh uhVar = this.G0;
        float alpha = 1.0f - uhVar.getAlpha();
        return uhVar.getMeasuredHeight() - (alpha * (uhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ou r1() {
        ji jiVar;
        if (this.f30136c0 && ((jiVar = this.B0) == this.f30158j0 || jiVar == this.f30178q0)) {
            return this.S0;
        }
        return this.H0;
    }

    public final long s1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
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
        ji jiVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30158j0;
        if (jiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f24245i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            this.calcMandatoryInsets = ((org.telegram.ui.sn) o2Var).C9();
        }
        e2();
        this.f30196v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7), 0);
            this.navBarColor = o10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f30177p2) {
            this.f30177p2 = false;
            x7 x7Var = this.f30130a1;
            x7Var.updateColors();
            x7Var.invalidate();
            A1();
        }
    }

    public final int t1() {
        ji jiVar = this.B0;
        co coVar = this.m0;
        if (jiVar == coVar && coVar.E != null) {
            return coVar.getEmojiPadding();
        }
        co coVar2 = this.f30169n0;
        if (jiVar == coVar2 && coVar2.E != null) {
            return coVar2.getEmojiPadding();
        }
        if (this.f30136c0) {
            return this.S0.getEmojiPadding();
        }
        return this.H0.getEmojiPadding();
    }

    public final int u1(int i10) {
        ji jiVar = this.C0;
        int[] iArr = this.f30144e2;
        if (jiVar != null && ((this.B0 instanceof zm) || (jiVar instanceof zm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f30139d0);
        }
        return iArr[i10];
    }

    public final int v1(boolean z10) {
        boolean q6;
        int i10;
        x7 x7Var;
        if (this.f30163k2) {
            return getThemedColor(org.telegram.ui.ActionBar.k6.f21490tg);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Iterator it = this.f30168n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            long longValue = ((Long) gVar.f17456a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.r.a(f7, 0.0f, 1.0f);
        if (z10 && (x7Var = this.f30130a1) != null && x7Var.getVisibility() == 0) {
            a2 *= 1.0f - x7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21272i5;
        }
        return i0.a.f(a2, themedColor, getThemedColor(i10));
    }

    public final void w1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.w1():void");
    }

    public final boolean x1() {
        if (this.f30136c0) {
            ji jiVar = this.B0;
            if (jiVar == this.f30158j0 || jiVar == this.f30178q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        pi piVar = this.f30138c2;
        if (piVar != null && !this.f30204x1) {
            boolean u10 = piVar.u();
            this.f30204x1 = true;
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
        ai aiVar;
        xh xhVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        ji jiVar = this.B0;
        yk ykVar = this.f30199w0;
        boolean z10 = (jiVar != ykVar || ykVar == null || ykVar.K || ykVar.P0 == null) ? false : true;
        this.f30203x0 = z10;
        if (!z10 && (xhVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(xhVar.getEditText());
        }
        if (!this.f30203x0 && (aiVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.f30146f0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.G2 && o2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.F2) {
                return;
            }
            this.F2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new bh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20679a.setOnCancelListener(new hh(this, 0));
            y0 y0Var = new y0(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.N = y0Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, this.resourcesProvider);
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            ji[] jiVarArr = this.f30210z0;
            if (i10 >= jiVarArr.length) {
                break;
            }
            ji jiVar2 = jiVarArr[i10];
            if (jiVar2 != null && this.B0 != jiVar2) {
                jiVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7), 0), true, (AndroidUtilities.IntColorCallback) new bh(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.f30165l2 = false;
        super.dismiss();
        this.G2 = false;
    }

    @Override
    public final void H(float f7, int i10) {
    }

    public ri(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}
