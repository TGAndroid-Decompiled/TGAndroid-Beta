package org.telegram.ui.Components;

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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gi1;
public class ni extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, vd.b {
    public static final int K2 = 0;
    public final k0 A;
    public final th A0;
    public final o6 A1;
    public final qg.d A2;
    public boolean B;
    public final ImageView B0;
    public float B1;
    public final qg.c B2;
    public boolean C;
    public final int[] C0;
    public int C1;
    public final lg.a C2;
    public boolean D;
    public final ph D0;
    public MessageObject D1;
    public final lg.a D2;
    public int E;
    public final yh E0;
    public boolean E1;
    public final dh E2;
    public Utilities.Callback2 F;
    public final TextPaint F0;
    public final int F1;
    public final ArrayList F2;
    public int G;
    public final RectF G0;
    public boolean G1;
    public final RectF G2;
    public int H;
    public final Paint H0;
    public boolean H1;
    public final RectF H2;
    public boolean I;
    public AnimatorSet I0;
    public boolean I1;
    public final RectF I2;
    public boolean J;
    public long J0;
    public boolean J1;
    public final ArrayList J2;
    public boolean K;
    public final bg.d1 K0;
    public boolean K1;
    public boolean L;
    public final wh L0;
    public boolean L1;
    public q40 M;
    public int M0;
    public boolean M1;
    public boolean N;
    public jt N0;
    public boolean N1;
    public final nd0 O;
    public boolean O0;
    public int O1;
    public pn P;
    public boolean P0;
    public boolean P1;
    public s40 Q;
    public boolean Q0;
    public boolean Q1;
    public boolean R;
    public final float R0;
    public float R1;
    public boolean S;
    public long S0;
    public float S1;
    public zj T;
    public final cg.m1 T0;
    public ValueAnimator T1;
    public vi U;
    public AnimatorSet U0;
    public int U1;
    public long V;
    public AnimatorSet V0;
    public li V1;
    public boolean W;
    public final org.telegram.ui.ActionBar.w0 W0;
    public an W1;
    public final lg.b X;
    public final nh.u X0;
    public final int[] X1;
    public boolean Y;
    public final org.telegram.ui.ActionBar.w0 Y0;
    public int Y1;
    public float Z;
    public nh.t3 Z0;
    public float Z1;
    public final bi f30987a0;
    public final org.telegram.ui.ActionBar.w0 f30988a1;
    public float a2;
    public final vd.a f30989b;
    public final org.telegram.ui.ActionBar.o2 f30990b0;
    public final cg.s0 f30991b1;
    public boolean f30992b2;
    public final vd.a f30993c;
    public final boolean f30994c0;
    public float f30995c1;
    public float f30996c2;
    public final vd.a d;
    public ff f30997d0;
    public float f30998d1;
    public final boolean f30999d2;
    public final vd.a f31000e;
    public boolean f31001e0;
    public final ph f31002e1;
    public boolean f31003e2;
    public final vd.a f31004f;
    public final ChatAttachAlertPhotoLayout f31005f0;
    public final TextView f31006f1;
    public final ArrayList f31007f2;
    public sj f31008g0;
    public final org.telegram.ui.ActionBar.w0 f31009g1;
    public final Rect f31010g2;
    public final vd.a h;
    public yi f31011h0;
    public final LinearLayout f31012h1;
    public float f31013h2;
    public on f31014i0;
    public final ImageView f31015i1;
    public boolean f31016i2;
    public on f31017j0;
    public final LinearLayout f31018j1;
    public int f31019j2;
    public bl f31020k0;
    public final TextView f31021k1;
    public final bi f31022k2;
    public jk f31023l0;
    public float l1;
    public o1.k f31024l2;
    public lm m0;
    public boolean f31025m1;
    public AnimatorSet f31026m2;
    public final vd.k f31027n;
    public bj f31028n0;
    public final di f31029n1;
    public boolean f31030n2;
    public sf.d0 f31031o0;
    public boolean f31032o1;
    public boolean f31033o2;
    public kk f31034p0;
    public Object f31035p1;
    public wk f31036p2;
    public kk f31037q0;
    public boolean f31038q1;
    public boolean f31039q2;
    public org.telegram.ui.rn f31040r;
    public th.p f31041r0;
    public final ug.f f31042r1;
    public boolean f31043r2;
    public final o6 f31044s;
    public final fi[] f31045s0;
    public final rh f31046s1;
    public File f31047s2;
    public final LongSparseArray f31048t0;
    public final ph f31049t1;
    public double[] f31050t2;
    public fi f31051u0;
    public final qh f31052u1;
    public boolean f31053u2;
    public final o6 v;
    public fi f31054v0;
    public final f2.j0 f31055v1;
    public boolean f31056v2;
    public final ImageView f31057w;
    public final ng.d f31058w0;
    public final ki f31059w1;
    public boolean f31060w2;
    public final k0 f31061x;
    public final ng.d f31062x0;
    public boolean f31063x1;
    public nh.i f31064x2;
    public final ImageView f31065y;
    public final sh f31066y0;
    public final RadialProgressView f31067y1;
    public final lg.e f31068y2;
    public final ph f31069z0;
    public boolean f31070z1;
    public final qg.d f31071z2;

