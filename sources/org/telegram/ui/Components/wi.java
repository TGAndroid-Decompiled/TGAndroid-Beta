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
public class wi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, le.e {
    public static final int O2 = 0;
    public final ch.d A0;
    public final ti A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.k C0;
    public final RadialProgressView C1;
    public final ah.h C2;
    public final yh D0;
    public boolean D1;
    public final fh.d D2;
    public final i0 E;
    public final bi E0;
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
    public final yh H0;
    public MessageObject H1;
    public final ah.c H2;
    public int I;
    public final gi I0;
    public boolean I1;
    public final lh I2;
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
    public final ei P0;
    public boolean P1;
    public t40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public rt R0;
    public boolean R1;
    public final ce0 S;
    public boolean S0;
    public int S1;
    public wn T;
    public boolean T0;
    public boolean T1;
    public v40 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public gk X;
    public final y7 X0;
    public ValueAnimator X1;
    public ej Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public ui Z1;
    public boolean f29989a0;
    public final org.telegram.ui.ActionBar.u0 f29990a1;
    public gn a2;
    public final le.c f29991b;
    public final ah.d f29992b0;
    public final ci.u f29993b1;
    public final int[] f29994b2;
    public final le.c f29995c;
    public boolean f29996c0;
    public final org.telegram.ui.ActionBar.u0 f29997c1;
    public int f29998c2;
    public final le.c d;
    public float f29999d0;
    public ci.e4 f30000d1;
    public float f30001d2;
    public final le.c e;
    public final ki f30002e0;
    public final org.telegram.ui.ActionBar.u0 f30003e1;
    public float f30004e2;
    public final le.c f30005f;
    public final org.telegram.ui.ActionBar.m2 f30006f0;
    public final bi.o f30007f1;
    public boolean f30008f2;
    public final boolean f30009g0;
    public float f30010g1;
    public float f30011g2;
    public final le.c h;
    public nf f30012h0;
    public float f30013h1;
    public final boolean f30014h2;
    public boolean f30015i0;
    public final yh f30016i1;
    public boolean f30017i2;
    public final ChatAttachAlertPhotoLayout f30018j0;
    public final TextView f30019j1;
    public final ArrayList f30020j2;
    public zj f30021k0;
    public final org.telegram.ui.ActionBar.u0 f30022k1;
    public final Rect f30023k2;
    public hj f30024l0;
    public final LinearLayout l1;
    public float f30025l2;
    public vn m0;
    public final ImageView f30026m1;
    public boolean f30027m2;
    public final le.m f30028n;
    public vn f30029n0;
    public final LinearLayout f30030n1;
    public int f30031n2;
    public hl f30032o0;
    public final TextView f30033o1;
    public final ki f30034o2;
    public pk f30035p0;
    public float f30036p1;
    public o1.k f30037p2;
    public rm f30038q0;
    public boolean f30039q1;
    public AnimatorSet f30040q2;
    public org.telegram.ui.un f30041r;
    public kj f30042r0;
    public final mi f30043r1;
    public boolean f30044r2;
    public final p6 f30045s;
    public hg.k0 f30046s0;
    public boolean f30047s1;
    public boolean f30048s2;
    public qk f30049t0;
    public Object f30050t1;
    public cl f30051t2;
    public qk f30052u0;
    public boolean f30053u1;
    public boolean f30054u2;
    public final p6 v;
    public ii.r f30055v0;
    public final jh.f f30056v1;
    public boolean f30057v2;
    public final ImageView f30058w;
    public final oi[] f30059w0;
    public final ai f30060w1;
    public File f30061w2;
    public final i0 f30062x;
    public final LongSparseArray f30063x0;
    public final yh f30064x1;
    public double[] f30065x2;
    public final ImageView f30066y;
    public oi f30067y0;
    public final zh f30068y1;
    public boolean f30069y2;
    public oi f30070z0;
    public final s4.c0 f30071z1;
    public boolean f30072z2;

