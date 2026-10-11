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
import org.telegram.ui.mj1;
public class yi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, me.d {
    public static final int R2 = 0;
    public final LongSparseArray A0;
    public final ai A1;
    public double[] A2;
    public qi B0;
    public final bi B1;
    public boolean B2;
    public qi C0;
    public final s4.d0 C1;
    public boolean C2;
    public final ch.d D0;
    public final vi D1;
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
    public final ai G0;
    public boolean G1;
    public final fh.d G2;
    public boolean H;
    public final di H0;
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
    public final ai K0;
    public MessageObject K1;
    public final ah.c K2;
    public int L;
    public final ii L0;
    public boolean L1;
    public final nh L2;
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
    public l50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ci.m6 R0;
    public boolean R1;
    public final te0 S;
    public final gi S0;
    public boolean S1;
    public mo T;
    public int T0;
    public boolean T1;
    public n50 U;
    public hu U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public jk X;
    public boolean X0;
    public boolean X1;
    public hj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean f33271a0;
    public final a8 f33272a1;
    public ValueAnimator a2;
    public final me.b f33273b;
    public final ah.d f33274b0;
    public AnimatorSet f33275b1;
    public int f33276b2;
    public final me.b f33277c;
    public boolean f33278c0;
    public AnimatorSet f33279c1;
    public wi f33280c2;
    public final me.b d;
    public float f33281d0;
    public final org.telegram.ui.ActionBar.u0 f33282d1;
    public vn f33283d2;
    public final me.b f33284e;
    public final mi f33285e0;
    public final ci.u f33286e1;
    public final int[] f33287e2;
    public final me.b f33288f;
    public final org.telegram.ui.ActionBar.m2 f33289f0;
    public final org.telegram.ui.ActionBar.u0 f33290f1;
    public int f33291f2;
    public final boolean f33292g0;
    public ci.d4 f33293g1;
    public float f33294g2;
    public final me.b h;
    public pf f33295h0;
    public final org.telegram.ui.ActionBar.u0 f33296h1;
    public float f33297h2;
    public boolean f33298i0;
    public final bi.o f33299i1;
    public boolean f33300i2;
    public final ChatAttachAlertPhotoLayout f33301j0;
    public float f33302j1;
    public float f33303j2;
    public ck f33304k0;
    public float f33305k1;
    public final boolean f33306k2;
    public kj f33307l0;
    public final ai l1;
    public boolean f33308l2;
    public lo m0;
    public final TextView f33309m1;
    public final ArrayList f33310m2;
    public final me.l f33311n;
    public lo f33312n0;
    public final org.telegram.ui.ActionBar.u0 f33313n1;
    public final Rect f33314n2;
    public xl f33315o0;
    public final LinearLayout f33316o1;
    public float f33317o2;
    public sk f33318p0;
    public final ImageView f33319p1;
    public boolean f33320p2;
    public hn f33321q0;
    public final LinearLayout f33322q1;
    public int f33323q2;
    public org.telegram.ui.xn f33324r;
    public nj f33325r0;
    public final TextView f33326r1;
    public final mi f33327r2;
    public final r6 f33328s;
    public hg.j0 f33329s0;
    public float f33330s1;
    public o1.k f33331s2;
    public tk f33332t0;
    public boolean f33333t1;
    public AnimatorSet f33334t2;
    public tk f33335u0;
    public final oi f33336u1;
    public boolean f33337u2;
    public final r6 v;
    public ii.r f33338v0;
    public boolean f33339v1;
    public boolean f33340v2;
    public final ImageView f33341w;
    public gl f33342w0;
    public Object f33343w1;
    public sl f33344w2;
    public final i0 f33345x;
    public boolean f33346x0;
    public boolean f33347x1;
    public boolean f33348x2;
    public final ImageView f33349y;
    public float f33350y0;
    public final jh.f f33351y1;
    public boolean f33352y2;
    public final qi[] f33353z0;
    public final ci f33354z1;
    public File f33355z2;