    public ni(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        cg.s0 s0Var;
        float f9;
        cg.m1 m1Var;
        jr jrVar = jr.h;
        this.f30989b = new vd.a(0, this, jrVar, 380L, false);
        this.f30993c = new vd.a(1, this, jrVar, 380L, false);
        this.d = new vd.a(2, this, jrVar, 380L, false);
        this.f31000e = new vd.a(3, this, jrVar, 380L, false);
        this.f31004f = new vd.a(4, this, jrVar, 380L, true);
        this.h = new vd.a(5, this, jrVar, 320L, false);
        vd.k kVar = new vd.k(new wg(this, 1), jrVar, 380L);
        this.f31027n = kVar;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.Z = 0.0f;
        this.f30987a0 = new bi(this, 0);
        this.f31001e0 = false;
        fi[] fiVarArr = new fi[11];
        this.f31045s0 = fiVarArr;
        this.f31048t0 = new LongSparseArray();
        this.C0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Paint(1);
        this.Q0 = true;
        this.R0 = 1.0f;
        this.f31063x1 = false;
        this.f31070z1 = false;
        int i10 = UserConfig.selectedAccount;
        this.F1 = i10;
        this.G1 = true;
        this.H1 = true;
        this.I1 = true;
        this.J1 = true;
        this.K1 = true;
        this.L1 = true;
        this.M1 = true;
        this.O1 = -1;
        this.P1 = true;
        this.U1 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.X1 = new int[2];
        new Paint(1);
        this.f31003e2 = false;
        ArrayList arrayList = new ArrayList();
        this.f31007f2 = arrayList;
        Rect rect = new Rect();
        this.f31010g2 = rect;
        this.f31022k2 = new bi(this, 1);
        this.f31030n2 = true;
        this.f31033o2 = false;
        this.f31056v2 = false;
        this.f31060w2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.F2 = arrayList2;
        RectF rectF = new RectF();
        this.G2 = rectF;
        RectF rectF2 = new RectF();
        this.H2 = rectF2;
        RectF rectF3 = new RectF();
        this.I2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.J2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        qg.c cVar = new qg.c();
        this.B2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f31068y2 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.A2 = dVar;
            dVar.i(new o4.g(this, 3));
            qg.d dVar2 = new qg.d(null);
            this.f31071z2 = dVar2;
            dVar2.i(new n(this, 1));
            lg.a aVar = new lg.a(dVar);
            this.C2 = aVar;
            aVar.f15225f = LiteMode.isEnabled(262144);
            lg.a aVar2 = new lg.a(dVar2);
            this.D2 = aVar2;
            aVar2.f15225f = LiteMode.isEnabled(262144);
        } else {
            this.f31068y2 = null;
            this.f31071z2 = null;
            this.A2 = null;
            this.C2 = new lg.a(cVar);
            this.D2 = new lg.a(cVar);
        }
        lg.a aVar3 = new lg.a(cVar);
        this.E2 = new dh(this, 0);
        this.f30999d2 = z10;
        this.f30994c0 = (o2Var instanceof org.telegram.ui.tn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30990b0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        di diVar = new di(this, context);
        this.f31029n1 = diVar;
        diVar.setDelegate(new ei(this));
        this.containerView = diVar;
        diVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        cg.m1 m1Var2 = new cg.m1(this, context, c6Var, 2);
        this.T0 = m1Var2;
        m1Var2.O0 = true;
        m1Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        m1Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        m1Var2.C(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.g6.I5;
        m1Var2.B(getThemedColor(i13), false);
        m1Var2.setTitleColor(getThemedColor(i12));
        m1Var2.setOccupyStatusBar(true);
        m1Var2.setAlpha(0.0f);
        m1Var2.setActionBarMenuOnItemClick(new cg.n1(this, 25));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, c6Var);
        this.W0 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new wg(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i13), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, c6Var);
        this.Y0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        nh.u uVar = new nh.u();
        this.X0 = uVar;
        w0Var3.setIcon(uVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i13), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        cg.s0 s0Var2 = new cg.s0(this, context);
        s0Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        s0Var2.setText(LocaleController.getString(R.string.Create));
        s0Var2.setTypeface(AndroidUtilities.bold());
        s0Var2.setTextSize(1, 14.0f);
        s0Var2.setVisibility(4);
        s0Var2.setAlpha(0.0f);
        s0Var2.setGravity(17);
        s0Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s0Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        s0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        i7.h6.a(s0Var2);
        this.f30991b1 = s0Var2;
        W1();
        if (o2Var != null) {
            w0Var = w0Var3;
            s0Var = s0Var2;
            f9 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, c6Var);
            this.f30988a1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i13), 6, -1));
            w0Var4.setOnClickListener(new lh.z1(5, this, z11));
        } else {
            w0Var = w0Var3;
            s0Var = s0Var2;
            f9 = 14.0f;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, c6Var);
        this.f31009g1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i13), 3, -1));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ni f27098b;

            {
                this.f27098b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.tn tnVar;
                switch (r3) {
                    case 0:
                        final ni niVar = this.f27098b;
                        th thVar = niVar.A0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(niVar.getContext(), c6Var);
                            g0Var.m0(thVar.getText());
                            g0Var.f28671f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            th thVar2 = niVar.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            wh whVar = niVar.L0;
                                            whVar.setText(charSequence);
                                            whVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = niVar.V;
                            if (niVar.D1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            fh fhVar = new fh(niVar, 0);
                            g0Var.f28673h0 = j10;
                            g0Var.f28674i0 = z13;
                            g0Var.f28675j0 = fhVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ni niVar2 = this.f27098b;
                        wh whVar = niVar2.L0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(niVar2.getContext(), c6Var);
                            g0Var2.m0(whVar.getText());
                            g0Var2.f28671f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            th thVar2 = niVar2.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            wh whVar2 = niVar2.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = niVar2.V;
                            if (niVar2.D1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            fh fhVar2 = new fh(niVar2, 1);
                            g0Var2.f28673h0 = j11;
                            g0Var2.f28674i0 = z14;
                            g0Var2.f28675j0 = fhVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ni niVar3 = this.f27098b;
                        niVar3.f31009g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar3.f30990b0;
                        t12.K2(null, o2Var2, c6Var);
                        PhotoViewer.t1().L2(niVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i14 = niVar3.O1;
                        boolean z15 = niVar3.P1;
                        t13.h = i14;
                        t13.f35763n = z15;
                        if (!niVar3.V1.a0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(niVar3.getContainer().findFocus());
                        }
                        File w10 = nh.o7.w(niVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i15 = point.x;
                        int i16 = point.y;
                        if (i15 > 1080 || i16 > 1080) {
                            float min = Math.min(i15, i16) / 1080.0f;
                            i15 = (int) (i15 * min);
                            i16 = (int) (i16 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
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
                        oh ohVar = new oh(niVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.tn) {
                            tnVar = (org.telegram.ui.tn) o2Var2;
                        } else {
                            tnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, ohVar, tnVar);
                        if (niVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, niVar3.F);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        ph phVar = new ph(this, context, 0);
        this.f31002e1 = phVar;
        phVar.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        phVar.setAlpha(0.0f);
        phVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31012h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f31006f1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, i7.f6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f31015i1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, i7.f6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        phVar.addView(linearLayout, i7.f6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f31018j1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f31021k1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, i7.f6.q(-2, -2, 16));
        phVar.addView(linearLayout2, i7.f6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.f31005f0 = chatAttachAlertPhotoLayout;
        fiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f31051u0 = chatAttachAlertPhotoLayout;
        this.S0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, i7.f6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f31042r1 = view;
        view.setup(aVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, i7.f6.g());
        this.containerView.addView(phVar, i7.f6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bg.d1 d1Var = new bg.d1(context);
        this.K0 = d1Var;
        this.containerView.addView(d1Var, i7.f6.e(-1, -2, 55));
        this.containerView.addView(m1Var2, i7.f6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, i7.f6.e(48, 48, 53));
        this.containerView.addView(w0Var, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f30988a1;
        if (w0Var6 != null) {
            m1Var = m1Var2;
            this.containerView.addView(w0Var6, i7.f6.e(48, 48, 53));
        } else {
            m1Var = m1Var2;
        }
        phVar.addView(w0Var5, i7.f6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(s0Var, i7.f6.e(-2, 48, 53));
        ph phVar2 = new ph(this, context, 1);
        this.f31049t1 = phVar2;
        qh qhVar = new qh(context, 0);
        this.f31052u1 = qhVar;
        qhVar.setClipChildren(true);
        qhVar.setClipToPadding(false);
        ki kiVar = new ki(this, context);
        this.f31059w1 = kiVar;
        qhVar.setAdapter(kiVar);
        f2.j0 j0Var = new f2.j0(0, false);
        this.f31055v1 = j0Var;
        qhVar.setLayoutManager(j0Var);
        qhVar.setVerticalScrollBarEnabled(false);
        qhVar.setHorizontalScrollBarEnabled(false);
        qhVar.setItemAnimator(null);
        qhVar.setLayoutAnimation(null);
        qhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        qhVar.f29729v2 = true;
        qhVar.setOverScrollMode(2);
        lg.a aVar4 = this.C2;
        sg.i iVar = new sg.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.f15224e = viewGroup2;
        lg.a aVar5 = this.D2;
        sg.i iVar2 = new sg.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.f15224e = viewGroup3;
        sg.i iVar3 = new sg.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.f15224e = viewGroup4;
        rh rhVar = new rh(this, context, 0);
        this.f31046s1 = rhVar;
        lg.b bVar = new lg.b(aVar3.c(rhVar, null, false));
        this.X = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(rhVar, i7.f6.g());
        ng.d c3 = this.C2.c(phVar2, pg.a.f(c6Var), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        phVar2.setBackground(c3);
        qhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        qhVar.setClipToOutline(true);
        eg.k1 k1Var = jf.q0.f11668a;
        qhVar.setOutlineProvider(new jf.p0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        qhVar.setImportantForAccessibility(1);
        phVar2.addView(qhVar, i7.f6.g());
        this.containerView.addView(phVar2, i7.f6.e(-1, 70, 81));
        qhVar.setOnItemClickListener(new eg.w0(10, this, c6Var));
        qhVar.setOnItemLongClickListener(new wg(this, 3));
        o6 o6Var = new o6(context, true, false, true);
        this.A1 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        o6Var.setPadding(dp, 0, dp, 0);
        o6Var.setTextSize(AndroidUtilities.dp(f9));
        o6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view2) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        this.containerView.addView(o6Var, i7.f6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f31067y1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, i7.f6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f23450z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view2) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        ph phVar3 = new ph(this, context, 2);
        this.f31069z0 = phVar3;
        sh shVar = new sh(this, context);
        this.f31066y0 = shVar;
        phVar3.addView(shVar, i7.f6.e(-1, -1, 119));
        ng.d c6 = this.D2.c(diVar, pg.a.m(c6Var), false);
        this.f31058w0 = c6;
        c6.f17347k = true;
        c6.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c6.t(AndroidUtilities.dp(32.0f));
        c6.h.f17331g = 0.4f;
        c6.j();
        ng.d c10 = this.C2.c(shVar, pg.a.m(c6Var), false);
        this.f31062x0 = c10;
        c10.p(AndroidUtilities.dp(22.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        shVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        phVar3.setWillNotDraw(false);
        phVar3.setVisibility(4);
        phVar3.setAlpha(0.0f);
        this.containerView.addView(phVar3, i7.f6.e(-1, -2, 83));
        phVar3.setOnTouchListener(new mh.d(13));
        o6 o6Var2 = new o6(context, false, false, false);
        this.f31044s = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i14 = org.telegram.ui.ActionBar.g6.f23433y6;
        o6Var2.setTextColor(getThemedColor(i14));
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        shVar.addView(o6Var2, i7.f6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f31057w = imageView4;
        k0 k0Var = new k0(context);
        this.f31061x = k0Var;
        imageView4.setImageDrawable(k0Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.g6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        int i16 = org.telegram.ui.ActionBar.g6.f23152i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        shVar.addView(imageView4, i7.f6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ni f27098b;

            {
                this.f27098b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.tn tnVar;
                switch (r3) {
                    case 0:
                        final ni niVar = this.f27098b;
                        th thVar = niVar.A0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(niVar.getContext(), c6Var);
                            g0Var.m0(thVar.getText());
                            g0Var.f28671f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            th thVar2 = niVar.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            wh whVar2 = niVar.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = niVar.V;
                            if (niVar.D1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            fh fhVar = new fh(niVar, 0);
                            g0Var.f28673h0 = j10;
                            g0Var.f28674i0 = z13;
                            g0Var.f28675j0 = fhVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ni niVar2 = this.f27098b;
                        wh whVar = niVar2.L0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(niVar2.getContext(), c6Var);
                            g0Var2.m0(whVar.getText());
                            g0Var2.f28671f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            th thVar2 = niVar2.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            wh whVar2 = niVar2.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = niVar2.V;
                            if (niVar2.D1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            fh fhVar2 = new fh(niVar2, 1);
                            g0Var2.f28673h0 = j11;
                            g0Var2.f28674i0 = z14;
                            g0Var2.f28675j0 = fhVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ni niVar3 = this.f27098b;
                        niVar3.f31009g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar3.f30990b0;
                        t12.K2(null, o2Var2, c6Var);
                        PhotoViewer.t1().L2(niVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = niVar3.O1;
                        boolean z15 = niVar3.P1;
                        t13.h = i142;
                        t13.f35763n = z15;
                        if (!niVar3.V1.a0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(niVar3.getContainer().findFocus());
                        }
                        File w10 = nh.o7.w(niVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i152 = point.x;
                        int i162 = point.y;
                        if (i152 > 1080 || i162 > 1080) {
                            float min = Math.min(i152, i162) / 1080.0f;
                            i152 = (int) (i152 * min);
                            i162 = (int) (i162 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
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
                        oh ohVar = new oh(niVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.tn) {
                            tnVar = (org.telegram.ui.tn) o2Var2;
                        } else {
                            tnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, ohVar, tnVar);
                        if (niVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, niVar3.F);
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
        this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        th thVar = new th(this, context, diVar, c6Var);
        this.A0 = thVar;
        thVar.F = true;
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        thVar.s();
        thVar.getEditText().setLayoutParams(i7.f6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        thVar.getEditText().addTextChangedListener(new vh(this));
        shVar.addView(thVar, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        shVar.setClipChildren(false);
        phVar3.setClipChildren(false);
        thVar.setClipChildren(false);
        d1Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        d1Var.setWillNotDraw(false);
        wh whVar = new wh(this, context, diVar, c6Var);
        this.L0 = whVar;
        whVar.F = true;
        whVar.getEditText().addTextChangedListener(new xh(this, o2Var));
        whVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        whVar.getEditText().setLayoutParams(i7.f6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        whVar.getEditText().setTextSize(1, 17.0f);
        whVar.getEmojiButton().setLayoutParams(i7.f6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        whVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        d1Var.addView(whVar, i7.f6.e(-1, -2, 119));
        d1Var.setAlpha(0.0f);
        d1Var.setVisibility(8);
        thVar.addView(imageView3, i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ng.d c11 = this.C2.c(d1Var, pg.a.m(c6Var), false);
        c11.p(AndroidUtilities.dp(22.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        d1Var.setBackground(c11);
        d1Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.v = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setTextColor(getThemedColor(i14));
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        d1Var.addView(o6Var3, i7.f6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Xd), mode2));
        whVar.addView(imageView5, i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view2) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f31065y = imageView6;
        k0 k0Var2 = new k0(context);
        this.A = k0Var2;
        imageView6.setImageDrawable(k0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        d1Var.addView(imageView6, i7.f6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ni f27098b;

            {
                this.f27098b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.tn tnVar;
                switch (r3) {
                    case 0:
                        final ni niVar = this.f27098b;
                        th thVar2 = niVar.A0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(niVar.getContext(), c6Var);
                            g0Var.m0(thVar2.getText());
                            g0Var.f28671f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            th thVar22 = niVar.A0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            wh whVar2 = niVar.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = niVar.V;
                            if (niVar.D1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            fh fhVar = new fh(niVar, 0);
                            g0Var.f28673h0 = j10;
                            g0Var.f28674i0 = z13;
                            g0Var.f28675j0 = fhVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final ni niVar2 = this.f27098b;
                        wh whVar2 = niVar2.L0;
                        if (whVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(niVar2.getContext(), c6Var);
                            g0Var2.m0(whVar2.getText());
                            g0Var2.f28671f0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            th thVar22 = niVar2.A0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            wh whVar22 = niVar2.L0;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = niVar2.V;
                            if (niVar2.D1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            fh fhVar2 = new fh(niVar2, 1);
                            g0Var2.f28673h0 = j11;
                            g0Var2.f28674i0 = z14;
                            g0Var2.f28675j0 = fhVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        ni niVar3 = this.f27098b;
                        niVar3.f31009g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar3.f30990b0;
                        t12.K2(null, o2Var2, c6Var);
                        PhotoViewer.t1().L2(niVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = niVar3.O1;
                        boolean z15 = niVar3.P1;
                        t13.h = i142;
                        t13.f35763n = z15;
                        if (!niVar3.V1.a0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(niVar3.getContainer().findFocus());
                        }
                        File w10 = nh.o7.w(niVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i152 = point.x;
                        int i162 = point.y;
                        if (i152 > 1080 || i162 > 1080) {
                            float min = Math.min(i152, i162) / 1080.0f;
                            i152 = (int) (i152 * min);
                            i162 = (int) (i162 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
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
                        oh ohVar = new oh(niVar3, photoEntry);
                        if (o2Var2 instanceof org.telegram.ui.tn) {
                            tnVar = (org.telegram.ui.tn) o2Var2;
                        } else {
                            tnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, ohVar, tnVar);
                        if (niVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, niVar3.F);
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
        ph phVar4 = new ph(this, context, 3);
        this.D0 = phVar4;
        phVar4.setFocusable(true);
        phVar4.setFocusableInTouchMode(true);
        phVar4.setVisibility(4);
        phVar4.setScaleX(0.2f);
        phVar4.setScaleY(0.2f);
        phVar4.setAlpha(0.0f);
        phVar4.setClipChildren(false);
        phVar4.setClipToPadding(false);
        this.containerView.addView(phVar4, i7.f6.e(110, 50, 85));
        yh yhVar = new yh(R.drawable.send_plane_24, context, c6Var, this);
        this.E0 = yhVar;
        yhVar.setImportantForAccessibility(2);
        phVar4.addView(yhVar, i7.f6.e(-1, -1, 119));
        yhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        yhVar.E = dp2;
        yhVar.F = dp3;
        yhVar.I = AndroidUtilities.dp(7.0f);
        yhVar.J = AndroidUtilities.dp(6.0f);
        yhVar.f31351d0 = true;
        yhVar.setOnClickListener(new View.OnClickListener(this) {
            public final ni f26770b;

            {
                this.f26770b = this;
            }

            @Override
            public final void onClick(View view2) {
                ph.n3 n3Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        ni niVar = this.f26770b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.f31048t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        ni niVar2 = this.f26770b;
                        boolean z14 = niVar2.Y;
                        if (!z14) {
                            niVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        ni niVar3 = this.f26770b;
                        boolean z15 = niVar3.Y;
                        if (z15) {
                            niVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f26770b.z1();
                        return;
                    case 4:
                        this.f26770b.W0.M(null, null);
                        return;
                    case 5:
                        ni.s(this.f26770b);
                        return;
                    case 6:
                        fi fiVar = this.f26770b.f31051u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f26770b.f31009g1.M(null, null);
                        return;
                    default:
                        ni niVar4 = this.f26770b;
                        if (niVar4.f31051u0 != niVar4.m0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        niVar4.Z1(z13);
                        return;
                }
            }
        });
        yhVar.setOnLongClickListener(new org.telegram.ui.tf(this, context, c6Var, o2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        rh rhVar2 = new rh(this, context, 1);
        rhVar2.setAlpha(0.0f);
        rhVar2.setScaleX(0.2f);
        rhVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        sk0 fastScroll = chatAttachAlertPhotoLayout.A.getFastScroll();
        lg.a aVar6 = this.C2;
        og.d m10 = pg.a.m(c6Var);
        jl0 jl0Var = fastScroll.f32679k0;
        ng.d c12 = aVar6.c(jl0Var.f29689b1, m10, false);
        fastScroll.f32665a0 = c12;
        c12.o(AndroidUtilities.dp(4.0f));
        fastScroll.f32665a0.p(AndroidUtilities.dp(24.0f));
        ng.d c13 = aVar6.c(jl0Var.f29689b1, m10, false);
        fastScroll.f32667b0 = c13;
        c13.o(AndroidUtilities.dp(6.0f));
        fastScroll.f32667b0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f32667b0.p(AndroidUtilities.dp(f9));
        nd0 nd0Var = new nd0(context);
        this.O = nd0Var;
        this.containerView.addView(nd0Var, i7.f6.c(-1.0f, -1));
        og.d dVar3 = new og.d(c6Var);
        dVar3.f19560e = new wg(this, 4);
        dVar3.f19559c = new wg(this, 5);
        dVar3.d = new wg(this, 6);
        dVar3.f19558b = new wg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f19562n = dpf2;
        dVar3.f19563r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f19561f = dpf23;
        dVar3.h = dpf24;
        m1Var.L(this.C2, dVar3, false);
        kVar.i(1L, false);
    }

    public static void L(ni niVar) {
        boolean q6;
        int i10;
        int i11;
        cg.m1 m1Var = niVar.T0;
        ug.f fVar = niVar.f31042r1;
        if (fVar != null && m1Var != null) {
            org.telegram.ui.ActionBar.c6 c6Var = niVar.resourcesProvider;
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            if (m1Var.getVisibility() == 0) {
                if (q6) {
                    i11 = 255;
                } else {
                    i11 = 160;
                }
                i10 = (int) (m1Var.getAlpha() * i11);
            } else {
                i10 = 0;
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void Q(ni niVar) {
        nh.i iVar = new nh.i(niVar, niVar.getContext(), niVar.V, LaunchActivity.R(), niVar.resourcesProvider, 1);
        niVar.f31064x2 = iVar;
        iVar.p(new o1.a(niVar, 7));
        ViewGroup viewGroup = niVar.containerView;
        viewGroup.addView(niVar.f31064x2, viewGroup.indexOfChild(niVar.f31069z0), i7.f6.e(-1, -1, 83));
        nh.i iVar2 = niVar.f31064x2;
        iVar2.getAdapter().f47364c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f47367e = false;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        boolean z10 = true;
        if (o2Var instanceof org.telegram.ui.tn) {
            iVar2.getAdapter().f47373i0 = false;
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            rf.v0 adapter = iVar2.getAdapter();
            tnVar.i();
            TLRPC.Chat chat = tnVar.f42787e;
            adapter.getClass();
            adapter.f47372h0 = chat;
            iVar2.getAdapter().W(tnVar.V7);
            rf.v0 adapter2 = iVar2.getAdapter();
            if (tnVar.f42787e == null) {
                z10 = false;
            }
            adapter2.f47362a0 = z10;
        } else {
            iVar2.getAdapter().f47373i0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f47362a0 = false;
        }
        iVar2.getAdapter().f47363b0 = false;
        niVar.U1();
    }

    public static void m(ni niVar, ValueAnimator valueAnimator) {
        niVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = niVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static void n(ni niVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        niVar.currentSheetAnimation = null;
        niVar.f31024l2 = null;
        animationNotificationsLocker.unlock();
        niVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (niVar.useHardwareLayer) {
            niVar.container.setLayerType(0, null);
        }
        if (niVar.isFullscreen) {
            WindowManager.LayoutParams attributes = niVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            niVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(ni niVar, int i10) {
        niVar.navBarColorKey = -1;
        niVar.navBarColor = i10;
        niVar.containerView.invalidate();
    }

    public static void p(ni niVar) {
        o1.k kVar = niVar.f31024l2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(niVar.containerView, o1.i.f19028n, 0.0f);
        niVar.f31024l2 = kVar2;
        kVar2.f19045u.a(1.5f);
        niVar.f31024l2.f19045u.b(1500.0f);
        niVar.f31024l2.f();
    }

    public static boolean q(org.telegram.ui.Components.ni r45, android.content.Context r46, org.telegram.ui.ActionBar.c6 r47, org.telegram.ui.ActionBar.o2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.q(org.telegram.ui.Components.ni, android.content.Context, org.telegram.ui.ActionBar.c6, org.telegram.ui.ActionBar.o2, android.view.View):boolean");
    }

    public static void r(ni niVar, g gVar) {
        AnimatorSet animatorSet = niVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            gVar.run();
        }
    }

    public static void s(ni niVar) {
        int i10;
        if (niVar.f31005f0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i11 = 0; i11 < chatAttachAlertPhotoLayout.A.getChildCount(); i11++) {
                            View childAt = chatAttachAlertPhotoLayout.A.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.r5) {
                                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                if (r5Var.getPhotoEntry() == photoEntry) {
                                    r5Var.getImageView().invalidate();
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
        niVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = niVar.Y0;
        nh.t3 t3Var = niVar.Z0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = new nh.t3(niVar.getContext(), 1);
        niVar.Z0 = t3Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        t3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        niVar.Z0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        niVar.Z0.n(1.0f, -((niVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        niVar.Z0.setTranslationY(niVar.W0.getTranslationY());
        nh.t3 t3Var3 = niVar.Z0;
        t3Var3.f18597h0 = new z2(9, niVar, t3Var2);
        niVar.containerView.addView(t3Var3, i7.f6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        niVar.Z0.v();
    }

    public static void t(ni niVar, boolean z10, zg zgVar) {
        Integer num;
        niVar.f31051u0.s(1.0f);
        niVar.f31054v0.s(1.0f);
        niVar.f31051u0.k(niVar.f31013h2);
        niVar.f31054v0.k(niVar.f31013h2);
        niVar.containerView.invalidate();
        cg.m1 m1Var = niVar.T0;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        m1Var.setTag(num);
        zgVar.run();
    }

    public static void v(ni niVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        ni niVar2 = niVar;
        qh qhVar = niVar2.f31052u1;
        fi[] fiVarArr = niVar2.f31045s0;
        org.telegram.ui.ActionBar.o2 o2Var2 = niVar2.f30990b0;
        if (o2Var2 == null) {
            o2Var = LaunchActivity.R();
        } else {
            o2Var = o2Var2;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (view instanceof hi) {
                Activity parentActivity = o2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (niVar2.H1 || niVar2.I1 || !niVar2.a1()) {
                        if (!niVar2.H1 && !niVar2.I1) {
                            pn pnVar = new pn(1, niVar2.getContext(), c6Var, niVar2);
                            niVar2.P = pnVar;
                            niVar2.Q1(pnVar);
                        }
                        niVar2.Q1(niVar2.f31005f0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (niVar2.J1 || !niVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(niVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        niVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (niVar2.G1 || !niVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(niVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        niVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (niVar2.M1 || !niVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && niVar2.M1 && niVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(niVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        niVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((niVar2.M1 || !niVar2.a1()) && AndroidUtilities.isMapsInstalled(o2Var2)) {
                        if (!niVar2.M1) {
                            pn pnVar2 = new pn(6, niVar2.getContext(), c6Var, niVar2);
                            niVar2.P = pnVar2;
                            niVar2.Q1(pnVar2);
                        } else {
                            if (niVar2.f31020k0 == null) {
                                bl blVar = new bl(niVar2, niVar2.getContext(), c6Var, (niVar2.D || niVar2.N1) ? false : false);
                                niVar2.f31020k0 = blVar;
                                fiVarArr[5] = blVar;
                                wk wkVar = niVar2.f31036p2;
                                if (wkVar != null) {
                                    blVar.setDelegate(wkVar);
                                } else {
                                    blVar.setDelegate(new wg(niVar2, 9));
                                }
                            }
                            niVar2.Q1(niVar2.f31020k0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (niVar2.K1 || !niVar2.a1()) {
                        if (!niVar2.K1) {
                            pn pnVar3 = new pn(9, niVar2.getContext(), c6Var, niVar2);
                            niVar2.P = pnVar3;
                            niVar2.Q1(pnVar3);
                        } else {
                            niVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (niVar2.f31031o0 == null) {
                        sf.d0 d0Var = new sf.d0(niVar2.getContext(), niVar2.resourcesProvider, niVar2);
                        niVar2.f31031o0 = d0Var;
                        fiVarArr[7] = d0Var;
                        d0Var.setupBlurredSearchField(niVar2.C2);
                    }
                    niVar2.Q1(niVar2.f31031o0);
                } else if (i10 == 12) {
                    if (niVar2.L1 || !niVar2.a1()) {
                        if (!niVar2.L1) {
                            pn pnVar4 = new pn(9, niVar2.getContext(), c6Var, niVar2);
                            niVar2.P = pnVar4;
                            niVar2.Q1(pnVar4);
                        } else {
                            if (niVar2.f31017j0 == null) {
                                on onVar = new on(niVar, niVar.getContext(), true, c6Var, null);
                                niVar2 = niVar;
                                niVar2.f31017j0 = onVar;
                                fiVarArr[1] = onVar;
                                onVar.setDelegate(new wg(niVar2, 10));
                            }
                            niVar2.Q1(niVar2.f31017j0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (niVar2.f31037q0 == null) {
                        kk kkVar = new kk(niVar2, niVar2.getContext(), c6Var, true);
                        niVar2.f31037q0 = kkVar;
                        fiVarArr[8] = kkVar;
                        kkVar.setDelegate(niVar2.W1);
                    }
                    niVar2.Q1(niVar2.f31037q0);
                } else if (i10 == 14) {
                    if (niVar2.f31034p0 == null) {
                        kk kkVar2 = new kk(niVar2, niVar2.getContext(), c6Var, false);
                        niVar2.f31034p0 = kkVar2;
                        fiVarArr[9] = kkVar2;
                        kkVar2.setDelegate(niVar2.W1);
                    }
                    niVar2.Q1(niVar2.f31034p0);
                } else if (i10 == 16) {
                    if (niVar2.f31041r0 == null) {
                        th.p pVar = new th.p(niVar2.F1, niVar2.getContext(), c6Var, niVar2);
                        niVar2.f31041r0 = pVar;
                        fiVarArr[10] = pVar;
                    }
                    niVar2.Q1(niVar2.f31041r0);
                } else if (view.getTag() instanceof Integer) {
                    niVar2.V1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, niVar2.s1(), false, 0L);
                }
            } else if (view instanceof gi) {
                gi giVar = (gi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = giVar.f28890c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        gi1.a(niVar2.getContext(), new lh.y1(5, niVar2, giVar), null);
                    } else {
                        niVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    niVar2.V1.j1(giVar.f28889b);
                    niVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                qhVar.v0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > qhVar.getMeasuredWidth()) {
                qhVar.v0(i14 - qhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(ni niVar) {
        fi fiVar;
        lm lmVar;
        niVar.f31035p1 = null;
        fi fiVar2 = niVar.f31051u0;
        if (fiVar2 != niVar.f31005f0 && (fiVar = niVar.f31054v0) != (lmVar = niVar.m0) && fiVar2 != fiVar && fiVar2 != lmVar) {
            niVar.containerView.removeView(fiVar2);
        }
        niVar.f31051u0.setVisibility(8);
        niVar.f31051u0.q();
        niVar.f31054v0.E();
        niVar.f31051u0 = niVar.f31054v0;
        niVar.f31054v0 = null;
        int[] iArr = niVar.X1;
        iArr[0] = iArr[1];
        niVar.H1(niVar.Y, false);
        niVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (i10 == 3) {
            if (this.J1 || !a1()) {
                if (o2Var != null) {
                    activity = o2Var.getParentActivity();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 33) {
                        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (i11 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                B1(true);
            }
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(o2Var)) {
            if (this.f31020k0 == null) {
                bl blVar = new bl(this, getContext(), this.resourcesProvider, (this.D || this.N1) ? false : false);
                this.f31020k0 = blVar;
                this.f31045s0[5] = blVar;
                wk wkVar = this.f31036p2;
                if (wkVar != null) {
                    blVar.setDelegate(wkVar);
                } else if (o2Var instanceof org.telegram.ui.tn) {
                    blVar.setDelegate(new wg(this, 16));
                }
            }
            Q1(this.f31020k0);
        }
    }

    public final void B1(boolean z10) {
        if (!this.J1 && z10) {
            pn pnVar = new pn(3, getContext(), this.resourcesProvider, this);
            this.P = pnVar;
            Q1(pnVar);
        }
        int i10 = 1;
        if (this.f31011h0 == null) {
            yi yiVar = new yi(getContext(), this.resourcesProvider, this);
            this.f31011h0 = yiVar;
            this.f31045s0[3] = yiVar;
            yiVar.setupBlurredSearchField(this.C2);
            this.f31011h0.setDelegate(new wg(this, 13));
            if (this.D) {
                this.f31011h0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            TLRPC.Chat chat = ((org.telegram.ui.tn) o2Var).f42787e;
            yi yiVar2 = this.f31011h0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                i10 = -1;
            }
            yiVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.f31011h0);
        }
    }

    public final void C1() {
        if (this.f31028n0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            ?? fiVar = new fi(context, c6Var, this);
            fiVar.f27121r = AndroidUtilities.dp(80.0f);
            fiVar.f27123w = 3;
            jh.e1 e1Var = new jh.e1(fiVar, context, c6Var, 10);
            fiVar.f27120n = e1Var;
            wa waVar = new wa(fiVar, context);
            fiVar.v = waVar;
            e1Var.setAdapter(waVar);
            e1Var.setClipToPadding(false);
            e1Var.setItemAnimator(null);
            e1Var.setLayoutAnimation(null);
            e1Var.setVerticalScrollBarEnabled(false);
            e1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, fiVar.f28402a));
            fiVar.addView(e1Var, i7.f6.c(-1.0f, -1));
            e1Var.setOnScrollListener(new cg.g2(fiVar, 20));
            mh.k kVar = new mh.k(fiVar, fiVar.f27121r, 1);
            fiVar.f27122s = kVar;
            kVar.O = new ih.n5(fiVar, 4);
            e1Var.setLayoutManager(kVar);
            this.f31028n0 = fiVar;
            fiVar.setDelegate(new cb(this, 1));
        }
        Q1(this.f31028n0);
    }

    public final void D1() {
        boolean z10;
        if (!this.M1) {
            pn pnVar = new pn(5, getContext(), this.resourcesProvider, this);
            this.P = pnVar;
            Q1(pnVar);
        }
        if (this.f31008g0 == null) {
            sj sjVar = new sj(getContext(), this.resourcesProvider, this);
            this.f31008g0 = sjVar;
            this.f31045s0[2] = sjVar;
            sjVar.setupBlurredSearchField(this.C2);
            this.f31008g0.setDelegate(new zh(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            TLRPC.Chat chat = ((org.telegram.ui.tn) o2Var).f42787e;
            sj sjVar2 = this.f31008g0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            sjVar2.setMultipleSelectionAllowed(z10);
        }
        Q1(this.f31008g0);
    }

    public final void E1(boolean z10) {
        int i10;
        if (!this.G1 && z10) {
            pn pnVar = new pn(4, getContext(), this.resourcesProvider, this);
            this.P = pnVar;
            Q1(pnVar);
        }
        boolean z11 = false;
        if (this.f31023l0 == null) {
            if (this.J) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            jk jkVar = new jk(i10, getContext(), this.resourcesProvider, this);
            this.f31023l0 = jkVar;
            this.f31045s0[4] = jkVar;
            jkVar.setDelegate(new ai(this));
        }
        int i11 = 1;
        if (this.D) {
            this.f31023l0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
            if (o2Var instanceof org.telegram.ui.tn) {
                TLRPC.Chat chat = ((org.telegram.ui.tn) o2Var).f42787e;
                jk jkVar2 = this.f31023l0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                    i11 = -1;
                }
                jkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f31023l0.setMaxSelectedFiles(this.O1);
                jk jkVar3 = this.f31023l0;
                if (!this.J && !this.S) {
                    z11 = true;
                }
                jkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        jk jkVar4 = this.f31023l0;
        jkVar4.W = this.J;
        if (z10) {
            Q1(jkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        cg.m1 m1Var = this.T0;
        int i10 = 1;
        if (m1Var.f23612j0) {
            m1Var.h(true);
        }
        this.f31008g0 = null;
        this.f31031o0 = null;
        this.f31011h0 = null;
        this.f31014i0 = null;
        this.f31017j0 = null;
        this.f31020k0 = null;
        this.f31023l0 = null;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i10 < fiVarArr.length) {
                fi fiVar = fiVarArr[i10];
                if (fiVar != null) {
                    fiVar.m();
                    this.containerView.removeView(fiVarArr[i10]);
                    fiVarArr[i10] = null;
                }
                i10++;
            } else {
                T1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.E1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            TLRPC.Chat chat = tnVar.f42787e;
            if (tnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.F1).edit();
                edit.putBoolean("silent_" + tnVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f49506f) {
            this.E1 = true;
            this.V1.B1(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        fi fiVar = this.f31051u0;
        if (fiVar != null) {
            i12 = fiVar.getSelectedItemsCount();
        }
        return c5.b0(this.F1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ni niVar = ni.this;
                niVar.E1 = true;
                niVar.V1.B1(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f9;
        float f10;
        float measuredHeight;
        this.f30989b.a(z10, z11);
        au m12 = m1();
        this.Y = z10;
        au m13 = m1();
        int i11 = 0;
        if (this.f31069z0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        fi fiVar = this.f31051u0;
        if (fiVar != this.f31005f0 && fiVar != this.m0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.Y && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        bg.d1 d1Var = this.K0;
        sh shVar = this.f31066y0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            d1Var.setVisibility(i12);
            ViewPropertyAnimator animate = d1Var.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).setUpdateListener(new xg(this, 0)).withEndAction(new Runnable(this) {
                public final ni f35062b;

                {
                    this.f35062b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ni niVar = this.f35062b;
                            if (!z14 || !z12) {
                                niVar.K0.setVisibility(8);
                            }
                            niVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f35062b.f31066y0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            shVar.setVisibility(0);
            ViewPropertyAnimator animate2 = shVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = shVar.getMeasuredHeight();
            }
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(jrVar).setUpdateListener(new xg(this, 1)).withEndAction(new Runnable(this) {
                public final ni f35062b;

                {
                    this.f35062b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            ni niVar = this.f35062b;
                            if (!z14 || !z12) {
                                niVar.K0.setVisibility(8);
                            }
                            niVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f35062b.f31066y0.setVisibility(8);
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
            d1Var.setVisibility(i10);
            if (z14 && z12) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            d1Var.setAlpha(f9);
            b2();
            shVar.setAlpha((z14 || !z12) ? 0.0f : 0.0f);
            if (z14 || !z12) {
                f12 = shVar.getMeasuredHeight();
            }
            shVar.setTranslationY(f12);
            shVar.setVisibility((z14 || !z12) ? 8 : 8);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(y5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new zg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f31005f0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.D1 == messageObject && this.C1 == i10) {
            return;
        }
        this.D1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.D1.isMusic()) {
                i10 = 2;
            } else if (this.D1.isDocument()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        this.C1 = i10;
        if (this.D1 != null) {
            this.O1 = 1;
            this.P1 = false;
        } else {
            this.O1 = -1;
            this.P1 = true;
        }
        this.f31059w1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z10) {
        if (this.D1 != null) {
            return;
        }
        this.O1 = i10;
        this.P1 = z10;
    }

    public final void K1(float f9) {
        boolean z10 = false;
        int k9 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7), Math.min(255, Math.max(0, (int) (f9 * 255.0f))));
        this.navBarColor = k9;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k9, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void L1(String str) {
        boolean z10 = true;
        this.M0 = 1;
        this.B = true;
        this.O0 = false;
        this.I1 = false;
        this.f31049t1.setVisibility(8);
        this.f31006f1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
        if (chatAttachAlertPhotoLayout != null) {
            ni niVar = chatAttachAlertPhotoLayout.f28403b;
            chatAttachAlertPhotoLayout.f26262c1 = (niVar.M0 == 0 || niVar.B) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.M1(boolean):void");
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        fi fiVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            on onVar = this.f31014i0;
            if (onVar != null && ((fiVar = this.f31054v0) == onVar || this.f31051u0 == onVar)) {
                if (fiVar == onVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            on onVar2 = this.f31017j0;
            if (onVar2 != null) {
                fi fiVar2 = this.f31054v0;
                if (fiVar2 == onVar2 || this.f31051u0 == onVar2) {
                    if (fiVar2 != onVar2) {
                        i12 = 0;
                    }
                    a2(i12);
                }
            }
        } else if (i10 == 1) {
            e1();
        } else if (i10 == 3) {
            f1();
        } else if (i10 == 4) {
            f1();
        } else if (i10 == 5) {
            f1();
            yh yhVar = this.E0;
            if (yhVar != null) {
                yhVar.setEphemeralFactor(f9);
                yhVar.setSameWidthFactor(f9);
            }
        }
    }

    public final void N1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.tn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.tn) o2Var).f42787e)) {
            new tc(this.f31029n1, this.resourcesProvider).f(MessagesController.getInstance(this.F1).captionLengthLimitPremium, new z2(10, this, o2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f9;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        int i11;
        float f14;
        float f15;
        float f16;
        fi fiVar;
        float f17;
        float dp;
        long sendPaidMessagesStars;
        float f18;
        float f19;
        cg.m1 m1Var;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        this.f30993c.a(z10, true);
        ph phVar = this.f31069z0;
        if (phVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return false;
        }
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        phVar.setTag(num);
        th thVar = this.A0;
        if (thVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        thVar.k(true);
        this.L0.k(true);
        ph phVar2 = this.f31049t1;
        ph phVar3 = this.D0;
        if (z10) {
            if (!this.J) {
                phVar.setVisibility(0);
            }
            phVar3.setVisibility(0);
        } else if (this.O0) {
            phVar2.setVisibility(0);
        }
        fi fiVar2 = this.f31051u0;
        if ((fiVar2 == this.f31005f0 || fiVar2 == this.m0) && this.Y) {
            z13 = true;
        } else {
            z13 = false;
        }
        cg.m1 m1Var2 = this.T0;
        bg.d1 d1Var = this.K0;
        sh shVar = this.f31066y0;
        yh yhVar = this.E0;
        float f26 = 0.2f;
        float f27 = 1.0f;
        if (z11) {
            float f28 = 0.0f;
            this.I0 = new AnimatorSet();
            if (z13) {
                d1Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(phVar, property, f18));
            if (z10 && !z13) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(shVar, property, f19));
            if (z10 && !z13) {
                shVar.setVisibility(0);
                m1Var = m1Var2;
                arrayList.add(ObjectAnimator.ofFloat(shVar, View.TRANSLATION_Y, 0.0f));
            } else {
                m1Var = m1Var2;
            }
            if (z10 && z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(d1Var, property, f20));
            Property property2 = View.SCALE_X;
            if (z10) {
                f21 = 1.0f;
            } else {
                f21 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(phVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(phVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(phVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(yhVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(yhVar, property3, f26));
            if (m1Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(phVar, property4, f28));
            } else if (this.O0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(phVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(phVar2, property, f27));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xg(this, 4));
                arrayList.add(ofFloat);
            }
            this.I0.playTogether(arrayList);
            this.I0.setInterpolator(new DecelerateInterpolator());
            this.I0.setDuration(180L);
            this.I0.addListener(new org.telegram.ui.ActionBar.h(this, z10, z13, 3));
            this.I0.start();
            i10 = 0;
        } else {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            phVar.setAlpha(f9);
            if (z10 && z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            shVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                shVar.setVisibility(0);
                shVar.setTranslationY(0.0f);
            } else {
                i10 = 0;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.2f;
            }
            phVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            phVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            phVar3.setAlpha(f13);
            if (z10 && z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            d1Var.setVisibility(i11);
            if (z10 && z13) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            d1Var.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            yhVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            yhVar.setScaleY(f16);
            if (m1Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                phVar.setTranslationY(dp);
            } else if (this.O0 && ((fiVar = this.f31051u0) == null || fiVar.I())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                phVar2.setTranslationY(f17);
            }
            if (!z10) {
                phVar.setVisibility(4);
                phVar3.setVisibility(4);
            }
            if (z13) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f31051u0.getSelectedItemsCount());
        }
        yhVar.g(i10, z11);
        if (this.D1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1());
        }
        yhVar.i(j1() + this.f31051u0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) thVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), yhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            thVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(fi fiVar) {
        long j10 = this.S0;
        pn pnVar = this.P;
        if (fiVar == pnVar) {
            j10 = pnVar.f31715s;
        } else if (fiVar == this.f31005f0) {
            j10 = 1;
        } else if (fiVar == this.f31011h0) {
            j10 = 3;
        } else if (fiVar == this.f31023l0) {
            j10 = 4;
        } else if (fiVar == this.f31008g0) {
            j10 = 5;
        } else if (fiVar == this.f31020k0) {
            j10 = 6;
        } else if (fiVar == this.f31014i0) {
            j10 = 9;
        } else if (fiVar == this.f31028n0) {
            j10 = 10;
        } else if (fiVar == this.f31031o0) {
            j10 = 11;
        } else if (fiVar == this.f31017j0) {
            j10 = 12;
        } else if (fiVar == this.f31034p0) {
            j10 = 14;
        } else if (fiVar == this.f31037q0) {
            j10 = 13;
        } else if (fiVar == this.f31041r0) {
            j10 = 16;
        }
        R1(fiVar, j10, true);
    }

    public final void R1(fi fiVar, long j10, boolean z10) {
        boolean z11;
        int i10;
        yl ylVar;
        boolean z12;
        Integer num;
        yl ylVar2;
        int dp;
        int i11;
        int dp2;
        qh qhVar;
        boolean z13;
        if (this.f31035p1 == null && this.I0 == null) {
            fi fiVar2 = this.f31051u0;
            if (fiVar2 == fiVar) {
                fiVar2.F();
            } else if (fiVar == this.f31017j0 && !UserConfig.getInstance(this.F1).isPremium()) {
                new cg.p1(this.f30990b0, 39, false).show();
            } else {
                int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f31004f.a(z11, z10);
                this.f31027n.i(Long.valueOf(j10), z10);
                this.f31070z1 = false;
                this.f31063x1 = false;
                this.B1 = 0.0f;
                this.A1.setVisibility(8);
                RadialProgressView radialProgressView = this.f31067y1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                ph phVar = this.f31049t1;
                phVar.setAlpha(1.0f);
                phVar.setTranslationY(this.B1);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f31048t0;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((ph.n3) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.S0 = j10;
                qh qhVar2 = this.f31052u1;
                int childCount = qhVar2.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = qhVar2.getChildAt(i14);
                    if (childAt instanceof hi) {
                        hi hiVar = (hi) childAt;
                        qhVar = qhVar2;
                        if (hiVar.f29181b == hiVar.f29182c.S0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        hiVar.f29393a.e(z13, true);
                    } else {
                        qhVar = qhVar2;
                        if (childAt instanceof gi) {
                            ((gi) childAt).a(true);
                        }
                    }
                    i14++;
                    qhVar2 = qhVar;
                }
                int firstOffset = (this.f31051u0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.X1[0];
                this.f31054v0 = fiVar;
                fiVar.getClass();
                boolean z14 = fiVar instanceof th.p;
                ug.f fVar = this.f31042r1;
                if (fVar != null) {
                    if (z14) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp2);
                }
                rh rhVar = this.f31046s1;
                if (rhVar != null) {
                    if (z14) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    rhVar.setVisibility(i11);
                }
                if (this.f31054v0.h() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                cg.m1 m1Var = this.T0;
                m1Var.setVisibility(i10);
                if (m1Var.f23612j0) {
                    m1Var.h(true);
                }
                this.f31051u0.r();
                fi fiVar3 = this.f31054v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
                if (fiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f31054v0.D(this.f31051u0);
                this.f31054v0.setVisibility(0);
                if (fiVar.getParent() != null) {
                    this.containerView.removeView(this.f31054v0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.f31051u0);
                ViewParent parent = this.f31054v0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    fi fiVar4 = this.f31054v0;
                    if (fiVar4 != this.f31020k0) {
                        indexOfChild++;
                    }
                    viewGroup.addView(fiVar4, indexOfChild, i7.f6.c(-1.0f, -1));
                }
                zg zgVar = new zg(this, 3);
                fi fiVar5 = this.f31051u0;
                boolean z15 = fiVar5 instanceof lm;
                bi biVar = this.f30987a0;
                if (!z15 && !(this.f31054v0 instanceof lm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f31054v0.setAlpha(0.0f);
                        this.f31054v0.setTranslationY(AndroidUtilities.dp(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f31051u0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f31051u0, biVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(m1Var, View.ALPHA, m1Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(jr.f29800f);
                        animatorSet.addListener(new jh.l3(this, firstOffset, zgVar, 1));
                        this.f31035p1 = animatorSet;
                        fi fiVar6 = this.f31051u0;
                        biVar.getClass();
                        biVar.b(fiVar6, 0.0f);
                        animatorSet.start();
                    } else {
                        fiVar5.setAlpha(0.0f);
                        zgVar.run();
                        a2(0);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.f31054v0.getWidth(), this.f31051u0.getWidth());
                    fi fiVar7 = this.f31054v0;
                    if (fiVar7 instanceof lm) {
                        fiVar7.setTranslationX(max);
                        fi fiVar8 = this.f31051u0;
                        if ((fiVar8 instanceof ChatAttachAlertPhotoLayout) && (ylVar2 = ((ChatAttachAlertPhotoLayout) fiVar8).L) != null) {
                            ylVar2.setVisibility(4);
                        }
                    } else {
                        this.f31051u0.setTranslationX(-max);
                        fi fiVar9 = this.f31054v0;
                        if (fiVar9 == chatAttachAlertPhotoLayout && (ylVar = ((ChatAttachAlertPhotoLayout) fiVar9).L) != null) {
                            ylVar.setVisibility(0);
                        }
                    }
                    this.f31054v0.setAlpha(1.0f);
                    this.f31051u0.setAlpha(1.0f);
                    if (z10) {
                        fi fiVar10 = this.f31051u0;
                        biVar.getClass();
                        biVar.b(fiVar10, 0.0f);
                        AndroidUtilities.runOnUIThread(new g(this, fiVar, zgVar, 6));
                    } else {
                        if (this.f31054v0.getCurrentItemTop() <= fiVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f31051u0.s(1.0f);
                        this.f31054v0.s(1.0f);
                        this.f31051u0.k(this.f31013h2);
                        this.f31054v0.k(this.f31013h2);
                        this.containerView.invalidate();
                        fi fiVar11 = this.f31051u0;
                        biVar.getClass();
                        biVar.b(fiVar11, 1.0f);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        m1Var.setTag(num);
                        zgVar.run();
                    }
                }
                if (this.f31016i2 && !(fiVar instanceof ph.n3)) {
                    this.f31016i2 = false;
                    m1Var.e();
                    m1Var.invalidate();
                    u1();
                }
                if (i12 != 0 && j10 != 6 && !(fiVar instanceof ph.n3)) {
                    if (j10 == 4) {
                        dp = AndroidUtilities.dp(84.0f);
                    } else {
                        dp = 0;
                    }
                } else {
                    dp = AndroidUtilities.dp(46.0f);
                }
                m1Var.setForcedMenuWidth(dp);
            }
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        ni niVar;
        if (this.f31014i0 == null) {
            niVar = this;
            on onVar = new on(niVar, getContext(), false, this.resourcesProvider, bool);
            niVar.f31014i0 = onVar;
            niVar.f31045s0[1] = onVar;
            onVar.setDelegate(new wg(this, 15));
        } else {
            niVar = this;
        }
        R1(niVar.f31014i0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f9;
        float f10;
        fi fiVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.d.a(z10, z11);
        cg.m1 m1Var = this.T0;
        if ((z10 && m1Var.getTag() == null) || (!z10 && m1Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            m1Var.setTag(num);
            AnimatorSet animatorSet = this.U0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.U0 = null;
            }
            if (!this.B && !this.P0 && ((this.M0 != 0 || !this.f31025m1) && this.f31051u0 == this.f31005f0 && (this.H1 || this.I1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f31051u0 == this.P) {
                z12 = false;
            }
            ph phVar = this.f31049t1;
            org.telegram.ui.ActionBar.w0 w0Var = this.W0;
            if (z10) {
                if (z12) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.O0 && this.f31069z0.getTag() == null) {
                phVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
            if (o2Var != null) {
                if (z10) {
                    if (this.f30999d2) {
                        i10 = org.telegram.ui.ActionBar.g6.f23356tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23133h5;
                    }
                    if (i0.a.f(getThemedColor(i10)) > 0.699999988079071d) {
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
                this.U0 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - m1Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(m1Var, property, f12));
                if (z12) {
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f15));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property2, f13));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property3, f14));
                }
                this.U0.playTogether(arrayList);
                this.U0.addListener(new z9(2, this, z10));
                this.U0.setInterpolator(jr.h);
                this.U0.setDuration(380L);
                this.U0.start();
                return;
            }
            if (z10 && this.O0 && ((fiVar = this.f31051u0) == null || fiVar.I())) {
                phVar.setVisibility(4);
            }
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            m1Var.setAlpha(f9);
            if (z12) {
                if (z10) {
                    f15 = 1.0f;
                }
                w0Var.setAlpha(f15);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                w0Var.setScaleX(f10);
                if (z10) {
                    f14 = 1.0f;
                }
                w0Var.setScaleY(f14);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f30988a1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.M0 != 0 || !this.f31025m1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.C0;
        th thVar = this.A0;
        thVar.getLocationOnScreen(iArr);
        if (this.f31064x2 != null) {
            fi fiVar = this.f31051u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
            if ((fiVar == chatAttachAlertPhotoLayout || fiVar == this.m0) && this.Y) {
                bg.d1 d1Var = this.K0;
                alpha = (d1Var.getAlpha() * d1Var.getMeasuredHeight()) + (d1Var.getY() - this.f31064x2.getTop());
            } else {
                alpha = -thVar.getHeight();
            }
            if (Math.abs(this.f31064x2.getTranslationY() - alpha) > 0.5f) {
                this.f31064x2.setTranslationY(alpha);
                this.f31064x2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        g1();
    }

    public final void V1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f9;
        float f10;
        float f11;
        fi fiVar = this.f31051u0;
        int i10 = 0;
        if (fiVar == null) {
            g10 = false;
        } else {
            g10 = fiVar.g();
        }
        cg.s0 s0Var = this.f30991b1;
        s0Var.setEnabled(g10);
        fi fiVar2 = this.f31051u0;
        float f12 = 0.5f;
        if (fiVar2 != null) {
            if (fiVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f31054v0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.Z;
            }
            f9 = (f10 * f11) + 0.0f;
        } else {
            f9 = 0.0f;
        }
        fi fiVar3 = this.f31054v0;
        if (fiVar3 != null) {
            if (fiVar3.g()) {
                f12 = 1.0f;
            }
            f9 = com.google.android.recaptcha.internal.a.z(1.0f, this.Z, f12, f9);
        }
        this.f30995c1 = f9;
        if (s0Var != null) {
            float f13 = f9 * this.f30998d1;
            s0Var.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            s0Var.setVisibility(i10);
        }
    }

    public final void X1(fi fiVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (fiVar != null) {
            lg.e eVar = this.f31068y2;
            if (eVar != null && Build.VERSION.SDK_INT >= 31) {
                eVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = fiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (fiVar == this.f31051u0 && currentItemTop <= fiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N = z10;
                if (fiVar == this.f31051u0) {
                    T1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int C = org.telegram.ui.b.C(11.0f, i11, currentItemTop);
                fi fiVar2 = this.f31051u0;
                if (fiVar2 == fiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((fiVar2 instanceof lm) || (this.f31054v0 instanceof lm)) {
                    Object obj = this.f31035p1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f19039f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.X1;
                int i13 = iArr[i12];
                if (i13 == C && !z11) {
                    if (i10 != 0) {
                        this.Y1 = i13;
                        return;
                    }
                    return;
                }
                this.Y1 = i13;
                iArr[i12] = C;
                a2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f26882a.length() <= 0) {
            return;
        }
        this.f31051u0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        nh.u uVar;
        boolean z11;
        float f9;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.X0) != null) {
            int i10 = 0;
            if (this.f31025m1 && this.f31001e0 && this.f31051u0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f18700f = z12;
            if (!z10) {
                ((d6) uVar.f18701g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.Y0;
            if (z10 && this.f31025m1) {
                w0Var.setVisibility(0);
                ViewPropertyAnimator animate = w0Var.animate();
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(jr.h).withEndAction(new ih(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
            if (z11) {
                f11 = 1.0f;
            }
            w0Var.setAlpha(f11);
            if (z11) {
                f9 = 1.0f;
            } else {
                f9 = 0.6f;
            }
            w0Var.setScaleX(f9);
            if (z11) {
                f12 = 1.0f;
            }
            w0Var.setScaleY(f12);
        }
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.Z0():void");
    }

    public final void Z1(boolean z10) {
        boolean z11;
        float f9;
        fi fiVar = this.f31005f0;
        if (z10) {
            if (!this.I) {
                return;
            }
            if (this.m0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.f31040r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                ?? fiVar2 = new fi(context, c6Var, this);
                fiVar2.f30376y = 0.0f;
                fiVar2.A = 0.0f;
                fiVar2.B = 0.0f;
                fiVar2.C = 0.0f;
                fiVar2.D = 0.0f;
                fiVar2.E = 0.0f;
                fiVar2.F = null;
                fiVar2.G = false;
                fiVar2.I = 0.0f;
                fiVar2.M = false;
                fiVar2.O = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fiVar2.P = z11;
                fiVar2.f30371n = c6Var;
                fiVar2.f28406f = true;
                fiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.a0 n10 = fiVar2.f28403b.T0.n();
                TextView textView = new TextView(context);
                fiVar2.f30375x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = fiVar2.f28402a;
                tl tlVar = new tl(fiVar2, context, n10, c6Var2, 1);
                cg.m1 m1Var = fiVar2.f28403b.T0;
                if (AndroidUtilities.isTablet()) {
                    f9 = 64.0f;
                } else {
                    f9 = 56.0f;
                }
                m1Var.addView(tlVar, 0, i7.f6.d(-2, -1.0f, 51, f9, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                tlVar.addView(textView, i7.f6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                jh.e1 e1Var = new jh.e1(fiVar2, context, c6Var2, 13);
                fiVar2.f30372r = e1Var;
                e1Var.setAdapter(new org.telegram.ui.u7(fiVar2, 3));
                f2.j0 j0Var = new f2.j0(1, false);
                fiVar2.f30373s = j0Var;
                e1Var.setLayoutManager(j0Var);
                e1Var.setClipChildren(false);
                e1Var.setClipToPadding(false);
                e1Var.setOverScrollMode(2);
                e1Var.setVerticalScrollBarEnabled(false);
                km kmVar = new km(fiVar2, context);
                fiVar2.v = kmVar;
                kmVar.setClipToPadding(true);
                kmVar.setClipChildren(true);
                fiVar2.addView(e1Var, i7.f6.c(-1.0f, -1));
                fiVar2.L = fiVar2.f28403b.f31005f0;
                kmVar.f30098c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fiVar2.L;
                kmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                kmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                kmVar.c();
                UndoView undoView = new UndoView(context, null, false, fiVar2.f28403b.f31040r);
                fiVar2.f30374w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                fiVar2.addView(undoView, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                fiVar2.J = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.m0 = fiVar2;
                fiVar2.bringToFront();
            }
            fi fiVar3 = this.f31051u0;
            lm lmVar = this.m0;
            if (fiVar3 != lmVar) {
                fiVar = lmVar;
            }
            Q1(fiVar);
            return;
        }
        Q1(fiVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ChatActivityEnterView.H(this.F1, ((org.telegram.ui.tn) o2Var).a(), o2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f31029n1.invalidate();
        bg.d1 d1Var = this.K0;
        d1Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
        if (chatAttachAlertPhotoLayout != null) {
            ol olVar = chatAttachAlertPhotoLayout.A;
            chatAttachAlertPhotoLayout.V();
            if (olVar != null && olVar.getFastScroll() != null) {
                sk0 fastScroll = olVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1;
                if (this.Y) {
                    i10 = (int) (d1Var.getAlpha() * d1Var.getMeasuredHeight());
                }
                fastScroll.f32670d0 = currentActionBarHeight + i10;
                olVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
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
        qh qhVar = this.f31052u1;
        if (qhVar == null) {
            return;
        }
        int childCount = qhVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            qhVar.getChildAt(i20);
        }
        boolean z11 = this.f30999d2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        this.f31006f1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        this.f31021k1.setTextColor(getThemedColor(i11));
        this.f30991b1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.w0 w0Var = this.W0;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.g6.f23161ig;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.I5;
        }
        org.telegram.ui.ActionBar.g6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.g6.E8;
        w0Var.G(getThemedColor(i21), false);
        w0Var.G(getThemedColor(i21), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Y0;
        if (w0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.g6.f23143hg;
            } else {
                i19 = org.telegram.ui.ActionBar.g6.f23169j5;
            }
            w0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f30988a1;
        if (w0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.g6.f23143hg;
            } else {
                i17 = org.telegram.ui.ActionBar.g6.f23169j5;
            }
            w0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = w0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.g6.f23161ig;
            } else {
                i18 = org.telegram.ui.ActionBar.g6.I5;
            }
            org.telegram.ui.ActionBar.g6.w1(getThemedColor(i18), background2);
        }
        th thVar = this.A0;
        org.telegram.ui.ActionBar.c6 c6Var = thVar.I;
        vt vtVar = thVar.f26882a;
        int i22 = thVar.H;
        if (i22 == 0) {
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            int i23 = org.telegram.ui.ActionBar.g6.G6;
            vtVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i23, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i23, c6Var));
        } else if (i22 != 2 && i22 != 3) {
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23345t5, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        } else {
            vtVar.setHintTextColor(-1929379841);
            vtVar.setTextColor(-1);
            vtVar.setCursorColor(-1);
            vtVar.setHandlesColor(-1);
            vtVar.setHighlightColor(822083583);
            vtVar.quoteColor = -1;
        }
        thVar.f26884c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        wt wtVar = thVar.d;
        if (wtVar != null) {
            wtVar.U();
        }
        qhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i14 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        int themedColor2 = getThemedColor(i14);
        cg.m1 m1Var = this.T0;
        m1Var.C(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.g6.f23161ig;
        } else {
            i15 = org.telegram.ui.ActionBar.g6.I5;
        }
        m1Var.B(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i16 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        m1Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(q12, this.shadowDrawable);
        qg.c cVar = this.B2;
        if (cVar.f46667a.getColor() != q12) {
            cVar.a(q12);
            ug.f fVar = this.f31042r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            rh rhVar = this.f31046s1;
            if (rhVar != null) {
                rhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i24 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i24];
            if (fiVar != null) {
                fiVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23151i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f31051u0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f31024l2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f31026m2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
                return;
            }
            return;
        }
        ki kiVar = this.f31059w1;
        if (kiVar != null) {
            kiVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        if (z10) {
            this.f31060w2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        li liVar = this.V1;
        if (liVar != null) {
            liVar.x0(new zg(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f31051u0.o(i10);
    }

    public final void e1() {
        float f9 = this.f30993c.f49505e;
        float f10 = (1.0f - this.f30989b.f49505e) * f9;
        this.f31046s1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f9) * (1.0f - this.d.f49505e))), 1.0f - f10));
    }

    public final void f1() {
        float f9;
        float f10 = this.f31000e.f49505e;
        float f11 = this.f31004f.f49505e;
        float b10 = jf.l0.b(this.h.f49505e);
        if (this.N1) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        u10.d(this.B0, com.google.android.recaptcha.internal.a.C(f10, f11, b10, f9));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        yh yhVar = this.E0;
        ph phVar = this.D0;
        bg.d1 d1Var = this.K0;
        if (d1Var != null && d1Var.getVisibility() == 0 && d1Var.getAlpha() != 0.0f) {
            float f9 = this.f30989b.f49505e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f9));
            yhVar.setAlpha(abs * abs * abs * abs);
            phVar.setTranslationY(AndroidUtilities.lerp(this.f30996c2, ((d1Var.getTranslationY() + d1Var.getTop()) - phVar.getTop()) + AndroidUtilities.dp(8.0f), jr.f29803j.getInterpolation(f9)));
            return;
        }
        phVar.setTranslationY(this.f30996c2);
        yhVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i10 < fiVarArr.length) {
                fi fiVar = fiVarArr[i10];
                if (fiVar != null && (themeDescriptions = fiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23151i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.O0 = true;
        this.f31049t1.setVisibility(0);
        this.D = true;
        this.E = i10;
        this.M0 = 0;
        this.B = false;
        this.C = false;
        this.F = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f31009g1;
        if (w0Var != null) {
            this.f31006f1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(nh.t4 t4Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f31006f1;
        textView.setText(string);
        this.O0 = false;
        this.f31049t1.setVisibility(8);
        this.M0 = 1;
        this.B = true;
        this.C = true;
        this.f31001e0 = false;
        this.F = t4Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.f31009g1;
        if (w0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            w0Var.setVisibility(0);
            w0Var.setClickable(true);
            w0Var.setAlpha(1.0f);
            w0Var.setScaleX(1.0f);
            w0Var.setScaleY(1.0f);
        }
    }

    public final int j1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if ((o2Var instanceof org.telegram.ui.tn) && (messagePreviewParams = ((org.telegram.ui.tn) o2Var).f42755b5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).f42787e;
        }
        return MessagesController.getInstance(this.F1).getChat(Long.valueOf(-this.V));
    }

    public final float l1() {
        ph phVar = this.f31069z0;
        float alpha = 1.0f - phVar.getAlpha();
        return phVar.getMeasuredHeight() - (alpha * (phVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final au m1() {
        fi fiVar;
        if (this.Y && ((fiVar = this.f31051u0) == this.f31005f0 || fiVar == this.m0)) {
            return this.L0;
        }
        return this.A0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).a();
        }
        return this.V;
    }

    public final int o1() {
        fi fiVar = this.f31051u0;
        on onVar = this.f31014i0;
        if (fiVar == onVar && onVar.A != null) {
            return onVar.getEmojiPadding();
        }
        on onVar2 = this.f31017j0;
        if (fiVar == onVar2 && onVar2.A != null) {
            return onVar2.getEmojiPadding();
        }
        if (this.Y) {
            return this.L0.getEmojiPadding();
        }
        return this.A0.getEmojiPadding();
    }

    @Override
    public final void onBackPressed() {
        if (this.O.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        cg.m1 m1Var = this.T0;
        if (m1Var.f23612j0) {
            m1Var.h(true);
        } else if (this.f31051u0.i()) {
        } else {
            if (m1() != null && m1().f26885e) {
                m1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f31051u0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
        u81 u81Var = chatAttachAlertPhotoLayout.f26271h0;
        bg.x2 x2Var = chatAttachAlertPhotoLayout.f26267f0;
        TextView textView = chatAttachAlertPhotoLayout.f26279l0;
        ol olVar = chatAttachAlertPhotoLayout.f26285r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == x2Var) {
            if (z10) {
                if (olVar.getVisibility() == 0) {
                    x2Var.layout(0, org.telegram.messenger.x3.B(222.0f, i13, i16), i14, org.telegram.messenger.x3.B(96.0f, i13, i16));
                    return true;
                }
                x2Var.layout(0, org.telegram.messenger.x3.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (olVar.getVisibility() == 0) {
                x2Var.layout(org.telegram.messenger.x3.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                x2Var.layout(org.telegram.messenger.x3.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == u81Var) {
            if (z10) {
                if (olVar.getVisibility() == 0) {
                    u81Var.layout(0, org.telegram.messenger.x3.B(310.0f, i13, i16), i14, org.telegram.messenger.x3.B(260.0f, i13, i16));
                    return true;
                }
                u81Var.layout(0, org.telegram.messenger.x3.B(176.0f, i13, i16), i14, org.telegram.messenger.x3.B(126.0f, i13, i16));
                return true;
            } else if (olVar.getVisibility() == 0) {
                u81Var.layout(org.telegram.messenger.x3.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                u81Var.layout(org.telegram.messenger.x3.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (olVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (olVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != olVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.x3.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
        cm cmVar = chatAttachAlertPhotoLayout.v;
        ol olVar = chatAttachAlertPhotoLayout.f26285r;
        org.telegram.ui.k kVar = chatAttachAlertPhotoLayout.f26287s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        yl ylVar = chatAttachAlertPhotoLayout.L;
        if (view == ylVar) {
            if (chatAttachAlertPhotoLayout.U && !chatAttachAlertPhotoLayout.W) {
                ylVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            bg.x2 x2Var = chatAttachAlertPhotoLayout.f26267f0;
            if (view == x2Var) {
                if (z10) {
                    x2Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                x2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            u81 u81Var = chatAttachAlertPhotoLayout.f26271h0;
            if (view == u81Var) {
                if (z10) {
                    u81Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                u81Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == olVar) {
                chatAttachAlertPhotoLayout.F0 = true;
                if (z10) {
                    olVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (kVar.f6362o != 0) {
                        olVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        kVar.j1(0);
                        cmVar.l();
                    }
                } else {
                    olVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (kVar.f6362o != 1) {
                        olVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        kVar.j1(1);
                        cmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.F0 = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        int i10;
        this.f31005f0.setTranslationX(0.0f);
        this.f31018j1.setAlpha(0.0f);
        this.f31012h1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31026m2 = animatorSet;
        bi biVar = this.f31022k2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, biVar, 0.0f, 400.0f));
        this.f31026m2.setDuration(400L);
        this.f31026m2.setStartDelay(20L);
        biVar.set(this, Float.valueOf(0.0f));
        this.f31026m2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new xg(this, 2));
        o1.k kVar = this.f31024l2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.i.f19028n, 0.0f);
        this.f31024l2 = kVar2;
        if (this.D1 != null) {
            kVar2.f19045u.a(0.75f);
            this.f31024l2.f19045u.b(350.0f);
        } else {
            kVar2.f19045u.a(0.75f);
            this.f31024l2.f19045u.b(350.0f);
        }
        this.f31024l2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.e3 e3Var = this.backDrawable;
        p6 p6Var = r6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(e3Var, p6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        g gVar = new g(this, animationNotificationsLocker, this.delegate, 5);
        this.f31024l2.a(new pb(1, this, gVar));
        this.currentSheetAnimation.addListener(new bg.c3(23, this, gVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new xg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(jr.f29800f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f31051u0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f31051u0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f30990b0 instanceof org.telegram.ui.tn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f31051u0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f31032o1 = true;
        if (!this.I1 && !this.H1) {
            a1();
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
            ((LaunchActivity) context).f35607x0.add(this.O);
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
            ((LaunchActivity) context).f35607x0.remove(this.O);
        }
    }

    public final int p1(int i10) {
        fi fiVar = this.f31054v0;
        int[] iArr = this.X1;
        if (fiVar != null && ((this.f31051u0 instanceof lm) || (fiVar instanceof lm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.Z);
        }
        return iArr[i10];
    }

    public final int q1(boolean z10) {
        boolean q6;
        int i10;
        cg.m1 m1Var;
        if (this.f30999d2) {
            return getThemedColor(org.telegram.ui.ActionBar.g6.f23356tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        Iterator it = this.f31027n.iterator();
        float f9 = 0.0f;
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            long longValue = ((Long) fVar.f49514a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f9 += fVar.c();
            }
        }
        float a2 = i7.w.a(f9, 0.0f, 1.0f);
        if (z10 && (m1Var = this.T0) != null && m1Var.getVisibility() == 0) {
            a2 *= 1.0f - m1Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23151i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni.r1():void");
    }

    public final boolean s1() {
        if (this.Y) {
            fi fiVar = this.f31051u0;
            if (fiVar == this.f31005f0 || fiVar == this.m0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        fi fiVar = this.f31051u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31005f0;
        if (fiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f26266e1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.E1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            this.calcMandatoryInsets = ((org.telegram.ui.tn) o2Var).x9();
        }
        W1();
        this.f31032o1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k9 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7), 0);
            this.navBarColor = k9;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k9, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f31016i2) {
            this.f31016i2 = false;
            cg.m1 m1Var = this.T0;
            m1Var.e();
            m1Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        li liVar = this.V1;
        if (liVar != null && !this.f31038q1) {
            boolean a02 = liVar.a0();
            this.f31038q1 = true;
            jh.r5 r5Var = new jh.r5(this, editTextBoldCursor, z10, 15);
            if (a02) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(r5Var, j10);
        }
    }

    public final void u1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int q12 = q1(false);
            org.telegram.ui.ActionBar.g6.w1(q12, this.shadowDrawable);
            qg.c cVar = this.B2;
            if (cVar.f46667a.getColor() != q12) {
                cVar.a(q12);
                ug.f fVar = this.f31042r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                rh rhVar = this.f31046s1;
                if (rhVar != null) {
                    rhVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i10 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                fiVar.m();
            }
            i10++;
        }
        int i11 = this.F1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.R = true;
        th thVar = this.A0;
        if (thVar != null) {
            thVar.o();
        }
        wh whVar = this.L0;
        if (whVar != null) {
            whVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName;
        if (tL_attachMenuBot != null) {
            userName = tL_attachMenuBot.short_name;
        } else {
            userName = UserObject.getUserName(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.f22539id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        c2Var.P = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 20));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i10 < fiVarArr.length) {
                fi fiVar = fiVarArr[i10];
                if (fiVar != null) {
                    fiVar.x();
                }
                i10++;
            } else {
                this.f30992b2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f30992b2 = false;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i10 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                fiVar.A();
            }
            i10++;
        }
        if (isShowing()) {
            this.V1.a0();
        }
        ki kiVar = this.f31059w1;
        if (kiVar != null) {
            kiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.D1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        int i10 = this.F1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.D1.getDialogId()) && (o2Var instanceof org.telegram.ui.tn)) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            MessageSuggestionParams messageSuggestionParams = tnVar.f42768c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.D1.messageOwner.suggested_post);
            }
            if (!jh.s7.U(i10, messageSuggestionParams.amount)) {
                tnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.G - this.H < 0) {
            AndroidUtilities.shakeView(this.f31044s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.E0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.H) {
                O1(o2Var);
                return;
            }
            return;
        }
        if (this.D1 == null && (o2Var instanceof org.telegram.ui.tn)) {
            org.telegram.ui.tn tnVar2 = (org.telegram.ui.tn) o2Var;
            if (tnVar2.c()) {
                c5.M(getContext(), tnVar2.a(), new wg(this, 12), this.resourcesProvider);
                return;
            }
        }
        fi fiVar = this.f31051u0;
        if (fiVar != this.f31005f0 && fiVar != this.m0) {
            if (!fiVar.H(0, true, 0, s1(), this.J0)) {
                this.f31060w2 = true;
                dismiss();
                return;
            }
            return;
        }
        G1(0, true, 0, s1(), this.J0);
    }

    @Override
    public final void dismiss() {
        if (this.f31051u0.n() || isDismissed()) {
            return;
        }
        th thVar = this.A0;
        if (thVar != null) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        wh whVar = this.L0;
        if (whVar != null) {
            AndroidUtilities.hideKeyboard(whVar.getEditText());
        }
        this.f31048t0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.f30990b0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.f31060w2 && o2Var != null && this.f31051u0.getSelectedItemsCount() > 0 && !this.B) {
            if (this.f31056v2) {
                return;
            }
            this.f31056v2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new wg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22714a.setOnCancelListener(new ch(this, 0));
            d1 d1Var = new d1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.J = d1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.f31045s0;
            if (i10 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null && this.f31051u0 != fiVar) {
                fiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7), 0), true, (AndroidUtilities.IntColorCallback) new wg(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.f31003e2 = false;
        super.dismiss();
        this.f31060w2 = false;
    }

    @Override
    public final void z(float f9, int i10) {
    }

    public ni(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}
