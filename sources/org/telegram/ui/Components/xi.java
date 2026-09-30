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
import org.telegram.ui.ej1;
public class xi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, le.e {
    public static final int O2 = 0;
    public final ch.d A0;
    public final ui A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.k C0;
    public final RadialProgressView C1;
    public final ah.h C2;
    public final zh D0;
    public boolean D1;
    public final fh.d D2;
    public final i0 E;
    public final ci E0;
    public final p6 E1;
    public final fh.d E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final fh.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final ah.c G2;
    public boolean H;
    public final zh H0;
    public MessageObject H1;
    public final ah.c H2;
    public int I;
    public final hi I0;
    public boolean I1;
    public final mh I2;
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
    public final ci.m6 O0;
    public boolean O1;
    public boolean P;
    public final fi P0;
    public boolean P1;
    public w40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public tt R0;
    public boolean R1;
    public final fe0 S;
    public boolean S0;
    public int S1;
    public yn T;
    public boolean T0;
    public boolean T1;
    public y40 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public ik X;
    public final y7 X0;
    public ValueAnimator X1;
    public gj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public vi Z1;
    public boolean f30253a0;
    public final org.telegram.ui.ActionBar.u0 f30254a1;
    public in a2;
    public final le.c f30255b;
    public final ah.d f30256b0;
    public final ci.u f30257b1;
    public final int[] f30258b2;
    public final le.c f30259c;
    public boolean f30260c0;
    public final org.telegram.ui.ActionBar.u0 f30261c1;
    public int f30262c2;
    public final le.c d;
    public float f30263d0;
    public ci.e4 f30264d1;
    public float f30265d2;
    public final le.c e;
    public final li f30266e0;
    public final org.telegram.ui.ActionBar.u0 f30267e1;
    public float f30268e2;
    public final le.c f30269f;
    public final org.telegram.ui.ActionBar.m2 f30270f0;
    public final bi.o f30271f1;
    public boolean f30272f2;
    public final boolean f30273g0;
    public float f30274g1;
    public float f30275g2;
    public final le.c h;
    public of f30276h0;
    public float f30277h1;
    public final boolean f30278h2;
    public boolean f30279i0;
    public final zh f30280i1;
    public boolean f30281i2;
    public final ChatAttachAlertPhotoLayout f30282j0;
    public final TextView f30283j1;
    public final ArrayList f30284j2;
    public bk f30285k0;
    public final org.telegram.ui.ActionBar.u0 f30286k1;
    public final Rect f30287k2;
    public jj f30288l0;
    public final LinearLayout l1;
    public float f30289l2;
    public xn m0;
    public final ImageView f30290m1;
    public boolean f30291m2;
    public final le.m f30292n;
    public xn f30293n0;
    public final LinearLayout f30294n1;
    public int f30295n2;
    public jl f30296o0;
    public final TextView f30297o1;
    public final li f30298o2;
    public rk f30299p0;
    public float f30300p1;
    public o1.k f30301p2;
    public tm f30302q0;
    public boolean f30303q1;
    public AnimatorSet f30304q2;
    public org.telegram.ui.un f30305r;
    public mj f30306r0;
    public final ni f30307r1;
    public boolean f30308r2;
    public final p6 f30309s;
    public hg.k0 f30310s0;
    public boolean f30311s1;
    public boolean f30312s2;
    public sk f30313t0;
    public Object f30314t1;
    public el f30315t2;
    public sk f30316u0;
    public boolean f30317u1;
    public boolean f30318u2;
    public final p6 v;
    public ii.r f30319v0;
    public final jh.f f30320v1;
    public boolean f30321v2;
    public final ImageView f30322w;
    public final pi[] f30323w0;
    public final bi f30324w1;
    public File f30325w2;
    public final i0 f30326x;
    public final LongSparseArray f30327x0;
    public final zh f30328x1;
    public double[] f30329x2;
    public final ImageView f30330y;
    public pi f30331y0;
    public final ai f30332y1;
    public boolean f30333y2;
    public pi f30334z0;
    public final s4.c0 f30335z1;
    public boolean f30336z2;

