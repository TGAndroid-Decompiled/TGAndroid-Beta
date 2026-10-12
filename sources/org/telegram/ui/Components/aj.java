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
import org.telegram.ui.pj1;
public class aj extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, me.d {
    public static final int R2 = 0;
    public final LongSparseArray A0;
    public final ci A1;
    public double[] A2;
    public si B0;
    public final di B1;
    public boolean B2;
    public si C0;
    public final s4.d0 C1;
    public boolean C2;
    public final ch.d D0;
    public final xi D1;
    public boolean D2;
    public final i0 E;
    public final ch.d E0;
    public boolean E1;
    public ci.i E2;
    public boolean F;
    public final hg.k F0;
    public final RadialProgressView F1;
    public final ah.h F2;
    public boolean G;
    public final ci G0;
    public boolean G1;
    public final fh.d G2;
    public boolean H;
    public final fi H0;
    public final r6 H1;
    public final fh.d H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final fh.c I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final ah.c J2;
    public int K;
    public final ci K0;
    public MessageObject K1;
    public final ah.c K2;
    public int L;
    public final ki L0;
    public boolean L1;
    public final ph L2;
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
    public n50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ci.m6 R0;
    public boolean R1;
    public final xe0 S;
    public final ii S0;
    public boolean S1;
    public oo T;
    public int T0;
    public boolean T1;
    public p50 U;
    public ju U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public lk X;
    public boolean X0;
    public boolean X1;
    public jj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean f24320a0;
    public final a8 f24321a1;
    public ValueAnimator a2;
    public final me.b f24322b;
    public final ah.d f24323b0;
    public AnimatorSet f24324b1;
    public int f24325b2;
    public final me.b f24326c;
    public boolean f24327c0;
    public AnimatorSet f24328c1;
    public yi f24329c2;
    public final me.b d;
    public float f24330d0;
    public final org.telegram.ui.ActionBar.u0 f24331d1;
    public xn f24332d2;
    public final me.b f24333e;
    public final oi f24334e0;
    public final ci.u f24335e1;
    public final int[] f24336e2;
    public final me.b f24337f;
    public final org.telegram.ui.ActionBar.m2 f24338f0;
    public final org.telegram.ui.ActionBar.u0 f24339f1;
    public int f24340f2;
    public final boolean f24341g0;
    public ci.d4 f24342g1;
    public float f24343g2;
    public final me.b h;
    public rf f24344h0;
    public final org.telegram.ui.ActionBar.u0 f24345h1;
    public float f24346h2;
    public boolean f24347i0;
    public final bi.o f24348i1;
    public boolean f24349i2;
    public final ChatAttachAlertPhotoLayout f24350j0;
    public float f24351j1;
    public float f24352j2;
    public ek f24353k0;
    public float f24354k1;
    public final boolean f24355k2;
    public mj f24356l0;
    public final ci l1;
    public boolean f24357l2;
    public no m0;
    public final TextView f24358m1;
    public final ArrayList f24359m2;
    public final me.l f24360n;
    public no f24361n0;
    public final org.telegram.ui.ActionBar.u0 f24362n1;
    public final Rect f24363n2;
    public zl f24364o0;
    public final LinearLayout f24365o1;
    public float f24366o2;
    public uk f24367p0;
    public final ImageView f24368p1;
    public boolean f24369p2;
    public jn f24370q0;
    public final LinearLayout f24371q1;
    public int f24372q2;
    public org.telegram.ui.bo f24373r;
    public pj f24374r0;
    public final TextView f24375r1;
    public final oi f24376r2;
    public final r6 f24377s;
    public hg.j0 f24378s0;
    public float f24379s1;
    public o1.k f24380s2;
    public vk f24381t0;
    public boolean f24382t1;
    public AnimatorSet f24383t2;
    public vk f24384u0;
    public final qi f24385u1;
    public boolean f24386u2;
    public final r6 v;
    public ii.r f24387v0;
    public boolean f24388v1;
    public boolean f24389v2;
    public final ImageView f24390w;
    public il f24391w0;
    public Object f24392w1;
    public ul f24393w2;
    public final i0 f24394x;
    public boolean f24395x0;
    public boolean f24396x1;
    public boolean f24397x2;
    public final ImageView f24398y;
    public float f24399y0;
    public final jh.f f24400y1;
    public boolean f24401y2;
    public final si[] f24402z0;
    public final ei f24403z1;
    public File f24404z2;