    public wi(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        TextPaint textPaint;
        float f7;
        bi.o oVar;
        rr rrVar = rr.h;
        this.f29991b = new le.c(0, this, rrVar, 380L, false);
        this.f29995c = new le.c(1, this, rrVar, 380L, false);
        this.d = new le.c(2, this, rrVar, 380L, false);
        this.e = new le.c(3, this, rrVar, 380L, false);
        this.f30005f = new le.c(4, this, rrVar, 380L, true);
        this.h = new le.c(5, this, rrVar, 320L, false);
        le.m mVar = new le.m(new eh(this, 1), rrVar, 380L);
        this.f30028n = mVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.f29999d0 = 0.0f;
        this.f30002e0 = new ki(this, 0);
        this.f30015i0 = false;
        oi[] oiVarArr = new oi[11];
        this.f30059w0 = oiVarArr;
        this.f30063x0 = new LongSparseArray();
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
        this.f29994b2 = new int[2];
        new Paint(1);
        this.f30017i2 = false;
        ArrayList arrayList = new ArrayList();
        this.f30020j2 = arrayList;
        Rect rect = new Rect();
        this.f30023k2 = rect;
        this.f30034o2 = new ki(this, 1);
        this.f30044r2 = true;
        this.f30048s2 = false;
        this.f30072z2 = false;
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
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6));
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
        this.I2 = new lh(this, 0);
        this.f30014h2 = z10;
        this.f30009g0 = (m2Var instanceof org.telegram.ui.wn) && m2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f30006f0 = m2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        mi miVar = new mi(this, context);
        this.f30043r1 = miVar;
        miVar.setDelegate(new ni(this));
        this.containerView = miVar;
        miVar.setWillNotDraw(false);
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
        int i12 = org.telegram.ui.ActionBar.h6.f19166j5;
        y7Var.B(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.h6.I5;
        y7Var.A(getThemedColor(i13), false);
        y7Var.setTitleColor(getThemedColor(i12));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 8));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
        this.f29990a1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new eh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
        this.f29997c1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.f29993b1 = uVar;
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
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
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
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        w7.a6.a(oVar2);
        this.f30007f1 = oVar2;
        W1();
        if (m2Var != null) {
            textPaint = textPaint2;
            u0Var = u0Var3;
            oVar = oVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i12), false, d6Var);
            this.f30003e1 = u0Var4;
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
        this.f30022k1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 3, -1));
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final wi f25419b;

            {
                this.f25419b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.wn wnVar;
                switch (r3) {
                    case 0:
                        final wi wiVar = this.f25419b;
                        bi biVar = wiVar.E0;
                        if (biVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(wiVar.getContext(), d6Var);
                            e0Var.m0(biVar.getText());
                            e0Var.f23787j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            bi biVar2 = wiVar.E0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ei eiVar = wiVar.P0;
                                            eiVar.setText(charSequence);
                                            eiVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = wiVar.Z;
                            if (wiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            nh nhVar = new nh(wiVar, 0);
                            e0Var.f23789l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23790n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final wi wiVar2 = this.f25419b;
                        ei eiVar = wiVar2.P0;
                        if (eiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(wiVar2.getContext(), d6Var);
                            e0Var2.m0(eiVar.getText());
                            e0Var2.f23787j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            bi biVar2 = wiVar2.E0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ei eiVar2 = wiVar2.P0;
                                            eiVar2.setText(charSequence);
                                            eiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = wiVar2.Z;
                            if (wiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nh nhVar2 = new nh(wiVar2, 1);
                            e0Var2.f23789l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23790n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        wi wiVar3 = this.f25419b;
                        wiVar3.f30022k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar3.f30006f0;
                        t12.J2(null, m2Var2, d6Var);
                        PhotoViewer.t1().K2(wiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i14 = wiVar3.S1;
                        boolean z15 = wiVar3.T1;
                        t13.h = i14;
                        t13.f31300n = z15;
                        if (!wiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(wiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(wiVar3.J1, "webp");
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
                        xh xhVar = new xh(wiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            wnVar = (org.telegram.ui.wn) m2Var2;
                        } else {
                            wnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, xhVar, wnVar);
                        if (wiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, wiVar3.J);
                            return;
                        }
                        return;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        u0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        yh yhVar = new yh(this, context, 0);
        this.f30016i1 = yhVar;
        yhVar.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        yhVar.setAlpha(0.0f);
        yhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f30019j1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.y5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f30026m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.y5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        yhVar.addView(linearLayout, w7.y5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30030n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f30033o1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.y5.q(-2, -2, 16));
        yhVar.addView(linearLayout2, w7.y5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.f30018j0 = chatAttachAlertPhotoLayout;
        oiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f30067y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f30056v1 = view;
        view.setup(cVar4);
        view.setFadeTopAlpha(0);
        view.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        view.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView((View) view, w7.y5.g());
        this.containerView.addView(yhVar, w7.y5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.O0 = m6Var;
        this.containerView.addView(m6Var, w7.y5.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.y5.c(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.y5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f30003e1;
        if (u0Var6 != null) {
            this.containerView.addView(u0Var6, w7.y5.e(48, 48, 53));
        }
        yhVar.addView(u0Var5, w7.y5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.y5.e(-2, 48, 53));
        yh yhVar2 = new yh(this, context, 1);
        this.f30064x1 = yhVar2;
        zh zhVar = new zh(context, 0);
        this.f30068y1 = zhVar;
        zhVar.setClipChildren(true);
        zhVar.setClipToPadding(false);
        ti tiVar = new ti(this, context);
        this.A1 = tiVar;
        zhVar.setAdapter(tiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f30071z1 = c0Var;
        zhVar.setLayoutManager(c0Var);
        zhVar.setVerticalScrollBarEnabled(false);
        zhVar.setHorizontalScrollBarEnabled(false);
        zhVar.setItemAnimator(null);
        zhVar.setLayoutAnimation(null);
        zhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        zhVar.f30135z2 = true;
        zhVar.setOverScrollMode(2);
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
        ai aiVar = new ai(this, context, 0);
        this.f30060w1 = aiVar;
        ah.d dVar3 = new ah.d(cVar4.c(aiVar, null, false));
        this.f29992b0 = dVar3;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        dVar3.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(aiVar, w7.y5.g());
        ch.d c10 = this.G2.c(yhVar2, eh.b.f(d6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        yhVar2.setBackground(c10);
        zhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        zhVar.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f47112a;
        zhVar.setOutlineProvider(new yf.h0(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        zhVar.setImportantForAccessibility(1);
        yhVar2.addView(zhVar, w7.y5.g());
        this.containerView.addView(yhVar2, w7.y5.e(-1, 70, 81));
        zhVar.setOnItemClickListener(new ai.n6(9, this, d6Var));
        zhVar.setOnItemLongClickListener(new eh(this, 3));
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
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
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
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f19462z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        yh yhVar3 = new yh(this, context, 2);
        this.D0 = yhVar3;
        hg.k kVar4 = new hg.k(this, context);
        this.C0 = kVar4;
        yhVar3.addView(kVar4, w7.y5.e(-1, -1, 119));
        ch.d c11 = this.H2.c(miVar, eh.b.n(d6Var), false);
        this.A0 = c11;
        c11.f4283m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.f4280j.f4266g = 0.4f;
        c11.k();
        ch.d c12 = this.G2.c(kVar4, eh.b.n(d6Var), false);
        this.B0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        kVar4.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        yhVar3.setWillNotDraw(false);
        yhVar3.setVisibility(4);
        yhVar3.setAlpha(0.0f);
        this.containerView.addView(yhVar3, w7.y5.e(-1, -2, 83));
        yhVar3.setOnTouchListener(new bi.d(13));
        p6 p6Var2 = new p6(context, false, false, false);
        this.f30045s = p6Var2;
        p6Var2.setAllowCancel(true);
        p6Var2.setScaleProperty(0.6f);
        p6Var2.setVisibility(8);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i14 = org.telegram.ui.ActionBar.h6.f19443y6;
        p6Var2.setTextColor(getThemedColor(i14));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        kVar4.addView(p6Var2, w7.y5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f30058w = imageView4;
        i0 i0Var = new i0(context);
        this.f30062x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.h6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        int i16 = org.telegram.ui.ActionBar.h6.f19149i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i16), 1, AndroidUtilities.dp(16.0f)));
        kVar4.addView(imageView4, w7.y5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25419b;

            {
                this.f25419b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.wn wnVar;
                switch (r3) {
                    case 0:
                        final wi wiVar = this.f25419b;
                        bi biVar = wiVar.E0;
                        if (biVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(wiVar.getContext(), d6Var);
                            e0Var.m0(biVar.getText());
                            e0Var.f23787j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            bi biVar2 = wiVar.E0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ei eiVar2 = wiVar.P0;
                                            eiVar2.setText(charSequence);
                                            eiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = wiVar.Z;
                            if (wiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            nh nhVar = new nh(wiVar, 0);
                            e0Var.f23789l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23790n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final wi wiVar2 = this.f25419b;
                        ei eiVar = wiVar2.P0;
                        if (eiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(wiVar2.getContext(), d6Var);
                            e0Var2.m0(eiVar.getText());
                            e0Var2.f23787j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            bi biVar2 = wiVar2.E0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ei eiVar2 = wiVar2.P0;
                                            eiVar2.setText(charSequence);
                                            eiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = wiVar2.Z;
                            if (wiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nh nhVar2 = new nh(wiVar2, 1);
                            e0Var2.f23789l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23790n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        wi wiVar3 = this.f25419b;
                        wiVar3.f30022k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar3.f30006f0;
                        t12.J2(null, m2Var2, d6Var);
                        PhotoViewer.t1().K2(wiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = wiVar3.S1;
                        boolean z15 = wiVar3.T1;
                        t13.h = i142;
                        t13.f31300n = z15;
                        if (!wiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(wiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(wiVar3.J1, "webp");
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
                        xh xhVar = new xh(wiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            wnVar = (org.telegram.ui.wn) m2Var2;
                        } else {
                            wnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, xhVar, wnVar);
                        if (wiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, wiVar3.J);
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
        bi biVar = new bi(this, context, miVar, d6Var);
        this.E0 = biVar;
        biVar.J = true;
        biVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        biVar.s();
        biVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        biVar.getEditText().addTextChangedListener(new di(this));
        kVar4.addView(biVar, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        kVar4.setClipChildren(false);
        yhVar3.setClipChildren(false);
        biVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        ei eiVar = new ei(this, context, miVar, d6Var);
        this.P0 = eiVar;
        eiVar.J = true;
        eiVar.getEditText().addTextChangedListener(new fi(this, m2Var));
        eiVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        eiVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        eiVar.getEditText().setTextSize(1, 17.0f);
        eiVar.getEmojiButton().setLayoutParams(w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        eiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(eiVar, w7.y5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        biVar.addView(imageView3, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
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
        eiVar.addView(imageView5, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f30066y = imageView6;
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
            public final wi f25419b;

            {
                this.f25419b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                boolean z14;
                org.telegram.ui.wn wnVar;
                switch (r3) {
                    case 0:
                        final wi wiVar = this.f25419b;
                        bi biVar2 = wiVar.E0;
                        if (biVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(wiVar.getContext(), d6Var);
                            e0Var.m0(biVar2.getText());
                            e0Var.f23787j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            bi biVar22 = wiVar.E0;
                                            biVar22.setText(charSequence);
                                            biVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ei eiVar2 = wiVar.P0;
                                            eiVar2.setText(charSequence);
                                            eiVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = wiVar.Z;
                            if (wiVar.H1 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            nh nhVar = new nh(wiVar, 0);
                            e0Var.f23789l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.f23790n0 = nhVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final wi wiVar2 = this.f25419b;
                        ei eiVar2 = wiVar2.P0;
                        if (eiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(wiVar2.getContext(), d6Var);
                            e0Var2.m0(eiVar2.getText());
                            e0Var2.f23787j0 = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            bi biVar22 = wiVar2.E0;
                                            biVar22.setText(charSequence);
                                            biVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ei eiVar22 = wiVar2.P0;
                                            eiVar22.setText(charSequence);
                                            eiVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = wiVar2.Z;
                            if (wiVar2.H1 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nh nhVar2 = new nh(wiVar2, 1);
                            e0Var2.f23789l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.f23790n0 = nhVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        wi wiVar3 = this.f25419b;
                        wiVar3.f30022k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar3.f30006f0;
                        t12.J2(null, m2Var2, d6Var);
                        PhotoViewer.t1().K2(wiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i142 = wiVar3.S1;
                        boolean z15 = wiVar3.T1;
                        t13.h = i142;
                        t13.f31300n = z15;
                        if (!wiVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(wiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(wiVar3.J1, "webp");
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
                        xh xhVar = new xh(wiVar3, photoEntry);
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            wnVar = (org.telegram.ui.wn) m2Var2;
                        } else {
                            wnVar = null;
                        }
                        t14.f2(arrayList3, 0, 11, false, xhVar, wnVar);
                        if (wiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, wiVar3.J);
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
        yh yhVar4 = new yh(this, context, 3);
        this.H0 = yhVar4;
        yhVar4.setFocusable(true);
        yhVar4.setFocusableInTouchMode(true);
        yhVar4.setVisibility(4);
        yhVar4.setScaleX(0.2f);
        yhVar4.setScaleY(0.2f);
        yhVar4.setAlpha(0.0f);
        yhVar4.setClipChildren(false);
        yhVar4.setClipToPadding(false);
        this.containerView.addView(yhVar4, w7.y5.e(110, 50, 85));
        gi giVar = new gi(R.drawable.send_plane_24, context, d6Var, this);
        this.I0 = giVar;
        giVar.setImportantForAccessibility(2);
        yhVar4.addView(giVar, w7.y5.e(-1, -1, 119));
        giVar.setTranslationX(this.backgroundPaddingLeft);
        int dp2 = AndroidUtilities.dp(52.0f);
        int dp3 = AndroidUtilities.dp(38.0f);
        giVar.I = dp2;
        giVar.J = dp3;
        giVar.M = AndroidUtilities.dp(7.0f);
        giVar.N = AndroidUtilities.dp(6.0f);
        giVar.f29146h0 = true;
        giVar.setOnClickListener(new View.OnClickListener(this) {
            public final wi f25055b;

            {
                this.f25055b = this;
            }

            @Override
            public final void onClick(View view2) {
                ei.q4 q4Var;
                boolean z13;
                switch (r2) {
                    case 0:
                        wi wiVar = this.f25055b;
                        long j3 = wiVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) wiVar.f30063x0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 1:
                        wi wiVar2 = this.f25055b;
                        boolean z14 = wiVar2.f29996c0;
                        if (!z14) {
                            wiVar2.H1(!z14, true);
                            return;
                        }
                        return;
                    case 2:
                        wi wiVar3 = this.f25055b;
                        boolean z15 = wiVar3.f29996c0;
                        if (z15) {
                            wiVar3.H1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        this.f25055b.z1();
                        return;
                    case 4:
                        this.f25055b.f29990a1.M(null, null);
                        return;
                    case 5:
                        wi.s(this.f25055b);
                        return;
                    case 6:
                        oi oiVar = this.f25055b.f30067y0;
                        if (oiVar != null) {
                            oiVar.t(40);
                            return;
                        }
                        return;
                    case 7:
                        this.f25055b.f30022k1.M(null, null);
                        return;
                    default:
                        wi wiVar4 = this.f25055b;
                        if (wiVar4.f30067y0 != wiVar4.f30038q0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wiVar4.Z1(z13);
                        return;
                }
            }
        });
        giVar.setOnLongClickListener(new org.telegram.ui.eg(this, context, d6Var, m2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        ai aiVar2 = new ai(this, context, 1);
        aiVar2.setAlpha(0.0f);
        aiVar2.setScaleX(0.2f);
        aiVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        dl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.G2;
        dh.e n10 = eh.b.n(d6Var);
        wl0 wl0Var = fastScroll.f23669o0;
        ch.d c14 = cVar7.c(wl0Var.f30095f1, n10, false);
        fastScroll.f23658e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.f23658e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(wl0Var.f30095f1, n10, false);
        fastScroll.f23660f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f23660f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f23660f0.q(AndroidUtilities.dp(f7));
        ce0 ce0Var = new ce0(context);
        this.S = ce0Var;
        this.containerView.addView(ce0Var, w7.y5.c(-1.0f, -1));
        dh.e eVar = new dh.e(d6Var);
        eVar.e = new eh(this, 4);
        eVar.f7723c = new eh(this, 5);
        eVar.d = new eh(this, 6);
        eVar.f7722b = new eh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7725n = dpf2;
        eVar.f7726r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7724f = dpf23;
        eVar.h = dpf24;
        y7Var.M(this.G2, eVar, false);
        mVar.i(1L, false);
    }

    public static void M(wi wiVar) {
        boolean q6;
        int i10;
        int i11;
        y7 y7Var = wiVar.X0;
        jh.f fVar = wiVar.f30056v1;
        if (fVar != null && y7Var != null) {
            org.telegram.ui.ActionBar.d6 d6Var = wiVar.resourcesProvider;
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

    public static void Q(wi wiVar) {
        ci.i iVar = new ci.i(wiVar, wiVar.getContext(), wiVar.Z, LaunchActivity.R(), wiVar.resourcesProvider, 1);
        wiVar.B2 = iVar;
        iVar.p(new n2.e(wiVar, 6));
        ViewGroup viewGroup = wiVar.containerView;
        viewGroup.addView(wiVar.B2, viewGroup.indexOfChild(wiVar.D0), w7.y5.e(-1, -1, 83));
        ci.i iVar2 = wiVar.B2;
        iVar2.getAdapter().f9798c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30006f0;
        boolean z10 = true;
        if (m2Var instanceof org.telegram.ui.wn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
            gg.k1 adapter = iVar2.getAdapter();
            wnVar.i();
            TLRPC.Chat chat = wnVar.e;
            adapter.getClass();
            adapter.f9809l0 = chat;
            iVar2.getAdapter().W(wnVar.Z7);
            gg.k1 adapter2 = iVar2.getAdapter();
            if (wnVar.e == null) {
                z10 = false;
            }
            adapter2.f9801e0 = z10;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f9801e0 = false;
        }
        iVar2.getAdapter().f9803f0 = false;
        wiVar.U1();
    }

    public static void m(wi wiVar, ValueAnimator valueAnimator) {
        wiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = wiVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static void n(wi wiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        wiVar.currentSheetAnimation = null;
        wiVar.f30037p2 = null;
        animationNotificationsLocker.unlock();
        wiVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (wiVar.useHardwareLayer) {
            wiVar.container.setLayerType(0, null);
        }
        if (wiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = wiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            wiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void o(wi wiVar, int i10) {
        wiVar.navBarColorKey = -1;
        wiVar.navBarColor = i10;
        wiVar.containerView.invalidate();
    }

    public static void p(wi wiVar) {
        o1.k kVar = wiVar.f30037p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(wiVar.containerView, o1.h.f15516n, 0.0f);
        wiVar.f30037p2 = kVar2;
        kVar2.f15533u.a(1.5f);
        wiVar.f30037p2.f15533u.b(1500.0f);
        wiVar.f30037p2.f();
    }

    public static boolean q(org.telegram.ui.Components.wi r46, android.content.Context r47, org.telegram.ui.ActionBar.d6 r48, org.telegram.ui.ActionBar.m2 r49, android.view.View r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.q(org.telegram.ui.Components.wi, android.content.Context, org.telegram.ui.ActionBar.d6, org.telegram.ui.ActionBar.m2, android.view.View):boolean");
    }

    public static void r(wi wiVar, org.telegram.messenger.video.o oVar) {
        AnimatorSet animatorSet = wiVar.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            oVar.run();
        }
    }

    public static void s(wi wiVar) {
        int i10;
        if (wiVar.f30018j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f30018j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22123s1;
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
        wiVar.Y1(true);
        org.telegram.ui.ActionBar.u0 u0Var = wiVar.f29997c1;
        ci.e4 e4Var = wiVar.f30000d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = new ci.e4(wiVar.getContext(), 1);
        wiVar.f30000d1 = e4Var2;
        if (!S) {
            i10 = R.string.LivePhotosOn;
        } else {
            i10 = R.string.LivePhotosOff;
        }
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        wiVar.f30000d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        wiVar.f30000d1.m(1.0f, -((wiVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        wiVar.f30000d1.setTranslationY(wiVar.f29990a1.getTranslationY());
        ci.e4 e4Var3 = wiVar.f30000d1;
        e4Var3.f4615l0 = new kd(5, wiVar, e4Var2);
        wiVar.containerView.addView(e4Var3, w7.y5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        wiVar.f30000d1.u();
    }

    public static void t(wi wiVar, boolean z10, hh hhVar) {
        Integer num;
        wiVar.f30067y0.s(1.0f);
        wiVar.f30070z0.s(1.0f);
        wiVar.f30067y0.k(wiVar.f30025l2);
        wiVar.f30070z0.k(wiVar.f30025l2);
        wiVar.containerView.invalidate();
        y7 y7Var = wiVar.X0;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        y7Var.setTag(num);
        hhVar.run();
    }

    public static void u(wi wiVar, ci.e4 e4Var) {
        wiVar.containerView.removeView(e4Var);
    }

    public static void v(wi wiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        org.telegram.ui.ActionBar.m2 m2Var;
        int i10;
        wi wiVar2 = wiVar;
        zh zhVar = wiVar2.f30068y1;
        oi[] oiVarArr = wiVar2.f30059w0;
        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar2.f30006f0;
        if (m2Var2 == null) {
            m2Var = LaunchActivity.R();
        } else {
            m2Var = m2Var2;
        }
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (view instanceof qi) {
                Activity parentActivity = m2Var.getParentActivity();
                if (view.getTag() instanceof Integer) {
                    i10 = ((Integer) view.getTag()).intValue();
                } else {
                    i10 = -1;
                }
                boolean z10 = true;
                if (i10 == 1) {
                    if (wiVar2.L1 || wiVar2.M1 || !wiVar2.a1()) {
                        if (!wiVar2.L1 && !wiVar2.M1) {
                            wn wnVar = new wn(1, wiVar2.getContext(), d6Var, wiVar2);
                            wiVar2.T = wnVar;
                            wiVar2.Q1(wnVar);
                        }
                        wiVar2.Q1(wiVar2.f30018j0);
                    } else {
                        return;
                    }
                } else if (i10 == 3) {
                    if (wiVar2.N1 || !wiVar2.a1()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                return;
                            }
                        } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(wiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        wiVar2.B1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 4) {
                    if (wiVar2.K1 || !wiVar2.a1()) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 33) {
                            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                return;
                            }
                        } else if (i12 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            AndroidUtilities.findActivity(wiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                        wiVar2.E1(true);
                    } else {
                        return;
                    }
                } else if (i10 == 5) {
                    if (wiVar2.Q1 || !wiVar2.a1()) {
                        if (Build.VERSION.SDK_INT >= 23 && wiVar2.Q1 && wiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                            AndroidUtilities.findActivity(wiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                            return;
                        }
                        wiVar2.D1();
                    } else {
                        return;
                    }
                } else if (i10 == 6) {
                    if ((wiVar2.Q1 || !wiVar2.a1()) && AndroidUtilities.isMapsInstalled(m2Var2)) {
                        if (!wiVar2.Q1) {
                            wn wnVar2 = new wn(6, wiVar2.getContext(), d6Var, wiVar2);
                            wiVar2.T = wnVar2;
                            wiVar2.Q1(wnVar2);
                        } else {
                            if (wiVar2.f30032o0 == null) {
                                hl hlVar = new hl(wiVar2, wiVar2.getContext(), d6Var, (wiVar2.H || wiVar2.R1) ? false : false);
                                wiVar2.f30032o0 = hlVar;
                                oiVarArr[5] = hlVar;
                                cl clVar = wiVar2.f30051t2;
                                if (clVar != null) {
                                    hlVar.setDelegate(clVar);
                                } else {
                                    hlVar.setDelegate(new eh(wiVar2, 9));
                                }
                            }
                            wiVar2.Q1(wiVar2.f30032o0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 9) {
                    if (wiVar2.O1 || !wiVar2.a1()) {
                        if (!wiVar2.O1) {
                            wn wnVar3 = new wn(9, wiVar2.getContext(), d6Var, wiVar2);
                            wiVar2.T = wnVar3;
                            wiVar2.Q1(wnVar3);
                        } else {
                            wiVar2.S1(true, null);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 11) {
                    if (wiVar2.f30046s0 == null) {
                        hg.k0 k0Var = new hg.k0(wiVar2.getContext(), wiVar2.resourcesProvider, wiVar2);
                        wiVar2.f30046s0 = k0Var;
                        oiVarArr[7] = k0Var;
                        k0Var.setupBlurredSearchField(wiVar2.G2);
                    }
                    wiVar2.Q1(wiVar2.f30046s0);
                } else if (i10 == 12) {
                    if (wiVar2.P1 || !wiVar2.a1()) {
                        if (!wiVar2.P1) {
                            wn wnVar4 = new wn(9, wiVar2.getContext(), d6Var, wiVar2);
                            wiVar2.T = wnVar4;
                            wiVar2.Q1(wnVar4);
                        } else {
                            if (wiVar2.f30029n0 == null) {
                                vn vnVar = new vn(wiVar, wiVar.getContext(), true, d6Var, null);
                                wiVar2 = wiVar;
                                wiVar2.f30029n0 = vnVar;
                                oiVarArr[1] = vnVar;
                                vnVar.setDelegate(new eh(wiVar2, 10));
                            }
                            wiVar2.Q1(wiVar2.f30029n0);
                        }
                    } else {
                        return;
                    }
                } else if (i10 == 13) {
                    if (wiVar2.f30052u0 == null) {
                        qk qkVar = new qk(wiVar2, wiVar2.getContext(), d6Var, true);
                        wiVar2.f30052u0 = qkVar;
                        oiVarArr[8] = qkVar;
                        qkVar.setDelegate(wiVar2.a2);
                    }
                    wiVar2.Q1(wiVar2.f30052u0);
                } else if (i10 == 14) {
                    if (wiVar2.f30049t0 == null) {
                        qk qkVar2 = new qk(wiVar2, wiVar2.getContext(), d6Var, false);
                        wiVar2.f30049t0 = qkVar2;
                        oiVarArr[9] = qkVar2;
                        qkVar2.setDelegate(wiVar2.a2);
                    }
                    wiVar2.Q1(wiVar2.f30049t0);
                } else if (i10 == 16) {
                    if (wiVar2.f30055v0 == null) {
                        ii.r rVar = new ii.r(wiVar2.J1, wiVar2.getContext(), d6Var, wiVar2);
                        wiVar2.f30055v0 = rVar;
                        oiVarArr[10] = rVar;
                    }
                    wiVar2.Q1(wiVar2.f30055v0);
                } else if (view.getTag() instanceof Integer) {
                    wiVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, wiVar2.s1(), false, 0L);
                }
            } else if (view instanceof pi) {
                pi piVar = (pi) view;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = piVar.f27350c;
                if (tL_attachMenuBot != null) {
                    if (tL_attachMenuBot.inactive) {
                        ej1.a(wiVar2.getContext(), new org.telegram.ui.oc(16, wiVar2, piVar), null);
                    } else {
                        wiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                    }
                } else {
                    wiVar2.Z1.j1(piVar.f27349b);
                    wiVar2.dismiss();
                }
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(70.0f);
            int i13 = left - dp;
            if (i13 < 0) {
                zhVar.v0(i13, 0, null);
                return;
            }
            int i14 = right + dp;
            if (i14 > zhVar.getMeasuredWidth()) {
                zhVar.v0(i14 - zhVar.getMeasuredWidth(), 0, null);
            }
        }
    }

    public static void w(wi wiVar) {
        oi oiVar;
        rm rmVar;
        wiVar.f30050t1 = null;
        oi oiVar2 = wiVar.f30067y0;
        if (oiVar2 != wiVar.f30018j0 && (oiVar = wiVar.f30070z0) != (rmVar = wiVar.f30038q0) && oiVar2 != oiVar && oiVar2 != rmVar) {
            wiVar.containerView.removeView(oiVar2);
        }
        wiVar.f30067y0.setVisibility(8);
        wiVar.f30067y0.q();
        wiVar.f30070z0.F();
        wiVar.f30067y0 = wiVar.f30070z0;
        wiVar.f30070z0 = null;
        int[] iArr = wiVar.f29994b2;
        iArr[0] = iArr[1];
        wiVar.H1(wiVar.f29996c0, false);
        wiVar.W1();
    }

    public final void A1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
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
            if (this.f30032o0 == null) {
                hl hlVar = new hl(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : false);
                this.f30032o0 = hlVar;
                this.f30059w0[5] = hlVar;
                cl clVar = this.f30051t2;
                if (clVar != null) {
                    hlVar.setDelegate(clVar);
                } else if (m2Var instanceof org.telegram.ui.wn) {
                    hlVar.setDelegate(new eh(this, 16));
                }
            }
            Q1(this.f30032o0);
        }
    }

    public final void B1(boolean z10) {
        if (!this.N1 && z10) {
            wn wnVar = new wn(3, getContext(), this.resourcesProvider, this);
            this.T = wnVar;
            Q1(wnVar);
        }
        int i10 = 1;
        if (this.f30024l0 == null) {
            hj hjVar = new hj(getContext(), this.resourcesProvider, this);
            this.f30024l0 = hjVar;
            this.f30059w0[3] = hjVar;
            hjVar.setupBlurredSearchField(this.G2);
            this.f30024l0.setDelegate(new eh(this, 13));
            if (this.H) {
                this.f30024l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            TLRPC.Chat chat = ((org.telegram.ui.wn) m2Var).e;
            hj hjVar2 = this.f30024l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            hjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.f30024l0);
        }
    }

    public final void C1() {
        if (this.f30042r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ?? oiVar = new oi(context, d6Var, this);
            oiVar.f25797r = AndroidUtilities.dp(80.0f);
            oiVar.f25799w = 3;
            ai.w0 w0Var = new ai.w0(oiVar, context, d6Var, 11);
            oiVar.f25796n = w0Var;
            za zaVar = new za(oiVar, context);
            oiVar.v = zaVar;
            w0Var.setAdapter(zaVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, oiVar.f27087a));
            oiVar.addView(w0Var, w7.y5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(oiVar, 17));
            bi.l lVar = new bi.l(oiVar, oiVar.f25797r, 1);
            oiVar.f25798s = lVar;
            lVar.O = new ci.x1(oiVar, 2);
            w0Var.setLayoutManager(lVar);
            this.f30042r0 = oiVar;
            oiVar.setDelegate(new gb(this, 1));
        }
        Q1(this.f30042r0);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        oi oiVar;
        int i11;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            e1();
            vn vnVar = this.m0;
            if (vnVar != null && ((oiVar = this.f30070z0) == vnVar || this.f30067y0 == vnVar)) {
                if (oiVar == vnVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                a2(i11);
            }
            vn vnVar2 = this.f30029n0;
            if (vnVar2 != null) {
                oi oiVar2 = this.f30070z0;
                if (oiVar2 == vnVar2 || this.f30067y0 == vnVar2) {
                    if (oiVar2 != vnVar2) {
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
            gi giVar = this.I0;
            if (giVar != null) {
                giVar.setEphemeralFactor(f7);
                giVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void D1() {
        boolean z10;
        if (!this.Q1) {
            wn wnVar = new wn(5, getContext(), this.resourcesProvider, this);
            this.T = wnVar;
            Q1(wnVar);
        }
        if (this.f30021k0 == null) {
            zj zjVar = new zj(getContext(), this.resourcesProvider, this);
            this.f30021k0 = zjVar;
            this.f30059w0[2] = zjVar;
            zjVar.setupBlurredSearchField(this.G2);
            this.f30021k0.setDelegate(new ii(this));
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            TLRPC.Chat chat = ((org.telegram.ui.wn) m2Var).e;
            zj zjVar2 = this.f30021k0;
            if (chat != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            zjVar2.setMultipleSelectionAllowed(z10);
        }
        Q1(this.f30021k0);
    }

    public final void E1(boolean z10) {
        int i10;
        if (!this.K1 && z10) {
            wn wnVar = new wn(4, getContext(), this.resourcesProvider, this);
            this.T = wnVar;
            Q1(wnVar);
        }
        boolean z11 = false;
        if (this.f30035p0 == null) {
            if (this.N) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            pk pkVar = new pk(i10, getContext(), this.resourcesProvider, this);
            this.f30035p0 = pkVar;
            this.f30059w0[4] = pkVar;
            pkVar.setDelegate(new ji(this));
        }
        int i11 = 1;
        if (this.H) {
            this.f30035p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
            if (m2Var instanceof org.telegram.ui.wn) {
                TLRPC.Chat chat = ((org.telegram.ui.wn) m2Var).e;
                pk pkVar2 = this.f30035p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i11 = -1;
                }
                pkVar2.setMaxSelectedFiles(i11);
            } else {
                this.f30035p0.setMaxSelectedFiles(this.S1);
                pk pkVar3 = this.f30035p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                pkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        pk pkVar4 = this.f30035p0;
        pkVar4.f27370d0 = this.N;
        if (z10) {
            Q1(pkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y7 y7Var = this.X0;
        int i10 = 1;
        if (y7Var.f19556n0) {
            y7Var.h(true);
        }
        this.f30021k0 = null;
        this.f30046s0 = null;
        this.f30024l0 = null;
        this.m0 = null;
        this.f30029n0 = null;
        this.f30032o0 = null;
        this.f30035p0 = null;
        while (true) {
            oi[] oiVarArr = this.f30059w0;
            if (i10 < oiVarArr.length) {
                oi oiVar = oiVarArr[i10];
                if (oiVar != null) {
                    oiVar.m();
                    this.containerView.removeView(oiVarArr[i10]);
                    oiVarArr[i10] = null;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
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
        if (this.h.f14201f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        oi oiVar = this.f30067y0;
        if (oiVar != null) {
            i12 = oiVar.getSelectedItemsCount();
        }
        return e5.b0(this.J1, n12, j1() + i12, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                wi wiVar = wi.this;
                wiVar.I1 = true;
                wiVar.Z1.B1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
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
        this.f29991b.a(z10, z11);
        ku m12 = m1();
        this.f29996c0 = z10;
        ku m13 = m1();
        int i11 = 0;
        if (this.D0.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        oi oiVar = this.f30067y0;
        if (oiVar != this.f30018j0 && oiVar != this.f30038q0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f29996c0 && z13) {
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
            rr rrVar = rr.h;
            duration.setInterpolator(rrVar).setUpdateListener(new fh(this, 0)).withEndAction(new Runnable(this) {
                public final wi f24457b;

                {
                    this.f24457b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            wi wiVar = this.f24457b;
                            if (!z14 || !z12) {
                                wiVar.O0.setVisibility(8);
                            }
                            wiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24457b.C0.setVisibility(8);
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
            animate2.translationY(measuredHeight).alpha((z14 || !z12) ? 0.0f : 0.0f).setDuration(320L).setInterpolator(rrVar).setUpdateListener(new fh(this, 1)).withEndAction(new Runnable(this) {
                public final wi f24457b;

                {
                    this.f24457b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            wi wiVar = this.f24457b;
                            if (!z14 || !z12) {
                                wiVar.O0.setVisibility(8);
                            }
                            wiVar.b2();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f24457b.C0.setVisibility(8);
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
        AndroidUtilities.runOnUIThread(new hh(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f30018j0) != null) {
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f19004a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
        this.f30064x1.setVisibility(8);
        this.f30019j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
        if (chatAttachAlertPhotoLayout != null) {
            wi wiVar = chatAttachAlertPhotoLayout.f27088b;
            chatAttachAlertPhotoLayout.f22139g1 = (wiVar.Q0 == 0 || wiVar.F) ? false : false;
        }
    }

    public final void M1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.M1(boolean):void");
    }

    public final void N1(long r27, java.lang.String r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.N1(long, java.lang.String, boolean, boolean):void");
    }

    public final void O1(org.telegram.ui.ActionBar.m2 m2Var) {
        if ((m2Var instanceof org.telegram.ui.wn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.wn) m2Var).e)) {
            new xc(this.f30043r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new kd(6, this, m2Var)).j();
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
        oi oiVar;
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
        this.f29995c.a(z10, true);
        yh yhVar = this.D0;
        if (yhVar.getTag() != null) {
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
        yhVar.setTag(num);
        bi biVar = this.E0;
        if (biVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(biVar.getEditText());
        }
        biVar.k(true);
        this.P0.k(true);
        yh yhVar2 = this.f30064x1;
        yh yhVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                yhVar.setVisibility(0);
            }
            yhVar3.setVisibility(0);
        } else if (this.S0) {
            yhVar2.setVisibility(0);
        }
        oi oiVar2 = this.f30067y0;
        if ((oiVar2 == this.f30018j0 || oiVar2 == this.f30038q0) && this.f29996c0) {
            z13 = true;
        } else {
            z13 = false;
        }
        y7 y7Var2 = this.X0;
        ci.m6 m6Var = this.O0;
        hg.k kVar = this.C0;
        gi giVar = this.I0;
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
            arrayList.add(ObjectAnimator.ofFloat(yhVar, property, f18));
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
            arrayList.add(ObjectAnimator.ofFloat(yhVar3, property2, f21));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(yhVar3, property3, f22));
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(yhVar3, property, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(giVar, property2, f24));
            if (z10) {
                f26 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(giVar, property3, f26));
            if (y7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (!z10) {
                    f28 = AndroidUtilities.dp(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(yhVar, property4, f28));
            } else if (this.S0) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f25 = AndroidUtilities.dp(36.0f);
                } else {
                    f25 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(yhVar2, property5, f25));
                if (z10) {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(yhVar2, property, f27));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fh(this, 4));
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
            yhVar.setAlpha(f7);
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
            yhVar3.setScaleX(f11);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            yhVar3.setScaleY(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            yhVar3.setAlpha(f13);
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
            giVar.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            giVar.setScaleY(f16);
            if (y7Var2.getTag() != null) {
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                yhVar.setTranslationY(dp);
            } else if (this.S0 && ((oiVar = this.f30067y0) == null || oiVar.J())) {
                if (z10) {
                    f17 = AndroidUtilities.dp(84.0f);
                } else {
                    f17 = 0.0f;
                }
                yhVar2.setTranslationY(f17);
            }
            if (!z10) {
                yhVar.setVisibility(4);
                yhVar3.setVisibility(4);
            }
            if (z13) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f30067y0.getSelectedItemsCount());
        }
        giVar.g(i10, z11);
        if (this.H1 != null) {
            sendPaidMessagesStars = 0;
        } else {
            sendPaidMessagesStars = MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1());
        }
        giVar.i(j1() + this.f30067y0.getSelectedItemsCount(), sendPaidMessagesStars, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) biVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), giVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            biVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(oi oiVar) {
        long j3 = this.W0;
        wn wnVar = this.T;
        if (oiVar == wnVar) {
            j3 = wnVar.f30142s;
        } else if (oiVar == this.f30018j0) {
            j3 = 1;
        } else if (oiVar == this.f30024l0) {
            j3 = 3;
        } else if (oiVar == this.f30035p0) {
            j3 = 4;
        } else if (oiVar == this.f30021k0) {
            j3 = 5;
        } else if (oiVar == this.f30032o0) {
            j3 = 6;
        } else if (oiVar == this.m0) {
            j3 = 9;
        } else if (oiVar == this.f30042r0) {
            j3 = 10;
        } else if (oiVar == this.f30046s0) {
            j3 = 11;
        } else if (oiVar == this.f30029n0) {
            j3 = 12;
        } else if (oiVar == this.f30049t0) {
            j3 = 14;
        } else if (oiVar == this.f30052u0) {
            j3 = 13;
        } else if (oiVar == this.f30055v0) {
            j3 = 16;
        }
        R1(oiVar, j3, true);
    }

    public final void R1(oi oiVar, long j3, boolean z10) {
        boolean z11;
        int i10;
        em emVar;
        boolean z12;
        Integer num;
        em emVar2;
        int i11;
        int i12;
        int dp;
        zh zhVar;
        boolean z13;
        if (this.f30050t1 == null && this.M0 == null) {
            oi oiVar2 = this.f30067y0;
            if (oiVar2 == oiVar) {
                oiVar2.G();
            } else if (oiVar == this.f30029n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.x0(this.f30006f0, 39, false).show();
            } else {
                int i13 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i13 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30005f.a(z11, z10);
                this.f30028n.i(Long.valueOf(j3), z10);
                this.D1 = false;
                this.B1 = false;
                this.F1 = 0.0f;
                this.E1.setVisibility(8);
                RadialProgressView radialProgressView = this.C1;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                yh yhVar = this.f30064x1;
                yhVar.setAlpha(1.0f);
                yhVar.setTranslationY(this.F1);
                int i14 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f30063x0;
                    if (i14 >= longSparseArray.size()) {
                        break;
                    }
                    ((ei.q4) longSparseArray.valueAt(i14)).setMeasureOffsetY(0);
                    i14++;
                }
                this.W0 = j3;
                zh zhVar2 = this.f30068y1;
                int childCount = zhVar2.getChildCount();
                int i15 = 0;
                while (i15 < childCount) {
                    View childAt = zhVar2.getChildAt(i15);
                    if (childAt instanceof qi) {
                        qi qiVar = (qi) childAt;
                        zhVar = zhVar2;
                        if (qiVar.f27632b == qiVar.f27633c.W0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        qiVar.f27976a.e(z13, true);
                    } else {
                        zhVar = zhVar2;
                        if (childAt instanceof pi) {
                            ((pi) childAt).a(true);
                        }
                    }
                    i15++;
                    zhVar2 = zhVar;
                }
                int firstOffset = (this.f30067y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.f29994b2[0];
                this.f30070z0 = oiVar;
                oiVar.getClass();
                boolean z14 = oiVar instanceof ii.r;
                jh.f fVar = this.f30056v1;
                if (fVar != null) {
                    if (z14) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    fVar.setFadeHeightBottom(dp);
                }
                ai aiVar = this.f30060w1;
                if (aiVar != null) {
                    if (z14) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    aiVar.setVisibility(i12);
                }
                if (this.f30070z0.h() != 0) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                y7 y7Var = this.X0;
                y7Var.setVisibility(i10);
                if (y7Var.f19556n0) {
                    y7Var.h(true);
                }
                this.f30067y0.r();
                oi oiVar3 = this.f30070z0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
                if (oiVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f30070z0.E(this.f30067y0);
                this.f30070z0.setVisibility(0);
                if (oiVar.getParent() != null) {
                    this.containerView.removeView(this.f30070z0);
                }
                int indexOfChild = this.containerView.indexOfChild(this.f30067y0);
                ViewParent parent = this.f30070z0.getParent();
                ViewGroup viewGroup = this.containerView;
                if (parent != viewGroup) {
                    oi oiVar4 = this.f30070z0;
                    if (oiVar4 != this.f30032o0) {
                        indexOfChild++;
                    }
                    viewGroup.addView(oiVar4, indexOfChild, w7.y5.c(-1.0f, -1));
                }
                hh hhVar = new hh(this, 3);
                oi oiVar5 = this.f30067y0;
                boolean z15 = oiVar5 instanceof rm;
                ki kiVar = this.f30002e0;
                if (!z15 && !(this.f30070z0 instanceof rm)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f30070z0.setAlpha(0.0f);
                        this.f30070z0.setTranslationY(AndroidUtilities.dp(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f30067y0, View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f30067y0, kiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, View.ALPHA, y7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(rr.f28031f);
                        animatorSet.addListener(new hi(this, firstOffset, hhVar, 0));
                        this.f30050t1 = animatorSet;
                        oi oiVar6 = this.f30067y0;
                        kiVar.getClass();
                        kiVar.b(oiVar6, 0.0f);
                        animatorSet.start();
                    } else {
                        oiVar5.setAlpha(0.0f);
                        hhVar.run();
                        a2(0);
                        this.containerView.invalidate();
                    }
                } else {
                    int max = Math.max(this.f30070z0.getWidth(), this.f30067y0.getWidth());
                    oi oiVar7 = this.f30070z0;
                    if (oiVar7 instanceof rm) {
                        oiVar7.setTranslationX(max);
                        oi oiVar8 = this.f30067y0;
                        if ((oiVar8 instanceof ChatAttachAlertPhotoLayout) && (emVar2 = ((ChatAttachAlertPhotoLayout) oiVar8).P) != null) {
                            emVar2.setVisibility(4);
                        }
                    } else {
                        this.f30067y0.setTranslationX(-max);
                        oi oiVar9 = this.f30070z0;
                        if (oiVar9 == chatAttachAlertPhotoLayout && (emVar = ((ChatAttachAlertPhotoLayout) oiVar9).P) != null) {
                            emVar.setVisibility(0);
                        }
                    }
                    this.f30070z0.setAlpha(1.0f);
                    this.f30067y0.setAlpha(1.0f);
                    if (z10) {
                        oi oiVar10 = this.f30067y0;
                        kiVar.getClass();
                        kiVar.b(oiVar10, 0.0f);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, oiVar, hhVar, 15));
                    } else {
                        if (this.f30070z0.getCurrentItemTop() <= oiVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f30067y0.s(1.0f);
                        this.f30070z0.s(1.0f);
                        this.f30067y0.k(this.f30025l2);
                        this.f30070z0.k(this.f30025l2);
                        this.containerView.invalidate();
                        oi oiVar11 = this.f30067y0;
                        kiVar.getClass();
                        kiVar.b(oiVar11, 1.0f);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        y7Var.setTag(num);
                        hhVar.run();
                    }
                }
                if (this.f30027m2 && !(oiVar instanceof ei.q4)) {
                    i11 = 0;
                    this.f30027m2 = false;
                    y7Var.e();
                    y7Var.invalidate();
                    u1();
                } else {
                    i11 = 0;
                }
                if (i13 != 0 && j3 != 6 && !(oiVar instanceof ei.q4)) {
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
        wi wiVar;
        if (this.m0 == null) {
            wiVar = this;
            vn vnVar = new vn(wiVar, getContext(), false, this.resourcesProvider, bool);
            wiVar.m0 = vnVar;
            wiVar.f30059w0[1] = vnVar;
            vnVar.setDelegate(new eh(this, 15));
        } else {
            wiVar = this;
        }
        R1(wiVar.m0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        oi oiVar;
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
            if (!this.F && !this.T0 && ((this.Q0 != 0 || !this.f30039q1) && this.f30067y0 == this.f30018j0 && (this.L1 || this.M1))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f30067y0 == this.T) {
                z12 = false;
            }
            yh yhVar = this.f30064x1;
            org.telegram.ui.ActionBar.u0 u0Var = this.f29990a1;
            if (z10) {
                if (z12) {
                    u0Var.setVisibility(0);
                    u0Var.setClickable(true);
                }
            } else if (this.S0 && this.D0.getTag() == null) {
                yhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
            if (m2Var != null) {
                if (z10) {
                    if (this.f30014h2) {
                        i10 = org.telegram.ui.ActionBar.h6.f19364tg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19130h5;
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
                this.Y0.addListener(new ca(2, this, z10));
                this.Y0.setInterpolator(rr.h);
                this.Y0.setDuration(380L);
                this.Y0.start();
                return;
            }
            if (z10 && this.S0 && ((oiVar = this.f30067y0) == null || oiVar.J())) {
                yhVar.setVisibility(4);
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
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f30003e1;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(4);
                }
                if (this.Q0 != 0 || !this.f30039q1) {
                    u0Var.setVisibility(4);
                }
            }
        }
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.G0;
        bi biVar = this.E0;
        biVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            oi oiVar = this.f30067y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
            if ((oiVar == chatAttachAlertPhotoLayout || oiVar == this.f30038q0) && this.f29996c0) {
                ci.m6 m6Var = this.O0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.B2.getTop());
            } else {
                alpha = -biVar.getHeight();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.V1(int):void");
    }

    public final void W1() {
        boolean g10;
        float f7;
        float f10;
        float f11;
        oi oiVar = this.f30067y0;
        int i10 = 0;
        if (oiVar == null) {
            g10 = false;
        } else {
            g10 = oiVar.g();
        }
        bi.o oVar = this.f30007f1;
        oVar.setEnabled(g10);
        oi oiVar2 = this.f30067y0;
        float f12 = 0.5f;
        if (oiVar2 != null) {
            if (oiVar2.g()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f30070z0 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.f29999d0;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        oi oiVar3 = this.f30070z0;
        if (oiVar3 != null) {
            if (oiVar3.g()) {
                f12 = 1.0f;
            }
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29999d0, f12, f7);
        }
        this.f30010g1 = f7;
        if (oVar != null) {
            float f13 = f7 * this.f30013h1;
            oVar.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            oVar.setVisibility(i10);
        }
    }

    public final void X1(oi oiVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (oiVar != null) {
            ah.h hVar = this.C2;
            if (hVar != null && Build.VERSION.SDK_INT >= 31) {
                hVar.f(0.0f, i10);
                Z0();
            }
            int currentItemTop = oiVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (oiVar == this.f30067y0 && currentItemTop <= oiVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.R = z10;
                if (oiVar == this.f30067y0) {
                    T1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oiVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.ok.D(11.0f, i11, currentItemTop);
                oi oiVar2 = this.f30067y0;
                if (oiVar2 == oiVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((oiVar2 instanceof rm) || (this.f30070z0 instanceof rm)) {
                    Object obj = this.f30050t1;
                    if ((obj instanceof o1.k) && ((o1.k) obj).f15526f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.f29994b2;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.f29998c2 = i13;
                        return;
                    }
                    return;
                }
                this.f29998c2 = i13;
                iArr[i12] = D;
                a2(i12);
                this.containerView.invalidate();
            }
        }
    }

    public final void Y0() {
        if (m1().f25881a.length() <= 0) {
            return;
        }
        this.f30067y0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        ci.u uVar;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.f29993b1) != null) {
            int i10 = 0;
            if (this.f30039q1 && this.f30015i0 && this.f30067y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.S();
            uVar.f5586f = z12;
            if (!z10) {
                ((e6) uVar.f5587g).a(z12);
            }
            uVar.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.u0 u0Var = this.f29997c1;
            if (z10 && this.f30039q1) {
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
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(rr.h).withEndAction(new qh(this, z11, 0)).start();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.Z0():void");
    }

    public final void Z1(boolean z10) {
        boolean z11;
        float f7;
        oi oiVar = this.f30018j0;
        if (z10) {
            if (!this.M) {
                return;
            }
            if (this.f30038q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.f30041r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                ?? oiVar2 = new oi(context, d6Var, this);
                oiVar2.f28005y = 0.0f;
                oiVar2.E = 0.0f;
                oiVar2.F = 0.0f;
                oiVar2.G = 0.0f;
                oiVar2.H = 0.0f;
                oiVar2.I = 0.0f;
                oiVar2.J = null;
                oiVar2.K = false;
                oiVar2.M = 0.0f;
                oiVar2.Q = false;
                oiVar2.S = false;
                Point point = AndroidUtilities.displaySize;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                oiVar2.T = z11;
                oiVar2.f28000n = d6Var;
                oiVar2.f27090f = true;
                oiVar2.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y n10 = oiVar2.f27088b.X0.n();
                TextView textView = new TextView(context);
                oiVar2.f28004x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = oiVar2.f27087a;
                zl zlVar = new zl(oiVar2, context, n10, d6Var2, 1);
                y7 y7Var = oiVar2.f27088b.X0;
                if (AndroidUtilities.isTablet()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                y7Var.addView(zlVar, 0, w7.y5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                zlVar.addView(textView, w7.y5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(oiVar2, context, d6Var2, 14);
                oiVar2.f28001r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.w7(oiVar2, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                oiVar2.f28002s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                qm qmVar = new qm(oiVar2, context);
                oiVar2.v = qmVar;
                qmVar.setClipToPadding(true);
                qmVar.setClipChildren(true);
                oiVar2.addView(w0Var, w7.y5.c(-1.0f, -1));
                oiVar2.P = oiVar2.f27088b.f30018j0;
                qmVar.f27705c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = oiVar2.P;
                qmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                qmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                qmVar.c();
                UndoView undoView = new UndoView(context, null, false, oiVar2.f27088b.f30041r);
                oiVar2.f28003w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                oiVar2.addView(undoView, w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                oiVar2.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.f30038q0 = oiVar2;
                oiVar2.bringToFront();
            }
            oi oiVar3 = this.f30067y0;
            rm rmVar = this.f30038q0;
            if (oiVar3 != rmVar) {
                oiVar = rmVar;
            }
            Q1(oiVar);
            return;
        }
        Q1(oiVar);
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).K6()) {
            return true;
        }
        return false;
    }

    public final void a2(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.a2(int):void");
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.wn) m2Var).a(), m2Var, charSequence);
        }
        return false;
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.f30043r1.invalidate();
        ci.m6 m6Var = this.O0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
        if (chatAttachAlertPhotoLayout != null) {
            ul ulVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (ulVar != null && ulVar.getFastScroll() != null) {
                dl0 fastScroll = ulVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f22156p1;
                if (this.f29996c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.f23662h0 = currentActionBarHeight + i10;
                ulVar.getFastScroll().invalidate();
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
        zh zhVar = this.f30068y1;
        if (zhVar == null) {
            return;
        }
        int childCount = zhVar.getChildCount();
        boolean z10 = false;
        for (int i20 = 0; i20 < childCount; i20++) {
            zhVar.getChildAt(i20);
        }
        boolean z11 = this.f30014h2;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.h6.f19139hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19166j5;
        }
        this.f30019j1.setTextColor(getThemedColor(i10));
        if (z11) {
            i11 = org.telegram.ui.ActionBar.h6.f19139hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f19166j5;
        }
        this.f30033o1.setTextColor(getThemedColor(i11));
        this.f30007f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        if (z11) {
            i12 = org.telegram.ui.ActionBar.h6.f19139hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f19166j5;
        }
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.u0 u0Var = this.f29990a1;
        u0Var.setIconColor(themedColor);
        Drawable background = u0Var.getBackground();
        if (z11) {
            i13 = org.telegram.ui.ActionBar.h6.f19158ig;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.I5;
        }
        org.telegram.ui.ActionBar.h6.w1(getThemedColor(i13), background);
        int i21 = org.telegram.ui.ActionBar.h6.E8;
        u0Var.G(getThemedColor(i21), false);
        u0Var.G(getThemedColor(i21), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29997c1;
        if (u0Var2 != null) {
            if (z11) {
                i19 = org.telegram.ui.ActionBar.h6.f19139hg;
            } else {
                i19 = org.telegram.ui.ActionBar.h6.f19166j5;
            }
            u0Var2.setIconColor(getThemedColor(i19));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30003e1;
        if (u0Var3 != null) {
            if (z11) {
                i17 = org.telegram.ui.ActionBar.h6.f19139hg;
            } else {
                i17 = org.telegram.ui.ActionBar.h6.f19166j5;
            }
            u0Var3.setIconColor(getThemedColor(i17));
            Drawable background2 = u0Var3.getBackground();
            if (z11) {
                i18 = org.telegram.ui.ActionBar.h6.f19158ig;
            } else {
                i18 = org.telegram.ui.ActionBar.h6.I5;
            }
            org.telegram.ui.ActionBar.h6.w1(getThemedColor(i18), background2);
        }
        bi biVar = this.E0;
        org.telegram.ui.ActionBar.d6 d6Var = biVar.M;
        fu fuVar = biVar.f25881a;
        int i22 = biVar.L;
        if (i22 == 0) {
            fuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            int i23 = org.telegram.ui.ActionBar.h6.G6;
            fuVar.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i23, d6Var));
            fuVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i23, d6Var));
        } else if (i22 != 2 && i22 != 3) {
            fuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19354t5, d6Var));
            fuVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, d6Var));
        } else {
            fuVar.setHintTextColor(-1929379841);
            fuVar.setTextColor(-1);
            fuVar.setCursorColor(-1);
            fuVar.setHandlesColor(-1);
            fuVar.setHighlightColor(822083583);
            fuVar.quoteColor = -1;
        }
        biVar.f25883c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        gu guVar = biVar.d;
        if (guVar != null) {
            guVar.S();
        }
        zhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        if (z11) {
            i14 = org.telegram.ui.ActionBar.h6.f19139hg;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.f19166j5;
        }
        int themedColor2 = getThemedColor(i14);
        y7 y7Var = this.X0;
        y7Var.B(themedColor2, false);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.h6.f19158ig;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.I5;
        }
        y7Var.A(getThemedColor(i15), false);
        if (z11) {
            i16 = org.telegram.ui.ActionBar.h6.f19139hg;
        } else {
            i16 = org.telegram.ui.ActionBar.h6.f19166j5;
        }
        y7Var.setTitleColor(getThemedColor(i16));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.h6.w1(q12, this.shadowDrawable);
        fh.c cVar = this.F2;
        if (cVar.f9055a.getColor() != q12) {
            cVar.a(q12);
            jh.f fVar = this.f30056v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ai aiVar = this.f30060w1;
            if (aiVar != null) {
                aiVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i24 = 0;
        while (true) {
            oi[] oiVarArr = this.f30059w0;
            if (i24 >= oiVarArr.length) {
                break;
            }
            oi oiVar = oiVarArr[i24];
            if (oiVar != null) {
                oiVar.d();
            }
            i24++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19148i5);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
            return;
        }
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.f30067y0.b();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.f30037p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.f30040q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.d1(boolean):void");
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
        ti tiVar = this.A1;
        if (tiVar != null) {
            tiVar.l();
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
        ui uiVar = this.Z1;
        if (uiVar != null) {
            uiVar.x0(new hh(this, 2));
        } else {
            F1();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.f30067y0.o(i10);
    }

    public final void e1() {
        float f7 = this.f29995c.e;
        float f10 = (1.0f - this.f29991b.e) * f7;
        this.f30060w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - f10));
    }

    public final void f1() {
        float f7;
        float f10 = this.e.e;
        float f11 = this.f30005f.e;
        float b10 = yf.e0.b(this.h.e);
        if (this.R1) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        z10.d(this.F0, com.google.android.gms.internal.vision.e2.C(f10, f11, b10, f7));
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final void g1() {
        gi giVar = this.I0;
        yh yhVar = this.H0;
        ci.m6 m6Var = this.O0;
        if (m6Var != null && m6Var.getVisibility() == 0 && m6Var.getAlpha() != 0.0f) {
            float f7 = this.f29991b.e;
            float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
            giVar.setAlpha(abs * abs * abs * abs);
            yhVar.setTranslationY(AndroidUtilities.lerp(this.f30011g2, ((m6Var.getTranslationY() + m6Var.getTop()) - yhVar.getTop()) + AndroidUtilities.dp(8.0f), rr.f28034j.getInterpolation(f7)));
            return;
        }
        yhVar.setTranslationY(this.f30011g2);
        giVar.setAlpha(1.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30059w0;
            if (i10 < oiVarArr.length) {
                oi oiVar = oiVarArr[i10];
                if (oiVar != null && (themeDescriptions = oiVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i5));
                return arrayList;
            }
        }
    }

    public final void h1(int i10) {
        this.S0 = true;
        this.f30064x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30022k1;
        if (u0Var != null) {
            this.f30019j1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void i1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f30019j1;
        textView.setText(string);
        this.S0 = false;
        this.f30064x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.f30015i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30022k1;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if ((m2Var instanceof org.telegram.ui.wn) && (messagePreviewParams = ((org.telegram.ui.wn) m2Var).f39478f5) != null) {
            return messagePreviewParams.getForwardedMessagesCount();
        }
        return 0;
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) m2Var).e;
        }
        return MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        yh yhVar = this.D0;
        float alpha = 1.0f - yhVar.getAlpha();
        return yhVar.getMeasuredHeight() - (alpha * (yhVar.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ku m1() {
        oi oiVar;
        if (this.f29996c0 && ((oiVar = this.f30067y0) == this.f30018j0 || oiVar == this.f30038q0)) {
            return this.P0;
        }
        return this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) m2Var).a();
        }
        return this.Z;
    }

    public final int o1() {
        oi oiVar = this.f30067y0;
        vn vnVar = this.m0;
        if (oiVar == vnVar && vnVar.E != null) {
            return vnVar.getEmojiPadding();
        }
        vn vnVar2 = this.f30029n0;
        if (oiVar == vnVar2 && vnVar2.E != null) {
            return vnVar2.getEmojiPadding();
        }
        if (this.f29996c0) {
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
        if (y7Var.f19556n0) {
            y7Var.h(true);
        } else if (this.f30067y0.i()) {
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
        return this.f30067y0.l(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
        q91 q91Var = chatAttachAlertPhotoLayout.f22148l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.f22144j0;
        TextView textView = chatAttachAlertPhotoLayout.f22155p0;
        ul ulVar = chatAttachAlertPhotoLayout.f22158r;
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
                if (ulVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.f0.B(222.0f, i13, i16), i14, org.telegram.messenger.f0.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.f0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (ulVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.f0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            } else {
                f0Var.layout(org.telegram.messenger.f0.B(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == q91Var) {
            if (z10) {
                if (ulVar.getVisibility() == 0) {
                    q91Var.layout(0, org.telegram.messenger.f0.B(310.0f, i13, i16), i14, org.telegram.messenger.f0.B(260.0f, i13, i16));
                    return true;
                }
                q91Var.layout(0, org.telegram.messenger.f0.B(176.0f, i13, i16), i14, org.telegram.messenger.f0.B(126.0f, i13, i16));
                return true;
            } else if (ulVar.getVisibility() == 0) {
                q91Var.layout(org.telegram.messenger.f0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            } else {
                q91Var.layout(org.telegram.messenger.f0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                dp = (i14 - textView.getMeasuredWidth()) / 2;
                int dp2 = i13 - AndroidUtilities.dp(167.0f);
                textView.setRotation(0.0f);
                if (ulVar.getVisibility() == 0) {
                    dp2 -= AndroidUtilities.dp(96.0f);
                }
                measuredWidth = dp2 - i16;
            } else {
                dp = i12 - AndroidUtilities.dp(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (ulVar.getVisibility() == 0) {
                    dp -= AndroidUtilities.dp(96.0f);
                }
            }
            textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != ulVar) {
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
        im imVar = chatAttachAlertPhotoLayout.v;
        ul ulVar = chatAttachAlertPhotoLayout.f22158r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.f22160s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        em emVar = chatAttachAlertPhotoLayout.P;
        if (view == emVar) {
            if (chatAttachAlertPhotoLayout.f22128b0 && !chatAttachAlertPhotoLayout.f22132d0) {
                emVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.f22144j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            q91 q91Var = chatAttachAlertPhotoLayout.f22148l0;
            if (view == q91Var) {
                if (z10) {
                    q91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                q91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == ulVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    ulVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (b0Var.f42949o != 0) {
                        ulVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        imVar.l();
                    }
                } else {
                    ulVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (b0Var.f42949o != 1) {
                        ulVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        b0Var.j1(1);
                        imVar.l();
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
        this.f30018j0.setTranslationX(0.0f);
        this.f30030n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30040q2 = animatorSet;
        ki kiVar = this.f30034o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, kiVar, 0.0f, 400.0f));
        this.f30040q2.setDuration(400L);
        this.f30040q2.setStartDelay(20L);
        kiVar.set(this, Float.valueOf(0.0f));
        this.f30040q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new fh(this, 2));
        o1.k kVar = this.f30037p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.f15516n, 0.0f);
        this.f30037p2 = kVar2;
        if (this.H1 != null) {
            kVar2.f15533u.a(0.75f);
            this.f30037p2.f15533u.b(350.0f);
        } else {
            kVar2.f15533u.a(0.75f);
            this.f30037p2.f15533u.b(350.0f);
        }
        this.f30037p2.f();
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
        this.f30037p2.a(new ei.m4(2, this, oVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, oVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new fh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(rr.f28031f);
        ofFloat2.start();
        return true;
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.f30067y0.p()) {
            dismiss();
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f30067y0.B(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.f30006f0 instanceof org.telegram.ui.wn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.f30067y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.f30047s1 = true;
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
        oi oiVar = this.f30070z0;
        int[] iArr = this.f29994b2;
        if (oiVar != null && ((this.f30067y0 instanceof rm) || (oiVar instanceof rm))) {
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.f29999d0);
        }
        return iArr[i10];
    }

    public final int q1(boolean z10) {
        boolean q6;
        int i10;
        y7 y7Var;
        if (this.f30014h2) {
            return getThemedColor(org.telegram.ui.ActionBar.h6.f19364tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        Iterator it = this.f30028n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            long longValue = ((Long) hVar.f14210a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += hVar.c();
            }
        }
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        if (z10 && (y7Var = this.X0) != null && y7Var.getVisibility() == 0) {
            a2 *= 1.0f - y7Var.getAlpha();
        }
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.h6.f19004a7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19148i5;
        }
        return i0.a.d(a2, themedColor, getThemedColor(i10));
    }

    public final void r1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wi.r1():void");
    }

    public final boolean s1() {
        if (this.f29996c0) {
            oi oiVar = this.f30067y0;
            if (oiVar == this.f30018j0 || oiVar == this.f30038q0) {
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
        oi oiVar = this.f30067y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30018j0;
        if (oiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f22143i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            this.calcMandatoryInsets = ((org.telegram.ui.wn) m2Var).x9();
        }
        W1();
        this.f30047s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f19004a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        if (this.f30027m2) {
            this.f30027m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        ui uiVar = this.Z1;
        if (uiVar != null && !this.f30053u1) {
            boolean c02 = uiVar.c0();
            this.f30053u1 = true;
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
            if (cVar.f9055a.getColor() != q12) {
                cVar.a(q12);
                jh.f fVar = this.f30056v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                ai aiVar = this.f30060w1;
                if (aiVar != null) {
                    aiVar.invalidate();
                }
            }
            W1();
            this.containerView.invalidate();
        }
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30059w0;
            if (i10 >= oiVarArr.length) {
                break;
            }
            oi oiVar = oiVarArr[i10];
            if (oiVar != null) {
                oiVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        bi biVar = this.E0;
        if (biVar != null) {
            biVar.o();
        }
        ei eiVar = this.P0;
        if (eiVar != null) {
            eiVar.o();
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
            if (tL_attachMenuBot2.bot_id == user.f18483id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
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
            oi[] oiVarArr = this.f30059w0;
            if (i10 < oiVarArr.length) {
                oi oiVar = oiVarArr[i10];
                if (oiVar != null) {
                    oiVar.x();
                }
                i10++;
            } else {
                this.f30008f2 = true;
                return;
            }
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f30008f2 = false;
        while (true) {
            oi[] oiVarArr = this.f30059w0;
            if (i10 >= oiVarArr.length) {
                break;
            }
            oi oiVar = oiVarArr[i10];
            if (oiVar != null) {
                oiVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.c0();
        }
        ti tiVar = this.A1;
        if (tiVar != null) {
            tiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (m2Var instanceof org.telegram.ui.wn)) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
            MessageSuggestionParams messageSuggestionParams = wnVar.f39490g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.s5.U(i10, messageSuggestionParams.amount)) {
                wnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.f30045s);
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
                e5.M(getContext(), wnVar2.a(), new eh(this, 12), this.resourcesProvider);
                return;
            }
        }
        oi oiVar = this.f30067y0;
        if (oiVar != this.f30018j0 && oiVar != this.f30038q0) {
            if (!oiVar.I(0, true, 0, s1(), this.N0)) {
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
        if (this.f30067y0.n() || isDismissed()) {
            return;
        }
        bi biVar = this.E0;
        if (biVar != null) {
            AndroidUtilities.hideKeyboard(biVar.getEditText());
        }
        ei eiVar = this.P0;
        if (eiVar != null) {
            AndroidUtilities.hideKeyboard(eiVar.getEditText());
        }
        this.f30063x0.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.f30006f0;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        if (!this.A2 && m2Var != null && this.f30067y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.f30072z2) {
                return;
            }
            this.f30072z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new eh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18662a.setOnCancelListener(new kh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
            a2Var.N = b1Var;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19299q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            oi[] oiVarArr = this.f30059w0;
            if (i10 >= oiVarArr.length) {
                break;
            }
            oi oiVar = oiVarArr[i10];
            if (oiVar != null && this.f30067y0 != oiVar) {
                oiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.f19004a7), 0), true, (AndroidUtilities.IntColorCallback) new eh(this, 11));
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
        this.f30017i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public wi(Activity activity, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11) {
        this(activity, m2Var, z10, z11, true, null);
    }
}