    public xi(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        TextPaint textPaint;
        float f7;
        bi.o oVar;
        tr trVar = tr.h;
        this.f30255b = new le.c(0, this, trVar, 380L, false);
        this.f30259c = new le.c(1, this, trVar, 380L, false);
        this.d = new le.c(2, this, trVar, 380L, false);
        this.e = new le.c(3, this, trVar, 380L, false);
        this.f30269f = new le.c(4, this, trVar, 380L, true);
        this.h = new le.c(5, this, trVar, 320L, false);
        le.m mVar = new le.m(new fh(this, 1), trVar, 380L);
        this.f30292n = mVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f30263d0 = 0.0f;
        this.f30266e0 = new li(this, 0);
        this.f30279i0 = false;
        pi[] piVarArr = new pi[11];
        this.f30323w0 = piVarArr;
        this.f30327x0 = new LongSparseArray();
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
        this.f30258b2 = new int[2];
        new Paint(1);
        this.f30281i2 = false;
        ArrayList arrayList = new ArrayList();
        this.f30284j2 = arrayList;
        Rect rect = new Rect();
        this.f30287k2 = rect;
        this.f30298o2 = new li(this, 1);
        this.f30308r2 = true;
        this.f30312s2 = false;
        this.f30336z2 = false;
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
        fh.c cVar = new fh.c();
        this.F2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C2 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.E2 = dVar;
            dVar.k(new ka.c(this, 9));
            fh.d dVar2 = new fh.d(null);
            this.D2 = dVar2;
            dVar2.k(new k2.u(this, 12));
            ah.c cVar2 = new ah.c(dVar);
            this.G2 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.H2 = cVar3;
            cVar3.f427i = LiteMode.isEnabled(262144);
        } else {
            this.C2 = null;
            this.D2 = null;
            this.E2 = null;
            this.G2 = new ah.c(cVar);
            this.H2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.I2 = new mh(this, 0);
        this.f30278h2 = z10;
        this.f30273g0 = (m2Var instanceof org.telegram.ui.wn) && m2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30270f0 = m2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ni niVar = new ni(this, context);
        this.f30307r1 = niVar;
        niVar.setDelegate(new oi(this));
        this.containerView = niVar;
        niVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        y7 y7Var = new y7(this, context, d6Var, 1);
        this.X0 = y7Var;
        y7Var.S0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(false));
        int i12 = org.telegram.ui.ActionBar.h6.f19182j5;
        y7Var.B(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.h6.I5;
        y7Var.A(getThemedColor(i13), false);
        y7Var.setTitleColor(getThemedColor(i12));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 8));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
        this.f30254a1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new fh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
        this.f30261c1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f30257b1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        u0Var3.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 6, -1));
        u0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
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
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        w7.a6.a(oVar2);
        this.f30271f1 = oVar2;
        W1();
        if (m2Var != null) {
            textPaint = textPaint2;
            u0Var = u0Var3;
            oVar = oVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
            this.f30267e1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 6, -1));
            u0Var4.setOnClickListener(new ai.j3(5, this, z11));
        } else {
            u0Var = u0Var3;
            textPaint = textPaint2;
            f7 = 14.0f;
            oVar = oVar2;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
        this.f30286k1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 3, -1));
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final xi f25771b;

            {
                this.f25771b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.wn wnVar;
                switch (r3) {
                    case 0:
                        final xi xiVar = this.f25771b;
                        ci ciVar = xiVar.E0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(ciVar.getText());
                            e0Var.f23796j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ci ciVar2 = xiVar.E0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fi fiVar = xiVar.P0;
                                            fiVar.setText(charSequence);
                                            fiVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = xiVar.Z;
                            if (xiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            oh ohVar = new oh(xiVar, 0);
                            e0Var.f23798l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23799n0 = ohVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final xi xiVar2 = this.f25771b;
                        fi fiVar = xiVar2.P0;
                        if (fiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(fiVar.getText());
                            e0Var2.f23796j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ci ciVar2 = xiVar2.E0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fi fiVar2 = xiVar2.P0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = xiVar2.Z;
                            if (xiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            oh ohVar2 = new oh(xiVar2, 1);
                            e0Var2.f23798l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23799n0 = ohVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        xi xiVar3 = this.f25771b;
                        xiVar3.f30286k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = xiVar3.f30270f0;
                        t12.K2(null, m2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i14 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i14;
                        t13.f31373n = z15;
                        if (!xiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(xiVar3.J1, "webp");
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
                        yh yhVar = new yh(xiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            wnVar = (org.telegram.ui.wn) m2Var2;
                        } else {
                            wnVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, yhVar, wnVar);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        zh zhVar = new zh(this, context, 0);
        this.f30280i1 = zhVar;
        zhVar.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        zhVar.setAlpha(0.0f);
        zhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f30283j1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.y5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f30290m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.y5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        zhVar.addView(linearLayout, w7.y5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30294n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f30297o1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.y5.q(-2, -2, 16));
        zhVar.addView(linearLayout2, w7.y5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.f30282j0 = chatAttachAlertPhotoLayout;
        piVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f30331y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30320v1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.y5.g());
        this.containerView.addView(zhVar, w7.y5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.O0 = m6Var;
        this.containerView.addView(m6Var, w7.y5.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.y5.c(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.y5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f30267e1;
        if (u0Var6 != null) {
            this.containerView.addView(u0Var6, w7.y5.e(48, 48, 53));
        }
        zhVar.addView(u0Var5, w7.y5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.y5.e(-2, 48, 53));
        zh zhVar2 = new zh(this, context, 1);
        this.f30328x1 = zhVar2;
        ai aiVar = new ai(context, 0);
        this.f30332y1 = aiVar;
        aiVar.setClipChildren(true);
        aiVar.setClipToPadding(false);
        ui uiVar = new ui(this, context);
        this.A1 = uiVar;
        aiVar.setAdapter(uiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f30335z1 = c0Var;
        aiVar.setLayoutManager(c0Var);
        aiVar.setVerticalScrollBarEnabled(false);
        aiVar.setHorizontalScrollBarEnabled(false);
        aiVar.setItemAnimator(null);
        aiVar.setLayoutAnimation(null);
        aiVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        aiVar.f31035z2 = true;
        aiVar.setOverScrollMode(2);
        ah.c cVar5 = this.G2;
        hh.k kVar = new hh.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        cVar5.f425f = kVar;
        cVar5.f426g = viewGroup2;
        ah.c cVar6 = this.H2;
        hh.k kVar2 = new hh.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        cVar6.f425f = kVar2;
        cVar6.f426g = viewGroup3;
        hh.k kVar3 = new hh.k(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        cVar4.f425f = kVar3;
        cVar4.f426g = viewGroup4;
        bi biVar = new bi(this, context, 0);
        this.f30324w1 = biVar;
        ah.d dVar3 = new ah.d(cVar4.c(biVar, null, false));
        this.f30256b0 = dVar3;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        dVar3.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(biVar, w7.y5.g());
        ch.d c10 = this.G2.c(zhVar2, eh.b.f(d6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        zhVar2.setBackground(c10);
        aiVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        aiVar.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f47219a;
        aiVar.setOutlineProvider(new yf.h0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        aiVar.setImportantForAccessibility(1);
        zhVar2.addView(aiVar, w7.y5.g());
        this.containerView.addView(zhVar2, w7.y5.e(-1, 70, 81));
        aiVar.setOnItemClickListener(new ai.n6(9, this, d6Var));
        aiVar.setOnItemLongClickListener(new fh(this, 3));
        p6 p6Var = new p6(context, true, false, true);
        this.E1 = p6Var;
        p6Var.setVisibility(8);
        p6Var.setAlpha(0.0f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        p6Var.setPadding(dp, 0, dp, 0);
        p6Var.setTextSize(AndroidUtilities.dp(f7));
        p6Var.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        this.containerView.addView(p6Var, w7.y5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.y5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.F0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f19478z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        zh zhVar3 = new zh(this, context, 2);
        this.D0 = zhVar3;
        hg.k kVar4 = new hg.k(this, context);
        this.C0 = kVar4;
        zhVar3.addView(kVar4, w7.y5.e(-1, -1, 119));
        ch.d c11 = this.H2.c(niVar, eh.b.n(d6Var), false);
        this.A0 = c11;
        c11.f4290m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f4287j.f4273g = 0.4f;
        c11.k();
        ch.d c12 = this.G2.c(kVar4, eh.b.n(d6Var), false);
        this.B0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        kVar4.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        zhVar3.setWillNotDraw(false);
        zhVar3.setVisibility(4);
        zhVar3.setAlpha(0.0f);
        this.containerView.addView(zhVar3, w7.y5.e(-1, -2, 83));
        zhVar3.setOnTouchListener(new bi.d(13));
        p6 p6Var2 = new p6(context, false, false, false);
        this.f30309s = p6Var2;
        p6Var2.setAllowCancel(true);
        p6Var2.setScaleProperty(0.6f);
        p6Var2.setVisibility(8);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i14 = org.telegram.ui.ActionBar.h6.f19459y6;
        p6Var2.setTextColor(getThemedColor(i14));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        kVar4.addView(p6Var2, w7.y5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30322w = imageView4;
        i0 i0Var = new i0(context);
        this.f30326x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.h6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        int i16 = org.telegram.ui.ActionBar.h6.f19165i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        kVar4.addView(imageView4, w7.y5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25771b;

            {
                this.f25771b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.wn wnVar;
                switch (r3) {
                    case 0:
                        final xi xiVar = this.f25771b;
                        ci ciVar = xiVar.E0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(ciVar.getText());
                            e0Var.f23796j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ci ciVar2 = xiVar.E0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fi fiVar2 = xiVar.P0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = xiVar.Z;
                            if (xiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            oh ohVar = new oh(xiVar, 0);
                            e0Var.f23798l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23799n0 = ohVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final xi xiVar2 = this.f25771b;
                        fi fiVar = xiVar2.P0;
                        if (fiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(fiVar.getText());
                            e0Var2.f23796j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ci ciVar2 = xiVar2.E0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fi fiVar2 = xiVar2.P0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = xiVar2.Z;
                            if (xiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            oh ohVar2 = new oh(xiVar2, 1);
                            e0Var2.f23798l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23799n0 = ohVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        xi xiVar3 = this.f25771b;
                        xiVar3.f30286k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = xiVar3.f30270f0;
                        t12.K2(null, m2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i142;
                        t13.f31373n = z15;
                        if (!xiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(xiVar3.J1, "webp");
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
                        yh yhVar = new yh(xiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            wnVar = (org.telegram.ui.wn) m2Var2;
                        } else {
                            wnVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, yhVar, wnVar);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
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
        ci ciVar = new ci(this, context, niVar, d6Var);
        this.E0 = ciVar;
        ciVar.J = true;
        ciVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        ciVar.s();
        ciVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        ciVar.getEditText().addTextChangedListener(new ei(this));
        kVar4.addView(ciVar, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        kVar4.setClipChildren(false);
        zhVar3.setClipChildren(false);
        ciVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        fi fiVar = new fi(this, context, niVar, d6Var);
        this.P0 = fiVar;
        fiVar.J = true;
        fiVar.getEditText().addTextChangedListener(new gi(this, m2Var));
        fiVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        fiVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        fiVar.getEditText().setTextSize(1, 17.0f);
        fiVar.getEmojiButton().setLayoutParams(w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        fiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(fiVar, w7.y5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        ciVar.addView(imageView3, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ch.d c13 = this.G2.c(m6Var, eh.b.n(d6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        m6Var.setBackground(c13);
        m6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        p6 p6Var3 = new p6(context, false, false, false);
        this.v = p6Var3;
        p6Var3.setScaleProperty(0.6f);
        p6Var3.setVisibility(8);
        p6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var3.setTextColor(getThemedColor(i14));
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setGravity(17);
        p6Var3.setAllowCancel(true);
        m6Var.addView(p6Var3, w7.y5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Xd), mode2));
        fiVar.addView(imageView5, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30330y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.y5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25771b;

            {
                this.f25771b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.wn wnVar;
                switch (r3) {
                    case 0:
                        final xi xiVar = this.f25771b;
                        ci ciVar2 = xiVar.E0;
                        if (ciVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(ciVar2.getText());
                            e0Var.f23796j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ci ciVar22 = xiVar.E0;
                                            ciVar22.setText(charSequence);
                                            ciVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fi fiVar2 = xiVar.P0;
                                            fiVar2.setText(charSequence);
                                            fiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = xiVar.Z;
                            if (xiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            oh ohVar = new oh(xiVar, 0);
                            e0Var.f23798l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23799n0 = ohVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final xi xiVar2 = this.f25771b;
                        fi fiVar2 = xiVar2.P0;
                        if (fiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(fiVar2.getText());
                            e0Var2.f23796j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            ci ciVar22 = xiVar2.E0;
                                            ciVar22.setText(charSequence);
                                            ciVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fi fiVar22 = xiVar2.P0;
                                            fiVar22.setText(charSequence);
                                            fiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = xiVar2.Z;
                            if (xiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            oh ohVar2 = new oh(xiVar2, 1);
                            e0Var2.f23798l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23799n0 = ohVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        xi xiVar3 = this.f25771b;
                        xiVar3.f30286k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = xiVar3.f30270f0;
                        t12.K2(null, m2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i142;
                        t13.f31373n = z15;
                        if (!xiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(xiVar3.J1, "webp");
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
                        yh yhVar = new yh(xiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            wnVar = (org.telegram.ui.wn) m2Var2;
                        } else {
                            wnVar = null;
                        }
                        t14.g2(arrayList3, 0, 11, false, yhVar, wnVar);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
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
        zh zhVar4 = new zh(this, context, 3);
        this.H0 = zhVar4;
        zhVar4.setFocusable(true);
        zhVar4.setFocusableInTouchMode(true);
        zhVar4.setVisibility(4);
        zhVar4.setScaleX(0.2f);
        zhVar4.setScaleY(0.2f);
        zhVar4.setAlpha(0.0f);
        zhVar4.setClipChildren(false);
        zhVar4.setClipToPadding(false);
        this.containerView.addView(zhVar4, w7.y5.e(110, 50, 85));
        hi hiVar = new hi(R.drawable.send_plane_24, context, d6Var, this);
        this.I0 = hiVar;
        hiVar.setImportantForAccessibility(2);
        zhVar4.addView(hiVar, w7.y5.e(-1, -1, 119));
        hiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        hiVar.I = dp2;
        hiVar.J = dp3;
        hiVar.M = AndroidUtilities.dp(7.0f);
        hiVar.N = AndroidUtilities.dp(6.0f);
        hiVar.f29948h0 = true;
        hiVar.setOnClickListener(new View.OnClickListener(this) {
            public final xi f25449b;

            {
                this.f25449b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f25449b;
                        long j3 = xiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) xiVar.f30327x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        xi xiVar2 = this.f25449b;
                        boolean z14 = xiVar2.f30260c0;
                        if (!z14) {
                            xiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f25449b;
                        boolean z15 = xiVar3.f30260c0;
                        if (z15) {
                            xiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25449b.z1();
                        return;
                    case 4:
                        this.f25449b.f30254a1.M(null, null);
                        return;
                    case 5:
                        xi.s(this.f25449b);
                        return;
                    case 6:
                        pi piVar = this.f25449b.f30331y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25449b.f30286k1.M(null, null);
                        return;
                    default:
                        xi xiVar4 = this.f25449b;
                        if (xiVar4.f30331y0 != xiVar4.f30302q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar4.Z1(z13);
                        return;
                }
            }
        });
        hiVar.setOnLongClickListener(new org.telegram.ui.eg(this, context, d6Var, m2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        bi biVar2 = new bi(this, context, 1);
        biVar2.setAlpha(0.0f);
        biVar2.setScaleX(0.2f);
        biVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        gl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.G2;
        dh.e n10 = eh.b.n(d6Var);
        zl0 zl0Var = fastScroll.f24611o0;
        ch.d c14 = cVar7.c(zl0Var.f30995f1, n10, false);
        fastScroll.f24600e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f24600e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(zl0Var.f30995f1, n10, false);
        fastScroll.f24602f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f24602f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f24602f0.q(AndroidUtilities.dp(f7));
        fe0 fe0Var = new fe0(context);
        this.S = fe0Var;
        this.containerView.addView(fe0Var, w7.y5.c(-1.0f, -1));
        dh.e eVar = new dh.e(d6Var);
        eVar.e = new fh(this, 4);
        eVar.f7735c = new fh(this, 5);
        eVar.d = new fh(this, 6);
        eVar.f7734b = new fh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7737n = dpf2;
        eVar.f7738r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7736f = dpf23;
        eVar.h = dpf24;
        y7Var.M(this.G2, eVar, false);
        mVar.i(1L, false);
    }

    public static void M(xi xiVar) {
        boolean q6;
        int i10;
        int i11;
        y7 y7Var = xiVar.X0;
        jh.f fVar = xiVar.f30320v1;
        if (fVar != null && y7Var != null) {
            org.telegram.ui.ActionBar.d6 d6Var = xiVar.resourcesProvider;
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
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

    public static void Q(xi xiVar) {
        ci.i iVar = new ci.i(xiVar, xiVar.getContext(), xiVar.Z, LaunchActivity.R(), xiVar.resourcesProvider, 1);
        xiVar.B2 = iVar;
        iVar.p(new n2.e(xiVar, 6));
        ViewGroup viewGroup = xiVar.containerView;
        viewGroup.addView(xiVar.B2, viewGroup.indexOfChild(xiVar.D0), w7.y5.e(-1, -1, 83));
        ci.i iVar2 = xiVar.B2;
        iVar2.getAdapter().f9810c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        boolean z10 = true;
        if (m2Var instanceof org.telegram.ui.wn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
            gg.k1 adapter = iVar2.getAdapter();
            wnVar.i();
            TLRPC.Chat chat = wnVar.e;
            adapter.getClass();
            adapter.f9821l0 = chat;
            iVar2.getAdapter().W(wnVar.Z7);
            gg.k1 adapter2 = iVar2.getAdapter();
            if (wnVar.e == null) {
                z10 = false;
            }
            adapter2.f9813e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f9813e0 = false;
        }
        iVar2.getAdapter().f9815f0 = false;
        xiVar.U1();
    }

    public static void m(xi xiVar, ValueAnimator valueAnimator) {
        xiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = xiVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static void n(xi xiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        xiVar.currentSheetAnimation = null;
        xiVar.f30301p2 = null;
        animationNotificationsLocker.unlock();
        xiVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (xiVar.useHardwareLayer) {
            xiVar.container.setLayerType(0, null);
        }
        if (xiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = xiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            xiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(xi xiVar, int i10) {
        xiVar.navBarColorKey = -1;
        xiVar.navBarColor = i10;
        xiVar.containerView.invalidate();
    }

    public static void p(xi xiVar) {
        o1.k kVar = xiVar.f30301p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(xiVar.containerView, o1.h.f15532n, 0.0f);
        xiVar.f30301p2 = kVar2;
        kVar2.f15549u.a(1.5f);
        xiVar.f30301p2.f15549u.b(1500.0f);
        xiVar.f30301p2.f();
    }

    public static boolean q(org.telegram.ui.Components.xi r46, android.content.Context r47, org.telegram.ui.ActionBar.d6 r48, org.telegram.ui.ActionBar.m2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.q(org.telegram.ui.Components.xi, android.content.Context, org.telegram.ui.ActionBar.d6, org.telegram.ui.ActionBar.m2, android.view.View):boolean");
    }

    public static void r(xi xiVar, org.telegram.messenger.video.o oVar) {
        AnimatorSet animatorSet = xiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            oVar.run();
        }
    }

    public static void s(xi xiVar) {
        int i10;
        if (xiVar.f30282j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f30282j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22144s1;
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
        xiVar.Y1(true);
        org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30261c1;
        ci.e4 e4Var = xiVar.f30264d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = new ci.e4(xiVar.getContext(), 1);
        xiVar.f30264d1 = e4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        xiVar.f30264d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        xiVar.f30264d1.m(1.0f, -((xiVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        xiVar.f30264d1.setTranslationY(xiVar.f30254a1.getTranslationY());
        ci.e4 e4Var3 = xiVar.f30264d1;
        e4Var3.f4623l0 = new ld(5, xiVar, e4Var2);
        xiVar.containerView.addView(e4Var3, w7.y5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        xiVar.f30264d1.u();
    }

    public static void t(xi xiVar, boolean z10, ih ihVar) {
        Integer num;
        xiVar.f30331y0.s(1.0f);
        xiVar.f30334z0.s(1.0f);
        xiVar.f30331y0.k(xiVar.f30289l2);
        xiVar.f30334z0.k(xiVar.f30289l2);
        xiVar.containerView.invalidate();
        y7 y7Var = xiVar.X0;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        y7Var.setTag(num);
        ihVar.run();
    }

    public static void v(xi xiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int i10;
        xi xiVar2 = xiVar;
        ai aiVar = xiVar2.f30332y1;
        pi[] piVarArr = xiVar2.f30323w0;
        org.telegram.ui.ActionBar.m2 m2Var2 = xiVar2.f30270f0;
        if (m2Var2 == null) {
            m2Var = LaunchActivity.R();
        } else {
            m2Var = m2Var2;
        }
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (view instanceof ri) {
                Activity parentActivity = m2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (xiVar2.L1 || xiVar2.M1 || !xiVar2.a1()) {
                        if (!xiVar2.L1 && !xiVar2.M1) {
                            yn ynVar = new yn(1, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar;
                            xiVar2.Q1(ynVar);
                        }
                        xiVar2.Q1(xiVar2.f30282j0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (xiVar2.N1 || !xiVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        xiVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (xiVar2.K1 || !xiVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        xiVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (xiVar2.Q1 || !xiVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && xiVar2.Q1 && xiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        xiVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((xiVar2.Q1 || !xiVar2.a1()) && AndroidUtilities.isMapsInstalled(m2Var2)) {
                        if (!xiVar2.Q1) {
                            yn ynVar2 = new yn(6, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar2;
                            xiVar2.Q1(ynVar2);
                        } else {
                            if (xiVar2.f30296o0 == null) {
                                jl jlVar = new jl(xiVar2, xiVar2.getContext(), d6Var, (xiVar2.H || xiVar2.R1) ? false : false);
                                xiVar2.f30296o0 = jlVar;
                                piVarArr[5] = jlVar;
                                el elVar = xiVar2.f30315t2;
                                if (elVar != null) {
                                    jlVar.setDelegate(elVar);
                                } else {
                                    jlVar.setDelegate(new fh(xiVar2, 9));
                                }
                            }
                            xiVar2.Q1(xiVar2.f30296o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (xiVar2.O1 || !xiVar2.a1()) {
                        if (!xiVar2.O1) {
                            yn ynVar3 = new yn(9, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar3;
                            xiVar2.Q1(ynVar3);
                        } else {
                            xiVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (xiVar2.f30310s0 == null) {
                        hg.k0 k0Var = new hg.k0(xiVar2.getContext(), xiVar2.resourcesProvider, xiVar2);
                        xiVar2.f30310s0 = k0Var;
                        piVarArr[7] = k0Var;
                        k0Var.setupBlurredSearchField(xiVar2.G2);
                    }
                    xiVar2.Q1(xiVar2.f30310s0);
                } else if (i10 == 12) {
                    if (xiVar2.P1 || !xiVar2.a1()) {
                        if (!xiVar2.P1) {
                            yn ynVar4 = new yn(9, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar4;
                            xiVar2.Q1(ynVar4);
                        } else {
                            if (xiVar2.f30293n0 == null) {
                                xn xnVar = new xn(xiVar, xiVar.getContext(), true, d6Var, null);
                                xiVar2 = xiVar;
                                xiVar2.f30293n0 = xnVar;
                                piVarArr[1] = xnVar;
                                xnVar.setDelegate(new fh(xiVar2, 10));
                            }
                            xiVar2.Q1(xiVar2.f30293n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (xiVar2.f30316u0 == null) {
                        sk skVar = new sk(xiVar2, xiVar2.getContext(), d6Var, true);
                        xiVar2.f30316u0 = skVar;
                        piVarArr[8] = skVar;
                        skVar.setDelegate(xiVar2.a2);
                    }
                    xiVar2.Q1(xiVar2.f30316u0);
                } else if (i10 == 14) {
                    if (xiVar2.f30313t0 == null) {
                        sk skVar2 = new sk(xiVar2, xiVar2.getContext(), d6Var, false);
                        xiVar2.f30313t0 = skVar2;
                        piVarArr[9] = skVar2;
                        skVar2.setDelegate(xiVar2.a2);
                    }
                    xiVar2.Q1(xiVar2.f30313t0);
                } else if (i10 == 16) {
                    if (xiVar2.f30319v0 == null) {
                        ii.r rVar = new ii.r(xiVar2.J1, xiVar2.getContext(), d6Var, xiVar2);
                        xiVar2.f30319v0 = rVar;
                        piVarArr[10] = rVar;
                    }
                    xiVar2.Q1(xiVar2.f30319v0);
                } else if (view.getTag() instanceof Integer) {
                    xiVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, xiVar2.s1(), false, 0L);
                }
            } else if (view instanceof qi) {
                qi qiVar = (qi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = qiVar.f27659c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        ej1.a(xiVar2.getContext(), new org.telegram.ui.oc(16, xiVar2, qiVar), null);
                    } else {
                        xiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    xiVar2.Z1.j1(qiVar.f27658b);
                    xiVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                aiVar.w0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > aiVar.getMeasuredWidth()) {
                aiVar.w0(i14 - aiVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(xi xiVar) {
        pi piVar;
        tm tmVar;
        xiVar.f30314t1 = null;
        pi piVar2 = xiVar.f30331y0;
        if (piVar2 != xiVar.f30282j0 && (piVar = xiVar.f30334z0) != (tmVar = xiVar.f30302q0) && piVar2 != piVar && piVar2 != tmVar) {
            xiVar.containerView.removeView(piVar2);
        }
        xiVar.f30331y0.setVisibility(8);
        xiVar.f30331y0.q();
        xiVar.f30334z0.F();
        xiVar.f30331y0 = xiVar.f30334z0;
        xiVar.f30334z0 = null;
        int[] iArr = xiVar.f30258b2;
        iArr[0] = iArr[1];
        xiVar.H1(xiVar.f30260c0, false);
        xiVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (i10 == 3) {
            if (this.N1 || !a1()) {
                if (m2Var != null) {
                    activity = m2Var.getParentActivity();
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
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(m2Var)) {
            if (this.f30296o0 == null) {
                jl jlVar = new jl(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : false);
                this.f30296o0 = jlVar;
                this.f30323w0[5] = jlVar;
                el elVar = this.f30315t2;
                if (elVar != null) {
                    jlVar.setDelegate(elVar);
                } else if (m2Var instanceof org.telegram.ui.wn) {
                    jlVar.setDelegate(new fh(this, 16));
                }
            }
            Q1(this.f30296o0);
        }
    }

    public final void B1(boolean z10) {
        if (!this.N1 && z10) {
            yn ynVar = new yn(3, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            Q1(ynVar);
        }
        int i10 = 1;
        if (this.f30288l0 == null) {
            jj jjVar = new jj(getContext(), this.resourcesProvider, this);
            this.f30288l0 = jjVar;
            this.f30323w0[3] = jjVar;
            jjVar.setupBlurredSearchField(this.G2);
            this.f30288l0.setDelegate(new fh(this, 13));
            if (this.H) {
                this.f30288l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            TLRPC.Chat chat = ((org.telegram.ui.wn) m2Var).e;
            jj jjVar2 = this.f30288l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            jjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.f30288l0);
        }
    }

    public final void C1() {
        if (this.f30306r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ?? piVar = new pi(context, d6Var, this);
            piVar.f26305r = AndroidUtilities.dp(80.0f);
            piVar.f26307w = 3;
            ai.w0 w0Var = new ai.w0(piVar, context, d6Var, 11);
            piVar.f26304n = w0Var;
            ab abVar = new ab(piVar, context);
            piVar.v = abVar;
            w0Var.setAdapter(abVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, piVar.f27361a));
            piVar.addView(w0Var, w7.y5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(piVar, 17));
            bi.l lVar = new bi.l(piVar, piVar.f26305r, 1);
            piVar.f26306s = lVar;
            lVar.O = new ci.x1(piVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f30306r0 = piVar;
            piVar.setDelegate(new hb(this, 1));
        }
        Q1(this.f30306r0);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        pi piVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            xn xnVar = this.m0;
            if (xnVar != null && ((piVar = this.f30334z0) == xnVar || this.f30331y0 == xnVar)) {
                if (piVar == xnVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            xn xnVar2 = this.f30293n0;
            if (xnVar2 != null) {
                pi piVar2 = this.f30334z0;
                if (piVar2 == xnVar2 || this.f30331y0 == xnVar2) {
                    if (piVar2 != xnVar2) {
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
            hi hiVar = this.I0;
            if (hiVar != null) {
                hiVar.setEphemeralFactor(f7);
                hiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void D1() {
        boolean z10;
        if (!this.Q1) {
            yn ynVar = new yn(5, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            Q1(ynVar);
        }
        if (this.f30285k0 == null) {
            bk bkVar = new bk(getContext(), this.resourcesProvider, this);
            this.f30285k0 = bkVar;
            this.f30323w0[2] = bkVar;
            bkVar.setupBlurredSearchField(this.G2);
            this.f30285k0.setDelegate(new ji(this));
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            TLRPC.Chat chat = ((org.telegram.ui.wn) m2Var).e;
            bk bkVar2 = this.f30285k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            bkVar2.setMultipleSelectionAllowed(z10);
        }
        Q1(this.f30285k0);
    }

    public final void E1(boolean z10) {
        int i10;
        if (!this.K1 && z10) {
            yn ynVar = new yn(4, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            Q1(ynVar);
        }
        boolean z11 = false;
        if (this.f30299p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            rk rkVar = new rk(i10, getContext(), this.resourcesProvider, this);
            this.f30299p0 = rkVar;
            this.f30323w0[4] = rkVar;
            rkVar.setDelegate(new ki(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f30299p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
            if (m2Var instanceof org.telegram.ui.wn) {
                TLRPC.Chat chat = ((org.telegram.ui.wn) m2Var).e;
                rk rkVar2 = this.f30299p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i11 = -1;
                }
                rkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f30299p0.setMaxSelectedFiles(this.S1);
                rk rkVar3 = this.f30299p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                rkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        rk rkVar4 = this.f30299p0;
        rkVar4.f28041d0 = this.N;
        if (z10) {
            Q1(rkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y7 y7Var = this.X0;
        int i10 = 1;
        if (y7Var.f19572n0) {
            y7Var.h(true);
        }
        this.f30285k0 = null;
        this.f30310s0 = null;
        this.f30288l0 = null;
        this.m0 = null;
        this.f30293n0 = null;
        this.f30296o0 = null;
        this.f30299p0 = null;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i10 < piVarArr.length) {
                pi piVar = piVarArr[i10];
                if (piVar != null) {
                    piVar.m();
                    this.containerView.removeView(piVarArr[i10]);
                    piVarArr[i10] = null;
                }
                i10++;
            } else {
                T1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
            TLRPC.Chat chat = wnVar.e;
            if (wnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.J1).edit();
                edit.putBoolean("silent_" + wnVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f14217f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        pi piVar = this.f30331y0;
        if (piVar != null) {
            i12 = piVar.getSelectedItemsCount();
        }
        return e5.b0(this.J1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                xi xiVar = xi.this;
                xiVar.I1 = true;
                xiVar.Z1.B1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
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
        this.f30255b.a(z10, z11);
        mu m12 = m1();
        this.f30260c0 = z10;
        mu m13 = m1();
        int i11 = 0;
        if (this.D0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        pi piVar = this.f30331y0;
        if (piVar != this.f30282j0 && piVar != this.f30302q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f30260c0 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        ci.m6 m6Var = this.O0;
        hg.k kVar = this.C0;
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
            tr trVar = tr.h;
            duration.setInterpolator(trVar).setUpdateListener(new gh(this, 0)).withEndAction(new Runnable(this) {
                public final xi f24868b;

                {
                    this.f24868b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            xi xiVar = this.f24868b;
                            if (!z14 || !z12) {
                                xiVar.O0.setVisibility(8);
                            }
                            xiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24868b.C0.setVisibility(8);
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
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(trVar).setUpdateListener(new gh(this, 1)).withEndAction(new Runnable(this) {
                public final xi f24868b;

                {
                    this.f24868b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            xi xiVar = this.f24868b;
                            if (!z14 || !z12) {
                                xiVar.O0.setVisibility(8);
                            }
                            xiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24868b.C0.setVisibility(8);
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
            b2();
            kVar.setAlpha((z14 || !z12) ? 0.0f : 0.0f);
            if (z14 || !z12) {
                f12 = kVar.getMeasuredHeight();
            }
            kVar.setTranslationY(f12);
            kVar.setVisibility((z14 || !z12) ? 8 : 8);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(z5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new ih(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f30282j0) != null) {
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f19020a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
        this.f30328x1.setVisibility(8);
        this.f30283j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
        if (chatAttachAlertPhotoLayout != null) {
            xi xiVar = chatAttachAlertPhotoLayout.f27362b;
            chatAttachAlertPhotoLayout.f22160g1 = (xiVar.Q0 == 0 || xiVar.F) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.M1(boolean):void");
    }

    public final void N1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.m2 m2Var) {
        if ((m2Var instanceof org.telegram.ui.wn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.wn) m2Var).e)) {
            new yc(this.f30307r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new ld(6, this, m2Var)).j();
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
        pi piVar;
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
        this.f30259c.a(z10, true);
        zh zhVar = this.D0;
        if (zhVar.getTag() != null) {
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
        zhVar.setTag(num);
        ci ciVar = this.E0;
        if (ciVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(ciVar.getEditText());
        }
        ciVar.k(true);
        this.P0.k(true);
        zh zhVar2 = this.f30328x1;
        zh zhVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                zhVar.setVisibility(0);
            }
            zhVar3.setVisibility(0);
        } else if (this.S0) {
            zhVar2.setVisibility(0);
        }
        pi piVar2 = this.f30331y0;
        if ((piVar2 == this.f30282j0 || piVar2 == this.f30302q0) && this.f30260c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        y7 y7Var2 = this.X0;
        ci.m6 m6Var = this.O0;
        hg.k kVar = this.C0;
        hi hiVar = this.I0;
        float f26 = 0.2f;
        float f27 = 1.0f;
        if (z11) {
            float f28 = 0.0f;
            this.M0 = new AnimatorSet();
            if (z13) {
                m6Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(zhVar, property, f18));
            if (z10 && !z13) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(kVar, property, f19));
            if (z10 && !z13) {
                kVar.setVisibility(0);
                y7Var = y7Var2;
                arrayList.add(ObjectAnimator.ofFloat(kVar, View.TRANSLATION_Y, 0.0f));
            } else {
                y7Var = y7Var2;
            }
            if (z10 && z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m6Var, property, f20));
            Property property2 = View.SCALE_X;
            if (z10) {
                f21 = 1.0f;
            } else {
                f21 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(zhVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(zhVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(zhVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hiVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hiVar, property3, f26));
            if (y7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(zhVar, property4, f28));
            } else if (this.S0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(zhVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(zhVar2, property, f27));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gh(this, 4));
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
            zhVar.setAlpha(f7);
            if (z10 && z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            kVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                kVar.setVisibility(0);
                kVar.setTranslationY(0.0f);
            } else {
                i10 = 0;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.2f;
            }
            zhVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            zhVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            zhVar3.setAlpha(f13);
            if (z10 && z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            m6Var.setVisibility(i11);
            if (z10 && z13) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            m6Var.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.2f;
            }
            hiVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            hiVar.setScaleY(f16);
            if (y7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                zhVar.setTranslationY(dp);
            } else if (this.S0 && ((piVar = this.f30331y0) == null || piVar.J())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                zhVar2.setTranslationY(f17);
            }
            if (!z10) {
                zhVar.setVisibility(4);
                zhVar3.setVisibility(4);
            }
            if (z13) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f30331y0.getSelectedItemsCount());
        }
        hiVar.g(i10, z11);
        if (this.H1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1());
        }
        hiVar.i(j1() + this.f30331y0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ciVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), hiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            ciVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(pi piVar) {
        long j3 = this.W0;
        yn ynVar = this.T;
        if (piVar == ynVar) {
            j3 = ynVar.f30744s;
        } else if (piVar == this.f30282j0) {
            j3 = 1;
        } else if (piVar == this.f30288l0) {
            j3 = 3;
        } else if (piVar == this.f30299p0) {
            j3 = 4;
        } else if (piVar == this.f30285k0) {
            j3 = 5;
        } else if (piVar == this.f30296o0) {
            j3 = 6;
        } else if (piVar == this.m0) {
            j3 = 9;
        } else if (piVar == this.f30306r0) {
            j3 = 10;
        } else if (piVar == this.f30310s0) {
            j3 = 11;
        } else if (piVar == this.f30293n0) {
            j3 = 12;
        } else if (piVar == this.f30313t0) {
            j3 = 14;
        } else if (piVar == this.f30316u0) {
            j3 = 13;
        } else if (piVar == this.f30319v0) {
            j3 = 16;
        }
        R1(piVar, j3, true);
    }

    public final void R1(pi piVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        gm gmVar;
        boolean z12;
        Integer num;
        gm gmVar2;
        int i11;
        int dp;
        Float f7;
        int i12;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f30314t1 == null && this.M0 == null) {
            pi piVar2 = this.f30331y0;
            if (piVar2 == piVar) {
                piVar2.G();
                return;
            }
            int i13 = 0;
            if (piVar == this.f30293n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.x0(this.f30270f0, 39, false).show();
                return;
            }
            int i14 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
            if (i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f30269f.a(z11, z10);
            this.f30292n.i(Long.valueOf(j3), z10);
            this.D1 = false;
            this.B1 = false;
            this.F1 = 0.0f;
            this.E1.setVisibility(8);
            RadialProgressView radialProgressView = this.C1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            zh zhVar = this.f30328x1;
            zhVar.setAlpha(1.0f);
            zhVar.setTranslationY(this.F1);
            int i15 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.f30327x0;
                if (i15 >= longSparseArray.size()) {
                    break;
                }
                ((ei.q4) longSparseArray.valueAt(i15)).setMeasureOffsetY(0);
                i15++;
            }
            this.W0 = j3;
            ai aiVar = this.f30332y1;
            int childCount = aiVar.getChildCount();
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = aiVar.getChildAt(i16);
                if (childAt instanceof ri) {
                    ri riVar = (ri) childAt;
                    i12 = i14;
                    f7 = valueOf;
                    if (riVar.f28027b == riVar.f28028c.W0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    riVar.f28263a.e(z13, true);
                } else {
                    f7 = valueOf;
                    i12 = i14;
                    if (childAt instanceof qi) {
                        ((qi) childAt).a(true);
                    }
                }
                i16++;
                i14 = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int i17 = i14;
            int firstOffset = (this.f30331y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f30258b2[0];
            this.f30334z0 = piVar;
            piVar.getClass();
            boolean z14 = piVar instanceof ii.r;
            jh.f fVar = this.f30320v1;
            if (fVar != null) {
                if (z14) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                fVar.setFadeHeightBottom(dp);
            }
            bi biVar = this.f30324w1;
            if (biVar != null) {
                if (z14) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                biVar.setVisibility(i11);
            }
            if (this.f30334z0.h() != 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            y7 y7Var = this.X0;
            y7Var.setVisibility(i10);
            if (y7Var.f19572n0) {
                y7Var.h(true);
            }
            this.f30331y0.r();
            pi piVar3 = this.f30334z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
            if (piVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.f30334z0.E(this.f30331y0);
            this.f30334z0.setVisibility(0);
            if (piVar.getParent() != null) {
                this.containerView.removeView(this.f30334z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.f30331y0);
            ViewParent parent = this.f30334z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                pi piVar4 = this.f30334z0;
                if (piVar4 != this.f30296o0) {
                    indexOfChild++;
                }
                viewGroup.addView(piVar4, indexOfChild, w7.y5.c(-1.0f, -1));
            }
            ih ihVar = new ih(this, 3);
            pi piVar5 = this.f30331y0;
            boolean z15 = piVar5 instanceof tm;
            li liVar = this.f30266e0;
            if (!z15 && !(this.f30334z0 instanceof tm)) {
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f30334z0.setAlpha(0.0f);
                    this.f30334z0.setTranslationY(AndroidUtilities.dp(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.f30331y0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f30331y0, liVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, View.ALPHA, y7Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(tr.f28636f);
                    animatorSet.addListener(new ii(this, firstOffset, ihVar, 0));
                    this.f30314t1 = animatorSet;
                    liVar.set(this.f30331y0, f10);
                    animatorSet.start();
                } else {
                    piVar5.setAlpha(0.0f);
                    ihVar.run();
                    a2(0);
                    this.containerView.invalidate();
                }
            } else {
                int max = Math.max(this.f30334z0.getWidth(), this.f30331y0.getWidth());
                pi piVar6 = this.f30334z0;
                if (piVar6 instanceof tm) {
                    piVar6.setTranslationX(max);
                    pi piVar7 = this.f30331y0;
                    if ((piVar7 instanceof ChatAttachAlertPhotoLayout) && (gmVar2 = ((ChatAttachAlertPhotoLayout) piVar7).P) != null) {
                        gmVar2.setVisibility(4);
                    }
                } else {
                    this.f30331y0.setTranslationX(-max);
                    pi piVar8 = this.f30334z0;
                    if (piVar8 == chatAttachAlertPhotoLayout && (gmVar = ((ChatAttachAlertPhotoLayout) piVar8).P) != null) {
                        gmVar.setVisibility(0);
                    }
                }
                this.f30334z0.setAlpha(1.0f);
                this.f30331y0.setAlpha(1.0f);
                if (z10) {
                    liVar.set(this.f30331y0, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, piVar, ihVar, 15));
                } else {
                    if (this.f30334z0.getCurrentItemTop() <= piVar.getButtonsHideOffset()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f30331y0.s(1.0f);
                    this.f30334z0.s(1.0f);
                    this.f30331y0.k(this.f30289l2);
                    this.f30334z0.k(this.f30289l2);
                    this.containerView.invalidate();
                    liVar.set(this.f30331y0, Float.valueOf(1.0f));
                    if (z12) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    y7Var.setTag(num);
                    ihVar.run();
                }
            }
            if (this.f30291m2 && !(piVar instanceof ei.q4)) {
                this.f30291m2 = false;
                y7Var.e();
                y7Var.invalidate();
                u1();
            }
            if (i17 != 0 && j3 != 6 && !(piVar instanceof ei.q4)) {
                if (j3 == 4) {
                    i13 = AndroidUtilities.dp(84.0f);
                }
            } else {
                i13 = AndroidUtilities.dp(46.0f);
            }
            y7Var.setForcedMenuWidth(i13);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        xi xiVar;
        if (this.m0 == null) {
            xiVar = this;
            xn xnVar = new xn(xiVar, getContext(), false, this.resourcesProvider, bool);
            xiVar.m0 = xnVar;
            xiVar.f30323w0[1] = xnVar;
            xnVar.setDelegate(new fh(this, 15));
        } else {
            xiVar = this;
        }
        R1(xiVar.m0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        pi piVar;
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
            if (!this.F && !this.T0 && ((this.Q0 != 0 || !this.f30303q1) && this.f30331y0 == this.f30282j0 && (this.L1 || this.M1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f30331y0 == this.T) {
                z12 = false;
            }
            zh zhVar = this.f30328x1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30254a1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.S0 && this.D0.getTag() == null) {
                zhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
            if (m2Var != null) {
                if (z10) {
                    if (this.f30278h2) {
                        i10 = org.telegram.ui.ActionBar.h6.f19380tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19146h5;
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
                this.Y0.playTogether(arrayList);
                this.Y0.addListener(new da(2, this, z10));
                this.Y0.setInterpolator(tr.h);
                this.Y0.setDuration(380L);
                this.Y0.start();
                return;
            }
            if (z10 && this.S0 && ((piVar = this.f30331y0) == null || piVar.J())) {
                zhVar.setVisibility(4);
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f30267e1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.Q0 != 0 || !this.f30303q1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.G0;
        ci ciVar = this.E0;
        ciVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            pi piVar = this.f30331y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
            if ((piVar == chatAttachAlertPhotoLayout || piVar == this.f30302q0) && this.f30260c0) {
                ci.m6 m6Var = this.O0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.B2.getTop());
            } else {
                alpha = -ciVar.getHeight();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f7;
        float f10;
        float f11;
        pi piVar = this.f30331y0;
        int i10 = 0;
        if (piVar == null) {
            g10 = false;
        } else {
            g10 = piVar.g();
        }
        bi.o oVar = this.f30271f1;
        oVar.setEnabled(g10);
        pi piVar2 = this.f30331y0;
        float f12 = 0.5f;
        if (piVar2 != null) {
            if (piVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f30334z0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f30263d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        pi piVar3 = this.f30334z0;
        if (piVar3 != null) {
            if (piVar3.g()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f30263d0, f12, f7);
        }
        this.f30274g1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f30277h1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void X1(pi piVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (piVar != null) {
            ah.h hVar = this.C2;
            if (hVar != null && Build.VERSION.SDK_INT >= 31) {
                hVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = piVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (piVar == this.f30331y0 && currentItemTop <= piVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (piVar == this.f30331y0) {
                    T1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) piVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.ok.D(11.0f, i11, currentItemTop);
                pi piVar2 = this.f30331y0;
                if (piVar2 == piVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((piVar2 instanceof tm) || (this.f30334z0 instanceof tm)) {
                    Object obj = this.f30314t1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f15542f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f30258b2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f30262c2 = i13;
                        return;
                    }
                    return;
                }
                this.f30262c2 = i13;
                iArr[i12] = D;
                a2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f26381a.length() <= 0) {
            return;
        }
        this.f30331y0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f30257b1) != null) {
            int i10 = 0;
            if (this.f30303q1 && this.f30279i0 && this.f30331y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f5595f = z12;
            if (!z10) {
                ((e6) uVar.f5596g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f30261c1;
            if (z10 && this.f30303q1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(tr.h).withEndAction(new rh(this, z11, 0)).start();
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

    public final void Z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.Z0():void");
    }

    public final void Z1(boolean z10) {
        boolean z11;
        float f7;
        pi piVar = this.f30282j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f30302q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f30305r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                ?? piVar2 = new pi(context, d6Var, this);
                piVar2.f28606y = 0.0f;
                piVar2.E = 0.0f;
                piVar2.F = 0.0f;
                piVar2.G = 0.0f;
                piVar2.H = 0.0f;
                piVar2.I = 0.0f;
                piVar2.J = null;
                piVar2.K = false;
                piVar2.M = 0.0f;
                piVar2.Q = false;
                piVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                piVar2.T = z11;
                piVar2.f28601n = d6Var;
                piVar2.f27364f = true;
                piVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y n10 = piVar2.f27362b.X0.n();
                TextView textView = new TextView(context);
                piVar2.f28605x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = piVar2.f27361a;
                bm bmVar = new bm(piVar2, context, n10, d6Var2, 1);
                y7 y7Var = piVar2.f27362b.X0;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                y7Var.addView(bmVar, 0, w7.y5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19182j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                bmVar.addView(textView, w7.y5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(piVar2, context, d6Var2, 14);
                piVar2.f28602r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.w7(piVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                piVar2.f28603s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                sm smVar = new sm(piVar2, context);
                piVar2.v = smVar;
                smVar.setClipToPadding(true);
                smVar.setClipChildren(true);
                piVar2.addView(w0Var, w7.y5.c(-1.0f, -1));
                piVar2.P = piVar2.f27362b.f30282j0;
                smVar.f28289c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = piVar2.P;
                smVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                smVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                smVar.c();
                UndoView undoView = new UndoView(context, null, false, piVar2.f27362b.f30305r);
                piVar2.f28604w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                piVar2.addView(undoView, w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                piVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f30302q0 = piVar2;
                piVar2.bringToFront();
            }
            pi piVar3 = this.f30331y0;
            tm tmVar = this.f30302q0;
            if (piVar3 != tmVar) {
                piVar = tmVar;
            }
            Q1(piVar);
            return;
        }
        Q1(piVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.wn) m2Var).a(), m2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f30307r1.invalidate();
        ci.m6 m6Var = this.O0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
        if (chatAttachAlertPhotoLayout != null) {
            wl wlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (wlVar != null && wlVar.getFastScroll() != null) {
                gl0 fastScroll = wlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f22177p1;
                if (this.f30260c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.f24604h0 = currentActionBarHeight + i10;
                wlVar.getFastScroll().invalidate();
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
        ai aiVar = this.f30332y1;
        if (aiVar == null) {
            return;
        }
        int childCount = aiVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            aiVar.getChildAt(i20);
        }
        boolean z11 = this.f30278h2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.h6.f19155hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19182j5;
        }
        this.f30283j1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.h6.f19155hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f19182j5;
        }
        this.f30297o1.setTextColor(getThemedColor(i11));
        this.f30271f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.h6.f19155hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f19182j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.u0 u0Var = this.f30254a1;
        u0Var.setIconColor(themedColor);
        Drawable background = u0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.h6.f19174ig;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.I5;
        }
        org.telegram.ui.ActionBar.h6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.h6.E8;
        u0Var.G(getThemedColor(i21), false);
        u0Var.G(getThemedColor(i21), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30261c1;
        if (u0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.h6.f19155hg;
            } else {
                i19 = org.telegram.ui.ActionBar.h6.f19182j5;
            }
            u0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30267e1;
        if (u0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.h6.f19155hg;
            } else {
                i17 = org.telegram.ui.ActionBar.h6.f19182j5;
            }
            u0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = u0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.h6.f19174ig;
            } else {
                i18 = org.telegram.ui.ActionBar.h6.I5;
            }
            org.telegram.ui.ActionBar.h6.w1(getThemedColor(i18), background2);
        }
        ci ciVar = this.E0;
        org.telegram.ui.ActionBar.d6 d6Var = ciVar.M;
        hu huVar = ciVar.f26381a;
        int i22 = ciVar.L;
        if (i22 == 0) {
            huVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            int i23 = org.telegram.ui.ActionBar.h6.G6;
            huVar.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i23, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i23, d6Var));
        } else if (i22 != 2 && i22 != 3) {
            huVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19370t5, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19182j5, d6Var));
        } else {
            huVar.setHintTextColor(-1929379841);
            huVar.setTextColor(-1);
            huVar.setCursorColor(-1);
            huVar.setHandlesColor(-1);
            huVar.setHighlightColor(822083583);
            huVar.quoteColor = -1;
        }
        ciVar.f26383c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        iu iuVar = ciVar.d;
        if (iuVar != null) {
            iuVar.S();
        }
        aiVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.h6.f19155hg;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.f19182j5;
        }
        int themedColor2 = getThemedColor(i14);
        y7 y7Var = this.X0;
        y7Var.B(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.h6.f19174ig;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.I5;
        }
        y7Var.A(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.h6.f19155hg;
        } else {
            i16 = org.telegram.ui.ActionBar.h6.f19182j5;
        }
        y7Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.h6.w1(q12, this.shadowDrawable);
        fh.c cVar = this.F2;
        if (cVar.f9067a.getColor() != q12) {
            cVar.a(q12);
            jh.f fVar = this.f30320v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            bi biVar = this.f30324w1;
            if (biVar != null) {
                biVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i24 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i24];
            if (piVar != null) {
                piVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19164i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.h6.f19146h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f19146h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f30331y0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f30301p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f30304q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.d1(boolean):void");
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
        ui uiVar = this.A1;
        if (uiVar != null) {
            uiVar.l();
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
        vi viVar = this.Z1;
        if (viVar != null) {
            viVar.x0(new ih(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f30331y0.o(i10);
    }

    public final void e1() {
        float f7 = this.f30259c.e;
        float f10 = (1.0f - this.f30255b.e) * f7;
        this.f30324w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void f1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f30269f.e;
        float b10 = yf.e0.b(this.h.e);
        if (this.R1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        c20.d(this.F0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        hi hiVar = this.I0;
        zh zhVar = this.H0;
        ci.m6 m6Var = this.O0;
        if (m6Var != null && m6Var.getVisibility() == 0 && m6Var.getAlpha() != 0.0f) {
            float f7 = this.f30255b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            hiVar.setAlpha(abs * abs * abs * abs);
            zhVar.setTranslationY(AndroidUtilities.lerp(this.f30275g2, ((m6Var.getTranslationY() + m6Var.getTop()) - zhVar.getTop()) + AndroidUtilities.dp(8.0f), tr.f28639j.getInterpolation(f7)));
            return;
        }
        zhVar.setTranslationY(this.f30275g2);
        hiVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i10 < piVarArr.length) {
                pi piVar = piVarArr[i10];
                if (piVar != null && (themeDescriptions = piVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19164i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.S0 = true;
        this.f30328x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30286k1;
        if (u0Var != null) {
            this.f30283j1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void i1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f30283j1;
        textView.setText(string);
        this.S0 = false;
        this.f30328x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.f30279i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30286k1;
        if (u0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            u0Var.setVisibility(0);
            u0Var.setClickable(true);
            u0Var.setAlpha(1.0f);
            u0Var.setScaleX(1.0f);
            u0Var.setScaleY(1.0f);
        }
    }

    public final int j1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if ((m2Var instanceof org.telegram.ui.wn) && (messagePreviewParams = ((org.telegram.ui.wn) m2Var).f39570f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) m2Var).e;
        }
        return MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        zh zhVar = this.D0;
        float alpha = 1.0f - zhVar.getAlpha();
        return zhVar.getMeasuredHeight() - (alpha * (zhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final mu m1() {
        pi piVar;
        if (this.f30260c0 && ((piVar = this.f30331y0) == this.f30282j0 || piVar == this.f30302q0)) {
            return this.P0;
        }
        return this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) m2Var).a();
        }
        return this.Z;
    }

    public final int o1() {
        pi piVar = this.f30331y0;
        xn xnVar = this.m0;
        if (piVar == xnVar && xnVar.E != null) {
            return xnVar.getEmojiPadding();
        }
        xn xnVar2 = this.f30293n0;
        if (piVar == xnVar2 && xnVar2.E != null) {
            return xnVar2.getEmojiPadding();
        }
        if (this.f30260c0) {
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
        if (y7Var.f19572n0) {
            y7Var.h(true);
        } else if (this.f30331y0.i()) {
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
        return this.f30331y0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
        t91 t91Var = chatAttachAlertPhotoLayout.f22169l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f22165j0;
        TextView textView = chatAttachAlertPhotoLayout.f22176p0;
        wl wlVar = chatAttachAlertPhotoLayout.f22179r;
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
                if (wlVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.f0.B(222.0f, i13, i16), i14, org.telegram.messenger.f0.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.f0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (wlVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.f0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.f0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == t91Var) {
            if (z10) {
                if (wlVar.getVisibility() == 0) {
                    t91Var.layout(0, org.telegram.messenger.f0.B(310.0f, i13, i16), i14, org.telegram.messenger.f0.B(260.0f, i13, i16));
                    return true;
                }
                t91Var.layout(0, org.telegram.messenger.f0.B(176.0f, i13, i16), i14, org.telegram.messenger.f0.B(126.0f, i13, i16));
                return true;
            } else if (wlVar.getVisibility() == 0) {
                t91Var.layout(org.telegram.messenger.f0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                t91Var.layout(org.telegram.messenger.f0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (wlVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (wlVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != wlVar) {
            return false;
        } else {
            if (z10) {
                int B = org.telegram.messenger.f0.B(88.0f, i15, i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
        km kmVar = chatAttachAlertPhotoLayout.v;
        wl wlVar = chatAttachAlertPhotoLayout.f22179r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.f22181s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        gm gmVar = chatAttachAlertPhotoLayout.P;
        if (view == gmVar) {
            if (chatAttachAlertPhotoLayout.f22149b0 && !chatAttachAlertPhotoLayout.f22153d0) {
                gmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f22165j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            t91 t91Var = chatAttachAlertPhotoLayout.f22169l0;
            if (view == t91Var) {
                if (z10) {
                    t91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                t91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == wlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    wlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (b0Var.f43056o != 0) {
                        wlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        kmVar.l();
                    }
                } else {
                    wlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (b0Var.f43056o != 1) {
                        wlVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        b0Var.j1(1);
                        kmVar.l();
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
        this.f30282j0.setTranslationX(0.0f);
        this.f30294n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30304q2 = animatorSet;
        li liVar = this.f30298o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, liVar, 0.0f, 400.0f));
        this.f30304q2.setDuration(400L);
        this.f30304q2.setStartDelay(20L);
        liVar.set(this, Float.valueOf(0.0f));
        this.f30304q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new gh(this, 2));
        o1.k kVar = this.f30301p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f15532n, 0.0f);
        this.f30301p2 = kVar2;
        if (this.H1 != null) {
            kVar2.f15549u.a(0.75f);
            this.f30301p2.f15549u.b(350.0f);
        } else {
            kVar2.f15549u.a(0.75f);
            this.f30301p2.f15549u.b(350.0f);
        }
        this.f30301p2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.d3 d3Var = this.backDrawable;
        q6 q6Var = s6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(d3Var, q6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.o oVar = new org.telegram.messenger.video.o(this, animationNotificationsLocker, this.delegate, 14);
        this.f30301p2.a(new ei.m4(2, this, oVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, oVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new gh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(tr.f28636f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f30331y0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f30331y0.B(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f30270f0 instanceof org.telegram.ui.wn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f30331y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30311s1 = true;
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
        pi piVar = this.f30334z0;
        int[] iArr = this.f30258b2;
        if (piVar != null && ((this.f30331y0 instanceof tm) || (piVar instanceof tm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f30263d0);
        }
        return iArr[i10];
    }

    public final int q1(boolean z10) {
        boolean q6;
        int i10;
        y7 y7Var;
        if (this.f30278h2) {
            return getThemedColor(org.telegram.ui.ActionBar.h6.f19380tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        Iterator it = this.f30292n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            long longValue = ((Long) hVar.f14226a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += hVar.c();
            }
        }
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        if (z10 && (y7Var = this.X0) != null && y7Var.getVisibility() == 0) {
            a2 *= 1.0f - y7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19146h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.h6.f19020a7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19164i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.r1():void");
    }

    public final boolean s1() {
        if (this.f30260c0) {
            pi piVar = this.f30331y0;
            if (piVar == this.f30282j0 || piVar == this.f30302q0) {
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
        pi piVar = this.f30331y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30282j0;
        if (piVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f22164i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            this.calcMandatoryInsets = ((org.telegram.ui.wn) m2Var).x9();
        }
        W1();
        this.f30311s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f19020a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f30291m2) {
            this.f30291m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        vi viVar = this.Z1;
        if (viVar != null && !this.f30317u1) {
            boolean c02 = viVar.c0();
            this.f30317u1 = true;
            ci.y0 y0Var = new ci.y0(this, editTextBoldCursor, z10, 18);
            if (c02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(y0Var, j3);
        }
    }

    public final void u1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int q12 = q1(false);
            org.telegram.ui.ActionBar.h6.w1(q12, this.shadowDrawable);
            fh.c cVar = this.F2;
            if (cVar.f9067a.getColor() != q12) {
                cVar.a(q12);
                jh.f fVar = this.f30320v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                bi biVar = this.f30324w1;
                if (biVar != null) {
                    biVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null) {
                piVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        ci ciVar = this.E0;
        if (ciVar != null) {
            ciVar.o();
        }
        fi fiVar = this.P0;
        if (fiVar != null) {
            fiVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f18499id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
        a2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        a2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.q5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i10 < piVarArr.length) {
                pi piVar = piVarArr[i10];
                if (piVar != null) {
                    piVar.x();
                }
                i10++;
            } else {
                this.f30272f2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f30272f2 = false;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null) {
                piVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.c0();
        }
        ui uiVar = this.A1;
        if (uiVar != null) {
            uiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (m2Var instanceof org.telegram.ui.wn)) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
            MessageSuggestionParams messageSuggestionParams = wnVar.f39582g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.s5.U(i10, messageSuggestionParams.amount)) {
                wnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f30309s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.I0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                O1(m2Var);
                return;
            }
            return;
        }
        if (this.H1 == null && (m2Var instanceof org.telegram.ui.wn)) {
            org.telegram.ui.wn wnVar2 = (org.telegram.ui.wn) m2Var;
            if (wnVar2.c()) {
                e5.M(getContext(), wnVar2.a(), new fh(this, 12), this.resourcesProvider);
                return;
            }
        }
        pi piVar = this.f30331y0;
        if (piVar != this.f30282j0 && piVar != this.f30302q0) {
            if (!piVar.I(0, true, 0, s1(), this.N0)) {
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
        if (this.f30331y0.n() || isDismissed()) {
            return;
        }
        ci ciVar = this.E0;
        if (ciVar != null) {
            AndroidUtilities.hideKeyboard(ciVar.getEditText());
        }
        fi fiVar = this.P0;
        if (fiVar != null) {
            AndroidUtilities.hideKeyboard(fiVar.getEditText());
        }
        this.f30327x0.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.f30270f0;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        if (!this.A2 && m2Var != null && this.f30331y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.f30336z2) {
                return;
            }
            this.f30336z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new fh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18678a.setOnCancelListener(new lh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
            a2Var.N = b1Var;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19315q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f30323w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null && this.f30331y0 != piVar) {
                piVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f19020a7), 0), true, (AndroidUtilities.IntColorCallback) new fh(this, 11));
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
        this.f30281i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public xi(Activity activity, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11) {
        this(activity, m2Var, z10, z11, true, null);
    }
}