    public aj(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        bi.o oVar;
        int i10;
        float f7;
        a8 a8Var;
        js jsVar = js.h;
        this.f24322b = new me.b(0, this, jsVar, 380L, false);
        this.f24326c = new me.b(1, this, jsVar, 380L, false);
        this.d = new me.b(2, this, jsVar, 380L, false);
        this.f24333e = new me.b(3, this, jsVar, 380L, false);
        this.f24337f = new me.b(4, this, jsVar, 380L, true);
        this.h = new me.b(5, this, jsVar, 320L, false);
        me.l lVar = new me.l(new ih(this, 2), jsVar, 380L);
        this.f24360n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f24330d0 = 0.0f;
        this.f24334e0 = new oi(this, 0);
        this.f24347i0 = false;
        si[] siVarArr = new si[12];
        this.f24402z0 = siVarArr;
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
        this.f24325b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f24336e2 = new int[2];
        new Paint(1);
        this.f24357l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f24359m2 = arrayList;
        Rect rect = new Rect();
        this.f24363n2 = rect;
        this.f24376r2 = new oi(this, 1);
        this.f24386u2 = true;
        this.f24389v2 = false;
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
        fh.c cVar = new fh.c();
        this.I2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.H2 = dVar;
            dVar.j(new l2.g(this, 9));
            fh.d dVar2 = new fh.d(null);
            this.G2 = dVar2;
            dVar2.j(new k2.g0(this, 11));
            ah.c cVar2 = new ah.c(dVar);
            this.J2 = cVar2;
            cVar2.f549i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.K2 = cVar3;
            cVar3.f549i = LiteMode.isEnabled(262144);
        } else {
            this.F2 = null;
            this.G2 = null;
            this.H2 = null;
            this.J2 = new ah.c(cVar);
            this.K2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.L2 = new ph(this, 0);
        this.f24355k2 = z10;
        this.f24341g0 = (m2Var instanceof org.telegram.ui.eo) && m2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f24338f0 = m2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        qi qiVar = new qi(this, context);
        this.f24385u1 = qiVar;
        qiVar.setDelegate(new ri(this));
        this.containerView = qiVar;
        qiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        a8 a8Var2 = new a8(this, context, c6Var, 1);
        this.f24321a1 = a8Var2;
        a8Var2.S0 = true;
        a8Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        a8Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(false));
        int i13 = org.telegram.ui.ActionBar.h6.f20668j5;
        a8Var2.E(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.h6.I5;
        a8Var2.D(getThemedColor(i14), false);
        a8Var2.setTitleColor(getThemedColor(i13));
        a8Var2.setOccupyStatusBar(true);
        a8Var2.setAlpha(0.0f);
        a8Var2.setActionBarMenuOnItemClick(new org.telegram.ui.lc(this, 9));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
        this.f24331d1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new ih(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
        this.f24339f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f24335e1 = uVar;
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
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        bi.o oVar2 = new bi.o(this, context);
        oVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        oVar2.setText(LocaleController.getString(R.string.Create));
        oVar2.setTypeface(AndroidUtilities.bold());
        oVar2.setTextSize(1, 14.0f);
        oVar2.setVisibility(4);
        oVar2.setAlpha(0.0f);
        oVar2.setGravity(17);
        oVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        oVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        oVar2.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        w7.y5.a(oVar2);
        this.f24348i1 = oVar2;
        a2();
        if (m2Var != null) {
            oVar = oVar2;
            u0Var = u0Var3;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
            this.f24345h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i10 = -1;
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 6, -1));
            u0Var4.setOnClickListener(new ai.k3(5, this, z11));
        } else {
            u0Var = u0Var3;
            oVar = oVar2;
            i10 = -1;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i13), false, c6Var);
        this.f24362n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i14), 3, i10));
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final aj f28787b;

            {
                this.f28787b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.eo eoVar;
                switch (r3) {
                    case 0:
                        final aj ajVar = this.f28787b;
                        fi fiVar = ajVar.H0;
                        if (fiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(ajVar.getContext(), c6Var);
                            e0Var.n0(fiVar.getText());
                            e0Var.f25522j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fi fiVar2 = ajVar.H0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ii iiVar = ajVar.S0;
                                            iiVar.setText(charSequence);
                                            iiVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = ajVar.Z;
                            if (ajVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            rh rhVar = new rh(ajVar, 0);
                            e0Var.f25524l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25525n0 = rhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final aj ajVar2 = this.f28787b;
                        ii iiVar = ajVar2.S0;
                        if (iiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(ajVar2.getContext(), c6Var);
                            e0Var2.n0(iiVar.getText());
                            e0Var2.f25522j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fi fiVar2 = ajVar2.H0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ii iiVar2 = ajVar2.S0;
                                            iiVar2.setText(charSequence);
                                            iiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = ajVar2.Z;
                            if (ajVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            rh rhVar2 = new rh(ajVar2, 1);
                            e0Var2.f25524l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25525n0 = rhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        aj ajVar3 = this.f28787b;
                        ajVar3.f24362n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = ajVar3.f24338f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(ajVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i15 = ajVar3.V1;
                        boolean z15 = ajVar3.W1;
                        t13.h = i15;
                        t13.f33819n = z15;
                        if (!ajVar3.f24329c2.g0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(ajVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(ajVar3.M1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        bi biVar = new bi(ajVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.eo) {
                            eoVar = (org.telegram.ui.eo) m2Var2;
                        } else {
                            eoVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, biVar, eoVar);
                        if (ajVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, ajVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        ci ciVar = new ci(this, context, 0);
        this.l1 = ciVar;
        ciVar.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        ciVar.setAlpha(0.0f);
        ciVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24365o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f24358m1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.w5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f24368p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.w5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ciVar.addView(linearLayout, w7.w5.d(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f24371q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.w5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f24375r1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.w5.q(-2, -2, 16));
        ciVar.addView(linearLayout2, w7.w5.d(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.f24350j0 = chatAttachAlertPhotoLayout;
        siVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.w5.d(-1.0f, -1));
        ?? view = new View(context);
        this.f24400y1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.w5.g());
        this.containerView.addView(ciVar, w7.w5.a(-2.0f, 23.0f, 0.0f, 21.0f, 0.0f, -1, 51));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.R0 = m6Var;
        this.containerView.addView(m6Var, w7.w5.e(-1, -2, 55));
        this.containerView.addView(a8Var2, w7.w5.d(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.w5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.w5.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f24345h1;
        if (u0Var6 != null) {
            a8Var = a8Var2;
            this.containerView.addView(u0Var6, w7.w5.e(48, 48, 53));
        } else {
            a8Var = a8Var2;
        }
        ciVar.addView(u0Var5, w7.w5.a(32.0f, 0.0f, 0.0f, 0.0f, 8.0f, 32, 21));
        this.containerView.addView(oVar, w7.w5.e(-2, 48, 53));
        ci ciVar2 = new ci(this, context, 1);
        this.A1 = ciVar2;
        di diVar = new di(context, 0);
        this.B1 = diVar;
        diVar.setClipChildren(true);
        diVar.setClipToPadding(false);
        xi xiVar = new xi(this, context);
        this.D1 = xiVar;
        diVar.setAdapter(xiVar);
        s4.d0 d0Var = new s4.d0(0, false);
        this.C1 = d0Var;
        diVar.setLayoutManager(d0Var);
        diVar.setVerticalScrollBarEnabled(false);
        diVar.setHorizontalScrollBarEnabled(false);
        diVar.setItemAnimator(null);
        diVar.setLayoutAnimation(null);
        diVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        diVar.f32487x2 = true;
        diVar.setOverScrollMode(2);
        ah.c cVar5 = this.J2;
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        cVar5.f547f = jVar;
        cVar5.f548g = viewGroup2;
        ah.c cVar6 = this.K2;
        hh.j jVar2 = new hh.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        cVar6.f547f = jVar2;
        cVar6.f548g = viewGroup3;
        hh.j jVar3 = new hh.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        cVar4.f547f = jVar3;
        cVar4.f548g = viewGroup4;
        ei eiVar = new ei(this, context, 0);
        this.f24403z1 = eiVar;
        ah.d dVar3 = new ah.d(cVar4.c(eiVar, null, false));
        this.f24323b0 = dVar3;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        dVar3.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(eiVar, w7.w5.g());
        ch.d c10 = this.J2.c(ciVar2, eh.b.f(c6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        ciVar2.setBackground(c10);
        diVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        diVar.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52403a;
        diVar.setOutlineProvider(new yf.h0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        diVar.setImportantForAccessibility(1);
        ciVar2.addView(diVar, w7.w5.g());
        this.containerView.addView(ciVar2, w7.w5.e(-1, 70, 81));
        diVar.setOnItemClickListener(new ai.o6(9, this, c6Var));
        diVar.setOnItemLongClickListener(new ih(this, 3));
        r6 r6Var = new r6(context, true, false, true);
        this.H1 = r6Var;
        r6Var.setVisibility(8);
        r6Var.setAlpha(0.0f);
        r6Var.setGravity(17);
        r6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        r6Var.setPadding(dp, 0, dp, 0);
        r6Var.setTextSize(AndroidUtilities.dp(f7));
        r6Var.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        this.containerView.addView(r6Var, w7.w5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.w5.a(28.0f, 0.0f, 0.0f, 10.0f, 10.0f, 28, 85));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f20964z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        ci ciVar3 = new ci(this, context, 2);
        this.G0 = ciVar3;
        hg.k kVar = new hg.k(this, context);
        this.F0 = kVar;
        ciVar3.addView(kVar, w7.w5.e(-1, -1, 119));
        ch.d c11 = this.K2.c(qiVar, eh.b.n(c6Var), false);
        this.D0 = c11;
        c11.f4686m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f4683j.f4668g = 0.4f;
        c11.k();
        ch.d c12 = this.J2.c(kVar, eh.b.n(c6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        ciVar3.setWillNotDraw(false);
        ciVar3.setVisibility(4);
        ciVar3.setAlpha(0.0f);
        this.containerView.addView(ciVar3, w7.w5.e(-1, -2, 83));
        ciVar3.setOnTouchListener(new bi.d(13));
        r6 r6Var2 = new r6(context, false, false, false);
        this.f24377s = r6Var2;
        r6Var2.setAllowCancel(true);
        r6Var2.setScaleProperty(0.6f);
        r6Var2.setVisibility(8);
        r6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i15 = org.telegram.ui.ActionBar.h6.f20946y6;
        r6Var2.setTextColor(getThemedColor(i15));
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setGravity(17);
        kVar.addView(r6Var2, w7.w5.a(20.0f, 3.0f, 0.0f, 3.0f, 50.0f, 56, 85));
        ImageView imageView4 = new ImageView(context);
        this.f24390w = imageView4;
        i0 i0Var = new i0(context);
        this.f24394x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.h6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        int i17 = org.telegram.ui.ActionBar.h6.f20651i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        kVar.addView(imageView4, w7.w5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.y5.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28787b;

            {
                this.f28787b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.eo eoVar;
                switch (r3) {
                    case 0:
                        final aj ajVar = this.f28787b;
                        fi fiVar = ajVar.H0;
                        if (fiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(ajVar.getContext(), c6Var);
                            e0Var.n0(fiVar.getText());
                            e0Var.f25522j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fi fiVar2 = ajVar.H0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ii iiVar2 = ajVar.S0;
                                            iiVar2.setText(charSequence);
                                            iiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = ajVar.Z;
                            if (ajVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            rh rhVar = new rh(ajVar, 0);
                            e0Var.f25524l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25525n0 = rhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final aj ajVar2 = this.f28787b;
                        ii iiVar = ajVar2.S0;
                        if (iiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(ajVar2.getContext(), c6Var);
                            e0Var2.n0(iiVar.getText());
                            e0Var2.f25522j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fi fiVar2 = ajVar2.H0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ii iiVar2 = ajVar2.S0;
                                            iiVar2.setText(charSequence);
                                            iiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = ajVar2.Z;
                            if (ajVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            rh rhVar2 = new rh(ajVar2, 1);
                            e0Var2.f25524l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25525n0 = rhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        aj ajVar3 = this.f28787b;
                        ajVar3.f24362n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = ajVar3.f24338f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(ajVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = ajVar3.V1;
                        boolean z15 = ajVar3.W1;
                        t13.h = i152;
                        t13.f33819n = z15;
                        if (!ajVar3.f24329c2.g0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(ajVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(ajVar3.M1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        bi biVar = new bi(ajVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.eo) {
                            eoVar = (org.telegram.ui.eo) m2Var2;
                        } else {
                            eoVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, biVar, eoVar);
                        if (ajVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, ajVar3.J);
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
        fi fiVar = new fi(this, context, qiVar, c6Var);
        this.H0 = fiVar;
        fiVar.J = true;
        fiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        fiVar.s();
        fiVar.getEditText().setLayoutParams(w7.w5.a(-1.0f, 48.0f, 0.0f, 36.0f, 0.0f, -1, 19));
        fiVar.getEditText().addTextChangedListener(new hi(this, 0));
        kVar.addView(fiVar, w7.w5.a(-2.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 83));
        kVar.setClipChildren(false);
        ciVar3.setClipChildren(false);
        fiVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        ii iiVar = new ii(this, context, qiVar, c6Var);
        this.S0 = iiVar;
        iiVar.J = true;
        iiVar.getEditText().addTextChangedListener(new ji(this, m2Var));
        iiVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        iiVar.getEditText().setLayoutParams(w7.w5.a(-1.0f, 48.0f, 0.0f, 96.0f, 0.0f, -1, 19));
        iiVar.getEditText().setTextSize(1, 17.0f);
        iiVar.getEmojiButton().setLayoutParams(w7.w5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        iiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(iiVar, w7.w5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        fiVar.addView(imageView3, w7.w5.a(40.0f, 0.0f, 0.0f, 0.0f, 4.0f, 40, 85));
        ch.d c13 = this.J2.c(m6Var, eh.b.n(c6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        m6Var.setBackground(c13);
        m6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        r6 r6Var3 = new r6(context, false, false, false);
        this.v = r6Var3;
        r6Var3.setScaleProperty(0.6f);
        r6Var3.setVisibility(8);
        r6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var3.setTextColor(getThemedColor(i15));
        r6Var3.setTypeface(AndroidUtilities.bold());
        r6Var3.setGravity(17);
        r6Var3.setAllowCancel(true);
        m6Var.addView(r6Var3, w7.w5.a(20.0f, 3.0f, 45.0f, 3.0f, 0.0f, 56, 53));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Xd), mode2));
        iiVar.addView(imageView5, w7.w5.a(40.0f, 0.0f, 0.0f, 60.0f, 0.0f, 40, 85));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f24398y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.w5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 85));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.y5.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28787b;

            {
                this.f28787b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.eo eoVar;
                switch (r3) {
                    case 0:
                        final aj ajVar = this.f28787b;
                        fi fiVar2 = ajVar.H0;
                        if (fiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(ajVar.getContext(), c6Var);
                            e0Var.n0(fiVar2.getText());
                            e0Var.f25522j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fi fiVar22 = ajVar.H0;
                                            fiVar22.setText(charSequence);
                                            fiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ii iiVar2 = ajVar.S0;
                                            iiVar2.setText(charSequence);
                                            iiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = ajVar.Z;
                            if (ajVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            rh rhVar = new rh(ajVar, 0);
                            e0Var.f25524l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25525n0 = rhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final aj ajVar2 = this.f28787b;
                        ii iiVar2 = ajVar2.S0;
                        if (iiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(ajVar2.getContext(), c6Var);
                            e0Var2.n0(iiVar2.getText());
                            e0Var2.f25522j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            fi fiVar22 = ajVar2.H0;
                                            fiVar22.setText(charSequence);
                                            fiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ii iiVar22 = ajVar2.S0;
                                            iiVar22.setText(charSequence);
                                            iiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = ajVar2.Z;
                            if (ajVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            rh rhVar2 = new rh(ajVar2, 1);
                            e0Var2.f25524l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25525n0 = rhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        aj ajVar3 = this.f28787b;
                        ajVar3.f24362n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = ajVar3.f24338f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(ajVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = ajVar3.V1;
                        boolean z15 = ajVar3.W1;
                        t13.h = i152;
                        t13.f33819n = z15;
                        if (!ajVar3.f24329c2.g0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(ajVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(ajVar3.M1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        bi biVar = new bi(ajVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.eo) {
                            eoVar = (org.telegram.ui.eo) m2Var2;
                        } else {
                            eoVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, biVar, eoVar);
                        if (ajVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, ajVar3.J);
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
        ci ciVar4 = new ci(this, context, 3);
        this.K0 = ciVar4;
        ciVar4.setFocusable(true);
        ciVar4.setFocusableInTouchMode(true);
        ciVar4.setVisibility(4);
        ciVar4.setScaleX(0.2f);
        ciVar4.setScaleY(0.2f);
        ciVar4.setAlpha(0.0f);
        ciVar4.setClipChildren(false);
        ciVar4.setClipToPadding(false);
        this.containerView.addView(ciVar4, w7.w5.e(110, 50, 85));
        ki kiVar = new ki(R.drawable.send_plane_24, context, c6Var, this);
        this.L0 = kiVar;
        kiVar.setImportantForAccessibility(2);
        ciVar4.addView(kiVar, w7.w5.e(-1, -1, 119));
        kiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        kiVar.I = dp2;
        kiVar.J = dp3;
        kiVar.M = AndroidUtilities.dp(7.0f);
        kiVar.N = AndroidUtilities.dp(6.0f);
        kiVar.f33372h0 = true;
        kiVar.setOnClickListener(new View.OnClickListener(this) {
            public final aj f28549b;

            {
                this.f28549b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        aj ajVar = this.f28549b;
                        long j3 = ajVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) ajVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        aj ajVar2 = this.f28549b;
                        boolean z14 = ajVar2.f24327c0;
                        if (!z14) {
                            ajVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        aj ajVar3 = this.f28549b;
                        boolean z15 = ajVar3.f24327c0;
                        if (z15) {
                            ajVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28549b.C1();
                        return;
                    case 4:
                        this.f28549b.f24331d1.M(null, null);
                        return;
                    case 5:
                        aj.w(this.f28549b);
                        return;
                    case 6:
                        si siVar = this.f28549b.B0;
                        if (siVar != null) {
                            siVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28549b.f24362n1.M(null, null);
                        return;
                    default:
                        aj ajVar4 = this.f28549b;
                        if (ajVar4.B0 != ajVar4.f24370q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ajVar4.d2(z13);
                        return;
                }
            }
        });
        kiVar.setOnLongClickListener(new org.telegram.ui.lg(this, context, c6Var, m2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        ei eiVar2 = new ei(this, context, 1);
        eiVar2.setAlpha(0.0f);
        eiVar2.setScaleX(0.2f);
        eiVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        dm0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.J2;
        dh.e n10 = eh.b.n(c6Var);
        wm0 wm0Var = fastScroll.f25414o0;
        ch.d c14 = cVar7.c(wm0Var.f32447d1, n10, false);
        fastScroll.f25403e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f25403e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(wm0Var.f32447d1, n10, false);
        fastScroll.f25405f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f25405f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f25405f0.q(AndroidUtilities.dp(f7));
        xe0 xe0Var = new xe0(context);
        this.S = xe0Var;
        this.containerView.addView(xe0Var, w7.w5.d(-1.0f, -1));
        dh.e eVar = new dh.e(c6Var);
        eVar.f8363e = new ih(this, 4);
        eVar.f8362c = new ih(this, 5);
        eVar.d = new ih(this, 6);
        eVar.f8361b = new ih(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8365n = dpf2;
        eVar.f8366r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8364f = dpf23;
        eVar.h = dpf24;
        a8Var.N(this.J2, eVar, false);
        lVar.i(1L, false);
    }

    public static void O(aj ajVar) {
        boolean z10;
        boolean q6;
        int i10;
        a8 a8Var = ajVar.f24321a1;
        jh.f fVar = ajVar.f24400y1;
        if (fVar != null && a8Var != null) {
            si siVar = ajVar.C0;
            if (siVar == null) {
                siVar = ajVar.B0;
            }
            int i11 = 0;
            if (siVar != null && (siVar instanceof il)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.c6 c6Var = ajVar.resourcesProvider;
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            if (!z10 && a8Var.getVisibility() == 0) {
                if (q6) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i11 = (int) (a8Var.getAlpha() * i10);
            }
            fVar.setFadeTopAlpha(i11);
        }
    }

    public static void S(aj ajVar) {
        ci.i iVar = new ci.i(ajVar, ajVar.getContext(), ajVar.Z, LaunchActivity.R(), ajVar.resourcesProvider, 1);
        ajVar.E2 = iVar;
        iVar.p(new m.y0(ajVar, 8));
        ViewGroup viewGroup = ajVar.containerView;
        viewGroup.addView(ajVar.E2, viewGroup.indexOfChild(ajVar.G0), w7.w5.e(-1, -1, 83));
        ci.i iVar2 = ajVar.E2;
        iVar2.getAdapter().f10666c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f10669e = false;
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
        boolean z10 = true;
        if (m2Var instanceof org.telegram.ui.eo) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var;
            gg.j1 adapter = iVar2.getAdapter();
            eoVar.i();
            TLRPC.Chat chat = eoVar.f37246e;
            adapter.getClass();
            adapter.f10678l0 = chat;
            iVar2.getAdapter().W(eoVar.Z7);
            gg.j1 adapter2 = iVar2.getAdapter();
            if (eoVar.f37246e == null) {
                z10 = false;
            }
            adapter2.f10670e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f10670e0 = false;
        }
        iVar2.getAdapter().f10672f0 = false;
        ajVar.Y1();
    }

    public static void o(aj ajVar, ValueAnimator valueAnimator) {
        ajVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = ajVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static void q(aj ajVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        ajVar.currentSheetAnimation = null;
        ajVar.f24380s2 = null;
        animationNotificationsLocker.unlock();
        ajVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (ajVar.useHardwareLayer) {
            ajVar.container.setLayerType(0, null);
        }
        if (ajVar.isFullscreen) {
            WindowManager.LayoutParams attributes = ajVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            ajVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static boolean r(org.telegram.ui.Components.aj r46, android.content.Context r47, org.telegram.ui.ActionBar.c6 r48, org.telegram.ui.ActionBar.m2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.r(org.telegram.ui.Components.aj, android.content.Context, org.telegram.ui.ActionBar.c6, org.telegram.ui.ActionBar.m2, android.view.View):boolean");
    }

    public static void s(aj ajVar) {
        o1.k kVar = ajVar.f24380s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(ajVar.containerView, o1.h.f16673n, 0.0f);
        ajVar.f24380s2 = kVar2;
        kVar2.f16691u.a(1.5f);
        ajVar.f24380s2.f16691u.b(1500.0f);
        ajVar.f24380s2.h();
    }

    public static void t(aj ajVar, org.telegram.tgnet.h hVar) {
        AnimatorSet animatorSet = ajVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            hVar.run();
        }
    }

    public static void u(aj ajVar, int i10) {
        ajVar.navBarColorKey = -1;
        ajVar.navBarColor = i10;
        ajVar.containerView.invalidate();
    }

    public static void v(aj ajVar) {
        ajVar.currentSheetAnimation = null;
        ajVar.currentSheetAnimationType = 0;
        ajVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f19950id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f19950id != 489000 && !MessagesController.isSupportUser(user)) {
            return true;
        }
        return false;
    }

    public static void w(aj ajVar) {
        int i10;
        if (ajVar.f24350j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ajVar.f24350j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23801s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i11 = 0; i11 < chatAttachAlertPhotoLayout.E.getChildCount(); i11++) {
                            View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.t5) {
                                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                                if (t5Var.getPhotoEntry() == photoEntry) {
                                    t5Var.getImageView().invalidate();
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
        ajVar.c2(true);
        org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24339f1;
        ci.d4 d4Var = ajVar.f24342g1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = new ci.d4(ajVar.getContext(), 1);
        ajVar.f24342g1 = d4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        d4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ajVar.f24342g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ajVar.f24342g1.m(1.0f, -((ajVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        ajVar.f24342g1.setTranslationY(ajVar.f24331d1.getTranslationY());
        ci.d4 d4Var3 = ajVar.f24342g1;
        d4Var3.f4916l0 = new md(6, ajVar, d4Var2);
        ajVar.containerView.addView(d4Var3, w7.w5.a(60.0f, 0.0f, 46.0f, 0.0f, 0.0f, -1, 48));
        ajVar.f24342g1.u();
    }

    public static void x(aj ajVar, boolean z10, lh lhVar) {
        Integer num;
        ajVar.B0.v(1.0f);
        ajVar.C0.v(1.0f);
        ajVar.B0.l(ajVar.f24366o2);
        ajVar.C0.l(ajVar.f24366o2);
        ajVar.containerView.invalidate();
        a8 a8Var = ajVar.f24321a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        a8Var.setTag(num);
        lhVar.run();
    }

    public static void y(aj ajVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int i10;
        di diVar = ajVar.B1;
        si[] siVarArr = ajVar.f24402z0;
        org.telegram.ui.ActionBar.m2 m2Var2 = ajVar.f24338f0;
        if (m2Var2 == null) {
            m2Var = LaunchActivity.R();
        } else {
            m2Var = m2Var2;
        }
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (view instanceof ui) {
                Activity parentActivity = m2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (ajVar.O1 || ajVar.P1 || !ajVar.c1()) {
                        if (!ajVar.O1 && !ajVar.P1) {
                            oo ooVar = new oo(1, ajVar.getContext(), c6Var, ajVar);
                            ajVar.T = ooVar;
                            ajVar.U1(ooVar);
                        }
                        ajVar.U1(ajVar.f24350j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (ajVar.f24391w0 == null && (m2Var2 instanceof org.telegram.ui.eo)) {
                        TLRPC.User i11 = ((org.telegram.ui.eo) m2Var2).i();
                        if (v1(i11)) {
                            il ilVar = new il(ajVar, ajVar.getContext(), ajVar.M1, i11, c6Var);
                            ajVar.f24391w0 = ilVar;
                            siVarArr[11] = ilVar;
                        }
                    }
                    si siVar = ajVar.f24391w0;
                    if (siVar != null) {
                        ajVar.U1(siVar);
                    }
                } else if (i10 == 3) {
                    if (ajVar.Q1 || !ajVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(ajVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        ajVar.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (ajVar.N1 || !ajVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(ajVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        ajVar.H1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (ajVar.T1 || !ajVar.c1()) {
                        if (ajVar.T1 && ajVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(ajVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        ajVar.G1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((ajVar.T1 || !ajVar.c1()) && AndroidUtilities.isMapsInstalled(m2Var2)) {
                        if (!ajVar.T1) {
                            oo ooVar2 = new oo(6, ajVar.getContext(), c6Var, ajVar);
                            ajVar.T = ooVar2;
                            ajVar.U1(ooVar2);
                        } else {
                            if (ajVar.f24364o0 == null) {
                                Context context = ajVar.getContext();
                                if (ajVar.H || ajVar.U1) {
                                    z10 = false;
                                }
                                zl zlVar = new zl(ajVar, context, c6Var, z10);
                                ajVar.f24364o0 = zlVar;
                                siVarArr[5] = zlVar;
                                ul ulVar = ajVar.f24393w2;
                                if (ulVar != null) {
                                    zlVar.setDelegate(ulVar);
                                } else {
                                    zlVar.setDelegate(new ih(ajVar, 9));
                                }
                            }
                            ajVar.U1(ajVar.f24364o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (ajVar.R1 || !ajVar.c1()) {
                        if (!ajVar.R1) {
                            oo ooVar3 = new oo(9, ajVar.getContext(), c6Var, ajVar);
                            ajVar.T = ooVar3;
                            ajVar.U1(ooVar3);
                        } else {
                            ajVar.W1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (ajVar.f24378s0 == null) {
                        hg.j0 j0Var = new hg.j0(ajVar.getContext(), ajVar.resourcesProvider, ajVar);
                        ajVar.f24378s0 = j0Var;
                        siVarArr[7] = j0Var;
                        j0Var.setupBlurredSearchField(ajVar.J2);
                    }
                    ajVar.U1(ajVar.f24378s0);
                } else if (i10 == 12) {
                    if (ajVar.S1 || !ajVar.c1()) {
                        if (!ajVar.S1) {
                            oo ooVar4 = new oo(9, ajVar.getContext(), c6Var, ajVar);
                            ajVar.T = ooVar4;
                            ajVar.U1(ooVar4);
                        } else {
                            if (ajVar.f24361n0 == null) {
                                no noVar = new no(ajVar, ajVar.getContext(), true, c6Var, null);
                                ajVar.f24361n0 = noVar;
                                siVarArr[1] = noVar;
                                noVar.setDelegate(new ih(ajVar, 10));
                            }
                            ajVar.U1(ajVar.f24361n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (ajVar.f24384u0 == null) {
                        vk vkVar = new vk(ajVar, ajVar.getContext(), c6Var, true);
                        ajVar.f24384u0 = vkVar;
                        siVarArr[8] = vkVar;
                        vkVar.setDelegate(ajVar.f24332d2);
                    }
                    ajVar.U1(ajVar.f24384u0);
                } else if (i10 == 14) {
                    if (ajVar.f24381t0 == null) {
                        vk vkVar2 = new vk(ajVar, ajVar.getContext(), c6Var, false);
                        ajVar.f24381t0 = vkVar2;
                        siVarArr[9] = vkVar2;
                        vkVar2.setDelegate(ajVar.f24332d2);
                    }
                    ajVar.U1(ajVar.f24381t0);
                } else if (i10 == 16) {
                    if (ajVar.f24387v0 == null) {
                        ii.r rVar = new ii.r(ajVar.M1, ajVar.getContext(), c6Var, ajVar);
                        ajVar.f24387v0 = rVar;
                        siVarArr[10] = rVar;
                    }
                    ajVar.U1(ajVar.f24387v0);
                } else if (view.getTag() instanceof Integer) {
                    ajVar.f24329c2.I1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, ajVar.u1(), false, 0L);
                }
            } else if (view instanceof ti) {
                ti tiVar = (ti) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = tiVar.f30886c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        pj1.a(ajVar.getContext(), new org.telegram.ui.tc(16, ajVar, tiVar), null);
                    } else {
                        ajVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    ajVar.f24329c2.p1(tiVar.f30885b);
                    ajVar.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                diVar.v0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > diVar.getMeasuredWidth()) {
                diVar.v0(i13 - diVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void z(aj ajVar) {
        si siVar;
        jn jnVar;
        ajVar.f24392w1 = null;
        si siVar2 = ajVar.B0;
        if (siVar2 != ajVar.f24350j0 && (siVar = ajVar.C0) != (jnVar = ajVar.f24370q0) && siVar2 != siVar && siVar2 != jnVar) {
            ajVar.containerView.removeView(siVar2);
        }
        ajVar.B0.setVisibility(8);
        ajVar.B0.t();
        ajVar.C0.I();
        ajVar.B0 = ajVar.C0;
        ajVar.C0 = null;
        int[] iArr = ajVar.f24336e2;
        iArr[0] = iArr[1];
        ajVar.K1(ajVar.f24327c0, false);
        ajVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i10 < siVarArr.length) {
                si siVar = siVarArr[i10];
                if (siVar != null) {
                    siVar.A();
                }
                i10++;
            } else {
                this.f24349i2 = true;
                return;
            }
        }
    }

    public final void B1() {
        int i10 = 0;
        this.f24349i2 = false;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i10 >= siVarArr.length) {
                break;
            }
            si siVar = siVarArr[i10];
            if (siVar != null) {
                siVar.D();
            }
            i10++;
        }
        if (isShowing()) {
            this.f24329c2.g0();
        }
        xi xiVar = this.D1;
        if (xiVar != null) {
            xiVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (m2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var;
            MessageSuggestionParams messageSuggestionParams = eoVar.f37276g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!yh.n5.U(i10, messageSuggestionParams.amount)) {
                eoVar.Xb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f24377s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.L0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                S1(m2Var);
                return;
            }
            return;
        }
        if (this.K1 == null && (m2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) m2Var;
            if (eoVar2.c()) {
                g5.L(getContext(), eoVar2.a(), new ih(this, 12), this.resourcesProvider);
                return;
            }
        }
        si siVar = this.B0;
        if (siVar != this.f24350j0 && siVar != this.f24370q0) {
            if (!siVar.K(0, true, 0, u1(), this.Q0)) {
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (i10 == 3) {
            if (this.Q1 || !c1()) {
                if (m2Var != null) {
                    activity = m2Var.getParentActivity();
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
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(m2Var)) {
            if (this.f24364o0 == null) {
                zl zlVar = new zl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f24364o0 = zlVar;
                this.f24402z0[5] = zlVar;
                ul ulVar = this.f24393w2;
                if (ulVar != null) {
                    zlVar.setDelegate(ulVar);
                } else if (m2Var instanceof org.telegram.ui.eo) {
                    zlVar.setDelegate(new ih(this, 16));
                }
            }
            U1(this.f24364o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            oo ooVar = new oo(3, getContext(), this.resourcesProvider, this);
            this.T = ooVar;
            U1(ooVar);
        }
        int i10 = 1;
        if (this.f24356l0 == null) {
            mj mjVar = new mj(getContext(), this.resourcesProvider, this);
            this.f24356l0 = mjVar;
            this.f24402z0[3] = mjVar;
            mjVar.setupBlurredSearchField(this.J2);
            this.f24356l0.setDelegate(new ih(this, 13));
            if (this.H) {
                this.f24356l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            TLRPC.Chat chat = ((org.telegram.ui.eo) m2Var).f37246e;
            mj mjVar2 = this.f24356l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            mjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.f24356l0);
        }
    }

    public final void F1() {
        if (this.f24374r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            ?? siVar = new si(context, c6Var, this);
            siVar.f29509r = AndroidUtilities.dp(80.0f);
            siVar.f29511w = 3;
            ai.w0 w0Var = new ai.w0(siVar, context, c6Var, 11);
            siVar.f29508n = w0Var;
            bb bbVar = new bb(siVar, context);
            siVar.v = bbVar;
            w0Var.setAdapter(bbVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, siVar.f30569a));
            siVar.addView(w0Var, w7.w5.d(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(siVar, 17));
            bi.l lVar = new bi.l(siVar, siVar.f29509r, 1);
            siVar.f29510s = lVar;
            lVar.O = new ci.w1(siVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f24374r0 = siVar;
            siVar.setDelegate(new ib(this, 1));
        }
        U1(this.f24374r0);
    }

    public final void G1() {
        boolean z10;
        if (!this.T1) {
            oo ooVar = new oo(5, getContext(), this.resourcesProvider, this);
            this.T = ooVar;
            U1(ooVar);
        }
        if (this.f24353k0 == null) {
            ek ekVar = new ek(getContext(), this.resourcesProvider, this);
            this.f24353k0 = ekVar;
            this.f24402z0[2] = ekVar;
            ekVar.setupBlurredSearchField(this.J2);
            this.f24353k0.setDelegate(new mi(this));
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            TLRPC.Chat chat = ((org.telegram.ui.eo) m2Var).f37246e;
            ek ekVar2 = this.f24353k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            ekVar2.setMultipleSelectionAllowed(z10);
        }
        U1(this.f24353k0);
    }

    public final void H1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            oo ooVar = new oo(4, getContext(), this.resourcesProvider, this);
            this.T = ooVar;
            U1(ooVar);
        }
        boolean z11 = false;
        if (this.f24367p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            uk ukVar = new uk(i10, getContext(), this.resourcesProvider, this);
            this.f24367p0 = ukVar;
            this.f24402z0[4] = ukVar;
            ukVar.setDelegate(new ni(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f24367p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
            if (m2Var instanceof org.telegram.ui.eo) {
                TLRPC.Chat chat = ((org.telegram.ui.eo) m2Var).f37246e;
                uk ukVar2 = this.f24367p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                ukVar2.setMaxSelectedFiles(i11);
            } else {
                this.f24367p0.setMaxSelectedFiles(this.V1);
                uk ukVar3 = this.f24367p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                ukVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        uk ukVar4 = this.f24367p0;
        ukVar4.f31182d0 = this.N;
        if (z10) {
            U1(ukVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        a8 a8Var = this.f24321a1;
        int i10 = 1;
        if (a8Var.f21061n0) {
            a8Var.i(true);
        }
        this.f24353k0 = null;
        this.f24378s0 = null;
        this.f24356l0 = null;
        this.m0 = null;
        this.f24361n0 = null;
        this.f24364o0 = null;
        this.f24367p0 = null;
        this.f24391w0 = null;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i10 >= siVarArr.length) {
                break;
            }
            si siVar = siVarArr[i10];
            if (siVar != null) {
                siVar.p();
                this.containerView.removeView(siVarArr[i10]);
                siVarArr[i10] = null;
            }
            i10++;
        }
        X1(false, false);
        super.dismissInternal();
        if (this.f24395x0) {
            this.f24395x0 = false;
            this.f24399y0 = 0.0f;
            org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
            if (m2Var != null && m2Var.getFragmentView() != null) {
                View fragmentView = m2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f46989a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var;
            TLRPC.Chat chat = eoVar.f37246e;
            if (eoVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.M1).edit();
                edit.putBoolean("silent_" + eoVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (d1(o1().getText())) {
            return true;
        }
        a1();
        if (this.h.f16089f) {
            this.L1 = true;
            this.f24329c2.I1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long p12 = p1();
        si siVar = this.B0;
        if (siVar != null) {
            i12 = siVar.getSelectedItemsCount();
        }
        return g5.a0(this.M1, p12, l1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                aj ajVar = aj.this;
                ajVar.L1 = true;
                ajVar.f24329c2.I1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
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
        this.f24322b.a(z10, z11);
        cv o12 = o1();
        this.f24327c0 = z10;
        cv o13 = o1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        si siVar = this.B0;
        if (siVar != this.f24350j0 && siVar != this.f24370q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f24327c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        ci.m6 m6Var = this.R0;
        hg.k kVar = this.F0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            m6Var.setVisibility(i12);
            ViewPropertyAnimator animate = m6Var.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            js jsVar = js.h;
            duration.setInterpolator(jsVar).setUpdateListener(new jh(this, 0)).withEndAction(new Runnable(this) {
                public final aj f27861b;

                {
                    this.f27861b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            aj ajVar = this.f27861b;
                            if (!z14 || !z12) {
                                ajVar.R0.setVisibility(8);
                            }
                            ajVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f27861b.F0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            kVar.setVisibility(0);
            ViewPropertyAnimator animate2 = kVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = kVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            translationY.alpha(f11).setDuration(320L).setInterpolator(jsVar).setUpdateListener(new jh(this, 1)).withEndAction(new Runnable(this) {
                public final aj f27861b;

                {
                    this.f27861b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            aj ajVar = this.f27861b;
                            if (!z14 || !z12) {
                                ajVar.R0.setVisibility(8);
                            }
                            ajVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f27861b.F0.setVisibility(8);
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
            m6Var.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            m6Var.setAlpha(f7);
            f2();
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            kVar.setAlpha(f11);
            if (z14 || !z12) {
                f12 = kVar.getMeasuredHeight();
            }
            kVar.setTranslationY(f12);
            if (z14 || !z12) {
                i11 = 8;
            }
            kVar.setVisibility(i11);
        }
        if (o12 != o13) {
            o12.k(true);
            o13.setText(b6.cloneSpans(o12.getText()));
            o13.getEditText().setAllowTextEntitiesIntersection(o12.getEditText().getAllowTextEntitiesIntersection());
            if (o12.getEditText().isFocused()) {
                o13.getEditText().requestFocus();
                o13.getEditText().setSelection(o12.getEditText().getSelectionStart(), o12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new lh(this, 0));
    }

    public final void L1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f24350j0) != null) {
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
        float translationY = this.containerView.getTranslationY() - this.f24399y0;
        this.f24399y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        il ilVar = this.f24391w0;
        if (ilVar != null) {
            ilVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.d3 d3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        d3Var.setAlpha(i10);
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
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
        this.f24358m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
        if (chatAttachAlertPhotoLayout != null) {
            aj ajVar = chatAttachAlertPhotoLayout.f30570b;
            if (ajVar.T0 == 0 || ajVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f23817g1 = z10;
        }
    }

    public final void Q1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.Q1(boolean):void");
    }

    public final void R1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.R1(long, java.lang.String, boolean, boolean):void");
    }

    public final void S1(org.telegram.ui.ActionBar.m2 m2Var) {
        if ((m2Var instanceof org.telegram.ui.eo) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.eo) m2Var).f37246e)) {
            new zc(this.f24385u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new md(7, this, m2Var)).j();
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
        si siVar;
        float f18;
        float dp;
        long sendPaidMessagesStars;
        float f19;
        float f20;
        a8 a8Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float dp2;
        this.f24326c.a(z10, true);
        ci ciVar = this.G0;
        if (ciVar.getTag() != null) {
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
        ciVar.setTag(num);
        fi fiVar = this.H0;
        if (fiVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(fiVar.getEditText());
        }
        fiVar.k(true);
        this.S0.k(true);
        ci ciVar2 = this.A1;
        ci ciVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                ciVar.setVisibility(0);
            }
            ciVar3.setVisibility(0);
        } else if (this.V0) {
            ciVar2.setVisibility(0);
        }
        si siVar2 = this.B0;
        if ((siVar2 == this.f24350j0 || siVar2 == this.f24370q0) && this.f24327c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        a8 a8Var2 = this.f24321a1;
        ci.m6 m6Var = this.R0;
        hg.k kVar = this.F0;
        ki kiVar = this.L0;
        float f28 = 1.0f;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z13) {
                m6Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(kVar, property, f20));
            if (z10 && !z13) {
                kVar.setVisibility(0);
                a8Var = a8Var2;
                arrayList.add(ObjectAnimator.ofFloat(kVar, View.TRANSLATION_Y, 0.0f));
            } else {
                a8Var = a8Var2;
            }
            if (z10 && z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m6Var, property, f21));
            Property property2 = View.SCALE_X;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ciVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(kiVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(kiVar, property3, f26));
            if (a8Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(ciVar, property4, dp2));
            } else if (this.V0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = AndroidUtilities.dp(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ciVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ciVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jh(this, 5));
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
            ciVar.setAlpha(f7);
            if (z10 && z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                kVar.setVisibility(0);
                f11 = 0.0f;
                kVar.setTranslationY(0.0f);
            } else {
                f11 = 0.0f;
                i10 = 0;
            }
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            ciVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            ciVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            ciVar3.setAlpha(f14);
            if (z10 && z13) {
                i11 = i10;
            } else {
                i11 = 8;
            }
            m6Var.setVisibility(i11);
            if (z10 && z13) {
                f15 = 1.0f;
            } else {
                f15 = f11;
            }
            m6Var.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            kiVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            kiVar.setScaleY(f17);
            if (a8Var2.getTag() != null) {
                if (z10) {
                    dp = f11;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                ciVar.setTranslationY(dp);
            } else if (this.V0 && ((siVar = this.B0) == null || siVar.L())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = f11;
                }
                ciVar2.setTranslationY(f18);
            }
            if (!z10) {
                ciVar.setVisibility(4);
                ciVar3.setVisibility(4);
            }
            if (z13) {
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        kiVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1());
        }
        kiVar.i(l1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fiVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), kiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            fiVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(si siVar) {
        long j3 = this.Z0;
        oo ooVar = this.T;
        if (siVar == ooVar) {
            j3 = ooVar.f29263s;
        } else if (siVar == this.f24350j0) {
            j3 = 1;
        } else if (siVar == this.f24356l0) {
            j3 = 3;
        } else if (siVar == this.f24367p0) {
            j3 = 4;
        } else if (siVar == this.f24353k0) {
            j3 = 5;
        } else if (siVar == this.f24364o0) {
            j3 = 6;
        } else if (siVar == this.m0) {
            j3 = 9;
        } else if (siVar == this.f24374r0) {
            j3 = 10;
        } else if (siVar == this.f24378s0) {
            j3 = 11;
        } else if (siVar == this.f24361n0) {
            j3 = 12;
        } else if (siVar == this.f24381t0) {
            j3 = 14;
        } else if (siVar == this.f24384u0) {
            j3 = 13;
        } else if (siVar == this.f24387v0) {
            j3 = 16;
        } else if (siVar == this.f24391w0) {
            j3 = 17;
        }
        V1(siVar, j3, true);
    }

    public final void V1(si siVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        wm wmVar;
        boolean z12;
        Integer num;
        wm wmVar2;
        int i12;
        int dp;
        int i13;
        int dp2;
        Float f7;
        int i14;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f24392w1 == null && this.P0 == null) {
            si siVar2 = this.B0;
            if (siVar2 == siVar) {
                siVar2.J();
            } else if (siVar == this.f24361n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new rg.y0(this.f24338f0, 39, false).show();
            } else {
                int i15 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f24337f.a(z11, z10);
                this.f24360n.i(Long.valueOf(j3), z10);
                this.G1 = false;
                this.E1 = false;
                this.I1 = 0.0f;
                this.H1.setVisibility(8);
                RadialProgressView radialProgressView = this.F1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                ci ciVar = this.A1;
                ciVar.setAlpha(1.0f);
                ciVar.setTranslationY(this.I1);
                int i16 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.A0;
                    if (i16 >= longSparseArray.size()) {
                        break;
                    }
                    ((ei.p4) longSparseArray.valueAt(i16)).setMeasureOffsetY(0);
                    i16++;
                }
                this.Z0 = j3;
                di diVar = this.B1;
                int childCount = diVar.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = diVar.getChildAt(i17);
                    if (childAt instanceof ui) {
                        ui uiVar = (ui) childAt;
                        i14 = childCount;
                        f7 = valueOf;
                        if (uiVar.f31167b == uiVar.f31168c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        uiVar.f31525a.e(z13, true);
                    } else {
                        f7 = valueOf;
                        i14 = childCount;
                        if (childAt instanceof ti) {
                            ((ti) childAt).a(true);
                        }
                    }
                    i17++;
                    childCount = i14;
                    valueOf = f7;
                }
                Float f10 = valueOf;
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f24336e2[0];
                this.C0 = siVar;
                boolean e7 = siVar.e();
                jh.f fVar = this.f24400y1;
                if (fVar != null) {
                    if (e7) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                ei eiVar = this.f24403z1;
                if (eiVar != null) {
                    if (e7) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    eiVar.setVisibility(i13);
                }
                if (this.C0.i() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                a8 a8Var = this.f24321a1;
                a8Var.setVisibility(i10);
                if (a8Var.f21061n0) {
                    a8Var.i(true);
                }
                this.B0.u();
                si siVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
                if (siVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.G(this.B0);
                this.C0.setVisibility(0);
                if (siVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                ViewParent parent = this.C0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    si siVar4 = this.C0;
                    if (siVar4 != this.f24364o0) {
                        indexOfChild++;
                    }
                    i11 = 0;
                    viewGroup.addView(siVar4, indexOfChild, w7.w5.d(-1.0f, -1));
                } else {
                    i11 = 0;
                }
                lh lhVar = new lh(this, 4);
                si siVar5 = this.B0;
                boolean z14 = siVar5 instanceof jn;
                oi oiVar = this.f24334e0;
                if (!z14 && !(this.C0 instanceof jn)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.C0.setAlpha(0.0f);
                        this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                        si siVar6 = this.B0;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[i11] = AndroidUtilities.dp(78.0f) + firstOffset;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(siVar6, property, fArr);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, oiVar, 0.0f, 1.0f);
                        Property property2 = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i11] = a8Var.getAlpha();
                        fArr2[1] = 0.0f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a8Var, property2, fArr2);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i11] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[2] = ofFloat3;
                        animatorSet.playTogether(animatorArr);
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(js.f27634f);
                        animatorSet.addListener(new li(this, firstOffset, lhVar, i11));
                        this.f24392w1 = animatorSet;
                        si siVar7 = this.B0;
                        oiVar.getClass();
                        oiVar.a(siVar7, f10);
                        animatorSet.start();
                    } else {
                        siVar5.setAlpha(0.0f);
                        lhVar.run();
                        e2(i11);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                    si siVar8 = this.C0;
                    if (siVar8 instanceof jn) {
                        siVar8.setTranslationX(max);
                        si siVar9 = this.B0;
                        if ((siVar9 instanceof ChatAttachAlertPhotoLayout) && (wmVar2 = ((ChatAttachAlertPhotoLayout) siVar9).P) != null) {
                            wmVar2.setVisibility(4);
                        }
                    } else {
                        this.B0.setTranslationX(-max);
                        si siVar10 = this.C0;
                        if (siVar10 == chatAttachAlertPhotoLayout && (wmVar = ((ChatAttachAlertPhotoLayout) siVar10).P) != null) {
                            wmVar.setVisibility(0);
                        }
                    }
                    this.C0.setAlpha(1.0f);
                    this.B0.setAlpha(1.0f);
                    if (z10) {
                        si siVar11 = this.B0;
                        oiVar.getClass();
                        oiVar.a(siVar11, f10);
                        AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h(this, siVar, lhVar, 14));
                    } else {
                        if (this.C0.getCurrentItemTop() <= siVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B0.v(1.0f);
                        this.C0.v(1.0f);
                        this.B0.l(this.f24366o2);
                        this.C0.l(this.f24366o2);
                        this.containerView.invalidate();
                        si siVar12 = this.B0;
                        Float valueOf2 = Float.valueOf(1.0f);
                        oiVar.getClass();
                        oiVar.a(siVar12, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        a8Var.setTag(num);
                        lhVar.run();
                    }
                }
                if (this.f24369p2 && !(siVar instanceof ei.p4)) {
                    i12 = 0;
                    this.f24369p2 = false;
                    a8Var.e();
                    a8Var.invalidate();
                    x1();
                } else {
                    i12 = 0;
                }
                if (i15 != 0 && j3 != 6 && j3 != 17 && !(siVar instanceof ei.p4)) {
                    if (j3 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = i12;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                a8Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void W1(boolean z10, Boolean bool) {
        aj ajVar;
        if (this.m0 == null) {
            ajVar = this;
            no noVar = new no(ajVar, getContext(), false, this.resourcesProvider, bool);
            ajVar.m0 = noVar;
            ajVar.f24402z0[1] = noVar;
            noVar.setDelegate(new ih(this, 15));
        } else {
            ajVar = this;
        }
        V1(ajVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        si siVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        a8 a8Var = this.f24321a1;
        if ((z10 && a8Var.getTag() == null) || (!z10 && a8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            a8Var.setTag(num);
            AnimatorSet animatorSet = this.f24324b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f24324b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f24382t1) && this.B0 == this.f24350j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            ci ciVar = this.A1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f24331d1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                ciVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
            if (m2Var != null) {
                if (z10) {
                    if (this.f24355k2) {
                        i10 = org.telegram.ui.ActionBar.h6.f20866tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20631h5;
                    }
                    if (i0.a.f(getThemedColor(i10)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z13);
                } else {
                    AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
                }
            }
            float f14 = 0.6f;
            float f15 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24324b1 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - a8Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a8Var, property, f12);
                ofFloat.addUpdateListener(new jh(this, 4));
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
                this.f24324b1.playTogether(arrayList);
                this.f24324b1.addListener(new ea(2, this, z10));
                this.f24324b1.setInterpolator(js.h);
                this.f24324b1.setDuration(380L);
                this.f24324b1.start();
                return;
            }
            if (z10 && this.V0 && ((siVar = this.B0) == null || siVar.L())) {
                ciVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            a8Var.setAlpha(f7);
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f24345h1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f24382t1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void Y1() {
        float alpha;
        int[] iArr = this.J0;
        fi fiVar = this.H0;
        fiVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            si siVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
            if ((siVar == chatAttachAlertPhotoLayout || siVar == this.f24370q0) && this.f24327c0) {
                ci.m6 m6Var = this.R0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.E2.getTop());
            } else {
                alpha = -fiVar.getHeight();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.Z1(int):void");
    }

    public final void a1() {
        if (o1().f25015a.length() <= 0) {
            return;
        }
        this.B0.a(o1().getText());
    }

    public final void a2() {
        boolean h;
        float f7;
        float f10;
        float f11;
        si siVar = this.B0;
        int i10 = 0;
        if (siVar == null) {
            h = false;
        } else {
            h = siVar.h();
        }
        bi.o oVar = this.f24348i1;
        oVar.setEnabled(h);
        si siVar2 = this.B0;
        float f12 = 0.5f;
        if (siVar2 != null) {
            if (siVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.C0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f24330d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        si siVar3 = this.C0;
        if (siVar3 != null) {
            if (siVar3.h()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f24330d0, f12, f7);
        }
        this.f24351j1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f24354k1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void b1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.b1():void");
    }

    public final void b2(si siVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (siVar != null) {
            ah.h hVar = this.F2;
            if (hVar != null && Build.VERSION.SDK_INT >= 31) {
                hVar.f(0.0f, i10);
                b1();
            }
            int currentItemTop = siVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (siVar == this.B0 && currentItemTop <= siVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (siVar == this.B0) {
                    X1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) siVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.am.D(11.0f, i11, currentItemTop);
                si siVar2 = this.B0;
                if (siVar2 == siVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((siVar2 instanceof jn) || (this.C0 instanceof jn)) {
                    Object obj = this.f24392w1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f16684f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f24336e2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f24340f2 = i13;
                        return;
                    }
                    return;
                }
                this.f24340f2 = i13;
                iArr[i12] = D;
                e2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final boolean c1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).N6()) {
            return true;
        }
        return false;
    }

    public final void c2(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f24335e1) != null) {
            int i10 = 0;
            if (this.f24382t1 && this.f24347i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f6042f = z12;
            if (!z10) {
                ((g6) uVar.f6043g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f24339f1;
            if (z10 && this.f24382t1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(js.h).withEndAction(new uh(this, z11, 0)).start();
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
            o1.k kVar = this.f24380s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f24383t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final boolean d1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            return ChatActivityEnterView.J(this.M1, ((org.telegram.ui.eo) m2Var).a(), m2Var, charSequence);
        }
        return false;
    }

    public final void d2(boolean z10) {
        boolean z11;
        float f7;
        si siVar = this.f24350j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f24370q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f24373r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                ?? siVar2 = new si(context, c6Var, this);
                siVar2.f27570y = 0.0f;
                siVar2.E = 0.0f;
                siVar2.F = 0.0f;
                siVar2.G = 0.0f;
                siVar2.H = 0.0f;
                siVar2.I = 0.0f;
                siVar2.J = null;
                siVar2.K = false;
                siVar2.M = 0.0f;
                siVar2.Q = false;
                siVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                siVar2.T = z11;
                siVar2.f27565n = c6Var;
                siVar2.f30573f = true;
                siVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y p5 = siVar2.f30570b.f24321a1.p();
                TextView textView = new TextView(context);
                siVar2.f27569x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = siVar2.f30569a;
                rm rmVar = new rm(siVar2, context, p5, c6Var2, 1);
                a8 a8Var = siVar2.f30570b.f24321a1;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                a8Var.addView(rmVar, 0, w7.w5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, c6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                rmVar.addView(textView, w7.w5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
                ai.w0 w0Var = new ai.w0(siVar2, context, c6Var2, 14);
                siVar2.f27566r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.y7(siVar2, 3));
                s4.d0 d0Var = new s4.d0(1, false);
                siVar2.f27567s = d0Var;
                w0Var.setLayoutManager(d0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                in inVar = new in(siVar2, context);
                siVar2.v = inVar;
                inVar.setClipToPadding(true);
                inVar.setClipChildren(true);
                siVar2.addView(w0Var, w7.w5.d(-1.0f, -1));
                siVar2.P = siVar2.f30570b.f24350j0;
                inVar.f27228c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar2.P;
                inVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                inVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                inVar.c();
                UndoView undoView = new UndoView(context, null, false, siVar2.f30570b.f24373r);
                siVar2.f27568w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                siVar2.addView(undoView, w7.w5.a(-2.0f, 8.0f, 0.0f, 8.0f, 52.0f, -1, 83));
                siVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f24370q0 = siVar2;
                siVar2.bringToFront();
            }
            si siVar3 = this.B0;
            jn jnVar = this.f24370q0;
            if (siVar3 != jnVar) {
                siVar = jnVar;
            }
            U1(siVar);
            return;
        }
        U1(siVar);
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
        xi xiVar = this.D1;
        if (xiVar != null) {
            xiVar.l();
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
        yi yiVar = this.f24329c2;
        if (yiVar != null) {
            yiVar.d0(new lh(this, 3));
        } else {
            I1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.r(i10);
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
        di diVar = this.B1;
        if (diVar == null) {
            return;
        }
        int childCount = diVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            diVar.getChildAt(i20);
        }
        boolean z11 = this.f24355k2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.h6.f20641hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20668j5;
        }
        this.f24358m1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.h6.f20641hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f20668j5;
        }
        this.f24375r1.setTextColor(getThemedColor(i11));
        this.f24348i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.h6.f20641hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f20668j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.u0 u0Var = this.f24331d1;
        u0Var.setIconColor(themedColor);
        Drawable background = u0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.h6.f20660ig;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.I5;
        }
        org.telegram.ui.ActionBar.h6.x1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.h6.E8;
        u0Var.G(getThemedColor(i21), false);
        u0Var.G(getThemedColor(i21), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f24339f1;
        if (u0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.h6.f20641hg;
            } else {
                i19 = org.telegram.ui.ActionBar.h6.f20668j5;
            }
            u0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f24345h1;
        if (u0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.h6.f20641hg;
            } else {
                i17 = org.telegram.ui.ActionBar.h6.f20668j5;
            }
            u0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = u0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.h6.f20660ig;
            } else {
                i18 = org.telegram.ui.ActionBar.h6.I5;
            }
            org.telegram.ui.ActionBar.h6.x1(getThemedColor(i18), background2);
        }
        fi fiVar = this.H0;
        org.telegram.ui.ActionBar.c6 c6Var = fiVar.M;
        xu xuVar = fiVar.f25015a;
        int i22 = fiVar.L;
        if (i22 == 0) {
            xuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, c6Var));
            int i23 = org.telegram.ui.ActionBar.h6.G6;
            xuVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i23, c6Var));
            xuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i23, c6Var));
        } else if (i22 != 2 && i22 != 3) {
            xuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20856t5, c6Var));
            xuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, c6Var));
        } else {
            xuVar.setHintTextColor(-1929379841);
            xuVar.setTextColor(-1);
            xuVar.setCursorColor(-1);
            xuVar.setHandlesColor(-1);
            xuVar.setHighlightColor(822083583);
            xuVar.quoteColor = -1;
        }
        fiVar.f25017c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        yu yuVar = fiVar.d;
        if (yuVar != null) {
            yuVar.S();
        }
        diVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.h6.f20641hg;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.f20668j5;
        }
        int themedColor2 = getThemedColor(i14);
        a8 a8Var = this.f24321a1;
        a8Var.E(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.h6.f20660ig;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.I5;
        }
        a8Var.D(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.h6.f20641hg;
        } else {
            i16 = org.telegram.ui.ActionBar.h6.f20668j5;
        }
        a8Var.setTitleColor(getThemedColor(i16));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
        fh.c cVar = this.I2;
        if (cVar.f9931a.getColor() != s12) {
            cVar.a(s12);
            jh.f fVar = this.f24400y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ei eiVar = this.f24403z1;
            if (eiVar != null) {
                eiVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i24 >= siVarArr.length) {
                break;
            }
            si siVar = siVarArr[i24];
            if (siVar != null) {
                siVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20650i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5));
    }

    public final void e2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.e2(int):void");
    }

    public final void f1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.f1(boolean):void");
    }

    public final void f2() {
        int i10 = 0;
        e2(0);
        this.f24385u1.invalidate();
        ci.m6 m6Var = this.R0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
        if (chatAttachAlertPhotoLayout != null) {
            mm mmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (mmVar != null && mmVar.getFastScroll() != null) {
                dm0 fastScroll = mmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f23834p1;
                if (this.f24327c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.f25407h0 = currentActionBarHeight + i10;
                mmVar.getFastScroll().invalidate();
            }
        }
        Y1();
        i1();
    }

    public final void g1() {
        float f7 = this.f24326c.f16088e;
        float f10 = (1.0f - this.f24322b.f16088e) * f7;
        this.f24403z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.f16088e))), 1.0f - f10));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i10 < siVarArr.length) {
                si siVar = siVarArr[i10];
                if (siVar != null && (themeDescriptions = siVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i5));
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
        float f10 = this.f24333e.f16088e;
        float f11 = this.f24337f.f16088e;
        float b10 = yf.e0.b(this.h.f16088e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        s20.d(this.I0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
    }

    public final void i1() {
        ki kiVar = this.L0;
        ci ciVar = this.K0;
        ci.m6 m6Var = this.R0;
        if (m6Var != null && m6Var.getVisibility() == 0 && m6Var.getAlpha() != 0.0f) {
            float f7 = this.f24322b.f16088e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            kiVar.setAlpha(abs * abs * abs * abs);
            ciVar.setTranslationY(AndroidUtilities.lerp(this.f24352j2, ((m6Var.getTranslationY() + m6Var.getTop()) - ciVar.getTop()) + AndroidUtilities.dp(8.0f), js.f27637j.getInterpolation(f7)));
            return;
        }
        ciVar.setTranslationY(this.f24352j2);
        kiVar.setAlpha(1.0f);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f24362n1;
        if (u0Var != null) {
            this.f24358m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void k1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f24358m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f24347i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f24362n1;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if ((m2Var instanceof org.telegram.ui.eo) && (messagePreviewParams = ((org.telegram.ui.eo) m2Var).f37264f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) m2Var).f37246e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        si siVar;
        int i11;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            g1();
            no noVar = this.m0;
            if (noVar != null && ((siVar = this.C0) == noVar || this.B0 == noVar)) {
                if (siVar == noVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                e2(i11);
            }
            no noVar2 = this.f24361n0;
            if (noVar2 != null) {
                si siVar2 = this.C0;
                if (siVar2 == noVar2 || this.B0 == noVar2) {
                    if (siVar2 != noVar2) {
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
            ki kiVar = this.L0;
            if (kiVar != null) {
                kiVar.setEphemeralFactor(f7);
                kiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final float n1() {
        ci ciVar = this.G0;
        float alpha = 1.0f - ciVar.getAlpha();
        return ciVar.getMeasuredHeight() - (alpha * (ciVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final cv o1() {
        si siVar;
        if (this.f24327c0 && ((siVar = this.B0) == this.f24350j0 || siVar == this.f24370q0)) {
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
        a8 a8Var = this.f24321a1;
        if (a8Var.f21061n0) {
            a8Var.i(true);
        } else if (this.B0.j()) {
        } else {
            if (o1() != null && o1().f25018e) {
                o1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.B0.o(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final il ilVar = this.f24391w0;
        if (ilVar != null && this.B0 == ilVar) {
            final lh lhVar = new lh(this, 1);
            int i10 = ilVar.f27198n;
            org.telegram.ui.Wallet.k8 k8Var = ilVar.O;
            aj ajVar = ilVar.f30570b;
            AnimatorSet animatorSet = null;
            if (!ilVar.H && (wallettransaction = ilVar.M0) != null && ilVar.N0 == null && ilVar.O0 == null) {
                if (ilVar.P0) {
                    org.telegram.ui.Wallet.c5 c5Var = new org.telegram.ui.Wallet.c5();
                    c5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
                    if (m2Var != null && m2Var.presentFragment(c5Var, false, true)) {
                        org.telegram.ui.Wallet.y8 y8Var = new org.telegram.ui.Wallet.y8(ajVar.getContainer(), ajVar.getSheetContainer(), k8Var.getDiamondView(), c5Var, ilVar.M0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!ilVar.H) {
                                            lhVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!ilVar.H) {
                                            lhVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, ajVar);
                        ilVar.O0 = y8Var;
                        animatorSet = y8Var.f35562m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.e6 diamondView = k8Var.getDiamondView();
                    if (diamondView.f34668f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.m2 m2Var2 = ajVar.f24338f0;
                        if (m2Var2 instanceof org.telegram.ui.eo) {
                            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var2;
                            if (eoVar.getCurrentAccount() == i10 && eoVar.a() == ilVar.f27203r.f19950id && eoVar.R3 == 0 && eoVar.getFragmentView() != null && eoVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.x5 x5Var = new org.telegram.ui.Wallet.x5(ajVar.getContainer(), ajVar.getSheetContainer(), k8Var.getDiamondView(), eoVar, ilVar.M0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!ilVar.H) {
                                                    lhVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!ilVar.H) {
                                                    lhVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, ajVar);
                                ilVar.N0 = x5Var;
                                animatorSet = x5Var.f35520m;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
        oa1 oa1Var = chatAttachAlertPhotoLayout.f23826l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f23822j0;
        TextView textView = chatAttachAlertPhotoLayout.f23833p0;
        mm mmVar = chatAttachAlertPhotoLayout.f23836r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == f0Var) {
            if (z10) {
                if (mmVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.v0.B(222.0f, i13, i16), i14, org.telegram.messenger.v0.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.v0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (mmVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.v0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.v0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == oa1Var) {
            if (z10) {
                if (mmVar.getVisibility() == 0) {
                    oa1Var.layout(0, org.telegram.messenger.v0.B(310.0f, i13, i16), i14, org.telegram.messenger.v0.B(260.0f, i13, i16));
                    return true;
                }
                oa1Var.layout(0, org.telegram.messenger.v0.B(176.0f, i13, i16), i14, org.telegram.messenger.v0.B(126.0f, i13, i16));
                return true;
            } else if (mmVar.getVisibility() == 0) {
                oa1Var.layout(org.telegram.messenger.v0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                oa1Var.layout(org.telegram.messenger.v0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (mmVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (mmVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != mmVar) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
        an anVar = chatAttachAlertPhotoLayout.v;
        mm mmVar = chatAttachAlertPhotoLayout.f23836r;
        gg.a0 a0Var = chatAttachAlertPhotoLayout.f23838s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        wm wmVar = chatAttachAlertPhotoLayout.P;
        if (view == wmVar) {
            if (chatAttachAlertPhotoLayout.f23806b0 && !chatAttachAlertPhotoLayout.f23810d0) {
                wmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f23822j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            oa1 oa1Var = chatAttachAlertPhotoLayout.f23826l0;
            if (view == oa1Var) {
                if (z10) {
                    oa1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                oa1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == mmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    mmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f47885o != 0) {
                        mmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        anVar.l();
                    }
                } else {
                    mmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f47885o != 1) {
                        mmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        anVar.l();
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
        this.f24350j0.setTranslationX(0.0f);
        this.f24371q1.setAlpha(0.0f);
        this.f24365o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f24383t2 = animatorSet;
        oi oiVar = this.f24376r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, oiVar, 0.0f, 400.0f));
        this.f24383t2.setDuration(400L);
        this.f24383t2.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        oiVar.getClass();
        oiVar.a(this, valueOf);
        this.f24383t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new jh(this, 2));
        o1.k kVar = this.f24380s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f16673n, 0.0f);
        this.f24380s2 = kVar2;
        if (this.K1 != null) {
            kVar2.f16691u.a(0.75f);
            this.f24380s2.f16691u.b(350.0f);
        } else {
            kVar2.f16691u.a(0.75f);
            this.f24380s2.f16691u.b(350.0f);
        }
        this.f24380s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.d3 d3Var = this.backDrawable;
        s6 s6Var = u6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(d3Var, s6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.tgnet.h hVar = new org.telegram.tgnet.h(this, animationNotificationsLocker, this.delegate, 15);
        this.f24380s2.a(new ei.l4(2, this, hVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, hVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new jh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(js.f27634f);
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
        if (this.B0.F(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f24338f0 instanceof org.telegram.ui.eo) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f24388v1 = true;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) m2Var).a();
        }
        return this.Z;
    }

    public final int q1() {
        si siVar = this.B0;
        no noVar = this.m0;
        if (siVar == noVar && noVar.E != null) {
            return noVar.getEmojiPadding();
        }
        no noVar2 = this.f24361n0;
        if (siVar == noVar2 && noVar2.E != null) {
            return noVar2.getEmojiPadding();
        }
        if (this.f24327c0) {
            return this.S0.getEmojiPadding();
        }
        return this.H0.getEmojiPadding();
    }

    public final int r1(int i10) {
        si siVar = this.C0;
        int[] iArr = this.f24336e2;
        if (siVar != null && ((this.B0 instanceof jn) || (siVar instanceof jn))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f24330d0);
        }
        return iArr[i10];
    }

    public final int s1(boolean z10) {
        boolean q6;
        int i10;
        a8 a8Var;
        if (this.f24355k2) {
            return getThemedColor(org.telegram.ui.ActionBar.h6.f20866tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        Iterator it = this.f24360n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            long longValue = ((Long) gVar.f16099a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.n.a(f7, 0.0f, 1.0f);
        if (z10 && (a8Var = this.f24321a1) != null && a8Var.getVisibility() == 0) {
            a2 *= 1.0f - a8Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.h6.f20504a7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20650i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        si siVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24350j0;
        if (siVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f23821i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            this.calcMandatoryInsets = ((org.telegram.ui.eo) m2Var).C9();
        }
        a2();
        this.f24388v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f24369p2) {
            this.f24369p2 = false;
            a8 a8Var = this.f24321a1;
            a8Var.e();
            a8Var.invalidate();
            x1();
        }
    }

    public final void t1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj.t1():void");
    }

    public final boolean u1() {
        if (this.f24327c0) {
            si siVar = this.B0;
            if (siVar == this.f24350j0 || siVar == this.f24370q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        yi yiVar = this.f24329c2;
        if (yiVar != null && !this.f24396x1) {
            boolean g02 = yiVar.g0();
            this.f24396x1 = true;
            ci.x0 x0Var = new ci.x0(this, editTextBoldCursor, z10, 17);
            if (g02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(x0Var, j3);
        }
    }

    public final void x1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int s12 = s1(false);
            org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
            fh.c cVar = this.I2;
            if (cVar.f9931a.getColor() != s12) {
                cVar.a(s12);
                jh.f fVar = this.f24400y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                ei eiVar = this.f24403z1;
                if (eiVar != null) {
                    eiVar.invalidate();
                }
            }
            a2();
            this.containerView.invalidate();
        }
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i10 >= siVarArr.length) {
                break;
            }
            si siVar = siVarArr[i10];
            if (siVar != null) {
                siVar.p();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        fi fiVar = this.H0;
        if (fiVar != null) {
            fiVar.o();
        }
        ii iiVar = this.S0;
        if (iiVar != null) {
            iiVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f19950id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        a2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismiss() {
        ii iiVar;
        fi fiVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        si siVar = this.B0;
        il ilVar = this.f24391w0;
        boolean z10 = (siVar != ilVar || ilVar == null || ilVar.H || ilVar.M0 == null) ? false : true;
        this.f24395x0 = z10;
        if (!z10 && (fiVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(fiVar.getEditText());
        }
        if (!this.f24395x0 && (iiVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(iiVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.f24338f0;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        if (!this.D2 && m2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.C2) {
                return;
            }
            this.C2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new ih(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20142a.setOnCancelListener(new oh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            a2Var.N = b1Var;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            si[] siVarArr = this.f24402z0;
            if (i10 >= siVarArr.length) {
                break;
            }
            si siVar2 = siVarArr[i10];
            if (siVar2 != null && this.B0 != siVar2) {
                siVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7), 0), true, (AndroidUtilities.IntColorCallback) new ih(this, 11));
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
        this.f24357l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public aj(Activity activity, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11) {
        this(activity, m2Var, z10, z11, true, null);
    }
}