    public yi(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        qi[] qiVarArr;
        TextPaint textPaint;
        me.l lVar;
        int i10;
        int i11;
        float f7;
        int i12;
        bi.o oVar;
        is isVar = is.h;
        this.f33273b = new me.b(0, this, isVar, 380L, false);
        this.f33277c = new me.b(1, this, isVar, 380L, false);
        this.d = new me.b(2, this, isVar, 380L, false);
        this.f33284e = new me.b(3, this, isVar, 380L, false);
        this.f33288f = new me.b(4, this, isVar, 380L, true);
        this.h = new me.b(5, this, isVar, 320L, false);
        me.l lVar2 = new me.l(new gh(this, 2), isVar, 380L);
        this.f33311n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f33281d0 = 0.0f;
        this.f33285e0 = new mi(this, 0);
        this.f33298i0 = false;
        qi[] qiVarArr2 = new qi[12];
        this.f33353z0 = qiVarArr2;
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
        int i13 = UserConfig.selectedAccount;
        this.M1 = i13;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.R1 = true;
        this.S1 = true;
        this.T1 = true;
        this.V1 = -1;
        this.W1 = true;
        this.f33276b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f33287e2 = new int[2];
        new Paint(1);
        this.f33308l2 = false;
        ArrayList arrayList = new ArrayList();
        this.f33310m2 = arrayList;
        Rect rect = new Rect();
        this.f33314n2 = rect;
        this.f33327r2 = new mi(this, 1);
        this.f33337u2 = true;
        this.f33340v2 = false;
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
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.H2 = dVar;
            dVar.j(new k2.g0(this, 11));
            fh.d dVar2 = new fh.d(null);
            this.G2 = dVar2;
            dVar2.j(new m.f3(this, 6));
            ah.c cVar2 = new ah.c(dVar);
            this.J2 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.K2 = cVar3;
            cVar3.f547i = LiteMode.isEnabled(262144);
        } else {
            this.F2 = null;
            this.G2 = null;
            this.H2 = null;
            this.J2 = new ah.c(cVar);
            this.K2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.L2 = new nh(this, 0);
        this.f33306k2 = z10;
        this.f33292g0 = (m2Var instanceof org.telegram.ui.zn) && m2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f33289f0 = m2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        oi oiVar = new oi(this, context);
        this.f33336u1 = oiVar;
        oiVar.setDelegate(new pi(this));
        this.containerView = oiVar;
        oiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        a8 a8Var = new a8(this, context, d6Var, 1);
        this.f33272a1 = a8Var;
        a8Var.S0 = true;
        a8Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        a8Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(false));
        int i15 = org.telegram.ui.ActionBar.h6.f20930j5;
        a8Var.D(getThemedColor(i15), false);
        int i16 = org.telegram.ui.ActionBar.h6.I5;
        a8Var.C(getThemedColor(i16), false);
        a8Var.setTitleColor(getThemedColor(i15));
        a8Var.setOccupyStatusBar(true);
        a8Var.setAlpha(0.0f);
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 8));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
        this.f33282d1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new gh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i16), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
        this.f33290f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f33286e1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        u0Var3.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i16), 6, -1));
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
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
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        w7.z5.a(oVar2);
        this.f33299i1 = oVar2;
        a2();
        if (m2Var != null) {
            qiVarArr = qiVarArr2;
            textPaint = textPaint2;
            lVar = lVar2;
            i12 = i16;
            i10 = i15;
            u0Var = u0Var3;
            f7 = 14.0f;
            oVar = oVar2;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
            this.f33296h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i11 = -1;
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12), 6, -1));
            u0Var4.setOnClickListener(new ai.k3(5, this, z11));
        } else {
            u0Var = u0Var3;
            qiVarArr = qiVarArr2;
            textPaint = textPaint2;
            lVar = lVar2;
            i10 = i15;
            i11 = -1;
            f7 = 14.0f;
            i12 = i16;
            oVar = oVar2;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i10), false, d6Var);
        this.f33313n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12), 3, i11));
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final yi f28416b;

            {
                this.f28416b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.zn znVar;
                switch (r3) {
                    case 0:
                        final yi yiVar = this.f28416b;
                        di diVar = yiVar.H0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(yiVar.getContext(), d6Var);
                            e0Var.n0(diVar.getText());
                            e0Var.f25909j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar = yiVar.S0;
                                            giVar.setText(charSequence);
                                            giVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            if (yiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ph phVar = new ph(yiVar, 0);
                            e0Var.f25911l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25912n0 = phVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final yi yiVar2 = this.f28416b;
                        gi giVar = yiVar2.S0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(yiVar2.getContext(), d6Var);
                            e0Var2.n0(giVar.getText());
                            e0Var2.f25909j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar2.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar2.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            if (yiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ph phVar2 = new ph(yiVar2, 1);
                            e0Var2.f25911l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25912n0 = phVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        yi yiVar3 = this.f28416b;
                        yiVar3.f33313n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar3.f33289f0;
                        t12.K2(null, m2Var2, d6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i17 = yiVar3.V1;
                        boolean z15 = yiVar3.W1;
                        t13.h = i17;
                        t13.f34042n = z15;
                        if (!yiVar3.f33280c2.i0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(yiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i18 = point.x;
                        int i19 = point.y;
                        if (i18 > 1080 || i19 > 1080) {
                            float min = Math.min(i18, i19) / 1080.0f;
                            i18 = (int) (i18 * min);
                            i19 = (int) (i19 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_8888);
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
                        zh zhVar = new zh(yiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.zn) {
                            znVar = (org.telegram.ui.zn) m2Var2;
                        } else {
                            znVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, zhVar, znVar);
                        if (yiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, yiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        ?? aiVar = new ai(this, context, 0);
        this.l1 = aiVar;
        aiVar.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        aiVar.setAlpha(0.0f);
        aiVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33316o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f33309m1 = textView;
        textView.setTextColor(getThemedColor(i10));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f33319p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        aiVar.addView(linearLayout, w7.x5.d(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33322q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f33326r1 = textView2;
        textView2.setTextColor(getThemedColor(i10));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.x5.q(-2, -2, 16));
        aiVar.addView(linearLayout2, w7.x5.d(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.f33301j0 = chatAttachAlertPhotoLayout;
        qiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.x5.d(-1.0f, -1));
        ?? view = new View(context);
        this.f33351y1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(view, w7.x5.g());
        this.containerView.addView(aiVar, w7.x5.a(-2.0f, 23.0f, 0.0f, 21.0f, 0.0f, -1, 51));
        ?? m6Var = new ci.m6(context, 8);
        this.R0 = m6Var;
        this.containerView.addView(m6Var, w7.x5.e(-1, -2, 55));
        this.containerView.addView(a8Var, w7.x5.d(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.x5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.x5.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f33296h1;
        if (u0Var6 != null) {
            this.containerView.addView(u0Var6, w7.x5.e(48, 48, 53));
        }
        aiVar.addView(u0Var5, w7.x5.a(32.0f, 0.0f, 0.0f, 0.0f, 8.0f, 32, 21));
        this.containerView.addView(oVar, w7.x5.e(-2, 48, 53));
        ?? aiVar2 = new ai(this, context, 1);
        this.A1 = aiVar2;
        bi biVar = new bi(context, 0);
        this.B1 = biVar;
        biVar.setClipChildren(true);
        biVar.setClipToPadding(false);
        vi viVar = new vi(this, context);
        this.D1 = viVar;
        biVar.setAdapter(viVar);
        s4.d0 d0Var = new s4.d0(0, false);
        this.C1 = d0Var;
        biVar.setLayoutManager(d0Var);
        biVar.setVerticalScrollBarEnabled(false);
        biVar.setHorizontalScrollBarEnabled(false);
        biVar.setItemAnimator(null);
        biVar.setLayoutAnimation(null);
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        biVar.f30590x2 = true;
        biVar.setOverScrollMode(2);
        ah.c cVar5 = this.J2;
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        cVar5.f545f = jVar;
        cVar5.f546g = viewGroup2;
        ah.c cVar6 = this.K2;
        hh.j jVar2 = new hh.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        cVar6.f545f = jVar2;
        cVar6.f546g = viewGroup3;
        hh.j jVar3 = new hh.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        cVar4.f545f = jVar3;
        cVar4.f546g = viewGroup4;
        ci ciVar = new ci(this, context, 0);
        this.f33354z1 = ciVar;
        ah.d dVar3 = new ah.d(cVar4.c(ciVar, null, false));
        this.f33274b0 = dVar3;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        dVar3.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ciVar, w7.x5.g());
        ch.d c10 = this.J2.c(aiVar2, eh.b.f(d6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        aiVar2.setBackground(c10);
        biVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        biVar.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52292a;
        biVar.setOutlineProvider(new yf.h0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        biVar.setImportantForAccessibility(1);
        aiVar2.addView(biVar, w7.x5.g());
        this.containerView.addView(aiVar2, w7.x5.e(-1, 70, 81));
        biVar.setOnItemClickListener(new ai.o6(9, this, d6Var));
        biVar.setOnItemLongClickListener(new gh(this, 3));
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
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        this.containerView.addView(r6Var, w7.x5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.x5.a(28.0f, 0.0f, 0.0f, 10.0f, 10.0f, 28, 85));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f21225z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        ?? aiVar3 = new ai(this, context, 2);
        this.G0 = aiVar3;
        ?? kVar = new hg.k(this, context);
        this.F0 = kVar;
        aiVar3.addView(kVar, w7.x5.e(-1, -1, 119));
        ch.d c11 = this.K2.c(oiVar, eh.b.n(d6Var), false);
        this.D0 = c11;
        c11.f4687m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f4684j.f4669g = 0.4f;
        c11.k();
        ch.d c12 = this.J2.c(kVar, eh.b.n(d6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        aiVar3.setWillNotDraw(false);
        aiVar3.setVisibility(4);
        aiVar3.setAlpha(0.0f);
        this.containerView.addView(aiVar3, w7.x5.e(-1, -2, 83));
        aiVar3.setOnTouchListener(new bi.d(13));
        r6 r6Var2 = new r6(context, false, false, false);
        this.f33328s = r6Var2;
        r6Var2.setAllowCancel(true);
        r6Var2.setScaleProperty(0.6f);
        r6Var2.setVisibility(8);
        r6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i17 = org.telegram.ui.ActionBar.h6.f21207y6;
        r6Var2.setTextColor(getThemedColor(i17));
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setGravity(17);
        kVar.addView(r6Var2, w7.x5.a(20.0f, 3.0f, 0.0f, 3.0f, 50.0f, 56, 85));
        ImageView imageView4 = new ImageView(context);
        this.f33341w = imageView4;
        i0 i0Var = new i0(context);
        this.f33345x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i18 = org.telegram.ui.ActionBar.h6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        int i19 = org.telegram.ui.ActionBar.h6.f20913i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(16.0f)));
        kVar.addView(imageView4, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28416b;

            {
                this.f28416b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.zn znVar;
                switch (r3) {
                    case 0:
                        final yi yiVar = this.f28416b;
                        di diVar = yiVar.H0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(yiVar.getContext(), d6Var);
                            e0Var.n0(diVar.getText());
                            e0Var.f25909j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            if (yiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ph phVar = new ph(yiVar, 0);
                            e0Var.f25911l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25912n0 = phVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final yi yiVar2 = this.f28416b;
                        gi giVar = yiVar2.S0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(yiVar2.getContext(), d6Var);
                            e0Var2.n0(giVar.getText());
                            e0Var2.f25909j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar2.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar2.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            if (yiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ph phVar2 = new ph(yiVar2, 1);
                            e0Var2.f25911l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25912n0 = phVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        yi yiVar3 = this.f28416b;
                        yiVar3.f33313n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar3.f33289f0;
                        t12.K2(null, m2Var2, d6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i172 = yiVar3.V1;
                        boolean z15 = yiVar3.W1;
                        t13.h = i172;
                        t13.f34042n = z15;
                        if (!yiVar3.f33280c2.i0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(yiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i182 = point.x;
                        int i192 = point.y;
                        if (i182 > 1080 || i192 > 1080) {
                            float min = Math.min(i182, i192) / 1080.0f;
                            i182 = (int) (i182 * min);
                            i192 = (int) (i192 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i182, i192, Bitmap.Config.ARGB_8888);
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
                        zh zhVar = new zh(yiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.zn) {
                            znVar = (org.telegram.ui.zn) m2Var2;
                        } else {
                            znVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, zhVar, znVar);
                        if (yiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, yiVar3.J);
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
        di diVar = new di(this, context, oiVar, d6Var);
        this.H0 = diVar;
        diVar.J = true;
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        diVar.s();
        diVar.getEditText().setLayoutParams(w7.x5.a(-1.0f, 48.0f, 0.0f, 36.0f, 0.0f, -1, 19));
        diVar.getEditText().addTextChangedListener(new fi(this, 0));
        kVar.addView(diVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 83));
        kVar.setClipChildren(false);
        aiVar3.setClipChildren(false);
        diVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        gi giVar = new gi(this, context, oiVar, d6Var);
        this.S0 = giVar;
        giVar.J = true;
        giVar.getEditText().addTextChangedListener(new hi(this, m2Var));
        giVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        giVar.getEditText().setLayoutParams(w7.x5.a(-1.0f, 48.0f, 0.0f, 96.0f, 0.0f, -1, 19));
        giVar.getEditText().setTextSize(1, 17.0f);
        giVar.getEmojiButton().setLayoutParams(w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        giVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(giVar, w7.x5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        diVar.addView(imageView3, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 4.0f, 40, 85));
        ch.d c13 = this.J2.c(m6Var, eh.b.n(d6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        m6Var.setBackground(c13);
        m6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        r6 r6Var3 = new r6(context, false, false, false);
        this.v = r6Var3;
        r6Var3.setScaleProperty(0.6f);
        r6Var3.setVisibility(8);
        r6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var3.setTextColor(getThemedColor(i17));
        r6Var3.setTypeface(AndroidUtilities.bold());
        r6Var3.setGravity(17);
        r6Var3.setAllowCancel(true);
        m6Var.addView(r6Var3, w7.x5.a(20.0f, 3.0f, 45.0f, 3.0f, 0.0f, 56, 53));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Xd), mode2));
        giVar.addView(imageView5, w7.x5.a(40.0f, 0.0f, 0.0f, 60.0f, 0.0f, 40, 85));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f33349y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i19), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 85));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28416b;

            {
                this.f28416b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.zn znVar;
                switch (r3) {
                    case 0:
                        final yi yiVar = this.f28416b;
                        di diVar2 = yiVar.H0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(yiVar.getContext(), d6Var);
                            e0Var.n0(diVar2.getText());
                            e0Var.f25909j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar22 = yiVar.H0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            if (yiVar.K1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ph phVar = new ph(yiVar, 0);
                            e0Var.f25911l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25912n0 = phVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final yi yiVar2 = this.f28416b;
                        gi giVar2 = yiVar2.S0;
                        if (giVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(yiVar2.getContext(), d6Var);
                            e0Var2.n0(giVar2.getText());
                            e0Var2.f25909j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar22 = yiVar2.H0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar22 = yiVar2.S0;
                                            giVar22.setText(charSequence);
                                            giVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            if (yiVar2.K1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ph phVar2 = new ph(yiVar2, 1);
                            e0Var2.f25911l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25912n0 = phVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        yi yiVar3 = this.f28416b;
                        yiVar3.f33313n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar3.f33289f0;
                        t12.K2(null, m2Var2, d6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i172 = yiVar3.V1;
                        boolean z15 = yiVar3.W1;
                        t13.h = i172;
                        t13.f34042n = z15;
                        if (!yiVar3.f33280c2.i0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(yiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i182 = point.x;
                        int i192 = point.y;
                        if (i182 > 1080 || i192 > 1080) {
                            float min = Math.min(i182, i192) / 1080.0f;
                            i182 = (int) (i182 * min);
                            i192 = (int) (i192 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i182, i192, Bitmap.Config.ARGB_8888);
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
                        zh zhVar = new zh(yiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.zn) {
                            znVar = (org.telegram.ui.zn) m2Var2;
                        } else {
                            znVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, zhVar, znVar);
                        if (yiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, yiVar3.J);
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
        ai aiVar4 = new ai(this, context, 3);
        this.K0 = aiVar4;
        aiVar4.setFocusable(true);
        aiVar4.setFocusableInTouchMode(true);
        aiVar4.setVisibility(4);
        aiVar4.setScaleX(0.2f);
        aiVar4.setScaleY(0.2f);
        aiVar4.setAlpha(0.0f);
        aiVar4.setClipChildren(false);
        aiVar4.setClipToPadding(false);
        this.containerView.addView(aiVar4, w7.x5.e(110, 50, 85));
        ii iiVar = new ii(R.drawable.send_plane_24, context, d6Var, this);
        this.L0 = iiVar;
        iiVar.setImportantForAccessibility(2);
        aiVar4.addView(iiVar, w7.x5.e(-1, -1, 119));
        iiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        iiVar.I = dp2;
        iiVar.J = dp3;
        iiVar.M = AndroidUtilities.dp(7.0f);
        iiVar.N = AndroidUtilities.dp(6.0f);
        iiVar.f32968h0 = true;
        iiVar.setOnClickListener(new View.OnClickListener(this) {
            public final yi f28064b;

            {
                this.f28064b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.p4 p4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f28064b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f28064b;
                        boolean z14 = yiVar2.f33278c0;
                        if (!z14) {
                            yiVar2.K1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f28064b;
                        boolean z15 = yiVar3.f33278c0;
                        if (z15) {
                            yiVar3.K1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f28064b.C1();
                        return;
                    case 4:
                        this.f28064b.f33282d1.M(null, null);
                        return;
                    case 5:
                        yi.w(this.f28064b);
                        return;
                    case 6:
                        qi qiVar = this.f28064b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f28064b.f33313n1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f28064b;
                        if (yiVar4.B0 != yiVar4.f33321q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.d2(z13);
                        return;
                }
            }
        });
        iiVar.setOnLongClickListener(new org.telegram.ui.gg(this, context, d6Var, m2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        ci ciVar2 = new ci(this, context, 1);
        ciVar2.setAlpha(0.0f);
        ciVar2.setScaleX(0.2f);
        ciVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        yl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.J2;
        dh.e n10 = eh.b.n(d6Var);
        rm0 rm0Var = fastScroll.f33402o0;
        ch.d c14 = cVar7.c(rm0Var.f30550d1, n10, false);
        fastScroll.f33391e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f33391e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(rm0Var.f30550d1, n10, false);
        fastScroll.f33393f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f33393f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f33393f0.q(AndroidUtilities.dp(f7));
        te0 te0Var = new te0(context);
        this.S = te0Var;
        this.containerView.addView(te0Var, w7.x5.d(-1.0f, -1));
        dh.e eVar = new dh.e(d6Var);
        eVar.f8365e = new gh(this, 4);
        eVar.f8364c = new gh(this, 5);
        eVar.d = new gh(this, 6);
        eVar.f8363b = new gh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8367n = dpf2;
        eVar.f8368r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8366f = dpf23;
        eVar.h = dpf24;
        a8Var.M(this.J2, eVar, false);
        lVar.i(1L, false);
    }

    public static void O(yi yiVar) {
        boolean z10;
        boolean q6;
        int i10;
        a8 a8Var = yiVar.f33272a1;
        jh.f fVar = yiVar.f33351y1;
        if (fVar != null && a8Var != null) {
            qi qiVar = yiVar.C0;
            if (qiVar == null) {
                qiVar = yiVar.B0;
            }
            int i11 = 0;
            if (qiVar != null && (qiVar instanceof gl)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.d6 d6Var = yiVar.resourcesProvider;
            if (d6Var != null) {
                q6 = d6Var.a();
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

    public static void S(yi yiVar) {
        ci.i iVar = new ci.i(yiVar, yiVar.getContext(), yiVar.Z, LaunchActivity.R(), yiVar.resourcesProvider, 1);
        yiVar.E2 = iVar;
        iVar.p(new l2.f(yiVar, 11));
        ViewGroup viewGroup = yiVar.containerView;
        viewGroup.addView(yiVar.E2, viewGroup.indexOfChild(yiVar.G0), w7.x5.e(-1, -1, 83));
        ci.i iVar2 = yiVar.E2;
        iVar2.getAdapter().f10667c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f10670e = false;
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        boolean z10 = true;
        if (m2Var instanceof org.telegram.ui.zn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var;
            gg.j1 adapter = iVar2.getAdapter();
            znVar.i();
            TLRPC.Chat chat = znVar.f44786e;
            adapter.getClass();
            adapter.f10679l0 = chat;
            iVar2.getAdapter().W(znVar.Z7);
            gg.j1 adapter2 = iVar2.getAdapter();
            if (znVar.f44786e == null) {
                z10 = false;
            }
            adapter2.f10671e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f10671e0 = false;
        }
        iVar2.getAdapter().f10673f0 = false;
        yiVar.Y1();
    }

    public static void o(yi yiVar, ValueAnimator valueAnimator) {
        yiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = yiVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static void q(yi yiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        yiVar.currentSheetAnimation = null;
        yiVar.f33331s2 = null;
        animationNotificationsLocker.unlock();
        yiVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (yiVar.useHardwareLayer) {
            yiVar.container.setLayerType(0, null);
        }
        if (yiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = yiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            yiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static boolean r(org.telegram.ui.Components.yi r46, android.content.Context r47, org.telegram.ui.ActionBar.d6 r48, org.telegram.ui.ActionBar.m2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.r(org.telegram.ui.Components.yi, android.content.Context, org.telegram.ui.ActionBar.d6, org.telegram.ui.ActionBar.m2, android.view.View):boolean");
    }

    public static void s(yi yiVar) {
        o1.k kVar = yiVar.f33331s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(yiVar.containerView, o1.h.f17006n, 0.0f);
        yiVar.f33331s2 = kVar2;
        kVar2.f17024u.a(1.5f);
        yiVar.f33331s2.f17024u.b(1500.0f);
        yiVar.f33331s2.h();
    }

    public static void t(yi yiVar, org.telegram.messenger.video.f fVar) {
        AnimatorSet animatorSet = yiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            fVar.run();
        }
    }

    public static void u(yi yiVar, int i10) {
        yiVar.navBarColorKey = -1;
        yiVar.navBarColor = i10;
        yiVar.containerView.invalidate();
    }

    public static void v(yi yiVar) {
        yiVar.currentSheetAnimation = null;
        yiVar.currentSheetAnimationType = 0;
        yiVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        if (user != null && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f20215id) && !UserObject.isReplyUser(user) && !UserObject.isAnonymous(user) && user.f20215id != 489000 && !MessagesController.isSupportUser(user)) {
            return true;
        }
        return false;
    }

    public static void w(yi yiVar) {
        int i10;
        if (yiVar.f33301j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33301j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24051s1;
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
        yiVar.c2(true);
        org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33290f1;
        ci.d4 d4Var = yiVar.f33293g1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = new ci.d4(yiVar.getContext(), 1);
        yiVar.f33293g1 = d4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        d4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        yiVar.f33293g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        yiVar.f33293g1.m(1.0f, -((yiVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        yiVar.f33293g1.setTranslationY(yiVar.f33282d1.getTranslationY());
        ci.d4 d4Var3 = yiVar.f33293g1;
        d4Var3.f4917l0 = new wc(7, yiVar, d4Var2);
        yiVar.containerView.addView(d4Var3, w7.x5.a(60.0f, 0.0f, 46.0f, 0.0f, 0.0f, -1, 48));
        yiVar.f33293g1.u();
    }

    public static void x(yi yiVar, boolean z10, jh jhVar) {
        Integer num;
        yiVar.B0.v(1.0f);
        yiVar.C0.v(1.0f);
        yiVar.B0.l(yiVar.f33317o2);
        yiVar.C0.l(yiVar.f33317o2);
        yiVar.containerView.invalidate();
        a8 a8Var = yiVar.f33272a1;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        a8Var.setTag(num);
        jhVar.run();
    }

    public static void y(yi yiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int i10;
        bi biVar = yiVar.B1;
        qi[] qiVarArr = yiVar.f33353z0;
        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
        if (m2Var2 == null) {
            m2Var = LaunchActivity.R();
        } else {
            m2Var = m2Var2;
        }
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (view instanceof si) {
                Activity parentActivity = m2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (yiVar.O1 || yiVar.P1 || !yiVar.c1()) {
                        if (!yiVar.O1 && !yiVar.P1) {
                            mo moVar = new mo(1, yiVar.getContext(), d6Var, yiVar);
                            yiVar.T = moVar;
                            yiVar.U1(moVar);
                        }
                        yiVar.U1(yiVar.f33301j0);
                    } else {
                        return;
                    }
                } else if (i10 == 17) {
                    if (yiVar.f33342w0 == null && (m2Var2 instanceof org.telegram.ui.zn)) {
                        TLRPC.User i11 = ((org.telegram.ui.zn) m2Var2).i();
                        if (v1(i11)) {
                            gl glVar = new gl(yiVar, yiVar.getContext(), yiVar.M1, i11, d6Var);
                            yiVar.f33342w0 = glVar;
                            qiVarArr[11] = glVar;
                        }
                    }
                    qi qiVar = yiVar.f33342w0;
                    if (qiVar != null) {
                        yiVar.U1(qiVar);
                    }
                } else if (i10 == 3) {
                    if (yiVar.Q1 || !yiVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(yiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        yiVar.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (yiVar.N1 || !yiVar.c1()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(yiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        yiVar.H1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (yiVar.T1 || !yiVar.c1()) {
                        if (yiVar.T1 && yiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(yiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        yiVar.G1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((yiVar.T1 || !yiVar.c1()) && AndroidUtilities.isMapsInstalled(m2Var2)) {
                        if (!yiVar.T1) {
                            mo moVar2 = new mo(6, yiVar.getContext(), d6Var, yiVar);
                            yiVar.T = moVar2;
                            yiVar.U1(moVar2);
                        } else {
                            if (yiVar.f33315o0 == null) {
                                Context context = yiVar.getContext();
                                if (yiVar.H || yiVar.U1) {
                                    z10 = false;
                                }
                                xl xlVar = new xl(yiVar, context, d6Var, z10);
                                yiVar.f33315o0 = xlVar;
                                qiVarArr[5] = xlVar;
                                sl slVar = yiVar.f33344w2;
                                if (slVar != null) {
                                    xlVar.setDelegate(slVar);
                                } else {
                                    xlVar.setDelegate(new gh(yiVar, 9));
                                }
                            }
                            yiVar.U1(yiVar.f33315o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (yiVar.R1 || !yiVar.c1()) {
                        if (!yiVar.R1) {
                            mo moVar3 = new mo(9, yiVar.getContext(), d6Var, yiVar);
                            yiVar.T = moVar3;
                            yiVar.U1(moVar3);
                        } else {
                            yiVar.W1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (yiVar.f33329s0 == null) {
                        hg.j0 j0Var = new hg.j0(yiVar.getContext(), yiVar.resourcesProvider, yiVar);
                        yiVar.f33329s0 = j0Var;
                        qiVarArr[7] = j0Var;
                        j0Var.setupBlurredSearchField(yiVar.J2);
                    }
                    yiVar.U1(yiVar.f33329s0);
                } else if (i10 == 12) {
                    if (yiVar.S1 || !yiVar.c1()) {
                        if (!yiVar.S1) {
                            mo moVar4 = new mo(9, yiVar.getContext(), d6Var, yiVar);
                            yiVar.T = moVar4;
                            yiVar.U1(moVar4);
                        } else {
                            if (yiVar.f33312n0 == null) {
                                lo loVar = new lo(yiVar, yiVar.getContext(), true, d6Var, null);
                                yiVar.f33312n0 = loVar;
                                qiVarArr[1] = loVar;
                                loVar.setDelegate(new gh(yiVar, 10));
                            }
                            yiVar.U1(yiVar.f33312n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (yiVar.f33335u0 == null) {
                        tk tkVar = new tk(yiVar, yiVar.getContext(), d6Var, true);
                        yiVar.f33335u0 = tkVar;
                        qiVarArr[8] = tkVar;
                        tkVar.setDelegate(yiVar.f33283d2);
                    }
                    yiVar.U1(yiVar.f33335u0);
                } else if (i10 == 14) {
                    if (yiVar.f33332t0 == null) {
                        tk tkVar2 = new tk(yiVar, yiVar.getContext(), d6Var, false);
                        yiVar.f33332t0 = tkVar2;
                        qiVarArr[9] = tkVar2;
                        tkVar2.setDelegate(yiVar.f33283d2);
                    }
                    yiVar.U1(yiVar.f33332t0);
                } else if (i10 == 16) {
                    if (yiVar.f33338v0 == null) {
                        ii.r rVar = new ii.r(yiVar.M1, yiVar.getContext(), d6Var, yiVar);
                        yiVar.f33338v0 = rVar;
                        qiVarArr[10] = rVar;
                    }
                    yiVar.U1(yiVar.f33338v0);
                } else if (view.getTag() instanceof Integer) {
                    yiVar.f33280c2.I1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, yiVar.u1(), false, 0L);
                }
            } else if (view instanceof ri) {
                ri riVar = (ri) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = riVar.f30530c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        mj1.a(yiVar.getContext(), new org.telegram.ui.oc(16, yiVar, riVar), null);
                    } else {
                        yiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    yiVar.f33280c2.p1(riVar.f30529b);
                    yiVar.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i12 = left - dp;
            if (i12 < 0) {
                biVar.v0(i12, 0, null);
                return;
            }
            int i13 = right + dp;
            if (i13 > biVar.getMeasuredWidth()) {
                biVar.v0(i13 - biVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void z(yi yiVar) {
        qi qiVar;
        hn hnVar;
        yiVar.f33343w1 = null;
        qi qiVar2 = yiVar.B0;
        if (qiVar2 != yiVar.f33301j0 && (qiVar = yiVar.C0) != (hnVar = yiVar.f33321q0) && qiVar2 != qiVar && qiVar2 != hnVar) {
            yiVar.containerView.removeView(qiVar2);
        }
        yiVar.B0.setVisibility(8);
        yiVar.B0.t();
        yiVar.C0.I();
        yiVar.B0 = yiVar.C0;
        yiVar.C0 = null;
        int[] iArr = yiVar.f33287e2;
        iArr[0] = iArr[1];
        yiVar.K1(yiVar.f33278c0, false);
        yiVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i10 < qiVarArr.length) {
                qi qiVar = qiVarArr[i10];
                if (qiVar != null) {
                    qiVar.B();
                }
                i10++;
            } else {
                this.f33300i2 = true;
                return;
            }
        }
    }

    public final void B1() {
        int i10 = 0;
        this.f33300i2 = false;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.D();
            }
            i10++;
        }
        if (isShowing()) {
            this.f33280c2.i0();
        }
        vi viVar = this.D1;
        if (viVar != null) {
            viVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (m2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var;
            MessageSuggestionParams messageSuggestionParams = znVar.f44816g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!yh.n5.U(i10, messageSuggestionParams.amount)) {
                znVar.Xb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f33328s);
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
        if (this.K1 == null && (m2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) m2Var;
            if (znVar2.c()) {
                g5.L(getContext(), znVar2.a(), new gh(this, 12), this.resourcesProvider);
                return;
            }
        }
        qi qiVar = this.B0;
        if (qiVar != this.f33301j0 && qiVar != this.f33321q0) {
            if (!qiVar.K(0, true, 0, u1(), this.Q0)) {
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
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
            if (this.f33315o0 == null) {
                xl xlVar = new xl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : false);
                this.f33315o0 = xlVar;
                this.f33353z0[5] = xlVar;
                sl slVar = this.f33344w2;
                if (slVar != null) {
                    xlVar.setDelegate(slVar);
                } else if (m2Var instanceof org.telegram.ui.zn) {
                    xlVar.setDelegate(new gh(this, 16));
                }
            }
            U1(this.f33315o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            mo moVar = new mo(3, getContext(), this.resourcesProvider, this);
            this.T = moVar;
            U1(moVar);
        }
        int i10 = 1;
        if (this.f33307l0 == null) {
            kj kjVar = new kj(getContext(), this.resourcesProvider, this);
            this.f33307l0 = kjVar;
            this.f33353z0[3] = kjVar;
            kjVar.setupBlurredSearchField(this.J2);
            this.f33307l0.setDelegate(new gh(this, 13));
            if (this.H) {
                this.f33307l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) m2Var).f44786e;
            kj kjVar2 = this.f33307l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            kjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.f33307l0);
        }
    }

    public final void F1() {
        if (this.f33325r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ?? qiVar = new qi(context, d6Var, this);
            qiVar.f29171r = AndroidUtilities.dp(80.0f);
            qiVar.f29173w = 3;
            ai.w0 w0Var = new ai.w0(qiVar, context, d6Var, 11);
            qiVar.f29170n = w0Var;
            bb bbVar = new bb(qiVar, context);
            qiVar.v = bbVar;
            w0Var.setAdapter(bbVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, qiVar.f30244a));
            qiVar.addView(w0Var, w7.x5.d(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(qiVar, 17));
            bi.l lVar = new bi.l(qiVar, qiVar.f29171r, 1);
            qiVar.f29172s = lVar;
            lVar.O = new ci.w1(qiVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f33325r0 = qiVar;
            qiVar.setDelegate(new ib(this, 1));
        }
        U1(this.f33325r0);
    }

    public final void G1() {
        boolean z10;
        if (!this.T1) {
            mo moVar = new mo(5, getContext(), this.resourcesProvider, this);
            this.T = moVar;
            U1(moVar);
        }
        if (this.f33304k0 == null) {
            ck ckVar = new ck(getContext(), this.resourcesProvider, this);
            this.f33304k0 = ckVar;
            this.f33353z0[2] = ckVar;
            ckVar.setupBlurredSearchField(this.J2);
            this.f33304k0.setDelegate(new ki(this));
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) m2Var).f44786e;
            ck ckVar2 = this.f33304k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            ckVar2.setMultipleSelectionAllowed(z10);
        }
        U1(this.f33304k0);
    }

    public final void H1(boolean z10) {
        int i10;
        if (!this.N1 && z10) {
            mo moVar = new mo(4, getContext(), this.resourcesProvider, this);
            this.T = moVar;
            U1(moVar);
        }
        boolean z11 = false;
        if (this.f33318p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            sk skVar = new sk(i10, getContext(), this.resourcesProvider, this);
            this.f33318p0 = skVar;
            this.f33353z0[4] = skVar;
            skVar.setDelegate(new li(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f33318p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
            if (m2Var instanceof org.telegram.ui.zn) {
                TLRPC.Chat chat = ((org.telegram.ui.zn) m2Var).f44786e;
                sk skVar2 = this.f33318p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i11 = -1;
                }
                skVar2.setMaxSelectedFiles(i11);
            } else {
                this.f33318p0.setMaxSelectedFiles(this.V1);
                sk skVar3 = this.f33318p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                skVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        sk skVar4 = this.f33318p0;
        skVar4.f30886d0 = this.N;
        if (z10) {
            U1(skVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        a8 a8Var = this.f33272a1;
        int i10 = 1;
        if (a8Var.f21322n0) {
            a8Var.h(true);
        }
        this.f33304k0 = null;
        this.f33329s0 = null;
        this.f33307l0 = null;
        this.m0 = null;
        this.f33312n0 = null;
        this.f33315o0 = null;
        this.f33318p0 = null;
        this.f33342w0 = null;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.p();
                this.containerView.removeView(qiVarArr[i10]);
                qiVarArr[i10] = null;
            }
            i10++;
        }
        X1(false, false);
        super.dismissInternal();
        if (this.f33346x0) {
            this.f33346x0 = false;
            this.f33350y0 = 0.0f;
            org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
            if (m2Var != null && m2Var.getFragmentView() != null) {
                View fragmentView = m2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f46890a;
                r0.y.c(fragmentView);
            }
        }
    }

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var;
            TLRPC.Chat chat = znVar.f44786e;
            if (znVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.M1).edit();
                edit.putBoolean("silent_" + znVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (d1(o1().getText())) {
            return true;
        }
        a1();
        if (this.h.f16402f) {
            this.L1 = true;
            this.f33280c2.I1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long p12 = p1();
        qi qiVar = this.B0;
        if (qiVar != null) {
            i12 = qiVar.getSelectedItemsCount();
        }
        return g5.a0(this.M1, p12, l1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                yi yiVar = yi.this;
                yiVar.L1 = true;
                yiVar.f33280c2.I1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
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
        this.f33273b.a(z10, z11);
        av o12 = o1();
        this.f33278c0 = z10;
        av o13 = o1();
        int i11 = 0;
        if (this.G0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        qi qiVar = this.B0;
        if (qiVar != this.f33301j0 && qiVar != this.f33321q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f33278c0 && z13) {
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
            is isVar = is.h;
            duration.setInterpolator(isVar).setUpdateListener(new hh(this, 0)).withEndAction(new Runnable(this) {
                public final yi f27447b;

                {
                    this.f27447b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            yi yiVar = this.f27447b;
                            if (!z14 || !z12) {
                                yiVar.R0.setVisibility(8);
                            }
                            yiVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f27447b.F0.setVisibility(8);
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
            translationY.alpha(f11).setDuration(320L).setInterpolator(isVar).setUpdateListener(new hh(this, 1)).withEndAction(new Runnable(this) {
                public final yi f27447b;

                {
                    this.f27447b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            yi yiVar = this.f27447b;
                            if (!z14 || !z12) {
                                yiVar.R0.setVisibility(8);
                            }
                            yiVar.f2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f27447b.F0.setVisibility(8);
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
        AndroidUtilities.runOnUIThread(new jh(this, 0));
    }

    public final void L1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f33301j0) != null) {
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
        float translationY = this.containerView.getTranslationY() - this.f33350y0;
        this.f33350y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        gl glVar = this.f33342w0;
        if (glVar != null) {
            glVar.setSendTransitionProgress(f7);
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
        this.f33309m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
        if (chatAttachAlertPhotoLayout != null) {
            yi yiVar = chatAttachAlertPhotoLayout.f30245b;
            if (yiVar.T0 == 0 || yiVar.F) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f24067g1 = z10;
        }
    }

    public final void Q1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.Q1(boolean):void");
    }

    public final void R1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.R1(long, java.lang.String, boolean, boolean):void");
    }

    public final void S1(org.telegram.ui.ActionBar.m2 m2Var) {
        if ((m2Var instanceof org.telegram.ui.zn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.zn) m2Var).f44786e)) {
            new ad(this.f33336u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new wc(8, this, m2Var)).j();
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
        qi qiVar;
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
        this.f33277c.a(z10, true);
        ai aiVar = this.G0;
        if (aiVar.getTag() != null) {
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
        aiVar.setTag(num);
        di diVar = this.H0;
        if (diVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        diVar.k(true);
        this.S0.k(true);
        ai aiVar2 = this.A1;
        ai aiVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                aiVar.setVisibility(0);
            }
            aiVar3.setVisibility(0);
        } else if (this.V0) {
            aiVar2.setVisibility(0);
        }
        qi qiVar2 = this.B0;
        if ((qiVar2 == this.f33301j0 || qiVar2 == this.f33321q0) && this.f33278c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        a8 a8Var2 = this.f33272a1;
        ci.m6 m6Var = this.R0;
        hg.k kVar = this.F0;
        ii iiVar = this.L0;
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
            arrayList.add(ObjectAnimator.ofFloat(aiVar, property, f19));
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
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(iiVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(iiVar, property3, f26));
            if (a8Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(aiVar, property4, dp2));
            } else if (this.V0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = AndroidUtilities.dp(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hh(this, 5));
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
            aiVar.setAlpha(f7);
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
            aiVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            aiVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            aiVar3.setAlpha(f14);
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
            iiVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            iiVar.setScaleY(f17);
            if (a8Var2.getTag() != null) {
                if (z10) {
                    dp = f11;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                aiVar.setTranslationY(dp);
            } else if (this.V0 && ((qiVar = this.B0) == null || qiVar.L())) {
                if (z10) {
                    f18 = AndroidUtilities.dp(84.0f);
                } else {
                    f18 = f11;
                }
                aiVar2.setTranslationY(f18);
            }
            if (!z10) {
                aiVar.setVisibility(4);
                aiVar3.setVisibility(4);
            }
            if (z13) {
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        iiVar.g(i10, z11);
        if (this.K1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1());
        }
        iiVar.i(l1() + this.B0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) diVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), iiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            diVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(qi qiVar) {
        long j3 = this.Z0;
        mo moVar = this.T;
        if (qiVar == moVar) {
            j3 = moVar.f28900s;
        } else if (qiVar == this.f33301j0) {
            j3 = 1;
        } else if (qiVar == this.f33307l0) {
            j3 = 3;
        } else if (qiVar == this.f33318p0) {
            j3 = 4;
        } else if (qiVar == this.f33304k0) {
            j3 = 5;
        } else if (qiVar == this.f33315o0) {
            j3 = 6;
        } else if (qiVar == this.m0) {
            j3 = 9;
        } else if (qiVar == this.f33325r0) {
            j3 = 10;
        } else if (qiVar == this.f33329s0) {
            j3 = 11;
        } else if (qiVar == this.f33312n0) {
            j3 = 12;
        } else if (qiVar == this.f33332t0) {
            j3 = 14;
        } else if (qiVar == this.f33335u0) {
            j3 = 13;
        } else if (qiVar == this.f33338v0) {
            j3 = 16;
        } else if (qiVar == this.f33342w0) {
            j3 = 17;
        }
        V1(qiVar, j3, true);
    }

    public final void V1(qi qiVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        um umVar;
        boolean z12;
        Integer num;
        um umVar2;
        int i12;
        int dp;
        int i13;
        int dp2;
        Float f7;
        int i14;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f33343w1 == null && this.P0 == null) {
            qi qiVar2 = this.B0;
            if (qiVar2 == qiVar) {
                qiVar2.J();
            } else if (qiVar == this.f33312n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new rg.y0(this.f33289f0, 39, false).show();
            } else {
                int i15 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f33288f.a(z11, z10);
                this.f33311n.i(Long.valueOf(j3), z10);
                this.G1 = false;
                this.E1 = false;
                this.I1 = 0.0f;
                this.H1.setVisibility(8);
                RadialProgressView radialProgressView = this.F1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                ai aiVar = this.A1;
                aiVar.setAlpha(1.0f);
                aiVar.setTranslationY(this.I1);
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
                bi biVar = this.B1;
                int childCount = biVar.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt = biVar.getChildAt(i17);
                    if (childAt instanceof si) {
                        si siVar = (si) childAt;
                        i14 = childCount;
                        f7 = valueOf;
                        if (siVar.f30871b == siVar.f30872c.Z0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        siVar.f31265a.e(z13, true);
                    } else {
                        f7 = valueOf;
                        i14 = childCount;
                        if (childAt instanceof ri) {
                            ((ri) childAt).a(true);
                        }
                    }
                    i17++;
                    childCount = i14;
                    valueOf = f7;
                }
                Float f10 = valueOf;
                int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f33287e2[0];
                this.C0 = qiVar;
                boolean e7 = qiVar.e();
                jh.f fVar = this.f33351y1;
                if (fVar != null) {
                    if (e7) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                ci ciVar = this.f33354z1;
                if (ciVar != null) {
                    if (e7) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    ciVar.setVisibility(i13);
                }
                if (this.C0.i() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                a8 a8Var = this.f33272a1;
                a8Var.setVisibility(i10);
                if (a8Var.f21322n0) {
                    a8Var.h(true);
                }
                this.B0.u();
                qi qiVar3 = this.C0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
                if (qiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.C0.G(this.B0);
                this.C0.setVisibility(0);
                if (qiVar.getParent() != null) {
                    this.containerView.removeView(this.C0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.B0);
                ViewParent parent = this.C0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    qi qiVar4 = this.C0;
                    if (qiVar4 != this.f33315o0) {
                        indexOfChild++;
                    }
                    i11 = 0;
                    viewGroup.addView(qiVar4, indexOfChild, w7.x5.d(-1.0f, -1));
                } else {
                    i11 = 0;
                }
                jh jhVar = new jh(this, 4);
                qi qiVar5 = this.B0;
                boolean z14 = qiVar5 instanceof hn;
                mi miVar = this.f33285e0;
                if (!z14 && !(this.C0 instanceof hn)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.C0.setAlpha(0.0f);
                        this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                        qi qiVar6 = this.B0;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[i11] = AndroidUtilities.dp(78.0f) + firstOffset;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qiVar6, property, fArr);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, miVar, 0.0f, 1.0f);
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
                        animatorSet.setInterpolator(is.f27500f);
                        animatorSet.addListener(new ji(this, firstOffset, jhVar, i11));
                        this.f33343w1 = animatorSet;
                        qi qiVar7 = this.B0;
                        miVar.getClass();
                        miVar.a(qiVar7, f10);
                        animatorSet.start();
                    } else {
                        qiVar5.setAlpha(0.0f);
                        jhVar.run();
                        e2(i11);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                    qi qiVar8 = this.C0;
                    if (qiVar8 instanceof hn) {
                        qiVar8.setTranslationX(max);
                        qi qiVar9 = this.B0;
                        if ((qiVar9 instanceof ChatAttachAlertPhotoLayout) && (umVar2 = ((ChatAttachAlertPhotoLayout) qiVar9).P) != null) {
                            umVar2.setVisibility(4);
                        }
                    } else {
                        this.B0.setTranslationX(-max);
                        qi qiVar10 = this.C0;
                        if (qiVar10 == chatAttachAlertPhotoLayout && (umVar = ((ChatAttachAlertPhotoLayout) qiVar10).P) != null) {
                            umVar.setVisibility(0);
                        }
                    }
                    this.C0.setAlpha(1.0f);
                    this.B0.setAlpha(1.0f);
                    if (z10) {
                        qi qiVar11 = this.B0;
                        miVar.getClass();
                        miVar.a(qiVar11, f10);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, qiVar, jhVar, 16));
                    } else {
                        if (this.C0.getCurrentItemTop() <= qiVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B0.v(1.0f);
                        this.C0.v(1.0f);
                        this.B0.l(this.f33317o2);
                        this.C0.l(this.f33317o2);
                        this.containerView.invalidate();
                        qi qiVar12 = this.B0;
                        Float valueOf2 = Float.valueOf(1.0f);
                        miVar.getClass();
                        miVar.a(qiVar12, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        a8Var.setTag(num);
                        jhVar.run();
                    }
                }
                if (this.f33320p2 && !(qiVar instanceof ei.p4)) {
                    i12 = 0;
                    this.f33320p2 = false;
                    a8Var.e();
                    a8Var.invalidate();
                    x1();
                } else {
                    i12 = 0;
                }
                if (i15 != 0 && j3 != 6 && j3 != 17 && !(qiVar instanceof ei.p4)) {
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
        yi yiVar;
        if (this.m0 == null) {
            yiVar = this;
            lo loVar = new lo(yiVar, getContext(), false, this.resourcesProvider, bool);
            yiVar.m0 = loVar;
            yiVar.f33353z0[1] = loVar;
            loVar.setDelegate(new gh(this, 15));
        } else {
            yiVar = this;
        }
        V1(yiVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        qi qiVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        a8 a8Var = this.f33272a1;
        if ((z10 && a8Var.getTag() == null) || (!z10 && a8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            a8Var.setTag(num);
            AnimatorSet animatorSet = this.f33275b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f33275b1 = null;
            }
            if (!this.F && !this.W0 && ((this.T0 != 0 || !this.f33333t1) && this.B0 == this.f33301j0 && (this.O1 || this.P1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.B0 == this.T) {
                z12 = false;
            }
            ai aiVar = this.A1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f33282d1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.V0 && this.G0.getTag() == null) {
                aiVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
            if (m2Var != null) {
                if (z10) {
                    if (this.f33306k2) {
                        i10 = org.telegram.ui.ActionBar.h6.f21127tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20893h5;
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
                this.f33275b1 = animatorSet2;
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
                ofFloat.addUpdateListener(new hh(this, 4));
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
                this.f33275b1.playTogether(arrayList);
                this.f33275b1.addListener(new ea(2, this, z10));
                this.f33275b1.setInterpolator(is.h);
                this.f33275b1.setDuration(380L);
                this.f33275b1.start();
                return;
            }
            if (z10 && this.V0 && ((qiVar = this.B0) == null || qiVar.L())) {
                aiVar.setVisibility(4);
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f33296h1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.T0 != 0 || !this.f33333t1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void Y1() {
        float alpha;
        int[] iArr = this.J0;
        di diVar = this.H0;
        diVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            qi qiVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
            if ((qiVar == chatAttachAlertPhotoLayout || qiVar == this.f33321q0) && this.f33278c0) {
                ci.m6 m6Var = this.R0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.E2.getTop());
            } else {
                alpha = -diVar.getHeight();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.Z1(int):void");
    }

    public final void a1() {
        if (o1().f24679a.length() <= 0) {
            return;
        }
        this.B0.a(o1().getText());
    }

    public final void a2() {
        boolean h;
        float f7;
        float f10;
        float f11;
        qi qiVar = this.B0;
        int i10 = 0;
        if (qiVar == null) {
            h = false;
        } else {
            h = qiVar.h();
        }
        bi.o oVar = this.f33299i1;
        oVar.setEnabled(h);
        qi qiVar2 = this.B0;
        float f12 = 0.5f;
        if (qiVar2 != null) {
            if (qiVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.C0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f33281d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        qi qiVar3 = this.C0;
        if (qiVar3 != null) {
            if (qiVar3.h()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f33281d0, f12, f7);
        }
        this.f33302j1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f33305k1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void b1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.b1():void");
    }

    public final void b2(qi qiVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (qiVar != null) {
            ah.h hVar = this.F2;
            if (hVar != null && Build.VERSION.SDK_INT >= 31) {
                hVar.f(0.0f, i10);
                b1();
            }
            int currentItemTop = qiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (qiVar == this.B0 && currentItemTop <= qiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (qiVar == this.B0) {
                    X1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.ai.D(11.0f, i11, currentItemTop);
                qi qiVar2 = this.B0;
                if (qiVar2 == qiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((qiVar2 instanceof hn) || (this.C0 instanceof hn)) {
                    Object obj = this.f33343w1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f17017f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f33287e2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f33291f2 = i13;
                        return;
                    }
                    return;
                }
                this.f33291f2 = i13;
                iArr[i12] = D;
                e2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final boolean c1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if ((m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).N6()) {
            return true;
        }
        return false;
    }

    public final void c2(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f33286e1) != null) {
            int i10 = 0;
            if (this.f33333t1 && this.f33298i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f6043f = z12;
            if (!z10) {
                ((g6) uVar.f6044g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f33290f1;
            if (z10 && this.f33333t1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(is.h).withEndAction(new sh(this, z11, 0)).start();
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
            o1.k kVar = this.f33331s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f33334t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final boolean d1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            return ChatActivityEnterView.F(this.M1, ((org.telegram.ui.zn) m2Var).a(), m2Var, charSequence);
        }
        return false;
    }

    public final void d2(boolean z10) {
        boolean z11;
        float f7;
        qi qiVar = this.f33301j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f33321q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f33324r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                ?? qiVar2 = new qi(context, d6Var, this);
                qiVar2.f27174y = 0.0f;
                qiVar2.E = 0.0f;
                qiVar2.F = 0.0f;
                qiVar2.G = 0.0f;
                qiVar2.H = 0.0f;
                qiVar2.I = 0.0f;
                qiVar2.J = null;
                qiVar2.K = false;
                qiVar2.M = 0.0f;
                qiVar2.Q = false;
                qiVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qiVar2.T = z11;
                qiVar2.f27169n = d6Var;
                qiVar2.f30248f = true;
                qiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y o9 = qiVar2.f30245b.f33272a1.o();
                TextView textView = new TextView(context);
                qiVar2.f27173x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = qiVar2.f30244a;
                pm pmVar = new pm(qiVar2, context, o9, d6Var2, 1);
                a8 a8Var = qiVar2.f30245b.f33272a1;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                a8Var.addView(pmVar, 0, w7.x5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20930j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                pmVar.addView(textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
                ai.w0 w0Var = new ai.w0(qiVar2, context, d6Var2, 14);
                qiVar2.f27170r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.u7(qiVar2, 3));
                s4.d0 d0Var = new s4.d0(1, false);
                qiVar2.f27171s = d0Var;
                w0Var.setLayoutManager(d0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                gn gnVar = new gn(qiVar2, context);
                qiVar2.v = gnVar;
                gnVar.setClipToPadding(true);
                gnVar.setClipChildren(true);
                qiVar2.addView(w0Var, w7.x5.d(-1.0f, -1));
                qiVar2.P = qiVar2.f30245b.f33301j0;
                gnVar.f26825c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qiVar2.P;
                gnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                gnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                gnVar.c();
                UndoView undoView = new UndoView(context, null, false, qiVar2.f30245b.f33324r);
                qiVar2.f27172w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                qiVar2.addView(undoView, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 52.0f, -1, 83));
                qiVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f33321q0 = qiVar2;
                qiVar2.bringToFront();
            }
            qi qiVar3 = this.B0;
            hn hnVar = this.f33321q0;
            if (qiVar3 != hnVar) {
                qiVar = hnVar;
            }
            U1(qiVar);
            return;
        }
        U1(qiVar);
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
        vi viVar = this.D1;
        if (viVar != null) {
            viVar.l();
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
        wi wiVar = this.f33280c2;
        if (wiVar != null) {
            wiVar.f0(new jh(this, 3));
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
        bi biVar = this.B1;
        if (biVar == null) {
            return;
        }
        int childCount = biVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            biVar.getChildAt(i20);
        }
        boolean z11 = this.f33306k2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20930j5;
        }
        this.f33309m1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f20930j5;
        }
        this.f33326r1.setTextColor(getThemedColor(i11));
        this.f33299i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f20930j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.u0 u0Var = this.f33282d1;
        u0Var.setIconColor(themedColor);
        Drawable background = u0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.h6.f20922ig;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.I5;
        }
        org.telegram.ui.ActionBar.h6.x1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.h6.E8;
        u0Var.G(getThemedColor(i21), false);
        u0Var.G(getThemedColor(i21), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f33290f1;
        if (u0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.h6.f20903hg;
            } else {
                i19 = org.telegram.ui.ActionBar.h6.f20930j5;
            }
            u0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f33296h1;
        if (u0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.h6.f20903hg;
            } else {
                i17 = org.telegram.ui.ActionBar.h6.f20930j5;
            }
            u0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = u0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.h6.f20922ig;
            } else {
                i18 = org.telegram.ui.ActionBar.h6.I5;
            }
            org.telegram.ui.ActionBar.h6.x1(getThemedColor(i18), background2);
        }
        di diVar = this.H0;
        org.telegram.ui.ActionBar.d6 d6Var = diVar.M;
        vu vuVar = diVar.f24679a;
        int i22 = diVar.L;
        if (i22 == 0) {
            vuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            int i23 = org.telegram.ui.ActionBar.h6.G6;
            vuVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i23, d6Var));
            vuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i23, d6Var));
        } else if (i22 != 2 && i22 != 3) {
            vuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21117t5, d6Var));
            vuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20930j5, d6Var));
        } else {
            vuVar.setHintTextColor(-1929379841);
            vuVar.setTextColor(-1);
            vuVar.setCursorColor(-1);
            vuVar.setHandlesColor(-1);
            vuVar.setHighlightColor(822083583);
            vuVar.quoteColor = -1;
        }
        diVar.f24681c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        wu wuVar = diVar.d;
        if (wuVar != null) {
            wuVar.S();
        }
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.f20930j5;
        }
        int themedColor2 = getThemedColor(i14);
        a8 a8Var = this.f33272a1;
        a8Var.D(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.h6.f20922ig;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.I5;
        }
        a8Var.C(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i16 = org.telegram.ui.ActionBar.h6.f20930j5;
        }
        a8Var.setTitleColor(getThemedColor(i16));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
        fh.c cVar = this.I2;
        if (cVar.f9932a.getColor() != s12) {
            cVar.a(s12);
            jh.f fVar = this.f33351y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ci ciVar = this.f33354z1;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i24 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i24];
            if (qiVar != null) {
                qiVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20912i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5));
    }

    public final void e2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.e2(int):void");
    }

    public final void f1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.f1(boolean):void");
    }

    public final void f2() {
        int i10 = 0;
        e2(0);
        this.f33336u1.invalidate();
        ci.m6 m6Var = this.R0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
        if (chatAttachAlertPhotoLayout != null) {
            km kmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (kmVar != null && kmVar.getFastScroll() != null) {
                yl0 fastScroll = kmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f24084p1;
                if (this.f33278c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.f33395h0 = currentActionBarHeight + i10;
                kmVar.getFastScroll().invalidate();
            }
        }
        Y1();
        i1();
    }

    public final void g1() {
        float f7 = this.f33277c.f16401e;
        float f10 = (1.0f - this.f33273b.f16401e) * f7;
        this.f33354z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.f16401e))), 1.0f - f10));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i10 < qiVarArr.length) {
                qi qiVar = qiVarArr[i10];
                if (qiVar != null && (themeDescriptions = qiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20912i5));
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
        float f10 = this.f33284e.f16401e;
        float f11 = this.f33288f.f16401e;
        float b10 = yf.e0.b(this.h.f16401e);
        if (this.U1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        q20.d(this.I0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
    }

    public final void i1() {
        ii iiVar = this.L0;
        ai aiVar = this.K0;
        ci.m6 m6Var = this.R0;
        if (m6Var != null && m6Var.getVisibility() == 0 && m6Var.getAlpha() != 0.0f) {
            float f7 = this.f33273b.f16401e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            iiVar.setAlpha(abs * abs * abs * abs);
            aiVar.setTranslationY(AndroidUtilities.lerp(this.f33303j2, ((m6Var.getTranslationY() + m6Var.getTop()) - aiVar.getTop()) + AndroidUtilities.dp(8.0f), is.f27503j.getInterpolation(f7)));
            return;
        }
        aiVar.setTranslationY(this.f33303j2);
        iiVar.setAlpha(1.0f);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f33313n1;
        if (u0Var != null) {
            this.f33309m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void k1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f33309m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.f33298i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f33313n1;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if ((m2Var instanceof org.telegram.ui.zn) && (messagePreviewParams = ((org.telegram.ui.zn) m2Var).f44804f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) m2Var).f44786e;
        }
        return MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        qi qiVar;
        int i11;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            g1();
            lo loVar = this.m0;
            if (loVar != null && ((qiVar = this.C0) == loVar || this.B0 == loVar)) {
                if (qiVar == loVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                e2(i11);
            }
            lo loVar2 = this.f33312n0;
            if (loVar2 != null) {
                qi qiVar2 = this.C0;
                if (qiVar2 == loVar2 || this.B0 == loVar2) {
                    if (qiVar2 != loVar2) {
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
            ii iiVar = this.L0;
            if (iiVar != null) {
                iiVar.setEphemeralFactor(f7);
                iiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final float n1() {
        ai aiVar = this.G0;
        float alpha = 1.0f - aiVar.getAlpha();
        return aiVar.getMeasuredHeight() - (alpha * (aiVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final av o1() {
        qi qiVar;
        if (this.f33278c0 && ((qiVar = this.B0) == this.f33301j0 || qiVar == this.f33321q0)) {
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
        a8 a8Var = this.f33272a1;
        if (a8Var.f21322n0) {
            a8Var.h(true);
        } else if (this.B0.j()) {
        } else {
            if (o1() != null && o1().f24682e) {
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final gl glVar = this.f33342w0;
        if (glVar != null && this.B0 == glVar) {
            final jh jhVar = new jh(this, 1);
            int i10 = glVar.f26798n;
            org.telegram.ui.Wallet.k8 k8Var = glVar.O;
            yi yiVar = glVar.f30245b;
            AnimatorSet animatorSet = null;
            if (!glVar.H && (wallettransaction = glVar.M0) != null && glVar.N0 == null && glVar.O0 == null) {
                if (glVar.P0) {
                    org.telegram.ui.Wallet.c5 c5Var = new org.telegram.ui.Wallet.c5();
                    c5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                    if (m2Var != null && m2Var.presentFragment(c5Var, false, true)) {
                        org.telegram.ui.Wallet.y8 y8Var = new org.telegram.ui.Wallet.y8(yiVar.getContainer(), yiVar.getSheetContainer(), k8Var.getDiamondView(), c5Var, glVar.M0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!glVar.H) {
                                            jhVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!glVar.H) {
                                            jhVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, yiVar);
                        glVar.O0 = y8Var;
                        animatorSet = y8Var.f35784m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.e6 diamondView = k8Var.getDiamondView();
                    if (diamondView.f34891f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
                        if (m2Var2 instanceof org.telegram.ui.zn) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var2;
                            if (znVar.getCurrentAccount() == i10 && znVar.a() == glVar.f26803r.f20215id && znVar.R3 == 0 && znVar.getFragmentView() != null && znVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.x5 x5Var = new org.telegram.ui.Wallet.x5(yiVar.getContainer(), yiVar.getSheetContainer(), k8Var.getDiamondView(), znVar, glVar.M0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!glVar.H) {
                                                    jhVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!glVar.H) {
                                                    jhVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, yiVar);
                                glVar.N0 = x5Var;
                                animatorSet = x5Var.f35742m;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
        ja1 ja1Var = chatAttachAlertPhotoLayout.f24076l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f24072j0;
        TextView textView = chatAttachAlertPhotoLayout.f24083p0;
        km kmVar = chatAttachAlertPhotoLayout.f24086r;
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
                if (kmVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.q.B(222.0f, i13, i16), i14, org.telegram.messenger.q.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.q.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (kmVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.q.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.q.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == ja1Var) {
            if (z10) {
                if (kmVar.getVisibility() == 0) {
                    ja1Var.layout(0, org.telegram.messenger.q.B(310.0f, i13, i16), i14, org.telegram.messenger.q.B(260.0f, i13, i16));
                    return true;
                }
                ja1Var.layout(0, org.telegram.messenger.q.B(176.0f, i13, i16), i14, org.telegram.messenger.q.B(126.0f, i13, i16));
                return true;
            } else if (kmVar.getVisibility() == 0) {
                ja1Var.layout(org.telegram.messenger.q.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                ja1Var.layout(org.telegram.messenger.q.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (kmVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (kmVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != kmVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.q.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
        ym ymVar = chatAttachAlertPhotoLayout.v;
        km kmVar = chatAttachAlertPhotoLayout.f24086r;
        gg.a0 a0Var = chatAttachAlertPhotoLayout.f24088s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        um umVar = chatAttachAlertPhotoLayout.P;
        if (view == umVar) {
            if (chatAttachAlertPhotoLayout.f24056b0 && !chatAttachAlertPhotoLayout.f24060d0) {
                umVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f24072j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            ja1 ja1Var = chatAttachAlertPhotoLayout.f24076l0;
            if (view == ja1Var) {
                if (z10) {
                    ja1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                ja1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == kmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    kmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f47770o != 0) {
                        kmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        ymVar.l();
                    }
                } else {
                    kmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f47770o != 1) {
                        kmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        ymVar.l();
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
        this.f33301j0.setTranslationX(0.0f);
        this.f33322q1.setAlpha(0.0f);
        this.f33316o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33334t2 = animatorSet;
        mi miVar = this.f33327r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, miVar, 0.0f, 400.0f));
        this.f33334t2.setDuration(400L);
        this.f33334t2.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        miVar.getClass();
        miVar.a(this, valueOf);
        this.f33334t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new hh(this, 2));
        o1.k kVar = this.f33331s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f17006n, 0.0f);
        this.f33331s2 = kVar2;
        if (this.K1 != null) {
            kVar2.f17024u.a(0.75f);
            this.f33331s2.f17024u.b(350.0f);
        } else {
            kVar2.f17024u.a(0.75f);
            this.f33331s2.f17024u.b(350.0f);
        }
        this.f33331s2.h();
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
        org.telegram.messenger.video.f fVar = new org.telegram.messenger.video.f(this, animationNotificationsLocker, this.delegate, 17);
        this.f33331s2.a(new ei.l4(2, this, fVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, fVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new hh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(is.f27500f);
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
        if (this.f33289f0 instanceof org.telegram.ui.zn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f33339v1 = true;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) m2Var).a();
        }
        return this.Z;
    }

    public final int q1() {
        qi qiVar = this.B0;
        lo loVar = this.m0;
        if (qiVar == loVar && loVar.E != null) {
            return loVar.getEmojiPadding();
        }
        lo loVar2 = this.f33312n0;
        if (qiVar == loVar2 && loVar2.E != null) {
            return loVar2.getEmojiPadding();
        }
        if (this.f33278c0) {
            return this.S0.getEmojiPadding();
        }
        return this.H0.getEmojiPadding();
    }

    public final int r1(int i10) {
        qi qiVar = this.C0;
        int[] iArr = this.f33287e2;
        if (qiVar != null && ((this.B0 instanceof hn) || (qiVar instanceof hn))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f33281d0);
        }
        return iArr[i10];
    }

    public final int s1(boolean z10) {
        boolean q6;
        int i10;
        a8 a8Var;
        if (this.f33306k2) {
            return getThemedColor(org.telegram.ui.ActionBar.h6.f21127tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        Iterator it = this.f33311n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            long longValue = ((Long) gVar.f16412a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.o.a(f7, 0.0f, 1.0f);
        if (z10 && (a8Var = this.f33272a1) != null && a8Var.getVisibility() == 0) {
            a2 *= 1.0f - a8Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.h6.f20766a7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20912i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        qi qiVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33301j0;
        if (qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f24071i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            this.calcMandatoryInsets = ((org.telegram.ui.zn) m2Var).C9();
        }
        a2();
        this.f33339v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f33320p2) {
            this.f33320p2 = false;
            a8 a8Var = this.f33272a1;
            a8Var.e();
            a8Var.invalidate();
            x1();
        }
    }

    public final void t1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.t1():void");
    }

    public final boolean u1() {
        if (this.f33278c0) {
            qi qiVar = this.B0;
            if (qiVar == this.f33301j0 || qiVar == this.f33321q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        wi wiVar = this.f33280c2;
        if (wiVar != null && !this.f33347x1) {
            boolean i02 = wiVar.i0();
            this.f33347x1 = true;
            ci.x0 x0Var = new ci.x0(this, editTextBoldCursor, z10, 19);
            if (i02) {
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
            if (cVar.f9932a.getColor() != s12) {
                cVar.a(s12);
                jh.f fVar = this.f33351y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                ci ciVar = this.f33354z1;
                if (ciVar != null) {
                    ciVar.invalidate();
                }
            }
            a2();
            this.containerView.invalidate();
        }
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.p();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        di diVar = this.H0;
        if (diVar != null) {
            diVar.o();
        }
        gi giVar = this.S0;
        if (giVar != null) {
            giVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f20215id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
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
        gi giVar;
        di diVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        qi qiVar = this.B0;
        gl glVar = this.f33342w0;
        boolean z10 = (qiVar != glVar || glVar == null || glVar.H || glVar.M0 == null) ? false : true;
        this.f33346x0 = z10;
        if (!z10 && (diVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        if (!this.f33346x0 && (giVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(giVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.f33289f0;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        if (!this.D2 && m2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.C2) {
                return;
            }
            this.C2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20404a.setOnCancelListener(new mh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.N = b1Var;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21062q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f33353z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar2 = qiVarArr[i10];
            if (qiVar2 != null && this.B0 != qiVar2) {
                qiVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f20766a7), 0), true, (AndroidUtilities.IntColorCallback) new gh(this, 11));
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
        this.f33308l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override
    public final void A(float f7, int i10) {
    }

    public yi(Activity activity, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11) {
        this(activity, m2Var, z10, z11, true, null);
    }
}
