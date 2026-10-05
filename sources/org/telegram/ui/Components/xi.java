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
import org.telegram.ui.cj1;
public class xi extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, le.d {
    public static final int H2 = 0;
    public final ch.d A0;
    public final ui A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.k C0;
    public final RadialProgressView C1;
    public final ah.i C2;
    public final wh D0;
    public boolean D1;
    public final fh.c D2;
    public final i0 E;
    public final zh E0;
    public final p6 E1;
    public final ah.c E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final ah.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final mh G2;
    public boolean H;
    public final wh H0;
    public MessageObject H1;
    public int I;
    public final ei I0;
    public boolean I1;
    public Utilities.Callback2 J;
    public final TextPaint J0;
    public final int J1;
    public int K;
    public final RectF K0;
    public boolean K1;
    public int L;
    public final Paint L0;
    public boolean L1;
    public boolean M;
    public AnimatorSet M0;
    public boolean M1;
    public boolean N;
    public long N0;
    public boolean N1;
    public boolean O;
    public final ci.m6 O0;
    public boolean O1;
    public boolean P;
    public final bi P0;
    public boolean P1;
    public w40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public tt R0;
    public boolean R1;
    public final ee0 S;
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
    public boolean f32892a0;
    public final org.telegram.ui.ActionBar.v0 f32893a1;
    public in a2;
    public final le.b f32894b;
    public final ah.e f32895b0;
    public final ci.u f32896b1;
    public final int[] f32897b2;
    public final le.b f32898c;
    public boolean f32899c0;
    public final org.telegram.ui.ActionBar.v0 f32900c1;
    public int f32901c2;
    public final le.b d;
    public float f32902d0;
    public ci.e4 f32903d1;
    public float f32904d2;
    public final le.b f32905e;
    public final ii f32906e0;
    public final org.telegram.ui.ActionBar.v0 f32907e1;
    public float f32908e2;
    public final le.b f32909f;
    public final org.telegram.ui.ActionBar.n2 f32910f0;
    public final bi.o f32911f1;
    public boolean f32912f2;
    public final boolean f32913g0;
    public float f32914g1;
    public float f32915g2;
    public final le.b h;
    public of f32916h0;
    public float f32917h1;
    public final boolean f32918h2;
    public boolean f32919i0;
    public final wh f32920i1;
    public boolean f32921i2;
    public final ChatAttachAlertPhotoLayout f32922j0;
    public final TextView f32923j1;
    public final ArrayList f32924j2;
    public bk f32925k0;
    public final org.telegram.ui.ActionBar.v0 f32926k1;
    public final Rect f32927k2;
    public jj f32928l0;
    public final LinearLayout l1;
    public float f32929l2;
    public xn m0;
    public final ImageView f32930m1;
    public boolean f32931m2;
    public final le.l f32932n;
    public xn f32933n0;
    public final LinearLayout f32934n1;
    public int f32935n2;
    public jl f32936o0;
    public final TextView f32937o1;
    public final ii f32938o2;
    public rk f32939p0;
    public float f32940p1;
    public o1.k f32941p2;
    public tm f32942q0;
    public boolean f32943q1;
    public AnimatorSet f32944q2;
    public org.telegram.ui.wn f32945r;
    public mj f32946r0;
    public final ki f32947r1;
    public boolean f32948r2;
    public final p6 f32949s;
    public hg.j0 f32950s0;
    public boolean f32951s1;
    public boolean f32952s2;
    public sk f32953t0;
    public Object f32954t1;
    public el f32955t2;
    public sk f32956u0;
    public boolean f32957u1;
    public boolean f32958u2;
    public final p6 v;
    public ii.r f32959v0;
    public final jh.f f32960v1;
    public boolean f32961v2;
    public final ImageView f32962w;
    public final pi[] f32963w0;
    public final yh f32964w1;
    public File f32965w2;
    public final i0 f32966x;
    public final LongSparseArray f32967x0;
    public final wh f32968x1;
    public double[] f32969x2;
    public final ImageView f32970y;
    public pi f32971y0;
    public final xh f32972y1;
    public boolean f32973y2;
    public pi f32974z0;
    public final s4.c0 f32975z1;
    public boolean f32976z2;

