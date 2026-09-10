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
import org.telegram.ui.qj1;
public class yi extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b3, le.d {
    public static final int O2 = 0;
    public final bh.d A0;
    public final vi A1;
    public boolean A2;
    public final bh.d B0;
    public boolean B1;
    public bi.k B2;
    public final gg.j C0;
    public final RadialProgressView C1;
    public final zg.e C2;
    public final ai D0;
    public boolean D1;
    public final eh.d D2;
    public final k0 E;
    public final di E0;
    public final o6 E1;
    public final eh.d E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final eh.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final zg.a G2;
    public boolean H;
    public final ai H0;
    public MessageObject H1;
    public final zg.a H2;
    public int I;
    public final ii I0;
    public boolean I1;
    public final nh I2;
    public Utilities.Callback2 J;
    public final TextPaint J0;
    public final int J1;
    public final ArrayList J2;
    public int K;
    public final RectF K0;
    public boolean K1;
    public final RectF K2;
    public int L;
    public final Paint L0;
    public boolean L1;
    public final RectF L2;
    public boolean M;
    public AnimatorSet M0;
    public boolean M1;
    public final RectF M2;
    public boolean N;
    public long N0;
    public boolean N1;
    public final ArrayList N2;
    public boolean O;
    public final bi.n7 O0;
    public boolean O1;
    public boolean P;
    public final gi P0;
    public boolean P1;
    public c50 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public ut R0;
    public boolean R1;
    public final be0 S;
    public boolean S0;
    public int S1;
    public ao T;
    public boolean T0;
    public boolean T1;
    public e50 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public kk X;
    public final y7 X0;
    public ValueAnimator X1;
    public gj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public wi Z1;
    public boolean f29349a0;
    public final org.telegram.ui.ActionBar.w0 f29350a1;
    public ln a2;
    public final le.b f29351b;
    public final zg.b f29352b0;
    public final bi.y f29353b1;
    public final int[] f29354b2;
    public final le.b f29355c;
    public boolean f29356c0;
    public final org.telegram.ui.ActionBar.w0 f29357c1;
    public int f29358c2;
    public final le.b d;
    public float f29359d0;
    public bi.x4 f29360d1;
    public float f29361d2;
    public final le.b e;
    public final mi f29362e0;
    public final org.telegram.ui.ActionBar.w0 f29363e1;
    public float f29364e2;
    public final le.b f29365f;
    public final org.telegram.ui.ActionBar.p2 f29366f0;
    public final ai.t f29367f1;
    public boolean f29368f2;
    public final boolean f29369g0;
    public float f29370g1;
    public float f29371g2;
    public final le.b h;
    public of f29372h0;
    public float f29373h1;
    public final boolean f29374h2;
    public boolean f29375i0;
    public final ai f29376i1;
    public boolean f29377i2;
    public final ChatAttachAlertPhotoLayout f29378j0;
    public final TextView f29379j1;
    public final ArrayList f29380j2;
    public bk f29381k0;
    public final org.telegram.ui.ActionBar.w0 f29382k1;
    public final Rect f29383k2;
    public jj f29384l0;
    public final LinearLayout l1;
    public float f29385l2;
    public zn m0;
    public final ImageView f29386m1;
    public boolean f29387m2;
    public final le.l f29388n;
    public zn f29389n0;
    public final LinearLayout f29390n1;
    public int f29391n2;
    public ll f29392o0;
    public final TextView f29393o1;
    public final mi f29394o2;
    public tk f29395p0;
    public float f29396p1;
    public o1.k f29397p2;
    public xm f29398q0;
    public boolean f29399q1;
    public AnimatorSet f29400q2;
    public org.telegram.ui.bo f29401r;
    public mj f29402r0;
    public final oi f29403r1;
    public boolean f29404r2;
    public final o6 f29405s;
    public gg.n0 f29406s0;
    public boolean f29407s1;
    public boolean f29408s2;
    public uk f29409t0;
    public Object f29410t1;
    public gl f29411t2;
    public uk f29412u0;
    public boolean f29413u1;
    public boolean f29414u2;
    public final o6 v;
    public hi.s f29415v0;
    public final ih.f f29416v1;
    public boolean f29417v2;
    public final ImageView f29418w;
    public final qi[] f29419w0;
    public final ci f29420w1;
    public File f29421w2;
    public final k0 f29422x;
    public final LongSparseArray f29423x0;
    public final ai f29424x1;
    public double[] f29425x2;
    public final ImageView f29426y;
    public qi f29427y0;
    public final bi f29428y1;
    public boolean f29429y2;
    public qi f29430z0;
    public final s4.c0 f29431z1;
    public boolean f29432z2;