    public xi(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.v0 v0Var;
        bi.o oVar;
        ki kiVar;
        int i10;
        float f7;
        tr trVar = tr.h;
        this.f32894b = new le.b(0, this, trVar, 380L, false);
        this.f32898c = new le.b(1, this, trVar, 380L, false);
        this.d = new le.b(2, this, trVar, 380L, false);
        this.f32905e = new le.b(3, this, trVar, 380L, false);
        this.f32909f = new le.b(4, this, trVar, 380L, true);
        this.h = new le.b(5, this, trVar, 320L, false);
        le.l lVar = new le.l(new fh(this, 1), trVar, 380L);
        this.f32932n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f32902d0 = 0.0f;
        this.f32906e0 = new ii(this, 0);
        this.f32919i0 = false;
        pi[] piVarArr = new pi[11];
        this.f32963w0 = piVarArr;
        this.f32967x0 = new LongSparseArray();
        this.G0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.J0 = textPaint;
        this.K0 = new RectF();
        this.L0 = new Paint(1);
        this.U0 = true;
        this.V0 = 1.0f;
        this.B1 = false;
        this.D1 = false;
        int i11 = UserConfig.selectedAccount;
        this.J1 = i11;
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
        this.f32897b2 = new int[2];
        new Paint(1);
        this.f32921i2 = false;
        ArrayList arrayList = new ArrayList();
        this.f32924j2 = arrayList;
        Rect rect = new Rect();
        this.f32927k2 = rect;
        this.f32938o2 = new ii(this, 1);
        this.f32948r2 = true;
        this.f32952s2 = false;
        this.f32976z2 = false;
        this.A2 = false;
        this.occupyNavigationBarWithoutKeyboard = true;
        fh.c cVar = new fh.c();
        this.D2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
        this.glassEngine.A.add(new li.n(cVar, new fh(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i();
            this.C2 = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(cVar);
            dVar.f9863f = cVar;
            dVar.d = iVar;
            dVar.f9862e = -2;
            fh.d dVar2 = new fh.d(null);
            dVar2.f9863f = cVar;
            dVar2.d = iVar;
            dVar2.f9862e = -3;
            ah.c cVar2 = new ah.c(dVar);
            this.E2 = cVar2;
            cVar2.f461i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            cVar2.f456b = dp;
            cVar2.f457c = dp;
            ah.c cVar3 = new ah.c(dVar2);
            this.F2 = cVar3;
            cVar3.f461i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar3.f456b = dp2;
            cVar3.f457c = dp2;
        } else {
            this.C2 = null;
            this.E2 = new ah.c(cVar);
            this.F2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.G2 = new mh(this, 0);
        this.f32918h2 = z10;
        this.f32913g0 = (n2Var instanceof org.telegram.ui.yn) && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f32910f0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ki kiVar2 = new ki(this, context);
        this.f32947r1 = kiVar2;
        kiVar2.setDelegate(new li(this));
        this.containerView = kiVar2;
        kiVar2.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        y7 y7Var = new y7(this, context, d6Var, 1);
        this.X0 = y7Var;
        y7Var.U0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i13 = org.telegram.ui.ActionBar.i6.f20935j5;
        y7Var.A(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.i6.I5;
        y7Var.z(getThemedColor(i14), false);
        y7Var.setTitleColor(getThemedColor(i13));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 8));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, d6Var);
        this.f32893a1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.ic_ab_other);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var2.setVisibility(4);
        v0Var2.setAlpha(0.0f);
        v0Var2.setScaleX(0.6f);
        v0Var2.setScaleY(0.6f);
        v0Var2.setSubMenuOpenSide(2);
        v0Var2.setDelegate(new fh(this, 10));
        v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        v0Var2.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 6, -1));
        v0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, d6Var);
        this.f32900c1 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f32896b1 = uVar;
        v0Var3.setIcon(uVar);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var3.setVisibility(8);
        v0Var3.setAlpha(0.0f);
        v0Var3.setScaleX(0.6f);
        v0Var3.setScaleY(0.6f);
        v0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        v0Var3.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 6, -1));
        v0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        bi.o oVar2 = new bi.o(this, context);
        oVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        oVar2.setText(LocaleController.getString(R.string.Create));
        oVar2.setTypeface(AndroidUtilities.bold());
        oVar2.setTextSize(1, 14.0f);
        oVar2.setVisibility(4);
        oVar2.setAlpha(0.0f);
        oVar2.setGravity(17);
        oVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        oVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        oVar2.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        w7.b6.a(oVar2);
        this.f32911f1 = oVar2;
        V1();
        if (n2Var != null) {
            kiVar = kiVar2;
            oVar = oVar2;
            v0Var = v0Var3;
            i10 = 4;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, d6Var);
            this.f32907e1 = v0Var4;
            v0Var4.setLongClickEnabled(false);
            v0Var4.setIcon(R.drawable.outline_header_search);
            v0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            v0Var4.setVisibility(4);
            v0Var4.setAlpha(0.0f);
            v0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            v0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 6, -1));
            v0Var4.setOnClickListener(new ai.j3(5, this, z11));
        } else {
            v0Var = v0Var3;
            oVar = oVar2;
            kiVar = kiVar2;
            i10 = 4;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, d6Var);
        this.f32926k1 = v0Var5;
        v0Var5.setLongClickEnabled(false);
        v0Var5.setIcon(R.drawable.ic_ab_other);
        v0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var5.setVisibility(8);
        v0Var5.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i14), 3, -1));
        v0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final xi f28190b;

            {
                this.f28190b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.yn ynVar;
                switch (r3) {
                    case 0:
                        final xi xiVar = this.f28190b;
                        zh zhVar = xiVar.E0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(zhVar.getText());
                            e0Var.f25918j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = xiVar.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            bi biVar = xiVar.P0;
                                            biVar.setText(charSequence);
                                            biVar.w(charSequence.length(), charSequence.length());
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
                            e0Var.f25920l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25921n0 = ohVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final xi xiVar2 = this.f28190b;
                        bi biVar = xiVar2.P0;
                        if (biVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(biVar.getText());
                            e0Var2.f25918j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = xiVar2.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            bi biVar2 = xiVar2.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var2.f25920l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25921n0 = ohVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        xi xiVar3 = this.f28190b;
                        xiVar3.f32926k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar3.f32910f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i15 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i15;
                        t13.f33990n = z15;
                        if (!xiVar3.Z1.a0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(xiVar3.J1, "webp");
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
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        oi oiVar = new oi(xiVar3, photoEntry);
                        if (n2Var2 instanceof org.telegram.ui.yn) {
                            ynVar = (org.telegram.ui.yn) n2Var2;
                        } else {
                            ynVar = null;
                        }
                        t14.g2(arrayList2, 0, 11, false, oiVar, ynVar);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        v0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        v0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        v0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        wh whVar = new wh(this, context, 0);
        this.f32920i1 = whVar;
        whVar.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        whVar.setAlpha(0.0f);
        whVar.setVisibility(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f32923j1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f32930m1 = imageView;
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
        this.f32934n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f32937o1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        whVar.addView(linearLayout2, w7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.f32922j0 = chatAttachAlertPhotoLayout;
        piVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f32971y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f32960v1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.z5.g());
        this.containerView.addView(whVar, w7.z5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.O0 = m6Var;
        this.containerView.addView(m6Var, w7.z5.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.z5.c(-2.0f, -1));
        this.containerView.addView(v0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(v0Var, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var6 = this.f32907e1;
        if (v0Var6 != null) {
            this.containerView.addView(v0Var6, w7.z5.e(48, 48, 53));
        }
        whVar.addView(v0Var5, w7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.z5.e(-2, 48, 53));
        wh whVar2 = new wh(this, context, 1);
        this.f32968x1 = whVar2;
        xh xhVar = new xh(context, 0);
        this.f32972y1 = xhVar;
        xhVar.setClipChildren(true);
        xhVar.setClipToPadding(false);
        ui uiVar = new ui(this, context);
        this.A1 = uiVar;
        xhVar.setAdapter(uiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f32975z1 = c0Var;
        xhVar.setLayoutManager(c0Var);
        xhVar.setVerticalScrollBarEnabled(false);
        xhVar.setHorizontalScrollBarEnabled(false);
        xhVar.setItemAnimator(null);
        xhVar.setLayoutAnimation(null);
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        xhVar.f33580z2 = true;
        xhVar.setOverScrollMode(2);
        ah.c cVar5 = this.E2;
        li.p pVar = this.glassEngine;
        cVar5.h = pVar;
        this.F2.h = pVar;
        cVar4.h = pVar;
        yh yhVar = new yh(this, context, 0);
        this.f32964w1 = yhVar;
        ah.e eVar = new ah.e(cVar4.c(yhVar, null, false));
        this.f32895b0 = eVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        eVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(yhVar, w7.z5.g());
        ch.d c10 = this.E2.c(whVar2, eh.b.f(d6Var), false);
        c10.y(AndroidUtilities.dp(28.0f));
        c10.x(AndroidUtilities.dp(7.0f));
        whVar2.setBackground(c10);
        xhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        xhVar.setClipToOutline(true);
        ai.k2 k2Var = yf.f0.f50993a;
        xhVar.setOutlineProvider(new yf.d0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        xhVar.setImportantForAccessibility(1);
        whVar2.addView(xhVar, w7.z5.g());
        this.containerView.addView(whVar2, w7.z5.e(-1, 70, 81));
        xhVar.setOnItemClickListener(new ai.n6(9, this, d6Var));
        xhVar.setOnItemLongClickListener(new fh(this, 3));
        p6 p6Var = new p6(context, true, false, true);
        this.E1 = p6Var;
        p6Var.setVisibility(8);
        p6Var.setAlpha(0.0f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        p6Var.setPadding(dp3, 0, dp3, 0);
        p6Var.setTextSize(AndroidUtilities.dp(f7));
        p6Var.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        this.containerView.addView(p6Var, w7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.F0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.f21233z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        wh whVar3 = new wh(this, context, 2);
        this.D0 = whVar3;
        hg.k kVar = new hg.k(this, context);
        this.C0 = kVar;
        whVar3.addView(kVar, w7.z5.e(-1, -1, 119));
        ki kiVar3 = kiVar;
        ch.d c11 = this.F2.c(kiVar3, eh.b.o(d6Var), false);
        this.A0 = c11;
        c11.f4635n = true;
        c11.z(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.B(AndroidUtilities.dp(32.0f));
        c11.f4633l.f4619g = 0.4f;
        c11.u();
        ch.d c12 = this.E2.c(kVar, eh.b.o(d6Var), false);
        this.B0 = c12;
        c12.y(AndroidUtilities.dp(22.0f));
        c12.x(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        whVar3.setWillNotDraw(false);
        whVar3.setVisibility(4);
        whVar3.setAlpha(0.0f);
        this.containerView.addView(whVar3, w7.z5.e(-1, -2, 83));
        whVar3.setOnTouchListener(new bi.d(13));
        p6 p6Var2 = new p6(context, false, false, false);
        this.f32949s = p6Var2;
        p6Var2.setAllowCancel(true);
        p6Var2.setScaleProperty(0.6f);
        p6Var2.setVisibility(8);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i15 = org.telegram.ui.ActionBar.i6.f21214y6;
        p6Var2.setTextColor(getThemedColor(i15));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        kVar.addView(p6Var2, w7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f32962w = imageView4;
        i0 i0Var = new i0(context);
        this.f32966x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.i6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        int i17 = org.telegram.ui.ActionBar.i6.f20918i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        kVar.addView(imageView4, w7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final xi f28190b;

            {
                this.f28190b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.yn ynVar;
                switch (r3) {
                    case 0:
                        final xi xiVar = this.f28190b;
                        zh zhVar = xiVar.E0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(zhVar.getText());
                            e0Var.f25918j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = xiVar.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            bi biVar2 = xiVar.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var.f25920l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25921n0 = ohVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final xi xiVar2 = this.f28190b;
                        bi biVar = xiVar2.P0;
                        if (biVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(biVar.getText());
                            e0Var2.f25918j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar2 = xiVar2.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            bi biVar2 = xiVar2.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var2.f25920l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25921n0 = ohVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        xi xiVar3 = this.f28190b;
                        xiVar3.f32926k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar3.f32910f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i152;
                        t13.f33990n = z15;
                        if (!xiVar3.Z1.a0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(xiVar3.J1, "webp");
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
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        oi oiVar = new oi(xiVar3, photoEntry);
                        if (n2Var2 instanceof org.telegram.ui.yn) {
                            ynVar = (org.telegram.ui.yn) n2Var2;
                        } else {
                            ynVar = null;
                        }
                        t14.g2(arrayList2, 0, 11, false, oiVar, ynVar);
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
        zh zhVar = new zh(this, context, kiVar3, d6Var);
        this.E0 = zhVar;
        zhVar.J = true;
        zhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        zhVar.s();
        zhVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        zhVar.getEditText().addTextChangedListener(new ai(this));
        kVar.addView(zhVar, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        kVar.setClipChildren(false);
        whVar3.setClipChildren(false);
        zhVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        bi biVar = new bi(this, context, kiVar3, d6Var);
        this.P0 = biVar;
        biVar.J = true;
        biVar.getEditText().addTextChangedListener(new di(this, n2Var));
        biVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        biVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        biVar.getEditText().setTextSize(1, 17.0f);
        biVar.getEmojiButton().setLayoutParams(w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        biVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(biVar, w7.z5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        zhVar.addView(imageView3, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ch.d c13 = this.E2.c(m6Var, eh.b.o(d6Var), false);
        c13.y(AndroidUtilities.dp(22.0f));
        c13.x(AndroidUtilities.dp(7.0f));
        m6Var.setBackground(c13);
        m6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        p6 p6Var3 = new p6(context, false, false, false);
        this.v = p6Var3;
        p6Var3.setScaleProperty(0.6f);
        p6Var3.setVisibility(8);
        p6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var3.setTextColor(getThemedColor(i15));
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setGravity(17);
        p6Var3.setAllowCancel(true);
        m6Var.addView(p6Var3, w7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Xd), mode2));
        biVar.addView(imageView5, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f32970y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i17), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.z5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final xi f28190b;

            {
                this.f28190b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.yn ynVar;
                switch (r3) {
                    case 0:
                        final xi xiVar = this.f28190b;
                        zh zhVar2 = xiVar.E0;
                        if (zhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(zhVar2.getText());
                            e0Var.f25918j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar22 = xiVar.E0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            bi biVar2 = xiVar.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
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
                            e0Var.f25920l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f25921n0 = ohVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final xi xiVar2 = this.f28190b;
                        bi biVar2 = xiVar2.P0;
                        if (biVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(biVar2.getText());
                            e0Var2.f25918j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            zh zhVar22 = xiVar2.E0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            bi biVar22 = xiVar2.P0;
                                            biVar22.setText(charSequence);
                                            biVar22.w(charSequence.length(), charSequence.length());
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
                            e0Var2.f25920l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f25921n0 = ohVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        xi xiVar3 = this.f28190b;
                        xiVar3.f32926k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar3.f32910f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i152 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i152;
                        t13.f33990n = z15;
                        if (!xiVar3.Z1.a0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(xiVar3.J1, "webp");
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
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer t14 = PhotoViewer.t1();
                        oi oiVar = new oi(xiVar3, photoEntry);
                        if (n2Var2 instanceof org.telegram.ui.yn) {
                            ynVar = (org.telegram.ui.yn) n2Var2;
                        } else {
                            ynVar = null;
                        }
                        t14.g2(arrayList2, 0, 11, false, oiVar, ynVar);
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
        wh whVar4 = new wh(this, context, 3);
        this.H0 = whVar4;
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
        this.I0 = eiVar;
        eiVar.setImportantForAccessibility(2);
        whVar4.addView(eiVar, w7.z5.e(-1, -1, 119));
        eiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        eiVar.I = dp4;
        eiVar.J = dp5;
        eiVar.M = AndroidUtilities.dp(7.0f);
        eiVar.N = AndroidUtilities.dp(6.0f);
        eiVar.f32632h0 = true;
        eiVar.setOnClickListener(new View.OnClickListener(this) {
            public final xi f27849b;

            {
                this.f27849b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                ei.r4 r4Var;
                switch (r2) {
                    case 0:
                        xi xiVar = this.f27849b;
                        if (xiVar.f32971y0 != xiVar.f32942q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xiVar.Y1(z13);
                        return;
                    case 1:
                        xi xiVar2 = this.f27849b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.f32967x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        xi xiVar3 = this.f27849b;
                        boolean z14 = xiVar3.f32899c0;
                        if (!z14) {
                            xiVar3.G1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        xi xiVar4 = this.f27849b;
                        boolean z15 = xiVar4.f32899c0;
                        if (z15) {
                            xiVar4.G1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f27849b.y1();
                        return;
                    case 5:
                        this.f27849b.f32893a1.M(null, null);
                        return;
                    case 6:
                        xi.p(this.f27849b);
                        return;
                    case 7:
                        pi piVar = this.f27849b.f32971y0;
                        if (piVar != null) {
                            piVar.t(40);
                            return;
                        }
                        return;
                    default:
                        this.f27849b.f32926k1.M(null, null);
                        return;
                }
            }
        });
        eiVar.setOnLongClickListener(new org.telegram.ui.fg(this, context, d6Var, n2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        yh yhVar2 = new yh(this, context, 1);
        yhVar2.setAlpha(0.0f);
        yhVar2.setScaleX(0.2f);
        yhVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        fl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar6 = this.E2;
        dh.e o9 = eh.b.o(d6Var);
        zl0 zl0Var = fastScroll.f26519o0;
        ch.d c14 = cVar6.c(zl0Var.f33540f1, o9, false);
        fastScroll.f26508e0 = c14;
        c14.x(AndroidUtilities.dp(4.0f));
        fastScroll.f26508e0.y(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar6.c(zl0Var.f33540f1, o9, false);
        fastScroll.f26510f0 = c15;
        c15.x(AndroidUtilities.dp(6.0f));
        fastScroll.f26510f0.B(AndroidUtilities.dp(4.0f));
        fastScroll.f26510f0.y(AndroidUtilities.dp(f7));
        ee0 ee0Var = new ee0(context);
        this.S = ee0Var;
        this.containerView.addView(ee0Var, w7.z5.c(-1.0f, -1));
        dh.e eVar2 = new dh.e(d6Var);
        eVar2.f8354e = new fh(this, 5);
        eVar2.f8353c = new fh(this, 6);
        eVar2.d = new fh(this, 7);
        eVar2.f8352b = new fh(this, 8);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f8356n = dpf2;
        eVar2.f8357r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f8355f = dpf23;
        eVar2.h = dpf24;
        y7Var.J(this.E2, eVar2, false);
        lVar.i(1L, false);
        this.glassEngine.i(this.containerView);
        li.p pVar2 = this.glassEngine;
        pVar2.f15671a = new fh(this, 9);
        pVar2.d = new ni.b(AndroidUtilities.dp(48.0f));
    }

    public static void D(xi xiVar) {
        boolean q6;
        int i10;
        int i11;
        y7 y7Var = xiVar.X0;
        jh.f fVar = xiVar.f32960v1;
        if (fVar != null && y7Var != null) {
            org.telegram.ui.ActionBar.d6 d6Var = xiVar.resourcesProvider;
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
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

    public static void H(xi xiVar) {
        ci.i iVar = new ci.i(xiVar, xiVar.getContext(), xiVar.Z, LaunchActivity.R(), xiVar.resourcesProvider, 1);
        xiVar.B2 = iVar;
        iVar.p(new n2.c(xiVar, 6));
        ViewGroup viewGroup = xiVar.containerView;
        viewGroup.addView(xiVar.B2, viewGroup.indexOfChild(xiVar.D0), w7.z5.e(-1, -1, 83));
        ci.i iVar2 = xiVar.B2;
        iVar2.getAdapter().f10670c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f10673e = false;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
        boolean z10 = true;
        if (n2Var instanceof org.telegram.ui.yn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            gg.k1 adapter = iVar2.getAdapter();
            ynVar.i();
            TLRPC.Chat chat = ynVar.f43315e;
            adapter.getClass();
            adapter.f10682l0 = chat;
            iVar2.getAdapter().W(ynVar.X7);
            gg.k1 adapter2 = iVar2.getAdapter();
            if (ynVar.f43315e == null) {
                z10 = false;
            }
            adapter2.f10674e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f10674e0 = false;
        }
        iVar2.getAdapter().f10676f0 = false;
        xiVar.T1();
    }

    public static int g0(xi xiVar) {
        pi piVar = xiVar.f32971y0;
        xn xnVar = xiVar.m0;
        if (piVar == xnVar && xnVar.E != null) {
            return xnVar.getEmojiPadding();
        }
        xn xnVar2 = xiVar.f32933n0;
        if (piVar == xnVar2 && xnVar2.E != null) {
            return xnVar2.getEmojiPadding();
        }
        if (xiVar.f32899c0) {
            return xiVar.P0.getEmojiPadding();
        }
        return xiVar.E0.getEmojiPadding();
    }

    public static void n(xi xiVar) {
        pi piVar;
        tm tmVar;
        xiVar.f32954t1 = null;
        pi piVar2 = xiVar.f32971y0;
        if (piVar2 != xiVar.f32922j0 && (piVar = xiVar.f32974z0) != (tmVar = xiVar.f32942q0) && piVar2 != piVar && piVar2 != tmVar) {
            xiVar.containerView.removeView(piVar2);
        }
        xiVar.f32971y0.setVisibility(8);
        xiVar.f32971y0.q();
        xiVar.f32974z0.D();
        xiVar.f32971y0 = xiVar.f32974z0;
        xiVar.f32974z0 = null;
        int[] iArr = xiVar.f32897b2;
        iArr[0] = iArr[1];
        xiVar.G1(xiVar.f32899c0, false);
        xiVar.V1();
    }

    public static void o(xi xiVar, boolean z10, ih ihVar) {
        Integer num;
        xiVar.f32971y0.s(1.0f);
        xiVar.f32974z0.s(1.0f);
        xiVar.f32971y0.k(xiVar.f32929l2);
        xiVar.f32974z0.k(xiVar.f32929l2);
        xiVar.glassEngine.g();
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

    public static void p(xi xiVar) {
        int i10;
        if (xiVar.f32922j0 == null) {
            return;
        }
        boolean Q = ChatAttachAlertPhotoLayout.Q();
        boolean z10 = !Q;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f32922j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24027s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(Q);
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
        xiVar.X1(true);
        org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32900c1;
        ci.e4 e4Var = xiVar.f32903d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = new ci.e4(xiVar.getContext(), 1);
        xiVar.f32903d1 = e4Var2;
        if (!Q) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        xiVar.f32903d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        xiVar.f32903d1.m(1.0f, -((xiVar.containerView.getWidth() - ((v0Var.getWidth() / 2.0f) + v0Var.getX())) - AndroidUtilities.dp(14.0f)));
        xiVar.f32903d1.setTranslationY(xiVar.f32893a1.getTranslationY());
        ci.e4 e4Var3 = xiVar.f32903d1;
        e4Var3.f4998l0 = new be(4, xiVar, e4Var2);
        xiVar.containerView.addView(e4Var3, w7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        xiVar.f32903d1.u();
    }

    public static void q(xi xiVar, ValueAnimator valueAnimator) {
        xiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = xiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static void r(xi xiVar) {
        o1.k kVar = xiVar.f32941p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(xiVar.containerView, o1.h.f16975n, 0.0f);
        xiVar.f32941p2 = kVar2;
        kVar2.f16993u.a(1.5f);
        xiVar.f32941p2.f16993u.b(1500.0f);
        xiVar.f32941p2.f();
    }

    public static void s(xi xiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int i10;
        xi xiVar2 = xiVar;
        xh xhVar = xiVar2.f32972y1;
        pi[] piVarArr = xiVar2.f32963w0;
        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar2.f32910f0;
        if (n2Var2 == null) {
            n2Var = LaunchActivity.R();
        } else {
            n2Var = n2Var2;
        }
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (view instanceof ri) {
                Activity parentActivity = n2Var.getParentActivity();
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
                            xiVar2.P1(ynVar);
                        }
                        xiVar2.P1(xiVar2.f32922j0);
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
                        xiVar2.A1(true);
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
                        xiVar2.D1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (xiVar2.Q1 || !xiVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && xiVar2.Q1 && xiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        xiVar2.C1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((xiVar2.Q1 || !xiVar2.a1()) && AndroidUtilities.isMapsInstalled(n2Var2)) {
                        if (!xiVar2.Q1) {
                            yn ynVar2 = new yn(6, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar2;
                            xiVar2.P1(ynVar2);
                        } else {
                            if (xiVar2.f32936o0 == null) {
                                jl jlVar = new jl(xiVar2, xiVar2.getContext(), d6Var, (xiVar2.H || xiVar2.R1) ? false : false);
                                xiVar2.f32936o0 = jlVar;
                                piVarArr[5] = jlVar;
                                el elVar = xiVar2.f32955t2;
                                if (elVar != null) {
                                    jlVar.setDelegate(elVar);
                                } else {
                                    jlVar.setDelegate(new fh(xiVar2, 11));
                                }
                            }
                            xiVar2.P1(xiVar2.f32936o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (xiVar2.O1 || !xiVar2.a1()) {
                        if (!xiVar2.O1) {
                            yn ynVar3 = new yn(9, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar3;
                            xiVar2.P1(ynVar3);
                        } else {
                            xiVar2.R1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (xiVar2.f32950s0 == null) {
                        hg.j0 j0Var = new hg.j0(xiVar2.getContext(), xiVar2.resourcesProvider, xiVar2);
                        xiVar2.f32950s0 = j0Var;
                        piVarArr[7] = j0Var;
                        j0Var.setupBlurredSearchField(xiVar2.E2);
                    }
                    xiVar2.P1(xiVar2.f32950s0);
                } else if (i10 == 12) {
                    if (xiVar2.P1 || !xiVar2.a1()) {
                        if (!xiVar2.P1) {
                            yn ynVar4 = new yn(9, xiVar2.getContext(), d6Var, xiVar2);
                            xiVar2.T = ynVar4;
                            xiVar2.P1(ynVar4);
                        } else {
                            if (xiVar2.f32933n0 == null) {
                                xn xnVar = new xn(xiVar, xiVar.getContext(), true, d6Var, null);
                                xiVar2 = xiVar;
                                xiVar2.f32933n0 = xnVar;
                                piVarArr[1] = xnVar;
                                xnVar.setDelegate(new fh(xiVar2, 13));
                            }
                            xiVar2.P1(xiVar2.f32933n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (xiVar2.f32956u0 == null) {
                        sk skVar = new sk(xiVar2, xiVar2.getContext(), d6Var, true);
                        xiVar2.f32956u0 = skVar;
                        piVarArr[8] = skVar;
                        skVar.setDelegate(xiVar2.a2);
                    }
                    xiVar2.P1(xiVar2.f32956u0);
                } else if (i10 == 14) {
                    if (xiVar2.f32953t0 == null) {
                        sk skVar2 = new sk(xiVar2, xiVar2.getContext(), d6Var, false);
                        xiVar2.f32953t0 = skVar2;
                        piVarArr[9] = skVar2;
                        skVar2.setDelegate(xiVar2.a2);
                    }
                    xiVar2.P1(xiVar2.f32953t0);
                } else if (i10 == 16) {
                    if (xiVar2.f32959v0 == null) {
                        ii.r rVar = new ii.r(xiVar2.J1, xiVar2.getContext(), d6Var, xiVar2);
                        xiVar2.f32959v0 = rVar;
                        piVarArr[10] = rVar;
                    }
                    xiVar2.P1(xiVar2.f32959v0);
                } else if (view.getTag() instanceof Integer) {
                    xiVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, xiVar2.r1(), false, 0L);
                }
            } else if (view instanceof qi) {
                qi qiVar = (qi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = qiVar.f30071c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        cj1.a(xiVar2.getContext(), new org.telegram.ui.qc(16, xiVar2, qiVar), null);
                    } else {
                        xiVar2.M1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    xiVar2.Z1.j1(qiVar.f30070b);
                    xiVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                xhVar.w0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > xhVar.getMeasuredWidth()) {
                xhVar.w0(i14 - xhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void t(xi xiVar, int i10) {
        ah.i iVar = xiVar.C2;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                ni.a e7 = xiVar.glassEngine.e();
                e7.b(xiVar.containerView.getY(), xiVar.containerView.getWidth(), xiVar.containerView.getY() + xiVar.containerView.getHeight());
                iVar.h(e7);
            }
            iVar.e(xiVar.G2, xiVar.containerView.getWidth(), xiVar.containerView.getHeight());
        }
    }

    public static void u(xi xiVar, org.telegram.messenger.video.o oVar) {
        AnimatorSet animatorSet = xiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            oVar.run();
        }
    }

    public static void v(xi xiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        xiVar.currentSheetAnimation = null;
        xiVar.f32941p2 = null;
        animationNotificationsLocker.unlock();
        xiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
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

    public static boolean w(org.telegram.ui.Components.xi r46, android.content.Context r47, org.telegram.ui.ActionBar.d6 r48, org.telegram.ui.ActionBar.n2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.w(org.telegram.ui.Components.xi, android.content.Context, org.telegram.ui.ActionBar.d6, org.telegram.ui.ActionBar.n2, android.view.View):boolean");
    }

    public static void x(xi xiVar, int i10) {
        xiVar.navBarColorKey = -1;
        xiVar.navBarColor = i10;
        xiVar.containerView.invalidate();
    }

    public final void A1(boolean z10) {
        if (!this.N1 && z10) {
            yn ynVar = new yn(3, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            P1(ynVar);
        }
        int i10 = 1;
        if (this.f32928l0 == null) {
            jj jjVar = new jj(getContext(), this.resourcesProvider, this);
            this.f32928l0 = jjVar;
            this.f32963w0[3] = jjVar;
            jjVar.setupBlurredSearchField(this.E2);
            this.f32928l0.setDelegate(new fh(this, 15));
            if (this.H) {
                this.f32928l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            TLRPC.Chat chat = ((org.telegram.ui.yn) n2Var).f43315e;
            jj jjVar2 = this.f32928l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            jjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            P1(this.f32928l0);
        }
    }

    public final void B1() {
        if (this.f32946r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ?? piVar = new pi(context, d6Var, this);
            piVar.f28714r = AndroidUtilities.dp(80.0f);
            piVar.f28716w = 3;
            ai.w0 w0Var = new ai.w0(piVar, context, d6Var, 11);
            piVar.f28713n = w0Var;
            ab abVar = new ab(piVar, context);
            piVar.v = abVar;
            w0Var.setAdapter(abVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A5, piVar.f29740a));
            piVar.addView(w0Var, w7.z5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(piVar, 18));
            bi.l lVar = new bi.l(piVar, piVar.f28714r, 1);
            piVar.f28715s = lVar;
            lVar.O = new ci.x1(piVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f32946r0 = piVar;
            piVar.setDelegate(new hb(this, 1));
        }
        P1(this.f32946r0);
    }

    public final void C1() {
        boolean z10;
        if (!this.Q1) {
            yn ynVar = new yn(5, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            P1(ynVar);
        }
        if (this.f32925k0 == null) {
            bk bkVar = new bk(getContext(), this.resourcesProvider, this);
            this.f32925k0 = bkVar;
            this.f32963w0[2] = bkVar;
            bkVar.setupBlurredSearchField(this.E2);
            this.f32925k0.setDelegate(new gi(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            TLRPC.Chat chat = ((org.telegram.ui.yn) n2Var).f43315e;
            bk bkVar2 = this.f32925k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            bkVar2.setMultipleSelectionAllowed(z10);
        }
        P1(this.f32925k0);
    }

    public final void D1(boolean z10) {
        int i10;
        if (!this.K1 && z10) {
            yn ynVar = new yn(4, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            P1(ynVar);
        }
        boolean z11 = false;
        if (this.f32939p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            rk rkVar = new rk(i10, getContext(), this.resourcesProvider, this);
            this.f32939p0 = rkVar;
            this.f32963w0[4] = rkVar;
            rkVar.setDelegate(new hi(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f32939p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
            if (n2Var instanceof org.telegram.ui.yn) {
                TLRPC.Chat chat = ((org.telegram.ui.yn) n2Var).f43315e;
                rk rkVar2 = this.f32939p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i11 = -1;
                }
                rkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f32939p0.setMaxSelectedFiles(this.S1);
                rk rkVar3 = this.f32939p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                rkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        rk rkVar4 = this.f32939p0;
        rkVar4.f30517d0 = this.N;
        if (z10) {
            P1(rkVar4);
        }
    }

    public final void E1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y7 y7Var = this.X0;
        int i10 = 1;
        if (y7Var.f21286n0) {
            y7Var.h(true);
        }
        this.f32925k0 = null;
        this.f32950s0 = null;
        this.f32928l0 = null;
        this.m0 = null;
        this.f32933n0 = null;
        this.f32936o0 = null;
        this.f32939p0 = null;
        while (true) {
            pi[] piVarArr = this.f32963w0;
            if (i10 < piVarArr.length) {
                pi piVar = piVarArr[i10];
                if (piVar != null) {
                    piVar.m();
                    this.containerView.removeView(piVarArr[i10]);
                    piVarArr[i10] = null;
                }
                i10++;
            } else {
                S1(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    public final boolean F1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            TLRPC.Chat chat = ynVar.f43315e;
            if (ynVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.J1).edit();
                edit.putBoolean("silent_" + ynVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (b1(m1().getText())) {
            return true;
        }
        Z0();
        if (this.h.f15437f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        pi piVar = this.f32971y0;
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

    public final void G1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f32894b.a(z10, z11);
        mu m12 = m1();
        this.f32899c0 = z10;
        mu m13 = m1();
        int i11 = 0;
        if (this.D0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        pi piVar = this.f32971y0;
        if (piVar != this.f32922j0 && piVar != this.f32942q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f32899c0 && z13) {
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
                public final xi f27227b;

                {
                    this.f27227b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            xi xiVar = this.f27227b;
                            if (!z14 || !z12) {
                                xiVar.O0.setVisibility(8);
                            }
                            xiVar.a2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f27227b.C0.setVisibility(8);
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
                public final xi f27227b;

                {
                    this.f27227b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            xi xiVar = this.f27227b;
                            if (!z14 || !z12) {
                                xiVar.O0.setVisibility(8);
                            }
                            xiVar.a2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f27227b.C0.setVisibility(8);
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
            a2();
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

    public final void H1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f32922j0) != null) {
            chatAttachAlertPhotoLayout.Y();
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
        U1(0);
    }

    public final void I1(int i10, boolean z10) {
        if (this.H1 != null) {
            return;
        }
        this.S1 = i10;
        this.T1 = z10;
    }

    public final void J1(float f7) {
        boolean z10 = false;
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
        getContainer().invalidate();
    }

    public final void K1(String str) {
        boolean z10 = true;
        this.Q0 = 1;
        this.F = true;
        this.S0 = false;
        this.M1 = false;
        this.f32968x1.setVisibility(8);
        this.f32923j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
        if (chatAttachAlertPhotoLayout != null) {
            xi xiVar = chatAttachAlertPhotoLayout.f29741b;
            chatAttachAlertPhotoLayout.f24043g1 = (xiVar.Q0 == 0 || xiVar.F) ? false : false;
        }
    }

    public final void L1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.L1(boolean):void");
    }

    public final void M1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.M1(long, java.lang.String, boolean, boolean):void");
    }

    public final void N1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.yn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.yn) n2Var).f43315e)) {
            new yc(this.f32947r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new be(5, this, n2Var)).j();
        }
    }

    public final boolean O1(boolean z10, boolean z11) {
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
        this.f32898c.a(z10, true);
        wh whVar = this.D0;
        if (whVar.getTag() != null) {
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
        whVar.setTag(num);
        zh zhVar = this.E0;
        if (zhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        zhVar.k(true);
        this.P0.k(true);
        wh whVar2 = this.f32968x1;
        wh whVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                whVar.setVisibility(0);
            }
            whVar3.setVisibility(0);
        } else if (this.S0) {
            whVar2.setVisibility(0);
        }
        pi piVar2 = this.f32971y0;
        if ((piVar2 == this.f32922j0 || piVar2 == this.f32942q0) && this.f32899c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        y7 y7Var2 = this.X0;
        ci.m6 m6Var = this.O0;
        hg.k kVar = this.C0;
        ei eiVar = this.I0;
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
            arrayList.add(ObjectAnimator.ofFloat(whVar, property, f18));
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
            arrayList.add(ObjectAnimator.ofFloat(whVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(whVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(whVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(eiVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(eiVar, property3, f26));
            if (y7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(whVar, property4, f28));
            } else if (this.S0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(whVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(whVar2, property, f27));
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
            whVar.setAlpha(f7);
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
            whVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            whVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            whVar3.setAlpha(f13);
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
            eiVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            eiVar.setScaleY(f16);
            if (y7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                whVar.setTranslationY(dp);
            } else if (this.S0 && ((piVar = this.f32971y0) == null || piVar.H())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                whVar2.setTranslationY(f17);
            }
            if (!z10) {
                whVar.setVisibility(4);
                whVar3.setVisibility(4);
            }
            if (z13) {
                a2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f32971y0.getSelectedItemsCount());
        }
        eiVar.g(i10, z11);
        if (this.H1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1());
        }
        eiVar.i(j1() + this.f32971y0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void P1(pi piVar) {
        long j3 = this.W0;
        yn ynVar = this.T;
        if (piVar == ynVar) {
            j3 = ynVar.f33303s;
        } else if (piVar == this.f32922j0) {
            j3 = 1;
        } else if (piVar == this.f32928l0) {
            j3 = 3;
        } else if (piVar == this.f32939p0) {
            j3 = 4;
        } else if (piVar == this.f32925k0) {
            j3 = 5;
        } else if (piVar == this.f32936o0) {
            j3 = 6;
        } else if (piVar == this.m0) {
            j3 = 9;
        } else if (piVar == this.f32946r0) {
            j3 = 10;
        } else if (piVar == this.f32950s0) {
            j3 = 11;
        } else if (piVar == this.f32933n0) {
            j3 = 12;
        } else if (piVar == this.f32953t0) {
            j3 = 14;
        } else if (piVar == this.f32956u0) {
            j3 = 13;
        } else if (piVar == this.f32959v0) {
            j3 = 16;
        }
        Q1(piVar, j3, true);
    }

    public final void Q1(pi piVar, long j3, boolean z10) {
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
        if (this.f32954t1 == null && this.M0 == null) {
            pi piVar2 = this.f32971y0;
            if (piVar2 == piVar) {
                piVar2.E();
                return;
            }
            int i13 = 0;
            if (piVar == this.f32933n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.y0(this.f32910f0, 39, false).show();
                return;
            }
            int i14 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
            if (i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32909f.a(z11, z10);
            this.f32932n.i(Long.valueOf(j3), z10);
            this.D1 = false;
            this.B1 = false;
            this.F1 = 0.0f;
            this.E1.setVisibility(8);
            RadialProgressView radialProgressView = this.C1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            wh whVar = this.f32968x1;
            whVar.setAlpha(1.0f);
            whVar.setTranslationY(this.F1);
            int i15 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.f32967x0;
                if (i15 >= longSparseArray.size()) {
                    break;
                }
                ((ei.r4) longSparseArray.valueAt(i15)).setMeasureOffsetY(0);
                i15++;
            }
            this.W0 = j3;
            xh xhVar = this.f32972y1;
            int childCount = xhVar.getChildCount();
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = xhVar.getChildAt(i16);
                if (childAt instanceof ri) {
                    ri riVar = (ri) childAt;
                    i12 = i14;
                    f7 = valueOf;
                    if (riVar.f30495b == riVar.f30496c.W0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    riVar.f30794a.e(z13, true);
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
            int firstOffset = (this.f32971y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f32897b2[0];
            this.f32974z0 = piVar;
            piVar.getClass();
            boolean z14 = piVar instanceof ii.r;
            jh.f fVar = this.f32960v1;
            if (fVar != null) {
                if (z14) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                fVar.setFadeHeightBottom(dp);
            }
            yh yhVar = this.f32964w1;
            if (yhVar != null) {
                if (z14) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                yhVar.setVisibility(i11);
            }
            if (this.f32974z0.h() != 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            y7 y7Var = this.X0;
            y7Var.setVisibility(i10);
            if (y7Var.f21286n0) {
                y7Var.h(true);
            }
            this.f32971y0.r();
            pi piVar3 = this.f32974z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
            if (piVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.f32974z0.C(this.f32971y0);
            this.f32974z0.setVisibility(0);
            if (piVar.getParent() != null) {
                this.containerView.removeView(this.f32974z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.f32971y0);
            ViewParent parent = this.f32974z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                pi piVar4 = this.f32974z0;
                if (piVar4 != this.f32936o0) {
                    indexOfChild++;
                }
                viewGroup.addView(piVar4, indexOfChild, w7.z5.c(-1.0f, -1));
            }
            ih ihVar = new ih(this, 3);
            pi piVar5 = this.f32971y0;
            boolean z15 = piVar5 instanceof tm;
            ii iiVar = this.f32906e0;
            if (!z15 && !(this.f32974z0 instanceof tm)) {
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f32974z0.setAlpha(0.0f);
                    this.f32974z0.setTranslationY(AndroidUtilities.dp(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.f32971y0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f32971y0, iiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, View.ALPHA, y7Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(tr.f31215f);
                    animatorSet.addListener(new fi(this, firstOffset, ihVar, 0));
                    this.f32954t1 = animatorSet;
                    iiVar.set(this.f32971y0, f10);
                    animatorSet.start();
                } else {
                    piVar5.setAlpha(0.0f);
                    ihVar.run();
                    Z1(0);
                    this.containerView.invalidate();
                }
            } else {
                int max = Math.max(this.f32974z0.getWidth(), this.f32971y0.getWidth());
                pi piVar6 = this.f32974z0;
                if (piVar6 instanceof tm) {
                    piVar6.setTranslationX(max);
                    pi piVar7 = this.f32971y0;
                    if ((piVar7 instanceof ChatAttachAlertPhotoLayout) && (gmVar2 = ((ChatAttachAlertPhotoLayout) piVar7).P) != null) {
                        gmVar2.setVisibility(4);
                    }
                } else {
                    this.f32971y0.setTranslationX(-max);
                    pi piVar8 = this.f32974z0;
                    if (piVar8 == chatAttachAlertPhotoLayout && (gmVar = ((ChatAttachAlertPhotoLayout) piVar8).P) != null) {
                        gmVar.setVisibility(0);
                    }
                }
                this.f32974z0.setAlpha(1.0f);
                this.f32971y0.setAlpha(1.0f);
                if (z10) {
                    iiVar.set(this.f32971y0, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, piVar, ihVar, 15));
                } else {
                    if (this.f32974z0.getCurrentItemTop() <= piVar.getButtonsHideOffset()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f32971y0.s(1.0f);
                    this.f32974z0.s(1.0f);
                    this.f32971y0.k(this.f32929l2);
                    this.f32974z0.k(this.f32929l2);
                    this.containerView.invalidate();
                    this.glassEngine.g();
                    iiVar.set(this.f32971y0, Float.valueOf(1.0f));
                    if (z12) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    y7Var.setTag(num);
                    ihVar.run();
                }
            }
            if (this.f32931m2 && !(piVar instanceof ei.r4)) {
                this.f32931m2 = false;
                y7Var.e();
                y7Var.invalidate();
                t1();
            }
            if (i17 != 0 && j3 != 6 && !(piVar instanceof ei.r4)) {
                if (j3 == 4) {
                    i13 = AndroidUtilities.dp(84.0f);
                }
            } else {
                i13 = AndroidUtilities.dp(46.0f);
            }
            y7Var.setForcedMenuWidth(i13);
        }
    }

    public final void R1(boolean z10, Boolean bool) {
        xi xiVar;
        if (this.m0 == null) {
            xiVar = this;
            xn xnVar = new xn(xiVar, getContext(), false, this.resourcesProvider, bool);
            xiVar.m0 = xnVar;
            xiVar.f32963w0[1] = xnVar;
            xnVar.setDelegate(new fh(this, 17));
        } else {
            xiVar = this;
        }
        Q1(xiVar.m0, 9L, z10);
    }

    public final void S1(boolean z10, boolean z11) {
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
            if (!this.F && !this.T0 && ((this.Q0 != 0 || !this.f32943q1) && this.f32971y0 == this.f32922j0 && (this.L1 || this.M1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f32971y0 == this.T) {
                z12 = false;
            }
            wh whVar = this.f32968x1;
            org.telegram.ui.ActionBar.v0 v0Var = this.f32893a1;
            if (z10) {
                if (z12) {
                    v0Var.setVisibility(0);
                    v0Var.setClickable(true);
                }
            } else if (this.S0 && this.D0.getTag() == null) {
                whVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
            if (n2Var != null) {
                if (z10) {
                    if (this.f32918h2) {
                        i10 = org.telegram.ui.ActionBar.i6.f21135tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f20899h5;
                    }
                    if (i0.a.f(getThemedColor(i10)) > 0.699999988079071d) {
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
                    arrayList.add(ObjectAnimator.ofFloat(v0Var, property, f15));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var, property2, f13));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var, property3, f14));
                }
                this.Y0.playTogether(arrayList);
                this.Y0.addListener(new da(2, this, z10));
                this.Y0.setInterpolator(tr.h);
                this.Y0.setDuration(380L);
                this.Y0.start();
                return;
            }
            if (z10 && this.S0 && ((piVar = this.f32971y0) == null || piVar.H())) {
                whVar.setVisibility(4);
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
                v0Var.setAlpha(f15);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                v0Var.setScaleX(f10);
                if (z10) {
                    f14 = 1.0f;
                }
                v0Var.setScaleY(f14);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f32907e1;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(4);
                }
                if (this.Q0 != 0 || !this.f32943q1) {
                    v0Var.setVisibility(4);
                }
            }
        }
    }

    public final void T1() {
        float alpha;
        int[] iArr = this.G0;
        zh zhVar = this.E0;
        zhVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            pi piVar = this.f32971y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
            if ((piVar == chatAttachAlertPhotoLayout || piVar == this.f32942q0) && this.f32899c0) {
                ci.m6 m6Var = this.O0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.B2.getTop());
            } else {
                alpha = -zhVar.getHeight();
            }
            if (Math.abs(this.B2.getTranslationY() - alpha) > 0.5f) {
                this.B2.setTranslationY(alpha);
                this.B2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.T();
                }
            }
        }
        g1();
    }

    public final void U1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.U1(int):void");
    }

    public final void V1() {
        boolean g10;
        float f7;
        float f10;
        float f11;
        pi piVar = this.f32971y0;
        int i10 = 0;
        if (piVar == null) {
            g10 = false;
        } else {
            g10 = piVar.g();
        }
        bi.o oVar = this.f32911f1;
        oVar.setEnabled(g10);
        pi piVar2 = this.f32971y0;
        float f12 = 0.5f;
        if (piVar2 != null) {
            if (piVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f32974z0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f32902d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        pi piVar3 = this.f32974z0;
        if (piVar3 != null) {
            if (piVar3.g()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f32902d0, f12, f7);
        }
        this.f32914g1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f32917h1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void W1(pi piVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (piVar != null) {
            ah.i iVar = this.C2;
            if (iVar != null && Build.VERSION.SDK_INT >= 31) {
                iVar.f(0.0f, i10);
            }
            int currentItemTop = piVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (piVar == this.f32971y0 && currentItemTop <= piVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (piVar == this.f32971y0) {
                    S1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) piVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.bi.D(11.0f, i11, currentItemTop);
                pi piVar2 = this.f32971y0;
                if (piVar2 == piVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((piVar2 instanceof tm) || (this.f32974z0 instanceof tm)) {
                    Object obj = this.f32954t1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f16986f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f32897b2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f32901c2 = i13;
                        return;
                    }
                    return;
                }
                this.f32901c2 = i13;
                iArr[i12] = D;
                Z1(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void X1(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f32896b1) != null) {
            int i10 = 0;
            if (this.f32943q1 && this.f32919i0 && this.f32971y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.Q();
            uVar.f6041f = z12;
            if (!z10) {
                ((e6) uVar.f6042g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.v0 v0Var = this.f32900c1;
            if (z10 && this.f32943q1) {
                v0Var.setVisibility(0);
                ViewPropertyAnimator animate = v0Var.animate();
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(tr.h).withEndAction(new ph(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i10 = 8;
            }
            v0Var.setVisibility(i10);
            if (z11) {
                f11 = 1.0f;
            }
            v0Var.setAlpha(f11);
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            v0Var.setScaleX(f7);
            if (z11) {
                f12 = 1.0f;
            }
            v0Var.setScaleY(f12);
        }
    }

    public final void Y1(boolean z10) {
        boolean z11;
        float f7;
        pi piVar = this.f32922j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f32942q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f32945r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                ?? piVar2 = new pi(context, d6Var, this);
                piVar2.f31189y = 0.0f;
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
                piVar2.f31184n = d6Var;
                piVar2.f29744f = true;
                piVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = piVar2.f29741b.X0.n();
                TextView textView = new TextView(context);
                piVar2.f31188x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = piVar2.f29740a;
                bm bmVar = new bm(piVar2, context, n10, d6Var2, 1);
                y7 y7Var = piVar2.f29741b.X0;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                y7Var.addView(bmVar, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                bmVar.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(piVar2, context, d6Var2, 14);
                piVar2.f31185r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.z7(piVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                piVar2.f31186s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                sm smVar = new sm(piVar2, context);
                piVar2.v = smVar;
                smVar.setClipToPadding(true);
                smVar.setClipChildren(true);
                piVar2.addView(w0Var, w7.z5.c(-1.0f, -1));
                piVar2.P = piVar2.f29741b.f32922j0;
                smVar.f30870c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = piVar2.P;
                smVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                smVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                smVar.c();
                UndoView undoView = new UndoView(context, null, false, piVar2.f29741b.f32945r);
                piVar2.f31187w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                piVar2.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                piVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f32942q0 = piVar2;
                piVar2.bringToFront();
            }
            pi piVar3 = this.f32971y0;
            tm tmVar = this.f32942q0;
            if (piVar3 != tmVar) {
                piVar = tmVar;
            }
            P1(piVar);
            return;
        }
        P1(piVar);
    }

    public final void Z0() {
        if (m1().f28793a.length() <= 0) {
            return;
        }
        this.f32971y0.a(m1().getText());
    }

    public final void Z1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.Z1(int):void");
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
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
            if (xnVar != null && ((piVar = this.f32974z0) == xnVar || this.f32971y0 == xnVar)) {
                if (piVar == xnVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                Z1(i11);
            }
            xn xnVar2 = this.f32933n0;
            if (xnVar2 != null) {
                pi piVar2 = this.f32974z0;
                if (piVar2 == xnVar2 || this.f32971y0 == xnVar2) {
                    if (piVar2 != xnVar2) {
                        i12 = 0;
                    }
                    Z1(i12);
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
            ei eiVar = this.I0;
            if (eiVar != null) {
                eiVar.setEphemeralFactor(f7);
                eiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if ((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2() {
        int i10 = 0;
        Z1(0);
        this.f32947r1.invalidate();
        ci.m6 m6Var = this.O0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
        if (chatAttachAlertPhotoLayout != null) {
            wl wlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.T();
            if (wlVar != null && wlVar.getFastScroll() != null) {
                fl0 fastScroll = wlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f24060p1;
                if (this.f32899c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.f26512h0 = currentActionBarHeight + i10;
                wlVar.getFastScroll().invalidate();
            }
        }
        T1();
        g1();
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ChatActivityEnterView.G(this.J1, ((org.telegram.ui.yn) n2Var).a(), n2Var, charSequence);
        }
        return false;
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
        xh xhVar = this.f32972y1;
        if (xhVar == null) {
            return;
        }
        int childCount = xhVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            xhVar.getChildAt(i20);
        }
        boolean z11 = this.f32918h2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.i6.f20908hg;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f20935j5;
        }
        this.f32923j1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.i6.f20908hg;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f20935j5;
        }
        this.f32937o1.setTextColor(getThemedColor(i11));
        this.f32911f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.i6.f20908hg;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.f20935j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.v0 v0Var = this.f32893a1;
        v0Var.setIconColor(themedColor);
        Drawable background = v0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.i6.f20927ig;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.I5;
        }
        org.telegram.ui.ActionBar.i6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.i6.E8;
        v0Var.G(getThemedColor(i21), false);
        v0Var.G(getThemedColor(i21), true);
        v0Var.B(getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32900c1;
        if (v0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.i6.f20908hg;
            } else {
                i19 = org.telegram.ui.ActionBar.i6.f20935j5;
            }
            v0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f32907e1;
        if (v0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.i6.f20908hg;
            } else {
                i17 = org.telegram.ui.ActionBar.i6.f20935j5;
            }
            v0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = v0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.i6.f20927ig;
            } else {
                i18 = org.telegram.ui.ActionBar.i6.I5;
            }
            org.telegram.ui.ActionBar.i6.w1(getThemedColor(i18), background2);
        }
        zh zhVar = this.E0;
        org.telegram.ui.ActionBar.d6 d6Var = zhVar.M;
        hu huVar = zhVar.f28793a;
        int i22 = zhVar.L;
        if (i22 == 0) {
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
            int i23 = org.telegram.ui.ActionBar.i6.G6;
            huVar.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i23, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i23, d6Var));
        } else if (i22 != 2 && i22 != 3) {
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21125t5, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, d6Var));
        } else {
            huVar.setHintTextColor(-1929379841);
            huVar.setTextColor(-1);
            huVar.setCursorColor(-1);
            huVar.setHandlesColor(-1);
            huVar.setHighlightColor(822083583);
            huVar.quoteColor = -1;
        }
        zhVar.f28795c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        iu iuVar = zhVar.d;
        if (iuVar != null) {
            iuVar.Q();
        }
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.i6.f20908hg;
        } else {
            i14 = org.telegram.ui.ActionBar.i6.f20935j5;
        }
        int themedColor2 = getThemedColor(i14);
        y7 y7Var = this.X0;
        y7Var.A(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.i6.f20927ig;
        } else {
            i15 = org.telegram.ui.ActionBar.i6.I5;
        }
        y7Var.z(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.i6.f20908hg;
        } else {
            i16 = org.telegram.ui.ActionBar.i6.f20935j5;
        }
        y7Var.setTitleColor(getThemedColor(i16));
        int p12 = p1(false);
        org.telegram.ui.ActionBar.i6.w1(p12, this.shadowDrawable);
        fh.c cVar = this.D2;
        if (cVar.f9858b != p12) {
            cVar.a(p12);
            jh.f fVar = this.f32960v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.f32964w1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            pi[] piVarArr = this.f32963w0;
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
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20917i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f32971y0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f32941p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f32944q2;
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
            E1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f32971y0.o(i10);
    }

    public final void e1() {
        float f7 = this.f32898c.f15436e;
        float f10 = (1.0f - this.f32894b.f15436e) * f7;
        this.f32964w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.f15436e))), 1.0f - f10));
    }

    public final void f1() {
        float f7;
        float f10 = this.f32905e.f15436e;
        float f11 = this.f32909f.f15436e;
        float a2 = w7.d9.a(this.h.f15436e);
        if (this.R1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        c20.d(this.F0, com.google.android.gms.internal.vision.e2.C(f10, f11, a2, f7));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        ei eiVar = this.I0;
        wh whVar = this.H0;
        ci.m6 m6Var = this.O0;
        if (m6Var != null && m6Var.getVisibility() == 0 && m6Var.getAlpha() != 0.0f) {
            float f7 = this.f32894b.f15436e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            eiVar.setAlpha(abs * abs * abs * abs);
            whVar.setTranslationY(AndroidUtilities.lerp(this.f32915g2, ((m6Var.getTranslationY() + m6Var.getTop()) - whVar.getTop()) + AndroidUtilities.dp(8.0f), tr.f31218j.getInterpolation(f7)));
            return;
        }
        whVar.setTranslationY(this.f32915g2);
        eiVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f32963w0;
            if (i10 < piVarArr.length) {
                pi piVar = piVarArr[i10];
                if (piVar != null && (themeDescriptions = piVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20917i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.S0 = true;
        this.f32968x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.v0 v0Var = this.f32926k1;
        if (v0Var != null) {
            this.f32923j1.setTranslationY(0.0f);
            v0Var.setVisibility(8);
        }
    }

    public final void i1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f32923j1;
        textView.setText(string);
        this.S0 = false;
        this.f32968x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.f32919i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.v0 v0Var = this.f32926k1;
        if (v0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            v0Var.setVisibility(0);
            v0Var.setClickable(true);
            v0Var.setAlpha(1.0f);
            v0Var.setScaleX(1.0f);
            v0Var.setScaleY(1.0f);
        }
    }

    public final int j1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if ((n2Var instanceof org.telegram.ui.yn) && (messagePreviewParams = ((org.telegram.ui.yn) n2Var).f43307d5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) n2Var).f43315e;
        }
        return MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        wh whVar = this.D0;
        float alpha = 1.0f - whVar.getAlpha();
        return whVar.getMeasuredHeight() - (alpha * (whVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final mu m1() {
        pi piVar;
        if (this.f32899c0 && ((piVar = this.f32971y0) == this.f32922j0 || piVar == this.f32942q0)) {
            return this.P0;
        }
        return this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) n2Var).a();
        }
        return this.Z;
    }

    public final int o1(int i10) {
        pi piVar = this.f32974z0;
        int[] iArr = this.f32897b2;
        if (piVar != null && ((this.f32971y0 instanceof tm) || (piVar instanceof tm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f32902d0);
        }
        return iArr[i10];
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
        if (y7Var.f21286n0) {
            y7Var.h(true);
        } else if (this.f32971y0.i()) {
        } else {
            if (m1() != null && m1().f28796e) {
                m1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.f32971y0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
        ca1 ca1Var = chatAttachAlertPhotoLayout.f24052l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f24048j0;
        TextView textView = chatAttachAlertPhotoLayout.f24059p0;
        wl wlVar = chatAttachAlertPhotoLayout.f24062r;
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
                    f0Var.layout(0, org.telegram.messenger.q.B(222.0f, i13, i16), i14, org.telegram.messenger.q.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.q.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (wlVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.q.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.q.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == ca1Var) {
            if (z10) {
                if (wlVar.getVisibility() == 0) {
                    ca1Var.layout(0, org.telegram.messenger.q.B(310.0f, i13, i16), i14, org.telegram.messenger.q.B(260.0f, i13, i16));
                    return true;
                }
                ca1Var.layout(0, org.telegram.messenger.q.B(176.0f, i13, i16), i14, org.telegram.messenger.q.B(126.0f, i13, i16));
                return true;
            } else if (wlVar.getVisibility() == 0) {
                ca1Var.layout(org.telegram.messenger.q.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                ca1Var.layout(org.telegram.messenger.q.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
        km kmVar = chatAttachAlertPhotoLayout.v;
        wl wlVar = chatAttachAlertPhotoLayout.f24062r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.f24064s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        gm gmVar = chatAttachAlertPhotoLayout.P;
        if (view == gmVar) {
            if (chatAttachAlertPhotoLayout.f24032b0 && !chatAttachAlertPhotoLayout.f24036d0) {
                gmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f24048j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            ca1 ca1Var = chatAttachAlertPhotoLayout.f24052l0;
            if (view == ca1Var) {
                if (z10) {
                    ca1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                ca1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == wlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    wlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (b0Var.f46526o != 0) {
                        wlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        kmVar.l();
                    }
                } else {
                    wlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (b0Var.f46526o != 1) {
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
        this.f32922j0.setTranslationX(0.0f);
        this.f32934n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32944q2 = animatorSet;
        ii iiVar = this.f32938o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, iiVar, 0.0f, 400.0f));
        this.f32944q2.setDuration(400L);
        this.f32944q2.setStartDelay(20L);
        iiVar.set(this, Float.valueOf(0.0f));
        this.f32944q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new gh(this, 2));
        o1.k kVar = this.f32941p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f16975n, 0.0f);
        this.f32941p2 = kVar2;
        if (this.H1 != null) {
            kVar2.f16993u.a(0.75f);
            this.f32941p2.f16993u.b(350.0f);
        } else {
            kVar2.f16993u.a(0.75f);
            this.f32941p2.f16993u.b(350.0f);
        }
        this.f32941p2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        org.telegram.ui.ActionBar.e3 e3Var = this.backDrawable;
        q6 q6Var = s6.d;
        if (this.dimBehind) {
            i10 = this.dimBehindAlpha;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(e3Var, q6Var, i10));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.o oVar = new org.telegram.messenger.video.o(this, animationNotificationsLocker, this.delegate, 14);
        this.f32941p2.a(new ei.n4(2, this, oVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, oVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        J1(0.0f);
        ofFloat2.addUpdateListener(new gh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(tr.f31215f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f32971y0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f32971y0.B(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f32910f0 instanceof org.telegram.ui.yn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f32971y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f32951s1 = true;
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

    public final int p1(boolean z10) {
        boolean q6;
        int i10;
        y7 y7Var;
        if (this.f32918h2) {
            return getThemedColor(org.telegram.ui.ActionBar.i6.f21135tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        Iterator it = this.f32932n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            long longValue = ((Long) gVar.f15447a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        if (z10 && (y7Var = this.X0) != null && y7Var.getVisibility() == 0) {
            a2 *= 1.0f - y7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.i6.f20771a7;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f20917i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void q1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.q1():void");
    }

    public final boolean r1() {
        if (this.f32899c0) {
            pi piVar = this.f32971y0;
            if (piVar == this.f32922j0 || piVar == this.f32942q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        vi viVar = this.Z1;
        if (viVar != null && !this.f32957u1) {
            boolean a02 = viVar.a0();
            this.f32957u1 = true;
            ci.y0 y0Var = new ci.y0(this, editTextBoldCursor, z10, 18);
            if (a02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(y0Var, j3);
        }
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        pi piVar = this.f32971y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32922j0;
        if (piVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f24047i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            this.calcMandatoryInsets = ((org.telegram.ui.yn) n2Var).w9();
        }
        V1();
        this.f32951s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f32931m2) {
            this.f32931m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            t1();
        }
    }

    public final void t1() {
        if (this.shadowDrawable != null && this.containerView != null) {
            int p12 = p1(false);
            org.telegram.ui.ActionBar.i6.w1(p12, this.shadowDrawable);
            fh.c cVar = this.D2;
            if (cVar.f9858b != p12) {
                cVar.a(p12);
                jh.f fVar = this.f32960v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                yh yhVar = this.f32964w1;
                if (yhVar != null) {
                    yhVar.invalidate();
                }
            }
            V1();
            this.containerView.invalidate();
        }
    }

    public final void u1() {
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f32963w0;
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
        zh zhVar = this.E0;
        if (zhVar != null) {
            zhVar.o();
        }
        bi biVar = this.P0;
        if (biVar != null) {
            biVar.o();
        }
    }

    public final void v1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
            if (tL_attachMenuBot2.bot_id == user.f20194id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.q5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void w1() {
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f32963w0;
            if (i10 < piVarArr.length) {
                pi piVar = piVarArr[i10];
                if (piVar != null) {
                    piVar.x();
                }
                i10++;
            } else {
                this.f32912f2 = true;
                return;
            }
        }
    }

    public final void x1() {
        int i10 = 0;
        this.f32912f2 = false;
        while (true) {
            pi[] piVarArr = this.f32963w0;
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
            this.Z1.a0();
        }
        ui uiVar = this.A1;
        if (uiVar != null) {
            uiVar.l();
        }
    }

    public final void y1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (n2Var instanceof org.telegram.ui.yn)) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            MessageSuggestionParams messageSuggestionParams = ynVar.f43321e5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.u5.U(i10, messageSuggestionParams.amount)) {
                ynVar.Sb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f32949s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.I0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() && MessagesController.getInstance(i10).captionLengthLimitPremium > this.L) {
                N1(n2Var);
                return;
            }
            return;
        }
        if (this.H1 == null && (n2Var instanceof org.telegram.ui.yn)) {
            org.telegram.ui.yn ynVar2 = (org.telegram.ui.yn) n2Var;
            if (ynVar2.c()) {
                e5.M(getContext(), ynVar2.a(), new fh(this, 14), this.resourcesProvider);
                return;
            }
        }
        pi piVar = this.f32971y0;
        if (piVar != this.f32922j0 && piVar != this.f32942q0) {
            if (!piVar.G(0, true, 0, r1(), this.N0)) {
                this.A2 = true;
                dismiss();
                return;
            }
            return;
        }
        F1(0, true, 0, r1(), this.N0);
    }

    public final void z1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (i10 == 3) {
            if (this.N1 || !a1()) {
                if (n2Var != null) {
                    activity = n2Var.getParentActivity();
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
                A1(true);
            }
        } else if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
            if (this.f32936o0 == null) {
                jl jlVar = new jl(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : false);
                this.f32936o0 = jlVar;
                this.f32963w0[5] = jlVar;
                el elVar = this.f32955t2;
                if (elVar != null) {
                    jlVar.setDelegate(elVar);
                } else if (n2Var instanceof org.telegram.ui.yn) {
                    jlVar.setDelegate(new fh(this, 18));
                }
            }
            P1(this.f32936o0);
        }
    }

    @Override
    public final void dismiss() {
        if (this.f32971y0.n() || isDismissed()) {
            return;
        }
        zh zhVar = this.E0;
        if (zhVar != null) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        bi biVar = this.P0;
        if (biVar != null) {
            AndroidUtilities.hideKeyboard(biVar.getEditText());
        }
        this.f32967x0.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.f32910f0;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        if (!this.A2 && n2Var != null && this.f32971y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.f32976z2) {
                return;
            }
            this.f32976z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new fh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20377a.setOnCancelListener(new lh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
            b2Var.N = b1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.f32963w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null && this.f32971y0 != piVar) {
                piVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7), 0), true, (AndroidUtilities.IntColorCallback) new fh(this, 12));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.f32921i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override
    public final void V(float f7, int i10) {
    }

    public xi(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}