    public yi(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        TextPaint textPaint;
        float f7;
        ai.t tVar;
        wr wrVar = wr.h;
        this.f29351b = new le.b(0, this, wrVar, 380L, false);
        this.f29355c = new le.b(1, this, wrVar, 380L, false);
        this.d = new le.b(2, this, wrVar, 380L, false);
        this.e = new le.b(3, this, wrVar, 380L, false);
        this.f29365f = new le.b(4, this, wrVar, 380L, true);
        this.h = new le.b(5, this, wrVar, 320L, false);
        le.l lVar = new le.l(new gh(this, 1), wrVar, 380L);
        this.f29388n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f29359d0 = 0.0f;
        this.f29362e0 = new mi(this, 0);
        this.f29375i0 = false;
        qi[] qiVarArr = new qi[11];
        this.f29419w0 = qiVarArr;
        this.f29423x0 = new LongSparseArray();
        this.G0 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.J0 = textPaint2;
        this.K0 = new RectF();
        this.L0 = new Paint(1);
        this.U0 = true;
        this.V0 = 1.0f;
        this.B1 = false;
        this.D1 = false;
        int i10 = UserConfig.selectedAccount;
        this.J1 = i10;
        this.K1 = true;
        this.L1 = true;
        this.M1 = true;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.S1 = -1;
        this.T1 = true;
        this.Y1 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.f29354b2 = new int[2];
        new Paint(1);
        this.f29377i2 = false;
        ArrayList arrayList = new ArrayList();
        this.f29380j2 = arrayList;
        Rect rect = new Rect();
        this.f29383k2 = rect;
        this.f29394o2 = new mi(this, 1);
        this.f29404r2 = true;
        this.f29408s2 = false;
        this.f29432z2 = false;
        this.A2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.J2 = arrayList2;
        RectF rectF = new RectF();
        this.K2 = rectF;
        RectF rectF2 = new RectF();
        this.L2 = rectF2;
        RectF rectF3 = new RectF();
        this.M2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.N2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        eh.c cVar = new eh.c();
        this.F2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C2 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.E2 = dVar;
            dVar.j(new l2.g(this, 7));
            eh.d dVar2 = new eh.d(null);
            this.D2 = dVar2;
            dVar2.j(new l2.h(this, 9));
            zg.a aVar = new zg.a(dVar);
            this.G2 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
            zg.a aVar2 = new zg.a(dVar2);
            this.H2 = aVar2;
            aVar2.f48083f = LiteMode.isEnabled(262144);
        } else {
            this.C2 = null;
            this.D2 = null;
            this.E2 = null;
            this.G2 = new zg.a(cVar);
            this.H2 = new zg.a(cVar);
        }
        zg.a aVar3 = new zg.a(cVar);
        this.I2 = new nh(this, 0);
        this.f29374h2 = z10;
        this.f29369g0 = (p2Var instanceof org.telegram.ui.eo) && p2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f29366f0 = p2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        oi oiVar = new oi(this, context);
        this.f29403r1 = oiVar;
        oiVar.setDelegate(new pi(this));
        this.containerView = oiVar;
        oiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        y7 y7Var = new y7(this, context, f6Var, 1);
        this.X0 = y7Var;
        y7Var.S0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        y7Var.C(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.j6.I5;
        y7Var.A(getThemedColor(i13), false);
        y7Var.setTitleColor(getThemedColor(i12));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 8));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
        this.f29350a1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new gh(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
        this.f29357c1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        bi.y yVar = new bi.y();
        this.f29353b1 = yVar;
        w0Var3.setIcon(yVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 6, -1));
        w0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        ai.t tVar2 = new ai.t(this, context);
        tVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        tVar2.setText(LocaleController.getString(R.string.Create));
        tVar2.setTypeface(AndroidUtilities.bold());
        tVar2.setTextSize(1, 14.0f);
        tVar2.setVisibility(4);
        tVar2.setAlpha(0.0f);
        tVar2.setGravity(17);
        tVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        tVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        tVar2.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        w7.c6.a(tVar2);
        this.f29367f1 = tVar2;
        W1();
        if (p2Var != null) {
            textPaint = textPaint2;
            w0Var = w0Var3;
            tVar = tVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
            this.f29363e1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 6, -1));
            w0Var4.setOnClickListener(new org.telegram.ui.ActionBar.e0(3, this, z11));
        } else {
            w0Var = w0Var3;
            textPaint = textPaint2;
            f7 = 14.0f;
            tVar = tVar2;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, f6Var);
        this.f29382k1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13), 3, -1));
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final yi f24982b;

            {
                this.f24982b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.eo eoVar;
                switch (r3) {
                    case 0:
                        final yi yiVar = this.f24982b;
                        di diVar = yiVar.E0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(yiVar.getContext(), f6Var);
                            g0Var.m0(diVar.getText());
                            g0Var.f23120j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar = yiVar.P0;
                                            giVar.setText(charSequence);
                                            giVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            if (yiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ph phVar = new ph(yiVar, 0);
                            g0Var.f23122l0 = j3;
                            g0Var.m0 = z13;
                            g0Var.f23123n0 = phVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final yi yiVar2 = this.f24982b;
                        gi giVar = yiVar2.P0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(yiVar2.getContext(), f6Var);
                            g0Var2.m0(giVar.getText());
                            g0Var2.f23120j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar2.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar2.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            if (yiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ph phVar2 = new ph(yiVar2, 1);
                            g0Var2.f23122l0 = j10;
                            g0Var2.m0 = z14;
                            g0Var2.f23123n0 = phVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        yi yiVar3 = this.f24982b;
                        yiVar3.f29382k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar3.f29366f0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i14 = yiVar3.S1;
                        boolean z15 = yiVar3.T1;
                        t13.h = i14;
                        t13.f30125n = z15;
                        if (!yiVar3.Z1.e0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = bi.r9.w(yiVar3.J1, "webp");
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
                        zh zhVar = new zh(yiVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.eo) {
                            eoVar = (org.telegram.ui.eo) p2Var2;
                        } else {
                            eoVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, zhVar, eoVar);
                        if (yiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, yiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        ai aiVar = new ai(this, context, 0);
        this.f29376i1 = aiVar;
        aiVar.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        aiVar.setAlpha(0.0f);
        aiVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f29379j1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.a6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f29386m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.a6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        aiVar.addView(linearLayout, w7.a6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f29390n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.a6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f29393o1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.a6.q(-2, -2, 16));
        aiVar.addView(linearLayout2, w7.a6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, f6Var);
        this.f29378j0 = chatAttachAlertPhotoLayout;
        qiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f29427y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.a6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f29416v1 = view;
        view.setup(aVar3);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.a6.g());
        this.containerView.addView(aiVar, w7.a6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bi.n7 n7Var = new bi.n7(context, 8);
        this.O0 = n7Var;
        this.containerView.addView(n7Var, w7.a6.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.a6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, w7.a6.e(48, 48, 53));
        this.containerView.addView(w0Var, w7.a6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f29363e1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, w7.a6.e(48, 48, 53));
        }
        aiVar.addView(w0Var5, w7.a6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(tVar, w7.a6.e(-2, 48, 53));
        ai aiVar2 = new ai(this, context, 1);
        this.f29424x1 = aiVar2;
        bi biVar = new bi(context, 0);
        this.f29428y1 = biVar;
        biVar.setClipChildren(true);
        biVar.setClipToPadding(false);
        vi viVar = new vi(this, context);
        this.A1 = viVar;
        biVar.setAdapter(viVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f29431z1 = c0Var;
        biVar.setLayoutManager(c0Var);
        biVar.setVerticalScrollBarEnabled(false);
        biVar.setHorizontalScrollBarEnabled(false);
        biVar.setItemAnimator(null);
        biVar.setLayoutAnimation(null);
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        biVar.f28007z2 = true;
        biVar.setOverScrollMode(2);
        zg.a aVar4 = this.G2;
        gh.k kVar = new gh.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = kVar;
        aVar4.e = viewGroup2;
        zg.a aVar5 = this.H2;
        gh.k kVar2 = new gh.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = kVar2;
        aVar5.e = viewGroup3;
        gh.k kVar3 = new gh.k(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = kVar3;
        aVar3.e = viewGroup4;
        ci ciVar = new ci(this, context, 0);
        this.f29420w1 = ciVar;
        zg.b bVar = new zg.b(aVar3.c(ciVar, null, false));
        this.f29352b0 = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ciVar, w7.a6.g());
        bh.d c10 = this.G2.c(aiVar2, dh.c.f(f6Var), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        aiVar2.setBackground(c10);
        biVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        biVar.setClipToOutline(true);
        bi.g gVar = xf.k0.f45156a;
        biVar.setOutlineProvider(new xf.j0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        biVar.setImportantForAccessibility(1);
        aiVar2.addView(biVar, w7.a6.g());
        this.containerView.addView(aiVar2, w7.a6.e(-1, 70, 81));
        biVar.setOnItemClickListener(new ai.b0(8, this, f6Var));
        biVar.setOnItemLongClickListener(new gh(this, 3));
        o6 o6Var = new o6(context, true, false, true);
        this.E1 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        o6Var.setPadding(dp, 0, dp, 0);
        o6Var.setTextSize(AndroidUtilities.dp(f7));
        o6Var.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view2) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        this.containerView.addView(o6Var, w7.a6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.a6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.F0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f18325z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view2) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        ai aiVar3 = new ai(this, context, 2);
        this.D0 = aiVar3;
        gg.j jVar = new gg.j(this, context);
        this.C0 = jVar;
        aiVar3.addView(jVar, w7.a6.e(-1, -1, 119));
        bh.d c11 = this.H2.c(oiVar, dh.c.n(f6Var), false);
        this.A0 = c11;
        c11.f2276k = true;
        c11.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.t(AndroidUtilities.dp(32.0f));
        c11.h.f2261g = 0.4f;
        c11.j();
        bh.d c12 = this.G2.c(jVar, dh.c.n(f6Var), false);
        this.B0 = c12;
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        jVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        aiVar3.setWillNotDraw(false);
        aiVar3.setVisibility(4);
        aiVar3.setAlpha(0.0f);
        this.containerView.addView(aiVar3, w7.a6.e(-1, -2, 83));
        aiVar3.setOnTouchListener(new ai.h(13));
        o6 o6Var2 = new o6(context, false, false, false);
        this.f29405s = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i14 = org.telegram.ui.ActionBar.j6.f18306y6;
        o6Var2.setTextColor(getThemedColor(i14));
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        jVar.addView(o6Var2, w7.a6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f29418w = imageView4;
        k0 k0Var = new k0(context);
        this.f29422x = k0Var;
        imageView4.setImageDrawable(k0Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.j6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        int i16 = org.telegram.ui.ActionBar.j6.f18017i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        jVar.addView(imageView4, w7.a6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.c6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24982b;

            {
                this.f24982b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.eo eoVar;
                switch (r3) {
                    case 0:
                        final yi yiVar = this.f24982b;
                        di diVar = yiVar.E0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(yiVar.getContext(), f6Var);
                            g0Var.m0(diVar.getText());
                            g0Var.f23120j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            if (yiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ph phVar = new ph(yiVar, 0);
                            g0Var.f23122l0 = j3;
                            g0Var.m0 = z13;
                            g0Var.f23123n0 = phVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final yi yiVar2 = this.f24982b;
                        gi giVar = yiVar2.P0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(yiVar2.getContext(), f6Var);
                            g0Var2.m0(giVar.getText());
                            g0Var2.f23120j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar2 = yiVar2.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar2.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            if (yiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ph phVar2 = new ph(yiVar2, 1);
                            g0Var2.f23122l0 = j10;
                            g0Var2.m0 = z14;
                            g0Var2.f23123n0 = phVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        yi yiVar3 = this.f24982b;
                        yiVar3.f29382k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar3.f29366f0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = yiVar3.S1;
                        boolean z15 = yiVar3.T1;
                        t13.h = i142;
                        t13.f30125n = z15;
                        if (!yiVar3.Z1.e0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = bi.r9.w(yiVar3.J1, "webp");
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
                        zh zhVar = new zh(yiVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.eo) {
                            eoVar = (org.telegram.ui.eo) p2Var2;
                        } else {
                            eoVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, zhVar, eoVar);
                        if (yiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, yiVar3.J);
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
        di diVar = new di(this, context, oiVar, f6Var);
        this.E0 = diVar;
        diVar.J = true;
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        diVar.s();
        diVar.getEditText().setLayoutParams(w7.a6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        diVar.getEditText().addTextChangedListener(new fi(this));
        jVar.addView(diVar, w7.a6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        aiVar3.setClipChildren(false);
        diVar.setClipChildren(false);
        n7Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        n7Var.setWillNotDraw(false);
        gi giVar = new gi(this, context, oiVar, f6Var);
        this.P0 = giVar;
        giVar.J = true;
        giVar.getEditText().addTextChangedListener(new hi(this, p2Var));
        giVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        giVar.getEditText().setLayoutParams(w7.a6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        giVar.getEditText().setTextSize(1, 17.0f);
        giVar.getEmojiButton().setLayoutParams(w7.a6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        giVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        n7Var.addView(giVar, w7.a6.e(-1, -2, 119));
        n7Var.setAlpha(0.0f);
        n7Var.setVisibility(8);
        diVar.addView(imageView3, w7.a6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        bh.d c13 = this.G2.c(n7Var, dh.c.n(f6Var), false);
        c13.p(AndroidUtilities.dp(22.0f));
        c13.o(AndroidUtilities.dp(7.0f));
        n7Var.setBackground(c13);
        n7Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.v = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setTextColor(getThemedColor(i14));
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        n7Var.addView(o6Var3, w7.a6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Xd), mode2));
        giVar.addView(imageView5, w7.a6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view2) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f29426y = imageView6;
        k0 k0Var2 = new k0(context);
        this.E = k0Var2;
        imageView6.setImageDrawable(k0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        n7Var.addView(imageView6, w7.a6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.c6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24982b;

            {
                this.f24982b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.eo eoVar;
                switch (r3) {
                    case 0:
                        final yi yiVar = this.f24982b;
                        di diVar2 = yiVar.E0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(yiVar.getContext(), f6Var);
                            g0Var.m0(diVar2.getText());
                            g0Var.f23120j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar22 = yiVar.E0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar2 = yiVar.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            if (yiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ph phVar = new ph(yiVar, 0);
                            g0Var.f23122l0 = j3;
                            g0Var.m0 = z13;
                            g0Var.f23123n0 = phVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final yi yiVar2 = this.f24982b;
                        gi giVar2 = yiVar2.P0;
                        if (giVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(yiVar2.getContext(), f6Var);
                            g0Var2.m0(giVar2.getText());
                            g0Var2.f23120j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            di diVar22 = yiVar2.E0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            gi giVar22 = yiVar2.P0;
                                            giVar22.setText(charSequence);
                                            giVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            if (yiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ph phVar2 = new ph(yiVar2, 1);
                            g0Var2.f23122l0 = j10;
                            g0Var2.m0 = z14;
                            g0Var2.f23123n0 = phVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        yi yiVar3 = this.f24982b;
                        yiVar3.f29382k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar3.f29366f0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = yiVar3.S1;
                        boolean z15 = yiVar3.T1;
                        t13.h = i142;
                        t13.f30125n = z15;
                        if (!yiVar3.Z1.e0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = bi.r9.w(yiVar3.J1, "webp");
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
                        zh zhVar = new zh(yiVar3, photoEntry);
                        if (p2Var2 instanceof org.telegram.ui.eo) {
                            eoVar = (org.telegram.ui.eo) p2Var2;
                        } else {
                            eoVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, zhVar, eoVar);
                        if (yiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, yiVar3.J);
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
        this.H0 = aiVar4;
        aiVar4.setFocusable(true);
        aiVar4.setFocusableInTouchMode(true);
        aiVar4.setVisibility(4);
        aiVar4.setScaleX(0.2f);
        aiVar4.setScaleY(0.2f);
        aiVar4.setAlpha(0.0f);
        aiVar4.setClipChildren(false);
        aiVar4.setClipToPadding(false);
        this.containerView.addView(aiVar4, w7.a6.e(110, 50, 85));
        ii iiVar = new ii(R.drawable.send_plane_24, context, f6Var, this);
        this.I0 = iiVar;
        iiVar.setImportantForAccessibility(2);
        aiVar4.addView(iiVar, w7.a6.e(-1, -1, 119));
        iiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        iiVar.I = dp2;
        iiVar.J = dp3;
        iiVar.M = AndroidUtilities.dp(7.0f);
        iiVar.N = AndroidUtilities.dp(6.0f);
        iiVar.f29028h0 = true;
        iiVar.setOnClickListener(new View.OnClickListener(this) {
            public final yi f24714b;

            {
                this.f24714b = this;
            }

            @Override
            public final void onClick(View view2) {
                di.u4 u4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        yi yiVar = this.f24714b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.f29423x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        yi yiVar2 = this.f24714b;
                        boolean z14 = yiVar2.f29356c0;
                        if (!z14) {
                            yiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        yi yiVar3 = this.f24714b;
                        boolean z15 = yiVar3.f29356c0;
                        if (z15) {
                            yiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f24714b.z1();
                        return;
                    case 4:
                        this.f24714b.f29350a1.M(null, null);
                        return;
                    case 5:
                        yi.s(this.f24714b);
                        return;
                    case 6:
                        qi qiVar = this.f24714b.f29427y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f24714b.f29382k1.M(null, null);
                        return;
                    default:
                        yi yiVar4 = this.f24714b;
                        if (yiVar4.f29427y0 != yiVar4.f29398q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yiVar4.Z1(z13);
                        return;
                }
            }
        });
        iiVar.setOnLongClickListener(new org.telegram.ui.hg(this, context, f6Var, p2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        ci ciVar2 = new ci(this, context, 1);
        ciVar2.setAlpha(0.0f);
        ciVar2.setScaleX(0.2f);
        ciVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        cl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        zg.a aVar6 = this.G2;
        ch.e n10 = dh.c.n(f6Var);
        vl0 vl0Var = fastScroll.f22173o0;
        bh.d c14 = aVar6.c(vl0Var.f27967f1, n10, false);
        fastScroll.f22162e0 = c14;
        c14.o(AndroidUtilities.dp(4.0f));
        fastScroll.f22162e0.p(AndroidUtilities.dp(24.0f));
        bh.d c15 = aVar6.c(vl0Var.f27967f1, n10, false);
        fastScroll.f22164f0 = c15;
        c15.o(AndroidUtilities.dp(6.0f));
        fastScroll.f22164f0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f22164f0.p(AndroidUtilities.dp(f7));
        be0 be0Var = new be0(context);
        this.S = be0Var;
        this.containerView.addView(be0Var, w7.a6.c(-1.0f, -1));
        ch.e eVar = new ch.e(f6Var);
        eVar.e = new gh(this, 4);
        eVar.f4690c = new gh(this, 5);
        eVar.d = new gh(this, 6);
        eVar.f4689b = new gh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f4692n = dpf2;
        eVar.f4693r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f4691f = dpf23;
        eVar.h = dpf24;
        y7Var.M(this.G2, eVar, false);
        lVar.i(1L, false);
    }

    public static void M(yi yiVar) {
        boolean q6;
        int i10;
        int i11;
        y7 y7Var = yiVar.X0;
        ih.f fVar = yiVar.f29416v1;
        if (fVar != null && y7Var != null) {
            org.telegram.ui.ActionBar.f6 f6Var = yiVar.resourcesProvider;
            if (f6Var != null) {
                q6 = f6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (y7Var.getVisibility() == 0) {
                if (q6) {
                    i11 = 255;
                } else {
                    i11 = 160;
                }
                i10 = (int) (y7Var.getAlpha() * i11);
            } else {
                i10 = 0;
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void Q(yi yiVar) {
        bi.k kVar = new bi.k(yiVar, yiVar.getContext(), yiVar.Z, LaunchActivity.R(), yiVar.resourcesProvider, 1);
        yiVar.B2 = kVar;
        kVar.p(new o0.b(yiVar));
        ViewGroup viewGroup = yiVar.containerView;
        viewGroup.addView(yiVar.B2, viewGroup.indexOfChild(yiVar.D0), w7.a6.e(-1, -1, 83));
        bi.k kVar2 = yiVar.B2;
        kVar2.getAdapter().f8104c = false;
        kVar2.getAdapter().d = false;
        kVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        boolean z10 = true;
        if (p2Var instanceof org.telegram.ui.eo) {
            kVar2.getAdapter().m0 = false;
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            fg.l1 adapter = kVar2.getAdapter();
            eoVar.i();
            TLRPC.Chat chat = eoVar.e;
            adapter.getClass();
            adapter.f8115l0 = chat;
            kVar2.getAdapter().W(eoVar.Z7);
            fg.l1 adapter2 = kVar2.getAdapter();
            if (eoVar.e == null) {
                z10 = false;
            }
            adapter2.f8107e0 = z10;
        } else {
            kVar2.getAdapter().m0 = true;
            kVar2.getAdapter().W(null);
            kVar2.getAdapter().f8107e0 = false;
        }
        kVar2.getAdapter().f8109f0 = false;
        yiVar.U1();
    }

    public static void m(yi yiVar, ValueAnimator valueAnimator) {
        yiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.f3 f3Var = yiVar.container;
        if (f3Var != null) {
            f3Var.invalidate();
        }
    }

    public static void n(yi yiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.b3 b3Var) {
        yiVar.currentSheetAnimation = null;
        yiVar.f29397p2 = null;
        animationNotificationsLocker.unlock();
        yiVar.currentSheetAnimationType = 0;
        if (b3Var != null) {
            b3Var.onOpenAnimationEnd();
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

    public static void o(yi yiVar, int i10) {
        yiVar.navBarColorKey = -1;
        yiVar.navBarColor = i10;
        yiVar.containerView.invalidate();
    }

    public static void p(yi yiVar) {
        o1.k kVar = yiVar.f29397p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(yiVar.containerView, o1.h.f14117n, 0.0f);
        yiVar.f29397p2 = kVar2;
        kVar2.f14134u.a(1.5f);
        yiVar.f29397p2.f14134u.b(1500.0f);
        yiVar.f29397p2.f();
    }

    public static boolean q(org.telegram.ui.Components.yi r45, android.content.Context r46, org.telegram.ui.ActionBar.f6 r47, org.telegram.ui.ActionBar.p2 r48, android.view.View r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.q(org.telegram.ui.Components.yi, android.content.Context, org.telegram.ui.ActionBar.f6, org.telegram.ui.ActionBar.p2, android.view.View):boolean");
    }

    public static void r(yi yiVar, gf gfVar) {
        AnimatorSet animatorSet = yiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            gfVar.run();
        }
    }

    public static void s(yi yiVar) {
        int i10;
        if (yiVar.f29378j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
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
        yiVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = yiVar.f29357c1;
        bi.x4 x4Var = yiVar.f29360d1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        bi.x4 x4Var2 = new bi.x4(yiVar.getContext(), 1);
        yiVar.f29360d1 = x4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        x4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        yiVar.f29360d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        yiVar.f29360d1.m(1.0f, -((yiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        yiVar.f29360d1.setTranslationY(yiVar.f29350a1.getTranslationY());
        bi.x4 x4Var3 = yiVar.f29360d1;
        x4Var3.f3890l0 = new ee(3, yiVar, x4Var2);
        yiVar.containerView.addView(x4Var3, w7.a6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        yiVar.f29360d1.u();
    }

    public static void t(yi yiVar, boolean z10, jh jhVar) {
        Integer num;
        yiVar.f29427y0.s(1.0f);
        yiVar.f29430z0.s(1.0f);
        yiVar.f29427y0.k(yiVar.f29385l2);
        yiVar.f29430z0.k(yiVar.f29385l2);
        yiVar.containerView.invalidate();
        y7 y7Var = yiVar.X0;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        y7Var.setTag(num);
        jhVar.run();
    }

    public static void u(yi yiVar, bi.x4 x4Var) {
        yiVar.containerView.removeView(x4Var);
    }

    public static void v(yi yiVar, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int i10;
        yi yiVar2 = yiVar;
        bi biVar = yiVar2.f29428y1;
        qi[] qiVarArr = yiVar2.f29419w0;
        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar2.f29366f0;
        if (p2Var2 == null) {
            p2Var = LaunchActivity.R();
        } else {
            p2Var = p2Var2;
        }
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (view instanceof si) {
                Activity parentActivity = p2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (yiVar2.L1 || yiVar2.M1 || !yiVar2.a1()) {
                        if (!yiVar2.L1 && !yiVar2.M1) {
                            ao aoVar = new ao(1, yiVar2.getContext(), f6Var, yiVar2);
                            yiVar2.T = aoVar;
                            yiVar2.Q1(aoVar);
                        }
                        yiVar2.Q1(yiVar2.f29378j0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (yiVar2.N1 || !yiVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(yiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        yiVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (yiVar2.K1 || !yiVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(yiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        yiVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (yiVar2.Q1 || !yiVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && yiVar2.Q1 && yiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(yiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        yiVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((yiVar2.Q1 || !yiVar2.a1()) && AndroidUtilities.isMapsInstalled(p2Var2)) {
                        if (!yiVar2.Q1) {
                            ao aoVar2 = new ao(6, yiVar2.getContext(), f6Var, yiVar2);
                            yiVar2.T = aoVar2;
                            yiVar2.Q1(aoVar2);
                        } else {
                            if (yiVar2.f29392o0 == null) {
                                ll llVar = new ll(yiVar2, yiVar2.getContext(), f6Var, (yiVar2.H || yiVar2.R1) ? false : false);
                                yiVar2.f29392o0 = llVar;
                                qiVarArr[5] = llVar;
                                gl glVar = yiVar2.f29411t2;
                                if (glVar != null) {
                                    llVar.setDelegate(glVar);
                                } else {
                                    llVar.setDelegate(new gh(yiVar2, 9));
                                }
                            }
                            yiVar2.Q1(yiVar2.f29392o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (yiVar2.O1 || !yiVar2.a1()) {
                        if (!yiVar2.O1) {
                            ao aoVar3 = new ao(9, yiVar2.getContext(), f6Var, yiVar2);
                            yiVar2.T = aoVar3;
                            yiVar2.Q1(aoVar3);
                        } else {
                            yiVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (yiVar2.f29406s0 == null) {
                        gg.n0 n0Var = new gg.n0(yiVar2.getContext(), yiVar2.resourcesProvider, yiVar2);
                        yiVar2.f29406s0 = n0Var;
                        qiVarArr[7] = n0Var;
                        n0Var.setupBlurredSearchField(yiVar2.G2);
                    }
                    yiVar2.Q1(yiVar2.f29406s0);
                } else if (i10 == 12) {
                    if (yiVar2.P1 || !yiVar2.a1()) {
                        if (!yiVar2.P1) {
                            ao aoVar4 = new ao(9, yiVar2.getContext(), f6Var, yiVar2);
                            yiVar2.T = aoVar4;
                            yiVar2.Q1(aoVar4);
                        } else {
                            if (yiVar2.f29389n0 == null) {
                                zn znVar = new zn(yiVar, yiVar.getContext(), true, f6Var, null);
                                yiVar2 = yiVar;
                                yiVar2.f29389n0 = znVar;
                                qiVarArr[1] = znVar;
                                znVar.setDelegate(new gh(yiVar2, 10));
                            }
                            yiVar2.Q1(yiVar2.f29389n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (yiVar2.f29412u0 == null) {
                        uk ukVar = new uk(yiVar2, yiVar2.getContext(), f6Var, true);
                        yiVar2.f29412u0 = ukVar;
                        qiVarArr[8] = ukVar;
                        ukVar.setDelegate(yiVar2.a2);
                    }
                    yiVar2.Q1(yiVar2.f29412u0);
                } else if (i10 == 14) {
                    if (yiVar2.f29409t0 == null) {
                        uk ukVar2 = new uk(yiVar2, yiVar2.getContext(), f6Var, false);
                        yiVar2.f29409t0 = ukVar2;
                        qiVarArr[9] = ukVar2;
                        ukVar2.setDelegate(yiVar2.a2);
                    }
                    yiVar2.Q1(yiVar2.f29409t0);
                } else if (i10 == 16) {
                    if (yiVar2.f29415v0 == null) {
                        hi.s sVar = new hi.s(yiVar2.J1, yiVar2.getContext(), f6Var, yiVar2);
                        yiVar2.f29415v0 = sVar;
                        qiVarArr[10] = sVar;
                    }
                    yiVar2.Q1(yiVar2.f29415v0);
                } else if (view.getTag() instanceof Integer) {
                    yiVar2.Z1.A1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, yiVar2.s1(), false, 0L);
                }
            } else if (view instanceof ri) {
                ri riVar = (ri) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = riVar.f26672c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        qj1.a(yiVar2.getContext(), new m4.q0(6, yiVar2, riVar), null);
                    } else {
                        yiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    yiVar2.Z1.i1(riVar.f26671b);
                    yiVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                biVar.v0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > biVar.getMeasuredWidth()) {
                biVar.v0(i14 - biVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(yi yiVar) {
        qi qiVar;
        xm xmVar;
        yiVar.f29410t1 = null;
        qi qiVar2 = yiVar.f29427y0;
        if (qiVar2 != yiVar.f29378j0 && (qiVar = yiVar.f29430z0) != (xmVar = yiVar.f29398q0) && qiVar2 != qiVar && qiVar2 != xmVar) {
            yiVar.containerView.removeView(qiVar2);
        }
        yiVar.f29427y0.setVisibility(8);
        yiVar.f29427y0.q();
        yiVar.f29430z0.E();
        yiVar.f29427y0 = yiVar.f29430z0;
        yiVar.f29430z0 = null;
        int[] iArr = yiVar.f29354b2;
        iArr[0] = iArr[1];
        yiVar.H1(yiVar.f29356c0, false);
        yiVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (i10 == 3) {
            if (this.N1 || !a1()) {
                if (p2Var != null) {
                    activity = p2Var.getParentActivity();
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
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(p2Var)) {
            if (this.f29392o0 == null) {
                ll llVar = new ll(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : false);
                this.f29392o0 = llVar;
                this.f29419w0[5] = llVar;
                gl glVar = this.f29411t2;
                if (glVar != null) {
                    llVar.setDelegate(glVar);
                } else if (p2Var instanceof org.telegram.ui.eo) {
                    llVar.setDelegate(new gh(this, 16));
                }
            }
            Q1(this.f29392o0);
        }
    }

    public final void B1(boolean z10) {
        if (!this.N1 && z10) {
            ao aoVar = new ao(3, getContext(), this.resourcesProvider, this);
            this.T = aoVar;
            Q1(aoVar);
        }
        int i10 = 1;
        if (this.f29384l0 == null) {
            jj jjVar = new jj(getContext(), this.resourcesProvider, this);
            this.f29384l0 = jjVar;
            this.f29419w0[3] = jjVar;
            jjVar.setupBlurredSearchField(this.G2);
            this.f29384l0.setDelegate(new gh(this, 13));
            if (this.H) {
                this.f29384l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            TLRPC.Chat chat = ((org.telegram.ui.eo) p2Var).e;
            jj jjVar2 = this.f29384l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            jjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.f29384l0);
        }
    }

    public final void C1() {
        if (this.f29402r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            ?? qiVar = new qi(context, f6Var, this);
            qiVar.f25240r = AndroidUtilities.dp(80.0f);
            qiVar.f25242w = 3;
            bi.y1 y1Var = new bi.y1(qiVar, context, f6Var, 10);
            qiVar.f25239n = y1Var;
            ya yaVar = new ya(qiVar, context);
            qiVar.v = yaVar;
            y1Var.setAdapter(yaVar);
            y1Var.setClipToPadding(false);
            y1Var.setItemAnimator(null);
            y1Var.setLayoutAnimation(null);
            y1Var.setVerticalScrollBarEnabled(false);
            y1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, qiVar.f26421a));
            qiVar.addView(y1Var, w7.a6.c(-1.0f, -1));
            y1Var.setOnScrollListener(new bi.a2(qiVar, 15));
            ai.q qVar = new ai.q(qiVar, qiVar.f25240r, 1);
            qiVar.f25241s = qVar;
            qVar.O = new bi.i2(qiVar, 2);
            y1Var.setLayoutManager(qVar);
            this.f29402r0 = qiVar;
            qiVar.setDelegate(new fb(this, 1));
        }
        Q1(this.f29402r0);
    }

    public final void D1() {
        boolean z10;
        if (!this.Q1) {
            ao aoVar = new ao(5, getContext(), this.resourcesProvider, this);
            this.T = aoVar;
            Q1(aoVar);
        }
        if (this.f29381k0 == null) {
            bk bkVar = new bk(getContext(), this.resourcesProvider, this);
            this.f29381k0 = bkVar;
            this.f29419w0[2] = bkVar;
            bkVar.setupBlurredSearchField(this.G2);
            this.f29381k0.setDelegate(new ki(this));
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            TLRPC.Chat chat = ((org.telegram.ui.eo) p2Var).e;
            bk bkVar2 = this.f29381k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            bkVar2.setMultipleSelectionAllowed(z10);
        }
        Q1(this.f29381k0);
    }

    public final void E1(boolean z10) {
        int i10;
        if (!this.K1 && z10) {
            ao aoVar = new ao(4, getContext(), this.resourcesProvider, this);
            this.T = aoVar;
            Q1(aoVar);
        }
        boolean z11 = false;
        if (this.f29395p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            tk tkVar = new tk(i10, getContext(), this.resourcesProvider, this);
            this.f29395p0 = tkVar;
            this.f29419w0[4] = tkVar;
            tkVar.setDelegate(new li(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f29395p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
            if (p2Var instanceof org.telegram.ui.eo) {
                TLRPC.Chat chat = ((org.telegram.ui.eo) p2Var).e;
                tk tkVar2 = this.f29395p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i11 = -1;
                }
                tkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f29395p0.setMaxSelectedFiles(this.S1);
                tk tkVar3 = this.f29395p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                tkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        tk tkVar4 = this.f29395p0;
        tkVar4.f27424d0 = this.N;
        if (z10) {
            Q1(tkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y7 y7Var = this.X0;
        int i10 = 1;
        if (y7Var.f18389n0) {
            y7Var.h(true);
        }
        this.f29381k0 = null;
        this.f29406s0 = null;
        this.f29384l0 = null;
        this.m0 = null;
        this.f29389n0 = null;
        this.f29392o0 = null;
        this.f29395p0 = null;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
            if (i10 < qiVarArr.length) {
                qi qiVar = qiVarArr[i10];
                if (qiVar != null) {
                    qiVar.m();
                    this.containerView.removeView(qiVarArr[i10]);
                    qiVarArr[i10] = null;
                }
                i10++;
            } else {
                T1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        qi qiVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            zn znVar = this.m0;
            if (znVar != null && ((qiVar = this.f29430z0) == znVar || this.f29427y0 == znVar)) {
                if (qiVar == znVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            zn znVar2 = this.f29389n0;
            if (znVar2 != null) {
                qi qiVar2 = this.f29430z0;
                if (qiVar2 == znVar2 || this.f29427y0 == znVar2) {
                    if (qiVar2 != znVar2) {
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
            ii iiVar = this.I0;
            if (iiVar != null) {
                iiVar.setEphemeralFactor(f7);
                iiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            TLRPC.Chat chat = eoVar.e;
            if (eoVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.J1).edit();
                edit.putBoolean("silent_" + eoVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f12870f) {
            this.I1 = true;
            this.Z1.A1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        qi qiVar = this.f29427y0;
        if (qiVar != null) {
            i12 = qiVar.getSelectedItemsCount();
        }
        return d5.b0(this.J1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                yi yiVar = yi.this;
                yiVar.I1 = true;
                yiVar.Z1.A1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f29351b.a(z10, z11);
        nu m12 = m1();
        this.f29356c0 = z10;
        nu m13 = m1();
        int i11 = 0;
        if (this.D0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        qi qiVar = this.f29427y0;
        if (qiVar != this.f29378j0 && qiVar != this.f29398q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f29356c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        bi.n7 n7Var = this.O0;
        gg.j jVar = this.C0;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            n7Var.setVisibility(i12);
            ViewPropertyAnimator animate = n7Var.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).setUpdateListener(new hh(this, 0)).withEndAction(new Runnable(this) {
                public final yi f24018b;

                {
                    this.f24018b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            yi yiVar = this.f24018b;
                            if (!z14 || !z12) {
                                yiVar.O0.setVisibility(8);
                            }
                            yiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24018b.C0.setVisibility(8);
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
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(wrVar).setUpdateListener(new hh(this, 1)).withEndAction(new Runnable(this) {
                public final yi f24018b;

                {
                    this.f24018b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            yi yiVar = this.f24018b;
                            if (!z14 || !z12) {
                                yiVar.O0.setVisibility(8);
                            }
                            yiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24018b.C0.setVisibility(8);
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
            n7Var.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            n7Var.setAlpha(f7);
            b2();
            jVar.setAlpha((z14 || !z12) ? 0.0f : 0.0f);
            if (z14 || !z12) {
                f12 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f12);
            jVar.setVisibility((z14 || !z12) ? 8 : 8);
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
        AndroidUtilities.runOnUIThread(new jh(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f29378j0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.H1 == messageObject && this.G1 == i10) {
            return;
        }
        this.H1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.H1.isMusic()) {
                i10 = 2;
            } else if (this.H1.isDocument()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        this.G1 = i10;
        if (this.H1 != null) {
            this.S1 = 1;
            this.T1 = false;
        } else {
            this.S1 = -1;
            this.T1 = true;
        }
        this.A1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z10) {
        if (this.H1 != null) {
            return;
        }
        this.S1 = i10;
        this.T1 = z10;
    }

    public final void K1(float f7) {
        boolean z10 = false;
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void L1(String str) {
        boolean z10 = true;
        this.Q0 = 1;
        this.F = true;
        this.S0 = false;
        this.M1 = false;
        this.f29424x1.setVisibility(8);
        this.f29379j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
        if (chatAttachAlertPhotoLayout != null) {
            yi yiVar = chatAttachAlertPhotoLayout.f26422b;
            chatAttachAlertPhotoLayout.f21001g1 = (yiVar.Q0 == 0 || yiVar.F) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.M1(boolean):void");
    }

    public final void N1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.p2 p2Var) {
        if ((p2Var instanceof org.telegram.ui.eo) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.eo) p2Var).e)) {
            new wc(this.f29403r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new ee(4, this, p2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        int i11;
        float f14;
        float f15;
        float f16;
        qi qiVar;
        float f17;
        float dp;
        long sendPaidMessagesStars;
        float f18;
        float f19;
        y7 y7Var;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        this.f29355c.a(z10, true);
        ai aiVar = this.D0;
        if (aiVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return false;
        }
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        aiVar.setTag(num);
        di diVar = this.E0;
        if (diVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        diVar.k(true);
        this.P0.k(true);
        ai aiVar2 = this.f29424x1;
        ai aiVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                aiVar.setVisibility(0);
            }
            aiVar3.setVisibility(0);
        } else if (this.S0) {
            aiVar2.setVisibility(0);
        }
        qi qiVar2 = this.f29427y0;
        if ((qiVar2 == this.f29378j0 || qiVar2 == this.f29398q0) && this.f29356c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        y7 y7Var2 = this.X0;
        bi.n7 n7Var = this.O0;
        gg.j jVar = this.C0;
        ii iiVar = this.I0;
        float f26 = 0.2f;
        float f27 = 1.0f;
        if (z11) {
            float f28 = 0.0f;
            this.M0 = new AnimatorSet();
            if (z13) {
                n7Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar, property, f18));
            if (z10 && !z13) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f19));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                y7Var = y7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                y7Var = y7Var2;
            }
            if (z10 && z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(n7Var, property, f20));
            Property property2 = View.SCALE_X;
            if (z10) {
                f21 = 1.0f;
            } else {
                f21 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(iiVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(iiVar, property3, f26));
            if (y7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(aiVar, property4, f28));
            } else if (this.S0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, property, f27));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hh(this, 4));
                arrayList.add(ofFloat);
            }
            this.M0.playTogether(arrayList);
            this.M0.setInterpolator(new DecelerateInterpolator());
            this.M0.setDuration(180L);
            this.M0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z13, 3));
            this.M0.start();
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
            jVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                jVar.setVisibility(0);
                jVar.setTranslationY(0.0f);
            } else {
                i10 = 0;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.2f;
            }
            aiVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            aiVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            aiVar3.setAlpha(f13);
            if (z10 && z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            n7Var.setVisibility(i11);
            if (z10 && z13) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            n7Var.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            iiVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            iiVar.setScaleY(f16);
            if (y7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                aiVar.setTranslationY(dp);
            } else if (this.S0 && ((qiVar = this.f29427y0) == null || qiVar.J())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                aiVar2.setTranslationY(f17);
            }
            if (!z10) {
                aiVar.setVisibility(4);
                aiVar3.setVisibility(4);
            }
            if (z13) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f29427y0.getSelectedItemsCount());
        }
        iiVar.g(i10, z11);
        if (this.H1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1());
        }
        iiVar.i(j1() + this.f29427y0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) diVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), iiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            diVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(qi qiVar) {
        long j3 = this.W0;
        ao aoVar = this.T;
        if (qiVar == aoVar) {
            j3 = aoVar.f21553s;
        } else if (qiVar == this.f29378j0) {
            j3 = 1;
        } else if (qiVar == this.f29384l0) {
            j3 = 3;
        } else if (qiVar == this.f29395p0) {
            j3 = 4;
        } else if (qiVar == this.f29381k0) {
            j3 = 5;
        } else if (qiVar == this.f29392o0) {
            j3 = 6;
        } else if (qiVar == this.m0) {
            j3 = 9;
        } else if (qiVar == this.f29402r0) {
            j3 = 10;
        } else if (qiVar == this.f29406s0) {
            j3 = 11;
        } else if (qiVar == this.f29389n0) {
            j3 = 12;
        } else if (qiVar == this.f29409t0) {
            j3 = 14;
        } else if (qiVar == this.f29412u0) {
            j3 = 13;
        } else if (qiVar == this.f29415v0) {
            j3 = 16;
        }
        R1(qiVar, j3, true);
    }

    public final void R1(qi qiVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        im imVar;
        boolean z12;
        Integer num;
        im imVar2;
        int i11;
        int i12;
        int dp;
        bi biVar;
        boolean z13;
        if (this.f29410t1 == null && this.M0 == null) {
            qi qiVar2 = this.f29427y0;
            if (qiVar2 == qiVar) {
                qiVar2.F();
            } else if (qiVar == this.f29389n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new qg.a1(this.f29366f0, 39, false).show();
            } else {
                int i13 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i13 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29365f.a(z11, z10);
                this.f29388n.i(Long.valueOf(j3), z10);
                this.D1 = false;
                this.B1 = false;
                this.F1 = 0.0f;
                this.E1.setVisibility(8);
                RadialProgressView radialProgressView = this.C1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                ai aiVar = this.f29424x1;
                aiVar.setAlpha(1.0f);
                aiVar.setTranslationY(this.F1);
                int i14 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f29423x0;
                    if (i14 >= longSparseArray.size()) {
                        break;
                    }
                    ((di.u4) longSparseArray.valueAt(i14)).setMeasureOffsetY(0);
                    i14++;
                }
                this.W0 = j3;
                bi biVar2 = this.f29428y1;
                int childCount = biVar2.getChildCount();
                int i15 = 0;
                while (i15 < childCount) {
                    View childAt = biVar2.getChildAt(i15);
                    if (childAt instanceof si) {
                        si siVar = (si) childAt;
                        biVar = biVar2;
                        if (siVar.f27055b == siVar.f27056c.W0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        siVar.f27412a.e(z13, true);
                    } else {
                        biVar = biVar2;
                        if (childAt instanceof ri) {
                            ((ri) childAt).a(true);
                        }
                    }
                    i15++;
                    biVar2 = biVar;
                }
                int firstOffset = (this.f29427y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f29354b2[0];
                this.f29430z0 = qiVar;
                qiVar.getClass();
                boolean z14 = qiVar instanceof hi.s;
                ih.f fVar = this.f29416v1;
                if (fVar != null) {
                    if (z14) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp);
                }
                ci ciVar = this.f29420w1;
                if (ciVar != null) {
                    if (z14) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    ciVar.setVisibility(i12);
                }
                if (this.f29430z0.h() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                y7 y7Var = this.X0;
                y7Var.setVisibility(i10);
                if (y7Var.f18389n0) {
                    y7Var.h(true);
                }
                this.f29427y0.r();
                qi qiVar3 = this.f29430z0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
                if (qiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f29430z0.D(this.f29427y0);
                this.f29430z0.setVisibility(0);
                if (qiVar.getParent() != null) {
                    this.containerView.removeView(this.f29430z0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.f29427y0);
                ViewParent parent = this.f29430z0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    qi qiVar4 = this.f29430z0;
                    if (qiVar4 != this.f29392o0) {
                        indexOfChild++;
                    }
                    viewGroup.addView(qiVar4, indexOfChild, w7.a6.c(-1.0f, -1));
                }
                jh jhVar = new jh(this, 3);
                qi qiVar5 = this.f29427y0;
                boolean z15 = qiVar5 instanceof xm;
                mi miVar = this.f29362e0;
                if (!z15 && !(this.f29430z0 instanceof xm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f29430z0.setAlpha(0.0f);
                        this.f29430z0.setTranslationY(AndroidUtilities.dp(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f29427y0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f29427y0, miVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, View.ALPHA, y7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(wr.f28819f);
                        animatorSet.addListener(new ji(this, firstOffset, jhVar, 0));
                        this.f29410t1 = animatorSet;
                        qi qiVar6 = this.f29427y0;
                        miVar.getClass();
                        miVar.b(qiVar6, 0.0f);
                        animatorSet.start();
                    } else {
                        qiVar5.setAlpha(0.0f);
                        jhVar.run();
                        a2(0);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.f29430z0.getWidth(), this.f29427y0.getWidth());
                    qi qiVar7 = this.f29430z0;
                    if (qiVar7 instanceof xm) {
                        qiVar7.setTranslationX(max);
                        qi qiVar8 = this.f29427y0;
                        if ((qiVar8 instanceof ChatAttachAlertPhotoLayout) && (imVar2 = ((ChatAttachAlertPhotoLayout) qiVar8).P) != null) {
                            imVar2.setVisibility(4);
                        }
                    } else {
                        this.f29427y0.setTranslationX(-max);
                        qi qiVar9 = this.f29430z0;
                        if (qiVar9 == chatAttachAlertPhotoLayout && (imVar = ((ChatAttachAlertPhotoLayout) qiVar9).P) != null) {
                            imVar.setVisibility(0);
                        }
                    }
                    this.f29430z0.setAlpha(1.0f);
                    this.f29427y0.setAlpha(1.0f);
                    if (z10) {
                        qi qiVar10 = this.f29427y0;
                        miVar.getClass();
                        miVar.b(qiVar10, 0.0f);
                        AndroidUtilities.runOnUIThread(new gf(this, qiVar, jhVar, 4));
                    } else {
                        if (this.f29430z0.getCurrentItemTop() <= qiVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f29427y0.s(1.0f);
                        this.f29430z0.s(1.0f);
                        this.f29427y0.k(this.f29385l2);
                        this.f29430z0.k(this.f29385l2);
                        this.containerView.invalidate();
                        qi qiVar11 = this.f29427y0;
                        miVar.getClass();
                        miVar.b(qiVar11, 1.0f);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        y7Var.setTag(num);
                        jhVar.run();
                    }
                }
                if (this.f29387m2 && !(qiVar instanceof di.u4)) {
                    i11 = 0;
                    this.f29387m2 = false;
                    y7Var.e();
                    y7Var.invalidate();
                    u1();
                } else {
                    i11 = 0;
                }
                if (i13 != 0 && j3 != 6 && !(qiVar instanceof di.u4)) {
                    if (j3 == 4) {
                        i11 = AndroidUtilities.dp(84.0f);
                    }
                } else {
                    i11 = AndroidUtilities.dp(46.0f);
                }
                y7Var.setForcedMenuWidth(i11);
            }
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        yi yiVar;
        if (this.m0 == null) {
            yiVar = this;
            zn znVar = new zn(yiVar, getContext(), false, this.resourcesProvider, bool);
            yiVar.m0 = znVar;
            yiVar.f29419w0[1] = znVar;
            znVar.setDelegate(new gh(this, 15));
        } else {
            yiVar = this;
        }
        R1(yiVar.m0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
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
        y7 y7Var = this.X0;
        if ((z10 && y7Var.getTag() == null) || (!z10 && y7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            y7Var.setTag(num);
            AnimatorSet animatorSet = this.Y0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Y0 = null;
            }
            if (!this.F && !this.T0 && ((this.Q0 != 0 || !this.f29399q1) && this.f29427y0 == this.f29378j0 && (this.L1 || this.M1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f29427y0 == this.T) {
                z12 = false;
            }
            ai aiVar = this.f29424x1;
            org.telegram.ui.ActionBar.w0 w0Var = this.f29350a1;
            if (z10) {
                if (z12) {
                    w0Var.setVisibility(0);
                    w0Var.setClickable(true);
                }
            } else if (this.S0 && this.D0.getTag() == null) {
                aiVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
            if (p2Var != null) {
                if (z10) {
                    if (this.f29374h2) {
                        i10 = org.telegram.ui.ActionBar.j6.f18227tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f17998h5;
                    }
                    if (i0.a.f(getThemedColor(i10)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(this, z13);
                } else {
                    AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
                }
            }
            float f14 = 0.6f;
            float f15 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Y0 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - y7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(y7Var, property, f12));
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
                this.Y0.playTogether(arrayList);
                this.Y0.addListener(new ai.e(28, this, z10));
                this.Y0.setInterpolator(wr.h);
                this.Y0.setDuration(380L);
                this.Y0.start();
                return;
            }
            if (z10 && this.S0 && ((qiVar = this.f29427y0) == null || qiVar.J())) {
                aiVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            y7Var.setAlpha(f7);
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
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f29363e1;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(4);
                }
                if (this.Q0 != 0 || !this.f29399q1) {
                    w0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.G0;
        di diVar = this.E0;
        diVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            qi qiVar = this.f29427y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
            if ((qiVar == chatAttachAlertPhotoLayout || qiVar == this.f29398q0) && this.f29356c0) {
                bi.n7 n7Var = this.O0;
                alpha = (n7Var.getAlpha() * n7Var.getMeasuredHeight()) + (n7Var.getY() - this.B2.getTop());
            } else {
                alpha = -diVar.getHeight();
            }
            if (Math.abs(this.B2.getTranslationY() - alpha) > 0.5f) {
                this.B2.setTranslationY(alpha);
                this.B2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        g1();
    }

    public final void V1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f7;
        float f10;
        float f11;
        qi qiVar = this.f29427y0;
        int i10 = 0;
        if (qiVar == null) {
            g10 = false;
        } else {
            g10 = qiVar.g();
        }
        ai.t tVar = this.f29367f1;
        tVar.setEnabled(g10);
        qi qiVar2 = this.f29427y0;
        float f12 = 0.5f;
        if (qiVar2 != null) {
            if (qiVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f29430z0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f29359d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        qi qiVar3 = this.f29430z0;
        if (qiVar3 != null) {
            if (qiVar3.g()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29359d0, f12, f7);
        }
        this.f29370g1 = f7;
        if (tVar != null) {
            float f13 = f7 * this.f29373h1;
            tVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            tVar.setVisibility(i10);
        }
    }

    public final void X1(qi qiVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (qiVar != null) {
            zg.e eVar = this.C2;
            if (eVar != null && Build.VERSION.SDK_INT >= 31) {
                eVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = qiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (qiVar == this.f29427y0 && currentItemTop <= qiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (qiVar == this.f29427y0) {
                    T1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.em.D(11.0f, i11, currentItemTop);
                qi qiVar2 = this.f29427y0;
                if (qiVar2 == qiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((qiVar2 instanceof xm) || (this.f29430z0 instanceof xm)) {
                    Object obj = this.f29410t1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f14127f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f29354b2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f29358c2 = i13;
                        return;
                    }
                    return;
                }
                this.f29358c2 = i13;
                iArr[i12] = D;
                a2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f25595a.length() <= 0) {
            return;
        }
        this.f29427y0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        bi.y yVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
        if (chatAttachAlertPhotoLayout != null && (yVar = this.f29353b1) != null) {
            int i10 = 0;
            if (this.f29399q1 && this.f29375i0 && this.f29427y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            yVar.f3951f = z12;
            if (!z10) {
                ((d6) yVar.f3952g).a(z12);
            }
            yVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.w0 w0Var = this.f29357c1;
            if (z10 && this.f29399q1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(wr.h).withEndAction(new sh(this, z11, 0)).start();
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
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            w0Var.setScaleX(f7);
            if (z11) {
                f12 = 1.0f;
            }
            w0Var.setScaleY(f12);
        }
    }

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.Z0():void");
    }

    public final void Z1(boolean z10) {
        boolean z11;
        float f7;
        qi qiVar = this.f29378j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f29398q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f29401r;
                if (f6Var == null) {
                    f6Var = this.resourcesProvider;
                }
                ?? qiVar2 = new qi(context, f6Var, this);
                qiVar2.f29084y = 0.0f;
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
                qiVar2.f29079n = f6Var;
                qiVar2.f26424f = true;
                qiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = qiVar2.f26422b.X0.n();
                TextView textView = new TextView(context);
                qiVar2.f29083x = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = qiVar2.f26421a;
                dm dmVar = new dm(qiVar2, context, n10, f6Var2, 1);
                y7 y7Var = qiVar2.f26422b.X0;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                y7Var.addView(dmVar, 0, w7.a6.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                dmVar.addView(textView, w7.a6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.y1 y1Var = new bi.y1(qiVar2, context, f6Var2, 13);
                qiVar2.f29080r = y1Var;
                y1Var.setAdapter(new org.telegram.ui.w7(qiVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                qiVar2.f29081s = c0Var;
                y1Var.setLayoutManager(c0Var);
                y1Var.setClipChildren(false);
                y1Var.setClipToPadding(false);
                y1Var.setOverScrollMode(2);
                y1Var.setVerticalScrollBarEnabled(false);
                wm wmVar = new wm(qiVar2, context);
                qiVar2.v = wmVar;
                wmVar.setClipToPadding(true);
                wmVar.setClipChildren(true);
                qiVar2.addView(y1Var, w7.a6.c(-1.0f, -1));
                qiVar2.P = qiVar2.f26422b.f29378j0;
                wmVar.f28793c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qiVar2.P;
                wmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                wmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                wmVar.c();
                UndoView undoView = new UndoView(context, null, false, qiVar2.f26422b.f29401r);
                qiVar2.f29082w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                qiVar2.addView(undoView, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                qiVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f29398q0 = qiVar2;
                qiVar2.bringToFront();
            }
            qi qiVar3 = this.f29427y0;
            xm xmVar = this.f29398q0;
            if (qiVar3 != xmVar) {
                qiVar = xmVar;
            }
            Q1(qiVar);
            return;
        }
        Q1(qiVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.eo) p2Var).a(), p2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f29403r1.invalidate();
        bi.n7 n7Var = this.O0;
        n7Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
        if (chatAttachAlertPhotoLayout != null) {
            yl ylVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (ylVar != null && ylVar.getFastScroll() != null) {
                cl0 fastScroll = ylVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f21018p1;
                if (this.f29356c0) {
                    i10 = (int) (n7Var.getAlpha() * n7Var.getMeasuredHeight());
                }
                fastScroll.f22166h0 = currentActionBarHeight + i10;
                ylVar.getFastScroll().invalidate();
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
        bi biVar = this.f29428y1;
        if (biVar == null) {
            return;
        }
        int childCount = biVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            biVar.getChildAt(i20);
        }
        boolean z11 = this.f29374h2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.j6.f18007hg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        }
        this.f29379j1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.j6.f18007hg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        }
        this.f29393o1.setTextColor(getThemedColor(i11));
        this.f29367f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.j6.f18007hg;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.w0 w0Var = this.f29350a1;
        w0Var.setIconColor(themedColor);
        Drawable background = w0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.j6.f18026ig;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.I5;
        }
        org.telegram.ui.ActionBar.j6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.j6.E8;
        w0Var.G(getThemedColor(i21), false);
        w0Var.G(getThemedColor(i21), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f29357c1;
        if (w0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.j6.f18007hg;
            } else {
                i19 = org.telegram.ui.ActionBar.j6.f18034j5;
            }
            w0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f29363e1;
        if (w0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.j6.f18007hg;
            } else {
                i17 = org.telegram.ui.ActionBar.j6.f18034j5;
            }
            w0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = w0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.j6.f18026ig;
            } else {
                i18 = org.telegram.ui.ActionBar.j6.I5;
            }
            org.telegram.ui.ActionBar.j6.w1(getThemedColor(i18), background2);
        }
        di diVar = this.E0;
        org.telegram.ui.ActionBar.f6 f6Var = diVar.M;
        iu iuVar = diVar.f25595a;
        int i22 = diVar.L;
        if (i22 == 0) {
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            int i23 = org.telegram.ui.ActionBar.j6.G6;
            iuVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var));
        } else if (i22 != 2 && i22 != 3) {
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18217t5, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        } else {
            iuVar.setHintTextColor(-1929379841);
            iuVar.setTextColor(-1);
            iuVar.setCursorColor(-1);
            iuVar.setHandlesColor(-1);
            iuVar.setHighlightColor(822083583);
            iuVar.quoteColor = -1;
        }
        diVar.f25597c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
        ju juVar = diVar.d;
        if (juVar != null) {
            juVar.U();
        }
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.j6.f18007hg;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.f18034j5;
        }
        int themedColor2 = getThemedColor(i14);
        y7 y7Var = this.X0;
        y7Var.C(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.j6.f18026ig;
        } else {
            i15 = org.telegram.ui.ActionBar.j6.I5;
        }
        y7Var.A(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.j6.f18007hg;
        } else {
            i16 = org.telegram.ui.ActionBar.j6.f18034j5;
        }
        y7Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        eh.c cVar = this.F2;
        if (cVar.f7517a.getColor() != q12) {
            cVar.a(q12);
            ih.f fVar = this.f29416v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ci ciVar = this.f29420w1;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
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
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18016i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f29427y0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f29397p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f29400q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.d1(boolean):void");
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
        vi viVar = this.A1;
        if (viVar != null) {
            viVar.l();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        if (z10) {
            this.A2 = z10;
        }
        dismiss();
    }

    @Override
    public void dismissInternal() {
        wi wiVar = this.Z1;
        if (wiVar != null) {
            wiVar.y0(new jh(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f29427y0.o(i10);
    }

    public final void e1() {
        float f7 = this.f29355c.e;
        float f10 = (1.0f - this.f29351b.e) * f7;
        this.f29420w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void f1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f29365f.e;
        float b10 = xf.f0.b(this.h.e);
        if (this.R1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        h20.d(this.F0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        ii iiVar = this.I0;
        ai aiVar = this.H0;
        bi.n7 n7Var = this.O0;
        if (n7Var != null && n7Var.getVisibility() == 0 && n7Var.getAlpha() != 0.0f) {
            float f7 = this.f29351b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            iiVar.setAlpha(abs * abs * abs * abs);
            aiVar.setTranslationY(AndroidUtilities.lerp(this.f29371g2, ((n7Var.getTranslationY() + n7Var.getTop()) - aiVar.getTop()) + AndroidUtilities.dp(8.0f), wr.f28822j.getInterpolation(f7)));
            return;
        }
        aiVar.setTranslationY(this.f29371g2);
        iiVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
            if (i10 < qiVarArr.length) {
                qi qiVar = qiVarArr[i10];
                if (qiVar != null && (themeDescriptions = qiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18016i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.S0 = true;
        this.f29424x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.f29382k1;
        if (w0Var != null) {
            this.f29379j1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(ai.c0 c0Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f29379j1;
        textView.setText(string);
        this.S0 = false;
        this.f29424x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.f29375i0 = false;
        this.J = c0Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.f29382k1;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if ((p2Var instanceof org.telegram.ui.eo) && (messagePreviewParams = ((org.telegram.ui.eo) p2Var).f32324f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).e;
        }
        return MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        ai aiVar = this.D0;
        float alpha = 1.0f - aiVar.getAlpha();
        return aiVar.getMeasuredHeight() - (alpha * (aiVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final nu m1() {
        qi qiVar;
        if (this.f29356c0 && ((qiVar = this.f29427y0) == this.f29378j0 || qiVar == this.f29398q0)) {
            return this.P0;
        }
        return this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).a();
        }
        return this.Z;
    }

    public final int o1() {
        qi qiVar = this.f29427y0;
        zn znVar = this.m0;
        if (qiVar == znVar && znVar.E != null) {
            return znVar.getEmojiPadding();
        }
        zn znVar2 = this.f29389n0;
        if (qiVar == znVar2 && znVar2.E != null) {
            return znVar2.getEmojiPadding();
        }
        if (this.f29356c0) {
            return this.P0.getEmojiPadding();
        }
        return this.E0.getEmojiPadding();
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
        y7 y7Var = this.X0;
        if (y7Var.f18389n0) {
            y7Var.h(true);
        } else if (this.f29427y0.i()) {
        } else {
            if (m1() != null && m1().e) {
                m1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f29427y0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
        q91 q91Var = chatAttachAlertPhotoLayout.f21010l0;
        bi.ld ldVar = chatAttachAlertPhotoLayout.f21006j0;
        TextView textView = chatAttachAlertPhotoLayout.f21017p0;
        yl ylVar = chatAttachAlertPhotoLayout.f21020r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == ldVar) {
            if (z10) {
                if (ylVar.getVisibility() == 0) {
                    ldVar.layout(0, org.telegram.messenger.a2.B(222.0f, i13, i16), i14, org.telegram.messenger.a2.B(96.0f, i13, i16));
                    return true;
                }
                ldVar.layout(0, org.telegram.messenger.a2.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (ylVar.getVisibility() == 0) {
                ldVar.layout(org.telegram.messenger.a2.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                ldVar.layout(org.telegram.messenger.a2.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == q91Var) {
            if (z10) {
                if (ylVar.getVisibility() == 0) {
                    q91Var.layout(0, org.telegram.messenger.a2.B(310.0f, i13, i16), i14, org.telegram.messenger.a2.B(260.0f, i13, i16));
                    return true;
                }
                q91Var.layout(0, org.telegram.messenger.a2.B(176.0f, i13, i16), i14, org.telegram.messenger.a2.B(126.0f, i13, i16));
                return true;
            } else if (ylVar.getVisibility() == 0) {
                q91Var.layout(org.telegram.messenger.a2.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                q91Var.layout(org.telegram.messenger.a2.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (ylVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (ylVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != ylVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.a2.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
        nm nmVar = chatAttachAlertPhotoLayout.v;
        yl ylVar = chatAttachAlertPhotoLayout.f21020r;
        fg.a0 a0Var = chatAttachAlertPhotoLayout.f21022s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        im imVar = chatAttachAlertPhotoLayout.P;
        if (view == imVar) {
            if (chatAttachAlertPhotoLayout.f20990b0 && !chatAttachAlertPhotoLayout.f20994d0) {
                imVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            bi.ld ldVar = chatAttachAlertPhotoLayout.f21006j0;
            if (view == ldVar) {
                if (z10) {
                    ldVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                ldVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            q91 q91Var = chatAttachAlertPhotoLayout.f21010l0;
            if (view == q91Var) {
                if (z10) {
                    q91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                q91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == ylVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    ylVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (a0Var.f41598o != 0) {
                        ylVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        nmVar.l();
                    }
                } else {
                    ylVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (a0Var.f41598o != 1) {
                        ylVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        nmVar.l();
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
        this.f29378j0.setTranslationX(0.0f);
        this.f29390n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29400q2 = animatorSet;
        mi miVar = this.f29394o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, miVar, 0.0f, 400.0f));
        this.f29400q2.setDuration(400L);
        this.f29400q2.setStartDelay(20L);
        miVar.set(this, Float.valueOf(0.0f));
        this.f29400q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new hh(this, 2));
        o1.k kVar = this.f29397p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f14117n, 0.0f);
        this.f29397p2 = kVar2;
        if (this.H1 != null) {
            kVar2.f14134u.a(0.75f);
            this.f29397p2.f14134u.b(350.0f);
        } else {
            kVar2.f14134u.a(0.75f);
            this.f29397p2.f14134u.b(350.0f);
        }
        this.f29397p2.f();
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
        gf gfVar = new gf(this, animationNotificationsLocker, this.delegate, 3);
        this.f29397p2.a(new di.q4(2, this, gfVar));
        this.currentSheetAnimation.addListener(new bi.u3(20, this, gfVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new hh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(wr.f28819f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f29427y0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f29427y0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f29366f0 instanceof org.telegram.ui.eo) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f29427y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f29407s1 = true;
        if (!this.M1 && !this.L1) {
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

    public final int p1(int i10) {
        qi qiVar = this.f29430z0;
        int[] iArr = this.f29354b2;
        if (qiVar != null && ((this.f29427y0 instanceof xm) || (qiVar instanceof xm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f29359d0);
        }
        return iArr[i10];
    }

    public final int q1(boolean z10) {
        boolean q6;
        int i10;
        y7 y7Var;
        if (this.f29374h2) {
            return getThemedColor(org.telegram.ui.ActionBar.j6.f18227tg);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Iterator it = this.f29388n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            long longValue = ((Long) gVar.f12879a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        if (z10 && (y7Var = this.X0) != null && y7Var.getVisibility() == 0) {
            a2 *= 1.0f - y7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18016i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.r1():void");
    }

    public final boolean s1() {
        if (this.f29356c0) {
            qi qiVar = this.f29427y0;
            if (qiVar == this.f29378j0 || qiVar == this.f29398q0) {
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
        qi qiVar = this.f29427y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29378j0;
        if (qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f21005i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            this.calcMandatoryInsets = ((org.telegram.ui.eo) p2Var).x9();
        }
        W1();
        this.f29407s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f29387m2) {
            this.f29387m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        wi wiVar = this.Z1;
        if (wiVar != null && !this.f29413u1) {
            boolean e02 = wiVar.e0();
            this.f29413u1 = true;
            bi.c1 c1Var = new bi.c1(this, editTextBoldCursor, z10, 17);
            if (e02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(c1Var, j3);
        }
    }

    public final void u1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int q12 = q1(false);
            org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
            eh.c cVar = this.F2;
            if (cVar.f7517a.getColor() != q12) {
                cVar.a(q12);
                ih.f fVar = this.f29416v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                ci ciVar = this.f29420w1;
                if (ciVar != null) {
                    ciVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        di diVar = this.E0;
        if (diVar != null) {
            diVar.o();
        }
        gi giVar = this.P0;
        if (giVar != null) {
            giVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName;
        if (tL_attachMenuBot != null) {
            userName = tL_attachMenuBot.short_name;
        } else {
            userName = UserObject.getUserName(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.J1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.f17342id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        d2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 21));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
            if (i10 < qiVarArr.length) {
                qi qiVar = qiVarArr[i10];
                if (qiVar != null) {
                    qiVar.x();
                }
                i10++;
            } else {
                this.f29368f2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f29368f2 = false;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.e0();
        }
        vi viVar = this.A1;
        if (viVar != null) {
            viVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (p2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            MessageSuggestionParams messageSuggestionParams = eoVar.f32336g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!xh.v5.U(i10, messageSuggestionParams.amount)) {
                eoVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f29405s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.I0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                O1(p2Var);
                return;
            }
            return;
        }
        if (this.H1 == null && (p2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) p2Var;
            if (eoVar2.c()) {
                d5.M(getContext(), eoVar2.a(), new gh(this, 12), this.resourcesProvider);
                return;
            }
        }
        qi qiVar = this.f29427y0;
        if (qiVar != this.f29378j0 && qiVar != this.f29398q0) {
            if (!qiVar.I(0, true, 0, s1(), this.N0)) {
                this.A2 = true;
                dismiss();
                return;
            }
            return;
        }
        G1(0, true, 0, s1(), this.N0);
    }

    @Override
    public final void dismiss() {
        if (this.f29427y0.n() || isDismissed()) {
            return;
        }
        di diVar = this.E0;
        if (diVar != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        gi giVar = this.P0;
        if (giVar != null) {
            AndroidUtilities.hideKeyboard(giVar.getEditText());
        }
        this.f29423x0.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.f29366f0;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        if (!this.A2 && p2Var != null && this.f29427y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.f29432z2) {
                return;
            }
            this.f29432z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f17528a.setOnCancelListener(new mh(this, 0));
            d1 d1Var = new d1(this, 4);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.N = d1Var;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.f29419w0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null && this.f29427y0 != qiVar) {
                qiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7), 0), true, (AndroidUtilities.IntColorCallback) new gh(this, 11));
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
        this.f29377i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override
    public final void B(float f7, int i10) {
    }

    public yi(Activity activity, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11) {
        this(activity, p2Var, z10, z11, true, null);
    }
}
